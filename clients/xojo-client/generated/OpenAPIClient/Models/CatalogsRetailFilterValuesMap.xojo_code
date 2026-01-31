#tag Class
Protected Class CatalogsRetailFilterValuesMap

	#tag Property, Flags = &h0
		ad_image_tags() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		ad_video_tags() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		availability() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		brand() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		condition() As String
	#tag EndProperty


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
		gender() As String
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


	#tag Property, Flags = &h0
		product_type_0() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		product_type_1() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		product_type_2() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		product_type_3() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		product_type_4() As String
	#tag EndProperty


    #tag Enum, Name = AvailabilityEnum, Type = Integer, Flags = &h0
        
        InStock
        OutOfStock
        Preorder
        Unavailable
        
    #tag EndEnum

    #tag Enum, Name = ConditionEnum, Type = Integer, Flags = &h0
        
        Escapednew
        Used
        Refurbished
        
    #tag EndEnum

    #tag Enum, Name = GenderEnum, Type = Integer, Flags = &h0
        
        Female
        Male
        Unisex
        
    #tag EndEnum

    #tag Enum, Name = Media_typeEnum, Type = Integer, Flags = &h0
        
        Image
        Video
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function AvailabilityEnumToString(value As AvailabilityEnum) As String
		  Select Case value
		    
		    Case AvailabilityEnum.InStock
		      Return "IN_STOCK"
		    Case AvailabilityEnum.OutOfStock
		      Return "OUT_OF_STOCK"
		    Case AvailabilityEnum.Preorder
		      Return "PREORDER"
		    Case AvailabilityEnum.Unavailable
		      Return "UNAVAILABLE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function ConditionEnumToString(value As ConditionEnum) As String
		  Select Case value
		    
		    Case ConditionEnum.Escapednew
		      Return "NEW"
		    Case ConditionEnum.Used
		      Return "USED"
		    Case ConditionEnum.Refurbished
		      Return "REFURBISHED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function GenderEnumToString(value As GenderEnum) As String
		  Select Case value
		    
		    Case GenderEnum.Female
		      Return "FEMALE"
		    Case GenderEnum.Male
		      Return "MALE"
		    Case GenderEnum.Unisex
		      Return "UNISEX"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
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
			Name="ad_image_tags"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ad_video_tags"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="brand"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
		#tag ViewProperty
			Name="product_type_0"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="product_type_1"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="product_type_2"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="product_type_3"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="product_type_4"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


