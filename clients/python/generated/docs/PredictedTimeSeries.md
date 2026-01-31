# PredictedTimeSeries

A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.<br /> These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical `time_series`, normalization is applied independently to the predicted time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative predicted volume between keywords.<br /> **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.<br /> **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2024-01-07` would include predicted searches for the week ending on `2024-01-07`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_date** | **date** |  | [optional] 

## Example

```python
from pinterestsdk.models.predicted_time_series import PredictedTimeSeries

# TODO update the JSON string below
json = "{}"
# create an instance of PredictedTimeSeries from a JSON string
predicted_time_series_instance = PredictedTimeSeries.from_json(json)
# print the JSON string representation of the object
print(PredictedTimeSeries.to_json())

# convert the object into a dict
predicted_time_series_dict = predicted_time_series_instance.to_dict()
# create an instance of PredictedTimeSeries from a dict
predicted_time_series_from_dict = PredictedTimeSeries.from_dict(predicted_time_series_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


