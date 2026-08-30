goog.provide('API.Client.CatalogsHotelMainImage');

/**
 * The main hotel image
 * @record
 */
API.Client.CatalogsHotelMainImage = function() {}

/**
 * <= 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelMainImage.prototype.link;

/**
 * Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsHotelMainImage.prototype.tag;

