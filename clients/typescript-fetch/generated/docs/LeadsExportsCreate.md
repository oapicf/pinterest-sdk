
# LeadsExportsCreate

Resource create operation model.

## Properties

Name | Type
------------ | -------------
`adId` | string
`endDate` | string
`startDate` | string

## Example

```typescript
import type { LeadsExportsCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "adId": 687201361754,
  "endDate": 2020-12-20,
  "startDate": 2020-12-20,
} satisfies LeadsExportsCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LeadsExportsCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


