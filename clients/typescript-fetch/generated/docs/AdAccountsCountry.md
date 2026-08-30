
# AdAccountsCountry


## Properties

Name | Type
------------ | -------------
`code` | [Country](Country.md)
`currency` | string
`index` | number
`name` | string

## Example

```typescript
import type { AdAccountsCountry } from ''

// TODO: Update the object below with actual values
const example = {
  "code": US,
  "currency": Dollars,
  "index": 1,
  "name": United States of America,
} satisfies AdAccountsCountry

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdAccountsCountry
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


