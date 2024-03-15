# SSIOAccountItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Salesforce id for billto_info | [optional] 
**IoTermsId** | **String** | Salesforce id for IO Terms and Conditions | [optional] 
**IoTerms** | **String** | Salesforce text for IO Terms and Conditions | [optional] 
**UsTermsId** | **String** | Salesforce id for US Terms and Conditions | [optional] 
**UsTerms** | **String** | Salesforce text for US Terms and Conditions | [optional] 
**RowTermsId** | **String** | Salesforce id for Rest of the World Terms and Conditions | [optional] 
**RowTerms** | **String** | Salesforce text for Rest of the World Terms and Conditions | [optional] 
**IoType** | **String** | Insertion Order Type - Pinterest Paper or Agency Paper | [optional] 
**Addresses** | [**SSIOAccountAddress[]**](SSIOAccountAddress.md) | Address information that is associated with this account. | [optional] 

## Examples

- Prepare the resource
```powershell
$SSIOAccountItem = Initialize-PSOpenAPIToolsSSIOAccountItem  -Id 0011N00001LW8kAQAT `
 -IoTermsId a2S1N000000bKHgUAM `
 -IoTerms The IO is governed by the terms available at https://business.pinterest.com/en/pinterest-advertising-services-agreement/. If a budget is listed on this IO, the parties agree that Advertiser (or if applicable, its Agency) may apply any of the budget to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees. The terms of the Agreement supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID. `
 -UsTermsId a2S1N000000bKIOUA2 `
 -UsTerms This Insertion Order (&quot;IO&quot;) is subject to the Pinterest Addendum To IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0), as executed by Pinterest, Inc. and GroupM Worldwide LLC on May 7, 2014 and Amendment No. 1 to Pinterest Addendum to IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0) as executed by Pinterest, Inc. and GroupM Worldwide LLC on August 20, 2015. The parties agree that Agency may apply any of the budget listed on this IO to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees.The terms of the Addendum supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID. `
 -RowTermsId a2S1N000000bKHhUAM `
 -RowTerms The IO is governed by the terms available at
https://business.pinterest.com/en-gb/pinterest-advertising-services-agreement `
 -IoType Pinterest Paper `
 -Addresses null
```

- Convert the resource to JSON
```powershell
$SSIOAccountItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

