# ConversionDeletionRequest
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **created\_time** | **date** | Timestamp when the conversion deletion request was succesfully created. | [default to null] |
| **processed\_time** | **date** | Timestamp when the conversion deletion request was processed. | [optional] [default to null] |
| **request\_id** | **String** | Unique identifier of the conversion deletion request | [default to null] |
| **status** | [**ConversionDeletionRequestStatus**](ConversionDeletionRequestStatus.md) | Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

