#tag Class
Protected Class SSIOCreateInsertionOrderRequest

	#tag Property, Flags = &h0
		#tag Note
			Starting date of time period. Format: YYYY-MM-DD
		#tag EndNote
		start_date As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			End date of time period. Format: YYYY-MM-DD
		#tag EndNote
		end_date As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The po number
		#tag EndNote
		po_number As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			If Budget order line, the budget amount.
		#tag EndNote
		budget_amount As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The billing contact first name
		#tag EndNote
		billing_contact_firstname As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The billing contact last name
		#tag EndNote
		billing_contact_lastname As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The billing contact email
		#tag EndNote
		billing_contact_email As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The media contact first name
		#tag EndNote
		media_contact_firstname As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The media contact last name
		#tag EndNote
		media_contact_lastname As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The media contact email
		#tag EndNote
		media_contact_email As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			URL link for agency
		#tag EndNote
		agency_link As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The email of user submitting the insertion order
		#tag EndNote
		user_email As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The UTC timestamp (to the nearest sec) of when terms were accepted
		#tag EndNote
		accepted_terms_time As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The pmp id
		#tag EndNote
		pmp_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The order name
		#tag EndNote
		order_name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Type can be Budget or Perpetual
		#tag EndNote
		order_line_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The SFDC id for the terms
		#tag EndNote
		accepted_terms_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The bill-to company id
		#tag EndNote
		billto_company_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The bill-to business address id
		#tag EndNote
		billto_business_address_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The bill-to billing address id
		#tag EndNote
		billto_billing_address_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			If Ongoing (perpetual) order line, the estimated monthly spend
		#tag EndNote
		estimated_monthly_spend As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		currency_info As String
	#tag EndProperty


    #tag Enum, Name = Order_line_typeEnum, Type = Integer, Flags = &h0
        
        Budget
        Perpetuals
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Order_line_typeEnumToString(value As Order_line_typeEnum) As String
		  Select Case value
		    
		    Case Order_line_typeEnum.Budget
		      Return "BUDGET"
		    Case Order_line_typeEnum.Perpetuals
		      Return "PERPETUALS"
		    
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
			Name="start_date"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="end_date"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="po_number"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="budget_amount"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="billing_contact_firstname"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="billing_contact_lastname"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="billing_contact_email"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="media_contact_firstname"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="media_contact_lastname"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="media_contact_email"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="agency_link"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="user_email"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="accepted_terms_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pmp_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="order_name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="accepted_terms_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="billto_company_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="billto_business_address_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="billto_billing_address_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="estimated_monthly_spend"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="currency_info"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Currency"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


