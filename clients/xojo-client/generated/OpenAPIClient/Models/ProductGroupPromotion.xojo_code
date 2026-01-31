#tag Class
Protected Class ProductGroupPromotion

	#tag Property, Flags = &h0
		#tag Note
			ID of the ad group the product group belongs to.
		#tag EndNote
		ad_group_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The bid in micro currency.
		#tag EndNote
		bid_in_micro_currency As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			ID of the catalogs product group that this product group promotion references
		#tag EndNote
		catalog_product_group_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Catalogs product group name
		#tag EndNote
		catalog_product_group_name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Collections ad header type
		#tag EndNote
		collections_header_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Collections Hero Destination Url
		#tag EndNote
		collections_hero_destination_url As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Hero Pin ID if this PG is promoted as a Collection
		#tag EndNote
		collections_hero_pin_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		creative_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
		#tag EndNote
		customizable_cta_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The full product group definition path
		#tag EndNote
		definition As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		grid_click_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			ID of the product group promotion.
		#tag EndNote
		id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
		#tag EndNote
		included As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
		#tag EndNote
		is_generate_background As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
		#tag EndNote
		is_mdl As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The parent Product Group ID of this Product Group
		#tag EndNote
		parent_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
		#tag EndNote
		preferred_media_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The definition of the product group, relative to its parent - an attribute name/value pair
		#tag EndNote
		relative_definition As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ad image tag selected for the product group promotion.
		#tag EndNote
		selected_image_tag As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ad video tag selected for the product group promotion.
		#tag EndNote
		selected_video_tag As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Slideshow Collections Description
		#tag EndNote
		slideshow_collections_description As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Slideshow Collections Title
		#tag EndNote
		slideshow_collections_title As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		status As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Tracking template for proudct group promotions. 4000 limit
		#tag EndNote
		tracking_url As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = Collections_header_typeEnum, Type = Integer, Flags = &h0
        
        ShopThisCollection
        ExploreThisCollection
        NoHeader
        OnSale
        GetDeal
        
    #tag EndEnum

    #tag Enum, Name = Customizable_cta_typeEnum, Type = Integer, Flags = &h0
        
        ShopNow
        BookNow
        OnSale
        GetDeal
        BuyOnlinePickupInStore
        
    #tag EndEnum

    #tag Enum, Name = Preferred_media_typeEnum, Type = Integer, Flags = &h0
        
        Video
        Image
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Collections_header_typeEnumToString(value As Collections_header_typeEnum) As String
		  Select Case value
		    
		    Case Collections_header_typeEnum.ShopThisCollection
		      Return "SHOP_THIS_COLLECTION"
		    Case Collections_header_typeEnum.ExploreThisCollection
		      Return "EXPLORE_THIS_COLLECTION"
		    Case Collections_header_typeEnum.NoHeader
		      Return "NO_HEADER"
		    Case Collections_header_typeEnum.OnSale
		      Return "ON_SALE"
		    Case Collections_header_typeEnum.GetDeal
		      Return "GET_DEAL"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Customizable_cta_typeEnumToString(value As Customizable_cta_typeEnum) As String
		  Select Case value
		    
		    Case Customizable_cta_typeEnum.ShopNow
		      Return "SHOP_NOW"
		    Case Customizable_cta_typeEnum.BookNow
		      Return "BOOK_NOW"
		    Case Customizable_cta_typeEnum.OnSale
		      Return "ON_SALE"
		    Case Customizable_cta_typeEnum.GetDeal
		      Return "GET_DEAL"
		    Case Customizable_cta_typeEnum.BuyOnlinePickupInStore
		      Return "BUY_ONLINE_PICKUP_IN_STORE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Preferred_media_typeEnumToString(value As Preferred_media_typeEnum) As String
		  Select Case value
		    
		    Case Preferred_media_typeEnum.Video
		      Return "VIDEO"
		    Case Preferred_media_typeEnum.Image
		      Return "IMAGE"
		    
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
			Name="ad_group_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="bid_in_micro_currency"
			Visible=false
			Group="Behavior"
			InitialValue=""
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
			Name="catalog_product_group_name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="collections_hero_destination_url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="collections_hero_pin_id"
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
			Type="CreativeType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="definition"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="grid_click_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GridClickType"
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
			Name="included"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_generate_background"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_mdl"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="parent_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="relative_definition"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="selected_image_tag"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="selected_video_tag"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="slideshow_collections_description"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="slideshow_collections_title"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="tracking_url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


