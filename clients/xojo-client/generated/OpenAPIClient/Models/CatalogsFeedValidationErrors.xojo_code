#tag Class
Protected Class CatalogsFeedValidationErrors

	#tag Property, Flags = &h0
		#tag Note
			Pinterest couldn't download your feed.
		#tag EndNote
		FETCH_ERROR As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Your feed wasn't ingested because it hasn’t changed in the previous 90 days.
		#tag EndNote
		FETCH_INACTIVE_FEED_ERROR As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Your feed includes data with an unsupported encoding format.
		#tag EndNote
		ENCODING_ERROR As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Your feed includes data with formatting errors.
		#tag EndNote
		DELIMITER_ERROR As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Your feed is missing some required column headers.
		#tag EndNote
		REQUIRED_COLUMNS_MISSING As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some products are duplicated.
		#tag EndNote
		DUPLICATE_PRODUCTS As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some image links are formatted incorrectly.
		#tag EndNote
		IMAGE_LINK_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items are missing an item id in their product metadata, those items will not be published.
		#tag EndNote
		ITEMID_MISSING As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items are missing a title in their product metadata, those items will not be published.
		#tag EndNote
		TITLE_MISSING As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items are missing a description in their product metadata, those items will not be published.
		#tag EndNote
		DESCRIPTION_MISSING As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items are missing a link URL in their product metadata, those items will not be published.
		#tag EndNote
		PRODUCT_LINK_MISSING As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items are missing an image link URL in their product metadata, those items will not be published.
		#tag EndNote
		IMAGE_LINK_MISSING As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items are missing an availability value in their product metadata, those items will not be published.
		#tag EndNote
		AVAILABILITY_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have price formatting errors in their product metadata, those items will not be published.
		#tag EndNote
		PRODUCT_PRICE_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some link values are formatted incorrectly.
		#tag EndNote
		LINK_FORMAT_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Your feed contains formatting errors for some items.
		#tag EndNote
		PARSE_LINE_ERROR As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some adwords links contain too many characters.
		#tag EndNote
		ADWORDS_FORMAT_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
		#tag EndNote
		INTERNAL_SERVICE_ERROR As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Your merchant domain needs to be claimed.
		#tag EndNote
		NO_VERIFIED_DOMAIN As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have invalid adult values.
		#tag EndNote
		ADULT_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have image_link URLs that contain too many characters, so those items will not be published.
		#tag EndNote
		IMAGE_LINK_LENGTH_TOO_LONG As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some of your product link values don't match the verified domain associated with this account.
		#tag EndNote
		INVALID_DOMAIN As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Your feed contains too many items, some items will not be published.
		#tag EndNote
		FEED_LENGTH_TOO_LONG As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some product links contain too many characters, those items will not be published.
		#tag EndNote
		LINK_LENGTH_TOO_LONG As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Your feed couldn't be validated because the xml file is formatted incorrectly.
		#tag EndNote
		MALFORMED_XML As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some products are missing a price, those items will not be published.
		#tag EndNote
		PRICE_MISSING As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.
		#tag EndNote
		FEED_TOO_SMALL As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items exceed the maximum number of items per item group, those items will not be published.
		#tag EndNote
		MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items' main images can't be found.
		#tag EndNote
		ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items were not published because they don't meet Pinterest's Merchant Guidelines.
		#tag EndNote
		PINJOIN_CONTENT_UNSAFE As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items were not published because they don't meet Pinterest's Merchant Guidelines.
		#tag EndNote
		BLOCKLISTED_IMAGE_SIGNATURE As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items have list price formatting errors in their product metadata, those items will not be published.
		#tag EndNote
		LIST_PRICE_INVALID As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
		#tag EndNote
		PRICE_CANNOT_BE_DETERMINED As Xoson.O.OptionalInteger
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
			Name="FETCH_ERROR"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="FETCH_INACTIVE_FEED_ERROR"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ENCODING_ERROR"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="DELIMITER_ERROR"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="REQUIRED_COLUMNS_MISSING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="DUPLICATE_PRODUCTS"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="IMAGE_LINK_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ITEMID_MISSING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="TITLE_MISSING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="DESCRIPTION_MISSING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PRODUCT_LINK_MISSING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="IMAGE_LINK_MISSING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="AVAILABILITY_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PRODUCT_PRICE_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="LINK_FORMAT_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PARSE_LINE_ERROR"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ADWORDS_FORMAT_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="INTERNAL_SERVICE_ERROR"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="NO_VERIFIED_DOMAIN"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ADULT_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="IMAGE_LINK_LENGTH_TOO_LONG"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="INVALID_DOMAIN"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="FEED_LENGTH_TOO_LONG"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="LINK_LENGTH_TOO_LONG"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="MALFORMED_XML"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PRICE_MISSING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="FEED_TOO_SMALL"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PINJOIN_CONTENT_UNSAFE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="BLOCKLISTED_IMAGE_SIGNATURE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="LIST_PRICE_INVALID"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="PRICE_CANNOT_BE_DETERMINED"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


