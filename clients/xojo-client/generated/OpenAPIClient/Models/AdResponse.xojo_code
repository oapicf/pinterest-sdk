#tag Class
Protected Class AdResponse

	#tag Property, Flags = &h0
		#tag Note
			ID of the ad group that contains the ad.
		#tag EndNote
		ad_group_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Deep link URL for Android devices.
		#tag EndNote
		android_deep_link As Xoson.O.OptionalString
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
			Tracking url for the ad clicks.
		#tag EndNote
		click_tracking_url As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		creative_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Destination URL.
		#tag EndNote
		destination_url As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Deep link URL for iOS devices.
		#tag EndNote
		ios_deep_link As Xoson.O.OptionalString
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
			Name of the ad - 255 chars max.
		#tag EndNote
		name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		status As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		tracking_urls As OpenAPIClient.Models.TrackingUrls
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Tracking URL for ad impressions.
		#tag EndNote
		view_tracking_url As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Lead form ID for lead ad generation.
		#tag EndNote
		lead_form_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		grid_click_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
		#tag EndNote
		customizable_cta_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
		#tag EndNote
		quiz_pin_data As OpenAPIClient.Models.QuizPinData
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Pin ID.
		#tag EndNote
		pin_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the advertiser that this ad belongs to.
		#tag EndNote
		ad_account_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			ID of the ad campaign that contains this ad.
		#tag EndNote
		campaign_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Destination URL template for all items within a collections drawer.
		#tag EndNote
		collection_items_destination_url_template As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Pin creation time. Unix timestamp in seconds.
		#tag EndNote
		created_time As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of this ad.
		#tag EndNote
		id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Enum reason why the pin was rejected. Returned if <code>review_status</code> is "REJECTED".
		#tag EndNote
		rejected_reasons() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Text reason why the pin was rejected. Returned if <code>review_status</code> is "REJECTED".
		#tag EndNote
		rejection_labels() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ad review status
		#tag EndNote
		review_status As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Always "ad".
		#tag EndNote
		type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Last update time. Unix timestamp in seconds.
		#tag EndNote
		updated_time As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ad summary status
		#tag EndNote
		summary_status As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = Customizable_cta_typeEnum, Type = Integer, Flags = &h0
        
        GetOffer
        LearnMore
        OrderNow
        ShopNow
        SignUp
        Subscribe
        BuyNow
        ContactUs
        GetQuote
        VisitSite
        ApplyNow
        BookNow
        RequestDemo
        RegisterNow
        FindADealer
        AddToCart
        WatchNow
        ReadMore
        
    #tag EndEnum

    #tag Enum, Name = Rejected_reasonsEnum, Type = Integer, Flags = &h0
        
        Hashtags
        PromotionsAndPrices
        Targeting
        LandingPage
        CapsAndSymbols
        Shocking
        WeightLoss
        ProhibitedProduct
        Authenticity
        Nudity
        ConfusingDesign
        Urgency
        Ratings
        App
        Alcohol
        Contests
        Political
        Other
        Image
        Nar
        Inconsistent
        Clickbait
        NoDescription
        LowQuality
        ExaggeratedClaims
        PinterestBrand
        AlcoholNoSale
        LandingPageSpeed
        LandingPageHardwall
        LandingPageBroken
        LandingPageQuality
        OutOfStock
        ImageLowQuality
        ImageBusy
        ImagePoorlyEdited
        ImageBeforeAfter
        Ugc
        FakeButtons
        Weapons
        Sensitive
        UnacceptableBusiness
        SuspiciousClaims
        Pharma
        SuspiciousSupplements
        IllegalRecreationalDrug
        LowQualityLandingPage
        RestrictedHealthcare
        InconsistentLangFr
        
    #tag EndEnum

    #tag Enum, Name = Review_statusEnum, Type = Integer, Flags = &h0
        
        Other
        Pending
        Rejected
        Approved
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Customizable_cta_typeEnumToString(value As Customizable_cta_typeEnum) As String
		  Select Case value
		    
		    Case Customizable_cta_typeEnum.GetOffer
		      Return "GET_OFFER"
		    Case Customizable_cta_typeEnum.LearnMore
		      Return "LEARN_MORE"
		    Case Customizable_cta_typeEnum.OrderNow
		      Return "ORDER_NOW"
		    Case Customizable_cta_typeEnum.ShopNow
		      Return "SHOP_NOW"
		    Case Customizable_cta_typeEnum.SignUp
		      Return "SIGN_UP"
		    Case Customizable_cta_typeEnum.Subscribe
		      Return "SUBSCRIBE"
		    Case Customizable_cta_typeEnum.BuyNow
		      Return "BUY_NOW"
		    Case Customizable_cta_typeEnum.ContactUs
		      Return "CONTACT_US"
		    Case Customizable_cta_typeEnum.GetQuote
		      Return "GET_QUOTE"
		    Case Customizable_cta_typeEnum.VisitSite
		      Return "VISIT_SITE"
		    Case Customizable_cta_typeEnum.ApplyNow
		      Return "APPLY_NOW"
		    Case Customizable_cta_typeEnum.BookNow
		      Return "BOOK_NOW"
		    Case Customizable_cta_typeEnum.RequestDemo
		      Return "REQUEST_DEMO"
		    Case Customizable_cta_typeEnum.RegisterNow
		      Return "REGISTER_NOW"
		    Case Customizable_cta_typeEnum.FindADealer
		      Return "FIND_A_DEALER"
		    Case Customizable_cta_typeEnum.AddToCart
		      Return "ADD_TO_CART"
		    Case Customizable_cta_typeEnum.WatchNow
		      Return "WATCH_NOW"
		    Case Customizable_cta_typeEnum.ReadMore
		      Return "READ_MORE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Rejected_reasonsEnumToString(value As Rejected_reasonsEnum) As String
		  Select Case value
		    
		    Case Rejected_reasonsEnum.Hashtags
		      Return "HASHTAGS"
		    Case Rejected_reasonsEnum.PromotionsAndPrices
		      Return "PROMOTIONS_AND_PRICES"
		    Case Rejected_reasonsEnum.Targeting
		      Return "TARGETING"
		    Case Rejected_reasonsEnum.LandingPage
		      Return "LANDING_PAGE"
		    Case Rejected_reasonsEnum.CapsAndSymbols
		      Return "CAPS_AND_SYMBOLS"
		    Case Rejected_reasonsEnum.Shocking
		      Return "SHOCKING"
		    Case Rejected_reasonsEnum.WeightLoss
		      Return "WEIGHT_LOSS"
		    Case Rejected_reasonsEnum.ProhibitedProduct
		      Return "PROHIBITED_PRODUCT"
		    Case Rejected_reasonsEnum.Authenticity
		      Return "AUTHENTICITY"
		    Case Rejected_reasonsEnum.Nudity
		      Return "NUDITY"
		    Case Rejected_reasonsEnum.ConfusingDesign
		      Return "CONFUSING_DESIGN"
		    Case Rejected_reasonsEnum.Urgency
		      Return "URGENCY"
		    Case Rejected_reasonsEnum.Ratings
		      Return "RATINGS"
		    Case Rejected_reasonsEnum.App
		      Return "APP"
		    Case Rejected_reasonsEnum.Alcohol
		      Return "ALCOHOL"
		    Case Rejected_reasonsEnum.Contests
		      Return "CONTESTS"
		    Case Rejected_reasonsEnum.Political
		      Return "POLITICAL"
		    Case Rejected_reasonsEnum.Other
		      Return "OTHER"
		    Case Rejected_reasonsEnum.Image
		      Return "IMAGE"
		    Case Rejected_reasonsEnum.Nar
		      Return "NAR"
		    Case Rejected_reasonsEnum.Inconsistent
		      Return "INCONSISTENT"
		    Case Rejected_reasonsEnum.Clickbait
		      Return "CLICKBAIT"
		    Case Rejected_reasonsEnum.NoDescription
		      Return "NO_DESCRIPTION"
		    Case Rejected_reasonsEnum.LowQuality
		      Return "LOW_QUALITY"
		    Case Rejected_reasonsEnum.ExaggeratedClaims
		      Return "EXAGGERATED_CLAIMS"
		    Case Rejected_reasonsEnum.PinterestBrand
		      Return "PINTEREST_BRAND"
		    Case Rejected_reasonsEnum.AlcoholNoSale
		      Return "ALCOHOL_NO_SALE"
		    Case Rejected_reasonsEnum.LandingPageSpeed
		      Return "LANDING_PAGE_SPEED"
		    Case Rejected_reasonsEnum.LandingPageHardwall
		      Return "LANDING_PAGE_HARDWALL"
		    Case Rejected_reasonsEnum.LandingPageBroken
		      Return "LANDING_PAGE_BROKEN"
		    Case Rejected_reasonsEnum.LandingPageQuality
		      Return "LANDING_PAGE_QUALITY"
		    Case Rejected_reasonsEnum.OutOfStock
		      Return "OUT_OF_STOCK"
		    Case Rejected_reasonsEnum.ImageLowQuality
		      Return "IMAGE_LOW_QUALITY"
		    Case Rejected_reasonsEnum.ImageBusy
		      Return "IMAGE_BUSY"
		    Case Rejected_reasonsEnum.ImagePoorlyEdited
		      Return "IMAGE_POORLY_EDITED"
		    Case Rejected_reasonsEnum.ImageBeforeAfter
		      Return "IMAGE_BEFORE_AFTER"
		    Case Rejected_reasonsEnum.Ugc
		      Return "UGC"
		    Case Rejected_reasonsEnum.FakeButtons
		      Return "FAKE_BUTTONS"
		    Case Rejected_reasonsEnum.Weapons
		      Return "WEAPONS"
		    Case Rejected_reasonsEnum.Sensitive
		      Return "SENSITIVE"
		    Case Rejected_reasonsEnum.UnacceptableBusiness
		      Return "UNACCEPTABLE_BUSINESS"
		    Case Rejected_reasonsEnum.SuspiciousClaims
		      Return "SUSPICIOUS_CLAIMS"
		    Case Rejected_reasonsEnum.Pharma
		      Return "PHARMA"
		    Case Rejected_reasonsEnum.SuspiciousSupplements
		      Return "SUSPICIOUS_SUPPLEMENTS"
		    Case Rejected_reasonsEnum.IllegalRecreationalDrug
		      Return "ILLEGAL_RECREATIONAL_DRUG"
		    Case Rejected_reasonsEnum.LowQualityLandingPage
		      Return "LOW_QUALITY_LANDING_PAGE"
		    Case Rejected_reasonsEnum.RestrictedHealthcare
		      Return "RESTRICTED_HEALTHCARE"
		    Case Rejected_reasonsEnum.InconsistentLangFr
		      Return "INCONSISTENT_LANG_FR"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Review_statusEnumToString(value As Review_statusEnum) As String
		  Select Case value
		    
		    Case Review_statusEnum.Other
		      Return "OTHER"
		    Case Review_statusEnum.Pending
		      Return "PENDING"
		    Case Review_statusEnum.Rejected
		      Return "REJECTED"
		    Case Review_statusEnum.Approved
		      Return "APPROVED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod


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
			Name="click_tracking_url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="destination_url"
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
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="tracking_urls"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TrackingUrls"
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
		#tag ViewProperty
			Name="lead_form_id"
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
			Name="quiz_pin_data"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="QuizPinData"
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
			Name="ad_account_id"
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
			Name="collection_items_destination_url_template"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="summary_status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PinPromotionSummaryStatus"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


