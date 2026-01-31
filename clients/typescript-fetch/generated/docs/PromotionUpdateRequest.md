
# PromotionUpdateRequest


## Properties

Name | Type
------------ | -------------
`discountStatus` | string
`endTime` | number
`externalId` | string
`platformType` | string
`promotionCode` | string
`promotionCustomId` | string
`promotionTitle` | string
`promotionType` | [PromotionType](PromotionType.md)
`startTime` | number
`templateValues` | [Array&lt;PromotionTemplateValue&gt;](PromotionTemplateValue.md)
`id` | string
`status` | [EntityStatus](EntityStatus.md)

## Example

```typescript
import type { PromotionUpdateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "discountStatus": ACTIVE,
  "endTime": 1678003860,
  "externalId": abc,
  "platformType": DEFAULT,
  "promotionCode": blackfriday10,
  "promotionCustomId": freeshipping_2025,
  "promotionTitle": Black Friday 10% off,
  "promotionType": null,
  "startTime": 1677003860,
  "templateValues": null,
  "id": 7834020347906,
  "status": null,
} satisfies PromotionUpdateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PromotionUpdateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


