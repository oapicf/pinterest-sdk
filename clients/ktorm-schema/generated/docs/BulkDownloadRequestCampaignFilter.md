
# Table `BulkDownloadRequest_campaign_filter`
(mapped from: BulkDownloadRequestCampaignFilter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**campaignStatus** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignSummaryStatus&gt;**](CampaignSummaryStatus.md) |  |  [optional]
**endTime** | end_time | text |  | **kotlin.String** | Unix UTC timestamp. |  [optional]
**name** | name | text |  | **kotlin.String** | Campaign name |  [optional]
**objectiveType** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ObjectiveType&gt;**](ObjectiveType.md) |  |  [optional]
**startTime** | start_time | text |  | **kotlin.String** | Unix UTC timestamp. |  [optional]


# **Table `BulkDownloadRequestCampaignFilterCampaignSummaryStatus`**
(mapped from: BulkDownloadRequestCampaignFilterCampaignSummaryStatus)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkDownloadRequestCampaignFilter | bulkDownloadRequestCampaignFilter | long | | kotlin.Long | Primary Key | *one*
campaignSummaryStatus | campaignSummaryStatus | long | | kotlin.Long | Foreign Key | *many*





# **Table `BulkDownloadRequestCampaignFilterObjectiveType`**
(mapped from: BulkDownloadRequestCampaignFilterObjectiveType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkDownloadRequestCampaignFilter | bulkDownloadRequestCampaignFilter | long | | kotlin.Long | Primary Key | *one*
objectiveType | objectiveType | long | | kotlin.Long | Foreign Key | *many*




