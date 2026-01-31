#tag Class
Protected Class EventQualityScore

	#tag Property, Flags = &h0
		ingestion_source As String
	#tag EndProperty


	#tag Property, Flags = &h0
		lookback_period As String
	#tag EndProperty


	#tag Property, Flags = &h0
		overall_status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		quality_components As OpenAPIClient.Models.QualityComponents
	#tag EndProperty


	#tag Property, Flags = &h0
		source_platform As String
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
			Name="ingestion_source"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="IngestionSourceOptions"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lookback_period"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LookbackPeriodOptions"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="overall_status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OverallStatusOptions"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="quality_components"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="QualityComponents"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="source_platform"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SourcePlatformOptions"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


