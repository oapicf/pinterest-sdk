package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * User selection of conversion health criteria for a single feature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionHealthSelectionItem   {
  @JsonProperty("conversionType")
  
  private Object conversionType;

  @JsonProperty("criteria")
  
  private Object criteria;

  @JsonProperty("ingestionSource")
  
  private Object ingestionSource;

  @JsonProperty("status")
  @NotNull

  private Object status = null;

  public ConversionHealthSelectionItem conversionType(Object conversionType) {
    this.conversionType = conversionType;
    return this;
  }

   /**
   * Status for conversion types
   * @return conversionType
  **/
  public Object getConversionType() {
    return conversionType;
  }

  public void setConversionType(Object conversionType) {
    this.conversionType = conversionType;
  }

  public ConversionHealthSelectionItem criteria(Object criteria) {
    this.criteria = criteria;
    return this;
  }

   /**
   * Status for criteria
   * @return criteria
  **/
  public Object getCriteria() {
    return criteria;
  }

  public void setCriteria(Object criteria) {
    this.criteria = criteria;
  }

  public ConversionHealthSelectionItem ingestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

   /**
   * Status for ingestion sources
   * @return ingestionSource
  **/
  public Object getIngestionSource() {
    return ingestionSource;
  }

  public void setIngestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

  public ConversionHealthSelectionItem status(Object status) {
    this.status = status;
    return this;
  }

   /**
   * Overall status for this selection item
   * @return status
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

