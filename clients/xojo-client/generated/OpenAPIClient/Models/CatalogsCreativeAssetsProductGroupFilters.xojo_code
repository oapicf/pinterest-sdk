#tag Class
Protected Class CatalogsCreativeAssetsProductGroupFilters

	#tag Property, Flags = &h0
		any_of() As OpenAPIClient.Models.CatalogsCreativeAssetsProductGroupFilterKeys
	#tag EndProperty


	#tag Property, Flags = &h0
		all_of() As OpenAPIClient.Models.CatalogsCreativeAssetsProductGroupFilterKeys
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
			Name="any_of"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsCreativeAssetsProductGroupFilterKeys"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="all_of"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsCreativeAssetsProductGroupFilterKeys"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


