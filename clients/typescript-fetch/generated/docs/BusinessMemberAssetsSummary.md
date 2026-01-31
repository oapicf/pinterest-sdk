
# BusinessMemberAssetsSummary

Ad accounts and profiles the business member/partner has access to.

## Properties

Name | Type
------------ | -------------
`adAccounts` | [Array&lt;BusinessMemberAssetsSummaryAdAccountsInner&gt;](BusinessMemberAssetsSummaryAdAccountsInner.md)
`profiles` | [Array&lt;BusinessMemberAssetsSummaryProfilesInner&gt;](BusinessMemberAssetsSummaryProfilesInner.md)

## Example

```typescript
import type { BusinessMemberAssetsSummary } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccounts": null,
  "profiles": null,
} satisfies BusinessMemberAssetsSummary

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BusinessMemberAssetsSummary
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


