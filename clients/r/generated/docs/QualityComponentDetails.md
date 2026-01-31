# openapi::QualityComponentDetails

Metrics for a specific event type within a quality component.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coverage** | **numeric** | Coverage percentage for this event type. | 
**issues** | [**array[QualityComponentIssue]**](QualityComponentIssue.md) | List of issues detected for this event type, if any. | [optional] 
**overlap** | **numeric** | Overlap percentage for this event type. Only populated for external_event_id | [optional] 


