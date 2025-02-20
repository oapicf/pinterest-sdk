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
 * OASAdsCreditsDiscountsGet200Response
 */
public class OASAdsCreditsDiscountsGet200Response implements OASPaginated {
    /**
     * Get items
     * @return items
     */
    public List<OASAdsCreditDiscountsResponse> items { get; set; }

    /**
     * Get bookmark
     * @return bookmark
     */
    public String bookmark { get; set; }

    public OASAdsCreditsDiscountsGet200Response() {
        items = new List<OASAdsCreditDiscountsResponse>();
    }

    public static OASAdsCreditsDiscountsGet200Response getExample() {
        OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response = new OASAdsCreditsDiscountsGet200Response();
          adsCreditsDiscountsGet200Response.items = new List<OASAdsCreditDiscountsResponse>{OASAdsCreditDiscountsResponse.getExample()};
          adsCreditsDiscountsGet200Response.bookmark = '';
        return adsCreditsDiscountsGet200Response;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASAdsCreditsDiscountsGet200Response) {           
            OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response = (OASAdsCreditsDiscountsGet200Response) obj;
            return this.items == adsCreditsDiscountsGet200Response.items
                && this.bookmark == adsCreditsDiscountsGet200Response.bookmark;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (items == null ? 0 : System.hashCode(items));
        hashCode = (17 * hashCode) + (bookmark == null ? 0 : System.hashCode(bookmark));
        return hashCode;
    }
}

