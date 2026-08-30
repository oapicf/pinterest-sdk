
# EntityLabel


## Properties

Name | Type
------------ | -------------
`entityId` | string
`entityType` | [LabelParentType](LabelParentType.md)
`labelId` | string
`status` | [EntityLabelStatus](EntityLabelStatus.md)

## Example

```typescript
import type { EntityLabel } from ''

// TODO: Update the object below with actual values
const example = {
  "entityId": null,
  "entityType": null,
  "labelId": null,
  "status": null,
} satisfies EntityLabel

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EntityLabel
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


