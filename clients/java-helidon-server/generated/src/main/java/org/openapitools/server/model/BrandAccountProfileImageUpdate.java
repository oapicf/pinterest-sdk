package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Base64-encoded image media source
 */
public class BrandAccountProfileImageUpdate   {


    /**
    * Gets or Sets contentType
    */
    public enum ContentTypeEnum {
        IMAGE_JPEG("image/jpeg"),
        IMAGE_PNG("image/png");

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
        public static ContentTypeEnum fromValue(String text) {
            for (ContentTypeEnum b : ContentTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ContentTypeEnum contentType;
    private String data;

    /**
     * Default constructor.
     */
    public BrandAccountProfileImageUpdate() {
    // JSON-B / Jackson
    }

    /**
     * Create BrandAccountProfileImageUpdate.
     *
     * @param contentType contentType
     * @param data data
     */
    public BrandAccountProfileImageUpdate(
        ContentTypeEnum contentType, 
        String data
    ) {
        this.contentType = contentType;
        this.data = data;
    }



    /**
     * Get contentType
     * @return contentType
     */
    public ContentTypeEnum getContentType() {
        return contentType;
    }

    public void setContentType(ContentTypeEnum contentType) {
        this.contentType = contentType;
    }

    /**
     * Get data
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrandAccountProfileImageUpdate {\n");
        
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

