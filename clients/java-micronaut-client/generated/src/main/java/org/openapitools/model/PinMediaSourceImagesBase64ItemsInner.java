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
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * PinMediaSourceImagesBase64ItemsInner
 */
@JsonPropertyOrder({
  PinMediaSourceImagesBase64ItemsInner.JSON_PROPERTY_TITLE,
  PinMediaSourceImagesBase64ItemsInner.JSON_PROPERTY_DESCRIPTION,
  PinMediaSourceImagesBase64ItemsInner.JSON_PROPERTY_LINK,
  PinMediaSourceImagesBase64ItemsInner.JSON_PROPERTY_CONTENT_TYPE,
  PinMediaSourceImagesBase64ItemsInner.JSON_PROPERTY_DATA
})
@JsonTypeName("PinMediaSourceImagesBase64_items_inner")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class PinMediaSourceImagesBase64ItemsInner {
    public static final String JSON_PROPERTY_TITLE = "title";
    private String title;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_LINK = "link";
    private String link;

    /**
     * Gets or Sets contentType
     */
    public enum ContentTypeEnum {
        JPEG("image/jpeg"),
        PNG("image/png");

        private String value;

        ContentTypeEnum(String value) {
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
        public static ContentTypeEnum fromValue(String value) {
            for (ContentTypeEnum b : ContentTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_CONTENT_TYPE = "content_type";
    private ContentTypeEnum contentType;

    public static final String JSON_PROPERTY_DATA = "data";
    private String data;

    public PinMediaSourceImagesBase64ItemsInner(ContentTypeEnum contentType, String data) {
        this.contentType = contentType;
        this.data = data;
    }

    public PinMediaSourceImagesBase64ItemsInner title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_TITLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTitle() {
        return title;
    }

    @JsonProperty(JSON_PROPERTY_TITLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTitle(String title) {
        this.title = title;
    }

    public PinMediaSourceImagesBase64ItemsInner description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
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

    public PinMediaSourceImagesBase64ItemsInner link(String link) {
        this.link = link;
        return this;
    }

    /**
     * Destination link for the image.
     * @return link
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_LINK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLink() {
        return link;
    }

    @JsonProperty(JSON_PROPERTY_LINK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLink(String link) {
        this.link = link;
    }

    public PinMediaSourceImagesBase64ItemsInner contentType(ContentTypeEnum contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get contentType
     * @return contentType
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ContentTypeEnum getContentType() {
        return contentType;
    }

    @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setContentType(ContentTypeEnum contentType) {
        this.contentType = contentType;
    }

    public PinMediaSourceImagesBase64ItemsInner data(String data) {
        this.data = data;
        return this;
    }

    /**
     * Image to upload as base64 string.
     * @return data
     */
    @NotNull
    @Pattern(regexp="[a-zA-Z0-9+/=]+")
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PinMediaSourceImagesBase64ItemsInner pinMediaSourceImagesBase64ItemsInner = (PinMediaSourceImagesBase64ItemsInner) o;
        return Objects.equals(this.title, pinMediaSourceImagesBase64ItemsInner.title) &&
            Objects.equals(this.description, pinMediaSourceImagesBase64ItemsInner.description) &&
            Objects.equals(this.link, pinMediaSourceImagesBase64ItemsInner.link) &&
            Objects.equals(this.contentType, pinMediaSourceImagesBase64ItemsInner.contentType) &&
            Objects.equals(this.data, pinMediaSourceImagesBase64ItemsInner.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, link, contentType, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PinMediaSourceImagesBase64ItemsInner {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

