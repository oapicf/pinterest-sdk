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
 * OASAdPreviewURLResponse
 */
public class OASAdPreviewURLResponse {
    /**
     * \'Preview URL, expires in 7 days. Can be used in an iframe.\nFor example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/\nThe preview object ID/key is the last param - 74667c814dd2b19\'
     * @return url
     */
    public String url { get; set; }

    public static OASAdPreviewURLResponse getExample() {
        OASAdPreviewURLResponse adPreviewURLResponse = new OASAdPreviewURLResponse();
          adPreviewURLResponse.url = 'https://ads.pinterest.com/ad-preview/58f1a0e9ab0bd0f99462a0e4c5dd7e8297888c8a36331e88f757abe8f0295d31/';
        return adPreviewURLResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASAdPreviewURLResponse) {           
            OASAdPreviewURLResponse adPreviewURLResponse = (OASAdPreviewURLResponse) obj;
            return this.url == adPreviewURLResponse.url;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (url == null ? 0 : System.hashCode(url));
        return hashCode;
    }
}

