goog.provide('API.Client.AdResponse');

/**
 * @record
 */
API.Client.AdResponse = function() {}

/**
 * ID of the ad group that contains the ad.
 * @type {!string}
 * @export
 */
API.Client.AdResponse.prototype.adGroupId;

/**
 * Deep link URL for Android devices.
 * @type {!string}
 * @export
 */
API.Client.AdResponse.prototype.androidDeepLink;

/**
 * Comma-separated deep links for the carousel pin on Android.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdResponse.prototype.carouselAndroidDeepLinks;

/**
 * Comma-separated destination URLs for the carousel pin to promote.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdResponse.prototype.carouselDestinationUrls;

/**
 * Comma-separated deep links for the carousel pin on iOS.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdResponse.prototype.carouselIosDeepLinks;

/**
 * Tracking url for the ad clicks.
 * @type {!string}
 * @export
 */
API.Client.AdResponse.prototype.clickTrackingUrl;

/**
 * @type {!API.Client.CreativeType}
 * @export
 */
API.Client.AdResponse.prototype.creativeType;

/**
 * Destination URL.
 * @type {!string}
 * @export
 */
API.Client.AdResponse.prototype.destinationUrl;

/**
 * Deep link URL for iOS devices.
 * @type {!string}
 * @export
 */
API.Client.AdResponse.prototype.iosDeepLink;

/**
 * Is original pin deleted?
 * @type {!boolean}
 * @export
 */
API.Client.AdResponse.prototype.isPinDeleted;

/**
 * Is pin repinnable?
 * @type {!boolean}
 * @export
 */
API.Client.AdResponse.prototype.isRemovable;

/**
 * Name of the ad - 255 chars max.
 * @type {!string}
 * @export
 */
API.Client.AdResponse.prototype.name;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.AdResponse.prototype.status;

/**
 * @type {!API.Client.TrackingUrls}
 * @export
 */
API.Client.AdResponse.prototype.trackingUrls;

/**
 * Tracking URL for ad impressions.
 * @type {!string}
 * @export
 */
API.Client.AdResponse.prototype.viewTrackingUrl;

/**
 * Lead form ID for lead ad generation.
 * @type {!string}
 * @export
 */
API.Client.AdResponse.prototype.leadFormId;

/**
 * @type {!API.Client.GridClickType}
 * @export
 */
API.Client.AdResponse.prototype.gridClickType;

/**
 * Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
 * @type {!string}
 * @export
 */
API.Client.AdResponse.prototype.customizableCtaType;

/**
 * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 * @type {!API.Client.QuizPinData}
 * @export
 */
API.Client.AdResponse.prototype.quizPinData;

/**
 * Pin ID.
 * @type {!string}
 * @export
 */
API.Client.AdResponse.prototype.pinId;

/**
 * The ID of the advertiser that this ad belongs to.
 * @type {!string}
 * @export
 */
API.Client.AdResponse.prototype.adAccountId;

/**
 * ID of the ad campaign that contains this ad.
 * @type {!string}
 * @export
 */
API.Client.AdResponse.prototype.campaignId;

/**
 * Destination URL template for all items within a collections drawer.
 * @type {!string}
 * @export
 */
API.Client.AdResponse.prototype.collectionItemsDestinationUrlTemplate;

/**
 * Pin creation time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.AdResponse.prototype.createdTime;

/**
 * The ID of this ad.
 * @type {!string}
 * @export
 */
API.Client.AdResponse.prototype.id;

/**
 * Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdResponse.prototype.rejectedReasons;

/**
 * Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdResponse.prototype.rejectionLabels;

/**
 * Ad review status
 * @type {!string}
 * @export
 */
API.Client.AdResponse.prototype.reviewStatus;

/**
 * Always \"ad\".
 * @type {!string}
 * @export
 */
API.Client.AdResponse.prototype.type;

/**
 * Last update time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.AdResponse.prototype.updatedTime;

/**
 * Ad summary status
 * @type {!API.Client.PinPromotionSummaryStatus}
 * @export
 */
API.Client.AdResponse.prototype.summaryStatus;

