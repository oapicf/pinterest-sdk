
# QualityComponents

Set of quality components, with each component containing a event coverage and details.

## Properties

Name | Type
------------ | -------------
`advertiserExternalId` | [{ [key: string]: QualityComponentDetails; }](QualityComponentDetails.md)
`clickIdEpik` | [{ [key: string]: QualityComponentDetails; }](QualityComponentDetails.md)
`externalEventId` | [{ [key: string]: QualityComponentDetails; }](QualityComponentDetails.md)
`hashedEmail` | [{ [key: string]: QualityComponentDetails; }](QualityComponentDetails.md)
`hashedMaid` | [{ [key: string]: QualityComponentDetails; }](QualityComponentDetails.md)
`ipAddress` | [{ [key: string]: QualityComponentDetails; }](QualityComponentDetails.md)
`orderId` | [{ [key: string]: QualityComponentDetails; }](QualityComponentDetails.md)
`orderValue` | [{ [key: string]: QualityComponentDetails; }](QualityComponentDetails.md)
`productId` | [{ [key: string]: QualityComponentDetails; }](QualityComponentDetails.md)
`sourceUrl` | [{ [key: string]: QualityComponentDetails; }](QualityComponentDetails.md)
`userAgent` | [{ [key: string]: QualityComponentDetails; }](QualityComponentDetails.md)

## Example

```typescript
import type { QualityComponents } from ''

// TODO: Update the object below with actual values
const example = {
  "advertiserExternalId": null,
  "clickIdEpik": null,
  "externalEventId": null,
  "hashedEmail": null,
  "hashedMaid": null,
  "ipAddress": null,
  "orderId": null,
  "orderValue": null,
  "productId": null,
  "sourceUrl": null,
  "userAgent": null,
} satisfies QualityComponents

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as QualityComponents
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


