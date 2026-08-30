# AdAccount


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`country`** | [**`*Country`**](Country.md) |  | [optional] [default to nothing]
**`created_time`** | **`Int64`** |  Creation time. Unix timestamp in seconds. | [optional] [readonly] [default to nothing]
**`currency`** | [**`*Currency`**](Currency.md) |  | [optional] [default to nothing]
**`id`** | **`String`** |  | [default to nothing]
**`name`** | **`String`** | Ad account name. | [optional] [default to nothing]
**`owner`** | [**`*AdAccountOwner`**](AdAccountOwner.md) | Ad account owner | [optional] [readonly] [default to nothing]
**`permissions`** | [**`Vector{BusinessAccessRole}`**](BusinessAccessRole.md) |  | [optional] [readonly] [default to nothing]
**`time_zone`** | **`String`** | The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. | [optional] [default to nothing]
**`updated_time`** | **`Int64`** |  | [optional] [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


