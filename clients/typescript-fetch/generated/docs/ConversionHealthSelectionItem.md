
# ConversionHealthSelectionItem

User selection of conversion health criteria for a single feature

## Properties

Name | Type
------------ | -------------
`conversionType` | object
`criteria` | object
`ingestionSource` | object
`status` | any

## Example

```typescript
import type { ConversionHealthSelectionItem } from ''

// TODO: Update the object below with actual values
const example = {
  "conversionType": null,
  "criteria": null,
  "ingestionSource": null,
  "status": null,
} satisfies ConversionHealthSelectionItem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionHealthSelectionItem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


