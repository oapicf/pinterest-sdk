#tag Class
Protected Class CatalogsProduct

	#tag Property, Flags = &h0
		metadata As OpenAPIClient.Models.CatalogsProductMetadata
	#tag EndProperty


	#tag Property, Flags = &h0
		pin As OpenAPIClient.Models.Pin
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
			Name="metadata"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductMetadata"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pin"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Pin"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


