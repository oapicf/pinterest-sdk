package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.PinterestLibError;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsLocalStoresCreate200ResponseInnerDataOneOf   {

    private String id;
    private PinterestLibError exceptions;

    /**
     * Default constructor.
     */
    public CatalogsLocalStoresCreate200ResponseInnerDataOneOf() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsLocalStoresCreate200ResponseInnerDataOneOf.
     *
     * @param id The ID of the local store.
     * @param exceptions exceptions
     */
    public CatalogsLocalStoresCreate200ResponseInnerDataOneOf(
        String id, 
        PinterestLibError exceptions
    ) {
        this.id = id;
        this.exceptions = exceptions;
    }



    /**
     * The ID of the local store.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get exceptions
     * @return exceptions
     */
    public PinterestLibError getExceptions() {
        return exceptions;
    }

    public void setExceptions(PinterestLibError exceptions) {
        this.exceptions = exceptions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsLocalStoresCreate200ResponseInnerDataOneOf {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

