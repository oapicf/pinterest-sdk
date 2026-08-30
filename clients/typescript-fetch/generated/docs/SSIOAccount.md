
# SSIOAccount

Salesforce account details including bill-to information.

## Properties

Name | Type
------------ | -------------
`billtoInfos` | [Array&lt;SSIOAccountItem&gt;](SSIOAccountItem.md)
`canEdit` | boolean
`currency` | string
`eligible` | boolean
`error` | string
`pmpNames` | [Array&lt;SSIOAccountPMPName&gt;](SSIOAccountPMPName.md)

## Example

```typescript
import type { SSIOAccount } from ''

// TODO: Update the object below with actual values
const example = {
  "billtoInfos": null,
  "canEdit": true,
  "currency": USD,
  "eligible": true,
  "error": No Error,
  "pmpNames": null,
} satisfies SSIOAccount

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SSIOAccount
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


