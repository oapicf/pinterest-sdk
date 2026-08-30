package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ContentType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Image Base64-based media source.
 */
public class PinMediaSourceImageBase64   {

    private ContentType contentType;
    private String data;
    private Boolean isStandard = true;

    /**
    * The source type of the media.
    */
    public enum SourceTypeEnum {
        IMAGE_BASE64("image_base64");

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
    public PinMediaSourceImageBase64() {
    // JSON-B / Jackson
    }

    /**
     * Create PinMediaSourceImageBase64.
     *
     * @param contentType contentType
     * @param data data
     * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
     * @param sourceType The source type of the media.
     */
    public PinMediaSourceImageBase64(
        ContentType contentType, 
        String data, 
        Boolean isStandard, 
        SourceTypeEnum sourceType
    ) {
        this.contentType = contentType;
        this.data = data;
        this.isStandard = isStandard;
        this.sourceType = sourceType;
    }



    /**
     * Get contentType
     * @return contentType
     */
    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
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
     * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
     * @return isStandard
     */
    public Boolean getIsStandard() {
        return isStandard;
    }

    public void setIsStandard(Boolean isStandard) {
        this.isStandard = isStandard;
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
        sb.append("class PinMediaSourceImageBase64 {\n");
        
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
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

