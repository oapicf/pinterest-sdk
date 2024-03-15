
# Table `CustomerList`
(mapped from: CustomerList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccountId** | ad_account_id | text |  | **kotlin.String** | Associated ad account ID. |  [optional]
**createdTime** | created_time | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Creation time. Unix timestamp in seconds. |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Customer list ID. |  [optional]
**name** | name | text |  | **kotlin.String** | Customer list name. |  [optional]
**numBatches** | num_batches | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Total number of list updates.  List creation counts as one batch. Each &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists. |  [optional]
**numRemovedUserRecords** | num_removed_user_records | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Number of removed user records. In a &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call, this counter increases even if the user is not found in the list. |  [optional]
**numUploadedUserRecords** | num_uploaded_user_records | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Number of uploaded user records. In an &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append API&lt;/a&gt; call, this counter increases even if the uploaded user is already in the list. |  [optional]
**status** | status | text |  | [**status**](#Status) | Customer list status. TOO_SMALL - the list has less than 100 Pinterest users. |  [optional]
**type** | type | text |  | **kotlin.String** | Always \&quot;customerlist\&quot;. |  [optional]
**updatedTime** | updated_time | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Last update time. Unix timestamp in seconds. |  [optional]
**exceptions** | exceptions | blob |  | [**kotlin.Any**](.md) | Customer list errors |  [optional]













