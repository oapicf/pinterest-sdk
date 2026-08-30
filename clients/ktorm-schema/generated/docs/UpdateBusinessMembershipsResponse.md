
# Table `UpdateBusinessMembershipsResponse`
(mapped from: UpdateBusinessMembershipsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BusinessMembershipMember&gt;**](BusinessMembershipMember.md) | List of members with updated business access role. |  [optional]


# **Table `UpdateBusinessMembershipsResponseBusinessMembershipMember`**
(mapped from: UpdateBusinessMembershipsResponseBusinessMembershipMember)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateBusinessMembershipsResponse | updateBusinessMembershipsResponse | long | | kotlin.Long | Primary Key | *one*
businessMembershipMember | businessMembershipMember | long | | kotlin.Long | Foreign Key | *many*



