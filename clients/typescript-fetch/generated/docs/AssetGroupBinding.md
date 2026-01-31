
# AssetGroupBinding


## Properties

Name | Type
------------ | -------------
`id` | string
`assetGroupName` | string
`assetGroupDescription` | string
`assetGroupTypes` | Array&lt;string&gt;
`adAccountsIds` | Array&lt;string&gt;
`profilesIds` | Array&lt;string&gt;
`createdTime` | number
`updatedTime` | number
`owner` | [BusinessAccessUserSummary](BusinessAccessUserSummary.md)
`createdBy` | [BusinessAccessUserSummary](BusinessAccessUserSummary.md)

## Example

```typescript
import type { AssetGroupBinding } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 666791336903426391,
  "assetGroupName": Canada Ad Accounts,
  "assetGroupDescription": Asset group that has ad accounts used in Canada,
  "assetGroupTypes": ["LOCATION_OR_LANGUAGE"],
  "adAccountsIds": ["549755885175"],
  "profilesIds": ["630433785246278264"],
  "createdTime": 1646767577816,
  "updatedTime": 1646767577816,
  "owner": null,
  "createdBy": null,
} satisfies AssetGroupBinding

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AssetGroupBinding
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


