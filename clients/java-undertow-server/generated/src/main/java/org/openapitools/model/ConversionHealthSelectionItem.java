/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * User selection of conversion health criteria for a single feature
 */

@ApiModel(description = "User selection of conversion health criteria for a single feature")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionHealthSelectionItem   {
  
  private Object conversionType;
  private Object criteria;
  private Object ingestionSource;
  private Object status = null;

  /**
   * Status for conversion types
   */
  public ConversionHealthSelectionItem conversionType(Object conversionType) {
    this.conversionType = conversionType;
    return this;
  }

  
  @ApiModelProperty(value = "Status for conversion types")
  @JsonProperty("conversionType")
  public Object getConversionType() {
    return conversionType;
  }
  public void setConversionType(Object conversionType) {
    this.conversionType = conversionType;
  }

  /**
   * Status for criteria
   */
  public ConversionHealthSelectionItem criteria(Object criteria) {
    this.criteria = criteria;
    return this;
  }

  
  @ApiModelProperty(value = "Status for criteria")
  @JsonProperty("criteria")
  public Object getCriteria() {
    return criteria;
  }
  public void setCriteria(Object criteria) {
    this.criteria = criteria;
  }

  /**
   * Status for ingestion sources
   */
  public ConversionHealthSelectionItem ingestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

  
  @ApiModelProperty(value = "Status for ingestion sources")
  @JsonProperty("ingestionSource")
  public Object getIngestionSource() {
    return ingestionSource;
  }
  public void setIngestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

  /**
   * Overall status for this selection item
   */
  public ConversionHealthSelectionItem status(Object status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Overall status for this selection item")
  @JsonProperty("status")
  public Object getStatus() {
    return status;
  }
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
    return Objects.equals(conversionType, conversionHealthSelectionItem.conversionType) &&
        Objects.equals(criteria, conversionHealthSelectionItem.criteria) &&
        Objects.equals(ingestionSource, conversionHealthSelectionItem.ingestionSource) &&
        Objects.equals(status, conversionHealthSelectionItem.status);
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

