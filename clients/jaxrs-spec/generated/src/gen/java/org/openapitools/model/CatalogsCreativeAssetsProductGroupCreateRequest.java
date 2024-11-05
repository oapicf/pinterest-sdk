package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilters;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Request object for creating a creative assets product group.
 **/
@ApiModel(description = "Request object for creating a creative assets product group.")
@JsonTypeName("CatalogsCreativeAssetsProductGroupCreateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsCreativeAssetsProductGroupCreateRequest   {
  public enum CatalogTypeEnum {

    CREATIVE_ASSETS(String.valueOf("CREATIVE_ASSETS"));


    private String value;

    CatalogTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static CatalogTypeEnum fromString(String s) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static CatalogTypeEnum fromValue(String value) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private CatalogTypeEnum catalogType;
  private String name;
  private String description;
  private CatalogsCreativeAssetsProductGroupFilters filters;
  private String catalogId;

  /**
   **/
  public CatalogsCreativeAssetsProductGroupCreateRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  @NotNull public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  @JsonProperty("catalog_type")
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   **/
  public CatalogsCreativeAssetsProductGroupCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public CatalogsCreativeAssetsProductGroupCreateRequest description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public CatalogsCreativeAssetsProductGroupCreateRequest filters(CatalogsCreativeAssetsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("filters")
  @NotNull @Valid public CatalogsCreativeAssetsProductGroupFilters getFilters() {
    return filters;
  }

  @JsonProperty("filters")
  public void setFilters(CatalogsCreativeAssetsProductGroupFilters filters) {
    this.filters = filters;
  }

  /**
   * Catalog id pertaining to the creative assets product group.
   **/
  public CatalogsCreativeAssetsProductGroupCreateRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog id pertaining to the creative assets product group.")
  @JsonProperty("catalog_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getCatalogId() {
    return catalogId;
  }

  @JsonProperty("catalog_id")
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsCreativeAssetsProductGroupCreateRequest catalogsCreativeAssetsProductGroupCreateRequest = (CatalogsCreativeAssetsProductGroupCreateRequest) o;
    return Objects.equals(this.catalogType, catalogsCreativeAssetsProductGroupCreateRequest.catalogType) &&
        Objects.equals(this.name, catalogsCreativeAssetsProductGroupCreateRequest.name) &&
        Objects.equals(this.description, catalogsCreativeAssetsProductGroupCreateRequest.description) &&
        Objects.equals(this.filters, catalogsCreativeAssetsProductGroupCreateRequest.filters) &&
        Objects.equals(this.catalogId, catalogsCreativeAssetsProductGroupCreateRequest.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, name, description, filters, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsProductGroupCreateRequest {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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

