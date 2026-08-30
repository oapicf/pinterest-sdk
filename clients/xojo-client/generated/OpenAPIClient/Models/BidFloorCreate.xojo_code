#tag Class
Protected Class BidFloorCreate

	#tag Property, Flags = &h0
		#tag Note
			List of bid floor specifications.
		#tag EndNote
		bid_floor_specs() As OpenAPIClient.Models.BidFloorSpec
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ad group targeting specification defining the ad group target audience.
		#tag EndNote
		targeting_spec As OpenAPIClient.Models.TargetingSpecOptimal
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
			Name="bid_floor_specs"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BidFloorSpec"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="targeting_spec"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingSpecOptimal"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


