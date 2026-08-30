package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AdsAnalyticsFilterColumn;
import org.openapitools.server.model.AdsAnalyticsFilterOperator;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdsAnalyticsMetricsFilter   {

    private AdsAnalyticsFilterColumn field;
    private AdsAnalyticsFilterOperator operator;
    private List<BigDecimal> values = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AdsAnalyticsMetricsFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create AdsAnalyticsMetricsFilter.
     *
     * @param field field
     * @param operator operator
     * @param values List of values for filtering
     */
    public AdsAnalyticsMetricsFilter(
        AdsAnalyticsFilterColumn field, 
        AdsAnalyticsFilterOperator operator, 
        List<BigDecimal> values
    ) {
        this.field = field;
        this.operator = operator;
        this.values = values;
    }



    /**
     * Get field
     * @return field
     */
    public AdsAnalyticsFilterColumn getField() {
        return field;
    }

    public void setField(AdsAnalyticsFilterColumn field) {
        this.field = field;
    }

    /**
     * Get operator
     * @return operator
     */
    public AdsAnalyticsFilterOperator getOperator() {
        return operator;
    }

    public void setOperator(AdsAnalyticsFilterOperator operator) {
        this.operator = operator;
    }

    /**
     * List of values for filtering
     * @return values
     */
    public List<BigDecimal> getValues() {
        return values;
    }

    public void setValues(List<BigDecimal> values) {
        this.values = values;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdsAnalyticsMetricsFilter {\n");
        
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

