package models

type Ad struct {

	// The ID of the advertiser that this ad belongs to.
	AdAccountId string `json:"ad_account_id" validate:"regexp=^\\d+$"`

	// ID of the ad group that contains the ad.
	AdGroupId string `json:"ad_group_id" validate:"regexp=^(AG)?\\d+$"`

	// Deep link URL for Android devices.
	AndroidDeepLink *string `json:"android_deep_link,omitempty"`

	// ID of the ad campaign that contains this ad.
	CampaignId string `json:"campaign_id" validate:"regexp=^\\d+$"`

	// Comma-separated deep links for the carousel pin on Android.
	CarouselAndroidDeepLinks *[]string `json:"carousel_android_deep_links,omitempty"`

	// Comma-separated destination URLs for the carousel pin to promote.
	CarouselDestinationUrls *[]string `json:"carousel_destination_urls,omitempty"`

	// Comma-separated deep links for the carousel pin on iOS.
	CarouselIosDeepLinks *[]string `json:"carousel_ios_deep_links,omitempty"`

	// The vendor platform type of the carting/WTB ad.
	CartingPlatformType int32 `json:"carting_platform_type,omitempty"`

	// Array of carting/WTB products for the ad.
	CartingProducts []CartingProduct `json:"carting_products,omitempty"`

	// Tracking url for the ad clicks.
	ClickTrackingUrl *string `json:"click_tracking_url,omitempty"`

	// Destination URL template for all items within a collections drawer.
	CollectionItemsDestinationUrlTemplate *string `json:"collection_items_destination_url_template,omitempty"`

	CollectionsHeaderType *AdCollectionsHeaderType `json:"collections_header_type,omitempty"`

	// Pin creation time. Unix timestamp in seconds.
	CreatedTime int32 `json:"created_time,omitempty"`

	CreativeType CreativeType `json:"creative_type"`

	CustomizableCtaType *CustomizableCtaType `json:"customizable_cta_type,omitempty"`

	// Destination URL.
	DestinationUrl *string `json:"destination_url,omitempty"`

	DisclosureType *DisclosureType `json:"disclosure_type,omitempty"`

	// URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
	DisclosureUrl *string `json:"disclosure_url,omitempty"`

	GridClickType *GridClickType `json:"grid_click_type,omitempty"`

	// The ID of this ad.
	Id string `json:"id" validate:"regexp=^\\d+$"`

	// Deep link URL for iOS devices.
	IosDeepLink *string `json:"ios_deep_link,omitempty"`

	// Is the ad a carting/WTB ad?
	IsCarting bool `json:"is_carting,omitempty"`

	// Whether the advertiser has accepted the terms and conditions for collage ad.
	IsCollageAcceptedTerms bool `json:"is_collage_accepted_terms,omitempty"`

	// Whether the collage ad has a single destination url override.
	IsCollageSingleDestination bool `json:"is_collage_single_destination,omitempty"`

	// Is original pin deleted?
	IsPinDeleted bool `json:"is_pin_deleted,omitempty"`

	// Is pin repinnable?
	IsRemovable bool `json:"is_removable,omitempty"`

	// Lead form ID for lead ad generation.
	LeadFormId *string `json:"lead_form_id,omitempty" validate:"regexp=^(AG)?\\d+$"`

	// Name of the ad - 255 chars max.
	Name *string `json:"name,omitempty"`

	// Pin ID. This field may only be updated for draft ads.
	PinId string `json:"pin_id" validate:"regexp=^\\d+$"`

	// Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
	QuizPinData *QuizPinData `json:"quiz_pin_data,omitempty"`

	// Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
	RejectedReasons []AdDisapprovalReasons `json:"rejected_reasons"`

	// Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
	RejectionLabels []string `json:"rejection_labels"`

	// Ad review status
	ReviewStatus AdReviewStatus `json:"review_status"`

	Status EntityStatus `json:"status,omitempty"`

	// Ad summary status
	SummaryStatus PinPromotionSummaryStatus `json:"summary_status"`

	TrackingUrls *TrackingUrls `json:"tracking_urls,omitempty"`

	// Always \"ad\".
	Type string `json:"type"`

	// Last update time. Unix timestamp in seconds.
	UpdatedTime int32 `json:"updated_time,omitempty"`

	// Tracking URL for ad impressions.
	ViewTrackingUrl *string `json:"view_tracking_url,omitempty"`
}
