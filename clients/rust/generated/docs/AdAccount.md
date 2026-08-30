# AdAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | Option<[**models::Country**](Country.md)> |  | [optional]
**created_time** | Option<**i32**> |  Creation time. Unix timestamp in seconds. | [optional][readonly]
**currency** | Option<[**models::Currency**](Currency.md)> |  | [optional]
**id** | **String** |  | 
**name** | Option<**String**> | Ad account name. | [optional]
**owner** | Option<[**models::AdAccountOwner**](AdAccountOwner.md)> | Ad account owner | [optional][readonly]
**permissions** | Option<[**Vec<models::BusinessAccessRole>**](BusinessAccessRole.md)> |  | [optional][readonly]
**time_zone** | Option<**String**> | The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. | [optional]
**updated_time** | Option<**i32**> |  | [optional][readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


