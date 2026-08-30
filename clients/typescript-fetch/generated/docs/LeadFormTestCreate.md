
# LeadFormTestCreate

Resource create operation model.

## Properties

Name | Type
------------ | -------------
`answers` | Array&lt;string&gt;

## Example

```typescript
import type { LeadFormTestCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "answers": ["John","Doe","abc@email.com","987654321"],
} satisfies LeadFormTestCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LeadFormTestCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


