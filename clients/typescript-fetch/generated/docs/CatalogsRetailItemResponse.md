
# CatalogsRetailItemResponse

Object describing a retail item record

## Properties

Name | Type
------------ | -------------
`attributes` | [ItemAttributes](ItemAttributes.md)
`catalogType` | string
`itemId` | string
`itemResponseKind` | string
`pins` | [Array&lt;Pin&gt;](Pin.md)

## Example

```typescript
import type { CatalogsRetailItemResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "attributes": null,
  "catalogType": null,
  "itemId": DS0294-M,
  "itemResponseKind": null,
  "pins": null,
} satisfies CatalogsRetailItemResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsRetailItemResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


