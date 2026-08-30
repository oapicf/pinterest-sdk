# AdAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**\OpenAPI\Client\Model\Country**](Country.md) |  | [optional]
**created_time** | **int** | Creation time. Unix timestamp in seconds. | [optional] [readonly]
**currency** | [**\OpenAPI\Client\Model\Currency**](Currency.md) |  | [optional]
**id** | **string** |  |
**name** | **string** | Ad account name. | [optional]
**owner** | [**\OpenAPI\Client\Model\AdAccountOwner**](AdAccountOwner.md) | Ad account owner | [optional] [readonly]
**permissions** | [**\OpenAPI\Client\Model\BusinessAccessRole[]**](BusinessAccessRole.md) |  | [optional] [readonly]
**time_zone** | **string** | The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. | [optional]
**updated_time** | **int** |  | [optional] [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
