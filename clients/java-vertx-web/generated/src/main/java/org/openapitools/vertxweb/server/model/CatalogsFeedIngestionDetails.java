package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CatalogsFeedIngestionErrors;
import org.openapitools.vertxweb.server.model.CatalogsFeedIngestionInfo;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsFeedIngestionDetails   {
  
  private CatalogsFeedIngestionErrors errors;
  private CatalogsFeedIngestionInfo info;

  public CatalogsFeedIngestionDetails () {

  }

  public CatalogsFeedIngestionDetails (CatalogsFeedIngestionErrors errors, CatalogsFeedIngestionInfo info) {
    this.errors = errors;
    this.info = info;
  }

    
  @JsonProperty("errors")
  public CatalogsFeedIngestionErrors getErrors() {
    return errors;
  }
  public void setErrors(CatalogsFeedIngestionErrors errors) {
    this.errors = errors;
  }

    
  @JsonProperty("info")
  public CatalogsFeedIngestionInfo getInfo() {
    return info;
  }
  public void setInfo(CatalogsFeedIngestionInfo info) {
    this.info = info;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedIngestionDetails catalogsFeedIngestionDetails = (CatalogsFeedIngestionDetails) o;
    return Objects.equals(errors, catalogsFeedIngestionDetails.errors) &&
        Objects.equals(info, catalogsFeedIngestionDetails.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, info);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedIngestionDetails {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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
