goog.provide('API.Client.ProductGroupPromotionResponseElement');

/**
 * @record
 */
API.Client.ProductGroupPromotionResponseElement = function() {}

/**
 * ID of the product group promotion.
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionResponseElement.prototype.id;

/**
 * ID of the ad group the product group belongs to.
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionResponseElement.prototype.adGroupId;

/**
 * The bid in micro currency.
 * @type {!number}
 * @export
 */
API.Client.ProductGroupPromotionResponseElement.prototype.bidInMicroCurrency;

/**
 * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
 * @type {!boolean}
 * @export
 */
API.Client.ProductGroupPromotionResponseElement.prototype.included;

/**
 * The full product group definition path
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionResponseElement.prototype.definition;

/**
 * The definition of the product group, relative to its parent - an attribute name/value pair
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionResponseElement.prototype.relativeDefinition;

/**
 * The parent Product Group ID of this Product Group
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionResponseElement.prototype.parentId;

/**
 * Slideshow Collections Title
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionResponseElement.prototype.slideshowCollectionsTitle;

/**
 * Slideshow Collections Description
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionResponseElement.prototype.slideshowCollectionsDescription;

/**
 * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
 * @type {!boolean}
 * @export
 */
API.Client.ProductGroupPromotionResponseElement.prototype.isMdl;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.ProductGroupPromotionResponseElement.prototype.status;

/**
 * Tracking template for proudct group promotions. 4000 limit
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionResponseElement.prototype.trackingUrl;

/**
 * ID of the catalogs product group that this product group promotion references
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionResponseElement.prototype.catalogProductGroupId;

/**
 * Catalogs product group name
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionResponseElement.prototype.catalogProductGroupName;

/**
 * Hero Pin ID if this PG is promoted as a Collection
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionResponseElement.prototype.collectionsHeroPinId;

/**
 * Collections Hero Destination Url
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionResponseElement.prototype.collectionsHeroDestinationUrl;

/**
 * @type {!API.Client.GridClickType}
 * @export
 */
API.Client.ProductGroupPromotionResponseElement.prototype.gridClickType;

/**
 * @type {!API.Client.CreativeType}
 * @export
 */
API.Client.ProductGroupPromotionResponseElement.prototype.creativeType;

