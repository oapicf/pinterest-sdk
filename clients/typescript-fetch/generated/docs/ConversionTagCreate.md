
# ConversionTagCreate

Resource create operation model.

## Properties

Name | Type
------------ | -------------
`aemDbEnabled` | boolean
`aemEnabled` | boolean
`aemExternalIdEnabled` | boolean
`aemFnlnEnabled` | boolean
`aemGeEnabled` | boolean
`aemLocEnabled` | boolean
`aemPhEnabled` | boolean
`mdFrequency` | number
`name` | string

## Example

```typescript
import type { ConversionTagCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "aemDbEnabled": null,
  "aemEnabled": null,
  "aemExternalIdEnabled": null,
  "aemFnlnEnabled": null,
  "aemGeEnabled": null,
  "aemLocEnabled": null,
  "aemPhEnabled": null,
  "mdFrequency": 0.6,
  "name": download_picture,
} satisfies ConversionTagCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionTagCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


