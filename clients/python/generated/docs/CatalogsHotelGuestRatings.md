# CatalogsHotelGuestRatings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_score** | **float** | Max value for the hotel rating score. | [optional] 
**number_of_reviewers** | **int** | Total number of people who have rated this hotel. | [optional] 
**rating_system** | **str** | System you use for guest reviews. | [optional] 
**score** | **float** | Your hotel&#39;s rating. | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_hotel_guest_ratings import CatalogsHotelGuestRatings

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelGuestRatings from a JSON string
catalogs_hotel_guest_ratings_instance = CatalogsHotelGuestRatings.from_json(json)
# print the JSON string representation of the object
print(CatalogsHotelGuestRatings.to_json())

# convert the object into a dict
catalogs_hotel_guest_ratings_dict = catalogs_hotel_guest_ratings_instance.to_dict()
# create an instance of CatalogsHotelGuestRatings from a dict
catalogs_hotel_guest_ratings_from_dict = CatalogsHotelGuestRatings.from_dict(catalogs_hotel_guest_ratings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


