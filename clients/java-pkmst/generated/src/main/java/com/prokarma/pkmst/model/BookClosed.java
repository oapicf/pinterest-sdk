package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * BookClosed
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BookClosed   {
  @JsonProperty("conversion_metrics_ready")
  private Boolean conversionMetricsReady;

  @JsonProperty("non_conversion_metrics_ready")
  private Boolean nonConversionMetricsReady;

  public BookClosed conversionMetricsReady(Boolean conversionMetricsReady) {
    this.conversionMetricsReady = conversionMetricsReady;
    return this;
  }

  /**
   * Are conversion metrics ready?
   * @return conversionMetricsReady
   */
  @ApiModelProperty(example = "false", required = true, value = "Are conversion metrics ready?")
  public Boolean getConversionMetricsReady() {
    return conversionMetricsReady;
  }

  public void setConversionMetricsReady(Boolean conversionMetricsReady) {
    this.conversionMetricsReady = conversionMetricsReady;
  }

  public BookClosed nonConversionMetricsReady(Boolean nonConversionMetricsReady) {
    this.nonConversionMetricsReady = nonConversionMetricsReady;
    return this;
  }

  /**
   * Are non-conversion metrics ready?
   * @return nonConversionMetricsReady
   */
  @ApiModelProperty(example = "false", required = true, value = "Are non-conversion metrics ready?")
  public Boolean getNonConversionMetricsReady() {
    return nonConversionMetricsReady;
  }

  public void setNonConversionMetricsReady(Boolean nonConversionMetricsReady) {
    this.nonConversionMetricsReady = nonConversionMetricsReady;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

