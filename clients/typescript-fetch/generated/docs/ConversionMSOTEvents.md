
# ConversionMSOTEvents

Object containing the MSOT conversion events.

## Properties

Name | Type
------------ | -------------
`actionTimestamps` | Array&lt;number&gt;
`adGroupId` | string
`attributionModel` | string
`attributionScope` | string
`attributionScore` | number
`campaignId` | string
`currency` | [Currency &amp; string](Currency &amp; string.md)
`eventId` | string
`eventName` | string
`eventTimestamp` | number
`totalEventTouchpoints` | number
`totalEvents` | number
`value` | number

## Example

```typescript
import type { ConversionMSOTEvents } from ''

// TODO: Update the object below with actual values
const example = {
  "actionTimestamps": [1451410040],
  "adGroupId": 2680060704746,
  "attributionModel": multi_touch,
  "attributionScope": click,
  "attributionScore": 0.5,
  "campaignId": 626736533506,
  "currency": null,
  "eventId": eventId0001,
  "eventName": add_to_cart,
  "eventTimestamp": 1451431341,
  "totalEventTouchpoints": 2,
  "totalEvents": 2,
  "value": 123.45,
} satisfies ConversionMSOTEvents

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionMSOTEvents
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


