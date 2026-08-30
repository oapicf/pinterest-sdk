
# Table `CatalogsRetailFilterValuesMap`
(mapped from: CatalogsRetailFilterValuesMap)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adImageTags** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**adVideoTags** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**availability** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ProductAvailability&gt;**](ProductAvailability.md) |  |  [optional]
**brand** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**condition** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ProductCondition&gt;**](ProductCondition.md) |  |  [optional]
**customLabel0** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**customLabel1** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**customLabel2** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**customLabel3** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**customLabel4** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**gender** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Gender&gt;**](Gender.md) |  |  [optional]
**googleProductCategory0** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**googleProductCategory1** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**googleProductCategory2** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**googleProductCategory3** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**googleProductCategory4** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**googleProductCategory5** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**googleProductCategory6** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**mediaType** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MediaType&gt;**](MediaType.md) |  |  [optional]
**productType0** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**productType1** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**productType2** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**productType3** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**productType4** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]


# **Table `CatalogsRetailFilterValuesMapAdImageTags`**
(mapped from: CatalogsRetailFilterValuesMapAdImageTags)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
adImageTags | adImageTags | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapAdVideoTags`**
(mapped from: CatalogsRetailFilterValuesMapAdVideoTags)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
adVideoTags | adVideoTags | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapProductAvailability`**
(mapped from: CatalogsRetailFilterValuesMapProductAvailability)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
productAvailability | productAvailability | long | | kotlin.Long | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapBrand`**
(mapped from: CatalogsRetailFilterValuesMapBrand)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
brand | brand | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapProductCondition`**
(mapped from: CatalogsRetailFilterValuesMapProductCondition)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
productCondition | productCondition | long | | kotlin.Long | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapCustomLabel0`**
(mapped from: CatalogsRetailFilterValuesMapCustomLabel0)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
customLabel0 | customLabel0 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapCustomLabel1`**
(mapped from: CatalogsRetailFilterValuesMapCustomLabel1)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
customLabel1 | customLabel1 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapCustomLabel2`**
(mapped from: CatalogsRetailFilterValuesMapCustomLabel2)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
customLabel2 | customLabel2 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapCustomLabel3`**
(mapped from: CatalogsRetailFilterValuesMapCustomLabel3)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
customLabel3 | customLabel3 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapCustomLabel4`**
(mapped from: CatalogsRetailFilterValuesMapCustomLabel4)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
customLabel4 | customLabel4 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapGender`**
(mapped from: CatalogsRetailFilterValuesMapGender)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
gender | gender | long | | kotlin.Long | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapGoogleProductCategory0`**
(mapped from: CatalogsRetailFilterValuesMapGoogleProductCategory0)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
googleProductCategory0 | googleProductCategory0 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapGoogleProductCategory1`**
(mapped from: CatalogsRetailFilterValuesMapGoogleProductCategory1)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
googleProductCategory1 | googleProductCategory1 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapGoogleProductCategory2`**
(mapped from: CatalogsRetailFilterValuesMapGoogleProductCategory2)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
googleProductCategory2 | googleProductCategory2 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapGoogleProductCategory3`**
(mapped from: CatalogsRetailFilterValuesMapGoogleProductCategory3)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
googleProductCategory3 | googleProductCategory3 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapGoogleProductCategory4`**
(mapped from: CatalogsRetailFilterValuesMapGoogleProductCategory4)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
googleProductCategory4 | googleProductCategory4 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapGoogleProductCategory5`**
(mapped from: CatalogsRetailFilterValuesMapGoogleProductCategory5)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
googleProductCategory5 | googleProductCategory5 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapGoogleProductCategory6`**
(mapped from: CatalogsRetailFilterValuesMapGoogleProductCategory6)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
googleProductCategory6 | googleProductCategory6 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapMediaType`**
(mapped from: CatalogsRetailFilterValuesMapMediaType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
mediaType | mediaType | long | | kotlin.Long | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapProductType0`**
(mapped from: CatalogsRetailFilterValuesMapProductType0)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
productType0 | productType0 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapProductType1`**
(mapped from: CatalogsRetailFilterValuesMapProductType1)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
productType1 | productType1 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapProductType2`**
(mapped from: CatalogsRetailFilterValuesMapProductType2)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
productType2 | productType2 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapProductType3`**
(mapped from: CatalogsRetailFilterValuesMapProductType3)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
productType3 | productType3 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsRetailFilterValuesMapProductType4`**
(mapped from: CatalogsRetailFilterValuesMapProductType4)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailFilterValuesMap | catalogsRetailFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
productType4 | productType4 | text | | kotlin.String | Foreign Key | *many*



