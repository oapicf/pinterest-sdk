package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.server.model.CatalogsType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Catalog entity
 */
public class Catalog   {

    private CatalogsType catalogType;
    private OffsetDateTime createdAt;
    private String id;
    private String name;
    private OffsetDateTime updatedAt;

    /**
     * Default constructor.
     */
    public Catalog() {
    // JSON-B / Jackson
    }

    /**
     * Create Catalog.
     *
     * @param catalogType catalogType
     * @param createdAt createdAt
     * @param id ID of the catalog entity.
     * @param name A human-friendly name associated to a catalog entity.
     * @param updatedAt updatedAt
     */
    public Catalog(
        CatalogsType catalogType, 
        OffsetDateTime createdAt, 
        String id, 
        String name, 
        OffsetDateTime updatedAt
    ) {
        this.catalogType = catalogType;
        this.createdAt = createdAt;
        this.id = id;
        this.name = name;
        this.updatedAt = updatedAt;
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
     * Get createdAt
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * ID of the catalog entity.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
     * Get updatedAt
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Catalog {\n");
        
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

