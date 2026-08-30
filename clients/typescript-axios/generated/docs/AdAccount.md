# AdAccount


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [optional] [default to undefined]
**created_time** | **number** |  Creation time. Unix timestamp in seconds. | [optional] [readonly] [default to undefined]
**currency** | [**Currency**](Currency.md) |  | [optional] [default to undefined]
**id** | **string** |  | [default to undefined]
**name** | **string** | Ad account name. | [optional] [default to undefined]
**owner** | [**AdAccountOwner**](AdAccountOwner.md) | Ad account owner | [optional] [readonly] [default to undefined]
**permissions** | [**Array&lt;BusinessAccessRole&gt;**](BusinessAccessRole.md) |  | [optional] [readonly] [default to undefined]
**time_zone** | **string** | The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. | [optional] [default to undefined]
**updated_time** | **number** |  | [optional] [readonly] [default to undefined]

## Example

```typescript
import { AdAccount } from './api';

const instance: AdAccount = {
    country,
    created_time,
    currency,
    id,
    name,
    owner,
    permissions,
    time_zone,
    updated_time,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
