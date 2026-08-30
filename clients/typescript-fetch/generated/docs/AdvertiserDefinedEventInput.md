
# AdvertiserDefinedEventInput

Advertiser defined event input for create/update operations

## Properties

Name | Type
------------ | -------------
`mappedConversionType` | [AdvertiserDefinedEventMappingType](AdvertiserDefinedEventMappingType.md)
`name` | string

## Example

```typescript
import type { AdvertiserDefinedEventInput } from ''

// TODO: Update the object below with actual values
const example = {
  "mappedConversionType": SIGNUP,
  "name": newsletter_signup,
} satisfies AdvertiserDefinedEventInput

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdvertiserDefinedEventInput
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


