#tag Class
Protected Class KeywordMetricsResponse

	#tag Property, Flags = &h0
		#tag Note
			Keyword name, e.g., "keyword":"fashion outfits"
		#tag EndNote
		keyword As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		metrics As OpenAPIClient.Models.KeywordMetrics
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
			Name="keyword"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="metrics"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="KeywordMetrics"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


