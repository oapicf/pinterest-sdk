package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * User selection of conversion health criteria for a single feature
 */

@Schema(name = "ConversionHealthSelectionItem", description = "User selection of conversion health criteria for a single feature")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionHealthSelectionItem {

  private Object conversionType;

  private Object criteria;

  private Object ingestionSource;

  private JsonNullable<Object> status = JsonNullable.<Object>undefined();

  public ConversionHealthSelectionItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionHealthSelectionItem(Object status) {
    this.status = JsonNullable.of(status);
  }

  public ConversionHealthSelectionItem conversionType(Object conversionType) {
    this.conversionType = conversionType;
    return this;
  }

  /**
   * Status for conversion types
   * @return conversionType
   */
  
  @Schema(name = "conversionType", description = "Status for conversion types", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversionType")
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
   */
  
  @Schema(name = "criteria", description = "Status for criteria", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("criteria")
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
   */
  
  @Schema(name = "ingestionSource", description = "Status for ingestion sources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ingestionSource")
  public Object getIngestionSource() {
    return ingestionSource;
  }

  public void setIngestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

  public ConversionHealthSelectionItem status(Object status) {
    this.status = JsonNullable.of(status);
    return this;
  }

  /**
   * Overall status for this selection item
   * @return status
   */
  @NotNull 
  @Schema(name = "status", description = "Overall status for this selection item", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public JsonNullable<Object> getStatus() {
    return status;
  }

  public void setStatus(JsonNullable<Object> status) {
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

