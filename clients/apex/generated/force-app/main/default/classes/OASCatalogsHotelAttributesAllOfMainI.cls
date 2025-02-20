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
 * The main hotel image
 */
public class OASCatalogsHotelAttributesAllOfMainI {
    /**
     * <p><= 2000 characters</p>\n<p>The link to the main hotel image. Image should be at least\n75x75 pixels to avoid errors. Use the additional_image_link field to add\nmore images of your hotel. The URL of your main_image.link must be accessible\nby the Pinterest user-agent, and send the accurate image. Please make\nsure there is no template or placeholder image at the link. Must start\nwith http:// or https://.</p>
     * @return link
     */
    public String link { get; set; }

    /**
     * Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
     * @return tag
     */
    public List<String> tag { get; set; }

    public OASCatalogsHotelAttributesAllOfMainI() {
        tag = new List<String>();
    }

    public static OASCatalogsHotelAttributesAllOfMainI getExample() {
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage = new OASCatalogsHotelAttributesAllOfMainI();
          catalogsHotelAttributesAllOfMainImage.link = '';
          catalogsHotelAttributesAllOfMainImage.tag = new List<String>{''};
        return catalogsHotelAttributesAllOfMainImage;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCatalogsHotelAttributesAllOfMainI) {           
            OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage = (OASCatalogsHotelAttributesAllOfMainI) obj;
            return this.link == catalogsHotelAttributesAllOfMainImage.link
                && this.tag == catalogsHotelAttributesAllOfMainImage.tag;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (link == null ? 0 : System.hashCode(link));
        hashCode = (17 * hashCode) + (tag == null ? 0 : System.hashCode(tag));
        return hashCode;
    }
}

