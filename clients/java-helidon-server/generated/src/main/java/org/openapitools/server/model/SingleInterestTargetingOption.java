package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class SingleInterestTargetingOption   {

    private List<String> childInterests = new ArrayList<>();
    private String id;
    private Integer level;
    private String name;

    /**
     * Default constructor.
     */
    public SingleInterestTargetingOption() {
    // JSON-B / Jackson
    }

    /**
     * Create SingleInterestTargetingOption.
     *
     * @param childInterests childInterests
     * @param id id
     * @param level level
     * @param name name
     */
    public SingleInterestTargetingOption(
        List<String> childInterests, 
        String id, 
        Integer level, 
        String name
    ) {
        this.childInterests = childInterests;
        this.id = id;
        this.level = level;
        this.name = name;
    }



    /**
     * Get childInterests
     * @return childInterests
     */
    public List<String> getChildInterests() {
        return childInterests;
    }

    public void setChildInterests(List<String> childInterests) {
        this.childInterests = childInterests;
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
     * Get level
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SingleInterestTargetingOption {\n");
        
        sb.append("    childInterests: ").append(toIndentedString(childInterests)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

