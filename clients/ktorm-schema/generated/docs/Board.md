
# Table `Board`
(mapped from: Board)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**id** | id | text PRIMARY KEY |  | **kotlin.String** |  |  [optional] [readonly]
**description** | description | text |  | **kotlin.String** |  |  [optional]
**owner** | owner | long |  | [**BoardOwner**](BoardOwner.md) |  |  [optional] [readonly] [foreignkey]
**privacy** | privacy | text |  | [**privacy**](#Privacy) | Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt; |  [optional]







