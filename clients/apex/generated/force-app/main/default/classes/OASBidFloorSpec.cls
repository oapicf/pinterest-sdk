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
 * OASBidFloorSpec
 */
public class OASBidFloorSpec implements OAS.MappedProperties {
    /**
     * Get countries
     * @return countries
     */
    public List<OASCountry> countries { get; set; }

    /**
     * Get r_currency
     * @return r_currency
     */
    public OASCurrency r_currency { get; set; }

    /**
     * Get objectiveType
     * @return objectiveType
     */
    public OASObjectiveType objectiveType { get; set; }

    /**
     * Get billableEvent
     * @return billableEvent
     */
    public OASActionType billableEvent { get; set; }

    /**
     * Get optimizationGoalMetadata
     * @return optimizationGoalMetadata
     */
    public OASOptimizationGoalMetadata optimizationGoalMetadata { get; set; }

    /**
     * Get creativeType
     * @return creativeType
     */
    public OASCreativeType creativeType { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'currency' => 'r_currency',
        'objective_type' => 'objectiveType',
        'billable_event' => 'billableEvent',
        'optimization_goal_metadata' => 'optimizationGoalMetadata',
        'creative_type' => 'creativeType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'currency' => 'r_currency',
        'objective_type' => 'objectiveType',
        'billable_event' => 'billableEvent',
        'optimization_goal_metadata' => 'optimizationGoalMetadata',
        'creative_type' => 'creativeType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'currency' => 'r_currency',
        'objective_type' => 'objectiveType',
        'billable_event' => 'billableEvent',
        'optimization_goal_metadata' => 'optimizationGoalMetadata',
        'creative_type' => 'creativeType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'currency' => 'r_currency',
        'objective_type' => 'objectiveType',
        'billable_event' => 'billableEvent',
        'optimization_goal_metadata' => 'optimizationGoalMetadata',
        'creative_type' => 'creativeType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'currency' => 'r_currency',
        'objective_type' => 'objectiveType',
        'billable_event' => 'billableEvent',
        'optimization_goal_metadata' => 'optimizationGoalMetadata',
        'creative_type' => 'creativeType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASBidFloorSpec() {
        countries = new List<OASCountry>();
    }

    public static OASBidFloorSpec getExample() {
        OASBidFloorSpec bidFloorSpec = new OASBidFloorSpec();
          bidFloorSpec.countries = new List<OASCountry>{OASCountry.getExample()};
          bidFloorSpec.r_currency = OASCurrency.getExample();
          bidFloorSpec.objectiveType = OASObjectiveType.getExample();
          bidFloorSpec.billableEvent = OASActionType.getExample();
          bidFloorSpec.optimizationGoalMetadata = OASOptimizationGoalMetadata.getExample();
          bidFloorSpec.creativeType = OASCreativeType.getExample();
        return bidFloorSpec;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASBidFloorSpec) {           
            OASBidFloorSpec bidFloorSpec = (OASBidFloorSpec) obj;
            return this.countries == bidFloorSpec.countries
                && this.r_currency == bidFloorSpec.r_currency
                && this.objectiveType == bidFloorSpec.objectiveType
                && this.billableEvent == bidFloorSpec.billableEvent
                && this.optimizationGoalMetadata == bidFloorSpec.optimizationGoalMetadata
                && this.creativeType == bidFloorSpec.creativeType;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (countries == null ? 0 : System.hashCode(countries));
        hashCode = (17 * hashCode) + (r_currency == null ? 0 : System.hashCode(r_currency));
        hashCode = (17 * hashCode) + (objectiveType == null ? 0 : System.hashCode(objectiveType));
        hashCode = (17 * hashCode) + (billableEvent == null ? 0 : System.hashCode(billableEvent));
        hashCode = (17 * hashCode) + (optimizationGoalMetadata == null ? 0 : System.hashCode(optimizationGoalMetadata));
        hashCode = (17 * hashCode) + (creativeType == null ? 0 : System.hashCode(creativeType));
        return hashCode;
    }
}

