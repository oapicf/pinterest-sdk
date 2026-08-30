package apimodels;

import apimodels.ActionType;
import apimodels.BidFloorObjectiveType;
import apimodels.Country;
import apimodels.CreativeType;
import apimodels.Currency;
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
 * Bid floor specification for a given campaign configuration.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BidFloorSpec   {
  @JsonProperty("billable_event")
  @NotNull
@Valid

  private ActionType billableEvent;

  @JsonProperty("countries")
  @Valid

  private List<Country> countries = null;

  @JsonProperty("creative_type")
  @Valid

  private CreativeType creativeType;

  @JsonProperty("currency")
  @NotNull
@Valid

  private Currency currency;

  @JsonProperty("objective_type")
  @Valid

  private BidFloorObjectiveType objectiveType;

  @JsonProperty("optimization_goal_metadata")
  @Valid

  private OptimizationGoalMetadata optimizationGoalMetadata;

  public BidFloorSpec billableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
    return this;
  }

   /**
   * Ad group billable event type.
   * @return billableEvent
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(billableEvent, bidFloorSpec.billableEvent) &&
        Objects.equals(countries, bidFloorSpec.countries) &&
        Objects.equals(creativeType, bidFloorSpec.creativeType) &&
        Objects.equals(currency, bidFloorSpec.currency) &&
        Objects.equals(objectiveType, bidFloorSpec.objectiveType) &&
        Objects.equals(optimizationGoalMetadata, bidFloorSpec.optimizationGoalMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billableEvent, countries, creativeType, currency, objectiveType, optimizationGoalMetadata);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

