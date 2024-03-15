
# Table `AdGroupCommon_tracking_urls`
(mapped from: AdGroupCommonTrackingUrls)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**impression** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**click** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**engagement** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**buyableButton** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**audienceVerification** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]


# **Table `AdGroupCommonTrackingUrlsImpression`**
(mapped from: AdGroupCommonTrackingUrlsImpression)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupCommonTrackingUrls | adGroupCommonTrackingUrls | long | | kotlin.Long | Primary Key | *one*
impression | impression | text | | kotlin.String | Foreign Key | *many*



# **Table `AdGroupCommonTrackingUrlsClick`**
(mapped from: AdGroupCommonTrackingUrlsClick)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupCommonTrackingUrls | adGroupCommonTrackingUrls | long | | kotlin.Long | Primary Key | *one*
click | click | text | | kotlin.String | Foreign Key | *many*



# **Table `AdGroupCommonTrackingUrlsEngagement`**
(mapped from: AdGroupCommonTrackingUrlsEngagement)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupCommonTrackingUrls | adGroupCommonTrackingUrls | long | | kotlin.Long | Primary Key | *one*
engagement | engagement | text | | kotlin.String | Foreign Key | *many*



# **Table `AdGroupCommonTrackingUrlsBuyableButton`**
(mapped from: AdGroupCommonTrackingUrlsBuyableButton)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupCommonTrackingUrls | adGroupCommonTrackingUrls | long | | kotlin.Long | Primary Key | *one*
buyableButton | buyableButton | text | | kotlin.String | Foreign Key | *many*



# **Table `AdGroupCommonTrackingUrlsAudienceVerification`**
(mapped from: AdGroupCommonTrackingUrlsAudienceVerification)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupCommonTrackingUrls | adGroupCommonTrackingUrls | long | | kotlin.Long | Primary Key | *one*
audienceVerification | audienceVerification | text | | kotlin.String | Foreign Key | *many*



