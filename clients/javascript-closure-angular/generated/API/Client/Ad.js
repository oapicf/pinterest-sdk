goog.provide('API.Client.Ad');

/**
 * @record
 */
API.Client.Ad = function() {}

/**
 * The ID of the advertiser that this ad belongs to.
 * @type {!string}
 * @export
 */
API.Client.Ad.prototype.adAccountId;

/**
 * ID of the ad group that contains the ad.
 * @type {!string}
 * @export
 */
API.Client.Ad.prototype.adGroupId;

/**
 * Deep link URL for Android devices.
 * @type {!string}
 * @export
 */
API.Client.Ad.prototype.androidDeepLink;

/**
 * ID of the ad campaign that contains this ad.
 * @type {!string}
 * @export
 */
API.Client.Ad.prototype.campaignId;

/**
 * Comma-separated deep links for the carousel pin on Android.
 * @type {!Array<!string>}
 * @export
 */
API.Client.Ad.prototype.carouselAndroidDeepLinks;

/**
 * Comma-separated destination URLs for the carousel pin to promote.
 * @type {!Array<!string>}
 * @export
 */
API.Client.Ad.prototype.carouselDestinationUrls;

/**
 * Comma-separated deep links for the carousel pin on iOS.
 * @type {!Array<!string>}
 * @export
 */
API.Client.Ad.prototype.carouselIosDeepLinks;

/**
 * The vendor platform type of the carting/WTB ad.
 * @type {!number}
 * @export
 */
API.Client.Ad.prototype.cartingPlatformType;

/**
 * Array of carting/WTB products for the ad.
 * @type {!Array<!API.Client.CartingProduct>}
 * @export
 */
API.Client.Ad.prototype.cartingProducts;

/**
 * Tracking url for the ad clicks.
 * @type {!string}
 * @export
 */
API.Client.Ad.prototype.clickTrackingUrl;

/**
 * Destination URL template for all items within a collections drawer.
 * @type {!string}
 * @export
 */
API.Client.Ad.prototype.collectionItemsDestinationUrlTemplate;

/**
 * @type {!API.Client.AdCollectionsHeaderType}
 * @export
 */
API.Client.Ad.prototype.collectionsHeaderType;

/**
 * Pin creation time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.Ad.prototype.createdTime;

/**
 * @type {!API.Client.CreativeType}
 * @export
 */
API.Client.Ad.prototype.creativeType;

/**
 * @type {!API.Client.CustomizableCTAType}
 * @export
 */
API.Client.Ad.prototype.customizableCtaType;

/**
 * Destination URL.
 * @type {!string}
 * @export
 */
API.Client.Ad.prototype.destinationUrl;

/**
 * @type {!API.Client.DisclosureType}
 * @export
 */
API.Client.Ad.prototype.disclosureType;

/**
 * URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
 * @type {!string}
 * @export
 */
API.Client.Ad.prototype.disclosureUrl;

/**
 * @type {!API.Client.GridClickType}
 * @export
 */
API.Client.Ad.prototype.gridClickType;

/**
 * The ID of this ad.
 * @type {!string}
 * @export
 */
API.Client.Ad.prototype.id;

/**
 * Deep link URL for iOS devices.
 * @type {!string}
 * @export
 */
API.Client.Ad.prototype.iosDeepLink;

/**
 * Is the ad a carting/WTB ad?
 * @type {!boolean}
 * @export
 */
API.Client.Ad.prototype.isCarting;

/**
 * Whether the advertiser has accepted the terms and conditions for collage ad.
 * @type {!boolean}
 * @export
 */
API.Client.Ad.prototype.isCollageAcceptedTerms;

/**
 * Whether the collage ad has a single destination url override.
 * @type {!boolean}
 * @export
 */
API.Client.Ad.prototype.isCollageSingleDestination;

/**
 * Is original pin deleted?
 * @type {!boolean}
 * @export
 */
API.Client.Ad.prototype.isPinDeleted;

/**
 * Is pin repinnable?
 * @type {!boolean}
 * @export
 */
API.Client.Ad.prototype.isRemovable;

/**
 * Lead form ID for lead ad generation.
 * @type {!string}
 * @export
 */
API.Client.Ad.prototype.leadFormId;

/**
 * Name of the ad - 255 chars max.
 * @type {!string}
 * @export
 */
API.Client.Ad.prototype.name;

/**
 * Pin ID. This field may only be updated for draft ads.
 * @type {!string}
 * @export
 */
API.Client.Ad.prototype.pinId;

/**
 * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 * @type {!API.Client.QuizPinData}
 * @export
 */
API.Client.Ad.prototype.quizPinData;

/**
 * Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
 * @type {!Array<!API.Client.AdDisapprovalReasons>}
 * @export
 */
API.Client.Ad.prototype.rejectedReasons;

/**
 * Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
 * @type {!Array<!string>}
 * @export
 */
API.Client.Ad.prototype.rejectionLabels;

/**
 * Ad review status
 * @type {!API.Client.AdReviewStatus}
 * @export
 */
API.Client.Ad.prototype.reviewStatus;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.Ad.prototype.status;

/**
 * Ad summary status
 * @type {!API.Client.PinPromotionSummaryStatus}
 * @export
 */
API.Client.Ad.prototype.summaryStatus;

/**
 * @type {!API.Client.TrackingUrls}
 * @export
 */
API.Client.Ad.prototype.trackingUrls;

/**
 * Always \"ad\".
 * @type {!string}
 * @export
 */
API.Client.Ad.prototype.type;

/**
 * Last update time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.Ad.prototype.updatedTime;

/**
 * Tracking URL for ad impressions.
 * @type {!string}
 * @export
 */
API.Client.Ad.prototype.viewTrackingUrl;

