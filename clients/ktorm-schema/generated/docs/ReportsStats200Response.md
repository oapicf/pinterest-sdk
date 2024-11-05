
# Table `reports_stats_200_response`
(mapped from: ReportsStats200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsReportStats&gt;**](CatalogsReportStats.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `ReportsStats200ResponseCatalogsReportStats`**
(mapped from: ReportsStats200ResponseCatalogsReportStats)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
reportsStats200Response | reportsStats200Response | long | | kotlin.Long | Primary Key | *one*
catalogsReportStats | catalogsReportStats | long | | kotlin.Long | Foreign Key | *many*




