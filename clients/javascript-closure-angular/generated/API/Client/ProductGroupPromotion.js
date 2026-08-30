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
 * ID of the catalogs product group that this product group promotion references (required for create operations)
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
 * @type {!API.Client.CollectionsHeaderType}
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
 * @type {!API.Client.ProductGroupPromotionCustomizableCTAType}
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
 * ID of the product group promotion (required for update operations).
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
 * Set to `TRUE` to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance.
 * @type {!boolean}
 * @export
 */
API.Client.ProductGroupPromotion.prototype.isImageAutoResizing;

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
 * @type {!API.Client.PreferredMediaType}
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

