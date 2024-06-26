/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupFilters;
import org.openapitools.model.CatalogsProductGroupStatus;
import org.openapitools.model.CatalogsProductGroupType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * catalog product group entity
 */
@JsonPropertyOrder({
  CatalogsProductGroup.JSON_PROPERTY_ID,
  CatalogsProductGroup.JSON_PROPERTY_NAME,
  CatalogsProductGroup.JSON_PROPERTY_DESCRIPTION,
  CatalogsProductGroup.JSON_PROPERTY_FILTERS,
  CatalogsProductGroup.JSON_PROPERTY_IS_FEATURED,
  CatalogsProductGroup.JSON_PROPERTY_TYPE,
  CatalogsProductGroup.JSON_PROPERTY_STATUS,
  CatalogsProductGroup.JSON_PROPERTY_CREATED_AT,
  CatalogsProductGroup.JSON_PROPERTY_UPDATED_AT,
  CatalogsProductGroup.JSON_PROPERTY_FEED_ID,
  CatalogsProductGroup.JSON_PROPERTY_CATALOG_TYPE
})
@JsonTypeName("CatalogsProductGroup")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-03-14T23:01:49.950286870Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class CatalogsProductGroup {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_FILTERS = "filters";
    private CatalogsProductGroupFilters filters;

    public static final String JSON_PROPERTY_IS_FEATURED = "is_featured";
    private Boolean isFeatured;

    public static final String JSON_PROPERTY_TYPE = "type";
    private CatalogsProductGroupType type;

    public static final String JSON_PROPERTY_STATUS = "status";
    private CatalogsProductGroupStatus status;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private Integer createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private Integer updatedAt;

    public static final String JSON_PROPERTY_FEED_ID = "feed_id";
    private String feedId;

    /**
     * Gets or Sets catalogType
     */
    public enum CatalogTypeEnum {
        RETAIL("RETAIL");

        private String value;

        CatalogTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
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
    public static final String JSON_PROPERTY_CATALOG_TYPE = "catalog_type";
    private CatalogTypeEnum catalogType;

    public CatalogsProductGroup(String id, CatalogsProductGroupFilters filters, String feedId) {
        this.id = id;
        this.filters = filters;
        this.feedId = feedId;
    }

    public CatalogsProductGroup id(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID of the catalog product group.
     * @return id
     **/
    @NotNull
    @Pattern(regexp="^\\d+$")
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(String id) {
        this.id = id;
    }

    public CatalogsProductGroup name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of catalog product group
     * @return name
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public CatalogsProductGroup description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDescription(String description) {
        this.description = description;
    }

    public CatalogsProductGroup filters(CatalogsProductGroupFilters filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Get filters
     * @return filters
     **/
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_FILTERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogsProductGroupFilters getFilters() {
        return filters;
    }

    @JsonProperty(JSON_PROPERTY_FILTERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFilters(CatalogsProductGroupFilters filters) {
        this.filters = filters;
    }

    public CatalogsProductGroup isFeatured(Boolean isFeatured) {
        this.isFeatured = isFeatured;
        return this;
    }

    /**
     * boolean indicator of whether the product group is being featured or not
     * @return isFeatured
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_IS_FEATURED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIsFeatured() {
        return isFeatured;
    }

    @JsonProperty(JSON_PROPERTY_IS_FEATURED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIsFeatured(Boolean isFeatured) {
        this.isFeatured = isFeatured;
    }

    public CatalogsProductGroup type(CatalogsProductGroupType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsProductGroupType getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(CatalogsProductGroupType type) {
        this.type = type;
    }

    public CatalogsProductGroup status(CatalogsProductGroupStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsProductGroupStatus getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(CatalogsProductGroupStatus status) {
        this.status = status;
    }

    public CatalogsProductGroup createdAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Unix timestamp in seconds of when catalog product group was created.
     * @return createdAt
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public CatalogsProductGroup updatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Unix timestamp in seconds of last time catalog product group was updated.
     * @return updatedAt
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CatalogsProductGroup feedId(String feedId) {
        this.feedId = feedId;
        return this;
    }

    /**
     * id of the catalogs feed belonging to this catalog product group
     * @return feedId
     **/
    @NotNull
    @Pattern(regexp="^\\d+$")
    @JsonProperty(JSON_PROPERTY_FEED_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getFeedId() {
        return feedId;
    }

    @JsonProperty(JSON_PROPERTY_FEED_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }

    public CatalogsProductGroup catalogType(CatalogTypeEnum catalogType) {
        this.catalogType = catalogType;
        return this;
    }

    /**
     * Get catalogType
     * @return catalogType
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CATALOG_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogTypeEnum getCatalogType() {
        return catalogType;
    }

    @JsonProperty(JSON_PROPERTY_CATALOG_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCatalogType(CatalogTypeEnum catalogType) {
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
        CatalogsProductGroup catalogsProductGroup = (CatalogsProductGroup) o;
        return Objects.equals(this.id, catalogsProductGroup.id) &&
            Objects.equals(this.name, catalogsProductGroup.name) &&
            Objects.equals(this.description, catalogsProductGroup.description) &&
            Objects.equals(this.filters, catalogsProductGroup.filters) &&
            Objects.equals(this.isFeatured, catalogsProductGroup.isFeatured) &&
            Objects.equals(this.type, catalogsProductGroup.type) &&
            Objects.equals(this.status, catalogsProductGroup.status) &&
            Objects.equals(this.createdAt, catalogsProductGroup.createdAt) &&
            Objects.equals(this.updatedAt, catalogsProductGroup.updatedAt) &&
            Objects.equals(this.feedId, catalogsProductGroup.feedId) &&
            Objects.equals(this.catalogType, catalogsProductGroup.catalogType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, filters, isFeatured, type, status, createdAt, updatedAt, feedId, catalogType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsProductGroup {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
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