/** @enum {string} */
API.Client.AdResponse.CustomizableCtaTypeEnum = { 
  GET_OFFER: 'GET_OFFER',
  LEARN_MORE: 'LEARN_MORE',
  ORDER_NOW: 'ORDER_NOW',
  SHOP_NOW: 'SHOP_NOW',
  SIGN_UP: 'SIGN_UP',
  SUBSCRIBE: 'SUBSCRIBE',
  BUY_NOW: 'BUY_NOW',
  CONTACT_US: 'CONTACT_US',
  GET_QUOTE: 'GET_QUOTE',
  VISIT_SITE: 'VISIT_SITE',
  APPLY_NOW: 'APPLY_NOW',
  BOOK_NOW: 'BOOK_NOW',
  REQUEST_DEMO: 'REQUEST_DEMO',
  REGISTER_NOW: 'REGISTER_NOW',
  FIND_A_DEALER: 'FIND_A_DEALER',
  ADD_TO_CART: 'ADD_TO_CART',
  WATCH_NOW: 'WATCH_NOW',
  READ_MORE: 'READ_MORE',
  : '',
}
/** @enum {string} */
API.Client.AdResponse.Array&lt;!RejectedReasonsEnum&gt; = { 
  HASHTAGS: 'HASHTAGS',
  PROMOTIONS_AND_PRICES: 'PROMOTIONS_AND_PRICES',
  TARGETING: 'TARGETING',
  LANDING_PAGE: 'LANDING_PAGE',
  CAPS_AND_SYMBOLS: 'CAPS_AND_SYMBOLS',
  SHOCKING: 'SHOCKING',
  WEIGHT_LOSS: 'WEIGHT_LOSS',
  PROHIBITED_PRODUCT: 'PROHIBITED_PRODUCT',
  AUTHENTICITY: 'AUTHENTICITY',
  NUDITY: 'NUDITY',
  CONFUSING_DESIGN: 'CONFUSING_DESIGN',
  URGENCY: 'URGENCY',
  RATINGS: 'RATINGS',
  APP: 'APP',
  ALCOHOL: 'ALCOHOL',
  CONTESTS: 'CONTESTS',
  POLITICAL: 'POLITICAL',
  OTHER: 'OTHER',
  IMAGE: 'IMAGE',
  NAR: 'NAR',
  INCONSISTENT: 'INCONSISTENT',
  CLICKBAIT: 'CLICKBAIT',
  NO_DESCRIPTION: 'NO_DESCRIPTION',
  LOW_QUALITY: 'LOW_QUALITY',
  EXAGGERATED_CLAIMS: 'EXAGGERATED_CLAIMS',
  PINTEREST_BRAND: 'PINTEREST_BRAND',
  ALCOHOL_NO_SALE: 'ALCOHOL_NO_SALE',
  LANDING_PAGE_SPEED: 'LANDING_PAGE_SPEED',
  LANDING_PAGE_HARDWALL: 'LANDING_PAGE_HARDWALL',
  LANDING_PAGE_BROKEN: 'LANDING_PAGE_BROKEN',
  LANDING_PAGE_QUALITY: 'LANDING_PAGE_QUALITY',
  OUT_OF_STOCK: 'OUT_OF_STOCK',
  IMAGE_LOW_QUALITY: 'IMAGE_LOW_QUALITY',
  IMAGE_BUSY: 'IMAGE_BUSY',
  IMAGE_POORLY_EDITED: 'IMAGE_POORLY_EDITED',
  IMAGE_BEFORE_AFTER: 'IMAGE_BEFORE_AFTER',
  UGC: 'UGC',
  FAKE_BUTTONS: 'FAKE_BUTTONS',
  WEAPONS: 'WEAPONS',
  SENSITIVE: 'SENSITIVE',
  UNACCEPTABLE_BUSINESS: 'UNACCEPTABLE_BUSINESS',
  SUSPICIOUS_CLAIMS: 'SUSPICIOUS_CLAIMS',
  PHARMA: 'PHARMA',
  SUSPICIOUS_SUPPLEMENTS: 'SUSPICIOUS_SUPPLEMENTS',
  ILLEGAL_RECREATIONAL_DRUG: 'ILLEGAL_RECREATIONAL_DRUG',
  LOW_QUALITY_LANDING_PAGE: 'LOW_QUALITY_LANDING_PAGE',
  RESTRICTED_HEALTHCARE: 'RESTRICTED_HEALTHCARE',
  INCONSISTENT_LANG_FR: 'INCONSISTENT_LANG_FR',
}
/** @enum {string} */
API.Client.AdResponse.ReviewStatusEnum = { 
  OTHER: 'OTHER',
  PENDING: 'PENDING',
  REJECTED: 'REJECTED',
  APPROVED: 'APPROVED',
}
