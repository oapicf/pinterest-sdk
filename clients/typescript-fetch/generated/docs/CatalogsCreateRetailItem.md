
# CatalogsCreateRetailItem

An item to be created

## Properties

Name | Type
------------ | -------------
`itemId` | string
`operation` | string
`attributes` | [ItemAttributesRequest](ItemAttributesRequest.md)

## Example

```typescript
import type { CatalogsCreateRetailItem } from ''

// TODO: Update the object below with actual values
const example = {
  "itemId": DS0294-M,
  "operation": null,
  "attributes": null,
} satisfies CatalogsCreateRetailItem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsCreateRetailItem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


