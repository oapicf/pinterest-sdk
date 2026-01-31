package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="User selection of conversion health criteria for a single feature")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-31T04:54:58.059572557Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ConversionHealthSelectionItem   {
  
  private Object conversionType;
  private Object criteria;
  private Object ingestionSource;
  private Object status = null;

  /**
   * Status for conversion types
   **/
  
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
   **/
  
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
   **/
  
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
   **/
  
  @ApiModelProperty(required = true, value = "Overall status for this selection item")
  @JsonProperty("status")
  @NotNull
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

