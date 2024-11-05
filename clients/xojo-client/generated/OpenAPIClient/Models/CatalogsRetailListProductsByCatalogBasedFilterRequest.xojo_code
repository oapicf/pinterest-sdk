#tag Class
Protected Class CatalogsRetailListProductsByCatalogBasedFilterRequest

	#tag Property, Flags = &h0
		#tag Note
			Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
		#tag EndNote
		catalog_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Catalog id pertaining to the retail product group.
		#tag EndNote
		catalog_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		filters As OpenAPIClient.Models.CatalogsProductGroupFilters
	#tag EndProperty


	#tag Property, Flags = &h0
		country As String
	#tag EndProperty


	#tag Property, Flags = &h0
		locale As String
	#tag EndProperty


    #tag Enum, Name = Catalog_typeEnum, Type = Integer, Flags = &h0
        
        Retail
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Catalog_typeEnumToString(value As Catalog_typeEnum) As String
		  Select Case value
		    
		    Case Catalog_typeEnum.Retail
		      Return "RETAIL"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod


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
			Name="catalog_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="filters"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupFilters"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="country"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Country"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="locale"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsLocale"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


