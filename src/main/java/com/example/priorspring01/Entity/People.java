package com.example.priorspring01.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "people")
@JsonPropertyOrder({"cid","title","firstname","middle_name","lastname","gender","birth_date","mobile","created_by","created_date","updated_date","is_deleted"})
@Getter
@Setter

public class People {

    @Id
    @JsonProperty("cid")
    @Column(name = "cid")
    private String cid;

    @JsonProperty("title")
    @Column(name = "title")
    private String title;

    @JsonProperty("firstname")
    @Column(name = "firstname")
    private String firstname;

    @JsonProperty("middle_name")
    @Column(name = "middle_name")
    private String middleName;

    @JsonProperty("lastname")
    @Column(name = "lastname")
    private String lastname;

    @JsonProperty("gender")
    @Column(name = "gender")
    private String gender;

    @JsonProperty("birth_date")
    @Column(name = "birth_date")
    private String birthDate;

    @JsonProperty("mobile")
    @Column(name = "mobile")
    private String mobile;

    @JsonProperty("created_by")
    @Column(name = "created_by")
    private String createdBy;

    @JsonProperty("created_date")
    @Column(name = "created_date")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdDate;

    @JsonProperty("updated_date")
    @Column(name = "updated_date")
    private String updatedDate;

    @JsonProperty("is_deleted")
    @Column(name = "is_deleted")
    private char isDeleted;

}
