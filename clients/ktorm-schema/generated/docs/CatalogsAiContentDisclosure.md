
# Table `CatalogsAiContentDisclosure`
(mapped from: CatalogsAiContentDisclosure)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**disclosure** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsAiContentDisclosureLabel&gt;**](CatalogsAiContentDisclosureLabel.md) | Disclosure labels that apply to this asset. | 
**url** | url | text NOT NULL |  | **kotlin.String** | URL of the asset. Must match one of image_link, additional_image_link, or video_link. | 


# **Table `CatalogsAiContentDisclosureCatalogsAiContentDisclosureLabel`**
(mapped from: CatalogsAiContentDisclosureCatalogsAiContentDisclosureLabel)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsAiContentDisclosure | catalogsAiContentDisclosure | long | | kotlin.Long | Primary Key | *one*
catalogsAiContentDisclosureLabel | catalogsAiContentDisclosureLabel | long | | kotlin.Long | Foreign Key | *many*




