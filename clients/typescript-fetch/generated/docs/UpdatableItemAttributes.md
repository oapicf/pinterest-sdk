
# UpdatableItemAttributes


## Properties

Name | Type
------------ | -------------
`adLink` | string
`adult` | boolean
`ageGroup` | string
`availability` | string
`averageReviewRating` | number
`brand` | string
`checkoutEnabled` | boolean
`color` | string
`condition` | string
`customLabel0` | string
`customLabel1` | string
`customLabel2` | string
`customLabel3` | string
`customLabel4` | string
`description` | string
`freeShippingLabel` | boolean
`freeShippingLimit` | string
`gender` | string
`googleProductCategory` | string
`gtin` | number
`id` | string
`itemGroupId` | string
`lastUpdatedTime` | number
`link` | string
`material` | string
`minAdPrice` | string
`mobileLink` | string
`mpn` | string
`numberOfRatings` | number
`numberOfReviews` | number
`pattern` | string
`price` | string
`productType` | string
`salePrice` | string
`shipping` | string
`shippingHeight` | string
`shippingWeight` | string
`shippingWidth` | string
`size` | string
`sizeSystem` | string
`sizeType` | string
`tax` | string
`title` | string
`variantNames` | Array&lt;string&gt;
`variantValues` | Array&lt;string&gt;

## Example

```typescript
import type { UpdatableItemAttributes } from ''

// TODO: Update the object below with actual values
const example = {
  "adLink": https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest,
  "adult": true,
  "ageGroup": newborn,
  "availability": in stock,
  "averageReviewRating": 5,
  "brand": Josie’s Denim,
  "checkoutEnabled": false,
  "color": blue,
  "condition": new,
  "customLabel0": Best sellers,
  "customLabel1": Summer promotion,
  "customLabel2": Winter sales,
  "customLabel3": Woman dress,
  "customLabel4": Man hat,
  "description": Casual fit denim shirt made with the finest quality Japanese denim.,
  "freeShippingLabel": true,
  "freeShippingLimit": 35 USD,
  "gender": unisex,
  "googleProductCategory": Apparel & Accessories > Clothing > Shirts & Tops,
  "gtin": 3234567890126,
  "id": DS0294-L,
  "itemGroupId": DS0294,
  "lastUpdatedTime": 1641483432072,
  "link": https://www.example.com/cat/womens-clothing/denim-shirt-0294,
  "material": cotton,
  "minAdPrice": 19.99 USD,
  "mobileLink": https://m.example.com/cat/womens-clothing/denim-shirt-0294,
  "mpn": PI12345NTEREST,
  "numberOfRatings": 10,
  "numberOfReviews": 10,
  "pattern": plaid,
  "price": 24.99 USD,
  "productType": Clothing > Women’s > Shirts > Denim,
  "salePrice": 14.99 USD,
  "shipping": US:CA:Ground:0 USD,
  "shippingHeight": 12 in,
  "shippingWeight": 3 kg,
  "shippingWidth": 16 in,
  "size": M,
  "sizeSystem": US,
  "sizeType": regular,
  "tax": US:1025433:6.00:y,
  "title": Women’s denim shirt, large,
  "variantNames": ["Color","Size"],
  "variantValues": ["Red","Small"],
} satisfies UpdatableItemAttributes

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UpdatableItemAttributes
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


