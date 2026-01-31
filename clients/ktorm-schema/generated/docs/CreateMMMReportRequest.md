
# Table `CreateMMMReportRequest`
(mapped from: CreateMMMReportRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**reportName** | report_name | text NOT NULL |  | **kotlin.String** | Name of the Marketing Mix Modeling (MMM) report | 
**startDate** | start_date | text NOT NULL |  | **kotlin.String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | end_date | text NOT NULL |  | **kotlin.String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | granularity | text NOT NULL |  | [**granularity**](#Granularity) | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. | 
**level** | level | text NOT NULL |  | [**level**](#Level) | Level of the report | 
**targetingTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MMMReportingTargetingType&gt;**](MMMReportingTargetingType.md) | List of targeting types | 
**columns** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MMMReportingColumn&gt;**](MMMReportingColumn.md) | Metric and entity columns | 
**countries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingAdvertiserCountry&gt;**](TargetingAdvertiserCountry.md) | A List of countries for filtering |  [optional]







# **Table `CreateMMMReportRequestMMMReportingTargetingType`**
(mapped from: CreateMMMReportRequestMMMReportingTargetingType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createMMMReportRequest | createMMMReportRequest | long | | kotlin.Long | Primary Key | *one*
mMMReportingTargetingType | mMMReportingTargetingType | long | | kotlin.Long | Foreign Key | *many*



# **Table `CreateMMMReportRequestMMMReportingColumn`**
(mapped from: CreateMMMReportRequestMMMReportingColumn)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createMMMReportRequest | createMMMReportRequest | long | | kotlin.Long | Primary Key | *one*
mMMReportingColumn | mMMReportingColumn | long | | kotlin.Long | Foreign Key | *many*



# **Table `CreateMMMReportRequestTargetingAdvertiserCountry`**
(mapped from: CreateMMMReportRequestTargetingAdvertiserCountry)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createMMMReportRequest | createMMMReportRequest | long | | kotlin.Long | Primary Key | *one*
targetingAdvertiserCountry | targetingAdvertiserCountry | long | | kotlin.Long | Foreign Key | *many*



