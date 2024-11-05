#tag Class
Protected Class DeletePartnerAssetAccessBodyAccessesInner

	#tag Property, Flags = &h0
		#tag Note
			Unique identifier of a business partner to update asset access to.
		#tag EndNote
		partner_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Unique identifier of the business asset.
		#tag EndNote
		asset_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
		#tag EndNote
		partner_type As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = Partner_typeEnum, Type = Integer, Flags = &h0
        
        Internal
        External
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Partner_typeEnumToString(value As Partner_typeEnum) As String
		  Select Case value
		    
		    Case Partner_typeEnum.Internal
		      Return "INTERNAL"
		    Case Partner_typeEnum.External
		      Return "EXTERNAL"
		    
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
			Name="partner_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="asset_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


