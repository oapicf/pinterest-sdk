#tag Class
Protected Class BillingProfilesResponse

	#tag Property, Flags = &h0
		#tag Note
			Billing ID.
		#tag EndNote
		id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Type of the card.
		#tag EndNote
		card_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Status of the billing.
		#tag EndNote
		status As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Advertiser ID of the billing.
		#tag EndNote
		advertiser_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Brand of the payment method.
		#tag EndNote
		payment_method_brand As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = Card_typeEnum, Type = Integer, Flags = &h0
        
        Unknown
        Visa
        Mastercard
        AmericanExpress
        Discover
        Elo
        
    #tag EndEnum

    #tag Enum, Name = StatusEnum, Type = Integer, Flags = &h0
        
        Unspecified
        Valid
        Invalid
        Pending
        Deleted
        Secondary
        PendingSecondary
        
    #tag EndEnum

    #tag Enum, Name = Payment_method_brandEnum, Type = Integer, Flags = &h0
        
        Unknown
        Visa
        Mastercard
        AmericanExpress
        Discover
        Sofort
        DinersClub
        Elo
        CarteBancaire
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Card_typeEnumToString(value As Card_typeEnum) As String
		  Select Case value
		    
		    Case Card_typeEnum.Unknown
		      Return "UNKNOWN"
		    Case Card_typeEnum.Visa
		      Return "VISA"
		    Case Card_typeEnum.Mastercard
		      Return "MASTERCARD"
		    Case Card_typeEnum.AmericanExpress
		      Return "AMERICAN_EXPRESS"
		    Case Card_typeEnum.Discover
		      Return "DISCOVER"
		    Case Card_typeEnum.Elo
		      Return "ELO"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function StatusEnumToString(value As StatusEnum) As String
		  Select Case value
		    
		    Case StatusEnum.Unspecified
		      Return "UNSPECIFIED"
		    Case StatusEnum.Valid
		      Return "VALID"
		    Case StatusEnum.Invalid
		      Return "INVALID"
		    Case StatusEnum.Pending
		      Return "PENDING"
		    Case StatusEnum.Deleted
		      Return "DELETED"
		    Case StatusEnum.Secondary
		      Return "SECONDARY"
		    Case StatusEnum.PendingSecondary
		      Return "PENDING_SECONDARY"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Payment_method_brandEnumToString(value As Payment_method_brandEnum) As String
		  Select Case value
		    
		    Case Payment_method_brandEnum.Unknown
		      Return "UNKNOWN"
		    Case Payment_method_brandEnum.Visa
		      Return "VISA"
		    Case Payment_method_brandEnum.Mastercard
		      Return "MASTERCARD"
		    Case Payment_method_brandEnum.AmericanExpress
		      Return "AMERICAN_EXPRESS"
		    Case Payment_method_brandEnum.Discover
		      Return "DISCOVER"
		    Case Payment_method_brandEnum.Sofort
		      Return "SOFORT"
		    Case Payment_method_brandEnum.DinersClub
		      Return "DINERS_CLUB"
		    Case Payment_method_brandEnum.Elo
		      Return "ELO"
		    Case Payment_method_brandEnum.CarteBancaire
		      Return "CARTE_BANCAIRE"
		    
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="advertiser_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


