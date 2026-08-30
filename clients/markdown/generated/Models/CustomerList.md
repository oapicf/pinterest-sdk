# CustomerList
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String** | Associated ad account ID. | [optional] [default to null] |
| **created\_time** | **BigDecimal** | Creation time. Unix timestamp in seconds. | [optional] [default to null] |
| **exceptions** | [**Object**](.md) | Customer list errors. | [optional] [default to null] |
| **id** | **String** | Customer list ID. | [default to null] |
| **is\_nca** | **Boolean** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. | [optional] [default to null] |
| **name** | **String** | Customer list name. | [default to null] |
| **num\_batches** | **BigDecimal** | Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. | [optional] [default to null] |
| **num\_removed\_user\_records** | **BigDecimal** | Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. | [optional] [default to null] |
| **num\_uploaded\_user\_records** | **BigDecimal** | Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. | [optional] [default to null] |
| **status** | [**CustomerListStatus**](CustomerListStatus.md) | Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users. | [optional] [default to null] |
| **type** | **String** | Always &#x60;customerlist&#x60;. | [optional] [default to null] |
| **updated\_time** | **BigDecimal** | Last update time. Unix timestamp in seconds. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

