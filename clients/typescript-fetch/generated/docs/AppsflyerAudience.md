
# AppsflyerAudience

Request model for creating an AppsFlyer audience

## Properties

Name | Type
------------ | -------------
`containerId` | string
`name` | string
`platform` | [AppsflyerPlatform](AppsflyerPlatform.md)

## Example

```typescript
import type { AppsflyerAudience } from ''

// TODO: Update the object below with actual values
const example = {
  "containerId": null,
  "name": null,
  "platform": null,
} satisfies AppsflyerAudience

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AppsflyerAudience
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


