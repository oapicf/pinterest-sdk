
# Promotion


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`discountStatus` | [DiscountStatus](DiscountStatus.md)
`endTime` | number
`externalId` | string
`id` | string
`platformType` | string
`promotionCode` | string
`promotionCustomId` | string
`promotionTitle` | string
`promotionType` | [PromotionType](PromotionType.md)
`startTime` | number
`status` | [EntityStatus](EntityStatus.md)
`templateValues` | [Array&lt;PromotionTemplateValue&gt;](PromotionTemplateValue.md)

## Example

```typescript
import type { Promotion } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": null,
  "discountStatus": null,
  "endTime": null,
  "externalId": null,
  "id": null,
  "platformType": null,
  "promotionCode": null,
  "promotionCustomId": null,
  "promotionTitle": null,
  "promotionType": null,
  "startTime": null,
  "status": null,
  "templateValues": null,
} satisfies Promotion

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Promotion
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


