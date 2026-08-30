package models

// CatalogsAiContentDisclosure - AI content disclosure for a single asset of a catalog item.
type CatalogsAiContentDisclosure struct {

	// Disclosure labels that apply to this asset.
	Disclosure []CatalogsAiContentDisclosureLabel `json:"disclosure"`

	// URL of the asset. Must match one of image_link, additional_image_link, or video_link.
	Url string `json:"url"`
}
