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
 * OASProductGroupPromotionsList200Resp
 */
public class OASProductGroupPromotionsList200Resp implements OASPaginated {
    /**
     * Get items
     * @return items
     */
    public List<OASProductGroupPromotionResponseItem> items { get; set; }

    /**
     * Get bookmark
     * @return bookmark
     */
    public String bookmark { get; set; }

    public OASProductGroupPromotionsList200Resp() {
        items = new List<OASProductGroupPromotionResponseItem>();
    }

    public static OASProductGroupPromotionsList200Resp getExample() {
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response = new OASProductGroupPromotionsList200Resp();
          productGroupPromotionsList200Response.items = new List<OASProductGroupPromotionResponseItem>{OASProductGroupPromotionResponseItem.getExample()};
          productGroupPromotionsList200Response.bookmark = '';
        return productGroupPromotionsList200Response;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASProductGroupPromotionsList200Resp) {           
            OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response = (OASProductGroupPromotionsList200Resp) obj;
            return this.items == productGroupPromotionsList200Response.items
                && this.bookmark == productGroupPromotionsList200Response.bookmark;
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
