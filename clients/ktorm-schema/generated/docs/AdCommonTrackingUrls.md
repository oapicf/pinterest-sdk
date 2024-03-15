
# Table `AdCommon_tracking_urls`
(mapped from: AdCommonTrackingUrls)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**impression** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**click** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**engagement** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**buyableButton** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**audienceVerification** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]


# **Table `AdCommonTrackingUrlsImpression`**
(mapped from: AdCommonTrackingUrlsImpression)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adCommonTrackingUrls | adCommonTrackingUrls | long | | kotlin.Long | Primary Key | *one*
impression | impression | text | | kotlin.String | Foreign Key | *many*



# **Table `AdCommonTrackingUrlsClick`**
(mapped from: AdCommonTrackingUrlsClick)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adCommonTrackingUrls | adCommonTrackingUrls | long | | kotlin.Long | Primary Key | *one*
click | click | text | | kotlin.String | Foreign Key | *many*



# **Table `AdCommonTrackingUrlsEngagement`**
(mapped from: AdCommonTrackingUrlsEngagement)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adCommonTrackingUrls | adCommonTrackingUrls | long | | kotlin.Long | Primary Key | *one*
engagement | engagement | text | | kotlin.String | Foreign Key | *many*



# **Table `AdCommonTrackingUrlsBuyableButton`**
(mapped from: AdCommonTrackingUrlsBuyableButton)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adCommonTrackingUrls | adCommonTrackingUrls | long | | kotlin.Long | Primary Key | *one*
buyableButton | buyableButton | text | | kotlin.String | Foreign Key | *many*



# **Table `AdCommonTrackingUrlsAudienceVerification`**
(mapped from: AdCommonTrackingUrlsAudienceVerification)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adCommonTrackingUrls | adCommonTrackingUrls | long | | kotlin.Long | Primary Key | *one*
audienceVerification | audienceVerification | text | | kotlin.String | Foreign Key | *many*



