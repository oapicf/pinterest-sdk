# PinterestSdkClient::ConversionEventAppInfo

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** | App ID in Google Play Store, AppStore or other stores. | [optional] |
| **app_name** | **String** | Name of the app. Primarily used for Mobile Apps. | [optional] |
| **app_package_name** | **String** | App package name | [optional] |
| **app_store** | **String** | The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps | [optional] |
| **app_version** | **String** | App version. Primarily used for mobile apps | [optional] |
| **install_time** | **Integer** | App install time. Unix timestamp in seconds | [optional] |
| **user_agent** | **String** | User Agent request header. Primarily used for Web events | [optional] |
| **window_height** | **Integer** | Inner height of the window or viewport. | [optional] |
| **window_width** | **Integer** | Inner width of the window or viewport. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionEventAppInfo.new(
  app_id: 429047995,
  app_name: MyAwesomeApp,
  app_package_name: com.company.myawesomeapp,
  app_store: Google Play Store,
  app_version: 7.9,
  install_time: 1739222269,
  user_agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36,
  window_height: 900,
  window_width: 1678
)
```

