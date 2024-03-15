

# CustomerList

The class is defined in **[CustomerList.java](../../src/main/java/org/openapitools/model/CustomerList.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | `String` | Associated ad account ID. |  [optional property]
**createdTime** | `BigDecimal` | Creation time. Unix timestamp in seconds. |  [optional property]
**id** | `String` | Customer list ID. |  [optional property]
**name** | `String` | Customer list name. |  [optional property]
**numBatches** | `BigDecimal` | Total number of list updates.  List creation counts as one batch. Each &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists. |  [optional property]
**numRemovedUserRecords** | `BigDecimal` | Number of removed user records. In a &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call, this counter increases even if the user is not found in the list. |  [optional property]
**numUploadedUserRecords** | `BigDecimal` | Number of uploaded user records. In an &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append API&lt;/a&gt; call, this counter increases even if the uploaded user is already in the list. |  [optional property]
**status** | [**StatusEnum**](#StatusEnum) | Customer list status. TOO_SMALL - the list has less than 100 Pinterest users. |  [optional property]
**type** | `String` | Always \&quot;customerlist\&quot;. |  [optional property]
**updatedTime** | `BigDecimal` | Last update time. Unix timestamp in seconds. |  [optional property]
**exceptions** | `Object` | Customer list errors |  [optional property]








## StatusEnum

Name | Value
---- | -----
PROCESSING | `"PROCESSING"`
READY | `"READY"`
TOO_SMALL | `"TOO_SMALL"`
UPLOADING | `"UPLOADING"`





