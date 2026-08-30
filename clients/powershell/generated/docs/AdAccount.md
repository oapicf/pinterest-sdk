# AdAccount
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | [optional] 
**CreatedTime** | **Int32** |  Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**Currency** | [**Currency**](Currency.md) |  | [optional] 
**Id** | **String** |  | 
**Name** | **String** | Ad account name. | [optional] 
**Owner** | [**AdAccountOwner**](AdAccountOwner.md) | Ad account owner | [optional] [readonly] 
**Permissions** | [**BusinessAccessRole[]**](BusinessAccessRole.md) |  | [optional] [readonly] 
**TimeZone** | **String** | The time zone of the ad account, in IANA format (e.g., &quot;&quot;America/Los_Angeles&quot;&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. | [optional] 
**UpdatedTime** | **Int32** |  | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$AdAccount = Initialize-PSOpenAPIToolsAdAccount  -Country null `
 -CreatedTime null `
 -Currency null `
 -Id null `
 -Name null `
 -Owner null `
 -Permissions null `
 -TimeZone America/Los_Angeles `
 -UpdatedTime null
```

- Convert the resource to JSON
```powershell
$AdAccount | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

