
# DeliveryMetricsResponseItemsInner


## Properties

Name | Type
------------ | -------------
`name` | string
`category` | string
`definition` | string
`displayName` | string

## Example

```typescript
import type { DeliveryMetricsResponseItemsInner } from ''

// TODO: Update the object below with actual values
const example = {
  "name": AD_GROUP_ID,
  "category": ADS,
  "definition": Unique ID for your ad group,
  "displayName": Ad group ID,
} satisfies DeliveryMetricsResponseItemsInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as DeliveryMetricsResponseItemsInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


