
# Table `UpdatePartnerAssetsResultsResponseArray`
(mapped from: UpdatePartnerAssetsResultsResponseArray)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdatePartnerAssetsResult&gt;**](UpdatePartnerAssetsResult.md) | List of assigned/updated partner asset access. |  [optional]


# **Table `UpdatePartnerAssetsResultsResponseArrayUpdatePartnerAssetsResult`**
(mapped from: UpdatePartnerAssetsResultsResponseArrayUpdatePartnerAssetsResult)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updatePartnerAssetsResultsResponseArray | updatePartnerAssetsResultsResponseArray | long | | kotlin.Long | Primary Key | *one*
updatePartnerAssetsResult | updatePartnerAssetsResult | long | | kotlin.Long | Foreign Key | *many*



