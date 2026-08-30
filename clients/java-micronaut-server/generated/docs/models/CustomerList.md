

# CustomerList

The class is defined in **[CustomerList.java](../../src/main/java/org/openapitools/model/CustomerList.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | `String` | Associated ad account ID. |  [optional property] [readonly property]
**createdTime** | `BigDecimal` | Creation time. Unix timestamp in seconds. |  [optional property] [readonly property]
**exceptions** | `Object` | Customer list errors. |  [optional property] [readonly property]
**id** | `String` | Customer list ID. |  [readonly property]
**isNca** | `Boolean` | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. |  [optional property]
**name** | `String` | Customer list name. | 
**numBatches** | `BigDecimal` | Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. |  [optional property] [readonly property]
**numRemovedUserRecords** | `BigDecimal` | Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. |  [optional property] [readonly property]
**numUploadedUserRecords** | `BigDecimal` | Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. |  [optional property] [readonly property]
**status** | `CustomerListStatus` | Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users. |  [optional property] [readonly property]
**type** | `String` | Always &#x60;customerlist&#x60;. |  [optional property] [readonly property]
**updatedTime** | `BigDecimal` | Last update time. Unix timestamp in seconds. |  [optional property] [readonly property]














