
# SingleInterestTargetingOptionResponse


## Properties

Name | Type
------------ | -------------
`id` | string
`name` | string
`childInterests` | Array&lt;string&gt;
`level` | number

## Example

```typescript
import type { SingleInterestTargetingOptionResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 945391946569,
  "name": Dress,
  "childInterests": null,
  "level": 2,
} satisfies SingleInterestTargetingOptionResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SingleInterestTargetingOptionResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


