
# CatalogsFeedVideoCounts

Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.

## Properties

Name | Type
------------ | -------------
`ingestedVideos` | number
`notIngestedVideos` | number
`totalVideos` | number

## Example

```typescript
import type { CatalogsFeedVideoCounts } from ''

// TODO: Update the object below with actual values
const example = {
  "ingestedVideos": null,
  "notIngestedVideos": null,
  "totalVideos": null,
} satisfies CatalogsFeedVideoCounts

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsFeedVideoCounts
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


