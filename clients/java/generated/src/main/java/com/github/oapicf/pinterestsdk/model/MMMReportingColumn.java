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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Marketing Mix Modeling (MMM) Reporting Columns
 */
@JsonAdapter(MMMReportingColumn.Adapter.class)
public enum MMMReportingColumn {
  
  SPEND_IN_DOLLAR("SPEND_IN_DOLLAR"),
  
  SPEND_IN_MICRO_DOLLAR("SPEND_IN_MICRO_DOLLAR"),
  
  ECPC_IN_DOLLAR("ECPC_IN_DOLLAR"),
  
  ECTR("ECTR"),
  
  CAMPAIGN_NAME("CAMPAIGN_NAME"),
  
  TOTAL_ENGAGEMENT("TOTAL_ENGAGEMENT"),
  
  EENGAGEMENT_RATE("EENGAGEMENT_RATE"),
  
  ECPM_IN_DOLLAR("ECPM_IN_DOLLAR"),
  
  CAMPAIGN_ID("CAMPAIGN_ID"),
  
  ADVERTISER_ID("ADVERTISER_ID"),
  
  AD_GROUP_ID("AD_GROUP_ID"),
  
  AD_GROUP_NAME("AD_GROUP_NAME"),
  
  CLICKTHROUGH_1("CLICKTHROUGH_1"),
  
  IMPRESSION_1("IMPRESSION_1"),
  
  CLICKTHROUGH_2("CLICKTHROUGH_2"),
  
  IMPRESSION_2("IMPRESSION_2"),
  
  TOTAL_CLICKTHROUGH("TOTAL_CLICKTHROUGH"),
  
  TOTAL_IMPRESSION("TOTAL_IMPRESSION"),
  
  ADVERTISER_NAME("ADVERTISER_NAME"),
  
  SPEND_ORDER_LINE_PAID_TYPE("SPEND_ORDER_LINE_PAID_TYPE");

  private String value;

  MMMReportingColumn(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MMMReportingColumn fromValue(String value) {
    for (MMMReportingColumn b : MMMReportingColumn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MMMReportingColumn> {
    @Override
    public void write(final JsonWriter jsonWriter, final MMMReportingColumn enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MMMReportingColumn read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MMMReportingColumn.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    MMMReportingColumn.fromValue(value);
  }
}

