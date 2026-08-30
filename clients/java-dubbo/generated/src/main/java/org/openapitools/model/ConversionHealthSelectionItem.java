package org.openapitools.model;

import org.openapitools.model.AnyType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * User selection of conversion health criteria for a single feature
 */
public class ConversionHealthSelectionItem implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Status for conversion types
   */
  @JsonProperty("conversionType")
  private Object conversionType;

  /**
   * Status for criteria
   */
  @JsonProperty("criteria")
  private Object criteria;

  /**
   * Status for ingestion sources
   */
  @JsonProperty("ingestionSource")
  private Object ingestionSource;

  /**
   * Overall status for this selection item
   */
  @JsonProperty("status")
  private AnyType status = null;

  /**
   * Status for conversion types
   * @return conversionType
   */
  public Object getConversionType() {
    return conversionType;
  }

  public void setConversionType(Object conversionType) {
    this.conversionType = conversionType;
  }

  /**
   * Status for criteria
   * @return criteria
   */
  public Object getCriteria() {
    return criteria;
  }

  public void setCriteria(Object criteria) {
    this.criteria = criteria;
  }

  /**
   * Status for ingestion sources
   * @return ingestionSource
   */
  public Object getIngestionSource() {
    return ingestionSource;
  }

  public void setIngestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

  /**
   * Overall status for this selection item
   * @return status
   */
  public AnyType getStatus() {
    return status;
  }

  public void setStatus(AnyType status) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
