goog.provide('API.Client.ProductGroupPromotionCreateRequestElement');

/**
 * @record
 */
API.Client.ProductGroupPromotionCreateRequestElement = function() {}

/**
 * ID of the product group promotion.
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequestElement.prototype.id;

/**
 * ID of the ad group the product group belongs to.
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequestElement.prototype.adGroupId;

/**
 * The bid in micro currency.
 * @type {!number}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequestElement.prototype.bidInMicroCurrency;

/**
 * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
 * @type {!boolean}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequestElement.prototype.included;

/**
 * The full product group definition path
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequestElement.prototype.definition;

/**
 * The definition of the product group, relative to its parent - an attribute name/value pair
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequestElement.prototype.relativeDefinition;

/**
 * The parent Product Group ID of this Product Group
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequestElement.prototype.parentId;

/**
 * Slideshow Collections Title
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequestElement.prototype.slideshowCollectionsTitle;

/**
 * Slideshow Collections Description
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequestElement.prototype.slideshowCollectionsDescription;

/**
 * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
 * @type {!boolean}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequestElement.prototype.isMdl;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequestElement.prototype.status;

/**
 * Tracking template for proudct group promotions. 4000 limit
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequestElement.prototype.trackingUrl;

/**
 * ID of the catalogs product group that this product group promotion references
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequestElement.prototype.catalogProductGroupId;

/**
 * Catalogs product group name
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequestElement.prototype.catalogProductGroupName;

/**
 * Hero Pin ID if this PG is promoted as a Collection
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequestElement.prototype.collectionsHeroPinId;

/**
 * Collections Hero Destination Url
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequestElement.prototype.collectionsHeroDestinationUrl;

/**
 * @type {!API.Client.GridClickType}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequestElement.prototype.gridClickType;

/**
 * @type {!API.Client.CreativeType}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequestElement.prototype.creativeType;

