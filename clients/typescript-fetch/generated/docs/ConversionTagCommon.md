
# ConversionTagCommon


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`codeSnippet` | string
`enhancedMatchStatus` | [EnhancedMatchStatusType](EnhancedMatchStatusType.md)
`id` | string
`lastFiredTimeMs` | number
`name` | string
`status` | [EntityStatus](EntityStatus.md)
`version` | string
`configs` | [ConversionTagConfigs](ConversionTagConfigs.md)

## Example

```typescript
import type { ConversionTagCommon } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": 549755885175,
  "codeSnippet": <script type=text/javascript> [...],
  "enhancedMatchStatus": null,
  "id": 2617998078212,
  "lastFiredTimeMs": 1599030000000,
  "name": ACME Checkout Test Tag,
  "status": null,
  "version": 3,
  "configs": null,
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


