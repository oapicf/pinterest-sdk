#tag Class
Protected Class BidFloorSpec

	#tag Property, Flags = &h0
		countries() As Country
	#tag EndProperty


	#tag Property, Flags = &h0
		currency As String
	#tag EndProperty


	#tag Property, Flags = &h0
		objective_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		billable_event As String
	#tag EndProperty


	#tag Property, Flags = &h0
		optimization_goal_metadata As OpenAPIClient.Models.OptimizationGoalMetadata
	#tag EndProperty


	#tag Property, Flags = &h0
		creative_type As Xoson.O.OptionalString
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
			Name="countries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Country"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="currency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Currency"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="objective_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ObjectiveType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="billable_event"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ActionType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="optimization_goal_metadata"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OptimizationGoalMetadata"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="creative_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreativeType"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


