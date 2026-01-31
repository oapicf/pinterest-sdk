# CatalogsReportDistributionStats


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | ID of the catalog entity. | [optional] 
**code** | **int** | The event code that a diagnostics aggregated number references | [optional] 
**code_label** | **str** | A human-friendly label for the event code (e.g, &#39;SPAM&#39;) | [optional] 
**ineligible_for_ads** | **bool** | Indicates if issue makes items ineligible for ads distribution | [optional] 
**ineligible_for_organic** | **bool** | Indicates if issue makes items ineligible for organic distribution | [optional] 
**message** | **str** | Title message describing the diagnostic issue | [optional] 
**occurrences** | **int** | Number of occurrences of the issue | [optional] 
**report_type** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_report_distribution_stats import CatalogsReportDistributionStats

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsReportDistributionStats from a JSON string
catalogs_report_distribution_stats_instance = CatalogsReportDistributionStats.from_json(json)
# print the JSON string representation of the object
print(CatalogsReportDistributionStats.to_json())

# convert the object into a dict
catalogs_report_distribution_stats_dict = catalogs_report_distribution_stats_instance.to_dict()
# create an instance of CatalogsReportDistributionStats from a dict
catalogs_report_distribution_stats_from_dict = CatalogsReportDistributionStats.from_dict(catalogs_report_distribution_stats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


