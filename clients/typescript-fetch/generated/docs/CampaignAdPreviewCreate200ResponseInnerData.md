
# CampaignAdPreviewCreate200ResponseInnerData

Created/updated resource on success or error details on failure

## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`adGroupId` | string
`clientId` | number
`expiresAt` | number
`isActive` | boolean
`pinId` | number
`pinPromotionId` | number
`promotedProductGroupId` | number
`url` | string
`userId` | number
`uuid` | string
`exceptions` | [PinterestLibError](PinterestLibError.md)

## Example

```typescript
import type { CampaignAdPreviewCreate200ResponseInnerData } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": 549755885175,
  "adGroupId": 1234567890,
  "clientId": null,
  "expiresAt": null,
  "isActive": null,
  "pinId": null,
  "pinPromotionId": null,
  "promotedProductGroupId": null,
  "url": https://ads.pinterest.com/web-ad-preview/748db198-bd61-4a6f-b756-996c034e8cbb/,
  "userId": null,
  "uuid": null,
  "exceptions": null,
} satisfies CampaignAdPreviewCreate200ResponseInnerData

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignAdPreviewCreate200ResponseInnerData
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


