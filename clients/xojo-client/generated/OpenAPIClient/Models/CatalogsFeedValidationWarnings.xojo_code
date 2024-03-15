#tag Class
Protected Class CatalogsFeedValidationWarnings

	#tag Property, Flags = &h0
		#tag Note
			Some items have ad links that are formatted incorrectly.
		#tag EndNote
		AD_LINK_FORMAT_WARNING As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have ad link URLs that are duplicates of the link URLs for those items.
		#tag EndNote
		AD_LINK_SAME_AS_LINK As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The title for some items were truncated because they contain too many characters.
		#tag EndNote
		TITLE_LENGTH_TOO_LONG As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The description for some items were truncated because they contain too many characters.
		#tag EndNote
		DESCRIPTION_LENGTH_TOO_LONG As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
		#tag EndNote
		GENDER_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
		#tag EndNote
		AGE_GROUP_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
		#tag EndNote
		SIZE_TYPE_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have size system values which are not one of the supported size systems.
		#tag EndNote
		SIZE_SYSTEM_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have an invalid product link which contains invalid UTM tracking paramaters.
		#tag EndNote
		LINK_FORMAT_WARNING As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have sale price values that are higher than the original price of the item.
		#tag EndNote
		SALES_PRICE_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
		#tag EndNote
		PRODUCT_CATEGORY_DEPTH_WARNING As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have adwords_redirect links that are formatted incorrectly.
		#tag EndNote
		ADWORDS_FORMAT_WARNING As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
		#tag EndNote
		ADWORDS_SAME_AS_LINK As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Your feed contains duplicate headers.
		#tag EndNote
		DUPLICATE_HEADERS As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ingestion completed early because there are no changes to your feed since the last successful update.
		#tag EndNote
		FETCH_SAME_SIGNATURE As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
		#tag EndNote
		ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
		#tag EndNote
		ADDITIONAL_IMAGE_LINK_WARNING As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
		#tag EndNote
		IMAGE_LINK_WARNING As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have shipping values that are formatted incorrectly.
		#tag EndNote
		SHIPPING_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have tax values that are formatted incorrectly.
		#tag EndNote
		TAX_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have invalid shipping_weight values.
		#tag EndNote
		SHIPPING_WEIGHT_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
		#tag EndNote
		EXPIRATION_DATE_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
		#tag EndNote
		AVAILABILITY_DATE_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
		#tag EndNote
		SALE_DATE_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
		#tag EndNote
		WEIGHT_UNIT_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
		#tag EndNote
		IS_BUNDLE_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
		#tag EndNote
		UPDATED_TIME_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have custom_label values that are too long, those items will be published without that custom label.
		#tag EndNote
		CUSTOM_LABEL_LENGTH_TOO_LONG As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have product_type values that are too long, those items will be published without that product type.
		#tag EndNote
		PRODUCT_TYPE_LENGTH_TOO_LONG As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
		#tag EndNote
		TOO_MANY_ADDITIONAL_IMAGE_LINKS As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have invalid multipack values.
		#tag EndNote
		MULTIPACK_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The product count has increased or decreased significantly compared to the last successful ingestion.
		#tag EndNote
		INDEXED_PRODUCT_COUNT_LARGE_DELTA As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items include additional_image_links that can't be found.
		#tag EndNote
		ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items are missing a google_product_category.
		#tag EndNote
		OPTIONAL_PRODUCT_CATEGORY_MISSING As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
		#tag EndNote
		OPTIONAL_PRODUCT_CATEGORY_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
		#tag EndNote
		OPTIONAL_CONDITION_MISSING As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
		#tag EndNote
		OPTIONAL_CONDITION_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items include invalid ios_deep_link values.
		#tag EndNote
		IOS_DEEP_LINK_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items include invalid android_deep_link.
		#tag EndNote
		ANDROID_DEEP_LINK_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
		#tag EndNote
		UTM_SOURCE_AUTO_CORRECTED As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.
		#tag EndNote
		COUNTRY_DOES_NOT_MAP_TO_CURRENCY As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items include min_ad_price values that are formatted incorrectly.
		#tag EndNote
		MIN_AD_PRICE_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items include incorrectly formatted GTINs.
		#tag EndNote
		GTIN_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items include inconsistent currencies in price fields.
		#tag EndNote
		INCONSISTENT_CURRENCY_VALUES As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items include sales price that is much lower than the list price.
		#tag EndNote
		SALES_PRICE_TOO_LOW As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items include incorrectly formatted shipping_width.
		#tag EndNote
		SHIPPING_WIDTH_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items include incorrectly formatted shipping_height.
		#tag EndNote
		SHIPPING_HEIGHT_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
		#tag EndNote
		SALES_PRICE_TOO_HIGH As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items include incorrectly formatted MPNs.
		#tag EndNote
		MPN_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


    #tag Enum, Name = FETCH_SAME_SIGNATUREEnum, Type = Integer, Flags = &h0
        
        Escaped1 = "1"
        
    #tag EndEnum




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
			Name="AD_LINK_FORMAT_WARNING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="AD_LINK_SAME_AS_LINK"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="TITLE_LENGTH_TOO_LONG"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="DESCRIPTION_LENGTH_TOO_LONG"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="GENDER_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="AGE_GROUP_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="SIZE_TYPE_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="SIZE_SYSTEM_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="LINK_FORMAT_WARNING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="SALES_PRICE_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PRODUCT_CATEGORY_DEPTH_WARNING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ADWORDS_FORMAT_WARNING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ADWORDS_SAME_AS_LINK"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="DUPLICATE_HEADERS"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ADDITIONAL_IMAGE_LINK_WARNING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="IMAGE_LINK_WARNING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="SHIPPING_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="TAX_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="SHIPPING_WEIGHT_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="EXPIRATION_DATE_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="AVAILABILITY_DATE_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="SALE_DATE_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="WEIGHT_UNIT_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="IS_BUNDLE_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="UPDATED_TIME_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="CUSTOM_LABEL_LENGTH_TOO_LONG"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PRODUCT_TYPE_LENGTH_TOO_LONG"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="TOO_MANY_ADDITIONAL_IMAGE_LINKS"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="MULTIPACK_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="INDEXED_PRODUCT_COUNT_LARGE_DELTA"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="OPTIONAL_PRODUCT_CATEGORY_MISSING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="OPTIONAL_PRODUCT_CATEGORY_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="OPTIONAL_CONDITION_MISSING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="OPTIONAL_CONDITION_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="IOS_DEEP_LINK_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ANDROID_DEEP_LINK_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="UTM_SOURCE_AUTO_CORRECTED"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="COUNTRY_DOES_NOT_MAP_TO_CURRENCY"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="MIN_AD_PRICE_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="GTIN_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="INCONSISTENT_CURRENCY_VALUES"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="SALES_PRICE_TOO_LOW"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="SHIPPING_WIDTH_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="SHIPPING_HEIGHT_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="SALES_PRICE_TOO_HIGH"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="MPN_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


