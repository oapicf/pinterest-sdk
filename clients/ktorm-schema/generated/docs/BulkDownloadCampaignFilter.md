
# Table `BulkDownloadCampaignFilter`
(mapped from: BulkDownloadCampaignFilter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**campaignStatus** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SummaryStatus&gt;**](SummaryStatus.md) |  |  [optional]
**endTime** | end_time | text |  | **kotlin.String** | Unix UTC timestamp. |  [optional]
**name** | name | text |  | **kotlin.String** | Campaign name |  [optional]
**objectiveType** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ConversionObjectiveType&gt;**](ConversionObjectiveType.md) |  |  [optional]
**startTime** | start_time | text |  | **kotlin.String** | Unix UTC timestamp. |  [optional]


# **Table `BulkDownloadCampaignFilterSummaryStatus`**
(mapped from: BulkDownloadCampaignFilterSummaryStatus)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkDownloadCampaignFilter | bulkDownloadCampaignFilter | long | | kotlin.Long | Primary Key | *one*
summaryStatus | summaryStatus | long | | kotlin.Long | Foreign Key | *many*





# **Table `BulkDownloadCampaignFilterConversionObjectiveType`**
(mapped from: BulkDownloadCampaignFilterConversionObjectiveType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkDownloadCampaignFilter | bulkDownloadCampaignFilter | long | | kotlin.Long | Primary Key | *one*
conversionObjectiveType | conversionObjectiveType | long | | kotlin.Long | Foreign Key | *many*




