# PinterestSdkClient::CustomerList

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Associated ad account ID. | [optional][readonly] |
| **created_time** | **Float** | Creation time. Unix timestamp in seconds. | [optional][readonly] |
| **exceptions** | **Object** | Customer list errors. | [optional][readonly] |
| **id** | **String** | Customer list ID. | [readonly] |
| **is_nca** | **Boolean** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. | [optional] |
| **name** | **String** | Customer list name. |  |
| **num_batches** | **Float** | Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. | [optional][readonly] |
| **num_removed_user_records** | **Float** | Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. | [optional][readonly] |
| **num_uploaded_user_records** | **Float** | Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. | [optional][readonly] |
| **status** | [**CustomerListStatus**](CustomerListStatus.md) | Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users. | [optional][readonly] |
| **type** | **String** | Always &#x60;customerlist&#x60;. | [optional][readonly] |
| **updated_time** | **Float** | Last update time. Unix timestamp in seconds. | [optional][readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CustomerList.new(
  ad_account_id: 549756359984,
  created_time: 1452208622,
  exceptions: null,
  id: 643,
  is_nca: null,
  name: The Glengarry Glen Ross leads,
  num_batches: 2,
  num_removed_user_records: 0,
  num_uploaded_user_records: 11,
  status: PROCESSING,
  type: customerlist,
  updated_time: 1461269616
)
```

