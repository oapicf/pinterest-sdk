#tag Class
Protected Class CatalogsRetailProductGroupProductCounts

	#tag Property, Flags = &h0
		catalog_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		in_stock As Double
	#tag EndProperty


	#tag Property, Flags = &h0
		out_of_stock As Double
	#tag EndProperty


	#tag Property, Flags = &h0
		preorder As Double
	#tag EndProperty


	#tag Property, Flags = &h0
		total As Double
	#tag EndProperty


	#tag Property, Flags = &h0
		videos As Xoson.O.OptionalDouble
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
			Name="in_stock"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="out_of_stock"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="preorder"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="total"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="videos"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


