package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ConversionTagTypeOptimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Advertiser defined event
 */
public class AdvertiserDefinedEvent   {

    private ConversionTagTypeOptimal mappedConversionType;
    private String name;

    /**
     * Default constructor.
     */
    public AdvertiserDefinedEvent() {
    // JSON-B / Jackson
    }

    /**
     * Create AdvertiserDefinedEvent.
     *
     * @param mappedConversionType Standard type mapped to ADE for optimization
     * @param name Raw string name of the event, usually logged as raw_event_name in our dataset
     */
    public AdvertiserDefinedEvent(
        ConversionTagTypeOptimal mappedConversionType, 
        String name
    ) {
        this.mappedConversionType = mappedConversionType;
        this.name = name;
    }



    /**
     * Standard type mapped to ADE for optimization
     * @return mappedConversionType
     */
    public ConversionTagTypeOptimal getMappedConversionType() {
        return mappedConversionType;
    }

    public void setMappedConversionType(ConversionTagTypeOptimal mappedConversionType) {
        this.mappedConversionType = mappedConversionType;
    }

    /**
     * Raw string name of the event, usually logged as raw_event_name in our dataset
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
        sb.append("class AdvertiserDefinedEvent {\n");
        
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

