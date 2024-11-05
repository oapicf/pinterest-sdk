
# Table `MembersToDeleteBody`
(mapped from: MembersToDeleteBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**members** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MembersToDeleteBodyMembersInner&gt;**](MembersToDeleteBodyMembersInner.md) |  | 


# **Table `MembersToDeleteBodyMembersToDeleteBodyMembersInner`**
(mapped from: MembersToDeleteBodyMembersToDeleteBodyMembersInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
membersToDeleteBody | membersToDeleteBody | long | | kotlin.Long | Primary Key | *one*
membersToDeleteBodyMembersInner | membersToDeleteBodyMembersInner | long | | kotlin.Long | Foreign Key | *many*



