#tag Class
Protected Class UserBusinessRoleBinding

	#tag Property, Flags = &h0
		assets_summary As OpenAPIClient.Models.BusinessMemberAssetsSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
		#tag EndNote
		business_roles() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metadata for the business that created the business relationship.
		#tag EndNote
		created_by_business As OpenAPIClient.Models.BusinessAccessUserSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metadata for the user that created the business relationship.
		#tag EndNote
		created_by_user As OpenAPIClient.Models.BusinessAccessUserSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The time the business relationship was created. Returned in milliseconds.
		#tag EndNote
		created_time As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Unique identifier of the business member/business partner/employer.
		#tag EndNote
		id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			This field is only relevant when business_role="PARTNER". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.
		#tag EndNote
		is_shared_partner As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metadata for the business member/business partner/employer.
		#tag EndNote
		user As OpenAPIClient.Models.BusinessAccessUserSummary
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
			Name="assets_summary"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BusinessMemberAssetsSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="business_roles"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="created_by_business"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BusinessAccessUserSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="created_by_user"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BusinessAccessUserSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="created_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
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
			Name="is_shared_partner"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="user"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BusinessAccessUserSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


