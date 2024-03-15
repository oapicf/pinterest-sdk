package apimodels;

import apimodels.ActionType;
import apimodels.Country;
import apimodels.CreativeType;
import apimodels.Currency;
import apimodels.ObjectiveType;
import apimodels.OptimizationGoalMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BidFloorSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BidFloorSpec   {
  @JsonProperty("countries")
  @Valid

  private List<Country> countries = null;

  @JsonProperty("currency")
  @NotNull
@Valid

  private Currency currency;

  @JsonProperty("objective_type")
  @Valid

  private ObjectiveType objectiveType;

  @JsonProperty("billable_event")
  @NotNull
@Valid

  private ActionType billableEvent;

  @JsonProperty("optimization_goal_metadata")
  @Valid

  private OptimizationGoalMetadata optimizationGoalMetadata;

  @JsonProperty("creative_type")
  @Valid

  private CreativeType creativeType;

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
   * Get countries
   * @return countries
  **/
  public List<Country> getCountries() {
    return countries;
  }

  public void setCountries(List<Country> countries) {
    this.countries = countries;
  }

  public BidFloorSpec currency(Currency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public BidFloorSpec objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

   /**
   * Get objectiveType
   * @return objectiveType
  **/
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  public BidFloorSpec billableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
    return this;
  }

   /**
   * Get billableEvent
   * @return billableEvent
  **/
  public ActionType getBillableEvent() {
    return billableEvent;
  }

  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  public BidFloorSpec optimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    return this;
  }

   /**
   * Get optimizationGoalMetadata
   * @return optimizationGoalMetadata
  **/
  public OptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  public void setOptimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  public BidFloorSpec creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

   /**
   * Get creativeType
   * @return creativeType
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

