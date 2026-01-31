goog.provide('API.Client.ConversionEventAppInfo');

/**
 * Object containing information about the application where event occurred.
 * @record
 */
API.Client.ConversionEventAppInfo = function() {}

/**
 * App ID in Google Play Store, AppStore or other stores.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventAppInfo.prototype.appId;

/**
 * Name of the app. Primarily used for Mobile Apps.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventAppInfo.prototype.appName;

/**
 * App package name
 * @type {!string}
 * @export
 */
API.Client.ConversionEventAppInfo.prototype.appPackageName;

/**
 * The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
 * @type {!string}
 * @export
 */
API.Client.ConversionEventAppInfo.prototype.appStore;

/**
 * App version. Primarily used for mobile apps
 * @type {!string}
 * @export
 */
API.Client.ConversionEventAppInfo.prototype.appVersion;

/**
 * App install time. Unix timestamp in seconds
 * @type {!number}
 * @export
 */
API.Client.ConversionEventAppInfo.prototype.installTime;

/**
 * User Agent request header. Primarily used for Web events
 * @type {!string}
 * @export
 */
API.Client.ConversionEventAppInfo.prototype.userAgent;

/**
 * Inner height of the window or viewport.
 * @type {!number}
 * @export
 */
API.Client.ConversionEventAppInfo.prototype.windowHeight;

/**
 * Inner width of the window or viewport.
 * @type {!number}
 * @export
 */
API.Client.ConversionEventAppInfo.prototype.windowWidth;

