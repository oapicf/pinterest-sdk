goog.provide('API.Client.ProductGroupPromotion');

/**
 * @record
 */
API.Client.ProductGroupPromotion = function() {}

/**
 * ID of the product group promotion.
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.id;

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
 * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
 * @type {!boolean}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.included;

/**
 * The full product group definition path
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.definition;

/**
 * The definition of the product group, relative to its parent - an attribute name/value pair
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.relativeDefinition;

/**
 * The parent Product Group ID of this Product Group
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.parentId;

/**
 * Slideshow Collections Title
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.slideshowCollectionsTitle;

/**
 * Slideshow Collections Description
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.slideshowCollectionsDescription;

/**
 * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
 * @type {!boolean}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.isMdl;

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
 * @type {!API.Client.CreativeType}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.creativeType;

/**
 * Hero Pin ID if this PG is promoted as a Collection
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.collectionsHeroPinId;

/**
 * Collections Hero Destination Url
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.collectionsHeroDestinationUrl;

/**
 * @type {!API.Client.GridClickType}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.gridClickType;

