#tag Class
Protected Class FeaturedTrend

	#tag Property, Flags = &h0
		#tag Note
			The main interest category
		#tag EndNote
		interest As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Market code (e.g., 'US', 'UK', etc.)
		#tag EndNote
		market As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of trending topics within this interest category
		#tag EndNote
		trends() As OpenAPIClient.Models.TrendingTopic
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
			Name="interest"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="InterestsEnum"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="market"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ProductCategoryRegion"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="trends"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TrendingTopic"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


