
# Table `CatalogsHotelMainImage`
(mapped from: CatalogsHotelMainImage)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**link** | link | text |  | **kotlin.String** | &lt;&#x3D; 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://. |  [optional]
**tag** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image |  [optional]



# **Table `CatalogsHotelMainImageTag`**
(mapped from: CatalogsHotelMainImageTag)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsHotelMainImage | catalogsHotelMainImage | long | | kotlin.Long | Primary Key | *one*
tag | tag | text | | kotlin.String | Foreign Key | *many*



