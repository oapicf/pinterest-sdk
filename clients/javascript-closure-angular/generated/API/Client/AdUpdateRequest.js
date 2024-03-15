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
 * Deep link URL for Android devices. Not currently available. Using this field will generate an error.
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
 * Destination URL.
 * @type {!string}
 * @export
 */
API.Client.AdUpdateRequest.prototype.destinationUrl;

/**
 * Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
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
 * Name of the ad - 255 chars max.
 * @type {!string}
 * @export
 */
API.Client.AdUpdateRequest.prototype.name;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.AdUpdateRequest.prototype.status;

/**
 * @type {!API.Client.AdCommon_tracking_urls}
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
 * Lead form ID for lead ad generation.
 * @type {!string}
 * @export
 */
API.Client.AdUpdateRequest.prototype.leadFormId;

/**
 * @type {!API.Client.GridClickType}
 * @export
 */
API.Client.AdUpdateRequest.prototype.gridClickType;

/**
 * Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
 * @type {!string}
 * @export
 */
API.Client.AdUpdateRequest.prototype.customizableCtaType;

/**
 * @type {!API.Client.AdCommon_quiz_pin_data}
 * @export
 */
API.Client.AdUpdateRequest.prototype.quizPinData;

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

/** @enum {string} */
API.Client.AdUpdateRequest.CustomizableCtaTypeEnum = { 
  GET_OFFER: 'GET_OFFER',
  LEARN_MORE: 'LEARN_MORE',
  ORDER_NOW: 'ORDER_NOW',
  SHOP_NOW: 'SHOP_NOW',
  SIGN_UP: 'SIGN_UP',
  SUBSCRIBE: 'SUBSCRIBE',
  BUY_NOW: 'BUY_NOW',
  CONTACT_US: 'CONTACT_US',
  GET_QUOTE: 'GET_QUOTE',
  VISIT_WEBSITE: 'VISIT_WEBSITE',
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
