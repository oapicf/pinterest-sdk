package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.ActionType;
import com.prokarma.pkmst.model.BidFloorObjectiveType;
import com.prokarma.pkmst.model.Country;
import com.prokarma.pkmst.model.CreativeType;
import com.prokarma.pkmst.model.Currency;
import com.prokarma.pkmst.model.OptimizationGoalMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Bid floor specification for a given campaign configuration.
 */
@ApiModel(description = "Bid floor specification for a given campaign configuration.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BidFloorSpec   {
  @JsonProperty("billable_event")
  private ActionType billableEvent;

  @JsonProperty("countries")
  
  private List<Country> countries = null;

  @JsonProperty("creative_type")
  private CreativeType creativeType;

  @JsonProperty("currency")
  private Currency currency;

  @JsonProperty("objective_type")
  private BidFloorObjectiveType objectiveType;

  @JsonProperty("optimization_goal_metadata")
  private OptimizationGoalMetadata optimizationGoalMetadata;

  public BidFloorSpec billableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
    return this;
  }

  /**
   * Ad group billable event type.
   * @return billableEvent
   */
  @ApiModelProperty(required = true, value = "Ad group billable event type.")
  public ActionType getBillableEvent() {
    return billableEvent;
  }

  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  public BidFloorSpec countries(List<Country> countries) {
    this.countries = countries;
    return this;
  }

  public BidFloorSpec addCountriesItem(Country countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<>();
    }
    this.countries.add(countriesItem);
    return this;
  }

  /**
   * List of ISO 3166-1 alpha-2 country codes.
   * @return countries
   */
  @ApiModelProperty(value = "List of ISO 3166-1 alpha-2 country codes.")
  public List<Country> getCountries() {
    return countries;
  }

  public void setCountries(List<Country> countries) {
    this.countries = countries;
  }

  public BidFloorSpec creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  /**
   * Creative type for the bid floor request.
   * @return creativeType
   */
  @ApiModelProperty(value = "Creative type for the bid floor request.")
  public CreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  public BidFloorSpec currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency for the bid floor value.
   * @return currency
   */
  @ApiModelProperty(required = true, value = "Currency for the bid floor value.")
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public BidFloorSpec objectiveType(BidFloorObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  /**
   * Campaign objective type.
   * @return objectiveType
   */
  @ApiModelProperty(value = "Campaign objective type.")
  public BidFloorObjectiveType getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(BidFloorObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  public BidFloorSpec optimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    return this;
  }

  /**
   * Optimization goal metadata.
   * @return optimizationGoalMetadata
   */
  @ApiModelProperty(value = "Optimization goal metadata.")
  public OptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

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

