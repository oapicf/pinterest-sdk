#tag Class
Protected Class RespondToInviteResultItem

	#tag Property, Flags = &h0
		Escapedexception As OpenAPIClient.Models.InviteExceptionResponse
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
		#tag EndNote
		invite As OpenAPIClient.Models.BaseInviteDataResponse
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
			Name="Escapedexception"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="InviteExceptionResponse"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="invite"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BaseInviteDataResponse"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


