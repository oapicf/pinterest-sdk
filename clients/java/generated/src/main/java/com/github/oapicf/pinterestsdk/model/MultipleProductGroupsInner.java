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


package com.github.oapicf.pinterestsdk.model;

import java.util.Objects;
import com.github.oapicf.pinterestsdk.model.CatalogsLocale;
import com.github.oapicf.pinterestsdk.model.CatalogsProductGroupCreateRequest;
import com.github.oapicf.pinterestsdk.model.CatalogsProductGroupFiltersRequest;
import com.github.oapicf.pinterestsdk.model.CatalogsVerticalProductGroupCreateRequest;
import com.github.oapicf.pinterestsdk.model.Country;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.github.oapicf.pinterestsdk.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T02:01:32.024245558Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MultipleProductGroupsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(MultipleProductGroupsInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!MultipleProductGroupsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'MultipleProductGroupsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CatalogsProductGroupCreateRequest> adapterCatalogsProductGroupCreateRequest = gson.getDelegateAdapter(this, TypeToken.get(CatalogsProductGroupCreateRequest.class));
            final TypeAdapter<CatalogsVerticalProductGroupCreateRequest> adapterCatalogsVerticalProductGroupCreateRequest = gson.getDelegateAdapter(this, TypeToken.get(CatalogsVerticalProductGroupCreateRequest.class));

            return (TypeAdapter<T>) new TypeAdapter<MultipleProductGroupsInner>() {
                @Override
                public void write(JsonWriter out, MultipleProductGroupsInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CatalogsProductGroupCreateRequest`
                    if (value.getActualInstance() instanceof CatalogsProductGroupCreateRequest) {
                        JsonElement element = adapterCatalogsProductGroupCreateRequest.toJsonTree((CatalogsProductGroupCreateRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CatalogsVerticalProductGroupCreateRequest`
                    if (value.getActualInstance() instanceof CatalogsVerticalProductGroupCreateRequest) {
                        JsonElement element = adapterCatalogsVerticalProductGroupCreateRequest.toJsonTree((CatalogsVerticalProductGroupCreateRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CatalogsProductGroupCreateRequest, CatalogsVerticalProductGroupCreateRequest");
                }

                @Override
                public MultipleProductGroupsInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CatalogsProductGroupCreateRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CatalogsProductGroupCreateRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterCatalogsProductGroupCreateRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CatalogsProductGroupCreateRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CatalogsProductGroupCreateRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CatalogsProductGroupCreateRequest'", e);
                    }
                    // deserialize CatalogsVerticalProductGroupCreateRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CatalogsVerticalProductGroupCreateRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterCatalogsVerticalProductGroupCreateRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CatalogsVerticalProductGroupCreateRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CatalogsVerticalProductGroupCreateRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CatalogsVerticalProductGroupCreateRequest'", e);
                    }

                    if (match == 1) {
                        MultipleProductGroupsInner ret = new MultipleProductGroupsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for MultipleProductGroupsInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public MultipleProductGroupsInner() {
        super("oneOf", Boolean.FALSE);
    }

    public MultipleProductGroupsInner(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CatalogsProductGroupCreateRequest", CatalogsProductGroupCreateRequest.class);
        schemas.put("CatalogsVerticalProductGroupCreateRequest", CatalogsVerticalProductGroupCreateRequest.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return MultipleProductGroupsInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CatalogsProductGroupCreateRequest, CatalogsVerticalProductGroupCreateRequest
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CatalogsProductGroupCreateRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CatalogsVerticalProductGroupCreateRequest) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CatalogsProductGroupCreateRequest, CatalogsVerticalProductGroupCreateRequest");
    }

    /**
     * Get the actual instance, which can be the following:
     * CatalogsProductGroupCreateRequest, CatalogsVerticalProductGroupCreateRequest
     *
     * @return The actual instance (CatalogsProductGroupCreateRequest, CatalogsVerticalProductGroupCreateRequest)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CatalogsProductGroupCreateRequest`. If the actual instance is not `CatalogsProductGroupCreateRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CatalogsProductGroupCreateRequest`
     * @throws ClassCastException if the instance is not `CatalogsProductGroupCreateRequest`
     */
    public CatalogsProductGroupCreateRequest getCatalogsProductGroupCreateRequest() throws ClassCastException {
        return (CatalogsProductGroupCreateRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CatalogsVerticalProductGroupCreateRequest`. If the actual instance is not `CatalogsVerticalProductGroupCreateRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CatalogsVerticalProductGroupCreateRequest`
     * @throws ClassCastException if the instance is not `CatalogsVerticalProductGroupCreateRequest`
     */
    public CatalogsVerticalProductGroupCreateRequest getCatalogsVerticalProductGroupCreateRequest() throws ClassCastException {
        return (CatalogsVerticalProductGroupCreateRequest)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to MultipleProductGroupsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CatalogsProductGroupCreateRequest
        try {
            CatalogsProductGroupCreateRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CatalogsProductGroupCreateRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CatalogsVerticalProductGroupCreateRequest
        try {
            CatalogsVerticalProductGroupCreateRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CatalogsVerticalProductGroupCreateRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for MultipleProductGroupsInner with oneOf schemas: CatalogsProductGroupCreateRequest, CatalogsVerticalProductGroupCreateRequest. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of MultipleProductGroupsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of MultipleProductGroupsInner
     * @throws IOException if the JSON string is invalid with respect to MultipleProductGroupsInner
     */
    public static MultipleProductGroupsInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, MultipleProductGroupsInner.class);
    }

    /**
     * Convert an instance of MultipleProductGroupsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

