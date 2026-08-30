#tag Class
Protected Class TopVideoPinsAnalyticsResponse

	#tag Property, Flags = &h0
		date_availability As OpenAPIClient.Models.TopVideoPinsAnalyticsResponseDateAvailability
	#tag EndProperty


	#tag Property, Flags = &h0
		pins() As OpenAPIClient.Models.TopVideoPinsAnalyticsResponsePinsItems
	#tag EndProperty


	#tag Property, Flags = &h0
		sort_by As Xoson.O.OptionalString
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
			Name="date_availability"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TopVideoPinsAnalyticsResponseDateAvailability"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pins"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TopVideoPinsAnalyticsResponsePinsItems"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="sort_by"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TopVideoPinsSortBy"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


