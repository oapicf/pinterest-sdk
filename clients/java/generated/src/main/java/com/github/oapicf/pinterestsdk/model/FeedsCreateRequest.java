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
import com.github.oapicf.pinterestsdk.model.CatalogsFeedCredentials;
import com.github.oapicf.pinterestsdk.model.CatalogsFeedProcessingSchedule;
import com.github.oapicf.pinterestsdk.model.CatalogsFeedsCreateRequest;
import com.github.oapicf.pinterestsdk.model.CatalogsFeedsCreateRequestDefaultLocale;
import com.github.oapicf.pinterestsdk.model.CatalogsFormat;
import com.github.oapicf.pinterestsdk.model.CatalogsStatus;
import com.github.oapicf.pinterestsdk.model.CatalogsType;
import com.github.oapicf.pinterestsdk.model.CatalogsVerticalFeedsCreateRequest;
import com.github.oapicf.pinterestsdk.model.Country;
import com.github.oapicf.pinterestsdk.model.NullableCurrency;
import com.github.oapicf.pinterestsdk.model.ProductAvailabilityType;
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
public class FeedsCreateRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(FeedsCreateRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FeedsCreateRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FeedsCreateRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CatalogsVerticalFeedsCreateRequest> adapterCatalogsVerticalFeedsCreateRequest = gson.getDelegateAdapter(this, TypeToken.get(CatalogsVerticalFeedsCreateRequest.class));
            final TypeAdapter<CatalogsFeedsCreateRequest> adapterCatalogsFeedsCreateRequest = gson.getDelegateAdapter(this, TypeToken.get(CatalogsFeedsCreateRequest.class));

            return (TypeAdapter<T>) new TypeAdapter<FeedsCreateRequest>() {
                @Override
                public void write(JsonWriter out, FeedsCreateRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CatalogsVerticalFeedsCreateRequest`
                    if (value.getActualInstance() instanceof CatalogsVerticalFeedsCreateRequest) {
                        JsonElement element = adapterCatalogsVerticalFeedsCreateRequest.toJsonTree((CatalogsVerticalFeedsCreateRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CatalogsFeedsCreateRequest`
                    if (value.getActualInstance() instanceof CatalogsFeedsCreateRequest) {
                        JsonElement element = adapterCatalogsFeedsCreateRequest.toJsonTree((CatalogsFeedsCreateRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CatalogsFeedsCreateRequest, CatalogsVerticalFeedsCreateRequest");
                }

                @Override
                public FeedsCreateRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CatalogsVerticalFeedsCreateRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CatalogsVerticalFeedsCreateRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterCatalogsVerticalFeedsCreateRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CatalogsVerticalFeedsCreateRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CatalogsVerticalFeedsCreateRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CatalogsVerticalFeedsCreateRequest'", e);
                    }
                    // deserialize CatalogsFeedsCreateRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CatalogsFeedsCreateRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterCatalogsFeedsCreateRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CatalogsFeedsCreateRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CatalogsFeedsCreateRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CatalogsFeedsCreateRequest'", e);
                    }

                    if (match == 1) {
                        FeedsCreateRequest ret = new FeedsCreateRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for FeedsCreateRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public FeedsCreateRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public FeedsCreateRequest(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CatalogsVerticalFeedsCreateRequest", CatalogsVerticalFeedsCreateRequest.class);
        schemas.put("CatalogsFeedsCreateRequest", CatalogsFeedsCreateRequest.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return FeedsCreateRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CatalogsFeedsCreateRequest, CatalogsVerticalFeedsCreateRequest
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CatalogsVerticalFeedsCreateRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CatalogsFeedsCreateRequest) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CatalogsFeedsCreateRequest, CatalogsVerticalFeedsCreateRequest");
    }

    /**
     * Get the actual instance, which can be the following:
     * CatalogsFeedsCreateRequest, CatalogsVerticalFeedsCreateRequest
     *
     * @return The actual instance (CatalogsFeedsCreateRequest, CatalogsVerticalFeedsCreateRequest)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CatalogsVerticalFeedsCreateRequest`. If the actual instance is not `CatalogsVerticalFeedsCreateRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CatalogsVerticalFeedsCreateRequest`
     * @throws ClassCastException if the instance is not `CatalogsVerticalFeedsCreateRequest`
     */
    public CatalogsVerticalFeedsCreateRequest getCatalogsVerticalFeedsCreateRequest() throws ClassCastException {
        return (CatalogsVerticalFeedsCreateRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CatalogsFeedsCreateRequest`. If the actual instance is not `CatalogsFeedsCreateRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CatalogsFeedsCreateRequest`
     * @throws ClassCastException if the instance is not `CatalogsFeedsCreateRequest`
     */
    public CatalogsFeedsCreateRequest getCatalogsFeedsCreateRequest() throws ClassCastException {
        return (CatalogsFeedsCreateRequest)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to FeedsCreateRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CatalogsVerticalFeedsCreateRequest
        try {
            CatalogsVerticalFeedsCreateRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CatalogsVerticalFeedsCreateRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CatalogsFeedsCreateRequest
        try {
            CatalogsFeedsCreateRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CatalogsFeedsCreateRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for FeedsCreateRequest with oneOf schemas: CatalogsFeedsCreateRequest, CatalogsVerticalFeedsCreateRequest. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of FeedsCreateRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FeedsCreateRequest
     * @throws IOException if the JSON string is invalid with respect to FeedsCreateRequest
     */
    public static FeedsCreateRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FeedsCreateRequest.class);
    }

    /**
     * Convert an instance of FeedsCreateRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

