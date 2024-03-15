#tag Class
Protected Class CreateMMMReportRequest

	#tag Property, Flags = &h0
		#tag Note
			Name of the Marketing Mix Modeling (MMM) report
		#tag EndNote
		report_name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metric report start date (UTC). Format: YYYY-MM-DD
		#tag EndNote
		start_date As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metric report end date (UTC). Format: YYYY-MM-DD
		#tag EndNote
		end_date As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
		#tag EndNote
		granularity As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Level of the report
		#tag EndNote
		level As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of targeting types
		#tag EndNote
		targeting_types() As MMMReportingTargetingType
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metric and entity columns
		#tag EndNote
		columns() As MMMReportingColumn
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A List of countries for filtering
		#tag EndNote
		countries() As TargetingAdvertiserCountry
	#tag EndProperty


    #tag Enum, Name = GranularityEnum, Type = Integer, Flags = &h0
        
        Day
        Week
        
    #tag EndEnum

    #tag Enum, Name = LevelEnum, Type = Integer, Flags = &h0
        
        CampaignTargeting
        AdGroupTargeting
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function GranularityEnumToString(value As GranularityEnum) As String
		  Select Case value
		    
		    Case GranularityEnum.Day
		      Return "DAY"
		    Case GranularityEnum.Week
		      Return "WEEK"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function LevelEnumToString(value As LevelEnum) As String
		  Select Case value
		    
		    Case LevelEnum.CampaignTargeting
		      Return "CAMPAIGN_TARGETING"
		    Case LevelEnum.AdGroupTargeting
		      Return "AD_GROUP_TARGETING"
		    
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
			Name="report_name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="start_date"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="end_date"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="targeting_types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MMMReportingTargetingType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="columns"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MMMReportingColumn"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="countries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingAdvertiserCountry"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


