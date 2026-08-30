package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.CatalogsLocalStoresCreate200ResponseInnerData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsLocalStoresCreate200ResponseInner   {

    private CatalogsLocalStoresCreate200ResponseInnerData data;

    /**
     * Default constructor.
     */
    public CatalogsLocalStoresCreate200ResponseInner() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsLocalStoresCreate200ResponseInner.
     *
     * @param data data
     */
    public CatalogsLocalStoresCreate200ResponseInner(
        CatalogsLocalStoresCreate200ResponseInnerData data
    ) {
        this.data = data;
    }



    /**
     * Get data
     * @return data
     */
    public CatalogsLocalStoresCreate200ResponseInnerData getData() {
        return data;
    }

    public void setData(CatalogsLocalStoresCreate200ResponseInnerData data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsLocalStoresCreate200ResponseInner {\n");
        
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

