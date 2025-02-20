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
import com.github.oapicf.pinterestsdk.model.CatalogsCreateRetailItem;
import com.github.oapicf.pinterestsdk.model.CatalogsDeleteRetailItem;
import com.github.oapicf.pinterestsdk.model.CatalogsUpdateRetailItem;
import com.github.oapicf.pinterestsdk.model.CatalogsUpsertRetailItem;
import com.github.oapicf.pinterestsdk.model.ItemAttributesRequest;
import com.github.oapicf.pinterestsdk.model.UpdateMaskFieldType;
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
public class CatalogsRetailBatchRequestItemsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CatalogsRetailBatchRequestItemsInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CatalogsRetailBatchRequestItemsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CatalogsRetailBatchRequestItemsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CatalogsCreateRetailItem> adapterCatalogsCreateRetailItem = gson.getDelegateAdapter(this, TypeToken.get(CatalogsCreateRetailItem.class));
            final TypeAdapter<CatalogsUpdateRetailItem> adapterCatalogsUpdateRetailItem = gson.getDelegateAdapter(this, TypeToken.get(CatalogsUpdateRetailItem.class));
            final TypeAdapter<CatalogsUpsertRetailItem> adapterCatalogsUpsertRetailItem = gson.getDelegateAdapter(this, TypeToken.get(CatalogsUpsertRetailItem.class));
            final TypeAdapter<CatalogsDeleteRetailItem> adapterCatalogsDeleteRetailItem = gson.getDelegateAdapter(this, TypeToken.get(CatalogsDeleteRetailItem.class));

            return (TypeAdapter<T>) new TypeAdapter<CatalogsRetailBatchRequestItemsInner>() {
                @Override
                public void write(JsonWriter out, CatalogsRetailBatchRequestItemsInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CatalogsCreateRetailItem`
                    if (value.getActualInstance() instanceof CatalogsCreateRetailItem) {
                        JsonElement element = adapterCatalogsCreateRetailItem.toJsonTree((CatalogsCreateRetailItem)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CatalogsUpdateRetailItem`
                    if (value.getActualInstance() instanceof CatalogsUpdateRetailItem) {
                        JsonElement element = adapterCatalogsUpdateRetailItem.toJsonTree((CatalogsUpdateRetailItem)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CatalogsUpsertRetailItem`
                    if (value.getActualInstance() instanceof CatalogsUpsertRetailItem) {
                        JsonElement element = adapterCatalogsUpsertRetailItem.toJsonTree((CatalogsUpsertRetailItem)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CatalogsDeleteRetailItem`
                    if (value.getActualInstance() instanceof CatalogsDeleteRetailItem) {
                        JsonElement element = adapterCatalogsDeleteRetailItem.toJsonTree((CatalogsDeleteRetailItem)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: CatalogsCreateRetailItem, CatalogsDeleteRetailItem, CatalogsUpdateRetailItem, CatalogsUpsertRetailItem");
                }

                @Override
                public CatalogsRetailBatchRequestItemsInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CatalogsCreateRetailItem
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CatalogsCreateRetailItem.validateJsonElement(jsonElement);
                        actualAdapter = adapterCatalogsCreateRetailItem;
                        CatalogsRetailBatchRequestItemsInner ret = new CatalogsRetailBatchRequestItemsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CatalogsCreateRetailItem failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CatalogsCreateRetailItem'", e);
                    }
                    // deserialize CatalogsUpdateRetailItem
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CatalogsUpdateRetailItem.validateJsonElement(jsonElement);
                        actualAdapter = adapterCatalogsUpdateRetailItem;
                        CatalogsRetailBatchRequestItemsInner ret = new CatalogsRetailBatchRequestItemsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CatalogsUpdateRetailItem failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CatalogsUpdateRetailItem'", e);
                    }
                    // deserialize CatalogsUpsertRetailItem
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CatalogsUpsertRetailItem.validateJsonElement(jsonElement);
                        actualAdapter = adapterCatalogsUpsertRetailItem;
                        CatalogsRetailBatchRequestItemsInner ret = new CatalogsRetailBatchRequestItemsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CatalogsUpsertRetailItem failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CatalogsUpsertRetailItem'", e);
                    }
                    // deserialize CatalogsDeleteRetailItem
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CatalogsDeleteRetailItem.validateJsonElement(jsonElement);
                        actualAdapter = adapterCatalogsDeleteRetailItem;
                        CatalogsRetailBatchRequestItemsInner ret = new CatalogsRetailBatchRequestItemsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CatalogsDeleteRetailItem failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CatalogsDeleteRetailItem'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for CatalogsRetailBatchRequestItemsInner: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CatalogsRetailBatchRequestItemsInner() {
        super("anyOf", Boolean.FALSE);
    }

    public CatalogsRetailBatchRequestItemsInner(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CatalogsCreateRetailItem", CatalogsCreateRetailItem.class);
        schemas.put("CatalogsUpdateRetailItem", CatalogsUpdateRetailItem.class);
        schemas.put("CatalogsUpsertRetailItem", CatalogsUpsertRetailItem.class);
        schemas.put("CatalogsDeleteRetailItem", CatalogsDeleteRetailItem.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CatalogsRetailBatchRequestItemsInner.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * CatalogsCreateRetailItem, CatalogsDeleteRetailItem, CatalogsUpdateRetailItem, CatalogsUpsertRetailItem
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CatalogsCreateRetailItem) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CatalogsUpdateRetailItem) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CatalogsUpsertRetailItem) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CatalogsDeleteRetailItem) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CatalogsCreateRetailItem, CatalogsDeleteRetailItem, CatalogsUpdateRetailItem, CatalogsUpsertRetailItem");
    }

    /**
     * Get the actual instance, which can be the following:
     * CatalogsCreateRetailItem, CatalogsDeleteRetailItem, CatalogsUpdateRetailItem, CatalogsUpsertRetailItem
     *
     * @return The actual instance (CatalogsCreateRetailItem, CatalogsDeleteRetailItem, CatalogsUpdateRetailItem, CatalogsUpsertRetailItem)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CatalogsCreateRetailItem`. If the actual instance is not `CatalogsCreateRetailItem`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CatalogsCreateRetailItem`
     * @throws ClassCastException if the instance is not `CatalogsCreateRetailItem`
     */
    public CatalogsCreateRetailItem getCatalogsCreateRetailItem() throws ClassCastException {
        return (CatalogsCreateRetailItem)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CatalogsUpdateRetailItem`. If the actual instance is not `CatalogsUpdateRetailItem`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CatalogsUpdateRetailItem`
     * @throws ClassCastException if the instance is not `CatalogsUpdateRetailItem`
     */
    public CatalogsUpdateRetailItem getCatalogsUpdateRetailItem() throws ClassCastException {
        return (CatalogsUpdateRetailItem)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CatalogsUpsertRetailItem`. If the actual instance is not `CatalogsUpsertRetailItem`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CatalogsUpsertRetailItem`
     * @throws ClassCastException if the instance is not `CatalogsUpsertRetailItem`
     */
    public CatalogsUpsertRetailItem getCatalogsUpsertRetailItem() throws ClassCastException {
        return (CatalogsUpsertRetailItem)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CatalogsDeleteRetailItem`. If the actual instance is not `CatalogsDeleteRetailItem`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CatalogsDeleteRetailItem`
     * @throws ClassCastException if the instance is not `CatalogsDeleteRetailItem`
     */
    public CatalogsDeleteRetailItem getCatalogsDeleteRetailItem() throws ClassCastException {
        return (CatalogsDeleteRetailItem)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CatalogsRetailBatchRequestItemsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CatalogsCreateRetailItem
        try {
            CatalogsCreateRetailItem.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CatalogsCreateRetailItem failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CatalogsUpdateRetailItem
        try {
            CatalogsUpdateRetailItem.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CatalogsUpdateRetailItem failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CatalogsUpsertRetailItem
        try {
            CatalogsUpsertRetailItem.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CatalogsUpsertRetailItem failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CatalogsDeleteRetailItem
        try {
            CatalogsDeleteRetailItem.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CatalogsDeleteRetailItem failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for CatalogsRetailBatchRequestItemsInner with anyOf schemas: CatalogsCreateRetailItem, CatalogsDeleteRetailItem, CatalogsUpdateRetailItem, CatalogsUpsertRetailItem. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of CatalogsRetailBatchRequestItemsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CatalogsRetailBatchRequestItemsInner
     * @throws IOException if the JSON string is invalid with respect to CatalogsRetailBatchRequestItemsInner
     */
    public static CatalogsRetailBatchRequestItemsInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CatalogsRetailBatchRequestItemsInner.class);
    }

    /**
     * Convert an instance of CatalogsRetailBatchRequestItemsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

