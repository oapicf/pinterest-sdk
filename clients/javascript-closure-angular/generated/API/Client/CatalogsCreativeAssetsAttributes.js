goog.provide('API.Client.CatalogsCreativeAssetsAttributes');

/**
 * @record
 */
API.Client.CatalogsCreativeAssetsAttributes = function() {}

/**
 * Link to the creative assets page.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsAttributes.prototype.androidDeepLink;

/**
 * Custom grouping of creative assets.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsAttributes.prototype.customLabel0;

/**
 * Custom grouping of creative assets.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsAttributes.prototype.customLabel1;

/**
 * Custom grouping of creative assets.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsAttributes.prototype.customLabel2;

/**
 * Custom grouping of creative assets.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsAttributes.prototype.customLabel3;

/**
 * Custom grouping of creative assets.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsAttributes.prototype.customLabel4;

/**
 * Brief description of the creative assets.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsAttributes.prototype.description;

/**
 * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsAttributes.prototype.googleProductCategory;

/**
 * IOS deep link to the creative assets page.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsAttributes.prototype.iosDeepLink;

/**
 * Link to the creative assets page.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsAttributes.prototype.link;

/**
 * The name of the creative assets.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsAttributes.prototype.title;

/**
 * Visibility of the creative assets. Must be one of the following values (upper or lowercase): 'visible', 'hidden'.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsAttributes.prototype.visibility;

/**
 * AI content disclosures for individual assets (image_link or video_link) on this creative assets item. Each entry declares which disclosure types apply to a single asset URL.
 * @type {!Array<!API.Client.CatalogsAiContentDisclosure>}
 * @export
 */
API.Client.CatalogsCreativeAssetsAttributes.prototype.aiDisclosures;

/**
 * The creative assets image.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsAttributes.prototype.imageLink;

/**
 * The creative assets video.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsAttributes.prototype.videoLink;

