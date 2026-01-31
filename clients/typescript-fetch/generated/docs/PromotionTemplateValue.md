
# PromotionTemplateValue


## Properties

Name | Type
------------ | -------------
`amount` | number
`currencyCode` | [Currency](Currency.md)
`customText` | string
`percent` | number

## Example

```typescript
import type { PromotionTemplateValue } from ''

// TODO: Update the object below with actual values
const example = {
  "amount": 100,
  "currencyCode": null,
  "customText": My promotion,
  "percent": 10,
} satisfies PromotionTemplateValue

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PromotionTemplateValue
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


