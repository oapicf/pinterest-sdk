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
import com.github.oapicf.pinterestsdk.model.CatalogsCreativeAssetsProductGroup;
import com.github.oapicf.pinterestsdk.model.CatalogsCreativeAssetsProductGroupFilters;
import com.github.oapicf.pinterestsdk.model.CatalogsHotelProductGroup;
import com.github.oapicf.pinterestsdk.model.CatalogsProductGroupStatus;
import com.github.oapicf.pinterestsdk.model.CatalogsProductGroupType;
import com.github.oapicf.pinterestsdk.model.CatalogsRetailProductGroup;
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
public class CatalogsVerticalProductGroup extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CatalogsVerticalProductGroup.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CatalogsVerticalProductGroup.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CatalogsVerticalProductGroup' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CatalogsRetailProductGroup> adapterCatalogsRetailProductGroup = gson.getDelegateAdapter(this, TypeToken.get(CatalogsRetailProductGroup.class));
            final TypeAdapter<CatalogsHotelProductGroup> adapterCatalogsHotelProductGroup = gson.getDelegateAdapter(this, TypeToken.get(CatalogsHotelProductGroup.class));
            final TypeAdapter<CatalogsCreativeAssetsProductGroup> adapterCatalogsCreativeAssetsProductGroup = gson.getDelegateAdapter(this, TypeToken.get(CatalogsCreativeAssetsProductGroup.class));

            return (TypeAdapter<T>) new TypeAdapter<CatalogsVerticalProductGroup>() {
                @Override
                public void write(JsonWriter out, CatalogsVerticalProductGroup value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CatalogsRetailProductGroup`
                    if (value.getActualInstance() instanceof CatalogsRetailProductGroup) {
                        JsonElement element = adapterCatalogsRetailProductGroup.toJsonTree((CatalogsRetailProductGroup)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CatalogsHotelProductGroup`
                    if (value.getActualInstance() instanceof CatalogsHotelProductGroup) {
                        JsonElement element = adapterCatalogsHotelProductGroup.toJsonTree((CatalogsHotelProductGroup)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CatalogsCreativeAssetsProductGroup`
                    if (value.getActualInstance() instanceof CatalogsCreativeAssetsProductGroup) {
                        JsonElement element = adapterCatalogsCreativeAssetsProductGroup.toJsonTree((CatalogsCreativeAssetsProductGroup)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CatalogsCreativeAssetsProductGroup, CatalogsHotelProductGroup, CatalogsRetailProductGroup");
                }

                @Override
                public CatalogsVerticalProductGroup read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CatalogsRetailProductGroup
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CatalogsRetailProductGroup.validateJsonElement(jsonElement);
                        actualAdapter = adapterCatalogsRetailProductGroup;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CatalogsRetailProductGroup'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CatalogsRetailProductGroup failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CatalogsRetailProductGroup'", e);
                    }
                    // deserialize CatalogsHotelProductGroup
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CatalogsHotelProductGroup.validateJsonElement(jsonElement);
                        actualAdapter = adapterCatalogsHotelProductGroup;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CatalogsHotelProductGroup'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CatalogsHotelProductGroup failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CatalogsHotelProductGroup'", e);
                    }
                    // deserialize CatalogsCreativeAssetsProductGroup
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CatalogsCreativeAssetsProductGroup.validateJsonElement(jsonElement);
                        actualAdapter = adapterCatalogsCreativeAssetsProductGroup;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CatalogsCreativeAssetsProductGroup'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CatalogsCreativeAssetsProductGroup failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CatalogsCreativeAssetsProductGroup'", e);
                    }

                    if (match == 1) {
                        CatalogsVerticalProductGroup ret = new CatalogsVerticalProductGroup();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CatalogsVerticalProductGroup: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CatalogsVerticalProductGroup() {
        super("oneOf", Boolean.FALSE);
    }

    public CatalogsVerticalProductGroup(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CatalogsRetailProductGroup", CatalogsRetailProductGroup.class);
        schemas.put("CatalogsHotelProductGroup", CatalogsHotelProductGroup.class);
        schemas.put("CatalogsCreativeAssetsProductGroup", CatalogsCreativeAssetsProductGroup.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CatalogsVerticalProductGroup.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CatalogsCreativeAssetsProductGroup, CatalogsHotelProductGroup, CatalogsRetailProductGroup
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CatalogsRetailProductGroup) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CatalogsHotelProductGroup) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CatalogsCreativeAssetsProductGroup) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CatalogsCreativeAssetsProductGroup, CatalogsHotelProductGroup, CatalogsRetailProductGroup");
    }

    /**
     * Get the actual instance, which can be the following:
     * CatalogsCreativeAssetsProductGroup, CatalogsHotelProductGroup, CatalogsRetailProductGroup
     *
     * @return The actual instance (CatalogsCreativeAssetsProductGroup, CatalogsHotelProductGroup, CatalogsRetailProductGroup)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CatalogsRetailProductGroup`. If the actual instance is not `CatalogsRetailProductGroup`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CatalogsRetailProductGroup`
     * @throws ClassCastException if the instance is not `CatalogsRetailProductGroup`
     */
    public CatalogsRetailProductGroup getCatalogsRetailProductGroup() throws ClassCastException {
        return (CatalogsRetailProductGroup)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CatalogsHotelProductGroup`. If the actual instance is not `CatalogsHotelProductGroup`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CatalogsHotelProductGroup`
     * @throws ClassCastException if the instance is not `CatalogsHotelProductGroup`
     */
    public CatalogsHotelProductGroup getCatalogsHotelProductGroup() throws ClassCastException {
        return (CatalogsHotelProductGroup)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CatalogsCreativeAssetsProductGroup`. If the actual instance is not `CatalogsCreativeAssetsProductGroup`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CatalogsCreativeAssetsProductGroup`
     * @throws ClassCastException if the instance is not `CatalogsCreativeAssetsProductGroup`
     */
    public CatalogsCreativeAssetsProductGroup getCatalogsCreativeAssetsProductGroup() throws ClassCastException {
        return (CatalogsCreativeAssetsProductGroup)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CatalogsVerticalProductGroup
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CatalogsRetailProductGroup
        try {
            CatalogsRetailProductGroup.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CatalogsRetailProductGroup failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CatalogsHotelProductGroup
        try {
            CatalogsHotelProductGroup.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CatalogsHotelProductGroup failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CatalogsCreativeAssetsProductGroup
        try {
            CatalogsCreativeAssetsProductGroup.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CatalogsCreativeAssetsProductGroup failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for CatalogsVerticalProductGroup with oneOf schemas: CatalogsCreativeAssetsProductGroup, CatalogsHotelProductGroup, CatalogsRetailProductGroup. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CatalogsVerticalProductGroup given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CatalogsVerticalProductGroup
     * @throws IOException if the JSON string is invalid with respect to CatalogsVerticalProductGroup
     */
    public static CatalogsVerticalProductGroup fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CatalogsVerticalProductGroup.class);
    }

    /**
     * Convert an instance of CatalogsVerticalProductGroup to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

