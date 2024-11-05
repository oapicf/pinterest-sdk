
# Table `DeletePartnerAssetsResultsResponseArray`
(mapped from: DeletePartnerAssetsResultsResponseArray)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;DeletePartnerAssetsResult&gt;**](DeletePartnerAssetsResult.md) | List of terminated asset access. |  [optional]


# **Table `DeletePartnerAssetsResultsResponseArrayDeletePartnerAssetsResult`**
(mapped from: DeletePartnerAssetsResultsResponseArrayDeletePartnerAssetsResult)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deletePartnerAssetsResultsResponseArray | deletePartnerAssetsResultsResponseArray | long | | kotlin.Long | Primary Key | *one*
deletePartnerAssetsResult | deletePartnerAssetsResult | long | | kotlin.Long | Foreign Key | *many*



