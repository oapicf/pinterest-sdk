goog.provide('API.Client.ConversionEvents_data_inner');

/**
 * @record
 */
API.Client.ConversionEventsDataInner = function() {}

/**
 * <p>The type of the user event. Please use the right event_name otherwise the event won't be accepted and show up correctly in reports.   <ul>   <li><code>add_to_cart</code></li>   <li><code>checkout</code></li>   <li><code>custom</code></li>   <li><code>lead</code></li>   <li><code>page_visit</code></li>   <li><code>search</code></li>   <li><code>signup</code></li>   <li><code>view_category</code></li>   <li><code>watch_video</code></li>   </ul> </p> 
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.eventName;

/**
 * <p>   The source indicating where the conversion event occurred.   <ul>     <li><code>app_android</code></li>     <li><code>app_ios</code></li>     <li><code>web</code></li>     <li><code>offline</code></li>   </ul> </p> 
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.actionSource;

/**
 * The time when the event happened. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.eventTime;

/**
 * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.eventId;

/**
 * URL of the web conversion event.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.eventSourceUrl;

/**
 * When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.optOut;

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
 * @type {!API.Client.ConversionEvents_data_inner_custom_data}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.customData;

/**
 * The app store app ID.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.appId;

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
 * Version of the device operating system.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.osVersion;

/**
 * Whether the event occurred when the user device was connected to wifi.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.wifi;

/**
 * Two-character ISO-639-1 language code indicating the user's language.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInner.prototype.language;

