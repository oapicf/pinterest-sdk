#tag Class
Protected Class TrendingKeyword

	#tag Property, Flags = &h0
		demographics As OpenAPIClient.Models.TrendingKeywordDemographics
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Indicates whether the keyword has a prediction available for the next 90 days. This field is only applicable when `include_prediction` query parameter is set to `true`. By default, the value is `false` and no prediction data is included in the response.
		#tag EndNote
		has_prediction As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The keyword that is trending.
		#tag EndNote
		keyword As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The month-over-month percent change in search volume for this keyword. For example, a value of "400" would represent a 400% increase in searches in the last 30 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
		#tag EndNote
		pct_growth_mom As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The week-over-week percent change in search volume for this keyword. For example, a value of "50" would represent a 50% increase in searches in the last seven days compared to the week prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
		#tag EndNote
		pct_growth_wow As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The year-over-year percent change in search volume for this keyword. For example, a value of "-5" would represent a 5% decrease in searches in the last 365 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
		#tag EndNote
		pct_growth_yoy As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months. These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical `time_series`, normalization is applied independently to the predicted time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative predicted volume between keywords.  **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2024-01-07` would include predicted searches for the week ending on `2024-01-07`.
		#tag EndNote
		predicted_time_series As Xoson.O.OptionalPredictedTimeSeries
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A sequence of weekly observations of the relative search volume for this keyword over the past year. These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative volume between keywords.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2023-10-31` would include searches that happened between `2023-10-25` and `2023-10-31`.
		#tag EndNote
		time_series As Xoson.O.OptionalTimeSeries
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
			Type="TrendingKeywordDemographics"
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
			Name="keyword"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pct_growth_mom"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pct_growth_wow"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pct_growth_yoy"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="predicted_time_series"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PredictedTimeSeries"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="time_series"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TimeSeries"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


