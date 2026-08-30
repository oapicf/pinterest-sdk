goog.provide('API.Client.ConversionEventsDataItems');

/**
 * @record
 */
API.Client.ConversionEventsDataItems = function() {}

/**
 * The source indicating where the conversion event occurred. - `app_android` - `app_ios` - `web` - `offline`
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.actionSource;

/**
 * The app store app ID.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.appId;

/**
 * @type {!API.Client.ConversionEventAppInfo}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.appInfo;

/**
 * Name of the app.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.appName;

/**
 * Version of the app.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.appVersion;

/**
 * @type {!API.Client.ConversionEventsDataItemsCustomData}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.customData;

/**
 * Brand of the user device.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.deviceBrand;

/**
 * User device's mobile carrier.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.deviceCarrier;

/**
 * @type {!API.Client.ConversionEventDeviceInfo}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.deviceInfo;

/**
 * Model of the user device.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.deviceModel;

/**
 * Type of the user device.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.deviceType;

/**
 * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.eventId;

/**
 * The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `app_open` - `checkout` - `contact` - `custom` - `customize_product` - `find_location` - `initiate_checkout` - `lead` - `page_visit` - `schedule` - `search` - `signup` - `start_trial` - `submit_application` - `subscribe` - `view_category` - `view_content` - `watch_video`
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.eventName;

/**
 * URL of the web conversion event.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.eventSourceUrl;

/**
 * The time when the event happened. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.eventTime;

/**
 * Two-character ISO-639-1 language code indicating the user's language.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.language;

/**
 * When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.optOut;

/**
 * Version of the device operating system.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.osVersion;

/**
 * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g 'ss-shopify'
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.partnerName;

/**
 * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
 * @type {!API.Client.ConversionEventsUserDataProperties}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.userData;

/**
 * Whether the event occurred when the user device was connected to wifi.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionEventsDataItems.prototype.wifi;

