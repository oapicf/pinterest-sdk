
# ConversionApiResponseEventsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**inline**](#Status) | Whether the event was processed successfully. |  |
| **errorMessage** | **kotlin.String** | Error message containing more information about why the event failed to be processed. |  [optional] |
| **warningMessage** | **kotlin.String** | Warning messages about any fields in the event which are not standard. These are not critical to event processing. |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | failed, processed |



