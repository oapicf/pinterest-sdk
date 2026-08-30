
# BusinessMemberAssetsGetResponse

Paginated response for business member assets with total count metadata.

## Properties

Name | Type
------------ | -------------
`bookmark` | string
`items` | [Array&lt;AssetIdPermissions&gt;](AssetIdPermissions.md)
`totalDataCount` | number
`totalDataCountByStatus` | [TotalCountByEntityStatus](TotalCountByEntityStatus.md)

## Example

```typescript
import type { BusinessMemberAssetsGetResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "bookmark": null,
  "items": null,
  "totalDataCount": null,
  "totalDataCountByStatus": null,
} satisfies BusinessMemberAssetsGetResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BusinessMemberAssetsGetResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


