/*
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * OASTrendingKeywordsResponseTrendsInn
 */
public class OASTrendingKeywordsResponseTrendsInn implements OAS.MappedProperties {
    /**
     * The keyword that is trending.
     * @return keyword
     */
    public String keyword { get; set; }

    /**
     * The week-over-week percent change in search volume for this keyword.<br />\nFor example, a value of "50" would represent a 50% increase in searches in the last seven days compared to the week prior.<br />\n**Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
     * @return pctGrowthWow
     */
    public Integer pctGrowthWow { get; set; }

    /**
     * The month-over-month percent change in search volume for this keyword.<br />\nFor example, a value of "400" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br />\n**Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
     * @return pctGrowthMom
     */
    public Integer pctGrowthMom { get; set; }

    /**
     * The year-over-year percent change in search volume for this keyword.<br />\nFor example, a value of "-5" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br />\n**Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
     * @return pctGrowthYoy
     */
    public Integer pctGrowthYoy { get; set; }

    /**
     * Get timeSeries
     * @return timeSeries
     */
    public OASTrendingKeywordsResponseTrendsInn timeSeries { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'pct_growth_wow' => 'pctGrowthWow',
        'pct_growth_mom' => 'pctGrowthMom',
        'pct_growth_yoy' => 'pctGrowthYoy',
        'time_series' => 'timeSeries'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'pct_growth_wow' => 'pctGrowthWow',
        'pct_growth_mom' => 'pctGrowthMom',
        'pct_growth_yoy' => 'pctGrowthYoy',
        'time_series' => 'timeSeries'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'pct_growth_wow' => 'pctGrowthWow',
        'pct_growth_mom' => 'pctGrowthMom',
        'pct_growth_yoy' => 'pctGrowthYoy',
        'time_series' => 'timeSeries'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'pct_growth_wow' => 'pctGrowthWow',
        'pct_growth_mom' => 'pctGrowthMom',
        'pct_growth_yoy' => 'pctGrowthYoy',
        'time_series' => 'timeSeries'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASTrendingKeywordsResponseTrendsInn getExample() {
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner = new OASTrendingKeywordsResponseTrendsInn();
          trendingKeywordsResponseTrendsInner.keyword = 'couples halloween costumes';
          trendingKeywordsResponseTrendsInner.pctGrowthWow = 50;
          trendingKeywordsResponseTrendsInner.pctGrowthMom = 400;
          trendingKeywordsResponseTrendsInner.pctGrowthYoy = -5;
          trendingKeywordsResponseTrendsInner.timeSeries = OASTrendingKeywordsResponseTrendsInn.getExample();
        return trendingKeywordsResponseTrendsInner;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASTrendingKeywordsResponseTrendsInn) {           
            OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner = (OASTrendingKeywordsResponseTrendsInn) obj;
            return this.keyword == trendingKeywordsResponseTrendsInner.keyword
                && this.pctGrowthWow == trendingKeywordsResponseTrendsInner.pctGrowthWow
                && this.pctGrowthMom == trendingKeywordsResponseTrendsInner.pctGrowthMom
                && this.pctGrowthYoy == trendingKeywordsResponseTrendsInner.pctGrowthYoy
                && this.timeSeries == trendingKeywordsResponseTrendsInner.timeSeries;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (keyword == null ? 0 : System.hashCode(keyword));
        hashCode = (17 * hashCode) + (pctGrowthWow == null ? 0 : System.hashCode(pctGrowthWow));
        hashCode = (17 * hashCode) + (pctGrowthMom == null ? 0 : System.hashCode(pctGrowthMom));
        hashCode = (17 * hashCode) + (pctGrowthYoy == null ? 0 : System.hashCode(pctGrowthYoy));
        hashCode = (17 * hashCode) + (timeSeries == null ? 0 : System.hashCode(timeSeries));
        return hashCode;
    }
}
