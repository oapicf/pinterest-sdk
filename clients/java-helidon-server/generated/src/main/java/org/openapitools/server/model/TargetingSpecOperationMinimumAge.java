package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TargetingSpecOperationMinimumAge   {


    /**
    * Gets or Sets field
    */
    public enum FieldEnum {
        MINIMUM_AGE("MINIMUM_AGE");

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

    /**
    * Gets or Sets operation
    */
    public enum OperationEnum {
        SET("SET");

        private String value;

        OperationEnum(String value) {
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
        public static OperationEnum fromValue(String text) {
            for (OperationEnum b : OperationEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private OperationEnum operation;
    private String value;

    /**
     * Default constructor.
     */
    public TargetingSpecOperationMinimumAge() {
    // JSON-B / Jackson
    }

    /**
     * Create TargetingSpecOperationMinimumAge.
     *
     * @param field field
     * @param operation operation
     * @param value value
     */
    public TargetingSpecOperationMinimumAge(
        FieldEnum field, 
        OperationEnum operation, 
        String value
    ) {
        this.field = field;
        this.operation = operation;
        this.value = value;
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
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(OperationEnum operation) {
        this.operation = operation;
    }

    /**
     * Get value
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetingSpecOperationMinimumAge {\n");
        
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

