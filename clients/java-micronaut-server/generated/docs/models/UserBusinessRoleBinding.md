

# UserBusinessRoleBinding

The class is defined in **[UserBusinessRoleBinding.java](../../src/main/java/org/openapitools/model/UserBusinessRoleBinding.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetsSummary** | [`BusinessMemberAssetsSummary`](BusinessMemberAssetsSummary.md) |  |  [optional property]
**businessRoles** | `List&lt;String&gt;` | The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. |  [optional property]
**createdByBusiness** | [`BusinessAccessUserSummary`](BusinessAccessUserSummary.md) | Metadata for the business that created the business relationship. |  [optional property]
**createdByUser** | [`BusinessAccessUserSummary`](BusinessAccessUserSummary.md) | Metadata for the user that created the business relationship. |  [optional property]
**createdTime** | `Integer` | The time the business relationship was created. Returned in milliseconds. |  [optional property]
**id** | `String` | Unique identifier of the business member/business partner/employer. |  [optional property]
**isSharedPartner** | `Boolean` | This field is only relevant when business_role&#x3D;\&quot;PARTNER\&quot;. &lt;br&gt;If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. &lt;br&gt;If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to. |  [optional property]
**user** | [`BusinessAccessUserSummary`](BusinessAccessUserSummary.md) | Metadata for the business member/business partner/employer. |  [optional property]










