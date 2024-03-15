#tag Class
Protected Class CustomerListUpdateRequest

	#tag Property, Flags = &h0
		#tag Note
			Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
		#tag EndNote
		records As String
	#tag EndProperty


	#tag Property, Flags = &h0
		operation_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		exceptions As ModelException
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
			Name="records"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="operation_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="UserListOperationType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="exceptions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ModelException"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


