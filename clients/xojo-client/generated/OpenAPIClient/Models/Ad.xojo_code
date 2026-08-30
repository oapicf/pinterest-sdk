#tag Class
Protected Class Ad

	#tag Property, Flags = &h0
		#tag Note
			The ID of the advertiser that this ad belongs to.
		#tag EndNote
		ad_account_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			ID of the ad group that contains the ad.
		#tag EndNote
		ad_group_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Deep link URL for Android devices.
		#tag EndNote
		android_deep_link As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			ID of the ad campaign that contains this ad.
		#tag EndNote
		campaign_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Comma-separated deep links for the carousel pin on Android.
		#tag EndNote
		carousel_android_deep_links() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Comma-separated destination URLs for the carousel pin to promote.
		#tag EndNote
		carousel_destination_urls() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Comma-separated deep links for the carousel pin on iOS.
		#tag EndNote
		carousel_ios_deep_links() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The vendor platform type of the carting/WTB ad.
		#tag EndNote
		carting_platform_type As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Array of carting/WTB products for the ad.
		#tag EndNote
		carting_products() As OpenAPIClient.Models.CartingProduct
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Tracking url for the ad clicks.
		#tag EndNote
		click_tracking_url As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Destination URL template for all items within a collections drawer.
		#tag EndNote
		collection_items_destination_url_template As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		collections_header_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Pin creation time. Unix timestamp in seconds.
		#tag EndNote
		created_time As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		creative_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		customizable_cta_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Destination URL.
		#tag EndNote
		destination_url As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		disclosure_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
		#tag EndNote
		disclosure_url As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		grid_click_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of this ad.
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Deep link URL for iOS devices.
		#tag EndNote
		ios_deep_link As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Is the ad a carting/WTB ad?
		#tag EndNote
		is_carting As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether the advertiser has accepted the terms and conditions for collage ad.
		#tag EndNote
		is_collage_accepted_terms As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether the collage ad has a single destination url override.
		#tag EndNote
		is_collage_single_destination As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Is original pin deleted?
		#tag EndNote
		is_pin_deleted As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Is pin repinnable?
		#tag EndNote
		is_removable As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Lead form ID for lead ad generation.
		#tag EndNote
		lead_form_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Name of the ad - 255 chars max.
		#tag EndNote
		name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Pin ID. This field may only be updated for draft ads.
		#tag EndNote
		pin_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
		#tag EndNote
		quiz_pin_data As OpenAPIClient.Models.QuizPinData
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Enum reason why the pin was rejected. Returned if `review_status` is "REJECTED".
		#tag EndNote
		rejected_reasons() As AdDisapprovalReasons
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Text reason why the pin was rejected. Returned if `review_status` is "REJECTED".
		#tag EndNote
		rejection_labels() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ad review status
		#tag EndNote
		review_status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		status As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ad summary status
		#tag EndNote
		summary_status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		tracking_urls As OpenAPIClient.Models.TrackingUrls
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Always "ad".
		#tag EndNote
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Last update time. Unix timestamp in seconds.
		#tag EndNote
		updated_time As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Tracking URL for ad impressions.
		#tag EndNote
		view_tracking_url As Xoson.O.OptionalString
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ad_account_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ad_group_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="android_deep_link"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="campaign_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="carousel_android_deep_links"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="carousel_destination_urls"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="carousel_ios_deep_links"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="carting_platform_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="carting_products"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CartingProduct"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="click_tracking_url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="collection_items_destination_url_template"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="collections_header_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdCollectionsHeaderType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="created_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="creative_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreativeType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="customizable_cta_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CustomizableCTAType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="destination_url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="disclosure_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="DisclosureType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="disclosure_url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="grid_click_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GridClickType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ios_deep_link"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_carting"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_collage_accepted_terms"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_collage_single_destination"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_pin_deleted"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_removable"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lead_form_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pin_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="quiz_pin_data"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="QuizPinData"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="rejected_reasons"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdDisapprovalReasons"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="rejection_labels"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="review_status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdReviewStatus"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="EntityStatus"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="summary_status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PinPromotionSummaryStatus"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tracking_urls"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TrackingUrls"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="updated_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="view_tracking_url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


