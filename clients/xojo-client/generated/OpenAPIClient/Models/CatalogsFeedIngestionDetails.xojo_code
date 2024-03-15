#tag Class
Protected Class CatalogsFeedIngestionDetails

	#tag Property, Flags = &h0
		errors As OpenAPIClient.Models.CatalogsFeedIngestionErrors
	#tag EndProperty


	#tag Property, Flags = &h0
		info As OpenAPIClient.Models.CatalogsFeedIngestionInfo
	#tag EndProperty


	#tag Property, Flags = &h0
		warnings As OpenAPIClient.Models.CatalogsFeedIngestionWarnings
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
			Name="errors"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsFeedIngestionErrors"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="info"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsFeedIngestionInfo"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="warnings"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsFeedIngestionWarnings"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


