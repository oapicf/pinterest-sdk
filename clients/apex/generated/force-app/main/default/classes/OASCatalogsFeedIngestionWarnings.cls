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
 * OASCatalogsFeedIngestionWarnings
 */
public class OASCatalogsFeedIngestionWarnings {
    /**
     * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
     * @return ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR
     */
    public Integer ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR { get; set; }

    /**
     * Additional image files are unreadable. Please upload new files to continue.
     * @return ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE
     */
    public Integer ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE { get; set; }

    /**
     * Additional image files are unreadable. Please check your link and upload new files to continue.
     * @return ADDITIONAL_IMAGE_MALFORMED_URL
     */
    public Integer ADDITIONAL_IMAGE_MALFORMED_URL { get; set; }

    /**
     * Additional image files are unreadable. Please upload new files to continue.
     * @return ADDITIONAL_IMAGE_FILE_NOT_FOUND
     */
    public Integer ADDITIONAL_IMAGE_FILE_NOT_FOUND { get; set; }

    /**
     * Additional image files are unreadable. Please upload new files to continue.
     * @return ADDITIONAL_IMAGE_INVALID_FILE
     */
    public Integer ADDITIONAL_IMAGE_INVALID_FILE { get; set; }

    /**
     * price is not a supported column. Use base_price and sale_price instead.
     * @return HOTEL_PRICE_HEADER_IS_PRESENT
     */
    public Integer HOTEL_PRICE_HEADER_IS_PRESENT { get; set; }

    public static OASCatalogsFeedIngestionWarnings getExample() {
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings = new OASCatalogsFeedIngestionWarnings();
          catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR = 0;
          catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE = 0;
          catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_MALFORMED_URL = 0;
          catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_FILE_NOT_FOUND = 0;
          catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_INVALID_FILE = 0;
          catalogsFeedIngestionWarnings.HOTEL_PRICE_HEADER_IS_PRESENT = 0;
        return catalogsFeedIngestionWarnings;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCatalogsFeedIngestionWarnings) {           
            OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings = (OASCatalogsFeedIngestionWarnings) obj;
            return this.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR == catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR
                && this.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE == catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE
                && this.ADDITIONAL_IMAGE_MALFORMED_URL == catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_MALFORMED_URL
                && this.ADDITIONAL_IMAGE_FILE_NOT_FOUND == catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_FILE_NOT_FOUND
                && this.ADDITIONAL_IMAGE_INVALID_FILE == catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_INVALID_FILE
                && this.HOTEL_PRICE_HEADER_IS_PRESENT == catalogsFeedIngestionWarnings.HOTEL_PRICE_HEADER_IS_PRESENT;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR == null ? 0 : System.hashCode(ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR));
        hashCode = (17 * hashCode) + (ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE == null ? 0 : System.hashCode(ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE));
        hashCode = (17 * hashCode) + (ADDITIONAL_IMAGE_MALFORMED_URL == null ? 0 : System.hashCode(ADDITIONAL_IMAGE_MALFORMED_URL));
        hashCode = (17 * hashCode) + (ADDITIONAL_IMAGE_FILE_NOT_FOUND == null ? 0 : System.hashCode(ADDITIONAL_IMAGE_FILE_NOT_FOUND));
        hashCode = (17 * hashCode) + (ADDITIONAL_IMAGE_INVALID_FILE == null ? 0 : System.hashCode(ADDITIONAL_IMAGE_INVALID_FILE));
        hashCode = (17 * hashCode) + (HOTEL_PRICE_HEADER_IS_PRESENT == null ? 0 : System.hashCode(HOTEL_PRICE_HEADER_IS_PRESENT));
        return hashCode;
    }
}

