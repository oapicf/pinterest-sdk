
# SSIOAccountItem


## Properties

Name | Type
------------ | -------------
`addresses` | [Array&lt;SSIOAccountAddress&gt;](SSIOAccountAddress.md)
`id` | string
`ioTerms` | string
`ioTermsId` | string
`ioType` | string
`rowTerms` | string
`rowTermsId` | string
`usTerms` | string
`usTermsId` | string

## Example

```typescript
import type { SSIOAccountItem } from ''

// TODO: Update the object below with actual values
const example = {
  "addresses": null,
  "id": 0011N00001LW8kAQAT,
  "ioTerms": The IO is governed by the terms available at https://business.pinterest.com/en/pinterest-advertising-services-agreement/. If a budget is listed on this IO, the parties agree that Advertiser (or if applicable, its Agency) may apply any of the budget to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees. The terms of the Agreement supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID.,
  "ioTermsId": a2S1N000000bKHgUAM,
  "ioType": Pinterest Paper,
  "rowTerms": The IO is governed by the terms available at
https://business.pinterest.com/en-gb/pinterest-advertising-services-agreement,
  "rowTermsId": a2S1N000000bKHhUAM,
  "usTerms": This Insertion Order ("IO") is subject to the Pinterest Addendum To IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0), as executed by Pinterest, Inc. and GroupM Worldwide LLC on May 7, 2014 and Amendment No. 1 to Pinterest Addendum to IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0) as executed by Pinterest, Inc. and GroupM Worldwide LLC on August 20, 2015. The parties agree that Agency may apply any of the budget listed on this IO to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees.The terms of the Addendum supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID.,
  "usTermsId": a2S1N000000bKIOUA2,
} satisfies SSIOAccountItem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SSIOAccountItem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


