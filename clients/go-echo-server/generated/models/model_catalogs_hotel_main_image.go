package models

// CatalogsHotelMainImage - The main hotel image
type CatalogsHotelMainImage struct {

	// <= 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
	Link string `json:"link,omitempty"`

	// Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
	Tag *[]string `json:"tag,omitempty"`
}
