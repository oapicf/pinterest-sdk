package models
// CustomizableCtaType : Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
type CustomizableCtaType string

// List of CustomizableCtaType
const (
	GET_OFFER CustomizableCtaType = "GET_OFFER"
	LEARN_MORE CustomizableCtaType = "LEARN_MORE"
	ORDER_NOW CustomizableCtaType = "ORDER_NOW"
	SHOP_NOW CustomizableCtaType = "SHOP_NOW"
	SIGN_UP CustomizableCtaType = "SIGN_UP"
	SUBSCRIBE CustomizableCtaType = "SUBSCRIBE"
	BUY_NOW CustomizableCtaType = "BUY_NOW"
	CONTACT_US CustomizableCtaType = "CONTACT_US"
	GET_QUOTE CustomizableCtaType = "GET_QUOTE"
	VISIT_SITE CustomizableCtaType = "VISIT_SITE"
	APPLY_NOW CustomizableCtaType = "APPLY_NOW"
	BOOK_NOW CustomizableCtaType = "BOOK_NOW"
	REQUEST_DEMO CustomizableCtaType = "REQUEST_DEMO"
	REGISTER_NOW CustomizableCtaType = "REGISTER_NOW"
	FIND_A_DEALER CustomizableCtaType = "FIND_A_DEALER"
	ADD_TO_CART CustomizableCtaType = "ADD_TO_CART"
	WATCH_NOW CustomizableCtaType = "WATCH_NOW"
	READ_MORE CustomizableCtaType = "READ_MORE"
	BUY_TICKETS CustomizableCtaType = "BUY_TICKETS"
	DONATE_NOW CustomizableCtaType = "DONATE_NOW"
	DOWNLOAD CustomizableCtaType = "DOWNLOAD"
	EXPLORE_MORE CustomizableCtaType = "EXPLORE_MORE"
	FIND_A_LOCATION CustomizableCtaType = "FIND_A_LOCATION"
	GET_DEAL CustomizableCtaType = "GET_DEAL"
	GET_RECIPE CustomizableCtaType = "GET_RECIPE"
	GET_SHOWTIMES CustomizableCtaType = "GET_SHOWTIMES"
	ON_SALE CustomizableCtaType = "ON_SALE"
	PLAY_GAME CustomizableCtaType = "PLAY_GAME"
	TRY_IT CustomizableCtaType = "TRY_IT"
)
