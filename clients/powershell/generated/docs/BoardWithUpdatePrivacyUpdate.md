# BoardWithUpdatePrivacyUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **String** |  | [optional] 
**Name** | **String** |     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes &quot;&quot;Ad-only Pins&quot;&quot;. | [optional] 
**Privacy** | [**BoardUpdatePrivacy**](BoardUpdatePrivacy.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BoardWithUpdatePrivacyUpdate = Initialize-PSOpenAPIToolsBoardWithUpdatePrivacyUpdate  -Description My favorite summer recipes `
 -Name Summer recipes `
 -Privacy null
```

- Convert the resource to JSON
```powershell
$BoardWithUpdatePrivacyUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

