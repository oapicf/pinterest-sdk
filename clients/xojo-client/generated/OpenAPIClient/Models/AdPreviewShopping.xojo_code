#tag Class
Protected Class AdPreviewShopping

	#tag Property, Flags = &h0
		#tag Note
			Catalog Product Group Id.
		#tag EndNote
		catalog_product_group_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ad format of the shopping ad preview.
		#tag EndNote
		creative_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
		#tag EndNote
		customizable_cta_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Title displayed below ad.
		#tag EndNote
		hero_image_title As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Hero image URL.
		#tag EndNote
		hero_image_url As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
		#tag EndNote
		hero_pin_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Multi image template tag.
		#tag EndNote
		image_tag As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
		#tag EndNote
		item_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Preferred media type.
		#tag EndNote
		preferred_media_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Include promotion data in preview when available on catalog item. Defaults to false.
		#tag EndNote
		show_promotion As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Multi video template tag, image_tag and video_tag are mutual exclusive.
		#tag EndNote
		video_tag As Xoson.O.OptionalString
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
			Name="catalog_product_group_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="creative_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdShoppingPreviewCreativeType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="customizable_cta_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CustomizableCTAType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="hero_image_title"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="hero_image_url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="hero_pin_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="image_tag"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="item_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="preferred_media_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BasePreferredMediaType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="show_promotion"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="video_tag"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


