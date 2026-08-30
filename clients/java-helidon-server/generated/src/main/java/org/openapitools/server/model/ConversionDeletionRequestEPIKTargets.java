package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ConversionDeletionRequestEPIKTargets   {

    private List<String> epiks = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ConversionDeletionRequestEPIKTargets() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionDeletionRequestEPIKTargets.
     *
     * @param epiks Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
     */
    public ConversionDeletionRequestEPIKTargets(
        List<String> epiks
    ) {
        this.epiks = epiks;
    }



    /**
     * Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
     * @return epiks
     */
    public List<String> getEpiks() {
        return epiks;
    }

    public void setEpiks(List<String> epiks) {
        this.epiks = epiks;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConversionDeletionRequestEPIKTargets {\n");
        
        sb.append("    epiks: ").append(toIndentedString(epiks)).append("\n");
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

