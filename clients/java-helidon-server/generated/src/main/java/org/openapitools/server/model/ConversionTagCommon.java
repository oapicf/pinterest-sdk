package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ConversionTagConfigs;
import org.openapitools.server.model.EnhancedMatchStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ConversionTagCommon   {

    private String codeSnippet;
    private ConversionTagConfigs configs;
    private EnhancedMatchStatusType enhancedMatchStatus;
    private String id;
    private BigDecimal lastFiredTimeMs;
    private String name;
    private String version;

    /**
     * Default constructor.
     */
    public ConversionTagCommon() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionTagCommon.
     *
     * @param codeSnippet Tag code snippet.
     * @param configs configs
     * @param enhancedMatchStatus The enhanced match status of the tag
     * @param id Tag ID.
     * @param lastFiredTimeMs Time for the last event fired.
     * @param name Conversion tag name.
     * @param version Version number.
     */
    public ConversionTagCommon(
        String codeSnippet, 
        ConversionTagConfigs configs, 
        EnhancedMatchStatusType enhancedMatchStatus, 
        String id, 
        BigDecimal lastFiredTimeMs, 
        String name, 
        String version
    ) {
        this.codeSnippet = codeSnippet;
        this.configs = configs;
        this.enhancedMatchStatus = enhancedMatchStatus;
        this.id = id;
        this.lastFiredTimeMs = lastFiredTimeMs;
        this.name = name;
        this.version = version;
    }



    /**
     * Tag code snippet.
     * @return codeSnippet
     */
    public String getCodeSnippet() {
        return codeSnippet;
    }

    public void setCodeSnippet(String codeSnippet) {
        this.codeSnippet = codeSnippet;
    }

    /**
     * Get configs
     * @return configs
     */
    public ConversionTagConfigs getConfigs() {
        return configs;
    }

    public void setConfigs(ConversionTagConfigs configs) {
        this.configs = configs;
    }

    /**
     * The enhanced match status of the tag
     * @return enhancedMatchStatus
     */
    public EnhancedMatchStatusType getEnhancedMatchStatus() {
        return enhancedMatchStatus;
    }

    public void setEnhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
        this.enhancedMatchStatus = enhancedMatchStatus;
    }

    /**
     * Tag ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Time for the last event fired.
     * @return lastFiredTimeMs
     */
    public BigDecimal getLastFiredTimeMs() {
        return lastFiredTimeMs;
    }

    public void setLastFiredTimeMs(BigDecimal lastFiredTimeMs) {
        this.lastFiredTimeMs = lastFiredTimeMs;
    }

    /**
     * Conversion tag name.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Version number.
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConversionTagCommon {\n");
        
        sb.append("    codeSnippet: ").append(toIndentedString(codeSnippet)).append("\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
        sb.append("    enhancedMatchStatus: ").append(toIndentedString(enhancedMatchStatus)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastFiredTimeMs: ").append(toIndentedString(lastFiredTimeMs)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

