#tag Class
Protected Class TargetingSpec

	#tag Property, Flags = &h0
		#tag Note
			Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.
		#tag EndNote
		AGE_BUCKET() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
		#tag EndNote
		APPTYPE() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Excluded customer list IDs. Used to drive new customer acquisition goals. For example: ["2542620905475"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
		#tag EndNote
		AUDIENCE_EXCLUDE() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Targeted customer list IDs. For example: ["2542620905473"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
		#tag EndNote
		AUDIENCE_INCLUDE() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Targeted genders. Values: ["unknown","male","female"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
		#tag EndNote
		GENDER() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Location region codes, e.g., "BE-VOV" (East Flanders, Belgium) For complete list, <a href="https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx" target="_blank">click here</a> or postal codes, e.g., "US-94107". Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below).
		#tag EndNote
		GEO() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
		#tag EndNote
		INTEREST() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be targeted, only english non-sublanguage will be targeted**.
		#tag EndNote
		LOCALE() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., ["US", "807"]). For complete list, click here. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above).
		#tag EndNote
		LOCATION() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
		#tag EndNote
		SHOPPING_RETARGETING() As OpenAPIClient.Models.TargetingSpecSHOPPINGRETARGETING
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			
		#tag EndNote
		TARGETING_STRATEGY() As String
	#tag EndProperty


    #tag Enum, Name = AGE_BUCKETEnum, Type = Integer, Flags = &h0
        
        Escaped1824
        Escaped21Plus
        Escaped2534
        Escaped3544
        Escaped4549
        Escaped5054
        Escaped5564
        Escaped65Plus
        
    #tag EndEnum

    #tag Enum, Name = APPTYPEEnum, Type = Integer, Flags = &h0
        
        AndroidMobile
        AndroidTablet
        Ipad
        Iphone
        Web
        WebMobile
        
    #tag EndEnum

    #tag Enum, Name = GENDEREnum, Type = Integer, Flags = &h0
        
        Unknown
        Male
        Female
        
    #tag EndEnum

    #tag Enum, Name = TARGETING_STRATEGYEnum, Type = Integer, Flags = &h0
        
        ChooseYourOwn
        FindNewCustomers
        ReconnectWithUsers
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function AGE_BUCKETEnumToString(value As AGE_BUCKETEnum) As String
		  Select Case value
		    
		    Case AGE_BUCKETEnum.Escaped1824
		      Return "18-24"
		    Case AGE_BUCKETEnum.Escaped21Plus
		      Return "21+"
		    Case AGE_BUCKETEnum.Escaped2534
		      Return "25-34"
		    Case AGE_BUCKETEnum.Escaped3544
		      Return "35-44"
		    Case AGE_BUCKETEnum.Escaped4549
		      Return "45-49"
		    Case AGE_BUCKETEnum.Escaped5054
		      Return "50-54"
		    Case AGE_BUCKETEnum.Escaped5564
		      Return "55-64"
		    Case AGE_BUCKETEnum.Escaped65Plus
		      Return "65+"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function APPTYPEEnumToString(value As APPTYPEEnum) As String
		  Select Case value
		    
		    Case APPTYPEEnum.AndroidMobile
		      Return "android_mobile"
		    Case APPTYPEEnum.AndroidTablet
		      Return "android_tablet"
		    Case APPTYPEEnum.Ipad
		      Return "ipad"
		    Case APPTYPEEnum.Iphone
		      Return "iphone"
		    Case APPTYPEEnum.Web
		      Return "web"
		    Case APPTYPEEnum.WebMobile
		      Return "web_mobile"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function GENDEREnumToString(value As GENDEREnum) As String
		  Select Case value
		    
		    Case GENDEREnum.Unknown
		      Return "unknown"
		    Case GENDEREnum.Male
		      Return "male"
		    Case GENDEREnum.Female
		      Return "female"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function TARGETING_STRATEGYEnumToString(value As TARGETING_STRATEGYEnum) As String
		  Select Case value
		    
		    Case TARGETING_STRATEGYEnum.ChooseYourOwn
		      Return "CHOOSE_YOUR_OWN"
		    Case TARGETING_STRATEGYEnum.FindNewCustomers
		      Return "FIND_NEW_CUSTOMERS"
		    Case TARGETING_STRATEGYEnum.ReconnectWithUsers
		      Return "RECONNECT_WITH_USERS"
		    
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
			Name="AUDIENCE_EXCLUDE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="AUDIENCE_INCLUDE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="GEO"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="INTEREST"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="LOCALE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="LOCATION"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="SHOPPING_RETARGETING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingSpecSHOPPINGRETARGETING"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


