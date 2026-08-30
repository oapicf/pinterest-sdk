package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.AdvertiserDefinedEventMappingType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Advertiser defined event input for create/update operations
 */
public class AdvertiserDefinedEventInput   {

    private AdvertiserDefinedEventMappingType mappedConversionType;
    private String name;

    /**
     * Default constructor.
     */
    public AdvertiserDefinedEventInput() {
    // JSON-B / Jackson
    }

    /**
     * Create AdvertiserDefinedEventInput.
     *
     * @param mappedConversionType Pinterest standard event type to map this custom event to for campaign optimization and reporting
     * @param name Raw string name of the event
     */
    public AdvertiserDefinedEventInput(
        AdvertiserDefinedEventMappingType mappedConversionType, 
        String name
    ) {
        this.mappedConversionType = mappedConversionType;
        this.name = name;
    }



    /**
     * Pinterest standard event type to map this custom event to for campaign optimization and reporting
     * @return mappedConversionType
     */
    public AdvertiserDefinedEventMappingType getMappedConversionType() {
        return mappedConversionType;
    }

    public void setMappedConversionType(AdvertiserDefinedEventMappingType mappedConversionType) {
        this.mappedConversionType = mappedConversionType;
    }

    /**
     * Raw string name of the event
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdvertiserDefinedEventInput {\n");
        
        sb.append("    mappedConversionType: ").append(toIndentedString(mappedConversionType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

