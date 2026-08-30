# AdAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**OpenAPI\Server\Model\Country**](Country.md) |  | [optional] 
**createdTime** | **int** | Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**currency** | [**OpenAPI\Server\Model\Currency**](Currency.md) |  | [optional] 
**id** | **string** |  | 
**name** | **string** | Ad account name. | [optional] 
**owner** | [**OpenAPI\Server\Model\AdAccountOwner**](AdAccountOwner.md) | Ad account owner | [optional] [readonly] 
**permissions** | [**OpenAPI\Server\Model\BusinessAccessRole**](BusinessAccessRole.md) |  | [optional] [readonly] 
**timeZone** | **string** | The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. | [optional] 
**updatedTime** | **int** |  | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


