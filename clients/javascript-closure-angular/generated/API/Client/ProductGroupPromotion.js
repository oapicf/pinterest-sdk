goog.provide('API.Client.ProductGroupPromotion');

/**
 * @record
 */
API.Client.ProductGroupPromotion = function() {}

/**
 * ID of the ad group the product group belongs to.
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.adGroupId;

/**
 * The bid in micro currency.
 * @type {!number}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.bidInMicroCurrency;

/**
 * ID of the catalogs product group that this product group promotion references
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.catalogProductGroupId;

/**
 * Catalogs product group name
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.catalogProductGroupName;

/**
 * Collections ad header type
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.collectionsHeaderType;

/**
 * Collections Hero Destination Url
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.collectionsHeroDestinationUrl;

/**
 * Hero Pin ID if this PG is promoted as a Collection
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.collectionsHeroPinId;

/**
 * @type {!API.Client.CreativeType}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.creativeType;

/**
 * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.customizableCtaType;

/**
 * The full product group definition path
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.definition;

/**
 * @type {!API.Client.GridClickType}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.gridClickType;

/**
 * ID of the product group promotion.
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.id;

/**
 * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
 * @type {!boolean}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.included;

/**
 * Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
 * @type {!boolean}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.isGenerateBackground;

/**
 * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
 * @type {!boolean}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.isMdl;

/**
 * The parent Product Group ID of this Product Group
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.parentId;

/**
 * Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.preferredMediaType;

/**
 * The definition of the product group, relative to its parent - an attribute name/value pair
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.relativeDefinition;

/**
 * The ad image tag selected for the product group promotion.
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.selectedImageTag;

/**
 * The ad video tag selected for the product group promotion.
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.selectedVideoTag;

/**
 * Slideshow Collections Description
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.slideshowCollectionsDescription;

/**
 * Slideshow Collections Title
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.slideshowCollectionsTitle;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.status;

/**
 * Tracking template for proudct group promotions. 4000 limit
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.trackingUrl;

/** @enum {string} */
API.Client.ProductGroupPromotion.CollectionsHeaderTypeEnum = { 
  SHOP_THIS_COLLECTION: 'SHOP_THIS_COLLECTION',
  EXPLORE_THIS_COLLECTION: 'EXPLORE_THIS_COLLECTION',
  NO_HEADER: 'NO_HEADER',
  ON_SALE: 'ON_SALE',
  GET_DEAL: 'GET_DEAL',
  : '',
}
/** @enum {string} */
API.Client.ProductGroupPromotion.CustomizableCtaTypeEnum = { 
  SHOP_NOW: 'SHOP_NOW',
  BOOK_NOW: 'BOOK_NOW',
  ON_SALE: 'ON_SALE',
  GET_DEAL: 'GET_DEAL',
  BUY_ONLINE_PICKUP_IN_STORE: 'BUY_ONLINE_PICKUP_IN_STORE',
  : '',
}
/** @enum {string} */
API.Client.ProductGroupPromotion.PreferredMediaTypeEnum = { 
  VIDEO: 'VIDEO',
  IMAGE: 'IMAGE',
  : '',
}
