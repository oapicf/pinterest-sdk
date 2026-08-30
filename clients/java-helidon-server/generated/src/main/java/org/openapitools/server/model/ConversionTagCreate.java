package org.openapitools.server.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class ConversionTagCreate   {

    private Boolean aemDbEnabled = false;
    private Boolean aemEnabled = false;
    private Boolean aemExternalIdEnabled = false;
    private Boolean aemFnlnEnabled = false;
    private Boolean aemGeEnabled = false;
    private Boolean aemLocEnabled = false;
    private Boolean aemPhEnabled = false;
    private BigDecimal mdFrequency = new BigDecimal("1");
    private String name;

    /**
     * Default constructor.
     */
    public ConversionTagCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionTagCreate.
     *
     * @param aemDbEnabled Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @param aemEnabled Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @param aemExternalIdEnabled Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @param aemFnlnEnabled Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @param aemGeEnabled Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @param aemLocEnabled Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @param aemPhEnabled Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @param mdFrequency Metadata ingestion frequency.
     * @param name Conversion tag name.
     */
    public ConversionTagCreate(
        Boolean aemDbEnabled, 
        Boolean aemEnabled, 
        Boolean aemExternalIdEnabled, 
        Boolean aemFnlnEnabled, 
        Boolean aemGeEnabled, 
        Boolean aemLocEnabled, 
        Boolean aemPhEnabled, 
        BigDecimal mdFrequency, 
        String name
    ) {
        this.aemDbEnabled = aemDbEnabled;
        this.aemEnabled = aemEnabled;
        this.aemExternalIdEnabled = aemExternalIdEnabled;
        this.aemFnlnEnabled = aemFnlnEnabled;
        this.aemGeEnabled = aemGeEnabled;
        this.aemLocEnabled = aemLocEnabled;
        this.aemPhEnabled = aemPhEnabled;
        this.mdFrequency = mdFrequency;
        this.name = name;
    }



    /**
     * Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @return aemDbEnabled
     */
    public Boolean getAemDbEnabled() {
        return aemDbEnabled;
    }

    public void setAemDbEnabled(Boolean aemDbEnabled) {
        this.aemDbEnabled = aemDbEnabled;
    }

    /**
     * Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @return aemEnabled
     */
    public Boolean getAemEnabled() {
        return aemEnabled;
    }

    public void setAemEnabled(Boolean aemEnabled) {
        this.aemEnabled = aemEnabled;
    }

    /**
     * Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @return aemExternalIdEnabled
     */
    public Boolean getAemExternalIdEnabled() {
        return aemExternalIdEnabled;
    }

    public void setAemExternalIdEnabled(Boolean aemExternalIdEnabled) {
        this.aemExternalIdEnabled = aemExternalIdEnabled;
    }

    /**
     * Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @return aemFnlnEnabled
     */
    public Boolean getAemFnlnEnabled() {
        return aemFnlnEnabled;
    }

    public void setAemFnlnEnabled(Boolean aemFnlnEnabled) {
        this.aemFnlnEnabled = aemFnlnEnabled;
    }

    /**
     * Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @return aemGeEnabled
     */
    public Boolean getAemGeEnabled() {
        return aemGeEnabled;
    }

    public void setAemGeEnabled(Boolean aemGeEnabled) {
        this.aemGeEnabled = aemGeEnabled;
    }

    /**
     * Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @return aemLocEnabled
     */
    public Boolean getAemLocEnabled() {
        return aemLocEnabled;
    }

    public void setAemLocEnabled(Boolean aemLocEnabled) {
        this.aemLocEnabled = aemLocEnabled;
    }

    /**
     * Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @return aemPhEnabled
     */
    public Boolean getAemPhEnabled() {
        return aemPhEnabled;
    }

    public void setAemPhEnabled(Boolean aemPhEnabled) {
        this.aemPhEnabled = aemPhEnabled;
    }

    /**
     * Metadata ingestion frequency.
     * @return mdFrequency
     */
    public BigDecimal getMdFrequency() {
        return mdFrequency;
    }

    public void setMdFrequency(BigDecimal mdFrequency) {
        this.mdFrequency = mdFrequency;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConversionTagCreate {\n");
        
        sb.append("    aemDbEnabled: ").append(toIndentedString(aemDbEnabled)).append("\n");
        sb.append("    aemEnabled: ").append(toIndentedString(aemEnabled)).append("\n");
        sb.append("    aemExternalIdEnabled: ").append(toIndentedString(aemExternalIdEnabled)).append("\n");
        sb.append("    aemFnlnEnabled: ").append(toIndentedString(aemFnlnEnabled)).append("\n");
        sb.append("    aemGeEnabled: ").append(toIndentedString(aemGeEnabled)).append("\n");
        sb.append("    aemLocEnabled: ").append(toIndentedString(aemLocEnabled)).append("\n");
        sb.append("    aemPhEnabled: ").append(toIndentedString(aemPhEnabled)).append("\n");
        sb.append("    mdFrequency: ").append(toIndentedString(mdFrequency)).append("\n");
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

