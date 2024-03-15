package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Creation fields
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BookClosedResponse   {
  @JsonProperty("conversion_metrics_ready")
  
  private Boolean conversionMetricsReady;

  @JsonProperty("non_conversion_metrics_ready")
  
  private Boolean nonConversionMetricsReady;

  public BookClosedResponse conversionMetricsReady(Boolean conversionMetricsReady) {
    this.conversionMetricsReady = conversionMetricsReady;
    return this;
  }

   /**
   * Are conversion metrics ready?
   * @return conversionMetricsReady
  **/
  public Boolean getConversionMetricsReady() {
    return conversionMetricsReady;
  }

  public void setConversionMetricsReady(Boolean conversionMetricsReady) {
    this.conversionMetricsReady = conversionMetricsReady;
  }

  public BookClosedResponse nonConversionMetricsReady(Boolean nonConversionMetricsReady) {
    this.nonConversionMetricsReady = nonConversionMetricsReady;
    return this;
  }

   /**
   * Are non-conversion metrics ready?
   * @return nonConversionMetricsReady
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

