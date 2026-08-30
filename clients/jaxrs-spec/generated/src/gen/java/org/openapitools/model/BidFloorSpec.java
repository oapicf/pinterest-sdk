package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ActionType;
import org.openapitools.model.BidFloorObjectiveType;
import org.openapitools.model.Country;
import org.openapitools.model.CreativeType;
import org.openapitools.model.Currency;
import org.openapitools.model.OptimizationGoalMetadata;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Bid floor specification for a given campaign configuration.
 **/
@ApiModel(description = "Bid floor specification for a given campaign configuration.")
@JsonTypeName("BidFloorSpec")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BidFloorSpec   {
  private ActionType billableEvent;
  private @Valid List<Country> countries = new ArrayList<>();
  private CreativeType creativeType;
  private Currency currency;
  private BidFloorObjectiveType objectiveType;
  private OptimizationGoalMetadata optimizationGoalMetadata;

  public BidFloorSpec() {
  }

  @JsonCreator
  public BidFloorSpec(
    @JsonProperty(required = true, value = "billable_event") ActionType billableEvent,
    @JsonProperty(required = true, value = "currency") Currency currency
  ) {
    this.billableEvent = billableEvent;
    this.currency = currency;
  }

  /**
   * Ad group billable event type.
   **/
  public BidFloorSpec billableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Ad group billable event type.")
  @JsonProperty(required = true, value = "billable_event")
  @NotNull public ActionType getBillableEvent() {
    return billableEvent;
  }

  @JsonProperty(required = true, value = "billable_event")
  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  /**
   * List of ISO 3166-1 alpha-2 country codes.
   **/
  public BidFloorSpec countries(List<Country> countries) {
    this.countries = countries;
    return this;
  }

  
  @ApiModelProperty(value = "List of ISO 3166-1 alpha-2 country codes.")
  @JsonProperty("countries")
  public List<Country> getCountries() {
    return countries;
  }

  @JsonProperty("countries")
  public void setCountries(List<Country> countries) {
    this.countries = countries;
  }

  public BidFloorSpec addCountriesItem(Country countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<>();
    }

    this.countries.add(countriesItem);
    return this;
  }

  public BidFloorSpec removeCountriesItem(Country countriesItem) {
    if (countriesItem != null && this.countries != null) {
      this.countries.remove(countriesItem);
    }

    return this;
  }
  /**
   * Creative type for the bid floor request.
   **/
  public BidFloorSpec creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  
  @ApiModelProperty(value = "Creative type for the bid floor request.")
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }

  @JsonProperty("creative_type")
  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   * Currency for the bid floor value.
   **/
  public BidFloorSpec currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Currency for the bid floor value.")
  @JsonProperty(required = true, value = "currency")
  @NotNull public Currency getCurrency() {
    return currency;
  }

  @JsonProperty(required = true, value = "currency")
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * Campaign objective type.
   **/
  public BidFloorSpec objectiveType(BidFloorObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  
  @ApiModelProperty(value = "Campaign objective type.")
  @JsonProperty("objective_type")
  public BidFloorObjectiveType getObjectiveType() {
    return objectiveType;
  }

  @JsonProperty("objective_type")
  public void setObjectiveType(BidFloorObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  /**
   * Optimization goal metadata.
   **/
  public BidFloorSpec optimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    return this;
  }

  
  @ApiModelProperty(value = "Optimization goal metadata.")
  @JsonProperty("optimization_goal_metadata")
  @Valid public OptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  @JsonProperty("optimization_goal_metadata")
  public void setOptimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidFloorSpec bidFloorSpec = (BidFloorSpec) o;
    return Objects.equals(this.billableEvent, bidFloorSpec.billableEvent) &&
        Objects.equals(this.countries, bidFloorSpec.countries) &&
        Objects.equals(this.creativeType, bidFloorSpec.creativeType) &&
        Objects.equals(this.currency, bidFloorSpec.currency) &&
        Objects.equals(this.objectiveType, bidFloorSpec.objectiveType) &&
        Objects.equals(this.optimizationGoalMetadata, bidFloorSpec.optimizationGoalMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billableEvent, countries, creativeType, currency, objectiveType, optimizationGoalMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidFloorSpec {\n");
    
    sb.append("    billableEvent: ").append(toIndentedString(billableEvent)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    optimizationGoalMetadata: ").append(toIndentedString(optimizationGoalMetadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
