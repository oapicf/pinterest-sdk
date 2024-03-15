

# ConversionApiResponseEventsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Status**](#Status) | Whether the event was processed successfully. | 
**errorMessage** | **String** | Error message containing more information about why the event failed to be processed. |  [optional]
**warningMessage** | **String** | Warning messages about any fields in the event which are not standard. These are not critical to event processing. |  [optional]


## Enum: Status
Allowed values: [failed, processed]




