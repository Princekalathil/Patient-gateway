package com.bytatech.ayoos.patientgateway.client.patient.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MedicalCaseDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-28T11:07:58.008+05:30[Asia/Kolkata]")

public class MedicalCaseDTO   {
  @JsonProperty("consultedDate")
  private LocalDate consultedDate = null;

  @JsonProperty("createdDate")
  private LocalDate createdDate = null;

  @JsonProperty("diagnosed")
  private String diagnosed = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("patientId")
  private Long patientId = null;

  public MedicalCaseDTO consultedDate(LocalDate consultedDate) {
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

  public MedicalCaseDTO createdDate(LocalDate createdDate) {
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

  public MedicalCaseDTO diagnosed(String diagnosed) {
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

  public MedicalCaseDTO id(Long id) {
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

  public MedicalCaseDTO note(String note) {
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

  public MedicalCaseDTO patientId(Long patientId) {
    this.patientId = patientId;
    return this;
  }

  /**
   * Get patientId
   * @return patientId
  **/
  @ApiModelProperty(value = "")


  public Long getPatientId() {
    return patientId;
  }

  public void setPatientId(Long patientId) {
    this.patientId = patientId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MedicalCaseDTO medicalCaseDTO = (MedicalCaseDTO) o;
    return Objects.equals(this.consultedDate, medicalCaseDTO.consultedDate) &&
        Objects.equals(this.createdDate, medicalCaseDTO.createdDate) &&
        Objects.equals(this.diagnosed, medicalCaseDTO.diagnosed) &&
        Objects.equals(this.id, medicalCaseDTO.id) &&
        Objects.equals(this.note, medicalCaseDTO.note) &&
        Objects.equals(this.patientId, medicalCaseDTO.patientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consultedDate, createdDate, diagnosed, id, note, patientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MedicalCaseDTO {\n");
    
    sb.append("    consultedDate: ").append(toIndentedString(consultedDate)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    diagnosed: ").append(toIndentedString(diagnosed)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
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

