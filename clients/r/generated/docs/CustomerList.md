# openapi::CustomerList


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **character** | Associated ad account ID. | [optional] [readonly] 
**created_time** | **numeric** | Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**exceptions** | **object** | Customer list errors. | [optional] [readonly] 
**id** | **character** | Customer list ID. | [readonly] [Pattern: ^\\d+$] [Max. length: 18] 
**is_nca** | **character** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. | [optional] 
**name** | **character** | Customer list name. | 
**num_batches** | **numeric** | Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. | [optional] [readonly] 
**num_removed_user_records** | **numeric** | Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. | [optional] [readonly] 
**num_uploaded_user_records** | **numeric** | Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. | [optional] [readonly] 
**status** | [**CustomerListStatus**](CustomerListStatus.md) | Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users. | [optional] [readonly] [Enum: ] 
**type** | **character** | Always &#x60;customerlist&#x60;. | [optional] [readonly] 
**updated_time** | **numeric** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 


