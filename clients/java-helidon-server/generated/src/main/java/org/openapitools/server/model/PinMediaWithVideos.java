package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.VideoMetadataWithItemType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Pin with multiple videos.
 */
public class PinMediaWithVideos   {

    private List<@Valid VideoMetadataWithItemType> items = new ArrayList<>();

    /**
    * Gets or Sets mediaType
    */
    public enum MediaTypeEnum {
        MULTIPLE_VIDEOS("multiple_videos");

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
    public PinMediaWithVideos() {
    // JSON-B / Jackson
    }

    /**
     * Create PinMediaWithVideos.
     *
     * @param items items
     * @param mediaType mediaType
     */
    public PinMediaWithVideos(
        List<@Valid VideoMetadataWithItemType> items, 
        MediaTypeEnum mediaType
    ) {
        this.items = items;
        this.mediaType = mediaType;
    }



    /**
     * Get items
     * @return items
     */
    public List<@Valid VideoMetadataWithItemType> getItems() {
        return items;
    }

    public void setItems(List<@Valid VideoMetadataWithItemType> items) {
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
        sb.append("class PinMediaWithVideos {\n");
        
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

