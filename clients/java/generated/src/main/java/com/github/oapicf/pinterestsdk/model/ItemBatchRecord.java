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
import com.github.oapicf.pinterestsdk.model.ItemAttributes;
import com.github.oapicf.pinterestsdk.model.ItemCreateBatchRecord;
import com.github.oapicf.pinterestsdk.model.ItemDeleteBatchRecord;
import com.github.oapicf.pinterestsdk.model.ItemDeleteDiscontinuedBatchRecord;
import com.github.oapicf.pinterestsdk.model.ItemUpdateBatchRecord;
import com.github.oapicf.pinterestsdk.model.ItemUpsertBatchRecord;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-14T23:01:05.225954683Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ItemBatchRecord extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ItemBatchRecord.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ItemBatchRecord.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ItemBatchRecord' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ItemCreateBatchRecord> adapterItemCreateBatchRecord = gson.getDelegateAdapter(this, TypeToken.get(ItemCreateBatchRecord.class));
            final TypeAdapter<ItemDeleteDiscontinuedBatchRecord> adapterItemDeleteDiscontinuedBatchRecord = gson.getDelegateAdapter(this, TypeToken.get(ItemDeleteDiscontinuedBatchRecord.class));
            final TypeAdapter<ItemUpdateBatchRecord> adapterItemUpdateBatchRecord = gson.getDelegateAdapter(this, TypeToken.get(ItemUpdateBatchRecord.class));
            final TypeAdapter<ItemUpsertBatchRecord> adapterItemUpsertBatchRecord = gson.getDelegateAdapter(this, TypeToken.get(ItemUpsertBatchRecord.class));
            final TypeAdapter<ItemDeleteBatchRecord> adapterItemDeleteBatchRecord = gson.getDelegateAdapter(this, TypeToken.get(ItemDeleteBatchRecord.class));

            return (TypeAdapter<T>) new TypeAdapter<ItemBatchRecord>() {
                @Override
                public void write(JsonWriter out, ItemBatchRecord value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ItemCreateBatchRecord`
                    if (value.getActualInstance() instanceof ItemCreateBatchRecord) {
                      JsonElement element = adapterItemCreateBatchRecord.toJsonTree((ItemCreateBatchRecord)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `ItemDeleteDiscontinuedBatchRecord`
                    if (value.getActualInstance() instanceof ItemDeleteDiscontinuedBatchRecord) {
                      JsonElement element = adapterItemDeleteDiscontinuedBatchRecord.toJsonTree((ItemDeleteDiscontinuedBatchRecord)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `ItemUpdateBatchRecord`
                    if (value.getActualInstance() instanceof ItemUpdateBatchRecord) {
                      JsonElement element = adapterItemUpdateBatchRecord.toJsonTree((ItemUpdateBatchRecord)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `ItemUpsertBatchRecord`
                    if (value.getActualInstance() instanceof ItemUpsertBatchRecord) {
                      JsonElement element = adapterItemUpsertBatchRecord.toJsonTree((ItemUpsertBatchRecord)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `ItemDeleteBatchRecord`
                    if (value.getActualInstance() instanceof ItemDeleteBatchRecord) {
                      JsonElement element = adapterItemDeleteBatchRecord.toJsonTree((ItemDeleteBatchRecord)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ItemCreateBatchRecord, ItemDeleteBatchRecord, ItemDeleteDiscontinuedBatchRecord, ItemUpdateBatchRecord, ItemUpsertBatchRecord");
                }

                @Override
                public ItemBatchRecord read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ItemCreateBatchRecord
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ItemCreateBatchRecord.validateJsonElement(jsonElement);
                      actualAdapter = adapterItemCreateBatchRecord;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ItemCreateBatchRecord'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ItemCreateBatchRecord failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ItemCreateBatchRecord'", e);
                    }
                    // deserialize ItemDeleteDiscontinuedBatchRecord
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ItemDeleteDiscontinuedBatchRecord.validateJsonElement(jsonElement);
                      actualAdapter = adapterItemDeleteDiscontinuedBatchRecord;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ItemDeleteDiscontinuedBatchRecord'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ItemDeleteDiscontinuedBatchRecord failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ItemDeleteDiscontinuedBatchRecord'", e);
                    }
                    // deserialize ItemUpdateBatchRecord
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ItemUpdateBatchRecord.validateJsonElement(jsonElement);
                      actualAdapter = adapterItemUpdateBatchRecord;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ItemUpdateBatchRecord'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ItemUpdateBatchRecord failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ItemUpdateBatchRecord'", e);
                    }
                    // deserialize ItemUpsertBatchRecord
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ItemUpsertBatchRecord.validateJsonElement(jsonElement);
                      actualAdapter = adapterItemUpsertBatchRecord;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ItemUpsertBatchRecord'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ItemUpsertBatchRecord failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ItemUpsertBatchRecord'", e);
                    }
                    // deserialize ItemDeleteBatchRecord
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ItemDeleteBatchRecord.validateJsonElement(jsonElement);
                      actualAdapter = adapterItemDeleteBatchRecord;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ItemDeleteBatchRecord'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ItemDeleteBatchRecord failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ItemDeleteBatchRecord'", e);
                    }

                    if (match == 1) {
                        ItemBatchRecord ret = new ItemBatchRecord();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ItemBatchRecord: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ItemBatchRecord() {
        super("oneOf", Boolean.FALSE);
    }

    public ItemBatchRecord(ItemCreateBatchRecord o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ItemBatchRecord(ItemDeleteBatchRecord o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ItemBatchRecord(ItemDeleteDiscontinuedBatchRecord o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ItemBatchRecord(ItemUpdateBatchRecord o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ItemBatchRecord(ItemUpsertBatchRecord o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ItemCreateBatchRecord", ItemCreateBatchRecord.class);
        schemas.put("ItemDeleteDiscontinuedBatchRecord", ItemDeleteDiscontinuedBatchRecord.class);
        schemas.put("ItemUpdateBatchRecord", ItemUpdateBatchRecord.class);
        schemas.put("ItemUpsertBatchRecord", ItemUpsertBatchRecord.class);
        schemas.put("ItemDeleteBatchRecord", ItemDeleteBatchRecord.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ItemBatchRecord.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ItemCreateBatchRecord, ItemDeleteBatchRecord, ItemDeleteDiscontinuedBatchRecord, ItemUpdateBatchRecord, ItemUpsertBatchRecord
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ItemCreateBatchRecord) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ItemDeleteDiscontinuedBatchRecord) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ItemUpdateBatchRecord) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ItemUpsertBatchRecord) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ItemDeleteBatchRecord) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ItemCreateBatchRecord, ItemDeleteBatchRecord, ItemDeleteDiscontinuedBatchRecord, ItemUpdateBatchRecord, ItemUpsertBatchRecord");
    }

    /**
     * Get the actual instance, which can be the following:
     * ItemCreateBatchRecord, ItemDeleteBatchRecord, ItemDeleteDiscontinuedBatchRecord, ItemUpdateBatchRecord, ItemUpsertBatchRecord
     *
     * @return The actual instance (ItemCreateBatchRecord, ItemDeleteBatchRecord, ItemDeleteDiscontinuedBatchRecord, ItemUpdateBatchRecord, ItemUpsertBatchRecord)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ItemCreateBatchRecord`. If the actual instance is not `ItemCreateBatchRecord`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ItemCreateBatchRecord`
     * @throws ClassCastException if the instance is not `ItemCreateBatchRecord`
     */
    public ItemCreateBatchRecord getItemCreateBatchRecord() throws ClassCastException {
        return (ItemCreateBatchRecord)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ItemDeleteDiscontinuedBatchRecord`. If the actual instance is not `ItemDeleteDiscontinuedBatchRecord`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ItemDeleteDiscontinuedBatchRecord`
     * @throws ClassCastException if the instance is not `ItemDeleteDiscontinuedBatchRecord`
     */
    public ItemDeleteDiscontinuedBatchRecord getItemDeleteDiscontinuedBatchRecord() throws ClassCastException {
        return (ItemDeleteDiscontinuedBatchRecord)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ItemUpdateBatchRecord`. If the actual instance is not `ItemUpdateBatchRecord`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ItemUpdateBatchRecord`
     * @throws ClassCastException if the instance is not `ItemUpdateBatchRecord`
     */
    public ItemUpdateBatchRecord getItemUpdateBatchRecord() throws ClassCastException {
        return (ItemUpdateBatchRecord)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ItemUpsertBatchRecord`. If the actual instance is not `ItemUpsertBatchRecord`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ItemUpsertBatchRecord`
     * @throws ClassCastException if the instance is not `ItemUpsertBatchRecord`
     */
    public ItemUpsertBatchRecord getItemUpsertBatchRecord() throws ClassCastException {
        return (ItemUpsertBatchRecord)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ItemDeleteBatchRecord`. If the actual instance is not `ItemDeleteBatchRecord`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ItemDeleteBatchRecord`
     * @throws ClassCastException if the instance is not `ItemDeleteBatchRecord`
     */
    public ItemDeleteBatchRecord getItemDeleteBatchRecord() throws ClassCastException {
        return (ItemDeleteBatchRecord)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ItemBatchRecord
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with ItemCreateBatchRecord
    try {
      ItemCreateBatchRecord.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ItemCreateBatchRecord failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ItemDeleteDiscontinuedBatchRecord
    try {
      ItemDeleteDiscontinuedBatchRecord.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ItemDeleteDiscontinuedBatchRecord failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ItemUpdateBatchRecord
    try {
      ItemUpdateBatchRecord.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ItemUpdateBatchRecord failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ItemUpsertBatchRecord
    try {
      ItemUpsertBatchRecord.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ItemUpsertBatchRecord failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ItemDeleteBatchRecord
    try {
      ItemDeleteBatchRecord.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ItemDeleteBatchRecord failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ItemBatchRecord with oneOf schemas: ItemCreateBatchRecord, ItemDeleteBatchRecord, ItemDeleteDiscontinuedBatchRecord, ItemUpdateBatchRecord, ItemUpsertBatchRecord. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of ItemBatchRecord given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ItemBatchRecord
  * @throws IOException if the JSON string is invalid with respect to ItemBatchRecord
  */
  public static ItemBatchRecord fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemBatchRecord.class);
  }

 /**
  * Convert an instance of ItemBatchRecord to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
