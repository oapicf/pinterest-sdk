goog.provide('API.Client.AdPreviewShopping');

/**
 * Ad preview from a catalog product group (shopping).
 * @record
 */
API.Client.AdPreviewShopping = function() {}

/**
 * Catalog Product Group Id.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewShopping.prototype.catalogProductGroupId;

/**
 * Ad format of the shopping ad preview.
 * @type {!API.Client.AdShoppingPreviewCreativeType}
 * @export
 */
API.Client.AdPreviewShopping.prototype.creativeType;

/**
 * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
 * @type {!API.Client.CustomizableCTAType}
 * @export
 */
API.Client.AdPreviewShopping.prototype.customizableCtaType;

/**
 * Title displayed below ad.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewShopping.prototype.heroImageTitle;

/**
 * Hero image URL.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewShopping.prototype.heroImageUrl;

/**
 * Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewShopping.prototype.heroPinId;

/**
 * Multi image template tag.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewShopping.prototype.imageTag;

/**
 * Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewShopping.prototype.itemId;

/**
 * Preferred media type.
 * @type {!API.Client.BasePreferredMediaType}
 * @export
 */
API.Client.AdPreviewShopping.prototype.preferredMediaType;

/**
 * Include promotion data in preview when available on catalog item. Defaults to false.
 * @type {!boolean}
 * @export
 */
API.Client.AdPreviewShopping.prototype.showPromotion;

/**
 * Multi video template tag, image_tag and video_tag are mutual exclusive.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewShopping.prototype.videoTag;

