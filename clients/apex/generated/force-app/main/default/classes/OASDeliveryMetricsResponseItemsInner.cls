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
 * OASDeliveryMetricsResponseItemsInner
 */
public class OASDeliveryMetricsResponseItemsInner implements OAS.MappedProperties {
    /**
     * Metric\'s name.
     * @return name
     */
    public String name { get; set; }

    /**
     * Category name
     */
    public enum CategoryEnum {
        ADS,
        ORGANIC
    }

    /**
     * Category name
     * @return category
     */
    public CategoryEnum category { get; set; }

    /**
     * How the metric is defined.
     * @return definition
     */
    public String definition { get; set; }

    /**
     * Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
     * @return displayName
     */
    public String displayName { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'display_name' => 'displayName'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASDeliveryMetricsResponseItemsInner getExample() {
        OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner = new OASDeliveryMetricsResponseItemsInner();
          deliveryMetricsResponseItemsInner.name = 'AD_GROUP_ID';
          deliveryMetricsResponseItemsInner.category = CategoryEnum.ADS;
          deliveryMetricsResponseItemsInner.definition = 'Unique ID for your ad group';
          deliveryMetricsResponseItemsInner.displayName = 'Ad group ID';
        return deliveryMetricsResponseItemsInner;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASDeliveryMetricsResponseItemsInner) {           
            OASDeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner = (OASDeliveryMetricsResponseItemsInner) obj;
            return this.name == deliveryMetricsResponseItemsInner.name
                && this.category == deliveryMetricsResponseItemsInner.category
                && this.definition == deliveryMetricsResponseItemsInner.definition
                && this.displayName == deliveryMetricsResponseItemsInner.displayName;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (category == null ? 0 : System.hashCode(category));
        hashCode = (17 * hashCode) + (definition == null ? 0 : System.hashCode(definition));
        hashCode = (17 * hashCode) + (displayName == null ? 0 : System.hashCode(displayName));
        return hashCode;
    }
}

