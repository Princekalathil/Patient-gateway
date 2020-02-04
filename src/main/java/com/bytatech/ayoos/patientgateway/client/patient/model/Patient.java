package com.bytatech.ayoos.patientgateway.client.patient.model;

import java.util.Objects;
import com.bytatech.ayoos.patientgateway.client.patient.model.MedicalCase;
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
 * Patient
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-28T11:07:58.008+05:30[Asia/Kolkata]")

public class Patient   {
  @JsonProperty("createdDate")
  private LocalDate createdDate = null;

  @JsonProperty("dmsId")
  private String dmsId = null;

  @JsonProperty("dob")
  private LocalDate dob = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("idpCode")
  private String idpCode = null;

  @JsonProperty("image")
  private byte[] image = null;

  @JsonProperty("imageContentType")
  private String imageContentType = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("medicalCases")
  @Valid
  private List<MedicalCase> medicalCases = null;

  @JsonProperty("phoneNumber")
  private Long phoneNumber = null;

  public Patient createdDate(LocalDate createdDate) {
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

  public Patient dmsId(String dmsId) {
    this.dmsId = dmsId;
    return this;
  }

  /**
   * Get dmsId
   * @return dmsId
  **/
  @ApiModelProperty(value = "")


  public String getDmsId() {
    return dmsId;
  }

  public void setDmsId(String dmsId) {
    this.dmsId = dmsId;
  }

  public Patient dob(LocalDate dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Get dob
   * @return dob
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public Patient id(Long id) {
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

  public Patient idpCode(String idpCode) {
    this.idpCode = idpCode;
    return this;
  }

  /**
   * Get idpCode
   * @return idpCode
  **/
  @ApiModelProperty(value = "")


  public String getIdpCode() {
    return idpCode;
  }

  public void setIdpCode(String idpCode) {
    this.idpCode = idpCode;
  }

  public Patient image(byte[] image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public Patient imageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
    return this;
  }

  /**
   * Get imageContentType
   * @return imageContentType
  **/
  @ApiModelProperty(value = "")


  public String getImageContentType() {
    return imageContentType;
  }

  public void setImageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
  }

  public Patient location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Patient medicalCases(List<MedicalCase> medicalCases) {
    this.medicalCases = medicalCases;
    return this;
  }

  public Patient addMedicalCasesItem(MedicalCase medicalCasesItem) {
    if (this.medicalCases == null) {
      this.medicalCases = new ArrayList<MedicalCase>();
    }
    this.medicalCases.add(medicalCasesItem);
    return this;
  }

  /**
   * Get medicalCases
   * @return medicalCases
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<MedicalCase> getMedicalCases() {
    return medicalCases;
  }

  public void setMedicalCases(List<MedicalCase> medicalCases) {
    this.medicalCases = medicalCases;
  }

  public Patient phoneNumber(Long phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")


  public Long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(Long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Patient patient = (Patient) o;
    return Objects.equals(this.createdDate, patient.createdDate) &&
        Objects.equals(this.dmsId, patient.dmsId) &&
        Objects.equals(this.dob, patient.dob) &&
        Objects.equals(this.id, patient.id) &&
        Objects.equals(this.idpCode, patient.idpCode) &&
        Objects.equals(this.image, patient.image) &&
        Objects.equals(this.imageContentType, patient.imageContentType) &&
        Objects.equals(this.location, patient.location) &&
        Objects.equals(this.medicalCases, patient.medicalCases) &&
        Objects.equals(this.phoneNumber, patient.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, dmsId, dob, id, idpCode, image, imageContentType, location, medicalCases, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Patient {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    dmsId: ").append(toIndentedString(dmsId)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idpCode: ").append(toIndentedString(idpCode)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageContentType: ").append(toIndentedString(imageContentType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    medicalCases: ").append(toIndentedString(medicalCases)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

