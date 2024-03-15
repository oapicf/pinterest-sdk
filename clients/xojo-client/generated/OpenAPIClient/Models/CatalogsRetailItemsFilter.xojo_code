#tag Class
Protected Class CatalogsRetailItemsFilter

	#tag Property, Flags = &h0
		catalog_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		item_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
		#tag EndNote
		catalog_id As Xoson.O.OptionalString
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
			Name="item_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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


