#tag Class
Protected Class TemplateResponse

	#tag Property, Flags = &h0
		#tag Note
			ID of the Ad Account that owns the template
		#tag EndNote
		ad_account_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			IDs of the Ad Accounts that have access to this template
		#tag EndNote
		ad_account_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The length of the sliding window over which click conversions will be attributed
		#tag EndNote
		click_window_days As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of columns to be included in the report
		#tag EndNote
		columns() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Conversion report time type
		#tag EndNote
		conversion_report_time_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The surface used to create this template
		#tag EndNote
		creation_source As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of custom column IDs
		#tag EndNote
		custom_column_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		date_range As OpenAPIClient.Models.TemplateResponseDateRange
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The length of the sliding window over which engagement conversions will be attributed
		#tag EndNote
		engagement_window_days As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:<br> "field": The column name<br> "operator": The operator. Allowed operators: ["=", "!=", "in", "not_in", "~", ">", "<", "contains_substring"]<br> "value": A single value or a list of values
		#tag EndNote
		filters_json As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		granularity As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Template ID
		#tag EndNote
		id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The filter on the conversion ingestion source method for conversion metrics
		#tag EndNote
		ingestion_sources() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A boolean that indicates if the template has been deleted
		#tag EndNote
		is_deleted As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A boolean value that indicates if the user owns the template
		#tag EndNote
		is_owned_by_user As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A boolean value that indicates if this template has been used to create a scheduled report
		#tag EndNote
		is_scheduled As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Template Name
		#tag EndNote
		name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of days prior to the day the report will be delivered at which the report will end
		#tag EndNote
		report_end_relative_days_in_past As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		report_format As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		report_level As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of days prior to the day the report will be delivered at which the report will start
		#tag EndNote
		report_start_relative_days_in_past As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Reporting template type
		#tag EndNote
		type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Time of last update in seconds since Unix epoch
		#tag EndNote
		updated_time As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			ID of the user who created the template
		#tag EndNote
		user_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The length of the sliding window over which view conversions will be attributed
		#tag EndNote
		view_window_days As Xoson.O.OptionalDouble
	#tag EndProperty


    #tag Enum, Name = ColumnsEnum, Type = Integer, Flags = &h0
        
        SpendInMicroDollar
        SpendInMicroUsDollar
        BonusSpendInMicroDollar
        BonusSpendInDollar
        AdsCreditSpendInMicroDollar
        AdsCreditSpendInDollar
        PaidImpression
        PaidClickthrough
        SpendInDollar
        SpendInUsDollar
        CpcInMicroDollar
        EcpcInMicroDollar
        CpcInDollar
        EcpcInDollar
        Ctr
        Ectr
        OutboundCtr
        OutboundCtr1
        CpcInMicroCurrency
        CpwInMicroDollar
        CpwInDollar
        CostPerOutboundClick
        AdOnlyPin
        CampaignName
        CampaignStatus
        IsCampaignLearningPhase
        Date
        DateAsTimestamp
        BudgetInDollar
        AvailableBudgetInDollar
        TargetingType
        TargetingValue
        TargetingValueName
        CampaignBrandLabel
        CampaignCustomLabels
        AppInstallAppName
        PaidEvents
        BonusEvents
        Insertion
        LegacyCampaignId
        HbaseId
        PinDescription
        CampaignEndDate
        PinPromotionStatus
        AdStatus
        PinId
        CrossDeviceType
        IngestionSource
        SourcePlatform
        PinPromotionIsRunning
        TotalEngagement
        Engagement1
        Engagement2
        CpeInMicroDollar
        EcpeInMicroDollar
        CpeInDollar
        EcpeInDollar
        EngagementRate
        EengagementRate
        InternalEcpeInMicroDollar
        InternalEcpeInDollar
        EcpmInMicroDollar
        EcpmInDollar
        RepinRate
        RepinRate2
        Ctr2
        CampaignId
        AdvertiserId
        AdAccountId
        AdvertiserOwnerUserId
        AdvertiserOwnerUserName
        PinPromotionId
        AdId
        AdGroupId
        KeywordId
        KeywordIsDeleted
        BrandSfdcAccountId
        AppInstallAppId
        CampaignActionType
        CampaignBidType
        CampaignEntityStatus
        CampaignManagedStatus
        CampaignObjectiveType
        CpmInMicroDollar
        CpmInDollar
        BudgetType
        BudgetInLocalCurrency
        AdGroupName
        AdGroupStatus
        AdGroupEndDate
        AdGroupBudgetType
        AdGroupBudgetInLocalCurrency
        AdGroupSuggestedBudgetInLocalCurrency
        AdGroupSuggestedBonusBudgetInLocalCurrency
        AdGroupEntityStatus
        AdGroupActionType
        AdGroupConversionLearningModeType
        AdGroupTargetCpa
        AdGroupBidStrategyType
        AdGroupExperimentName
        AdGroupExperimentCell
        AdGroupBidMultiplier
        CampaignWebCloseupWhitelisted
        ProductGroupId
        ProductGroupDefinition
        ParentProductGroupId
        ProductGroupType
        ProductGroupBidInMicroCurrency
        ProductGroupStatus
        ProductGroupEntityStatus
        ProductGroupInclusion
        ProductGroupCreativeType
        PromoId
        PromoName
        PromoIds
        PromoNames
        ItemId
        ProductItemId
        InternalProductItemId
        InternalProductItemIdStr
        ProductItemName
        ProductItemImageUrl
        ProductItemPrice
        ProductItemProductUrl
        ProductItemPinUrl
        ProductItemBrand
        ProductItemDescription
        ProductItemSalePrice
        ProductItemProductType
        ProductItemProductCategory
        ProductItemCampaignName
        ProductItemAdGroupName
        ProductItemCurrency
        OrderLineId
        OrderLineName
        OrderLinePinRevShare
        OrderLinePaidType
        SpendOrderLineId
        SpendOrderLinePaidType
        ConversionProductId
        ConversionProductName
        ConversionProductBrand
        ConversionProductCategory
        ConversionProductIdGroup
        CartingTotalPurchaseIntentClicks
        CartingTotalPurchaseIntentValue
        CartingTotalPurchaseIntentValueInMicroCurrency
        CartingRetailerName
        CartingProductPrice
        CartingProductPriceInMicroCurrency
        CartingProductName
        CartingProductId
        Clickthrough1
        Repin1
        Impression1
        Like1
        Send1
        Flag1
        Hide1
        Insertion1
        Impression1Gross
        Clickthrough1Gross
        OutboundClick1
        ClickthroughUser1
        RepinUser1
        ImpressionUser1
        LikeUser1
        SendUser1
        FlagUser1
        HideUser1
        InsertionUser1
        Clickthrough2
        Repin2
        Impression2
        Like2
        Send2
        Flag2
        OutboundClick2
        ClickthroughUser2
        RepinUser2
        ImpressionUser2
        LikeUser2
        SendUser2
        FlagUser2
        TotalClickthrough
        TotalRepin
        TotalImpression
        TotalLike
        TotalSend
        TotalFlag
        TotalImpressionUser
        TotalImpressionUserHll
        TotalImpressionFrequency
        TotalImpressionFrequencyHll
        TotalOutboundClick
        CostPerOutboundClickInDollar
        CostPerOutboundClickInDollar1
        EngagementPageVisit1
        EngagementSignup1
        EngagementCheckout1
        EngagementCustom1
        EngagementAddToCart1
        EngagementLead1
        EngagementSearch1
        EngagementWatchVideo1
        EngagementViewCategory1
        EngagementAppInstall1
        EngagementUnknown1
        EngagementAddPaymentInfo1
        EngagementAddToWishlist1
        EngagementInitiateCheckout1
        EngagementSubscribe1
        EngagementViewContent1
        ClickPageVisit1
        ClickSignup1
        ClickCheckout1
        ClickCustom1
        ClickAddToCart1
        ClickLead1
        ClickSearch1
        ClickWatchVideo1
        ClickViewCategory1
        ClickAppInstall1
        ClickUnknown1
        ClickAddPaymentInfo1
        ClickAddToWishlist1
        ClickInitiateCheckout1
        ClickSubscribe1
        ClickViewContent1
        ViewPageVisit1
        ViewSignup1
        ViewCheckout1
        ViewCustom1
        ViewAddToCart1
        ViewLead1
        ViewSearch1
        ViewWatchVideo1
        ViewViewCategory1
        ViewAppInstall1
        ViewUnknown1
        ViewAddPaymentInfo1
        ViewAddToWishlist1
        ViewInitiateCheckout1
        ViewSubscribe1
        ViewViewContent1
        Conversions1
        EngagementPageVisitValueInMicroDollar1
        EngagementSignupValueInMicroDollar1
        EngagementCheckoutValueInMicroDollar1
        EngagementCustomValueInMicroDollar1
        EngagementAddToCartValueInMicroDollar1
        EngagementLeadValueInMicroDollar1
        EngagementSearchValueInMicroDollar1
        EngagementWatchVideoValueInMicroDollar1
        EngagementViewCategoryValueInMicroDollar1
        EngagementAppInstallValueInMicroDollar1
        EngagementUnknownValueInMicroDollar1
        EngagementAddPaymentInfoValueInMicroDollar1
        EngagementAddToWishlistValueInMicroDollar1
        EngagementInitiateCheckoutValueInMicroDollar1
        EngagementSubscribeValueInMicroDollar1
        EngagementViewContentValueInMicroDollar1
        ClickPageVisitValueInMicroDollar1
        ClickSignupValueInMicroDollar1
        ClickCheckoutValueInMicroDollar1
        ClickCustomValueInMicroDollar1
        ClickAddToCartValueInMicroDollar1
        ClickLeadValueInMicroDollar1
        ClickSearchValueInMicroDollar1
        ClickWatchVideoValueInMicroDollar1
        ClickViewCategoryValueInMicroDollar1
        ClickAppInstallValueInMicroDollar1
        ClickUnknownValueInMicroDollar1
        ClickAddPaymentInfoValueInMicroDollar1
        ClickAddToWishlistValueInMicroDollar1
        ClickInitiateCheckoutValueInMicroDollar1
        ClickSubscribeValueInMicroDollar1
        ClickViewContentValueInMicroDollar1
        ViewPageVisitValueInMicroDollar1
        ViewSignupValueInMicroDollar1
        ViewCheckoutValueInMicroDollar1
        ViewCustomValueInMicroDollar1
        ViewAddToCartValueInMicroDollar1
        ViewLeadValueInMicroDollar1
        ViewSearchValueInMicroDollar1
        ViewWatchVideoValueInMicroDollar1
        ViewViewCategoryValueInMicroDollar1
        ViewAppInstallValueInMicroDollar1
        ViewUnknownValueInMicroDollar1
        ViewAddPaymentInfoValueInMicroDollar1
        ViewAddToWishlistValueInMicroDollar1
        ViewInitiateCheckoutValueInMicroDollar1
        ViewSubscribeValueInMicroDollar1
        ViewViewContentValueInMicroDollar1
        ConversionsValueInMicroDollar1
        EngagementPageVisitQuantity1
        EngagementSignupQuantity1
        EngagementCheckoutQuantity1
        EngagementCustomQuantity1
        EngagementAddToCartQuantity1
        EngagementLeadQuantity1
        EngagementSearchQuantity1
        EngagementWatchVideoQuantity1
        EngagementViewCategoryQuantity1
        EngagementAppInstallQuantity1
        EngagementUnknownQuantity1
        EngagementAddPaymentInfoQuantity1
        EngagementAddToWishlistQuantity1
        EngagementInitiateCheckoutQuantity1
        EngagementSubscribeQuantity1
        EngagementViewContentQuantity1
        ClickPageVisitQuantity1
        ClickSignupQuantity1
        ClickCheckoutQuantity1
        ClickCustomQuantity1
        ClickAddToCartQuantity1
        ClickLeadQuantity1
        ClickSearchQuantity1
        ClickWatchVideoQuantity1
        ClickViewCategoryQuantity1
        ClickAppInstallQuantity1
        ClickUnknownQuantity1
        ClickAddPaymentInfoQuantity1
        ClickAddToWishlistQuantity1
        ClickInitiateCheckoutQuantity1
        ClickSubscribeQuantity1
        ClickViewContentQuantity1
        ViewPageVisitQuantity1
        ViewSignupQuantity1
        ViewCheckoutQuantity1
        ViewCustomQuantity1
        ViewAddToCartQuantity1
        ViewLeadQuantity1
        ViewSearchQuantity1
        ViewWatchVideoQuantity1
        ViewViewCategoryQuantity1
        ViewAppInstallQuantity1
        ViewUnknownQuantity1
        ViewAddPaymentInfoQuantity1
        ViewAddToWishlistQuantity1
        ViewInitiateCheckoutQuantity1
        ViewSubscribeQuantity1
        ViewViewContentQuantity1
        ConversionsQuantity1
        EngagementPageVisit2
        EngagementSignup2
        EngagementCheckout2
        EngagementCustom2
        EngagementAddToCart2
        EngagementLead2
        EngagementSearch2
        EngagementWatchVideo2
        EngagementViewCategory2
        EngagementAppInstall2
        EngagementUnknown2
        EngagementAddPaymentInfo2
        EngagementAddToWishlist2
        EngagementInitiateCheckout2
        EngagementSubscribe2
        EngagementViewContent2
        ClickPageVisit2
        ClickSignup2
        ClickCheckout2
        ClickCustom2
        ClickAddToCart2
        ClickLead2
        ClickSearch2
        ClickWatchVideo2
        ClickViewCategory2
        ClickAppInstall2
        ClickUnknown2
        ClickAddPaymentInfo2
        ClickAddToWishlist2
        ClickInitiateCheckout2
        ClickSubscribe2
        ClickViewContent2
        ViewPageVisit2
        ViewSignup2
        ViewCheckout2
        ViewCustom2
        ViewAddToCart2
        ViewLead2
        ViewSearch2
        ViewWatchVideo2
        ViewViewCategory2
        ViewAppInstall2
        ViewUnknown2
        ViewAddPaymentInfo2
        ViewAddToWishlist2
        ViewInitiateCheckout2
        ViewSubscribe2
        ViewViewContent2
        Conversions2
        EngagementPageVisitValueInMicroDollar2
        EngagementSignupValueInMicroDollar2
        EngagementCheckoutValueInMicroDollar2
        EngagementCustomValueInMicroDollar2
        EngagementAddToCartValueInMicroDollar2
        EngagementLeadValueInMicroDollar2
        EngagementSearchValueInMicroDollar2
        EngagementWatchVideoValueInMicroDollar2
        EngagementViewCategoryValueInMicroDollar2
        EngagementAppInstallValueInMicroDollar2
        EngagementUnknownValueInMicroDollar2
        EngagementAddPaymentInfoValueInMicroDollar2
        EngagementAddToWishlistValueInMicroDollar2
        EngagementInitiateCheckoutValueInMicroDollar2
        EngagementSubscribeValueInMicroDollar2
        EngagementViewContentValueInMicroDollar2
        ClickPageVisitValueInMicroDollar2
        ClickSignupValueInMicroDollar2
        ClickCheckoutValueInMicroDollar2
        ClickCustomValueInMicroDollar2
        ClickAddToCartValueInMicroDollar2
        ClickLeadValueInMicroDollar2
        ClickSearchValueInMicroDollar2
        ClickWatchVideoValueInMicroDollar2
        ClickViewCategoryValueInMicroDollar2
        ClickAppInstallValueInMicroDollar2
        ClickUnknownValueInMicroDollar2
        ClickAddPaymentInfoValueInMicroDollar2
        ClickAddToWishlistValueInMicroDollar2
        ClickInitiateCheckoutValueInMicroDollar2
        ClickSubscribeValueInMicroDollar2
        ClickViewContentValueInMicroDollar2
        ViewPageVisitValueInMicroDollar2
        ViewSignupValueInMicroDollar2
        ViewCheckoutValueInMicroDollar2
        ViewCustomValueInMicroDollar2
        ViewAddToCartValueInMicroDollar2
        ViewLeadValueInMicroDollar2
        ViewSearchValueInMicroDollar2
        ViewWatchVideoValueInMicroDollar2
        ViewViewCategoryValueInMicroDollar2
        ViewAppInstallValueInMicroDollar2
        ViewUnknownValueInMicroDollar2
        ViewAddPaymentInfoValueInMicroDollar2
        ViewAddToWishlistValueInMicroDollar2
        ViewInitiateCheckoutValueInMicroDollar2
        ViewSubscribeValueInMicroDollar2
        ViewViewContentValueInMicroDollar2
        ConversionsValueInMicroDollar2
        EngagementPageVisitQuantity2
        EngagementSignupQuantity2
        EngagementCheckoutQuantity2
        EngagementCustomQuantity2
        EngagementAddToCartQuantity2
        EngagementLeadQuantity2
        EngagementSearchQuantity2
        EngagementWatchVideoQuantity2
        EngagementViewCategoryQuantity2
        EngagementAppInstallQuantity2
        EngagementUnknownQuantity2
        EngagementAddPaymentInfoQuantity2
        EngagementAddToWishlistQuantity2
        EngagementInitiateCheckoutQuantity2
        EngagementSubscribeQuantity2
        EngagementViewContentQuantity2
        ClickPageVisitQuantity2
        ClickSignupQuantity2
        ClickCheckoutQuantity2
        ClickCustomQuantity2
        ClickAddToCartQuantity2
        ClickLeadQuantity2
        ClickSearchQuantity2
        ClickWatchVideoQuantity2
        ClickViewCategoryQuantity2
        ClickAppInstallQuantity2
        ClickUnknownQuantity2
        ClickAddPaymentInfoQuantity2
        ClickAddToWishlistQuantity2
        ClickInitiateCheckoutQuantity2
        ClickSubscribeQuantity2
        ClickViewContentQuantity2
        ViewPageVisitQuantity2
        ViewSignupQuantity2
        ViewCheckoutQuantity2
        ViewCustomQuantity2
        ViewAddToCartQuantity2
        ViewLeadQuantity2
        ViewSearchQuantity2
        ViewWatchVideoQuantity2
        ViewViewCategoryQuantity2
        ViewAppInstallQuantity2
        ViewUnknownQuantity2
        ViewAddPaymentInfoQuantity2
        ViewAddToWishlistQuantity2
        ViewInitiateCheckoutQuantity2
        ViewSubscribeQuantity2
        ViewViewContentQuantity2
        ConversionsQuantity2
        TotalEngagementPageVisit
        TotalEngagementSignup
        TotalEngagementCheckout
        TotalEngagementCustom
        TotalEngagementAddToCart
        TotalEngagementLead
        TotalEngagementSearch
        TotalEngagementWatchVideo
        TotalEngagementViewCategory
        TotalEngagementAppInstall
        TotalEngagementUnknown
        TotalEngagementAddPaymentInfo
        TotalEngagementAddToWishlist
        TotalEngagementInitiateCheckout
        TotalEngagementSubscribe
        TotalEngagementViewContent
        TotalClickPageVisit
        TotalClickSignup
        TotalClickCheckout
        TotalClickCustom
        TotalClickAddToCart
        TotalClickLead
        TotalClickSearch
        TotalClickWatchVideo
        TotalClickViewCategory
        TotalClickAppInstall
        TotalClickUnknown
        TotalClickAddPaymentInfo
        TotalClickAddToWishlist
        TotalClickInitiateCheckout
        TotalClickSubscribe
        TotalClickViewContent
        TotalViewPageVisit
        TotalViewSignup
        TotalViewCheckout
        TotalViewCustom
        TotalViewAddToCart
        TotalViewLead
        TotalViewSearch
        TotalViewWatchVideo
        TotalViewViewCategory
        TotalViewAppInstall
        TotalViewUnknown
        TotalViewAddPaymentInfo
        TotalViewAddToWishlist
        TotalViewInitiateCheckout
        TotalViewSubscribe
        TotalViewViewContent
        TotalConversions
        TotalWebConversions
        TotalInappConversions
        TotalOfflineConversions
        TotalEngagementPageVisitValueInMicroDollar
        TotalEngagementPageVisitValueInDollar
        TotalEngagementSignupValueInMicroDollar
        TotalEngagementSignupValueInDollar
        TotalEngagementCheckoutValueInMicroDollar
        TotalEngagementCheckoutValueInDollar
        TotalEngagementCustomValueInMicroDollar
        TotalEngagementCustomValueInDollar
        TotalEngagementAddToCartValueInMicroDollar
        TotalEngagementAddToCartValueInDollar
        TotalEngagementLeadValueInMicroDollar
        TotalEngagementLeadValueInDollar
        TotalEngagementSearchValueInMicroDollar
        TotalEngagementSearchValueInDollar
        TotalEngagementWatchVideoValueInMicroDollar
        TotalEngagementWatchVideoValueInDollar
        TotalEngagementViewCategoryValueInMicroDollar
        TotalEngagementViewCategoryValueInDollar
        TotalEngagementAppInstallValueInMicroDollar
        TotalEngagementUnknownValueInMicroDollar
        TotalEngagementAddPaymentInfoValueInMicroDollar
        TotalEngagementAddPaymentInfoValueInDollar
        TotalEngagementAddToWishlistValueInMicroDollar
        TotalEngagementAddToWishlistValueInDollar
        TotalEngagementInitiateCheckoutValueInMicroDollar
        TotalEngagementInitiateCheckoutValueInDollar
        TotalEngagementSubscribeValueInMicroDollar
        TotalEngagementSubscribeValueInDollar
        TotalEngagementViewContentValueInMicroDollar
        TotalEngagementViewContentValueInDollar
        TotalClickPageVisitValueInMicroDollar
        TotalClickPageVisitValueInDollar
        TotalClickSignupValueInMicroDollar
        TotalClickSignupValueInDollar
        TotalClickCheckoutValueInMicroDollar
        TotalClickCheckoutValueInDollar
        TotalClickCustomValueInMicroDollar
        TotalClickCustomValueInDollar
        TotalClickAddToCartValueInMicroDollar
        TotalClickAddToCartValueInDollar
        TotalClickLeadValueInMicroDollar
        TotalClickLeadValueInDollar
        TotalClickSearchValueInMicroDollar
        TotalClickSearchValueInDollar
        TotalClickWatchVideoValueInMicroDollar
        TotalClickWatchVideoValueInDollar
        TotalClickViewCategoryValueInMicroDollar
        TotalClickViewCategoryValueInDollar
        TotalClickAppInstallValueInMicroDollar
        TotalClickUnknownValueInMicroDollar
        TotalClickAddPaymentInfoValueInMicroDollar
        TotalClickAddPaymentInfoValueInDollar
        TotalClickAddToWishlistValueInMicroDollar
        TotalClickAddToWishlistValueInDollar
        TotalClickInitiateCheckoutValueInMicroDollar
        TotalClickInitiateCheckoutValueInDollar
        TotalClickSubscribeValueInMicroDollar
        TotalClickSubscribeValueInDollar
        TotalClickViewContentValueInMicroDollar
        TotalClickViewContentValueInDollar
        TotalViewPageVisitValueInMicroDollar
        TotalViewPageVisitValueInDollar
        TotalViewSignupValueInMicroDollar
        TotalViewSignupValueInDollar
        TotalViewCheckoutValueInMicroDollar
        TotalViewCheckoutValueInDollar
        TotalViewCustomValueInMicroDollar
        TotalViewCustomValueInDollar
        TotalViewAddToCartValueInMicroDollar
        TotalViewAddToCartValueInDollar
        TotalViewLeadValueInMicroDollar
        TotalViewLeadValueInDollar
        TotalViewSearchValueInMicroDollar
        TotalViewSearchValueInDollar
        TotalViewWatchVideoValueInMicroDollar
        TotalViewWatchVideoValueInDollar
        TotalViewViewCategoryValueInMicroDollar
        TotalViewViewCategoryValueInDollar
        TotalViewAppInstallValueInMicroDollar
        TotalViewUnknownValueInMicroDollar
        TotalViewAddPaymentInfoValueInMicroDollar
        TotalViewAddPaymentInfoValueInDollar
        TotalViewAddToWishlistValueInMicroDollar
        TotalViewAddToWishlistValueInDollar
        TotalViewInitiateCheckoutValueInMicroDollar
        TotalViewInitiateCheckoutValueInDollar
        TotalViewSubscribeValueInMicroDollar
        TotalViewSubscribeValueInDollar
        TotalViewViewContentValueInMicroDollar
        TotalViewViewContentValueInDollar
        TotalConversionsValueInMicroDollar
        TotalConversionsValueInDollar
        TotalEngagementPageVisitQuantity
        TotalEngagementSignupQuantity
        TotalEngagementCheckoutQuantity
        TotalEngagementCustomQuantity
        TotalEngagementAddToCartQuantity
        TotalEngagementLeadQuantity
        TotalEngagementSearchQuantity
        TotalEngagementWatchVideoQuantity
        TotalEngagementViewCategoryQuantity
        TotalEngagementAppInstallQuantity
        TotalEngagementUnknownQuantity
        TotalEngagementAddPaymentInfoQuantity
        TotalEngagementAddToWishlistQuantity
        TotalEngagementInitiateCheckoutQuantity
        TotalEngagementSubscribeQuantity
        TotalEngagementViewContentQuantity
        TotalClickPageVisitQuantity
        TotalClickSignupQuantity
        TotalClickCheckoutQuantity
        TotalClickCustomQuantity
        TotalClickAddToCartQuantity
        TotalClickLeadQuantity
        TotalClickSearchQuantity
        TotalClickWatchVideoQuantity
        TotalClickViewCategoryQuantity
        TotalClickAppInstallQuantity
        TotalClickUnknownQuantity
        TotalClickAddPaymentInfoQuantity
        TotalClickAddToWishlistQuantity
        TotalClickInitiateCheckoutQuantity
        TotalClickSubscribeQuantity
        TotalClickViewContentQuantity
        TotalViewPageVisitQuantity
        TotalViewSignupQuantity
        TotalViewCheckoutQuantity
        TotalViewCustomQuantity
        TotalViewAddToCartQuantity
        TotalViewLeadQuantity
        TotalViewSearchQuantity
        TotalViewWatchVideoQuantity
        TotalViewViewCategoryQuantity
        TotalViewAppInstallQuantity
        TotalViewUnknownQuantity
        TotalViewAddPaymentInfoQuantity
        TotalViewAddToWishlistQuantity
        TotalViewInitiateCheckoutQuantity
        TotalViewSubscribeQuantity
        TotalViewViewContentQuantity
        TotalConversionsQuantity
        CostPerConversionInDollar
        TotalWebSessions
        WebSessions1
        WebSessions2
        AppInstallsCpaBillable
        AppInstallsClick
        AppInstallsCloseuprepin
        AppInstallsView
        AppInstalls
        AppInstallsEngagement
        AppInstallsClick1
        AppInstallsClick2
        AppInstallsView1
        AppInstallsView2
        AppInstallsEngagement1
        AppInstallsEngagement2
        AppInstalls1
        AppInstalls2
        CpiInMicroDollar
        EcpiInMicroDollar
        CpiInDollar
        EcpiInDollar
        InappSkanAppInstall
        InappSkanAssistedAppInstall
        InappSkanAppInstallCostPerAction
        InappSkanAppInstallConversionRate
        OnsiteCheckoutsCpaBillable1
        OnsiteCheckoutsCpaBillable2
        OnsiteCheckoutsCpaBillable
        OnsiteCheckoutsValue1
        OnsiteCheckoutsValue2
        OnsiteCheckoutsValue
        OnsiteCheckouts1
        OnsiteCheckouts2
        OnsiteCheckouts
        OnsiteCheckoutsValueInMicroDollar1
        OnsiteCheckoutsValueInMicroDollar2
        ConversionRate
        AverageCheckoutValue
        ReturnOnAdvertiserSpend
        BuyButtonClicks1
        BuyButtonClicks2
        TotalBuyButtonClicks
        OrderDropoffRate
        OnsiteCheckoutsValueInMicroDollar
        OnsiteCheckoutsValueInDollar
        PinPromotionName
        AdName
        LifetimeImpressionUser1
        PinPromotionCampaignId
        PinPromotionCampaignName
        PinPromotionCampaignActionType
        TotalLifetimeImpressionUser
        PinPromotionCampaignStatus
        PinPromotionCampaignManagedStatus
        PinPromotionCampaignEntityStatus
        PinPromotionAdGroupId
        PinPromotionAdGroupName
        PinPromotionAdGroupStatus
        PinPromotionAdGroupEntityStatus
        PinPromotionCreativeType
        PinPromotionEntityStatus
        PinPromotionCreativeTypeV2
        PinPromotionReviewStatus
        AdGroupCampaignActionType
        AdGroupCampaignId
        AdGroupCampaignName
        AdGroupCampaignStatus
        AdGroupCreativeType
        AdGroupCampaignManagedStatus
        AdGroupCampaignEntityStatus
        AdGroupStartDate
        CampaignLifetimeSpendCap
        AdGroupBidInMicroCurrency
        CampaignAdGroupStartDate
        CampaignAdGroupEndDate
        CampaignNumberOfAdGroups
        AdGroupNumberOfPinPromotions
        TodaySpendInLocalCurrency
        TotalLifetimeSpendInLocalCurrency
        BudgetUtilization
        AdGroupOptimization
        InsertionOrder
        AdGroupBonusBudget
        Frequency
        CampaignDailySpendCap
        CampaignCreativeType
        AdGroupPlacementGroupType
        AdGroupIsPrefetchEnabled
        CampaignBudgetOptimization
        CampaignStartDate
        IsAutomatedCampaign
        IsPremiereCampaign
        FlexibleDailyBudgets
        IsPerformancePlusCampaign
        IsDcoFormatEnhancment
        PercentCrossDeviceConversions
        PageVisitPercentCrossDeviceConversions
        SignupPercentCrossDeviceConversions
        CheckoutPercentCrossDeviceConversions
        CustomPercentCrossDeviceConversions
        AddToCartPercentCrossDeviceConversions
        LeadPercentCrossDeviceConversions
        SearchPercentCrossDeviceConversions
        WatchVideoPercentCrossDeviceConversions
        ViewCategoryPercentCrossDeviceConversions
        AppInstallPercentCrossDeviceConversions
        UnknownPercentCrossDeviceConversions
        TotalDesktopActionToDesktopConversion
        TotalDesktopActionToMobileConversion
        TotalDesktopActionToTabletConversion
        TotalMobileActionToDesktopConversion
        TotalMobileActionToMobileConversion
        TotalMobileActionToTabletConversion
        TotalTabletActionToDesktopConversion
        TotalTabletActionToMobileConversion
        TotalTabletActionToTabletConversion
        TotalPageVisitDesktopActionToDesktopConversion
        TotalPageVisitDesktopActionToMobileConversion
        TotalPageVisitDesktopActionToTabletConversion
        TotalPageVisitMobileActionToDesktopConversion
        TotalPageVisitMobileActionToMobileConversion
        TotalPageVisitMobileActionToTabletConversion
        TotalPageVisitTabletActionToDesktopConversion
        TotalPageVisitTabletActionToMobileConversion
        TotalPageVisitTabletActionToTabletConversion
        TotalSignupDesktopActionToDesktopConversion
        TotalSignupDesktopActionToMobileConversion
        TotalSignupDesktopActionToTabletConversion
        TotalSignupMobileActionToDesktopConversion
        TotalSignupMobileActionToMobileConversion
        TotalSignupMobileActionToTabletConversion
        TotalSignupTabletActionToDesktopConversion
        TotalSignupTabletActionToMobileConversion
        TotalSignupTabletActionToTabletConversion
        TotalCheckoutDesktopActionToDesktopConversion
        TotalCheckoutDesktopActionToMobileConversion
        TotalCheckoutDesktopActionToTabletConversion
        TotalCheckoutMobileActionToDesktopConversion
        TotalCheckoutMobileActionToMobileConversion
        TotalCheckoutMobileActionToTabletConversion
        TotalCheckoutTabletActionToDesktopConversion
        TotalCheckoutTabletActionToMobileConversion
        TotalCheckoutTabletActionToTabletConversion
        TotalCustomDesktopActionToDesktopConversion
        TotalCustomDesktopActionToMobileConversion
        TotalCustomDesktopActionToTabletConversion
        TotalCustomMobileActionToDesktopConversion
        TotalCustomMobileActionToMobileConversion
        TotalCustomMobileActionToTabletConversion
        TotalCustomTabletActionToDesktopConversion
        TotalCustomTabletActionToMobileConversion
        TotalCustomTabletActionToTabletConversion
        TotalAddToCartDesktopActionToDesktopConversion
        TotalAddToCartDesktopActionToMobileConversion
        TotalAddToCartDesktopActionToTabletConversion
        TotalAddToCartMobileActionToDesktopConversion
        TotalAddToCartMobileActionToMobileConversion
        TotalAddToCartMobileActionToTabletConversion
        TotalAddToCartTabletActionToDesktopConversion
        TotalAddToCartTabletActionToMobileConversion
        TotalAddToCartTabletActionToTabletConversion
        TotalLeadDesktopActionToDesktopConversion
        TotalLeadDesktopActionToMobileConversion
        TotalLeadDesktopActionToTabletConversion
        TotalLeadMobileActionToDesktopConversion
        TotalLeadMobileActionToMobileConversion
        TotalLeadMobileActionToTabletConversion
        TotalLeadTabletActionToDesktopConversion
        TotalLeadTabletActionToMobileConversion
        TotalLeadTabletActionToTabletConversion
        TotalSearchDesktopActionToDesktopConversion
        TotalSearchDesktopActionToMobileConversion
        TotalSearchDesktopActionToTabletConversion
        TotalSearchMobileActionToDesktopConversion
        TotalSearchMobileActionToMobileConversion
        TotalSearchMobileActionToTabletConversion
        TotalSearchTabletActionToDesktopConversion
        TotalSearchTabletActionToMobileConversion
        TotalSearchTabletActionToTabletConversion
        TotalWatchVideoDesktopActionToDesktopConversion
        TotalWatchVideoDesktopActionToMobileConversion
        TotalWatchVideoDesktopActionToTabletConversion
        TotalWatchVideoMobileActionToDesktopConversion
        TotalWatchVideoMobileActionToMobileConversion
        TotalWatchVideoMobileActionToTabletConversion
        TotalWatchVideoTabletActionToDesktopConversion
        TotalWatchVideoTabletActionToMobileConversion
        TotalWatchVideoTabletActionToTabletConversion
        TotalViewCategoryDesktopActionToDesktopConversion
        TotalViewCategoryDesktopActionToMobileConversion
        TotalViewCategoryDesktopActionToTabletConversion
        TotalViewCategoryMobileActionToDesktopConversion
        TotalViewCategoryMobileActionToMobileConversion
        TotalViewCategoryMobileActionToTabletConversion
        TotalViewCategoryTabletActionToDesktopConversion
        TotalViewCategoryTabletActionToMobileConversion
        TotalViewCategoryTabletActionToTabletConversion
        TotalAppInstallDesktopActionToDesktopConversion
        TotalAppInstallDesktopActionToMobileConversion
        TotalAppInstallDesktopActionToTabletConversion
        TotalAppInstallMobileActionToDesktopConversion
        TotalAppInstallMobileActionToMobileConversion
        TotalAppInstallMobileActionToTabletConversion
        TotalAppInstallTabletActionToDesktopConversion
        TotalAppInstallTabletActionToMobileConversion
        TotalAppInstallTabletActionToTabletConversion
        TotalUnknownDesktopActionToDesktopConversion
        TotalUnknownDesktopActionToMobileConversion
        TotalUnknownDesktopActionToTabletConversion
        TotalUnknownMobileActionToDesktopConversion
        TotalUnknownMobileActionToMobileConversion
        TotalUnknownMobileActionToTabletConversion
        TotalUnknownTabletActionToDesktopConversion
        TotalUnknownTabletActionToMobileConversion
        TotalUnknownTabletActionToTabletConversion
        TotalPageVisit
        TotalSignup
        TotalCheckout
        TotalCustom
        TotalAddToCart
        TotalLead
        TotalSearch
        TotalWatchVideo
        TotalViewCategory
        TotalAppInstall
        TotalUnknown
        TotalAddPaymentInfo
        TotalAddToWishlist
        TotalInitiateCheckout
        TotalSubscribe
        TotalViewContent
        TotalPageVisitValueInMicroDollar
        TotalSignupValueInMicroDollar
        TotalCheckoutValueInMicroDollar
        TotalCustomValueInMicroDollar
        TotalAddToCartValueInMicroDollar
        TotalLeadValueInMicroDollar
        TotalSearchValueInMicroDollar
        TotalWatchVideoValueInMicroDollar
        TotalViewCategoryValueInMicroDollar
        TotalAppInstallValueInMicroDollar
        TotalUnknownValueInMicroDollar
        TotalAddPaymentInfoValueInMicroDollar
        TotalAddToWishlistValueInMicroDollar
        TotalInitiateCheckoutValueInMicroDollar
        TotalSubscribeValueInMicroDollar
        TotalViewContentValueInMicroDollar
        AveragePageVisitValueInMicroDollar
        AverageSignupValueInMicroDollar
        AverageCheckoutValueInMicroDollar
        AverageCustomValueInMicroDollar
        AverageAddToCartValueInMicroDollar
        AverageLeadValueInMicroDollar
        AverageSearchValueInMicroDollar
        AverageWatchVideoValueInMicroDollar
        AverageViewCategoryValueInMicroDollar
        AverageUnknownValueInMicroDollar
        AverageAddPaymentInfoValueInMicroDollar
        AverageAddToWishlistValueInMicroDollar
        AverageInitiateCheckoutValueInMicroDollar
        AverageSubscribeValueInMicroDollar
        AverageViewContentValueInMicroDollar
        AveragePageVisitValueInMicroUsDollar
        AverageSignupValueInMicroUsDollar
        AverageCheckoutValueInMicroUsDollar
        AverageCustomValueInMicroUsDollar
        AverageAddToCartValueInMicroUsDollar
        AverageLeadValueInMicroUsDollar
        AverageSearchValueInMicroUsDollar
        AverageWatchVideoValueInMicroUsDollar
        AverageViewCategoryValueInMicroUsDollar
        AverageUnknownValueInMicroUsDollar
        AverageAddPaymentInfoValueInMicroUsDollar
        AverageAddToWishlistValueInMicroUsDollar
        AverageInitiateCheckoutValueInMicroUsDollar
        AverageSubscribeValueInMicroUsDollar
        AverageViewContentValueInMicroUsDollar
        TotalPageVisitValueInMicroUsDollar
        TotalSignupValueInMicroUsDollar
        TotalCheckoutValueInMicroUsDollar
        TotalCustomValueInMicroUsDollar
        TotalAddToCartValueInMicroUsDollar
        TotalLeadValueInMicroUsDollar
        TotalSearchValueInMicroUsDollar
        TotalWatchVideoValueInMicroUsDollar
        TotalViewCategoryValueInMicroUsDollar
        TotalUnknownValueInMicroUsDollar
        TotalAddPaymentInfoValueInMicroUsDollar
        TotalAddToWishlistValueInMicroUsDollar
        TotalInitiateCheckoutValueInMicroUsDollar
        TotalSubscribeValueInMicroUsDollar
        TotalViewContentValueInMicroUsDollar
        TotalPageVisitQuantity
        TotalSignupQuantity
        TotalCheckoutQuantity
        TotalCustomQuantity
        TotalAddToCartQuantity
        TotalLeadQuantity
        TotalSearchQuantity
        TotalWatchVideoQuantity
        TotalViewCategoryQuantity
        TotalAppInstallQuantity
        TotalUnknownQuantity
        TotalAddPaymentInfoQuantity
        TotalAddToWishlistQuantity
        TotalInitiateCheckoutQuantity
        TotalSubscribeQuantity
        TotalViewContentQuantity
        TotalPageVisitValueInDollar
        TotalSignupValueInDollar
        TotalCheckoutValueInDollar
        TotalCustomValueInDollar
        TotalAddToCartValueInDollar
        TotalLeadValueInDollar
        TotalSearchValueInDollar
        TotalWatchVideoValueInDollar
        TotalViewCategoryValueInDollar
        TotalAppInstallValueInDollar
        TotalUnknownValueInDollar
        TotalAddPaymentInfoValueInDollar
        TotalAddToWishlistValueInDollar
        TotalInitiateCheckoutValueInDollar
        TotalSubscribeValueInDollar
        TotalViewContentValueInDollar
        PageVisitCostPerAction
        SignupCostPerAction
        CheckoutCostPerAction
        CustomCostPerAction
        AddToCartCostPerAction
        LeadCostPerAction
        SearchCostPerAction
        WatchVideoCostPerAction
        ViewCategoryCostPerAction
        AppInstallCostPerAction
        UnknownCostPerAction
        AdGroupCpaInMicroCurrency
        AddPaymentInfoCostPerAction
        AddToWishlistCostPerAction
        InitiateCheckoutCostPerAction
        SubscribeCostPerAction
        ViewContentCostPerAction
        PageVisitCostPerActionInUsDollar
        SignupCostPerActionInUsDollar
        CheckoutCostPerActionInUsDollar
        CustomCostPerActionInUsDollar
        AddToCartCostPerActionInUsDollar
        LeadCostPerActionInUsDollar
        SearchCostPerActionInUsDollar
        WatchVideoCostPerActionInUsDollar
        ViewCategoryCostPerActionInUsDollar
        UnknownCostPerActionInUsDollar
        AddPaymentInfoCostPerActionInUsDollar
        AddToWishlistCostPerActionInUsDollar
        InitiateCheckoutCostPerActionInUsDollar
        SubscribeCostPerActionInUsDollar
        ViewContentCostPerActionInUsDollar
        PageVisitRoas
        SignupRoas
        CheckoutRoas
        CustomRoas
        AddToCartRoas
        LeadRoas
        SearchRoas
        WatchVideoRoas
        ViewCategoryRoas
        AppInstallRoas
        UnknownRoas
        Roas
        ClickRoas
        EngagementRoas
        ViewRoas
        AddPaymentInfoRoas
        AddToWishlistRoas
        InitiateCheckoutRoas
        SubscribeRoas
        ViewContentRoas
        Hour
        BoardEngagement
        BoardInsertion
        BoardImpression
        BoardFollow
        BoardSend
        BoardHide
        ProductGroupCampaignId
        ProductGroupCampaignName
        ProductGroupCampaignActionType
        ProductGroupCampaignStatus
        ProductGroupCampaignManagedStatus
        ProductGroupAdGroupId
        ProductGroupAdGroupName
        ProductGroupAdGroupStatus
        ProductGroupAdImageTag
        ProductGroupAdVideoTag
        PromotedCatalogProductGroupReferenceId
        PromotedCatalogProductGroupReferenceName
        PromotedCatalogProductGroupId
        PromotedCatalogProductGroupBidInMicroCurrency
        PromotedCatalogProductGroupStatus
        PromotedCatalogProductGroupEntityStatus
        PromotedCatalogProductGroupCampaignId
        PromotedCatalogProductGroupCampaignName
        PromotedCatalogProductGroupCampaignActionType
        PromotedCatalogProductGroupCampaignStatus
        PromotedCatalogProductGroupCampaignManagedStatus
        PromotedCatalogProductGroupAdGroupId
        PromotedCatalogProductGroupAdGroupName
        PromotedCatalogProductGroupAdGroupStatus
        PromotedCatalogProductGroupTrackingTemplateUrl
        PromotedCatalogProductGroupSelectedImageTag
        Video3secViews1
        Video15secUniqueViews1
        VideoP0Complete1
        VideoP25Complete1
        VideoP50Complete1
        VideoP75Complete1
        VideoP95Complete1
        VideoP97Complete1
        VideoP100Complete1
        VideoP0Combined1
        VideoP25Combined1
        VideoP50Combined1
        VideoP75Combined1
        VideoP95Combined1
        VideoP97Combined1
        VideoP100Combined1
        VideoStartsPaid
        VideoStartsEarned
        TotalVideoStarts
        VideoAvgWatchtime1
        VideoMrcViews1
        VideoViewRate1
        Video3secViews2
        Video15secUniqueViews2
        VideoP0Complete2
        VideoP25Complete2
        VideoP50Complete2
        VideoP75Complete2
        VideoP95Complete2
        VideoP97Complete2
        VideoP100Complete2
        VideoP0Combined2
        VideoP25Combined2
        VideoP50Combined2
        VideoP75Combined2
        VideoP95Combined2
        VideoP97Combined2
        VideoP100Combined2
        VideoAvgWatchtime2
        VideoMrcViews2
        VideoViewRate2
        PaidVideoView
        PaidVideoImpression
        PaidVideoViewableRate
        VideoLength
        VideoSpendInMicroDollar
        VideoSpendInDollar
        CpvInMicroDollar
        CpvInDollar
        Cp3svInMicroDollar
        Cp3svInDollar
        EcpvInMicroDollar
        EcpvInDollar
        Ecp3svInMicroDollar
        Ecp3svInDollar
        CpcvInDollar
        CpcvInMicroDollar
        EcpcvInDollar
        EcpcvInMicroDollar
        CpcvP95InDollar
        CpcvP95InMicroDollar
        EcpcvP95InDollar
        EcpcvP95InMicroDollar
        TotalVideo3secViews
        TotalVideo15secUniqueViews
        TotalVideoP0Complete
        TotalVideoP25Complete
        TotalVideoP50Complete
        TotalVideoP75Complete
        TotalVideoP95Complete
        TotalVideoP97Complete
        TotalVideoP100Complete
        TotalVideoP0Combined
        TotalVideoP25Combined
        TotalVideoP50Combined
        TotalVideoP75Combined
        TotalVideoP95Combined
        TotalVideoP97Combined
        TotalVideoP100Combined
        TotalVideoAvgWatchtime
        TotalVideoMrcViews
        TotalVideoViewRate
        VideoV50Watchtime1
        VideoV50Watchtime2
        TotalVideoV50Watchtime
        VideoSumV50WatchtimeInMillisecond1
        VideoSumV50WatchtimeInMillisecond2
        TotalVideoSumV50WatchtimeInMillisecond
        VideoSumV50WatchtimeInSecond1
        VideoSumV50WatchtimeInSecond2
        TotalVideoSumV50WatchtimeInSecond
        VideoAvgWatchtimeInMillisecond1
        VideoAvgWatchtimeInMillisecond2
        TotalVideoAvgWatchtimeInMillisecond
        VideoAvgWatchtimeInSecond1
        VideoAvgWatchtimeInSecond2
        TotalVideoAvgWatchtimeInSecond
        VideoAvgWatchtimeInSecondVideoStartsPaid
        VideoAvgWatchtimeInSecondVideoStartsEarned
        TotalVideoAvgWatchtimeInSecondVideoStarts
        DeliveryStatusNoFanout
        DeliveryStatusWithFanout
        KeywordCompetitionBand
        KeywordQueryVolume
        KeywordValue
        KeywordMatchType
        KeywordBidInMicroCurrency
        KeywordUserQuery
        KeywordSqrKeywordValue
        KeywordAdGroupId
        KeywordAdGroupName
        KeywordCampaignId
        KeywordCampaignName
        KeywordSearchTermAdGroupId
        KeywordSearchTermAdGroupName
        KeywordSearchTermCampaignId
        KeywordSearchTermCampaignName
        NegativeKeywordAdGroupId
        NegativeKeywordAdGroupName
        NegativeKeywordCampaignId
        NegativeKeywordCampaignName
        OneTapV2WebsiteView1
        OneTapV2WebsiteView2
        TotalOneTapV2WebsiteView
        OneTapV2WebsiteViewUser1
        OneTapV2WebsiteViewUser2
        TotalLandingPageViews
        LandingPageViews1
        LandingPageViews2
        CostPerLandingPageView
        LandingPageViewRate
        TotalDestinationViews
        DestinationViews1
        DestinationViews2
        CostPerDestinationViewInDollar
        CostPerDestinationViewInMicroDollar
        DestinationViewRate
        CarouselSlotIndex
        CarouselId
        CarouselSlotPromotionId
        CarouselSlotImpression1
        CarouselSlotImpression2
        TotalCarouselSlotImpression
        CarouselSlotImpressionUser1
        CarouselSlotImpressionUser2
        CarouselSlotClickthrough1
        CarouselSlotClickthrough2
        TotalCarouselSlotClickthrough
        CarouselSlotClickthroughUser1
        CarouselSlotClickthroughUser2
        CarouselSlotSideswipe1
        CarouselSlotSideswipe2
        TotalCarouselSlotSideswipe
        CarouselSlotSideswipeUser1
        CarouselSlotSideswipeUser2
        CarouselSlotViewWebsite1
        CarouselSlotViewWebsite2
        TotalCarouselSlotViewWebsite
        CarouselSlotViewWebsiteUser1
        CarouselSlotViewWebsiteUser2
        CollectionPinItemImpression1
        CollectionPinItemImpression2
        TotalCollectionPinItemImpression
        CollectionPinItemClickthrough1
        CollectionPinItemClickthrough2
        TotalCollectionPinItemClickthrough
        HoldoutExperiment
        AdGroupHoldoutExperiment
        PinPromotionHoldoutExperiment
        ProductGroupHoldoutExperiment
        MultiObjectiveResult
        MultiObjectiveCost
        MultiObjectiveResultDescription
        MultiObjectiveCostDescription
        DateRange
        DateRangeStart
        DateRangeEnd
        ReportDateStart
        ReportDateEnd
        PinnerListName
        PinnerListType
        OrderValue
        OrderQuantity
        AdvertiserName
        AdvertiserCurrency
        TotalRepinRate
        SpendYesterdayInDollar
        PinPromotionRejectionLabels
        PinPromotionDestinationUrl
        VideoCompletionRate
        CampaignBookingReference
        WebCheckoutCostPerAction
        WebCheckoutRoas
        TotalWebCheckout
        TotalWebCheckoutValueInMicroDollar
        TotalWebCheckoutValueInDollar
        TotalWebClickCheckout
        TotalWebClickCheckoutValueInMicroDollar
        TotalWebClickCheckoutValueInDollar
        TotalWebEngagementCheckout
        TotalWebEngagementCheckoutValueInMicroDollar
        TotalWebEngagementCheckoutValueInDollar
        TotalWebViewCheckout
        TotalWebViewCheckoutValueInMicroDollar
        TotalWebViewCheckoutValueInDollar
        InappCheckoutCostPerAction
        InappCheckoutRoas
        TotalInappCheckout
        TotalInappCheckoutValueInMicroDollar
        TotalInappCheckoutValueInDollar
        TotalInappClickCheckout
        TotalInappClickCheckoutValueInMicroDollar
        TotalInappClickCheckoutValueInDollar
        TotalInappEngagementCheckout
        TotalInappEngagementCheckoutValueInMicroDollar
        TotalInappEngagementCheckoutValueInDollar
        TotalInappViewCheckout
        TotalInappViewCheckoutValueInMicroDollar
        TotalInappViewCheckoutValueInDollar
        OfflineCheckoutCostPerAction
        OfflineCheckoutRoas
        TotalOfflineCheckout
        TotalOfflineCheckoutValueInMicroDollar
        TotalOfflineCheckoutValueInDollar
        TotalOfflineClickCheckout
        TotalOfflineClickCheckoutValueInMicroDollar
        TotalOfflineClickCheckoutValueInDollar
        TotalOfflineEngagementCheckout
        TotalOfflineEngagementCheckoutValueInMicroDollar
        TotalOfflineEngagementCheckoutValueInDollar
        TotalOfflineViewCheckout
        TotalOfflineViewCheckoutValueInMicroDollar
        TotalOfflineViewCheckoutValueInDollar
        PinterestCheckoutCostPerAction
        PinterestCheckoutRoas
        TotalPinterestCheckout
        TotalPinterestCheckoutValueInMicroDollar
        TotalPinterestCheckoutValueInDollar
        WebAddToCartCostPerAction
        WebAddToCartRoas
        TotalWebAddToCart
        TotalWebAddToCartValueInMicroDollar
        TotalWebAddToCartValueInDollar
        TotalWebClickAddToCart
        TotalWebClickAddToCartValueInMicroDollar
        TotalWebClickAddToCartValueInDollar
        TotalWebEngagementAddToCart
        TotalWebEngagementAddToCartValueInMicroDollar
        TotalWebViewAddToCart
        TotalWebViewAddToCartValueInMicroDollar
        TotalWebViewAddToCartValueInDollar
        InappAddToCartCostPerAction
        InappAddToCartRoas
        TotalInappAddToCart
        TotalInappAddToCartValueInMicroDollar
        TotalInappAddToCartValueInDollar
        TotalInappClickAddToCart
        TotalInappClickAddToCartValueInMicroDollar
        TotalInappClickAddToCartValueInDollar
        TotalInappEngagementAddToCart
        TotalInappEngagementAddToCartValueInMicroDollar
        TotalInappEngagementAddToCartValueInDollar
        TotalInappViewAddToCart
        TotalInappViewAddToCartValueInMicroDollar
        TotalInappViewAddToCartValueInDollar
        WebPageVisitCostPerAction
        WebPageVisitRoas
        TotalWebPageVisit
        TotalWebPageVisitValueInMicroDollar
        TotalWebPageVisitValueInDollar
        TotalWebClickPageVisit
        TotalWebClickPageVisitValueInMicroDollar
        TotalWebClickPageVisitValueInDollar
        TotalWebEngagementPageVisit
        TotalWebEngagementPageVisitValueInMicroDollar
        TotalWebEngagementPageVisitValueInDollar
        TotalWebViewPageVisit
        TotalWebViewPageVisitValueInMicroDollar
        TotalWebViewPageVisitValueInDollar
        WebSignupCostPerAction
        WebSignupRoas
        TotalWebSignup
        TotalWebSignupValueInMicroDollar
        TotalWebSignupValueInDollar
        TotalWebClickSignup
        TotalWebClickSignupValueInMicroDollar
        TotalWebClickSignupValueInDollar
        TotalWebEngagementSignup
        TotalWebEngagementSignupValueInMicroDollar
        TotalWebEngagementSignupValueInDollar
        TotalWebViewSignup
        TotalWebViewSignupValueInMicroDollar
        TotalWebViewSignupValueInDollar
        InappSignupCostPerAction
        InappSignupRoas
        TotalInappSignup
        TotalInappSignupValueInMicroDollar
        TotalInappSignupValueInDollar
        TotalInappClickSignup
        TotalInappClickSignupValueInMicroDollar
        TotalInappClickSignupValueInDollar
        TotalInappEngagementSignup
        TotalInappEngagementSignupValueInMicroDollar
        TotalInappEngagementSignupValueInDollar
        TotalInappViewSignup
        TotalInappViewSignupValueInMicroDollar
        TotalInappViewSignupValueInDollar
        OfflineSignupCostPerAction
        OfflineSignupRoas
        TotalOfflineSignup
        TotalOfflineSignupValueInMicroDollar
        TotalOfflineSignupValueInDollar
        TotalOfflineClickSignup
        TotalOfflineClickSignupValueInMicroDollar
        TotalOfflineClickSignupValueInDollar
        TotalOfflineEngagementSignup
        TotalOfflineEngagementSignupValueInMicroDollar
        TotalOfflineEngagementSignupValueInDollar
        TotalOfflineViewSignup
        TotalOfflineViewSignupValueInMicroDollar
        TotalOfflineViewSignupValueInDollar
        WebWatchVideoCostPerAction
        WebWatchVideoRoas
        TotalWebWatchVideo
        TotalWebWatchVideoValueInMicroDollar
        TotalWebWatchVideoValueInDollar
        TotalWebClickWatchVideo
        TotalWebClickWatchVideoValueInMicroDollar
        TotalWebClickWatchVideoValueInDollar
        TotalWebEngagementWatchVideo
        TotalWebEngagementWatchVideoValueInMicroDollar
        TotalWebEngagementWatchVideoValueInDollar
        TotalWebViewWatchVideo
        TotalWebViewWatchVideoValueInMicroDollar
        TotalWebViewWatchVideoValueInDollar
        WebLeadCostPerAction
        WebLeadRoas
        TotalWebLead
        TotalWebLeadValueInMicroDollar
        TotalWebLeadValueInDollar
        TotalWebClickLead
        TotalWebClickLeadValueInMicroDollar
        TotalWebClickLeadValueInDollar
        TotalWebEngagementLead
        TotalWebEngagementLeadValueInMicroDollar
        TotalWebEngagementLeadValueInDollar
        TotalWebViewLead
        TotalWebViewLeadValueInMicroDollar
        TotalWebViewLeadValueInDollar
        OfflineLeadCostPerAction
        OfflineLeadRoas
        TotalOfflineLead
        TotalOfflineLeadValueInMicroDollar
        TotalOfflineLeadValueInDollar
        TotalOfflineClickLead
        TotalOfflineClickLeadValueInMicroDollar
        TotalOfflineClickLeadValueInDollar
        TotalOfflineEngagementLead
        TotalOfflineEngagementLeadValueInMicroDollar
        TotalOfflineEngagementLeadValueInDollar
        TotalOfflineViewLead
        TotalOfflineViewLeadValueInMicroDollar
        TotalOfflineViewLeadValueInDollar
        WebSearchCostPerAction
        WebSearchRoas
        TotalWebSearch
        TotalWebSearchValueInMicroDollar
        TotalWebSearchValueInDollar
        TotalWebClickSearch
        TotalWebClickSearchValueInMicroDollar
        TotalWebClickSearchValueInDollar
        TotalWebEngagementSearch
        TotalWebEngagementSearchValueInMicroDollar
        TotalWebEngagementSearchValueInDollar
        TotalWebViewSearch
        TotalWebViewSearchValueInMicroDollar
        TotalWebViewSearchValueInDollar
        InappSearchCostPerAction
        InappSearchRoas
        TotalInappSearch
        TotalInappSearchValueInMicroDollar
        TotalInappSearchValueInDollar
        TotalInappClickSearch
        TotalInappClickSearchValueInMicroDollar
        TotalInappClickSearchValueInDollar
        TotalInappEngagementSearch
        TotalInappEngagementSearchValueInMicroDollar
        TotalInappEngagementSearchValueInDollar
        TotalInappViewSearch
        TotalInappViewSearchValueInMicroDollar
        TotalInappViewSearchValueInDollar
        WebViewCategoryCostPerAction
        WebViewCategoryRoas
        TotalWebViewCategory
        TotalWebViewCategoryValueInMicroDollar
        TotalWebViewCategoryValueInDollar
        TotalWebClickViewCategory
        TotalWebClickViewCategoryValueInMicroDollar
        TotalWebClickViewCategoryValueInDollar
        TotalWebEngagementViewCategory
        TotalWebEngagementViewCategoryValueInMicroDollar
        TotalWebEngagementViewCategoryValueInDollar
        TotalWebViewViewCategory
        TotalWebViewViewCategoryValueInMicroDollar
        TotalWebViewViewCategoryValueInDollar
        WebCustomCostPerAction
        WebCustomRoas
        TotalWebCustom
        TotalWebCustomValueInMicroDollar
        TotalWebCustomValueInDollar
        TotalWebClickCustom
        TotalWebClickCustomValueInMicroDollar
        TotalWebClickCustomValueInDollar
        TotalWebEngagementCustom
        TotalWebEngagementCustomValueInMicroDollar
        TotalWebEngagementCustomValueInDollar
        TotalWebViewCustom
        TotalWebViewCustomValueInMicroDollar
        TotalWebViewCustomValueInDollar
        OfflineCustomCostPerAction
        OfflineCustomRoas
        TotalOfflineCustom
        TotalOfflineCustomValueInMicroDollar
        TotalOfflineCustomValueInDollar
        TotalOfflineClickCustom
        TotalOfflineClickCustomValueInMicroDollar
        TotalOfflineClickCustomValueInDollar
        TotalOfflineEngagementCustom
        TotalOfflineEngagementCustomValueInMicroDollar
        TotalOfflineEngagementCustomValueInDollar
        TotalOfflineViewCustom
        TotalOfflineViewCustomValueInMicroDollar
        TotalOfflineViewCustomValueInDollar
        WebUnknownCostPerAction
        WebUnknownRoas
        TotalWebUnknown
        TotalWebUnknownValueInMicroDollar
        TotalWebUnknownValueInDollar
        TotalWebClickUnknown
        TotalWebClickUnknownValueInMicroDollar
        TotalWebClickUnknownValueInDollar
        TotalWebEngagementUnknown
        TotalWebEngagementUnknownValueInMicroDollar
        TotalWebEngagementUnknownValueInDollar
        TotalWebViewUnknown
        TotalWebViewUnknownValueInMicroDollar
        TotalWebViewUnknownValueInDollar
        InappUnknownCostPerAction
        InappUnknownRoas
        TotalInappUnknown
        TotalInappUnknownValueInMicroDollar
        TotalInappUnknownValueInDollar
        TotalInappClickUnknown
        TotalInappClickUnknownValueInMicroDollar
        TotalInappClickUnknownValueInDollar
        TotalInappEngagementUnknown
        TotalInappEngagementUnknownValueInMicroDollar
        TotalInappEngagementUnknownValueInDollar
        TotalInappViewUnknown
        TotalInappViewUnknownValueInMicroDollar
        TotalInappViewUnknownValueInDollar
        OfflineUnknownCostPerAction
        OfflineUnknownRoas
        TotalOfflineUnknown
        TotalOfflineUnknownValueInMicroDollar
        TotalOfflineUnknownValueInDollar
        TotalOfflineClickUnknown
        TotalOfflineClickUnknownValueInMicroDollar
        TotalOfflineClickUnknownValueInDollar
        TotalOfflineEngagementUnknown
        TotalOfflineEngagementUnknownValueInMicroDollar
        TotalOfflineEngagementUnknownValueInDollar
        TotalOfflineViewUnknown
        TotalOfflineViewUnknownValueInMicroDollar
        TotalOfflineViewUnknownValueInDollar
        InappAppInstallCostPerAction
        InappAppInstallRoas
        TotalInappAppInstall
        TotalInappAppInstallValueInMicroDollar
        TotalInappAppInstallValueInDollar
        TotalInappClickAppInstall
        TotalInappClickAppInstallValueInMicroDollar
        TotalInappClickAppInstallValueInDollar
        TotalInappEngagementAppInstall
        TotalInappEngagementAppInstallValueInMicroDollar
        TotalInappEngagementAppInstallValueInDollar
        TotalInappViewAppInstall
        TotalInappViewAppInstallValueInMicroDollar
        TotalInappViewAppInstallValueInDollar
        TotalAppInstallConversionRate
        TotalInappAppInstallConversionRate
        WebAddPaymentInfoCostPerAction
        WebAddPaymentInfoRoas
        TotalWebAddPaymentInfo
        TotalWebAddPaymentInfoValueInMicroDollar
        TotalWebAddPaymentInfoValueInDollar
        TotalWebClickAddPaymentInfo
        TotalWebClickAddPaymentInfoValueInMicroDollar
        TotalWebClickAddPaymentInfoValueInDollar
        TotalWebEngagementAddPaymentInfo
        TotalWebEngagementAddPaymentInfoValueInMicroDollar
        TotalWebEngagementAddPaymentInfoValueInDollar
        TotalWebViewAddPaymentInfo
        TotalWebViewAddPaymentInfoValueInMicroDollar
        TotalWebViewAddPaymentInfoValueInDollar
        InappAddPaymentInfoCostPerAction
        InappAddPaymentInfoRoas
        TotalInappAddPaymentInfo
        TotalInappAddPaymentInfoValueInMicroDollar
        TotalInappAddPaymentInfoValueInDollar
        TotalInappClickAddPaymentInfo
        TotalInappClickAddPaymentInfoValueInMicroDollar
        TotalInappClickAddPaymentInfoValueInDollar
        TotalInappEngagementAddPaymentInfo
        TotalInappEngagementAddPaymentInfoValueInMicroDollar
        TotalInappEngagementAddPaymentInfoValueInDollar
        TotalInappViewAddPaymentInfo
        TotalInappViewAddPaymentInfoValueInMicroDollar
        TotalInappViewAddPaymentInfoValueInDollar
        OfflineAddPaymentInfoCostPerAction
        OfflineAddPaymentInfoRoas
        TotalOfflineAddPaymentInfo
        TotalOfflineAddPaymentInfoValueInMicroDollar
        TotalOfflineAddPaymentInfoValueInDollar
        TotalOfflineClickAddPaymentInfo
        TotalOfflineClickAddPaymentInfoValueInMicroDollar
        TotalOfflineClickAddPaymentInfoValueInDollar
        TotalOfflineEngagementAddPaymentInfo
        TotalOfflineEngagementAddPaymentInfoValueInMicroDollar
        TotalOfflineEngagementAddPaymentInfoValueInDollar
        TotalOfflineViewAddPaymentInfo
        TotalOfflineViewAddPaymentInfoValueInMicroDollar
        TotalOfflineViewAddPaymentInfoValueInDollar
        WebAddToWishlistCostPerAction
        WebAddToWishlistRoas
        TotalWebAddToWishlist
        TotalWebAddToWishlistValueInMicroDollar
        TotalWebAddToWishlistValueInDollar
        TotalWebClickAddToWishlist
        TotalWebClickAddToWishlistValueInMicroDollar
        TotalWebClickAddToWishlistValueInDollar
        TotalWebEngagementAddToWishlist
        TotalWebEngagementAddToWishlistValueInMicroDollar
        TotalWebEngagementAddToWishlistValueInDollar
        TotalWebViewAddToWishlist
        TotalWebViewAddToWishlistValueInMicroDollar
        TotalWebViewAddToWishlistValueInDollar
        InappAddToWishlistCostPerAction
        InappAddToWishlistRoas
        TotalInappAddToWishlist
        TotalInappAddToWishlistValueInMicroDollar
        TotalInappAddToWishlistValueInDollar
        TotalInappClickAddToWishlist
        TotalInappClickAddToWishlistValueInMicroDollar
        TotalInappClickAddToWishlistValueInDollar
        TotalInappEngagementAddToWishlist
        TotalInappEngagementAddToWishlistValueInMicroDollar
        TotalInappEngagementAddToWishlistValueInDollar
        TotalInappViewAddToWishlist
        TotalInappViewAddToWishlistValueInMicroDollar
        TotalInappViewAddToWishlistValueInDollar
        OfflineAddToWishlistCostPerAction
        OfflineAddToWishlistRoas
        TotalOfflineAddToWishlist
        TotalOfflineAddToWishlistValueInMicroDollar
        TotalOfflineAddToWishlistValueInDollar
        TotalOfflineClickAddToWishlist
        TotalOfflineClickAddToWishlistValueInMicroDollar
        TotalOfflineClickAddToWishlistValueInDollar
        TotalOfflineEngagementAddToWishlist
        TotalOfflineEngagementAddToWishlistValueInMicroDollar
        TotalOfflineEngagementAddToWishlistValueInDollar
        TotalOfflineViewAddToWishlist
        TotalOfflineViewAddToWishlistValueInMicroDollar
        TotalOfflineViewAddToWishlistValueInDollar
        WebInitiateCheckoutCostPerAction
        WebInitiateCheckoutRoas
        TotalWebInitiateCheckout
        TotalWebInitiateCheckoutValueInMicroDollar
        TotalWebInitiateCheckoutValueInDollar
        TotalWebClickInitiateCheckout
        TotalWebClickInitiateCheckoutValueInMicroDollar
        TotalWebClickInitiateCheckoutValueInDollar
        TotalWebEngagementInitiateCheckout
        TotalWebEngagementInitiateCheckoutValueInMicroDollar
        TotalWebEngagementInitiateCheckoutValueInDollar
        TotalWebViewInitiateCheckout
        TotalWebViewInitiateCheckoutValueInMicroDollar
        TotalWebViewInitiateCheckoutValueInDollar
        InappInitiateCheckoutCostPerAction
        InappInitiateCheckoutRoas
        TotalInappInitiateCheckout
        TotalInappInitiateCheckoutValueInMicroDollar
        TotalInappInitiateCheckoutValueInDollar
        TotalInappClickInitiateCheckout
        TotalInappClickInitiateCheckoutValueInMicroDollar
        TotalInappClickInitiateCheckoutValueInDollar
        TotalInappEngagementInitiateCheckout
        TotalInappEngagementInitiateCheckoutValueInMicroDollar
        TotalInappEngagementInitiateCheckoutValueInDollar
        TotalInappViewInitiateCheckout
        TotalInappViewInitiateCheckoutValueInMicroDollar
        TotalInappViewInitiateCheckoutValueInDollar
        OfflineInitiateCheckoutCostPerAction
        OfflineInitiateCheckoutRoas
        TotalOfflineInitiateCheckout
        TotalOfflineInitiateCheckoutValueInMicroDollar
        TotalOfflineInitiateCheckoutValueInDollar
        TotalOfflineClickInitiateCheckout
        TotalOfflineClickInitiateCheckoutValueInMicroDollar
        TotalOfflineClickInitiateCheckoutValueInDollar
        TotalOfflineEngagementInitiateCheckout
        TotalOfflineEngagementInitiateCheckoutValueInMicroDollar
        TotalOfflineEngagementInitiateCheckoutValueInDollar
        TotalOfflineViewInitiateCheckout
        TotalOfflineViewInitiateCheckoutValueInMicroDollar
        TotalOfflineViewInitiateCheckoutValueInDollar
        WebSubscribeCostPerAction
        WebSubscribeRoas
        TotalWebSubscribe
        TotalWebSubscribeValueInMicroDollar
        TotalWebSubscribeValueInDollar
        TotalWebClickSubscribe
        TotalWebClickSubscribeValueInMicroDollar
        TotalWebClickSubscribeValueInDollar
        TotalWebEngagementSubscribe
        TotalWebEngagementSubscribeValueInMicroDollar
        TotalWebEngagementSubscribeValueInDollar
        TotalWebViewSubscribe
        TotalWebViewSubscribeValueInMicroDollar
        TotalWebViewSubscribeValueInDollar
        InappSubscribeCostPerAction
        InappSubscribeRoas
        TotalInappSubscribe
        TotalInappSubscribeValueInMicroDollar
        TotalInappSubscribeValueInDollar
        TotalInappClickSubscribe
        TotalInappClickSubscribeValueInMicroDollar
        TotalInappClickSubscribeValueInDollar
        TotalInappEngagementSubscribe
        TotalInappEngagementSubscribeValueInMicroDollar
        TotalInappEngagementSubscribeValueInDollar
        TotalInappViewSubscribe
        TotalInappViewSubscribeValueInMicroDollar
        TotalInappViewSubscribeValueInDollar
        OfflineSubscribeCostPerAction
        OfflineSubscribeRoas
        TotalOfflineSubscribe
        TotalOfflineSubscribeValueInMicroDollar
        TotalOfflineSubscribeValueInDollar
        TotalOfflineClickSubscribe
        TotalOfflineClickSubscribeValueInMicroDollar
        TotalOfflineClickSubscribeValueInDollar
        TotalOfflineEngagementSubscribe
        TotalOfflineEngagementSubscribeValueInMicroDollar
        TotalOfflineEngagementSubscribeValueInDollar
        TotalOfflineViewSubscribe
        TotalOfflineViewSubscribeValueInMicroDollar
        TotalOfflineViewSubscribeValueInDollar
        WebViewContentCostPerAction
        WebViewContentRoas
        TotalWebViewContent
        TotalWebViewContentValueInMicroDollar
        TotalWebViewContentValueInDollar
        TotalWebClickViewContent
        TotalWebClickViewContentValueInMicroDollar
        TotalWebClickViewContentValueInDollar
        TotalWebEngagementViewContent
        TotalWebEngagementViewContentValueInMicroDollar
        TotalWebEngagementViewContentValueInDollar
        TotalWebViewViewContent
        TotalWebViewViewContentValueInMicroDollar
        TotalWebViewViewContentValueInDollar
        InappViewContentCostPerAction
        InappViewContentRoas
        TotalInappViewContent
        TotalInappViewContentValueInMicroDollar
        TotalInappViewContentValueInDollar
        TotalInappClickViewContent
        TotalInappClickViewContentValueInMicroDollar
        TotalInappClickViewContentValueInDollar
        TotalInappEngagementViewContent
        TotalInappEngagementViewContentValueInMicroDollar
        TotalInappEngagementViewContentValueInDollar
        TotalInappViewViewContent
        TotalInappViewViewContentValueInMicroDollar
        TotalInappViewViewContentValueInDollar
        OfflineViewContentCostPerAction
        OfflineViewContentRoas
        TotalOfflineViewContent
        TotalOfflineViewContentValueInMicroDollar
        TotalOfflineViewContentValueInDollar
        TotalOfflineClickViewContent
        TotalOfflineClickViewContentValueInMicroDollar
        TotalOfflineClickViewContentValueInDollar
        TotalOfflineEngagementViewContent
        TotalOfflineEngagementViewContentValueInMicroDollar
        TotalOfflineEngagementViewContentValueInDollar
        TotalOfflineViewViewContent
        TotalOfflineViewViewContentValueInMicroDollar
        TotalOfflineViewViewContentValueInDollar
        IdeaPinPageForward1
        IdeaPinPageForward2
        IdeaPinPageBackward1
        IdeaPinPageBackward2
        TotalIdeaPinPageForward
        TotalIdeaPinPageBackward
        IdeaPinProductTagVisit1
        IdeaPinProductTagVisit2
        TotalIdeaPinProductTagVisit
        CpmInUsDollar
        EcpcInUsDollar
        Leads
        CostPerLead
        QuizStarted
        QuizCompleted
        QuizPinResultOpen
        QuizCompletionRate
        ShowcasePinClickthrough
        ShowcaseSubpageClickthrough
        ShowcaseSubpinClickthrough
        ShowcaseSubpageImpression
        ShowcaseSubpinImpression
        ShowcaseSubpageSwipeLeft
        ShowcaseSubpageSwipeRight
        ShowcaseSubpinSwipeLeft
        ShowcaseSubpinSwipeRight
        ShowcaseSubpageRepin
        ShowcaseSubpinRepin
        ShowcaseSubpageCloseup
        ShowcaseCardThumbnailSwipeForward
        ShowcaseCardThumbnailSwipeBackward
        ShowcaseSubpageCloseupInternal
        ShowcaseCardLanding
        ShowcaseAverageSubpageCloseupPerSession
        TotalCheckoutConversionRate
        TotalViewCategoryConversionRate
        TotalAddToCartConversionRate
        TotalSignupConversionRate
        TotalPageVisitConversionRate
        TotalLeadConversionRate
        TotalSearchConversionRate
        TotalWatchVideoConversionRate
        TotalUnknownConversionRate
        TotalCustomConversionRate
        TotalAddPaymentInfoConversionRate
        TotalAddToWishlistConversionRate
        TotalInitiateCheckoutConversionRate
        TotalSubscribeConversionRate
        TotalViewContentConversionRate
        StandardAdFeedItemId
        IsStandardFeedAd
        TargetingGender
        TargetingCreativeType
        TargetingCountry
        TargetingLocation
        TargetingApptype
        TargetingLocationCode
        TargetingMediaType
        TargetingAgeBucket
        TargetingAudienceMultiplier
        TargetingLocalAdsStoreCode
        TargetingLanguagesInclude
        TargetingLanguagesExclude
        TotalConversionProductQuantity
        TotalWebConversionProductQuantity
        TotalInappConversionProductQuantity
        TotalOfflineConversionProductQuantity
        TotalConversionProductValue
        TotalWebConversionProductValue
        TotalInappConversionProductValue
        TotalOfflineConversionProductValue
        TotalConversionProductValueInMicroUnits
        TotalWebConversionProductValueInMicroUnits
        TotalInappConversionProductValueInMicroUnits
        TotalOfflineConversionProductValueInMicroUnits
        TotalConversionProductValueInUsd
        TotalWebConversionProductValueInUsd
        TotalInappConversionProductValueInUsd
        TotalOfflineConversionProductValueInUsd
        TotalConversionProductValueInMicroUsd
        TotalWebConversionProductValueInMicroUsd
        TotalInappConversionProductValueInMicroUsd
        TotalOfflineConversionProductValueInMicroUsd
        ConversionProductCountUnique
        TotalCheckoutConversionProductQuantity
        TotalCheckoutConversionProductValue
        TotalCheckoutConversionProductValueInMicroUnits
        TotalCheckoutConversionProductValueInUsd
        TotalCheckoutConversionProductValueInMicroUsd
        TotalWebCheckoutConversionProductQuantity
        TotalWebCheckoutConversionProductValue
        TotalWebCheckoutConversionProductValueInMicroUnits
        TotalWebCheckoutConversionProductValueInUsd
        TotalWebCheckoutConversionProductValueInMicroUsd
        TotalInappCheckoutConversionProductQuantity
        TotalInappCheckoutConversionProductValue
        TotalInappCheckoutConversionProductValueInMicroUnits
        TotalInappCheckoutConversionProductValueInUsd
        TotalInappCheckoutConversionProductValueInMicroUsd
        TotalOfflineCheckoutConversionProductQuantity
        TotalOfflineCheckoutConversionProductValue
        TotalOfflineCheckoutConversionProductValueInMicroUnits
        TotalOfflineCheckoutConversionProductValueInUsd
        TotalOfflineCheckoutConversionProductValueInMicroUsd
        TotalAddToCartConversionProductQuantity
        TotalAddToCartConversionProductValue
        TotalAddToCartConversionProductValueInMicroUnits
        TotalAddToCartConversionProductValueInUsd
        TotalAddToCartConversionProductValueInMicroUsd
        TotalWebAddToCartConversionProductQuantity
        TotalWebAddToCartConversionProductValue
        TotalWebAddToCartConversionProductValueInMicroUnits
        TotalWebAddToCartConversionProductValueInUsd
        TotalWebAddToCartConversionProductValueInMicroUsd
        TotalInappAddToCartConversionProductQuantity
        TotalInappAddToCartConversionProductValue
        TotalInappAddToCartConversionProductValueInMicroUnits
        TotalInappAddToCartConversionProductValueInUsd
        TotalInappAddToCartConversionProductValueInMicroUsd
        TotalPageVisitConversionProductQuantity
        TotalPageVisitConversionProductValue
        TotalPageVisitConversionProductValueInMicroUnits
        TotalPageVisitConversionProductValueInUsd
        TotalPageVisitConversionProductValueInMicroUsd
        TotalWebPageVisitConversionProductQuantity
        TotalWebPageVisitConversionProductValue
        TotalWebPageVisitConversionProductValueInMicroUnits
        TotalWebPageVisitConversionProductValueInUsd
        TotalWebPageVisitConversionProductValueInMicroUsd
        TotalSignupConversionProductQuantity
        TotalSignupConversionProductValue
        TotalSignupConversionProductValueInMicroUnits
        TotalSignupConversionProductValueInUsd
        TotalSignupConversionProductValueInMicroUsd
        TotalWebSignupConversionProductQuantity
        TotalWebSignupConversionProductValue
        TotalWebSignupConversionProductValueInMicroUnits
        TotalWebSignupConversionProductValueInUsd
        TotalWebSignupConversionProductValueInMicroUsd
        TotalInappSignupConversionProductQuantity
        TotalInappSignupConversionProductValue
        TotalInappSignupConversionProductValueInMicroUnits
        TotalInappSignupConversionProductValueInUsd
        TotalInappSignupConversionProductValueInMicroUsd
        TotalOfflineSignupConversionProductQuantity
        TotalOfflineSignupConversionProductValue
        TotalOfflineSignupConversionProductValueInMicroUnits
        TotalOfflineSignupConversionProductValueInUsd
        TotalOfflineSignupConversionProductValueInMicroUsd
        TotalWatchVideoConversionProductQuantity
        TotalWatchVideoConversionProductValue
        TotalWatchVideoConversionProductValueInMicroUnits
        TotalWatchVideoConversionProductValueInUsd
        TotalWatchVideoConversionProductValueInMicroUsd
        TotalWebWatchVideoConversionProductQuantity
        TotalWebWatchVideoConversionProductValue
        TotalWebWatchVideoConversionProductValueInMicroUnits
        TotalWebWatchVideoConversionProductValueInUsd
        TotalWebWatchVideoConversionProductValueInMicroUsd
        TotalLeadConversionProductQuantity
        TotalLeadConversionProductValue
        TotalLeadConversionProductValueInMicroUnits
        TotalLeadConversionProductValueInUsd
        TotalLeadConversionProductValueInMicroUsd
        TotalWebLeadConversionProductQuantity
        TotalWebLeadConversionProductValue
        TotalWebLeadConversionProductValueInMicroUnits
        TotalWebLeadConversionProductValueInUsd
        TotalWebLeadConversionProductValueInMicroUsd
        TotalOfflineLeadConversionProductQuantity
        TotalOfflineLeadConversionProductValue
        TotalOfflineLeadConversionProductValueInMicroUnits
        TotalOfflineLeadConversionProductValueInUsd
        TotalOfflineLeadConversionProductValueInMicroUsd
        TotalSearchConversionProductQuantity
        TotalSearchConversionProductValue
        TotalSearchConversionProductValueInMicroUnits
        TotalSearchConversionProductValueInUsd
        TotalSearchConversionProductValueInMicroUsd
        TotalWebSearchConversionProductQuantity
        TotalWebSearchConversionProductValue
        TotalWebSearchConversionProductValueInMicroUnits
        TotalWebSearchConversionProductValueInUsd
        TotalWebSearchConversionProductValueInMicroUsd
        TotalInappSearchConversionProductQuantity
        TotalInappSearchConversionProductValue
        TotalInappSearchConversionProductValueInMicroUnits
        TotalInappSearchConversionProductValueInUsd
        TotalInappSearchConversionProductValueInMicroUsd
        TotalViewCategoryConversionProductQuantity
        TotalViewCategoryConversionProductValue
        TotalViewCategoryConversionProductValueInMicroUnits
        TotalViewCategoryConversionProductValueInUsd
        TotalViewCategoryConversionProductValueInMicroUsd
        TotalWebViewCategoryConversionProductQuantity
        TotalWebViewCategoryConversionProductValue
        TotalWebViewCategoryConversionProductValueInMicroUnits
        TotalWebViewCategoryConversionProductValueInUsd
        TotalWebViewCategoryConversionProductValueInMicroUsd
        TotalCustomConversionProductQuantity
        TotalCustomConversionProductValue
        TotalCustomConversionProductValueInMicroUnits
        TotalCustomConversionProductValueInUsd
        TotalCustomConversionProductValueInMicroUsd
        TotalWebCustomConversionProductQuantity
        TotalWebCustomConversionProductValue
        TotalWebCustomConversionProductValueInMicroUnits
        TotalWebCustomConversionProductValueInUsd
        TotalWebCustomConversionProductValueInMicroUsd
        TotalOfflineCustomConversionProductQuantity
        TotalOfflineCustomConversionProductValue
        TotalOfflineCustomConversionProductValueInMicroUnits
        TotalOfflineCustomConversionProductValueInUsd
        TotalOfflineCustomConversionProductValueInMicroUsd
        TotalUnknownConversionProductQuantity
        TotalUnknownConversionProductValue
        TotalUnknownConversionProductValueInMicroUnits
        TotalUnknownConversionProductValueInUsd
        TotalUnknownConversionProductValueInMicroUsd
        TotalWebUnknownConversionProductQuantity
        TotalWebUnknownConversionProductValue
        TotalWebUnknownConversionProductValueInMicroUnits
        TotalWebUnknownConversionProductValueInUsd
        TotalWebUnknownConversionProductValueInMicroUsd
        TotalInappUnknownConversionProductQuantity
        TotalInappUnknownConversionProductValue
        TotalInappUnknownConversionProductValueInMicroUnits
        TotalInappUnknownConversionProductValueInUsd
        TotalInappUnknownConversionProductValueInMicroUsd
        TotalOfflineUnknownConversionProductQuantity
        TotalOfflineUnknownConversionProductValue
        TotalOfflineUnknownConversionProductValueInMicroUnits
        TotalOfflineUnknownConversionProductValueInUsd
        TotalOfflineUnknownConversionProductValueInMicroUsd
        TotalAddPaymentInfoConversionProductQuantity
        TotalAddPaymentInfoConversionProductValue
        TotalAddPaymentInfoConversionProductValueInMicroUnits
        TotalAddPaymentInfoConversionProductValueInUsd
        TotalAddPaymentInfoConversionProductValueInMicroUsd
        TotalWebAddPaymentInfoConversionProductQuantity
        TotalWebAddPaymentInfoConversionProductValue
        TotalWebAddPaymentInfoConversionProductValueInMicroUnits
        TotalWebAddPaymentInfoConversionProductValueInUsd
        TotalWebAddPaymentInfoConversionProductValueInMicroUsd
        TotalInappAddPaymentInfoConversionProductQuantity
        TotalInappAddPaymentInfoConversionProductValue
        TotalInappAddPaymentInfoConversionProductValueInMicroUnits
        TotalInappAddPaymentInfoConversionProductValueInUsd
        TotalInappAddPaymentInfoConversionProductValueInMicroUsd
        TotalOfflineAddPaymentInfoConversionProductQuantity
        TotalOfflineAddPaymentInfoConversionProductValue
        TotalOfflineAddPaymentInfoConversionProductValueInMicroUnits
        TotalOfflineAddPaymentInfoConversionProductValueInUsd
        TotalOfflineAddPaymentInfoConversionProductValueInMicroUsd
        TotalAddToWishlistConversionProductQuantity
        TotalAddToWishlistConversionProductValue
        TotalAddToWishlistConversionProductValueInMicroUnits
        TotalAddToWishlistConversionProductValueInUsd
        TotalAddToWishlistConversionProductValueInMicroUsd
        TotalWebAddToWishlistConversionProductQuantity
        TotalWebAddToWishlistConversionProductValue
        TotalWebAddToWishlistConversionProductValueInMicroUnits
        TotalWebAddToWishlistConversionProductValueInUsd
        TotalWebAddToWishlistConversionProductValueInMicroUsd
        TotalInappAddToWishlistConversionProductQuantity
        TotalInappAddToWishlistConversionProductValue
        TotalInappAddToWishlistConversionProductValueInMicroUnits
        TotalInappAddToWishlistConversionProductValueInUsd
        TotalInappAddToWishlistConversionProductValueInMicroUsd
        TotalOfflineAddToWishlistConversionProductQuantity
        TotalOfflineAddToWishlistConversionProductValue
        TotalOfflineAddToWishlistConversionProductValueInMicroUnits
        TotalOfflineAddToWishlistConversionProductValueInUsd
        TotalOfflineAddToWishlistConversionProductValueInMicroUsd
        TotalInitiateCheckoutConversionProductQuantity
        TotalInitiateCheckoutConversionProductValue
        TotalInitiateCheckoutConversionProductValueInMicroUnits
        TotalInitiateCheckoutConversionProductValueInUsd
        TotalInitiateCheckoutConversionProductValueInMicroUsd
        TotalWebInitiateCheckoutConversionProductQuantity
        TotalWebInitiateCheckoutConversionProductValue
        TotalWebInitiateCheckoutConversionProductValueInMicroUnits
        TotalWebInitiateCheckoutConversionProductValueInUsd
        TotalWebInitiateCheckoutConversionProductValueInMicroUsd
        TotalInappInitiateCheckoutConversionProductQuantity
        TotalInappInitiateCheckoutConversionProductValue
        TotalInappInitiateCheckoutConversionProductValueInMicroUnits
        TotalInappInitiateCheckoutConversionProductValueInUsd
        TotalInappInitiateCheckoutConversionProductValueInMicroUsd
        TotalOfflineInitiateCheckoutConversionProductQuantity
        TotalOfflineInitiateCheckoutConversionProductValue
        TotalOfflineInitiateCheckoutConversionProductValueInMicroUnits
        TotalOfflineInitiateCheckoutConversionProductValueInUsd
        TotalOfflineInitiateCheckoutConversionProductValueInMicroUsd
        TotalSubscribeConversionProductQuantity
        TotalSubscribeConversionProductValue
        TotalSubscribeConversionProductValueInMicroUnits
        TotalSubscribeConversionProductValueInUsd
        TotalSubscribeConversionProductValueInMicroUsd
        TotalWebSubscribeConversionProductQuantity
        TotalWebSubscribeConversionProductValue
        TotalWebSubscribeConversionProductValueInMicroUnits
        TotalWebSubscribeConversionProductValueInUsd
        TotalWebSubscribeConversionProductValueInMicroUsd
        TotalInappSubscribeConversionProductQuantity
        TotalInappSubscribeConversionProductValue
        TotalInappSubscribeConversionProductValueInMicroUnits
        TotalInappSubscribeConversionProductValueInUsd
        TotalInappSubscribeConversionProductValueInMicroUsd
        TotalOfflineSubscribeConversionProductQuantity
        TotalOfflineSubscribeConversionProductValue
        TotalOfflineSubscribeConversionProductValueInMicroUnits
        TotalOfflineSubscribeConversionProductValueInUsd
        TotalOfflineSubscribeConversionProductValueInMicroUsd
        TotalViewContentConversionProductQuantity
        TotalViewContentConversionProductValue
        TotalViewContentConversionProductValueInMicroUnits
        TotalViewContentConversionProductValueInUsd
        TotalViewContentConversionProductValueInMicroUsd
        TotalWebViewContentConversionProductQuantity
        TotalWebViewContentConversionProductValue
        TotalWebViewContentConversionProductValueInMicroUnits
        TotalWebViewContentConversionProductValueInUsd
        TotalWebViewContentConversionProductValueInMicroUsd
        TotalInappViewContentConversionProductQuantity
        TotalInappViewContentConversionProductValue
        TotalInappViewContentConversionProductValueInMicroUnits
        TotalInappViewContentConversionProductValueInUsd
        TotalInappViewContentConversionProductValueInMicroUsd
        TotalOfflineViewContentConversionProductQuantity
        TotalOfflineViewContentConversionProductValue
        TotalOfflineViewContentConversionProductValueInMicroUnits
        TotalOfflineViewContentConversionProductValueInMicroUsd
        TotalOfflineViewContentConversionProductValueInUsd
        TotalCheckoutConversionProductCountUnique
        TotalWebCheckoutConversionProductCountUnique
        TotalInappCheckoutConversionProductCountUnique
        TotalOfflineCheckoutConversionProductCountUnique
        TotalAddToCartConversionProductCountUnique
        TotalWebAddToCartConversionProductCountUnique
        TotalInappAddToCartConversionProductCountUnique
        TotalPageVisitConversionProductCountUnique
        TotalWebPageVisitConversionProductCountUnique
        TotalSignupConversionProductCountUnique
        TotalWebSignupConversionProductCountUnique
        TotalInappSignupConversionProductCountUnique
        TotalOfflineSignupConversionProductCountUnique
        TotalWatchVideoConversionProductCountUnique
        TotalWebWatchVideoConversionProductCountUnique
        TotalLeadConversionProductCountUnique
        TotalWebLeadConversionProductCountUnique
        TotalOfflineLeadConversionProductCountUnique
        TotalSearchConversionProductCountUnique
        TotalWebSearchConversionProductCountUnique
        TotalInappSearchConversionProductCountUnique
        TotalViewCategoryConversionProductCountUnique
        TotalWebViewCategoryConversionProductCountUnique
        TotalCustomConversionProductCountUnique
        TotalWebCustomConversionProductCountUnique
        TotalOfflineCustomConversionProductCountUnique
        TotalUnknownConversionProductCountUnique
        TotalWebUnknownConversionProductCountUnique
        TotalInappUnknownConversionProductCountUnique
        TotalOfflineUnknownConversionProductCountUnique
        TotalAddPaymentInfoConversionProductCountUnique
        TotalWebAddPaymentInfoConversionProductCountUnique
        TotalInappAddPaymentInfoConversionProductCountUnique
        TotalOfflineAddPaymentInfoConversionProductCountUnique
        TotalAddToWishlistConversionProductCountUnique
        TotalWebAddToWishlistConversionProductCountUnique
        TotalInappAddToWishlistConversionProductCountUnique
        TotalOfflineAddToWishlistConversionProductCountUnique
        TotalInitiateCheckoutConversionProductCountUnique
        TotalWebInitiateCheckoutConversionProductCountUnique
        TotalInappInitiateCheckoutConversionProductCountUnique
        TotalOfflineInitiateCheckoutConversionProductCountUnique
        TotalSubscribeConversionProductCountUnique
        TotalWebSubscribeConversionProductCountUnique
        TotalInappSubscribeConversionProductCountUnique
        TotalOfflineSubscribeConversionProductCountUnique
        TotalViewContentConversionProductCountUnique
        TotalWebViewContentConversionProductCountUnique
        TotalInappViewContentConversionProductCountUnique
        TotalOfflineViewContentConversionProductCountUnique
        GenAiImageSignature
        GenAiImageUrl
        OriginalImageSignature
        OriginalImageUrl
        GenAiGenerationDate
        IsRegenerating
        GenAiImageCount
        AdvertiserTimeZone
        EngagementContact1
        ClickContact1
        ViewContact1
        EngagementContactValueInMicroDollar1
        ClickContactValueInMicroDollar1
        ViewContactValueInMicroDollar1
        EngagementContactQuantity1
        ClickContactQuantity1
        ViewContactQuantity1
        EngagementContact2
        ClickContact2
        ViewContact2
        EngagementContactValueInMicroDollar2
        ClickContactValueInMicroDollar2
        ViewContactValueInMicroDollar2
        EngagementContactQuantity2
        ClickContactQuantity2
        ViewContactQuantity2
        TotalEngagementContact
        TotalClickContact
        TotalViewContact
        TotalEngagementContactValueInMicroDollar
        TotalEngagementContactValueInDollar
        TotalClickContactValueInMicroDollar
        TotalClickContactValueInDollar
        TotalViewContactValueInMicroDollar
        TotalViewContactValueInDollar
        TotalEngagementContactQuantity
        TotalClickContactQuantity
        TotalViewContactQuantity
        TotalContact
        TotalContactValueInMicroDollar
        AverageContactValueInMicroDollar
        AverageContactValueInMicroUsDollar
        TotalContactValueInMicroUsDollar
        TotalContactQuantity
        TotalContactValueInDollar
        ContactCostPerAction
        ContactCostPerActionInUsDollar
        ContactRoas
        TotalContactConversionRate
        WebContactCostPerAction
        WebContactRoas
        TotalWebContact
        TotalWebContactValueInMicroDollar
        TotalWebContactValueInDollar
        TotalWebClickContact
        TotalWebClickContactValueInMicroDollar
        TotalWebClickContactValueInDollar
        TotalWebEngagementContact
        TotalWebEngagementContactValueInMicroDollar
        TotalWebEngagementContactValueInDollar
        TotalWebViewContact
        TotalWebViewContactValueInMicroDollar
        TotalWebViewContactValueInDollar
        InappContactCostPerAction
        InappContactRoas
        TotalInappContact
        TotalInappContactValueInMicroDollar
        TotalInappContactValueInDollar
        TotalInappClickContact
        TotalInappClickContactValueInMicroDollar
        TotalInappClickContactValueInDollar
        TotalInappEngagementContact
        TotalInappEngagementContactValueInMicroDollar
        TotalInappEngagementContactValueInDollar
        TotalInappViewContact
        TotalInappViewContactValueInMicroDollar
        TotalInappViewContactValueInDollar
        OfflineContactCostPerAction
        OfflineContactRoas
        TotalOfflineContact
        TotalOfflineContactValueInMicroDollar
        TotalOfflineContactValueInDollar
        TotalOfflineClickContact
        TotalOfflineClickContactValueInMicroDollar
        TotalOfflineClickContactValueInDollar
        TotalOfflineEngagementContact
        TotalOfflineEngagementContactValueInMicroDollar
        TotalOfflineEngagementContactValueInDollar
        TotalOfflineViewContact
        TotalOfflineViewContactValueInMicroDollar
        TotalOfflineViewContactValueInDollar
        TotalContactConversionProductCountUnique
        TotalWebContactConversionProductCountUnique
        TotalInappContactConversionProductCountUnique
        TotalOfflineContactConversionProductCountUnique
        TotalContactConversionProductQuantity
        TotalContactConversionProductValue
        TotalContactConversionProductValueInMicroUnits
        TotalContactConversionProductValueInUsd
        TotalContactConversionProductValueInMicroUsd
        TotalWebContactConversionProductQuantity
        TotalWebContactConversionProductValue
        TotalWebContactConversionProductValueInMicroUnits
        TotalWebContactConversionProductValueInUsd
        TotalWebContactConversionProductValueInMicroUsd
        TotalInappContactConversionProductQuantity
        TotalInappContactConversionProductValue
        TotalInappContactConversionProductValueInMicroUnits
        TotalInappContactConversionProductValueInUsd
        TotalInappContactConversionProductValueInMicroUsd
        TotalOfflineContactConversionProductQuantity
        TotalOfflineContactConversionProductValue
        TotalOfflineContactConversionProductValueInMicroUnits
        TotalOfflineContactConversionProductValueInUsd
        TotalOfflineContactConversionProductValueInMicroUsd
        EngagementSchedule1
        ClickSchedule1
        ViewSchedule1
        EngagementScheduleValueInMicroDollar1
        ClickScheduleValueInMicroDollar1
        ViewScheduleValueInMicroDollar1
        EngagementScheduleQuantity1
        ClickScheduleQuantity1
        ViewScheduleQuantity1
        EngagementSchedule2
        ClickSchedule2
        ViewSchedule2
        EngagementScheduleValueInMicroDollar2
        ClickScheduleValueInMicroDollar2
        ViewScheduleValueInMicroDollar2
        EngagementScheduleQuantity2
        ClickScheduleQuantity2
        ViewScheduleQuantity2
        TotalEngagementSchedule
        TotalClickSchedule
        TotalViewSchedule
        TotalEngagementScheduleValueInMicroDollar
        TotalEngagementScheduleValueInDollar
        TotalClickScheduleValueInMicroDollar
        TotalClickScheduleValueInDollar
        TotalViewScheduleValueInMicroDollar
        TotalViewScheduleValueInDollar
        TotalEngagementScheduleQuantity
        TotalClickScheduleQuantity
        TotalViewScheduleQuantity
        TotalSchedule
        TotalScheduleValueInMicroDollar
        AverageScheduleValueInMicroDollar
        AverageScheduleValueInMicroUsDollar
        TotalScheduleValueInMicroUsDollar
        TotalScheduleQuantity
        TotalScheduleValueInDollar
        ScheduleCostPerAction
        ScheduleCostPerActionInUsDollar
        ScheduleRoas
        TotalScheduleConversionRate
        WebScheduleCostPerAction
        WebScheduleRoas
        TotalWebSchedule
        TotalWebScheduleValueInMicroDollar
        TotalWebScheduleValueInDollar
        TotalWebClickSchedule
        TotalWebClickScheduleValueInMicroDollar
        TotalWebClickScheduleValueInDollar
        TotalWebEngagementSchedule
        TotalWebEngagementScheduleValueInMicroDollar
        TotalWebEngagementScheduleValueInDollar
        TotalWebViewSchedule
        TotalWebViewScheduleValueInMicroDollar
        TotalWebViewScheduleValueInDollar
        InappScheduleCostPerAction
        InappScheduleRoas
        TotalInappSchedule
        TotalInappScheduleValueInMicroDollar
        TotalInappScheduleValueInDollar
        TotalInappClickSchedule
        TotalInappClickScheduleValueInMicroDollar
        TotalInappClickScheduleValueInDollar
        TotalInappEngagementSchedule
        TotalInappEngagementScheduleValueInMicroDollar
        TotalInappEngagementScheduleValueInDollar
        TotalInappViewSchedule
        TotalInappViewScheduleValueInMicroDollar
        TotalInappViewScheduleValueInDollar
        OfflineScheduleCostPerAction
        OfflineScheduleRoas
        TotalOfflineSchedule
        TotalOfflineScheduleValueInMicroDollar
        TotalOfflineScheduleValueInDollar
        TotalOfflineClickSchedule
        TotalOfflineClickScheduleValueInMicroDollar
        TotalOfflineClickScheduleValueInDollar
        TotalOfflineEngagementSchedule
        TotalOfflineEngagementScheduleValueInMicroDollar
        TotalOfflineEngagementScheduleValueInDollar
        TotalOfflineViewSchedule
        TotalOfflineViewScheduleValueInMicroDollar
        TotalOfflineViewScheduleValueInDollar
        TotalScheduleConversionProductCountUnique
        TotalWebScheduleConversionProductCountUnique
        TotalInappScheduleConversionProductCountUnique
        TotalOfflineScheduleConversionProductCountUnique
        TotalScheduleConversionProductQuantity
        TotalScheduleConversionProductValue
        TotalScheduleConversionProductValueInMicroUnits
        TotalScheduleConversionProductValueInUsd
        TotalScheduleConversionProductValueInMicroUsd
        TotalWebScheduleConversionProductQuantity
        TotalWebScheduleConversionProductValue
        TotalWebScheduleConversionProductValueInMicroUnits
        TotalWebScheduleConversionProductValueInUsd
        TotalWebScheduleConversionProductValueInMicroUsd
        TotalInappScheduleConversionProductQuantity
        TotalInappScheduleConversionProductValue
        TotalInappScheduleConversionProductValueInMicroUnits
        TotalInappScheduleConversionProductValueInUsd
        TotalInappScheduleConversionProductValueInMicroUsd
        TotalOfflineScheduleConversionProductQuantity
        TotalOfflineScheduleConversionProductValue
        TotalOfflineScheduleConversionProductValueInMicroUnits
        TotalOfflineScheduleConversionProductValueInUsd
        TotalOfflineScheduleConversionProductValueInMicroUsd
        EngagementFindLocation1
        ClickFindLocation1
        ViewFindLocation1
        EngagementFindLocationValueInMicroDollar1
        ClickFindLocationValueInMicroDollar1
        ViewFindLocationValueInMicroDollar1
        EngagementFindLocationQuantity1
        ClickFindLocationQuantity1
        ViewFindLocationQuantity1
        EngagementFindLocation2
        ClickFindLocation2
        ViewFindLocation2
        EngagementFindLocationValueInMicroDollar2
        ClickFindLocationValueInMicroDollar2
        ViewFindLocationValueInMicroDollar2
        EngagementFindLocationQuantity2
        ClickFindLocationQuantity2
        ViewFindLocationQuantity2
        TotalEngagementFindLocation
        TotalClickFindLocation
        TotalViewFindLocation
        TotalEngagementFindLocationValueInMicroDollar
        TotalEngagementFindLocationValueInDollar
        TotalClickFindLocationValueInMicroDollar
        TotalClickFindLocationValueInDollar
        TotalViewFindLocationValueInMicroDollar
        TotalViewFindLocationValueInDollar
        TotalEngagementFindLocationQuantity
        TotalClickFindLocationQuantity
        TotalViewFindLocationQuantity
        TotalFindLocation
        TotalFindLocationValueInMicroDollar
        AverageFindLocationValueInMicroDollar
        AverageFindLocationValueInMicroUsDollar
        TotalFindLocationValueInMicroUsDollar
        TotalFindLocationQuantity
        TotalFindLocationValueInDollar
        FindLocationCostPerAction
        FindLocationCostPerActionInUsDollar
        FindLocationRoas
        TotalFindLocationConversionRate
        WebFindLocationCostPerAction
        WebFindLocationRoas
        TotalWebFindLocation
        TotalWebFindLocationValueInMicroDollar
        TotalWebFindLocationValueInDollar
        TotalWebClickFindLocation
        TotalWebClickFindLocationValueInMicroDollar
        TotalWebClickFindLocationValueInDollar
        TotalWebEngagementFindLocation
        TotalWebEngagementFindLocationValueInMicroDollar
        TotalWebEngagementFindLocationValueInDollar
        TotalWebViewFindLocation
        TotalWebViewFindLocationValueInMicroDollar
        TotalWebViewFindLocationValueInDollar
        InappFindLocationCostPerAction
        InappFindLocationRoas
        TotalInappFindLocation
        TotalInappFindLocationValueInMicroDollar
        TotalInappFindLocationValueInDollar
        TotalInappClickFindLocation
        TotalInappClickFindLocationValueInMicroDollar
        TotalInappClickFindLocationValueInDollar
        TotalInappEngagementFindLocation
        TotalInappEngagementFindLocationValueInMicroDollar
        TotalInappEngagementFindLocationValueInDollar
        TotalInappViewFindLocation
        TotalInappViewFindLocationValueInMicroDollar
        TotalInappViewFindLocationValueInDollar
        OfflineFindLocationCostPerAction
        OfflineFindLocationRoas
        TotalOfflineFindLocation
        TotalOfflineFindLocationValueInMicroDollar
        TotalOfflineFindLocationValueInDollar
        TotalOfflineClickFindLocation
        TotalOfflineClickFindLocationValueInMicroDollar
        TotalOfflineClickFindLocationValueInDollar
        TotalOfflineEngagementFindLocation
        TotalOfflineEngagementFindLocationValueInMicroDollar
        TotalOfflineEngagementFindLocationValueInDollar
        TotalOfflineViewFindLocation
        TotalOfflineViewFindLocationValueInMicroDollar
        TotalOfflineViewFindLocationValueInDollar
        TotalFindLocationConversionProductCountUnique
        TotalWebFindLocationConversionProductCountUnique
        TotalInappFindLocationConversionProductCountUnique
        TotalOfflineFindLocationConversionProductCountUnique
        TotalFindLocationConversionProductQuantity
        TotalFindLocationConversionProductValue
        TotalFindLocationConversionProductValueInMicroUnits
        TotalFindLocationConversionProductValueInUsd
        TotalFindLocationConversionProductValueInMicroUsd
        TotalWebFindLocationConversionProductQuantity
        TotalWebFindLocationConversionProductValue
        TotalWebFindLocationConversionProductValueInMicroUnits
        TotalWebFindLocationConversionProductValueInUsd
        TotalWebFindLocationConversionProductValueInMicroUsd
        TotalInappFindLocationConversionProductQuantity
        TotalInappFindLocationConversionProductValue
        TotalInappFindLocationConversionProductValueInMicroUnits
        TotalInappFindLocationConversionProductValueInUsd
        TotalInappFindLocationConversionProductValueInMicroUsd
        TotalOfflineFindLocationConversionProductQuantity
        TotalOfflineFindLocationConversionProductValue
        TotalOfflineFindLocationConversionProductValueInMicroUnits
        TotalOfflineFindLocationConversionProductValueInUsd
        TotalOfflineFindLocationConversionProductValueInMicroUsd
        EngagementCustomizeProduct1
        ClickCustomizeProduct1
        ViewCustomizeProduct1
        EngagementCustomizeProductValueInMicroDollar1
        ClickCustomizeProductValueInMicroDollar1
        ViewCustomizeProductValueInMicroDollar1
        EngagementCustomizeProductQuantity1
        ClickCustomizeProductQuantity1
        ViewCustomizeProductQuantity1
        EngagementCustomizeProduct2
        ClickCustomizeProduct2
        ViewCustomizeProduct2
        EngagementCustomizeProductValueInMicroDollar2
        ClickCustomizeProductValueInMicroDollar2
        ViewCustomizeProductValueInMicroDollar2
        EngagementCustomizeProductQuantity2
        ClickCustomizeProductQuantity2
        ViewCustomizeProductQuantity2
        TotalEngagementCustomizeProduct
        TotalClickCustomizeProduct
        TotalViewCustomizeProduct
        TotalEngagementCustomizeProductValueInMicroDollar
        TotalEngagementCustomizeProductValueInDollar
        TotalClickCustomizeProductValueInMicroDollar
        TotalClickCustomizeProductValueInDollar
        TotalViewCustomizeProductValueInMicroDollar
        TotalViewCustomizeProductValueInDollar
        TotalEngagementCustomizeProductQuantity
        TotalClickCustomizeProductQuantity
        TotalViewCustomizeProductQuantity
        TotalCustomizeProduct
        TotalCustomizeProductValueInMicroDollar
        AverageCustomizeProductValueInMicroDollar
        AverageCustomizeProductValueInMicroUsDollar
        TotalCustomizeProductValueInMicroUsDollar
        TotalCustomizeProductQuantity
        TotalCustomizeProductValueInDollar
        CustomizeProductCostPerAction
        CustomizeProductCostPerActionInUsDollar
        CustomizeProductRoas
        TotalCustomizeProductConversionRate
        WebCustomizeProductCostPerAction
        WebCustomizeProductRoas
        TotalWebCustomizeProduct
        TotalWebCustomizeProductValueInMicroDollar
        TotalWebCustomizeProductValueInDollar
        TotalWebClickCustomizeProduct
        TotalWebClickCustomizeProductValueInMicroDollar
        TotalWebClickCustomizeProductValueInDollar
        TotalWebEngagementCustomizeProduct
        TotalWebEngagementCustomizeProductValueInMicroDollar
        TotalWebEngagementCustomizeProductValueInDollar
        TotalWebViewCustomizeProduct
        TotalWebViewCustomizeProductValueInMicroDollar
        TotalWebViewCustomizeProductValueInDollar
        InappCustomizeProductCostPerAction
        InappCustomizeProductRoas
        TotalInappCustomizeProduct
        TotalInappCustomizeProductValueInMicroDollar
        TotalInappCustomizeProductValueInDollar
        TotalInappClickCustomizeProduct
        TotalInappClickCustomizeProductValueInMicroDollar
        TotalInappClickCustomizeProductValueInDollar
        TotalInappEngagementCustomizeProduct
        TotalInappEngagementCustomizeProductValueInMicroDollar
        TotalInappEngagementCustomizeProductValueInDollar
        TotalInappViewCustomizeProduct
        TotalInappViewCustomizeProductValueInMicroDollar
        TotalInappViewCustomizeProductValueInDollar
        OfflineCustomizeProductCostPerAction
        OfflineCustomizeProductRoas
        TotalOfflineCustomizeProduct
        TotalOfflineCustomizeProductValueInMicroDollar
        TotalOfflineCustomizeProductValueInDollar
        TotalOfflineClickCustomizeProduct
        TotalOfflineClickCustomizeProductValueInMicroDollar
        TotalOfflineClickCustomizeProductValueInDollar
        TotalOfflineEngagementCustomizeProduct
        TotalOfflineEngagementCustomizeProductValueInMicroDollar
        TotalOfflineEngagementCustomizeProductValueInDollar
        TotalOfflineViewCustomizeProduct
        TotalOfflineViewCustomizeProductValueInMicroDollar
        TotalOfflineViewCustomizeProductValueInDollar
        TotalCustomizeProductConversionProductCountUnique
        TotalWebCustomizeProductConversionProductCountUnique
        TotalInappCustomizeProductConversionProductCountUnique
        TotalOfflineCustomizeProductConversionProductCountUnique
        TotalCustomizeProductConversionProductQuantity
        TotalCustomizeProductConversionProductValue
        TotalCustomizeProductConversionProductValueInMicroUnits
        TotalCustomizeProductConversionProductValueInUsd
        TotalCustomizeProductConversionProductValueInMicroUsd
        TotalWebCustomizeProductConversionProductQuantity
        TotalWebCustomizeProductConversionProductValue
        TotalWebCustomizeProductConversionProductValueInMicroUnits
        TotalWebCustomizeProductConversionProductValueInUsd
        TotalWebCustomizeProductConversionProductValueInMicroUsd
        TotalInappCustomizeProductConversionProductQuantity
        TotalInappCustomizeProductConversionProductValue
        TotalInappCustomizeProductConversionProductValueInMicroUnits
        TotalInappCustomizeProductConversionProductValueInUsd
        TotalInappCustomizeProductConversionProductValueInMicroUsd
        TotalOfflineCustomizeProductConversionProductQuantity
        TotalOfflineCustomizeProductConversionProductValue
        TotalOfflineCustomizeProductConversionProductValueInMicroUnits
        TotalOfflineCustomizeProductConversionProductValueInUsd
        TotalOfflineCustomizeProductConversionProductValueInMicroUsd
        EngagementSubmitApplication1
        ClickSubmitApplication1
        ViewSubmitApplication1
        EngagementSubmitApplicationValueInMicroDollar1
        ClickSubmitApplicationValueInMicroDollar1
        ViewSubmitApplicationValueInMicroDollar1
        EngagementSubmitApplicationQuantity1
        ClickSubmitApplicationQuantity1
        ViewSubmitApplicationQuantity1
        EngagementSubmitApplication2
        ClickSubmitApplication2
        ViewSubmitApplication2
        EngagementSubmitApplicationValueInMicroDollar2
        ClickSubmitApplicationValueInMicroDollar2
        ViewSubmitApplicationValueInMicroDollar2
        EngagementSubmitApplicationQuantity2
        ClickSubmitApplicationQuantity2
        ViewSubmitApplicationQuantity2
        TotalEngagementSubmitApplication
        TotalClickSubmitApplication
        TotalViewSubmitApplication
        TotalEngagementSubmitApplicationValueInMicroDollar
        TotalEngagementSubmitApplicationValueInDollar
        TotalClickSubmitApplicationValueInMicroDollar
        TotalClickSubmitApplicationValueInDollar
        TotalViewSubmitApplicationValueInMicroDollar
        TotalViewSubmitApplicationValueInDollar
        TotalEngagementSubmitApplicationQuantity
        TotalClickSubmitApplicationQuantity
        TotalViewSubmitApplicationQuantity
        TotalSubmitApplication
        TotalSubmitApplicationValueInMicroDollar
        AverageSubmitApplicationValueInMicroDollar
        AverageSubmitApplicationValueInMicroUsDollar
        TotalSubmitApplicationValueInMicroUsDollar
        TotalSubmitApplicationQuantity
        TotalSubmitApplicationValueInDollar
        SubmitApplicationCostPerAction
        SubmitApplicationCostPerActionInUsDollar
        SubmitApplicationRoas
        TotalSubmitApplicationConversionRate
        WebSubmitApplicationCostPerAction
        WebSubmitApplicationRoas
        TotalWebSubmitApplication
        TotalWebSubmitApplicationValueInMicroDollar
        TotalWebSubmitApplicationValueInDollar
        TotalWebClickSubmitApplication
        TotalWebClickSubmitApplicationValueInMicroDollar
        TotalWebClickSubmitApplicationValueInDollar
        TotalWebEngagementSubmitApplication
        TotalWebEngagementSubmitApplicationValueInMicroDollar
        TotalWebEngagementSubmitApplicationValueInDollar
        TotalWebViewSubmitApplication
        TotalWebViewSubmitApplicationValueInMicroDollar
        TotalWebViewSubmitApplicationValueInDollar
        InappSubmitApplicationCostPerAction
        InappSubmitApplicationRoas
        TotalInappSubmitApplication
        TotalInappSubmitApplicationValueInMicroDollar
        TotalInappSubmitApplicationValueInDollar
        TotalInappClickSubmitApplication
        TotalInappClickSubmitApplicationValueInMicroDollar
        TotalInappClickSubmitApplicationValueInDollar
        TotalInappEngagementSubmitApplication
        TotalInappEngagementSubmitApplicationValueInMicroDollar
        TotalInappEngagementSubmitApplicationValueInDollar
        TotalInappViewSubmitApplication
        TotalInappViewSubmitApplicationValueInMicroDollar
        TotalInappViewSubmitApplicationValueInDollar
        OfflineSubmitApplicationCostPerAction
        OfflineSubmitApplicationRoas
        TotalOfflineSubmitApplication
        TotalOfflineSubmitApplicationValueInMicroDollar
        TotalOfflineSubmitApplicationValueInDollar
        TotalOfflineClickSubmitApplication
        TotalOfflineClickSubmitApplicationValueInMicroDollar
        TotalOfflineClickSubmitApplicationValueInDollar
        TotalOfflineEngagementSubmitApplication
        TotalOfflineEngagementSubmitApplicationValueInMicroDollar
        TotalOfflineEngagementSubmitApplicationValueInDollar
        TotalOfflineViewSubmitApplication
        TotalOfflineViewSubmitApplicationValueInMicroDollar
        TotalOfflineViewSubmitApplicationValueInDollar
        TotalSubmitApplicationConversionProductCountUnique
        TotalWebSubmitApplicationConversionProductCountUnique
        TotalInappSubmitApplicationConversionProductCountUnique
        TotalOfflineSubmitApplicationConversionProductCountUnique
        TotalSubmitApplicationConversionProductQuantity
        TotalSubmitApplicationConversionProductValue
        TotalSubmitApplicationConversionProductValueInMicroUnits
        TotalSubmitApplicationConversionProductValueInUsd
        TotalSubmitApplicationConversionProductValueInMicroUsd
        TotalWebSubmitApplicationConversionProductQuantity
        TotalWebSubmitApplicationConversionProductValue
        TotalWebSubmitApplicationConversionProductValueInMicroUnits
        TotalWebSubmitApplicationConversionProductValueInUsd
        TotalWebSubmitApplicationConversionProductValueInMicroUsd
        TotalInappSubmitApplicationConversionProductQuantity
        TotalInappSubmitApplicationConversionProductValue
        TotalInappSubmitApplicationConversionProductValueInMicroUnits
        TotalInappSubmitApplicationConversionProductValueInUsd
        TotalInappSubmitApplicationConversionProductValueInMicroUsd
        TotalOfflineSubmitApplicationConversionProductQuantity
        TotalOfflineSubmitApplicationConversionProductValue
        TotalOfflineSubmitApplicationConversionProductValueInMicroUnits
        TotalOfflineSubmitApplicationConversionProductValueInUsd
        TotalOfflineSubmitApplicationConversionProductValueInMicroUsd
        EngagementStartTrial1
        ClickStartTrial1
        ViewStartTrial1
        EngagementStartTrialValueInMicroDollar1
        ClickStartTrialValueInMicroDollar1
        ViewStartTrialValueInMicroDollar1
        EngagementStartTrialQuantity1
        ClickStartTrialQuantity1
        ViewStartTrialQuantity1
        EngagementStartTrial2
        ClickStartTrial2
        ViewStartTrial2
        EngagementStartTrialValueInMicroDollar2
        ClickStartTrialValueInMicroDollar2
        ViewStartTrialValueInMicroDollar2
        EngagementStartTrialQuantity2
        ClickStartTrialQuantity2
        ViewStartTrialQuantity2
        TotalEngagementStartTrial
        TotalClickStartTrial
        TotalViewStartTrial
        TotalEngagementStartTrialValueInMicroDollar
        TotalEngagementStartTrialValueInDollar
        TotalClickStartTrialValueInMicroDollar
        TotalClickStartTrialValueInDollar
        TotalViewStartTrialValueInMicroDollar
        TotalViewStartTrialValueInDollar
        TotalEngagementStartTrialQuantity
        TotalClickStartTrialQuantity
        TotalViewStartTrialQuantity
        TotalStartTrial
        TotalStartTrialValueInMicroDollar
        AverageStartTrialValueInMicroDollar
        AverageStartTrialValueInMicroUsDollar
        TotalStartTrialValueInMicroUsDollar
        TotalStartTrialQuantity
        TotalStartTrialValueInDollar
        StartTrialCostPerAction
        StartTrialCostPerActionInUsDollar
        StartTrialRoas
        TotalStartTrialConversionRate
        WebStartTrialCostPerAction
        WebStartTrialRoas
        TotalWebStartTrial
        TotalWebStartTrialValueInMicroDollar
        TotalWebStartTrialValueInDollar
        TotalWebClickStartTrial
        TotalWebClickStartTrialValueInMicroDollar
        TotalWebClickStartTrialValueInDollar
        TotalWebEngagementStartTrial
        TotalWebEngagementStartTrialValueInMicroDollar
        TotalWebEngagementStartTrialValueInDollar
        TotalWebViewStartTrial
        TotalWebViewStartTrialValueInMicroDollar
        TotalWebViewStartTrialValueInDollar
        InappStartTrialCostPerAction
        InappStartTrialRoas
        TotalInappStartTrial
        TotalInappStartTrialValueInMicroDollar
        TotalInappStartTrialValueInDollar
        TotalInappClickStartTrial
        TotalInappClickStartTrialValueInMicroDollar
        TotalInappClickStartTrialValueInDollar
        TotalInappEngagementStartTrial
        TotalInappEngagementStartTrialValueInMicroDollar
        TotalInappEngagementStartTrialValueInDollar
        TotalInappViewStartTrial
        TotalInappViewStartTrialValueInMicroDollar
        TotalInappViewStartTrialValueInDollar
        OfflineStartTrialCostPerAction
        OfflineStartTrialRoas
        TotalOfflineStartTrial
        TotalOfflineStartTrialValueInMicroDollar
        TotalOfflineStartTrialValueInDollar
        TotalOfflineClickStartTrial
        TotalOfflineClickStartTrialValueInMicroDollar
        TotalOfflineClickStartTrialValueInDollar
        TotalOfflineEngagementStartTrial
        TotalOfflineEngagementStartTrialValueInMicroDollar
        TotalOfflineEngagementStartTrialValueInDollar
        TotalOfflineViewStartTrial
        TotalOfflineViewStartTrialValueInMicroDollar
        TotalOfflineViewStartTrialValueInDollar
        TotalStartTrialConversionProductCountUnique
        TotalWebStartTrialConversionProductCountUnique
        TotalInappStartTrialConversionProductCountUnique
        TotalOfflineStartTrialConversionProductCountUnique
        TotalStartTrialConversionProductQuantity
        TotalStartTrialConversionProductValue
        TotalStartTrialConversionProductValueInMicroUnits
        TotalStartTrialConversionProductValueInUsd
        TotalStartTrialConversionProductValueInMicroUsd
        TotalWebStartTrialConversionProductQuantity
        TotalWebStartTrialConversionProductValue
        TotalWebStartTrialConversionProductValueInMicroUnits
        TotalWebStartTrialConversionProductValueInUsd
        TotalWebStartTrialConversionProductValueInMicroUsd
        TotalInappStartTrialConversionProductQuantity
        TotalInappStartTrialConversionProductValue
        TotalInappStartTrialConversionProductValueInMicroUnits
        TotalInappStartTrialConversionProductValueInUsd
        TotalInappStartTrialConversionProductValueInMicroUsd
        TotalOfflineStartTrialConversionProductQuantity
        TotalOfflineStartTrialConversionProductValue
        TotalOfflineStartTrialConversionProductValueInMicroUnits
        TotalOfflineStartTrialConversionProductValueInUsd
        TotalOfflineStartTrialConversionProductValueInMicroUsd
        EngagementAppOpen1
        ClickAppOpen1
        ViewAppOpen1
        EngagementAppOpenValueInMicroDollar1
        ClickAppOpenValueInMicroDollar1
        ViewAppOpenValueInMicroDollar1
        EngagementAppOpenQuantity1
        ClickAppOpenQuantity1
        ViewAppOpenQuantity1
        EngagementAppOpen2
        ClickAppOpen2
        ViewAppOpen2
        EngagementAppOpenValueInMicroDollar2
        ClickAppOpenValueInMicroDollar2
        ViewAppOpenValueInMicroDollar2
        EngagementAppOpenQuantity2
        ClickAppOpenQuantity2
        ViewAppOpenQuantity2
        TotalEngagementAppOpen
        TotalClickAppOpen
        TotalViewAppOpen
        TotalEngagementAppOpenValueInMicroDollar
        TotalEngagementAppOpenValueInDollar
        TotalClickAppOpenValueInMicroDollar
        TotalClickAppOpenValueInDollar
        TotalViewAppOpenValueInMicroDollar
        TotalViewAppOpenValueInDollar
        TotalEngagementAppOpenQuantity
        TotalClickAppOpenQuantity
        TotalViewAppOpenQuantity
        TotalAppOpen
        TotalAppOpenValueInMicroDollar
        AverageAppOpenValueInMicroDollar
        AverageAppOpenValueInMicroUsDollar
        TotalAppOpenValueInMicroUsDollar
        TotalAppOpenQuantity
        TotalAppOpenValueInDollar
        AppOpenCostPerAction
        AppOpenCostPerActionInUsDollar
        AppOpenRoas
        TotalAppOpenConversionRate
        WebAppOpenCostPerAction
        WebAppOpenRoas
        TotalWebAppOpen
        TotalWebAppOpenValueInMicroDollar
        TotalWebAppOpenValueInDollar
        TotalWebClickAppOpen
        TotalWebClickAppOpenValueInMicroDollar
        TotalWebClickAppOpenValueInDollar
        TotalWebEngagementAppOpen
        TotalWebEngagementAppOpenValueInMicroDollar
        TotalWebEngagementAppOpenValueInDollar
        TotalWebViewAppOpen
        TotalWebViewAppOpenValueInMicroDollar
        TotalWebViewAppOpenValueInDollar
        InappAppOpenCostPerAction
        InappAppOpenRoas
        TotalInappAppOpen
        TotalInappAppOpenValueInMicroDollar
        TotalInappAppOpenValueInDollar
        TotalInappClickAppOpen
        TotalInappClickAppOpenValueInMicroDollar
        TotalInappClickAppOpenValueInDollar
        TotalInappEngagementAppOpen
        TotalInappEngagementAppOpenValueInMicroDollar
        TotalInappEngagementAppOpenValueInDollar
        TotalInappViewAppOpen
        TotalInappViewAppOpenValueInMicroDollar
        TotalInappViewAppOpenValueInDollar
        OfflineAppOpenCostPerAction
        OfflineAppOpenRoas
        TotalOfflineAppOpen
        TotalOfflineAppOpenValueInMicroDollar
        TotalOfflineAppOpenValueInDollar
        TotalOfflineClickAppOpen
        TotalOfflineClickAppOpenValueInMicroDollar
        TotalOfflineClickAppOpenValueInDollar
        TotalOfflineEngagementAppOpen
        TotalOfflineEngagementAppOpenValueInMicroDollar
        TotalOfflineEngagementAppOpenValueInDollar
        TotalOfflineViewAppOpen
        TotalOfflineViewAppOpenValueInMicroDollar
        TotalOfflineViewAppOpenValueInDollar
        TotalAppOpenConversionProductCountUnique
        TotalWebAppOpenConversionProductCountUnique
        TotalInappAppOpenConversionProductCountUnique
        TotalOfflineAppOpenConversionProductCountUnique
        TotalAppOpenConversionProductQuantity
        TotalAppOpenConversionProductValue
        TotalAppOpenConversionProductValueInMicroUnits
        TotalAppOpenConversionProductValueInUsd
        TotalAppOpenConversionProductValueInMicroUsd
        TotalWebAppOpenConversionProductQuantity
        TotalWebAppOpenConversionProductValue
        TotalWebAppOpenConversionProductValueInMicroUnits
        TotalWebAppOpenConversionProductValueInUsd
        TotalWebAppOpenConversionProductValueInMicroUsd
        TotalInappAppOpenConversionProductQuantity
        TotalInappAppOpenConversionProductValue
        TotalInappAppOpenConversionProductValueInMicroUnits
        TotalInappAppOpenConversionProductValueInUsd
        TotalInappAppOpenConversionProductValueInMicroUsd
        TotalOfflineAppOpenConversionProductQuantity
        TotalOfflineAppOpenConversionProductValue
        TotalOfflineAppOpenConversionProductValueInMicroUnits
        TotalOfflineAppOpenConversionProductValueInUsd
        TotalOfflineAppOpenConversionProductValueInMicroUsd
        
    #tag EndEnum

    #tag Enum, Name = Conversion_report_time_typeEnum, Type = Integer, Flags = &h0
        
        TimeOfAdAction
        TimeOfConversion
        
    #tag EndEnum

    #tag Enum, Name = Creation_sourceEnum, Type = Integer, Flags = &h0
        
        AdsApi
        AdsManagerReportingPage
        AdsManagerReportBuilder
        
    #tag EndEnum

    #tag Enum, Name = Ingestion_sourcesEnum, Type = Integer, Flags = &h0
        
        Tag
        Mmp
        FileUpload
        ConversionsApi
        Native
        
    #tag EndEnum

    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        Unspecified
        Bulk
        Overview
        Table
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function ColumnsEnumToString(value As ColumnsEnum) As String
		  Select Case value
		    
		    Case ColumnsEnum.SpendInMicroDollar
		      Return "SPEND_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.SpendInMicroUsDollar
		      Return "SPEND_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.BonusSpendInMicroDollar
		      Return "BONUS_SPEND_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.BonusSpendInDollar
		      Return "BONUS_SPEND_IN_DOLLAR"
		    Case ColumnsEnum.AdsCreditSpendInMicroDollar
		      Return "ADS_CREDIT_SPEND_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AdsCreditSpendInDollar
		      Return "ADS_CREDIT_SPEND_IN_DOLLAR"
		    Case ColumnsEnum.PaidImpression
		      Return "PAID_IMPRESSION"
		    Case ColumnsEnum.PaidClickthrough
		      Return "PAID_CLICKTHROUGH"
		    Case ColumnsEnum.SpendInDollar
		      Return "SPEND_IN_DOLLAR"
		    Case ColumnsEnum.SpendInUsDollar
		      Return "SPEND_IN_US_DOLLAR"
		    Case ColumnsEnum.CpcInMicroDollar
		      Return "CPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.EcpcInMicroDollar
		      Return "ECPC_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.CpcInDollar
		      Return "CPC_IN_DOLLAR"
		    Case ColumnsEnum.EcpcInDollar
		      Return "ECPC_IN_DOLLAR"
		    Case ColumnsEnum.Ctr
		      Return "CTR"
		    Case ColumnsEnum.Ectr
		      Return "ECTR"
		    Case ColumnsEnum.OutboundCtr
		      Return "OUTBOUND_CTR"
		    Case ColumnsEnum.OutboundCtr1
		      Return "OUTBOUND_CTR_1"
		    Case ColumnsEnum.CpcInMicroCurrency
		      Return "CPC_IN_MICRO_CURRENCY"
		    Case ColumnsEnum.CpwInMicroDollar
		      Return "CPW_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.CpwInDollar
		      Return "CPW_IN_DOLLAR"
		    Case ColumnsEnum.CostPerOutboundClick
		      Return "COST_PER_OUTBOUND_CLICK"
		    Case ColumnsEnum.AdOnlyPin
		      Return "AD_ONLY_PIN"
		    Case ColumnsEnum.CampaignName
		      Return "CAMPAIGN_NAME"
		    Case ColumnsEnum.CampaignStatus
		      Return "CAMPAIGN_STATUS"
		    Case ColumnsEnum.IsCampaignLearningPhase
		      Return "IS_CAMPAIGN_LEARNING_PHASE"
		    Case ColumnsEnum.Date
		      Return "DATE"
		    Case ColumnsEnum.DateAsTimestamp
		      Return "DATE_AS_TIMESTAMP"
		    Case ColumnsEnum.BudgetInDollar
		      Return "BUDGET_IN_DOLLAR"
		    Case ColumnsEnum.AvailableBudgetInDollar
		      Return "AVAILABLE_BUDGET_IN_DOLLAR"
		    Case ColumnsEnum.TargetingType
		      Return "TARGETING_TYPE"
		    Case ColumnsEnum.TargetingValue
		      Return "TARGETING_VALUE"
		    Case ColumnsEnum.TargetingValueName
		      Return "TARGETING_VALUE_NAME"
		    Case ColumnsEnum.CampaignBrandLabel
		      Return "CAMPAIGN_BRAND_LABEL"
		    Case ColumnsEnum.CampaignCustomLabels
		      Return "CAMPAIGN_CUSTOM_LABELS"
		    Case ColumnsEnum.AppInstallAppName
		      Return "APP_INSTALL_APP_NAME"
		    Case ColumnsEnum.PaidEvents
		      Return "PAID_EVENTS"
		    Case ColumnsEnum.BonusEvents
		      Return "BONUS_EVENTS"
		    Case ColumnsEnum.Insertion
		      Return "INSERTION"
		    Case ColumnsEnum.LegacyCampaignId
		      Return "LEGACY_CAMPAIGN_ID"
		    Case ColumnsEnum.HbaseId
		      Return "HBASE_ID"
		    Case ColumnsEnum.PinDescription
		      Return "PIN_DESCRIPTION"
		    Case ColumnsEnum.CampaignEndDate
		      Return "CAMPAIGN_END_DATE"
		    Case ColumnsEnum.PinPromotionStatus
		      Return "PIN_PROMOTION_STATUS"
		    Case ColumnsEnum.AdStatus
		      Return "AD_STATUS"
		    Case ColumnsEnum.PinId
		      Return "PIN_ID"
		    Case ColumnsEnum.CrossDeviceType
		      Return "CROSS_DEVICE_TYPE"
		    Case ColumnsEnum.IngestionSource
		      Return "INGESTION_SOURCE"
		    Case ColumnsEnum.SourcePlatform
		      Return "SOURCE_PLATFORM"
		    Case ColumnsEnum.PinPromotionIsRunning
		      Return "PIN_PROMOTION_IS_RUNNING"
		    Case ColumnsEnum.TotalEngagement
		      Return "TOTAL_ENGAGEMENT"
		    Case ColumnsEnum.Engagement1
		      Return "ENGAGEMENT_1"
		    Case ColumnsEnum.Engagement2
		      Return "ENGAGEMENT_2"
		    Case ColumnsEnum.CpeInMicroDollar
		      Return "CPE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.EcpeInMicroDollar
		      Return "ECPE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.CpeInDollar
		      Return "CPE_IN_DOLLAR"
		    Case ColumnsEnum.EcpeInDollar
		      Return "ECPE_IN_DOLLAR"
		    Case ColumnsEnum.EngagementRate
		      Return "ENGAGEMENT_RATE"
		    Case ColumnsEnum.EengagementRate
		      Return "EENGAGEMENT_RATE"
		    Case ColumnsEnum.InternalEcpeInMicroDollar
		      Return "INTERNAL_ECPE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.InternalEcpeInDollar
		      Return "INTERNAL_ECPE_IN_DOLLAR"
		    Case ColumnsEnum.EcpmInMicroDollar
		      Return "ECPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.EcpmInDollar
		      Return "ECPM_IN_DOLLAR"
		    Case ColumnsEnum.RepinRate
		      Return "REPIN_RATE"
		    Case ColumnsEnum.RepinRate2
		      Return "REPIN_RATE_2"
		    Case ColumnsEnum.Ctr2
		      Return "CTR_2"
		    Case ColumnsEnum.CampaignId
		      Return "CAMPAIGN_ID"
		    Case ColumnsEnum.AdvertiserId
		      Return "ADVERTISER_ID"
		    Case ColumnsEnum.AdAccountId
		      Return "AD_ACCOUNT_ID"
		    Case ColumnsEnum.AdvertiserOwnerUserId
		      Return "ADVERTISER_OWNER_USER_ID"
		    Case ColumnsEnum.AdvertiserOwnerUserName
		      Return "ADVERTISER_OWNER_USER_NAME"
		    Case ColumnsEnum.PinPromotionId
		      Return "PIN_PROMOTION_ID"
		    Case ColumnsEnum.AdId
		      Return "AD_ID"
		    Case ColumnsEnum.AdGroupId
		      Return "AD_GROUP_ID"
		    Case ColumnsEnum.KeywordId
		      Return "KEYWORD_ID"
		    Case ColumnsEnum.KeywordIsDeleted
		      Return "KEYWORD_IS_DELETED"
		    Case ColumnsEnum.BrandSfdcAccountId
		      Return "BRAND_SFDC_ACCOUNT_ID"
		    Case ColumnsEnum.AppInstallAppId
		      Return "APP_INSTALL_APP_ID"
		    Case ColumnsEnum.CampaignActionType
		      Return "CAMPAIGN_ACTION_TYPE"
		    Case ColumnsEnum.CampaignBidType
		      Return "CAMPAIGN_BID_TYPE"
		    Case ColumnsEnum.CampaignEntityStatus
		      Return "CAMPAIGN_ENTITY_STATUS"
		    Case ColumnsEnum.CampaignManagedStatus
		      Return "CAMPAIGN_MANAGED_STATUS"
		    Case ColumnsEnum.CampaignObjectiveType
		      Return "CAMPAIGN_OBJECTIVE_TYPE"
		    Case ColumnsEnum.CpmInMicroDollar
		      Return "CPM_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.CpmInDollar
		      Return "CPM_IN_DOLLAR"
		    Case ColumnsEnum.BudgetType
		      Return "BUDGET_TYPE"
		    Case ColumnsEnum.BudgetInLocalCurrency
		      Return "BUDGET_IN_LOCAL_CURRENCY"
		    Case ColumnsEnum.AdGroupName
		      Return "AD_GROUP_NAME"
		    Case ColumnsEnum.AdGroupStatus
		      Return "AD_GROUP_STATUS"
		    Case ColumnsEnum.AdGroupEndDate
		      Return "AD_GROUP_END_DATE"
		    Case ColumnsEnum.AdGroupBudgetType
		      Return "AD_GROUP_BUDGET_TYPE"
		    Case ColumnsEnum.AdGroupBudgetInLocalCurrency
		      Return "AD_GROUP_BUDGET_IN_LOCAL_CURRENCY"
		    Case ColumnsEnum.AdGroupSuggestedBudgetInLocalCurrency
		      Return "AD_GROUP_SUGGESTED_BUDGET_IN_LOCAL_CURRENCY"
		    Case ColumnsEnum.AdGroupSuggestedBonusBudgetInLocalCurrency
		      Return "AD_GROUP_SUGGESTED_BONUS_BUDGET_IN_LOCAL_CURRENCY"
		    Case ColumnsEnum.AdGroupEntityStatus
		      Return "AD_GROUP_ENTITY_STATUS"
		    Case ColumnsEnum.AdGroupActionType
		      Return "AD_GROUP_ACTION_TYPE"
		    Case ColumnsEnum.AdGroupConversionLearningModeType
		      Return "AD_GROUP_CONVERSION_LEARNING_MODE_TYPE"
		    Case ColumnsEnum.AdGroupTargetCpa
		      Return "AD_GROUP_TARGET_CPA"
		    Case ColumnsEnum.AdGroupBidStrategyType
		      Return "AD_GROUP_BID_STRATEGY_TYPE"
		    Case ColumnsEnum.AdGroupExperimentName
		      Return "AD_GROUP_EXPERIMENT_NAME"
		    Case ColumnsEnum.AdGroupExperimentCell
		      Return "AD_GROUP_EXPERIMENT_CELL"
		    Case ColumnsEnum.AdGroupBidMultiplier
		      Return "AD_GROUP_BID_MULTIPLIER"
		    Case ColumnsEnum.CampaignWebCloseupWhitelisted
		      Return "CAMPAIGN_WEB_CLOSEUP_WHITELISTED"
		    Case ColumnsEnum.ProductGroupId
		      Return "PRODUCT_GROUP_ID"
		    Case ColumnsEnum.ProductGroupDefinition
		      Return "PRODUCT_GROUP_DEFINITION"
		    Case ColumnsEnum.ParentProductGroupId
		      Return "PARENT_PRODUCT_GROUP_ID"
		    Case ColumnsEnum.ProductGroupType
		      Return "PRODUCT_GROUP_TYPE"
		    Case ColumnsEnum.ProductGroupBidInMicroCurrency
		      Return "PRODUCT_GROUP_BID_IN_MICRO_CURRENCY"
		    Case ColumnsEnum.ProductGroupStatus
		      Return "PRODUCT_GROUP_STATUS"
		    Case ColumnsEnum.ProductGroupEntityStatus
		      Return "PRODUCT_GROUP_ENTITY_STATUS"
		    Case ColumnsEnum.ProductGroupInclusion
		      Return "PRODUCT_GROUP_INCLUSION"
		    Case ColumnsEnum.ProductGroupCreativeType
		      Return "PRODUCT_GROUP_CREATIVE_TYPE"
		    Case ColumnsEnum.PromoId
		      Return "PROMO_ID"
		    Case ColumnsEnum.PromoName
		      Return "PROMO_NAME"
		    Case ColumnsEnum.PromoIds
		      Return "PROMO_IDS"
		    Case ColumnsEnum.PromoNames
		      Return "PROMO_NAMES"
		    Case ColumnsEnum.ItemId
		      Return "ITEM_ID"
		    Case ColumnsEnum.ProductItemId
		      Return "PRODUCT_ITEM_ID"
		    Case ColumnsEnum.InternalProductItemId
		      Return "INTERNAL_PRODUCT_ITEM_ID"
		    Case ColumnsEnum.InternalProductItemIdStr
		      Return "INTERNAL_PRODUCT_ITEM_ID_STR"
		    Case ColumnsEnum.ProductItemName
		      Return "PRODUCT_ITEM_NAME"
		    Case ColumnsEnum.ProductItemImageUrl
		      Return "PRODUCT_ITEM_IMAGE_URL"
		    Case ColumnsEnum.ProductItemPrice
		      Return "PRODUCT_ITEM_PRICE"
		    Case ColumnsEnum.ProductItemProductUrl
		      Return "PRODUCT_ITEM_PRODUCT_URL"
		    Case ColumnsEnum.ProductItemPinUrl
		      Return "PRODUCT_ITEM_PIN_URL"
		    Case ColumnsEnum.ProductItemBrand
		      Return "PRODUCT_ITEM_BRAND"
		    Case ColumnsEnum.ProductItemDescription
		      Return "PRODUCT_ITEM_DESCRIPTION"
		    Case ColumnsEnum.ProductItemSalePrice
		      Return "PRODUCT_ITEM_SALE_PRICE"
		    Case ColumnsEnum.ProductItemProductType
		      Return "PRODUCT_ITEM_PRODUCT_TYPE"
		    Case ColumnsEnum.ProductItemProductCategory
		      Return "PRODUCT_ITEM_PRODUCT_CATEGORY"
		    Case ColumnsEnum.ProductItemCampaignName
		      Return "PRODUCT_ITEM_CAMPAIGN_NAME"
		    Case ColumnsEnum.ProductItemAdGroupName
		      Return "PRODUCT_ITEM_AD_GROUP_NAME"
		    Case ColumnsEnum.ProductItemCurrency
		      Return "PRODUCT_ITEM_CURRENCY"
		    Case ColumnsEnum.OrderLineId
		      Return "ORDER_LINE_ID"
		    Case ColumnsEnum.OrderLineName
		      Return "ORDER_LINE_NAME"
		    Case ColumnsEnum.OrderLinePinRevShare
		      Return "ORDER_LINE_PIN_REV_SHARE"
		    Case ColumnsEnum.OrderLinePaidType
		      Return "ORDER_LINE_PAID_TYPE"
		    Case ColumnsEnum.SpendOrderLineId
		      Return "SPEND_ORDER_LINE_ID"
		    Case ColumnsEnum.SpendOrderLinePaidType
		      Return "SPEND_ORDER_LINE_PAID_TYPE"
		    Case ColumnsEnum.ConversionProductId
		      Return "CONVERSION_PRODUCT_ID"
		    Case ColumnsEnum.ConversionProductName
		      Return "CONVERSION_PRODUCT_NAME"
		    Case ColumnsEnum.ConversionProductBrand
		      Return "CONVERSION_PRODUCT_BRAND"
		    Case ColumnsEnum.ConversionProductCategory
		      Return "CONVERSION_PRODUCT_CATEGORY"
		    Case ColumnsEnum.ConversionProductIdGroup
		      Return "CONVERSION_PRODUCT_ID_GROUP"
		    Case ColumnsEnum.CartingTotalPurchaseIntentClicks
		      Return "CARTING_TOTAL_PURCHASE_INTENT_CLICKS"
		    Case ColumnsEnum.CartingTotalPurchaseIntentValue
		      Return "CARTING_TOTAL_PURCHASE_INTENT_VALUE"
		    Case ColumnsEnum.CartingTotalPurchaseIntentValueInMicroCurrency
		      Return "CARTING_TOTAL_PURCHASE_INTENT_VALUE_IN_MICRO_CURRENCY"
		    Case ColumnsEnum.CartingRetailerName
		      Return "CARTING_RETAILER_NAME"
		    Case ColumnsEnum.CartingProductPrice
		      Return "CARTING_PRODUCT_PRICE"
		    Case ColumnsEnum.CartingProductPriceInMicroCurrency
		      Return "CARTING_PRODUCT_PRICE_IN_MICRO_CURRENCY"
		    Case ColumnsEnum.CartingProductName
		      Return "CARTING_PRODUCT_NAME"
		    Case ColumnsEnum.CartingProductId
		      Return "CARTING_PRODUCT_ID"
		    Case ColumnsEnum.Clickthrough1
		      Return "CLICKTHROUGH_1"
		    Case ColumnsEnum.Repin1
		      Return "REPIN_1"
		    Case ColumnsEnum.Impression1
		      Return "IMPRESSION_1"
		    Case ColumnsEnum.Like1
		      Return "LIKE_1"
		    Case ColumnsEnum.Send1
		      Return "SEND_1"
		    Case ColumnsEnum.Flag1
		      Return "FLAG_1"
		    Case ColumnsEnum.Hide1
		      Return "HIDE_1"
		    Case ColumnsEnum.Insertion1
		      Return "INSERTION_1"
		    Case ColumnsEnum.Impression1Gross
		      Return "IMPRESSION_1_GROSS"
		    Case ColumnsEnum.Clickthrough1Gross
		      Return "CLICKTHROUGH_1_GROSS"
		    Case ColumnsEnum.OutboundClick1
		      Return "OUTBOUND_CLICK_1"
		    Case ColumnsEnum.ClickthroughUser1
		      Return "CLICKTHROUGH_USER_1"
		    Case ColumnsEnum.RepinUser1
		      Return "REPIN_USER_1"
		    Case ColumnsEnum.ImpressionUser1
		      Return "IMPRESSION_USER_1"
		    Case ColumnsEnum.LikeUser1
		      Return "LIKE_USER_1"
		    Case ColumnsEnum.SendUser1
		      Return "SEND_USER_1"
		    Case ColumnsEnum.FlagUser1
		      Return "FLAG_USER_1"
		    Case ColumnsEnum.HideUser1
		      Return "HIDE_USER_1"
		    Case ColumnsEnum.InsertionUser1
		      Return "INSERTION_USER_1"
		    Case ColumnsEnum.Clickthrough2
		      Return "CLICKTHROUGH_2"
		    Case ColumnsEnum.Repin2
		      Return "REPIN_2"
		    Case ColumnsEnum.Impression2
		      Return "IMPRESSION_2"
		    Case ColumnsEnum.Like2
		      Return "LIKE_2"
		    Case ColumnsEnum.Send2
		      Return "SEND_2"
		    Case ColumnsEnum.Flag2
		      Return "FLAG_2"
		    Case ColumnsEnum.OutboundClick2
		      Return "OUTBOUND_CLICK_2"
		    Case ColumnsEnum.ClickthroughUser2
		      Return "CLICKTHROUGH_USER_2"
		    Case ColumnsEnum.RepinUser2
		      Return "REPIN_USER_2"
		    Case ColumnsEnum.ImpressionUser2
		      Return "IMPRESSION_USER_2"
		    Case ColumnsEnum.LikeUser2
		      Return "LIKE_USER_2"
		    Case ColumnsEnum.SendUser2
		      Return "SEND_USER_2"
		    Case ColumnsEnum.FlagUser2
		      Return "FLAG_USER_2"
		    Case ColumnsEnum.TotalClickthrough
		      Return "TOTAL_CLICKTHROUGH"
		    Case ColumnsEnum.TotalRepin
		      Return "TOTAL_REPIN"
		    Case ColumnsEnum.TotalImpression
		      Return "TOTAL_IMPRESSION"
		    Case ColumnsEnum.TotalLike
		      Return "TOTAL_LIKE"
		    Case ColumnsEnum.TotalSend
		      Return "TOTAL_SEND"
		    Case ColumnsEnum.TotalFlag
		      Return "TOTAL_FLAG"
		    Case ColumnsEnum.TotalImpressionUser
		      Return "TOTAL_IMPRESSION_USER"
		    Case ColumnsEnum.TotalImpressionUserHll
		      Return "TOTAL_IMPRESSION_USER_HLL"
		    Case ColumnsEnum.TotalImpressionFrequency
		      Return "TOTAL_IMPRESSION_FREQUENCY"
		    Case ColumnsEnum.TotalImpressionFrequencyHll
		      Return "TOTAL_IMPRESSION_FREQUENCY_HLL"
		    Case ColumnsEnum.TotalOutboundClick
		      Return "TOTAL_OUTBOUND_CLICK"
		    Case ColumnsEnum.CostPerOutboundClickInDollar
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR"
		    Case ColumnsEnum.CostPerOutboundClickInDollar1
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1"
		    Case ColumnsEnum.EngagementPageVisit1
		      Return "ENGAGEMENT_PAGE_VISIT_1"
		    Case ColumnsEnum.EngagementSignup1
		      Return "ENGAGEMENT_SIGNUP_1"
		    Case ColumnsEnum.EngagementCheckout1
		      Return "ENGAGEMENT_CHECKOUT_1"
		    Case ColumnsEnum.EngagementCustom1
		      Return "ENGAGEMENT_CUSTOM_1"
		    Case ColumnsEnum.EngagementAddToCart1
		      Return "ENGAGEMENT_ADD_TO_CART_1"
		    Case ColumnsEnum.EngagementLead1
		      Return "ENGAGEMENT_LEAD_1"
		    Case ColumnsEnum.EngagementSearch1
		      Return "ENGAGEMENT_SEARCH_1"
		    Case ColumnsEnum.EngagementWatchVideo1
		      Return "ENGAGEMENT_WATCH_VIDEO_1"
		    Case ColumnsEnum.EngagementViewCategory1
		      Return "ENGAGEMENT_VIEW_CATEGORY_1"
		    Case ColumnsEnum.EngagementAppInstall1
		      Return "ENGAGEMENT_APP_INSTALL_1"
		    Case ColumnsEnum.EngagementUnknown1
		      Return "ENGAGEMENT_UNKNOWN_1"
		    Case ColumnsEnum.EngagementAddPaymentInfo1
		      Return "ENGAGEMENT_ADD_PAYMENT_INFO_1"
		    Case ColumnsEnum.EngagementAddToWishlist1
		      Return "ENGAGEMENT_ADD_TO_WISHLIST_1"
		    Case ColumnsEnum.EngagementInitiateCheckout1
		      Return "ENGAGEMENT_INITIATE_CHECKOUT_1"
		    Case ColumnsEnum.EngagementSubscribe1
		      Return "ENGAGEMENT_SUBSCRIBE_1"
		    Case ColumnsEnum.EngagementViewContent1
		      Return "ENGAGEMENT_VIEW_CONTENT_1"
		    Case ColumnsEnum.ClickPageVisit1
		      Return "CLICK_PAGE_VISIT_1"
		    Case ColumnsEnum.ClickSignup1
		      Return "CLICK_SIGNUP_1"
		    Case ColumnsEnum.ClickCheckout1
		      Return "CLICK_CHECKOUT_1"
		    Case ColumnsEnum.ClickCustom1
		      Return "CLICK_CUSTOM_1"
		    Case ColumnsEnum.ClickAddToCart1
		      Return "CLICK_ADD_TO_CART_1"
		    Case ColumnsEnum.ClickLead1
		      Return "CLICK_LEAD_1"
		    Case ColumnsEnum.ClickSearch1
		      Return "CLICK_SEARCH_1"
		    Case ColumnsEnum.ClickWatchVideo1
		      Return "CLICK_WATCH_VIDEO_1"
		    Case ColumnsEnum.ClickViewCategory1
		      Return "CLICK_VIEW_CATEGORY_1"
		    Case ColumnsEnum.ClickAppInstall1
		      Return "CLICK_APP_INSTALL_1"
		    Case ColumnsEnum.ClickUnknown1
		      Return "CLICK_UNKNOWN_1"
		    Case ColumnsEnum.ClickAddPaymentInfo1
		      Return "CLICK_ADD_PAYMENT_INFO_1"
		    Case ColumnsEnum.ClickAddToWishlist1
		      Return "CLICK_ADD_TO_WISHLIST_1"
		    Case ColumnsEnum.ClickInitiateCheckout1
		      Return "CLICK_INITIATE_CHECKOUT_1"
		    Case ColumnsEnum.ClickSubscribe1
		      Return "CLICK_SUBSCRIBE_1"
		    Case ColumnsEnum.ClickViewContent1
		      Return "CLICK_VIEW_CONTENT_1"
		    Case ColumnsEnum.ViewPageVisit1
		      Return "VIEW_PAGE_VISIT_1"
		    Case ColumnsEnum.ViewSignup1
		      Return "VIEW_SIGNUP_1"
		    Case ColumnsEnum.ViewCheckout1
		      Return "VIEW_CHECKOUT_1"
		    Case ColumnsEnum.ViewCustom1
		      Return "VIEW_CUSTOM_1"
		    Case ColumnsEnum.ViewAddToCart1
		      Return "VIEW_ADD_TO_CART_1"
		    Case ColumnsEnum.ViewLead1
		      Return "VIEW_LEAD_1"
		    Case ColumnsEnum.ViewSearch1
		      Return "VIEW_SEARCH_1"
		    Case ColumnsEnum.ViewWatchVideo1
		      Return "VIEW_WATCH_VIDEO_1"
		    Case ColumnsEnum.ViewViewCategory1
		      Return "VIEW_VIEW_CATEGORY_1"
		    Case ColumnsEnum.ViewAppInstall1
		      Return "VIEW_APP_INSTALL_1"
		    Case ColumnsEnum.ViewUnknown1
		      Return "VIEW_UNKNOWN_1"
		    Case ColumnsEnum.ViewAddPaymentInfo1
		      Return "VIEW_ADD_PAYMENT_INFO_1"
		    Case ColumnsEnum.ViewAddToWishlist1
		      Return "VIEW_ADD_TO_WISHLIST_1"
		    Case ColumnsEnum.ViewInitiateCheckout1
		      Return "VIEW_INITIATE_CHECKOUT_1"
		    Case ColumnsEnum.ViewSubscribe1
		      Return "VIEW_SUBSCRIBE_1"
		    Case ColumnsEnum.ViewViewContent1
		      Return "VIEW_VIEW_CONTENT_1"
		    Case ColumnsEnum.Conversions1
		      Return "CONVERSIONS_1"
		    Case ColumnsEnum.EngagementPageVisitValueInMicroDollar1
		      Return "ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementSignupValueInMicroDollar1
		      Return "ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementCheckoutValueInMicroDollar1
		      Return "ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementCustomValueInMicroDollar1
		      Return "ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementAddToCartValueInMicroDollar1
		      Return "ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementLeadValueInMicroDollar1
		      Return "ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementSearchValueInMicroDollar1
		      Return "ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementWatchVideoValueInMicroDollar1
		      Return "ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementViewCategoryValueInMicroDollar1
		      Return "ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementAppInstallValueInMicroDollar1
		      Return "ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementUnknownValueInMicroDollar1
		      Return "ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementAddPaymentInfoValueInMicroDollar1
		      Return "ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementAddToWishlistValueInMicroDollar1
		      Return "ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementInitiateCheckoutValueInMicroDollar1
		      Return "ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementSubscribeValueInMicroDollar1
		      Return "ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementViewContentValueInMicroDollar1
		      Return "ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickPageVisitValueInMicroDollar1
		      Return "CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickSignupValueInMicroDollar1
		      Return "CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickCheckoutValueInMicroDollar1
		      Return "CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickCustomValueInMicroDollar1
		      Return "CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickAddToCartValueInMicroDollar1
		      Return "CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickLeadValueInMicroDollar1
		      Return "CLICK_LEAD_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickSearchValueInMicroDollar1
		      Return "CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickWatchVideoValueInMicroDollar1
		      Return "CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickViewCategoryValueInMicroDollar1
		      Return "CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickAppInstallValueInMicroDollar1
		      Return "CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickUnknownValueInMicroDollar1
		      Return "CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickAddPaymentInfoValueInMicroDollar1
		      Return "CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickAddToWishlistValueInMicroDollar1
		      Return "CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickInitiateCheckoutValueInMicroDollar1
		      Return "CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickSubscribeValueInMicroDollar1
		      Return "CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickViewContentValueInMicroDollar1
		      Return "CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewPageVisitValueInMicroDollar1
		      Return "VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewSignupValueInMicroDollar1
		      Return "VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewCheckoutValueInMicroDollar1
		      Return "VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewCustomValueInMicroDollar1
		      Return "VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewAddToCartValueInMicroDollar1
		      Return "VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewLeadValueInMicroDollar1
		      Return "VIEW_LEAD_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewSearchValueInMicroDollar1
		      Return "VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewWatchVideoValueInMicroDollar1
		      Return "VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewViewCategoryValueInMicroDollar1
		      Return "VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewAppInstallValueInMicroDollar1
		      Return "VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewUnknownValueInMicroDollar1
		      Return "VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewAddPaymentInfoValueInMicroDollar1
		      Return "VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewAddToWishlistValueInMicroDollar1
		      Return "VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewInitiateCheckoutValueInMicroDollar1
		      Return "VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewSubscribeValueInMicroDollar1
		      Return "VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewViewContentValueInMicroDollar1
		      Return "VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ConversionsValueInMicroDollar1
		      Return "CONVERSIONS_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementPageVisitQuantity1
		      Return "ENGAGEMENT_PAGE_VISIT_QUANTITY_1"
		    Case ColumnsEnum.EngagementSignupQuantity1
		      Return "ENGAGEMENT_SIGNUP_QUANTITY_1"
		    Case ColumnsEnum.EngagementCheckoutQuantity1
		      Return "ENGAGEMENT_CHECKOUT_QUANTITY_1"
		    Case ColumnsEnum.EngagementCustomQuantity1
		      Return "ENGAGEMENT_CUSTOM_QUANTITY_1"
		    Case ColumnsEnum.EngagementAddToCartQuantity1
		      Return "ENGAGEMENT_ADD_TO_CART_QUANTITY_1"
		    Case ColumnsEnum.EngagementLeadQuantity1
		      Return "ENGAGEMENT_LEAD_QUANTITY_1"
		    Case ColumnsEnum.EngagementSearchQuantity1
		      Return "ENGAGEMENT_SEARCH_QUANTITY_1"
		    Case ColumnsEnum.EngagementWatchVideoQuantity1
		      Return "ENGAGEMENT_WATCH_VIDEO_QUANTITY_1"
		    Case ColumnsEnum.EngagementViewCategoryQuantity1
		      Return "ENGAGEMENT_VIEW_CATEGORY_QUANTITY_1"
		    Case ColumnsEnum.EngagementAppInstallQuantity1
		      Return "ENGAGEMENT_APP_INSTALL_QUANTITY_1"
		    Case ColumnsEnum.EngagementUnknownQuantity1
		      Return "ENGAGEMENT_UNKNOWN_QUANTITY_1"
		    Case ColumnsEnum.EngagementAddPaymentInfoQuantity1
		      Return "ENGAGEMENT_ADD_PAYMENT_INFO_QUANTITY_1"
		    Case ColumnsEnum.EngagementAddToWishlistQuantity1
		      Return "ENGAGEMENT_ADD_TO_WISHLIST_QUANTITY_1"
		    Case ColumnsEnum.EngagementInitiateCheckoutQuantity1
		      Return "ENGAGEMENT_INITIATE_CHECKOUT_QUANTITY_1"
		    Case ColumnsEnum.EngagementSubscribeQuantity1
		      Return "ENGAGEMENT_SUBSCRIBE_QUANTITY_1"
		    Case ColumnsEnum.EngagementViewContentQuantity1
		      Return "ENGAGEMENT_VIEW_CONTENT_QUANTITY_1"
		    Case ColumnsEnum.ClickPageVisitQuantity1
		      Return "CLICK_PAGE_VISIT_QUANTITY_1"
		    Case ColumnsEnum.ClickSignupQuantity1
		      Return "CLICK_SIGNUP_QUANTITY_1"
		    Case ColumnsEnum.ClickCheckoutQuantity1
		      Return "CLICK_CHECKOUT_QUANTITY_1"
		    Case ColumnsEnum.ClickCustomQuantity1
		      Return "CLICK_CUSTOM_QUANTITY_1"
		    Case ColumnsEnum.ClickAddToCartQuantity1
		      Return "CLICK_ADD_TO_CART_QUANTITY_1"
		    Case ColumnsEnum.ClickLeadQuantity1
		      Return "CLICK_LEAD_QUANTITY_1"
		    Case ColumnsEnum.ClickSearchQuantity1
		      Return "CLICK_SEARCH_QUANTITY_1"
		    Case ColumnsEnum.ClickWatchVideoQuantity1
		      Return "CLICK_WATCH_VIDEO_QUANTITY_1"
		    Case ColumnsEnum.ClickViewCategoryQuantity1
		      Return "CLICK_VIEW_CATEGORY_QUANTITY_1"
		    Case ColumnsEnum.ClickAppInstallQuantity1
		      Return "CLICK_APP_INSTALL_QUANTITY_1"
		    Case ColumnsEnum.ClickUnknownQuantity1
		      Return "CLICK_UNKNOWN_QUANTITY_1"
		    Case ColumnsEnum.ClickAddPaymentInfoQuantity1
		      Return "CLICK_ADD_PAYMENT_INFO_QUANTITY_1"
		    Case ColumnsEnum.ClickAddToWishlistQuantity1
		      Return "CLICK_ADD_TO_WISHLIST_QUANTITY_1"
		    Case ColumnsEnum.ClickInitiateCheckoutQuantity1
		      Return "CLICK_INITIATE_CHECKOUT_QUANTITY_1"
		    Case ColumnsEnum.ClickSubscribeQuantity1
		      Return "CLICK_SUBSCRIBE_QUANTITY_1"
		    Case ColumnsEnum.ClickViewContentQuantity1
		      Return "CLICK_VIEW_CONTENT_QUANTITY_1"
		    Case ColumnsEnum.ViewPageVisitQuantity1
		      Return "VIEW_PAGE_VISIT_QUANTITY_1"
		    Case ColumnsEnum.ViewSignupQuantity1
		      Return "VIEW_SIGNUP_QUANTITY_1"
		    Case ColumnsEnum.ViewCheckoutQuantity1
		      Return "VIEW_CHECKOUT_QUANTITY_1"
		    Case ColumnsEnum.ViewCustomQuantity1
		      Return "VIEW_CUSTOM_QUANTITY_1"
		    Case ColumnsEnum.ViewAddToCartQuantity1
		      Return "VIEW_ADD_TO_CART_QUANTITY_1"
		    Case ColumnsEnum.ViewLeadQuantity1
		      Return "VIEW_LEAD_QUANTITY_1"
		    Case ColumnsEnum.ViewSearchQuantity1
		      Return "VIEW_SEARCH_QUANTITY_1"
		    Case ColumnsEnum.ViewWatchVideoQuantity1
		      Return "VIEW_WATCH_VIDEO_QUANTITY_1"
		    Case ColumnsEnum.ViewViewCategoryQuantity1
		      Return "VIEW_VIEW_CATEGORY_QUANTITY_1"
		    Case ColumnsEnum.ViewAppInstallQuantity1
		      Return "VIEW_APP_INSTALL_QUANTITY_1"
		    Case ColumnsEnum.ViewUnknownQuantity1
		      Return "VIEW_UNKNOWN_QUANTITY_1"
		    Case ColumnsEnum.ViewAddPaymentInfoQuantity1
		      Return "VIEW_ADD_PAYMENT_INFO_QUANTITY_1"
		    Case ColumnsEnum.ViewAddToWishlistQuantity1
		      Return "VIEW_ADD_TO_WISHLIST_QUANTITY_1"
		    Case ColumnsEnum.ViewInitiateCheckoutQuantity1
		      Return "VIEW_INITIATE_CHECKOUT_QUANTITY_1"
		    Case ColumnsEnum.ViewSubscribeQuantity1
		      Return "VIEW_SUBSCRIBE_QUANTITY_1"
		    Case ColumnsEnum.ViewViewContentQuantity1
		      Return "VIEW_VIEW_CONTENT_QUANTITY_1"
		    Case ColumnsEnum.ConversionsQuantity1
		      Return "CONVERSIONS_QUANTITY_1"
		    Case ColumnsEnum.EngagementPageVisit2
		      Return "ENGAGEMENT_PAGE_VISIT_2"
		    Case ColumnsEnum.EngagementSignup2
		      Return "ENGAGEMENT_SIGNUP_2"
		    Case ColumnsEnum.EngagementCheckout2
		      Return "ENGAGEMENT_CHECKOUT_2"
		    Case ColumnsEnum.EngagementCustom2
		      Return "ENGAGEMENT_CUSTOM_2"
		    Case ColumnsEnum.EngagementAddToCart2
		      Return "ENGAGEMENT_ADD_TO_CART_2"
		    Case ColumnsEnum.EngagementLead2
		      Return "ENGAGEMENT_LEAD_2"
		    Case ColumnsEnum.EngagementSearch2
		      Return "ENGAGEMENT_SEARCH_2"
		    Case ColumnsEnum.EngagementWatchVideo2
		      Return "ENGAGEMENT_WATCH_VIDEO_2"
		    Case ColumnsEnum.EngagementViewCategory2
		      Return "ENGAGEMENT_VIEW_CATEGORY_2"
		    Case ColumnsEnum.EngagementAppInstall2
		      Return "ENGAGEMENT_APP_INSTALL_2"
		    Case ColumnsEnum.EngagementUnknown2
		      Return "ENGAGEMENT_UNKNOWN_2"
		    Case ColumnsEnum.EngagementAddPaymentInfo2
		      Return "ENGAGEMENT_ADD_PAYMENT_INFO_2"
		    Case ColumnsEnum.EngagementAddToWishlist2
		      Return "ENGAGEMENT_ADD_TO_WISHLIST_2"
		    Case ColumnsEnum.EngagementInitiateCheckout2
		      Return "ENGAGEMENT_INITIATE_CHECKOUT_2"
		    Case ColumnsEnum.EngagementSubscribe2
		      Return "ENGAGEMENT_SUBSCRIBE_2"
		    Case ColumnsEnum.EngagementViewContent2
		      Return "ENGAGEMENT_VIEW_CONTENT_2"
		    Case ColumnsEnum.ClickPageVisit2
		      Return "CLICK_PAGE_VISIT_2"
		    Case ColumnsEnum.ClickSignup2
		      Return "CLICK_SIGNUP_2"
		    Case ColumnsEnum.ClickCheckout2
		      Return "CLICK_CHECKOUT_2"
		    Case ColumnsEnum.ClickCustom2
		      Return "CLICK_CUSTOM_2"
		    Case ColumnsEnum.ClickAddToCart2
		      Return "CLICK_ADD_TO_CART_2"
		    Case ColumnsEnum.ClickLead2
		      Return "CLICK_LEAD_2"
		    Case ColumnsEnum.ClickSearch2
		      Return "CLICK_SEARCH_2"
		    Case ColumnsEnum.ClickWatchVideo2
		      Return "CLICK_WATCH_VIDEO_2"
		    Case ColumnsEnum.ClickViewCategory2
		      Return "CLICK_VIEW_CATEGORY_2"
		    Case ColumnsEnum.ClickAppInstall2
		      Return "CLICK_APP_INSTALL_2"
		    Case ColumnsEnum.ClickUnknown2
		      Return "CLICK_UNKNOWN_2"
		    Case ColumnsEnum.ClickAddPaymentInfo2
		      Return "CLICK_ADD_PAYMENT_INFO_2"
		    Case ColumnsEnum.ClickAddToWishlist2
		      Return "CLICK_ADD_TO_WISHLIST_2"
		    Case ColumnsEnum.ClickInitiateCheckout2
		      Return "CLICK_INITIATE_CHECKOUT_2"
		    Case ColumnsEnum.ClickSubscribe2
		      Return "CLICK_SUBSCRIBE_2"
		    Case ColumnsEnum.ClickViewContent2
		      Return "CLICK_VIEW_CONTENT_2"
		    Case ColumnsEnum.ViewPageVisit2
		      Return "VIEW_PAGE_VISIT_2"
		    Case ColumnsEnum.ViewSignup2
		      Return "VIEW_SIGNUP_2"
		    Case ColumnsEnum.ViewCheckout2
		      Return "VIEW_CHECKOUT_2"
		    Case ColumnsEnum.ViewCustom2
		      Return "VIEW_CUSTOM_2"
		    Case ColumnsEnum.ViewAddToCart2
		      Return "VIEW_ADD_TO_CART_2"
		    Case ColumnsEnum.ViewLead2
		      Return "VIEW_LEAD_2"
		    Case ColumnsEnum.ViewSearch2
		      Return "VIEW_SEARCH_2"
		    Case ColumnsEnum.ViewWatchVideo2
		      Return "VIEW_WATCH_VIDEO_2"
		    Case ColumnsEnum.ViewViewCategory2
		      Return "VIEW_VIEW_CATEGORY_2"
		    Case ColumnsEnum.ViewAppInstall2
		      Return "VIEW_APP_INSTALL_2"
		    Case ColumnsEnum.ViewUnknown2
		      Return "VIEW_UNKNOWN_2"
		    Case ColumnsEnum.ViewAddPaymentInfo2
		      Return "VIEW_ADD_PAYMENT_INFO_2"
		    Case ColumnsEnum.ViewAddToWishlist2
		      Return "VIEW_ADD_TO_WISHLIST_2"
		    Case ColumnsEnum.ViewInitiateCheckout2
		      Return "VIEW_INITIATE_CHECKOUT_2"
		    Case ColumnsEnum.ViewSubscribe2
		      Return "VIEW_SUBSCRIBE_2"
		    Case ColumnsEnum.ViewViewContent2
		      Return "VIEW_VIEW_CONTENT_2"
		    Case ColumnsEnum.Conversions2
		      Return "CONVERSIONS_2"
		    Case ColumnsEnum.EngagementPageVisitValueInMicroDollar2
		      Return "ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementSignupValueInMicroDollar2
		      Return "ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementCheckoutValueInMicroDollar2
		      Return "ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementCustomValueInMicroDollar2
		      Return "ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementAddToCartValueInMicroDollar2
		      Return "ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementLeadValueInMicroDollar2
		      Return "ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementSearchValueInMicroDollar2
		      Return "ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementWatchVideoValueInMicroDollar2
		      Return "ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementViewCategoryValueInMicroDollar2
		      Return "ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementAppInstallValueInMicroDollar2
		      Return "ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementUnknownValueInMicroDollar2
		      Return "ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementAddPaymentInfoValueInMicroDollar2
		      Return "ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementAddToWishlistValueInMicroDollar2
		      Return "ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementInitiateCheckoutValueInMicroDollar2
		      Return "ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementSubscribeValueInMicroDollar2
		      Return "ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementViewContentValueInMicroDollar2
		      Return "ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickPageVisitValueInMicroDollar2
		      Return "CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickSignupValueInMicroDollar2
		      Return "CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickCheckoutValueInMicroDollar2
		      Return "CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickCustomValueInMicroDollar2
		      Return "CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickAddToCartValueInMicroDollar2
		      Return "CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickLeadValueInMicroDollar2
		      Return "CLICK_LEAD_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickSearchValueInMicroDollar2
		      Return "CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickWatchVideoValueInMicroDollar2
		      Return "CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickViewCategoryValueInMicroDollar2
		      Return "CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickAppInstallValueInMicroDollar2
		      Return "CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickUnknownValueInMicroDollar2
		      Return "CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickAddPaymentInfoValueInMicroDollar2
		      Return "CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickAddToWishlistValueInMicroDollar2
		      Return "CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickInitiateCheckoutValueInMicroDollar2
		      Return "CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickSubscribeValueInMicroDollar2
		      Return "CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickViewContentValueInMicroDollar2
		      Return "CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewPageVisitValueInMicroDollar2
		      Return "VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewSignupValueInMicroDollar2
		      Return "VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewCheckoutValueInMicroDollar2
		      Return "VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewCustomValueInMicroDollar2
		      Return "VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewAddToCartValueInMicroDollar2
		      Return "VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewLeadValueInMicroDollar2
		      Return "VIEW_LEAD_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewSearchValueInMicroDollar2
		      Return "VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewWatchVideoValueInMicroDollar2
		      Return "VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewViewCategoryValueInMicroDollar2
		      Return "VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewAppInstallValueInMicroDollar2
		      Return "VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewUnknownValueInMicroDollar2
		      Return "VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewAddPaymentInfoValueInMicroDollar2
		      Return "VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewAddToWishlistValueInMicroDollar2
		      Return "VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewInitiateCheckoutValueInMicroDollar2
		      Return "VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewSubscribeValueInMicroDollar2
		      Return "VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewViewContentValueInMicroDollar2
		      Return "VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ConversionsValueInMicroDollar2
		      Return "CONVERSIONS_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementPageVisitQuantity2
		      Return "ENGAGEMENT_PAGE_VISIT_QUANTITY_2"
		    Case ColumnsEnum.EngagementSignupQuantity2
		      Return "ENGAGEMENT_SIGNUP_QUANTITY_2"
		    Case ColumnsEnum.EngagementCheckoutQuantity2
		      Return "ENGAGEMENT_CHECKOUT_QUANTITY_2"
		    Case ColumnsEnum.EngagementCustomQuantity2
		      Return "ENGAGEMENT_CUSTOM_QUANTITY_2"
		    Case ColumnsEnum.EngagementAddToCartQuantity2
		      Return "ENGAGEMENT_ADD_TO_CART_QUANTITY_2"
		    Case ColumnsEnum.EngagementLeadQuantity2
		      Return "ENGAGEMENT_LEAD_QUANTITY_2"
		    Case ColumnsEnum.EngagementSearchQuantity2
		      Return "ENGAGEMENT_SEARCH_QUANTITY_2"
		    Case ColumnsEnum.EngagementWatchVideoQuantity2
		      Return "ENGAGEMENT_WATCH_VIDEO_QUANTITY_2"
		    Case ColumnsEnum.EngagementViewCategoryQuantity2
		      Return "ENGAGEMENT_VIEW_CATEGORY_QUANTITY_2"
		    Case ColumnsEnum.EngagementAppInstallQuantity2
		      Return "ENGAGEMENT_APP_INSTALL_QUANTITY_2"
		    Case ColumnsEnum.EngagementUnknownQuantity2
		      Return "ENGAGEMENT_UNKNOWN_QUANTITY_2"
		    Case ColumnsEnum.EngagementAddPaymentInfoQuantity2
		      Return "ENGAGEMENT_ADD_PAYMENT_INFO_QUANTITY_2"
		    Case ColumnsEnum.EngagementAddToWishlistQuantity2
		      Return "ENGAGEMENT_ADD_TO_WISHLIST_QUANTITY_2"
		    Case ColumnsEnum.EngagementInitiateCheckoutQuantity2
		      Return "ENGAGEMENT_INITIATE_CHECKOUT_QUANTITY_2"
		    Case ColumnsEnum.EngagementSubscribeQuantity2
		      Return "ENGAGEMENT_SUBSCRIBE_QUANTITY_2"
		    Case ColumnsEnum.EngagementViewContentQuantity2
		      Return "ENGAGEMENT_VIEW_CONTENT_QUANTITY_2"
		    Case ColumnsEnum.ClickPageVisitQuantity2
		      Return "CLICK_PAGE_VISIT_QUANTITY_2"
		    Case ColumnsEnum.ClickSignupQuantity2
		      Return "CLICK_SIGNUP_QUANTITY_2"
		    Case ColumnsEnum.ClickCheckoutQuantity2
		      Return "CLICK_CHECKOUT_QUANTITY_2"
		    Case ColumnsEnum.ClickCustomQuantity2
		      Return "CLICK_CUSTOM_QUANTITY_2"
		    Case ColumnsEnum.ClickAddToCartQuantity2
		      Return "CLICK_ADD_TO_CART_QUANTITY_2"
		    Case ColumnsEnum.ClickLeadQuantity2
		      Return "CLICK_LEAD_QUANTITY_2"
		    Case ColumnsEnum.ClickSearchQuantity2
		      Return "CLICK_SEARCH_QUANTITY_2"
		    Case ColumnsEnum.ClickWatchVideoQuantity2
		      Return "CLICK_WATCH_VIDEO_QUANTITY_2"
		    Case ColumnsEnum.ClickViewCategoryQuantity2
		      Return "CLICK_VIEW_CATEGORY_QUANTITY_2"
		    Case ColumnsEnum.ClickAppInstallQuantity2
		      Return "CLICK_APP_INSTALL_QUANTITY_2"
		    Case ColumnsEnum.ClickUnknownQuantity2
		      Return "CLICK_UNKNOWN_QUANTITY_2"
		    Case ColumnsEnum.ClickAddPaymentInfoQuantity2
		      Return "CLICK_ADD_PAYMENT_INFO_QUANTITY_2"
		    Case ColumnsEnum.ClickAddToWishlistQuantity2
		      Return "CLICK_ADD_TO_WISHLIST_QUANTITY_2"
		    Case ColumnsEnum.ClickInitiateCheckoutQuantity2
		      Return "CLICK_INITIATE_CHECKOUT_QUANTITY_2"
		    Case ColumnsEnum.ClickSubscribeQuantity2
		      Return "CLICK_SUBSCRIBE_QUANTITY_2"
		    Case ColumnsEnum.ClickViewContentQuantity2
		      Return "CLICK_VIEW_CONTENT_QUANTITY_2"
		    Case ColumnsEnum.ViewPageVisitQuantity2
		      Return "VIEW_PAGE_VISIT_QUANTITY_2"
		    Case ColumnsEnum.ViewSignupQuantity2
		      Return "VIEW_SIGNUP_QUANTITY_2"
		    Case ColumnsEnum.ViewCheckoutQuantity2
		      Return "VIEW_CHECKOUT_QUANTITY_2"
		    Case ColumnsEnum.ViewCustomQuantity2
		      Return "VIEW_CUSTOM_QUANTITY_2"
		    Case ColumnsEnum.ViewAddToCartQuantity2
		      Return "VIEW_ADD_TO_CART_QUANTITY_2"
		    Case ColumnsEnum.ViewLeadQuantity2
		      Return "VIEW_LEAD_QUANTITY_2"
		    Case ColumnsEnum.ViewSearchQuantity2
		      Return "VIEW_SEARCH_QUANTITY_2"
		    Case ColumnsEnum.ViewWatchVideoQuantity2
		      Return "VIEW_WATCH_VIDEO_QUANTITY_2"
		    Case ColumnsEnum.ViewViewCategoryQuantity2
		      Return "VIEW_VIEW_CATEGORY_QUANTITY_2"
		    Case ColumnsEnum.ViewAppInstallQuantity2
		      Return "VIEW_APP_INSTALL_QUANTITY_2"
		    Case ColumnsEnum.ViewUnknownQuantity2
		      Return "VIEW_UNKNOWN_QUANTITY_2"
		    Case ColumnsEnum.ViewAddPaymentInfoQuantity2
		      Return "VIEW_ADD_PAYMENT_INFO_QUANTITY_2"
		    Case ColumnsEnum.ViewAddToWishlistQuantity2
		      Return "VIEW_ADD_TO_WISHLIST_QUANTITY_2"
		    Case ColumnsEnum.ViewInitiateCheckoutQuantity2
		      Return "VIEW_INITIATE_CHECKOUT_QUANTITY_2"
		    Case ColumnsEnum.ViewSubscribeQuantity2
		      Return "VIEW_SUBSCRIBE_QUANTITY_2"
		    Case ColumnsEnum.ViewViewContentQuantity2
		      Return "VIEW_VIEW_CONTENT_QUANTITY_2"
		    Case ColumnsEnum.ConversionsQuantity2
		      Return "CONVERSIONS_QUANTITY_2"
		    Case ColumnsEnum.TotalEngagementPageVisit
		      Return "TOTAL_ENGAGEMENT_PAGE_VISIT"
		    Case ColumnsEnum.TotalEngagementSignup
		      Return "TOTAL_ENGAGEMENT_SIGNUP"
		    Case ColumnsEnum.TotalEngagementCheckout
		      Return "TOTAL_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum.TotalEngagementCustom
		      Return "TOTAL_ENGAGEMENT_CUSTOM"
		    Case ColumnsEnum.TotalEngagementAddToCart
		      Return "TOTAL_ENGAGEMENT_ADD_TO_CART"
		    Case ColumnsEnum.TotalEngagementLead
		      Return "TOTAL_ENGAGEMENT_LEAD"
		    Case ColumnsEnum.TotalEngagementSearch
		      Return "TOTAL_ENGAGEMENT_SEARCH"
		    Case ColumnsEnum.TotalEngagementWatchVideo
		      Return "TOTAL_ENGAGEMENT_WATCH_VIDEO"
		    Case ColumnsEnum.TotalEngagementViewCategory
		      Return "TOTAL_ENGAGEMENT_VIEW_CATEGORY"
		    Case ColumnsEnum.TotalEngagementAppInstall
		      Return "TOTAL_ENGAGEMENT_APP_INSTALL"
		    Case ColumnsEnum.TotalEngagementUnknown
		      Return "TOTAL_ENGAGEMENT_UNKNOWN"
		    Case ColumnsEnum.TotalEngagementAddPaymentInfo
		      Return "TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO"
		    Case ColumnsEnum.TotalEngagementAddToWishlist
		      Return "TOTAL_ENGAGEMENT_ADD_TO_WISHLIST"
		    Case ColumnsEnum.TotalEngagementInitiateCheckout
		      Return "TOTAL_ENGAGEMENT_INITIATE_CHECKOUT"
		    Case ColumnsEnum.TotalEngagementSubscribe
		      Return "TOTAL_ENGAGEMENT_SUBSCRIBE"
		    Case ColumnsEnum.TotalEngagementViewContent
		      Return "TOTAL_ENGAGEMENT_VIEW_CONTENT"
		    Case ColumnsEnum.TotalClickPageVisit
		      Return "TOTAL_CLICK_PAGE_VISIT"
		    Case ColumnsEnum.TotalClickSignup
		      Return "TOTAL_CLICK_SIGNUP"
		    Case ColumnsEnum.TotalClickCheckout
		      Return "TOTAL_CLICK_CHECKOUT"
		    Case ColumnsEnum.TotalClickCustom
		      Return "TOTAL_CLICK_CUSTOM"
		    Case ColumnsEnum.TotalClickAddToCart
		      Return "TOTAL_CLICK_ADD_TO_CART"
		    Case ColumnsEnum.TotalClickLead
		      Return "TOTAL_CLICK_LEAD"
		    Case ColumnsEnum.TotalClickSearch
		      Return "TOTAL_CLICK_SEARCH"
		    Case ColumnsEnum.TotalClickWatchVideo
		      Return "TOTAL_CLICK_WATCH_VIDEO"
		    Case ColumnsEnum.TotalClickViewCategory
		      Return "TOTAL_CLICK_VIEW_CATEGORY"
		    Case ColumnsEnum.TotalClickAppInstall
		      Return "TOTAL_CLICK_APP_INSTALL"
		    Case ColumnsEnum.TotalClickUnknown
		      Return "TOTAL_CLICK_UNKNOWN"
		    Case ColumnsEnum.TotalClickAddPaymentInfo
		      Return "TOTAL_CLICK_ADD_PAYMENT_INFO"
		    Case ColumnsEnum.TotalClickAddToWishlist
		      Return "TOTAL_CLICK_ADD_TO_WISHLIST"
		    Case ColumnsEnum.TotalClickInitiateCheckout
		      Return "TOTAL_CLICK_INITIATE_CHECKOUT"
		    Case ColumnsEnum.TotalClickSubscribe
		      Return "TOTAL_CLICK_SUBSCRIBE"
		    Case ColumnsEnum.TotalClickViewContent
		      Return "TOTAL_CLICK_VIEW_CONTENT"
		    Case ColumnsEnum.TotalViewPageVisit
		      Return "TOTAL_VIEW_PAGE_VISIT"
		    Case ColumnsEnum.TotalViewSignup
		      Return "TOTAL_VIEW_SIGNUP"
		    Case ColumnsEnum.TotalViewCheckout
		      Return "TOTAL_VIEW_CHECKOUT"
		    Case ColumnsEnum.TotalViewCustom
		      Return "TOTAL_VIEW_CUSTOM"
		    Case ColumnsEnum.TotalViewAddToCart
		      Return "TOTAL_VIEW_ADD_TO_CART"
		    Case ColumnsEnum.TotalViewLead
		      Return "TOTAL_VIEW_LEAD"
		    Case ColumnsEnum.TotalViewSearch
		      Return "TOTAL_VIEW_SEARCH"
		    Case ColumnsEnum.TotalViewWatchVideo
		      Return "TOTAL_VIEW_WATCH_VIDEO"
		    Case ColumnsEnum.TotalViewViewCategory
		      Return "TOTAL_VIEW_VIEW_CATEGORY"
		    Case ColumnsEnum.TotalViewAppInstall
		      Return "TOTAL_VIEW_APP_INSTALL"
		    Case ColumnsEnum.TotalViewUnknown
		      Return "TOTAL_VIEW_UNKNOWN"
		    Case ColumnsEnum.TotalViewAddPaymentInfo
		      Return "TOTAL_VIEW_ADD_PAYMENT_INFO"
		    Case ColumnsEnum.TotalViewAddToWishlist
		      Return "TOTAL_VIEW_ADD_TO_WISHLIST"
		    Case ColumnsEnum.TotalViewInitiateCheckout
		      Return "TOTAL_VIEW_INITIATE_CHECKOUT"
		    Case ColumnsEnum.TotalViewSubscribe
		      Return "TOTAL_VIEW_SUBSCRIBE"
		    Case ColumnsEnum.TotalViewViewContent
		      Return "TOTAL_VIEW_VIEW_CONTENT"
		    Case ColumnsEnum.TotalConversions
		      Return "TOTAL_CONVERSIONS"
		    Case ColumnsEnum.TotalWebConversions
		      Return "TOTAL_WEB_CONVERSIONS"
		    Case ColumnsEnum.TotalInappConversions
		      Return "TOTAL_INAPP_CONVERSIONS"
		    Case ColumnsEnum.TotalOfflineConversions
		      Return "TOTAL_OFFLINE_CONVERSIONS"
		    Case ColumnsEnum.TotalEngagementPageVisitValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementPageVisitValueInDollar
		      Return "TOTAL_ENGAGEMENT_PAGE_VISIT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementSignupValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementSignupValueInDollar
		      Return "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementCheckoutValueInDollar
		      Return "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementCustomValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementCustomValueInDollar
		      Return "TOTAL_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementAddToCartValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementAddToCartValueInDollar
		      Return "TOTAL_ENGAGEMENT_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementLeadValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementLeadValueInDollar
		      Return "TOTAL_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementSearchValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementSearchValueInDollar
		      Return "TOTAL_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementWatchVideoValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementWatchVideoValueInDollar
		      Return "TOTAL_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementViewCategoryValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementViewCategoryValueInDollar
		      Return "TOTAL_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementAppInstallValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementUnknownValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementAddPaymentInfoValueInDollar
		      Return "TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementAddToWishlistValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementAddToWishlistValueInDollar
		      Return "TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementInitiateCheckoutValueInDollar
		      Return "TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementSubscribeValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementSubscribeValueInDollar
		      Return "TOTAL_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementViewContentValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementViewContentValueInDollar
		      Return "TOTAL_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickPageVisitValueInMicroDollar
		      Return "TOTAL_CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickPageVisitValueInDollar
		      Return "TOTAL_CLICK_PAGE_VISIT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickSignupValueInMicroDollar
		      Return "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickSignupValueInDollar
		      Return "TOTAL_CLICK_SIGNUP_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickCheckoutValueInMicroDollar
		      Return "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickCheckoutValueInDollar
		      Return "TOTAL_CLICK_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickCustomValueInMicroDollar
		      Return "TOTAL_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickCustomValueInDollar
		      Return "TOTAL_CLICK_CUSTOM_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickAddToCartValueInMicroDollar
		      Return "TOTAL_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickAddToCartValueInDollar
		      Return "TOTAL_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickLeadValueInMicroDollar
		      Return "TOTAL_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickLeadValueInDollar
		      Return "TOTAL_CLICK_LEAD_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickSearchValueInMicroDollar
		      Return "TOTAL_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickSearchValueInDollar
		      Return "TOTAL_CLICK_SEARCH_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickWatchVideoValueInMicroDollar
		      Return "TOTAL_CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickWatchVideoValueInDollar
		      Return "TOTAL_CLICK_WATCH_VIDEO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickViewCategoryValueInMicroDollar
		      Return "TOTAL_CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickViewCategoryValueInDollar
		      Return "TOTAL_CLICK_VIEW_CATEGORY_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickAppInstallValueInMicroDollar
		      Return "TOTAL_CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickUnknownValueInMicroDollar
		      Return "TOTAL_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickAddPaymentInfoValueInDollar
		      Return "TOTAL_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickAddToWishlistValueInMicroDollar
		      Return "TOTAL_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickAddToWishlistValueInDollar
		      Return "TOTAL_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickInitiateCheckoutValueInDollar
		      Return "TOTAL_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickSubscribeValueInMicroDollar
		      Return "TOTAL_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickSubscribeValueInDollar
		      Return "TOTAL_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickViewContentValueInMicroDollar
		      Return "TOTAL_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickViewContentValueInDollar
		      Return "TOTAL_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewPageVisitValueInMicroDollar
		      Return "TOTAL_VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewPageVisitValueInDollar
		      Return "TOTAL_VIEW_PAGE_VISIT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewSignupValueInMicroDollar
		      Return "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewSignupValueInDollar
		      Return "TOTAL_VIEW_SIGNUP_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewCheckoutValueInMicroDollar
		      Return "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewCheckoutValueInDollar
		      Return "TOTAL_VIEW_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewCustomValueInMicroDollar
		      Return "TOTAL_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewCustomValueInDollar
		      Return "TOTAL_VIEW_CUSTOM_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewAddToCartValueInMicroDollar
		      Return "TOTAL_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewAddToCartValueInDollar
		      Return "TOTAL_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewLeadValueInMicroDollar
		      Return "TOTAL_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewLeadValueInDollar
		      Return "TOTAL_VIEW_LEAD_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewSearchValueInMicroDollar
		      Return "TOTAL_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewSearchValueInDollar
		      Return "TOTAL_VIEW_SEARCH_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewWatchVideoValueInMicroDollar
		      Return "TOTAL_VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewWatchVideoValueInDollar
		      Return "TOTAL_VIEW_WATCH_VIDEO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewViewCategoryValueInMicroDollar
		      Return "TOTAL_VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewViewCategoryValueInDollar
		      Return "TOTAL_VIEW_VIEW_CATEGORY_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewAppInstallValueInMicroDollar
		      Return "TOTAL_VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewUnknownValueInMicroDollar
		      Return "TOTAL_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewAddPaymentInfoValueInDollar
		      Return "TOTAL_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewAddToWishlistValueInMicroDollar
		      Return "TOTAL_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewAddToWishlistValueInDollar
		      Return "TOTAL_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewInitiateCheckoutValueInDollar
		      Return "TOTAL_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewSubscribeValueInMicroDollar
		      Return "TOTAL_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewSubscribeValueInDollar
		      Return "TOTAL_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewViewContentValueInMicroDollar
		      Return "TOTAL_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewViewContentValueInDollar
		      Return "TOTAL_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalConversionsValueInMicroDollar
		      Return "TOTAL_CONVERSIONS_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalConversionsValueInDollar
		      Return "TOTAL_CONVERSIONS_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementPageVisitQuantity
		      Return "TOTAL_ENGAGEMENT_PAGE_VISIT_QUANTITY"
		    Case ColumnsEnum.TotalEngagementSignupQuantity
		      Return "TOTAL_ENGAGEMENT_SIGNUP_QUANTITY"
		    Case ColumnsEnum.TotalEngagementCheckoutQuantity
		      Return "TOTAL_ENGAGEMENT_CHECKOUT_QUANTITY"
		    Case ColumnsEnum.TotalEngagementCustomQuantity
		      Return "TOTAL_ENGAGEMENT_CUSTOM_QUANTITY"
		    Case ColumnsEnum.TotalEngagementAddToCartQuantity
		      Return "TOTAL_ENGAGEMENT_ADD_TO_CART_QUANTITY"
		    Case ColumnsEnum.TotalEngagementLeadQuantity
		      Return "TOTAL_ENGAGEMENT_LEAD_QUANTITY"
		    Case ColumnsEnum.TotalEngagementSearchQuantity
		      Return "TOTAL_ENGAGEMENT_SEARCH_QUANTITY"
		    Case ColumnsEnum.TotalEngagementWatchVideoQuantity
		      Return "TOTAL_ENGAGEMENT_WATCH_VIDEO_QUANTITY"
		    Case ColumnsEnum.TotalEngagementViewCategoryQuantity
		      Return "TOTAL_ENGAGEMENT_VIEW_CATEGORY_QUANTITY"
		    Case ColumnsEnum.TotalEngagementAppInstallQuantity
		      Return "TOTAL_ENGAGEMENT_APP_INSTALL_QUANTITY"
		    Case ColumnsEnum.TotalEngagementUnknownQuantity
		      Return "TOTAL_ENGAGEMENT_UNKNOWN_QUANTITY"
		    Case ColumnsEnum.TotalEngagementAddPaymentInfoQuantity
		      Return "TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_QUANTITY"
		    Case ColumnsEnum.TotalEngagementAddToWishlistQuantity
		      Return "TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_QUANTITY"
		    Case ColumnsEnum.TotalEngagementInitiateCheckoutQuantity
		      Return "TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_QUANTITY"
		    Case ColumnsEnum.TotalEngagementSubscribeQuantity
		      Return "TOTAL_ENGAGEMENT_SUBSCRIBE_QUANTITY"
		    Case ColumnsEnum.TotalEngagementViewContentQuantity
		      Return "TOTAL_ENGAGEMENT_VIEW_CONTENT_QUANTITY"
		    Case ColumnsEnum.TotalClickPageVisitQuantity
		      Return "TOTAL_CLICK_PAGE_VISIT_QUANTITY"
		    Case ColumnsEnum.TotalClickSignupQuantity
		      Return "TOTAL_CLICK_SIGNUP_QUANTITY"
		    Case ColumnsEnum.TotalClickCheckoutQuantity
		      Return "TOTAL_CLICK_CHECKOUT_QUANTITY"
		    Case ColumnsEnum.TotalClickCustomQuantity
		      Return "TOTAL_CLICK_CUSTOM_QUANTITY"
		    Case ColumnsEnum.TotalClickAddToCartQuantity
		      Return "TOTAL_CLICK_ADD_TO_CART_QUANTITY"
		    Case ColumnsEnum.TotalClickLeadQuantity
		      Return "TOTAL_CLICK_LEAD_QUANTITY"
		    Case ColumnsEnum.TotalClickSearchQuantity
		      Return "TOTAL_CLICK_SEARCH_QUANTITY"
		    Case ColumnsEnum.TotalClickWatchVideoQuantity
		      Return "TOTAL_CLICK_WATCH_VIDEO_QUANTITY"
		    Case ColumnsEnum.TotalClickViewCategoryQuantity
		      Return "TOTAL_CLICK_VIEW_CATEGORY_QUANTITY"
		    Case ColumnsEnum.TotalClickAppInstallQuantity
		      Return "TOTAL_CLICK_APP_INSTALL_QUANTITY"
		    Case ColumnsEnum.TotalClickUnknownQuantity
		      Return "TOTAL_CLICK_UNKNOWN_QUANTITY"
		    Case ColumnsEnum.TotalClickAddPaymentInfoQuantity
		      Return "TOTAL_CLICK_ADD_PAYMENT_INFO_QUANTITY"
		    Case ColumnsEnum.TotalClickAddToWishlistQuantity
		      Return "TOTAL_CLICK_ADD_TO_WISHLIST_QUANTITY"
		    Case ColumnsEnum.TotalClickInitiateCheckoutQuantity
		      Return "TOTAL_CLICK_INITIATE_CHECKOUT_QUANTITY"
		    Case ColumnsEnum.TotalClickSubscribeQuantity
		      Return "TOTAL_CLICK_SUBSCRIBE_QUANTITY"
		    Case ColumnsEnum.TotalClickViewContentQuantity
		      Return "TOTAL_CLICK_VIEW_CONTENT_QUANTITY"
		    Case ColumnsEnum.TotalViewPageVisitQuantity
		      Return "TOTAL_VIEW_PAGE_VISIT_QUANTITY"
		    Case ColumnsEnum.TotalViewSignupQuantity
		      Return "TOTAL_VIEW_SIGNUP_QUANTITY"
		    Case ColumnsEnum.TotalViewCheckoutQuantity
		      Return "TOTAL_VIEW_CHECKOUT_QUANTITY"
		    Case ColumnsEnum.TotalViewCustomQuantity
		      Return "TOTAL_VIEW_CUSTOM_QUANTITY"
		    Case ColumnsEnum.TotalViewAddToCartQuantity
		      Return "TOTAL_VIEW_ADD_TO_CART_QUANTITY"
		    Case ColumnsEnum.TotalViewLeadQuantity
		      Return "TOTAL_VIEW_LEAD_QUANTITY"
		    Case ColumnsEnum.TotalViewSearchQuantity
		      Return "TOTAL_VIEW_SEARCH_QUANTITY"
		    Case ColumnsEnum.TotalViewWatchVideoQuantity
		      Return "TOTAL_VIEW_WATCH_VIDEO_QUANTITY"
		    Case ColumnsEnum.TotalViewViewCategoryQuantity
		      Return "TOTAL_VIEW_VIEW_CATEGORY_QUANTITY"
		    Case ColumnsEnum.TotalViewAppInstallQuantity
		      Return "TOTAL_VIEW_APP_INSTALL_QUANTITY"
		    Case ColumnsEnum.TotalViewUnknownQuantity
		      Return "TOTAL_VIEW_UNKNOWN_QUANTITY"
		    Case ColumnsEnum.TotalViewAddPaymentInfoQuantity
		      Return "TOTAL_VIEW_ADD_PAYMENT_INFO_QUANTITY"
		    Case ColumnsEnum.TotalViewAddToWishlistQuantity
		      Return "TOTAL_VIEW_ADD_TO_WISHLIST_QUANTITY"
		    Case ColumnsEnum.TotalViewInitiateCheckoutQuantity
		      Return "TOTAL_VIEW_INITIATE_CHECKOUT_QUANTITY"
		    Case ColumnsEnum.TotalViewSubscribeQuantity
		      Return "TOTAL_VIEW_SUBSCRIBE_QUANTITY"
		    Case ColumnsEnum.TotalViewViewContentQuantity
		      Return "TOTAL_VIEW_VIEW_CONTENT_QUANTITY"
		    Case ColumnsEnum.TotalConversionsQuantity
		      Return "TOTAL_CONVERSIONS_QUANTITY"
		    Case ColumnsEnum.CostPerConversionInDollar
		      Return "COST_PER_CONVERSION_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebSessions
		      Return "TOTAL_WEB_SESSIONS"
		    Case ColumnsEnum.WebSessions1
		      Return "WEB_SESSIONS_1"
		    Case ColumnsEnum.WebSessions2
		      Return "WEB_SESSIONS_2"
		    Case ColumnsEnum.AppInstallsCpaBillable
		      Return "APP_INSTALLS_CPA_BILLABLE"
		    Case ColumnsEnum.AppInstallsClick
		      Return "APP_INSTALLS_CLICK"
		    Case ColumnsEnum.AppInstallsCloseuprepin
		      Return "APP_INSTALLS_CLOSEUPREPIN"
		    Case ColumnsEnum.AppInstallsView
		      Return "APP_INSTALLS_VIEW"
		    Case ColumnsEnum.AppInstalls
		      Return "APP_INSTALLS"
		    Case ColumnsEnum.AppInstallsEngagement
		      Return "APP_INSTALLS_ENGAGEMENT"
		    Case ColumnsEnum.AppInstallsClick1
		      Return "APP_INSTALLS_CLICK_1"
		    Case ColumnsEnum.AppInstallsClick2
		      Return "APP_INSTALLS_CLICK_2"
		    Case ColumnsEnum.AppInstallsView1
		      Return "APP_INSTALLS_VIEW_1"
		    Case ColumnsEnum.AppInstallsView2
		      Return "APP_INSTALLS_VIEW_2"
		    Case ColumnsEnum.AppInstallsEngagement1
		      Return "APP_INSTALLS_ENGAGEMENT_1"
		    Case ColumnsEnum.AppInstallsEngagement2
		      Return "APP_INSTALLS_ENGAGEMENT_2"
		    Case ColumnsEnum.AppInstalls1
		      Return "APP_INSTALLS_1"
		    Case ColumnsEnum.AppInstalls2
		      Return "APP_INSTALLS_2"
		    Case ColumnsEnum.CpiInMicroDollar
		      Return "CPI_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.EcpiInMicroDollar
		      Return "ECPI_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.CpiInDollar
		      Return "CPI_IN_DOLLAR"
		    Case ColumnsEnum.EcpiInDollar
		      Return "ECPI_IN_DOLLAR"
		    Case ColumnsEnum.InappSkanAppInstall
		      Return "INAPP_SKAN_APP_INSTALL"
		    Case ColumnsEnum.InappSkanAssistedAppInstall
		      Return "INAPP_SKAN_ASSISTED_APP_INSTALL"
		    Case ColumnsEnum.InappSkanAppInstallCostPerAction
		      Return "INAPP_SKAN_APP_INSTALL_COST_PER_ACTION"
		    Case ColumnsEnum.InappSkanAppInstallConversionRate
		      Return "INAPP_SKAN_APP_INSTALL_CONVERSION_RATE"
		    Case ColumnsEnum.OnsiteCheckoutsCpaBillable1
		      Return "ONSITE_CHECKOUTS_CPA_BILLABLE_1"
		    Case ColumnsEnum.OnsiteCheckoutsCpaBillable2
		      Return "ONSITE_CHECKOUTS_CPA_BILLABLE_2"
		    Case ColumnsEnum.OnsiteCheckoutsCpaBillable
		      Return "ONSITE_CHECKOUTS_CPA_BILLABLE"
		    Case ColumnsEnum.OnsiteCheckoutsValue1
		      Return "ONSITE_CHECKOUTS_VALUE_1"
		    Case ColumnsEnum.OnsiteCheckoutsValue2
		      Return "ONSITE_CHECKOUTS_VALUE_2"
		    Case ColumnsEnum.OnsiteCheckoutsValue
		      Return "ONSITE_CHECKOUTS_VALUE"
		    Case ColumnsEnum.OnsiteCheckouts1
		      Return "ONSITE_CHECKOUTS_1"
		    Case ColumnsEnum.OnsiteCheckouts2
		      Return "ONSITE_CHECKOUTS_2"
		    Case ColumnsEnum.OnsiteCheckouts
		      Return "ONSITE_CHECKOUTS"
		    Case ColumnsEnum.OnsiteCheckoutsValueInMicroDollar1
		      Return "ONSITE_CHECKOUTS_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.OnsiteCheckoutsValueInMicroDollar2
		      Return "ONSITE_CHECKOUTS_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ConversionRate
		      Return "CONVERSION_RATE"
		    Case ColumnsEnum.AverageCheckoutValue
		      Return "AVERAGE_CHECKOUT_VALUE"
		    Case ColumnsEnum.ReturnOnAdvertiserSpend
		      Return "RETURN_ON_ADVERTISER_SPEND"
		    Case ColumnsEnum.BuyButtonClicks1
		      Return "BUY_BUTTON_CLICKS_1"
		    Case ColumnsEnum.BuyButtonClicks2
		      Return "BUY_BUTTON_CLICKS_2"
		    Case ColumnsEnum.TotalBuyButtonClicks
		      Return "TOTAL_BUY_BUTTON_CLICKS"
		    Case ColumnsEnum.OrderDropoffRate
		      Return "ORDER_DROPOFF_RATE"
		    Case ColumnsEnum.OnsiteCheckoutsValueInMicroDollar
		      Return "ONSITE_CHECKOUTS_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.OnsiteCheckoutsValueInDollar
		      Return "ONSITE_CHECKOUTS_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.PinPromotionName
		      Return "PIN_PROMOTION_NAME"
		    Case ColumnsEnum.AdName
		      Return "AD_NAME"
		    Case ColumnsEnum.LifetimeImpressionUser1
		      Return "LIFETIME_IMPRESSION_USER_1"
		    Case ColumnsEnum.PinPromotionCampaignId
		      Return "PIN_PROMOTION_CAMPAIGN_ID"
		    Case ColumnsEnum.PinPromotionCampaignName
		      Return "PIN_PROMOTION_CAMPAIGN_NAME"
		    Case ColumnsEnum.PinPromotionCampaignActionType
		      Return "PIN_PROMOTION_CAMPAIGN_ACTION_TYPE"
		    Case ColumnsEnum.TotalLifetimeImpressionUser
		      Return "TOTAL_LIFETIME_IMPRESSION_USER"
		    Case ColumnsEnum.PinPromotionCampaignStatus
		      Return "PIN_PROMOTION_CAMPAIGN_STATUS"
		    Case ColumnsEnum.PinPromotionCampaignManagedStatus
		      Return "PIN_PROMOTION_CAMPAIGN_MANAGED_STATUS"
		    Case ColumnsEnum.PinPromotionCampaignEntityStatus
		      Return "PIN_PROMOTION_CAMPAIGN_ENTITY_STATUS"
		    Case ColumnsEnum.PinPromotionAdGroupId
		      Return "PIN_PROMOTION_AD_GROUP_ID"
		    Case ColumnsEnum.PinPromotionAdGroupName
		      Return "PIN_PROMOTION_AD_GROUP_NAME"
		    Case ColumnsEnum.PinPromotionAdGroupStatus
		      Return "PIN_PROMOTION_AD_GROUP_STATUS"
		    Case ColumnsEnum.PinPromotionAdGroupEntityStatus
		      Return "PIN_PROMOTION_AD_GROUP_ENTITY_STATUS"
		    Case ColumnsEnum.PinPromotionCreativeType
		      Return "PIN_PROMOTION_CREATIVE_TYPE"
		    Case ColumnsEnum.PinPromotionEntityStatus
		      Return "PIN_PROMOTION_ENTITY_STATUS"
		    Case ColumnsEnum.PinPromotionCreativeTypeV2
		      Return "PIN_PROMOTION_CREATIVE_TYPE_V2"
		    Case ColumnsEnum.PinPromotionReviewStatus
		      Return "PIN_PROMOTION_REVIEW_STATUS"
		    Case ColumnsEnum.AdGroupCampaignActionType
		      Return "AD_GROUP_CAMPAIGN_ACTION_TYPE"
		    Case ColumnsEnum.AdGroupCampaignId
		      Return "AD_GROUP_CAMPAIGN_ID"
		    Case ColumnsEnum.AdGroupCampaignName
		      Return "AD_GROUP_CAMPAIGN_NAME"
		    Case ColumnsEnum.AdGroupCampaignStatus
		      Return "AD_GROUP_CAMPAIGN_STATUS"
		    Case ColumnsEnum.AdGroupCreativeType
		      Return "AD_GROUP_CREATIVE_TYPE"
		    Case ColumnsEnum.AdGroupCampaignManagedStatus
		      Return "AD_GROUP_CAMPAIGN_MANAGED_STATUS"
		    Case ColumnsEnum.AdGroupCampaignEntityStatus
		      Return "AD_GROUP_CAMPAIGN_ENTITY_STATUS"
		    Case ColumnsEnum.AdGroupStartDate
		      Return "AD_GROUP_START_DATE"
		    Case ColumnsEnum.CampaignLifetimeSpendCap
		      Return "CAMPAIGN_LIFETIME_SPEND_CAP"
		    Case ColumnsEnum.AdGroupBidInMicroCurrency
		      Return "AD_GROUP_BID_IN_MICRO_CURRENCY"
		    Case ColumnsEnum.CampaignAdGroupStartDate
		      Return "CAMPAIGN_AD_GROUP_START_DATE"
		    Case ColumnsEnum.CampaignAdGroupEndDate
		      Return "CAMPAIGN_AD_GROUP_END_DATE"
		    Case ColumnsEnum.CampaignNumberOfAdGroups
		      Return "CAMPAIGN_NUMBER_OF_AD_GROUPS"
		    Case ColumnsEnum.AdGroupNumberOfPinPromotions
		      Return "AD_GROUP_NUMBER_OF_PIN_PROMOTIONS"
		    Case ColumnsEnum.TodaySpendInLocalCurrency
		      Return "TODAY_SPEND_IN_LOCAL_CURRENCY"
		    Case ColumnsEnum.TotalLifetimeSpendInLocalCurrency
		      Return "TOTAL_LIFETIME_SPEND_IN_LOCAL_CURRENCY"
		    Case ColumnsEnum.BudgetUtilization
		      Return "BUDGET_UTILIZATION"
		    Case ColumnsEnum.AdGroupOptimization
		      Return "AD_GROUP_OPTIMIZATION"
		    Case ColumnsEnum.InsertionOrder
		      Return "INSERTION_ORDER"
		    Case ColumnsEnum.AdGroupBonusBudget
		      Return "AD_GROUP_BONUS_BUDGET"
		    Case ColumnsEnum.Frequency
		      Return "FREQUENCY"
		    Case ColumnsEnum.CampaignDailySpendCap
		      Return "CAMPAIGN_DAILY_SPEND_CAP"
		    Case ColumnsEnum.CampaignCreativeType
		      Return "CAMPAIGN_CREATIVE_TYPE"
		    Case ColumnsEnum.AdGroupPlacementGroupType
		      Return "AD_GROUP_PLACEMENT_GROUP_TYPE"
		    Case ColumnsEnum.AdGroupIsPrefetchEnabled
		      Return "AD_GROUP_IS_PREFETCH_ENABLED"
		    Case ColumnsEnum.CampaignBudgetOptimization
		      Return "CAMPAIGN_BUDGET_OPTIMIZATION"
		    Case ColumnsEnum.CampaignStartDate
		      Return "CAMPAIGN_START_DATE"
		    Case ColumnsEnum.IsAutomatedCampaign
		      Return "IS_AUTOMATED_CAMPAIGN"
		    Case ColumnsEnum.IsPremiereCampaign
		      Return "IS_PREMIERE_CAMPAIGN"
		    Case ColumnsEnum.FlexibleDailyBudgets
		      Return "FLEXIBLE_DAILY_BUDGETS"
		    Case ColumnsEnum.IsPerformancePlusCampaign
		      Return "IS_PERFORMANCE_PLUS_CAMPAIGN"
		    Case ColumnsEnum.IsDcoFormatEnhancment
		      Return "IS_DCO_FORMAT_ENHANCMENT"
		    Case ColumnsEnum.PercentCrossDeviceConversions
		      Return "PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ColumnsEnum.PageVisitPercentCrossDeviceConversions
		      Return "PAGE_VISIT_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ColumnsEnum.SignupPercentCrossDeviceConversions
		      Return "SIGNUP_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ColumnsEnum.CheckoutPercentCrossDeviceConversions
		      Return "CHECKOUT_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ColumnsEnum.CustomPercentCrossDeviceConversions
		      Return "CUSTOM_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ColumnsEnum.AddToCartPercentCrossDeviceConversions
		      Return "ADD_TO_CART_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ColumnsEnum.LeadPercentCrossDeviceConversions
		      Return "LEAD_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ColumnsEnum.SearchPercentCrossDeviceConversions
		      Return "SEARCH_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ColumnsEnum.WatchVideoPercentCrossDeviceConversions
		      Return "WATCH_VIDEO_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ColumnsEnum.ViewCategoryPercentCrossDeviceConversions
		      Return "VIEW_CATEGORY_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ColumnsEnum.AppInstallPercentCrossDeviceConversions
		      Return "APP_INSTALL_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ColumnsEnum.UnknownPercentCrossDeviceConversions
		      Return "UNKNOWN_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ColumnsEnum.TotalDesktopActionToDesktopConversion
		      Return "TOTAL_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalDesktopActionToMobileConversion
		      Return "TOTAL_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalDesktopActionToTabletConversion
		      Return "TOTAL_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalMobileActionToDesktopConversion
		      Return "TOTAL_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalMobileActionToMobileConversion
		      Return "TOTAL_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalMobileActionToTabletConversion
		      Return "TOTAL_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalTabletActionToDesktopConversion
		      Return "TOTAL_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalTabletActionToMobileConversion
		      Return "TOTAL_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalTabletActionToTabletConversion
		      Return "TOTAL_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalPageVisitDesktopActionToDesktopConversion
		      Return "TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalPageVisitDesktopActionToMobileConversion
		      Return "TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalPageVisitDesktopActionToTabletConversion
		      Return "TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalPageVisitMobileActionToDesktopConversion
		      Return "TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalPageVisitMobileActionToMobileConversion
		      Return "TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalPageVisitMobileActionToTabletConversion
		      Return "TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalPageVisitTabletActionToDesktopConversion
		      Return "TOTAL_PAGE_VISIT_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalPageVisitTabletActionToMobileConversion
		      Return "TOTAL_PAGE_VISIT_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalPageVisitTabletActionToTabletConversion
		      Return "TOTAL_PAGE_VISIT_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalSignupDesktopActionToDesktopConversion
		      Return "TOTAL_SIGNUP_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalSignupDesktopActionToMobileConversion
		      Return "TOTAL_SIGNUP_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalSignupDesktopActionToTabletConversion
		      Return "TOTAL_SIGNUP_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalSignupMobileActionToDesktopConversion
		      Return "TOTAL_SIGNUP_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalSignupMobileActionToMobileConversion
		      Return "TOTAL_SIGNUP_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalSignupMobileActionToTabletConversion
		      Return "TOTAL_SIGNUP_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalSignupTabletActionToDesktopConversion
		      Return "TOTAL_SIGNUP_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalSignupTabletActionToMobileConversion
		      Return "TOTAL_SIGNUP_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalSignupTabletActionToTabletConversion
		      Return "TOTAL_SIGNUP_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalCheckoutDesktopActionToDesktopConversion
		      Return "TOTAL_CHECKOUT_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalCheckoutDesktopActionToMobileConversion
		      Return "TOTAL_CHECKOUT_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalCheckoutDesktopActionToTabletConversion
		      Return "TOTAL_CHECKOUT_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalCheckoutMobileActionToDesktopConversion
		      Return "TOTAL_CHECKOUT_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalCheckoutMobileActionToMobileConversion
		      Return "TOTAL_CHECKOUT_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalCheckoutMobileActionToTabletConversion
		      Return "TOTAL_CHECKOUT_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalCheckoutTabletActionToDesktopConversion
		      Return "TOTAL_CHECKOUT_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalCheckoutTabletActionToMobileConversion
		      Return "TOTAL_CHECKOUT_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalCheckoutTabletActionToTabletConversion
		      Return "TOTAL_CHECKOUT_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalCustomDesktopActionToDesktopConversion
		      Return "TOTAL_CUSTOM_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalCustomDesktopActionToMobileConversion
		      Return "TOTAL_CUSTOM_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalCustomDesktopActionToTabletConversion
		      Return "TOTAL_CUSTOM_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalCustomMobileActionToDesktopConversion
		      Return "TOTAL_CUSTOM_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalCustomMobileActionToMobileConversion
		      Return "TOTAL_CUSTOM_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalCustomMobileActionToTabletConversion
		      Return "TOTAL_CUSTOM_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalCustomTabletActionToDesktopConversion
		      Return "TOTAL_CUSTOM_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalCustomTabletActionToMobileConversion
		      Return "TOTAL_CUSTOM_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalCustomTabletActionToTabletConversion
		      Return "TOTAL_CUSTOM_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalAddToCartDesktopActionToDesktopConversion
		      Return "TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalAddToCartDesktopActionToMobileConversion
		      Return "TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalAddToCartDesktopActionToTabletConversion
		      Return "TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalAddToCartMobileActionToDesktopConversion
		      Return "TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalAddToCartMobileActionToMobileConversion
		      Return "TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalAddToCartMobileActionToTabletConversion
		      Return "TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalAddToCartTabletActionToDesktopConversion
		      Return "TOTAL_ADD_TO_CART_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalAddToCartTabletActionToMobileConversion
		      Return "TOTAL_ADD_TO_CART_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalAddToCartTabletActionToTabletConversion
		      Return "TOTAL_ADD_TO_CART_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalLeadDesktopActionToDesktopConversion
		      Return "TOTAL_LEAD_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalLeadDesktopActionToMobileConversion
		      Return "TOTAL_LEAD_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalLeadDesktopActionToTabletConversion
		      Return "TOTAL_LEAD_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalLeadMobileActionToDesktopConversion
		      Return "TOTAL_LEAD_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalLeadMobileActionToMobileConversion
		      Return "TOTAL_LEAD_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalLeadMobileActionToTabletConversion
		      Return "TOTAL_LEAD_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalLeadTabletActionToDesktopConversion
		      Return "TOTAL_LEAD_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalLeadTabletActionToMobileConversion
		      Return "TOTAL_LEAD_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalLeadTabletActionToTabletConversion
		      Return "TOTAL_LEAD_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalSearchDesktopActionToDesktopConversion
		      Return "TOTAL_SEARCH_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalSearchDesktopActionToMobileConversion
		      Return "TOTAL_SEARCH_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalSearchDesktopActionToTabletConversion
		      Return "TOTAL_SEARCH_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalSearchMobileActionToDesktopConversion
		      Return "TOTAL_SEARCH_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalSearchMobileActionToMobileConversion
		      Return "TOTAL_SEARCH_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalSearchMobileActionToTabletConversion
		      Return "TOTAL_SEARCH_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalSearchTabletActionToDesktopConversion
		      Return "TOTAL_SEARCH_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalSearchTabletActionToMobileConversion
		      Return "TOTAL_SEARCH_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalSearchTabletActionToTabletConversion
		      Return "TOTAL_SEARCH_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalWatchVideoDesktopActionToDesktopConversion
		      Return "TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalWatchVideoDesktopActionToMobileConversion
		      Return "TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalWatchVideoDesktopActionToTabletConversion
		      Return "TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalWatchVideoMobileActionToDesktopConversion
		      Return "TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalWatchVideoMobileActionToMobileConversion
		      Return "TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalWatchVideoMobileActionToTabletConversion
		      Return "TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalWatchVideoTabletActionToDesktopConversion
		      Return "TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalWatchVideoTabletActionToMobileConversion
		      Return "TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalWatchVideoTabletActionToTabletConversion
		      Return "TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalViewCategoryDesktopActionToDesktopConversion
		      Return "TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalViewCategoryDesktopActionToMobileConversion
		      Return "TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalViewCategoryDesktopActionToTabletConversion
		      Return "TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalViewCategoryMobileActionToDesktopConversion
		      Return "TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalViewCategoryMobileActionToMobileConversion
		      Return "TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalViewCategoryMobileActionToTabletConversion
		      Return "TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalViewCategoryTabletActionToDesktopConversion
		      Return "TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalViewCategoryTabletActionToMobileConversion
		      Return "TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalViewCategoryTabletActionToTabletConversion
		      Return "TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalAppInstallDesktopActionToDesktopConversion
		      Return "TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalAppInstallDesktopActionToMobileConversion
		      Return "TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalAppInstallDesktopActionToTabletConversion
		      Return "TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalAppInstallMobileActionToDesktopConversion
		      Return "TOTAL_APP_INSTALL_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalAppInstallMobileActionToMobileConversion
		      Return "TOTAL_APP_INSTALL_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalAppInstallMobileActionToTabletConversion
		      Return "TOTAL_APP_INSTALL_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalAppInstallTabletActionToDesktopConversion
		      Return "TOTAL_APP_INSTALL_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalAppInstallTabletActionToMobileConversion
		      Return "TOTAL_APP_INSTALL_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalAppInstallTabletActionToTabletConversion
		      Return "TOTAL_APP_INSTALL_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalUnknownDesktopActionToDesktopConversion
		      Return "TOTAL_UNKNOWN_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalUnknownDesktopActionToMobileConversion
		      Return "TOTAL_UNKNOWN_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalUnknownDesktopActionToTabletConversion
		      Return "TOTAL_UNKNOWN_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalUnknownMobileActionToDesktopConversion
		      Return "TOTAL_UNKNOWN_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalUnknownMobileActionToMobileConversion
		      Return "TOTAL_UNKNOWN_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalUnknownMobileActionToTabletConversion
		      Return "TOTAL_UNKNOWN_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalUnknownTabletActionToDesktopConversion
		      Return "TOTAL_UNKNOWN_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ColumnsEnum.TotalUnknownTabletActionToMobileConversion
		      Return "TOTAL_UNKNOWN_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ColumnsEnum.TotalUnknownTabletActionToTabletConversion
		      Return "TOTAL_UNKNOWN_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ColumnsEnum.TotalPageVisit
		      Return "TOTAL_PAGE_VISIT"
		    Case ColumnsEnum.TotalSignup
		      Return "TOTAL_SIGNUP"
		    Case ColumnsEnum.TotalCheckout
		      Return "TOTAL_CHECKOUT"
		    Case ColumnsEnum.TotalCustom
		      Return "TOTAL_CUSTOM"
		    Case ColumnsEnum.TotalAddToCart
		      Return "TOTAL_ADD_TO_CART"
		    Case ColumnsEnum.TotalLead
		      Return "TOTAL_LEAD"
		    Case ColumnsEnum.TotalSearch
		      Return "TOTAL_SEARCH"
		    Case ColumnsEnum.TotalWatchVideo
		      Return "TOTAL_WATCH_VIDEO"
		    Case ColumnsEnum.TotalViewCategory
		      Return "TOTAL_VIEW_CATEGORY"
		    Case ColumnsEnum.TotalAppInstall
		      Return "TOTAL_APP_INSTALL"
		    Case ColumnsEnum.TotalUnknown
		      Return "TOTAL_UNKNOWN"
		    Case ColumnsEnum.TotalAddPaymentInfo
		      Return "TOTAL_ADD_PAYMENT_INFO"
		    Case ColumnsEnum.TotalAddToWishlist
		      Return "TOTAL_ADD_TO_WISHLIST"
		    Case ColumnsEnum.TotalInitiateCheckout
		      Return "TOTAL_INITIATE_CHECKOUT"
		    Case ColumnsEnum.TotalSubscribe
		      Return "TOTAL_SUBSCRIBE"
		    Case ColumnsEnum.TotalViewContent
		      Return "TOTAL_VIEW_CONTENT"
		    Case ColumnsEnum.TotalPageVisitValueInMicroDollar
		      Return "TOTAL_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalSignupValueInMicroDollar
		      Return "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalCheckoutValueInMicroDollar
		      Return "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalCustomValueInMicroDollar
		      Return "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalAddToCartValueInMicroDollar
		      Return "TOTAL_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalLeadValueInMicroDollar
		      Return "TOTAL_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalSearchValueInMicroDollar
		      Return "TOTAL_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWatchVideoValueInMicroDollar
		      Return "TOTAL_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewCategoryValueInMicroDollar
		      Return "TOTAL_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalAppInstallValueInMicroDollar
		      Return "TOTAL_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalUnknownValueInMicroDollar
		      Return "TOTAL_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalAddToWishlistValueInMicroDollar
		      Return "TOTAL_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalSubscribeValueInMicroDollar
		      Return "TOTAL_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewContentValueInMicroDollar
		      Return "TOTAL_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AveragePageVisitValueInMicroDollar
		      Return "AVERAGE_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageSignupValueInMicroDollar
		      Return "AVERAGE_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageCheckoutValueInMicroDollar
		      Return "AVERAGE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageCustomValueInMicroDollar
		      Return "AVERAGE_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageAddToCartValueInMicroDollar
		      Return "AVERAGE_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageLeadValueInMicroDollar
		      Return "AVERAGE_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageSearchValueInMicroDollar
		      Return "AVERAGE_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageWatchVideoValueInMicroDollar
		      Return "AVERAGE_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageViewCategoryValueInMicroDollar
		      Return "AVERAGE_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageUnknownValueInMicroDollar
		      Return "AVERAGE_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageAddPaymentInfoValueInMicroDollar
		      Return "AVERAGE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageAddToWishlistValueInMicroDollar
		      Return "AVERAGE_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageInitiateCheckoutValueInMicroDollar
		      Return "AVERAGE_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageSubscribeValueInMicroDollar
		      Return "AVERAGE_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageViewContentValueInMicroDollar
		      Return "AVERAGE_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AveragePageVisitValueInMicroUsDollar
		      Return "AVERAGE_PAGE_VISIT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.AverageSignupValueInMicroUsDollar
		      Return "AVERAGE_SIGNUP_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.AverageCheckoutValueInMicroUsDollar
		      Return "AVERAGE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.AverageCustomValueInMicroUsDollar
		      Return "AVERAGE_CUSTOM_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.AverageAddToCartValueInMicroUsDollar
		      Return "AVERAGE_ADD_TO_CART_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.AverageLeadValueInMicroUsDollar
		      Return "AVERAGE_LEAD_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.AverageSearchValueInMicroUsDollar
		      Return "AVERAGE_SEARCH_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.AverageWatchVideoValueInMicroUsDollar
		      Return "AVERAGE_WATCH_VIDEO_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.AverageViewCategoryValueInMicroUsDollar
		      Return "AVERAGE_VIEW_CATEGORY_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.AverageUnknownValueInMicroUsDollar
		      Return "AVERAGE_UNKNOWN_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.AverageAddPaymentInfoValueInMicroUsDollar
		      Return "AVERAGE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.AverageAddToWishlistValueInMicroUsDollar
		      Return "AVERAGE_ADD_TO_WISHLIST_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.AverageInitiateCheckoutValueInMicroUsDollar
		      Return "AVERAGE_INITIATE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.AverageSubscribeValueInMicroUsDollar
		      Return "AVERAGE_SUBSCRIBE_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.AverageViewContentValueInMicroUsDollar
		      Return "AVERAGE_VIEW_CONTENT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalPageVisitValueInMicroUsDollar
		      Return "TOTAL_PAGE_VISIT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalSignupValueInMicroUsDollar
		      Return "TOTAL_SIGNUP_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalCheckoutValueInMicroUsDollar
		      Return "TOTAL_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalCustomValueInMicroUsDollar
		      Return "TOTAL_CUSTOM_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalAddToCartValueInMicroUsDollar
		      Return "TOTAL_ADD_TO_CART_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalLeadValueInMicroUsDollar
		      Return "TOTAL_LEAD_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalSearchValueInMicroUsDollar
		      Return "TOTAL_SEARCH_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalWatchVideoValueInMicroUsDollar
		      Return "TOTAL_WATCH_VIDEO_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalViewCategoryValueInMicroUsDollar
		      Return "TOTAL_VIEW_CATEGORY_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalUnknownValueInMicroUsDollar
		      Return "TOTAL_UNKNOWN_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalAddPaymentInfoValueInMicroUsDollar
		      Return "TOTAL_ADD_PAYMENT_INFO_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalAddToWishlistValueInMicroUsDollar
		      Return "TOTAL_ADD_TO_WISHLIST_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalInitiateCheckoutValueInMicroUsDollar
		      Return "TOTAL_INITIATE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalSubscribeValueInMicroUsDollar
		      Return "TOTAL_SUBSCRIBE_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalViewContentValueInMicroUsDollar
		      Return "TOTAL_VIEW_CONTENT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalPageVisitQuantity
		      Return "TOTAL_PAGE_VISIT_QUANTITY"
		    Case ColumnsEnum.TotalSignupQuantity
		      Return "TOTAL_SIGNUP_QUANTITY"
		    Case ColumnsEnum.TotalCheckoutQuantity
		      Return "TOTAL_CHECKOUT_QUANTITY"
		    Case ColumnsEnum.TotalCustomQuantity
		      Return "TOTAL_CUSTOM_QUANTITY"
		    Case ColumnsEnum.TotalAddToCartQuantity
		      Return "TOTAL_ADD_TO_CART_QUANTITY"
		    Case ColumnsEnum.TotalLeadQuantity
		      Return "TOTAL_LEAD_QUANTITY"
		    Case ColumnsEnum.TotalSearchQuantity
		      Return "TOTAL_SEARCH_QUANTITY"
		    Case ColumnsEnum.TotalWatchVideoQuantity
		      Return "TOTAL_WATCH_VIDEO_QUANTITY"
		    Case ColumnsEnum.TotalViewCategoryQuantity
		      Return "TOTAL_VIEW_CATEGORY_QUANTITY"
		    Case ColumnsEnum.TotalAppInstallQuantity
		      Return "TOTAL_APP_INSTALL_QUANTITY"
		    Case ColumnsEnum.TotalUnknownQuantity
		      Return "TOTAL_UNKNOWN_QUANTITY"
		    Case ColumnsEnum.TotalAddPaymentInfoQuantity
		      Return "TOTAL_ADD_PAYMENT_INFO_QUANTITY"
		    Case ColumnsEnum.TotalAddToWishlistQuantity
		      Return "TOTAL_ADD_TO_WISHLIST_QUANTITY"
		    Case ColumnsEnum.TotalInitiateCheckoutQuantity
		      Return "TOTAL_INITIATE_CHECKOUT_QUANTITY"
		    Case ColumnsEnum.TotalSubscribeQuantity
		      Return "TOTAL_SUBSCRIBE_QUANTITY"
		    Case ColumnsEnum.TotalViewContentQuantity
		      Return "TOTAL_VIEW_CONTENT_QUANTITY"
		    Case ColumnsEnum.TotalPageVisitValueInDollar
		      Return "TOTAL_PAGE_VISIT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalSignupValueInDollar
		      Return "TOTAL_SIGNUP_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalCheckoutValueInDollar
		      Return "TOTAL_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalCustomValueInDollar
		      Return "TOTAL_CUSTOM_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalAddToCartValueInDollar
		      Return "TOTAL_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalLeadValueInDollar
		      Return "TOTAL_LEAD_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalSearchValueInDollar
		      Return "TOTAL_SEARCH_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWatchVideoValueInDollar
		      Return "TOTAL_WATCH_VIDEO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewCategoryValueInDollar
		      Return "TOTAL_VIEW_CATEGORY_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalAppInstallValueInDollar
		      Return "TOTAL_APP_INSTALL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalUnknownValueInDollar
		      Return "TOTAL_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalAddPaymentInfoValueInDollar
		      Return "TOTAL_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalAddToWishlistValueInDollar
		      Return "TOTAL_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInitiateCheckoutValueInDollar
		      Return "TOTAL_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalSubscribeValueInDollar
		      Return "TOTAL_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewContentValueInDollar
		      Return "TOTAL_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.PageVisitCostPerAction
		      Return "PAGE_VISIT_COST_PER_ACTION"
		    Case ColumnsEnum.SignupCostPerAction
		      Return "SIGNUP_COST_PER_ACTION"
		    Case ColumnsEnum.CheckoutCostPerAction
		      Return "CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum.CustomCostPerAction
		      Return "CUSTOM_COST_PER_ACTION"
		    Case ColumnsEnum.AddToCartCostPerAction
		      Return "ADD_TO_CART_COST_PER_ACTION"
		    Case ColumnsEnum.LeadCostPerAction
		      Return "LEAD_COST_PER_ACTION"
		    Case ColumnsEnum.SearchCostPerAction
		      Return "SEARCH_COST_PER_ACTION"
		    Case ColumnsEnum.WatchVideoCostPerAction
		      Return "WATCH_VIDEO_COST_PER_ACTION"
		    Case ColumnsEnum.ViewCategoryCostPerAction
		      Return "VIEW_CATEGORY_COST_PER_ACTION"
		    Case ColumnsEnum.AppInstallCostPerAction
		      Return "APP_INSTALL_COST_PER_ACTION"
		    Case ColumnsEnum.UnknownCostPerAction
		      Return "UNKNOWN_COST_PER_ACTION"
		    Case ColumnsEnum.AdGroupCpaInMicroCurrency
		      Return "AD_GROUP_CPA_IN_MICRO_CURRENCY"
		    Case ColumnsEnum.AddPaymentInfoCostPerAction
		      Return "ADD_PAYMENT_INFO_COST_PER_ACTION"
		    Case ColumnsEnum.AddToWishlistCostPerAction
		      Return "ADD_TO_WISHLIST_COST_PER_ACTION"
		    Case ColumnsEnum.InitiateCheckoutCostPerAction
		      Return "INITIATE_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum.SubscribeCostPerAction
		      Return "SUBSCRIBE_COST_PER_ACTION"
		    Case ColumnsEnum.ViewContentCostPerAction
		      Return "VIEW_CONTENT_COST_PER_ACTION"
		    Case ColumnsEnum.PageVisitCostPerActionInUsDollar
		      Return "PAGE_VISIT_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.SignupCostPerActionInUsDollar
		      Return "SIGNUP_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.CheckoutCostPerActionInUsDollar
		      Return "CHECKOUT_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.CustomCostPerActionInUsDollar
		      Return "CUSTOM_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.AddToCartCostPerActionInUsDollar
		      Return "ADD_TO_CART_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.LeadCostPerActionInUsDollar
		      Return "LEAD_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.SearchCostPerActionInUsDollar
		      Return "SEARCH_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.WatchVideoCostPerActionInUsDollar
		      Return "WATCH_VIDEO_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.ViewCategoryCostPerActionInUsDollar
		      Return "VIEW_CATEGORY_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.UnknownCostPerActionInUsDollar
		      Return "UNKNOWN_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.AddPaymentInfoCostPerActionInUsDollar
		      Return "ADD_PAYMENT_INFO_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.AddToWishlistCostPerActionInUsDollar
		      Return "ADD_TO_WISHLIST_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.InitiateCheckoutCostPerActionInUsDollar
		      Return "INITIATE_CHECKOUT_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.SubscribeCostPerActionInUsDollar
		      Return "SUBSCRIBE_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.ViewContentCostPerActionInUsDollar
		      Return "VIEW_CONTENT_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.PageVisitRoas
		      Return "PAGE_VISIT_ROAS"
		    Case ColumnsEnum.SignupRoas
		      Return "SIGNUP_ROAS"
		    Case ColumnsEnum.CheckoutRoas
		      Return "CHECKOUT_ROAS"
		    Case ColumnsEnum.CustomRoas
		      Return "CUSTOM_ROAS"
		    Case ColumnsEnum.AddToCartRoas
		      Return "ADD_TO_CART_ROAS"
		    Case ColumnsEnum.LeadRoas
		      Return "LEAD_ROAS"
		    Case ColumnsEnum.SearchRoas
		      Return "SEARCH_ROAS"
		    Case ColumnsEnum.WatchVideoRoas
		      Return "WATCH_VIDEO_ROAS"
		    Case ColumnsEnum.ViewCategoryRoas
		      Return "VIEW_CATEGORY_ROAS"
		    Case ColumnsEnum.AppInstallRoas
		      Return "APP_INSTALL_ROAS"
		    Case ColumnsEnum.UnknownRoas
		      Return "UNKNOWN_ROAS"
		    Case ColumnsEnum.Roas
		      Return "ROAS"
		    Case ColumnsEnum.ClickRoas
		      Return "CLICK_ROAS"
		    Case ColumnsEnum.EngagementRoas
		      Return "ENGAGEMENT_ROAS"
		    Case ColumnsEnum.ViewRoas
		      Return "VIEW_ROAS"
		    Case ColumnsEnum.AddPaymentInfoRoas
		      Return "ADD_PAYMENT_INFO_ROAS"
		    Case ColumnsEnum.AddToWishlistRoas
		      Return "ADD_TO_WISHLIST_ROAS"
		    Case ColumnsEnum.InitiateCheckoutRoas
		      Return "INITIATE_CHECKOUT_ROAS"
		    Case ColumnsEnum.SubscribeRoas
		      Return "SUBSCRIBE_ROAS"
		    Case ColumnsEnum.ViewContentRoas
		      Return "VIEW_CONTENT_ROAS"
		    Case ColumnsEnum.Hour
		      Return "HOUR"
		    Case ColumnsEnum.BoardEngagement
		      Return "BOARD_ENGAGEMENT"
		    Case ColumnsEnum.BoardInsertion
		      Return "BOARD_INSERTION"
		    Case ColumnsEnum.BoardImpression
		      Return "BOARD_IMPRESSION"
		    Case ColumnsEnum.BoardFollow
		      Return "BOARD_FOLLOW"
		    Case ColumnsEnum.BoardSend
		      Return "BOARD_SEND"
		    Case ColumnsEnum.BoardHide
		      Return "BOARD_HIDE"
		    Case ColumnsEnum.ProductGroupCampaignId
		      Return "PRODUCT_GROUP_CAMPAIGN_ID"
		    Case ColumnsEnum.ProductGroupCampaignName
		      Return "PRODUCT_GROUP_CAMPAIGN_NAME"
		    Case ColumnsEnum.ProductGroupCampaignActionType
		      Return "PRODUCT_GROUP_CAMPAIGN_ACTION_TYPE"
		    Case ColumnsEnum.ProductGroupCampaignStatus
		      Return "PRODUCT_GROUP_CAMPAIGN_STATUS"
		    Case ColumnsEnum.ProductGroupCampaignManagedStatus
		      Return "PRODUCT_GROUP_CAMPAIGN_MANAGED_STATUS"
		    Case ColumnsEnum.ProductGroupAdGroupId
		      Return "PRODUCT_GROUP_AD_GROUP_ID"
		    Case ColumnsEnum.ProductGroupAdGroupName
		      Return "PRODUCT_GROUP_AD_GROUP_NAME"
		    Case ColumnsEnum.ProductGroupAdGroupStatus
		      Return "PRODUCT_GROUP_AD_GROUP_STATUS"
		    Case ColumnsEnum.ProductGroupAdImageTag
		      Return "PRODUCT_GROUP_AD_IMAGE_TAG"
		    Case ColumnsEnum.ProductGroupAdVideoTag
		      Return "PRODUCT_GROUP_AD_VIDEO_TAG"
		    Case ColumnsEnum.PromotedCatalogProductGroupReferenceId
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_REFERENCE_ID"
		    Case ColumnsEnum.PromotedCatalogProductGroupReferenceName
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_REFERENCE_NAME"
		    Case ColumnsEnum.PromotedCatalogProductGroupId
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_ID"
		    Case ColumnsEnum.PromotedCatalogProductGroupBidInMicroCurrency
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_BID_IN_MICRO_CURRENCY"
		    Case ColumnsEnum.PromotedCatalogProductGroupStatus
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_STATUS"
		    Case ColumnsEnum.PromotedCatalogProductGroupEntityStatus
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_ENTITY_STATUS"
		    Case ColumnsEnum.PromotedCatalogProductGroupCampaignId
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_ID"
		    Case ColumnsEnum.PromotedCatalogProductGroupCampaignName
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_NAME"
		    Case ColumnsEnum.PromotedCatalogProductGroupCampaignActionType
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_ACTION_TYPE"
		    Case ColumnsEnum.PromotedCatalogProductGroupCampaignStatus
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_STATUS"
		    Case ColumnsEnum.PromotedCatalogProductGroupCampaignManagedStatus
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_MANAGED_STATUS"
		    Case ColumnsEnum.PromotedCatalogProductGroupAdGroupId
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_ID"
		    Case ColumnsEnum.PromotedCatalogProductGroupAdGroupName
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_NAME"
		    Case ColumnsEnum.PromotedCatalogProductGroupAdGroupStatus
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_STATUS"
		    Case ColumnsEnum.PromotedCatalogProductGroupTrackingTemplateUrl
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_TRACKING_TEMPLATE_URL"
		    Case ColumnsEnum.PromotedCatalogProductGroupSelectedImageTag
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_SELECTED_IMAGE_TAG"
		    Case ColumnsEnum.Video3secViews1
		      Return "VIDEO_3SEC_VIEWS_1"
		    Case ColumnsEnum.Video15secUniqueViews1
		      Return "VIDEO_15SEC_UNIQUE_VIEWS_1"
		    Case ColumnsEnum.VideoP0Complete1
		      Return "VIDEO_P0_COMPLETE_1"
		    Case ColumnsEnum.VideoP25Complete1
		      Return "VIDEO_P25_COMPLETE_1"
		    Case ColumnsEnum.VideoP50Complete1
		      Return "VIDEO_P50_COMPLETE_1"
		    Case ColumnsEnum.VideoP75Complete1
		      Return "VIDEO_P75_COMPLETE_1"
		    Case ColumnsEnum.VideoP95Complete1
		      Return "VIDEO_P95_COMPLETE_1"
		    Case ColumnsEnum.VideoP97Complete1
		      Return "VIDEO_P97_COMPLETE_1"
		    Case ColumnsEnum.VideoP100Complete1
		      Return "VIDEO_P100_COMPLETE_1"
		    Case ColumnsEnum.VideoP0Combined1
		      Return "VIDEO_P0_COMBINED_1"
		    Case ColumnsEnum.VideoP25Combined1
		      Return "VIDEO_P25_COMBINED_1"
		    Case ColumnsEnum.VideoP50Combined1
		      Return "VIDEO_P50_COMBINED_1"
		    Case ColumnsEnum.VideoP75Combined1
		      Return "VIDEO_P75_COMBINED_1"
		    Case ColumnsEnum.VideoP95Combined1
		      Return "VIDEO_P95_COMBINED_1"
		    Case ColumnsEnum.VideoP97Combined1
		      Return "VIDEO_P97_COMBINED_1"
		    Case ColumnsEnum.VideoP100Combined1
		      Return "VIDEO_P100_COMBINED_1"
		    Case ColumnsEnum.VideoStartsPaid
		      Return "VIDEO_STARTS_PAID"
		    Case ColumnsEnum.VideoStartsEarned
		      Return "VIDEO_STARTS_EARNED"
		    Case ColumnsEnum.TotalVideoStarts
		      Return "TOTAL_VIDEO_STARTS"
		    Case ColumnsEnum.VideoAvgWatchtime1
		      Return "VIDEO_AVG_WATCHTIME_1"
		    Case ColumnsEnum.VideoMrcViews1
		      Return "VIDEO_MRC_VIEWS_1"
		    Case ColumnsEnum.VideoViewRate1
		      Return "VIDEO_VIEW_RATE_1"
		    Case ColumnsEnum.Video3secViews2
		      Return "VIDEO_3SEC_VIEWS_2"
		    Case ColumnsEnum.Video15secUniqueViews2
		      Return "VIDEO_15SEC_UNIQUE_VIEWS_2"
		    Case ColumnsEnum.VideoP0Complete2
		      Return "VIDEO_P0_COMPLETE_2"
		    Case ColumnsEnum.VideoP25Complete2
		      Return "VIDEO_P25_COMPLETE_2"
		    Case ColumnsEnum.VideoP50Complete2
		      Return "VIDEO_P50_COMPLETE_2"
		    Case ColumnsEnum.VideoP75Complete2
		      Return "VIDEO_P75_COMPLETE_2"
		    Case ColumnsEnum.VideoP95Complete2
		      Return "VIDEO_P95_COMPLETE_2"
		    Case ColumnsEnum.VideoP97Complete2
		      Return "VIDEO_P97_COMPLETE_2"
		    Case ColumnsEnum.VideoP100Complete2
		      Return "VIDEO_P100_COMPLETE_2"
		    Case ColumnsEnum.VideoP0Combined2
		      Return "VIDEO_P0_COMBINED_2"
		    Case ColumnsEnum.VideoP25Combined2
		      Return "VIDEO_P25_COMBINED_2"
		    Case ColumnsEnum.VideoP50Combined2
		      Return "VIDEO_P50_COMBINED_2"
		    Case ColumnsEnum.VideoP75Combined2
		      Return "VIDEO_P75_COMBINED_2"
		    Case ColumnsEnum.VideoP95Combined2
		      Return "VIDEO_P95_COMBINED_2"
		    Case ColumnsEnum.VideoP97Combined2
		      Return "VIDEO_P97_COMBINED_2"
		    Case ColumnsEnum.VideoP100Combined2
		      Return "VIDEO_P100_COMBINED_2"
		    Case ColumnsEnum.VideoAvgWatchtime2
		      Return "VIDEO_AVG_WATCHTIME_2"
		    Case ColumnsEnum.VideoMrcViews2
		      Return "VIDEO_MRC_VIEWS_2"
		    Case ColumnsEnum.VideoViewRate2
		      Return "VIDEO_VIEW_RATE_2"
		    Case ColumnsEnum.PaidVideoView
		      Return "PAID_VIDEO_VIEW"
		    Case ColumnsEnum.PaidVideoImpression
		      Return "PAID_VIDEO_IMPRESSION"
		    Case ColumnsEnum.PaidVideoViewableRate
		      Return "PAID_VIDEO_VIEWABLE_RATE"
		    Case ColumnsEnum.VideoLength
		      Return "VIDEO_LENGTH"
		    Case ColumnsEnum.VideoSpendInMicroDollar
		      Return "VIDEO_SPEND_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.VideoSpendInDollar
		      Return "VIDEO_SPEND_IN_DOLLAR"
		    Case ColumnsEnum.CpvInMicroDollar
		      Return "CPV_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.CpvInDollar
		      Return "CPV_IN_DOLLAR"
		    Case ColumnsEnum.Cp3svInMicroDollar
		      Return "CP3SV_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.Cp3svInDollar
		      Return "CP3SV_IN_DOLLAR"
		    Case ColumnsEnum.EcpvInMicroDollar
		      Return "ECPV_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.EcpvInDollar
		      Return "ECPV_IN_DOLLAR"
		    Case ColumnsEnum.Ecp3svInMicroDollar
		      Return "ECP3SV_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.Ecp3svInDollar
		      Return "ECP3SV_IN_DOLLAR"
		    Case ColumnsEnum.CpcvInDollar
		      Return "CPCV_IN_DOLLAR"
		    Case ColumnsEnum.CpcvInMicroDollar
		      Return "CPCV_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.EcpcvInDollar
		      Return "ECPCV_IN_DOLLAR"
		    Case ColumnsEnum.EcpcvInMicroDollar
		      Return "ECPCV_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.CpcvP95InDollar
		      Return "CPCV_P95_IN_DOLLAR"
		    Case ColumnsEnum.CpcvP95InMicroDollar
		      Return "CPCV_P95_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.EcpcvP95InDollar
		      Return "ECPCV_P95_IN_DOLLAR"
		    Case ColumnsEnum.EcpcvP95InMicroDollar
		      Return "ECPCV_P95_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalVideo3secViews
		      Return "TOTAL_VIDEO_3SEC_VIEWS"
		    Case ColumnsEnum.TotalVideo15secUniqueViews
		      Return "TOTAL_VIDEO_15SEC_UNIQUE_VIEWS"
		    Case ColumnsEnum.TotalVideoP0Complete
		      Return "TOTAL_VIDEO_P0_COMPLETE"
		    Case ColumnsEnum.TotalVideoP25Complete
		      Return "TOTAL_VIDEO_P25_COMPLETE"
		    Case ColumnsEnum.TotalVideoP50Complete
		      Return "TOTAL_VIDEO_P50_COMPLETE"
		    Case ColumnsEnum.TotalVideoP75Complete
		      Return "TOTAL_VIDEO_P75_COMPLETE"
		    Case ColumnsEnum.TotalVideoP95Complete
		      Return "TOTAL_VIDEO_P95_COMPLETE"
		    Case ColumnsEnum.TotalVideoP97Complete
		      Return "TOTAL_VIDEO_P97_COMPLETE"
		    Case ColumnsEnum.TotalVideoP100Complete
		      Return "TOTAL_VIDEO_P100_COMPLETE"
		    Case ColumnsEnum.TotalVideoP0Combined
		      Return "TOTAL_VIDEO_P0_COMBINED"
		    Case ColumnsEnum.TotalVideoP25Combined
		      Return "TOTAL_VIDEO_P25_COMBINED"
		    Case ColumnsEnum.TotalVideoP50Combined
		      Return "TOTAL_VIDEO_P50_COMBINED"
		    Case ColumnsEnum.TotalVideoP75Combined
		      Return "TOTAL_VIDEO_P75_COMBINED"
		    Case ColumnsEnum.TotalVideoP95Combined
		      Return "TOTAL_VIDEO_P95_COMBINED"
		    Case ColumnsEnum.TotalVideoP97Combined
		      Return "TOTAL_VIDEO_P97_COMBINED"
		    Case ColumnsEnum.TotalVideoP100Combined
		      Return "TOTAL_VIDEO_P100_COMBINED"
		    Case ColumnsEnum.TotalVideoAvgWatchtime
		      Return "TOTAL_VIDEO_AVG_WATCHTIME"
		    Case ColumnsEnum.TotalVideoMrcViews
		      Return "TOTAL_VIDEO_MRC_VIEWS"
		    Case ColumnsEnum.TotalVideoViewRate
		      Return "TOTAL_VIDEO_VIEW_RATE"
		    Case ColumnsEnum.VideoV50Watchtime1
		      Return "VIDEO_V50_WATCHTIME_1"
		    Case ColumnsEnum.VideoV50Watchtime2
		      Return "VIDEO_V50_WATCHTIME_2"
		    Case ColumnsEnum.TotalVideoV50Watchtime
		      Return "TOTAL_VIDEO_V50_WATCHTIME"
		    Case ColumnsEnum.VideoSumV50WatchtimeInMillisecond1
		      Return "VIDEO_SUM_V50_WATCHTIME_IN_MILLISECOND_1"
		    Case ColumnsEnum.VideoSumV50WatchtimeInMillisecond2
		      Return "VIDEO_SUM_V50_WATCHTIME_IN_MILLISECOND_2"
		    Case ColumnsEnum.TotalVideoSumV50WatchtimeInMillisecond
		      Return "TOTAL_VIDEO_SUM_V50_WATCHTIME_IN_MILLISECOND"
		    Case ColumnsEnum.VideoSumV50WatchtimeInSecond1
		      Return "VIDEO_SUM_V50_WATCHTIME_IN_SECOND_1"
		    Case ColumnsEnum.VideoSumV50WatchtimeInSecond2
		      Return "VIDEO_SUM_V50_WATCHTIME_IN_SECOND_2"
		    Case ColumnsEnum.TotalVideoSumV50WatchtimeInSecond
		      Return "TOTAL_VIDEO_SUM_V50_WATCHTIME_IN_SECOND"
		    Case ColumnsEnum.VideoAvgWatchtimeInMillisecond1
		      Return "VIDEO_AVG_WATCHTIME_IN_MILLISECOND_1"
		    Case ColumnsEnum.VideoAvgWatchtimeInMillisecond2
		      Return "VIDEO_AVG_WATCHTIME_IN_MILLISECOND_2"
		    Case ColumnsEnum.TotalVideoAvgWatchtimeInMillisecond
		      Return "TOTAL_VIDEO_AVG_WATCHTIME_IN_MILLISECOND"
		    Case ColumnsEnum.VideoAvgWatchtimeInSecond1
		      Return "VIDEO_AVG_WATCHTIME_IN_SECOND_1"
		    Case ColumnsEnum.VideoAvgWatchtimeInSecond2
		      Return "VIDEO_AVG_WATCHTIME_IN_SECOND_2"
		    Case ColumnsEnum.TotalVideoAvgWatchtimeInSecond
		      Return "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND"
		    Case ColumnsEnum.VideoAvgWatchtimeInSecondVideoStartsPaid
		      Return "VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS_PAID"
		    Case ColumnsEnum.VideoAvgWatchtimeInSecondVideoStartsEarned
		      Return "VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS_EARNED"
		    Case ColumnsEnum.TotalVideoAvgWatchtimeInSecondVideoStarts
		      Return "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS"
		    Case ColumnsEnum.DeliveryStatusNoFanout
		      Return "DELIVERY_STATUS_NO_FANOUT"
		    Case ColumnsEnum.DeliveryStatusWithFanout
		      Return "DELIVERY_STATUS_WITH_FANOUT"
		    Case ColumnsEnum.KeywordCompetitionBand
		      Return "KEYWORD_COMPETITION_BAND"
		    Case ColumnsEnum.KeywordQueryVolume
		      Return "KEYWORD_QUERY_VOLUME"
		    Case ColumnsEnum.KeywordValue
		      Return "KEYWORD_VALUE"
		    Case ColumnsEnum.KeywordMatchType
		      Return "KEYWORD_MATCH_TYPE"
		    Case ColumnsEnum.KeywordBidInMicroCurrency
		      Return "KEYWORD_BID_IN_MICRO_CURRENCY"
		    Case ColumnsEnum.KeywordUserQuery
		      Return "KEYWORD_USER_QUERY"
		    Case ColumnsEnum.KeywordSqrKeywordValue
		      Return "KEYWORD_SQR_KEYWORD_VALUE"
		    Case ColumnsEnum.KeywordAdGroupId
		      Return "KEYWORD_AD_GROUP_ID"
		    Case ColumnsEnum.KeywordAdGroupName
		      Return "KEYWORD_AD_GROUP_NAME"
		    Case ColumnsEnum.KeywordCampaignId
		      Return "KEYWORD_CAMPAIGN_ID"
		    Case ColumnsEnum.KeywordCampaignName
		      Return "KEYWORD_CAMPAIGN_NAME"
		    Case ColumnsEnum.KeywordSearchTermAdGroupId
		      Return "KEYWORD_SEARCH_TERM_AD_GROUP_ID"
		    Case ColumnsEnum.KeywordSearchTermAdGroupName
		      Return "KEYWORD_SEARCH_TERM_AD_GROUP_NAME"
		    Case ColumnsEnum.KeywordSearchTermCampaignId
		      Return "KEYWORD_SEARCH_TERM_CAMPAIGN_ID"
		    Case ColumnsEnum.KeywordSearchTermCampaignName
		      Return "KEYWORD_SEARCH_TERM_CAMPAIGN_NAME"
		    Case ColumnsEnum.NegativeKeywordAdGroupId
		      Return "NEGATIVE_KEYWORD_AD_GROUP_ID"
		    Case ColumnsEnum.NegativeKeywordAdGroupName
		      Return "NEGATIVE_KEYWORD_AD_GROUP_NAME"
		    Case ColumnsEnum.NegativeKeywordCampaignId
		      Return "NEGATIVE_KEYWORD_CAMPAIGN_ID"
		    Case ColumnsEnum.NegativeKeywordCampaignName
		      Return "NEGATIVE_KEYWORD_CAMPAIGN_NAME"
		    Case ColumnsEnum.OneTapV2WebsiteView1
		      Return "ONE_TAP_V2_WEBSITE_VIEW_1"
		    Case ColumnsEnum.OneTapV2WebsiteView2
		      Return "ONE_TAP_V2_WEBSITE_VIEW_2"
		    Case ColumnsEnum.TotalOneTapV2WebsiteView
		      Return "TOTAL_ONE_TAP_V2_WEBSITE_VIEW"
		    Case ColumnsEnum.OneTapV2WebsiteViewUser1
		      Return "ONE_TAP_V2_WEBSITE_VIEW_USER_1"
		    Case ColumnsEnum.OneTapV2WebsiteViewUser2
		      Return "ONE_TAP_V2_WEBSITE_VIEW_USER_2"
		    Case ColumnsEnum.TotalLandingPageViews
		      Return "TOTAL_LANDING_PAGE_VIEWS"
		    Case ColumnsEnum.LandingPageViews1
		      Return "LANDING_PAGE_VIEWS_1"
		    Case ColumnsEnum.LandingPageViews2
		      Return "LANDING_PAGE_VIEWS_2"
		    Case ColumnsEnum.CostPerLandingPageView
		      Return "COST_PER_LANDING_PAGE_VIEW"
		    Case ColumnsEnum.LandingPageViewRate
		      Return "LANDING_PAGE_VIEW_RATE"
		    Case ColumnsEnum.TotalDestinationViews
		      Return "TOTAL_DESTINATION_VIEWS"
		    Case ColumnsEnum.DestinationViews1
		      Return "DESTINATION_VIEWS_1"
		    Case ColumnsEnum.DestinationViews2
		      Return "DESTINATION_VIEWS_2"
		    Case ColumnsEnum.CostPerDestinationViewInDollar
		      Return "COST_PER_DESTINATION_VIEW_IN_DOLLAR"
		    Case ColumnsEnum.CostPerDestinationViewInMicroDollar
		      Return "COST_PER_DESTINATION_VIEW_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.DestinationViewRate
		      Return "DESTINATION_VIEW_RATE"
		    Case ColumnsEnum.CarouselSlotIndex
		      Return "CAROUSEL_SLOT_INDEX"
		    Case ColumnsEnum.CarouselId
		      Return "CAROUSEL_ID"
		    Case ColumnsEnum.CarouselSlotPromotionId
		      Return "CAROUSEL_SLOT_PROMOTION_ID"
		    Case ColumnsEnum.CarouselSlotImpression1
		      Return "CAROUSEL_SLOT_IMPRESSION_1"
		    Case ColumnsEnum.CarouselSlotImpression2
		      Return "CAROUSEL_SLOT_IMPRESSION_2"
		    Case ColumnsEnum.TotalCarouselSlotImpression
		      Return "TOTAL_CAROUSEL_SLOT_IMPRESSION"
		    Case ColumnsEnum.CarouselSlotImpressionUser1
		      Return "CAROUSEL_SLOT_IMPRESSION_USER_1"
		    Case ColumnsEnum.CarouselSlotImpressionUser2
		      Return "CAROUSEL_SLOT_IMPRESSION_USER_2"
		    Case ColumnsEnum.CarouselSlotClickthrough1
		      Return "CAROUSEL_SLOT_CLICKTHROUGH_1"
		    Case ColumnsEnum.CarouselSlotClickthrough2
		      Return "CAROUSEL_SLOT_CLICKTHROUGH_2"
		    Case ColumnsEnum.TotalCarouselSlotClickthrough
		      Return "TOTAL_CAROUSEL_SLOT_CLICKTHROUGH"
		    Case ColumnsEnum.CarouselSlotClickthroughUser1
		      Return "CAROUSEL_SLOT_CLICKTHROUGH_USER_1"
		    Case ColumnsEnum.CarouselSlotClickthroughUser2
		      Return "CAROUSEL_SLOT_CLICKTHROUGH_USER_2"
		    Case ColumnsEnum.CarouselSlotSideswipe1
		      Return "CAROUSEL_SLOT_SIDESWIPE_1"
		    Case ColumnsEnum.CarouselSlotSideswipe2
		      Return "CAROUSEL_SLOT_SIDESWIPE_2"
		    Case ColumnsEnum.TotalCarouselSlotSideswipe
		      Return "TOTAL_CAROUSEL_SLOT_SIDESWIPE"
		    Case ColumnsEnum.CarouselSlotSideswipeUser1
		      Return "CAROUSEL_SLOT_SIDESWIPE_USER_1"
		    Case ColumnsEnum.CarouselSlotSideswipeUser2
		      Return "CAROUSEL_SLOT_SIDESWIPE_USER_2"
		    Case ColumnsEnum.CarouselSlotViewWebsite1
		      Return "CAROUSEL_SLOT_VIEW_WEBSITE_1"
		    Case ColumnsEnum.CarouselSlotViewWebsite2
		      Return "CAROUSEL_SLOT_VIEW_WEBSITE_2"
		    Case ColumnsEnum.TotalCarouselSlotViewWebsite
		      Return "TOTAL_CAROUSEL_SLOT_VIEW_WEBSITE"
		    Case ColumnsEnum.CarouselSlotViewWebsiteUser1
		      Return "CAROUSEL_SLOT_VIEW_WEBSITE_USER_1"
		    Case ColumnsEnum.CarouselSlotViewWebsiteUser2
		      Return "CAROUSEL_SLOT_VIEW_WEBSITE_USER_2"
		    Case ColumnsEnum.CollectionPinItemImpression1
		      Return "COLLECTION_PIN_ITEM_IMPRESSION_1"
		    Case ColumnsEnum.CollectionPinItemImpression2
		      Return "COLLECTION_PIN_ITEM_IMPRESSION_2"
		    Case ColumnsEnum.TotalCollectionPinItemImpression
		      Return "TOTAL_COLLECTION_PIN_ITEM_IMPRESSION"
		    Case ColumnsEnum.CollectionPinItemClickthrough1
		      Return "COLLECTION_PIN_ITEM_CLICKTHROUGH_1"
		    Case ColumnsEnum.CollectionPinItemClickthrough2
		      Return "COLLECTION_PIN_ITEM_CLICKTHROUGH_2"
		    Case ColumnsEnum.TotalCollectionPinItemClickthrough
		      Return "TOTAL_COLLECTION_PIN_ITEM_CLICKTHROUGH"
		    Case ColumnsEnum.HoldoutExperiment
		      Return "HOLDOUT_EXPERIMENT"
		    Case ColumnsEnum.AdGroupHoldoutExperiment
		      Return "AD_GROUP_HOLDOUT_EXPERIMENT"
		    Case ColumnsEnum.PinPromotionHoldoutExperiment
		      Return "PIN_PROMOTION_HOLDOUT_EXPERIMENT"
		    Case ColumnsEnum.ProductGroupHoldoutExperiment
		      Return "PRODUCT_GROUP_HOLDOUT_EXPERIMENT"
		    Case ColumnsEnum.MultiObjectiveResult
		      Return "MULTI_OBJECTIVE_RESULT"
		    Case ColumnsEnum.MultiObjectiveCost
		      Return "MULTI_OBJECTIVE_COST"
		    Case ColumnsEnum.MultiObjectiveResultDescription
		      Return "MULTI_OBJECTIVE_RESULT_DESCRIPTION"
		    Case ColumnsEnum.MultiObjectiveCostDescription
		      Return "MULTI_OBJECTIVE_COST_DESCRIPTION"
		    Case ColumnsEnum.DateRange
		      Return "DATE_RANGE"
		    Case ColumnsEnum.DateRangeStart
		      Return "DATE_RANGE_START"
		    Case ColumnsEnum.DateRangeEnd
		      Return "DATE_RANGE_END"
		    Case ColumnsEnum.ReportDateStart
		      Return "REPORT_DATE_START"
		    Case ColumnsEnum.ReportDateEnd
		      Return "REPORT_DATE_END"
		    Case ColumnsEnum.PinnerListName
		      Return "PINNER_LIST_NAME"
		    Case ColumnsEnum.PinnerListType
		      Return "PINNER_LIST_TYPE"
		    Case ColumnsEnum.OrderValue
		      Return "ORDER_VALUE"
		    Case ColumnsEnum.OrderQuantity
		      Return "ORDER_QUANTITY"
		    Case ColumnsEnum.AdvertiserName
		      Return "ADVERTISER_NAME"
		    Case ColumnsEnum.AdvertiserCurrency
		      Return "ADVERTISER_CURRENCY"
		    Case ColumnsEnum.TotalRepinRate
		      Return "TOTAL_REPIN_RATE"
		    Case ColumnsEnum.SpendYesterdayInDollar
		      Return "SPEND_YESTERDAY_IN_DOLLAR"
		    Case ColumnsEnum.PinPromotionRejectionLabels
		      Return "PIN_PROMOTION_REJECTION_LABELS"
		    Case ColumnsEnum.PinPromotionDestinationUrl
		      Return "PIN_PROMOTION_DESTINATION_URL"
		    Case ColumnsEnum.VideoCompletionRate
		      Return "VIDEO_COMPLETION_RATE"
		    Case ColumnsEnum.CampaignBookingReference
		      Return "CAMPAIGN_BOOKING_REFERENCE"
		    Case ColumnsEnum.WebCheckoutCostPerAction
		      Return "WEB_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum.WebCheckoutRoas
		      Return "WEB_CHECKOUT_ROAS"
		    Case ColumnsEnum.TotalWebCheckout
		      Return "TOTAL_WEB_CHECKOUT"
		    Case ColumnsEnum.TotalWebCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebCheckoutValueInDollar
		      Return "TOTAL_WEB_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickCheckout
		      Return "TOTAL_WEB_CLICK_CHECKOUT"
		    Case ColumnsEnum.TotalWebClickCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickCheckoutValueInDollar
		      Return "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementCheckout
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum.TotalWebEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementCheckoutValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewCheckout
		      Return "TOTAL_WEB_VIEW_CHECKOUT"
		    Case ColumnsEnum.TotalWebViewCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewCheckoutValueInDollar
		      Return "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.InappCheckoutCostPerAction
		      Return "INAPP_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum.InappCheckoutRoas
		      Return "INAPP_CHECKOUT_ROAS"
		    Case ColumnsEnum.TotalInappCheckout
		      Return "TOTAL_INAPP_CHECKOUT"
		    Case ColumnsEnum.TotalInappCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappCheckoutValueInDollar
		      Return "TOTAL_INAPP_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappClickCheckout
		      Return "TOTAL_INAPP_CLICK_CHECKOUT"
		    Case ColumnsEnum.TotalInappClickCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappClickCheckoutValueInDollar
		      Return "TOTAL_INAPP_CLICK_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementCheckout
		      Return "TOTAL_INAPP_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum.TotalInappEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementCheckoutValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappViewCheckout
		      Return "TOTAL_INAPP_VIEW_CHECKOUT"
		    Case ColumnsEnum.TotalInappViewCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappViewCheckoutValueInDollar
		      Return "TOTAL_INAPP_VIEW_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.OfflineCheckoutCostPerAction
		      Return "OFFLINE_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum.OfflineCheckoutRoas
		      Return "OFFLINE_CHECKOUT_ROAS"
		    Case ColumnsEnum.TotalOfflineCheckout
		      Return "TOTAL_OFFLINE_CHECKOUT"
		    Case ColumnsEnum.TotalOfflineCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineCheckoutValueInDollar
		      Return "TOTAL_OFFLINE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickCheckout
		      Return "TOTAL_OFFLINE_CLICK_CHECKOUT"
		    Case ColumnsEnum.TotalOfflineClickCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickCheckoutValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementCheckout
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT"
		    Case ColumnsEnum.TotalOfflineEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementCheckoutValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewCheckout
		      Return "TOTAL_OFFLINE_VIEW_CHECKOUT"
		    Case ColumnsEnum.TotalOfflineViewCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewCheckoutValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.PinterestCheckoutCostPerAction
		      Return "PINTEREST_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum.PinterestCheckoutRoas
		      Return "PINTEREST_CHECKOUT_ROAS"
		    Case ColumnsEnum.TotalPinterestCheckout
		      Return "TOTAL_PINTEREST_CHECKOUT"
		    Case ColumnsEnum.TotalPinterestCheckoutValueInMicroDollar
		      Return "TOTAL_PINTEREST_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalPinterestCheckoutValueInDollar
		      Return "TOTAL_PINTEREST_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.WebAddToCartCostPerAction
		      Return "WEB_ADD_TO_CART_COST_PER_ACTION"
		    Case ColumnsEnum.WebAddToCartRoas
		      Return "WEB_ADD_TO_CART_ROAS"
		    Case ColumnsEnum.TotalWebAddToCart
		      Return "TOTAL_WEB_ADD_TO_CART"
		    Case ColumnsEnum.TotalWebAddToCartValueInMicroDollar
		      Return "TOTAL_WEB_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebAddToCartValueInDollar
		      Return "TOTAL_WEB_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickAddToCart
		      Return "TOTAL_WEB_CLICK_ADD_TO_CART"
		    Case ColumnsEnum.TotalWebClickAddToCartValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickAddToCartValueInDollar
		      Return "TOTAL_WEB_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementAddToCart
		      Return "TOTAL_WEB_ENGAGEMENT_ADD_TO_CART"
		    Case ColumnsEnum.TotalWebEngagementAddToCartValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewAddToCart
		      Return "TOTAL_WEB_VIEW_ADD_TO_CART"
		    Case ColumnsEnum.TotalWebViewAddToCartValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewAddToCartValueInDollar
		      Return "TOTAL_WEB_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.InappAddToCartCostPerAction
		      Return "INAPP_ADD_TO_CART_COST_PER_ACTION"
		    Case ColumnsEnum.InappAddToCartRoas
		      Return "INAPP_ADD_TO_CART_ROAS"
		    Case ColumnsEnum.TotalInappAddToCart
		      Return "TOTAL_INAPP_ADD_TO_CART"
		    Case ColumnsEnum.TotalInappAddToCartValueInMicroDollar
		      Return "TOTAL_INAPP_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappAddToCartValueInDollar
		      Return "TOTAL_INAPP_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappClickAddToCart
		      Return "TOTAL_INAPP_CLICK_ADD_TO_CART"
		    Case ColumnsEnum.TotalInappClickAddToCartValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappClickAddToCartValueInDollar
		      Return "TOTAL_INAPP_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementAddToCart
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART"
		    Case ColumnsEnum.TotalInappEngagementAddToCartValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementAddToCartValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappViewAddToCart
		      Return "TOTAL_INAPP_VIEW_ADD_TO_CART"
		    Case ColumnsEnum.TotalInappViewAddToCartValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappViewAddToCartValueInDollar
		      Return "TOTAL_INAPP_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.WebPageVisitCostPerAction
		      Return "WEB_PAGE_VISIT_COST_PER_ACTION"
		    Case ColumnsEnum.WebPageVisitRoas
		      Return "WEB_PAGE_VISIT_ROAS"
		    Case ColumnsEnum.TotalWebPageVisit
		      Return "TOTAL_WEB_PAGE_VISIT"
		    Case ColumnsEnum.TotalWebPageVisitValueInMicroDollar
		      Return "TOTAL_WEB_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebPageVisitValueInDollar
		      Return "TOTAL_WEB_PAGE_VISIT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickPageVisit
		      Return "TOTAL_WEB_CLICK_PAGE_VISIT"
		    Case ColumnsEnum.TotalWebClickPageVisitValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickPageVisitValueInDollar
		      Return "TOTAL_WEB_CLICK_PAGE_VISIT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementPageVisit
		      Return "TOTAL_WEB_ENGAGEMENT_PAGE_VISIT"
		    Case ColumnsEnum.TotalWebEngagementPageVisitValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementPageVisitValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_PAGE_VISIT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewPageVisit
		      Return "TOTAL_WEB_VIEW_PAGE_VISIT"
		    Case ColumnsEnum.TotalWebViewPageVisitValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewPageVisitValueInDollar
		      Return "TOTAL_WEB_VIEW_PAGE_VISIT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.WebSignupCostPerAction
		      Return "WEB_SIGNUP_COST_PER_ACTION"
		    Case ColumnsEnum.WebSignupRoas
		      Return "WEB_SIGNUP_ROAS"
		    Case ColumnsEnum.TotalWebSignup
		      Return "TOTAL_WEB_SIGNUP"
		    Case ColumnsEnum.TotalWebSignupValueInMicroDollar
		      Return "TOTAL_WEB_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebSignupValueInDollar
		      Return "TOTAL_WEB_SIGNUP_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickSignup
		      Return "TOTAL_WEB_CLICK_SIGNUP"
		    Case ColumnsEnum.TotalWebClickSignupValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickSignupValueInDollar
		      Return "TOTAL_WEB_CLICK_SIGNUP_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementSignup
		      Return "TOTAL_WEB_ENGAGEMENT_SIGNUP"
		    Case ColumnsEnum.TotalWebEngagementSignupValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementSignupValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewSignup
		      Return "TOTAL_WEB_VIEW_SIGNUP"
		    Case ColumnsEnum.TotalWebViewSignupValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewSignupValueInDollar
		      Return "TOTAL_WEB_VIEW_SIGNUP_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.InappSignupCostPerAction
		      Return "INAPP_SIGNUP_COST_PER_ACTION"
		    Case ColumnsEnum.InappSignupRoas
		      Return "INAPP_SIGNUP_ROAS"
		    Case ColumnsEnum.TotalInappSignup
		      Return "TOTAL_INAPP_SIGNUP"
		    Case ColumnsEnum.TotalInappSignupValueInMicroDollar
		      Return "TOTAL_INAPP_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappSignupValueInDollar
		      Return "TOTAL_INAPP_SIGNUP_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappClickSignup
		      Return "TOTAL_INAPP_CLICK_SIGNUP"
		    Case ColumnsEnum.TotalInappClickSignupValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappClickSignupValueInDollar
		      Return "TOTAL_INAPP_CLICK_SIGNUP_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementSignup
		      Return "TOTAL_INAPP_ENGAGEMENT_SIGNUP"
		    Case ColumnsEnum.TotalInappEngagementSignupValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementSignupValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappViewSignup
		      Return "TOTAL_INAPP_VIEW_SIGNUP"
		    Case ColumnsEnum.TotalInappViewSignupValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappViewSignupValueInDollar
		      Return "TOTAL_INAPP_VIEW_SIGNUP_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.OfflineSignupCostPerAction
		      Return "OFFLINE_SIGNUP_COST_PER_ACTION"
		    Case ColumnsEnum.OfflineSignupRoas
		      Return "OFFLINE_SIGNUP_ROAS"
		    Case ColumnsEnum.TotalOfflineSignup
		      Return "TOTAL_OFFLINE_SIGNUP"
		    Case ColumnsEnum.TotalOfflineSignupValueInMicroDollar
		      Return "TOTAL_OFFLINE_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineSignupValueInDollar
		      Return "TOTAL_OFFLINE_SIGNUP_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickSignup
		      Return "TOTAL_OFFLINE_CLICK_SIGNUP"
		    Case ColumnsEnum.TotalOfflineClickSignupValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickSignupValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_SIGNUP_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementSignup
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SIGNUP"
		    Case ColumnsEnum.TotalOfflineEngagementSignupValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementSignupValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewSignup
		      Return "TOTAL_OFFLINE_VIEW_SIGNUP"
		    Case ColumnsEnum.TotalOfflineViewSignupValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewSignupValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_SIGNUP_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.WebWatchVideoCostPerAction
		      Return "WEB_WATCH_VIDEO_COST_PER_ACTION"
		    Case ColumnsEnum.WebWatchVideoRoas
		      Return "WEB_WATCH_VIDEO_ROAS"
		    Case ColumnsEnum.TotalWebWatchVideo
		      Return "TOTAL_WEB_WATCH_VIDEO"
		    Case ColumnsEnum.TotalWebWatchVideoValueInMicroDollar
		      Return "TOTAL_WEB_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebWatchVideoValueInDollar
		      Return "TOTAL_WEB_WATCH_VIDEO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickWatchVideo
		      Return "TOTAL_WEB_CLICK_WATCH_VIDEO"
		    Case ColumnsEnum.TotalWebClickWatchVideoValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickWatchVideoValueInDollar
		      Return "TOTAL_WEB_CLICK_WATCH_VIDEO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementWatchVideo
		      Return "TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO"
		    Case ColumnsEnum.TotalWebEngagementWatchVideoValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementWatchVideoValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewWatchVideo
		      Return "TOTAL_WEB_VIEW_WATCH_VIDEO"
		    Case ColumnsEnum.TotalWebViewWatchVideoValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewWatchVideoValueInDollar
		      Return "TOTAL_WEB_VIEW_WATCH_VIDEO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.WebLeadCostPerAction
		      Return "WEB_LEAD_COST_PER_ACTION"
		    Case ColumnsEnum.WebLeadRoas
		      Return "WEB_LEAD_ROAS"
		    Case ColumnsEnum.TotalWebLead
		      Return "TOTAL_WEB_LEAD"
		    Case ColumnsEnum.TotalWebLeadValueInMicroDollar
		      Return "TOTAL_WEB_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebLeadValueInDollar
		      Return "TOTAL_WEB_LEAD_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickLead
		      Return "TOTAL_WEB_CLICK_LEAD"
		    Case ColumnsEnum.TotalWebClickLeadValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickLeadValueInDollar
		      Return "TOTAL_WEB_CLICK_LEAD_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementLead
		      Return "TOTAL_WEB_ENGAGEMENT_LEAD"
		    Case ColumnsEnum.TotalWebEngagementLeadValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementLeadValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewLead
		      Return "TOTAL_WEB_VIEW_LEAD"
		    Case ColumnsEnum.TotalWebViewLeadValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewLeadValueInDollar
		      Return "TOTAL_WEB_VIEW_LEAD_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.OfflineLeadCostPerAction
		      Return "OFFLINE_LEAD_COST_PER_ACTION"
		    Case ColumnsEnum.OfflineLeadRoas
		      Return "OFFLINE_LEAD_ROAS"
		    Case ColumnsEnum.TotalOfflineLead
		      Return "TOTAL_OFFLINE_LEAD"
		    Case ColumnsEnum.TotalOfflineLeadValueInMicroDollar
		      Return "TOTAL_OFFLINE_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineLeadValueInDollar
		      Return "TOTAL_OFFLINE_LEAD_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickLead
		      Return "TOTAL_OFFLINE_CLICK_LEAD"
		    Case ColumnsEnum.TotalOfflineClickLeadValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickLeadValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_LEAD_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementLead
		      Return "TOTAL_OFFLINE_ENGAGEMENT_LEAD"
		    Case ColumnsEnum.TotalOfflineEngagementLeadValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementLeadValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewLead
		      Return "TOTAL_OFFLINE_VIEW_LEAD"
		    Case ColumnsEnum.TotalOfflineViewLeadValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewLeadValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_LEAD_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.WebSearchCostPerAction
		      Return "WEB_SEARCH_COST_PER_ACTION"
		    Case ColumnsEnum.WebSearchRoas
		      Return "WEB_SEARCH_ROAS"
		    Case ColumnsEnum.TotalWebSearch
		      Return "TOTAL_WEB_SEARCH"
		    Case ColumnsEnum.TotalWebSearchValueInMicroDollar
		      Return "TOTAL_WEB_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebSearchValueInDollar
		      Return "TOTAL_WEB_SEARCH_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickSearch
		      Return "TOTAL_WEB_CLICK_SEARCH"
		    Case ColumnsEnum.TotalWebClickSearchValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickSearchValueInDollar
		      Return "TOTAL_WEB_CLICK_SEARCH_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementSearch
		      Return "TOTAL_WEB_ENGAGEMENT_SEARCH"
		    Case ColumnsEnum.TotalWebEngagementSearchValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementSearchValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewSearch
		      Return "TOTAL_WEB_VIEW_SEARCH"
		    Case ColumnsEnum.TotalWebViewSearchValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewSearchValueInDollar
		      Return "TOTAL_WEB_VIEW_SEARCH_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.InappSearchCostPerAction
		      Return "INAPP_SEARCH_COST_PER_ACTION"
		    Case ColumnsEnum.InappSearchRoas
		      Return "INAPP_SEARCH_ROAS"
		    Case ColumnsEnum.TotalInappSearch
		      Return "TOTAL_INAPP_SEARCH"
		    Case ColumnsEnum.TotalInappSearchValueInMicroDollar
		      Return "TOTAL_INAPP_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappSearchValueInDollar
		      Return "TOTAL_INAPP_SEARCH_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappClickSearch
		      Return "TOTAL_INAPP_CLICK_SEARCH"
		    Case ColumnsEnum.TotalInappClickSearchValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappClickSearchValueInDollar
		      Return "TOTAL_INAPP_CLICK_SEARCH_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementSearch
		      Return "TOTAL_INAPP_ENGAGEMENT_SEARCH"
		    Case ColumnsEnum.TotalInappEngagementSearchValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementSearchValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappViewSearch
		      Return "TOTAL_INAPP_VIEW_SEARCH"
		    Case ColumnsEnum.TotalInappViewSearchValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappViewSearchValueInDollar
		      Return "TOTAL_INAPP_VIEW_SEARCH_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.WebViewCategoryCostPerAction
		      Return "WEB_VIEW_CATEGORY_COST_PER_ACTION"
		    Case ColumnsEnum.WebViewCategoryRoas
		      Return "WEB_VIEW_CATEGORY_ROAS"
		    Case ColumnsEnum.TotalWebViewCategory
		      Return "TOTAL_WEB_VIEW_CATEGORY"
		    Case ColumnsEnum.TotalWebViewCategoryValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewCategoryValueInDollar
		      Return "TOTAL_WEB_VIEW_CATEGORY_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickViewCategory
		      Return "TOTAL_WEB_CLICK_VIEW_CATEGORY"
		    Case ColumnsEnum.TotalWebClickViewCategoryValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickViewCategoryValueInDollar
		      Return "TOTAL_WEB_CLICK_VIEW_CATEGORY_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementViewCategory
		      Return "TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY"
		    Case ColumnsEnum.TotalWebEngagementViewCategoryValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementViewCategoryValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewViewCategory
		      Return "TOTAL_WEB_VIEW_VIEW_CATEGORY"
		    Case ColumnsEnum.TotalWebViewViewCategoryValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewViewCategoryValueInDollar
		      Return "TOTAL_WEB_VIEW_VIEW_CATEGORY_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.WebCustomCostPerAction
		      Return "WEB_CUSTOM_COST_PER_ACTION"
		    Case ColumnsEnum.WebCustomRoas
		      Return "WEB_CUSTOM_ROAS"
		    Case ColumnsEnum.TotalWebCustom
		      Return "TOTAL_WEB_CUSTOM"
		    Case ColumnsEnum.TotalWebCustomValueInMicroDollar
		      Return "TOTAL_WEB_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebCustomValueInDollar
		      Return "TOTAL_WEB_CUSTOM_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickCustom
		      Return "TOTAL_WEB_CLICK_CUSTOM"
		    Case ColumnsEnum.TotalWebClickCustomValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickCustomValueInDollar
		      Return "TOTAL_WEB_CLICK_CUSTOM_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementCustom
		      Return "TOTAL_WEB_ENGAGEMENT_CUSTOM"
		    Case ColumnsEnum.TotalWebEngagementCustomValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementCustomValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewCustom
		      Return "TOTAL_WEB_VIEW_CUSTOM"
		    Case ColumnsEnum.TotalWebViewCustomValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewCustomValueInDollar
		      Return "TOTAL_WEB_VIEW_CUSTOM_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.OfflineCustomCostPerAction
		      Return "OFFLINE_CUSTOM_COST_PER_ACTION"
		    Case ColumnsEnum.OfflineCustomRoas
		      Return "OFFLINE_CUSTOM_ROAS"
		    Case ColumnsEnum.TotalOfflineCustom
		      Return "TOTAL_OFFLINE_CUSTOM"
		    Case ColumnsEnum.TotalOfflineCustomValueInMicroDollar
		      Return "TOTAL_OFFLINE_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineCustomValueInDollar
		      Return "TOTAL_OFFLINE_CUSTOM_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickCustom
		      Return "TOTAL_OFFLINE_CLICK_CUSTOM"
		    Case ColumnsEnum.TotalOfflineClickCustomValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickCustomValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_CUSTOM_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementCustom
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CUSTOM"
		    Case ColumnsEnum.TotalOfflineEngagementCustomValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementCustomValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewCustom
		      Return "TOTAL_OFFLINE_VIEW_CUSTOM"
		    Case ColumnsEnum.TotalOfflineViewCustomValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewCustomValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_CUSTOM_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.WebUnknownCostPerAction
		      Return "WEB_UNKNOWN_COST_PER_ACTION"
		    Case ColumnsEnum.WebUnknownRoas
		      Return "WEB_UNKNOWN_ROAS"
		    Case ColumnsEnum.TotalWebUnknown
		      Return "TOTAL_WEB_UNKNOWN"
		    Case ColumnsEnum.TotalWebUnknownValueInMicroDollar
		      Return "TOTAL_WEB_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebUnknownValueInDollar
		      Return "TOTAL_WEB_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickUnknown
		      Return "TOTAL_WEB_CLICK_UNKNOWN"
		    Case ColumnsEnum.TotalWebClickUnknownValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickUnknownValueInDollar
		      Return "TOTAL_WEB_CLICK_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementUnknown
		      Return "TOTAL_WEB_ENGAGEMENT_UNKNOWN"
		    Case ColumnsEnum.TotalWebEngagementUnknownValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementUnknownValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewUnknown
		      Return "TOTAL_WEB_VIEW_UNKNOWN"
		    Case ColumnsEnum.TotalWebViewUnknownValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewUnknownValueInDollar
		      Return "TOTAL_WEB_VIEW_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.InappUnknownCostPerAction
		      Return "INAPP_UNKNOWN_COST_PER_ACTION"
		    Case ColumnsEnum.InappUnknownRoas
		      Return "INAPP_UNKNOWN_ROAS"
		    Case ColumnsEnum.TotalInappUnknown
		      Return "TOTAL_INAPP_UNKNOWN"
		    Case ColumnsEnum.TotalInappUnknownValueInMicroDollar
		      Return "TOTAL_INAPP_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappUnknownValueInDollar
		      Return "TOTAL_INAPP_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappClickUnknown
		      Return "TOTAL_INAPP_CLICK_UNKNOWN"
		    Case ColumnsEnum.TotalInappClickUnknownValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappClickUnknownValueInDollar
		      Return "TOTAL_INAPP_CLICK_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementUnknown
		      Return "TOTAL_INAPP_ENGAGEMENT_UNKNOWN"
		    Case ColumnsEnum.TotalInappEngagementUnknownValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementUnknownValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappViewUnknown
		      Return "TOTAL_INAPP_VIEW_UNKNOWN"
		    Case ColumnsEnum.TotalInappViewUnknownValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappViewUnknownValueInDollar
		      Return "TOTAL_INAPP_VIEW_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.OfflineUnknownCostPerAction
		      Return "OFFLINE_UNKNOWN_COST_PER_ACTION"
		    Case ColumnsEnum.OfflineUnknownRoas
		      Return "OFFLINE_UNKNOWN_ROAS"
		    Case ColumnsEnum.TotalOfflineUnknown
		      Return "TOTAL_OFFLINE_UNKNOWN"
		    Case ColumnsEnum.TotalOfflineUnknownValueInMicroDollar
		      Return "TOTAL_OFFLINE_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineUnknownValueInDollar
		      Return "TOTAL_OFFLINE_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickUnknown
		      Return "TOTAL_OFFLINE_CLICK_UNKNOWN"
		    Case ColumnsEnum.TotalOfflineClickUnknownValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickUnknownValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementUnknown
		      Return "TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN"
		    Case ColumnsEnum.TotalOfflineEngagementUnknownValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementUnknownValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewUnknown
		      Return "TOTAL_OFFLINE_VIEW_UNKNOWN"
		    Case ColumnsEnum.TotalOfflineViewUnknownValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewUnknownValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.InappAppInstallCostPerAction
		      Return "INAPP_APP_INSTALL_COST_PER_ACTION"
		    Case ColumnsEnum.InappAppInstallRoas
		      Return "INAPP_APP_INSTALL_ROAS"
		    Case ColumnsEnum.TotalInappAppInstall
		      Return "TOTAL_INAPP_APP_INSTALL"
		    Case ColumnsEnum.TotalInappAppInstallValueInMicroDollar
		      Return "TOTAL_INAPP_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappAppInstallValueInDollar
		      Return "TOTAL_INAPP_APP_INSTALL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappClickAppInstall
		      Return "TOTAL_INAPP_CLICK_APP_INSTALL"
		    Case ColumnsEnum.TotalInappClickAppInstallValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappClickAppInstallValueInDollar
		      Return "TOTAL_INAPP_CLICK_APP_INSTALL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementAppInstall
		      Return "TOTAL_INAPP_ENGAGEMENT_APP_INSTALL"
		    Case ColumnsEnum.TotalInappEngagementAppInstallValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementAppInstallValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_APP_INSTALL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappViewAppInstall
		      Return "TOTAL_INAPP_VIEW_APP_INSTALL"
		    Case ColumnsEnum.TotalInappViewAppInstallValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappViewAppInstallValueInDollar
		      Return "TOTAL_INAPP_VIEW_APP_INSTALL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalAppInstallConversionRate
		      Return "TOTAL_APP_INSTALL_CONVERSION_RATE"
		    Case ColumnsEnum.TotalInappAppInstallConversionRate
		      Return "TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE"
		    Case ColumnsEnum.WebAddPaymentInfoCostPerAction
		      Return "WEB_ADD_PAYMENT_INFO_COST_PER_ACTION"
		    Case ColumnsEnum.WebAddPaymentInfoRoas
		      Return "WEB_ADD_PAYMENT_INFO_ROAS"
		    Case ColumnsEnum.TotalWebAddPaymentInfo
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO"
		    Case ColumnsEnum.TotalWebAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebAddPaymentInfoValueInDollar
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickAddPaymentInfo
		      Return "TOTAL_WEB_CLICK_ADD_PAYMENT_INFO"
		    Case ColumnsEnum.TotalWebClickAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickAddPaymentInfoValueInDollar
		      Return "TOTAL_WEB_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementAddPaymentInfo
		      Return "TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO"
		    Case ColumnsEnum.TotalWebEngagementAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementAddPaymentInfoValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewAddPaymentInfo
		      Return "TOTAL_WEB_VIEW_ADD_PAYMENT_INFO"
		    Case ColumnsEnum.TotalWebViewAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewAddPaymentInfoValueInDollar
		      Return "TOTAL_WEB_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.InappAddPaymentInfoCostPerAction
		      Return "INAPP_ADD_PAYMENT_INFO_COST_PER_ACTION"
		    Case ColumnsEnum.InappAddPaymentInfoRoas
		      Return "INAPP_ADD_PAYMENT_INFO_ROAS"
		    Case ColumnsEnum.TotalInappAddPaymentInfo
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO"
		    Case ColumnsEnum.TotalInappAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappAddPaymentInfoValueInDollar
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappClickAddPaymentInfo
		      Return "TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO"
		    Case ColumnsEnum.TotalInappClickAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappClickAddPaymentInfoValueInDollar
		      Return "TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementAddPaymentInfo
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO"
		    Case ColumnsEnum.TotalInappEngagementAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementAddPaymentInfoValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappViewAddPaymentInfo
		      Return "TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO"
		    Case ColumnsEnum.TotalInappViewAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappViewAddPaymentInfoValueInDollar
		      Return "TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.OfflineAddPaymentInfoCostPerAction
		      Return "OFFLINE_ADD_PAYMENT_INFO_COST_PER_ACTION"
		    Case ColumnsEnum.OfflineAddPaymentInfoRoas
		      Return "OFFLINE_ADD_PAYMENT_INFO_ROAS"
		    Case ColumnsEnum.TotalOfflineAddPaymentInfo
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO"
		    Case ColumnsEnum.TotalOfflineAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineAddPaymentInfoValueInDollar
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickAddPaymentInfo
		      Return "TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO"
		    Case ColumnsEnum.TotalOfflineClickAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickAddPaymentInfoValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementAddPaymentInfo
		      Return "TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO"
		    Case ColumnsEnum.TotalOfflineEngagementAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementAddPaymentInfoValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewAddPaymentInfo
		      Return "TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO"
		    Case ColumnsEnum.TotalOfflineViewAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewAddPaymentInfoValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.WebAddToWishlistCostPerAction
		      Return "WEB_ADD_TO_WISHLIST_COST_PER_ACTION"
		    Case ColumnsEnum.WebAddToWishlistRoas
		      Return "WEB_ADD_TO_WISHLIST_ROAS"
		    Case ColumnsEnum.TotalWebAddToWishlist
		      Return "TOTAL_WEB_ADD_TO_WISHLIST"
		    Case ColumnsEnum.TotalWebAddToWishlistValueInMicroDollar
		      Return "TOTAL_WEB_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebAddToWishlistValueInDollar
		      Return "TOTAL_WEB_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickAddToWishlist
		      Return "TOTAL_WEB_CLICK_ADD_TO_WISHLIST"
		    Case ColumnsEnum.TotalWebClickAddToWishlistValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickAddToWishlistValueInDollar
		      Return "TOTAL_WEB_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementAddToWishlist
		      Return "TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST"
		    Case ColumnsEnum.TotalWebEngagementAddToWishlistValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementAddToWishlistValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewAddToWishlist
		      Return "TOTAL_WEB_VIEW_ADD_TO_WISHLIST"
		    Case ColumnsEnum.TotalWebViewAddToWishlistValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewAddToWishlistValueInDollar
		      Return "TOTAL_WEB_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.InappAddToWishlistCostPerAction
		      Return "INAPP_ADD_TO_WISHLIST_COST_PER_ACTION"
		    Case ColumnsEnum.InappAddToWishlistRoas
		      Return "INAPP_ADD_TO_WISHLIST_ROAS"
		    Case ColumnsEnum.TotalInappAddToWishlist
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST"
		    Case ColumnsEnum.TotalInappAddToWishlistValueInMicroDollar
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappAddToWishlistValueInDollar
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappClickAddToWishlist
		      Return "TOTAL_INAPP_CLICK_ADD_TO_WISHLIST"
		    Case ColumnsEnum.TotalInappClickAddToWishlistValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappClickAddToWishlistValueInDollar
		      Return "TOTAL_INAPP_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementAddToWishlist
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST"
		    Case ColumnsEnum.TotalInappEngagementAddToWishlistValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementAddToWishlistValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappViewAddToWishlist
		      Return "TOTAL_INAPP_VIEW_ADD_TO_WISHLIST"
		    Case ColumnsEnum.TotalInappViewAddToWishlistValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappViewAddToWishlistValueInDollar
		      Return "TOTAL_INAPP_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.OfflineAddToWishlistCostPerAction
		      Return "OFFLINE_ADD_TO_WISHLIST_COST_PER_ACTION"
		    Case ColumnsEnum.OfflineAddToWishlistRoas
		      Return "OFFLINE_ADD_TO_WISHLIST_ROAS"
		    Case ColumnsEnum.TotalOfflineAddToWishlist
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST"
		    Case ColumnsEnum.TotalOfflineAddToWishlistValueInMicroDollar
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineAddToWishlistValueInDollar
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickAddToWishlist
		      Return "TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST"
		    Case ColumnsEnum.TotalOfflineClickAddToWishlistValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickAddToWishlistValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementAddToWishlist
		      Return "TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST"
		    Case ColumnsEnum.TotalOfflineEngagementAddToWishlistValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementAddToWishlistValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewAddToWishlist
		      Return "TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST"
		    Case ColumnsEnum.TotalOfflineViewAddToWishlistValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewAddToWishlistValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.WebInitiateCheckoutCostPerAction
		      Return "WEB_INITIATE_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum.WebInitiateCheckoutRoas
		      Return "WEB_INITIATE_CHECKOUT_ROAS"
		    Case ColumnsEnum.TotalWebInitiateCheckout
		      Return "TOTAL_WEB_INITIATE_CHECKOUT"
		    Case ColumnsEnum.TotalWebInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebInitiateCheckoutValueInDollar
		      Return "TOTAL_WEB_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickInitiateCheckout
		      Return "TOTAL_WEB_CLICK_INITIATE_CHECKOUT"
		    Case ColumnsEnum.TotalWebClickInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickInitiateCheckoutValueInDollar
		      Return "TOTAL_WEB_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementInitiateCheckout
		      Return "TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT"
		    Case ColumnsEnum.TotalWebEngagementInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementInitiateCheckoutValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewInitiateCheckout
		      Return "TOTAL_WEB_VIEW_INITIATE_CHECKOUT"
		    Case ColumnsEnum.TotalWebViewInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewInitiateCheckoutValueInDollar
		      Return "TOTAL_WEB_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.InappInitiateCheckoutCostPerAction
		      Return "INAPP_INITIATE_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum.InappInitiateCheckoutRoas
		      Return "INAPP_INITIATE_CHECKOUT_ROAS"
		    Case ColumnsEnum.TotalInappInitiateCheckout
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT"
		    Case ColumnsEnum.TotalInappInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappInitiateCheckoutValueInDollar
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappClickInitiateCheckout
		      Return "TOTAL_INAPP_CLICK_INITIATE_CHECKOUT"
		    Case ColumnsEnum.TotalInappClickInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappClickInitiateCheckoutValueInDollar
		      Return "TOTAL_INAPP_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementInitiateCheckout
		      Return "TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT"
		    Case ColumnsEnum.TotalInappEngagementInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementInitiateCheckoutValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappViewInitiateCheckout
		      Return "TOTAL_INAPP_VIEW_INITIATE_CHECKOUT"
		    Case ColumnsEnum.TotalInappViewInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappViewInitiateCheckoutValueInDollar
		      Return "TOTAL_INAPP_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.OfflineInitiateCheckoutCostPerAction
		      Return "OFFLINE_INITIATE_CHECKOUT_COST_PER_ACTION"
		    Case ColumnsEnum.OfflineInitiateCheckoutRoas
		      Return "OFFLINE_INITIATE_CHECKOUT_ROAS"
		    Case ColumnsEnum.TotalOfflineInitiateCheckout
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT"
		    Case ColumnsEnum.TotalOfflineInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineInitiateCheckoutValueInDollar
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickInitiateCheckout
		      Return "TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT"
		    Case ColumnsEnum.TotalOfflineClickInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickInitiateCheckoutValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementInitiateCheckout
		      Return "TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT"
		    Case ColumnsEnum.TotalOfflineEngagementInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementInitiateCheckoutValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewInitiateCheckout
		      Return "TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT"
		    Case ColumnsEnum.TotalOfflineViewInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewInitiateCheckoutValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.WebSubscribeCostPerAction
		      Return "WEB_SUBSCRIBE_COST_PER_ACTION"
		    Case ColumnsEnum.WebSubscribeRoas
		      Return "WEB_SUBSCRIBE_ROAS"
		    Case ColumnsEnum.TotalWebSubscribe
		      Return "TOTAL_WEB_SUBSCRIBE"
		    Case ColumnsEnum.TotalWebSubscribeValueInMicroDollar
		      Return "TOTAL_WEB_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebSubscribeValueInDollar
		      Return "TOTAL_WEB_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickSubscribe
		      Return "TOTAL_WEB_CLICK_SUBSCRIBE"
		    Case ColumnsEnum.TotalWebClickSubscribeValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickSubscribeValueInDollar
		      Return "TOTAL_WEB_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementSubscribe
		      Return "TOTAL_WEB_ENGAGEMENT_SUBSCRIBE"
		    Case ColumnsEnum.TotalWebEngagementSubscribeValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementSubscribeValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewSubscribe
		      Return "TOTAL_WEB_VIEW_SUBSCRIBE"
		    Case ColumnsEnum.TotalWebViewSubscribeValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewSubscribeValueInDollar
		      Return "TOTAL_WEB_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.InappSubscribeCostPerAction
		      Return "INAPP_SUBSCRIBE_COST_PER_ACTION"
		    Case ColumnsEnum.InappSubscribeRoas
		      Return "INAPP_SUBSCRIBE_ROAS"
		    Case ColumnsEnum.TotalInappSubscribe
		      Return "TOTAL_INAPP_SUBSCRIBE"
		    Case ColumnsEnum.TotalInappSubscribeValueInMicroDollar
		      Return "TOTAL_INAPP_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappSubscribeValueInDollar
		      Return "TOTAL_INAPP_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappClickSubscribe
		      Return "TOTAL_INAPP_CLICK_SUBSCRIBE"
		    Case ColumnsEnum.TotalInappClickSubscribeValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappClickSubscribeValueInDollar
		      Return "TOTAL_INAPP_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementSubscribe
		      Return "TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE"
		    Case ColumnsEnum.TotalInappEngagementSubscribeValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementSubscribeValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappViewSubscribe
		      Return "TOTAL_INAPP_VIEW_SUBSCRIBE"
		    Case ColumnsEnum.TotalInappViewSubscribeValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappViewSubscribeValueInDollar
		      Return "TOTAL_INAPP_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.OfflineSubscribeCostPerAction
		      Return "OFFLINE_SUBSCRIBE_COST_PER_ACTION"
		    Case ColumnsEnum.OfflineSubscribeRoas
		      Return "OFFLINE_SUBSCRIBE_ROAS"
		    Case ColumnsEnum.TotalOfflineSubscribe
		      Return "TOTAL_OFFLINE_SUBSCRIBE"
		    Case ColumnsEnum.TotalOfflineSubscribeValueInMicroDollar
		      Return "TOTAL_OFFLINE_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineSubscribeValueInDollar
		      Return "TOTAL_OFFLINE_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickSubscribe
		      Return "TOTAL_OFFLINE_CLICK_SUBSCRIBE"
		    Case ColumnsEnum.TotalOfflineClickSubscribeValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickSubscribeValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementSubscribe
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE"
		    Case ColumnsEnum.TotalOfflineEngagementSubscribeValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementSubscribeValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewSubscribe
		      Return "TOTAL_OFFLINE_VIEW_SUBSCRIBE"
		    Case ColumnsEnum.TotalOfflineViewSubscribeValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewSubscribeValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.WebViewContentCostPerAction
		      Return "WEB_VIEW_CONTENT_COST_PER_ACTION"
		    Case ColumnsEnum.WebViewContentRoas
		      Return "WEB_VIEW_CONTENT_ROAS"
		    Case ColumnsEnum.TotalWebViewContent
		      Return "TOTAL_WEB_VIEW_CONTENT"
		    Case ColumnsEnum.TotalWebViewContentValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewContentValueInDollar
		      Return "TOTAL_WEB_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickViewContent
		      Return "TOTAL_WEB_CLICK_VIEW_CONTENT"
		    Case ColumnsEnum.TotalWebClickViewContentValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickViewContentValueInDollar
		      Return "TOTAL_WEB_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementViewContent
		      Return "TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT"
		    Case ColumnsEnum.TotalWebEngagementViewContentValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementViewContentValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewViewContent
		      Return "TOTAL_WEB_VIEW_VIEW_CONTENT"
		    Case ColumnsEnum.TotalWebViewViewContentValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewViewContentValueInDollar
		      Return "TOTAL_WEB_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.InappViewContentCostPerAction
		      Return "INAPP_VIEW_CONTENT_COST_PER_ACTION"
		    Case ColumnsEnum.InappViewContentRoas
		      Return "INAPP_VIEW_CONTENT_ROAS"
		    Case ColumnsEnum.TotalInappViewContent
		      Return "TOTAL_INAPP_VIEW_CONTENT"
		    Case ColumnsEnum.TotalInappViewContentValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappViewContentValueInDollar
		      Return "TOTAL_INAPP_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappClickViewContent
		      Return "TOTAL_INAPP_CLICK_VIEW_CONTENT"
		    Case ColumnsEnum.TotalInappClickViewContentValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappClickViewContentValueInDollar
		      Return "TOTAL_INAPP_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementViewContent
		      Return "TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT"
		    Case ColumnsEnum.TotalInappEngagementViewContentValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementViewContentValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappViewViewContent
		      Return "TOTAL_INAPP_VIEW_VIEW_CONTENT"
		    Case ColumnsEnum.TotalInappViewViewContentValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappViewViewContentValueInDollar
		      Return "TOTAL_INAPP_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.OfflineViewContentCostPerAction
		      Return "OFFLINE_VIEW_CONTENT_COST_PER_ACTION"
		    Case ColumnsEnum.OfflineViewContentRoas
		      Return "OFFLINE_VIEW_CONTENT_ROAS"
		    Case ColumnsEnum.TotalOfflineViewContent
		      Return "TOTAL_OFFLINE_VIEW_CONTENT"
		    Case ColumnsEnum.TotalOfflineViewContentValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewContentValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickViewContent
		      Return "TOTAL_OFFLINE_CLICK_VIEW_CONTENT"
		    Case ColumnsEnum.TotalOfflineClickViewContentValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickViewContentValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementViewContent
		      Return "TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT"
		    Case ColumnsEnum.TotalOfflineEngagementViewContentValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementViewContentValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewViewContent
		      Return "TOTAL_OFFLINE_VIEW_VIEW_CONTENT"
		    Case ColumnsEnum.TotalOfflineViewViewContentValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewViewContentValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.IdeaPinPageForward1
		      Return "IDEA_PIN_PAGE_FORWARD_1"
		    Case ColumnsEnum.IdeaPinPageForward2
		      Return "IDEA_PIN_PAGE_FORWARD_2"
		    Case ColumnsEnum.IdeaPinPageBackward1
		      Return "IDEA_PIN_PAGE_BACKWARD_1"
		    Case ColumnsEnum.IdeaPinPageBackward2
		      Return "IDEA_PIN_PAGE_BACKWARD_2"
		    Case ColumnsEnum.TotalIdeaPinPageForward
		      Return "TOTAL_IDEA_PIN_PAGE_FORWARD"
		    Case ColumnsEnum.TotalIdeaPinPageBackward
		      Return "TOTAL_IDEA_PIN_PAGE_BACKWARD"
		    Case ColumnsEnum.IdeaPinProductTagVisit1
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_1"
		    Case ColumnsEnum.IdeaPinProductTagVisit2
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_2"
		    Case ColumnsEnum.TotalIdeaPinProductTagVisit
		      Return "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT"
		    Case ColumnsEnum.CpmInUsDollar
		      Return "CPM_IN_US_DOLLAR"
		    Case ColumnsEnum.EcpcInUsDollar
		      Return "ECPC_IN_US_DOLLAR"
		    Case ColumnsEnum.Leads
		      Return "LEADS"
		    Case ColumnsEnum.CostPerLead
		      Return "COST_PER_LEAD"
		    Case ColumnsEnum.QuizStarted
		      Return "QUIZ_STARTED"
		    Case ColumnsEnum.QuizCompleted
		      Return "QUIZ_COMPLETED"
		    Case ColumnsEnum.QuizPinResultOpen
		      Return "QUIZ_PIN_RESULT_OPEN"
		    Case ColumnsEnum.QuizCompletionRate
		      Return "QUIZ_COMPLETION_RATE"
		    Case ColumnsEnum.ShowcasePinClickthrough
		      Return "SHOWCASE_PIN_CLICKTHROUGH"
		    Case ColumnsEnum.ShowcaseSubpageClickthrough
		      Return "SHOWCASE_SUBPAGE_CLICKTHROUGH"
		    Case ColumnsEnum.ShowcaseSubpinClickthrough
		      Return "SHOWCASE_SUBPIN_CLICKTHROUGH"
		    Case ColumnsEnum.ShowcaseSubpageImpression
		      Return "SHOWCASE_SUBPAGE_IMPRESSION"
		    Case ColumnsEnum.ShowcaseSubpinImpression
		      Return "SHOWCASE_SUBPIN_IMPRESSION"
		    Case ColumnsEnum.ShowcaseSubpageSwipeLeft
		      Return "SHOWCASE_SUBPAGE_SWIPE_LEFT"
		    Case ColumnsEnum.ShowcaseSubpageSwipeRight
		      Return "SHOWCASE_SUBPAGE_SWIPE_RIGHT"
		    Case ColumnsEnum.ShowcaseSubpinSwipeLeft
		      Return "SHOWCASE_SUBPIN_SWIPE_LEFT"
		    Case ColumnsEnum.ShowcaseSubpinSwipeRight
		      Return "SHOWCASE_SUBPIN_SWIPE_RIGHT"
		    Case ColumnsEnum.ShowcaseSubpageRepin
		      Return "SHOWCASE_SUBPAGE_REPIN"
		    Case ColumnsEnum.ShowcaseSubpinRepin
		      Return "SHOWCASE_SUBPIN_REPIN"
		    Case ColumnsEnum.ShowcaseSubpageCloseup
		      Return "SHOWCASE_SUBPAGE_CLOSEUP"
		    Case ColumnsEnum.ShowcaseCardThumbnailSwipeForward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD"
		    Case ColumnsEnum.ShowcaseCardThumbnailSwipeBackward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD"
		    Case ColumnsEnum.ShowcaseSubpageCloseupInternal
		      Return "_SHOWCASE_SUBPAGE_CLOSEUP_INTERNAL"
		    Case ColumnsEnum.ShowcaseCardLanding
		      Return "SHOWCASE_CARD_LANDING"
		    Case ColumnsEnum.ShowcaseAverageSubpageCloseupPerSession
		      Return "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION"
		    Case ColumnsEnum.TotalCheckoutConversionRate
		      Return "TOTAL_CHECKOUT_CONVERSION_RATE"
		    Case ColumnsEnum.TotalViewCategoryConversionRate
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_RATE"
		    Case ColumnsEnum.TotalAddToCartConversionRate
		      Return "TOTAL_ADD_TO_CART_CONVERSION_RATE"
		    Case ColumnsEnum.TotalSignupConversionRate
		      Return "TOTAL_SIGNUP_CONVERSION_RATE"
		    Case ColumnsEnum.TotalPageVisitConversionRate
		      Return "TOTAL_PAGE_VISIT_CONVERSION_RATE"
		    Case ColumnsEnum.TotalLeadConversionRate
		      Return "TOTAL_LEAD_CONVERSION_RATE"
		    Case ColumnsEnum.TotalSearchConversionRate
		      Return "TOTAL_SEARCH_CONVERSION_RATE"
		    Case ColumnsEnum.TotalWatchVideoConversionRate
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_RATE"
		    Case ColumnsEnum.TotalUnknownConversionRate
		      Return "TOTAL_UNKNOWN_CONVERSION_RATE"
		    Case ColumnsEnum.TotalCustomConversionRate
		      Return "TOTAL_CUSTOM_CONVERSION_RATE"
		    Case ColumnsEnum.TotalAddPaymentInfoConversionRate
		      Return "TOTAL_ADD_PAYMENT_INFO_CONVERSION_RATE"
		    Case ColumnsEnum.TotalAddToWishlistConversionRate
		      Return "TOTAL_ADD_TO_WISHLIST_CONVERSION_RATE"
		    Case ColumnsEnum.TotalInitiateCheckoutConversionRate
		      Return "TOTAL_INITIATE_CHECKOUT_CONVERSION_RATE"
		    Case ColumnsEnum.TotalSubscribeConversionRate
		      Return "TOTAL_SUBSCRIBE_CONVERSION_RATE"
		    Case ColumnsEnum.TotalViewContentConversionRate
		      Return "TOTAL_VIEW_CONTENT_CONVERSION_RATE"
		    Case ColumnsEnum.StandardAdFeedItemId
		      Return "STANDARD_AD_FEED_ITEM_ID"
		    Case ColumnsEnum.IsStandardFeedAd
		      Return "IS_STANDARD_FEED_AD"
		    Case ColumnsEnum.TargetingGender
		      Return "TARGETING_GENDER"
		    Case ColumnsEnum.TargetingCreativeType
		      Return "TARGETING_CREATIVE_TYPE"
		    Case ColumnsEnum.TargetingCountry
		      Return "TARGETING_COUNTRY"
		    Case ColumnsEnum.TargetingLocation
		      Return "TARGETING_LOCATION"
		    Case ColumnsEnum.TargetingApptype
		      Return "TARGETING_APPTYPE"
		    Case ColumnsEnum.TargetingLocationCode
		      Return "TARGETING_LOCATION_CODE"
		    Case ColumnsEnum.TargetingMediaType
		      Return "TARGETING_MEDIA_TYPE"
		    Case ColumnsEnum.TargetingAgeBucket
		      Return "TARGETING_AGE_BUCKET"
		    Case ColumnsEnum.TargetingAudienceMultiplier
		      Return "TARGETING_AUDIENCE_MULTIPLIER"
		    Case ColumnsEnum.TargetingLocalAdsStoreCode
		      Return "TARGETING_LOCAL_ADS_STORE_CODE"
		    Case ColumnsEnum.TargetingLanguagesInclude
		      Return "TARGETING_LANGUAGES_INCLUDE"
		    Case ColumnsEnum.TargetingLanguagesExclude
		      Return "TARGETING_LANGUAGES_EXCLUDE"
		    Case ColumnsEnum.TotalConversionProductQuantity
		      Return "TOTAL_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebConversionProductQuantity
		      Return "TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalInappConversionProductQuantity
		      Return "TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalOfflineConversionProductQuantity
		      Return "TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalConversionProductValue
		      Return "TOTAL_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebConversionProductValue
		      Return "TOTAL_WEB_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalInappConversionProductValue
		      Return "TOTAL_INAPP_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalOfflineConversionProductValue
		      Return "TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalConversionProductValueInMicroUnits
		      Return "TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalInappConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalOfflineConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalConversionProductValueInUsd
		      Return "TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebConversionProductValueInUsd
		      Return "TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalInappConversionProductValueInUsd
		      Return "TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalOfflineConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalConversionProductValueInMicroUsd
		      Return "TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalInappConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalOfflineConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.ConversionProductCountUnique
		      Return "CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalCheckoutConversionProductQuantity
		      Return "TOTAL_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalCheckoutConversionProductValue
		      Return "TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalCheckoutConversionProductValueInMicroUnits
		      Return "TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalCheckoutConversionProductValueInUsd
		      Return "TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalCheckoutConversionProductValueInMicroUsd
		      Return "TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebCheckoutConversionProductQuantity
		      Return "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebCheckoutConversionProductValue
		      Return "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebCheckoutConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebCheckoutConversionProductValueInUsd
		      Return "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebCheckoutConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalInappCheckoutConversionProductQuantity
		      Return "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalInappCheckoutConversionProductValue
		      Return "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalInappCheckoutConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalInappCheckoutConversionProductValueInUsd
		      Return "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalInappCheckoutConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalOfflineCheckoutConversionProductQuantity
		      Return "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalOfflineCheckoutConversionProductValue
		      Return "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalOfflineCheckoutConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalOfflineCheckoutConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalOfflineCheckoutConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalAddToCartConversionProductQuantity
		      Return "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalAddToCartConversionProductValue
		      Return "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalAddToCartConversionProductValueInMicroUnits
		      Return "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalAddToCartConversionProductValueInUsd
		      Return "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalAddToCartConversionProductValueInMicroUsd
		      Return "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebAddToCartConversionProductQuantity
		      Return "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebAddToCartConversionProductValue
		      Return "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebAddToCartConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebAddToCartConversionProductValueInUsd
		      Return "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebAddToCartConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalInappAddToCartConversionProductQuantity
		      Return "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalInappAddToCartConversionProductValue
		      Return "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalInappAddToCartConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalInappAddToCartConversionProductValueInUsd
		      Return "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalInappAddToCartConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalPageVisitConversionProductQuantity
		      Return "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalPageVisitConversionProductValue
		      Return "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalPageVisitConversionProductValueInMicroUnits
		      Return "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalPageVisitConversionProductValueInUsd
		      Return "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalPageVisitConversionProductValueInMicroUsd
		      Return "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebPageVisitConversionProductQuantity
		      Return "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebPageVisitConversionProductValue
		      Return "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebPageVisitConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebPageVisitConversionProductValueInUsd
		      Return "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebPageVisitConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalSignupConversionProductQuantity
		      Return "TOTAL_SIGNUP_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalSignupConversionProductValue
		      Return "TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalSignupConversionProductValueInMicroUnits
		      Return "TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalSignupConversionProductValueInUsd
		      Return "TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalSignupConversionProductValueInMicroUsd
		      Return "TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebSignupConversionProductQuantity
		      Return "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebSignupConversionProductValue
		      Return "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebSignupConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebSignupConversionProductValueInUsd
		      Return "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebSignupConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalInappSignupConversionProductQuantity
		      Return "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalInappSignupConversionProductValue
		      Return "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalInappSignupConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalInappSignupConversionProductValueInUsd
		      Return "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalInappSignupConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalOfflineSignupConversionProductQuantity
		      Return "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalOfflineSignupConversionProductValue
		      Return "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalOfflineSignupConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalOfflineSignupConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalOfflineSignupConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWatchVideoConversionProductQuantity
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWatchVideoConversionProductValue
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWatchVideoConversionProductValueInMicroUnits
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWatchVideoConversionProductValueInUsd
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWatchVideoConversionProductValueInMicroUsd
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebWatchVideoConversionProductQuantity
		      Return "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebWatchVideoConversionProductValue
		      Return "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebWatchVideoConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebWatchVideoConversionProductValueInUsd
		      Return "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebWatchVideoConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalLeadConversionProductQuantity
		      Return "TOTAL_LEAD_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalLeadConversionProductValue
		      Return "TOTAL_LEAD_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalLeadConversionProductValueInMicroUnits
		      Return "TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalLeadConversionProductValueInUsd
		      Return "TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalLeadConversionProductValueInMicroUsd
		      Return "TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebLeadConversionProductQuantity
		      Return "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebLeadConversionProductValue
		      Return "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebLeadConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebLeadConversionProductValueInUsd
		      Return "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebLeadConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalOfflineLeadConversionProductQuantity
		      Return "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalOfflineLeadConversionProductValue
		      Return "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalOfflineLeadConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalOfflineLeadConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalOfflineLeadConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalSearchConversionProductQuantity
		      Return "TOTAL_SEARCH_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalSearchConversionProductValue
		      Return "TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalSearchConversionProductValueInMicroUnits
		      Return "TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalSearchConversionProductValueInUsd
		      Return "TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalSearchConversionProductValueInMicroUsd
		      Return "TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebSearchConversionProductQuantity
		      Return "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebSearchConversionProductValue
		      Return "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebSearchConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebSearchConversionProductValueInUsd
		      Return "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebSearchConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalInappSearchConversionProductQuantity
		      Return "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalInappSearchConversionProductValue
		      Return "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalInappSearchConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalInappSearchConversionProductValueInUsd
		      Return "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalInappSearchConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalViewCategoryConversionProductQuantity
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalViewCategoryConversionProductValue
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalViewCategoryConversionProductValueInMicroUnits
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalViewCategoryConversionProductValueInUsd
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalViewCategoryConversionProductValueInMicroUsd
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebViewCategoryConversionProductQuantity
		      Return "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebViewCategoryConversionProductValue
		      Return "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebViewCategoryConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebViewCategoryConversionProductValueInUsd
		      Return "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebViewCategoryConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalCustomConversionProductQuantity
		      Return "TOTAL_CUSTOM_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalCustomConversionProductValue
		      Return "TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalCustomConversionProductValueInMicroUnits
		      Return "TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalCustomConversionProductValueInUsd
		      Return "TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalCustomConversionProductValueInMicroUsd
		      Return "TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebCustomConversionProductQuantity
		      Return "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebCustomConversionProductValue
		      Return "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebCustomConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebCustomConversionProductValueInUsd
		      Return "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebCustomConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalOfflineCustomConversionProductQuantity
		      Return "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalOfflineCustomConversionProductValue
		      Return "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalOfflineCustomConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalOfflineCustomConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalOfflineCustomConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalUnknownConversionProductQuantity
		      Return "TOTAL_UNKNOWN_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalUnknownConversionProductValue
		      Return "TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalUnknownConversionProductValueInMicroUnits
		      Return "TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalUnknownConversionProductValueInUsd
		      Return "TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalUnknownConversionProductValueInMicroUsd
		      Return "TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebUnknownConversionProductQuantity
		      Return "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebUnknownConversionProductValue
		      Return "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebUnknownConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebUnknownConversionProductValueInUsd
		      Return "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebUnknownConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalInappUnknownConversionProductQuantity
		      Return "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalInappUnknownConversionProductValue
		      Return "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalInappUnknownConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalInappUnknownConversionProductValueInUsd
		      Return "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalInappUnknownConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalOfflineUnknownConversionProductQuantity
		      Return "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalOfflineUnknownConversionProductValue
		      Return "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalOfflineUnknownConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalOfflineUnknownConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalOfflineUnknownConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalAddPaymentInfoConversionProductQuantity
		      Return "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalAddPaymentInfoConversionProductValue
		      Return "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalAddPaymentInfoConversionProductValueInMicroUnits
		      Return "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalAddPaymentInfoConversionProductValueInUsd
		      Return "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalAddPaymentInfoConversionProductValueInMicroUsd
		      Return "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebAddPaymentInfoConversionProductQuantity
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebAddPaymentInfoConversionProductValue
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebAddPaymentInfoConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebAddPaymentInfoConversionProductValueInUsd
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebAddPaymentInfoConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalInappAddPaymentInfoConversionProductQuantity
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalInappAddPaymentInfoConversionProductValue
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalInappAddPaymentInfoConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalInappAddPaymentInfoConversionProductValueInUsd
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalInappAddPaymentInfoConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalOfflineAddPaymentInfoConversionProductQuantity
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalOfflineAddPaymentInfoConversionProductValue
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalOfflineAddPaymentInfoConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalOfflineAddPaymentInfoConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalOfflineAddPaymentInfoConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalAddToWishlistConversionProductQuantity
		      Return "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalAddToWishlistConversionProductValue
		      Return "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalAddToWishlistConversionProductValueInMicroUnits
		      Return "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalAddToWishlistConversionProductValueInUsd
		      Return "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalAddToWishlistConversionProductValueInMicroUsd
		      Return "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebAddToWishlistConversionProductQuantity
		      Return "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebAddToWishlistConversionProductValue
		      Return "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebAddToWishlistConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebAddToWishlistConversionProductValueInUsd
		      Return "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebAddToWishlistConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalInappAddToWishlistConversionProductQuantity
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalInappAddToWishlistConversionProductValue
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalInappAddToWishlistConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalInappAddToWishlistConversionProductValueInUsd
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalInappAddToWishlistConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalOfflineAddToWishlistConversionProductQuantity
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalOfflineAddToWishlistConversionProductValue
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalOfflineAddToWishlistConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalOfflineAddToWishlistConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalOfflineAddToWishlistConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalInitiateCheckoutConversionProductQuantity
		      Return "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalInitiateCheckoutConversionProductValue
		      Return "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalInitiateCheckoutConversionProductValueInMicroUnits
		      Return "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalInitiateCheckoutConversionProductValueInUsd
		      Return "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalInitiateCheckoutConversionProductValueInMicroUsd
		      Return "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebInitiateCheckoutConversionProductQuantity
		      Return "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebInitiateCheckoutConversionProductValue
		      Return "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebInitiateCheckoutConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebInitiateCheckoutConversionProductValueInUsd
		      Return "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebInitiateCheckoutConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalInappInitiateCheckoutConversionProductQuantity
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalInappInitiateCheckoutConversionProductValue
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalInappInitiateCheckoutConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalInappInitiateCheckoutConversionProductValueInUsd
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalInappInitiateCheckoutConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalOfflineInitiateCheckoutConversionProductQuantity
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalOfflineInitiateCheckoutConversionProductValue
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalOfflineInitiateCheckoutConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalOfflineInitiateCheckoutConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalOfflineInitiateCheckoutConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalSubscribeConversionProductQuantity
		      Return "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalSubscribeConversionProductValue
		      Return "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalSubscribeConversionProductValueInMicroUnits
		      Return "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalSubscribeConversionProductValueInUsd
		      Return "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalSubscribeConversionProductValueInMicroUsd
		      Return "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebSubscribeConversionProductQuantity
		      Return "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebSubscribeConversionProductValue
		      Return "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebSubscribeConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebSubscribeConversionProductValueInUsd
		      Return "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebSubscribeConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalInappSubscribeConversionProductQuantity
		      Return "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalInappSubscribeConversionProductValue
		      Return "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalInappSubscribeConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalInappSubscribeConversionProductValueInUsd
		      Return "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalInappSubscribeConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalOfflineSubscribeConversionProductQuantity
		      Return "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalOfflineSubscribeConversionProductValue
		      Return "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalOfflineSubscribeConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalOfflineSubscribeConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalOfflineSubscribeConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalViewContentConversionProductQuantity
		      Return "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalViewContentConversionProductValue
		      Return "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalViewContentConversionProductValueInMicroUnits
		      Return "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalViewContentConversionProductValueInUsd
		      Return "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalViewContentConversionProductValueInMicroUsd
		      Return "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebViewContentConversionProductQuantity
		      Return "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebViewContentConversionProductValue
		      Return "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebViewContentConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebViewContentConversionProductValueInUsd
		      Return "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebViewContentConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalInappViewContentConversionProductQuantity
		      Return "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalInappViewContentConversionProductValue
		      Return "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalInappViewContentConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalInappViewContentConversionProductValueInUsd
		      Return "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalInappViewContentConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalOfflineViewContentConversionProductQuantity
		      Return "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalOfflineViewContentConversionProductValue
		      Return "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalOfflineViewContentConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalOfflineViewContentConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalOfflineViewContentConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalCheckoutConversionProductCountUnique
		      Return "TOTAL_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebCheckoutConversionProductCountUnique
		      Return "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalInappCheckoutConversionProductCountUnique
		      Return "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalOfflineCheckoutConversionProductCountUnique
		      Return "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalAddToCartConversionProductCountUnique
		      Return "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebAddToCartConversionProductCountUnique
		      Return "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalInappAddToCartConversionProductCountUnique
		      Return "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalPageVisitConversionProductCountUnique
		      Return "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebPageVisitConversionProductCountUnique
		      Return "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalSignupConversionProductCountUnique
		      Return "TOTAL_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebSignupConversionProductCountUnique
		      Return "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalInappSignupConversionProductCountUnique
		      Return "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalOfflineSignupConversionProductCountUnique
		      Return "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWatchVideoConversionProductCountUnique
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebWatchVideoConversionProductCountUnique
		      Return "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalLeadConversionProductCountUnique
		      Return "TOTAL_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebLeadConversionProductCountUnique
		      Return "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalOfflineLeadConversionProductCountUnique
		      Return "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalSearchConversionProductCountUnique
		      Return "TOTAL_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebSearchConversionProductCountUnique
		      Return "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalInappSearchConversionProductCountUnique
		      Return "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalViewCategoryConversionProductCountUnique
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebViewCategoryConversionProductCountUnique
		      Return "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalCustomConversionProductCountUnique
		      Return "TOTAL_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebCustomConversionProductCountUnique
		      Return "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalOfflineCustomConversionProductCountUnique
		      Return "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalUnknownConversionProductCountUnique
		      Return "TOTAL_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebUnknownConversionProductCountUnique
		      Return "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalInappUnknownConversionProductCountUnique
		      Return "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalOfflineUnknownConversionProductCountUnique
		      Return "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalAddPaymentInfoConversionProductCountUnique
		      Return "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebAddPaymentInfoConversionProductCountUnique
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalInappAddPaymentInfoConversionProductCountUnique
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalOfflineAddPaymentInfoConversionProductCountUnique
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalAddToWishlistConversionProductCountUnique
		      Return "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebAddToWishlistConversionProductCountUnique
		      Return "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalInappAddToWishlistConversionProductCountUnique
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalOfflineAddToWishlistConversionProductCountUnique
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalInitiateCheckoutConversionProductCountUnique
		      Return "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebInitiateCheckoutConversionProductCountUnique
		      Return "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalInappInitiateCheckoutConversionProductCountUnique
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalOfflineInitiateCheckoutConversionProductCountUnique
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalSubscribeConversionProductCountUnique
		      Return "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebSubscribeConversionProductCountUnique
		      Return "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalInappSubscribeConversionProductCountUnique
		      Return "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalOfflineSubscribeConversionProductCountUnique
		      Return "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalViewContentConversionProductCountUnique
		      Return "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebViewContentConversionProductCountUnique
		      Return "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalInappViewContentConversionProductCountUnique
		      Return "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalOfflineViewContentConversionProductCountUnique
		      Return "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.GenAiImageSignature
		      Return "GEN_AI_IMAGE_SIGNATURE"
		    Case ColumnsEnum.GenAiImageUrl
		      Return "GEN_AI_IMAGE_URL"
		    Case ColumnsEnum.OriginalImageSignature
		      Return "ORIGINAL_IMAGE_SIGNATURE"
		    Case ColumnsEnum.OriginalImageUrl
		      Return "ORIGINAL_IMAGE_URL"
		    Case ColumnsEnum.GenAiGenerationDate
		      Return "GEN_AI_GENERATION_DATE"
		    Case ColumnsEnum.IsRegenerating
		      Return "IS_REGENERATING"
		    Case ColumnsEnum.GenAiImageCount
		      Return "GEN_AI_IMAGE_COUNT"
		    Case ColumnsEnum.AdvertiserTimeZone
		      Return "ADVERTISER_TIME_ZONE"
		    Case ColumnsEnum.EngagementContact1
		      Return "ENGAGEMENT_CONTACT_1"
		    Case ColumnsEnum.ClickContact1
		      Return "CLICK_CONTACT_1"
		    Case ColumnsEnum.ViewContact1
		      Return "VIEW_CONTACT_1"
		    Case ColumnsEnum.EngagementContactValueInMicroDollar1
		      Return "ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickContactValueInMicroDollar1
		      Return "CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewContactValueInMicroDollar1
		      Return "VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementContactQuantity1
		      Return "ENGAGEMENT_CONTACT_QUANTITY_1"
		    Case ColumnsEnum.ClickContactQuantity1
		      Return "CLICK_CONTACT_QUANTITY_1"
		    Case ColumnsEnum.ViewContactQuantity1
		      Return "VIEW_CONTACT_QUANTITY_1"
		    Case ColumnsEnum.EngagementContact2
		      Return "ENGAGEMENT_CONTACT_2"
		    Case ColumnsEnum.ClickContact2
		      Return "CLICK_CONTACT_2"
		    Case ColumnsEnum.ViewContact2
		      Return "VIEW_CONTACT_2"
		    Case ColumnsEnum.EngagementContactValueInMicroDollar2
		      Return "ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickContactValueInMicroDollar2
		      Return "CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewContactValueInMicroDollar2
		      Return "VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementContactQuantity2
		      Return "ENGAGEMENT_CONTACT_QUANTITY_2"
		    Case ColumnsEnum.ClickContactQuantity2
		      Return "CLICK_CONTACT_QUANTITY_2"
		    Case ColumnsEnum.ViewContactQuantity2
		      Return "VIEW_CONTACT_QUANTITY_2"
		    Case ColumnsEnum.TotalEngagementContact
		      Return "TOTAL_ENGAGEMENT_CONTACT"
		    Case ColumnsEnum.TotalClickContact
		      Return "TOTAL_CLICK_CONTACT"
		    Case ColumnsEnum.TotalViewContact
		      Return "TOTAL_VIEW_CONTACT"
		    Case ColumnsEnum.TotalEngagementContactValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementContactValueInDollar
		      Return "TOTAL_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickContactValueInMicroDollar
		      Return "TOTAL_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickContactValueInDollar
		      Return "TOTAL_CLICK_CONTACT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewContactValueInMicroDollar
		      Return "TOTAL_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewContactValueInDollar
		      Return "TOTAL_VIEW_CONTACT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementContactQuantity
		      Return "TOTAL_ENGAGEMENT_CONTACT_QUANTITY"
		    Case ColumnsEnum.TotalClickContactQuantity
		      Return "TOTAL_CLICK_CONTACT_QUANTITY"
		    Case ColumnsEnum.TotalViewContactQuantity
		      Return "TOTAL_VIEW_CONTACT_QUANTITY"
		    Case ColumnsEnum.TotalContact
		      Return "TOTAL_CONTACT"
		    Case ColumnsEnum.TotalContactValueInMicroDollar
		      Return "TOTAL_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageContactValueInMicroDollar
		      Return "AVERAGE_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageContactValueInMicroUsDollar
		      Return "AVERAGE_CONTACT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalContactValueInMicroUsDollar
		      Return "TOTAL_CONTACT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalContactQuantity
		      Return "TOTAL_CONTACT_QUANTITY"
		    Case ColumnsEnum.TotalContactValueInDollar
		      Return "TOTAL_CONTACT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.ContactCostPerAction
		      Return "CONTACT_COST_PER_ACTION"
		    Case ColumnsEnum.ContactCostPerActionInUsDollar
		      Return "CONTACT_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.ContactRoas
		      Return "CONTACT_ROAS"
		    Case ColumnsEnum.TotalContactConversionRate
		      Return "TOTAL_CONTACT_CONVERSION_RATE"
		    Case ColumnsEnum.WebContactCostPerAction
		      Return "WEB_CONTACT_COST_PER_ACTION"
		    Case ColumnsEnum.WebContactRoas
		      Return "WEB_CONTACT_ROAS"
		    Case ColumnsEnum.TotalWebContact
		      Return "TOTAL_WEB_CONTACT"
		    Case ColumnsEnum.TotalWebContactValueInMicroDollar
		      Return "TOTAL_WEB_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebContactValueInDollar
		      Return "TOTAL_WEB_CONTACT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickContact
		      Return "TOTAL_WEB_CLICK_CONTACT"
		    Case ColumnsEnum.TotalWebClickContactValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickContactValueInDollar
		      Return "TOTAL_WEB_CLICK_CONTACT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementContact
		      Return "TOTAL_WEB_ENGAGEMENT_CONTACT"
		    Case ColumnsEnum.TotalWebEngagementContactValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementContactValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewContact
		      Return "TOTAL_WEB_VIEW_CONTACT"
		    Case ColumnsEnum.TotalWebViewContactValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewContactValueInDollar
		      Return "TOTAL_WEB_VIEW_CONTACT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.InappContactCostPerAction
		      Return "INAPP_CONTACT_COST_PER_ACTION"
		    Case ColumnsEnum.InappContactRoas
		      Return "INAPP_CONTACT_ROAS"
		    Case ColumnsEnum.TotalInappContact
		      Return "TOTAL_INAPP_CONTACT"
		    Case ColumnsEnum.TotalInappContactValueInMicroDollar
		      Return "TOTAL_INAPP_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappContactValueInDollar
		      Return "TOTAL_INAPP_CONTACT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappClickContact
		      Return "TOTAL_INAPP_CLICK_CONTACT"
		    Case ColumnsEnum.TotalInappClickContactValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappClickContactValueInDollar
		      Return "TOTAL_INAPP_CLICK_CONTACT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementContact
		      Return "TOTAL_INAPP_ENGAGEMENT_CONTACT"
		    Case ColumnsEnum.TotalInappEngagementContactValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementContactValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappViewContact
		      Return "TOTAL_INAPP_VIEW_CONTACT"
		    Case ColumnsEnum.TotalInappViewContactValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappViewContactValueInDollar
		      Return "TOTAL_INAPP_VIEW_CONTACT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.OfflineContactCostPerAction
		      Return "OFFLINE_CONTACT_COST_PER_ACTION"
		    Case ColumnsEnum.OfflineContactRoas
		      Return "OFFLINE_CONTACT_ROAS"
		    Case ColumnsEnum.TotalOfflineContact
		      Return "TOTAL_OFFLINE_CONTACT"
		    Case ColumnsEnum.TotalOfflineContactValueInMicroDollar
		      Return "TOTAL_OFFLINE_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineContactValueInDollar
		      Return "TOTAL_OFFLINE_CONTACT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickContact
		      Return "TOTAL_OFFLINE_CLICK_CONTACT"
		    Case ColumnsEnum.TotalOfflineClickContactValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickContactValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_CONTACT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementContact
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CONTACT"
		    Case ColumnsEnum.TotalOfflineEngagementContactValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementContactValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewContact
		      Return "TOTAL_OFFLINE_VIEW_CONTACT"
		    Case ColumnsEnum.TotalOfflineViewContactValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewContactValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_CONTACT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalContactConversionProductCountUnique
		      Return "TOTAL_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebContactConversionProductCountUnique
		      Return "TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalInappContactConversionProductCountUnique
		      Return "TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalOfflineContactConversionProductCountUnique
		      Return "TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalContactConversionProductQuantity
		      Return "TOTAL_CONTACT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalContactConversionProductValue
		      Return "TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalContactConversionProductValueInMicroUnits
		      Return "TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalContactConversionProductValueInUsd
		      Return "TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalContactConversionProductValueInMicroUsd
		      Return "TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebContactConversionProductQuantity
		      Return "TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebContactConversionProductValue
		      Return "TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebContactConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebContactConversionProductValueInUsd
		      Return "TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebContactConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalInappContactConversionProductQuantity
		      Return "TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalInappContactConversionProductValue
		      Return "TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalInappContactConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalInappContactConversionProductValueInUsd
		      Return "TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalInappContactConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalOfflineContactConversionProductQuantity
		      Return "TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalOfflineContactConversionProductValue
		      Return "TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalOfflineContactConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalOfflineContactConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalOfflineContactConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.EngagementSchedule1
		      Return "ENGAGEMENT_SCHEDULE_1"
		    Case ColumnsEnum.ClickSchedule1
		      Return "CLICK_SCHEDULE_1"
		    Case ColumnsEnum.ViewSchedule1
		      Return "VIEW_SCHEDULE_1"
		    Case ColumnsEnum.EngagementScheduleValueInMicroDollar1
		      Return "ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickScheduleValueInMicroDollar1
		      Return "CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewScheduleValueInMicroDollar1
		      Return "VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementScheduleQuantity1
		      Return "ENGAGEMENT_SCHEDULE_QUANTITY_1"
		    Case ColumnsEnum.ClickScheduleQuantity1
		      Return "CLICK_SCHEDULE_QUANTITY_1"
		    Case ColumnsEnum.ViewScheduleQuantity1
		      Return "VIEW_SCHEDULE_QUANTITY_1"
		    Case ColumnsEnum.EngagementSchedule2
		      Return "ENGAGEMENT_SCHEDULE_2"
		    Case ColumnsEnum.ClickSchedule2
		      Return "CLICK_SCHEDULE_2"
		    Case ColumnsEnum.ViewSchedule2
		      Return "VIEW_SCHEDULE_2"
		    Case ColumnsEnum.EngagementScheduleValueInMicroDollar2
		      Return "ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickScheduleValueInMicroDollar2
		      Return "CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewScheduleValueInMicroDollar2
		      Return "VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementScheduleQuantity2
		      Return "ENGAGEMENT_SCHEDULE_QUANTITY_2"
		    Case ColumnsEnum.ClickScheduleQuantity2
		      Return "CLICK_SCHEDULE_QUANTITY_2"
		    Case ColumnsEnum.ViewScheduleQuantity2
		      Return "VIEW_SCHEDULE_QUANTITY_2"
		    Case ColumnsEnum.TotalEngagementSchedule
		      Return "TOTAL_ENGAGEMENT_SCHEDULE"
		    Case ColumnsEnum.TotalClickSchedule
		      Return "TOTAL_CLICK_SCHEDULE"
		    Case ColumnsEnum.TotalViewSchedule
		      Return "TOTAL_VIEW_SCHEDULE"
		    Case ColumnsEnum.TotalEngagementScheduleValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementScheduleValueInDollar
		      Return "TOTAL_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickScheduleValueInMicroDollar
		      Return "TOTAL_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickScheduleValueInDollar
		      Return "TOTAL_CLICK_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewScheduleValueInMicroDollar
		      Return "TOTAL_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewScheduleValueInDollar
		      Return "TOTAL_VIEW_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementScheduleQuantity
		      Return "TOTAL_ENGAGEMENT_SCHEDULE_QUANTITY"
		    Case ColumnsEnum.TotalClickScheduleQuantity
		      Return "TOTAL_CLICK_SCHEDULE_QUANTITY"
		    Case ColumnsEnum.TotalViewScheduleQuantity
		      Return "TOTAL_VIEW_SCHEDULE_QUANTITY"
		    Case ColumnsEnum.TotalSchedule
		      Return "TOTAL_SCHEDULE"
		    Case ColumnsEnum.TotalScheduleValueInMicroDollar
		      Return "TOTAL_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageScheduleValueInMicroDollar
		      Return "AVERAGE_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageScheduleValueInMicroUsDollar
		      Return "AVERAGE_SCHEDULE_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalScheduleValueInMicroUsDollar
		      Return "TOTAL_SCHEDULE_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalScheduleQuantity
		      Return "TOTAL_SCHEDULE_QUANTITY"
		    Case ColumnsEnum.TotalScheduleValueInDollar
		      Return "TOTAL_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.ScheduleCostPerAction
		      Return "SCHEDULE_COST_PER_ACTION"
		    Case ColumnsEnum.ScheduleCostPerActionInUsDollar
		      Return "SCHEDULE_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.ScheduleRoas
		      Return "SCHEDULE_ROAS"
		    Case ColumnsEnum.TotalScheduleConversionRate
		      Return "TOTAL_SCHEDULE_CONVERSION_RATE"
		    Case ColumnsEnum.WebScheduleCostPerAction
		      Return "WEB_SCHEDULE_COST_PER_ACTION"
		    Case ColumnsEnum.WebScheduleRoas
		      Return "WEB_SCHEDULE_ROAS"
		    Case ColumnsEnum.TotalWebSchedule
		      Return "TOTAL_WEB_SCHEDULE"
		    Case ColumnsEnum.TotalWebScheduleValueInMicroDollar
		      Return "TOTAL_WEB_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebScheduleValueInDollar
		      Return "TOTAL_WEB_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickSchedule
		      Return "TOTAL_WEB_CLICK_SCHEDULE"
		    Case ColumnsEnum.TotalWebClickScheduleValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickScheduleValueInDollar
		      Return "TOTAL_WEB_CLICK_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementSchedule
		      Return "TOTAL_WEB_ENGAGEMENT_SCHEDULE"
		    Case ColumnsEnum.TotalWebEngagementScheduleValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementScheduleValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewSchedule
		      Return "TOTAL_WEB_VIEW_SCHEDULE"
		    Case ColumnsEnum.TotalWebViewScheduleValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewScheduleValueInDollar
		      Return "TOTAL_WEB_VIEW_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.InappScheduleCostPerAction
		      Return "INAPP_SCHEDULE_COST_PER_ACTION"
		    Case ColumnsEnum.InappScheduleRoas
		      Return "INAPP_SCHEDULE_ROAS"
		    Case ColumnsEnum.TotalInappSchedule
		      Return "TOTAL_INAPP_SCHEDULE"
		    Case ColumnsEnum.TotalInappScheduleValueInMicroDollar
		      Return "TOTAL_INAPP_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappScheduleValueInDollar
		      Return "TOTAL_INAPP_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappClickSchedule
		      Return "TOTAL_INAPP_CLICK_SCHEDULE"
		    Case ColumnsEnum.TotalInappClickScheduleValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappClickScheduleValueInDollar
		      Return "TOTAL_INAPP_CLICK_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementSchedule
		      Return "TOTAL_INAPP_ENGAGEMENT_SCHEDULE"
		    Case ColumnsEnum.TotalInappEngagementScheduleValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementScheduleValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappViewSchedule
		      Return "TOTAL_INAPP_VIEW_SCHEDULE"
		    Case ColumnsEnum.TotalInappViewScheduleValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappViewScheduleValueInDollar
		      Return "TOTAL_INAPP_VIEW_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.OfflineScheduleCostPerAction
		      Return "OFFLINE_SCHEDULE_COST_PER_ACTION"
		    Case ColumnsEnum.OfflineScheduleRoas
		      Return "OFFLINE_SCHEDULE_ROAS"
		    Case ColumnsEnum.TotalOfflineSchedule
		      Return "TOTAL_OFFLINE_SCHEDULE"
		    Case ColumnsEnum.TotalOfflineScheduleValueInMicroDollar
		      Return "TOTAL_OFFLINE_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineScheduleValueInDollar
		      Return "TOTAL_OFFLINE_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickSchedule
		      Return "TOTAL_OFFLINE_CLICK_SCHEDULE"
		    Case ColumnsEnum.TotalOfflineClickScheduleValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickScheduleValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementSchedule
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE"
		    Case ColumnsEnum.TotalOfflineEngagementScheduleValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementScheduleValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewSchedule
		      Return "TOTAL_OFFLINE_VIEW_SCHEDULE"
		    Case ColumnsEnum.TotalOfflineViewScheduleValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewScheduleValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalScheduleConversionProductCountUnique
		      Return "TOTAL_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebScheduleConversionProductCountUnique
		      Return "TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalInappScheduleConversionProductCountUnique
		      Return "TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalOfflineScheduleConversionProductCountUnique
		      Return "TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalScheduleConversionProductQuantity
		      Return "TOTAL_SCHEDULE_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalScheduleConversionProductValue
		      Return "TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalScheduleConversionProductValueInMicroUnits
		      Return "TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalScheduleConversionProductValueInUsd
		      Return "TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalScheduleConversionProductValueInMicroUsd
		      Return "TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebScheduleConversionProductQuantity
		      Return "TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebScheduleConversionProductValue
		      Return "TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebScheduleConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebScheduleConversionProductValueInUsd
		      Return "TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebScheduleConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalInappScheduleConversionProductQuantity
		      Return "TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalInappScheduleConversionProductValue
		      Return "TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalInappScheduleConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalInappScheduleConversionProductValueInUsd
		      Return "TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalInappScheduleConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalOfflineScheduleConversionProductQuantity
		      Return "TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalOfflineScheduleConversionProductValue
		      Return "TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalOfflineScheduleConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalOfflineScheduleConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalOfflineScheduleConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.EngagementFindLocation1
		      Return "ENGAGEMENT_FIND_LOCATION_1"
		    Case ColumnsEnum.ClickFindLocation1
		      Return "CLICK_FIND_LOCATION_1"
		    Case ColumnsEnum.ViewFindLocation1
		      Return "VIEW_FIND_LOCATION_1"
		    Case ColumnsEnum.EngagementFindLocationValueInMicroDollar1
		      Return "ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickFindLocationValueInMicroDollar1
		      Return "CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewFindLocationValueInMicroDollar1
		      Return "VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementFindLocationQuantity1
		      Return "ENGAGEMENT_FIND_LOCATION_QUANTITY_1"
		    Case ColumnsEnum.ClickFindLocationQuantity1
		      Return "CLICK_FIND_LOCATION_QUANTITY_1"
		    Case ColumnsEnum.ViewFindLocationQuantity1
		      Return "VIEW_FIND_LOCATION_QUANTITY_1"
		    Case ColumnsEnum.EngagementFindLocation2
		      Return "ENGAGEMENT_FIND_LOCATION_2"
		    Case ColumnsEnum.ClickFindLocation2
		      Return "CLICK_FIND_LOCATION_2"
		    Case ColumnsEnum.ViewFindLocation2
		      Return "VIEW_FIND_LOCATION_2"
		    Case ColumnsEnum.EngagementFindLocationValueInMicroDollar2
		      Return "ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickFindLocationValueInMicroDollar2
		      Return "CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewFindLocationValueInMicroDollar2
		      Return "VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementFindLocationQuantity2
		      Return "ENGAGEMENT_FIND_LOCATION_QUANTITY_2"
		    Case ColumnsEnum.ClickFindLocationQuantity2
		      Return "CLICK_FIND_LOCATION_QUANTITY_2"
		    Case ColumnsEnum.ViewFindLocationQuantity2
		      Return "VIEW_FIND_LOCATION_QUANTITY_2"
		    Case ColumnsEnum.TotalEngagementFindLocation
		      Return "TOTAL_ENGAGEMENT_FIND_LOCATION"
		    Case ColumnsEnum.TotalClickFindLocation
		      Return "TOTAL_CLICK_FIND_LOCATION"
		    Case ColumnsEnum.TotalViewFindLocation
		      Return "TOTAL_VIEW_FIND_LOCATION"
		    Case ColumnsEnum.TotalEngagementFindLocationValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementFindLocationValueInDollar
		      Return "TOTAL_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickFindLocationValueInMicroDollar
		      Return "TOTAL_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickFindLocationValueInDollar
		      Return "TOTAL_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewFindLocationValueInMicroDollar
		      Return "TOTAL_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewFindLocationValueInDollar
		      Return "TOTAL_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementFindLocationQuantity
		      Return "TOTAL_ENGAGEMENT_FIND_LOCATION_QUANTITY"
		    Case ColumnsEnum.TotalClickFindLocationQuantity
		      Return "TOTAL_CLICK_FIND_LOCATION_QUANTITY"
		    Case ColumnsEnum.TotalViewFindLocationQuantity
		      Return "TOTAL_VIEW_FIND_LOCATION_QUANTITY"
		    Case ColumnsEnum.TotalFindLocation
		      Return "TOTAL_FIND_LOCATION"
		    Case ColumnsEnum.TotalFindLocationValueInMicroDollar
		      Return "TOTAL_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageFindLocationValueInMicroDollar
		      Return "AVERAGE_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageFindLocationValueInMicroUsDollar
		      Return "AVERAGE_FIND_LOCATION_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalFindLocationValueInMicroUsDollar
		      Return "TOTAL_FIND_LOCATION_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalFindLocationQuantity
		      Return "TOTAL_FIND_LOCATION_QUANTITY"
		    Case ColumnsEnum.TotalFindLocationValueInDollar
		      Return "TOTAL_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.FindLocationCostPerAction
		      Return "FIND_LOCATION_COST_PER_ACTION"
		    Case ColumnsEnum.FindLocationCostPerActionInUsDollar
		      Return "FIND_LOCATION_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.FindLocationRoas
		      Return "FIND_LOCATION_ROAS"
		    Case ColumnsEnum.TotalFindLocationConversionRate
		      Return "TOTAL_FIND_LOCATION_CONVERSION_RATE"
		    Case ColumnsEnum.WebFindLocationCostPerAction
		      Return "WEB_FIND_LOCATION_COST_PER_ACTION"
		    Case ColumnsEnum.WebFindLocationRoas
		      Return "WEB_FIND_LOCATION_ROAS"
		    Case ColumnsEnum.TotalWebFindLocation
		      Return "TOTAL_WEB_FIND_LOCATION"
		    Case ColumnsEnum.TotalWebFindLocationValueInMicroDollar
		      Return "TOTAL_WEB_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebFindLocationValueInDollar
		      Return "TOTAL_WEB_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickFindLocation
		      Return "TOTAL_WEB_CLICK_FIND_LOCATION"
		    Case ColumnsEnum.TotalWebClickFindLocationValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickFindLocationValueInDollar
		      Return "TOTAL_WEB_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementFindLocation
		      Return "TOTAL_WEB_ENGAGEMENT_FIND_LOCATION"
		    Case ColumnsEnum.TotalWebEngagementFindLocationValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementFindLocationValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewFindLocation
		      Return "TOTAL_WEB_VIEW_FIND_LOCATION"
		    Case ColumnsEnum.TotalWebViewFindLocationValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewFindLocationValueInDollar
		      Return "TOTAL_WEB_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.InappFindLocationCostPerAction
		      Return "INAPP_FIND_LOCATION_COST_PER_ACTION"
		    Case ColumnsEnum.InappFindLocationRoas
		      Return "INAPP_FIND_LOCATION_ROAS"
		    Case ColumnsEnum.TotalInappFindLocation
		      Return "TOTAL_INAPP_FIND_LOCATION"
		    Case ColumnsEnum.TotalInappFindLocationValueInMicroDollar
		      Return "TOTAL_INAPP_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappFindLocationValueInDollar
		      Return "TOTAL_INAPP_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappClickFindLocation
		      Return "TOTAL_INAPP_CLICK_FIND_LOCATION"
		    Case ColumnsEnum.TotalInappClickFindLocationValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappClickFindLocationValueInDollar
		      Return "TOTAL_INAPP_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementFindLocation
		      Return "TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION"
		    Case ColumnsEnum.TotalInappEngagementFindLocationValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementFindLocationValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappViewFindLocation
		      Return "TOTAL_INAPP_VIEW_FIND_LOCATION"
		    Case ColumnsEnum.TotalInappViewFindLocationValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappViewFindLocationValueInDollar
		      Return "TOTAL_INAPP_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.OfflineFindLocationCostPerAction
		      Return "OFFLINE_FIND_LOCATION_COST_PER_ACTION"
		    Case ColumnsEnum.OfflineFindLocationRoas
		      Return "OFFLINE_FIND_LOCATION_ROAS"
		    Case ColumnsEnum.TotalOfflineFindLocation
		      Return "TOTAL_OFFLINE_FIND_LOCATION"
		    Case ColumnsEnum.TotalOfflineFindLocationValueInMicroDollar
		      Return "TOTAL_OFFLINE_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineFindLocationValueInDollar
		      Return "TOTAL_OFFLINE_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickFindLocation
		      Return "TOTAL_OFFLINE_CLICK_FIND_LOCATION"
		    Case ColumnsEnum.TotalOfflineClickFindLocationValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickFindLocationValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementFindLocation
		      Return "TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION"
		    Case ColumnsEnum.TotalOfflineEngagementFindLocationValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementFindLocationValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewFindLocation
		      Return "TOTAL_OFFLINE_VIEW_FIND_LOCATION"
		    Case ColumnsEnum.TotalOfflineViewFindLocationValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewFindLocationValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalFindLocationConversionProductCountUnique
		      Return "TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebFindLocationConversionProductCountUnique
		      Return "TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalInappFindLocationConversionProductCountUnique
		      Return "TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalOfflineFindLocationConversionProductCountUnique
		      Return "TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalFindLocationConversionProductQuantity
		      Return "TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalFindLocationConversionProductValue
		      Return "TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalFindLocationConversionProductValueInMicroUnits
		      Return "TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalFindLocationConversionProductValueInUsd
		      Return "TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalFindLocationConversionProductValueInMicroUsd
		      Return "TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebFindLocationConversionProductQuantity
		      Return "TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebFindLocationConversionProductValue
		      Return "TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebFindLocationConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebFindLocationConversionProductValueInUsd
		      Return "TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebFindLocationConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalInappFindLocationConversionProductQuantity
		      Return "TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalInappFindLocationConversionProductValue
		      Return "TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalInappFindLocationConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalInappFindLocationConversionProductValueInUsd
		      Return "TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalInappFindLocationConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalOfflineFindLocationConversionProductQuantity
		      Return "TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalOfflineFindLocationConversionProductValue
		      Return "TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalOfflineFindLocationConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalOfflineFindLocationConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalOfflineFindLocationConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.EngagementCustomizeProduct1
		      Return "ENGAGEMENT_CUSTOMIZE_PRODUCT_1"
		    Case ColumnsEnum.ClickCustomizeProduct1
		      Return "CLICK_CUSTOMIZE_PRODUCT_1"
		    Case ColumnsEnum.ViewCustomizeProduct1
		      Return "VIEW_CUSTOMIZE_PRODUCT_1"
		    Case ColumnsEnum.EngagementCustomizeProductValueInMicroDollar1
		      Return "ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickCustomizeProductValueInMicroDollar1
		      Return "CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewCustomizeProductValueInMicroDollar1
		      Return "VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementCustomizeProductQuantity1
		      Return "ENGAGEMENT_CUSTOMIZE_PRODUCT_QUANTITY_1"
		    Case ColumnsEnum.ClickCustomizeProductQuantity1
		      Return "CLICK_CUSTOMIZE_PRODUCT_QUANTITY_1"
		    Case ColumnsEnum.ViewCustomizeProductQuantity1
		      Return "VIEW_CUSTOMIZE_PRODUCT_QUANTITY_1"
		    Case ColumnsEnum.EngagementCustomizeProduct2
		      Return "ENGAGEMENT_CUSTOMIZE_PRODUCT_2"
		    Case ColumnsEnum.ClickCustomizeProduct2
		      Return "CLICK_CUSTOMIZE_PRODUCT_2"
		    Case ColumnsEnum.ViewCustomizeProduct2
		      Return "VIEW_CUSTOMIZE_PRODUCT_2"
		    Case ColumnsEnum.EngagementCustomizeProductValueInMicroDollar2
		      Return "ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickCustomizeProductValueInMicroDollar2
		      Return "CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewCustomizeProductValueInMicroDollar2
		      Return "VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementCustomizeProductQuantity2
		      Return "ENGAGEMENT_CUSTOMIZE_PRODUCT_QUANTITY_2"
		    Case ColumnsEnum.ClickCustomizeProductQuantity2
		      Return "CLICK_CUSTOMIZE_PRODUCT_QUANTITY_2"
		    Case ColumnsEnum.ViewCustomizeProductQuantity2
		      Return "VIEW_CUSTOMIZE_PRODUCT_QUANTITY_2"
		    Case ColumnsEnum.TotalEngagementCustomizeProduct
		      Return "TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT"
		    Case ColumnsEnum.TotalClickCustomizeProduct
		      Return "TOTAL_CLICK_CUSTOMIZE_PRODUCT"
		    Case ColumnsEnum.TotalViewCustomizeProduct
		      Return "TOTAL_VIEW_CUSTOMIZE_PRODUCT"
		    Case ColumnsEnum.TotalEngagementCustomizeProductValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementCustomizeProductValueInDollar
		      Return "TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickCustomizeProductValueInMicroDollar
		      Return "TOTAL_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickCustomizeProductValueInDollar
		      Return "TOTAL_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewCustomizeProductValueInMicroDollar
		      Return "TOTAL_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewCustomizeProductValueInDollar
		      Return "TOTAL_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementCustomizeProductQuantity
		      Return "TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalClickCustomizeProductQuantity
		      Return "TOTAL_CLICK_CUSTOMIZE_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalViewCustomizeProductQuantity
		      Return "TOTAL_VIEW_CUSTOMIZE_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalCustomizeProduct
		      Return "TOTAL_CUSTOMIZE_PRODUCT"
		    Case ColumnsEnum.TotalCustomizeProductValueInMicroDollar
		      Return "TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageCustomizeProductValueInMicroDollar
		      Return "AVERAGE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageCustomizeProductValueInMicroUsDollar
		      Return "AVERAGE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalCustomizeProductValueInMicroUsDollar
		      Return "TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalCustomizeProductQuantity
		      Return "TOTAL_CUSTOMIZE_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalCustomizeProductValueInDollar
		      Return "TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.CustomizeProductCostPerAction
		      Return "CUSTOMIZE_PRODUCT_COST_PER_ACTION"
		    Case ColumnsEnum.CustomizeProductCostPerActionInUsDollar
		      Return "CUSTOMIZE_PRODUCT_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.CustomizeProductRoas
		      Return "CUSTOMIZE_PRODUCT_ROAS"
		    Case ColumnsEnum.TotalCustomizeProductConversionRate
		      Return "TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_RATE"
		    Case ColumnsEnum.WebCustomizeProductCostPerAction
		      Return "WEB_CUSTOMIZE_PRODUCT_COST_PER_ACTION"
		    Case ColumnsEnum.WebCustomizeProductRoas
		      Return "WEB_CUSTOMIZE_PRODUCT_ROAS"
		    Case ColumnsEnum.TotalWebCustomizeProduct
		      Return "TOTAL_WEB_CUSTOMIZE_PRODUCT"
		    Case ColumnsEnum.TotalWebCustomizeProductValueInMicroDollar
		      Return "TOTAL_WEB_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebCustomizeProductValueInDollar
		      Return "TOTAL_WEB_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickCustomizeProduct
		      Return "TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT"
		    Case ColumnsEnum.TotalWebClickCustomizeProductValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickCustomizeProductValueInDollar
		      Return "TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementCustomizeProduct
		      Return "TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT"
		    Case ColumnsEnum.TotalWebEngagementCustomizeProductValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementCustomizeProductValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewCustomizeProduct
		      Return "TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT"
		    Case ColumnsEnum.TotalWebViewCustomizeProductValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewCustomizeProductValueInDollar
		      Return "TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.InappCustomizeProductCostPerAction
		      Return "INAPP_CUSTOMIZE_PRODUCT_COST_PER_ACTION"
		    Case ColumnsEnum.InappCustomizeProductRoas
		      Return "INAPP_CUSTOMIZE_PRODUCT_ROAS"
		    Case ColumnsEnum.TotalInappCustomizeProduct
		      Return "TOTAL_INAPP_CUSTOMIZE_PRODUCT"
		    Case ColumnsEnum.TotalInappCustomizeProductValueInMicroDollar
		      Return "TOTAL_INAPP_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappCustomizeProductValueInDollar
		      Return "TOTAL_INAPP_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappClickCustomizeProduct
		      Return "TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT"
		    Case ColumnsEnum.TotalInappClickCustomizeProductValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappClickCustomizeProductValueInDollar
		      Return "TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementCustomizeProduct
		      Return "TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT"
		    Case ColumnsEnum.TotalInappEngagementCustomizeProductValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementCustomizeProductValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappViewCustomizeProduct
		      Return "TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT"
		    Case ColumnsEnum.TotalInappViewCustomizeProductValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappViewCustomizeProductValueInDollar
		      Return "TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.OfflineCustomizeProductCostPerAction
		      Return "OFFLINE_CUSTOMIZE_PRODUCT_COST_PER_ACTION"
		    Case ColumnsEnum.OfflineCustomizeProductRoas
		      Return "OFFLINE_CUSTOMIZE_PRODUCT_ROAS"
		    Case ColumnsEnum.TotalOfflineCustomizeProduct
		      Return "TOTAL_OFFLINE_CUSTOMIZE_PRODUCT"
		    Case ColumnsEnum.TotalOfflineCustomizeProductValueInMicroDollar
		      Return "TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineCustomizeProductValueInDollar
		      Return "TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickCustomizeProduct
		      Return "TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT"
		    Case ColumnsEnum.TotalOfflineClickCustomizeProductValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickCustomizeProductValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementCustomizeProduct
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT"
		    Case ColumnsEnum.TotalOfflineEngagementCustomizeProductValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementCustomizeProductValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewCustomizeProduct
		      Return "TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT"
		    Case ColumnsEnum.TotalOfflineViewCustomizeProductValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewCustomizeProductValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalCustomizeProductConversionProductCountUnique
		      Return "TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebCustomizeProductConversionProductCountUnique
		      Return "TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalInappCustomizeProductConversionProductCountUnique
		      Return "TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalOfflineCustomizeProductConversionProductCountUnique
		      Return "TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalCustomizeProductConversionProductQuantity
		      Return "TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalCustomizeProductConversionProductValue
		      Return "TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalCustomizeProductConversionProductValueInMicroUnits
		      Return "TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalCustomizeProductConversionProductValueInUsd
		      Return "TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalCustomizeProductConversionProductValueInMicroUsd
		      Return "TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebCustomizeProductConversionProductQuantity
		      Return "TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebCustomizeProductConversionProductValue
		      Return "TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebCustomizeProductConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebCustomizeProductConversionProductValueInUsd
		      Return "TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebCustomizeProductConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalInappCustomizeProductConversionProductQuantity
		      Return "TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalInappCustomizeProductConversionProductValue
		      Return "TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalInappCustomizeProductConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalInappCustomizeProductConversionProductValueInUsd
		      Return "TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalInappCustomizeProductConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalOfflineCustomizeProductConversionProductQuantity
		      Return "TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalOfflineCustomizeProductConversionProductValue
		      Return "TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalOfflineCustomizeProductConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalOfflineCustomizeProductConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalOfflineCustomizeProductConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.EngagementSubmitApplication1
		      Return "ENGAGEMENT_SUBMIT_APPLICATION_1"
		    Case ColumnsEnum.ClickSubmitApplication1
		      Return "CLICK_SUBMIT_APPLICATION_1"
		    Case ColumnsEnum.ViewSubmitApplication1
		      Return "VIEW_SUBMIT_APPLICATION_1"
		    Case ColumnsEnum.EngagementSubmitApplicationValueInMicroDollar1
		      Return "ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickSubmitApplicationValueInMicroDollar1
		      Return "CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewSubmitApplicationValueInMicroDollar1
		      Return "VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementSubmitApplicationQuantity1
		      Return "ENGAGEMENT_SUBMIT_APPLICATION_QUANTITY_1"
		    Case ColumnsEnum.ClickSubmitApplicationQuantity1
		      Return "CLICK_SUBMIT_APPLICATION_QUANTITY_1"
		    Case ColumnsEnum.ViewSubmitApplicationQuantity1
		      Return "VIEW_SUBMIT_APPLICATION_QUANTITY_1"
		    Case ColumnsEnum.EngagementSubmitApplication2
		      Return "ENGAGEMENT_SUBMIT_APPLICATION_2"
		    Case ColumnsEnum.ClickSubmitApplication2
		      Return "CLICK_SUBMIT_APPLICATION_2"
		    Case ColumnsEnum.ViewSubmitApplication2
		      Return "VIEW_SUBMIT_APPLICATION_2"
		    Case ColumnsEnum.EngagementSubmitApplicationValueInMicroDollar2
		      Return "ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickSubmitApplicationValueInMicroDollar2
		      Return "CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewSubmitApplicationValueInMicroDollar2
		      Return "VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementSubmitApplicationQuantity2
		      Return "ENGAGEMENT_SUBMIT_APPLICATION_QUANTITY_2"
		    Case ColumnsEnum.ClickSubmitApplicationQuantity2
		      Return "CLICK_SUBMIT_APPLICATION_QUANTITY_2"
		    Case ColumnsEnum.ViewSubmitApplicationQuantity2
		      Return "VIEW_SUBMIT_APPLICATION_QUANTITY_2"
		    Case ColumnsEnum.TotalEngagementSubmitApplication
		      Return "TOTAL_ENGAGEMENT_SUBMIT_APPLICATION"
		    Case ColumnsEnum.TotalClickSubmitApplication
		      Return "TOTAL_CLICK_SUBMIT_APPLICATION"
		    Case ColumnsEnum.TotalViewSubmitApplication
		      Return "TOTAL_VIEW_SUBMIT_APPLICATION"
		    Case ColumnsEnum.TotalEngagementSubmitApplicationValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementSubmitApplicationValueInDollar
		      Return "TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickSubmitApplicationValueInMicroDollar
		      Return "TOTAL_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickSubmitApplicationValueInDollar
		      Return "TOTAL_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewSubmitApplicationValueInMicroDollar
		      Return "TOTAL_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewSubmitApplicationValueInDollar
		      Return "TOTAL_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementSubmitApplicationQuantity
		      Return "TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_QUANTITY"
		    Case ColumnsEnum.TotalClickSubmitApplicationQuantity
		      Return "TOTAL_CLICK_SUBMIT_APPLICATION_QUANTITY"
		    Case ColumnsEnum.TotalViewSubmitApplicationQuantity
		      Return "TOTAL_VIEW_SUBMIT_APPLICATION_QUANTITY"
		    Case ColumnsEnum.TotalSubmitApplication
		      Return "TOTAL_SUBMIT_APPLICATION"
		    Case ColumnsEnum.TotalSubmitApplicationValueInMicroDollar
		      Return "TOTAL_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageSubmitApplicationValueInMicroDollar
		      Return "AVERAGE_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageSubmitApplicationValueInMicroUsDollar
		      Return "AVERAGE_SUBMIT_APPLICATION_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalSubmitApplicationValueInMicroUsDollar
		      Return "TOTAL_SUBMIT_APPLICATION_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalSubmitApplicationQuantity
		      Return "TOTAL_SUBMIT_APPLICATION_QUANTITY"
		    Case ColumnsEnum.TotalSubmitApplicationValueInDollar
		      Return "TOTAL_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.SubmitApplicationCostPerAction
		      Return "SUBMIT_APPLICATION_COST_PER_ACTION"
		    Case ColumnsEnum.SubmitApplicationCostPerActionInUsDollar
		      Return "SUBMIT_APPLICATION_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.SubmitApplicationRoas
		      Return "SUBMIT_APPLICATION_ROAS"
		    Case ColumnsEnum.TotalSubmitApplicationConversionRate
		      Return "TOTAL_SUBMIT_APPLICATION_CONVERSION_RATE"
		    Case ColumnsEnum.WebSubmitApplicationCostPerAction
		      Return "WEB_SUBMIT_APPLICATION_COST_PER_ACTION"
		    Case ColumnsEnum.WebSubmitApplicationRoas
		      Return "WEB_SUBMIT_APPLICATION_ROAS"
		    Case ColumnsEnum.TotalWebSubmitApplication
		      Return "TOTAL_WEB_SUBMIT_APPLICATION"
		    Case ColumnsEnum.TotalWebSubmitApplicationValueInMicroDollar
		      Return "TOTAL_WEB_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebSubmitApplicationValueInDollar
		      Return "TOTAL_WEB_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickSubmitApplication
		      Return "TOTAL_WEB_CLICK_SUBMIT_APPLICATION"
		    Case ColumnsEnum.TotalWebClickSubmitApplicationValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickSubmitApplicationValueInDollar
		      Return "TOTAL_WEB_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementSubmitApplication
		      Return "TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION"
		    Case ColumnsEnum.TotalWebEngagementSubmitApplicationValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementSubmitApplicationValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewSubmitApplication
		      Return "TOTAL_WEB_VIEW_SUBMIT_APPLICATION"
		    Case ColumnsEnum.TotalWebViewSubmitApplicationValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewSubmitApplicationValueInDollar
		      Return "TOTAL_WEB_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.InappSubmitApplicationCostPerAction
		      Return "INAPP_SUBMIT_APPLICATION_COST_PER_ACTION"
		    Case ColumnsEnum.InappSubmitApplicationRoas
		      Return "INAPP_SUBMIT_APPLICATION_ROAS"
		    Case ColumnsEnum.TotalInappSubmitApplication
		      Return "TOTAL_INAPP_SUBMIT_APPLICATION"
		    Case ColumnsEnum.TotalInappSubmitApplicationValueInMicroDollar
		      Return "TOTAL_INAPP_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappSubmitApplicationValueInDollar
		      Return "TOTAL_INAPP_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappClickSubmitApplication
		      Return "TOTAL_INAPP_CLICK_SUBMIT_APPLICATION"
		    Case ColumnsEnum.TotalInappClickSubmitApplicationValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappClickSubmitApplicationValueInDollar
		      Return "TOTAL_INAPP_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementSubmitApplication
		      Return "TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION"
		    Case ColumnsEnum.TotalInappEngagementSubmitApplicationValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementSubmitApplicationValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappViewSubmitApplication
		      Return "TOTAL_INAPP_VIEW_SUBMIT_APPLICATION"
		    Case ColumnsEnum.TotalInappViewSubmitApplicationValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappViewSubmitApplicationValueInDollar
		      Return "TOTAL_INAPP_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.OfflineSubmitApplicationCostPerAction
		      Return "OFFLINE_SUBMIT_APPLICATION_COST_PER_ACTION"
		    Case ColumnsEnum.OfflineSubmitApplicationRoas
		      Return "OFFLINE_SUBMIT_APPLICATION_ROAS"
		    Case ColumnsEnum.TotalOfflineSubmitApplication
		      Return "TOTAL_OFFLINE_SUBMIT_APPLICATION"
		    Case ColumnsEnum.TotalOfflineSubmitApplicationValueInMicroDollar
		      Return "TOTAL_OFFLINE_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineSubmitApplicationValueInDollar
		      Return "TOTAL_OFFLINE_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickSubmitApplication
		      Return "TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION"
		    Case ColumnsEnum.TotalOfflineClickSubmitApplicationValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickSubmitApplicationValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementSubmitApplication
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION"
		    Case ColumnsEnum.TotalOfflineEngagementSubmitApplicationValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementSubmitApplicationValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewSubmitApplication
		      Return "TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION"
		    Case ColumnsEnum.TotalOfflineViewSubmitApplicationValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewSubmitApplicationValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalSubmitApplicationConversionProductCountUnique
		      Return "TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebSubmitApplicationConversionProductCountUnique
		      Return "TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalInappSubmitApplicationConversionProductCountUnique
		      Return "TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalOfflineSubmitApplicationConversionProductCountUnique
		      Return "TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalSubmitApplicationConversionProductQuantity
		      Return "TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalSubmitApplicationConversionProductValue
		      Return "TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalSubmitApplicationConversionProductValueInMicroUnits
		      Return "TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalSubmitApplicationConversionProductValueInUsd
		      Return "TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalSubmitApplicationConversionProductValueInMicroUsd
		      Return "TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebSubmitApplicationConversionProductQuantity
		      Return "TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebSubmitApplicationConversionProductValue
		      Return "TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebSubmitApplicationConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebSubmitApplicationConversionProductValueInUsd
		      Return "TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebSubmitApplicationConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalInappSubmitApplicationConversionProductQuantity
		      Return "TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalInappSubmitApplicationConversionProductValue
		      Return "TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalInappSubmitApplicationConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalInappSubmitApplicationConversionProductValueInUsd
		      Return "TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalInappSubmitApplicationConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalOfflineSubmitApplicationConversionProductQuantity
		      Return "TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalOfflineSubmitApplicationConversionProductValue
		      Return "TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalOfflineSubmitApplicationConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalOfflineSubmitApplicationConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalOfflineSubmitApplicationConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.EngagementStartTrial1
		      Return "ENGAGEMENT_START_TRIAL_1"
		    Case ColumnsEnum.ClickStartTrial1
		      Return "CLICK_START_TRIAL_1"
		    Case ColumnsEnum.ViewStartTrial1
		      Return "VIEW_START_TRIAL_1"
		    Case ColumnsEnum.EngagementStartTrialValueInMicroDollar1
		      Return "ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickStartTrialValueInMicroDollar1
		      Return "CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewStartTrialValueInMicroDollar1
		      Return "VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementStartTrialQuantity1
		      Return "ENGAGEMENT_START_TRIAL_QUANTITY_1"
		    Case ColumnsEnum.ClickStartTrialQuantity1
		      Return "CLICK_START_TRIAL_QUANTITY_1"
		    Case ColumnsEnum.ViewStartTrialQuantity1
		      Return "VIEW_START_TRIAL_QUANTITY_1"
		    Case ColumnsEnum.EngagementStartTrial2
		      Return "ENGAGEMENT_START_TRIAL_2"
		    Case ColumnsEnum.ClickStartTrial2
		      Return "CLICK_START_TRIAL_2"
		    Case ColumnsEnum.ViewStartTrial2
		      Return "VIEW_START_TRIAL_2"
		    Case ColumnsEnum.EngagementStartTrialValueInMicroDollar2
		      Return "ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickStartTrialValueInMicroDollar2
		      Return "CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewStartTrialValueInMicroDollar2
		      Return "VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementStartTrialQuantity2
		      Return "ENGAGEMENT_START_TRIAL_QUANTITY_2"
		    Case ColumnsEnum.ClickStartTrialQuantity2
		      Return "CLICK_START_TRIAL_QUANTITY_2"
		    Case ColumnsEnum.ViewStartTrialQuantity2
		      Return "VIEW_START_TRIAL_QUANTITY_2"
		    Case ColumnsEnum.TotalEngagementStartTrial
		      Return "TOTAL_ENGAGEMENT_START_TRIAL"
		    Case ColumnsEnum.TotalClickStartTrial
		      Return "TOTAL_CLICK_START_TRIAL"
		    Case ColumnsEnum.TotalViewStartTrial
		      Return "TOTAL_VIEW_START_TRIAL"
		    Case ColumnsEnum.TotalEngagementStartTrialValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementStartTrialValueInDollar
		      Return "TOTAL_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickStartTrialValueInMicroDollar
		      Return "TOTAL_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickStartTrialValueInDollar
		      Return "TOTAL_CLICK_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewStartTrialValueInMicroDollar
		      Return "TOTAL_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewStartTrialValueInDollar
		      Return "TOTAL_VIEW_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementStartTrialQuantity
		      Return "TOTAL_ENGAGEMENT_START_TRIAL_QUANTITY"
		    Case ColumnsEnum.TotalClickStartTrialQuantity
		      Return "TOTAL_CLICK_START_TRIAL_QUANTITY"
		    Case ColumnsEnum.TotalViewStartTrialQuantity
		      Return "TOTAL_VIEW_START_TRIAL_QUANTITY"
		    Case ColumnsEnum.TotalStartTrial
		      Return "TOTAL_START_TRIAL"
		    Case ColumnsEnum.TotalStartTrialValueInMicroDollar
		      Return "TOTAL_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageStartTrialValueInMicroDollar
		      Return "AVERAGE_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageStartTrialValueInMicroUsDollar
		      Return "AVERAGE_START_TRIAL_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalStartTrialValueInMicroUsDollar
		      Return "TOTAL_START_TRIAL_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalStartTrialQuantity
		      Return "TOTAL_START_TRIAL_QUANTITY"
		    Case ColumnsEnum.TotalStartTrialValueInDollar
		      Return "TOTAL_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.StartTrialCostPerAction
		      Return "START_TRIAL_COST_PER_ACTION"
		    Case ColumnsEnum.StartTrialCostPerActionInUsDollar
		      Return "START_TRIAL_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.StartTrialRoas
		      Return "START_TRIAL_ROAS"
		    Case ColumnsEnum.TotalStartTrialConversionRate
		      Return "TOTAL_START_TRIAL_CONVERSION_RATE"
		    Case ColumnsEnum.WebStartTrialCostPerAction
		      Return "WEB_START_TRIAL_COST_PER_ACTION"
		    Case ColumnsEnum.WebStartTrialRoas
		      Return "WEB_START_TRIAL_ROAS"
		    Case ColumnsEnum.TotalWebStartTrial
		      Return "TOTAL_WEB_START_TRIAL"
		    Case ColumnsEnum.TotalWebStartTrialValueInMicroDollar
		      Return "TOTAL_WEB_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebStartTrialValueInDollar
		      Return "TOTAL_WEB_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickStartTrial
		      Return "TOTAL_WEB_CLICK_START_TRIAL"
		    Case ColumnsEnum.TotalWebClickStartTrialValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickStartTrialValueInDollar
		      Return "TOTAL_WEB_CLICK_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementStartTrial
		      Return "TOTAL_WEB_ENGAGEMENT_START_TRIAL"
		    Case ColumnsEnum.TotalWebEngagementStartTrialValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementStartTrialValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewStartTrial
		      Return "TOTAL_WEB_VIEW_START_TRIAL"
		    Case ColumnsEnum.TotalWebViewStartTrialValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewStartTrialValueInDollar
		      Return "TOTAL_WEB_VIEW_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.InappStartTrialCostPerAction
		      Return "INAPP_START_TRIAL_COST_PER_ACTION"
		    Case ColumnsEnum.InappStartTrialRoas
		      Return "INAPP_START_TRIAL_ROAS"
		    Case ColumnsEnum.TotalInappStartTrial
		      Return "TOTAL_INAPP_START_TRIAL"
		    Case ColumnsEnum.TotalInappStartTrialValueInMicroDollar
		      Return "TOTAL_INAPP_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappStartTrialValueInDollar
		      Return "TOTAL_INAPP_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappClickStartTrial
		      Return "TOTAL_INAPP_CLICK_START_TRIAL"
		    Case ColumnsEnum.TotalInappClickStartTrialValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappClickStartTrialValueInDollar
		      Return "TOTAL_INAPP_CLICK_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementStartTrial
		      Return "TOTAL_INAPP_ENGAGEMENT_START_TRIAL"
		    Case ColumnsEnum.TotalInappEngagementStartTrialValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementStartTrialValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappViewStartTrial
		      Return "TOTAL_INAPP_VIEW_START_TRIAL"
		    Case ColumnsEnum.TotalInappViewStartTrialValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappViewStartTrialValueInDollar
		      Return "TOTAL_INAPP_VIEW_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.OfflineStartTrialCostPerAction
		      Return "OFFLINE_START_TRIAL_COST_PER_ACTION"
		    Case ColumnsEnum.OfflineStartTrialRoas
		      Return "OFFLINE_START_TRIAL_ROAS"
		    Case ColumnsEnum.TotalOfflineStartTrial
		      Return "TOTAL_OFFLINE_START_TRIAL"
		    Case ColumnsEnum.TotalOfflineStartTrialValueInMicroDollar
		      Return "TOTAL_OFFLINE_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineStartTrialValueInDollar
		      Return "TOTAL_OFFLINE_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickStartTrial
		      Return "TOTAL_OFFLINE_CLICK_START_TRIAL"
		    Case ColumnsEnum.TotalOfflineClickStartTrialValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickStartTrialValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementStartTrial
		      Return "TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL"
		    Case ColumnsEnum.TotalOfflineEngagementStartTrialValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementStartTrialValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewStartTrial
		      Return "TOTAL_OFFLINE_VIEW_START_TRIAL"
		    Case ColumnsEnum.TotalOfflineViewStartTrialValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewStartTrialValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalStartTrialConversionProductCountUnique
		      Return "TOTAL_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebStartTrialConversionProductCountUnique
		      Return "TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalInappStartTrialConversionProductCountUnique
		      Return "TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalOfflineStartTrialConversionProductCountUnique
		      Return "TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalStartTrialConversionProductQuantity
		      Return "TOTAL_START_TRIAL_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalStartTrialConversionProductValue
		      Return "TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalStartTrialConversionProductValueInMicroUnits
		      Return "TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalStartTrialConversionProductValueInUsd
		      Return "TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalStartTrialConversionProductValueInMicroUsd
		      Return "TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebStartTrialConversionProductQuantity
		      Return "TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebStartTrialConversionProductValue
		      Return "TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebStartTrialConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebStartTrialConversionProductValueInUsd
		      Return "TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebStartTrialConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalInappStartTrialConversionProductQuantity
		      Return "TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalInappStartTrialConversionProductValue
		      Return "TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalInappStartTrialConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalInappStartTrialConversionProductValueInUsd
		      Return "TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalInappStartTrialConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalOfflineStartTrialConversionProductQuantity
		      Return "TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalOfflineStartTrialConversionProductValue
		      Return "TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalOfflineStartTrialConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalOfflineStartTrialConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalOfflineStartTrialConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.EngagementAppOpen1
		      Return "ENGAGEMENT_APP_OPEN_1"
		    Case ColumnsEnum.ClickAppOpen1
		      Return "CLICK_APP_OPEN_1"
		    Case ColumnsEnum.ViewAppOpen1
		      Return "VIEW_APP_OPEN_1"
		    Case ColumnsEnum.EngagementAppOpenValueInMicroDollar1
		      Return "ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ClickAppOpenValueInMicroDollar1
		      Return "CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.ViewAppOpenValueInMicroDollar1
		      Return "VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR_1"
		    Case ColumnsEnum.EngagementAppOpenQuantity1
		      Return "ENGAGEMENT_APP_OPEN_QUANTITY_1"
		    Case ColumnsEnum.ClickAppOpenQuantity1
		      Return "CLICK_APP_OPEN_QUANTITY_1"
		    Case ColumnsEnum.ViewAppOpenQuantity1
		      Return "VIEW_APP_OPEN_QUANTITY_1"
		    Case ColumnsEnum.EngagementAppOpen2
		      Return "ENGAGEMENT_APP_OPEN_2"
		    Case ColumnsEnum.ClickAppOpen2
		      Return "CLICK_APP_OPEN_2"
		    Case ColumnsEnum.ViewAppOpen2
		      Return "VIEW_APP_OPEN_2"
		    Case ColumnsEnum.EngagementAppOpenValueInMicroDollar2
		      Return "ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ClickAppOpenValueInMicroDollar2
		      Return "CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.ViewAppOpenValueInMicroDollar2
		      Return "VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR_2"
		    Case ColumnsEnum.EngagementAppOpenQuantity2
		      Return "ENGAGEMENT_APP_OPEN_QUANTITY_2"
		    Case ColumnsEnum.ClickAppOpenQuantity2
		      Return "CLICK_APP_OPEN_QUANTITY_2"
		    Case ColumnsEnum.ViewAppOpenQuantity2
		      Return "VIEW_APP_OPEN_QUANTITY_2"
		    Case ColumnsEnum.TotalEngagementAppOpen
		      Return "TOTAL_ENGAGEMENT_APP_OPEN"
		    Case ColumnsEnum.TotalClickAppOpen
		      Return "TOTAL_CLICK_APP_OPEN"
		    Case ColumnsEnum.TotalViewAppOpen
		      Return "TOTAL_VIEW_APP_OPEN"
		    Case ColumnsEnum.TotalEngagementAppOpenValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalEngagementAppOpenValueInDollar
		      Return "TOTAL_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalClickAppOpenValueInMicroDollar
		      Return "TOTAL_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalClickAppOpenValueInDollar
		      Return "TOTAL_CLICK_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalViewAppOpenValueInMicroDollar
		      Return "TOTAL_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalViewAppOpenValueInDollar
		      Return "TOTAL_VIEW_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalEngagementAppOpenQuantity
		      Return "TOTAL_ENGAGEMENT_APP_OPEN_QUANTITY"
		    Case ColumnsEnum.TotalClickAppOpenQuantity
		      Return "TOTAL_CLICK_APP_OPEN_QUANTITY"
		    Case ColumnsEnum.TotalViewAppOpenQuantity
		      Return "TOTAL_VIEW_APP_OPEN_QUANTITY"
		    Case ColumnsEnum.TotalAppOpen
		      Return "TOTAL_APP_OPEN"
		    Case ColumnsEnum.TotalAppOpenValueInMicroDollar
		      Return "TOTAL_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageAppOpenValueInMicroDollar
		      Return "AVERAGE_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.AverageAppOpenValueInMicroUsDollar
		      Return "AVERAGE_APP_OPEN_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalAppOpenValueInMicroUsDollar
		      Return "TOTAL_APP_OPEN_VALUE_IN_MICRO_US_DOLLAR"
		    Case ColumnsEnum.TotalAppOpenQuantity
		      Return "TOTAL_APP_OPEN_QUANTITY"
		    Case ColumnsEnum.TotalAppOpenValueInDollar
		      Return "TOTAL_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.AppOpenCostPerAction
		      Return "APP_OPEN_COST_PER_ACTION"
		    Case ColumnsEnum.AppOpenCostPerActionInUsDollar
		      Return "APP_OPEN_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ColumnsEnum.AppOpenRoas
		      Return "APP_OPEN_ROAS"
		    Case ColumnsEnum.TotalAppOpenConversionRate
		      Return "TOTAL_APP_OPEN_CONVERSION_RATE"
		    Case ColumnsEnum.WebAppOpenCostPerAction
		      Return "WEB_APP_OPEN_COST_PER_ACTION"
		    Case ColumnsEnum.WebAppOpenRoas
		      Return "WEB_APP_OPEN_ROAS"
		    Case ColumnsEnum.TotalWebAppOpen
		      Return "TOTAL_WEB_APP_OPEN"
		    Case ColumnsEnum.TotalWebAppOpenValueInMicroDollar
		      Return "TOTAL_WEB_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebAppOpenValueInDollar
		      Return "TOTAL_WEB_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebClickAppOpen
		      Return "TOTAL_WEB_CLICK_APP_OPEN"
		    Case ColumnsEnum.TotalWebClickAppOpenValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebClickAppOpenValueInDollar
		      Return "TOTAL_WEB_CLICK_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementAppOpen
		      Return "TOTAL_WEB_ENGAGEMENT_APP_OPEN"
		    Case ColumnsEnum.TotalWebEngagementAppOpenValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebEngagementAppOpenValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalWebViewAppOpen
		      Return "TOTAL_WEB_VIEW_APP_OPEN"
		    Case ColumnsEnum.TotalWebViewAppOpenValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalWebViewAppOpenValueInDollar
		      Return "TOTAL_WEB_VIEW_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.InappAppOpenCostPerAction
		      Return "INAPP_APP_OPEN_COST_PER_ACTION"
		    Case ColumnsEnum.InappAppOpenRoas
		      Return "INAPP_APP_OPEN_ROAS"
		    Case ColumnsEnum.TotalInappAppOpen
		      Return "TOTAL_INAPP_APP_OPEN"
		    Case ColumnsEnum.TotalInappAppOpenValueInMicroDollar
		      Return "TOTAL_INAPP_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappAppOpenValueInDollar
		      Return "TOTAL_INAPP_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappClickAppOpen
		      Return "TOTAL_INAPP_CLICK_APP_OPEN"
		    Case ColumnsEnum.TotalInappClickAppOpenValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappClickAppOpenValueInDollar
		      Return "TOTAL_INAPP_CLICK_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementAppOpen
		      Return "TOTAL_INAPP_ENGAGEMENT_APP_OPEN"
		    Case ColumnsEnum.TotalInappEngagementAppOpenValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappEngagementAppOpenValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalInappViewAppOpen
		      Return "TOTAL_INAPP_VIEW_APP_OPEN"
		    Case ColumnsEnum.TotalInappViewAppOpenValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalInappViewAppOpenValueInDollar
		      Return "TOTAL_INAPP_VIEW_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.OfflineAppOpenCostPerAction
		      Return "OFFLINE_APP_OPEN_COST_PER_ACTION"
		    Case ColumnsEnum.OfflineAppOpenRoas
		      Return "OFFLINE_APP_OPEN_ROAS"
		    Case ColumnsEnum.TotalOfflineAppOpen
		      Return "TOTAL_OFFLINE_APP_OPEN"
		    Case ColumnsEnum.TotalOfflineAppOpenValueInMicroDollar
		      Return "TOTAL_OFFLINE_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineAppOpenValueInDollar
		      Return "TOTAL_OFFLINE_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickAppOpen
		      Return "TOTAL_OFFLINE_CLICK_APP_OPEN"
		    Case ColumnsEnum.TotalOfflineClickAppOpenValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineClickAppOpenValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementAppOpen
		      Return "TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN"
		    Case ColumnsEnum.TotalOfflineEngagementAppOpenValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineEngagementAppOpenValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewAppOpen
		      Return "TOTAL_OFFLINE_VIEW_APP_OPEN"
		    Case ColumnsEnum.TotalOfflineViewAppOpenValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ColumnsEnum.TotalOfflineViewAppOpenValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ColumnsEnum.TotalAppOpenConversionProductCountUnique
		      Return "TOTAL_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalWebAppOpenConversionProductCountUnique
		      Return "TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalInappAppOpenConversionProductCountUnique
		      Return "TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalOfflineAppOpenConversionProductCountUnique
		      Return "TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ColumnsEnum.TotalAppOpenConversionProductQuantity
		      Return "TOTAL_APP_OPEN_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalAppOpenConversionProductValue
		      Return "TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalAppOpenConversionProductValueInMicroUnits
		      Return "TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalAppOpenConversionProductValueInUsd
		      Return "TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalAppOpenConversionProductValueInMicroUsd
		      Return "TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalWebAppOpenConversionProductQuantity
		      Return "TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalWebAppOpenConversionProductValue
		      Return "TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalWebAppOpenConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalWebAppOpenConversionProductValueInUsd
		      Return "TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalWebAppOpenConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalInappAppOpenConversionProductQuantity
		      Return "TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalInappAppOpenConversionProductValue
		      Return "TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalInappAppOpenConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalInappAppOpenConversionProductValueInUsd
		      Return "TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalInappAppOpenConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ColumnsEnum.TotalOfflineAppOpenConversionProductQuantity
		      Return "TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_QUANTITY"
		    Case ColumnsEnum.TotalOfflineAppOpenConversionProductValue
		      Return "TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE"
		    Case ColumnsEnum.TotalOfflineAppOpenConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ColumnsEnum.TotalOfflineAppOpenConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ColumnsEnum.TotalOfflineAppOpenConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Conversion_report_time_typeEnumToString(value As Conversion_report_time_typeEnum) As String
		  Select Case value
		    
		    Case Conversion_report_time_typeEnum.TimeOfAdAction
		      Return "TIME_OF_AD_ACTION"
		    Case Conversion_report_time_typeEnum.TimeOfConversion
		      Return "TIME_OF_CONVERSION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Creation_sourceEnumToString(value As Creation_sourceEnum) As String
		  Select Case value
		    
		    Case Creation_sourceEnum.AdsApi
		      Return "ADS_API"
		    Case Creation_sourceEnum.AdsManagerReportingPage
		      Return "ADS_MANAGER_REPORTING_PAGE"
		    Case Creation_sourceEnum.AdsManagerReportBuilder
		      Return "ADS_MANAGER_REPORT_BUILDER"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Ingestion_sourcesEnumToString(value As Ingestion_sourcesEnum) As String
		  Select Case value
		    
		    Case Ingestion_sourcesEnum.Tag
		      Return "TAG"
		    Case Ingestion_sourcesEnum.Mmp
		      Return "MMP"
		    Case Ingestion_sourcesEnum.FileUpload
		      Return "FILE_UPLOAD"
		    Case Ingestion_sourcesEnum.ConversionsApi
		      Return "CONVERSIONS_API"
		    Case Ingestion_sourcesEnum.Native
		      Return "NATIVE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.Unspecified
		      Return "UNSPECIFIED"
		    Case TypeEnum.Bulk
		      Return "BULK"
		    Case TypeEnum.Overview
		      Return "OVERVIEW"
		    Case TypeEnum.Table
		      Return "TABLE"
		    
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
			Name="ad_account_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ad_account_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="click_window_days"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="custom_column_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="date_range"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TemplateResponseDateRange"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="engagement_window_days"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="filters_json"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="granularity"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Granularity"
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
			Name="is_deleted"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_owned_by_user"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_scheduled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="report_end_relative_days_in_past"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="report_format"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="DataOutputFormat"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="report_level"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MetricsReportingLevel"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="report_start_relative_days_in_past"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="updated_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="user_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="view_window_days"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


