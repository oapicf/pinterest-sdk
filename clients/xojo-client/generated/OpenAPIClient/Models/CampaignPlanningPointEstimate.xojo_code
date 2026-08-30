#tag Class
Protected Class CampaignPlanningPointEstimate

	#tag Property, Flags = &h0
		#tag Note
			The budget value of the point.
		#tag EndNote
		budget As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Y value as a decimal.
		#tag EndNote
		double_y As Double
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The maximum Y value of the point.
		#tag EndNote
		max_y As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The minimum Y value of the point.
		#tag EndNote
		min_y As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The expected Y value of the point.
		#tag EndNote
		y As Integer
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
			Name="budget"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="double_y"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="max_y"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="min_y"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="y"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


