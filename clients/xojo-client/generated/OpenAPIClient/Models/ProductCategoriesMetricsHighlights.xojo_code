#tag Class
Protected Class ProductCategoriesMetricsHighlights

	#tag Property, Flags = &h0
		#tag Note
			Engagement metric value
		#tag EndNote
		engagement As OpenAPIClient.Models.InnerProductCategoriesMetricsHighlights
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number of outbound clicks
		#tag EndNote
		outbound_clicks As OpenAPIClient.Models.InnerProductCategoriesMetricsHighlights
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Number of pin saves
		#tag EndNote
		pin_saves As OpenAPIClient.Models.InnerProductCategoriesMetricsHighlights
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
			Name="engagement"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="InnerProductCategoriesMetricsHighlights"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="outbound_clicks"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="InnerProductCategoriesMetricsHighlights"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pin_saves"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="InnerProductCategoriesMetricsHighlights"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


