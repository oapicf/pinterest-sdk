
# Table `CatalogsCreativeAssetsAttributes`
(mapped from: CatalogsCreativeAssetsAttributes)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**androidDeepLink** | android_deep_link | text |  | **kotlin.String** | Link to the creative assets page. |  [optional]
**customLabel0** | custom_label_0 | text |  | **kotlin.String** | Custom grouping of creative assets. |  [optional]
**customLabel1** | custom_label_1 | text |  | **kotlin.String** | Custom grouping of creative assets. |  [optional]
**customLabel2** | custom_label_2 | text |  | **kotlin.String** | Custom grouping of creative assets. |  [optional]
**customLabel3** | custom_label_3 | text |  | **kotlin.String** | Custom grouping of creative assets. |  [optional]
**customLabel4** | custom_label_4 | text |  | **kotlin.String** | Custom grouping of creative assets. |  [optional]
**description** | description | text |  | **kotlin.String** | Brief description of the creative assets. |  [optional]
**googleProductCategory** | google_product_category | text |  | **kotlin.String** | The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. |  [optional]
**iosDeepLink** | ios_deep_link | text |  | **kotlin.String** | IOS deep link to the creative assets page. |  [optional]
**link** | link | text |  | **kotlin.String** | Link to the creative assets page. |  [optional]
**title** | title | text |  | **kotlin.String** | The name of the creative assets. |  [optional]
**visibility** | visibility | text |  | **kotlin.String** | Visibility of the creative assets. Must be one of the following values (upper or lowercase): &#39;visible&#39;, &#39;hidden&#39;. |  [optional]
**aiDisclosures** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsAiContentDisclosure&gt;**](CatalogsAiContentDisclosure.md) | AI content disclosures for individual assets (image_link or video_link) on this creative assets item. Each entry declares which disclosure types apply to a single asset URL. |  [optional]
**imageLink** | image_link | text |  | **kotlin.String** | The creative assets image. |  [optional]
**videoLink** | video_link | text |  | **kotlin.String** | The creative assets video. |  [optional]














# **Table `CatalogsCreativeAssetsAttributesCatalogsAiContentDisclosure`**
(mapped from: CatalogsCreativeAssetsAttributesCatalogsAiContentDisclosure)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsCreativeAssetsAttributes | catalogsCreativeAssetsAttributes | long | | kotlin.Long | Primary Key | *one*
catalogsAiContentDisclosure | catalogsAiContentDisclosure | long | | kotlin.Long | Foreign Key | *many*





