package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AudienceSubcategory   {

    private String id;
    private BigDecimal index;
    private String key;
    private String name;
    private BigDecimal ratio;

    /**
     * Default constructor.
     */
    public AudienceSubcategory() {
    // JSON-B / Jackson
    }

    /**
     * Create AudienceSubcategory.
     *
     * @param id id
     * @param index index
     * @param key key
     * @param name name
     * @param ratio ratio
     */
    public AudienceSubcategory(
        String id, 
        BigDecimal index, 
        String key, 
        String name, 
        BigDecimal ratio
    ) {
        this.id = id;
        this.index = index;
        this.key = key;
        this.name = name;
        this.ratio = ratio;
    }



    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get index
     * @return index
     */
    public BigDecimal getIndex() {
        return index;
    }

    public void setIndex(BigDecimal index) {
        this.index = index;
    }

    /**
     * Get key
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get ratio
     * @return ratio
     */
    public BigDecimal getRatio() {
        return ratio;
    }

    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudienceSubcategory {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
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

