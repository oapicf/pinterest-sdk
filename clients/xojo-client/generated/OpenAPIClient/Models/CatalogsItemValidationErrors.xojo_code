#tag Class
Protected Class CatalogsItemValidationErrors

	#tag Property, Flags = &h0
		#tag Note
			Item has an invalid adult value.
		#tag EndNote
		ADULT_INVALID As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Adword link contains too many characters.
		#tag EndNote
		ADWORDS_FORMAT_INVALID As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Item is missing availability value in its product metadata, this item will not be published.
		#tag EndNote
		AVAILABILITY_INVALID As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.
		#tag EndNote
		BLOCKLISTED_IMAGE_SIGNATURE As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Item is missing description in its product metadata, this item will not be published.
		#tag EndNote
		DESCRIPTION_MISSING As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			This product is duplicated. The duplicate entry will not be published.
		#tag EndNote
		DUPLICATE_PRODUCTS As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Image link is invalid.
		#tag EndNote
		IMAGE_LINK_INVALID As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Item has image_link URL that contains too many characters, so the item will not be published.
		#tag EndNote
		IMAGE_LINK_LENGTH_TOO_LONG As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Item is missing an image link URL in its product metadata, this item will not be published.
		#tag EndNote
		IMAGE_LINK_MISSING As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Product link value doesn't match the verified domain associated with this account.
		#tag EndNote
		INVALID_DOMAIN As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Main image can't be found.
		#tag EndNote
		ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Item is missing item id in its product metadata, this item will not be published.
		#tag EndNote
		ITEMID_MISSING As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Link is invalid.
		#tag EndNote
		LINK_FORMAT_INVALID As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Product link contains too many characters, this item will not be published.
		#tag EndNote
		LINK_LENGTH_TOO_LONG As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Item has a list price formatting error, this item will not be published.
		#tag EndNote
		LIST_PRICE_INVALID As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Item exceed the maximum number of items per item group, this item will not be published.
		#tag EndNote
		MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Item contains formating errors.
		#tag EndNote
		PARSE_LINE_ERROR As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.
		#tag EndNote
		PINJOIN_CONTENT_UNSAFE As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Item price cannot be determined because the price, list price, and sale price are all different.
		#tag EndNote
		PRICE_CANNOT_BE_DETERMINED As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Product is missing a price, this item will not be published.
		#tag EndNote
		PRICE_MISSING As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Item is missing a link URL in its product metadata, this item will not be published.
		#tag EndNote
		PRODUCT_LINK_MISSING As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Item has a price formatting error in its product metadata, this item will not be published.
		#tag EndNote
		PRODUCT_PRICE_INVALID As OpenAPIClient.Models.CatalogsItemValidationDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Item is missing title in its product metadata, this item will not be published.
		#tag EndNote
		TITLE_MISSING As OpenAPIClient.Models.CatalogsItemValidationDetails
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
			Name="ADULT_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ADWORDS_FORMAT_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="AVAILABILITY_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="BLOCKLISTED_IMAGE_SIGNATURE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="DESCRIPTION_MISSING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="DUPLICATE_PRODUCTS"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="IMAGE_LINK_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="IMAGE_LINK_LENGTH_TOO_LONG"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="IMAGE_LINK_MISSING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="INVALID_DOMAIN"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ITEMID_MISSING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="LINK_FORMAT_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="LINK_LENGTH_TOO_LONG"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="LIST_PRICE_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PARSE_LINE_ERROR"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PINJOIN_CONTENT_UNSAFE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PRICE_CANNOT_BE_DETERMINED"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PRICE_MISSING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PRODUCT_LINK_MISSING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PRODUCT_PRICE_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="TITLE_MISSING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CatalogsItemValidationDetails"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


