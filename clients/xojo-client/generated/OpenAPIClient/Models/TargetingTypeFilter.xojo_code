#tag Class
Protected Class TargetingTypeFilter

	#tag Property, Flags = &h0
		#tag Note
			List of targeting types. Requires `level` to be a value ending in `_TARGETING`. ["AGE_BUCKET_AND_GENDER"] is in BETA and not yet available to all users.
		#tag EndNote
		targeting_types() As AdsAnalyticsTargetingType
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
			Name="targeting_types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdsAnalyticsTargetingType"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


