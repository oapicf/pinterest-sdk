
# CustomerListRecordRow

A single row in a multi-field customer list (v2 format).

## Properties

Name | Type
------------ | -------------
`email` | string
`externalId` | string
`hashedPhoneNumber` | string
`hashedPinnerId` | string
`ipAddress` | string
`liverampEnvelope` | string
`maid` | string
`userAgent` | string

## Example

```typescript
import type { CustomerListRecordRow } from ''

// TODO: Update the object below with actual values
const example = {
  "email": null,
  "externalId": null,
  "hashedPhoneNumber": null,
  "hashedPinnerId": null,
  "ipAddress": null,
  "liverampEnvelope": null,
  "maid": null,
  "userAgent": null,
} satisfies CustomerListRecordRow

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CustomerListRecordRow
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


