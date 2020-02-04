package com.bytatech.ayoos.patientgateway.client.patient.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RecordDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-28T11:07:58.008+05:30[Asia/Kolkata]")

public class RecordDTO   {
  @JsonProperty("file")
  private byte[] file = null;

  @JsonProperty("idpCode")
  private String idpCode = null;

  @JsonProperty("medicalCaseId")
  private Long medicalCaseId = null;

  public RecordDTO file(byte[] file) {
    this.file = file;
    return this;
  }

  /**
   * Get file
   * @return file
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getFile() {
    return file;
  }

  public void setFile(byte[] file) {
    this.file = file;
  }

  public RecordDTO idpCode(String idpCode) {
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

  public RecordDTO medicalCaseId(Long medicalCaseId) {
    this.medicalCaseId = medicalCaseId;
    return this;
  }

  /**
   * Get medicalCaseId
   * @return medicalCaseId
  **/
  @ApiModelProperty(value = "")


  public Long getMedicalCaseId() {
    return medicalCaseId;
  }

  public void setMedicalCaseId(Long medicalCaseId) {
    this.medicalCaseId = medicalCaseId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordDTO recordDTO = (RecordDTO) o;
    return Objects.equals(this.file, recordDTO.file) &&
        Objects.equals(this.idpCode, recordDTO.idpCode) &&
        Objects.equals(this.medicalCaseId, recordDTO.medicalCaseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, idpCode, medicalCaseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordDTO {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    idpCode: ").append(toIndentedString(idpCode)).append("\n");
    sb.append("    medicalCaseId: ").append(toIndentedString(medicalCaseId)).append("\n");
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

