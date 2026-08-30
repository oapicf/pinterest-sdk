package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class BookClosed implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Are conversion metrics ready?
   */
  @JsonProperty("conversion_metrics_ready")
  private Boolean conversionMetricsReady;

  /**
   * Are non-conversion metrics ready?
   */
  @JsonProperty("non_conversion_metrics_ready")
  private Boolean nonConversionMetricsReady;

  /**
   * Are conversion metrics ready?
   * @return conversionMetricsReady
   */
  public Boolean getConversionMetricsReady() {
    return conversionMetricsReady;
  }

  public void setConversionMetricsReady(Boolean conversionMetricsReady) {
    this.conversionMetricsReady = conversionMetricsReady;
  }

  /**
   * Are non-conversion metrics ready?
   * @return nonConversionMetricsReady
   */
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
