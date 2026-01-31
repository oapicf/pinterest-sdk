
package org.openapitools.client.model


case class ConversionEventAppInfo (
    /* App ID in Google Play Store, AppStore or other stores. */
    _appId: Option[String],
    /* Name of the app. Primarily used for Mobile Apps. */
    _appName: Option[String],
    /* App package name */
    _appPackageName: Option[String],
    /* The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps */
    _appStore: Option[String],
    /* App version. Primarily used for mobile apps */
    _appVersion: Option[String],
    /* App install time. Unix timestamp in seconds */
    _installTime: Option[Integer],
    /* User Agent request header. Primarily used for Web events */
    _userAgent: Option[String],
    /* Inner height of the window or viewport. */
    _windowHeight: Option[Integer],
    /* Inner width of the window or viewport. */
    _windowWidth: Option[Integer]
)
object ConversionEventAppInfo {
    def toStringBody(var_appId: Object, var_appName: Object, var_appPackageName: Object, var_appStore: Object, var_appVersion: Object, var_installTime: Object, var_userAgent: Object, var_windowHeight: Object, var_windowWidth: Object) =
        s"""
        | {
        | "appId":$var_appId,"appName":$var_appName,"appPackageName":$var_appPackageName,"appStore":$var_appStore,"appVersion":$var_appVersion,"installTime":$var_installTime,"userAgent":$var_userAgent,"windowHeight":$var_windowHeight,"windowWidth":$var_windowWidth
        | }
        """.stripMargin
}
