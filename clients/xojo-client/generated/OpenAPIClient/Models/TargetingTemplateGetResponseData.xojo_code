#tag Class
Protected Class TargetingTemplateGetResponseData

	#tag Property, Flags = &h0
		#tag Note
			targeting template name
		#tag EndNote
		name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Enable auto-targeting for ad group. Also known as <a href="https://help.pinterest.com/en/business/article/expanded-targeting" target="_blank">"expanded targeting"</a>.
		#tag EndNote
		auto_targeting_enabled As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		targeting_attributes As OpenAPIClient.Models.TargetingSpec
	#tag EndProperty


	#tag Property, Flags = &h0
		placement_group As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		keywords() As OpenAPIClient.Models.TargetingTemplateKeyword
	#tag EndProperty


	#tag Property, Flags = &h0
		tracking_urls As OpenAPIClient.Models.TrackingUrls
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Targeting template ID.
		#tag EndNote
		id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Targeting template created time. Unix timestamp in seconds.
		#tag EndNote
		created_time As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Targeting template updated time.Unix timestamp in seconds.
		#tag EndNote
		updated_time As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the advertiser that this targeting template belongs to.
		#tag EndNote
		ad_account_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Indicate targeting template is active or Deleted
		#tag EndNote
		status As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		sizing As OpenAPIClient.Models.TargetingTemplateAudienceSizing
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Inform if the targeting template is valid (ex. would be false if has revoked audience)
		#tag EndNote
		valid As Xoson.O.OptionalBoolean
	#tag EndProperty


    #tag Enum, Name = StatusEnum, Type = Integer, Flags = &h0
        
        Active
        Deleted
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function StatusEnumToString(value As StatusEnum) As String
		  Select Case value
		    
		    Case StatusEnum.Active
		      Return "ACTIVE"
		    Case StatusEnum.Deleted
		      Return "DELETED"
		    
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
		#tag ViewProperty
			Name="auto_targeting_enabled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="targeting_attributes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingSpec"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="placement_group"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PlacementGroupType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="keywords"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingTemplateKeyword"
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
			Name="id"
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
			Name="updated_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
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
			Name="sizing"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingTemplateAudienceSizing"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="valid"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


