package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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

@ApiModel(description="Bid floor specification for a given campaign configuration.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BidFloorSpec   {
  
  private ActionType billableEvent;
  private List<Country> countries = new ArrayList<>();
  private CreativeType creativeType;
  private Currency currency;
  private BidFloorObjectiveType objectiveType;
  private OptimizationGoalMetadata optimizationGoalMetadata;

  /**
   * Ad group billable event type.
   **/
  
  @ApiModelProperty(required = true, value = "Ad group billable event type.")
  @JsonProperty("billable_event")
  @NotNull
  @Valid
  public ActionType getBillableEvent() {
    return billableEvent;
  }
  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  /**
   * List of ISO 3166-1 alpha-2 country codes.
   **/
  
  @ApiModelProperty(value = "List of ISO 3166-1 alpha-2 country codes.")
  @JsonProperty("countries")
  @Valid
  public List<Country> getCountries() {
    return countries;
  }
  public void setCountries(List<Country> countries) {
    this.countries = countries;
  }

  /**
   * Creative type for the bid floor request.
   **/
  
  @ApiModelProperty(value = "Creative type for the bid floor request.")
  @JsonProperty("creative_type")
  @Valid
  public CreativeType getCreativeType() {
    return creativeType;
  }
  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   * Currency for the bid floor value.
   **/
  
  @ApiModelProperty(required = true, value = "Currency for the bid floor value.")
  @JsonProperty("currency")
  @NotNull
  @Valid
  public Currency getCurrency() {
    return currency;
  }
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * Campaign objective type.
   **/
  
  @ApiModelProperty(value = "Campaign objective type.")
  @JsonProperty("objective_type")
  @Valid
  public BidFloorObjectiveType getObjectiveType() {
    return objectiveType;
  }
  public void setObjectiveType(BidFloorObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  /**
   * Optimization goal metadata.
   **/
  
  @ApiModelProperty(value = "Optimization goal metadata.")
  @JsonProperty("optimization_goal_metadata")
  @Valid
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

