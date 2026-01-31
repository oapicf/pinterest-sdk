
# Table `ConversionEventResponse`
(mapped from: ConversionEventResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccountId** | ad_account_id | text |  | **kotlin.String** | Id of the ad account. |  [optional]
**conversionEvent** | conversion_event | long |  | [**ConversionTagType**](ConversionTagType.md) |  |  [optional] [foreignkey]
**conversionTagId** | conversion_tag_id | text |  | **kotlin.String** | Id of the tag. |  [optional]
**createdTime** | created_time | int |  | **kotlin.Int** | Creation date in epoch format. |  [optional]






