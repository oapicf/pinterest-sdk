#tag Class
Protected Class BusinessSharedAudienceResponse

	#tag Property, Flags = &h0
		#tag Note
			Audience ID that was shared
		#tag EndNote
		audience_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		permissions() As Role
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Business IDs that received the audience
		#tag EndNote
		recipient_business_ids() As String
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
			Name="audience_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="permissions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Role"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="recipient_business_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


