package org.openapitools.server.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ConversionTagConfigs   {

    private Boolean aemDbEnabled = false;
    private Boolean aemEnabled = false;
    private Boolean aemExternalIdEnabled = false;
    private Boolean aemFnlnEnabled = false;
    private Boolean aemGeEnabled = false;
    private Boolean aemLocEnabled = false;
    private Boolean aemPhEnabled = false;
    private BigDecimal mdFrequency = new BigDecimal("1");
    private List<String> noCodeCapiDomains = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ConversionTagConfigs() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionTagConfigs.
     *
     * @param aemDbEnabled Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @param aemEnabled Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @param aemExternalIdEnabled Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @param aemFnlnEnabled Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @param aemGeEnabled Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @param aemLocEnabled Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @param aemPhEnabled Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
     * @param mdFrequency Metadata ingestion frequency.
     * @param noCodeCapiDomains List of advertiser subdomains configured for NoCodeCAPI calls.
     */
    public ConversionTagConfigs(
        Boolean aemDbEnabled, 
        Boolean aemEnabled, 
        Boolean aemExternalIdEnabled, 
        Boolean aemFnlnEnabled, 
        Boolean aemGeEnabled, 
        Boolean aemLocEnabled, 
        Boolean aemPhEnabled, 
        BigDecimal mdFrequency, 
        List<String> noCodeCapiDomains
    ) {
        this.aemDbEnabled = aemDbEnabled;
        this.aemEnabled = aemEnabled;
        this.aemExternalIdEnabled = aemExternalIdEnabled;
        this.aemFnlnEnabled = aemFnlnEnabled;
        this.aemGeEnabled = aemGeEnabled;
        this.aemLocEnabled = aemLocEnabled;
        this.aemPhEnabled = aemPhEnabled;
        this.mdFrequency = mdFrequency;
        this.noCodeCapiDomains = noCodeCapiDomains;
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
     * List of advertiser subdomains configured for NoCodeCAPI calls.
     * @return noCodeCapiDomains
     */
    public List<String> getNoCodeCapiDomains() {
        return noCodeCapiDomains;
    }

    public void setNoCodeCapiDomains(List<String> noCodeCapiDomains) {
        this.noCodeCapiDomains = noCodeCapiDomains;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConversionTagConfigs {\n");
        
        sb.append("    aemDbEnabled: ").append(toIndentedString(aemDbEnabled)).append("\n");
        sb.append("    aemEnabled: ").append(toIndentedString(aemEnabled)).append("\n");
        sb.append("    aemExternalIdEnabled: ").append(toIndentedString(aemExternalIdEnabled)).append("\n");
        sb.append("    aemFnlnEnabled: ").append(toIndentedString(aemFnlnEnabled)).append("\n");
        sb.append("    aemGeEnabled: ").append(toIndentedString(aemGeEnabled)).append("\n");
        sb.append("    aemLocEnabled: ").append(toIndentedString(aemLocEnabled)).append("\n");
        sb.append("    aemPhEnabled: ").append(toIndentedString(aemPhEnabled)).append("\n");
        sb.append("    mdFrequency: ").append(toIndentedString(mdFrequency)).append("\n");
        sb.append("    noCodeCapiDomains: ").append(toIndentedString(noCodeCapiDomains)).append("\n");
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

