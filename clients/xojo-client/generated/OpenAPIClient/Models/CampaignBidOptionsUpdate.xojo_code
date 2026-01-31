#tag Class
Protected Class CampaignBidOptionsUpdate

	#tag Property, Flags = &h0
		app_type_multipliers As Xoson.O.OptionalAppTypeMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		audience_multipliers As Xoson.O.OptionalCampaignAudienceMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		placement_multipliers As Xoson.O.OptionalPlacementMultipliers
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of fields to update, only the fields in the list will be updated.
		#tag EndNote
		update_mask() As String
	#tag EndProperty


    #tag Enum, Name = Update_maskEnum, Type = Integer, Flags = &h0
        
        Audience
        AppType
        Placement
        Gender
        AgeBucket
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Update_maskEnumToString(value As Update_maskEnum) As String
		  Select Case value
		    
		    Case Update_maskEnum.Audience
		      Return "AUDIENCE"
		    Case Update_maskEnum.AppType
		      Return "APP_TYPE"
		    Case Update_maskEnum.Placement
		      Return "PLACEMENT"
		    Case Update_maskEnum.Gender
		      Return "GENDER"
		    Case Update_maskEnum.AgeBucket
		      Return "AGE_BUCKET"
		    
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
			Name="app_type_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AppTypeMultipliers"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="audience_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignAudienceMultipliers"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="placement_multipliers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PlacementMultipliers"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


