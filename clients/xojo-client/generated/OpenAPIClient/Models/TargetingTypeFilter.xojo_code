#tag Class
Protected Class TargetingTypeFilter

	#tag Property, Flags = &h0
		#tag Note
			List of targeting types. Requires `level` to be a value ending in `_TARGETING`. ["AUDIENCE_MULTIPLIER"] is only available in CAMPAIGN_TARGETING level. ["MEDIA_TYPE"] is only available in PRODUCT_ITEM_TARGETING level. ["AGE_BUCKET_AND_GENDER"] is in BETA and not yet available to all users.
		#tag EndNote
		targeting_types() As String
	#tag EndProperty


    #tag Enum, Name = Targeting_typesEnum, Type = Integer, Flags = &h0
        
        Keyword
        Apptype
        Gender
        Location
        Placement
        Country
        TargetedInterest
        PinnerInterest
        AudienceInclude
        Geo
        AgeBucket
        Region
        MediaType
        AgeBucketAndGender
        AudienceMultiplier
        CreativeEnhancements
        LocalAdsStoreCode
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Targeting_typesEnumToString(value As Targeting_typesEnum) As String
		  Select Case value
		    
		    Case Targeting_typesEnum.Keyword
		      Return "KEYWORD"
		    Case Targeting_typesEnum.Apptype
		      Return "APPTYPE"
		    Case Targeting_typesEnum.Gender
		      Return "GENDER"
		    Case Targeting_typesEnum.Location
		      Return "LOCATION"
		    Case Targeting_typesEnum.Placement
		      Return "PLACEMENT"
		    Case Targeting_typesEnum.Country
		      Return "COUNTRY"
		    Case Targeting_typesEnum.TargetedInterest
		      Return "TARGETED_INTEREST"
		    Case Targeting_typesEnum.PinnerInterest
		      Return "PINNER_INTEREST"
		    Case Targeting_typesEnum.AudienceInclude
		      Return "AUDIENCE_INCLUDE"
		    Case Targeting_typesEnum.Geo
		      Return "GEO"
		    Case Targeting_typesEnum.AgeBucket
		      Return "AGE_BUCKET"
		    Case Targeting_typesEnum.Region
		      Return "REGION"
		    Case Targeting_typesEnum.MediaType
		      Return "MEDIA_TYPE"
		    Case Targeting_typesEnum.AgeBucketAndGender
		      Return "AGE_BUCKET_AND_GENDER"
		    Case Targeting_typesEnum.AudienceMultiplier
		      Return "AUDIENCE_MULTIPLIER"
		    Case Targeting_typesEnum.CreativeEnhancements
		      Return "CREATIVE_ENHANCEMENTS"
		    Case Targeting_typesEnum.LocalAdsStoreCode
		      Return "LOCAL_ADS_STORE_CODE"
		    
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
	#tag EndViewBehavior
End Class
#tag EndClass


