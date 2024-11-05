# PinterestSdk.UserBusinessRoleBinding

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetsSummary** | [**BusinessMemberAssetsSummary**](BusinessMemberAssetsSummary.md) |  | [optional] 
**businessRoles** | **[String]** | The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] 
**createdByBusiness** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the business relationship. | [optional] 
**createdByUser** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the business relationship. | [optional] 
**createdTime** | **Number** | The time the business relationship was created. Returned in milliseconds. | [optional] 
**id** | **String** | Unique identifier of the business member/business partner/employer. | [optional] 
**isSharedPartner** | **Boolean** | This field is only relevant when business_role&#x3D;\&quot;PARTNER\&quot;. &lt;br&gt;If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. &lt;br&gt;If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to. | [optional] 
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business member/business partner/employer. | [optional] 


