#tag Class
Protected Class ConversionDeletionRequestCreate

	#tag Property, Flags = &h0
		#tag Note
			Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
		#tag EndNote
		deletion_targets As OpenAPIClient.Models.ConversionDeletionRequestTargets
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
			Name="deletion_targets"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ConversionDeletionRequestTargets"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


