#tag Class
Protected Class AdvertiserDefinedEvent

	#tag Property, Flags = &h0
		#tag Note
			raw string name of the event, usually logged as raw_event_name in our dataset
		#tag EndNote
		name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			standard type mapped to ADE for optimization
		#tag EndNote
		mapped_conversion_type As OpenAPIClient.Models.String
	#tag EndProperty


    #tag Enum, Name = Mapped_conversion_typeEnum, Type = Integer, Flags = &h0
        
        PageLoad
        Unknown
        Initialized
        PageVisit
        Signup
        Checkout
        Custom
        ViewCategory
        Search
        AddToCart
        WatchVideo
        Lead
        AppInstall
        WebSession
        ExternalMeasurement
        AddPaymentInfo
        AddToWishlist
        InitiateCheckout
        Subscribe
        ViewContent
        AdvertiserDefinedEvent
        AppOpen
        Contact
        Schedule
        FindLocation
        CustomizeProduct
        SubmitApplication
        StartTrial
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Mapped_conversion_typeEnumToString(value As Mapped_conversion_typeEnum) As String
		  Select Case value
		    
		    Case Mapped_conversion_typeEnum.PageLoad
		      Return "PAGE_LOAD"
		    Case Mapped_conversion_typeEnum.Unknown
		      Return "UNKNOWN"
		    Case Mapped_conversion_typeEnum.Initialized
		      Return "INITIALIZED"
		    Case Mapped_conversion_typeEnum.PageVisit
		      Return "PAGE_VISIT"
		    Case Mapped_conversion_typeEnum.Signup
		      Return "SIGNUP"
		    Case Mapped_conversion_typeEnum.Checkout
		      Return "CHECKOUT"
		    Case Mapped_conversion_typeEnum.Custom
		      Return "CUSTOM"
		    Case Mapped_conversion_typeEnum.ViewCategory
		      Return "VIEW_CATEGORY"
		    Case Mapped_conversion_typeEnum.Search
		      Return "SEARCH"
		    Case Mapped_conversion_typeEnum.AddToCart
		      Return "ADD_TO_CART"
		    Case Mapped_conversion_typeEnum.WatchVideo
		      Return "WATCH_VIDEO"
		    Case Mapped_conversion_typeEnum.Lead
		      Return "LEAD"
		    Case Mapped_conversion_typeEnum.AppInstall
		      Return "APP_INSTALL"
		    Case Mapped_conversion_typeEnum.WebSession
		      Return "WEB_SESSION"
		    Case Mapped_conversion_typeEnum.ExternalMeasurement
		      Return "EXTERNAL_MEASUREMENT"
		    Case Mapped_conversion_typeEnum.AddPaymentInfo
		      Return "ADD_PAYMENT_INFO"
		    Case Mapped_conversion_typeEnum.AddToWishlist
		      Return "ADD_TO_WISHLIST"
		    Case Mapped_conversion_typeEnum.InitiateCheckout
		      Return "INITIATE_CHECKOUT"
		    Case Mapped_conversion_typeEnum.Subscribe
		      Return "SUBSCRIBE"
		    Case Mapped_conversion_typeEnum.ViewContent
		      Return "VIEW_CONTENT"
		    Case Mapped_conversion_typeEnum.AdvertiserDefinedEvent
		      Return "ADVERTISER_DEFINED_EVENT"
		    Case Mapped_conversion_typeEnum.AppOpen
		      Return "APP_OPEN"
		    Case Mapped_conversion_typeEnum.Contact
		      Return "CONTACT"
		    Case Mapped_conversion_typeEnum.Schedule
		      Return "SCHEDULE"
		    Case Mapped_conversion_typeEnum.FindLocation
		      Return "FIND_LOCATION"
		    Case Mapped_conversion_typeEnum.CustomizeProduct
		      Return "CUSTOMIZE_PRODUCT"
		    Case Mapped_conversion_typeEnum.SubmitApplication
		      Return "SUBMIT_APPLICATION"
		    Case Mapped_conversion_typeEnum.StartTrial
		      Return "START_TRIAL"
		    
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
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


