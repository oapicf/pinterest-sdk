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
import com.github.oapicf.pinterestsdk.model.CatalogsCreativeAssetsAttributes;
import com.github.oapicf.pinterestsdk.model.CatalogsType;
import com.github.oapicf.pinterestsdk.model.ItemResponseAnyOf;
import com.github.oapicf.pinterestsdk.model.ItemResponseAnyOf1;
import com.github.oapicf.pinterestsdk.model.ItemValidationEvent;
import com.github.oapicf.pinterestsdk.model.Pin;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
public class ItemResponse extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ItemResponse.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ItemResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ItemResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ItemResponseAnyOf> adapterItemResponseAnyOf = gson.getDelegateAdapter(this, TypeToken.get(ItemResponseAnyOf.class));
            final TypeAdapter<ItemResponseAnyOf1> adapterItemResponseAnyOf1 = gson.getDelegateAdapter(this, TypeToken.get(ItemResponseAnyOf1.class));

            return (TypeAdapter<T>) new TypeAdapter<ItemResponse>() {
                @Override
                public void write(JsonWriter out, ItemResponse value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ItemResponseAnyOf`
                    if (value.getActualInstance() instanceof ItemResponseAnyOf) {
                        JsonElement element = adapterItemResponseAnyOf.toJsonTree((ItemResponseAnyOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `ItemResponseAnyOf1`
                    if (value.getActualInstance() instanceof ItemResponseAnyOf1) {
                        JsonElement element = adapterItemResponseAnyOf1.toJsonTree((ItemResponseAnyOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: ItemResponseAnyOf, ItemResponseAnyOf1");
                }

                @Override
                public ItemResponse read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ItemResponseAnyOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ItemResponseAnyOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterItemResponseAnyOf;
                        ItemResponse ret = new ItemResponse();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ItemResponseAnyOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ItemResponseAnyOf'", e);
                    }
                    // deserialize ItemResponseAnyOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ItemResponseAnyOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterItemResponseAnyOf1;
                        ItemResponse ret = new ItemResponse();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ItemResponseAnyOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ItemResponseAnyOf1'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for ItemResponse: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ItemResponse() {
        super("anyOf", Boolean.FALSE);
    }

    public ItemResponse(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ItemResponseAnyOf", ItemResponseAnyOf.class);
        schemas.put("ItemResponseAnyOf1", ItemResponseAnyOf1.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ItemResponse.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * ItemResponseAnyOf, ItemResponseAnyOf1
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ItemResponseAnyOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ItemResponseAnyOf1) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ItemResponseAnyOf, ItemResponseAnyOf1");
    }

    /**
     * Get the actual instance, which can be the following:
     * ItemResponseAnyOf, ItemResponseAnyOf1
     *
     * @return The actual instance (ItemResponseAnyOf, ItemResponseAnyOf1)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ItemResponseAnyOf`. If the actual instance is not `ItemResponseAnyOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ItemResponseAnyOf`
     * @throws ClassCastException if the instance is not `ItemResponseAnyOf`
     */
    public ItemResponseAnyOf getItemResponseAnyOf() throws ClassCastException {
        return (ItemResponseAnyOf)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ItemResponseAnyOf1`. If the actual instance is not `ItemResponseAnyOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ItemResponseAnyOf1`
     * @throws ClassCastException if the instance is not `ItemResponseAnyOf1`
     */
    public ItemResponseAnyOf1 getItemResponseAnyOf1() throws ClassCastException {
        return (ItemResponseAnyOf1)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ItemResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with ItemResponseAnyOf
        try {
            ItemResponseAnyOf.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ItemResponseAnyOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ItemResponseAnyOf1
        try {
            ItemResponseAnyOf1.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ItemResponseAnyOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for ItemResponse with anyOf schemas: ItemResponseAnyOf, ItemResponseAnyOf1. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of ItemResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ItemResponse
     * @throws IOException if the JSON string is invalid with respect to ItemResponse
     */
    public static ItemResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ItemResponse.class);
    }

    /**
     * Convert an instance of ItemResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

