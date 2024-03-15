#tag Class
Protected Class AdGroupAudienceSizingRequest

	#tag Property, Flags = &h0
		#tag Note
			Enable auto-targeting for ad group. Also known as <a href="https://help.pinterest.com/en/business/article/expanded-targeting" target="_blank">"expanded targeting"</a>.
		#tag EndNote
		auto_targeting_enabled As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			<a href="/docs/redoc/#section/Placement-group">Placement group</a>.
		#tag EndNote
		placement_group As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
		#tag EndNote
		creative_types() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		targeting_spec As OpenAPIClient.Models.TargetingSpec
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href="https://help.pinterest.com/en/business/article/shopping-ads#section-14571" target="_blank">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
		#tag EndNote
		product_group_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
		#tag EndNote
		keywords() As OpenAPIClient.Models.AdGroupAudienceSizingRequestKeywordsInner
	#tag EndProperty


    #tag Enum, Name = Creative_typesEnum, Type = Integer, Flags = &h0
        
        Regular
        Video
        Shopping
        Carousel
        MaxVideo
        ShopThePin
        Collection
        Idea
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Creative_typesEnumToString(value As Creative_typesEnum) As String
		  Select Case value
		    
		    Case Creative_typesEnum.Regular
		      Return "REGULAR"
		    Case Creative_typesEnum.Video
		      Return "VIDEO"
		    Case Creative_typesEnum.Shopping
		      Return "SHOPPING"
		    Case Creative_typesEnum.Carousel
		      Return "CAROUSEL"
		    Case Creative_typesEnum.MaxVideo
		      Return "MAX_VIDEO"
		    Case Creative_typesEnum.ShopThePin
		      Return "SHOP_THE_PIN"
		    Case Creative_typesEnum.Collection
		      Return "COLLECTION"
		    Case Creative_typesEnum.Idea
		      Return "IDEA"
		    
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
			Name="auto_targeting_enabled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="placement_group"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PlacementGroupType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="targeting_spec"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingSpec"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="product_group_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="keywords"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AdGroupAudienceSizingRequestKeywordsInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


