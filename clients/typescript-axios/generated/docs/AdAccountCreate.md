# AdAccountCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [optional] [default to undefined]
**currency** | [**Currency**](Currency.md) |  | [optional] [default to undefined]
**name** | **string** | Ad account name. | [optional] [default to undefined]
**owner_user_id** | **string** | Advertiser\&#39;s owning user ID. | [optional] [default to undefined]
**time_zone** | **string** | The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. | [optional] [default to undefined]

## Example

```typescript
import { AdAccountCreate } from './api';

const instance: AdAccountCreate = {
    country,
    currency,
    name,
    owner_user_id,
    time_zone,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
