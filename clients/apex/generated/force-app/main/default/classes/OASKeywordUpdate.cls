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
 * OASKeywordUpdate
 */
public class OASKeywordUpdate {
    /**
     * Keyword ID.
     * @return id
     */
    public String id { get; set; }

    /**
     * Is keyword archived?
     * @return archived
     */
    public Boolean archived { get; set; }

    /**
     * </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
     * @return bid
     */
    public Integer bid { get; set; }

    public static OASKeywordUpdate getExample() {
        OASKeywordUpdate keywordUpdate = new OASKeywordUpdate();
          keywordUpdate.id = '2886364308355';
          keywordUpdate.archived = false;
          keywordUpdate.bid = 0;
        return keywordUpdate;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASKeywordUpdate) {           
            OASKeywordUpdate keywordUpdate = (OASKeywordUpdate) obj;
            return this.id == keywordUpdate.id
                && this.archived == keywordUpdate.archived
                && this.bid == keywordUpdate.bid;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (archived == null ? 0 : System.hashCode(archived));
        hashCode = (17 * hashCode) + (bid == null ? 0 : System.hashCode(bid));
        return hashCode;
    }
}

