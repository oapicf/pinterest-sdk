goog.provide('API.Client.CatalogsAiContentDisclosure');

/**
 * AI content disclosure for a single asset of a catalog item.
 * @record
 */
API.Client.CatalogsAiContentDisclosure = function() {}

/**
 * Disclosure labels that apply to this asset.
 * @type {!Array<!API.Client.CatalogsAiContentDisclosureLabel>}
 * @export
 */
API.Client.CatalogsAiContentDisclosure.prototype.disclosure;

/**
 * URL of the asset. Must match one of image_link, additional_image_link, or video_link.
 * @type {!string}
 * @export
 */
API.Client.CatalogsAiContentDisclosure.prototype.url;

