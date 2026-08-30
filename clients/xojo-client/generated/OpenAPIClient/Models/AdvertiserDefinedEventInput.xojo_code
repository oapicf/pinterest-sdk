#tag Class
Protected Class AdvertiserDefinedEventInput

	#tag Property, Flags = &h0
		#tag Note
			Pinterest standard event type to map this custom event to for campaign optimization and reporting
		#tag EndNote
		mapped_conversion_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Raw string name of the event
		#tag EndNote
		name As String
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
			Name="mapped_conversion_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdvertiserDefinedEventMappingType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


