# Org.OpenAPITools.Model.AdAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | 
**Country** | **Country** |  | [optional] 
**CreatedTime** | **int** |  Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**Currency** | **Currency** |  | [optional] 
**Name** | **string** | Ad account name. | [optional] 
**Owner** | [**AdAccountOwner**](AdAccountOwner.md) | Ad account owner | [optional] [readonly] 
**Permissions** | [**List&lt;BusinessAccessRole&gt;**](BusinessAccessRole.md) |  | [optional] [readonly] 
**VarTimeZone** | **string** | The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. | [optional] 
**UpdatedTime** | **int** |  | [optional] [readonly] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

