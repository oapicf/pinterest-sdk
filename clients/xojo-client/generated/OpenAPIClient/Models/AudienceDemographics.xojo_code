#tag Class
Protected Class AudienceDemographics

	#tag Property, Flags = &h0
		#tag Note
			Ages distribution.
		#tag EndNote
		ages() As OpenAPIClient.Models.AudienceDemographicValue
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Gender distribution.
		#tag EndNote
		genders() As OpenAPIClient.Models.AudienceDemographicValue
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Device usage distribution.
		#tag EndNote
		devices() As OpenAPIClient.Models.AudienceDemographicValue
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Geographic metro area distribution.
		#tag EndNote
		metros() As OpenAPIClient.Models.AudienceDemographicValue
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Country area distribution.
		#tag EndNote
		countries() As OpenAPIClient.Models.AudienceDemographicValue
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
			Name="ages"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AudienceDemographicValue"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="genders"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AudienceDemographicValue"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="devices"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AudienceDemographicValue"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="metros"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AudienceDemographicValue"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="countries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AudienceDemographicValue"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


