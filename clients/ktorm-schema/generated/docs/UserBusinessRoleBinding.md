
# Table `UserBusinessRoleBinding`
(mapped from: UserBusinessRoleBinding)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetsSummary** | assets_summary | long |  | [**BusinessMemberAssetsSummary**](BusinessMemberAssetsSummary.md) |  |  [optional] [foreignkey]
**businessRoles** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. |  [optional]
**createdByBusiness** | created_by_business | long |  | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the business relationship. |  [optional] [foreignkey]
**createdByUser** | created_by_user | long |  | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the business relationship. |  [optional] [foreignkey]
**createdTime** | created_time | int |  | **kotlin.Int** | The time the business relationship was created. Returned in milliseconds. |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Unique identifier of the business member/business partner/employer. |  [optional]
**isSharedPartner** | is_shared_partner | boolean |  | **kotlin.Boolean** | This field is only relevant when business_role&#x3D;\&quot;PARTNER\&quot;. &lt;br&gt;If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. &lt;br&gt;If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to. |  [optional]
**user** | user | long |  | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business member/business partner/employer. |  [optional] [foreignkey]



# **Table `UserBusinessRoleBindingBusinessRoles`**
(mapped from: UserBusinessRoleBindingBusinessRoles)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
userBusinessRoleBinding | userBusinessRoleBinding | long | | kotlin.Long | Primary Key | *one*
businessRoles | businessRoles | text | | kotlin.String | Foreign Key | *many*









