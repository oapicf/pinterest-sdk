/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Where a user is taken after clicking on an ad in grid.
 */
@Introspected
public enum GridClickType {
    CLOSEUP("CLOSEUP"),
    DIRECT_TO_DESTINATION("DIRECT_TO_DESTINATION");

    private String value;

    GridClickType(String value) {
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
    public static GridClickType fromValue(String value) {
        for (GridClickType b : GridClickType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}
