package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum PreferredMediaType {

    @JsonProperty("VIDEO") VIDEO(String.valueOf("VIDEO")), @JsonProperty("IMAGE") IMAGE(String.valueOf("IMAGE"));


    private String value;

    PreferredMediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PreferredMediaType fromValue(String value) {
        for (PreferredMediaType b : PreferredMediaType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



