#tag Class
Protected Class FeedsCreateRequest

	#tag Property, Flags = &h0
		default_currency As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A human-friendly name associated to a given feed.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		format As String
	#tag EndProperty


	#tag Property, Flags = &h0
		default_locale As OpenAPIClient.Models.CatalogsFeedsCreateRequestDefaultLocale
	#tag EndProperty


	#tag Property, Flags = &h0
		credentials As OpenAPIClient.Models.CatalogsFeedCredentials
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
		#tag EndNote
		location As String
	#tag EndProperty


	#tag Property, Flags = &h0
		preferred_processing_schedule As OpenAPIClient.Models.CatalogsFeedProcessingSchedule
	#tag EndProperty


	#tag Property, Flags = &h0
		catalog_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		default_country As String
	#tag EndProperty


	#tag Property, Flags = &h0
		default_availability As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		status As OpenAPIClient.Models.CatalogsStatus
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.
		#tag EndNote
		catalog_id As Xoson.O.OptionalString
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
			Name="default_currency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="NullableCurrency"
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
		#tag ViewProperty
			Name="format"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsFormat"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="default_locale"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsFeedsCreateRequestDefaultLocale"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="credentials"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsFeedCredentials"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="location"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="preferred_processing_schedule"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsFeedProcessingSchedule"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="catalog_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="default_country"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Country"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="default_availability"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ProductAvailabilityType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsStatus"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="catalog_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


