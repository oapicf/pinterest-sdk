#tag Class
Protected Class CatalogsHotelItemErrorResponse

	#tag Property, Flags = &h0
		catalog_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Array with the errors for the item id requested
		#tag EndNote
		errors() As OpenAPIClient.Models.ItemValidationEvent
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The catalog hotel id in the merchant namespace
		#tag EndNote
		hotel_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Discriminator literal identifying this leaf inside an `ItemResponse` payload.
		#tag EndNote
		item_response_kind As String
	#tag EndProperty


    #tag Enum, Name = Catalog_typeEnum, Type = Integer, Flags = &h0
        
        Hotel
        
    #tag EndEnum

    #tag Enum, Name = Item_response_kindEnum, Type = Integer, Flags = &h0
        
        HotelItemError
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Catalog_typeEnumToString(value As Catalog_typeEnum) As String
		  Select Case value
		    
		    Case Catalog_typeEnum.Hotel
		      Return "HOTEL"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Item_response_kindEnumToString(value As Item_response_kindEnum) As String
		  Select Case value
		    
		    Case Item_response_kindEnum.HotelItemError
		      Return "hotel_item_error"
		    
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
			Name="errors"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemValidationEvent"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="hotel_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


