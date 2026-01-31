
# ConversionTagConfigs


## Properties

Name | Type
------------ | -------------
`aemEnabled` | boolean
`mdFrequency` | number
`aemFnlnEnabled` | boolean
`aemPhEnabled` | boolean
`aemGeEnabled` | boolean
`aemDbEnabled` | boolean
`aemLocEnabled` | boolean

## Example

```typescript
import type { ConversionTagConfigs } from ''

// TODO: Update the object below with actual values
const example = {
  "aemEnabled": true,
  "mdFrequency": 0.6,
  "aemFnlnEnabled": true,
  "aemPhEnabled": true,
  "aemGeEnabled": true,
  "aemDbEnabled": true,
  "aemLocEnabled": true,
} satisfies ConversionTagConfigs

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionTagConfigs
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


