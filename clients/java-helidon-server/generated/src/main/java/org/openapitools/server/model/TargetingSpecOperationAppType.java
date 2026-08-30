package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.TargetingSpecAppType;
import org.openapitools.server.model.TargetingSpecListOperation;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TargetingSpecOperationAppType   {


    /**
    * Gets or Sets field
    */
    public enum FieldEnum {
        APPTYPE("APPTYPE");

        private String value;

        FieldEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static FieldEnum fromValue(String text) {
            for (FieldEnum b : FieldEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private FieldEnum field;
    private TargetingSpecListOperation operation;
    private List<TargetingSpecAppType> values = new ArrayList<>();

    /**
     * Default constructor.
     */
    public TargetingSpecOperationAppType() {
    // JSON-B / Jackson
    }

    /**
     * Create TargetingSpecOperationAppType.
     *
     * @param field field
     * @param operation operation
     * @param values values
     */
    public TargetingSpecOperationAppType(
        FieldEnum field, 
        TargetingSpecListOperation operation, 
        List<TargetingSpecAppType> values
    ) {
        this.field = field;
        this.operation = operation;
        this.values = values;
    }



    /**
     * Get field
     * @return field
     */
    public FieldEnum getField() {
        return field;
    }

    public void setField(FieldEnum field) {
        this.field = field;
    }

    /**
     * Get operation
     * @return operation
     */
    public TargetingSpecListOperation getOperation() {
        return operation;
    }

    public void setOperation(TargetingSpecListOperation operation) {
        this.operation = operation;
    }

    /**
     * Get values
     * @return values
     */
    public List<TargetingSpecAppType> getValues() {
        return values;
    }

    public void setValues(List<TargetingSpecAppType> values) {
        this.values = values;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetingSpecOperationAppType {\n");
        
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

