
# ProductGroupPromotion


## Properties

Name | Type
------------ | -------------
`adGroupId` | string
`bidInMicroCurrency` | number
`catalogProductGroupId` | string
`catalogProductGroupName` | string
`collectionsHeaderType` | string
`collectionsHeroDestinationUrl` | string
`collectionsHeroPinId` | string
`creativeType` | [CreativeType](CreativeType.md)
`customizableCtaType` | string
`definition` | string
`gridClickType` | [GridClickType](GridClickType.md)
`id` | string
`included` | boolean
`isGenerateBackground` | boolean
`isMdl` | boolean
`parentId` | string
`preferredMediaType` | string
`relativeDefinition` | string
`selectedImageTag` | string
`selectedVideoTag` | string
`slideshowCollectionsDescription` | string
`slideshowCollectionsTitle` | string
`status` | [EntityStatus](EntityStatus.md)
`trackingUrl` | string

## Example

```typescript
import type { ProductGroupPromotion } from ''

// TODO: Update the object below with actual values
const example = {
  "adGroupId": 2680059592705,
  "bidInMicroCurrency": 14000000,
  "catalogProductGroupId": 1231235,
  "catalogProductGroupName": catalogProductGroupName,
  "collectionsHeaderType": SHOP_THIS_COLLECTION,
  "collectionsHeroDestinationUrl": http://www.pinterest.com,
  "collectionsHeroPinId": 123123,
  "creativeType": null,
  "customizableCtaType": SHOP_NOW,
  "definition": */product_type_0='kitchen'/product_type_1='beverage appliances',
  "gridClickType": null,
  "id": 2680059592705,
  "included": true,
  "isGenerateBackground": true,
  "isMdl": true,
  "parentId": 1231234,
  "preferredMediaType": VIDEO,
  "relativeDefinition": product_type_1='beverage appliances',
  "selectedImageTag": holiday_sale,
  "selectedVideoTag": holiday_sale,
  "slideshowCollectionsDescription": slideshow description,
  "slideshowCollectionsTitle": slideshow title,
  "status": null,
  "trackingUrl": https://www.pinterest.com,
} satisfies ProductGroupPromotion

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ProductGroupPromotion
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


