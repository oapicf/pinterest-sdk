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
 * OASSingleInterestTargetingOptionResp
 */
public class OASSingleInterestTargetingOptionResp implements OAS.MappedProperties {
    /**
     * Get id
     * @return id
     */
    public String id { get; set; }

    /**
     * Get name
     * @return name
     */
    public String name { get; set; }

    /**
     * Get childInterests
     * @return childInterests
     */
    public List<String> childInterests { get; set; }

    /**
     * Get level
     * @return level
     */
    public Integer level { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'child_interests' => 'childInterests'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASSingleInterestTargetingOptionResp() {
        childInterests = new List<String>();
    }

    public static OASSingleInterestTargetingOptionResp getExample() {
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse = new OASSingleInterestTargetingOptionResp();
          singleInterestTargetingOptionResponse.id = '945391946569';
          singleInterestTargetingOptionResponse.name = 'Dress';
          singleInterestTargetingOptionResponse.childInterests = new List<String>{''};
          singleInterestTargetingOptionResponse.level = 2;
        return singleInterestTargetingOptionResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASSingleInterestTargetingOptionResp) {           
            OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse = (OASSingleInterestTargetingOptionResp) obj;
            return this.id == singleInterestTargetingOptionResponse.id
                && this.name == singleInterestTargetingOptionResponse.name
                && this.childInterests == singleInterestTargetingOptionResponse.childInterests
                && this.level == singleInterestTargetingOptionResponse.level;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (childInterests == null ? 0 : System.hashCode(childInterests));
        hashCode = (17 * hashCode) + (level == null ? 0 : System.hashCode(level));
        return hashCode;
    }
}

