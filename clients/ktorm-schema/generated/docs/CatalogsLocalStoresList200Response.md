
# Table `catalogs_local_stores_list_200_response`
(mapped from: CatalogsLocalStoresList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocalStore&gt;**](LocalStore.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `CatalogsLocalStoresList200ResponseLocalStore`**
(mapped from: CatalogsLocalStoresList200ResponseLocalStore)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsLocalStoresList200Response | catalogsLocalStoresList200Response | long | | kotlin.Long | Primary Key | *one*
localStore | localStore | long | | kotlin.Long | Foreign Key | *many*




