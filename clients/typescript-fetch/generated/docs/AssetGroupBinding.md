
# AssetGroupBinding


## Properties

Name | Type
------------ | -------------
`adAccountsIds` | Array&lt;string&gt;
`assetGroupDescription` | string
`assetGroupName` | string
`assetGroupTypes` | Array&lt;string&gt;
`catalogsIds` | Array&lt;string&gt;
`createdBy` | [BusinessAccessUserSummary](BusinessAccessUserSummary.md)
`createdTime` | number
`id` | string
`owner` | [BusinessAccessUserSummary](BusinessAccessUserSummary.md)
`profilesIds` | Array&lt;string&gt;
`updatedTime` | number

## Example

```typescript
import type { AssetGroupBinding } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountsIds": ["549755885175"],
  "assetGroupDescription": Asset group that has ad accounts used in Canada,
  "assetGroupName": Canada Ad Accounts,
  "assetGroupTypes": ["LOCATION_OR_LANGUAGE"],
  "catalogsIds": ["4836859046874"],
  "createdBy": null,
  "createdTime": 1646767577816,
  "id": 666791336903426391,
  "owner": null,
  "profilesIds": ["630433785246278264"],
  "updatedTime": 1646767577816,
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


