# openapi::AdAccount


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [optional] [Enum: ] 
**created_time** | **integer** |  Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**currency** | [**Currency**](Currency.md) |  | [optional] [Enum: ] 
**id** | **character** |  | [Pattern: ^\\d+$] [Max. length: 18] 
**name** | **character** | Ad account name. | [optional] [Max. length: 256] 
**owner** | [**AdAccountOwner**](AdAccountOwner.md) | Ad account owner | [optional] [readonly] 
**permissions** | [**array[BusinessAccessRole]**](BusinessAccessRole.md) |  | [optional] [readonly] 
**time_zone** | **character** | The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. | [optional] 
**updated_time** | **integer** |  | [optional] [readonly] 


