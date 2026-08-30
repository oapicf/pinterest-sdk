package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ImageMetadata;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Pin with multiple images.
 */
public class PinMediaWithImages   {

    private List<@Valid ImageMetadata> items = new ArrayList<>();

    /**
    * Gets or Sets mediaType
    */
    public enum MediaTypeEnum {
        MULTIPLE_IMAGES("multiple_images");

        private String value;

        MediaTypeEnum(String value) {
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
        public static MediaTypeEnum fromValue(String text) {
            for (MediaTypeEnum b : MediaTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private MediaTypeEnum mediaType;

    /**
     * Default constructor.
     */
    public PinMediaWithImages() {
    // JSON-B / Jackson
    }

    /**
     * Create PinMediaWithImages.
     *
     * @param items items
     * @param mediaType mediaType
     */
    public PinMediaWithImages(
        List<@Valid ImageMetadata> items, 
        MediaTypeEnum mediaType
    ) {
        this.items = items;
        this.mediaType = mediaType;
    }



    /**
     * Get items
     * @return items
     */
    public List<@Valid ImageMetadata> getItems() {
        return items;
    }

    public void setItems(List<@Valid ImageMetadata> items) {
        this.items = items;
    }

    /**
     * Get mediaType
     * @return mediaType
     */
    public MediaTypeEnum getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaTypeEnum mediaType) {
        this.mediaType = mediaType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PinMediaWithImages {\n");
        
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

