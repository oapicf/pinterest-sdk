# UserBusinessRoleBinding

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetsSummary** | [**OpenAPI\Server\Model\BusinessMemberAssetsSummary**](BusinessMemberAssetsSummary.md) |  | [optional] 
**businessRoles** | **string** | The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] 
**createdByBusiness** | [**OpenAPI\Server\Model\BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the business relationship. | [optional] 
**createdByUser** | [**OpenAPI\Server\Model\BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the business relationship. | [optional] 
**createdTime** | **int** | The time the business relationship was created. Returned in milliseconds. | [optional] 
**id** | **string** | Unique identifier of the business member/business partner/employer. | [optional] 
**isSharedPartner** | **bool** | This field is only relevant when business_role&#x3D;\&quot;PARTNER\&quot;. &lt;br&gt;If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. &lt;br&gt;If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to. | [optional] 
**user** | [**OpenAPI\Server\Model\BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business member/business partner/employer. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


