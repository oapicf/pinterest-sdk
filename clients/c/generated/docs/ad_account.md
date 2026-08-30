# ad_account_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **country_t \*** |  | [optional] 
**created_time** | **int** |  Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**currency** | **currency_t \*** |  | [optional] 
**id** | **char \*** |  | 
**name** | **char \*** | Ad account name. | [optional] 
**owner** | [**ad_account_owner_t**](ad_account_owner.md) \* | Ad account owner | [optional] [readonly] 
**permissions** | [**list_t**](business_access_role.md) \* |  | [optional] [readonly] 
**time_zone** | **char \*** | The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. | [optional] 
**updated_time** | **int** |  | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


