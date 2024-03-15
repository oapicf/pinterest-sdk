# CatalogsHotelGuestRatings
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Score** | **Decimal** | Your hotel&#39;s rating. | [optional] 
**NumberOfReviewers** | **Int32** | Total number of people who have rated this hotel. | [optional] 
**MaxScore** | **Decimal** | Max value for the hotel rating score. | [optional] 
**RatingSystem** | **String** | System you use for guest reviews. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelGuestRatings = Initialize-PSOpenAPIToolsCatalogsHotelGuestRatings  -Score null `
 -NumberOfReviewers null `
 -MaxScore null `
 -RatingSystem null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelGuestRatings | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

