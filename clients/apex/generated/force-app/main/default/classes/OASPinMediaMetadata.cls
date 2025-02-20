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
 * OASPinMediaMetadata
 */
public class OASPinMediaMetadata implements OASImageMetadata, OASVideoMetadata, OAS.MappedProperties {
    /**
     * Get itemType
     * @return itemType
     */
    public String itemType { get; set; }

    /**
     * Get title
     * @return title
     */
    public String title { get; set; }

    /**
     * Get description
     * @return description
     */
    public String description { get; set; }

    /**
     * Get link
     * @return link
     */
    public String link { get; set; }

    /**
     * Get images
     * @return images
     */
    public OASImageMetadataImages images { get; set; }

    /**
     * Get coverImageUrl
     * @return coverImageUrl
     */
    public String coverImageUrl { get; set; }

    /**
     * Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
     * @return videoUrl
     */
    public String videoUrl { get; set; }

    /**
     * Duration (in milliseconds)
     * @return duration
     */
    public Double duration { get; set; }

    /**
     * Height (in pixels)
     * @return height
     */
    public Integer height { get; set; }

    /**
     * Width (in pixels)
     * @return width
     */
    public Integer width { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'item_type' => 'itemType',
        'cover_image_url' => 'coverImageUrl',
        'video_url' => 'videoUrl'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'item_type' => 'itemType',
        'cover_image_url' => 'coverImageUrl',
        'video_url' => 'videoUrl'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'item_type' => 'itemType',
        'cover_image_url' => 'coverImageUrl',
        'video_url' => 'videoUrl'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASPinMediaMetadata getExample() {
        OASPinMediaMetadata pinMediaMetadata = new OASPinMediaMetadata();
          pinMediaMetadata.itemType = '';
          pinMediaMetadata.title = '';
          pinMediaMetadata.description = '';
          pinMediaMetadata.link = '';
          pinMediaMetadata.images = OASImageMetadataImages.getExample();
          pinMediaMetadata.coverImageUrl = '';
          pinMediaMetadata.videoUrl = '';
          pinMediaMetadata.duration = 1.3579;
          pinMediaMetadata.height = 0;
          pinMediaMetadata.width = 0;
        return pinMediaMetadata;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASPinMediaMetadata) {           
            OASPinMediaMetadata pinMediaMetadata = (OASPinMediaMetadata) obj;
            return this.itemType == pinMediaMetadata.itemType
                && this.title == pinMediaMetadata.title
                && this.description == pinMediaMetadata.description
                && this.link == pinMediaMetadata.link
                && this.images == pinMediaMetadata.images
                && this.coverImageUrl == pinMediaMetadata.coverImageUrl
                && this.videoUrl == pinMediaMetadata.videoUrl
                && this.duration == pinMediaMetadata.duration
                && this.height == pinMediaMetadata.height
                && this.width == pinMediaMetadata.width;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (itemType == null ? 0 : System.hashCode(itemType));
        hashCode = (17 * hashCode) + (title == null ? 0 : System.hashCode(title));
        hashCode = (17 * hashCode) + (description == null ? 0 : System.hashCode(description));
        hashCode = (17 * hashCode) + (link == null ? 0 : System.hashCode(link));
        hashCode = (17 * hashCode) + (images == null ? 0 : System.hashCode(images));
        hashCode = (17 * hashCode) + (coverImageUrl == null ? 0 : System.hashCode(coverImageUrl));
        hashCode = (17 * hashCode) + (videoUrl == null ? 0 : System.hashCode(videoUrl));
        hashCode = (17 * hashCode) + (duration == null ? 0 : System.hashCode(duration));
        hashCode = (17 * hashCode) + (height == null ? 0 : System.hashCode(height));
        hashCode = (17 * hashCode) + (width == null ? 0 : System.hashCode(width));
        return hashCode;
    }
}

