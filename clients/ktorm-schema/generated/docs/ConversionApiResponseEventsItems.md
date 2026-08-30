
# Table `ConversionApiResponseEventsItems`
(mapped from: ConversionApiResponseEventsItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**status** | status | long NOT NULL |  | [**EventProcessingStatus**](EventProcessingStatus.md) | Whether the event was processed successfully. |  [foreignkey]
**errorMessage** | error_message | text |  | **kotlin.String** | Error message containing more information about why the event failed to be processed. |  [optional]
**warningMessage** | warning_message | text |  | **kotlin.String** | Warning messages about any fields in the event which are not standard. These are not critical to event processing. |  [optional]





