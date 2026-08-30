#tag Class
Protected Class Promotion

	#tag Property, Flags = &h0
		#tag Note
			The Ad Account ID that this promotion belongs to.
		#tag EndNote
		ad_account_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		discount_status As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
		#tag EndNote
		end_time As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
		#tag EndNote
		external_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Promotion ID
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
		#tag EndNote
		platform_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Code that can be used to redeem a promotion.
		#tag EndNote
		promotion_code As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
		#tag EndNote
		promotion_custom_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Internal name for the promotion.
		#tag EndNote
		promotion_title As String
	#tag EndProperty


	#tag Property, Flags = &h0
		promotion_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
		#tag EndNote
		start_time As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		status As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			List of values to be inserted in the promotion type-specific template.
		#tag EndNote
		template_values() As OpenAPIClient.Models.PromotionTemplateValue
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
			Name="ad_account_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="discount_status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="DiscountStatus"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="end_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="external_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="platform_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="promotion_code"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="promotion_custom_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="promotion_title"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="promotion_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PromotionType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="start_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="EntityStatus"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="template_values"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PromotionTemplateValue"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


