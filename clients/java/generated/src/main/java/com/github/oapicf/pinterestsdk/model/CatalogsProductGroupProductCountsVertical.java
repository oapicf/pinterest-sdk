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
import com.github.oapicf.pinterestsdk.model.CatalogsCreativeAssetsProductGroupProductCounts;
import com.github.oapicf.pinterestsdk.model.CatalogsHotelProductGroupProductCounts;
import com.github.oapicf.pinterestsdk.model.CatalogsRetailProductGroupProductCounts;
import com.github.oapicf.pinterestsdk.model.CatalogsType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;



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
public class CatalogsProductGroupProductCountsVertical extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CatalogsProductGroupProductCountsVertical.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CatalogsProductGroupProductCountsVertical.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CatalogsProductGroupProductCountsVertical' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CatalogsRetailProductGroupProductCounts> adapterCatalogsRetailProductGroupProductCounts = gson.getDelegateAdapter(this, TypeToken.get(CatalogsRetailProductGroupProductCounts.class));
            final TypeAdapter<CatalogsHotelProductGroupProductCounts> adapterCatalogsHotelProductGroupProductCounts = gson.getDelegateAdapter(this, TypeToken.get(CatalogsHotelProductGroupProductCounts.class));
            final TypeAdapter<CatalogsCreativeAssetsProductGroupProductCounts> adapterCatalogsCreativeAssetsProductGroupProductCounts = gson.getDelegateAdapter(this, TypeToken.get(CatalogsCreativeAssetsProductGroupProductCounts.class));

            return (TypeAdapter<T>) new TypeAdapter<CatalogsProductGroupProductCountsVertical>() {
                @Override
                public void write(JsonWriter out, CatalogsProductGroupProductCountsVertical value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CatalogsRetailProductGroupProductCounts`
                    if (value.getActualInstance() instanceof CatalogsRetailProductGroupProductCounts) {
                        JsonElement element = adapterCatalogsRetailProductGroupProductCounts.toJsonTree((CatalogsRetailProductGroupProductCounts)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CatalogsHotelProductGroupProductCounts`
                    if (value.getActualInstance() instanceof CatalogsHotelProductGroupProductCounts) {
                        JsonElement element = adapterCatalogsHotelProductGroupProductCounts.toJsonTree((CatalogsHotelProductGroupProductCounts)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CatalogsCreativeAssetsProductGroupProductCounts`
                    if (value.getActualInstance() instanceof CatalogsCreativeAssetsProductGroupProductCounts) {
                        JsonElement element = adapterCatalogsCreativeAssetsProductGroupProductCounts.toJsonTree((CatalogsCreativeAssetsProductGroupProductCounts)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CatalogsCreativeAssetsProductGroupProductCounts, CatalogsHotelProductGroupProductCounts, CatalogsRetailProductGroupProductCounts");
                }

                @Override
                public CatalogsProductGroupProductCountsVertical read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CatalogsRetailProductGroupProductCounts
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CatalogsRetailProductGroupProductCounts.validateJsonElement(jsonElement);
                        actualAdapter = adapterCatalogsRetailProductGroupProductCounts;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CatalogsRetailProductGroupProductCounts'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CatalogsRetailProductGroupProductCounts failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CatalogsRetailProductGroupProductCounts'", e);
                    }
                    // deserialize CatalogsHotelProductGroupProductCounts
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CatalogsHotelProductGroupProductCounts.validateJsonElement(jsonElement);
                        actualAdapter = adapterCatalogsHotelProductGroupProductCounts;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CatalogsHotelProductGroupProductCounts'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CatalogsHotelProductGroupProductCounts failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CatalogsHotelProductGroupProductCounts'", e);
                    }
                    // deserialize CatalogsCreativeAssetsProductGroupProductCounts
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CatalogsCreativeAssetsProductGroupProductCounts.validateJsonElement(jsonElement);
                        actualAdapter = adapterCatalogsCreativeAssetsProductGroupProductCounts;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CatalogsCreativeAssetsProductGroupProductCounts'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CatalogsCreativeAssetsProductGroupProductCounts failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CatalogsCreativeAssetsProductGroupProductCounts'", e);
                    }

                    if (match == 1) {
                        CatalogsProductGroupProductCountsVertical ret = new CatalogsProductGroupProductCountsVertical();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CatalogsProductGroupProductCountsVertical: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CatalogsProductGroupProductCountsVertical() {
        super("oneOf", Boolean.FALSE);
    }

    public CatalogsProductGroupProductCountsVertical(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CatalogsRetailProductGroupProductCounts", CatalogsRetailProductGroupProductCounts.class);
        schemas.put("CatalogsHotelProductGroupProductCounts", CatalogsHotelProductGroupProductCounts.class);
        schemas.put("CatalogsCreativeAssetsProductGroupProductCounts", CatalogsCreativeAssetsProductGroupProductCounts.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CatalogsProductGroupProductCountsVertical.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CatalogsCreativeAssetsProductGroupProductCounts, CatalogsHotelProductGroupProductCounts, CatalogsRetailProductGroupProductCounts
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CatalogsRetailProductGroupProductCounts) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CatalogsHotelProductGroupProductCounts) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CatalogsCreativeAssetsProductGroupProductCounts) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CatalogsCreativeAssetsProductGroupProductCounts, CatalogsHotelProductGroupProductCounts, CatalogsRetailProductGroupProductCounts");
    }

    /**
     * Get the actual instance, which can be the following:
     * CatalogsCreativeAssetsProductGroupProductCounts, CatalogsHotelProductGroupProductCounts, CatalogsRetailProductGroupProductCounts
     *
     * @return The actual instance (CatalogsCreativeAssetsProductGroupProductCounts, CatalogsHotelProductGroupProductCounts, CatalogsRetailProductGroupProductCounts)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CatalogsRetailProductGroupProductCounts`. If the actual instance is not `CatalogsRetailProductGroupProductCounts`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CatalogsRetailProductGroupProductCounts`
     * @throws ClassCastException if the instance is not `CatalogsRetailProductGroupProductCounts`
     */
    public CatalogsRetailProductGroupProductCounts getCatalogsRetailProductGroupProductCounts() throws ClassCastException {
        return (CatalogsRetailProductGroupProductCounts)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CatalogsHotelProductGroupProductCounts`. If the actual instance is not `CatalogsHotelProductGroupProductCounts`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CatalogsHotelProductGroupProductCounts`
     * @throws ClassCastException if the instance is not `CatalogsHotelProductGroupProductCounts`
     */
    public CatalogsHotelProductGroupProductCounts getCatalogsHotelProductGroupProductCounts() throws ClassCastException {
        return (CatalogsHotelProductGroupProductCounts)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CatalogsCreativeAssetsProductGroupProductCounts`. If the actual instance is not `CatalogsCreativeAssetsProductGroupProductCounts`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CatalogsCreativeAssetsProductGroupProductCounts`
     * @throws ClassCastException if the instance is not `CatalogsCreativeAssetsProductGroupProductCounts`
     */
    public CatalogsCreativeAssetsProductGroupProductCounts getCatalogsCreativeAssetsProductGroupProductCounts() throws ClassCastException {
        return (CatalogsCreativeAssetsProductGroupProductCounts)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CatalogsProductGroupProductCountsVertical
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CatalogsRetailProductGroupProductCounts
        try {
            CatalogsRetailProductGroupProductCounts.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CatalogsRetailProductGroupProductCounts failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CatalogsHotelProductGroupProductCounts
        try {
            CatalogsHotelProductGroupProductCounts.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CatalogsHotelProductGroupProductCounts failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CatalogsCreativeAssetsProductGroupProductCounts
        try {
            CatalogsCreativeAssetsProductGroupProductCounts.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CatalogsCreativeAssetsProductGroupProductCounts failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for CatalogsProductGroupProductCountsVertical with oneOf schemas: CatalogsCreativeAssetsProductGroupProductCounts, CatalogsHotelProductGroupProductCounts, CatalogsRetailProductGroupProductCounts. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CatalogsProductGroupProductCountsVertical given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CatalogsProductGroupProductCountsVertical
     * @throws IOException if the JSON string is invalid with respect to CatalogsProductGroupProductCountsVertical
     */
    public static CatalogsProductGroupProductCountsVertical fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CatalogsProductGroupProductCountsVertical.class);
    }

    /**
     * Convert an instance of CatalogsProductGroupProductCountsVertical to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

