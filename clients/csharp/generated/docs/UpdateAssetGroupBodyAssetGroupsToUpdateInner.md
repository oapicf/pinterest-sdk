# Org.OpenAPITools.Model.UpdateAssetGroupBodyAssetGroupsToUpdateInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupId** | **string** | Unique identifier of the asset group to update. | 
**Name** | **string** | Asset Group name | [optional] 
**Description** | **string** | Asset group description | [optional] 
**AssetGroupTypes** | [**List&lt;AssetGroupType&gt;**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | [optional] 
**AssetsToAdd** | **List&lt;string&gt;** | A list of asset ids to add to the asset group. | [optional] 
**AssetsToRemove** | **List&lt;string&gt;** | A list of asset ids to remove from the asset group. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

