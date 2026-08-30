#tag Class
Protected Class TrendingTopic

	#tag Property, Flags = &h0
		#tag Note
			Description of the trending topic
		#tag EndNote
		description As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Unique identifier for the trending topic
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Month-over-month growth percentage
		#tag EndNote
		percent_growth_mom As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Array of pin images related to this trend (up to 6)
		#tag EndNote
		pins() As OpenAPIClient.Models.TrendingPin
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of related interest categories
		#tag EndNote
		related_interests() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of related search terms
		#tag EndNote
		related_searches() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Time series data showing trend values over time, with dates as keys and values as numeric
		#tag EndNote
		time_series As Dictionary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Title of the trending topic
		#tag EndNote
		title As String
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
			Name="description"
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
			Name="percent_growth_mom"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pins"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TrendingPin"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="related_interests"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="related_searches"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="time_series"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="title"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


