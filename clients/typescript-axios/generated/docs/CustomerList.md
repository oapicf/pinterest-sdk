# CustomerList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Associated ad account ID. | [optional] [default to undefined]
**created_time** | **number** | Creation time. Unix timestamp in seconds. | [optional] [default to undefined]
**exceptions** | **object** | Customer list errors | [optional] [default to undefined]
**id** | **string** | Customer list ID. | [optional] [default to undefined]
**name** | **string** | Customer list name. | [optional] [default to undefined]
**num_batches** | **number** | Total number of list updates.  List creation counts as one batch. Each &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists. | [optional] [default to undefined]
**num_removed_user_records** | **number** | Number of removed user records. In a &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call, this counter increases even if the user is not found in the list. | [optional] [default to undefined]
**num_uploaded_user_records** | **number** | Number of uploaded user records. In an &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append API&lt;/a&gt; call, this counter increases even if the uploaded user is already in the list. | [optional] [default to undefined]
**status** | **string** | Customer list status. TOO_SMALL - the list has less than 100 Pinterest users. | [optional] [default to undefined]
**type** | **string** | Always \&quot;customerlist\&quot;. | [optional] [default to undefined]
**updated_time** | **number** | Last update time. Unix timestamp in seconds. | [optional] [default to undefined]

## Example

```typescript
import { CustomerList } from './api';

const instance: CustomerList = {
    ad_account_id,
    created_time,
    exceptions,
    id,
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
