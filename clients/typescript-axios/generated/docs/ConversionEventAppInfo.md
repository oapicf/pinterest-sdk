# ConversionEventAppInfo

Object containing information about the application where event occurred.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_id** | **string** | App ID in Google Play Store, AppStore or other stores. | [optional] [default to undefined]
**app_name** | **string** | Name of the app. Primarily used for Mobile Apps. | [optional] [default to undefined]
**app_package_name** | **string** | App package name | [optional] [default to undefined]
**app_store** | **string** | The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps | [optional] [default to undefined]
**app_version** | **string** | App version. Primarily used for mobile apps | [optional] [default to undefined]
**install_time** | **number** | App install time. Unix timestamp in seconds | [optional] [default to undefined]
**user_agent** | **string** | User Agent request header. Primarily used for Web events | [optional] [default to undefined]
**window_height** | **number** | Inner height of the window or viewport. | [optional] [default to undefined]
**window_width** | **number** | Inner width of the window or viewport. | [optional] [default to undefined]

## Example

```typescript
import { ConversionEventAppInfo } from './api';

const instance: ConversionEventAppInfo = {
    app_id,
    app_name,
    app_package_name,
    app_store,
    app_version,
    install_time,
    user_agent,
    window_height,
    window_width,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
