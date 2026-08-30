# CustomerList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Associated ad account ID. | [optional] [readonly] [default to undefined]
**created_time** | **number** | Creation time. Unix timestamp in seconds. | [optional] [readonly] [default to undefined]
**exceptions** | **object** | Customer list errors. | [optional] [readonly] [default to undefined]
**id** | **string** | Customer list ID. | [readonly] [default to undefined]
**is_nca** | **boolean** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. | [optional] [default to undefined]
**name** | **string** | Customer list name. | [default to undefined]
**num_batches** | **number** | Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. | [optional] [readonly] [default to undefined]
**num_removed_user_records** | **number** | Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. | [optional] [readonly] [default to undefined]
**num_uploaded_user_records** | **number** | Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. | [optional] [readonly] [default to undefined]
**status** | [**CustomerListStatus**](CustomerListStatus.md) | Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users. | [optional] [readonly] [default to undefined]
**type** | **string** | Always &#x60;customerlist&#x60;. | [optional] [readonly] [default to undefined]
**updated_time** | **number** | Last update time. Unix timestamp in seconds. | [optional] [readonly] [default to undefined]

## Example

```typescript
import { CustomerList } from './api';

const instance: CustomerList = {
    ad_account_id,
    created_time,
    exceptions,
    id,
    is_nca,
    name,
    num_batches,
    num_removed_user_records,
    num_uploaded_user_records,
    status,
    type,
    updated_time,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
