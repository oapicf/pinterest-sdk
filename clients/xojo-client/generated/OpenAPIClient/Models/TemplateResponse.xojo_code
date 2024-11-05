#tag Class
Protected Class TemplateResponse

	#tag Property, Flags = &h0
		#tag Note
			Template ID
		#tag EndNote
		id As Xoson.O.OptionalString
	#tag EndProperty


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
			ID of the user who created the template
		#tag EndNote
		user_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Template Name
		#tag EndNote
		name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of days prior to the day the report will be delivered at which the report will start
		#tag EndNote
		report_start_relative_days_in_past As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of days prior to the day the report will be delivered at which the report will end
		#tag EndNote
		report_end_relative_days_in_past As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		date_range As OpenAPIClient.Models.TemplateResponseDateRange
	#tag EndProperty


	#tag Property, Flags = &h0
		report_level As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		report_format As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of columns to be included in the report
		#tag EndNote
		columns() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		granularity As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The length of the sliding window over which view conversions will be attributed
		#tag EndNote
		view_window_days As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The length of the sliding window over which click conversions will be attributed
		#tag EndNote
		click_window_days As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The length of the sliding window over which engagement conversions will be attributed
		#tag EndNote
		engagement_window_days As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Conversion report time type
		#tag EndNote
		conversion_report_time_type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:<br> "field": The column name<br> "operator": The operator. Allowed operators: ["=", "!=", "in", "not_in", "~", ">", "<", "contains_substring"]<br> "value": A single value or a list of values
		#tag EndNote
		filters_json As Xoson.O.OptionalString
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
			The surface used to create this template
		#tag EndNote
		creation_source As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A boolean that indicates if the template has been deleted
		#tag EndNote
		is_deleted As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Time of last update in seconds since Unix epoch
		#tag EndNote
		updated_time As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of custom column IDs
		#tag EndNote
		custom_column_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Reporting template type
		#tag EndNote
		type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The filter on the conversion ingestion source method for conversion metrics
		#tag EndNote
		ingestion_sources() As String
	#tag EndProperty


    #tag Enum, Name = ColumnsEnum, Type = Integer, Flags = &h0
        
        SpendInMicroDollar
        SpendInMicroUsDollar
        BonusSpendInMicroDollar
        BonusSpendInDollar
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
        ItemId
        ProductItemId
        InternalProductItemId
        InternalProductItemIdStr
        ProductItemName
        ProductItemImageUrl
        ProductItemPrice
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
        Video3secViews1
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
        VideoAvgWatchtime1
        VideoMrcViews1
        VideoViewRate1
        Video3secViews2
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
        StandardAdFeedItemId
        IsStandardFeedAd
        TargetingGender
        TargetingCreativeType
        TargetingCountry
        TargetingLocation
        TargetingApptype
        TargetingLocationCode
        TargetingMediaType
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
        
    #tag EndEnum

    #tag Enum, Name = Conversion_report_time_typeEnum, Type = Integer, Flags = &h0
        
        AdAction
        Conversion
        
    #tag EndEnum

    #tag Enum, Name = Creation_sourceEnum, Type = Integer, Flags = &h0
        
        Api
        ManagerReportingPage
        ManagerReportBuilder
        
    #tag EndEnum

    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        Unspecified
        Bulk
        Overview
        Table
        
    #tag EndEnum

    #tag Enum, Name = Ingestion_sourcesEnum, Type = Integer, Flags = &h0
        
        Tag
        Mmp
        FileUpload
        ConversionsApi
        Native
        
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
		    Case ColumnsEnum.Video3secViews1
		      Return "VIDEO_3SEC_VIEWS_1"
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
		    Case ColumnsEnum.VideoAvgWatchtime1
		      Return "VIDEO_AVG_WATCHTIME_1"
		    Case ColumnsEnum.VideoMrcViews1
		      Return "VIDEO_MRC_VIEWS_1"
		    Case ColumnsEnum.VideoViewRate1
		      Return "VIDEO_VIEW_RATE_1"
		    Case ColumnsEnum.Video3secViews2
		      Return "VIDEO_3SEC_VIEWS_2"
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
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Conversion_report_time_typeEnumToString(value As Conversion_report_time_typeEnum) As String
		  Select Case value
		    
		    Case Conversion_report_time_typeEnum.AdAction
		      Return "TIME_OF_AD_ACTION"
		    Case Conversion_report_time_typeEnum.Conversion
		      Return "TIME_OF_CONVERSION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Creation_sourceEnumToString(value As Creation_sourceEnum) As String
		  Select Case value
		    
		    Case Creation_sourceEnum.Api
		      Return "ADS_API"
		    Case Creation_sourceEnum.ManagerReportingPage
		      Return "ADS_MANAGER_REPORTING_PAGE"
		    Case Creation_sourceEnum.ManagerReportBuilder
		      Return "ADS_MANAGER_REPORT_BUILDER"
		    
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="user_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="report_start_relative_days_in_past"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
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
			Name="date_range"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TemplateResponseDateRange"
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
			Name="report_format"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="DataOutputFormat"
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
			Name="view_window_days"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
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
			Name="is_deleted"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
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
			Name="custom_column_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


