
# CatalogsCreativeAssetsItemErrorResponse

Object describing a creative assets item error

## Properties

Name | Type
------------ | -------------
`catalogType` | [CatalogsType](CatalogsType.md)
`creativeAssetsId` | string
`errors` | [Array&lt;ItemValidationEvent&gt;](ItemValidationEvent.md)

## Example

```typescript
import type { CatalogsCreativeAssetsItemErrorResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogType": null,
  "creativeAssetsId": DS0294-M,
  "errors": null,
} satisfies CatalogsCreativeAssetsItemErrorResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsCreativeAssetsItemErrorResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


