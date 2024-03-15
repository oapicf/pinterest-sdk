package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Creation fields
 */
@ApiModel(description="Creation fields")

public class BookClosedResponse  {
  
 /**
  * Are conversion metrics ready?
  */
  @ApiModelProperty(example = "false", value = "Are conversion metrics ready?")
  private Boolean conversionMetricsReady;

 /**
  * Are non-conversion metrics ready?
  */
  @ApiModelProperty(example = "false", value = "Are non-conversion metrics ready?")
  private Boolean nonConversionMetricsReady;
 /**
  * Are conversion metrics ready?
  * @return conversionMetricsReady
  */
  @JsonProperty("conversion_metrics_ready")
  public Boolean getConversionMetricsReady() {
    return conversionMetricsReady;
  }

  /**
   * Sets the <code>conversionMetricsReady</code> property.
   */
 public void setConversionMetricsReady(Boolean conversionMetricsReady) {
    this.conversionMetricsReady = conversionMetricsReady;
  }

  /**
   * Sets the <code>conversionMetricsReady</code> property.
   */
  public BookClosedResponse conversionMetricsReady(Boolean conversionMetricsReady) {
    this.conversionMetricsReady = conversionMetricsReady;
    return this;
  }

 /**
  * Are non-conversion metrics ready?
  * @return nonConversionMetricsReady
  */
  @JsonProperty("non_conversion_metrics_ready")
  public Boolean getNonConversionMetricsReady() {
    return nonConversionMetricsReady;
  }

  /**
   * Sets the <code>nonConversionMetricsReady</code> property.
   */
 public void setNonConversionMetricsReady(Boolean nonConversionMetricsReady) {
    this.nonConversionMetricsReady = nonConversionMetricsReady;
  }

  /**
   * Sets the <code>nonConversionMetricsReady</code> property.
   */
  public BookClosedResponse nonConversionMetricsReady(Boolean nonConversionMetricsReady) {
    this.nonConversionMetricsReady = nonConversionMetricsReady;
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
    BookClosedResponse bookClosedResponse = (BookClosedResponse) o;
    return Objects.equals(this.conversionMetricsReady, bookClosedResponse.conversionMetricsReady) &&
        Objects.equals(this.nonConversionMetricsReady, bookClosedResponse.nonConversionMetricsReady);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionMetricsReady, nonConversionMetricsReady);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookClosedResponse {\n");
    
    sb.append("    conversionMetricsReady: ").append(toIndentedString(conversionMetricsReady)).append("\n");
    sb.append("    nonConversionMetricsReady: ").append(toIndentedString(nonConversionMetricsReady)).append("\n");
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

