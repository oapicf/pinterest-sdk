

# CustomerList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String** | Associated ad account ID. |  [optional] [readonly]
**createdTime** | [**BigDecimal**](BigDecimal.md) | Creation time. Unix timestamp in seconds. |  [optional] [readonly]
**exceptions** | **Object** | Customer list errors. |  [optional] [readonly]
**id** | **String** | Customer list ID. |  [readonly]
**isNca** | **Boolean** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. |  [optional]
**name** | **String** | Customer list name. | 
**numBatches** | [**BigDecimal**](BigDecimal.md) | Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. |  [optional] [readonly]
**numRemovedUserRecords** | [**BigDecimal**](BigDecimal.md) | Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. |  [optional] [readonly]
**numUploadedUserRecords** | [**BigDecimal**](BigDecimal.md) | Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. |  [optional] [readonly]
**status** | [**CustomerListStatus**](CustomerListStatus.md) | Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users. |  [optional] [readonly]
**type** | **String** | Always &#x60;customerlist&#x60;. |  [optional] [readonly]
**updatedTime** | [**BigDecimal**](BigDecimal.md) | Last update time. Unix timestamp in seconds. |  [optional] [readonly]




