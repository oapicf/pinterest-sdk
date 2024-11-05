

# CreateAssetAccessRequestBodyAssetRequestsInner

The class is defined in **[CreateAssetAccessRequestBodyAssetRequestsInner.java](../../src/main/java/org/openapitools/model/CreateAssetAccessRequestBodyAssetRequestsInner.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**partnerId** | `String` | Unique identifier of a business partner to request asset access to. | 
**assetIdToPermissions** | `Map&lt;String, List&lt;Permissions&gt;&gt;` | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  | 




