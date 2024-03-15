
# Table `CatalogsHotelAttributes_allOf_main_image`
(mapped from: CatalogsHotelAttributesAllOfMainImage)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**link** | link | text |  | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.&lt;/p&gt; |  [optional]
**tag** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image |  [optional]



# **Table `CatalogsHotelAttributesAllOfMainImageTag`**
(mapped from: CatalogsHotelAttributesAllOfMainImageTag)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsHotelAttributesAllOfMainImage | catalogsHotelAttributesAllOfMainImage | long | | kotlin.Long | Primary Key | *one*
tag | tag | text | | kotlin.String | Foreign Key | *many*



