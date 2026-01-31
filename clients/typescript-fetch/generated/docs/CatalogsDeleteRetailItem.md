
# CatalogsDeleteRetailItem

An item to be deleted

## Properties

Name | Type
------------ | -------------
`itemId` | string
`lastUpdatedTime` | number
`operation` | string

## Example

```typescript
import type { CatalogsDeleteRetailItem } from ''

// TODO: Update the object below with actual values
const example = {
  "itemId": DS0294-M,
  "lastUpdatedTime": 1641483432072,
  "operation": null,
} satisfies CatalogsDeleteRetailItem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsDeleteRetailItem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


