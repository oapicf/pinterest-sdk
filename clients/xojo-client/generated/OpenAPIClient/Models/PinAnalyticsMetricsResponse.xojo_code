#tag Class
Protected Class PinAnalyticsMetricsResponse

	#tag Property, Flags = &h0
		#tag Note
			The lifetime metric name and value.
		#tag EndNote
		lifetime_metrics As Dictionary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Array with the requested daily metric records
		#tag EndNote
		daily_metrics() As OpenAPIClient.Models.PinAnalyticsMetricsResponseDailyMetricsInner
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The metric name and value over the requested period for each requested metric
		#tag EndNote
		summary_metrics As Dictionary
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
			Name="lifetime_metrics"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="daily_metrics"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PinAnalyticsMetricsResponseDailyMetricsInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="summary_metrics"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


