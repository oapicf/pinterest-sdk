package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CatalogsType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create or update operation model.
 */
public class CatalogUpdate   {

    private CatalogsType catalogType;
    private String name;

    /**
     * Default constructor.
     */
    public CatalogUpdate() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogUpdate.
     *
     * @param catalogType catalogType
     * @param name A human-friendly name associated to a catalog entity.
     */
    public CatalogUpdate(
        CatalogsType catalogType, 
        String name
    ) {
        this.catalogType = catalogType;
        this.name = name;
    }



    /**
     * Get catalogType
     * @return catalogType
     */
    public CatalogsType getCatalogType() {
        return catalogType;
    }

    public void setCatalogType(CatalogsType catalogType) {
        this.catalogType = catalogType;
    }

    /**
     * A human-friendly name associated to a catalog entity.
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
        sb.append("class CatalogUpdate {\n");
        
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
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

