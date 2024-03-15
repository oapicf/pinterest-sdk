package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Creation fields
 **/

@ApiModel(description = "Creation fields")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BookClosedResponse   {
  @JsonProperty("conversion_metrics_ready")
  private Boolean conversionMetricsReady;

  @JsonProperty("non_conversion_metrics_ready")
  private Boolean nonConversionMetricsReady;

  /**
   * Are conversion metrics ready?
   **/
  public BookClosedResponse conversionMetricsReady(Boolean conversionMetricsReady) {
    this.conversionMetricsReady = conversionMetricsReady;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Are conversion metrics ready?")
  @JsonProperty("conversion_metrics_ready")
  public Boolean getConversionMetricsReady() {
    return conversionMetricsReady;
  }
  public void setConversionMetricsReady(Boolean conversionMetricsReady) {
    this.conversionMetricsReady = conversionMetricsReady;
  }

  /**
   * Are non-conversion metrics ready?
   **/
  public BookClosedResponse nonConversionMetricsReady(Boolean nonConversionMetricsReady) {
    this.nonConversionMetricsReady = nonConversionMetricsReady;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Are non-conversion metrics ready?")
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

