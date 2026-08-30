# BillingInvoice
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String** | The ID of the ad account this invoice belongs to | [optional] [default to null] |
| **ad\_account\_name** | **String** | The name of the ad account this invoice belongs to | [optional] [default to null] |
| **amount\_billed\_micro\_currency** | **Integer** | The amount billed in this invoice. Denoted in micro currency | [optional] [default to null] |
| **amount\_discount\_micro\_currency** | **Integer** | The discount in this invoice. Denoted in micro currency | [optional] [default to null] |
| **amount\_net\_micro\_currency** | **Integer** | The net amount in this invoice. Denoted in micro currency | [optional] [default to null] |
| **amount\_tax\_micro\_currency** | **Integer** | The tax in this invoice. Denoted in micro currency | [optional] [default to null] |
| **bill\_to\_country** | **String** | The country of the bill to address | [optional] [default to null] |
| **billing\_period\_end\_date** | **date** | The end date of the billing period. Format: YYYY-MM-DD | [optional] [default to null] |
| **billing\_period\_start\_date** | **date** | The start date of the billing period. Format: YYYY-MM-DD | [optional] [default to null] |
| **currency** | [**Currency**](Currency.md) |  | [optional] [default to null] |
| **document\_type** | [**BillingInvoiceDocumentType**](BillingInvoiceDocumentType.md) | The type of the document | [optional] [default to null] |
| **id** | **String** | Unique identifier for the billing invoice | [optional] [default to null] |
| **invoice\_due\_date** | **date** | The date the invoice is due. Format: YYYY-MM-DD | [optional] [default to null] |
| **payment\_terms** | **String** | The payment terms of the invoice | [optional] [default to null] |
| **status** | [**BillingInvoiceStatus**](BillingInvoiceStatus.md) | The status of the invoice | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

