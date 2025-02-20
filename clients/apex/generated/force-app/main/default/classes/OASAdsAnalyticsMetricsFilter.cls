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
 * OASAdsAnalyticsMetricsFilter
 */
public class OASAdsAnalyticsMetricsFilter {
    /**
     * Get field
     * @return field
     */
    public OASAdsAnalyticsFilterColumn field { get; set; }

    /**
     * Get operator
     * @return operator
     */
    public OASAdsAnalyticsFilterOperator operator { get; set; }

    /**
     * List of values for filtering
     * @return values
     */
    public List<Double> values { get; set; }

    public OASAdsAnalyticsMetricsFilter() {
        values = new List<Double>();
    }

    public static OASAdsAnalyticsMetricsFilter getExample() {
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter = new OASAdsAnalyticsMetricsFilter();
          adsAnalyticsMetricsFilter.field = OASAdsAnalyticsFilterColumn.getExample();
          adsAnalyticsMetricsFilter.operator = OASAdsAnalyticsFilterOperator.getExample();
          adsAnalyticsMetricsFilter.values = new List<Double>{1.3579};
        return adsAnalyticsMetricsFilter;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASAdsAnalyticsMetricsFilter) {           
            OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter = (OASAdsAnalyticsMetricsFilter) obj;
            return this.field == adsAnalyticsMetricsFilter.field
                && this.operator == adsAnalyticsMetricsFilter.operator
                && this.values == adsAnalyticsMetricsFilter.values;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (field == null ? 0 : System.hashCode(field));
        hashCode = (17 * hashCode) + (operator == null ? 0 : System.hashCode(operator));
        hashCode = (17 * hashCode) + (values == null ? 0 : System.hashCode(values));
        return hashCode;
    }
}

