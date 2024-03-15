# SSIOOrderLine
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SalesforceOrderLineId** | **String** | OrderLineId in SFDC | [optional] 
**AdsManagerOrderLineId** | **String** | Ads manager OrderLineId | [optional] 
**PinOrderId** | **String** | The pin order id associated with the order line in SFDC | [optional] 
**LastModifiedDateTime** | **String** | Last modified date. | [optional] 
**StartDate** | **System.DateTime** | Start date of the order line. | [optional] 
**EndDate** | **System.DateTime** | End date of the order line. | [optional] 
**BillToCompanyName** | **String** | Bill To Company name | [optional] 
**BillingContactFirstname** | **String** | Billing contact first name | [optional] 
**BillingContactLastname** | **String** | Billing contact last name | [optional] 
**BillingContactEmail** | **String** | Billing contact email | [optional] 
**MediaContactEmail** | **String** | Billing media email | [optional] 
**MediaContactFirstname** | **String** | Billing contact first name | [optional] 
**MediaContactLastname** | **String** | Billing contact first name | [optional] 
**CurrencyInfo** | [**Currency**](Currency.md) |  | [optional] 
**AgencyLink** | **String** | Agency link | [optional] 
**PoNumber** | **String** | The po number | [optional] 
**OrderName** | **String** | The order name | [optional] 
**PmpName** | **String** | The Pinterest marketing partner name | [optional] 
**AcceptedTermsId** | **String** | The SFDC id for the terms | [optional] 
**AcceptedTermsTime** | **String** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**BudgetAmount** | **Decimal** | If Budget order line, the budget amount. | [optional] 
**EstimatedMonthlySpend** | **Decimal** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 

## Examples

- Prepare the resource
```powershell
$SSIOOrderLine = Initialize-PSOpenAPIToolsSSIOOrderLine  -SalesforceOrderLineId null `
 -AdsManagerOrderLineId null `
 -PinOrderId null `
 -LastModifiedDateTime 2020-10-06T13:07:04.000Z `
 -StartDate Thu Mar 01 00:00:00 UTC 2018 `
 -EndDate Mon Oct 05 00:00:00 UTC 2020 `
 -BillToCompanyName Home Depot Inc. `
 -BillingContactFirstname Mary `
 -BillingContactLastname Smith `
 -BillingContactEmail mail@test.com `
 -MediaContactEmail mail@test.com `
 -MediaContactFirstname John `
 -MediaContactLastname Doe `
 -CurrencyInfo null `
 -AgencyLink  `
 -PoNumber null `
 -OrderName null `
 -PmpName null `
 -AcceptedTermsId null `
 -AcceptedTermsTime 2020-10-06T13:07:04.000Z `
 -BudgetAmount 5000000 `
 -EstimatedMonthlySpend null
```

- Convert the resource to JSON
```powershell
$SSIOOrderLine | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

