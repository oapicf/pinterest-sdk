/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PinMediaSourceImagesURLItemsInner;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Multiple images urls-based media source
 */
@JsonPropertyOrder({
  PinMediaSourceImagesURL.JSON_PROPERTY_SOURCE_TYPE,
  PinMediaSourceImagesURL.JSON_PROPERTY_ITEMS,
  PinMediaSourceImagesURL.JSON_PROPERTY_INDEX
})
@JsonTypeName("PinMediaSourceImagesURL")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class PinMediaSourceImagesURL {
    /**
     * Gets or Sets sourceType
     */
    public enum SourceTypeEnum {
        MULTIPLE_IMAGE_URLS("multiple_image_urls");

        private String value;

        SourceTypeEnum(String value) {
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
        public static SourceTypeEnum fromValue(String value) {
            for (SourceTypeEnum b : SourceTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_SOURCE_TYPE = "source_type";
    private SourceTypeEnum sourceType;

    public static final String JSON_PROPERTY_ITEMS = "items";
    private List<@Valid PinMediaSourceImagesURLItemsInner> items = new ArrayList<>();

    public static final String JSON_PROPERTY_INDEX = "index";
    private Integer index;

    public PinMediaSourceImagesURL(List<@Valid PinMediaSourceImagesURLItemsInner> items) {
        this.items = items;
    }

    public PinMediaSourceImagesURL sourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get sourceType
     * @return sourceType
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    public PinMediaSourceImagesURL items(List<@Valid PinMediaSourceImagesURLItemsInner> items) {
        this.items = items;
        return this;
    }

    public PinMediaSourceImagesURL addItemsItem(PinMediaSourceImagesURLItemsInner itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Array with image objects.
     * @return items
     */
    @NotNull
    @Size(min=2, max=5)
    @JsonProperty(JSON_PROPERTY_ITEMS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid PinMediaSourceImagesURLItemsInner> getItems() {
        return items;
    }

    @JsonProperty(JSON_PROPERTY_ITEMS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setItems(List<@Valid PinMediaSourceImagesURLItemsInner> items) {
        this.items = items;
    }

    public PinMediaSourceImagesURL index(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * Get index
     * minimum: 0
     * @return index
     */
    @Nullable
    @Min(0)
    @JsonProperty(JSON_PROPERTY_INDEX)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getIndex() {
        return index;
    }

    @JsonProperty(JSON_PROPERTY_INDEX)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PinMediaSourceImagesURL pinMediaSourceImagesURL = (PinMediaSourceImagesURL) o;
        return Objects.equals(this.sourceType, pinMediaSourceImagesURL.sourceType) &&
            Objects.equals(this.items, pinMediaSourceImagesURL.items) &&
            Objects.equals(this.index, pinMediaSourceImagesURL.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceType, items, index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PinMediaSourceImagesURL {\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

