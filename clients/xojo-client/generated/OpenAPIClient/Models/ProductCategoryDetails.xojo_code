#tag Class
Protected Class ProductCategoryDetails

	#tag Property, Flags = &h0
		demographics As OpenAPIClient.Models.ProductCategoriesDemographic
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			    Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.
		#tag EndNote
		has_prediction As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		metrics_highlights As OpenAPIClient.Models.ProductCategoriesMetricsHighlights
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			    A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.
		#tag EndNote
		predicted_time_series As Dictionary
	#tag EndProperty


	#tag Property, Flags = &h0
		product_category As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Related search terms for this product category
		#tag EndNote
		related_searches() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Time series data showing trend values over time, indexed between 0 and 100
		#tag EndNote
		time_series As Dictionary
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
			Name="demographics"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ProductCategoriesDemographic"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="has_prediction"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="metrics_highlights"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ProductCategoriesMetricsHighlights"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="predicted_time_series"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="product_category"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ProductCategoryEnum"
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
	#tag EndViewBehavior
End Class
#tag EndClass


