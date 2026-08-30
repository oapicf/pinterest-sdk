
# ConversionTagCommon


## Properties

Name | Type
------------ | -------------
`codeSnippet` | string
`configs` | [ConversionTagConfigs](ConversionTagConfigs.md)
`enhancedMatchStatus` | [EnhancedMatchStatusType](EnhancedMatchStatusType.md)
`id` | string
`lastFiredTimeMs` | number
`name` | string
`version` | string

## Example

```typescript
import type { ConversionTagCommon } from ''

// TODO: Update the object below with actual values
const example = {
  "codeSnippet": <script type=text/javascript> [...],
  "configs": null,
  "enhancedMatchStatus": VALIDATION_COMPLETE,
  "id": 2617998078212,
  "lastFiredTimeMs": 1599030000000,
  "name": download_picture,
  "version": 3,
} satisfies ConversionTagCommon

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionTagCommon
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


