

# ConversionDeletionRequest

Conversion deletion request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdTime** | **Date** | Timestamp when the conversion deletion request was succesfully created. |  [readonly] |
|**processedTime** | **Date** | Timestamp when the conversion deletion request was processed. |  [optional] [readonly] |
|**requestId** | **String** | Unique identifier of the conversion deletion request |  |
|**status** | **ConversionDeletionRequestStatus** | Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled. |  [readonly] |



