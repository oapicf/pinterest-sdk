
# ProductGroupPromotionResponseElement


## Properties

Name | Type
------------ | -------------
`id` | string
`adGroupId` | string
`bidInMicroCurrency` | number
`included` | boolean
`definition` | string
`relativeDefinition` | string
`parentId` | string
`slideshowCollectionsTitle` | string
`slideshowCollectionsDescription` | string
`isMdl` | boolean
`status` | [EntityStatus](EntityStatus.md)
`trackingUrl` | string
`catalogProductGroupId` | string
`catalogProductGroupName` | string
`collectionsHeroPinId` | string
`collectionsHeroDestinationUrl` | string
`gridClickType` | [GridClickType](GridClickType.md)
`creativeType` | [CreativeType](CreativeType.md)

## Example

```typescript
import type { ProductGroupPromotionResponseElement } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 2680059592705,
  "adGroupId": 2680059592705,
  "bidInMicroCurrency": 14000000,
  "included": true,
  "definition": */product_type_0='kitchen'/product_type_1='beverage appliances',
  "relativeDefinition": product_type_1='beverage appliances',
  "parentId": 1231234,
  "slideshowCollectionsTitle": slideshow title,
  "slideshowCollectionsDescription": slideshow description,
  "isMdl": true,
  "status": null,
  "trackingUrl": https://www.pinterest.com,
  "catalogProductGroupId": 1231235,
  "catalogProductGroupName": catalogProductGroupName,
  "collectionsHeroPinId": 123123,
  "collectionsHeroDestinationUrl": http://www.pinterest.com,
  "gridClickType": null,
  "creativeType": null,
} satisfies ProductGroupPromotionResponseElement

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ProductGroupPromotionResponseElement
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


