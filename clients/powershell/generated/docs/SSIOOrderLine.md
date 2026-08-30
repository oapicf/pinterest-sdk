# SSIOOrderLine
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AcceptedTermsId** | **String** | The SFDC id for the terms | [optional] 
**AcceptedTermsTime** | **String** | The UTC timestamp (to the nearest second) when terms were accepted. | [optional] 
**AdsManagerOrderLineId** | **String** | Ads manager order line id | [optional] 
**AgencyLink** | **String** | Agency link | [optional] 
**BillToCompanyName** | **String** | Bill-to company name | [optional] 
**BillingContactEmail** | **String** | Billing contact email | [optional] 
**BillingContactFirstname** | **String** | Billing contact first name | [optional] 
**BillingContactLastname** | **String** | Billing contact last name | [optional] 
**BudgetAmount** | **Decimal** | If budget order line, the budget amount. | [optional] 
**CurrencyInfo** | [**Currency**](Currency.md) |  | [optional] 
**EndDate** | **System.DateTime** | End date of the order line. | [optional] 
**EstimatedMonthlySpend** | **Decimal** | If ongoing (perpetual) order line, the estimated monthly spend. | [optional] 
**LastModifiedDateTime** | **String** | Last modified date. | [optional] 
**MediaContactEmail** | **String** | Billing media email | [optional] 
**MediaContactFirstname** | **String** | Billing media contact first name | [optional] 
**MediaContactLastname** | **String** | Billing media contact last name | [optional] 
**OrderName** | **String** | The order name | [optional] 
**PinOrderId** | **String** | The pin order id associated with the order line in SFDC | [optional] 
**PmpName** | **String** | The Pinterest marketing partner name | [optional] 
**PoNumber** | **String** | The PO number | [optional] 
**SalesforceOrderLineId** | **String** | Order line id in SFDC | [optional] 
**StartDate** | **System.DateTime** | Start date of the order line. | [optional] 

## Examples

- Prepare the resource
```powershell
$SSIOOrderLine = Initialize-PSOpenAPIToolsSSIOOrderLine  -AcceptedTermsId null `
 -AcceptedTermsTime 2020-10-06T13:07:04.000Z `
 -AdsManagerOrderLineId null `
 -AgencyLink  `
 -BillToCompanyName Home Depot Inc. `
 -BillingContactEmail mail@test.com `
 -BillingContactFirstname Mary `
 -BillingContactLastname Smith `
 -BudgetAmount 5000000 `
 -CurrencyInfo null `
 -EndDate null `
 -EstimatedMonthlySpend null `
 -LastModifiedDateTime 2020-10-06T13:07:04.000Z `
 -MediaContactEmail mail@test.com `
 -MediaContactFirstname John `
 -MediaContactLastname Doe `
 -OrderName null `
 -PinOrderId null `
 -PmpName null `
 -PoNumber null `
 -SalesforceOrderLineId null `
 -StartDate null
```

- Convert the resource to JSON
```powershell
$SSIOOrderLine | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

