package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.PinMediaSourceImagesURLItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Multiple URL-based images media source
 */
public class PinMediaSourceImagesURL   {

    private Integer index;
    private List<@Valid PinMediaSourceImagesURLItem> items = new ArrayList<>();

    /**
    * The source type of the media.
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
    public PinMediaSourceImagesURL() {
    // JSON-B / Jackson
    }

    /**
     * Create PinMediaSourceImagesURL.
     *
     * @param index index
     * @param items Array with image objects.
     * @param sourceType The source type of the media.
     */
    public PinMediaSourceImagesURL(
        Integer index, 
        List<@Valid PinMediaSourceImagesURLItem> items, 
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
    public List<@Valid PinMediaSourceImagesURLItem> getItems() {
        return items;
    }

    public void setItems(List<@Valid PinMediaSourceImagesURLItem> items) {
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
        sb.append("class PinMediaSourceImagesURL {\n");
        
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

