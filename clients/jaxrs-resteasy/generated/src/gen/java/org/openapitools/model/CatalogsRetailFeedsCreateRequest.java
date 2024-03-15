package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFeedsCreateRequestDefaultLocale;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Country;
import org.openapitools.model.NullableCurrency;
import org.openapitools.model.ProductAvailabilityType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@ApiModel(description="Request object for creating a retail feed.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsRetailFeedsCreateRequest   {
  
  private NullableCurrency defaultCurrency;
  private String name;
  private CatalogsFormat format;
  private CatalogsFeedsCreateRequestDefaultLocale defaultLocale;
  private CatalogsFeedCredentials credentials;
  private String location;
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;
  private CatalogsType catalogType;
  private Country defaultCountry;
  private ProductAvailabilityType defaultAvailability;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("default_currency")
  @Valid
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }
  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  /**
   * A human-friendly name associated to a given feed.
   **/
  
  @ApiModelProperty(required = true, value = "A human-friendly name associated to a given feed.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("format")
  @NotNull
  @Valid
  public CatalogsFormat getFormat() {
    return format;
  }
  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("default_locale")
  @NotNull
  @Valid
  public CatalogsFeedsCreateRequestDefaultLocale getDefaultLocale() {
    return defaultLocale;
  }
  public void setDefaultLocale(CatalogsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("credentials")
  @Valid
  public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }
  public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }

  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   **/
  
  @ApiModelProperty(required = true, value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
  @JsonProperty("location")
  @NotNull
 @Pattern(regexp="^(http|https|ftp|sftp)://")  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preferred_processing_schedule")
  @Valid
  public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }
  public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  @NotNull
  @Valid
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("default_country")
  @NotNull
  @Valid
  public Country getDefaultCountry() {
    return defaultCountry;
  }
  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("default_availability")
  @Valid
  public ProductAvailabilityType getDefaultAvailability() {
    return defaultAvailability;
  }
  public void setDefaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest = (CatalogsRetailFeedsCreateRequest) o;
    return Objects.equals(this.defaultCurrency, catalogsRetailFeedsCreateRequest.defaultCurrency) &&
        Objects.equals(this.name, catalogsRetailFeedsCreateRequest.name) &&
        Objects.equals(this.format, catalogsRetailFeedsCreateRequest.format) &&
        Objects.equals(this.defaultLocale, catalogsRetailFeedsCreateRequest.defaultLocale) &&
        Objects.equals(this.credentials, catalogsRetailFeedsCreateRequest.credentials) &&
        Objects.equals(this.location, catalogsRetailFeedsCreateRequest.location) &&
        Objects.equals(this.preferredProcessingSchedule, catalogsRetailFeedsCreateRequest.preferredProcessingSchedule) &&
        Objects.equals(this.catalogType, catalogsRetailFeedsCreateRequest.catalogType) &&
        Objects.equals(this.defaultCountry, catalogsRetailFeedsCreateRequest.defaultCountry) &&
        Objects.equals(this.defaultAvailability, catalogsRetailFeedsCreateRequest.defaultAvailability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCurrency, name, format, defaultLocale, credentials, location, preferredProcessingSchedule, catalogType, defaultCountry, defaultAvailability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailFeedsCreateRequest {\n");
    
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    preferredProcessingSchedule: ").append(toIndentedString(preferredProcessingSchedule)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
    sb.append("    defaultAvailability: ").append(toIndentedString(defaultAvailability)).append("\n");
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

