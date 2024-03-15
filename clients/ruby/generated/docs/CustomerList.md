# PinterestSdkClient::CustomerList

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Associated ad account ID. | [optional] |
| **created_time** | **Float** | Creation time. Unix timestamp in seconds. | [optional] |
| **id** | **String** | Customer list ID. | [optional] |
| **name** | **String** | Customer list name. | [optional] |
| **num_batches** | **Float** | Total number of list updates.  List creation counts as one batch. Each &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists. | [optional] |
| **num_removed_user_records** | **Float** | Number of removed user records. In a &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call, this counter increases even if the user is not found in the list. | [optional] |
| **num_uploaded_user_records** | **Float** | Number of uploaded user records. In an &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append API&lt;/a&gt; call, this counter increases even if the uploaded user is already in the list. | [optional] |
| **status** | **String** | Customer list status. TOO_SMALL - the list has less than 100 Pinterest users. | [optional] |
| **type** | **String** | Always \&quot;customerlist\&quot;. | [optional] |
| **updated_time** | **Float** | Last update time. Unix timestamp in seconds. | [optional] |
| **exceptions** | **Object** | Customer list errors | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CustomerList.new(
  ad_account_id: 549756359984,
  created_time: 1452208622,
  id: 643,
  name: The Glengarry Glen Ross leads,
  num_batches: 2,
  num_removed_user_records: 0,
  num_uploaded_user_records: 11,
  status: PROCESSING,
  type: customerlist,
  updated_time: 1461269616,
  exceptions: null
)
```

