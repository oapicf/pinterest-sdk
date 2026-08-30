
# Table `MMMReportCreate`
(mapped from: MMMReportCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**columns** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MMMReportingColumn&gt;**](MMMReportingColumn.md) | Metric and entity columns | 
**endDate** | end_date | text NOT NULL |  | **kotlin.String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | granularity | long NOT NULL |  | [**MMMReportGranularity**](MMMReportGranularity.md) |   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. |  [foreignkey]
**level** | level | long NOT NULL |  | [**MMMReportLevel**](MMMReportLevel.md) | Level of the report |  [foreignkey]
**reportName** | report_name | text NOT NULL |  | **kotlin.String** | Name of the Marketing Mix Modeling (MMM) report | 
**startDate** | start_date | text NOT NULL |  | **kotlin.String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**targetingTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MMMReportingTargetingType&gt;**](MMMReportingTargetingType.md) | List of targeting types | 
**advertiserIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Advertiser IDs for multi-advertiser report |  [optional]
**countries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingAdvertiserCountry&gt;**](TargetingAdvertiserCountry.md) | A List of countries for filtering |  [optional]
**customColumnIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of custom column IDs |  [optional]


# **Table `MMMReportCreateMMMReportingColumn`**
(mapped from: MMMReportCreateMMMReportingColumn)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
mMMReportCreate | mMMReportCreate | long | | kotlin.Long | Primary Key | *one*
mMMReportingColumn | mMMReportingColumn | long | | kotlin.Long | Foreign Key | *many*








# **Table `MMMReportCreateMMMReportingTargetingType`**
(mapped from: MMMReportCreateMMMReportingTargetingType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
mMMReportCreate | mMMReportCreate | long | | kotlin.Long | Primary Key | *one*
mMMReportingTargetingType | mMMReportingTargetingType | long | | kotlin.Long | Foreign Key | *many*



# **Table `MMMReportCreateAdvertiserIds`**
(mapped from: MMMReportCreateAdvertiserIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
mMMReportCreate | mMMReportCreate | long | | kotlin.Long | Primary Key | *one*
advertiserIds | advertiserIds | text | | kotlin.String | Foreign Key | *many*



# **Table `MMMReportCreateTargetingAdvertiserCountry`**
(mapped from: MMMReportCreateTargetingAdvertiserCountry)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
mMMReportCreate | mMMReportCreate | long | | kotlin.Long | Primary Key | *one*
targetingAdvertiserCountry | targetingAdvertiserCountry | long | | kotlin.Long | Foreign Key | *many*



# **Table `MMMReportCreateCustomColumnIds`**
(mapped from: MMMReportCreateCustomColumnIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
mMMReportCreate | mMMReportCreate | long | | kotlin.Long | Primary Key | *one*
customColumnIds | customColumnIds | text | | kotlin.String | Foreign Key | *many*



