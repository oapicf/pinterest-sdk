/**
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

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.ActionType;
import org.openapitools.client.model.Country;
import org.openapitools.client.model.CreativeType;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.ObjectiveType;
import org.openapitools.client.model.OptimizationGoalMetadata;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BidFloorSpec {
  
  @SerializedName("countries")
  private List<Country> countries = null;
  @SerializedName("currency")
  private Currency currency = null;
  @SerializedName("objective_type")
  private ObjectiveType objectiveType = null;
  @SerializedName("billable_event")
  private ActionType billableEvent = null;
  @SerializedName("optimization_goal_metadata")
  private OptimizationGoalMetadata optimizationGoalMetadata = null;
  @SerializedName("creative_type")
  private CreativeType creativeType = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Country> getCountries() {
    return countries;
  }
  public void setCountries(List<Country> countries) {
    this.countries = countries;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Currency getCurrency() {
    return currency;
  }
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }
  public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ActionType getBillableEvent() {
    return billableEvent;
  }
  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }
  public void setOptimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (this.countries == null ? bidFloorSpec.countries == null : this.countries.equals(bidFloorSpec.countries)) &&
        (this.currency == null ? bidFloorSpec.currency == null : this.currency.equals(bidFloorSpec.currency)) &&
        (this.objectiveType == null ? bidFloorSpec.objectiveType == null : this.objectiveType.equals(bidFloorSpec.objectiveType)) &&
        (this.billableEvent == null ? bidFloorSpec.billableEvent == null : this.billableEvent.equals(bidFloorSpec.billableEvent)) &&
        (this.optimizationGoalMetadata == null ? bidFloorSpec.optimizationGoalMetadata == null : this.optimizationGoalMetadata.equals(bidFloorSpec.optimizationGoalMetadata)) &&
        (this.creativeType == null ? bidFloorSpec.creativeType == null : this.creativeType.equals(bidFloorSpec.creativeType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.countries == null ? 0: this.countries.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.objectiveType == null ? 0: this.objectiveType.hashCode());
    result = 31 * result + (this.billableEvent == null ? 0: this.billableEvent.hashCode());
    result = 31 * result + (this.optimizationGoalMetadata == null ? 0: this.optimizationGoalMetadata.hashCode());
    result = 31 * result + (this.creativeType == null ? 0: this.creativeType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidFloorSpec {\n");
    
    sb.append("  countries: ").append(countries).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  objectiveType: ").append(objectiveType).append("\n");
    sb.append("  billableEvent: ").append(billableEvent).append("\n");
    sb.append("  optimizationGoalMetadata: ").append(optimizationGoalMetadata).append("\n");
    sb.append("  creativeType: ").append(creativeType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
