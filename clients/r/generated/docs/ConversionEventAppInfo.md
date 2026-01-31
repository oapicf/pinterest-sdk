# openapi::ConversionEventAppInfo

Object containing information about the application where event occurred.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_id** | **character** | App ID in Google Play Store, AppStore or other stores. | [optional] [Max. length: 200] 
**app_name** | **character** | Name of the app. Primarily used for Mobile Apps. | [optional] [Max. length: 200] 
**app_package_name** | **character** | App package name | [optional] [Max. length: 200] 
**app_store** | **character** | The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps | [optional] [Max. length: 100] 
**app_version** | **character** | App version. Primarily used for mobile apps | [optional] [Max. length: 100] 
**install_time** | **integer** | App install time. Unix timestamp in seconds | [optional] [Min: 0] 
**user_agent** | **character** | User Agent request header. Primarily used for Web events | [optional] [Max. length: 16384] 
**window_height** | **integer** | Inner height of the window or viewport. | [optional] [Max: 30720] [Min: 0] 
**window_width** | **integer** | Inner width of the window or viewport. | [optional] [Max: 30720] [Min: 0] 


