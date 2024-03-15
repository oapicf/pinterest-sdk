# PinterestSdk.Board

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | [optional] [readonly] 
**createdAt** | **Date** | Date and time of board creation. | [optional] [readonly] 
**boardPinsModifiedAt** | **Date** | Date and time of last board pins modified. | [optional] [readonly] 
**name** | **String** |  | 
**description** | **String** |  | [optional] 
**collaboratorCount** | **Number** | Count of collaborators on the board. | [optional] [readonly] 
**pinCount** | **Number** | Count of pins on the board. | [optional] [readonly] 
**followerCount** | **Number** | Board follower count. | [optional] [readonly] 
**media** | [**BoardMedia**](BoardMedia.md) |  | [optional] 
**owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] 
**privacy** | **String** | Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt; | [optional] [default to &#39;PUBLIC&#39;]



## Enum: PrivacyEnum


* `PUBLIC` (value: `"PUBLIC"`)

* `PROTECTED` (value: `"PROTECTED"`)

* `SECRET` (value: `"SECRET"`)




