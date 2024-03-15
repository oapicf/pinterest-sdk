
# Table `CreateMMMReportRequest`
(mapped from: CreateMMMReportRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**countries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingAdvertiserCountry&gt;**](TargetingAdvertiserCountry.md) | A List of countries for filtering |  [optional]


# **Table `CreateMMMReportRequestTargetingAdvertiserCountry`**
(mapped from: CreateMMMReportRequestTargetingAdvertiserCountry)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createMMMReportRequest | createMMMReportRequest | long | | kotlin.Long | Primary Key | *one*
targetingAdvertiserCountry | targetingAdvertiserCountry | long | | kotlin.Long | Foreign Key | *many*



