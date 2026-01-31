goog.provide('API.Client.ConversionEvents_data_inner');

/**
 * @record
 */
API.Client.ConversionEventsDataInner = function() {}

/**
 * <p>The source indicating where the conversion event occurred.</p> - `app_android` - `app_ios` - `web` - `offline`
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.actionSource;

/**
 * The app store app ID.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.appId;

/**
 * @type {!API.Client.ConversionEventAppInfo}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.appInfo;

/**
 * Name of the app.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.appName;

/**
 * Version of the app.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.appVersion;

/**
 * @type {!API.Client.ConversionEvents_data_inner_custom_data}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.customData;

/**
 * Brand of the user device.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.deviceBrand;

/**
 * User device's mobile carrier.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.deviceCarrier;

/**
 * @type {!API.Client.ConversionEventDeviceInfo}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.deviceInfo;

/**
 * Model of the user device.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.deviceModel;

/**
 * Type of the user device.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.deviceType;

/**
 * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.eventId;

/**
 * <p>The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.</p>  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `checkout` - `custom` - `initiate_checkout` - `lead` - `page_visit` - `search` - `signup` - `subscribe` - `view_category` - `view_content` - `watch_video`
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.eventName;

/**
 * URL of the web conversion event.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.eventSourceUrl;

/**
 * The time when the event happened. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.eventTime;

/**
 * Two-character ISO-639-1 language code indicating the user's language.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.language;

/**
 * When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.optOut;

/**
 * Version of the device operating system.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.osVersion;

/**
 * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.partnerName;

/**
 * @type {!API.Client.ConversionEventsUserData}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.userData;

/**
 * Whether the event occurred when the user device was connected to wifi.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.wifi;

