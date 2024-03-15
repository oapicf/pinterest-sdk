#tag Class
Protected Class KeywordsRequest

	#tag Property, Flags = &h0
		#tag Note
			Keyword JSON array. Each array element has 3 fields
		#tag EndNote
		keywords() As OpenAPIClient.Models.KeywordsCommon
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Keyword parent entity ID (advertiser, campaign, ad group).
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
			Name="keywords"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="KeywordsCommon"
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


