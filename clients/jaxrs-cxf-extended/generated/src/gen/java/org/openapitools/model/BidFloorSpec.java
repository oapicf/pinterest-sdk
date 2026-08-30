package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Bid floor specification for a given campaign configuration.
 */
@ApiModel(description="Bid floor specification for a given campaign configuration.")

public class BidFloorSpec  {
  
 /**
  * Ad group billable event type.
  */
  @ApiModelProperty(required = true, value = "Ad group billable event type.")
  @Valid
  private ActionType billableEvent;

 /**
  * List of ISO 3166-1 alpha-2 country codes.
  */
  @ApiModelProperty(value = "List of ISO 3166-1 alpha-2 country codes.")
  @Valid
  private List<Country> countries = new ArrayList<>();

 /**
  * Creative type for the bid floor request.
  */
  @ApiModelProperty(value = "Creative type for the bid floor request.")
  @Valid
  private CreativeType creativeType;

 /**
  * Currency for the bid floor value.
  */
  @ApiModelProperty(required = true, value = "Currency for the bid floor value.")
  @Valid
  private Currency currency;

 /**
  * Campaign objective type.
  */
  @ApiModelProperty(value = "Campaign objective type.")
  @Valid
  private BidFloorObjectiveType objectiveType;

 /**
  * Optimization goal metadata.
  */
  @ApiModelProperty(value = "Optimization goal metadata.")
  @Valid
  private OptimizationGoalMetadata optimizationGoalMetadata;
 /**
  * Ad group billable event type.
  * @return billableEvent
  */
  @JsonProperty("billable_event")
  @NotNull
  public ActionType getBillableEvent() {
    return billableEvent;
  }

  /**
   * Sets the <code>billableEvent</code> property.
   */
 public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  /**
   * Sets the <code>billableEvent</code> property.
   */
  public BidFloorSpec billableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
    return this;
  }

 /**
  * List of ISO 3166-1 alpha-2 country codes.
  * @return countries
  */
  @JsonProperty("countries")
  public List<Country> getCountries() {
    return countries;
  }

  /**
   * Sets the <code>countries</code> property.
   */
 public void setCountries(List<Country> countries) {
    this.countries = countries;
  }

  /**
   * Sets the <code>countries</code> property.
   */
  public BidFloorSpec countries(List<Country> countries) {
    this.countries = countries;
    return this;
  }

  /**
   * Adds a new item to the <code>countries</code> list.
   */
  public BidFloorSpec addCountriesItem(Country countriesItem) {
    this.countries.add(countriesItem);
    return this;
  }

 /**
  * Creative type for the bid floor request.
  * @return creativeType
  */
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }

  /**
   * Sets the <code>creativeType</code> property.
   */
 public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   * Sets the <code>creativeType</code> property.
   */
  public BidFloorSpec creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

 /**
  * Currency for the bid floor value.
  * @return currency
  */
  @JsonProperty("currency")
  @NotNull
  public Currency getCurrency() {
    return currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
 public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
  public BidFloorSpec currency(Currency currency) {
    this.currency = currency;
    return this;
  }

 /**
  * Campaign objective type.
  * @return objectiveType
  */
  @JsonProperty("objective_type")
  public BidFloorObjectiveType getObjectiveType() {
    return objectiveType;
  }

  /**
   * Sets the <code>objectiveType</code> property.
   */
 public void setObjectiveType(BidFloorObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  /**
   * Sets the <code>objectiveType</code> property.
   */
  public BidFloorSpec objectiveType(BidFloorObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

 /**
  * Optimization goal metadata.
  * @return optimizationGoalMetadata
  */
  @JsonProperty("optimization_goal_metadata")
  public OptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  /**
   * Sets the <code>optimizationGoalMetadata</code> property.
   */
 public void setOptimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  /**
   * Sets the <code>optimizationGoalMetadata</code> property.
   */
  public BidFloorSpec optimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

