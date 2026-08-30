#tag Class
Protected Class SharedAudienceAccount

	#tag Property, Flags = &h0
		#tag Note
			Account ID (ad account or business ID).
		#tag EndNote
		account_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Account name.
		#tag EndNote
		account_name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			account type
		#tag EndNote
		account_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Epoch timestamp in seconds for the shared audience event
		#tag EndNote
		shared_on_timestamp As Integer
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
			Name="account_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="account_name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="account_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AudienceAccountType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="shared_on_timestamp"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


