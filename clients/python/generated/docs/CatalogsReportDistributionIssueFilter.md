# CatalogsReportDistributionIssueFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] 
**report_type** | **str** |  | 

## Example

```python
from pinterestsdk.models.catalogs_report_distribution_issue_filter import CatalogsReportDistributionIssueFilter

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsReportDistributionIssueFilter from a JSON string
catalogs_report_distribution_issue_filter_instance = CatalogsReportDistributionIssueFilter.from_json(json)
# print the JSON string representation of the object
print(CatalogsReportDistributionIssueFilter.to_json())

# convert the object into a dict
catalogs_report_distribution_issue_filter_dict = catalogs_report_distribution_issue_filter_instance.to_dict()
# create an instance of CatalogsReportDistributionIssueFilter from a dict
catalogs_report_distribution_issue_filter_from_dict = CatalogsReportDistributionIssueFilter.from_dict(catalogs_report_distribution_issue_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


