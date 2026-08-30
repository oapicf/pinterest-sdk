#tag Class
Protected Class LocalInventoryOperationResult

	#tag Property, Flags = &h0
		#tag Note
			Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
		#tag EndNote
		errors() As OpenAPIClient.Models.SupplementalItemValidationEvent
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Catalog item id in the merchant namespace
		#tag EndNote
		item_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Status of the item processing record
		#tag EndNote
		status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Store code for the local inventory item
		#tag EndNote
		store_code As String
	#tag EndProperty


	#tag Property, Flags = &h0
		supplemental_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Array with the validation warnings for the item processing record
		#tag EndNote
		warnings() As OpenAPIClient.Models.SupplementalItemValidationEvent
	#tag EndProperty


    #tag Enum, Name = Supplemental_typeEnum, Type = Integer, Flags = &h0
        
        LocalInventory
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Supplemental_typeEnumToString(value As Supplemental_typeEnum) As String
		  Select Case value
		    
		    Case Supplemental_typeEnum.LocalInventory
		      Return "LOCAL_INVENTORY"
		    
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
			Type="SupplementalItemValidationEvent"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="item_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SupplementalItemProcessingStatus"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="store_code"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="warnings"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SupplementalItemValidationEvent"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


