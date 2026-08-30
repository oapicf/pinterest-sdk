
# EntityHistory


## Properties

Name | Type
------------ | -------------
`changeTimestamp` | number
`dataChanges` | [Array&lt;EntityDataChangeHistory&gt;](EntityDataChangeHistory.md)
`entityId` | string
`entityName` | string
`ldap` | string
`operation` | [ChangeHistoryOperationType](ChangeHistoryOperationType.md)
`userId` | string

## Example

```typescript
import type { EntityHistory } from ''

// TODO: Update the object below with actual values
const example = {
  "changeTimestamp": null,
  "dataChanges": null,
  "entityId": null,
  "entityName": null,
  "ldap": null,
  "operation": null,
  "userId": null,
} satisfies EntityHistory

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EntityHistory
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


