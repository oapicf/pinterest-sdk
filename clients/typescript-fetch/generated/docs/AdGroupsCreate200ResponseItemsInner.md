
# AdGroupsCreate200ResponseItemsInner


## Properties

Name | Type
------------ | -------------
`data` | [AdGroup](AdGroup.md)
`exceptions` | [Array&lt;PinterestLibBatchItemException&gt;](PinterestLibBatchItemException.md)

## Example

```typescript
import type { AdGroupsCreate200ResponseItemsInner } from ''

// TODO: Update the object below with actual values
const example = {
  "data": null,
  "exceptions": null,
} satisfies AdGroupsCreate200ResponseItemsInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdGroupsCreate200ResponseItemsInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


