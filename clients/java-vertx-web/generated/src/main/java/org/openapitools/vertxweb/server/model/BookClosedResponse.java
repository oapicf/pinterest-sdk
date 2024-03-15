package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Creation fields
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookClosedResponse   {
  
  private Boolean conversionMetricsReady;
  private Boolean nonConversionMetricsReady;

  public BookClosedResponse () {

  }

  public BookClosedResponse (Boolean conversionMetricsReady, Boolean nonConversionMetricsReady) {
    this.conversionMetricsReady = conversionMetricsReady;
    this.nonConversionMetricsReady = nonConversionMetricsReady;
  }

    
  @JsonProperty("conversion_metrics_ready")
  public Boolean getConversionMetricsReady() {
    return conversionMetricsReady;
  }
  public void setConversionMetricsReady(Boolean conversionMetricsReady) {
    this.conversionMetricsReady = conversionMetricsReady;
  }

    
  @JsonProperty("non_conversion_metrics_ready")
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
    BookClosedResponse bookClosedResponse = (BookClosedResponse) o;
    return Objects.equals(conversionMetricsReady, bookClosedResponse.conversionMetricsReady) &&
        Objects.equals(nonConversionMetricsReady, bookClosedResponse.nonConversionMetricsReady);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
