/*
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * OASConversionTagCreate
 */
public class OASConversionTagCreate implements OASConversionTagConfigs, OAS.MappedProperties {
    /**
     * Conversion tag name.
     * @return name
     */
    public String name { get; set; }

    /**
     * Whether Automatic Enhanced Match email is enabled. See <a href="https://help.pinterest.com/en/business/article/enhanced-match" target="_blank">Enhanced match</a> for more information.
     * @return aemEnabled
     */
    public Boolean aemEnabled { get; set; }

    /**
     * Metadata ingestion frequency.
     * @return mdFrequency
     */
    public Double mdFrequency { get; set; }

    /**
     * Whether Automatic Enhanced Match name is enabled. See <a href="https://help.pinterest.com/en/business/article/enhanced-match" target="_blank">Enhanced match</a> for more information.
     * @return aemFnlnEnabled
     */
    public Boolean aemFnlnEnabled { get; set; }

    /**
     * Whether Automatic Enhanced Match phone is enabled. See <a href="https://help.pinterest.com/en/business/article/enhanced-match" target="_blank">Enhanced match</a> for more information.
     * @return aemPhEnabled
     */
    public Boolean aemPhEnabled { get; set; }

    /**
     * Whether Automatic Enhanced Match gender is enabled. See <a href="https://help.pinterest.com/en/business/article/enhanced-match" target="_blank">Enhanced match</a> for more information.
     * @return aemGeEnabled
     */
    public Boolean aemGeEnabled { get; set; }

    /**
     * Whether Automatic Enhanced Match birthdate is enabled. See <a href="https://help.pinterest.com/en/business/article/enhanced-match" target="_blank">Enhanced match</a> for more information.
     * @return aemDbEnabled
     */
    public Boolean aemDbEnabled { get; set; }

    /**
     * Whether Automatic Enhanced Match location is enabled. See <a href="https://help.pinterest.com/en/business/article/enhanced-match" target="_blank">Enhanced match</a> for more information.
     * @return aemLocEnabled
     */
    public Boolean aemLocEnabled { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'aem_enabled' => 'aemEnabled',
        'md_frequency' => 'mdFrequency',
        'aem_fnln_enabled' => 'aemFnlnEnabled',
        'aem_ph_enabled' => 'aemPhEnabled',
        'aem_ge_enabled' => 'aemGeEnabled',
        'aem_db_enabled' => 'aemDbEnabled',
        'aem_loc_enabled' => 'aemLocEnabled'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'aem_enabled' => 'aemEnabled',
        'md_frequency' => 'mdFrequency',
        'aem_fnln_enabled' => 'aemFnlnEnabled',
        'aem_ph_enabled' => 'aemPhEnabled',
        'aem_ge_enabled' => 'aemGeEnabled',
        'aem_db_enabled' => 'aemDbEnabled',
        'aem_loc_enabled' => 'aemLocEnabled'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'aem_enabled' => 'aemEnabled',
        'md_frequency' => 'mdFrequency',
        'aem_fnln_enabled' => 'aemFnlnEnabled',
        'aem_ph_enabled' => 'aemPhEnabled',
        'aem_ge_enabled' => 'aemGeEnabled',
        'aem_db_enabled' => 'aemDbEnabled',
        'aem_loc_enabled' => 'aemLocEnabled'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'aem_enabled' => 'aemEnabled',
        'md_frequency' => 'mdFrequency',
        'aem_fnln_enabled' => 'aemFnlnEnabled',
        'aem_ph_enabled' => 'aemPhEnabled',
        'aem_ge_enabled' => 'aemGeEnabled',
        'aem_db_enabled' => 'aemDbEnabled',
        'aem_loc_enabled' => 'aemLocEnabled'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'aem_enabled' => 'aemEnabled',
        'md_frequency' => 'mdFrequency',
        'aem_fnln_enabled' => 'aemFnlnEnabled',
        'aem_ph_enabled' => 'aemPhEnabled',
        'aem_ge_enabled' => 'aemGeEnabled',
        'aem_db_enabled' => 'aemDbEnabled',
        'aem_loc_enabled' => 'aemLocEnabled'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'aem_enabled' => 'aemEnabled',
        'md_frequency' => 'mdFrequency',
        'aem_fnln_enabled' => 'aemFnlnEnabled',
        'aem_ph_enabled' => 'aemPhEnabled',
        'aem_ge_enabled' => 'aemGeEnabled',
        'aem_db_enabled' => 'aemDbEnabled',
        'aem_loc_enabled' => 'aemLocEnabled'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'aem_enabled' => 'aemEnabled',
        'md_frequency' => 'mdFrequency',
        'aem_fnln_enabled' => 'aemFnlnEnabled',
        'aem_ph_enabled' => 'aemPhEnabled',
        'aem_ge_enabled' => 'aemGeEnabled',
        'aem_db_enabled' => 'aemDbEnabled',
        'aem_loc_enabled' => 'aemLocEnabled'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASConversionTagCreate() {
        aemEnabled = false;
        mdFrequency = 1;
        aemFnlnEnabled = false;
        aemPhEnabled = false;
        aemGeEnabled = false;
        aemDbEnabled = false;
        aemLocEnabled = false;
    }

    public static OASConversionTagCreate getExample() {
        OASConversionTagCreate conversionTagCreate = new OASConversionTagCreate();
          conversionTagCreate.name = 'ACME Tools Tag';
          conversionTagCreate.aemEnabled = true;
          conversionTagCreate.mdFrequency = 0.6;
          conversionTagCreate.aemFnlnEnabled = true;
          conversionTagCreate.aemPhEnabled = true;
          conversionTagCreate.aemGeEnabled = true;
          conversionTagCreate.aemDbEnabled = true;
          conversionTagCreate.aemLocEnabled = true;
        return conversionTagCreate;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASConversionTagCreate) {           
            OASConversionTagCreate conversionTagCreate = (OASConversionTagCreate) obj;
            return this.name == conversionTagCreate.name
                && this.aemEnabled == conversionTagCreate.aemEnabled
                && this.mdFrequency == conversionTagCreate.mdFrequency
                && this.aemFnlnEnabled == conversionTagCreate.aemFnlnEnabled
                && this.aemPhEnabled == conversionTagCreate.aemPhEnabled
                && this.aemGeEnabled == conversionTagCreate.aemGeEnabled
                && this.aemDbEnabled == conversionTagCreate.aemDbEnabled
                && this.aemLocEnabled == conversionTagCreate.aemLocEnabled;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (aemEnabled == null ? 0 : System.hashCode(aemEnabled));
        hashCode = (17 * hashCode) + (mdFrequency == null ? 0 : System.hashCode(mdFrequency));
        hashCode = (17 * hashCode) + (aemFnlnEnabled == null ? 0 : System.hashCode(aemFnlnEnabled));
        hashCode = (17 * hashCode) + (aemPhEnabled == null ? 0 : System.hashCode(aemPhEnabled));
        hashCode = (17 * hashCode) + (aemGeEnabled == null ? 0 : System.hashCode(aemGeEnabled));
        hashCode = (17 * hashCode) + (aemDbEnabled == null ? 0 : System.hashCode(aemDbEnabled));
        hashCode = (17 * hashCode) + (aemLocEnabled == null ? 0 : System.hashCode(aemLocEnabled));
        return hashCode;
    }
}

