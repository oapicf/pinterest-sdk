
# BillingInvoice

A billing invoice in the advertiser account.

## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`adAccountName` | string
`amountBilledMicroCurrency` | number
`amountDiscountMicroCurrency` | number
`amountNetMicroCurrency` | number
`amountTaxMicroCurrency` | number
`billToCountry` | string
`billingPeriodEndDate` | Date
`billingPeriodStartDate` | Date
`currency` | [Currency](Currency.md)
`documentType` | [BillingInvoiceDocumentType](BillingInvoiceDocumentType.md)
`id` | string
`invoiceDueDate` | Date
`paymentTerms` | string
`status` | [BillingInvoiceStatus](BillingInvoiceStatus.md)

## Example

```typescript
import type { BillingInvoice } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": null,
  "adAccountName": null,
  "amountBilledMicroCurrency": null,
  "amountDiscountMicroCurrency": null,
  "amountNetMicroCurrency": null,
  "amountTaxMicroCurrency": null,
  "billToCountry": null,
  "billingPeriodEndDate": null,
  "billingPeriodStartDate": null,
  "currency": null,
  "documentType": null,
  "id": null,
  "invoiceDueDate": null,
  "paymentTerms": NET 30,
  "status": OPEN,
} satisfies BillingInvoice

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BillingInvoice
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


