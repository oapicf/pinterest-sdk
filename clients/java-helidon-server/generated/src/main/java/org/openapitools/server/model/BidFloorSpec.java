package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ActionType;
import org.openapitools.server.model.BidFloorObjectiveType;
import org.openapitools.server.model.Country;
import org.openapitools.server.model.CreativeType;
import org.openapitools.server.model.Currency;
import org.openapitools.server.model.OptimizationGoalMetadata;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Bid floor specification for a given campaign configuration.
 */
public class BidFloorSpec   {

    private ActionType billableEvent;
    private List<Country> countries = new ArrayList<>();
    private CreativeType creativeType;
    private Currency currency;
    private BidFloorObjectiveType objectiveType;
    private OptimizationGoalMetadata optimizationGoalMetadata;

    /**
     * Default constructor.
     */
    public BidFloorSpec() {
    // JSON-B / Jackson
    }

    /**
     * Create BidFloorSpec.
     *
     * @param billableEvent Ad group billable event type.
     * @param countries List of ISO 3166-1 alpha-2 country codes.
     * @param creativeType Creative type for the bid floor request.
     * @param currency Currency for the bid floor value.
     * @param objectiveType Campaign objective type.
     * @param optimizationGoalMetadata Optimization goal metadata.
     */
    public BidFloorSpec(
        ActionType billableEvent, 
        List<Country> countries, 
        CreativeType creativeType, 
        Currency currency, 
        BidFloorObjectiveType objectiveType, 
        OptimizationGoalMetadata optimizationGoalMetadata
    ) {
        this.billableEvent = billableEvent;
        this.countries = countries;
        this.creativeType = creativeType;
        this.currency = currency;
        this.objectiveType = objectiveType;
        this.optimizationGoalMetadata = optimizationGoalMetadata;
    }



    /**
     * Ad group billable event type.
     * @return billableEvent
     */
    public ActionType getBillableEvent() {
        return billableEvent;
    }

    public void setBillableEvent(ActionType billableEvent) {
        this.billableEvent = billableEvent;
    }

    /**
     * List of ISO 3166-1 alpha-2 country codes.
     * @return countries
     */
    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    /**
     * Creative type for the bid floor request.
     * @return creativeType
     */
    public CreativeType getCreativeType() {
        return creativeType;
    }

    public void setCreativeType(CreativeType creativeType) {
        this.creativeType = creativeType;
    }

    /**
     * Currency for the bid floor value.
     * @return currency
     */
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    /**
     * Campaign objective type.
     * @return objectiveType
     */
    public BidFloorObjectiveType getObjectiveType() {
        return objectiveType;
    }

    public void setObjectiveType(BidFloorObjectiveType objectiveType) {
        this.objectiveType = objectiveType;
    }

    /**
     * Optimization goal metadata.
     * @return optimizationGoalMetadata
     */
    public OptimizationGoalMetadata getOptimizationGoalMetadata() {
        return optimizationGoalMetadata;
    }

    public void setOptimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
        this.optimizationGoalMetadata = optimizationGoalMetadata;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

