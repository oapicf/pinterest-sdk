# openapi::ConversionDeletionRequest

Conversion deletion request

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_time** | **character** | Timestamp when the conversion deletion request was succesfully created. | [readonly] 
**processed_time** | **character** | Timestamp when the conversion deletion request was processed. | [optional] [readonly] 
**request_id** | **character** | Unique identifier of the conversion deletion request | [Pattern: ^\\d+$] [Max. length: 18] 
**status** | [**ConversionDeletionRequestStatus**](ConversionDeletionRequestStatus.md) | Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled. | [readonly] [Enum: ] 


