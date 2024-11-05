#tag Class
Protected Class CatalogsCreativeAssetsFeed

	#tag Property, Flags = &h0
		created_at As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		updated_at As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		format As String
	#tag EndProperty


	#tag Property, Flags = &h0
		catalog_type As String
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
		status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		default_currency As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The locale used within a feed for product descriptions.
		#tag EndNote
		default_locale As String
	#tag EndProperty


	#tag Property, Flags = &h0
		default_country As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
		#tag EndNote
		catalog_id As String
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
			Name="catalog_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsType"
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
			Name="status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsStatus"
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
			Name="default_locale"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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


