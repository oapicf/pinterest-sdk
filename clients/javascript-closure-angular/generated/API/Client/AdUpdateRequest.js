goog.provide('API.Client.AdUpdateRequest');

/**
 * @record
 */
API.Client.AdUpdateRequest = function() {}

/**
 * ID of the ad group that contains the ad.
 * @type {!string}
 * @export
 */
API.Client.AdUpdateRequest.prototype.adGroupId;

/**
 * Deep link URL for Android devices.
 * @type {!string}
 * @export
 */
API.Client.AdUpdateRequest.prototype.androidDeepLink;

/**
 * Comma-separated deep links for the carousel pin on Android.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdUpdateRequest.prototype.carouselAndroidDeepLinks;

/**
 * Comma-separated destination URLs for the carousel pin to promote.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdUpdateRequest.prototype.carouselDestinationUrls;

/**
 * Comma-separated deep links for the carousel pin on iOS.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdUpdateRequest.prototype.carouselIosDeepLinks;

/**
 * Tracking url for the ad clicks.
 * @type {!string}
 * @export
 */
API.Client.AdUpdateRequest.prototype.clickTrackingUrl;

/**
 * @type {!API.Client.CreativeType}
 * @export
 */
API.Client.AdUpdateRequest.prototype.creativeType;

/**
 * @type {!API.Client.CustomizableCTAType}
 * @export
 */
API.Client.AdUpdateRequest.prototype.customizableCtaType;

/**
 * Destination URL.
 * @type {!string}
 * @export
 */
API.Client.AdUpdateRequest.prototype.destinationUrl;

/**
 * @type {!API.Client.DisclosureType}
 * @export
 */
API.Client.AdUpdateRequest.prototype.disclosureType;

/**
 * URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
 * @type {!string}
 * @export
 */
API.Client.AdUpdateRequest.prototype.disclosureUrl;

/**
 * @type {!API.Client.GridClickType}
 * @export
 */
API.Client.AdUpdateRequest.prototype.gridClickType;

/**
 * Deep link URL for iOS devices.
 * @type {!string}
 * @export
 */
API.Client.AdUpdateRequest.prototype.iosDeepLink;

/**
 * Is original pin deleted?
 * @type {!boolean}
 * @export
 */
API.Client.AdUpdateRequest.prototype.isPinDeleted;

/**
 * Is pin repinnable?
 * @type {!boolean}
 * @export
 */
API.Client.AdUpdateRequest.prototype.isRemovable;

/**
 * Lead form ID for lead ad generation.
 * @type {!string}
 * @export
 */
API.Client.AdUpdateRequest.prototype.leadFormId;

/**
 * Name of the ad - 255 chars max.
 * @type {!string}
 * @export
 */
API.Client.AdUpdateRequest.prototype.name;

/**
 * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 * @type {!API.Client.QuizPinData}
 * @export
 */
API.Client.AdUpdateRequest.prototype.quizPinData;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.AdUpdateRequest.prototype.status;

/**
 * @type {!API.Client.TrackingUrls}
 * @export
 */
API.Client.AdUpdateRequest.prototype.trackingUrls;

/**
 * Tracking URL for ad impressions.
 * @type {!string}
 * @export
 */
API.Client.AdUpdateRequest.prototype.viewTrackingUrl;

/**
 * The ID of this ad.
 * @type {!string}
 * @export
 */
API.Client.AdUpdateRequest.prototype.id;

/**
 * Pin ID. This field may only be updated for draft ads.
 * @type {!string}
 * @export
 */
API.Client.AdUpdateRequest.prototype.pinId;

