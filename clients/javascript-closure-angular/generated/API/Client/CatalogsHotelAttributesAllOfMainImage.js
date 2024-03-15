goog.provide('API.Client.CatalogsHotelAttributes_allOf_main_image');

/**
 * The main hotel image
 * @record
 */
API.Client.CatalogsHotelAttributesAllOfMainImage = function() {}

/**
 * <p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p>
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributesAllOfMainImage.prototype.link;

/**
 * Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsHotelAttributesAllOfMainImage.prototype.tag;

