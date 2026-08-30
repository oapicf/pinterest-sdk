#tag Class
Protected Class CatalogsBaseFilterKeys

	#tag Property, Flags = &h0
		MIN_PRICE As OpenAPIClient.Models.CatalogsProductGroupPricingCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		MAX_PRICE As OpenAPIClient.Models.CatalogsProductGroupPricingCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		CURRENCY As OpenAPIClient.Models.CatalogsProductGroupCurrencyCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		ITEM_ID As OpenAPIClient.Models.CatalogsProductGroupMultipleStringCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		AVAILABILITY As OpenAPIClient.Models.CatalogsProductGroupMultipleStringCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		BRAND As OpenAPIClient.Models.CatalogsProductGroupMultipleStringCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		CONDITION As OpenAPIClient.Models.CatalogsProductGroupMultipleStringCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		CUSTOM_LABEL_0 As OpenAPIClient.Models.CatalogsProductGroupFilterOperatorTypeCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		CUSTOM_LABEL_1 As OpenAPIClient.Models.CatalogsProductGroupFilterOperatorTypeCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		CUSTOM_LABEL_2 As OpenAPIClient.Models.CatalogsProductGroupFilterOperatorTypeCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		CUSTOM_LABEL_3 As OpenAPIClient.Models.CatalogsProductGroupFilterOperatorTypeCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		CUSTOM_LABEL_4 As OpenAPIClient.Models.CatalogsProductGroupFilterOperatorTypeCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		ITEM_GROUP_ID As OpenAPIClient.Models.CatalogsProductGroupMultipleStringCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		GENDER As OpenAPIClient.Models.CatalogsProductGroupMultipleGenderCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		MEDIA_TYPE As OpenAPIClient.Models.CatalogsProductGroupMultipleMediaTypesCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		PRODUCT_TYPE_4 As OpenAPIClient.Models.CatalogsProductGroupMultipleStringListCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		PRODUCT_TYPE_3 As OpenAPIClient.Models.CatalogsProductGroupMultipleStringListCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		PRODUCT_TYPE_2 As OpenAPIClient.Models.CatalogsProductGroupMultipleStringListCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		PRODUCT_TYPE_1 As OpenAPIClient.Models.CatalogsProductGroupMultipleStringListCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		PRODUCT_TYPE_0 As OpenAPIClient.Models.CatalogsProductGroupMultipleStringListCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		GOOGLE_PRODUCT_CATEGORY_6 As OpenAPIClient.Models.CatalogsProductGroupMultipleStringListCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		GOOGLE_PRODUCT_CATEGORY_5 As OpenAPIClient.Models.CatalogsProductGroupMultipleStringListCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		GOOGLE_PRODUCT_CATEGORY_4 As OpenAPIClient.Models.CatalogsProductGroupMultipleStringListCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		GOOGLE_PRODUCT_CATEGORY_3 As OpenAPIClient.Models.CatalogsProductGroupMultipleStringListCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		GOOGLE_PRODUCT_CATEGORY_2 As OpenAPIClient.Models.CatalogsProductGroupMultipleStringListCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		GOOGLE_PRODUCT_CATEGORY_1 As OpenAPIClient.Models.CatalogsProductGroupMultipleStringListCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		GOOGLE_PRODUCT_CATEGORY_0 As OpenAPIClient.Models.CatalogsProductGroupMultipleStringListCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		CUSTOM_NUMBER_0 As OpenAPIClient.Models.CatalogsProductGroupUint32Criteria
	#tag EndProperty


	#tag Property, Flags = &h0
		CUSTOM_NUMBER_1 As OpenAPIClient.Models.CatalogsProductGroupUint32Criteria
	#tag EndProperty


	#tag Property, Flags = &h0
		CUSTOM_NUMBER_2 As OpenAPIClient.Models.CatalogsProductGroupUint32Criteria
	#tag EndProperty


	#tag Property, Flags = &h0
		CUSTOM_NUMBER_3 As OpenAPIClient.Models.CatalogsProductGroupUint32Criteria
	#tag EndProperty


	#tag Property, Flags = &h0
		CUSTOM_NUMBER_4 As OpenAPIClient.Models.CatalogsProductGroupUint32Criteria
	#tag EndProperty


	#tag Property, Flags = &h0
		TITLE_KEYWORDS As OpenAPIClient.Models.CatalogsProductGroupMultipleStringCriteria
	#tag EndProperty


	#tag Property, Flags = &h0
		PINTEREST_PRODUCT_CATEGORIES As OpenAPIClient.Models.CatalogsProductGroupMultiplePinterestProductCategoryCriteria
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
			Name="MIN_PRICE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupPricingCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="MAX_PRICE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupPricingCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="CURRENCY"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupCurrencyCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ITEM_ID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleStringCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="AVAILABILITY"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleStringCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="BRAND"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleStringCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="CONDITION"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleStringCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="CUSTOM_LABEL_0"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupFilterOperatorTypeCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="CUSTOM_LABEL_1"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupFilterOperatorTypeCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="CUSTOM_LABEL_2"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupFilterOperatorTypeCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="CUSTOM_LABEL_3"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupFilterOperatorTypeCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="CUSTOM_LABEL_4"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupFilterOperatorTypeCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ITEM_GROUP_ID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleStringCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="GENDER"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleGenderCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="MEDIA_TYPE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleMediaTypesCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PRODUCT_TYPE_4"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleStringListCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PRODUCT_TYPE_3"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleStringListCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PRODUCT_TYPE_2"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleStringListCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PRODUCT_TYPE_1"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleStringListCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PRODUCT_TYPE_0"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleStringListCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="GOOGLE_PRODUCT_CATEGORY_6"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleStringListCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="GOOGLE_PRODUCT_CATEGORY_5"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleStringListCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="GOOGLE_PRODUCT_CATEGORY_4"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleStringListCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="GOOGLE_PRODUCT_CATEGORY_3"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleStringListCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="GOOGLE_PRODUCT_CATEGORY_2"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleStringListCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="GOOGLE_PRODUCT_CATEGORY_1"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleStringListCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="GOOGLE_PRODUCT_CATEGORY_0"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleStringListCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="CUSTOM_NUMBER_0"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupUint32Criteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="CUSTOM_NUMBER_1"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupUint32Criteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="CUSTOM_NUMBER_2"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupUint32Criteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="CUSTOM_NUMBER_3"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupUint32Criteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="CUSTOM_NUMBER_4"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupUint32Criteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="TITLE_KEYWORDS"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultipleStringCriteria"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PINTEREST_PRODUCT_CATEGORIES"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsProductGroupMultiplePinterestProductCategoryCriteria"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


