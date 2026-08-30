package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * User selection of conversion health criteria for a single feature
 **/
@ApiModel(description = "User selection of conversion health criteria for a single feature")
@JsonTypeName("ConversionHealthSelectionItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionHealthSelectionItem   {
  private Object conversionType;
  private Object criteria;
  private Object ingestionSource;
  private Object status = null;

  public ConversionHealthSelectionItem() {
  }

  @JsonCreator
  public ConversionHealthSelectionItem(
    @JsonProperty(required = true, value = "status") Object status
  ) {
    this.status = status;
  }

  /**
   * Status for conversion types
   **/
  public ConversionHealthSelectionItem conversionType(Object conversionType) {
    this.conversionType = conversionType;
    return this;
  }

  
  @ApiModelProperty(value = "Status for conversion types")
  @JsonProperty("conversionType")
  public Object getConversionType() {
    return conversionType;
  }

  @JsonProperty("conversionType")
  public void setConversionType(Object conversionType) {
    this.conversionType = conversionType;
  }

  /**
   * Status for criteria
   **/
  public ConversionHealthSelectionItem criteria(Object criteria) {
    this.criteria = criteria;
    return this;
  }

  
  @ApiModelProperty(value = "Status for criteria")
  @JsonProperty("criteria")
  public Object getCriteria() {
    return criteria;
  }

  @JsonProperty("criteria")
  public void setCriteria(Object criteria) {
    this.criteria = criteria;
  }

  /**
   * Status for ingestion sources
   **/
  public ConversionHealthSelectionItem ingestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

  
  @ApiModelProperty(value = "Status for ingestion sources")
  @JsonProperty("ingestionSource")
  public Object getIngestionSource() {
    return ingestionSource;
  }

  @JsonProperty("ingestionSource")
  public void setIngestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

  /**
   * Overall status for this selection item
   **/
  public ConversionHealthSelectionItem status(Object status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Overall status for this selection item")
  @JsonProperty(required = true, value = "status")
  @NotNull public Object getStatus() {
    return status;
  }

  @JsonProperty(required = true, value = "status")
  public void setStatus(Object status) {
    this.status = status;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
