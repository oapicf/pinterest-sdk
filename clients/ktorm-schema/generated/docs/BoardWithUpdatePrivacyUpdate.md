
# Table `BoardWithUpdatePrivacyUpdate`
(mapped from: BoardWithUpdatePrivacyUpdate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**description** | description | text |  | **kotlin.String** |  |  [optional]
**name** | name | text |  | **kotlin.String** |      Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. |  [optional]
**privacy** | privacy | long |  | [**BoardUpdatePrivacy**](BoardUpdatePrivacy.md) |  |  [optional] [foreignkey]





