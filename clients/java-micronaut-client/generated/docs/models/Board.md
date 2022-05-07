

# Board

Board

The class is defined in **[Board.java](../../src/main/java/org/openapitools/model/Board.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` |  |  [optional property] [readonly property]
**name** | `String` |  | 
**description** | `String` |  |  [optional property]
**owner** | [`BoardOwner`](BoardOwner.md) |  |  [optional property] [readonly property]
**privacy** | [**PrivacyEnum**](#PrivacyEnum) | Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt; |  [optional property]





## PrivacyEnum

Name | Value
---- | -----
PUBLIC | `"PUBLIC"`
PROTECTED | `"PROTECTED"`
SECRET | `"SECRET"`


