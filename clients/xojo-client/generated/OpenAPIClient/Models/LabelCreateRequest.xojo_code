#tag Class
Protected Class LabelCreateRequest

	#tag Property, Flags = &h0
		#tag Note
			Labels that you are applying to the campaign.
		#tag EndNote
		labels() As OpenAPIClient.Models.LabelCreateRequestLabelsInner
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
		#tag EndNote
		parent_id As String
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
			Name="labels"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LabelCreateRequestLabelsInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="parent_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


