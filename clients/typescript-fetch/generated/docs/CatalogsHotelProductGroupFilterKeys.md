
# CatalogsHotelProductGroupFilterKeys


## Properties

Name | Type
------------ | -------------
`pRICE` | [CatalogsProductGroupPricingCurrencyCriteria](CatalogsProductGroupPricingCurrencyCriteria.md)
`hOTELID` | [CatalogsProductGroupMultipleStringCriteria](.md)
`bRAND` | [CatalogsProductGroupMultipleStringCriteria](.md)
`cUSTOMLABEL0` | [CatalogsProductGroupFilterOperatorTypeCriteria](.md)
`cUSTOMLABEL1` | [CatalogsProductGroupFilterOperatorTypeCriteria](.md)
`cUSTOMLABEL2` | [CatalogsProductGroupFilterOperatorTypeCriteria](.md)
`cUSTOMLABEL3` | [CatalogsProductGroupFilterOperatorTypeCriteria](.md)
`cUSTOMLABEL4` | [CatalogsProductGroupFilterOperatorTypeCriteria](.md)
`cOUNTRY` | [CatalogsProductGroupMultipleCountriesCriteria](.md)
`tITLEKEYWORDS` | [CatalogsProductGroupMultipleStringCriteria](.md)

## Example

```typescript
import type { CatalogsHotelProductGroupFilterKeys } from ''

// TODO: Update the object below with actual values
const example = {
  "pRICE": null,
  "hOTELID": null,
  "bRAND": null,
  "cUSTOMLABEL0": null,
  "cUSTOMLABEL1": null,
  "cUSTOMLABEL2": null,
  "cUSTOMLABEL3": null,
  "cUSTOMLABEL4": null,
  "cOUNTRY": null,
  "tITLEKEYWORDS": null,
} satisfies CatalogsHotelProductGroupFilterKeys

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsHotelProductGroupFilterKeys
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


