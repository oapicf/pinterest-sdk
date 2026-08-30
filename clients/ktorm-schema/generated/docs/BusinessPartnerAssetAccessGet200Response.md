
# Table `business_partner_asset_access_get_200_response`
(mapped from: BusinessPartnerAssetAccessGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BaseBusinessAssets&gt;**](BaseBusinessAssets.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `BusinessPartnerAssetAccessGet200ResponseBaseBusinessAssets`**
(mapped from: BusinessPartnerAssetAccessGet200ResponseBaseBusinessAssets)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessPartnerAssetAccessGet200Response | businessPartnerAssetAccessGet200Response | long | | kotlin.Long | Primary Key | *one*
baseBusinessAssets | baseBusinessAssets | long | | kotlin.Long | Foreign Key | *many*




