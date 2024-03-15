#tag Class
Protected Class CatalogsFeedProcessingResult

	#tag Property, Flags = &h0
		created_at As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		updated_at As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		ingestion_details As OpenAPIClient.Models.CatalogsFeedIngestionDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		product_counts As OpenAPIClient.Models.CatalogsFeedProductCounts
	#tag EndProperty


	#tag Property, Flags = &h0
		validation_details As OpenAPIClient.Models.CatalogsFeedValidationDetails
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
			Name="created_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="updated_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ingestion_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsFeedIngestionDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsFeedProcessingStatus"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="product_counts"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsFeedProductCounts"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="validation_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsFeedValidationDetails"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


