#tag Class
Protected Class SSIOAccountResponse

	#tag Property, Flags = &h0
		#tag Note
			Advertiser eligible to create order lines
		#tag EndNote
		eligible As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Advertiser eligible to update order lines
		#tag EndNote
		can_edit As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			An array of Salesforce account information that includes address, io terms, etc.
		#tag EndNote
		billto_infos() As OpenAPIClient.Models.SSIOAccountItem
	#tag EndProperty


	#tag Property, Flags = &h0
		currency As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		pmp_names() As OpenAPIClient.Models.SSIOAccountPMPName
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Error indicator from Salesforce which could be "No Error"
		#tag EndNote
		error As Xoson.O.OptionalString
	#tag EndProperty





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
			Name="eligible"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="can_edit"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="billto_infos"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SSIOAccountItem"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="currency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pmp_names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SSIOAccountPMPName"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="error"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


