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
 * OASCatalogsFeedIngestionDetails
 */
public class OASCatalogsFeedIngestionDetails {
    /**
     * Get errors
     * @return errors
     */
    public OASCatalogsFeedIngestionErrors errors { get; set; }

    /**
     * Get info
     * @return info
     */
    public OASCatalogsFeedIngestionInfo info { get; set; }

    /**
     * Get warnings
     * @return warnings
     */
    public OASCatalogsFeedIngestionWarnings warnings { get; set; }

    public static OASCatalogsFeedIngestionDetails getExample() {
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails = new OASCatalogsFeedIngestionDetails();
          catalogsFeedIngestionDetails.errors = OASCatalogsFeedIngestionErrors.getExample();
          catalogsFeedIngestionDetails.info = OASCatalogsFeedIngestionInfo.getExample();
          catalogsFeedIngestionDetails.warnings = OASCatalogsFeedIngestionWarnings.getExample();
        return catalogsFeedIngestionDetails;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCatalogsFeedIngestionDetails) {           
            OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails = (OASCatalogsFeedIngestionDetails) obj;
            return this.errors == catalogsFeedIngestionDetails.errors
                && this.info == catalogsFeedIngestionDetails.info
                && this.warnings == catalogsFeedIngestionDetails.warnings;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (errors == null ? 0 : System.hashCode(errors));
        hashCode = (17 * hashCode) + (info == null ? 0 : System.hashCode(info));
        hashCode = (17 * hashCode) + (warnings == null ? 0 : System.hashCode(warnings));
        return hashCode;
    }
}
