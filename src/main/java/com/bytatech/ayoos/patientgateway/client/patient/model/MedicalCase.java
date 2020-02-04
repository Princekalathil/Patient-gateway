package com.bytatech.ayoos.patientgateway.client.patient.model;

import java.util.Objects;
import com.bytatech.ayoos.patientgateway.client.patient.model.DMSRecord;
import com.bytatech.ayoos.patientgateway.client.patient.model.Patient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MedicalCase
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-28T11:07:58.008+05:30[Asia/Kolkata]")

public class MedicalCase   {
  @JsonProperty("consultedDate")
  private LocalDate consultedDate = null;

  @JsonProperty("createdDate")
  private LocalDate createdDate = null;

  @JsonProperty("diagnosed")
  private String diagnosed = null;

  @JsonProperty("dmsRecords")
  @Valid
  private List<DMSRecord> dmsRecords = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("patient")
  private Patient patient = null;

  public MedicalCase consultedDate(LocalDate consultedDate) {
    this.consultedDate = consultedDate;
    return this;
  }

  /**
   * Get consultedDate
   * @return consultedDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getConsultedDate() {
    return consultedDate;
  }

  public void setConsultedDate(LocalDate consultedDate) {
    this.consultedDate = consultedDate;
  }

  public MedicalCase createdDate(LocalDate createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }

  public MedicalCase diagnosed(String diagnosed) {
    this.diagnosed = diagnosed;
    return this;
  }

  /**
   * Get diagnosed
   * @return diagnosed
  **/
  @ApiModelProperty(value = "")


  public String getDiagnosed() {
    return diagnosed;
  }

  public void setDiagnosed(String diagnosed) {
    this.diagnosed = diagnosed;
  }

  public MedicalCase dmsRecords(List<DMSRecord> dmsRecords) {
    this.dmsRecords = dmsRecords;
    return this;
  }

  public MedicalCase addDmsRecordsItem(DMSRecord dmsRecordsItem) {
    if (this.dmsRecords == null) {
      this.dmsRecords = new ArrayList<DMSRecord>();
    }
    this.dmsRecords.add(dmsRecordsItem);
    return this;
  }

  /**
   * Get dmsRecords
   * @return dmsRecords
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DMSRecord> getDmsRecords() {
    return dmsRecords;
  }

  public void setDmsRecords(List<DMSRecord> dmsRecords) {
    this.dmsRecords = dmsRecords;
  }

  public MedicalCase id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public MedicalCase note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public MedicalCase patient(Patient patient) {
    this.patient = patient;
    return this;
  }

  /**
   * Get patient
   * @return patient
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Patient getPatient() {
    return patient;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MedicalCase medicalCase = (MedicalCase) o;
    return Objects.equals(this.consultedDate, medicalCase.consultedDate) &&
        Objects.equals(this.createdDate, medicalCase.createdDate) &&
        Objects.equals(this.diagnosed, medicalCase.diagnosed) &&
        Objects.equals(this.dmsRecords, medicalCase.dmsRecords) &&
        Objects.equals(this.id, medicalCase.id) &&
        Objects.equals(this.note, medicalCase.note) &&
        Objects.equals(this.patient, medicalCase.patient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consultedDate, createdDate, diagnosed, dmsRecords, id, note, patient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MedicalCase {\n");
    
    sb.append("    consultedDate: ").append(toIndentedString(consultedDate)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    diagnosed: ").append(toIndentedString(diagnosed)).append("\n");
    sb.append("    dmsRecords: ").append(toIndentedString(dmsRecords)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    patient: ").append(toIndentedString(patient)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

