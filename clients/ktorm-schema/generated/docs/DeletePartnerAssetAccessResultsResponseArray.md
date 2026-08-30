
# Table `DeletePartnerAssetAccessResultsResponseArray`
(mapped from: DeletePartnerAssetAccessResultsResponseArray)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;DeletePartnerAssetAccessResult&gt;**](DeletePartnerAssetAccessResult.md) | List of terminated partner asset accesses. |  [optional]


# **Table `DeletePartnerAssetAccessResultsResponseArrayDeletePartnerAssetAccessResult`**
(mapped from: DeletePartnerAssetAccessResultsResponseArrayDeletePartnerAssetAccessResult)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deletePartnerAssetAccessResultsResponseArray | deletePartnerAssetAccessResultsResponseArray | long | | kotlin.Long | Primary Key | *one*
deletePartnerAssetAccessResult | deletePartnerAssetAccessResult | long | | kotlin.Long | Foreign Key | *many*



