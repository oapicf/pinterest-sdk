# AdAccountCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | [optional] 
**Currency** | [**Currency**](Currency.md) |  | [optional] 
**Name** | **String** | Ad account name. | [optional] 
**OwnerUserId** | **String** | Advertiser&#39;s owning user ID. | [optional] 
**TimeZone** | **String** | The time zone of the ad account, in IANA format (e.g., &quot;&quot;America/Los_Angeles&quot;&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. | [optional] 

## Examples

- Prepare the resource
```powershell
$AdAccountCreate = Initialize-PSOpenAPIToolsAdAccountCreate  -Country null `
 -Currency null `
 -Name null `
 -OwnerUserId null `
 -TimeZone America/Los_Angeles
```

- Convert the resource to JSON
```powershell
$AdAccountCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

