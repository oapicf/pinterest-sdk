#tag Class
Protected Class AdGroupCommonOptimizationGoalMetadata

	#tag Property, Flags = &h0
		conversion_tag_v3_goal_metadata As OpenAPIClient.Models.OptimizationGoalMetadataConversionTagV3GoalMetadata
	#tag EndProperty


	#tag Property, Flags = &h0
		frequency_goal_metadata As OpenAPIClient.Models.OptimizationGoalMetadataFrequencyGoalMetadata
	#tag EndProperty


	#tag Property, Flags = &h0
		scrollup_goal_metadata As OpenAPIClient.Models.OptimizationGoalMetadataScrollupGoalMetadata
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
			Name="conversion_tag_v3_goal_metadata"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OptimizationGoalMetadataConversionTagV3GoalMetadata"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="frequency_goal_metadata"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OptimizationGoalMetadataFrequencyGoalMetadata"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="scrollup_goal_metadata"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OptimizationGoalMetadataScrollupGoalMetadata"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


