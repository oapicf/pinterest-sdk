# SSIOCreateInsertionOrderRequest
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **start\_date** | **String** | Starting date of time period. Format: YYYY-MM-DD | [default to null] |
| **end\_date** | **String** | End date of time period. Format: YYYY-MM-DD | [optional] [default to null] |
| **po\_number** | **String** | The po number | [default to null] |
| **budget\_amount** | **BigDecimal** | If Budget order line, the budget amount. | [optional] [default to null] |
| **billing\_contact\_firstname** | **String** | The billing contact first name | [default to null] |
| **billing\_contact\_lastname** | **String** | The billing contact last name | [default to null] |
| **billing\_contact\_email** | **String** | The billing contact email | [default to null] |
| **media\_contact\_firstname** | **String** | The media contact first name | [default to null] |
| **media\_contact\_lastname** | **String** | The media contact last name | [default to null] |
| **media\_contact\_email** | **String** | The media contact email | [default to null] |
| **agency\_link** | **String** | URL link for agency | [optional] [default to null] |
| **user\_email** | **String** | The email of user submitting the insertion order | [optional] [default to null] |
| **accepted\_terms\_time** | **Integer** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] [default to null] |
| **pmp\_id** | **String** | The pmp id | [default to null] |
| **order\_name** | **String** | The order name | [default to null] |
| **order\_line\_type** | **String** | Type can be Budget or Perpetual | [default to null] |
| **accepted\_terms\_id** | **String** | The SFDC id for the terms | [default to null] |
| **billto\_company\_id** | **String** | The bill-to company id | [default to null] |
| **billto\_business\_address\_id** | **String** | The bill-to business address id | [default to null] |
| **billto\_billing\_address\_id** | **String** | The bill-to billing address id | [default to null] |
| **estimated\_monthly\_spend** | **BigDecimal** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] [default to null] |
| **currency\_info** | [**Currency**](Currency.md) |  | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

