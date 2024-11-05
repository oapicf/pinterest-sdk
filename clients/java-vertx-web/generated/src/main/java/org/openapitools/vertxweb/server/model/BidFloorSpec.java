package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ActionType;
import org.openapitools.vertxweb.server.model.Country;
import org.openapitools.vertxweb.server.model.CreativeType;
import org.openapitools.vertxweb.server.model.Currency;
import org.openapitools.vertxweb.server.model.ObjectiveType;
import org.openapitools.vertxweb.server.model.OptimizationGoalMetadata;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BidFloorSpec   {
  
  private List<Country> countries = new ArrayList<>();
  private Currency currency;
  private ObjectiveType objectiveType;
  private ActionType billableEvent;
  private OptimizationGoalMetadata optimizationGoalMetadata;
  private CreativeType creativeType;

  public BidFloorSpec () {

  }

  public BidFloorSpec (List<Country> countries, Currency currency, ObjectiveType objectiveType, ActionType billableEvent, OptimizationGoalMetadata optimizationGoalMetadata, CreativeType creativeType) {
    this.countries = countries;
    this.currency = currency;
    this.objectiveType = objectiveType;
    this.billableEvent = billableEvent;
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    this.creativeType = creativeType;
  }

    
  @JsonProperty("countries")
  public List<Country> getCountries() {
    return countries;
  }
  public void setCountries(List<Country> countries) {
    this.countries = countries;
  }

    
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

    
  @JsonProperty("objective_type")
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }
  public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

    
  @JsonProperty("billable_event")
  public ActionType getBillableEvent() {
    return billableEvent;
  }
  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

    
  @JsonProperty("optimization_goal_metadata")
  public OptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }
  public void setOptimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

    
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }
  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
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
    return Objects.equals(countries, bidFloorSpec.countries) &&
        Objects.equals(currency, bidFloorSpec.currency) &&
        Objects.equals(objectiveType, bidFloorSpec.objectiveType) &&
        Objects.equals(billableEvent, bidFloorSpec.billableEvent) &&
        Objects.equals(optimizationGoalMetadata, bidFloorSpec.optimizationGoalMetadata) &&
        Objects.equals(creativeType, bidFloorSpec.creativeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countries, currency, objectiveType, billableEvent, optimizationGoalMetadata, creativeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidFloorSpec {\n");
    
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    billableEvent: ").append(toIndentedString(billableEvent)).append("\n");
    sb.append("    optimizationGoalMetadata: ").append(toIndentedString(optimizationGoalMetadata)).append("\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
