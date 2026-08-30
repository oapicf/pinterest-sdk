

# SSIOInsertionOrderCreate

Resource create operation model.

The class is defined in **[SSIOInsertionOrderCreate.java](../../src/main/java/org/openapitools/model/SSIOInsertionOrderCreate.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptedTermsId** | `String` | The SFDC id for the terms | 
**acceptedTermsTime** | `Integer` | The UTC timestamp (to the nearest sec) of when terms were accepted |  [optional property]
**agencyLink** | `String` | URL link for agency |  [optional property]
**billingContactEmail** | `String` | The billing contact email | 
**billingContactFirstname** | `String` | The billing contact first name | 
**billingContactLastname** | `String` | The billing contact last name | 
**billtoBillingAddressId** | `String` | The bill-to billing address id | 
**billtoBusinessAddressId** | `String` | The bill-to business address id | 
**billtoCompanyId** | `String` | The bill-to company id | 
**budgetAmount** | `Double` | If Budget order line, the budget amount. |  [optional property]
**currencyInfo** | `Currency` |  | 
**endDate** | `String` | End date of time period. Format: YYYY-MM-DD |  [optional property]
**estimatedMonthlySpend** | `Double` | If Ongoing (perpetual) order line, the estimated monthly spend |  [optional property]
**mediaContactEmail** | `String` | The media contact email | 
**mediaContactFirstname** | `String` | The media contact first name | 
**mediaContactLastname** | `String` | The media contact last name | 
**orderLineType** | `SSIOOrderLineType` | Type can be Budget or Perpetual | 
**orderName** | `String` | The order name | 
**pmpId** | `String` | The pmp id | 
**poNumber** | `String` | The po number | 
**startDate** | `String` | Starting date of time period. Format: YYYY-MM-DD | 
**userEmail** | `String` | The email of user submitting the insertion order |  [optional property]
























