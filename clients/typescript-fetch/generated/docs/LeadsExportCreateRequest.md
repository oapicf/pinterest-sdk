
# LeadsExportCreateRequest


## Properties

Name | Type
------------ | -------------
`startDate` | string
`endDate` | string
`adId` | string

## Example

```typescript
import type { LeadsExportCreateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "startDate": 2020-12-20,
  "endDate": 2020-12-20,
  "adId": 687201361754,
} satisfies LeadsExportCreateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LeadsExportCreateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


