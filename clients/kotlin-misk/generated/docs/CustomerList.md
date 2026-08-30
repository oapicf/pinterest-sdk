
# CustomerList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | Customer list ID. |  [readonly]
**name** | **kotlin.String** | Customer list name. | 
**adAccountId** | **kotlin.String** | Associated ad account ID. |  [optional] [readonly]
**createdTime** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Creation time. Unix timestamp in seconds. |  [optional] [readonly]
**exceptions** | [**kotlin.Any**](.md) | Customer list errors. |  [optional] [readonly]
**isNca** | **kotlin.Boolean** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. |  [optional]
**numBatches** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. |  [optional] [readonly]
**numRemovedUserRecords** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. |  [optional] [readonly]
**numUploadedUserRecords** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. |  [optional] [readonly]
**status** | [**CustomerListStatus**](CustomerListStatus.md) | Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users. |  [optional] [readonly]
**type** | **kotlin.String** | Always &#x60;customerlist&#x60;. |  [optional] [readonly]
**updatedTime** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Last update time. Unix timestamp in seconds. |  [optional] [readonly]



