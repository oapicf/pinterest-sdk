#tag Class
Protected Class InviteBusinessRoleBinding

	#tag Property, Flags = &h0
		#tag Note
			Unique identifier for the business that created the invite/request.
		#tag EndNote
		created_by_business_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Unique identifier for the user that created the invite/request.
		#tag EndNote
		created_by_user_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metadata for the user that updated the invite/request.
		#tag EndNote
		user As OpenAPIClient.Models.BusinessAccessUserSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Unique identifier of the invite/request.
		#tag EndNote
		id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		invite_data As OpenAPIClient.Models.BaseInviteDataResponseInviteData
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Indicates whether the invite/request was received.
		#tag EndNote
		is_received_invite As Xoson.O.OptionalBoolean
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
			Name="created_by_business_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="created_by_user_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="user"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BusinessAccessUserSummary"
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
			Name="invite_data"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BaseInviteDataResponseInviteData"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_received_invite"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


