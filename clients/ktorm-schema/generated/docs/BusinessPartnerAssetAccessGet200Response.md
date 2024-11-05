
# Table `business_partner_asset_access_get_200_response`
(mapped from: BusinessPartnerAssetAccessGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;GetPartnerAssetsResponse&gt;**](GetPartnerAssetsResponse.md) | List assets on which you granted access to your partner or assets on which your partner has granted you access. | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `BusinessPartnerAssetAccessGet200ResponseGetPartnerAssetsResponse`**
(mapped from: BusinessPartnerAssetAccessGet200ResponseGetPartnerAssetsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessPartnerAssetAccessGet200Response | businessPartnerAssetAccessGet200Response | long | | kotlin.Long | Primary Key | *one*
getPartnerAssetsResponse | getPartnerAssetsResponse | long | | kotlin.Long | Foreign Key | *many*




