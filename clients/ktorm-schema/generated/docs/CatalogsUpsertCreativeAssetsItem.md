
# Table `CatalogsUpsertCreativeAssetsItem`
(mapped from: CatalogsUpsertCreativeAssetsItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**attributes** | attributes | long NOT NULL |  | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  |  [foreignkey]
**creativeAssetsId** | creative_assets_id | text NOT NULL |  | **kotlin.String** | The catalog creative assets id in the merchant namespace | 
**operation** | operation | text NOT NULL |  | [**operation**](#Operation) |  | 





