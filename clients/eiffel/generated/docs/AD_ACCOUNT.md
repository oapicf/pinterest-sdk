# AD_ACCOUNT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**COUNTRY**](Country.md) |  | [optional] [default to null]
**created_time** | **INTEGER_32** |  Creation time. Unix timestamp in seconds. | [optional] [readonly] [default to null]
**currency** | [**CURRENCY**](Currency.md) |  | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) |  | [default to null]
**name** | [**STRING_32**](STRING_32.md) | Ad account name. | [optional] [default to null]
**owner** | [**AD_ACCOUNT_OWNER**](AdAccountOwner.md) | Ad account owner | [optional] [readonly] [default to null]
**permissions** | [**LIST [BUSINESS_ACCESS_ROLE]**](BusinessAccessRole.md) |  | [optional] [readonly] [default to null]
**time_zone** | [**STRING_32**](STRING_32.md) | The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. | [optional] [default to null]
**updated_time** | **INTEGER_32** |  | [optional] [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


