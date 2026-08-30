
# EntityDataChangeHistory


## Properties

Name | Type
------------ | -------------
`changedFieldId` | string
`changedFieldName` | string
`dataType` | [ChangeHistoryDataType](ChangeHistoryDataType.md)
`newDataValue` | string
`oldDataValue` | string

## Example

```typescript
import type { EntityDataChangeHistory } from ''

// TODO: Update the object below with actual values
const example = {
  "changedFieldId": null,
  "changedFieldName": null,
  "dataType": null,
  "newDataValue": null,
  "oldDataValue": null,
} satisfies EntityDataChangeHistory

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EntityDataChangeHistory
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


