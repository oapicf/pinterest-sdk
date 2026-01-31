package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User selection of conversion health criteria for a single feature
 */
@ApiModel(description="User selection of conversion health criteria for a single feature")

public class ConversionHealthSelectionItem  {
  
 /**
  * Status for conversion types
  */
  @ApiModelProperty(value = "Status for conversion types")

  private Object conversionType;

 /**
  * Status for criteria
  */
  @ApiModelProperty(value = "Status for criteria")

  private Object criteria;

 /**
  * Status for ingestion sources
  */
  @ApiModelProperty(value = "Status for ingestion sources")

  private Object ingestionSource;

 /**
  * Overall status for this selection item
  */
  @ApiModelProperty(required = true, value = "Overall status for this selection item")

  private Object status = null;
 /**
   * Status for conversion types
   * @return conversionType
  **/
  @JsonProperty("conversionType")
  public Object getConversionType() {
    return conversionType;
  }

  public void setConversionType(Object conversionType) {
    this.conversionType = conversionType;
  }

  public ConversionHealthSelectionItem conversionType(Object conversionType) {
    this.conversionType = conversionType;
    return this;
  }

 /**
   * Status for criteria
   * @return criteria
  **/
  @JsonProperty("criteria")
  public Object getCriteria() {
    return criteria;
  }

  public void setCriteria(Object criteria) {
    this.criteria = criteria;
  }

  public ConversionHealthSelectionItem criteria(Object criteria) {
    this.criteria = criteria;
    return this;
  }

 /**
   * Status for ingestion sources
   * @return ingestionSource
  **/
  @JsonProperty("ingestionSource")
  public Object getIngestionSource() {
    return ingestionSource;
  }

  public void setIngestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

  public ConversionHealthSelectionItem ingestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

 /**
   * Overall status for this selection item
   * @return status
  **/
  @JsonProperty("status")
  @NotNull
  public Object getStatus() {
    return status;
  }

  public void setStatus(Object status) {
    this.status = status;
  }

  public ConversionHealthSelectionItem status(Object status) {
    this.status = status;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionHealthSelectionItem conversionHealthSelectionItem = (ConversionHealthSelectionItem) o;
    return Objects.equals(this.conversionType, conversionHealthSelectionItem.conversionType) &&
        Objects.equals(this.criteria, conversionHealthSelectionItem.criteria) &&
        Objects.equals(this.ingestionSource, conversionHealthSelectionItem.ingestionSource) &&
        Objects.equals(this.status, conversionHealthSelectionItem.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionType, criteria, ingestionSource, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionHealthSelectionItem {\n");
    
    sb.append("    conversionType: ").append(toIndentedString(conversionType)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    ingestionSource: ").append(toIndentedString(ingestionSource)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

