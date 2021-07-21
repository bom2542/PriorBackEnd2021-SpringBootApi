package com.example.priorspring01.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "people")
@JsonPropertyOrder({"cid","title","firstname","middle_name","lastname","gender","birth_date","mobile","created_by","created_date","updated_date","is_deleted"})
@Getter
@Setter
public class UpdatePeopleModel {
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
    private String createdDate;

    //UpdatePeopleModel
    @JsonProperty("updated_date")
    @Column(name = "updated_date")
    @UpdateTimestamp
    private java.sql.Timestamp updatedDate;

    @JsonProperty("is_deleted")
    @Column(name = "is_deleted")
    private char isDeleted;
}
