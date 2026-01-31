
# SSIOAccountResponse


## Properties

Name | Type
------------ | -------------
`eligible` | boolean
`canEdit` | boolean
`billtoInfos` | [Array&lt;SSIOAccountItem&gt;](SSIOAccountItem.md)
`currency` | string
`pmpNames` | [Array&lt;SSIOAccountPMPName&gt;](SSIOAccountPMPName.md)
`error` | string

## Example

```typescript
import type { SSIOAccountResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "eligible": true,
  "canEdit": true,
  "billtoInfos": null,
  "currency": USD,
  "pmpNames": null,
  "error": No Error,
} satisfies SSIOAccountResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SSIOAccountResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


