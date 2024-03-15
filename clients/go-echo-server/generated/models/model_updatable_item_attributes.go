package models

type UpdatableItemAttributes struct {

	// Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
	AdLink *string `json:"ad_link,omitempty"`

	// Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
	Adult *bool `json:"adult,omitempty"`

	// The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
	AgeGroup *string `json:"age_group,omitempty"`

	// The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.
	Availability string `json:"availability,omitempty"`

	// Average reviews for the item. Can be a number from 1-5.
	AverageReviewRating *float32 `json:"average_review_rating,omitempty"`

	// The brand of the product.
	Brand *string `json:"brand,omitempty"`

	// This attribute is not supported anymore.
	// Deprecated
	CheckoutEnabled *bool `json:"checkout_enabled,omitempty"`

	// The primary color of the product.
	Color *string `json:"color,omitempty"`

	// The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
	Condition *string `json:"condition,omitempty"`

	// <p><= 1000 characters</p> <p>Custom grouping of products.</p>
	CustomLabel0 *string `json:"custom_label_0,omitempty"`

	// <p><= 1000 characters</p> <p>Custom grouping of products.</p>
	CustomLabel1 *string `json:"custom_label_1,omitempty"`

	// <p><= 1000 characters</p> <p>Custom grouping of products.</p>
	CustomLabel2 *string `json:"custom_label_2,omitempty"`

	// <p><= 1000 characters</p> <p>Custom grouping of products.</p>
	CustomLabel3 *string `json:"custom_label_3,omitempty"`

	// <p><= 1000 characters</p> <p>Custom grouping of products.</p>
	CustomLabel4 *string `json:"custom_label_4,omitempty"`

	// <p><= 10000 characters</p> <p>The description of the product.</p>
	Description string `json:"description,omitempty"`

	// The item is free to ship.
	FreeShippingLabel *bool `json:"free_shipping_label,omitempty"`

	// The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
	FreeShippingLimit *string `json:"free_shipping_limit,omitempty"`

	// The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.
	Gender *string `json:"gender,omitempty"`

	// The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
	GoogleProductCategory *string `json:"google_product_category,omitempty"`

	// The unique universal product identifier.
	Gtin *int32 `json:"gtin,omitempty"`

	// <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>
	// Deprecated
	Id string `json:"id,omitempty"`

	// <p><= 127 characters</p> <p>The parent ID of the product.</p>
	ItemGroupId *string `json:"item_group_id,omitempty"`

	// The millisecond timestamp when the item was lastly modified by the merchant.
	LastUpdatedTime *int64 `json:"last_updated_time,omitempty"`

	// <p><= 511 characters</p> <p>The landing page for the product.</p>
	Link string `json:"link,omitempty"`

	// The material used to make the product.
	Material *string `json:"material,omitempty"`

	// The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
	MinAdPrice *string `json:"min_ad_price,omitempty"`

	// The mobile-optimized version of your landing page. Must begin with http:// or https://.
	MobileLink *string `json:"mobile_link,omitempty"`

	// Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
	Mpn *string `json:"mpn,omitempty"`

	// The number of ratings for the item.
	NumberOfRatings *int32 `json:"number_of_ratings,omitempty"`

	// The number of reviews available for the item.
	NumberOfReviews *int32 `json:"number_of_reviews,omitempty"`

	// The description of the pattern used for the product.
	Pattern *string `json:"pattern,omitempty"`

	// The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
	Price string `json:"price,omitempty"`

	// <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>
	ProductType *string `json:"product_type,omitempty"`

	// The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
	SalePrice *string `json:"sale_price,omitempty"`

	// Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
	Shipping *string `json:"shipping,omitempty"`

	// The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
	ShippingHeight *string `json:"shipping_height,omitempty"`

	// The weight of the product. Ensure there is a space between the numeric string and the metric.
	ShippingWeight *string `json:"shipping_weight,omitempty"`

	// The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
	ShippingWidth *string `json:"shipping_width,omitempty"`

	// The size of the product.
	Size *string `json:"size,omitempty"`

	// Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.
	SizeSystem *string `json:"size_system,omitempty"`

	// Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.
	SizeType *string `json:"size_type,omitempty"`

	// Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
	Tax *string `json:"tax,omitempty"`

	// <p><= 500 characters</p> <p>The name of the product.</p>
	Title string `json:"title,omitempty"`

	// Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
	VariantNames *[]string `json:"variant_names,omitempty"`

	// Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
	VariantValues *[]string `json:"variant_values,omitempty"`
}
