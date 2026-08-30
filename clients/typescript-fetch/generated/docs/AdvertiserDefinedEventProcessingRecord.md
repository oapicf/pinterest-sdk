
# AdvertiserDefinedEventProcessingRecord

Processing record for an advertiser defined event operation

## Properties

Name | Type
------------ | -------------
`exceptions` | Array&lt;string&gt;
`name` | string
`status` | string

## Example

```typescript
import type { AdvertiserDefinedEventProcessingRecord } from ''

// TODO: Update the object below with actual values
const example = {
  "exceptions": null,
  "name": newsletter_signup,
  "status": success,
} satisfies AdvertiserDefinedEventProcessingRecord

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdvertiserDefinedEventProcessingRecord
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


