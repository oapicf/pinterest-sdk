package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.NullableCurrency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Request object for updating a feed.
 **/
@ApiModel(description = "Request object for updating a feed.")
@JsonTypeName("CatalogsHotelFeedsUpdateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsHotelFeedsUpdateRequest   {
  private NullableCurrency defaultCurrency;
  private String name;
  private CatalogsFormat format;
  private CatalogsFeedCredentials credentials;
  private String location;
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;
  private CatalogsStatus status;
  private CatalogsType catalogType;

  /**
   **/
  public CatalogsHotelFeedsUpdateRequest defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("default_currency")
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }

  @JsonProperty("default_currency")
  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  /**
   * A human-friendly name associated to a given feed.
   **/
  public CatalogsHotelFeedsUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "A human-friendly name associated to a given feed.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public CatalogsHotelFeedsUpdateRequest format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("format")
  public CatalogsFormat getFormat() {
    return format;
  }

  @JsonProperty("format")
  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

  /**
   **/
  public CatalogsHotelFeedsUpdateRequest credentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("credentials")
  @Valid public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }

  @JsonProperty("credentials")
  public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }

  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   **/
  public CatalogsHotelFeedsUpdateRequest location(String location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
  @JsonProperty("location")
   @Pattern(regexp="^(http|https|ftp|sftp)://")public String getLocation() {
    return location;
  }

  @JsonProperty("location")
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   **/
  public CatalogsHotelFeedsUpdateRequest preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("preferred_processing_schedule")
  @Valid public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }

  @JsonProperty("preferred_processing_schedule")
  public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

  /**
   **/
  public CatalogsHotelFeedsUpdateRequest status(CatalogsStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public CatalogsStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(CatalogsStatus status) {
    this.status = status;
  }

  /**
   **/
  public CatalogsHotelFeedsUpdateRequest catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  @NotNull public CatalogsType getCatalogType() {
    return catalogType;
  }

  @JsonProperty("catalog_type")
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest = (CatalogsHotelFeedsUpdateRequest) o;
    return Objects.equals(this.defaultCurrency, catalogsHotelFeedsUpdateRequest.defaultCurrency) &&
        Objects.equals(this.name, catalogsHotelFeedsUpdateRequest.name) &&
        Objects.equals(this.format, catalogsHotelFeedsUpdateRequest.format) &&
        Objects.equals(this.credentials, catalogsHotelFeedsUpdateRequest.credentials) &&
        Objects.equals(this.location, catalogsHotelFeedsUpdateRequest.location) &&
        Objects.equals(this.preferredProcessingSchedule, catalogsHotelFeedsUpdateRequest.preferredProcessingSchedule) &&
        Objects.equals(this.status, catalogsHotelFeedsUpdateRequest.status) &&
        Objects.equals(this.catalogType, catalogsHotelFeedsUpdateRequest.catalogType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCurrency, name, format, credentials, location, preferredProcessingSchedule, status, catalogType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelFeedsUpdateRequest {\n");
    
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    preferredProcessingSchedule: ").append(toIndentedString(preferredProcessingSchedule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
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

