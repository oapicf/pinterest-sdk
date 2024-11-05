#tag Class
Protected Class CreateAssetAccessRequestResponse

	#tag Property, Flags = &h0
		#tag Note
			A list of errors associated with the asset access requests. Will be returned if there is an error.
		#tag EndNote
		exceptions() As OpenAPIClient.Models.CreateAssetAccessRequestErrorMessageInner
	#tag EndProperty


	#tag Property, Flags = &h0
		invites As Dictionary
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
			Name="exceptions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateAssetAccessRequestErrorMessageInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="invites"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


