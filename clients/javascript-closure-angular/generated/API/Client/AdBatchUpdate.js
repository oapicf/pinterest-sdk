goog.provide('API.Client.AdBatchUpdate');

/**
 * @record
 */
API.Client.AdBatchUpdate = function() {}

/**
 * ID of the ad group that contains the ad.
 * @type {!string}
 * @export
 */
API.Client.AdBatchUpdate.prototype.adGroupId;

/**
 * Deep link URL for Android devices.
 * @type {!string}
 * @export
 */
API.Client.AdBatchUpdate.prototype.androidDeepLink;

/**
 * Comma-separated deep links for the carousel pin on Android.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdBatchUpdate.prototype.carouselAndroidDeepLinks;

/**
 * Comma-separated destination URLs for the carousel pin to promote.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdBatchUpdate.prototype.carouselDestinationUrls;

/**
 * Comma-separated deep links for the carousel pin on iOS.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdBatchUpdate.prototype.carouselIosDeepLinks;

/**
 * Tracking url for the ad clicks.
 * @type {!string}
 * @export
 */
API.Client.AdBatchUpdate.prototype.clickTrackingUrl;

/**
 * Destination URL template for all items within a collections drawer.
 * @type {!string}
 * @export
 */
API.Client.AdBatchUpdate.prototype.collectionItemsDestinationUrlTemplate;

/**
 * @type {!API.Client.AdCollectionsHeaderType}
 * @export
 */
API.Client.AdBatchUpdate.prototype.collectionsHeaderType;

/**
 * @type {!API.Client.CreativeType}
 * @export
 */
API.Client.AdBatchUpdate.prototype.creativeType;

/**
 * @type {!API.Client.CustomizableCTAType}
 * @export
 */
API.Client.AdBatchUpdate.prototype.customizableCtaType;

/**
 * Destination URL.
 * @type {!string}
 * @export
 */
API.Client.AdBatchUpdate.prototype.destinationUrl;

/**
 * @type {!API.Client.DisclosureType}
 * @export
 */
API.Client.AdBatchUpdate.prototype.disclosureType;

/**
 * URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
 * @type {!string}
 * @export
 */
API.Client.AdBatchUpdate.prototype.disclosureUrl;

/**
 * @type {!API.Client.GridClickType}
 * @export
 */
API.Client.AdBatchUpdate.prototype.gridClickType;

/**
 * The ID of this ad.
 * @type {!string}
 * @export
 */
API.Client.AdBatchUpdate.prototype.id;

/**
 * Deep link URL for iOS devices.
 * @type {!string}
 * @export
 */
API.Client.AdBatchUpdate.prototype.iosDeepLink;

/**
 * Is the ad a carting/WTB ad?
 * @type {!boolean}
 * @export
 */
API.Client.AdBatchUpdate.prototype.isCarting;

/**
 * Whether the advertiser has accepted the terms and conditions for collage ad.
 * @type {!boolean}
 * @export
 */
API.Client.AdBatchUpdate.prototype.isCollageAcceptedTerms;

/**
 * Whether the collage ad has a single destination url override.
 * @type {!boolean}
 * @export
 */
API.Client.AdBatchUpdate.prototype.isCollageSingleDestination;

/**
 * Is original pin deleted?
 * @type {!boolean}
 * @export
 */
API.Client.AdBatchUpdate.prototype.isPinDeleted;

/**
 * Is pin repinnable?
 * @type {!boolean}
 * @export
 */
API.Client.AdBatchUpdate.prototype.isRemovable;

/**
 * Lead form ID for lead ad generation.
 * @type {!string}
 * @export
 */
API.Client.AdBatchUpdate.prototype.leadFormId;

/**
 * Name of the ad - 255 chars max.
 * @type {!string}
 * @export
 */
API.Client.AdBatchUpdate.prototype.name;

/**
 * Pin ID. This field may only be updated for draft ads.
 * @type {!string}
 * @export
 */
API.Client.AdBatchUpdate.prototype.pinId;

/**
 * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 * @type {!API.Client.QuizPinData}
 * @export
 */
API.Client.AdBatchUpdate.prototype.quizPinData;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.AdBatchUpdate.prototype.status;

/**
 * @type {!API.Client.TrackingUrls}
 * @export
 */
API.Client.AdBatchUpdate.prototype.trackingUrls;

/**
 * Tracking URL for ad impressions.
 * @type {!string}
 * @export
 */
API.Client.AdBatchUpdate.prototype.viewTrackingUrl;

