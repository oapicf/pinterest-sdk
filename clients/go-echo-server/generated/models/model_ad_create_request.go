package models

type AdCreateRequest struct {

	// ID of the ad group that contains the ad.
	AdGroupId string `json:"ad_group_id" validate:"regexp=^(AG)?\\\\d+$"`

	// Deep link URL for Android devices.
	AndroidDeepLink *string `json:"android_deep_link,omitempty"`

	// Comma-separated deep links for the carousel pin on Android.
	CarouselAndroidDeepLinks *[]string `json:"carousel_android_deep_links,omitempty"`

	// Comma-separated destination URLs for the carousel pin to promote.
	CarouselDestinationUrls *[]string `json:"carousel_destination_urls,omitempty"`

	// Comma-separated deep links for the carousel pin on iOS.
	CarouselIosDeepLinks *[]string `json:"carousel_ios_deep_links,omitempty"`

	// Tracking url for the ad clicks.
	ClickTrackingUrl *string `json:"click_tracking_url,omitempty"`

	CreativeType CreativeType `json:"creative_type"`

	CustomizableCtaType *CustomizableCtaType `json:"customizable_cta_type,omitempty"`

	// Destination URL.
	DestinationUrl *string `json:"destination_url,omitempty"`

	DisclosureType *DisclosureType `json:"disclosure_type,omitempty"`

	// URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
	DisclosureUrl *string `json:"disclosure_url,omitempty"`

	GridClickType *GridClickType `json:"grid_click_type,omitempty"`

	// Deep link URL for iOS devices.
	IosDeepLink *string `json:"ios_deep_link,omitempty"`

	// Is original pin deleted?
	IsPinDeleted bool `json:"is_pin_deleted,omitempty"`

	// Is pin repinnable?
	IsRemovable bool `json:"is_removable,omitempty"`

	// Lead form ID for lead ad generation.
	LeadFormId *string `json:"lead_form_id,omitempty" validate:"regexp=^(AG)?\\\\d+$"`

	// Name of the ad - 255 chars max.
	Name *string `json:"name,omitempty"`

	// Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
	QuizPinData *QuizPinData `json:"quiz_pin_data,omitempty"`

	Status EntityStatus `json:"status,omitempty"`

	TrackingUrls *TrackingUrls `json:"tracking_urls,omitempty"`

	// Tracking URL for ad impressions.
	ViewTrackingUrl *string `json:"view_tracking_url,omitempty"`

	// Pin ID.
	PinId string `json:"pin_id" validate:"regexp=^\\\\d+$"`
}
