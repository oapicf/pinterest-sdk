
# Table `AdResponse_allOf_1`
(mapped from: AdResponseAllOf1)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccountId** | ad_account_id | text |  | **kotlin.String** | The ID of the advertiser that this ad belongs to. |  [optional]
**campaignId** | campaign_id | text |  | **kotlin.String** | ID of the ad campaign that contains this ad. |  [optional]
**collectionItemsDestinationUrlTemplate** | collection_items_destination_url_template | text |  | **kotlin.String** | Destination URL template for all items within a collections drawer. |  [optional]
**createdTime** | created_time | int |  | **kotlin.Int** | Pin creation time. Unix timestamp in seconds. |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | The ID of this ad. |  [optional]
**rejectedReasons** | `One-To-Many` | `----` | `----`  | [**rejected_reasons**](#kotlin.Array&lt;RejectedReasons&gt;) | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. |  [optional]
**rejectionLabels** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. |  [optional]
**reviewStatus** | review_status | text |  | [**review_status**](#ReviewStatus) | Ad review status |  [optional]
**type** | type | text |  | **kotlin.String** | Always \&quot;ad\&quot;. |  [optional]
**updatedTime** | updated_time | int |  | **kotlin.Int** | Last update time. Unix timestamp in seconds. |  [optional]
**summaryStatus** | summary_status | long |  | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status |  [optional] [foreignkey]







# **Table `AdResponseAllOf1RejectedReasons`**
(mapped from: AdResponseAllOf1RejectedReasons)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adResponseAllOf1 | adResponseAllOf1 | long | | kotlin.Long | Primary Key | *one*
rejectedReasons | rejectedReasons | text | | kotlin.String | Foreign Key | *many*



# **Table `AdResponseAllOf1RejectionLabels`**
(mapped from: AdResponseAllOf1RejectionLabels)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adResponseAllOf1 | adResponseAllOf1 | long | | kotlin.Long | Primary Key | *one*
rejectionLabels | rejectionLabels | text | | kotlin.String | Foreign Key | *many*







