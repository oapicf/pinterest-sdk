
# Table `CustomerList`
(mapped from: CustomerList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Customer list ID. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | Customer list name. | 
**adAccountId** | ad_account_id | text |  | **kotlin.String** | Associated ad account ID. |  [optional] [readonly]
**createdTime** | created_time | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Creation time. Unix timestamp in seconds. |  [optional] [readonly]
**exceptions** | exceptions | blob |  | [**kotlin.Any**](.md) | Customer list errors. |  [optional] [readonly]
**isNca** | is_nca | boolean |  | **kotlin.Boolean** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. |  [optional]
**numBatches** | num_batches | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. |  [optional] [readonly]
**numRemovedUserRecords** | num_removed_user_records | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. |  [optional] [readonly]
**numUploadedUserRecords** | num_uploaded_user_records | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. |  [optional] [readonly]
**status** | status | long |  | [**CustomerListStatus**](CustomerListStatus.md) | Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users. |  [optional] [readonly] [foreignkey]
**type** | type | text |  | **kotlin.String** | Always &#x60;customerlist&#x60;. |  [optional] [readonly]
**updatedTime** | updated_time | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Last update time. Unix timestamp in seconds. |  [optional] [readonly]














