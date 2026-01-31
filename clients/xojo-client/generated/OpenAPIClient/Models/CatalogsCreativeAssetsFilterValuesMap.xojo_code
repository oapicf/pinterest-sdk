#tag Class
Protected Class CatalogsCreativeAssetsFilterValuesMap

	#tag Property, Flags = &h0
		custom_label_0() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		custom_label_1() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		custom_label_2() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		custom_label_3() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		custom_label_4() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		google_product_category_0() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		google_product_category_1() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		google_product_category_2() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		google_product_category_3() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		google_product_category_4() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		google_product_category_5() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		google_product_category_6() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		media_type() As String
	#tag EndProperty


    #tag Enum, Name = Media_typeEnum, Type = Integer, Flags = &h0
        
        Image
        Video
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Media_typeEnumToString(value As Media_typeEnum) As String
		  Select Case value
		    
		    Case Media_typeEnum.Image
		      Return "IMAGE"
		    Case Media_typeEnum.Video
		      Return "VIDEO"
		    
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
			Name="custom_label_0"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="custom_label_1"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="custom_label_2"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="custom_label_3"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="custom_label_4"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="google_product_category_0"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="google_product_category_1"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="google_product_category_2"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="google_product_category_3"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="google_product_category_4"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="google_product_category_5"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="google_product_category_6"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


