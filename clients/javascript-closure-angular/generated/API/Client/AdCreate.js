goog.provide('API.Client.AdCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.AdCreate = function() {}

/**
 * ID of the ad group that contains the ad.
 * @type {!string}
 * @export
 */
API.Client.AdCreate.prototype.adGroupId;

/**
 * Deep link URL for Android devices.
 * @type {!string}
 * @export
 */
API.Client.AdCreate.prototype.androidDeepLink;

/**
 * Comma-separated deep links for the carousel pin on Android.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdCreate.prototype.carouselAndroidDeepLinks;

/**
 * Comma-separated destination URLs for the carousel pin to promote.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdCreate.prototype.carouselDestinationUrls;

/**
 * Comma-separated deep links for the carousel pin on iOS.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdCreate.prototype.carouselIosDeepLinks;

/**
 * Tracking url for the ad clicks.
 * @type {!string}
 * @export
 */
API.Client.AdCreate.prototype.clickTrackingUrl;

/**
 * Destination URL template for all items within a collections drawer.
 * @type {!string}
 * @export
 */
API.Client.AdCreate.prototype.collectionItemsDestinationUrlTemplate;

/**
 * @type {!API.Client.AdCollectionsHeaderType}
 * @export
 */
API.Client.AdCreate.prototype.collectionsHeaderType;

/**
 * @type {!API.Client.CreativeType}
 * @export
 */
API.Client.AdCreate.prototype.creativeType;

/**
 * @type {!API.Client.CustomizableCTAType}
 * @export
 */
API.Client.AdCreate.prototype.customizableCtaType;

/**
 * Destination URL.
 * @type {!string}
 * @export
 */
API.Client.AdCreate.prototype.destinationUrl;

/**
 * @type {!API.Client.DisclosureType}
 * @export
 */
API.Client.AdCreate.prototype.disclosureType;

/**
 * URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
 * @type {!string}
 * @export
 */
API.Client.AdCreate.prototype.disclosureUrl;

/**
 * @type {!API.Client.GridClickType}
 * @export
 */
API.Client.AdCreate.prototype.gridClickType;

/**
 * Deep link URL for iOS devices.
 * @type {!string}
 * @export
 */
API.Client.AdCreate.prototype.iosDeepLink;

/**
 * Is the ad a carting/WTB ad?
 * @type {!boolean}
 * @export
 */
API.Client.AdCreate.prototype.isCarting;

/**
 * Whether the advertiser has accepted the terms and conditions for collage ad.
 * @type {!boolean}
 * @export
 */
API.Client.AdCreate.prototype.isCollageAcceptedTerms;

/**
 * Whether the collage ad has a single destination url override.
 * @type {!boolean}
 * @export
 */
API.Client.AdCreate.prototype.isCollageSingleDestination;

/**
 * Is original pin deleted?
 * @type {!boolean}
 * @export
 */
API.Client.AdCreate.prototype.isPinDeleted;

/**
 * Is pin repinnable?
 * @type {!boolean}
 * @export
 */
API.Client.AdCreate.prototype.isRemovable;

/**
 * Lead form ID for lead ad generation.
 * @type {!string}
 * @export
 */
API.Client.AdCreate.prototype.leadFormId;

/**
 * Name of the ad - 255 chars max.
 * @type {!string}
 * @export
 */
API.Client.AdCreate.prototype.name;

/**
 * Pin ID. This field may only be updated for draft ads.
 * @type {!string}
 * @export
 */
API.Client.AdCreate.prototype.pinId;

/**
 * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 * @type {!API.Client.QuizPinData}
 * @export
 */
API.Client.AdCreate.prototype.quizPinData;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.AdCreate.prototype.status;

/**
 * @type {!API.Client.TrackingUrls}
 * @export
 */
API.Client.AdCreate.prototype.trackingUrls;

/**
 * Tracking URL for ad impressions.
 * @type {!string}
 * @export
 */
API.Client.AdCreate.prototype.viewTrackingUrl;

