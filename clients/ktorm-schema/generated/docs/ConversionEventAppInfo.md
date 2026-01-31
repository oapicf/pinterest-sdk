
# Table `ConversionEventAppInfo`
(mapped from: ConversionEventAppInfo)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**appId** | app_id | text |  | **kotlin.String** | App ID in Google Play Store, AppStore or other stores. |  [optional]
**appName** | app_name | text |  | **kotlin.String** | Name of the app. Primarily used for Mobile Apps. |  [optional]
**appPackageName** | app_package_name | text |  | **kotlin.String** | App package name |  [optional]
**appStore** | app_store | text |  | **kotlin.String** | The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps |  [optional]
**appVersion** | app_version | text |  | **kotlin.String** | App version. Primarily used for mobile apps |  [optional]
**installTime** | install_time | int UNSIGNED |  | **kotlin.Int** | App install time. Unix timestamp in seconds |  [optional]
**userAgent** | user_agent | text |  | **kotlin.String** | User Agent request header. Primarily used for Web events |  [optional]
**windowHeight** | window_height | int UNSIGNED |  | **kotlin.Int** | Inner height of the window or viewport. |  [optional]
**windowWidth** | window_width | int UNSIGNED |  | **kotlin.Int** | Inner width of the window or viewport. |  [optional]











