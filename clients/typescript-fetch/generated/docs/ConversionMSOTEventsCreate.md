
# ConversionMSOTEventsCreate

Resource create operation model.

## Properties

Name | Type
------------ | -------------
`actionTimestamps` | Array&lt;number&gt;
`adGroupId` | string
`attributionModel` | [AttributionModel](AttributionModel.md)
`attributionScope` | [AttributionScope](AttributionScope.md)
`attributionScore` | number
`campaignId` | string
`clickWindow` | string
`currency` | [Currency](Currency.md)
`eventId` | string
`eventName` | [MsotEventName](MsotEventName.md)
`eventTimestamp` | number
`totalEventTouchpoints` | number
`totalEvents` | number
`totalEventsFractional` | number
`value` | number
`viewWindow` | string

## Example

```typescript
import type { ConversionMSOTEventsCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "actionTimestamps": [1451410040],
  "adGroupId": 2680060704746,
  "attributionModel": multi_touch,
  "attributionScope": click,
  "attributionScore": 0.5,
  "campaignId": 626736533506,
  "clickWindow": null,
  "currency": null,
  "eventId": eventId0001,
  "eventName": add_to_cart,
  "eventTimestamp": 1451431341,
  "totalEventTouchpoints": 2,
  "totalEvents": 2,
  "totalEventsFractional": null,
  "value": 123.45,
  "viewWindow": null,
} satisfies ConversionMSOTEventsCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionMSOTEventsCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


