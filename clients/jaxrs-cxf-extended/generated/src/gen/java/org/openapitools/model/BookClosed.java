package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BookClosed  {
  
 /**
  * Are conversion metrics ready?
  */
  @ApiModelProperty(example = "false", required = true, value = "Are conversion metrics ready?")
  private Boolean conversionMetricsReady;

 /**
  * Are non-conversion metrics ready?
  */
  @ApiModelProperty(example = "false", required = true, value = "Are non-conversion metrics ready?")
  private Boolean nonConversionMetricsReady;
 /**
  * Are conversion metrics ready?
  * @return conversionMetricsReady
  */
  @JsonProperty("conversion_metrics_ready")
  @NotNull
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
  public BookClosed conversionMetricsReady(Boolean conversionMetricsReady) {
    this.conversionMetricsReady = conversionMetricsReady;
    return this;
  }

 /**
  * Are non-conversion metrics ready?
  * @return nonConversionMetricsReady
  */
  @JsonProperty("non_conversion_metrics_ready")
  @NotNull
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
  public BookClosed nonConversionMetricsReady(Boolean nonConversionMetricsReady) {
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
    BookClosed bookClosed = (BookClosed) o;
    return Objects.equals(this.conversionMetricsReady, bookClosed.conversionMetricsReady) &&
        Objects.equals(this.nonConversionMetricsReady, bookClosed.nonConversionMetricsReady);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionMetricsReady, nonConversionMetricsReady);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookClosed {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

