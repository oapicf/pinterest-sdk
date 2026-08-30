
# Table `DeleteBusinessMembershipBody`
(mapped from: DeleteBusinessMembershipBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**members** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;DeleteBusinessMembershipMember&gt;**](DeleteBusinessMembershipMember.md) |  | 


# **Table `DeleteBusinessMembershipBodyDeleteBusinessMembershipMember`**
(mapped from: DeleteBusinessMembershipBodyDeleteBusinessMembershipMember)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deleteBusinessMembershipBody | deleteBusinessMembershipBody | long | | kotlin.Long | Primary Key | *one*
deleteBusinessMembershipMember | deleteBusinessMembershipMember | long | | kotlin.Long | Foreign Key | *many*



