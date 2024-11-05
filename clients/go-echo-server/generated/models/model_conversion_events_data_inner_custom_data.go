package models

// ConversionEventsDataInnerCustomData - Object containing other custom data.
type ConversionEventsDataInnerCustomData struct {

	// The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
	Currency *string `json:"currency,omitempty"`

	// Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
	Value *string `json:"value,omitempty"`

	// List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	ContentIds []string `json:"content_ids,omitempty"`

	// The name of the page or product associated with the event.
	ContentName *string `json:"content_name,omitempty"`

	// The category of the content associated with the event.
	ContentCategory *string `json:"content_category,omitempty"`

	// The brand of the content associated with the event.
	ContentBrand *string `json:"content_brand,omitempty"`

	// A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	Contents []ConversionEventsDataInnerCustomDataContentsInner `json:"contents,omitempty"`

	// Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	NumItems int64 `json:"num_items,omitempty"`

	// The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
	OrderId *string `json:"order_id,omitempty"`

	// The search string related to the user conversion event.
	SearchString *string `json:"search_string,omitempty"`

	// Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">Help Center</a> and <a href=\"/docs/api-features/conversion-overview/\" target=\"_blank\">dev site</a> for specific opt_out_type set up.
	OptOutType *string `json:"opt_out_type,omitempty"`

	// Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
	Np *string `json:"np,omitempty"`
}
