package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User selection of conversion health criteria for a single feature
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionHealthSelectionItem   {
  
  private Object conversionType;
  private Object criteria;
  private Object ingestionSource;
  private Object status = null;

  public ConversionHealthSelectionItem () {

  }

  public ConversionHealthSelectionItem (Object conversionType, Object criteria, Object ingestionSource, Object status) {
    this.conversionType = conversionType;
    this.criteria = criteria;
    this.ingestionSource = ingestionSource;
    this.status = status;
  }

    
  @JsonProperty("conversionType")
  public Object getConversionType() {
    return conversionType;
  }
  public void setConversionType(Object conversionType) {
    this.conversionType = conversionType;
  }

    
  @JsonProperty("criteria")
  public Object getCriteria() {
    return criteria;
  }
  public void setCriteria(Object criteria) {
    this.criteria = criteria;
  }

    
  @JsonProperty("ingestionSource")
  public Object getIngestionSource() {
    return ingestionSource;
  }
  public void setIngestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

    
  @JsonProperty("status")
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
