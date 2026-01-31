
# SSIOOrderLine


## Properties

Name | Type
------------ | -------------
`salesforceOrderLineId` | string
`adsManagerOrderLineId` | string
`pinOrderId` | string
`lastModifiedDateTime` | string
`startDate` | Date
`endDate` | Date
`billToCompanyName` | string
`billingContactFirstname` | string
`billingContactLastname` | string
`billingContactEmail` | string
`mediaContactEmail` | string
`mediaContactFirstname` | string
`mediaContactLastname` | string
`currencyInfo` | [Currency](Currency.md)
`agencyLink` | string
`poNumber` | string
`orderName` | string
`pmpName` | string
`acceptedTermsId` | string
`acceptedTermsTime` | string
`budgetAmount` | number
`estimatedMonthlySpend` | number

## Example

```typescript
import type { SSIOOrderLine } from ''

// TODO: Update the object below with actual values
const example = {
  "salesforceOrderLineId": null,
  "adsManagerOrderLineId": null,
  "pinOrderId": null,
  "lastModifiedDateTime": 2020-10-06T13:07:04.000Z,
  "startDate": Thu Mar 01 00:00:00 UTC 2018,
  "endDate": Mon Oct 05 00:00:00 UTC 2020,
  "billToCompanyName": Home Depot Inc.,
  "billingContactFirstname": Mary,
  "billingContactLastname": Smith,
  "billingContactEmail": mail@test.com,
  "mediaContactEmail": mail@test.com,
  "mediaContactFirstname": John,
  "mediaContactLastname": Doe,
  "currencyInfo": null,
  "agencyLink": ,
  "poNumber": null,
  "orderName": null,
  "pmpName": null,
  "acceptedTermsId": null,
  "acceptedTermsTime": 2020-10-06T13:07:04.000Z,
  "budgetAmount": 5000000,
  "estimatedMonthlySpend": null,
} satisfies SSIOOrderLine

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SSIOOrderLine
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


