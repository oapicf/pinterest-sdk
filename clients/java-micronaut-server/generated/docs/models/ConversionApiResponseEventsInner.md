

# ConversionApiResponseEventsInner

The class is defined in **[ConversionApiResponseEventsInner.java](../../src/main/java/org/openapitools/model/ConversionApiResponseEventsInner.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Whether the event was processed successfully. | 
**errorMessage** | `String` | Error message containing more information about why the event failed to be processed. |  [optional property]
**warningMessage** | `String` | Warning messages about any fields in the event which are not standard. These are not critical to event processing. |  [optional property]

## StatusEnum

Name | Value
---- | -----
FAILED | `"failed"`
PROCESSED | `"processed"`




