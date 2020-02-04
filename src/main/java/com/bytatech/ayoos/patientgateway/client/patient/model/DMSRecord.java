package com.bytatech.ayoos.patientgateway.client.patient.model;

import java.util.Objects;
import com.bytatech.ayoos.patientgateway.client.patient.model.MedicalCase;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DMSRecord
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-28T11:07:58.008+05:30[Asia/Kolkata]")

public class DMSRecord   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("medicalCase")
  private MedicalCase medicalCase = null;

  @JsonProperty("prescriptionRef")
  private String prescriptionRef = null;

  public DMSRecord id(Long id) {
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

  public DMSRecord medicalCase(MedicalCase medicalCase) {
    this.medicalCase = medicalCase;
    return this;
  }

  /**
   * Get medicalCase
   * @return medicalCase
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MedicalCase getMedicalCase() {
    return medicalCase;
  }

  public void setMedicalCase(MedicalCase medicalCase) {
    this.medicalCase = medicalCase;
  }

  public DMSRecord prescriptionRef(String prescriptionRef) {
    this.prescriptionRef = prescriptionRef;
    return this;
  }

  /**
   * Get prescriptionRef
   * @return prescriptionRef
  **/
  @ApiModelProperty(value = "")


  public String getPrescriptionRef() {
    return prescriptionRef;
  }

  public void setPrescriptionRef(String prescriptionRef) {
    this.prescriptionRef = prescriptionRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DMSRecord dmSRecord = (DMSRecord) o;
    return Objects.equals(this.id, dmSRecord.id) &&
        Objects.equals(this.medicalCase, dmSRecord.medicalCase) &&
        Objects.equals(this.prescriptionRef, dmSRecord.prescriptionRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, medicalCase, prescriptionRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DMSRecord {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    medicalCase: ").append(toIndentedString(medicalCase)).append("\n");
    sb.append("    prescriptionRef: ").append(toIndentedString(prescriptionRef)).append("\n");
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

