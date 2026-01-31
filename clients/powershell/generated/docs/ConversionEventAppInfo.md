# ConversionEventAppInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AppId** | **String** | App ID in Google Play Store, AppStore or other stores. | [optional] 
**AppName** | **String** | Name of the app. Primarily used for Mobile Apps. | [optional] 
**AppPackageName** | **String** | App package name | [optional] 
**AppStore** | **String** | The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps | [optional] 
**AppVersion** | **String** | App version. Primarily used for mobile apps | [optional] 
**InstallTime** | **Int32** | App install time. Unix timestamp in seconds | [optional] 
**UserAgent** | **String** | User Agent request header. Primarily used for Web events | [optional] 
**WindowHeight** | **Int32** | Inner height of the window or viewport. | [optional] 
**WindowWidth** | **Int32** | Inner width of the window or viewport. | [optional] 

## Examples

- Prepare the resource
```powershell
$ConversionEventAppInfo = Initialize-PSOpenAPIToolsConversionEventAppInfo  -AppId 429047995 `
 -AppName MyAwesomeApp `
 -AppPackageName com.company.myawesomeapp `
 -AppStore Google Play Store `
 -AppVersion 7.9 `
 -InstallTime 1739222269 `
 -UserAgent Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36 `
 -WindowHeight 900 `
 -WindowWidth 1678
```

- Convert the resource to JSON
```powershell
$ConversionEventAppInfo | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

