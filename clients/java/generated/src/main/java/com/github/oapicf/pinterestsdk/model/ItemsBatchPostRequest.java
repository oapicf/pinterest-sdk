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


package com.github.oapicf.pinterestsdk.model;

import java.util.Objects;
import com.github.oapicf.pinterestsdk.model.BatchOperation;
import com.github.oapicf.pinterestsdk.model.CatalogsItemsBatchRequest;
import com.github.oapicf.pinterestsdk.model.CatalogsType;
import com.github.oapicf.pinterestsdk.model.CatalogsVerticalBatchRequest;
import com.github.oapicf.pinterestsdk.model.Country;
import com.github.oapicf.pinterestsdk.model.ItemDeleteBatchRecord;
import com.github.oapicf.pinterestsdk.model.Language;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-14T23:01:05.225954683Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ItemsBatchPostRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ItemsBatchPostRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ItemsBatchPostRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ItemsBatchPostRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CatalogsVerticalBatchRequest> adapterCatalogsVerticalBatchRequest = gson.getDelegateAdapter(this, TypeToken.get(CatalogsVerticalBatchRequest.class));
            final TypeAdapter<CatalogsItemsBatchRequest> adapterCatalogsItemsBatchRequest = gson.getDelegateAdapter(this, TypeToken.get(CatalogsItemsBatchRequest.class));

            return (TypeAdapter<T>) new TypeAdapter<ItemsBatchPostRequest>() {
                @Override
                public void write(JsonWriter out, ItemsBatchPostRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CatalogsVerticalBatchRequest`
                    if (value.getActualInstance() instanceof CatalogsVerticalBatchRequest) {
                      JsonElement element = adapterCatalogsVerticalBatchRequest.toJsonTree((CatalogsVerticalBatchRequest)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CatalogsItemsBatchRequest`
                    if (value.getActualInstance() instanceof CatalogsItemsBatchRequest) {
                      JsonElement element = adapterCatalogsItemsBatchRequest.toJsonTree((CatalogsItemsBatchRequest)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CatalogsItemsBatchRequest, CatalogsVerticalBatchRequest");
                }

                @Override
                public ItemsBatchPostRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CatalogsVerticalBatchRequest
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CatalogsVerticalBatchRequest.validateJsonElement(jsonElement);
                      actualAdapter = adapterCatalogsVerticalBatchRequest;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CatalogsVerticalBatchRequest'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CatalogsVerticalBatchRequest failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CatalogsVerticalBatchRequest'", e);
                    }
                    // deserialize CatalogsItemsBatchRequest
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CatalogsItemsBatchRequest.validateJsonElement(jsonElement);
                      actualAdapter = adapterCatalogsItemsBatchRequest;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CatalogsItemsBatchRequest'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CatalogsItemsBatchRequest failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CatalogsItemsBatchRequest'", e);
                    }

                    if (match == 1) {
                        ItemsBatchPostRequest ret = new ItemsBatchPostRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ItemsBatchPostRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ItemsBatchPostRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public ItemsBatchPostRequest(CatalogsItemsBatchRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ItemsBatchPostRequest(CatalogsVerticalBatchRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CatalogsVerticalBatchRequest", CatalogsVerticalBatchRequest.class);
        schemas.put("CatalogsItemsBatchRequest", CatalogsItemsBatchRequest.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ItemsBatchPostRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CatalogsItemsBatchRequest, CatalogsVerticalBatchRequest
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CatalogsVerticalBatchRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CatalogsItemsBatchRequest) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CatalogsItemsBatchRequest, CatalogsVerticalBatchRequest");
    }

    /**
     * Get the actual instance, which can be the following:
     * CatalogsItemsBatchRequest, CatalogsVerticalBatchRequest
     *
     * @return The actual instance (CatalogsItemsBatchRequest, CatalogsVerticalBatchRequest)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CatalogsVerticalBatchRequest`. If the actual instance is not `CatalogsVerticalBatchRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CatalogsVerticalBatchRequest`
     * @throws ClassCastException if the instance is not `CatalogsVerticalBatchRequest`
     */
    public CatalogsVerticalBatchRequest getCatalogsVerticalBatchRequest() throws ClassCastException {
        return (CatalogsVerticalBatchRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CatalogsItemsBatchRequest`. If the actual instance is not `CatalogsItemsBatchRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CatalogsItemsBatchRequest`
     * @throws ClassCastException if the instance is not `CatalogsItemsBatchRequest`
     */
    public CatalogsItemsBatchRequest getCatalogsItemsBatchRequest() throws ClassCastException {
        return (CatalogsItemsBatchRequest)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ItemsBatchPostRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CatalogsVerticalBatchRequest
    try {
      CatalogsVerticalBatchRequest.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CatalogsVerticalBatchRequest failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CatalogsItemsBatchRequest
    try {
      CatalogsItemsBatchRequest.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CatalogsItemsBatchRequest failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ItemsBatchPostRequest with oneOf schemas: CatalogsItemsBatchRequest, CatalogsVerticalBatchRequest. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of ItemsBatchPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ItemsBatchPostRequest
  * @throws IOException if the JSON string is invalid with respect to ItemsBatchPostRequest
  */
  public static ItemsBatchPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemsBatchPostRequest.class);
  }

 /**
  * Convert an instance of ItemsBatchPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
