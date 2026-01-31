
# InviteAssetsSummary

Ad accounts and profiles the member/partner will be granted access to with this invite/request.

## Properties

Name | Type
------------ | -------------
`adAccounts` | [Array&lt;InviteAssetsSummaryAdAccountsInner&gt;](InviteAssetsSummaryAdAccountsInner.md)
`profiles` | [Array&lt;InviteAssetsSummaryProfilesInner&gt;](InviteAssetsSummaryProfilesInner.md)

## Example

```typescript
import type { InviteAssetsSummary } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccounts": null,
  "profiles": null,
} satisfies InviteAssetsSummary

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as InviteAssetsSummary
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


