
# ConversionEventResponse


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`conversionEvent` | [ConversionTagType](ConversionTagType.md)
`conversionTagId` | string
`createdTime` | number

## Example

```typescript
import type { ConversionEventResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": 549757463328,
  "conversionEvent": null,
  "conversionTagId": 2614324385652,
  "createdTime": 1564768710,
} satisfies ConversionEventResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionEventResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


