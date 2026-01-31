#tag Class
Protected Class LabelsResponse

	#tag Property, Flags = &h0
		#tag Note
			Labels that were not successfully applied.
		#tag EndNote
		errors() As OpenAPIClient.Models.LabelError
	#tag EndProperty


	#tag Property, Flags = &h0
		labels() As OpenAPIClient.Models.Label
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
			Name="errors"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LabelError"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="labels"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Label"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


