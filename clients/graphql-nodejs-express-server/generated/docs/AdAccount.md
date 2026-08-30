# AdAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [***Country**](Country.md) |  | [optional] [default to null]
**createdTime** | **Int** |  Creation time. Unix timestamp in seconds. | [optional] [readonly] [default to null]
**currency** | [***Currency**](Currency.md) |  | [optional] [default to null]
**Id_** | **String!** |  | [default to null]
**name** | **String!** | Ad account name. | [optional] [default to null]
**owner** | [***AdAccountOwner**](AdAccountOwner.md) | Ad account owner | [optional] [readonly] [default to null]
**permissions** | [**BusinessAccessRole**](BusinessAccessRole.md) |  | [optional] [readonly] [default to null]
**timeZone** | **String!** | The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. | [optional] [default to null]
**updatedTime** | **Int** |  | [optional] [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


