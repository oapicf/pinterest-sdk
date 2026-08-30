#tag Class
Protected Class TargetingTemplateUpdateRequestReadOrUpdate

	#tag Property, Flags = &h0
		#tag Note
			Targeting template ID
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		operation_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			targeting profile attributes
		#tag EndNote
		targeting_attributes As OpenAPIClient.Models.TargetingSpecOptimal
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
		#tag ViewProperty
			Name="targeting_attributes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingSpecOptimal"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


