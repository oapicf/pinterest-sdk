#tag Class
Protected Class AdvancedAuctionItemsSubmitDeleteRecord

	#tag Property, Flags = &h0
		country As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
		#tag EndNote
		errors() As OpenAPIClient.Models.AdvancedAuctionOperationError
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The catalog retail item id in the merchant namespace
		#tag EndNote
		item_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		language As String
	#tag EndProperty


	#tag Property, Flags = &h0
		operation As String
	#tag EndProperty


    #tag Enum, Name = OperationEnum, Type = Integer, Flags = &h0
        
        Delete
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function OperationEnumToString(value As OperationEnum) As String
		  Select Case value
		    
		    Case OperationEnum.Delete
		      Return "DELETE"
		    
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
			Name="country"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Country"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="errors"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdvancedAuctionOperationError"
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
			Name="language"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Language"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


