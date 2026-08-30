package models
// MsotEventName : Type of user conversion event.
type MsotEventName string

// List of MsotEventName
const (
	ADD_TO_CART MsotEventName = "add_to_cart"
	CHECKOUT MsotEventName = "checkout"
	LEAD MsotEventName = "lead"
	SIGNUP MsotEventName = "signup"
)
