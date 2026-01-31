
# TemplateResponseDateRangeRelativeDateRange

The relative date range of the template

## Properties

Name | Type
------------ | -------------
`endDaysInPast` | number
`startDaysInPast` | number
`type` | string

## Example

```typescript
import type { TemplateResponseDateRangeRelativeDateRange } from ''

// TODO: Update the object below with actual values
const example = {
  "endDaysInPast": 7,
  "startDaysInPast": 14,
  "type": relative,
} satisfies TemplateResponseDateRangeRelativeDateRange

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TemplateResponseDateRangeRelativeDateRange
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


