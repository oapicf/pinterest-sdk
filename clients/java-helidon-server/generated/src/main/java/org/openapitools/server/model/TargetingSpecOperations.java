package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.TargetingSpecOperationAgeBucket;
import org.openapitools.server.model.TargetingSpecOperationAppType;
import org.openapitools.server.model.TargetingSpecOperationAudienceExclude;
import org.openapitools.server.model.TargetingSpecOperationAudienceInclude;
import org.openapitools.server.model.TargetingSpecOperationGender;
import org.openapitools.server.model.TargetingSpecOperationGeo;
import org.openapitools.server.model.TargetingSpecOperationGeoExclude;
import org.openapitools.server.model.TargetingSpecOperationInterest;
import org.openapitools.server.model.TargetingSpecOperationLocale;
import org.openapitools.server.model.TargetingSpecOperationLocation;
import org.openapitools.server.model.TargetingSpecOperationLocationExclude;
import org.openapitools.server.model.TargetingSpecOperationMaximumAge;
import org.openapitools.server.model.TargetingSpecOperationMinimumAge;
import org.openapitools.server.model.TargetingSpecOperationShoppingRetargeting;
import org.openapitools.server.model.TargetingSpecShoppingRetargeting;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TargetingSpecOperations   {


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
    private List<@Valid TargetingSpecShoppingRetargeting> values = new ArrayList<>();
    private String value;

    /**
     * Default constructor.
     */
    public TargetingSpecOperations() {
    // JSON-B / Jackson
    }

    /**
     * Create TargetingSpecOperations.
     *
     * @param field field
     * @param operation operation
     * @param values values
     * @param value value
     */
    public TargetingSpecOperations(
        FieldEnum field, 
        OperationEnum operation, 
        List<@Valid TargetingSpecShoppingRetargeting> values, 
        String value
    ) {
        this.field = field;
        this.operation = operation;
        this.values = values;
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
     * Get values
     * @return values
     */
    public List<@Valid TargetingSpecShoppingRetargeting> getValues() {
        return values;
    }

    public void setValues(List<@Valid TargetingSpecShoppingRetargeting> values) {
        this.values = values;
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
        sb.append("class TargetingSpecOperations {\n");
        
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

