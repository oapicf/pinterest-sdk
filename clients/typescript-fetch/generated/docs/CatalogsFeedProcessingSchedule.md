
# CatalogsFeedProcessingSchedule

Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).

## Properties

Name | Type
------------ | -------------
`time` | string
`timezone` | string

## Example

```typescript
import type { CatalogsFeedProcessingSchedule } from ''

// TODO: Update the object below with actual values
const example = {
  "time": 02:59,
  "timezone": null,
} satisfies CatalogsFeedProcessingSchedule

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsFeedProcessingSchedule
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


