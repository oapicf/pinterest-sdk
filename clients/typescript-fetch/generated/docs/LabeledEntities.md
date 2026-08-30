
# LabeledEntities


## Properties

Name | Type
------------ | -------------
`entitiesLabels` | [Array&lt;EntityLabel&gt;](EntityLabel.md)
`errors` | [Array&lt;EntityLabelError&gt;](EntityLabelError.md)

## Example

```typescript
import type { LabeledEntities } from ''

// TODO: Update the object below with actual values
const example = {
  "entitiesLabels": null,
  "errors": null,
} satisfies LabeledEntities

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LabeledEntities
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


