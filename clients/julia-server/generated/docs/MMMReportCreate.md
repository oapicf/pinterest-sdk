# MMMReportCreate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`advertiser_ids`** | **`Vector{String}`** | Advertiser IDs for multi-advertiser report | [optional] [default to nothing]
**`columns`** | [**`Vector{MMMReportingColumn}`**](MMMReportingColumn.md) | Metric and entity columns | [default to nothing]
**`countries`** | [**`Vector{TargetingAdvertiserCountry}`**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] [default to nothing]
**`custom_column_ids`** | **`Vector{String}`** | List of custom column IDs | [optional] [default to nothing]
**`end_date`** | **`String`** | Metric report end date (UTC). Format: YYYY-MM-DD | [default to nothing]
**`granularity`** | [**`*MMMReportGranularity`**](MMMReportGranularity.md) |   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. | [default to nothing]
**`level`** | [**`*MMMReportLevel`**](MMMReportLevel.md) | Level of the report | [default to nothing]
**`report_name`** | **`String`** | Name of the Marketing Mix Modeling (MMM) report | [default to nothing]
**`start_date`** | **`String`** | Metric report start date (UTC). Format: YYYY-MM-DD | [default to nothing]
**`targeting_types`** | [**`Vector{MMMReportingTargetingType}`**](MMMReportingTargetingType.md) | List of targeting types | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


