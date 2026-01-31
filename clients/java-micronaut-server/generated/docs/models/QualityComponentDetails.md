

# QualityComponentDetails

Metrics for a specific event type within a quality component.

The class is defined in **[QualityComponentDetails.java](../../src/main/java/org/openapitools/model/QualityComponentDetails.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coverage** | `BigDecimal` | Coverage percentage for this event type. | 
**issues** | [`List&lt;QualityComponentIssue&gt;`](QualityComponentIssue.md) | List of issues detected for this event type, if any. |  [optional property]
**overlap** | `BigDecimal` | Overlap percentage for this event type. Only populated for external_event_id |  [optional property]





