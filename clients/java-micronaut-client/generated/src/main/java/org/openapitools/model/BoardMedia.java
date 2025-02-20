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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Board media.
 */
@JsonPropertyOrder({
  BoardMedia.JSON_PROPERTY_IMAGE_COVER_URL,
  BoardMedia.JSON_PROPERTY_PIN_THUMBNAIL_URLS
})
@JsonTypeName("Board_media")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class BoardMedia {
    public static final String JSON_PROPERTY_IMAGE_COVER_URL = "image_cover_url";
    private String imageCoverUrl;

    public static final String JSON_PROPERTY_PIN_THUMBNAIL_URLS = "pin_thumbnail_urls";
    private List<String> pinThumbnailUrls = null;

    public BoardMedia() {
    }

    public BoardMedia imageCoverUrl(String imageCoverUrl) {
        this.imageCoverUrl = imageCoverUrl;
        return this;
    }

    /**
     * Board cover image.
     * @return imageCoverUrl
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_IMAGE_COVER_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getImageCoverUrl() {
        return imageCoverUrl;
    }

    @JsonProperty(JSON_PROPERTY_IMAGE_COVER_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setImageCoverUrl(String imageCoverUrl) {
        this.imageCoverUrl = imageCoverUrl;
    }

    public BoardMedia pinThumbnailUrls(List<String> pinThumbnailUrls) {
        this.pinThumbnailUrls = pinThumbnailUrls;
        return this;
    }

    public BoardMedia addPinThumbnailUrlsItem(String pinThumbnailUrlsItem) {
        if (this.pinThumbnailUrls == null) {
            this.pinThumbnailUrls = new ArrayList<>();
        }
        this.pinThumbnailUrls.add(pinThumbnailUrlsItem);
        return this;
    }

    /**
     * Board pin thumbnail urls.
     * @return pinThumbnailUrls
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_PIN_THUMBNAIL_URLS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getPinThumbnailUrls() {
        return pinThumbnailUrls;
    }

    @JsonProperty(JSON_PROPERTY_PIN_THUMBNAIL_URLS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPinThumbnailUrls(List<String> pinThumbnailUrls) {
        this.pinThumbnailUrls = pinThumbnailUrls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BoardMedia boardMedia = (BoardMedia) o;
        return Objects.equals(this.imageCoverUrl, boardMedia.imageCoverUrl) &&
            Objects.equals(this.pinThumbnailUrls, boardMedia.pinThumbnailUrls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageCoverUrl, pinThumbnailUrls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BoardMedia {\n");
        sb.append("    imageCoverUrl: ").append(toIndentedString(imageCoverUrl)).append("\n");
        sb.append("    pinThumbnailUrls: ").append(toIndentedString(pinThumbnailUrls)).append("\n");
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

