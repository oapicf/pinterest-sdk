#tag Class
Protected Class AdsAnalyticsMetricsFilter

	#tag Property, Flags = &h0
		field As String
	#tag EndProperty


	#tag Property, Flags = &h0
		operator As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of values for filtering
		#tag EndNote
		values() As Double
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
			Name="field"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdsAnalyticsFilterColumn"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="operator"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdsAnalyticsFilterOperator"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="values"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


