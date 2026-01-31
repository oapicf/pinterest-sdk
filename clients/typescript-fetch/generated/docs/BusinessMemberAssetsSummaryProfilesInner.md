
# BusinessMemberAssetsSummaryProfilesInner


## Properties

Name | Type
------------ | -------------
`id` | string
`permissions` | Array&lt;string&gt;

## Example

```typescript
import type { BusinessMemberAssetsSummaryProfilesInner } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 383791336903426391,
  "permissions": ["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"],
} satisfies BusinessMemberAssetsSummaryProfilesInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BusinessMemberAssetsSummaryProfilesInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


