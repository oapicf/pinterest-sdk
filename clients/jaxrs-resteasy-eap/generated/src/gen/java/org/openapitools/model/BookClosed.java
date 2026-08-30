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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BookClosed   {
  
  private Boolean conversionMetricsReady;
  private Boolean nonConversionMetricsReady;

  /**
   * Are conversion metrics ready?
   **/
  
  @ApiModelProperty(example = "false", required = true, value = "Are conversion metrics ready?")
  @JsonProperty("conversion_metrics_ready")
  @NotNull
  public Boolean getConversionMetricsReady() {
    return conversionMetricsReady;
  }
  public void setConversionMetricsReady(Boolean conversionMetricsReady) {
    this.conversionMetricsReady = conversionMetricsReady;
  }

  /**
   * Are non-conversion metrics ready?
   **/
  
  @ApiModelProperty(example = "false", required = true, value = "Are non-conversion metrics ready?")
  @JsonProperty("non_conversion_metrics_ready")
  @NotNull
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

