package models

type AdPreviewShopping struct {

	// Catalog Product Group Id.
	CatalogProductGroupId string `json:"catalog_product_group_id" validate:"regexp=^\\\\d+$"`

	// Ad format of the shopping ad preview.
	CreativeType string `json:"creative_type"`

	// Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
	CustomizableCtaType *CustomizableCtaType `json:"customizable_cta_type,omitempty"`

	// Title displayed below ad.
	HeroImageTitle string `json:"hero_image_title,omitempty"`

	// Hero image URL.
	HeroImageUrl string `json:"hero_image_url,omitempty"`

	// Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
	HeroPinId string `json:"hero_pin_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Multi image template tag.
	ImageTag string `json:"image_tag,omitempty"`

	// Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
	ItemId string `json:"item_id,omitempty"`

	// Preferred media type.
	PreferredMediaType string `json:"preferred_media_type,omitempty"`

	// Multi video template tag, image_tag and video_tag are mutual exclusive.
	VideoTag string `json:"video_tag,omitempty"`
}
