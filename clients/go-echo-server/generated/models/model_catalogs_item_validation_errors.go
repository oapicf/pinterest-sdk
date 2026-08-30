package models

type CatalogsItemValidationErrors struct {

	// Item has an invalid adult value.
	ADULT_INVALID CatalogsItemValidationDetails `json:"ADULT_INVALID,omitempty"`

	// Adword link contains too many characters.
	ADWORDS_FORMAT_INVALID CatalogsItemValidationDetails `json:"ADWORDS_FORMAT_INVALID,omitempty"`

	// Item is missing availability value in its product metadata, this item will not be published.
	AVAILABILITY_INVALID CatalogsItemValidationDetails `json:"AVAILABILITY_INVALID,omitempty"`

	// Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.
	BLOCKLISTED_IMAGE_SIGNATURE CatalogsItemValidationDetails `json:"BLOCKLISTED_IMAGE_SIGNATURE,omitempty"`

	// Item is missing description in its product metadata, this item will not be published.
	DESCRIPTION_MISSING CatalogsItemValidationDetails `json:"DESCRIPTION_MISSING,omitempty"`

	// This product is duplicated. The duplicate entry will not be published.
	DUPLICATE_PRODUCTS CatalogsItemValidationDetails `json:"DUPLICATE_PRODUCTS,omitempty"`

	// Image link is invalid.
	IMAGE_LINK_INVALID CatalogsItemValidationDetails `json:"IMAGE_LINK_INVALID,omitempty"`

	// Item has image_link URL that contains too many characters, so the item will not be published.
	IMAGE_LINK_LENGTH_TOO_LONG CatalogsItemValidationDetails `json:"IMAGE_LINK_LENGTH_TOO_LONG,omitempty"`

	// Item is missing an image link URL in its product metadata, this item will not be published.
	IMAGE_LINK_MISSING CatalogsItemValidationDetails `json:"IMAGE_LINK_MISSING,omitempty"`

	// Product link value doesn't match the verified domain associated with this account.
	INVALID_DOMAIN CatalogsItemValidationDetails `json:"INVALID_DOMAIN,omitempty"`

	// Main image can't be found.
	ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE CatalogsItemValidationDetails `json:"ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE,omitempty"`

	// Item is missing item id in its product metadata, this item will not be published.
	ITEMID_MISSING CatalogsItemValidationDetails `json:"ITEMID_MISSING,omitempty"`

	// Link is invalid.
	LINK_FORMAT_INVALID CatalogsItemValidationDetails `json:"LINK_FORMAT_INVALID,omitempty"`

	// Product link contains too many characters, this item will not be published.
	LINK_LENGTH_TOO_LONG CatalogsItemValidationDetails `json:"LINK_LENGTH_TOO_LONG,omitempty"`

	// Item has a list price formatting error, this item will not be published.
	LIST_PRICE_INVALID CatalogsItemValidationDetails `json:"LIST_PRICE_INVALID,omitempty"`

	// Item exceed the maximum number of items per item group, this item will not be published.
	MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED CatalogsItemValidationDetails `json:"MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED,omitempty"`

	// Item contains formating errors.
	PARSE_LINE_ERROR CatalogsItemValidationDetails `json:"PARSE_LINE_ERROR,omitempty"`

	// Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.
	PINJOIN_CONTENT_UNSAFE CatalogsItemValidationDetails `json:"PINJOIN_CONTENT_UNSAFE,omitempty"`

	// Item price cannot be determined because the price, list price, and sale price are all different.
	PRICE_CANNOT_BE_DETERMINED CatalogsItemValidationDetails `json:"PRICE_CANNOT_BE_DETERMINED,omitempty"`

	// Product is missing a price, this item will not be published.
	PRICE_MISSING CatalogsItemValidationDetails `json:"PRICE_MISSING,omitempty"`

	// Item is missing a link URL in its product metadata, this item will not be published.
	PRODUCT_LINK_MISSING CatalogsItemValidationDetails `json:"PRODUCT_LINK_MISSING,omitempty"`

	// Item has a price formatting error in its product metadata, this item will not be published.
	PRODUCT_PRICE_INVALID CatalogsItemValidationDetails `json:"PRODUCT_PRICE_INVALID,omitempty"`

	// Item is missing title in its product metadata, this item will not be published.
	TITLE_MISSING CatalogsItemValidationDetails `json:"TITLE_MISSING,omitempty"`
}
