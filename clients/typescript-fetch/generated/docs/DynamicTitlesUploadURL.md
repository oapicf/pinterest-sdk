
# DynamicTitlesUploadURL


## Properties

Name | Type
------------ | -------------
`existingFilename` | string
`requestId` | string
`uploadUrl` | string

## Example

```typescript
import type { DynamicTitlesUploadURL } from ''

// TODO: Update the object below with actual values
const example = {
  "existingFilename": aid-549755814107/ad_group-1099511703602/validated_approvals.csv,
  "requestId": 549755814107-1099511703602-1714300000-abc123,
  "uploadUrl": https://s3.amazonaws.com/bucket/dynamic_titles/candidate.csv?AWSAccessKeyId=...,
} satisfies DynamicTitlesUploadURL

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as DynamicTitlesUploadURL
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


