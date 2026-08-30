
# Table `AdGroupTrackingURLs`
(mapped from: AdGroupTrackingURLs)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**audienceVerification** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**buyableButton** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**click** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**engagement** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**impression** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]


# **Table `AdGroupTrackingURLsAudienceVerification`**
(mapped from: AdGroupTrackingURLsAudienceVerification)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupTrackingURLs | adGroupTrackingURLs | long | | kotlin.Long | Primary Key | *one*
audienceVerification | audienceVerification | text | | kotlin.String | Foreign Key | *many*



# **Table `AdGroupTrackingURLsBuyableButton`**
(mapped from: AdGroupTrackingURLsBuyableButton)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupTrackingURLs | adGroupTrackingURLs | long | | kotlin.Long | Primary Key | *one*
buyableButton | buyableButton | text | | kotlin.String | Foreign Key | *many*



# **Table `AdGroupTrackingURLsClick`**
(mapped from: AdGroupTrackingURLsClick)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupTrackingURLs | adGroupTrackingURLs | long | | kotlin.Long | Primary Key | *one*
click | click | text | | kotlin.String | Foreign Key | *many*



# **Table `AdGroupTrackingURLsEngagement`**
(mapped from: AdGroupTrackingURLsEngagement)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupTrackingURLs | adGroupTrackingURLs | long | | kotlin.Long | Primary Key | *one*
engagement | engagement | text | | kotlin.String | Foreign Key | *many*



# **Table `AdGroupTrackingURLsImpression`**
(mapped from: AdGroupTrackingURLsImpression)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupTrackingURLs | adGroupTrackingURLs | long | | kotlin.Long | Primary Key | *one*
impression | impression | text | | kotlin.String | Foreign Key | *many*



