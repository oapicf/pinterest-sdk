
# Table `ConversionApiResponse_events_inner`
(mapped from: ConversionApiResponseEventsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**status** | status | text NOT NULL |  | [**status**](#Status) | Whether the event was processed successfully. | 
**errorMessage** | error_message | text |  | **kotlin.String** | Error message containing more information about why the event failed to be processed. |  [optional]
**warningMessage** | warning_message | text |  | **kotlin.String** | Warning messages about any fields in the event which are not standard. These are not critical to event processing. |  [optional]





