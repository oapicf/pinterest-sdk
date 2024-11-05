#tag Class
Protected Class UpdateMemberBusinessRoleBody

	#tag Property, Flags = &h0
		business_role As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Unique identifier of the member
		#tag EndNote
		member_id As String
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
			Name="business_role"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BusinessRoleForMembers"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="member_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


