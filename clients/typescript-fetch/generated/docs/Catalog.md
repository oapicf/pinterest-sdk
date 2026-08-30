
# Catalog

Catalog entity

## Properties

Name | Type
------------ | -------------
`catalogType` | [CatalogsType](CatalogsType.md)
`createdAt` | Date
`id` | string
`name` | string
`updatedAt` | Date

## Example

```typescript
import type { Catalog } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogType": null,
  "createdAt": 2022-03-14T15:15:22Z,
  "id": 864344156814050986,
  "name": null,
  "updatedAt": 2022-03-14T15:16:34Z,
} satisfies Catalog

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Catalog
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


