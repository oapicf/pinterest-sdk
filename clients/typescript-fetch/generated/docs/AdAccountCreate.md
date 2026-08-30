
# AdAccountCreate

Resource create operation model.

## Properties

Name | Type
------------ | -------------
`country` | [Country](Country.md)
`currency` | [Currency](Currency.md)
`name` | string
`ownerUserId` | string
`timeZone` | string

## Example

```typescript
import type { AdAccountCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "country": null,
  "currency": null,
  "name": null,
  "ownerUserId": null,
  "timeZone": America/Los_Angeles,
} satisfies AdAccountCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdAccountCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


