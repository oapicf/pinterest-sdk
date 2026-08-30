package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ImageSize;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Pin with image.
 */
public class PinMediaWithImage   {

    private ImageSize images;

    /**
    * Gets or Sets mediaType
    */
    public enum MediaTypeEnum {
        IMAGE("image");

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
    public PinMediaWithImage() {
    // JSON-B / Jackson
    }

    /**
     * Create PinMediaWithImage.
     *
     * @param images images
     * @param mediaType mediaType
     */
    public PinMediaWithImage(
        ImageSize images, 
        MediaTypeEnum mediaType
    ) {
        this.images = images;
        this.mediaType = mediaType;
    }



    /**
     * Get images
     * @return images
     */
    public ImageSize getImages() {
        return images;
    }

    public void setImages(ImageSize images) {
        this.images = images;
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
        sb.append("class PinMediaWithImage {\n");
        
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

