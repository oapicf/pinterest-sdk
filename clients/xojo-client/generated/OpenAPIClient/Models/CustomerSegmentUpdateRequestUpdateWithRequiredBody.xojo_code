#tag Class
Protected Class CustomerSegmentUpdateRequestUpdateWithRequiredBody

	#tag Property, Flags = &h0
		#tag Note
			Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
		#tag EndNote
		audience_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Customer segment ID.
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		operation_type As String
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
			Name="audience_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="operation_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AudienceUpdateOperationType"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


