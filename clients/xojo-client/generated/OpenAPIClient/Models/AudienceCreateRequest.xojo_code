#tag Class
Protected Class AudienceCreateRequest

	#tag Property, Flags = &h0
		#tag Note
			Ad account ID.
		#tag EndNote
		ad_account_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Audience name.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		rule As OpenAPIClient.Models.AudienceRule
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Audience description.
		#tag EndNote
		description As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		audience_type As OpenAPIClient.Models.AudienceCreateRequest1AudienceType
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
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="rule"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AudienceRule"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="description"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="audience_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AudienceCreateRequest1AudienceType"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


