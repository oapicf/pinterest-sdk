#tag Class
Protected Class AdCreateRequest

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
		creative_type As String
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
		pin_id As String
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
	#tag EndViewBehavior
End Class
#tag EndClass


