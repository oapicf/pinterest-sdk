goog.provide('API.Client.AdPreviewRequest');

/**
 * @record
 */
API.Client.AdPreviewRequest = function() {}

/**
 * Image URL.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewRequest.prototype.imageUrl;

/**
 * Title displayed below ad.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewRequest.prototype.title;

/**
 * Pin ID.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewRequest.prototype.pinId;

/**
 * Catalog Product Group Id.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewRequest.prototype.catalogProductGroupId;

/**
 * Ad format of the shopping ad preview.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewRequest.prototype.creativeType;

/**
 * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
 * @type {!API.Client.CustomizableCTAType}
 * @export
 */
API.Client.AdPreviewRequest.prototype.customizableCtaType;

/**
 * Title displayed below ad.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewRequest.prototype.heroImageTitle;

/**
 * Hero image URL.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewRequest.prototype.heroImageUrl;

/**
 * Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewRequest.prototype.heroPinId;

/**
 * Multi image template tag.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewRequest.prototype.imageTag;

/**
 * Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewRequest.prototype.itemId;

/**
 * Preferred media type.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewRequest.prototype.preferredMediaType;

/**
 * Multi video template tag, image_tag and video_tag are mutual exclusive.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewRequest.prototype.videoTag;

/** @enum {string} */
API.Client.AdPreviewRequest.CreativeTypeEnum = { 
  SHOPPING: 'SHOPPING',
  CAROUSEL: 'CAROUSEL',
  COLLECTION: 'COLLECTION',
  REGULAR: 'REGULAR',
}
/** @enum {string} */
API.Client.AdPreviewRequest.PreferredMediaTypeEnum = { 
  VIDEO: 'VIDEO',
  IMAGE: 'IMAGE',
}
