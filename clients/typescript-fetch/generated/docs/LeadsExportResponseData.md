
# LeadsExportResponseData


## Properties

Name | Type
------------ | -------------
`exportStatus` | [LeadsExportStatus](LeadsExportStatus.md)
`downloadUrl` | string

## Example

```typescript
import type { LeadsExportResponseData } from ''

// TODO: Update the object below with actual values
const example = {
  "exportStatus": null,
  "downloadUrl": null,
} satisfies LeadsExportResponseData

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LeadsExportResponseData
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


