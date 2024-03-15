#tag Class
Protected Class TopVideoPinsAnalyticsResponse

	#tag Property, Flags = &h0
		date_availability As OpenAPIClient.Models.TopPinsAnalyticsResponseDateAvailability
	#tag EndProperty


	#tag Property, Flags = &h0
		pins() As OpenAPIClient.Models.TopVideoPinsAnalyticsResponsePinsInner
	#tag EndProperty


	#tag Property, Flags = &h0
		sort_by As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = Sort_byEnum, Type = Integer, Flags = &h0
        
        Save
        Impression
        OutboundClick
        VideoMrcView
        VideoAvgWatchTime
        VideoV50WatchTime
        Quartile95PercentView
        Video10sView
        VideoStart
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Sort_byEnumToString(value As Sort_byEnum) As String
		  Select Case value
		    
		    Case Sort_byEnum.Save
		      Return "SAVE"
		    Case Sort_byEnum.Impression
		      Return "IMPRESSION"
		    Case Sort_byEnum.OutboundClick
		      Return "OUTBOUND_CLICK"
		    Case Sort_byEnum.VideoMrcView
		      Return "VIDEO_MRC_VIEW"
		    Case Sort_byEnum.VideoAvgWatchTime
		      Return "VIDEO_AVG_WATCH_TIME"
		    Case Sort_byEnum.VideoV50WatchTime
		      Return "VIDEO_V50_WATCH_TIME"
		    Case Sort_byEnum.Quartile95PercentView
		      Return "QUARTILE_95_PERCENT_VIEW"
		    Case Sort_byEnum.Video10sView
		      Return "VIDEO_10S_VIEW"
		    Case Sort_byEnum.VideoStart
		      Return "VIDEO_START"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod


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
			Type="TopPinsAnalyticsResponseDateAvailability"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pins"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TopVideoPinsAnalyticsResponsePinsInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


