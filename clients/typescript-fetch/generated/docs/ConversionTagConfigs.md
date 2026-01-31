
# ConversionTagConfigs


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
`noCodeCapiDomains` | Array&lt;string&gt;

## Example

```typescript
import type { ConversionTagConfigs } from ''

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
  "noCodeCapiDomains": ["https://sub.exampledomain.com"],
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


