package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Information about a catalog asset.
 */
public class CatalogBinding   {

    private String catalogType;
    private String id;
    private String name;

    /**
     * Default constructor.
     */
    public CatalogBinding() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogBinding.
     *
     * @param catalogType Catalog type
     * @param id Catalog ID.
     * @param name Catalog name
     */
    public CatalogBinding(
        String catalogType, 
        String id, 
        String name
    ) {
        this.catalogType = catalogType;
        this.id = id;
        this.name = name;
    }



    /**
     * Catalog type
     * @return catalogType
     */
    public String getCatalogType() {
        return catalogType;
    }

    public void setCatalogType(String catalogType) {
        this.catalogType = catalogType;
    }

    /**
     * Catalog ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Catalog name
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
        sb.append("class CatalogBinding {\n");
        
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

