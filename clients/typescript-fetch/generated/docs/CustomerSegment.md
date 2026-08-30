
# CustomerSegment


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`audienceIds` | Array&lt;string&gt;
`createdTime` | number
`id` | string
`name` | string
`status` | [TargetingTemplateStatus](TargetingTemplateStatus.md)
`updatedTime` | number

## Example

```typescript
import type { CustomerSegment } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": null,
  "audienceIds": null,
  "createdTime": null,
  "id": null,
  "name": null,
  "status": null,
  "updatedTime": null,
} satisfies CustomerSegment

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CustomerSegment
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


