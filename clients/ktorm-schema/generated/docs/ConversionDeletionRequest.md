
# Table `ConversionDeletionRequest`
(mapped from: ConversionDeletionRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**createdTime** | created_time | date NOT NULL |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Timestamp when the conversion deletion request was succesfully created. |  [readonly]
**requestId** | request_id | text NOT NULL |  | **kotlin.String** | Unique identifier of the conversion deletion request | 
**status** | status | long NOT NULL |  | [**ConversionDeletionRequestStatus**](ConversionDeletionRequestStatus.md) | Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled. |  [readonly] [foreignkey]
**processedTime** | processed_time | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Timestamp when the conversion deletion request was processed. |  [optional] [readonly]






