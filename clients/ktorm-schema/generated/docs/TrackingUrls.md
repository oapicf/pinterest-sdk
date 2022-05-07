
# Table `TrackingUrls`
(mapped from: TrackingUrls)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**impression** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**click** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**engagement** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**buyableButton** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**audienceVerification** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]


# **Table `TrackingUrlsImpression`**
(mapped from: TrackingUrlsImpression)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
trackingUrls | trackingUrls | long | | kotlin.Long | Primary Key | *one*
impression | impression | text | | kotlin.String | Foreign Key | *many*



# **Table `TrackingUrlsClick`**
(mapped from: TrackingUrlsClick)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
trackingUrls | trackingUrls | long | | kotlin.Long | Primary Key | *one*
click | click | text | | kotlin.String | Foreign Key | *many*



# **Table `TrackingUrlsEngagement`**
(mapped from: TrackingUrlsEngagement)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
trackingUrls | trackingUrls | long | | kotlin.Long | Primary Key | *one*
engagement | engagement | text | | kotlin.String | Foreign Key | *many*



# **Table `TrackingUrlsBuyableButton`**
(mapped from: TrackingUrlsBuyableButton)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
trackingUrls | trackingUrls | long | | kotlin.Long | Primary Key | *one*
buyableButton | buyableButton | text | | kotlin.String | Foreign Key | *many*



# **Table `TrackingUrlsAudienceVerification`**
(mapped from: TrackingUrlsAudienceVerification)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
trackingUrls | trackingUrls | long | | kotlin.Long | Primary Key | *one*
audienceVerification | audienceVerification | text | | kotlin.String | Foreign Key | *many*



