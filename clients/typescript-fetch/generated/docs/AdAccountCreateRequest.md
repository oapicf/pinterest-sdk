
# AdAccountCreateRequest


## Properties

Name | Type
------------ | -------------
`country` | [Country](Country.md)
`name` | string
`ownerUserId` | string

## Example

```typescript
import type { AdAccountCreateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "country": null,
  "name": ACME Tools,
  "ownerUserId": 383791336903426391,
} satisfies AdAccountCreateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdAccountCreateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


