package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.PinMediaSourceImagesBase64Item;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Multiple Base64-based images media source
 */
public class PinMediaSourceImagesBase64   {

    private Integer index;
    private List<@Valid PinMediaSourceImagesBase64Item> items = new ArrayList<>();

    /**
    * The source type of the media.
    */
    public enum SourceTypeEnum {
        MULTIPLE_IMAGE_BASE64("multiple_image_base64");

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
        public static SourceTypeEnum fromValue(String text) {
            for (SourceTypeEnum b : SourceTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private SourceTypeEnum sourceType;

    /**
     * Default constructor.
     */
    public PinMediaSourceImagesBase64() {
    // JSON-B / Jackson
    }

    /**
     * Create PinMediaSourceImagesBase64.
     *
     * @param index index
     * @param items Array with image objects.
     * @param sourceType The source type of the media.
     */
    public PinMediaSourceImagesBase64(
        Integer index, 
        List<@Valid PinMediaSourceImagesBase64Item> items, 
        SourceTypeEnum sourceType
    ) {
        this.index = index;
        this.items = items;
        this.sourceType = sourceType;
    }



    /**
     * Get index
     * minimum: 0
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * Array with image objects.
     * @return items
     */
    public List<@Valid PinMediaSourceImagesBase64Item> getItems() {
        return items;
    }

    public void setItems(List<@Valid PinMediaSourceImagesBase64Item> items) {
        this.items = items;
    }

    /**
     * The source type of the media.
     * @return sourceType
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PinMediaSourceImagesBase64 {\n");
        
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
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

