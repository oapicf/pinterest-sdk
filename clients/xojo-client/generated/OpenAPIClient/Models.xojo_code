#tag Module
Protected Module Models
	#tag Method, Flags = &h21
		Protected Function ActionTypeToString(value As ActionType) As String
		  Select Case value
		    Case ActionType.Clickthrough
		      Return "CLICKTHROUGH"
		    Case ActionType.Impression
		      Return "IMPRESSION"
		    Case ActionType.VideoV50Mrc
		      Return "VIDEO_V_50_MRC"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdAccountEntityTypeToString(value As AdAccountEntityType) As String
		  Select Case value
		    Case AdAccountEntityType.Advertiser
		      Return "ADVERTISER"
		    Case AdAccountEntityType.Campaign
		      Return "CAMPAIGN"
		    Case AdAccountEntityType.AdGroup
		      Return "AD_GROUP"
		    Case AdAccountEntityType.Ad
		      Return "AD"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdAdsAnalyticsAsyncTargetingTypesToString(value As AdAdsAnalyticsAsyncTargetingTypes) As String
		  Select Case value
		    Case AdAdsAnalyticsAsyncTargetingTypes.Keyword
		      Return "KEYWORD"
		    Case AdAdsAnalyticsAsyncTargetingTypes.Apptype
		      Return "APPTYPE"
		    Case AdAdsAnalyticsAsyncTargetingTypes.Gender
		      Return "GENDER"
		    Case AdAdsAnalyticsAsyncTargetingTypes.Location
		      Return "LOCATION"
		    Case AdAdsAnalyticsAsyncTargetingTypes.Placement
		      Return "PLACEMENT"
		    Case AdAdsAnalyticsAsyncTargetingTypes.Country
		      Return "COUNTRY"
		    Case AdAdsAnalyticsAsyncTargetingTypes.TargetedInterest
		      Return "TARGETED_INTEREST"
		    Case AdAdsAnalyticsAsyncTargetingTypes.PinnerInterest
		      Return "PINNER_INTEREST"
		    Case AdAdsAnalyticsAsyncTargetingTypes.AudienceInclude
		      Return "AUDIENCE_INCLUDE"
		    Case AdAdsAnalyticsAsyncTargetingTypes.Geo
		      Return "GEO"
		    Case AdAdsAnalyticsAsyncTargetingTypes.AgeBucket
		      Return "AGE_BUCKET"
		    Case AdAdsAnalyticsAsyncTargetingTypes.Region
		      Return "REGION"
		    Case AdAdsAnalyticsAsyncTargetingTypes.MediaType
		      Return "MEDIA_TYPE"
		    Case AdAdsAnalyticsAsyncTargetingTypes.AgeBucketAndGender
		      Return "AGE_BUCKET_AND_GENDER"
		    Case AdAdsAnalyticsAsyncTargetingTypes.AudienceMultiplier
		      Return "AUDIENCE_MULTIPLIER"
		    Case AdAdsAnalyticsAsyncTargetingTypes.CreativeEnhancements
		      Return "CREATIVE_ENHANCEMENTS"
		    Case AdAdsAnalyticsAsyncTargetingTypes.LocalAdsStoreCode
		      Return "LOCAL_ADS_STORE_CODE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdCollectionsHeaderTypeToString(value As AdCollectionsHeaderType) As String
		  Select Case value
		    Case AdCollectionsHeaderType.ShopThisCollection
		      Return "SHOP_THIS_COLLECTION"
		    Case AdCollectionsHeaderType.ExploreThisCollection
		      Return "EXPLORE_THIS_COLLECTION"
		    Case AdCollectionsHeaderType.NoHeader
		      Return "NO_HEADER"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdDisapprovalReasonsToString(value As AdDisapprovalReasons) As String
		  Select Case value
		    Case AdDisapprovalReasons.Hashtags
		      Return "HASHTAGS"
		    Case AdDisapprovalReasons.PromotionsAndPrices
		      Return "PROMOTIONS_AND_PRICES"
		    Case AdDisapprovalReasons.Targeting
		      Return "TARGETING"
		    Case AdDisapprovalReasons.LandingPage
		      Return "LANDING_PAGE"
		    Case AdDisapprovalReasons.CapsAndSymbols
		      Return "CAPS_AND_SYMBOLS"
		    Case AdDisapprovalReasons.Shocking
		      Return "SHOCKING"
		    Case AdDisapprovalReasons.WeightLoss
		      Return "WEIGHT_LOSS"
		    Case AdDisapprovalReasons.ProhibitedProduct
		      Return "PROHIBITED_PRODUCT"
		    Case AdDisapprovalReasons.Authenticity
		      Return "AUTHENTICITY"
		    Case AdDisapprovalReasons.Nudity
		      Return "NUDITY"
		    Case AdDisapprovalReasons.ConfusingDesign
		      Return "CONFUSING_DESIGN"
		    Case AdDisapprovalReasons.Urgency
		      Return "URGENCY"
		    Case AdDisapprovalReasons.Ratings
		      Return "RATINGS"
		    Case AdDisapprovalReasons.App
		      Return "APP"
		    Case AdDisapprovalReasons.Alcohol
		      Return "ALCOHOL"
		    Case AdDisapprovalReasons.Contests
		      Return "CONTESTS"
		    Case AdDisapprovalReasons.Political
		      Return "POLITICAL"
		    Case AdDisapprovalReasons.Other
		      Return "OTHER"
		    Case AdDisapprovalReasons.Image
		      Return "IMAGE"
		    Case AdDisapprovalReasons.Nar
		      Return "NAR"
		    Case AdDisapprovalReasons.Inconsistent
		      Return "INCONSISTENT"
		    Case AdDisapprovalReasons.Clickbait
		      Return "CLICKBAIT"
		    Case AdDisapprovalReasons.NoDescription
		      Return "NO_DESCRIPTION"
		    Case AdDisapprovalReasons.LowQuality
		      Return "LOW_QUALITY"
		    Case AdDisapprovalReasons.ExaggeratedClaims
		      Return "EXAGGERATED_CLAIMS"
		    Case AdDisapprovalReasons.PinterestBrand
		      Return "PINTEREST_BRAND"
		    Case AdDisapprovalReasons.AlcoholNoSale
		      Return "ALCOHOL_NO_SALE"
		    Case AdDisapprovalReasons.LandingPageSpeed
		      Return "LANDING_PAGE_SPEED"
		    Case AdDisapprovalReasons.LandingPageHardwall
		      Return "LANDING_PAGE_HARDWALL"
		    Case AdDisapprovalReasons.LandingPageBroken
		      Return "LANDING_PAGE_BROKEN"
		    Case AdDisapprovalReasons.LandingPageQuality
		      Return "LANDING_PAGE_QUALITY"
		    Case AdDisapprovalReasons.OutOfStock
		      Return "OUT_OF_STOCK"
		    Case AdDisapprovalReasons.ImageLowQuality
		      Return "IMAGE_LOW_QUALITY"
		    Case AdDisapprovalReasons.ImageBusy
		      Return "IMAGE_BUSY"
		    Case AdDisapprovalReasons.ImagePoorlyEdited
		      Return "IMAGE_POORLY_EDITED"
		    Case AdDisapprovalReasons.ImageBeforeAfter
		      Return "IMAGE_BEFORE_AFTER"
		    Case AdDisapprovalReasons.Ugc
		      Return "UGC"
		    Case AdDisapprovalReasons.FakeButtons
		      Return "FAKE_BUTTONS"
		    Case AdDisapprovalReasons.Weapons
		      Return "WEAPONS"
		    Case AdDisapprovalReasons.Sensitive
		      Return "SENSITIVE"
		    Case AdDisapprovalReasons.UnacceptableBusiness
		      Return "UNACCEPTABLE_BUSINESS"
		    Case AdDisapprovalReasons.SuspiciousClaims
		      Return "SUSPICIOUS_CLAIMS"
		    Case AdDisapprovalReasons.Pharma
		      Return "PHARMA"
		    Case AdDisapprovalReasons.SuspiciousSupplements
		      Return "SUSPICIOUS_SUPPLEMENTS"
		    Case AdDisapprovalReasons.IllegalRecreationalDrug
		      Return "ILLEGAL_RECREATIONAL_DRUG"
		    Case AdDisapprovalReasons.LowQualityLandingPage
		      Return "LOW_QUALITY_LANDING_PAGE"
		    Case AdDisapprovalReasons.RestrictedHealthcare
		      Return "RESTRICTED_HEALTHCARE"
		    Case AdDisapprovalReasons.InconsistentLangFr
		      Return "INCONSISTENT_LANG_FR"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdGroupAudienceSizingCreativeTypesToString(value As AdGroupAudienceSizingCreativeTypes) As String
		  Select Case value
		    Case AdGroupAudienceSizingCreativeTypes.Regular
		      Return "REGULAR"
		    Case AdGroupAudienceSizingCreativeTypes.Video
		      Return "VIDEO"
		    Case AdGroupAudienceSizingCreativeTypes.Shopping
		      Return "SHOPPING"
		    Case AdGroupAudienceSizingCreativeTypes.Carousel
		      Return "CAROUSEL"
		    Case AdGroupAudienceSizingCreativeTypes.MaxVideo
		      Return "MAX_VIDEO"
		    Case AdGroupAudienceSizingCreativeTypes.ShopThePin
		      Return "SHOP_THE_PIN"
		    Case AdGroupAudienceSizingCreativeTypes.Collection
		      Return "COLLECTION"
		    Case AdGroupAudienceSizingCreativeTypes.Idea
		      Return "IDEA"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdGroupSummaryStatusToString(value As AdGroupSummaryStatus) As String
		  Select Case value
		    Case AdGroupSummaryStatus.Running
		      Return "RUNNING"
		    Case AdGroupSummaryStatus.Paused
		      Return "PAUSED"
		    Case AdGroupSummaryStatus.NotStarted
		      Return "NOT_STARTED"
		    Case AdGroupSummaryStatus.Completed
		      Return "COMPLETED"
		    Case AdGroupSummaryStatus.AdvertiserDisabled
		      Return "ADVERTISER_DISABLED"
		    Case AdGroupSummaryStatus.Archived
		      Return "ARCHIVED"
		    Case AdGroupSummaryStatus.Draft
		      Return "DRAFT"
		    Case AdGroupSummaryStatus.DeletedDraft
		      Return "DELETED_DRAFT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdPinPreviewCreativeTypeToString(value As AdPinPreviewCreativeType) As String
		  Select Case value
		    Case AdPinPreviewCreativeType.Shopping
		      Return "SHOPPING"
		    Case AdPinPreviewCreativeType.Collection
		      Return "COLLECTION"
		    Case AdPinPreviewCreativeType.MaxVideo
		      Return "MAX_VIDEO"
		    Case AdPinPreviewCreativeType.MaxWidthVideoCollection
		      Return "MAX_WIDTH_VIDEO_COLLECTION"
		    Case AdPinPreviewCreativeType.MaxWidthRegularCollection
		      Return "MAX_WIDTH_REGULAR_COLLECTION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdReviewStatusToString(value As AdReviewStatus) As String
		  Select Case value
		    Case AdReviewStatus.Other
		      Return "OTHER"
		    Case AdReviewStatus.Pending
		      Return "PENDING"
		    Case AdReviewStatus.Rejected
		      Return "REJECTED"
		    Case AdReviewStatus.Approved
		      Return "APPROVED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdShoppingPreviewCreativeTypeToString(value As AdShoppingPreviewCreativeType) As String
		  Select Case value
		    Case AdShoppingPreviewCreativeType.Shopping
		      Return "SHOPPING"
		    Case AdShoppingPreviewCreativeType.Collection
		      Return "COLLECTION"
		    Case AdShoppingPreviewCreativeType.Carousel
		      Return "CAROUSEL"
		    Case AdShoppingPreviewCreativeType.MaxWidthCollection
		      Return "MAX_WIDTH_COLLECTION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdeColumnTypeToString(value As AdeColumnType) As String
		  Select Case value
		    Case AdeColumnType.AdeCostPerAction
		      Return "ADE_COST_PER_ACTION"
		    Case AdeColumnType.AdeRoas
		      Return "ADE_ROAS"
		    Case AdeColumnType.AdeTotalConversions
		      Return "ADE_TOTAL_CONVERSIONS"
		    Case AdeColumnType.AdeTotalValueInMicroDollar
		      Return "ADE_TOTAL_VALUE_IN_MICRO_DOLLAR"
		    Case AdeColumnType.AdeAverageValueInMicroDollar
		      Return "ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR"
		    Case AdeColumnType.AdeTotalClick
		      Return "ADE_TOTAL_CLICK"
		    Case AdeColumnType.AdeTotalClickValueInMicroDollar
		      Return "ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR"
		    Case AdeColumnType.AdeTotalView
		      Return "ADE_TOTAL_VIEW"
		    Case AdeColumnType.AdeTotalViewValueInMicroDollar
		      Return "ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR"
		    Case AdeColumnType.AdeTotalConversionRate
		      Return "ADE_TOTAL_CONVERSION_RATE"
		    Case AdeColumnType.AdeWebCostPerAction
		      Return "ADE_WEB_COST_PER_ACTION"
		    Case AdeColumnType.AdeWebRoas
		      Return "ADE_WEB_ROAS"
		    Case AdeColumnType.AdeTotalWebConversions
		      Return "ADE_TOTAL_WEB_CONVERSIONS"
		    Case AdeColumnType.AdeTotalWebValueInMicroDollar
		      Return "ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR"
		    Case AdeColumnType.AdeTotalWebClick
		      Return "ADE_TOTAL_WEB_CLICK"
		    Case AdeColumnType.AdeTotalWebClickValueInMicroDollar
		      Return "ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR"
		    Case AdeColumnType.AdeTotalWebView
		      Return "ADE_TOTAL_WEB_VIEW"
		    Case AdeColumnType.AdeTotalWebViewValueInMicroDollar
		      Return "ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR"
		    Case AdeColumnType.AdeInappCostPerAction
		      Return "ADE_INAPP_COST_PER_ACTION"
		    Case AdeColumnType.AdeInappRoas
		      Return "ADE_INAPP_ROAS"
		    Case AdeColumnType.AdeTotalInappConversions
		      Return "ADE_TOTAL_INAPP_CONVERSIONS"
		    Case AdeColumnType.AdeTotalInappValueInMicroDollar
		      Return "ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR"
		    Case AdeColumnType.AdeTotalInappClick
		      Return "ADE_TOTAL_INAPP_CLICK"
		    Case AdeColumnType.AdeTotalInappClickValueInMicroDollar
		      Return "ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR"
		    Case AdeColumnType.AdeTotalInappView
		      Return "ADE_TOTAL_INAPP_VIEW"
		    Case AdeColumnType.AdeTotalInappViewValueInMicroDollar
		      Return "ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR"
		    Case AdeColumnType.AdeOfflineCostPerAction
		      Return "ADE_OFFLINE_COST_PER_ACTION"
		    Case AdeColumnType.AdeOfflineRoas
		      Return "ADE_OFFLINE_ROAS"
		    Case AdeColumnType.AdeTotalOfflineConversions
		      Return "ADE_TOTAL_OFFLINE_CONVERSIONS"
		    Case AdeColumnType.AdeTotalOfflineValueInMicroDollar
		      Return "ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR"
		    Case AdeColumnType.AdeTotalOfflineClick
		      Return "ADE_TOTAL_OFFLINE_CLICK"
		    Case AdeColumnType.AdeTotalOfflineClickValueInMicroDollar
		      Return "ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR"
		    Case AdeColumnType.AdeTotalOfflineView
		      Return "ADE_TOTAL_OFFLINE_VIEW"
		    Case AdeColumnType.AdeTotalOfflineViewValueInMicroDollar
		      Return "ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR"
		    Case AdeColumnType.AdeTotalConversionProductQuantity
		      Return "ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY"
		    Case AdeColumnType.AdeTotalConversionProductValue
		      Return "ADE_TOTAL_CONVERSION_PRODUCT_VALUE"
		    Case AdeColumnType.AdeTotalConversionProductValueInMicroUnits
		      Return "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case AdeColumnType.AdeTotalConversionProductValueInUsd
		      Return "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case AdeColumnType.AdeTotalConversionProductValueInMicroUsd
		      Return "ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case AdeColumnType.AdeTotalWebConversionProductQuantity
		      Return "ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY"
		    Case AdeColumnType.AdeTotalWebConversionProductValue
		      Return "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE"
		    Case AdeColumnType.AdeTotalWebConversionProductValueInMicroUnits
		      Return "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case AdeColumnType.AdeTotalWebConversionProductValueInUsd
		      Return "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case AdeColumnType.AdeTotalWebConversionProductValueInMicroUsd
		      Return "ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case AdeColumnType.AdeTotalInappConversionProductQuantity
		      Return "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY"
		    Case AdeColumnType.AdeTotalInappConversionProductValue
		      Return "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE"
		    Case AdeColumnType.AdeTotalInappConversionProductValueInMicroUnits
		      Return "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case AdeColumnType.AdeTotalInappConversionProductValueInUsd
		      Return "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case AdeColumnType.AdeTotalInappConversionProductValueInMicroUsd
		      Return "ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case AdeColumnType.AdeTotalOfflineConversionProductQuantity
		      Return "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY"
		    Case AdeColumnType.AdeTotalOfflineConversionProductValue
		      Return "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE"
		    Case AdeColumnType.AdeTotalOfflineConversionProductValueInMicroUnits
		      Return "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case AdeColumnType.AdeTotalOfflineConversionProductValueInUsd
		      Return "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case AdeColumnType.AdeTotalOfflineConversionProductValueInMicroUsd
		      Return "ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdgroupPlacementGroupTypeToString(value As AdgroupPlacementGroupType) As String
		  Select Case value
		    Case AdgroupPlacementGroupType.All
		      Return "ALL"
		    Case AdgroupPlacementGroupType.Search
		      Return "SEARCH"
		    Case AdgroupPlacementGroupType.Browse
		      Return "BROWSE"
		    Case AdgroupPlacementGroupType.Other
		      Return "OTHER"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdgroupTrackingFeatureTypeToString(value As AdgroupTrackingFeatureType) As String
		  Select Case value
		    Case AdgroupTrackingFeatureType.Trends
		      Return "TRENDS"
		    Case AdgroupTrackingFeatureType.CloneMeta
		      Return "CLONE_META"
		    Case AdgroupTrackingFeatureType.BulkEditor
		      Return "BULK_EDITOR"
		    Case AdgroupTrackingFeatureType.AdRotation
		      Return "AD_ROTATION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdsAnalyticsAccountTargetingTypeToString(value As AdsAnalyticsAccountTargetingType) As String
		  Select Case value
		    Case AdsAnalyticsAccountTargetingType.Keyword
		      Return "KEYWORD"
		    Case AdsAnalyticsAccountTargetingType.Apptype
		      Return "APPTYPE"
		    Case AdsAnalyticsAccountTargetingType.Gender
		      Return "GENDER"
		    Case AdsAnalyticsAccountTargetingType.Location
		      Return "LOCATION"
		    Case AdsAnalyticsAccountTargetingType.Placement
		      Return "PLACEMENT"
		    Case AdsAnalyticsAccountTargetingType.Country
		      Return "COUNTRY"
		    Case AdsAnalyticsAccountTargetingType.TargetedInterest
		      Return "TARGETED_INTEREST"
		    Case AdsAnalyticsAccountTargetingType.PinnerInterest
		      Return "PINNER_INTEREST"
		    Case AdsAnalyticsAccountTargetingType.AudienceInclude
		      Return "AUDIENCE_INCLUDE"
		    Case AdsAnalyticsAccountTargetingType.Geo
		      Return "GEO"
		    Case AdsAnalyticsAccountTargetingType.AgeBucket
		      Return "AGE_BUCKET"
		    Case AdsAnalyticsAccountTargetingType.Region
		      Return "REGION"
		    Case AdsAnalyticsAccountTargetingType.AgeBucketAndGender
		      Return "AGE_BUCKET_AND_GENDER"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdsAnalyticsAdGroupTargetingTypeToString(value As AdsAnalyticsAdGroupTargetingType) As String
		  Select Case value
		    Case AdsAnalyticsAdGroupTargetingType.Keyword
		      Return "KEYWORD"
		    Case AdsAnalyticsAdGroupTargetingType.Apptype
		      Return "APPTYPE"
		    Case AdsAnalyticsAdGroupTargetingType.Gender
		      Return "GENDER"
		    Case AdsAnalyticsAdGroupTargetingType.Location
		      Return "LOCATION"
		    Case AdsAnalyticsAdGroupTargetingType.Placement
		      Return "PLACEMENT"
		    Case AdsAnalyticsAdGroupTargetingType.Country
		      Return "COUNTRY"
		    Case AdsAnalyticsAdGroupTargetingType.TargetedInterest
		      Return "TARGETED_INTEREST"
		    Case AdsAnalyticsAdGroupTargetingType.PinnerInterest
		      Return "PINNER_INTEREST"
		    Case AdsAnalyticsAdGroupTargetingType.AudienceInclude
		      Return "AUDIENCE_INCLUDE"
		    Case AdsAnalyticsAdGroupTargetingType.Geo
		      Return "GEO"
		    Case AdsAnalyticsAdGroupTargetingType.AgeBucket
		      Return "AGE_BUCKET"
		    Case AdsAnalyticsAdGroupTargetingType.Region
		      Return "REGION"
		    Case AdsAnalyticsAdGroupTargetingType.AgeBucketAndGender
		      Return "AGE_BUCKET_AND_GENDER"
		    Case AdsAnalyticsAdGroupTargetingType.CreativeEnhancements
		      Return "CREATIVE_ENHANCEMENTS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdsAnalyticsAdTargetingTypeToString(value As AdsAnalyticsAdTargetingType) As String
		  Select Case value
		    Case AdsAnalyticsAdTargetingType.Keyword
		      Return "KEYWORD"
		    Case AdsAnalyticsAdTargetingType.Apptype
		      Return "APPTYPE"
		    Case AdsAnalyticsAdTargetingType.Gender
		      Return "GENDER"
		    Case AdsAnalyticsAdTargetingType.Location
		      Return "LOCATION"
		    Case AdsAnalyticsAdTargetingType.Placement
		      Return "PLACEMENT"
		    Case AdsAnalyticsAdTargetingType.Country
		      Return "COUNTRY"
		    Case AdsAnalyticsAdTargetingType.TargetedInterest
		      Return "TARGETED_INTEREST"
		    Case AdsAnalyticsAdTargetingType.PinnerInterest
		      Return "PINNER_INTEREST"
		    Case AdsAnalyticsAdTargetingType.AudienceInclude
		      Return "AUDIENCE_INCLUDE"
		    Case AdsAnalyticsAdTargetingType.Geo
		      Return "GEO"
		    Case AdsAnalyticsAdTargetingType.AgeBucket
		      Return "AGE_BUCKET"
		    Case AdsAnalyticsAdTargetingType.Region
		      Return "REGION"
		    Case AdsAnalyticsAdTargetingType.QuizResult
		      Return "QUIZ_RESULT"
		    Case AdsAnalyticsAdTargetingType.AgeBucketAndGender
		      Return "AGE_BUCKET_AND_GENDER"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdsAnalyticsCampaignTargetingTypeToString(value As AdsAnalyticsCampaignTargetingType) As String
		  Select Case value
		    Case AdsAnalyticsCampaignTargetingType.Keyword
		      Return "KEYWORD"
		    Case AdsAnalyticsCampaignTargetingType.Apptype
		      Return "APPTYPE"
		    Case AdsAnalyticsCampaignTargetingType.Gender
		      Return "GENDER"
		    Case AdsAnalyticsCampaignTargetingType.Location
		      Return "LOCATION"
		    Case AdsAnalyticsCampaignTargetingType.Placement
		      Return "PLACEMENT"
		    Case AdsAnalyticsCampaignTargetingType.Country
		      Return "COUNTRY"
		    Case AdsAnalyticsCampaignTargetingType.TargetedInterest
		      Return "TARGETED_INTEREST"
		    Case AdsAnalyticsCampaignTargetingType.PinnerInterest
		      Return "PINNER_INTEREST"
		    Case AdsAnalyticsCampaignTargetingType.AudienceInclude
		      Return "AUDIENCE_INCLUDE"
		    Case AdsAnalyticsCampaignTargetingType.Geo
		      Return "GEO"
		    Case AdsAnalyticsCampaignTargetingType.AgeBucket
		      Return "AGE_BUCKET"
		    Case AdsAnalyticsCampaignTargetingType.Region
		      Return "REGION"
		    Case AdsAnalyticsCampaignTargetingType.CreativeType
		      Return "CREATIVE_TYPE"
		    Case AdsAnalyticsCampaignTargetingType.AgeBucketAndGender
		      Return "AGE_BUCKET_AND_GENDER"
		    Case AdsAnalyticsCampaignTargetingType.AudienceMultiplier
		      Return "AUDIENCE_MULTIPLIER"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdsAnalyticsFilterColumnToString(value As AdsAnalyticsFilterColumn) As String
		  Select Case value
		    Case AdsAnalyticsFilterColumn.SpendInDollar
		      Return "SPEND_IN_DOLLAR"
		    Case AdsAnalyticsFilterColumn.TotalImpression
		      Return "TOTAL_IMPRESSION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdsAnalyticsFilterOperatorToString(value As AdsAnalyticsFilterOperator) As String
		  Select Case value
		    Case AdsAnalyticsFilterOperator.LessThan
		      Return "LESS_THAN"
		    Case AdsAnalyticsFilterOperator.GreaterThan
		      Return "GREATER_THAN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdsCreditDiscountTypeToString(value As AdsCreditDiscountType) As String
		  Select Case value
		    Case AdsCreditDiscountType.Coupon
		      Return "COUPON"
		    Case AdsCreditDiscountType.Credit
		      Return "CREDIT"
		    Case AdsCreditDiscountType.CouponApplied
		      Return "COUPON_APPLIED"
		    Case AdsCreditDiscountType.CreditApplied
		      Return "CREDIT_APPLIED"
		    Case AdsCreditDiscountType.MarketingOfferCredit
		      Return "MARKETING_OFFER_CREDIT"
		    Case AdsCreditDiscountType.MarketingOfferCreditApplied
		      Return "MARKETING_OFFER_CREDIT_APPLIED"
		    Case AdsCreditDiscountType.GoodwillCredit
		      Return "GOODWILL_CREDIT"
		    Case AdsCreditDiscountType.GoodwillCreditApplied
		      Return "GOODWILL_CREDIT_APPLIED"
		    Case AdsCreditDiscountType.InternalCredit
		      Return "INTERNAL_CREDIT"
		    Case AdsCreditDiscountType.InternalCreditApplied
		      Return "INTERNAL_CREDIT_APPLIED"
		    Case AdsCreditDiscountType.PrepaidCredit
		      Return "PREPAID_CREDIT"
		    Case AdsCreditDiscountType.PrepaidCreditApplied
		      Return "PREPAID_CREDIT_APPLIED"
		    Case AdsCreditDiscountType.SalesIncentiveCredit
		      Return "SALES_INCENTIVE_CREDIT"
		    Case AdsCreditDiscountType.SalesIncentiveCreditApplied
		      Return "SALES_INCENTIVE_CREDIT_APPLIED"
		    Case AdsCreditDiscountType.CreditExpired
		      Return "CREDIT_EXPIRED"
		    Case AdsCreditDiscountType.FutureCredit
		      Return "FUTURE_CREDIT"
		    Case AdsCreditDiscountType.ReferralCredit
		      Return "REFERRAL_CREDIT"
		    Case AdsCreditDiscountType.InvoiceSalesIncentiveCredit
		      Return "INVOICE_SALES_INCENTIVE_CREDIT"
		    Case AdsCreditDiscountType.InvoiceSalesIncentiveCreditApplied
		      Return "INVOICE_SALES_INCENTIVE_CREDIT_APPLIED"
		    Case AdsCreditDiscountType.PrepaidCreditRefund
		      Return "PREPAID_CREDIT_REFUND"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AdvertiserDefinedEventMappingTypeToString(value As AdvertiserDefinedEventMappingType) As String
		  Select Case value
		    Case AdvertiserDefinedEventMappingType.Signup
		      Return "SIGNUP"
		    Case AdvertiserDefinedEventMappingType.AddToCart
		      Return "ADD_TO_CART"
		    Case AdvertiserDefinedEventMappingType.Lead
		      Return "LEAD"
		    Case AdvertiserDefinedEventMappingType.Checkout
		      Return "CHECKOUT"
		    Case AdvertiserDefinedEventMappingType.Subscribe
		      Return "SUBSCRIBE"
		    Case AdvertiserDefinedEventMappingType.AddToWishlist
		      Return "ADD_TO_WISHLIST"
		    Case AdvertiserDefinedEventMappingType.AddPaymentInfo
		      Return "ADD_PAYMENT_INFO"
		    Case AdvertiserDefinedEventMappingType.InitiateCheckout
		      Return "INITIATE_CHECKOUT"
		    Case AdvertiserDefinedEventMappingType.Contact
		      Return "CONTACT"
		    Case AdvertiserDefinedEventMappingType.CustomizeProduct
		      Return "CUSTOMIZE_PRODUCT"
		    Case AdvertiserDefinedEventMappingType.FindLocation
		      Return "FIND_LOCATION"
		    Case AdvertiserDefinedEventMappingType.Schedule
		      Return "SCHEDULE"
		    Case AdvertiserDefinedEventMappingType.SubmitApplication
		      Return "SUBMIT_APPLICATION"
		    Case AdvertiserDefinedEventMappingType.StartTrial
		      Return "START_TRIAL"
		    Case AdvertiserDefinedEventMappingType.PageVisit
		      Return "PAGE_VISIT"
		    Case AdvertiserDefinedEventMappingType.ViewCategory
		      Return "VIEW_CATEGORY"
		    Case AdvertiserDefinedEventMappingType.ViewContent
		      Return "VIEW_CONTENT"
		    Case AdvertiserDefinedEventMappingType.Search
		      Return "SEARCH"
		    Case AdvertiserDefinedEventMappingType.WatchVideo
		      Return "WATCH_VIDEO"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AgeTrendsBucketToString(value As AgeTrendsBucket) As String
		  Select Case value
		    Case AgeTrendsBucket.Escaped1824
		      Return "18-24"
		    Case AgeTrendsBucket.Escaped2534
		      Return "25-34"
		    Case AgeTrendsBucket.Escaped3544
		      Return "35-44"
		    Case AgeTrendsBucket.Escaped4549
		      Return "45-49"
		    Case AgeTrendsBucket.Escaped5054
		      Return "50-54"
		    Case AgeTrendsBucket.Escaped5564
		      Return "55-64"
		    Case AgeTrendsBucket.Escaped65Plus
		      Return "65+"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AiDisclosureItemToString(value As AiDisclosureItem) As String
		  Select Case value
		    Case AiDisclosureItem.AiModified
		      Return "AI_MODIFIED"
		    Case AiDisclosureItem.SyntheticPerformer
		      Return "SYNTHETIC_PERFORMER"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AppsflyerPlatformToString(value As AppsflyerPlatform) As String
		  Select Case value
		    Case AppsflyerPlatform.Android
		      Return "android"
		    Case AppsflyerPlatform.Ios
		      Return "ios"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AssetGroupTypeToString(value As AssetGroupType) As String
		  Select Case value
		    Case AssetGroupType.Brand
		      Return "BRAND"
		    Case AssetGroupType.LocationOrLanguage
		      Return "LOCATION_OR_LANGUAGE"
		    Case AssetGroupType.ProductLine
		      Return "PRODUCT_LINE"
		    Case AssetGroupType.Other
		      Return "OTHER"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AssetPermissionTypeToString(value As AssetPermissionType) As String
		  Select Case value
		    Case AssetPermissionType.AggregatedPermission
		      Return "AGGREGATED_PERMISSION"
		    Case AssetPermissionType.DirectPermission
		      Return "DIRECT_PERMISSION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AssetSearchByToString(value As AssetSearchBy) As String
		  Select Case value
		    Case AssetSearchBy.Name
		      Return "NAME"
		    Case AssetSearchBy.Id
		      Return "ID"
		    Case AssetSearchBy.NameOrId
		      Return "NAME_OR_ID"
		    Case AssetSearchBy.OwnerName
		      Return "OWNER_NAME"
		    Case AssetSearchBy.NameOrOwner
		      Return "NAME_OR_OWNER"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AssetSortByToString(value As AssetSortBy) As String
		  Select Case value
		    Case AssetSortBy.Name
		      Return "NAME"
		    Case AssetSortBy.Id
		      Return "ID"
		    Case AssetSortBy.Permissions
		      Return "PERMISSIONS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AssetTypeResponseToString(value As AssetTypeResponse) As String
		  Select Case value
		    Case AssetTypeResponse.AdAccount
		      Return "AD_ACCOUNT"
		    Case AssetTypeResponse.Merchant
		      Return "MERCHANT"
		    Case AssetTypeResponse.Profile
		      Return "PROFILE"
		    Case AssetTypeResponse.AssetGroup
		      Return "ASSET_GROUP"
		    Case AssetTypeResponse.PinnerList
		      Return "PINNER_LIST"
		    Case AssetTypeResponse.ConversionTag
		      Return "CONVERSION_TAG"
		    Case AssetTypeResponse.Catalog
		      Return "CATALOG"
		    Case AssetTypeResponse.ConversionSegment
		      Return "CONVERSION_SEGMENT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AttributionActionTypeToString(value As AttributionActionType) As String
		  Select Case value
		    Case AttributionActionType.View
		      Return "view"
		    Case AttributionActionType.Click
		      Return "click"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AttributionMatchTypeToString(value As AttributionMatchType) As String
		  Select Case value
		    Case AttributionMatchType.P
		      Return "P"
		    Case AttributionMatchType.D
		      Return "D"
		    Case AttributionMatchType.Na
		      Return "NA"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AttributionModelToString(value As AttributionModel) As String
		  Select Case value
		    Case AttributionModel.FirstTouch
		      Return "first_touch"
		    Case AttributionModel.LastTouch
		      Return "last_touch"
		    Case AttributionModel.MultiTouch
		      Return "multi_touch"
		    Case AttributionModel.Mmm
		      Return "mmm"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AttributionScopeToString(value As AttributionScope) As String
		  Select Case value
		    Case AttributionScope.View
		      Return "view"
		    Case AttributionScope.Engagement
		      Return "engagement"
		    Case AttributionScope.Click
		      Return "click"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AudienceAccountTypeToString(value As AudienceAccountType) As String
		  Select Case value
		    Case AudienceAccountType.AdAccount
		      Return "AD_ACCOUNT"
		    Case AudienceAccountType.BusinessAccount
		      Return "BUSINESS_ACCOUNT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AudienceInsightTypeToString(value As AudienceInsightType) As String
		  Select Case value
		    Case AudienceInsightType.YourTotalAudience
		      Return "YOUR_TOTAL_AUDIENCE"
		    Case AudienceInsightType.YourEngagedAudience
		      Return "YOUR_ENGAGED_AUDIENCE"
		    Case AudienceInsightType.PinterestTotalAudience
		      Return "PINTEREST_TOTAL_AUDIENCE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AudienceObjectiveTypeToString(value As AudienceObjectiveType) As String
		  Select Case value
		    Case AudienceObjectiveType.Awareness
		      Return "AWARENESS"
		    Case AudienceObjectiveType.Consideration
		      Return "CONSIDERATION"
		    Case AudienceObjectiveType.WebConversion
		      Return "WEB_CONVERSION"
		    Case AudienceObjectiveType.CatalogSales
		      Return "CATALOG_SALES"
		    Case AudienceObjectiveType.VideoCompletion
		      Return "VIDEO_COMPLETION"
		    Case AudienceObjectiveType.Sales
		      Return "SALES"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AudienceOwnershipTypeToString(value As AudienceOwnershipType) As String
		  Select Case value
		    Case AudienceOwnershipType.Owned
		      Return "OWNED"
		    Case AudienceOwnershipType.Received
		      Return "RECEIVED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AudienceStatusToString(value As AudienceStatus) As String
		  Select Case value
		    Case AudienceStatus.Initializing
		      Return "INITIALIZING"
		    Case AudienceStatus.Ready
		      Return "READY"
		    Case AudienceStatus.TooSmall
		      Return "TOO_SMALL"
		    Case AudienceStatus.Eligible
		      Return "ELIGIBLE"
		    Case AudienceStatus.PersonasIneligibleSize
		      Return "PERSONAS_INELIGIBLE_SIZE"
		    Case AudienceStatus.PersonasInitializing
		      Return "PERSONAS_INITIALIZING"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AudienceTypeToString(value As AudienceType) As String
		  Select Case value
		    Case AudienceType.CustomerList
		      Return "CUSTOMER_LIST"
		    Case AudienceType.Visitor
		      Return "VISITOR"
		    Case AudienceType.Engagement
		      Return "ENGAGEMENT"
		    Case AudienceType.Actalike
		      Return "ACTALIKE"
		    Case AudienceType.Persona
		      Return "PERSONA"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AudienceUpdateOperationTypeToString(value As AudienceUpdateOperationType) As String
		  Select Case value
		    Case AudienceUpdateOperationType.Update
		      Return "UPDATE"
		    Case AudienceUpdateOperationType.Remove
		      Return "REMOVE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BasePreferredMediaTypeToString(value As BasePreferredMediaType) As String
		  Select Case value
		    Case BasePreferredMediaType.Video
		      Return "VIDEO"
		    Case BasePreferredMediaType.Image
		      Return "IMAGE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BatchOperationStatusToString(value As BatchOperationStatus) As String
		  Select Case value
		    Case BatchOperationStatus.Processing
		      Return "PROCESSING"
		    Case BatchOperationStatus.Completed
		      Return "COMPLETED"
		    Case BatchOperationStatus.Failed
		      Return "FAILED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BidFloorObjectiveTypeToString(value As BidFloorObjectiveType) As String
		  Select Case value
		    Case BidFloorObjectiveType.Awareness
		      Return "AWARENESS"
		    Case BidFloorObjectiveType.Consideration
		      Return "CONSIDERATION"
		    Case BidFloorObjectiveType.WebConversion
		      Return "WEB_CONVERSION"
		    Case BidFloorObjectiveType.CatalogSales
		      Return "CATALOG_SALES"
		    Case BidFloorObjectiveType.VideoCompletion
		      Return "VIDEO_COMPLETION"
		    Case BidFloorObjectiveType.Sales
		      Return "SALES"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BidStrategyTypeToString(value As BidStrategyType) As String
		  Select Case value
		    Case BidStrategyType.AutomaticBid
		      Return "AUTOMATIC_BID"
		    Case BidStrategyType.MaxBid
		      Return "MAX_BID"
		    Case BidStrategyType.TargetAvg
		      Return "TARGET_AVG"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BillingInvoiceDocumentTypeToString(value As BillingInvoiceDocumentType) As String
		  Select Case value
		    Case BillingInvoiceDocumentType.Invoice
		      Return "INVOICE"
		    Case BillingInvoiceDocumentType.CreditMemo
		      Return "CREDIT_MEMO"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BillingInvoiceSortFieldToString(value As BillingInvoiceSortField) As String
		  Select Case value
		    Case BillingInvoiceSortField.DueDate
		      Return "DUE_DATE"
		    Case BillingInvoiceSortField.BillingPeriod
		      Return "BILLING_PERIOD"
		    Case BillingInvoiceSortField.DocumentType
		      Return "DOCUMENT_TYPE"
		    Case BillingInvoiceSortField.TotalAmount
		      Return "TOTAL_AMOUNT"
		    Case BillingInvoiceSortField.InvoiceNumber
		      Return "INVOICE_NUMBER"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BillingInvoiceStatusToString(value As BillingInvoiceStatus) As String
		  Select Case value
		    Case BillingInvoiceStatus.Open
		      Return "OPEN"
		    Case BillingInvoiceStatus.Closed
		      Return "CLOSED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BillingProfileCardTypeToString(value As BillingProfileCardType) As String
		  Select Case value
		    Case BillingProfileCardType.Unknown
		      Return "UNKNOWN"
		    Case BillingProfileCardType.Visa
		      Return "VISA"
		    Case BillingProfileCardType.Mastercard
		      Return "MASTERCARD"
		    Case BillingProfileCardType.AmericanExpress
		      Return "AMERICAN_EXPRESS"
		    Case BillingProfileCardType.Discover
		      Return "DISCOVER"
		    Case BillingProfileCardType.Elo
		      Return "ELO"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BillingProfilePaymentMethodBrandToString(value As BillingProfilePaymentMethodBrand) As String
		  Select Case value
		    Case BillingProfilePaymentMethodBrand.Unknown
		      Return "UNKNOWN"
		    Case BillingProfilePaymentMethodBrand.Visa
		      Return "VISA"
		    Case BillingProfilePaymentMethodBrand.Mastercard
		      Return "MASTERCARD"
		    Case BillingProfilePaymentMethodBrand.AmericanExpress
		      Return "AMERICAN_EXPRESS"
		    Case BillingProfilePaymentMethodBrand.Discover
		      Return "DISCOVER"
		    Case BillingProfilePaymentMethodBrand.Sofort
		      Return "SOFORT"
		    Case BillingProfilePaymentMethodBrand.DinersClub
		      Return "DINERS_CLUB"
		    Case BillingProfilePaymentMethodBrand.Elo
		      Return "ELO"
		    Case BillingProfilePaymentMethodBrand.CarteBancaire
		      Return "CARTE_BANCAIRE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BillingProfileStatusToString(value As BillingProfileStatus) As String
		  Select Case value
		    Case BillingProfileStatus.Unspecified
		      Return "UNSPECIFIED"
		    Case BillingProfileStatus.Valid
		      Return "VALID"
		    Case BillingProfileStatus.Invalid
		      Return "INVALID"
		    Case BillingProfileStatus.Pending
		      Return "PENDING"
		    Case BillingProfileStatus.Deleted
		      Return "DELETED"
		    Case BillingProfileStatus.Secondary
		      Return "SECONDARY"
		    Case BillingProfileStatus.PendingSecondary
		      Return "PENDING_SECONDARY"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BillingTypeToString(value As BillingType) As String
		  Select Case value
		    Case BillingType.CreditCard
		      Return "CREDIT_CARD"
		    Case BillingType.Invoice
		      Return "INVOICE"
		    Case BillingType.Internal
		      Return "INTERNAL"
		    Case BillingType.Recurring
		      Return "RECURRING"
		    Case BillingType.Prepaid
		      Return "PREPAID"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BoardPrivacyToString(value As BoardPrivacy) As String
		  Select Case value
		    Case BoardPrivacy.Escapedpublic
		      Return "PUBLIC"
		    Case BoardPrivacy.Escapedprotected
		      Return "PROTECTED"
		    Case BoardPrivacy.Secret
		      Return "SECRET"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BoardPrivacyFilterToString(value As BoardPrivacyFilter) As String
		  Select Case value
		    Case BoardPrivacyFilter.All
		      Return "ALL"
		    Case BoardPrivacyFilter.Escapedpublic
		      Return "PUBLIC"
		    Case BoardPrivacyFilter.Escapedprotected
		      Return "PROTECTED"
		    Case BoardPrivacyFilter.Secret
		      Return "SECRET"
		    Case BoardPrivacyFilter.PublicAndSecret
		      Return "PUBLIC_AND_SECRET"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BoardUpdatePrivacyToString(value As BoardUpdatePrivacy) As String
		  Select Case value
		    Case BoardUpdatePrivacy.Escapedpublic
		      Return "PUBLIC"
		    Case BoardUpdatePrivacy.Secret
		      Return "SECRET"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BudgetDurationTypeToString(value As BudgetDurationType) As String
		  Select Case value
		    Case BudgetDurationType.FixedDaily
		      Return "FIXED_DAILY"
		    Case BudgetDurationType.FlexibleDaily
		      Return "FLEXIBLE_DAILY"
		    Case BudgetDurationType.Lifetime
		      Return "LIFETIME"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BudgetTypeToString(value As BudgetType) As String
		  Select Case value
		    Case BudgetType.Daily
		      Return "DAILY"
		    Case BudgetType.Lifetime
		      Return "LIFETIME"
		    Case BudgetType.CboAdgroup
		      Return "CBO_ADGROUP"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BulkEntityTypeToString(value As BulkEntityType) As String
		  Select Case value
		    Case BulkEntityType.Campaign
		      Return "CAMPAIGN"
		    Case BulkEntityType.AdGroup
		      Return "AD_GROUP"
		    Case BulkEntityType.ProductGroup
		      Return "PRODUCT_GROUP"
		    Case BulkEntityType.Ad
		      Return "AD"
		    Case BulkEntityType.Keyword
		      Return "KEYWORD"
		    Case BulkEntityType.Label
		      Return "LABEL"
		    Case BulkEntityType.Schedule
		      Return "SCHEDULE"
		    Case BulkEntityType.EntityHistory
		      Return "ENTITY_HISTORY"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BulkOutputFormatToString(value As BulkOutputFormat) As String
		  Select Case value
		    Case BulkOutputFormat.Csv
		      Return "CSV"
		    Case BulkOutputFormat.Json
		      Return "JSON"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BulkReportingJobStatusToString(value As BulkReportingJobStatus) As String
		  Select Case value
		    Case BulkReportingJobStatus.DoesNotExist
		      Return "DOES_NOT_EXIST"
		    Case BulkReportingJobStatus.Finished
		      Return "FINISHED"
		    Case BulkReportingJobStatus.InProgress
		      Return "IN_PROGRESS"
		    Case BulkReportingJobStatus.Expired
		      Return "EXPIRED"
		    Case BulkReportingJobStatus.Failed
		      Return "FAILED"
		    Case BulkReportingJobStatus.Cancelled
		      Return "CANCELLED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BulkRequestStatusToString(value As BulkRequestStatus) As String
		  Select Case value
		    Case BulkRequestStatus.Running
		      Return "RUNNING"
		    Case BulkRequestStatus.Succeeded
		      Return "SUCCEEDED"
		    Case BulkRequestStatus.Failed
		      Return "FAILED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BusinessAccessRoleToString(value As BusinessAccessRole) As String
		  Select Case value
		    Case BusinessAccessRole.Owner
		      Return "OWNER"
		    Case BusinessAccessRole.Admin
		      Return "ADMIN"
		    Case BusinessAccessRole.Analyst
		      Return "ANALYST"
		    Case BusinessAccessRole.SosReader
		      Return "SOS_READER"
		    Case BusinessAccessRole.FinanceManager
		      Return "FINANCE_MANAGER"
		    Case BusinessAccessRole.FinanceView
		      Return "FINANCE_VIEW"
		    Case BusinessAccessRole.FinanceEdit
		      Return "FINANCE_EDIT"
		    Case BusinessAccessRole.AudienceManager
		      Return "AUDIENCE_MANAGER"
		    Case BusinessAccessRole.CampaignManager
		      Return "CAMPAIGN_MANAGER"
		    Case BusinessAccessRole.CatalogsManager
		      Return "CATALOGS_MANAGER"
		    Case BusinessAccessRole.RestrictedOwner
		      Return "RESTRICTED_OWNER"
		    Case BusinessAccessRole.ProfileManager
		      Return "PROFILE_MANAGER"
		    Case BusinessAccessRole.ProfilePublisher
		      Return "PROFILE_PUBLISHER"
		    Case BusinessAccessRole.ResourcePinnerListOwner
		      Return "RESOURCE_PINNER_LIST_OWNER"
		    Case BusinessAccessRole.ResourcePinnerListReader
		      Return "RESOURCE_PINNER_LIST_READER"
		    Case BusinessAccessRole.BizPinnerListSharer
		      Return "BIZ_PINNER_LIST_SHARER"
		    Case BusinessAccessRole.ResourceConversionTagsReader
		      Return "RESOURCE_CONVERSION_TAGS_READER"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BusinessMemberSortByToString(value As BusinessMemberSortBy) As String
		  Select Case value
		    Case BusinessMemberSortBy.FullName
		      Return "FULL_NAME"
		    Case BusinessMemberSortBy.BusinessRoles
		      Return "BUSINESS_ROLES"
		    Case BusinessMemberSortBy.CreatedTime
		      Return "CREATED_TIME"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BusinessRoleForInviteToString(value As BusinessRoleForInvite) As String
		  Select Case value
		    Case BusinessRoleForInvite.Employee
		      Return "EMPLOYEE"
		    Case BusinessRoleForInvite.BizAdmin
		      Return "BIZ_ADMIN"
		    Case BusinessRoleForInvite.Partner
		      Return "PARTNER"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BusinessRoleForMembersToString(value As BusinessRoleForMembers) As String
		  Select Case value
		    Case BusinessRoleForMembers.Employee
		      Return "EMPLOYEE"
		    Case BusinessRoleForMembers.BizAdmin
		      Return "BIZ_ADMIN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function BusinessSearchByToString(value As BusinessSearchBy) As String
		  Select Case value
		    Case BusinessSearchBy.FullName
		      Return "FULL_NAME"
		    Case BusinessSearchBy.Username
		      Return "USERNAME"
		    Case BusinessSearchBy.BusinessId
		      Return "BUSINESS_ID"
		    Case BusinessSearchBy.Email
		      Return "EMAIL"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CampaignBidOptionsUpdateMaskItemsToString(value As CampaignBidOptionsUpdateMaskItems) As String
		  Select Case value
		    Case CampaignBidOptionsUpdateMaskItems.Audience
		      Return "AUDIENCE"
		    Case CampaignBidOptionsUpdateMaskItems.AppType
		      Return "APP_TYPE"
		    Case CampaignBidOptionsUpdateMaskItems.Placement
		      Return "PLACEMENT"
		    Case CampaignBidOptionsUpdateMaskItems.Gender
		      Return "GENDER"
		    Case CampaignBidOptionsUpdateMaskItems.AgeBucket
		      Return "AGE_BUCKET"
		    Case CampaignBidOptionsUpdateMaskItems.Frequency
		      Return "FREQUENCY"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CampaignObjectiveTypeToString(value As CampaignObjectiveType) As String
		  Select Case value
		    Case CampaignObjectiveType.Awareness
		      Return "AWARENESS"
		    Case CampaignObjectiveType.Consideration
		      Return "CONSIDERATION"
		    Case CampaignObjectiveType.VideoView
		      Return "VIDEO_VIEW"
		    Case CampaignObjectiveType.WebConversion
		      Return "WEB_CONVERSION"
		    Case CampaignObjectiveType.CatalogSales
		      Return "CATALOG_SALES"
		    Case CampaignObjectiveType.WebSessions
		      Return "WEB_SESSIONS"
		    Case CampaignObjectiveType.VideoCompletion
		      Return "VIDEO_COMPLETION"
		    Case CampaignObjectiveType.AppInstall
		      Return "APP_INSTALL"
		    Case CampaignObjectiveType.Sales
		      Return "SALES"
		    Case CampaignObjectiveType.Leads
		      Return "LEADS"
		    Case CampaignObjectiveType.CtvConsideration
		      Return "CTV_CONSIDERATION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CampaignPlanningConfidenceLevelAlertReasonToString(value As CampaignPlanningConfidenceLevelAlertReason) As String
		  Select Case value
		    Case CampaignPlanningConfidenceLevelAlertReason.Unknown
		      Return "UNKNOWN"
		    Case CampaignPlanningConfidenceLevelAlertReason.Other
		      Return "OTHER"
		    Case CampaignPlanningConfidenceLevelAlertReason.AdvertiserHasNoRecentCampaigns
		      Return "ADVERTISER_HAS_NO_RECENT_CAMPAIGNS"
		    Case CampaignPlanningConfidenceLevelAlertReason.AdvertiserHasNoRecentConversions
		      Return "ADVERTISER_HAS_NO_RECENT_CONVERSIONS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CampaignPlanningConfidenceLevelAlertSeverityToString(value As CampaignPlanningConfidenceLevelAlertSeverity) As String
		  Select Case value
		    Case CampaignPlanningConfidenceLevelAlertSeverity.Unknown
		      Return "UNKNOWN"
		    Case CampaignPlanningConfidenceLevelAlertSeverity.LowMild
		      Return "LOW_MILD"
		    Case CampaignPlanningConfidenceLevelAlertSeverity.LowModerate
		      Return "LOW_MODERATE"
		    Case CampaignPlanningConfidenceLevelAlertSeverity.LowSevere
		      Return "LOW_SEVERE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CampaignPlanningConversionAttributionWindowDaysToString(value As CampaignPlanningConversionAttributionWindowDays) As String
		  Select Case value
		    Case CampaignPlanningConversionAttributionWindowDays.Days0
		      Return "DAYS_0"
		    Case CampaignPlanningConversionAttributionWindowDays.Days1
		      Return "DAYS_1"
		    Case CampaignPlanningConversionAttributionWindowDays.Days7
		      Return "DAYS_7"
		    Case CampaignPlanningConversionAttributionWindowDays.Days30
		      Return "DAYS_30"
		    Case CampaignPlanningConversionAttributionWindowDays.Days60
		      Return "DAYS_60"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CampaignPlanningConversionEventToString(value As CampaignPlanningConversionEvent) As String
		  Select Case value
		    Case CampaignPlanningConversionEvent.Signup
		      Return "SIGNUP"
		    Case CampaignPlanningConversionEvent.Checkout
		      Return "CHECKOUT"
		    Case CampaignPlanningConversionEvent.AddToCart
		      Return "ADD_TO_CART"
		    Case CampaignPlanningConversionEvent.Lead
		      Return "LEAD"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CampaignPlanningEstimationTypeToString(value As CampaignPlanningEstimationType) As String
		  Select Case value
		    Case CampaignPlanningEstimationType.Impression
		      Return "IMPRESSION"
		    Case CampaignPlanningEstimationType.Click
		      Return "CLICK"
		    Case CampaignPlanningEstimationType.Conversion
		      Return "CONVERSION"
		    Case CampaignPlanningEstimationType.WeeklyFrequency
		      Return "WEEKLY_FREQUENCY"
		    Case CampaignPlanningEstimationType.WeeklyReach
		      Return "WEEKLY_REACH"
		    Case CampaignPlanningEstimationType.LifetimeFrequency
		      Return "LIFETIME_FREQUENCY"
		    Case CampaignPlanningEstimationType.LifetimeReach
		      Return "LIFETIME_REACH"
		    Case CampaignPlanningEstimationType.Cpm
		      Return "CPM"
		    Case CampaignPlanningEstimationType.Cpc
		      Return "CPC"
		    Case CampaignPlanningEstimationType.Cpa
		      Return "CPA"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CampaignPlanningResponseErrorCodeToString(value As CampaignPlanningResponseErrorCode) As String
		  Select Case value
		    Case CampaignPlanningResponseErrorCode.ServerError
		      Return "SERVER_ERROR"
		    Case CampaignPlanningResponseErrorCode.AudienceListMissing
		      Return "AUDIENCE_LIST_MISSING"
		    Case CampaignPlanningResponseErrorCode.InvalidRequest
		      Return "INVALID_REQUEST"
		    Case CampaignPlanningResponseErrorCode.ProductGroupMissing
		      Return "PRODUCT_GROUP_MISSING"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CampaignSummaryStatusToString(value As CampaignSummaryStatus) As String
		  Select Case value
		    Case CampaignSummaryStatus.Running
		      Return "RUNNING"
		    Case CampaignSummaryStatus.Paused
		      Return "PAUSED"
		    Case CampaignSummaryStatus.NotStarted
		      Return "NOT_STARTED"
		    Case CampaignSummaryStatus.Completed
		      Return "COMPLETED"
		    Case CampaignSummaryStatus.AdvertiserDisabled
		      Return "ADVERTISER_DISABLED"
		    Case CampaignSummaryStatus.Archived
		      Return "ARCHIVED"
		    Case CampaignSummaryStatus.Draft
		      Return "DRAFT"
		    Case CampaignSummaryStatus.DeletedDraft
		      Return "DELETED_DRAFT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CatalogsAiContentDisclosureLabelToString(value As CatalogsAiContentDisclosureLabel) As String
		  Select Case value
		    Case CatalogsAiContentDisclosureLabel.AiModified
		      Return "ai_modified"
		    Case CatalogsAiContentDisclosureLabel.SyntheticPerformer
		      Return "synthetic_performer"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CatalogsFeedProcessingScheduleTimezoneToString(value As CatalogsFeedProcessingScheduleTimezone) As String
		  Select Case value
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashAbidjan
		      Return "Africa/Abidjan"
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashAccra
		      Return "Africa/Accra"
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashAlgiers
		      Return "Africa/Algiers"
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashBissau
		      Return "Africa/Bissau"
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashCairo
		      Return "Africa/Cairo"
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashCasablanca
		      Return "Africa/Casablanca"
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashCeuta
		      Return "Africa/Ceuta"
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashElAaiun
		      Return "Africa/El_Aaiun"
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashJohannesburg
		      Return "Africa/Johannesburg"
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashJuba
		      Return "Africa/Juba"
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashKhartoum
		      Return "Africa/Khartoum"
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashLagos
		      Return "Africa/Lagos"
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashMaputo
		      Return "Africa/Maputo"
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashMonrovia
		      Return "Africa/Monrovia"
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashNairobi
		      Return "Africa/Nairobi"
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashNdjamena
		      Return "Africa/Ndjamena"
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashSaoTome
		      Return "Africa/Sao_Tome"
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashTripoli
		      Return "Africa/Tripoli"
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashTunis
		      Return "Africa/Tunis"
		    Case CatalogsFeedProcessingScheduleTimezone.AfricaSlashWindhoek
		      Return "Africa/Windhoek"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashAdak
		      Return "America/Adak"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashAnchorage
		      Return "America/Anchorage"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashAraguaina
		      Return "America/Araguaina"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashArgentinaSlashBuenosAires
		      Return "America/Argentina/Buenos_Aires"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashArgentinaSlashCatamarca
		      Return "America/Argentina/Catamarca"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashArgentinaSlashCordoba
		      Return "America/Argentina/Cordoba"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashArgentinaSlashJujuy
		      Return "America/Argentina/Jujuy"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashArgentinaSlashLaRioja
		      Return "America/Argentina/La_Rioja"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashArgentinaSlashMendoza
		      Return "America/Argentina/Mendoza"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashArgentinaSlashRioGallegos
		      Return "America/Argentina/Rio_Gallegos"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashArgentinaSlashSalta
		      Return "America/Argentina/Salta"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashArgentinaSlashSanJuan
		      Return "America/Argentina/San_Juan"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashArgentinaSlashSanLuis
		      Return "America/Argentina/San_Luis"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashArgentinaSlashTucuman
		      Return "America/Argentina/Tucuman"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashArgentinaSlashUshuaia
		      Return "America/Argentina/Ushuaia"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashAsuncion
		      Return "America/Asuncion"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashAtikokan
		      Return "America/Atikokan"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashBahia
		      Return "America/Bahia"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashBahiaBanderas
		      Return "America/Bahia_Banderas"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashBarbados
		      Return "America/Barbados"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashBelem
		      Return "America/Belem"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashBelize
		      Return "America/Belize"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashBlancSablon
		      Return "America/Blanc-Sablon"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashBoaVista
		      Return "America/Boa_Vista"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashBogota
		      Return "America/Bogota"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashBoise
		      Return "America/Boise"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashCambridgeBay
		      Return "America/Cambridge_Bay"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashCampoGrande
		      Return "America/Campo_Grande"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashCancun
		      Return "America/Cancun"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashCaracas
		      Return "America/Caracas"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashCayenne
		      Return "America/Cayenne"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashChicago
		      Return "America/Chicago"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashChihuahua
		      Return "America/Chihuahua"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashCostaRica
		      Return "America/Costa_Rica"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashCreston
		      Return "America/Creston"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashCuiaba
		      Return "America/Cuiaba"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashCuracao
		      Return "America/Curacao"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashDanmarkshavn
		      Return "America/Danmarkshavn"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashDawson
		      Return "America/Dawson"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashDawsonCreek
		      Return "America/Dawson_Creek"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashDenver
		      Return "America/Denver"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashDetroit
		      Return "America/Detroit"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashEdmonton
		      Return "America/Edmonton"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashEirunepe
		      Return "America/Eirunepe"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashElSalvador
		      Return "America/El_Salvador"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashFortNelson
		      Return "America/Fort_Nelson"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashFortaleza
		      Return "America/Fortaleza"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashGlaceBay
		      Return "America/Glace_Bay"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashGooseBay
		      Return "America/Goose_Bay"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashGrandTurk
		      Return "America/Grand_Turk"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashGuatemala
		      Return "America/Guatemala"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashGuayaquil
		      Return "America/Guayaquil"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashGuyana
		      Return "America/Guyana"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashHalifax
		      Return "America/Halifax"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashHavana
		      Return "America/Havana"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashHermosillo
		      Return "America/Hermosillo"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashIndianaSlashIndianapolis
		      Return "America/Indiana/Indianapolis"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashIndianaSlashKnox
		      Return "America/Indiana/Knox"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashIndianaSlashMarengo
		      Return "America/Indiana/Marengo"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashIndianaSlashPetersburg
		      Return "America/Indiana/Petersburg"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashIndianaSlashTellCity
		      Return "America/Indiana/Tell_City"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashIndianaSlashVevay
		      Return "America/Indiana/Vevay"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashIndianaSlashVincennes
		      Return "America/Indiana/Vincennes"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashIndianaSlashWinamac
		      Return "America/Indiana/Winamac"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashInuvik
		      Return "America/Inuvik"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashIqaluit
		      Return "America/Iqaluit"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashJamaica
		      Return "America/Jamaica"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashJuneau
		      Return "America/Juneau"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashKentuckySlashLouisville
		      Return "America/Kentucky/Louisville"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashKentuckySlashMonticello
		      Return "America/Kentucky/Monticello"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashLaPaz
		      Return "America/La_Paz"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashLima
		      Return "America/Lima"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashLosAngeles
		      Return "America/Los_Angeles"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashMaceio
		      Return "America/Maceio"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashManagua
		      Return "America/Managua"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashManaus
		      Return "America/Manaus"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashMartinique
		      Return "America/Martinique"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashMatamoros
		      Return "America/Matamoros"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashMazatlan
		      Return "America/Mazatlan"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashMenominee
		      Return "America/Menominee"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashMerida
		      Return "America/Merida"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashMetlakatla
		      Return "America/Metlakatla"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashMexicoCity
		      Return "America/Mexico_City"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashMiquelon
		      Return "America/Miquelon"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashMoncton
		      Return "America/Moncton"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashMonterrey
		      Return "America/Monterrey"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashMontevideo
		      Return "America/Montevideo"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashNassau
		      Return "America/Nassau"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashNewYork
		      Return "America/New_York"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashNipigon
		      Return "America/Nipigon"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashNome
		      Return "America/Nome"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashNoronha
		      Return "America/Noronha"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashNorthDakotaSlashBeulah
		      Return "America/North_Dakota/Beulah"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashNorthDakotaSlashCenter
		      Return "America/North_Dakota/Center"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashNorthDakotaSlashNewSalem
		      Return "America/North_Dakota/New_Salem"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashNuuk
		      Return "America/Nuuk"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashOjinaga
		      Return "America/Ojinaga"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashPanama
		      Return "America/Panama"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashPangnirtung
		      Return "America/Pangnirtung"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashParamaribo
		      Return "America/Paramaribo"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashPhoenix
		      Return "America/Phoenix"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashPortAuPrince
		      Return "America/Port-au-Prince"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashPortOfSpain
		      Return "America/Port_of_Spain"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashPortoVelho
		      Return "America/Porto_Velho"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashPuertoRico
		      Return "America/Puerto_Rico"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashPuntaArenas
		      Return "America/Punta_Arenas"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashRainyRiver
		      Return "America/Rainy_River"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashRankinInlet
		      Return "America/Rankin_Inlet"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashRecife
		      Return "America/Recife"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashRegina
		      Return "America/Regina"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashResolute
		      Return "America/Resolute"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashRioBranco
		      Return "America/Rio_Branco"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashSantarem
		      Return "America/Santarem"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashSantiago
		      Return "America/Santiago"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashSantoDomingo
		      Return "America/Santo_Domingo"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashSaoPaulo
		      Return "America/Sao_Paulo"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashScoresbysund
		      Return "America/Scoresbysund"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashSitka
		      Return "America/Sitka"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashStJohns
		      Return "America/St_Johns"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashSwiftCurrent
		      Return "America/Swift_Current"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashTegucigalpa
		      Return "America/Tegucigalpa"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashThule
		      Return "America/Thule"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashThunderBay
		      Return "America/Thunder_Bay"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashTijuana
		      Return "America/Tijuana"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashToronto
		      Return "America/Toronto"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashVancouver
		      Return "America/Vancouver"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashWhitehorse
		      Return "America/Whitehorse"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashWinnipeg
		      Return "America/Winnipeg"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashYakutat
		      Return "America/Yakutat"
		    Case CatalogsFeedProcessingScheduleTimezone.AmericaSlashYellowknife
		      Return "America/Yellowknife"
		    Case CatalogsFeedProcessingScheduleTimezone.AntarcticaSlashCasey
		      Return "Antarctica/Casey"
		    Case CatalogsFeedProcessingScheduleTimezone.AntarcticaSlashDavis
		      Return "Antarctica/Davis"
		    Case CatalogsFeedProcessingScheduleTimezone.AntarcticaSlashDumontdurville
		      Return "Antarctica/DumontDUrville"
		    Case CatalogsFeedProcessingScheduleTimezone.AntarcticaSlashMacquarie
		      Return "Antarctica/Macquarie"
		    Case CatalogsFeedProcessingScheduleTimezone.AntarcticaSlashMawson
		      Return "Antarctica/Mawson"
		    Case CatalogsFeedProcessingScheduleTimezone.AntarcticaSlashPalmer
		      Return "Antarctica/Palmer"
		    Case CatalogsFeedProcessingScheduleTimezone.AntarcticaSlashRothera
		      Return "Antarctica/Rothera"
		    Case CatalogsFeedProcessingScheduleTimezone.AntarcticaSlashSyowa
		      Return "Antarctica/Syowa"
		    Case CatalogsFeedProcessingScheduleTimezone.AntarcticaSlashTroll
		      Return "Antarctica/Troll"
		    Case CatalogsFeedProcessingScheduleTimezone.AntarcticaSlashVostok
		      Return "Antarctica/Vostok"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashAlmaty
		      Return "Asia/Almaty"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashAmman
		      Return "Asia/Amman"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashAnadyr
		      Return "Asia/Anadyr"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashAqtau
		      Return "Asia/Aqtau"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashAqtobe
		      Return "Asia/Aqtobe"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashAshgabat
		      Return "Asia/Ashgabat"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashAtyrau
		      Return "Asia/Atyrau"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashBaghdad
		      Return "Asia/Baghdad"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashBaku
		      Return "Asia/Baku"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashBangkok
		      Return "Asia/Bangkok"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashBarnaul
		      Return "Asia/Barnaul"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashBeirut
		      Return "Asia/Beirut"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashBishkek
		      Return "Asia/Bishkek"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashBrunei
		      Return "Asia/Brunei"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashChita
		      Return "Asia/Chita"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashChoibalsan
		      Return "Asia/Choibalsan"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashColombo
		      Return "Asia/Colombo"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashDamascus
		      Return "Asia/Damascus"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashDhaka
		      Return "Asia/Dhaka"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashDili
		      Return "Asia/Dili"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashDubai
		      Return "Asia/Dubai"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashDushanbe
		      Return "Asia/Dushanbe"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashFamagusta
		      Return "Asia/Famagusta"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashGaza
		      Return "Asia/Gaza"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashHebron
		      Return "Asia/Hebron"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashHoChiMinh
		      Return "Asia/Ho_Chi_Minh"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashHongKong
		      Return "Asia/Hong_Kong"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashHovd
		      Return "Asia/Hovd"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashIrkutsk
		      Return "Asia/Irkutsk"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashJakarta
		      Return "Asia/Jakarta"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashJayapura
		      Return "Asia/Jayapura"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashJerusalem
		      Return "Asia/Jerusalem"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashKabul
		      Return "Asia/Kabul"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashKamchatka
		      Return "Asia/Kamchatka"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashKarachi
		      Return "Asia/Karachi"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashKathmandu
		      Return "Asia/Kathmandu"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashKhandyga
		      Return "Asia/Khandyga"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashKolkata
		      Return "Asia/Kolkata"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashKrasnoyarsk
		      Return "Asia/Krasnoyarsk"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashKualaLumpur
		      Return "Asia/Kuala_Lumpur"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashKuching
		      Return "Asia/Kuching"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashMacau
		      Return "Asia/Macau"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashMagadan
		      Return "Asia/Magadan"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashMakassar
		      Return "Asia/Makassar"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashManila
		      Return "Asia/Manila"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashNicosia
		      Return "Asia/Nicosia"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashNovokuznetsk
		      Return "Asia/Novokuznetsk"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashNovosibirsk
		      Return "Asia/Novosibirsk"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashOmsk
		      Return "Asia/Omsk"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashOral
		      Return "Asia/Oral"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashPontianak
		      Return "Asia/Pontianak"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashPyongyang
		      Return "Asia/Pyongyang"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashQatar
		      Return "Asia/Qatar"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashQostanay
		      Return "Asia/Qostanay"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashQyzylorda
		      Return "Asia/Qyzylorda"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashRiyadh
		      Return "Asia/Riyadh"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashSakhalin
		      Return "Asia/Sakhalin"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashSamarkand
		      Return "Asia/Samarkand"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashSeoul
		      Return "Asia/Seoul"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashShanghai
		      Return "Asia/Shanghai"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashSingapore
		      Return "Asia/Singapore"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashSrednekolymsk
		      Return "Asia/Srednekolymsk"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashTaipei
		      Return "Asia/Taipei"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashTashkent
		      Return "Asia/Tashkent"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashTbilisi
		      Return "Asia/Tbilisi"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashTehran
		      Return "Asia/Tehran"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashThimphu
		      Return "Asia/Thimphu"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashTokyo
		      Return "Asia/Tokyo"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashTomsk
		      Return "Asia/Tomsk"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashUlaanbaatar
		      Return "Asia/Ulaanbaatar"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashUrumqi
		      Return "Asia/Urumqi"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashUstNera
		      Return "Asia/Ust-Nera"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashVladivostok
		      Return "Asia/Vladivostok"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashYakutsk
		      Return "Asia/Yakutsk"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashYangon
		      Return "Asia/Yangon"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashYekaterinburg
		      Return "Asia/Yekaterinburg"
		    Case CatalogsFeedProcessingScheduleTimezone.AsiaSlashYerevan
		      Return "Asia/Yerevan"
		    Case CatalogsFeedProcessingScheduleTimezone.AtlanticSlashAzores
		      Return "Atlantic/Azores"
		    Case CatalogsFeedProcessingScheduleTimezone.AtlanticSlashBermuda
		      Return "Atlantic/Bermuda"
		    Case CatalogsFeedProcessingScheduleTimezone.AtlanticSlashCanary
		      Return "Atlantic/Canary"
		    Case CatalogsFeedProcessingScheduleTimezone.AtlanticSlashCapeVerde
		      Return "Atlantic/Cape_Verde"
		    Case CatalogsFeedProcessingScheduleTimezone.AtlanticSlashFaroe
		      Return "Atlantic/Faroe"
		    Case CatalogsFeedProcessingScheduleTimezone.AtlanticSlashMadeira
		      Return "Atlantic/Madeira"
		    Case CatalogsFeedProcessingScheduleTimezone.AtlanticSlashReykjavik
		      Return "Atlantic/Reykjavik"
		    Case CatalogsFeedProcessingScheduleTimezone.AtlanticSlashSouthGeorgia
		      Return "Atlantic/South_Georgia"
		    Case CatalogsFeedProcessingScheduleTimezone.AtlanticSlashStanley
		      Return "Atlantic/Stanley"
		    Case CatalogsFeedProcessingScheduleTimezone.AustraliaSlashAdelaide
		      Return "Australia/Adelaide"
		    Case CatalogsFeedProcessingScheduleTimezone.AustraliaSlashBrisbane
		      Return "Australia/Brisbane"
		    Case CatalogsFeedProcessingScheduleTimezone.AustraliaSlashBrokenHill
		      Return "Australia/Broken_Hill"
		    Case CatalogsFeedProcessingScheduleTimezone.AustraliaSlashCurrie
		      Return "Australia/Currie"
		    Case CatalogsFeedProcessingScheduleTimezone.AustraliaSlashDarwin
		      Return "Australia/Darwin"
		    Case CatalogsFeedProcessingScheduleTimezone.AustraliaSlashEucla
		      Return "Australia/Eucla"
		    Case CatalogsFeedProcessingScheduleTimezone.AustraliaSlashHobart
		      Return "Australia/Hobart"
		    Case CatalogsFeedProcessingScheduleTimezone.AustraliaSlashLindeman
		      Return "Australia/Lindeman"
		    Case CatalogsFeedProcessingScheduleTimezone.AustraliaSlashLordHowe
		      Return "Australia/Lord_Howe"
		    Case CatalogsFeedProcessingScheduleTimezone.AustraliaSlashMelbourne
		      Return "Australia/Melbourne"
		    Case CatalogsFeedProcessingScheduleTimezone.AustraliaSlashPerth
		      Return "Australia/Perth"
		    Case CatalogsFeedProcessingScheduleTimezone.AustraliaSlashSydney
		      Return "Australia/Sydney"
		    Case CatalogsFeedProcessingScheduleTimezone.Cet
		      Return "CET"
		    Case CatalogsFeedProcessingScheduleTimezone.Cst6cdt
		      Return "CST6CDT"
		    Case CatalogsFeedProcessingScheduleTimezone.Eet
		      Return "EET"
		    Case CatalogsFeedProcessingScheduleTimezone.Est
		      Return "EST"
		    Case CatalogsFeedProcessingScheduleTimezone.Est5edt
		      Return "EST5EDT"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmt
		      Return "Etc/GMT"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmtPlus1
		      Return "Etc/GMT+1"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmtPlus10
		      Return "Etc/GMT+10"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmtPlus11
		      Return "Etc/GMT+11"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmtPlus12
		      Return "Etc/GMT+12"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmtPlus2
		      Return "Etc/GMT+2"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmtPlus3
		      Return "Etc/GMT+3"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmtPlus4
		      Return "Etc/GMT+4"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmtPlus5
		      Return "Etc/GMT+5"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmtPlus6
		      Return "Etc/GMT+6"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmtPlus7
		      Return "Etc/GMT+7"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmtPlus8
		      Return "Etc/GMT+8"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmtPlus9
		      Return "Etc/GMT+9"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmt1
		      Return "Etc/GMT-1"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmt10
		      Return "Etc/GMT-10"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmt11
		      Return "Etc/GMT-11"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmt12
		      Return "Etc/GMT-12"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmt13
		      Return "Etc/GMT-13"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmt14
		      Return "Etc/GMT-14"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmt2
		      Return "Etc/GMT-2"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmt3
		      Return "Etc/GMT-3"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmt4
		      Return "Etc/GMT-4"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmt5
		      Return "Etc/GMT-5"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmt6
		      Return "Etc/GMT-6"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmt7
		      Return "Etc/GMT-7"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmt8
		      Return "Etc/GMT-8"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashGmt9
		      Return "Etc/GMT-9"
		    Case CatalogsFeedProcessingScheduleTimezone.EtcSlashUtc
		      Return "Etc/UTC"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashAmsterdam
		      Return "Europe/Amsterdam"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashAndorra
		      Return "Europe/Andorra"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashAstrakhan
		      Return "Europe/Astrakhan"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashAthens
		      Return "Europe/Athens"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashBelgrade
		      Return "Europe/Belgrade"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashBerlin
		      Return "Europe/Berlin"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashBrussels
		      Return "Europe/Brussels"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashBucharest
		      Return "Europe/Bucharest"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashBudapest
		      Return "Europe/Budapest"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashChisinau
		      Return "Europe/Chisinau"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashCopenhagen
		      Return "Europe/Copenhagen"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashDublin
		      Return "Europe/Dublin"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashGibraltar
		      Return "Europe/Gibraltar"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashHelsinki
		      Return "Europe/Helsinki"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashIstanbul
		      Return "Europe/Istanbul"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashKaliningrad
		      Return "Europe/Kaliningrad"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashKiev
		      Return "Europe/Kiev"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashKirov
		      Return "Europe/Kirov"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashLisbon
		      Return "Europe/Lisbon"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashLondon
		      Return "Europe/London"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashLuxembourg
		      Return "Europe/Luxembourg"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashMadrid
		      Return "Europe/Madrid"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashMalta
		      Return "Europe/Malta"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashMinsk
		      Return "Europe/Minsk"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashMonaco
		      Return "Europe/Monaco"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashMoscow
		      Return "Europe/Moscow"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashOslo
		      Return "Europe/Oslo"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashParis
		      Return "Europe/Paris"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashPrague
		      Return "Europe/Prague"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashRiga
		      Return "Europe/Riga"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashRome
		      Return "Europe/Rome"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashSamara
		      Return "Europe/Samara"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashSaratov
		      Return "Europe/Saratov"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashSimferopol
		      Return "Europe/Simferopol"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashSofia
		      Return "Europe/Sofia"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashStockholm
		      Return "Europe/Stockholm"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashTallinn
		      Return "Europe/Tallinn"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashTirane
		      Return "Europe/Tirane"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashUlyanovsk
		      Return "Europe/Ulyanovsk"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashUzhgorod
		      Return "Europe/Uzhgorod"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashVienna
		      Return "Europe/Vienna"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashVilnius
		      Return "Europe/Vilnius"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashVolgograd
		      Return "Europe/Volgograd"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashWarsaw
		      Return "Europe/Warsaw"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashZaporozhye
		      Return "Europe/Zaporozhye"
		    Case CatalogsFeedProcessingScheduleTimezone.EuropeSlashZurich
		      Return "Europe/Zurich"
		    Case CatalogsFeedProcessingScheduleTimezone.Hst
		      Return "HST"
		    Case CatalogsFeedProcessingScheduleTimezone.IndianSlashChagos
		      Return "Indian/Chagos"
		    Case CatalogsFeedProcessingScheduleTimezone.IndianSlashChristmas
		      Return "Indian/Christmas"
		    Case CatalogsFeedProcessingScheduleTimezone.IndianSlashCocos
		      Return "Indian/Cocos"
		    Case CatalogsFeedProcessingScheduleTimezone.IndianSlashKerguelen
		      Return "Indian/Kerguelen"
		    Case CatalogsFeedProcessingScheduleTimezone.IndianSlashMahe
		      Return "Indian/Mahe"
		    Case CatalogsFeedProcessingScheduleTimezone.IndianSlashMaldives
		      Return "Indian/Maldives"
		    Case CatalogsFeedProcessingScheduleTimezone.IndianSlashMauritius
		      Return "Indian/Mauritius"
		    Case CatalogsFeedProcessingScheduleTimezone.IndianSlashReunion
		      Return "Indian/Reunion"
		    Case CatalogsFeedProcessingScheduleTimezone.Met
		      Return "MET"
		    Case CatalogsFeedProcessingScheduleTimezone.Mst
		      Return "MST"
		    Case CatalogsFeedProcessingScheduleTimezone.Mst7mdt
		      Return "MST7MDT"
		    Case CatalogsFeedProcessingScheduleTimezone.Pst8pdt
		      Return "PST8PDT"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashApia
		      Return "Pacific/Apia"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashAuckland
		      Return "Pacific/Auckland"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashBougainville
		      Return "Pacific/Bougainville"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashChatham
		      Return "Pacific/Chatham"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashChuuk
		      Return "Pacific/Chuuk"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashEaster
		      Return "Pacific/Easter"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashEfate
		      Return "Pacific/Efate"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashEnderbury
		      Return "Pacific/Enderbury"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashFakaofo
		      Return "Pacific/Fakaofo"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashFiji
		      Return "Pacific/Fiji"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashFunafuti
		      Return "Pacific/Funafuti"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashGalapagos
		      Return "Pacific/Galapagos"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashGambier
		      Return "Pacific/Gambier"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashGuadalcanal
		      Return "Pacific/Guadalcanal"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashGuam
		      Return "Pacific/Guam"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashHonolulu
		      Return "Pacific/Honolulu"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashKiritimati
		      Return "Pacific/Kiritimati"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashKosrae
		      Return "Pacific/Kosrae"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashKwajalein
		      Return "Pacific/Kwajalein"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashMajuro
		      Return "Pacific/Majuro"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashMarquesas
		      Return "Pacific/Marquesas"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashNauru
		      Return "Pacific/Nauru"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashNiue
		      Return "Pacific/Niue"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashNorfolk
		      Return "Pacific/Norfolk"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashNoumea
		      Return "Pacific/Noumea"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashPagoPago
		      Return "Pacific/Pago_Pago"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashPalau
		      Return "Pacific/Palau"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashPitcairn
		      Return "Pacific/Pitcairn"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashPohnpei
		      Return "Pacific/Pohnpei"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashPortMoresby
		      Return "Pacific/Port_Moresby"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashRarotonga
		      Return "Pacific/Rarotonga"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashTahiti
		      Return "Pacific/Tahiti"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashTarawa
		      Return "Pacific/Tarawa"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashTongatapu
		      Return "Pacific/Tongatapu"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashWake
		      Return "Pacific/Wake"
		    Case CatalogsFeedProcessingScheduleTimezone.PacificSlashWallis
		      Return "Pacific/Wallis"
		    Case CatalogsFeedProcessingScheduleTimezone.Wet
		      Return "WET"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CatalogsFeedProcessingStatusToString(value As CatalogsFeedProcessingStatus) As String
		  Select Case value
		    Case CatalogsFeedProcessingStatus.Completed
		      Return "COMPLETED"
		    Case CatalogsFeedProcessingStatus.Failed
		      Return "FAILED"
		    Case CatalogsFeedProcessingStatus.Processing
		      Return "PROCESSING"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CatalogsFormatToString(value As CatalogsFormat) As String
		  Select Case value
		    Case CatalogsFormat.Tsv
		      Return "TSV"
		    Case CatalogsFormat.Csv
		      Return "CSV"
		    Case CatalogsFormat.Xml
		      Return "XML"
		    Case CatalogsFormat.Integration
		      Return "INTEGRATION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CatalogsHotelProductGroupTypeToString(value As CatalogsHotelProductGroupType) As String
		  Select Case value
		    Case CatalogsHotelProductGroupType.MerchantCreated
		      Return "MERCHANT_CREATED"
		    Case CatalogsHotelProductGroupType.AllListings
		      Return "ALL_LISTINGS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CatalogsItemValidationIssueToString(value As CatalogsItemValidationIssue) As String
		  Select Case value
		    Case CatalogsItemValidationIssue.AdImage0LinkLengthTooLong
		      Return "AD_IMAGE_0_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage1LinkLengthTooLong
		      Return "AD_IMAGE_1_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage2LinkLengthTooLong
		      Return "AD_IMAGE_2_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage3LinkLengthTooLong
		      Return "AD_IMAGE_3_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage4LinkLengthTooLong
		      Return "AD_IMAGE_4_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage5LinkLengthTooLong
		      Return "AD_IMAGE_5_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage6LinkLengthTooLong
		      Return "AD_IMAGE_6_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage7LinkLengthTooLong
		      Return "AD_IMAGE_7_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage8LinkLengthTooLong
		      Return "AD_IMAGE_8_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage9LinkLengthTooLong
		      Return "AD_IMAGE_9_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage10LinkLengthTooLong
		      Return "AD_IMAGE_10_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage11LinkLengthTooLong
		      Return "AD_IMAGE_11_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage12LinkLengthTooLong
		      Return "AD_IMAGE_12_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage13LinkLengthTooLong
		      Return "AD_IMAGE_13_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage14LinkLengthTooLong
		      Return "AD_IMAGE_14_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage15LinkLengthTooLong
		      Return "AD_IMAGE_15_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage16LinkLengthTooLong
		      Return "AD_IMAGE_16_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage17LinkLengthTooLong
		      Return "AD_IMAGE_17_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage18LinkLengthTooLong
		      Return "AD_IMAGE_18_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage19LinkLengthTooLong
		      Return "AD_IMAGE_19_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage0LinkWarning
		      Return "AD_IMAGE_0_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage1LinkWarning
		      Return "AD_IMAGE_1_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage2LinkWarning
		      Return "AD_IMAGE_2_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage3LinkWarning
		      Return "AD_IMAGE_3_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage4LinkWarning
		      Return "AD_IMAGE_4_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage5LinkWarning
		      Return "AD_IMAGE_5_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage6LinkWarning
		      Return "AD_IMAGE_6_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage7LinkWarning
		      Return "AD_IMAGE_7_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage8LinkWarning
		      Return "AD_IMAGE_8_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage9LinkWarning
		      Return "AD_IMAGE_9_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage10LinkWarning
		      Return "AD_IMAGE_10_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage11LinkWarning
		      Return "AD_IMAGE_11_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage12LinkWarning
		      Return "AD_IMAGE_12_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage13LinkWarning
		      Return "AD_IMAGE_13_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage14LinkWarning
		      Return "AD_IMAGE_14_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage15LinkWarning
		      Return "AD_IMAGE_15_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage16LinkWarning
		      Return "AD_IMAGE_16_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage17LinkWarning
		      Return "AD_IMAGE_17_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage18LinkWarning
		      Return "AD_IMAGE_18_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage19LinkWarning
		      Return "AD_IMAGE_19_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdImage0LinkRequired
		      Return "AD_IMAGE_0_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage1LinkRequired
		      Return "AD_IMAGE_1_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage2LinkRequired
		      Return "AD_IMAGE_2_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage3LinkRequired
		      Return "AD_IMAGE_3_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage4LinkRequired
		      Return "AD_IMAGE_4_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage5LinkRequired
		      Return "AD_IMAGE_5_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage6LinkRequired
		      Return "AD_IMAGE_6_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage7LinkRequired
		      Return "AD_IMAGE_7_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage8LinkRequired
		      Return "AD_IMAGE_8_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage9LinkRequired
		      Return "AD_IMAGE_9_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage10LinkRequired
		      Return "AD_IMAGE_10_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage11LinkRequired
		      Return "AD_IMAGE_11_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage12LinkRequired
		      Return "AD_IMAGE_12_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage13LinkRequired
		      Return "AD_IMAGE_13_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage14LinkRequired
		      Return "AD_IMAGE_14_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage15LinkRequired
		      Return "AD_IMAGE_15_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage16LinkRequired
		      Return "AD_IMAGE_16_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage17LinkRequired
		      Return "AD_IMAGE_17_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage18LinkRequired
		      Return "AD_IMAGE_18_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage19LinkRequired
		      Return "AD_IMAGE_19_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage0TagLengthTooLong
		      Return "AD_IMAGE_0_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage1TagLengthTooLong
		      Return "AD_IMAGE_1_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage2TagLengthTooLong
		      Return "AD_IMAGE_2_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage3TagLengthTooLong
		      Return "AD_IMAGE_3_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage4TagLengthTooLong
		      Return "AD_IMAGE_4_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage5TagLengthTooLong
		      Return "AD_IMAGE_5_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage6TagLengthTooLong
		      Return "AD_IMAGE_6_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage7TagLengthTooLong
		      Return "AD_IMAGE_7_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage8TagLengthTooLong
		      Return "AD_IMAGE_8_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage9TagLengthTooLong
		      Return "AD_IMAGE_9_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage10TagLengthTooLong
		      Return "AD_IMAGE_10_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage11TagLengthTooLong
		      Return "AD_IMAGE_11_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage12TagLengthTooLong
		      Return "AD_IMAGE_12_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage13TagLengthTooLong
		      Return "AD_IMAGE_13_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage14TagLengthTooLong
		      Return "AD_IMAGE_14_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage15TagLengthTooLong
		      Return "AD_IMAGE_15_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage16TagLengthTooLong
		      Return "AD_IMAGE_16_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage17TagLengthTooLong
		      Return "AD_IMAGE_17_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage18TagLengthTooLong
		      Return "AD_IMAGE_18_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage19TagLengthTooLong
		      Return "AD_IMAGE_19_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdImage0TagRequired
		      Return "AD_IMAGE_0_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage1TagRequired
		      Return "AD_IMAGE_1_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage2TagRequired
		      Return "AD_IMAGE_2_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage3TagRequired
		      Return "AD_IMAGE_3_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage4TagRequired
		      Return "AD_IMAGE_4_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage5TagRequired
		      Return "AD_IMAGE_5_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage6TagRequired
		      Return "AD_IMAGE_6_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage7TagRequired
		      Return "AD_IMAGE_7_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage8TagRequired
		      Return "AD_IMAGE_8_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage9TagRequired
		      Return "AD_IMAGE_9_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage10TagRequired
		      Return "AD_IMAGE_10_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage11TagRequired
		      Return "AD_IMAGE_11_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage12TagRequired
		      Return "AD_IMAGE_12_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage13TagRequired
		      Return "AD_IMAGE_13_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage14TagRequired
		      Return "AD_IMAGE_14_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage15TagRequired
		      Return "AD_IMAGE_15_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage16TagRequired
		      Return "AD_IMAGE_16_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage17TagRequired
		      Return "AD_IMAGE_17_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage18TagRequired
		      Return "AD_IMAGE_18_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage19TagRequired
		      Return "AD_IMAGE_19_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdImage0LinkDuplicated
		      Return "AD_IMAGE_0_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage1LinkDuplicated
		      Return "AD_IMAGE_1_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage2LinkDuplicated
		      Return "AD_IMAGE_2_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage3LinkDuplicated
		      Return "AD_IMAGE_3_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage4LinkDuplicated
		      Return "AD_IMAGE_4_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage5LinkDuplicated
		      Return "AD_IMAGE_5_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage6LinkDuplicated
		      Return "AD_IMAGE_6_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage7LinkDuplicated
		      Return "AD_IMAGE_7_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage8LinkDuplicated
		      Return "AD_IMAGE_8_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage9LinkDuplicated
		      Return "AD_IMAGE_9_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage10LinkDuplicated
		      Return "AD_IMAGE_10_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage11LinkDuplicated
		      Return "AD_IMAGE_11_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage12LinkDuplicated
		      Return "AD_IMAGE_12_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage13LinkDuplicated
		      Return "AD_IMAGE_13_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage14LinkDuplicated
		      Return "AD_IMAGE_14_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage15LinkDuplicated
		      Return "AD_IMAGE_15_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage16LinkDuplicated
		      Return "AD_IMAGE_16_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage17LinkDuplicated
		      Return "AD_IMAGE_17_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage18LinkDuplicated
		      Return "AD_IMAGE_18_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage19LinkDuplicated
		      Return "AD_IMAGE_19_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage0TagDuplicated
		      Return "AD_IMAGE_0_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage1TagDuplicated
		      Return "AD_IMAGE_1_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage2TagDuplicated
		      Return "AD_IMAGE_2_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage3TagDuplicated
		      Return "AD_IMAGE_3_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage4TagDuplicated
		      Return "AD_IMAGE_4_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage5TagDuplicated
		      Return "AD_IMAGE_5_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage6TagDuplicated
		      Return "AD_IMAGE_6_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage7TagDuplicated
		      Return "AD_IMAGE_7_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage8TagDuplicated
		      Return "AD_IMAGE_8_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage9TagDuplicated
		      Return "AD_IMAGE_9_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage10TagDuplicated
		      Return "AD_IMAGE_10_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage11TagDuplicated
		      Return "AD_IMAGE_11_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage12TagDuplicated
		      Return "AD_IMAGE_12_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage13TagDuplicated
		      Return "AD_IMAGE_13_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage14TagDuplicated
		      Return "AD_IMAGE_14_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage15TagDuplicated
		      Return "AD_IMAGE_15_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage16TagDuplicated
		      Return "AD_IMAGE_16_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage17TagDuplicated
		      Return "AD_IMAGE_17_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage18TagDuplicated
		      Return "AD_IMAGE_18_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdImage19TagDuplicated
		      Return "AD_IMAGE_19_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdVideo0LinkLengthTooLong
		      Return "AD_VIDEO_0_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdVideo1LinkLengthTooLong
		      Return "AD_VIDEO_1_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdVideo2LinkLengthTooLong
		      Return "AD_VIDEO_2_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdVideo0LinkWarning
		      Return "AD_VIDEO_0_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdVideo1LinkWarning
		      Return "AD_VIDEO_1_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdVideo2LinkWarning
		      Return "AD_VIDEO_2_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdVideo0LinkRequired
		      Return "AD_VIDEO_0_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdVideo1LinkRequired
		      Return "AD_VIDEO_1_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdVideo2LinkRequired
		      Return "AD_VIDEO_2_LINK_REQUIRED"
		    Case CatalogsItemValidationIssue.AdVideo0LinkDuplicated
		      Return "AD_VIDEO_0_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdVideo1LinkDuplicated
		      Return "AD_VIDEO_1_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdVideo2LinkDuplicated
		      Return "AD_VIDEO_2_LINK_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdVideo0TagLengthTooLong
		      Return "AD_VIDEO_0_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdVideo1TagLengthTooLong
		      Return "AD_VIDEO_1_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdVideo2TagLengthTooLong
		      Return "AD_VIDEO_2_TAG_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdVideo0TagRequired
		      Return "AD_VIDEO_0_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdVideo1TagRequired
		      Return "AD_VIDEO_1_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdVideo2TagRequired
		      Return "AD_VIDEO_2_TAG_REQUIRED"
		    Case CatalogsItemValidationIssue.AdVideo0TagDuplicated
		      Return "AD_VIDEO_0_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdVideo1TagDuplicated
		      Return "AD_VIDEO_1_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.AdVideo2TagDuplicated
		      Return "AD_VIDEO_2_TAG_DUPLICATED"
		    Case CatalogsItemValidationIssue.VideoRequiredWhenAdVideoProvided
		      Return "VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED"
		    Case CatalogsItemValidationIssue.AdLinkFormatWarning
		      Return "AD_LINK_FORMAT_WARNING"
		    Case CatalogsItemValidationIssue.AdLinkSameAsLink
		      Return "AD_LINK_SAME_AS_LINK"
		    Case CatalogsItemValidationIssue.AdditionalImageLinkLengthTooLong
		      Return "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.AdditionalImageLinkWarning
		      Return "ADDITIONAL_IMAGE_LINK_WARNING"
		    Case CatalogsItemValidationIssue.AdultInvalid
		      Return "ADULT_INVALID"
		    Case CatalogsItemValidationIssue.AdwordsFormatInvalid
		      Return "ADWORDS_FORMAT_INVALID"
		    Case CatalogsItemValidationIssue.AdwordsFormatWarning
		      Return "ADWORDS_FORMAT_WARNING"
		    Case CatalogsItemValidationIssue.AdwordsSameAsLink
		      Return "ADWORDS_SAME_AS_LINK"
		    Case CatalogsItemValidationIssue.AgeGroupInvalid
		      Return "AGE_GROUP_INVALID"
		    Case CatalogsItemValidationIssue.AndroidDeepLinkInvalid
		      Return "ANDROID_DEEP_LINK_INVALID"
		    Case CatalogsItemValidationIssue.AvailabilityDateInvalid
		      Return "AVAILABILITY_DATE_INVALID"
		    Case CatalogsItemValidationIssue.AvailabilityInvalid
		      Return "AVAILABILITY_INVALID"
		    Case CatalogsItemValidationIssue.BlocklistedImageSignature
		      Return "BLOCKLISTED_IMAGE_SIGNATURE"
		    Case CatalogsItemValidationIssue.CountryDoesNotMapToCurrency
		      Return "COUNTRY_DOES_NOT_MAP_TO_CURRENCY"
		    Case CatalogsItemValidationIssue.CustomLabelLengthTooLong
		      Return "CUSTOM_LABEL_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.DescriptionLengthTooLong
		      Return "DESCRIPTION_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.DescriptionMissing
		      Return "DESCRIPTION_MISSING"
		    Case CatalogsItemValidationIssue.DuplicateProducts
		      Return "DUPLICATE_PRODUCTS"
		    Case CatalogsItemValidationIssue.ExpirationDateInvalid
		      Return "EXPIRATION_DATE_INVALID"
		    Case CatalogsItemValidationIssue.GenderInvalid
		      Return "GENDER_INVALID"
		    Case CatalogsItemValidationIssue.GtinInvalid
		      Return "GTIN_INVALID"
		    Case CatalogsItemValidationIssue.ImageLinkInvalid
		      Return "IMAGE_LINK_INVALID"
		    Case CatalogsItemValidationIssue.ImageLinkLengthTooLong
		      Return "IMAGE_LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.ImageLinkMissing
		      Return "IMAGE_LINK_MISSING"
		    Case CatalogsItemValidationIssue.ImageLinkWarning
		      Return "IMAGE_LINK_WARNING"
		    Case CatalogsItemValidationIssue.InvalidDomain
		      Return "INVALID_DOMAIN"
		    Case CatalogsItemValidationIssue.IosDeepLinkInvalid
		      Return "IOS_DEEP_LINK_INVALID"
		    Case CatalogsItemValidationIssue.IsBundleInvalid
		      Return "IS_BUNDLE_INVALID"
		    Case CatalogsItemValidationIssue.ItemAdditionalImageDownloadFailure
		      Return "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE"
		    Case CatalogsItemValidationIssue.ItemMainImageDownloadFailure
		      Return "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE"
		    Case CatalogsItemValidationIssue.ItemidMissing
		      Return "ITEMID_MISSING"
		    Case CatalogsItemValidationIssue.LinkFormatInvalid
		      Return "LINK_FORMAT_INVALID"
		    Case CatalogsItemValidationIssue.LinkFormatWarning
		      Return "LINK_FORMAT_WARNING"
		    Case CatalogsItemValidationIssue.LinkLengthTooLong
		      Return "LINK_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.ListPriceInvalid
		      Return "LIST_PRICE_INVALID"
		    Case CatalogsItemValidationIssue.MaxItemsPerItemGroupExceeded
		      Return "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED"
		    Case CatalogsItemValidationIssue.MinAdPriceInvalid
		      Return "MIN_AD_PRICE_INVALID"
		    Case CatalogsItemValidationIssue.MpnInvalid
		      Return "MPN_INVALID"
		    Case CatalogsItemValidationIssue.MultipackInvalid
		      Return "MULTIPACK_INVALID"
		    Case CatalogsItemValidationIssue.OptionalConditionInvalid
		      Return "OPTIONAL_CONDITION_INVALID"
		    Case CatalogsItemValidationIssue.OptionalConditionMissing
		      Return "OPTIONAL_CONDITION_MISSING"
		    Case CatalogsItemValidationIssue.OptionalProductCategoryInvalid
		      Return "OPTIONAL_PRODUCT_CATEGORY_INVALID"
		    Case CatalogsItemValidationIssue.OptionalProductCategoryMissing
		      Return "OPTIONAL_PRODUCT_CATEGORY_MISSING"
		    Case CatalogsItemValidationIssue.ParseLineError
		      Return "PARSE_LINE_ERROR"
		    Case CatalogsItemValidationIssue.PinjoinContentUnsafe
		      Return "PINJOIN_CONTENT_UNSAFE"
		    Case CatalogsItemValidationIssue.PriceCannotBeDetermined
		      Return "PRICE_CANNOT_BE_DETERMINED"
		    Case CatalogsItemValidationIssue.PriceMissing
		      Return "PRICE_MISSING"
		    Case CatalogsItemValidationIssue.ProductCategoryDepthWarning
		      Return "PRODUCT_CATEGORY_DEPTH_WARNING"
		    Case CatalogsItemValidationIssue.ProductLinkMissing
		      Return "PRODUCT_LINK_MISSING"
		    Case CatalogsItemValidationIssue.ProductPriceInvalid
		      Return "PRODUCT_PRICE_INVALID"
		    Case CatalogsItemValidationIssue.ProductTypeLengthTooLong
		      Return "PRODUCT_TYPE_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.SaleDateInvalid
		      Return "SALE_DATE_INVALID"
		    Case CatalogsItemValidationIssue.SalesPriceInvalid
		      Return "SALES_PRICE_INVALID"
		    Case CatalogsItemValidationIssue.SalesPriceTooHigh
		      Return "SALES_PRICE_TOO_HIGH"
		    Case CatalogsItemValidationIssue.SalesPriceTooLow
		      Return "SALES_PRICE_TOO_LOW"
		    Case CatalogsItemValidationIssue.ShippingInvalid
		      Return "SHIPPING_INVALID"
		    Case CatalogsItemValidationIssue.ShippingHeightInvalid
		      Return "SHIPPING_HEIGHT_INVALID"
		    Case CatalogsItemValidationIssue.ShippingWeightInvalid
		      Return "SHIPPING_WEIGHT_INVALID"
		    Case CatalogsItemValidationIssue.ShippingWidthInvalid
		      Return "SHIPPING_WIDTH_INVALID"
		    Case CatalogsItemValidationIssue.SizeSystemInvalid
		      Return "SIZE_SYSTEM_INVALID"
		    Case CatalogsItemValidationIssue.SizeTypeInvalid
		      Return "SIZE_TYPE_INVALID"
		    Case CatalogsItemValidationIssue.TaxInvalid
		      Return "TAX_INVALID"
		    Case CatalogsItemValidationIssue.TitleLengthTooLong
		      Return "TITLE_LENGTH_TOO_LONG"
		    Case CatalogsItemValidationIssue.TitleMissing
		      Return "TITLE_MISSING"
		    Case CatalogsItemValidationIssue.TooManyAdditionalImageLinks
		      Return "TOO_MANY_ADDITIONAL_IMAGE_LINKS"
		    Case CatalogsItemValidationIssue.UtmSourceAutoCorrected
		      Return "UTM_SOURCE_AUTO_CORRECTED"
		    Case CatalogsItemValidationIssue.WeightUnitInvalid
		      Return "WEIGHT_UNIT_INVALID"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CatalogsLocaleToString(value As CatalogsLocale) As String
		  Select Case value
		    Case CatalogsLocale.AfZa
		      Return "af-ZA"
		    Case CatalogsLocale.ArSa
		      Return "ar-SA"
		    Case CatalogsLocale.BgBg
		      Return "bg-BG"
		    Case CatalogsLocale.BnIn
		      Return "bn-IN"
		    Case CatalogsLocale.CsCz
		      Return "cs-CZ"
		    Case CatalogsLocale.DaDk
		      Return "da-DK"
		    Case CatalogsLocale.De
		      Return "de"
		    Case CatalogsLocale.ElGr
		      Return "el-GR"
		    Case CatalogsLocale.EnAu
		      Return "en-AU"
		    Case CatalogsLocale.EnCa
		      Return "en-CA"
		    Case CatalogsLocale.EnGb
		      Return "en-GB"
		    Case CatalogsLocale.EnIn
		      Return "en-IN"
		    Case CatalogsLocale.EnUs
		      Return "en-US"
		    Case CatalogsLocale.Es419
		      Return "es-419"
		    Case CatalogsLocale.EsAr
		      Return "es-AR"
		    Case CatalogsLocale.EsEs
		      Return "es-ES"
		    Case CatalogsLocale.EsMx
		      Return "es-MX"
		    Case CatalogsLocale.FiFi
		      Return "fi-FI"
		    Case CatalogsLocale.Fr
		      Return "fr"
		    Case CatalogsLocale.FrCa
		      Return "fr-CA"
		    Case CatalogsLocale.HeIl
		      Return "he-IL"
		    Case CatalogsLocale.HiIn
		      Return "hi-IN"
		    Case CatalogsLocale.HrHr
		      Return "hr-HR"
		    Case CatalogsLocale.HuHu
		      Return "hu-HU"
		    Case CatalogsLocale.IdId
		      Return "id-ID"
		    Case CatalogsLocale.It
		      Return "it"
		    Case CatalogsLocale.Ja
		      Return "ja"
		    Case CatalogsLocale.KoKr
		      Return "ko-KR"
		    Case CatalogsLocale.MsMy
		      Return "ms-MY"
		    Case CatalogsLocale.NbNo
		      Return "nb-NO"
		    Case CatalogsLocale.Nl
		      Return "nl"
		    Case CatalogsLocale.PlPl
		      Return "pl-PL"
		    Case CatalogsLocale.PtBr
		      Return "pt-BR"
		    Case CatalogsLocale.PtPt
		      Return "pt-PT"
		    Case CatalogsLocale.RoRo
		      Return "ro-RO"
		    Case CatalogsLocale.RuRu
		      Return "ru-RU"
		    Case CatalogsLocale.SkSk
		      Return "sk-SK"
		    Case CatalogsLocale.SvSe
		      Return "sv-SE"
		    Case CatalogsLocale.TeIn
		      Return "te-IN"
		    Case CatalogsLocale.ThTh
		      Return "th-TH"
		    Case CatalogsLocale.TlPh
		      Return "tl-PH"
		    Case CatalogsLocale.Tr
		      Return "tr"
		    Case CatalogsLocale.UkUa
		      Return "uk-UA"
		    Case CatalogsLocale.ViVn
		      Return "vi-VN"
		    Case CatalogsLocale.ZhCn
		      Return "zh-CN"
		    Case CatalogsLocale.ZhTw
		      Return "zh-TW"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CatalogsProductGroupStatusToString(value As CatalogsProductGroupStatus) As String
		  Select Case value
		    Case CatalogsProductGroupStatus.Active
		      Return "ACTIVE"
		    Case CatalogsProductGroupStatus.Inactive
		      Return "INACTIVE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CatalogsProductGroupTypeToString(value As CatalogsProductGroupType) As String
		  Select Case value
		    Case CatalogsProductGroupType.MerchantCreated
		      Return "MERCHANT_CREATED"
		    Case CatalogsProductGroupType.AllProducts
		      Return "ALL_PRODUCTS"
		    Case CatalogsProductGroupType.BestDeals
		      Return "BEST_DEALS"
		    Case CatalogsProductGroupType.PinnerFavorites
		      Return "PINNER_FAVORITES"
		    Case CatalogsProductGroupType.TopSellers
		      Return "TOP_SELLERS"
		    Case CatalogsProductGroupType.BackInStock
		      Return "BACK_IN_STOCK"
		    Case CatalogsProductGroupType.NewArrivals
		      Return "NEW_ARRIVALS"
		    Case CatalogsProductGroupType.ShopifyCollections
		      Return "SHOPIFY_COLLECTIONS"
		    Case CatalogsProductGroupType.I2PC
		      Return "I2PC"
		    Case CatalogsProductGroupType.CatalogExpansion
		      Return "CATALOG_EXPANSION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CatalogsStatusToString(value As CatalogsStatus) As String
		  Select Case value
		    Case CatalogsStatus.Active
		      Return "ACTIVE"
		    Case CatalogsStatus.Inactive
		      Return "INACTIVE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CatalogsTypeToString(value As CatalogsType) As String
		  Select Case value
		    Case CatalogsType.Retail
		      Return "RETAIL"
		    Case CatalogsType.Hotel
		      Return "HOTEL"
		    Case CatalogsType.CreativeAssets
		      Return "CREATIVE_ASSETS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ChangeHistoryDataTypeToString(value As ChangeHistoryDataType) As String
		  Select Case value
		    Case ChangeHistoryDataType.String
		      Return "STRING"
		    Case ChangeHistoryDataType.Numeric
		      Return "NUMERIC"
		    Case ChangeHistoryDataType.Microcurrency
		      Return "MICROCURRENCY"
		    Case ChangeHistoryDataType.Date
		      Return "DATE"
		    Case ChangeHistoryDataType.Bool
		      Return "BOOL"
		    Case ChangeHistoryDataType.GenderList
		      Return "GENDER_LIST"
		    Case ChangeHistoryDataType.AgeBucketList
		      Return "AGE_BUCKET_LIST"
		    Case ChangeHistoryDataType.ApptypeList
		      Return "APPTYPE_LIST"
		    Case ChangeHistoryDataType.CountryList
		      Return "COUNTRY_LIST"
		    Case ChangeHistoryDataType.LocaleList
		      Return "LOCALE_LIST"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ChangeHistoryOperationTypeToString(value As ChangeHistoryOperationType) As String
		  Select Case value
		    Case ChangeHistoryOperationType.Create
		      Return "CREATE"
		    Case ChangeHistoryOperationType.Update
		      Return "UPDATE"
		    Case ChangeHistoryOperationType.Delete
		      Return "DELETE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CollectionsHeaderTypeToString(value As CollectionsHeaderType) As String
		  Select Case value
		    Case CollectionsHeaderType.ShopThisCollection
		      Return "SHOP_THIS_COLLECTION"
		    Case CollectionsHeaderType.ExploreThisCollection
		      Return "EXPLORE_THIS_COLLECTION"
		    Case CollectionsHeaderType.NoHeader
		      Return "NO_HEADER"
		    Case CollectionsHeaderType.OnSale
		      Return "ON_SALE"
		    Case CollectionsHeaderType.GetDeal
		      Return "GET_DEAL"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ContentTypeToString(value As ContentType) As String
		  Select Case value
		    Case ContentType.ImageSlashJpeg
		      Return "image/jpeg"
		    Case ContentType.ImageSlashPng
		      Return "image/png"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ConversionAttributionWindowDaysToString(value As ConversionAttributionWindowDays) As String
		  Select Case value
		    Case ConversionAttributionWindowDays.Escaped0
		      Return "0"
		    Case ConversionAttributionWindowDays.Escaped1
		      Return "1"
		    Case ConversionAttributionWindowDays.Escaped7
		      Return "7"
		    Case ConversionAttributionWindowDays.Escaped14
		      Return "14"
		    Case ConversionAttributionWindowDays.Escaped30
		      Return "30"
		    Case ConversionAttributionWindowDays.Escaped60
		      Return "60"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ConversionDeletionRequestStatusToString(value As ConversionDeletionRequestStatus) As String
		  Select Case value
		    Case ConversionDeletionRequestStatus.Pending
		      Return "PENDING"
		    Case ConversionDeletionRequestStatus.Submitted
		      Return "SUBMITTED"
		    Case ConversionDeletionRequestStatus.Cancelled
		      Return "CANCELLED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ConversionEventToString(value As ConversionEvent) As String
		  Select Case value
		    Case ConversionEvent.PageVisit
		      Return "PAGE_VISIT"
		    Case ConversionEvent.Signup
		      Return "SIGNUP"
		    Case ConversionEvent.Checkout
		      Return "CHECKOUT"
		    Case ConversionEvent.Custom
		      Return "CUSTOM"
		    Case ConversionEvent.ViewCategory
		      Return "VIEW_CATEGORY"
		    Case ConversionEvent.Search
		      Return "SEARCH"
		    Case ConversionEvent.AddToCart
		      Return "ADD_TO_CART"
		    Case ConversionEvent.WatchVideo
		      Return "WATCH_VIDEO"
		    Case ConversionEvent.Lead
		      Return "LEAD"
		    Case ConversionEvent.AppInstall
		      Return "APP_INSTALL"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ConversionEventIngestionSourceToString(value As ConversionEventIngestionSource) As String
		  Select Case value
		    Case ConversionEventIngestionSource.Tag
		      Return "TAG"
		    Case ConversionEventIngestionSource.Mmp
		      Return "MMP"
		    Case ConversionEventIngestionSource.FileUpload
		      Return "FILE_UPLOAD"
		    Case ConversionEventIngestionSource.ConversionsApi
		      Return "CONVERSIONS_API"
		    Case ConversionEventIngestionSource.Native
		      Return "NATIVE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ConversionLearningModeTypeToString(value As ConversionLearningModeType) As String
		  Select Case value
		    Case ConversionLearningModeType.NotActive
		      Return "NOT_ACTIVE"
		    Case ConversionLearningModeType.Active
		      Return "ACTIVE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ConversionObjectiveTypeToString(value As ConversionObjectiveType) As String
		  Select Case value
		    Case ConversionObjectiveType.Awareness
		      Return "AWARENESS"
		    Case ConversionObjectiveType.Consideration
		      Return "CONSIDERATION"
		    Case ConversionObjectiveType.WebConversion
		      Return "WEB_CONVERSION"
		    Case ConversionObjectiveType.CatalogSales
		      Return "CATALOG_SALES"
		    Case ConversionObjectiveType.VideoCompletion
		      Return "VIDEO_COMPLETION"
		    Case ConversionObjectiveType.AppInstall
		      Return "APP_INSTALL"
		    Case ConversionObjectiveType.Sales
		      Return "SALES"
		    Case ConversionObjectiveType.Leads
		      Return "LEADS"
		    Case ConversionObjectiveType.CtvConsideration
		      Return "CTV_CONSIDERATION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ConversionProductAttributionTypeToString(value As ConversionProductAttributionType) As String
		  Select Case value
		    Case ConversionProductAttributionType.Default
		      Return "DEFAULT"
		    Case ConversionProductAttributionType.BrandAttribution
		      Return "BRAND_ATTRIBUTION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ConversionProductReportBreakdownTypeToString(value As ConversionProductReportBreakdownType) As String
		  Select Case value
		    Case ConversionProductReportBreakdownType.ProductBrand
		      Return "PRODUCT_BRAND"
		    Case ConversionProductReportBreakdownType.ProductCategory
		      Return "PRODUCT_CATEGORY"
		    Case ConversionProductReportBreakdownType.ProductBrandAndCategory
		      Return "PRODUCT_BRAND_AND_CATEGORY"
		    Case ConversionProductReportBreakdownType.ProductSku
		      Return "PRODUCT_SKU"
		    Case ConversionProductReportBreakdownType.ProductSkuGroup
		      Return "PRODUCT_SKU_GROUP"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ConversionProductReportGranularityToString(value As ConversionProductReportGranularity) As String
		  Select Case value
		    Case ConversionProductReportGranularity.Total
		      Return "TOTAL"
		    Case ConversionProductReportGranularity.Week
		      Return "WEEK"
		    Case ConversionProductReportGranularity.Month
		      Return "MONTH"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ConversionProductReportLevelToString(value As ConversionProductReportLevel) As String
		  Select Case value
		    Case ConversionProductReportLevel.Advertiser
		      Return "ADVERTISER"
		    Case ConversionProductReportLevel.Campaign
		      Return "CAMPAIGN"
		    Case ConversionProductReportLevel.AdGroup
		      Return "AD_GROUP"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ConversionProductReportingColumnToString(value As ConversionProductReportingColumn) As String
		  Select Case value
		    Case ConversionProductReportingColumn.CampaignName
		      Return "CAMPAIGN_NAME"
		    Case ConversionProductReportingColumn.CampaignId
		      Return "CAMPAIGN_ID"
		    Case ConversionProductReportingColumn.AdvertiserId
		      Return "ADVERTISER_ID"
		    Case ConversionProductReportingColumn.AdGroupId
		      Return "AD_GROUP_ID"
		    Case ConversionProductReportingColumn.CampaignObjectiveType
		      Return "CAMPAIGN_OBJECTIVE_TYPE"
		    Case ConversionProductReportingColumn.AdGroupName
		      Return "AD_GROUP_NAME"
		    Case ConversionProductReportingColumn.ConversionProductId
		      Return "CONVERSION_PRODUCT_ID"
		    Case ConversionProductReportingColumn.ConversionProductBrand
		      Return "CONVERSION_PRODUCT_BRAND"
		    Case ConversionProductReportingColumn.ConversionProductCategory
		      Return "CONVERSION_PRODUCT_CATEGORY"
		    Case ConversionProductReportingColumn.ConversionProductIdGroup
		      Return "CONVERSION_PRODUCT_ID_GROUP"
		    Case ConversionProductReportingColumn.TotalConversionProductQuantity
		      Return "TOTAL_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalWebConversionProductQuantity
		      Return "TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalInappConversionProductQuantity
		      Return "TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalOfflineConversionProductQuantity
		      Return "TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalConversionProductValue
		      Return "TOTAL_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalWebConversionProductValue
		      Return "TOTAL_WEB_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalInappConversionProductValue
		      Return "TOTAL_INAPP_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalOfflineConversionProductValue
		      Return "TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalConversionProductValueInUsd
		      Return "TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalWebConversionProductValueInUsd
		      Return "TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalInappConversionProductValueInUsd
		      Return "TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalOfflineConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalCheckoutConversionProductQuantity
		      Return "TOTAL_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalCheckoutConversionProductValue
		      Return "TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalCheckoutConversionProductValueInUsd
		      Return "TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalWebCheckoutConversionProductQuantity
		      Return "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalWebCheckoutConversionProductValue
		      Return "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalWebCheckoutConversionProductValueInUsd
		      Return "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalInappCheckoutConversionProductQuantity
		      Return "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalInappCheckoutConversionProductValue
		      Return "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalInappCheckoutConversionProductValueInUsd
		      Return "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalOfflineCheckoutConversionProductQuantity
		      Return "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalOfflineCheckoutConversionProductValue
		      Return "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalOfflineCheckoutConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalAddToCartConversionProductQuantity
		      Return "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalAddToCartConversionProductValue
		      Return "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalAddToCartConversionProductValueInUsd
		      Return "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalWebAddToCartConversionProductQuantity
		      Return "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalWebAddToCartConversionProductValue
		      Return "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalWebAddToCartConversionProductValueInUsd
		      Return "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalInappAddToCartConversionProductQuantity
		      Return "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalInappAddToCartConversionProductValue
		      Return "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalInappAddToCartConversionProductValueInUsd
		      Return "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalPageVisitConversionProductQuantity
		      Return "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalPageVisitConversionProductValue
		      Return "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalPageVisitConversionProductValueInUsd
		      Return "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalWebPageVisitConversionProductQuantity
		      Return "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalWebPageVisitConversionProductValue
		      Return "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalWebPageVisitConversionProductValueInUsd
		      Return "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalSignupConversionProductQuantity
		      Return "TOTAL_SIGNUP_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalSignupConversionProductValue
		      Return "TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalSignupConversionProductValueInUsd
		      Return "TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalWebSignupConversionProductQuantity
		      Return "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalWebSignupConversionProductValue
		      Return "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalWebSignupConversionProductValueInUsd
		      Return "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalInappSignupConversionProductQuantity
		      Return "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalInappSignupConversionProductValue
		      Return "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalInappSignupConversionProductValueInUsd
		      Return "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalOfflineSignupConversionProductQuantity
		      Return "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalOfflineSignupConversionProductValue
		      Return "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalOfflineSignupConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalWatchVideoConversionProductQuantity
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalWatchVideoConversionProductValue
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalWatchVideoConversionProductValueInUsd
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalWebWatchVideoConversionProductQuantity
		      Return "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalWebWatchVideoConversionProductValue
		      Return "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalWebWatchVideoConversionProductValueInUsd
		      Return "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalLeadConversionProductQuantity
		      Return "TOTAL_LEAD_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalLeadConversionProductValue
		      Return "TOTAL_LEAD_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalLeadConversionProductValueInUsd
		      Return "TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalWebLeadConversionProductQuantity
		      Return "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalWebLeadConversionProductValue
		      Return "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalWebLeadConversionProductValueInUsd
		      Return "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalOfflineLeadConversionProductQuantity
		      Return "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalOfflineLeadConversionProductValue
		      Return "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalOfflineLeadConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalSearchConversionProductQuantity
		      Return "TOTAL_SEARCH_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalSearchConversionProductValue
		      Return "TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalSearchConversionProductValueInUsd
		      Return "TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalWebSearchConversionProductQuantity
		      Return "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalWebSearchConversionProductValue
		      Return "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalWebSearchConversionProductValueInUsd
		      Return "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalInappSearchConversionProductQuantity
		      Return "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalInappSearchConversionProductValue
		      Return "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalInappSearchConversionProductValueInUsd
		      Return "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalViewCategoryConversionProductQuantity
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalViewCategoryConversionProductValue
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalViewCategoryConversionProductValueInUsd
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalWebViewCategoryConversionProductQuantity
		      Return "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalWebViewCategoryConversionProductValue
		      Return "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalWebViewCategoryConversionProductValueInUsd
		      Return "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalCustomConversionProductQuantity
		      Return "TOTAL_CUSTOM_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalCustomConversionProductValue
		      Return "TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalCustomConversionProductValueInUsd
		      Return "TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalWebCustomConversionProductQuantity
		      Return "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalWebCustomConversionProductValue
		      Return "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalWebCustomConversionProductValueInUsd
		      Return "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalOfflineCustomConversionProductQuantity
		      Return "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalOfflineCustomConversionProductValue
		      Return "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalOfflineCustomConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalUnknownConversionProductQuantity
		      Return "TOTAL_UNKNOWN_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalUnknownConversionProductValue
		      Return "TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalUnknownConversionProductValueInUsd
		      Return "TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalWebUnknownConversionProductQuantity
		      Return "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalWebUnknownConversionProductValue
		      Return "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalWebUnknownConversionProductValueInUsd
		      Return "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalInappUnknownConversionProductQuantity
		      Return "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalInappUnknownConversionProductValue
		      Return "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalInappUnknownConversionProductValueInUsd
		      Return "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalOfflineUnknownConversionProductQuantity
		      Return "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalOfflineUnknownConversionProductValue
		      Return "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalOfflineUnknownConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalAddPaymentInfoConversionProductQuantity
		      Return "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalAddPaymentInfoConversionProductValue
		      Return "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalAddPaymentInfoConversionProductValueInUsd
		      Return "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalWebAddPaymentInfoConversionProductQuantity
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalWebAddPaymentInfoConversionProductValue
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalWebAddPaymentInfoConversionProductValueInUsd
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalInappAddPaymentInfoConversionProductQuantity
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalInappAddPaymentInfoConversionProductValue
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalInappAddPaymentInfoConversionProductValueInUsd
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalOfflineAddPaymentInfoConversionProductQuantity
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalOfflineAddPaymentInfoConversionProductValue
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalOfflineAddPaymentInfoConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalAddToWishlistConversionProductQuantity
		      Return "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalAddToWishlistConversionProductValue
		      Return "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalAddToWishlistConversionProductValueInUsd
		      Return "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalWebAddToWishlistConversionProductQuantity
		      Return "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalWebAddToWishlistConversionProductValue
		      Return "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalWebAddToWishlistConversionProductValueInUsd
		      Return "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalInappAddToWishlistConversionProductQuantity
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalInappAddToWishlistConversionProductValue
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalInappAddToWishlistConversionProductValueInUsd
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalOfflineAddToWishlistConversionProductQuantity
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalOfflineAddToWishlistConversionProductValue
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalOfflineAddToWishlistConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalInitiateCheckoutConversionProductQuantity
		      Return "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalInitiateCheckoutConversionProductValue
		      Return "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalInitiateCheckoutConversionProductValueInUsd
		      Return "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalWebInitiateCheckoutConversionProductQuantity
		      Return "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalWebInitiateCheckoutConversionProductValue
		      Return "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalWebInitiateCheckoutConversionProductValueInUsd
		      Return "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalInappInitiateCheckoutConversionProductQuantity
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalInappInitiateCheckoutConversionProductValue
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalInappInitiateCheckoutConversionProductValueInUsd
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalOfflineInitiateCheckoutConversionProductQuantity
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalOfflineInitiateCheckoutConversionProductValue
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalOfflineInitiateCheckoutConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalSubscribeConversionProductQuantity
		      Return "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalSubscribeConversionProductValue
		      Return "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalSubscribeConversionProductValueInUsd
		      Return "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalWebSubscribeConversionProductQuantity
		      Return "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalWebSubscribeConversionProductValue
		      Return "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalWebSubscribeConversionProductValueInUsd
		      Return "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalInappSubscribeConversionProductQuantity
		      Return "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalInappSubscribeConversionProductValue
		      Return "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalInappSubscribeConversionProductValueInUsd
		      Return "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalOfflineSubscribeConversionProductQuantity
		      Return "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalOfflineSubscribeConversionProductValue
		      Return "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalOfflineSubscribeConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalViewContentConversionProductQuantity
		      Return "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalViewContentConversionProductValue
		      Return "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalViewContentConversionProductValueInUsd
		      Return "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalWebViewContentConversionProductQuantity
		      Return "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalWebViewContentConversionProductValue
		      Return "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalWebViewContentConversionProductValueInUsd
		      Return "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalInappViewContentConversionProductQuantity
		      Return "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalInappViewContentConversionProductValue
		      Return "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalInappViewContentConversionProductValueInUsd
		      Return "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ConversionProductReportingColumn.TotalOfflineViewContentConversionProductQuantity
		      Return "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY"
		    Case ConversionProductReportingColumn.TotalOfflineViewContentConversionProductValue
		      Return "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE"
		    Case ConversionProductReportingColumn.TotalOfflineViewContentConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ConversionReportAttributionTypeToString(value As ConversionReportAttributionType) As String
		  Select Case value
		    Case ConversionReportAttributionType.Individual
		      Return "INDIVIDUAL"
		    Case ConversionReportAttributionType.Household
		      Return "HOUSEHOLD"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ConversionReportTimeTypeToString(value As ConversionReportTimeType) As String
		  Select Case value
		    Case ConversionReportTimeType.TimeOfAdAction
		      Return "TIME_OF_AD_ACTION"
		    Case ConversionReportTimeType.TimeOfConversion
		      Return "TIME_OF_CONVERSION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ConversionTagTypeToString(value As ConversionTagType) As String
		  Select Case value
		    Case ConversionTagType.PageLoad
		      Return "PAGE_LOAD"
		    Case ConversionTagType.Unknown
		      Return "UNKNOWN"
		    Case ConversionTagType.Initialized
		      Return "INITIALIZED"
		    Case ConversionTagType.PageVisit
		      Return "PAGE_VISIT"
		    Case ConversionTagType.Signup
		      Return "SIGNUP"
		    Case ConversionTagType.Checkout
		      Return "CHECKOUT"
		    Case ConversionTagType.Custom
		      Return "CUSTOM"
		    Case ConversionTagType.ViewCategory
		      Return "VIEW_CATEGORY"
		    Case ConversionTagType.Search
		      Return "SEARCH"
		    Case ConversionTagType.AddToCart
		      Return "ADD_TO_CART"
		    Case ConversionTagType.WatchVideo
		      Return "WATCH_VIDEO"
		    Case ConversionTagType.Lead
		      Return "LEAD"
		    Case ConversionTagType.AppInstall
		      Return "APP_INSTALL"
		    Case ConversionTagType.WebSession
		      Return "WEB_SESSION"
		    Case ConversionTagType.ExternalMeasurement
		      Return "EXTERNAL_MEASUREMENT"
		    Case ConversionTagType.AddPaymentInfo
		      Return "ADD_PAYMENT_INFO"
		    Case ConversionTagType.AddToWishlist
		      Return "ADD_TO_WISHLIST"
		    Case ConversionTagType.InitiateCheckout
		      Return "INITIATE_CHECKOUT"
		    Case ConversionTagType.Subscribe
		      Return "SUBSCRIBE"
		    Case ConversionTagType.ViewContent
		      Return "VIEW_CONTENT"
		    Case ConversionTagType.AdvertiserDefinedEvent
		      Return "ADVERTISER_DEFINED_EVENT"
		    Case ConversionTagType.AppOpen
		      Return "APP_OPEN"
		    Case ConversionTagType.Contact
		      Return "CONTACT"
		    Case ConversionTagType.Schedule
		      Return "SCHEDULE"
		    Case ConversionTagType.FindLocation
		      Return "FIND_LOCATION"
		    Case ConversionTagType.CustomizeProduct
		      Return "CUSTOMIZE_PRODUCT"
		    Case ConversionTagType.SubmitApplication
		      Return "SUBMIT_APPLICATION"
		    Case ConversionTagType.StartTrial
		      Return "START_TRIAL"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ConversionTagTypeOptimalToString(value As ConversionTagTypeOptimal) As String
		  Select Case value
		    Case ConversionTagTypeOptimal.PageLoad
		      Return "PAGE_LOAD"
		    Case ConversionTagTypeOptimal.Unknown
		      Return "UNKNOWN"
		    Case ConversionTagTypeOptimal.Initialized
		      Return "INITIALIZED"
		    Case ConversionTagTypeOptimal.PageVisit
		      Return "PAGE_VISIT"
		    Case ConversionTagTypeOptimal.Signup
		      Return "SIGNUP"
		    Case ConversionTagTypeOptimal.Checkout
		      Return "CHECKOUT"
		    Case ConversionTagTypeOptimal.Custom
		      Return "CUSTOM"
		    Case ConversionTagTypeOptimal.ViewCategory
		      Return "VIEW_CATEGORY"
		    Case ConversionTagTypeOptimal.Search
		      Return "SEARCH"
		    Case ConversionTagTypeOptimal.AddToCart
		      Return "ADD_TO_CART"
		    Case ConversionTagTypeOptimal.WatchVideo
		      Return "WATCH_VIDEO"
		    Case ConversionTagTypeOptimal.Lead
		      Return "LEAD"
		    Case ConversionTagTypeOptimal.AppInstall
		      Return "APP_INSTALL"
		    Case ConversionTagTypeOptimal.WebSession
		      Return "WEB_SESSION"
		    Case ConversionTagTypeOptimal.ExternalMeasurement
		      Return "EXTERNAL_MEASUREMENT"
		    Case ConversionTagTypeOptimal.AddPaymentInfo
		      Return "ADD_PAYMENT_INFO"
		    Case ConversionTagTypeOptimal.AddToWishlist
		      Return "ADD_TO_WISHLIST"
		    Case ConversionTagTypeOptimal.InitiateCheckout
		      Return "INITIATE_CHECKOUT"
		    Case ConversionTagTypeOptimal.Subscribe
		      Return "SUBSCRIBE"
		    Case ConversionTagTypeOptimal.ViewContent
		      Return "VIEW_CONTENT"
		    Case ConversionTagTypeOptimal.AdvertiserDefinedEvent
		      Return "ADVERTISER_DEFINED_EVENT"
		    Case ConversionTagTypeOptimal.AppOpen
		      Return "APP_OPEN"
		    Case ConversionTagTypeOptimal.Contact
		      Return "CONTACT"
		    Case ConversionTagTypeOptimal.Schedule
		      Return "SCHEDULE"
		    Case ConversionTagTypeOptimal.FindLocation
		      Return "FIND_LOCATION"
		    Case ConversionTagTypeOptimal.CustomizeProduct
		      Return "CUSTOMIZE_PRODUCT"
		    Case ConversionTagTypeOptimal.SubmitApplication
		      Return "SUBMIT_APPLICATION"
		    Case ConversionTagTypeOptimal.StartTrial
		      Return "START_TRIAL"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CountryToString(value As Country) As String
		  Select Case value
		    Case Country.Ad
		      Return "AD"
		    Case Country.Ae
		      Return "AE"
		    Case Country.Af
		      Return "AF"
		    Case Country.Ag
		      Return "AG"
		    Case Country.Ai
		      Return "AI"
		    Case Country.Al
		      Return "AL"
		    Case Country.Am
		      Return "AM"
		    Case Country.Ao
		      Return "AO"
		    Case Country.Aq
		      Return "AQ"
		    Case Country.Ar
		      Return "AR"
		    Case Country.Escapedas
		      Return "AS"
		    Case Country.At
		      Return "AT"
		    Case Country.Au
		      Return "AU"
		    Case Country.Aw
		      Return "AW"
		    Case Country.Ax
		      Return "AX"
		    Case Country.Az
		      Return "AZ"
		    Case Country.Ba
		      Return "BA"
		    Case Country.Bb
		      Return "BB"
		    Case Country.Bd
		      Return "BD"
		    Case Country.Be
		      Return "BE"
		    Case Country.Bf
		      Return "BF"
		    Case Country.Bg
		      Return "BG"
		    Case Country.Bh
		      Return "BH"
		    Case Country.Bi
		      Return "BI"
		    Case Country.Bj
		      Return "BJ"
		    Case Country.Bl
		      Return "BL"
		    Case Country.Bm
		      Return "BM"
		    Case Country.Bn
		      Return "BN"
		    Case Country.Bo
		      Return "BO"
		    Case Country.Bq
		      Return "BQ"
		    Case Country.Br
		      Return "BR"
		    Case Country.Bs
		      Return "BS"
		    Case Country.Bt
		      Return "BT"
		    Case Country.Bv
		      Return "BV"
		    Case Country.Bw
		      Return "BW"
		    Case Country.By
		      Return "BY"
		    Case Country.Bz
		      Return "BZ"
		    Case Country.Ca
		      Return "CA"
		    Case Country.Cc
		      Return "CC"
		    Case Country.Cd
		      Return "CD"
		    Case Country.Cf
		      Return "CF"
		    Case Country.Cg
		      Return "CG"
		    Case Country.Ch
		      Return "CH"
		    Case Country.Ci
		      Return "CI"
		    Case Country.Ck
		      Return "CK"
		    Case Country.Cl
		      Return "CL"
		    Case Country.Cm
		      Return "CM"
		    Case Country.Cn
		      Return "CN"
		    Case Country.Co
		      Return "CO"
		    Case Country.Cr
		      Return "CR"
		    Case Country.Cu
		      Return "CU"
		    Case Country.Cv
		      Return "CV"
		    Case Country.Cw
		      Return "CW"
		    Case Country.Cx
		      Return "CX"
		    Case Country.Cy
		      Return "CY"
		    Case Country.Cz
		      Return "CZ"
		    Case Country.De
		      Return "DE"
		    Case Country.Dj
		      Return "DJ"
		    Case Country.Dk
		      Return "DK"
		    Case Country.Dm
		      Return "DM"
		    Case Country.Escapeddo
		      Return "DO"
		    Case Country.Dz
		      Return "DZ"
		    Case Country.Ec
		      Return "EC"
		    Case Country.Ee
		      Return "EE"
		    Case Country.Eg
		      Return "EG"
		    Case Country.Eh
		      Return "EH"
		    Case Country.Er
		      Return "ER"
		    Case Country.Es
		      Return "ES"
		    Case Country.Et
		      Return "ET"
		    Case Country.Fi
		      Return "FI"
		    Case Country.Fj
		      Return "FJ"
		    Case Country.Fk
		      Return "FK"
		    Case Country.Fm
		      Return "FM"
		    Case Country.Fo
		      Return "FO"
		    Case Country.Fr
		      Return "FR"
		    Case Country.Ga
		      Return "GA"
		    Case Country.Gb
		      Return "GB"
		    Case Country.Gd
		      Return "GD"
		    Case Country.Ge
		      Return "GE"
		    Case Country.Gf
		      Return "GF"
		    Case Country.Gg
		      Return "GG"
		    Case Country.Gh
		      Return "GH"
		    Case Country.Gi
		      Return "GI"
		    Case Country.Gl
		      Return "GL"
		    Case Country.Gm
		      Return "GM"
		    Case Country.Gn
		      Return "GN"
		    Case Country.Gp
		      Return "GP"
		    Case Country.Gq
		      Return "GQ"
		    Case Country.Gr
		      Return "GR"
		    Case Country.Gs
		      Return "GS"
		    Case Country.Gt
		      Return "GT"
		    Case Country.Gu
		      Return "GU"
		    Case Country.Gw
		      Return "GW"
		    Case Country.Gy
		      Return "GY"
		    Case Country.Hk
		      Return "HK"
		    Case Country.Hm
		      Return "HM"
		    Case Country.Hn
		      Return "HN"
		    Case Country.Hr
		      Return "HR"
		    Case Country.Ht
		      Return "HT"
		    Case Country.Hu
		      Return "HU"
		    Case Country.Id
		      Return "ID"
		    Case Country.Ie
		      Return "IE"
		    Case Country.Il
		      Return "IL"
		    Case Country.Im
		      Return "IM"
		    Case Country.Escapedin
		      Return "IN"
		    Case Country.Io
		      Return "IO"
		    Case Country.Iq
		      Return "IQ"
		    Case Country.Ir
		      Return "IR"
		    Case Country.Escapedis
		      Return "IS"
		    Case Country.It
		      Return "IT"
		    Case Country.Je
		      Return "JE"
		    Case Country.Jm
		      Return "JM"
		    Case Country.Jo
		      Return "JO"
		    Case Country.Jp
		      Return "JP"
		    Case Country.Ke
		      Return "KE"
		    Case Country.Kg
		      Return "KG"
		    Case Country.Kh
		      Return "KH"
		    Case Country.Ki
		      Return "KI"
		    Case Country.Km
		      Return "KM"
		    Case Country.Kn
		      Return "KN"
		    Case Country.Kr
		      Return "KR"
		    Case Country.Kw
		      Return "KW"
		    Case Country.Ky
		      Return "KY"
		    Case Country.Kz
		      Return "KZ"
		    Case Country.La
		      Return "LA"
		    Case Country.Lb
		      Return "LB"
		    Case Country.Lc
		      Return "LC"
		    Case Country.Li
		      Return "LI"
		    Case Country.Lk
		      Return "LK"
		    Case Country.Lr
		      Return "LR"
		    Case Country.Ls
		      Return "LS"
		    Case Country.Lt
		      Return "LT"
		    Case Country.Lu
		      Return "LU"
		    Case Country.Lv
		      Return "LV"
		    Case Country.Ly
		      Return "LY"
		    Case Country.Ma
		      Return "MA"
		    Case Country.Mc
		      Return "MC"
		    Case Country.Md
		      Return "MD"
		    Case Country.Escapedme
		      Return "ME"
		    Case Country.Mf
		      Return "MF"
		    Case Country.Mg
		      Return "MG"
		    Case Country.Mh
		      Return "MH"
		    Case Country.Mk
		      Return "MK"
		    Case Country.Ml
		      Return "ML"
		    Case Country.Mm
		      Return "MM"
		    Case Country.Mn
		      Return "MN"
		    Case Country.Mo
		      Return "MO"
		    Case Country.Mp
		      Return "MP"
		    Case Country.Mq
		      Return "MQ"
		    Case Country.Mr
		      Return "MR"
		    Case Country.Ms
		      Return "MS"
		    Case Country.Mt
		      Return "MT"
		    Case Country.Mu
		      Return "MU"
		    Case Country.Mv
		      Return "MV"
		    Case Country.Mw
		      Return "MW"
		    Case Country.Mx
		      Return "MX"
		    Case Country.My
		      Return "MY"
		    Case Country.Mz
		      Return "MZ"
		    Case Country.Na
		      Return "NA"
		    Case Country.Nc
		      Return "NC"
		    Case Country.Ne
		      Return "NE"
		    Case Country.Nf
		      Return "NF"
		    Case Country.Ng
		      Return "NG"
		    Case Country.Ni
		      Return "NI"
		    Case Country.Nl
		      Return "NL"
		    Case Country.Escapedfalse
		      Return "false"
		    Case Country.Np
		      Return "NP"
		    Case Country.Nr
		      Return "NR"
		    Case Country.Nu
		      Return "NU"
		    Case Country.Nz
		      Return "NZ"
		    Case Country.Om
		      Return "OM"
		    Case Country.Pa
		      Return "PA"
		    Case Country.Pe
		      Return "PE"
		    Case Country.Pf
		      Return "PF"
		    Case Country.Pg
		      Return "PG"
		    Case Country.Ph
		      Return "PH"
		    Case Country.Pk
		      Return "PK"
		    Case Country.Pl
		      Return "PL"
		    Case Country.Pm
		      Return "PM"
		    Case Country.Pn
		      Return "PN"
		    Case Country.Pr
		      Return "PR"
		    Case Country.Ps
		      Return "PS"
		    Case Country.Pt
		      Return "PT"
		    Case Country.Pw
		      Return "PW"
		    Case Country.Py
		      Return "PY"
		    Case Country.Qa
		      Return "QA"
		    Case Country.Re
		      Return "RE"
		    Case Country.Ro
		      Return "RO"
		    Case Country.Rs
		      Return "RS"
		    Case Country.Ru
		      Return "RU"
		    Case Country.Rw
		      Return "RW"
		    Case Country.Sa
		      Return "SA"
		    Case Country.Sb
		      Return "SB"
		    Case Country.Sc
		      Return "SC"
		    Case Country.Sd
		      Return "SD"
		    Case Country.Se
		      Return "SE"
		    Case Country.Sg
		      Return "SG"
		    Case Country.Sh
		      Return "SH"
		    Case Country.Si
		      Return "SI"
		    Case Country.Sj
		      Return "SJ"
		    Case Country.Sk
		      Return "SK"
		    Case Country.Sl
		      Return "SL"
		    Case Country.Sm
		      Return "SM"
		    Case Country.Sn
		      Return "SN"
		    Case Country.So
		      Return "SO"
		    Case Country.Sr
		      Return "SR"
		    Case Country.Ss
		      Return "SS"
		    Case Country.St
		      Return "ST"
		    Case Country.Sv
		      Return "SV"
		    Case Country.Sx
		      Return "SX"
		    Case Country.Sy
		      Return "SY"
		    Case Country.Sz
		      Return "SZ"
		    Case Country.Tc
		      Return "TC"
		    Case Country.Td
		      Return "TD"
		    Case Country.Tf
		      Return "TF"
		    Case Country.Tg
		      Return "TG"
		    Case Country.Th
		      Return "TH"
		    Case Country.Tj
		      Return "TJ"
		    Case Country.Tk
		      Return "TK"
		    Case Country.Tl
		      Return "TL"
		    Case Country.Tm
		      Return "TM"
		    Case Country.Tn
		      Return "TN"
		    Case Country.Escapedto
		      Return "TO"
		    Case Country.Tr
		      Return "TR"
		    Case Country.Tt
		      Return "TT"
		    Case Country.Tv
		      Return "TV"
		    Case Country.Tw
		      Return "TW"
		    Case Country.Tz
		      Return "TZ"
		    Case Country.Ua
		      Return "UA"
		    Case Country.Ug
		      Return "UG"
		    Case Country.Um
		      Return "UM"
		    Case Country.Us
		      Return "US"
		    Case Country.Uy
		      Return "UY"
		    Case Country.Uz
		      Return "UZ"
		    Case Country.Va
		      Return "VA"
		    Case Country.Vc
		      Return "VC"
		    Case Country.Ve
		      Return "VE"
		    Case Country.Vg
		      Return "VG"
		    Case Country.Vi
		      Return "VI"
		    Case Country.Vn
		      Return "VN"
		    Case Country.Vu
		      Return "VU"
		    Case Country.Wf
		      Return "WF"
		    Case Country.Ws
		      Return "WS"
		    Case Country.Ye
		      Return "YE"
		    Case Country.Yt
		      Return "YT"
		    Case Country.Za
		      Return "ZA"
		    Case Country.Zm
		      Return "ZM"
		    Case Country.Zw
		      Return "ZW"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CreationSourceToString(value As CreationSource) As String
		  Select Case value
		    Case CreationSource.AdsApi
		      Return "ADS_API"
		    Case CreationSource.AdsManagerReportingPage
		      Return "ADS_MANAGER_REPORTING_PAGE"
		    Case CreationSource.AdsManagerReportBuilder
		      Return "ADS_MANAGER_REPORT_BUILDER"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CreativeAssetsVisibilityTypeToString(value As CreativeAssetsVisibilityType) As String
		  Select Case value
		    Case CreativeAssetsVisibilityType.Visible
		      Return "VISIBLE"
		    Case CreativeAssetsVisibilityType.Hidden
		      Return "HIDDEN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CreativeTypeToString(value As CreativeType) As String
		  Select Case value
		    Case CreativeType.Regular
		      Return "REGULAR"
		    Case CreativeType.Video
		      Return "VIDEO"
		    Case CreativeType.Shopping
		      Return "SHOPPING"
		    Case CreativeType.Carousel
		      Return "CAROUSEL"
		    Case CreativeType.MaxVideo
		      Return "MAX_VIDEO"
		    Case CreativeType.ShopThePin
		      Return "SHOP_THE_PIN"
		    Case CreativeType.Collection
		      Return "COLLECTION"
		    Case CreativeType.Idea
		      Return "IDEA"
		    Case CreativeType.Showcase
		      Return "SHOWCASE"
		    Case CreativeType.Quiz
		      Return "QUIZ"
		    Case CreativeType.Collage
		      Return "COLLAGE"
		    Case CreativeType.MaxWidthRegularCollection
		      Return "MAX_WIDTH_REGULAR_COLLECTION"
		    Case CreativeType.MaxWidthVideoCollection
		      Return "MAX_WIDTH_VIDEO_COLLECTION"
		    Case CreativeType.App
		      Return "APP"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CurrencyToString(value As Currency) As String
		  Select Case value
		    Case Currency.Unk
		      Return "UNK"
		    Case Currency.Usd
		      Return "USD"
		    Case Currency.Gbp
		      Return "GBP"
		    Case Currency.Cad
		      Return "CAD"
		    Case Currency.Eur
		      Return "EUR"
		    Case Currency.Aud
		      Return "AUD"
		    Case Currency.Nzd
		      Return "NZD"
		    Case Currency.Sek
		      Return "SEK"
		    Case Currency.Ils
		      Return "ILS"
		    Case Currency.Chf
		      Return "CHF"
		    Case Currency.Hkd
		      Return "HKD"
		    Case Currency.Jpy
		      Return "JPY"
		    Case Currency.Sgd
		      Return "SGD"
		    Case Currency.Krw
		      Return "KRW"
		    Case Currency.Nok
		      Return "NOK"
		    Case Currency.Dkk
		      Return "DKK"
		    Case Currency.Pln
		      Return "PLN"
		    Case Currency.Ron
		      Return "RON"
		    Case Currency.Huf
		      Return "HUF"
		    Case Currency.Czk
		      Return "CZK"
		    Case Currency.Brl
		      Return "BRL"
		    Case Currency.Mxn
		      Return "MXN"
		    Case Currency.Ars
		      Return "ARS"
		    Case Currency.Clp
		      Return "CLP"
		    Case Currency.Cop
		      Return "COP"
		    Case Currency.Inr
		      Return "INR"
		    Case Currency.Escapedtry
		      Return "TRY"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CustomerListStatusToString(value As CustomerListStatus) As String
		  Select Case value
		    Case CustomerListStatus.Processing
		      Return "PROCESSING"
		    Case CustomerListStatus.Ready
		      Return "READY"
		    Case CustomerListStatus.TooSmall
		      Return "TOO_SMALL"
		    Case CustomerListStatus.Uploading
		      Return "UPLOADING"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CustomizableCTATypeToString(value As CustomizableCTAType) As String
		  Select Case value
		    Case CustomizableCTAType.GetOffer
		      Return "GET_OFFER"
		    Case CustomizableCTAType.LearnMore
		      Return "LEARN_MORE"
		    Case CustomizableCTAType.OrderNow
		      Return "ORDER_NOW"
		    Case CustomizableCTAType.ShopNow
		      Return "SHOP_NOW"
		    Case CustomizableCTAType.SignUp
		      Return "SIGN_UP"
		    Case CustomizableCTAType.Subscribe
		      Return "SUBSCRIBE"
		    Case CustomizableCTAType.BuyNow
		      Return "BUY_NOW"
		    Case CustomizableCTAType.ContactUs
		      Return "CONTACT_US"
		    Case CustomizableCTAType.GetQuote
		      Return "GET_QUOTE"
		    Case CustomizableCTAType.VisitSite
		      Return "VISIT_SITE"
		    Case CustomizableCTAType.ApplyNow
		      Return "APPLY_NOW"
		    Case CustomizableCTAType.BookNow
		      Return "BOOK_NOW"
		    Case CustomizableCTAType.RequestDemo
		      Return "REQUEST_DEMO"
		    Case CustomizableCTAType.RegisterNow
		      Return "REGISTER_NOW"
		    Case CustomizableCTAType.FindADealer
		      Return "FIND_A_DEALER"
		    Case CustomizableCTAType.AddToCart
		      Return "ADD_TO_CART"
		    Case CustomizableCTAType.WatchNow
		      Return "WATCH_NOW"
		    Case CustomizableCTAType.ReadMore
		      Return "READ_MORE"
		    Case CustomizableCTAType.BuyTickets
		      Return "BUY_TICKETS"
		    Case CustomizableCTAType.DonateNow
		      Return "DONATE_NOW"
		    Case CustomizableCTAType.Download
		      Return "DOWNLOAD"
		    Case CustomizableCTAType.ExploreMore
		      Return "EXPLORE_MORE"
		    Case CustomizableCTAType.FindALocation
		      Return "FIND_A_LOCATION"
		    Case CustomizableCTAType.FindRetailers
		      Return "FIND_RETAILERS"
		    Case CustomizableCTAType.GetDeal
		      Return "GET_DEAL"
		    Case CustomizableCTAType.GetRecipe
		      Return "GET_RECIPE"
		    Case CustomizableCTAType.GetShowtimes
		      Return "GET_SHOWTIMES"
		    Case CustomizableCTAType.OnSale
		      Return "ON_SALE"
		    Case CustomizableCTAType.PlayGame
		      Return "PLAY_GAME"
		    Case CustomizableCTAType.TryIt
		      Return "TRY_IT"
		    Case CustomizableCTAType.TakeAPeek
		      Return "TAKE_A_PEEK"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function DataOutputFormatToString(value As DataOutputFormat) As String
		  Select Case value
		    Case DataOutputFormat.Json
		      Return "JSON"
		    Case DataOutputFormat.Csv
		      Return "CSV"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function DataStatusToString(value As DataStatus) As String
		  Select Case value
		    Case DataStatus.Processing
		      Return "PROCESSING"
		    Case DataStatus.Ready
		      Return "READY"
		    Case DataStatus.Estimate
		      Return "ESTIMATE"
		    Case DataStatus.BeforeBusinessCreated
		      Return "BEFORE_BUSINESS_CREATED"
		    Case DataStatus.BeforeDataRetentionPeriod
		      Return "BEFORE_DATA_RETENTION_PERIOD"
		    Case DataStatus.BeforePinDataRetentionPeriod
		      Return "BEFORE_PIN_DATA_RETENTION_PERIOD"
		    Case DataStatus.BeforeMetricStartDate
		      Return "BEFORE_METRIC_START_DATE"
		    Case DataStatus.BeforeCoreMetricStartDate
		      Return "BEFORE_CORE_METRIC_START_DATE"
		    Case DataStatus.BeforePinFormatMetricStartDate
		      Return "BEFORE_PIN_FORMAT_METRIC_START_DATE"
		    Case DataStatus.BeforeAudienceMetricStartDate
		      Return "BEFORE_AUDIENCE_METRIC_START_DATE"
		    Case DataStatus.BeforeAudienceMonthlyMetricStartDate
		      Return "BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE"
		    Case DataStatus.BeforeVideoMetricStartDate
		      Return "BEFORE_VIDEO_METRIC_START_DATE"
		    Case DataStatus.BeforeConversionMetricStartDate
		      Return "BEFORE_CONVERSION_METRIC_START_DATE"
		    Case DataStatus.PurchasersMetricSmallerThanThreshold
		      Return "PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD"
		    Case DataStatus.InBadTagDate
		      Return "IN_BAD_TAG_DATE"
		    Case DataStatus.BeforePublishedMetricStartDate
		      Return "BEFORE_PUBLISHED_METRIC_START_DATE"
		    Case DataStatus.BeforeAssistMetricStartDate
		      Return "BEFORE_ASSIST_METRIC_START_DATE"
		    Case DataStatus.BeforePinCreated
		      Return "BEFORE_PIN_CREATED"
		    Case DataStatus.BeforeAccountClaimed
		      Return "BEFORE_ACCOUNT_CLAIMED"
		    Case DataStatus.BeforeDemographicFiltersStartDate
		      Return "BEFORE_DEMOGRAPHIC_FILTERS_START_DATE"
		    Case DataStatus.AudienceSegmentSmallerThanThreshold
		      Return "AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD"
		    Case DataStatus.AudienceTotalSmallerThanThreshold
		      Return "AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD"
		    Case DataStatus.BeforeProductGroupFilterStartDate
		      Return "BEFORE_PRODUCT_GROUP_FILTER_START_DATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function DeliveryEstimateObjectiveTypeToString(value As DeliveryEstimateObjectiveType) As String
		  Select Case value
		    Case DeliveryEstimateObjectiveType.Awareness
		      Return "AWARENESS"
		    Case DeliveryEstimateObjectiveType.Consideration
		      Return "CONSIDERATION"
		    Case DeliveryEstimateObjectiveType.CatalogSales
		      Return "CATALOG_SALES"
		    Case DeliveryEstimateObjectiveType.WebConversion
		      Return "WEB_CONVERSION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function DisclosureTypeToString(value As DisclosureType) As String
		  Select Case value
		    Case DisclosureType.NoDisclosure
		      Return "NO_DISCLOSURE"
		    Case DisclosureType.PrescribingInformation
		      Return "PRESCRIBING_INFORMATION"
		    Case DisclosureType.PrescribingInformationBoxWarning
		      Return "PRESCRIBING_INFORMATION_BOX_WARNING"
		    Case DisclosureType.ImportantSafetyInfo
		      Return "IMPORTANT_SAFETY_INFO"
		    Case DisclosureType.MedGuide
		      Return "MED_GUIDE"
		    Case DisclosureType.PatientInformation
		      Return "PATIENT_INFORMATION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function DiscountStatusToString(value As DiscountStatus) As String
		  Select Case value
		    Case DiscountStatus.Other
		      Return "OTHER"
		    Case DiscountStatus.Active
		      Return "ACTIVE"
		    Case DiscountStatus.Paused
		      Return "PAUSED"
		    Case DiscountStatus.Scheduled
		      Return "SCHEDULED"
		    Case DiscountStatus.Expired
		      Return "EXPIRED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function EnhancedMatchStatusTypeToString(value As EnhancedMatchStatusType) As String
		  Select Case value
		    Case EnhancedMatchStatusType.Unknown
		      Return "UNKNOWN"
		    Case EnhancedMatchStatusType.NotValidated
		      Return "NOT_VALIDATED"
		    Case EnhancedMatchStatusType.ValidatingInProgress
		      Return "VALIDATING_IN_PROGRESS"
		    Case EnhancedMatchStatusType.ValidationComplete
		      Return "VALIDATION_COMPLETE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function EntityLabelStatusToString(value As EntityLabelStatus) As String
		  Select Case value
		    Case EntityLabelStatus.Active
		      Return "ACTIVE"
		    Case EntityLabelStatus.Archived
		      Return "ARCHIVED"
		    Case EntityLabelStatus.Null
		      Return "NULL"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function EntityStatusToString(value As EntityStatus) As String
		  Select Case value
		    Case EntityStatus.Active
		      Return "ACTIVE"
		    Case EntityStatus.Paused
		      Return "PAUSED"
		    Case EntityStatus.Archived
		      Return "ARCHIVED"
		    Case EntityStatus.Draft
		      Return "DRAFT"
		    Case EntityStatus.DeletedDraft
		      Return "DELETED_DRAFT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function EventProcessingStatusToString(value As EventProcessingStatus) As String
		  Select Case value
		    Case EventProcessingStatus.Failed
		      Return "failed"
		    Case EventProcessingStatus.Processed
		      Return "processed"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function FilterOperatorTypeToString(value As FilterOperatorType) As String
		  Select Case value
		    Case FilterOperatorType.Escapedis
		      Return "IS"
		    Case FilterOperatorType.Contains
		      Return "CONTAINS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function FormFactorToString(value As FormFactor) As String
		  Select Case value
		    Case FormFactor.Desktop
		      Return "desktop"
		    Case FormFactor.Laptop
		      Return "laptop"
		    Case FormFactor.Cellphone
		      Return "cellphone"
		    Case FormFactor.Tablet
		      Return "tablet"
		    Case FormFactor.Smartwatch
		      Return "smartwatch"
		    Case FormFactor.Tv
		      Return "tv"
		    Case FormFactor.Vr
		      Return "vr"
		    Case FormFactor.Console
		      Return "console"
		    Case FormFactor.Other
		      Return "other"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function FreqBidMultiplierTimeWindowToString(value As FreqBidMultiplierTimeWindow) As String
		  Select Case value
		    Case FreqBidMultiplierTimeWindow.Week
		      Return "WEEK"
		    Case FreqBidMultiplierTimeWindow.Month
		      Return "MONTH"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function FrequencyGoalMetadataTimerangeToString(value As FrequencyGoalMetadataTimerange) As String
		  Select Case value
		    Case FrequencyGoalMetadataTimerange.ThirtyDay
		      Return "THIRTY_DAY"
		    Case FrequencyGoalMetadataTimerange.Day
		      Return "DAY"
		    Case FrequencyGoalMetadataTimerange.SevenDay
		      Return "SEVEN_DAY"
		    Case FrequencyGoalMetadataTimerange.TwentyMinute
		      Return "TWENTY_MINUTE"
		    Case FrequencyGoalMetadataTimerange.TenMinute
		      Return "TEN_MINUTE"
		    Case FrequencyGoalMetadataTimerange.TwentyFourHour
		      Return "TWENTY_FOUR_HOUR"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function GenderToString(value As Gender) As String
		  Select Case value
		    Case Gender.Female
		      Return "FEMALE"
		    Case Gender.Male
		      Return "MALE"
		    Case Gender.Unisex
		      Return "UNISEX"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function GenderBucketToString(value As GenderBucket) As String
		  Select Case value
		    Case GenderBucket.Male
		      Return "MALE"
		    Case GenderBucket.Female
		      Return "FEMALE"
		    Case GenderBucket.Unspecified
		      Return "UNSPECIFIED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function GranularityToString(value As Granularity) As String
		  Select Case value
		    Case Granularity.Total
		      Return "TOTAL"
		    Case Granularity.Day
		      Return "DAY"
		    Case Granularity.Hour
		      Return "HOUR"
		    Case Granularity.Week
		      Return "WEEK"
		    Case Granularity.Month
		      Return "MONTH"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function GridClickTypeToString(value As GridClickType) As String
		  Select Case value
		    Case GridClickType.Closeup
		      Return "CLOSEUP"
		    Case GridClickType.DirectToDestination
		      Return "DIRECT_TO_DESTINATION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function HttpMethodToString(value As HttpMethod) As String
		  Select Case value
		    Case HttpMethod.Get
		      Return "GET"
		    Case HttpMethod.Head
		      Return "HEAD"
		    Case HttpMethod.Post
		      Return "POST"
		    Case HttpMethod.Put
		      Return "PUT"
		    Case HttpMethod.Delete
		      Return "DELETE"
		    Case HttpMethod.Connect
		      Return "CONNECT"
		    Case HttpMethod.Options
		      Return "OPTIONS"
		    Case HttpMethod.Trace
		      Return "TRACE"
		    Case HttpMethod.Patch
		      Return "PATCH"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function IneligibleProductTagReasonToString(value As IneligibleProductTagReason) As String
		  Select Case value
		    Case IneligibleProductTagReason.PinMissing
		      Return "PIN_MISSING"
		    Case IneligibleProductTagReason.PinIsPrivate
		      Return "PIN_IS_PRIVATE"
		    Case IneligibleProductTagReason.ProductMetadataMissing
		      Return "PRODUCT_METADATA_MISSING"
		    Case IneligibleProductTagReason.PinNotFromVerifiedDomain
		      Return "PIN_NOT_FROM_VERIFIED_DOMAIN"
		    Case IneligibleProductTagReason.PinNotFromSameUserAsHeroPin
		      Return "PIN_NOT_FROM_SAME_USER_AS_HERO_PIN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function IngestionSourceToString(value As IngestionSource) As String
		  Select Case value
		    Case IngestionSource.Tag
		      Return "TAG"
		    Case IngestionSource.Mmp
		      Return "MMP"
		    Case IngestionSource.FileUpload
		      Return "FILE_UPLOAD"
		    Case IngestionSource.ConversionsApi
		      Return "CONVERSIONS_API"
		    Case IngestionSource.Native
		      Return "NATIVE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function IngestionSourceOptionsToString(value As IngestionSourceOptions) As String
		  Select Case value
		    Case IngestionSourceOptions.Tag
		      Return "TAG"
		    Case IngestionSourceOptions.Mmp
		      Return "MMP"
		    Case IngestionSourceOptions.FileUpload
		      Return "FILE_UPLOAD"
		    Case IngestionSourceOptions.ConversionsApi
		      Return "CONVERSIONS_API"
		    Case IngestionSourceOptions.Native
		      Return "NATIVE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function IntegrationLogEventTypeToString(value As IntegrationLogEventType) As String
		  Select Case value
		    Case IntegrationLogEventType.App
		      Return "APP"
		    Case IntegrationLogEventType.Api
		      Return "API"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function IntegrationLogLevelToString(value As IntegrationLogLevel) As String
		  Select Case value
		    Case IntegrationLogLevel.Info
		      Return "INFO"
		    Case IntegrationLogLevel.Warn
		      Return "WARN"
		    Case IntegrationLogLevel.Error
		      Return "ERROR"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function IntendedPromotionTypeToString(value As IntendedPromotionType) As String
		  Select Case value
		    Case IntendedPromotionType.Legacy
		      Return "LEGACY"
		    Case IntendedPromotionType.StandardAd
		      Return "STANDARD_AD"
		    Case IntendedPromotionType.Catalog
		      Return "CATALOG"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function InterestsEnumToString(value As InterestsEnum) As String
		  Select Case value
		    Case InterestsEnum.All
		      Return "ALL"
		    Case InterestsEnum.Animals
		      Return "ANIMALS"
		    Case InterestsEnum.Architecture
		      Return "ARCHITECTURE"
		    Case InterestsEnum.Art
		      Return "ART"
		    Case InterestsEnum.Beauty
		      Return "BEAUTY"
		    Case InterestsEnum.DiyAndCrafts
		      Return "DIY_AND_CRAFTS"
		    Case InterestsEnum.Education
		      Return "EDUCATION"
		    Case InterestsEnum.EventPlanning
		      Return "EVENT_PLANNING"
		    Case InterestsEnum.Fashion
		      Return "FASHION"
		    Case InterestsEnum.FoodAndDrinks
		      Return "FOOD_AND_DRINKS"
		    Case InterestsEnum.Gardening
		      Return "GARDENING"
		    Case InterestsEnum.Health
		      Return "HEALTH"
		    Case InterestsEnum.HomeDecor
		      Return "HOME_DECOR"
		    Case InterestsEnum.Parenting
		      Return "PARENTING"
		    Case InterestsEnum.Travel
		      Return "TRAVEL"
		    Case InterestsEnum.Wedding
		      Return "WEDDING"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function InviteFilterStatusToString(value As InviteFilterStatus) As String
		  Select Case value
		    Case InviteFilterStatus.Pending
		      Return "PENDING"
		    Case InviteFilterStatus.Expired
		      Return "EXPIRED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function InviteStatusToString(value As InviteStatus) As String
		  Select Case value
		    Case InviteStatus.Pending
		      Return "PENDING"
		    Case InviteStatus.Accepted
		      Return "ACCEPTED"
		    Case InviteStatus.Declined
		      Return "DECLINED"
		    Case InviteStatus.Cancelled
		      Return "CANCELLED"
		    Case InviteStatus.Expired
		      Return "EXPIRED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function InviteTypeToString(value As InviteType) As String
		  Select Case value
		    Case InviteType.MemberInvite
		      Return "MEMBER_INVITE"
		    Case InviteType.PartnerInvite
		      Return "PARTNER_INVITE"
		    Case InviteType.PartnerRequest
		      Return "PARTNER_REQUEST"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ItemAvailabilityToString(value As ItemAvailability) As String
		  Select Case value
		    Case ItemAvailability.InStock
		      Return "in stock"
		    Case ItemAvailability.OutOfStock
		      Return "out of stock"
		    Case ItemAvailability.Preorder
		      Return "preorder"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ItemProcessingStatusToString(value As ItemProcessingStatus) As String
		  Select Case value
		    Case ItemProcessingStatus.Success
		      Return "SUCCESS"
		    Case ItemProcessingStatus.Failure
		      Return "FAILURE"
		    Case ItemProcessingStatus.Processing
		      Return "PROCESSING"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function LabelParentTypeToString(value As LabelParentType) As String
		  Select Case value
		    Case LabelParentType.Campaign
		      Return "CAMPAIGN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function LabelStatusToString(value As LabelStatus) As String
		  Select Case value
		    Case LabelStatus.Active
		      Return "ACTIVE"
		    Case LabelStatus.Archived
		      Return "ARCHIVED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function LabelStatusBulkUpdateToString(value As LabelStatusBulkUpdate) As String
		  Select Case value
		    Case LabelStatusBulkUpdate.Archived
		      Return "ARCHIVED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function LabelTypeToString(value As LabelType) As String
		  Select Case value
		    Case LabelType.Brand
		      Return "BRAND"
		    Case LabelType.Custom
		      Return "CUSTOM"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function LanguageToString(value As Language) As String
		  Select Case value
		    Case Language.Am
		      Return "AM"
		    Case Language.Ar
		      Return "AR"
		    Case Language.Az
		      Return "AZ"
		    Case Language.Bg
		      Return "BG"
		    Case Language.Bn
		      Return "BN"
		    Case Language.Bs
		      Return "BS"
		    Case Language.Ca
		      Return "CA"
		    Case Language.Cs
		      Return "CS"
		    Case Language.Da
		      Return "DA"
		    Case Language.Dv
		      Return "DV"
		    Case Language.Dz
		      Return "DZ"
		    Case Language.De
		      Return "DE"
		    Case Language.El
		      Return "EL"
		    Case Language.En
		      Return "EN"
		    Case Language.Es
		      Return "ES"
		    Case Language.Et
		      Return "ET"
		    Case Language.Fa
		      Return "FA"
		    Case Language.Fi
		      Return "FI"
		    Case Language.Fr
		      Return "FR"
		    Case Language.He
		      Return "HE"
		    Case Language.Hi
		      Return "HI"
		    Case Language.Hr
		      Return "HR"
		    Case Language.Hu
		      Return "HU"
		    Case Language.Hy
		      Return "HY"
		    Case Language.Id
		      Return "ID"
		    Case Language.Escapedin
		      Return "IN"
		    Case Language.Escapedis
		      Return "IS"
		    Case Language.It
		      Return "IT"
		    Case Language.Iw
		      Return "IW"
		    Case Language.Ja
		      Return "JA"
		    Case Language.Ka
		      Return "KA"
		    Case Language.Km
		      Return "KM"
		    Case Language.Ko
		      Return "KO"
		    Case Language.Lo
		      Return "LO"
		    Case Language.Lt
		      Return "LT"
		    Case Language.Lv
		      Return "LV"
		    Case Language.Mk
		      Return "MK"
		    Case Language.Mn
		      Return "MN"
		    Case Language.Ms
		      Return "MS"
		    Case Language.My
		      Return "MY"
		    Case Language.Nb
		      Return "NB"
		    Case Language.Ne
		      Return "NE"
		    Case Language.Nl
		      Return "NL"
		    Case Language.Escapedfalse
		      Return "false"
		    Case Language.Pl
		      Return "PL"
		    Case Language.Pt
		      Return "PT"
		    Case Language.Ro
		      Return "RO"
		    Case Language.Ru
		      Return "RU"
		    Case Language.Sk
		      Return "SK"
		    Case Language.Sl
		      Return "SL"
		    Case Language.Sq
		      Return "SQ"
		    Case Language.Sr
		      Return "SR"
		    Case Language.Sv
		      Return "SV"
		    Case Language.Tl
		      Return "TL"
		    Case Language.Uk
		      Return "UK"
		    Case Language.Vi
		      Return "VI"
		    Case Language.Te
		      Return "TE"
		    Case Language.Th
		      Return "TH"
		    Case Language.Tr
		      Return "TR"
		    Case Language.Xx
		      Return "XX"
		    Case Language.Zh
		      Return "ZH"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function LeadFormQuestionFieldTypeToString(value As LeadFormQuestionFieldType) As String
		  Select Case value
		    Case LeadFormQuestionFieldType.TextField
		      Return "TEXT_FIELD"
		    Case LeadFormQuestionFieldType.TextArea
		      Return "TEXT_AREA"
		    Case LeadFormQuestionFieldType.RadioList
		      Return "RADIO_LIST"
		    Case LeadFormQuestionFieldType.Checkbox
		      Return "CHECKBOX"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function LeadFormQuestionTypeToString(value As LeadFormQuestionType) As String
		  Select Case value
		    Case LeadFormQuestionType.Custom
		      Return "CUSTOM"
		    Case LeadFormQuestionType.FullName
		      Return "FULL_NAME"
		    Case LeadFormQuestionType.FirstName
		      Return "FIRST_NAME"
		    Case LeadFormQuestionType.LastName
		      Return "LAST_NAME"
		    Case LeadFormQuestionType.Email
		      Return "EMAIL"
		    Case LeadFormQuestionType.PhoneNumber
		      Return "PHONE_NUMBER"
		    Case LeadFormQuestionType.ZipCode
		      Return "ZIP_CODE"
		    Case LeadFormQuestionType.Gender
		      Return "GENDER"
		    Case LeadFormQuestionType.City
		      Return "CITY"
		    Case LeadFormQuestionType.Country
		      Return "COUNTRY"
		    Case LeadFormQuestionType.StateProvince
		      Return "STATE_PROVINCE"
		    Case LeadFormQuestionType.Address
		      Return "ADDRESS"
		    Case LeadFormQuestionType.DateOfBirth
		      Return "DATE_OF_BIRTH"
		    Case LeadFormQuestionType.Age
		      Return "AGE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function LeadFormStatusToString(value As LeadFormStatus) As String
		  Select Case value
		    Case LeadFormStatus.Draft
		      Return "DRAFT"
		    Case LeadFormStatus.Active
		      Return "ACTIVE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function LeadsExportStatusToString(value As LeadsExportStatus) As String
		  Select Case value
		    Case LeadsExportStatus.InProgress
		      Return "IN_PROGRESS"
		    Case LeadsExportStatus.Finished
		      Return "FINISHED"
		    Case LeadsExportStatus.Failed
		      Return "FAILED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function LookbackPeriodOptionsToString(value As LookbackPeriodOptions) As String
		  Select Case value
		    Case LookbackPeriodOptions.Escaped1d
		      Return "1d"
		    Case LookbackPeriodOptions.Escaped14d
		      Return "14d"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function MMMReportGranularityToString(value As MMMReportGranularity) As String
		  Select Case value
		    Case MMMReportGranularity.Day
		      Return "DAY"
		    Case MMMReportGranularity.Week
		      Return "WEEK"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function MMMReportLevelToString(value As MMMReportLevel) As String
		  Select Case value
		    Case MMMReportLevel.CampaignTargeting
		      Return "CAMPAIGN_TARGETING"
		    Case MMMReportLevel.AdGroupTargeting
		      Return "AD_GROUP_TARGETING"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function MMMReportingColumnToString(value As MMMReportingColumn) As String
		  Select Case value
		    Case MMMReportingColumn.SpendInDollar
		      Return "SPEND_IN_DOLLAR"
		    Case MMMReportingColumn.SpendInMicroDollar
		      Return "SPEND_IN_MICRO_DOLLAR"
		    Case MMMReportingColumn.EcpcInDollar
		      Return "ECPC_IN_DOLLAR"
		    Case MMMReportingColumn.Ectr
		      Return "ECTR"
		    Case MMMReportingColumn.CampaignName
		      Return "CAMPAIGN_NAME"
		    Case MMMReportingColumn.TotalEngagement
		      Return "TOTAL_ENGAGEMENT"
		    Case MMMReportingColumn.EengagementRate
		      Return "EENGAGEMENT_RATE"
		    Case MMMReportingColumn.EcpmInDollar
		      Return "ECPM_IN_DOLLAR"
		    Case MMMReportingColumn.CampaignId
		      Return "CAMPAIGN_ID"
		    Case MMMReportingColumn.AdvertiserId
		      Return "ADVERTISER_ID"
		    Case MMMReportingColumn.AdGroupId
		      Return "AD_GROUP_ID"
		    Case MMMReportingColumn.AdGroupName
		      Return "AD_GROUP_NAME"
		    Case MMMReportingColumn.Clickthrough1
		      Return "CLICKTHROUGH_1"
		    Case MMMReportingColumn.Impression1
		      Return "IMPRESSION_1"
		    Case MMMReportingColumn.Clickthrough2
		      Return "CLICKTHROUGH_2"
		    Case MMMReportingColumn.Impression2
		      Return "IMPRESSION_2"
		    Case MMMReportingColumn.TotalClickthrough
		      Return "TOTAL_CLICKTHROUGH"
		    Case MMMReportingColumn.TotalImpression
		      Return "TOTAL_IMPRESSION"
		    Case MMMReportingColumn.AdvertiserName
		      Return "ADVERTISER_NAME"
		    Case MMMReportingColumn.SpendOrderLinePaidType
		      Return "SPEND_ORDER_LINE_PAID_TYPE"
		    Case MMMReportingColumn.CampaignObjectiveType
		      Return "CAMPAIGN_OBJECTIVE_TYPE"
		    Case MMMReportingColumn.PinnerListName
		      Return "PINNER_LIST_NAME"
		    Case MMMReportingColumn.AdsCreditSpendInDollar
		      Return "ADS_CREDIT_SPEND_IN_DOLLAR"
		    Case MMMReportingColumn.AdvertiserPaidSpendInDollar
		      Return "ADVERTISER_PAID_SPEND_IN_DOLLAR"
		    Case MMMReportingColumn.AdvertiserPaidEcpcInDollar
		      Return "ADVERTISER_PAID_ECPC_IN_DOLLAR"
		    Case MMMReportingColumn.AdvertiserPaidEcpmInDollar
		      Return "ADVERTISER_PAID_ECPM_IN_DOLLAR"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function MMMReportingTargetingTypeToString(value As MMMReportingTargetingType) As String
		  Select Case value
		    Case MMMReportingTargetingType.Apptype
		      Return "APPTYPE"
		    Case MMMReportingTargetingType.Country
		      Return "COUNTRY"
		    Case MMMReportingTargetingType.CreativeType
		      Return "CREATIVE_TYPE"
		    Case MMMReportingTargetingType.Gender
		      Return "GENDER"
		    Case MMMReportingTargetingType.Location
		      Return "LOCATION"
		    Case MMMReportingTargetingType.Placement
		      Return "PLACEMENT"
		    Case MMMReportingTargetingType.AudienceInclude
		      Return "AUDIENCE_INCLUDE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function MatchTypeToString(value As MatchType) As String
		  Select Case value
		    Case MatchType.Broad
		      Return "BROAD"
		    Case MatchType.Phrase
		      Return "PHRASE"
		    Case MatchType.Exact
		      Return "EXACT"
		    Case MatchType.ExactNegative
		      Return "EXACT_NEGATIVE"
		    Case MatchType.PhraseNegative
		      Return "PHRASE_NEGATIVE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function MatchTypeResponseToString(value As MatchTypeResponse) As String
		  Select Case value
		    Case MatchTypeResponse.Broad
		      Return "BROAD"
		    Case MatchTypeResponse.Phrase
		      Return "PHRASE"
		    Case MatchTypeResponse.Exact
		      Return "EXACT"
		    Case MatchTypeResponse.ExactNegative
		      Return "EXACT_NEGATIVE"
		    Case MatchTypeResponse.PhraseNegative
		      Return "PHRASE_NEGATIVE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function MediaTypeToString(value As MediaType) As String
		  Select Case value
		    Case MediaType.Image
		      Return "IMAGE"
		    Case MediaType.Video
		      Return "VIDEO"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function MediaUploadStatusToString(value As MediaUploadStatus) As String
		  Select Case value
		    Case MediaUploadStatus.Registered
		      Return "registered"
		    Case MediaUploadStatus.Processing
		      Return "processing"
		    Case MediaUploadStatus.Succeeded
		      Return "succeeded"
		    Case MediaUploadStatus.Failed
		      Return "failed"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function MediaUploadTypeToString(value As MediaUploadType) As String
		  Select Case value
		    Case MediaUploadType.Video
		      Return "video"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function MemberBusinessRoleToString(value As MemberBusinessRole) As String
		  Select Case value
		    Case MemberBusinessRole.Employee
		      Return "EMPLOYEE"
		    Case MemberBusinessRole.BizAdmin
		      Return "BIZ_ADMIN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function MetricsReportingLevelToString(value As MetricsReportingLevel) As String
		  Select Case value
		    Case MetricsReportingLevel.Advertiser
		      Return "ADVERTISER"
		    Case MetricsReportingLevel.AdvertiserTargeting
		      Return "ADVERTISER_TARGETING"
		    Case MetricsReportingLevel.Campaign
		      Return "CAMPAIGN"
		    Case MetricsReportingLevel.CampaignTargeting
		      Return "CAMPAIGN_TARGETING"
		    Case MetricsReportingLevel.AdGroup
		      Return "AD_GROUP"
		    Case MetricsReportingLevel.AdGroupTargeting
		      Return "AD_GROUP_TARGETING"
		    Case MetricsReportingLevel.PinPromotion
		      Return "PIN_PROMOTION"
		    Case MetricsReportingLevel.PinPromotionTargeting
		      Return "PIN_PROMOTION_TARGETING"
		    Case MetricsReportingLevel.Keyword
		      Return "KEYWORD"
		    Case MetricsReportingLevel.ProductGroup
		      Return "PRODUCT_GROUP"
		    Case MetricsReportingLevel.ProductGroupTargeting
		      Return "PRODUCT_GROUP_TARGETING"
		    Case MetricsReportingLevel.ProductItem
		      Return "PRODUCT_ITEM"
		    Case MetricsReportingLevel.ProductItemTargeting
		      Return "PRODUCT_ITEM_TARGETING"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function MetricsReportingTemplateTypeToString(value As MetricsReportingTemplateType) As String
		  Select Case value
		    Case MetricsReportingTemplateType.Unspecified
		      Return "UNSPECIFIED"
		    Case MetricsReportingTemplateType.Bulk
		      Return "BULK"
		    Case MetricsReportingTemplateType.Overview
		      Return "OVERVIEW"
		    Case MetricsReportingTemplateType.Table
		      Return "TABLE"
		    Case MetricsReportingTemplateType.Mmm
		      Return "MMM"
		    Case MetricsReportingTemplateType.BrandCategory
		      Return "BRAND_CATEGORY"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function MobileAppPlatformToString(value As MobileAppPlatform) As String
		  Select Case value
		    Case MobileAppPlatform.Ios
		      Return "IOS"
		    Case MobileAppPlatform.Android
		      Return "ANDROID"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function MsotEventNameToString(value As MsotEventName) As String
		  Select Case value
		    Case MsotEventName.AddToCart
		      Return "add_to_cart"
		    Case MsotEventName.Checkout
		      Return "checkout"
		    Case MsotEventName.Lead
		      Return "lead"
		    Case MsotEventName.Signup
		      Return "signup"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function MultiPinsAnalyticsMetricTypesItemToString(value As MultiPinsAnalyticsMetricTypesItem) As String
		  Select Case value
		    Case MultiPinsAnalyticsMetricTypesItem.Impression
		      Return "IMPRESSION"
		    Case MultiPinsAnalyticsMetricTypesItem.OutboundClick
		      Return "OUTBOUND_CLICK"
		    Case MultiPinsAnalyticsMetricTypesItem.PinClick
		      Return "PIN_CLICK"
		    Case MultiPinsAnalyticsMetricTypesItem.Save
		      Return "SAVE"
		    Case MultiPinsAnalyticsMetricTypesItem.SaveRate
		      Return "SAVE_RATE"
		    Case MultiPinsAnalyticsMetricTypesItem.TotalComments
		      Return "TOTAL_COMMENTS"
		    Case MultiPinsAnalyticsMetricTypesItem.TotalReactions
		      Return "TOTAL_REACTIONS"
		    Case MultiPinsAnalyticsMetricTypesItem.UserFollow
		      Return "USER_FOLLOW"
		    Case MultiPinsAnalyticsMetricTypesItem.ProfileVisit
		      Return "PROFILE_VISIT"
		    Case MultiPinsAnalyticsMetricTypesItem.VideoMrcView
		      Return "VIDEO_MRC_VIEW"
		    Case MultiPinsAnalyticsMetricTypesItem.Video10sView
		      Return "VIDEO_10S_VIEW"
		    Case MultiPinsAnalyticsMetricTypesItem.Quartile95PercentView
		      Return "QUARTILE_95_PERCENT_VIEW"
		    Case MultiPinsAnalyticsMetricTypesItem.VideoV50WatchTime
		      Return "VIDEO_V50_WATCH_TIME"
		    Case MultiPinsAnalyticsMetricTypesItem.VideoStart
		      Return "VIDEO_START"
		    Case MultiPinsAnalyticsMetricTypesItem.VideoAvgWatchTime
		      Return "VIDEO_AVG_WATCH_TIME"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function NetworkTypeToString(value As NetworkType) As String
		  Select Case value
		    Case NetworkType.Wifi
		      Return "wifi"
		    Case NetworkType.Cellular2g
		      Return "cellular_2g"
		    Case NetworkType.Cellular3g
		      Return "cellular_3g"
		    Case NetworkType.Cellular4g
		      Return "cellular_4g"
		    Case NetworkType.Cellular5g
		      Return "cellular_5g"
		    Case NetworkType.Cellular6g
		      Return "cellular_6g"
		    Case NetworkType.Ethernet
		      Return "ethernet"
		    Case NetworkType.Unknown
		      Return "unknown"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function NonDraftEntityStatusToString(value As NonDraftEntityStatus) As String
		  Select Case value
		    Case NonDraftEntityStatus.Active
		      Return "ACTIVE"
		    Case NonDraftEntityStatus.Paused
		      Return "PAUSED"
		    Case NonDraftEntityStatus.Archived
		      Return "ARCHIVED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function NonNullableCatalogsCurrencyToString(value As NonNullableCatalogsCurrency) As String
		  Select Case value
		    Case NonNullableCatalogsCurrency.Aed
		      Return "AED"
		    Case NonNullableCatalogsCurrency.Afn
		      Return "AFN"
		    Case NonNullableCatalogsCurrency.All
		      Return "ALL"
		    Case NonNullableCatalogsCurrency.Amd
		      Return "AMD"
		    Case NonNullableCatalogsCurrency.Ang
		      Return "ANG"
		    Case NonNullableCatalogsCurrency.Aoa
		      Return "AOA"
		    Case NonNullableCatalogsCurrency.Ars
		      Return "ARS"
		    Case NonNullableCatalogsCurrency.Aud
		      Return "AUD"
		    Case NonNullableCatalogsCurrency.Awg
		      Return "AWG"
		    Case NonNullableCatalogsCurrency.Azn
		      Return "AZN"
		    Case NonNullableCatalogsCurrency.Bam
		      Return "BAM"
		    Case NonNullableCatalogsCurrency.Bbd
		      Return "BBD"
		    Case NonNullableCatalogsCurrency.Bdt
		      Return "BDT"
		    Case NonNullableCatalogsCurrency.Bgn
		      Return "BGN"
		    Case NonNullableCatalogsCurrency.Bhd
		      Return "BHD"
		    Case NonNullableCatalogsCurrency.Bif
		      Return "BIF"
		    Case NonNullableCatalogsCurrency.Bmd
		      Return "BMD"
		    Case NonNullableCatalogsCurrency.Bnd
		      Return "BND"
		    Case NonNullableCatalogsCurrency.Bob
		      Return "BOB"
		    Case NonNullableCatalogsCurrency.Brl
		      Return "BRL"
		    Case NonNullableCatalogsCurrency.Bsd
		      Return "BSD"
		    Case NonNullableCatalogsCurrency.Btn
		      Return "BTN"
		    Case NonNullableCatalogsCurrency.Bwp
		      Return "BWP"
		    Case NonNullableCatalogsCurrency.Byn
		      Return "BYN"
		    Case NonNullableCatalogsCurrency.Byr
		      Return "BYR"
		    Case NonNullableCatalogsCurrency.Bzd
		      Return "BZD"
		    Case NonNullableCatalogsCurrency.Cad
		      Return "CAD"
		    Case NonNullableCatalogsCurrency.Cdf
		      Return "CDF"
		    Case NonNullableCatalogsCurrency.Chf
		      Return "CHF"
		    Case NonNullableCatalogsCurrency.Clp
		      Return "CLP"
		    Case NonNullableCatalogsCurrency.Cny
		      Return "CNY"
		    Case NonNullableCatalogsCurrency.Cop
		      Return "COP"
		    Case NonNullableCatalogsCurrency.Crc
		      Return "CRC"
		    Case NonNullableCatalogsCurrency.Cuc
		      Return "CUC"
		    Case NonNullableCatalogsCurrency.Cup
		      Return "CUP"
		    Case NonNullableCatalogsCurrency.Cve
		      Return "CVE"
		    Case NonNullableCatalogsCurrency.Czk
		      Return "CZK"
		    Case NonNullableCatalogsCurrency.Djf
		      Return "DJF"
		    Case NonNullableCatalogsCurrency.Dkk
		      Return "DKK"
		    Case NonNullableCatalogsCurrency.Dop
		      Return "DOP"
		    Case NonNullableCatalogsCurrency.Dzd
		      Return "DZD"
		    Case NonNullableCatalogsCurrency.Egp
		      Return "EGP"
		    Case NonNullableCatalogsCurrency.Ern
		      Return "ERN"
		    Case NonNullableCatalogsCurrency.Etb
		      Return "ETB"
		    Case NonNullableCatalogsCurrency.Eur
		      Return "EUR"
		    Case NonNullableCatalogsCurrency.Fjd
		      Return "FJD"
		    Case NonNullableCatalogsCurrency.Fkp
		      Return "FKP"
		    Case NonNullableCatalogsCurrency.Gbp
		      Return "GBP"
		    Case NonNullableCatalogsCurrency.Gel
		      Return "GEL"
		    Case NonNullableCatalogsCurrency.Ggp
		      Return "GGP"
		    Case NonNullableCatalogsCurrency.Ghs
		      Return "GHS"
		    Case NonNullableCatalogsCurrency.Gip
		      Return "GIP"
		    Case NonNullableCatalogsCurrency.Gmd
		      Return "GMD"
		    Case NonNullableCatalogsCurrency.Gnf
		      Return "GNF"
		    Case NonNullableCatalogsCurrency.Gtq
		      Return "GTQ"
		    Case NonNullableCatalogsCurrency.Gyd
		      Return "GYD"
		    Case NonNullableCatalogsCurrency.Hkd
		      Return "HKD"
		    Case NonNullableCatalogsCurrency.Hnl
		      Return "HNL"
		    Case NonNullableCatalogsCurrency.Hrk
		      Return "HRK"
		    Case NonNullableCatalogsCurrency.Htg
		      Return "HTG"
		    Case NonNullableCatalogsCurrency.Huf
		      Return "HUF"
		    Case NonNullableCatalogsCurrency.Idr
		      Return "IDR"
		    Case NonNullableCatalogsCurrency.Ils
		      Return "ILS"
		    Case NonNullableCatalogsCurrency.Imp
		      Return "IMP"
		    Case NonNullableCatalogsCurrency.Inr
		      Return "INR"
		    Case NonNullableCatalogsCurrency.Iqd
		      Return "IQD"
		    Case NonNullableCatalogsCurrency.Irr
		      Return "IRR"
		    Case NonNullableCatalogsCurrency.Isk
		      Return "ISK"
		    Case NonNullableCatalogsCurrency.Jep
		      Return "JEP"
		    Case NonNullableCatalogsCurrency.Jmd
		      Return "JMD"
		    Case NonNullableCatalogsCurrency.Jod
		      Return "JOD"
		    Case NonNullableCatalogsCurrency.Jpy
		      Return "JPY"
		    Case NonNullableCatalogsCurrency.Kes
		      Return "KES"
		    Case NonNullableCatalogsCurrency.Kgs
		      Return "KGS"
		    Case NonNullableCatalogsCurrency.Khr
		      Return "KHR"
		    Case NonNullableCatalogsCurrency.Kmf
		      Return "KMF"
		    Case NonNullableCatalogsCurrency.Kpw
		      Return "KPW"
		    Case NonNullableCatalogsCurrency.Krw
		      Return "KRW"
		    Case NonNullableCatalogsCurrency.Kwd
		      Return "KWD"
		    Case NonNullableCatalogsCurrency.Kyd
		      Return "KYD"
		    Case NonNullableCatalogsCurrency.Kzt
		      Return "KZT"
		    Case NonNullableCatalogsCurrency.Lak
		      Return "LAK"
		    Case NonNullableCatalogsCurrency.Lbp
		      Return "LBP"
		    Case NonNullableCatalogsCurrency.Lkr
		      Return "LKR"
		    Case NonNullableCatalogsCurrency.Lrd
		      Return "LRD"
		    Case NonNullableCatalogsCurrency.Lsl
		      Return "LSL"
		    Case NonNullableCatalogsCurrency.Lyd
		      Return "LYD"
		    Case NonNullableCatalogsCurrency.Mad
		      Return "MAD"
		    Case NonNullableCatalogsCurrency.Mdl
		      Return "MDL"
		    Case NonNullableCatalogsCurrency.Mga
		      Return "MGA"
		    Case NonNullableCatalogsCurrency.Mkd
		      Return "MKD"
		    Case NonNullableCatalogsCurrency.Mmk
		      Return "MMK"
		    Case NonNullableCatalogsCurrency.Mnt
		      Return "MNT"
		    Case NonNullableCatalogsCurrency.Mop
		      Return "MOP"
		    Case NonNullableCatalogsCurrency.Mro
		      Return "MRO"
		    Case NonNullableCatalogsCurrency.Mur
		      Return "MUR"
		    Case NonNullableCatalogsCurrency.Mvr
		      Return "MVR"
		    Case NonNullableCatalogsCurrency.Mwk
		      Return "MWK"
		    Case NonNullableCatalogsCurrency.Mxn
		      Return "MXN"
		    Case NonNullableCatalogsCurrency.Myr
		      Return "MYR"
		    Case NonNullableCatalogsCurrency.Mzn
		      Return "MZN"
		    Case NonNullableCatalogsCurrency.Nad
		      Return "NAD"
		    Case NonNullableCatalogsCurrency.Ngn
		      Return "NGN"
		    Case NonNullableCatalogsCurrency.Nio
		      Return "NIO"
		    Case NonNullableCatalogsCurrency.Nok
		      Return "NOK"
		    Case NonNullableCatalogsCurrency.Npr
		      Return "NPR"
		    Case NonNullableCatalogsCurrency.Nzd
		      Return "NZD"
		    Case NonNullableCatalogsCurrency.Omr
		      Return "OMR"
		    Case NonNullableCatalogsCurrency.Pab
		      Return "PAB"
		    Case NonNullableCatalogsCurrency.Pen
		      Return "PEN"
		    Case NonNullableCatalogsCurrency.Pgk
		      Return "PGK"
		    Case NonNullableCatalogsCurrency.Php
		      Return "PHP"
		    Case NonNullableCatalogsCurrency.Pkr
		      Return "PKR"
		    Case NonNullableCatalogsCurrency.Pln
		      Return "PLN"
		    Case NonNullableCatalogsCurrency.Pyg
		      Return "PYG"
		    Case NonNullableCatalogsCurrency.Qar
		      Return "QAR"
		    Case NonNullableCatalogsCurrency.Ron
		      Return "RON"
		    Case NonNullableCatalogsCurrency.Rsd
		      Return "RSD"
		    Case NonNullableCatalogsCurrency.Rub
		      Return "RUB"
		    Case NonNullableCatalogsCurrency.Rwf
		      Return "RWF"
		    Case NonNullableCatalogsCurrency.Sar
		      Return "SAR"
		    Case NonNullableCatalogsCurrency.Sbd
		      Return "SBD"
		    Case NonNullableCatalogsCurrency.Scr
		      Return "SCR"
		    Case NonNullableCatalogsCurrency.Sdg
		      Return "SDG"
		    Case NonNullableCatalogsCurrency.Sek
		      Return "SEK"
		    Case NonNullableCatalogsCurrency.Sgd
		      Return "SGD"
		    Case NonNullableCatalogsCurrency.Shp
		      Return "SHP"
		    Case NonNullableCatalogsCurrency.Sll
		      Return "SLL"
		    Case NonNullableCatalogsCurrency.Sos
		      Return "SOS"
		    Case NonNullableCatalogsCurrency.Spl
		      Return "SPL"
		    Case NonNullableCatalogsCurrency.Srd
		      Return "SRD"
		    Case NonNullableCatalogsCurrency.Std
		      Return "STD"
		    Case NonNullableCatalogsCurrency.Svc
		      Return "SVC"
		    Case NonNullableCatalogsCurrency.Syp
		      Return "SYP"
		    Case NonNullableCatalogsCurrency.Szl
		      Return "SZL"
		    Case NonNullableCatalogsCurrency.Thb
		      Return "THB"
		    Case NonNullableCatalogsCurrency.Tjs
		      Return "TJS"
		    Case NonNullableCatalogsCurrency.Tmt
		      Return "TMT"
		    Case NonNullableCatalogsCurrency.Tnd
		      Return "TND"
		    Case NonNullableCatalogsCurrency.Top
		      Return "TOP"
		    Case NonNullableCatalogsCurrency.Escapedtry
		      Return "TRY"
		    Case NonNullableCatalogsCurrency.Ttd
		      Return "TTD"
		    Case NonNullableCatalogsCurrency.Tvd
		      Return "TVD"
		    Case NonNullableCatalogsCurrency.Twd
		      Return "TWD"
		    Case NonNullableCatalogsCurrency.Tzs
		      Return "TZS"
		    Case NonNullableCatalogsCurrency.Uah
		      Return "UAH"
		    Case NonNullableCatalogsCurrency.Ugx
		      Return "UGX"
		    Case NonNullableCatalogsCurrency.Usd
		      Return "USD"
		    Case NonNullableCatalogsCurrency.Uyu
		      Return "UYU"
		    Case NonNullableCatalogsCurrency.Uzs
		      Return "UZS"
		    Case NonNullableCatalogsCurrency.Vef
		      Return "VEF"
		    Case NonNullableCatalogsCurrency.Vnd
		      Return "VND"
		    Case NonNullableCatalogsCurrency.Vuv
		      Return "VUV"
		    Case NonNullableCatalogsCurrency.Wst
		      Return "WST"
		    Case NonNullableCatalogsCurrency.Xaf
		      Return "XAF"
		    Case NonNullableCatalogsCurrency.Xcd
		      Return "XCD"
		    Case NonNullableCatalogsCurrency.Xdr
		      Return "XDR"
		    Case NonNullableCatalogsCurrency.Xof
		      Return "XOF"
		    Case NonNullableCatalogsCurrency.Xpf
		      Return "XPF"
		    Case NonNullableCatalogsCurrency.Yer
		      Return "YER"
		    Case NonNullableCatalogsCurrency.Zar
		      Return "ZAR"
		    Case NonNullableCatalogsCurrency.Zmw
		      Return "ZMW"
		    Case NonNullableCatalogsCurrency.Zwd
		      Return "ZWD"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function NullableCatalogsItemFieldTypeToString(value As NullableCatalogsItemFieldType) As String
		  Select Case value
		    Case NullableCatalogsItemFieldType.ItemId
		      Return "ITEM_ID"
		    Case NullableCatalogsItemFieldType.ItemGroupId
		      Return "ITEM_GROUP_ID"
		    Case NullableCatalogsItemFieldType.Title
		      Return "TITLE"
		    Case NullableCatalogsItemFieldType.Description
		      Return "DESCRIPTION"
		    Case NullableCatalogsItemFieldType.ItemLink
		      Return "ITEM_LINK"
		    Case NullableCatalogsItemFieldType.OrganicLink
		      Return "ORGANIC_LINK"
		    Case NullableCatalogsItemFieldType.ImageLink
		      Return "IMAGE_LINK"
		    Case NullableCatalogsItemFieldType.AdwordsRedirectLink
		      Return "ADWORDS_REDIRECT_LINK"
		    Case NullableCatalogsItemFieldType.AdLink
		      Return "AD_LINK"
		    Case NullableCatalogsItemFieldType.Size
		      Return "SIZE"
		    Case NullableCatalogsItemFieldType.GoogleProductCategory
		      Return "GOOGLE_PRODUCT_CATEGORY"
		    Case NullableCatalogsItemFieldType.ProductCategory
		      Return "PRODUCT_CATEGORY"
		    Case NullableCatalogsItemFieldType.Condition
		      Return "CONDITION"
		    Case NullableCatalogsItemFieldType.Availability
		      Return "AVAILABILITY"
		    Case NullableCatalogsItemFieldType.Gender
		      Return "GENDER"
		    Case NullableCatalogsItemFieldType.AgeGroup
		      Return "AGE_GROUP"
		    Case NullableCatalogsItemFieldType.SizeType
		      Return "SIZE_TYPE"
		    Case NullableCatalogsItemFieldType.SizeSystem
		      Return "SIZE_SYSTEM"
		    Case NullableCatalogsItemFieldType.Adult
		      Return "ADULT"
		    Case NullableCatalogsItemFieldType.Shipping
		      Return "SHIPPING"
		    Case NullableCatalogsItemFieldType.ShippingWeight
		      Return "SHIPPING_WEIGHT"
		    Case NullableCatalogsItemFieldType.Tax
		      Return "TAX"
		    Case NullableCatalogsItemFieldType.Multipack
		      Return "MULTIPACK"
		    Case NullableCatalogsItemFieldType.AdditionalImageLink
		      Return "ADDITIONAL_IMAGE_LINK"
		    Case NullableCatalogsItemFieldType.Price
		      Return "PRICE"
		    Case NullableCatalogsItemFieldType.SalePrice
		      Return "SALE_PRICE"
		    Case NullableCatalogsItemFieldType.IsBundle
		      Return "IS_BUNDLE"
		    Case NullableCatalogsItemFieldType.ExpirationDate
		      Return "EXPIRATION_DATE"
		    Case NullableCatalogsItemFieldType.AvailabilityDate
		      Return "AVAILABILITY_DATE"
		    Case NullableCatalogsItemFieldType.WeightUnit
		      Return "WEIGHT_UNIT"
		    Case NullableCatalogsItemFieldType.ProductType
		      Return "PRODUCT_TYPE"
		    Case NullableCatalogsItemFieldType.CustomLabel0
		      Return "CUSTOM_LABEL_0"
		    Case NullableCatalogsItemFieldType.CustomLabel1
		      Return "CUSTOM_LABEL_1"
		    Case NullableCatalogsItemFieldType.CustomLabel2
		      Return "CUSTOM_LABEL_2"
		    Case NullableCatalogsItemFieldType.CustomLabel3
		      Return "CUSTOM_LABEL_3"
		    Case NullableCatalogsItemFieldType.CustomLabel4
		      Return "CUSTOM_LABEL_4"
		    Case NullableCatalogsItemFieldType.Material
		      Return "MATERIAL"
		    Case NullableCatalogsItemFieldType.Pattern
		      Return "PATTERN"
		    Case NullableCatalogsItemFieldType.Color
		      Return "COLOR"
		    Case NullableCatalogsItemFieldType.Brand
		      Return "BRAND"
		    Case NullableCatalogsItemFieldType.Gtin
		      Return "GTIN"
		    Case NullableCatalogsItemFieldType.Mpn
		      Return "MPN"
		    Case NullableCatalogsItemFieldType.IosDeepLink
		      Return "IOS_DEEP_LINK"
		    Case NullableCatalogsItemFieldType.AndroidDeepLink
		      Return "ANDROID_DEEP_LINK"
		    Case NullableCatalogsItemFieldType.FreeShippingLabel
		      Return "FREE_SHIPPING_LABEL"
		    Case NullableCatalogsItemFieldType.FreeShippingLimit
		      Return "FREE_SHIPPING_LIMIT"
		    Case NullableCatalogsItemFieldType.AvgReviewRating
		      Return "AVG_REVIEW_RATING"
		    Case NullableCatalogsItemFieldType.NumRatings
		      Return "NUM_RATINGS"
		    Case NullableCatalogsItemFieldType.NumReviews
		      Return "NUM_REVIEWS"
		    Case NullableCatalogsItemFieldType.AltText
		      Return "ALT_TEXT"
		    Case NullableCatalogsItemFieldType.VariantNames
		      Return "VARIANT_NAMES"
		    Case NullableCatalogsItemFieldType.VariantValues
		      Return "VARIANT_VALUES"
		    Case NullableCatalogsItemFieldType.MinAdPrice
		      Return "MIN_AD_PRICE"
		    Case NullableCatalogsItemFieldType.ShippingWidth
		      Return "SHIPPING_WIDTH"
		    Case NullableCatalogsItemFieldType.ShippingHeight
		      Return "SHIPPING_HEIGHT"
		    Case NullableCatalogsItemFieldType.AdImage0Link
		      Return "AD_IMAGE_0_LINK"
		    Case NullableCatalogsItemFieldType.AdImage1Link
		      Return "AD_IMAGE_1_LINK"
		    Case NullableCatalogsItemFieldType.AdImage2Link
		      Return "AD_IMAGE_2_LINK"
		    Case NullableCatalogsItemFieldType.AdImage3Link
		      Return "AD_IMAGE_3_LINK"
		    Case NullableCatalogsItemFieldType.AdImage4Link
		      Return "AD_IMAGE_4_LINK"
		    Case NullableCatalogsItemFieldType.AdImage5Link
		      Return "AD_IMAGE_5_LINK"
		    Case NullableCatalogsItemFieldType.AdImage6Link
		      Return "AD_IMAGE_6_LINK"
		    Case NullableCatalogsItemFieldType.AdImage7Link
		      Return "AD_IMAGE_7_LINK"
		    Case NullableCatalogsItemFieldType.AdImage8Link
		      Return "AD_IMAGE_8_LINK"
		    Case NullableCatalogsItemFieldType.AdImage9Link
		      Return "AD_IMAGE_9_LINK"
		    Case NullableCatalogsItemFieldType.AdImage10Link
		      Return "AD_IMAGE_10_LINK"
		    Case NullableCatalogsItemFieldType.AdImage11Link
		      Return "AD_IMAGE_11_LINK"
		    Case NullableCatalogsItemFieldType.AdImage12Link
		      Return "AD_IMAGE_12_LINK"
		    Case NullableCatalogsItemFieldType.AdImage13Link
		      Return "AD_IMAGE_13_LINK"
		    Case NullableCatalogsItemFieldType.AdImage14Link
		      Return "AD_IMAGE_14_LINK"
		    Case NullableCatalogsItemFieldType.AdImage15Link
		      Return "AD_IMAGE_15_LINK"
		    Case NullableCatalogsItemFieldType.AdImage16Link
		      Return "AD_IMAGE_16_LINK"
		    Case NullableCatalogsItemFieldType.AdImage17Link
		      Return "AD_IMAGE_17_LINK"
		    Case NullableCatalogsItemFieldType.AdImage18Link
		      Return "AD_IMAGE_18_LINK"
		    Case NullableCatalogsItemFieldType.AdImage19Link
		      Return "AD_IMAGE_19_LINK"
		    Case NullableCatalogsItemFieldType.AdImage0Tag
		      Return "AD_IMAGE_0_TAG"
		    Case NullableCatalogsItemFieldType.AdImage1Tag
		      Return "AD_IMAGE_1_TAG"
		    Case NullableCatalogsItemFieldType.AdImage2Tag
		      Return "AD_IMAGE_2_TAG"
		    Case NullableCatalogsItemFieldType.AdImage3Tag
		      Return "AD_IMAGE_3_TAG"
		    Case NullableCatalogsItemFieldType.AdImage4Tag
		      Return "AD_IMAGE_4_TAG"
		    Case NullableCatalogsItemFieldType.AdImage5Tag
		      Return "AD_IMAGE_5_TAG"
		    Case NullableCatalogsItemFieldType.AdImage6Tag
		      Return "AD_IMAGE_6_TAG"
		    Case NullableCatalogsItemFieldType.AdImage7Tag
		      Return "AD_IMAGE_7_TAG"
		    Case NullableCatalogsItemFieldType.AdImage8Tag
		      Return "AD_IMAGE_8_TAG"
		    Case NullableCatalogsItemFieldType.AdImage9Tag
		      Return "AD_IMAGE_9_TAG"
		    Case NullableCatalogsItemFieldType.AdImage10Tag
		      Return "AD_IMAGE_10_TAG"
		    Case NullableCatalogsItemFieldType.AdImage11Tag
		      Return "AD_IMAGE_11_TAG"
		    Case NullableCatalogsItemFieldType.AdImage12Tag
		      Return "AD_IMAGE_12_TAG"
		    Case NullableCatalogsItemFieldType.AdImage13Tag
		      Return "AD_IMAGE_13_TAG"
		    Case NullableCatalogsItemFieldType.AdImage14Tag
		      Return "AD_IMAGE_14_TAG"
		    Case NullableCatalogsItemFieldType.AdImage15Tag
		      Return "AD_IMAGE_15_TAG"
		    Case NullableCatalogsItemFieldType.AdImage16Tag
		      Return "AD_IMAGE_16_TAG"
		    Case NullableCatalogsItemFieldType.AdImage17Tag
		      Return "AD_IMAGE_17_TAG"
		    Case NullableCatalogsItemFieldType.AdImage18Tag
		      Return "AD_IMAGE_18_TAG"
		    Case NullableCatalogsItemFieldType.AdImage19Tag
		      Return "AD_IMAGE_19_TAG"
		    Case NullableCatalogsItemFieldType.AdVideo0Link
		      Return "AD_VIDEO_0_LINK"
		    Case NullableCatalogsItemFieldType.AdVideo1Link
		      Return "AD_VIDEO_1_LINK"
		    Case NullableCatalogsItemFieldType.AdVideo2Link
		      Return "AD_VIDEO_2_LINK"
		    Case NullableCatalogsItemFieldType.AdVideo0Tag
		      Return "AD_VIDEO_0_TAG"
		    Case NullableCatalogsItemFieldType.AdVideo1Tag
		      Return "AD_VIDEO_1_TAG"
		    Case NullableCatalogsItemFieldType.AdVideo2Tag
		      Return "AD_VIDEO_2_TAG"
		    Case NullableCatalogsItemFieldType.InstallmentPrice
		      Return "INSTALLMENT_PRICE"
		    Case NullableCatalogsItemFieldType.UnitPriceTotalMeasure
		      Return "UNIT_PRICE_TOTAL_MEASURE"
		    Case NullableCatalogsItemFieldType.UnitPriceBaseMeasure
		      Return "UNIT_PRICE_BASE_MEASURE"
		    Case NullableCatalogsItemFieldType.SalePriceEffectiveDate
		      Return "SALE_PRICE_EFFECTIVE_DATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function NullableCurrencyToString(value As NullableCurrency) As String
		  Select Case value
		    Case NullableCurrency.Aed
		      Return "AED"
		    Case NullableCurrency.Afn
		      Return "AFN"
		    Case NullableCurrency.All
		      Return "ALL"
		    Case NullableCurrency.Amd
		      Return "AMD"
		    Case NullableCurrency.Ang
		      Return "ANG"
		    Case NullableCurrency.Aoa
		      Return "AOA"
		    Case NullableCurrency.Ars
		      Return "ARS"
		    Case NullableCurrency.Aud
		      Return "AUD"
		    Case NullableCurrency.Awg
		      Return "AWG"
		    Case NullableCurrency.Azn
		      Return "AZN"
		    Case NullableCurrency.Bam
		      Return "BAM"
		    Case NullableCurrency.Bbd
		      Return "BBD"
		    Case NullableCurrency.Bdt
		      Return "BDT"
		    Case NullableCurrency.Bgn
		      Return "BGN"
		    Case NullableCurrency.Bhd
		      Return "BHD"
		    Case NullableCurrency.Bif
		      Return "BIF"
		    Case NullableCurrency.Bmd
		      Return "BMD"
		    Case NullableCurrency.Bnd
		      Return "BND"
		    Case NullableCurrency.Bob
		      Return "BOB"
		    Case NullableCurrency.Brl
		      Return "BRL"
		    Case NullableCurrency.Bsd
		      Return "BSD"
		    Case NullableCurrency.Btn
		      Return "BTN"
		    Case NullableCurrency.Bwp
		      Return "BWP"
		    Case NullableCurrency.Byn
		      Return "BYN"
		    Case NullableCurrency.Byr
		      Return "BYR"
		    Case NullableCurrency.Bzd
		      Return "BZD"
		    Case NullableCurrency.Cad
		      Return "CAD"
		    Case NullableCurrency.Cdf
		      Return "CDF"
		    Case NullableCurrency.Chf
		      Return "CHF"
		    Case NullableCurrency.Clp
		      Return "CLP"
		    Case NullableCurrency.Cny
		      Return "CNY"
		    Case NullableCurrency.Cop
		      Return "COP"
		    Case NullableCurrency.Crc
		      Return "CRC"
		    Case NullableCurrency.Cuc
		      Return "CUC"
		    Case NullableCurrency.Cup
		      Return "CUP"
		    Case NullableCurrency.Cve
		      Return "CVE"
		    Case NullableCurrency.Czk
		      Return "CZK"
		    Case NullableCurrency.Djf
		      Return "DJF"
		    Case NullableCurrency.Dkk
		      Return "DKK"
		    Case NullableCurrency.Dop
		      Return "DOP"
		    Case NullableCurrency.Dzd
		      Return "DZD"
		    Case NullableCurrency.Egp
		      Return "EGP"
		    Case NullableCurrency.Ern
		      Return "ERN"
		    Case NullableCurrency.Etb
		      Return "ETB"
		    Case NullableCurrency.Eur
		      Return "EUR"
		    Case NullableCurrency.Fjd
		      Return "FJD"
		    Case NullableCurrency.Fkp
		      Return "FKP"
		    Case NullableCurrency.Gbp
		      Return "GBP"
		    Case NullableCurrency.Gel
		      Return "GEL"
		    Case NullableCurrency.Ggp
		      Return "GGP"
		    Case NullableCurrency.Ghs
		      Return "GHS"
		    Case NullableCurrency.Gip
		      Return "GIP"
		    Case NullableCurrency.Gmd
		      Return "GMD"
		    Case NullableCurrency.Gnf
		      Return "GNF"
		    Case NullableCurrency.Gtq
		      Return "GTQ"
		    Case NullableCurrency.Gyd
		      Return "GYD"
		    Case NullableCurrency.Hkd
		      Return "HKD"
		    Case NullableCurrency.Hnl
		      Return "HNL"
		    Case NullableCurrency.Hrk
		      Return "HRK"
		    Case NullableCurrency.Htg
		      Return "HTG"
		    Case NullableCurrency.Huf
		      Return "HUF"
		    Case NullableCurrency.Idr
		      Return "IDR"
		    Case NullableCurrency.Ils
		      Return "ILS"
		    Case NullableCurrency.Imp
		      Return "IMP"
		    Case NullableCurrency.Inr
		      Return "INR"
		    Case NullableCurrency.Iqd
		      Return "IQD"
		    Case NullableCurrency.Irr
		      Return "IRR"
		    Case NullableCurrency.Isk
		      Return "ISK"
		    Case NullableCurrency.Jep
		      Return "JEP"
		    Case NullableCurrency.Jmd
		      Return "JMD"
		    Case NullableCurrency.Jod
		      Return "JOD"
		    Case NullableCurrency.Jpy
		      Return "JPY"
		    Case NullableCurrency.Kes
		      Return "KES"
		    Case NullableCurrency.Kgs
		      Return "KGS"
		    Case NullableCurrency.Khr
		      Return "KHR"
		    Case NullableCurrency.Kmf
		      Return "KMF"
		    Case NullableCurrency.Kpw
		      Return "KPW"
		    Case NullableCurrency.Krw
		      Return "KRW"
		    Case NullableCurrency.Kwd
		      Return "KWD"
		    Case NullableCurrency.Kyd
		      Return "KYD"
		    Case NullableCurrency.Kzt
		      Return "KZT"
		    Case NullableCurrency.Lak
		      Return "LAK"
		    Case NullableCurrency.Lbp
		      Return "LBP"
		    Case NullableCurrency.Lkr
		      Return "LKR"
		    Case NullableCurrency.Lrd
		      Return "LRD"
		    Case NullableCurrency.Lsl
		      Return "LSL"
		    Case NullableCurrency.Lyd
		      Return "LYD"
		    Case NullableCurrency.Mad
		      Return "MAD"
		    Case NullableCurrency.Mdl
		      Return "MDL"
		    Case NullableCurrency.Mga
		      Return "MGA"
		    Case NullableCurrency.Mkd
		      Return "MKD"
		    Case NullableCurrency.Mmk
		      Return "MMK"
		    Case NullableCurrency.Mnt
		      Return "MNT"
		    Case NullableCurrency.Mop
		      Return "MOP"
		    Case NullableCurrency.Mro
		      Return "MRO"
		    Case NullableCurrency.Mur
		      Return "MUR"
		    Case NullableCurrency.Mvr
		      Return "MVR"
		    Case NullableCurrency.Mwk
		      Return "MWK"
		    Case NullableCurrency.Mxn
		      Return "MXN"
		    Case NullableCurrency.Myr
		      Return "MYR"
		    Case NullableCurrency.Mzn
		      Return "MZN"
		    Case NullableCurrency.Nad
		      Return "NAD"
		    Case NullableCurrency.Ngn
		      Return "NGN"
		    Case NullableCurrency.Nio
		      Return "NIO"
		    Case NullableCurrency.Nok
		      Return "NOK"
		    Case NullableCurrency.Npr
		      Return "NPR"
		    Case NullableCurrency.Nzd
		      Return "NZD"
		    Case NullableCurrency.Omr
		      Return "OMR"
		    Case NullableCurrency.Pab
		      Return "PAB"
		    Case NullableCurrency.Pen
		      Return "PEN"
		    Case NullableCurrency.Pgk
		      Return "PGK"
		    Case NullableCurrency.Php
		      Return "PHP"
		    Case NullableCurrency.Pkr
		      Return "PKR"
		    Case NullableCurrency.Pln
		      Return "PLN"
		    Case NullableCurrency.Pyg
		      Return "PYG"
		    Case NullableCurrency.Qar
		      Return "QAR"
		    Case NullableCurrency.Ron
		      Return "RON"
		    Case NullableCurrency.Rsd
		      Return "RSD"
		    Case NullableCurrency.Rub
		      Return "RUB"
		    Case NullableCurrency.Rwf
		      Return "RWF"
		    Case NullableCurrency.Sar
		      Return "SAR"
		    Case NullableCurrency.Sbd
		      Return "SBD"
		    Case NullableCurrency.Scr
		      Return "SCR"
		    Case NullableCurrency.Sdg
		      Return "SDG"
		    Case NullableCurrency.Sek
		      Return "SEK"
		    Case NullableCurrency.Sgd
		      Return "SGD"
		    Case NullableCurrency.Shp
		      Return "SHP"
		    Case NullableCurrency.Sll
		      Return "SLL"
		    Case NullableCurrency.Sos
		      Return "SOS"
		    Case NullableCurrency.Spl
		      Return "SPL"
		    Case NullableCurrency.Srd
		      Return "SRD"
		    Case NullableCurrency.Std
		      Return "STD"
		    Case NullableCurrency.Svc
		      Return "SVC"
		    Case NullableCurrency.Syp
		      Return "SYP"
		    Case NullableCurrency.Szl
		      Return "SZL"
		    Case NullableCurrency.Thb
		      Return "THB"
		    Case NullableCurrency.Tjs
		      Return "TJS"
		    Case NullableCurrency.Tmt
		      Return "TMT"
		    Case NullableCurrency.Tnd
		      Return "TND"
		    Case NullableCurrency.Top
		      Return "TOP"
		    Case NullableCurrency.Escapedtry
		      Return "TRY"
		    Case NullableCurrency.Ttd
		      Return "TTD"
		    Case NullableCurrency.Tvd
		      Return "TVD"
		    Case NullableCurrency.Twd
		      Return "TWD"
		    Case NullableCurrency.Tzs
		      Return "TZS"
		    Case NullableCurrency.Uah
		      Return "UAH"
		    Case NullableCurrency.Ugx
		      Return "UGX"
		    Case NullableCurrency.Usd
		      Return "USD"
		    Case NullableCurrency.Uyu
		      Return "UYU"
		    Case NullableCurrency.Uzs
		      Return "UZS"
		    Case NullableCurrency.Vef
		      Return "VEF"
		    Case NullableCurrency.Vnd
		      Return "VND"
		    Case NullableCurrency.Vuv
		      Return "VUV"
		    Case NullableCurrency.Wst
		      Return "WST"
		    Case NullableCurrency.Xaf
		      Return "XAF"
		    Case NullableCurrency.Xcd
		      Return "XCD"
		    Case NullableCurrency.Xdr
		      Return "XDR"
		    Case NullableCurrency.Xof
		      Return "XOF"
		    Case NullableCurrency.Xpf
		      Return "XPF"
		    Case NullableCurrency.Yer
		      Return "YER"
		    Case NullableCurrency.Zar
		      Return "ZAR"
		    Case NullableCurrency.Zmw
		      Return "ZMW"
		    Case NullableCurrency.Zwd
		      Return "ZWD"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function NullableEntityStatusToString(value As NullableEntityStatus) As String
		  Select Case value
		    Case NullableEntityStatus.Active
		      Return "ACTIVE"
		    Case NullableEntityStatus.Paused
		      Return "PAUSED"
		    Case NullableEntityStatus.Archived
		      Return "ARCHIVED"
		    Case NullableEntityStatus.Draft
		      Return "DRAFT"
		    Case NullableEntityStatus.DeletedDraft
		      Return "DELETED_DRAFT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function NullableLabelStatusToString(value As NullableLabelStatus) As String
		  Select Case value
		    Case NullableLabelStatus.Active
		      Return "ACTIVE"
		    Case NullableLabelStatus.Archived
		      Return "ARCHIVED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function NullableLabelTypeToString(value As NullableLabelType) As String
		  Select Case value
		    Case NullableLabelType.Brand
		      Return "BRAND"
		    Case NullableLabelType.Custom
		      Return "CUSTOM"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function NullablePartnerTypeToString(value As NullablePartnerType) As String
		  Select Case value
		    Case NullablePartnerType.Internal
		      Return "INTERNAL"
		    Case NullablePartnerType.External
		      Return "EXTERNAL"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function NullalbleMatchTypeToString(value As NullalbleMatchType) As String
		  Select Case value
		    Case NullalbleMatchType.Broad
		      Return "BROAD"
		    Case NullalbleMatchType.Phrase
		      Return "PHRASE"
		    Case NullalbleMatchType.Exact
		      Return "EXACT"
		    Case NullalbleMatchType.ExactNegative
		      Return "EXACT_NEGATIVE"
		    Case NullalbleMatchType.PhraseNegative
		      Return "PHRASE_NEGATIVE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function NumericFilterOperatorTypeToString(value As NumericFilterOperatorType) As String
		  Select Case value
		    Case NumericFilterOperatorType.GreaterThan
		      Return "GREATER_THAN"
		    Case NumericFilterOperatorType.GreaterThanOrEquals
		      Return "GREATER_THAN_OR_EQUALS"
		    Case NumericFilterOperatorType.LessThan
		      Return "LESS_THAN"
		    Case NumericFilterOperatorType.LessThanOrEquals
		      Return "LESS_THAN_OR_EQUALS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ObjectiveTypeToString(value As ObjectiveType) As String
		  Select Case value
		    Case ObjectiveType.Awareness
		      Return "AWARENESS"
		    Case ObjectiveType.Consideration
		      Return "CONSIDERATION"
		    Case ObjectiveType.WebConversion
		      Return "WEB_CONVERSION"
		    Case ObjectiveType.CatalogSales
		      Return "CATALOG_SALES"
		    Case ObjectiveType.VideoCompletion
		      Return "VIDEO_COMPLETION"
		    Case ObjectiveType.Sales
		      Return "SALES"
		    Case ObjectiveType.AppInstall
		      Return "APP_INSTALL"
		    Case ObjectiveType.CtvConsideration
		      Return "CTV_CONSIDERATION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OperationTypeToString(value As OperationType) As String
		  Select Case value
		    Case OperationType.Share
		      Return "SHARE"
		    Case OperationType.Revoke
		      Return "REVOKE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OptimizationTypeToString(value As OptimizationType) As String
		  Select Case value
		    Case OptimizationType.Clickthrough
		      Return "CLICKTHROUGH"
		    Case OptimizationType.Impression
		      Return "IMPRESSION"
		    Case OptimizationType.WebConversion
		      Return "WEB_CONVERSION"
		    Case OptimizationType.Roas
		      Return "ROAS"
		    Case OptimizationType.OutboundClick
		      Return "OUTBOUND_CLICK"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderToString(value As Order) As String
		  Select Case value
		    Case Order.Ascending
		      Return "ASCENDING"
		    Case Order.Descending
		      Return "DESCENDING"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderLinePaidTypeToString(value As OrderLinePaidType) As String
		  Select Case value
		    Case OrderLinePaidType.Paid
		      Return "PAID"
		    Case OrderLinePaidType.Bonus
		      Return "BONUS"
		    Case OrderLinePaidType.MakeGood
		      Return "MAKE_GOOD"
		    Case OrderLinePaidType.Test
		      Return "TEST"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderLineStatusToString(value As OrderLineStatus) As String
		  Select Case value
		    Case OrderLineStatus.Active
		      Return "ACTIVE"
		    Case OrderLineStatus.Paused
		      Return "PAUSED"
		    Case OrderLineStatus.Deleted
		      Return "DELETED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OsFamilyToString(value As OsFamily) As String
		  Select Case value
		    Case OsFamily.Ios
		      Return "ios"
		    Case OsFamily.Android
		      Return "android"
		    Case OsFamily.Macos
		      Return "macos"
		    Case OsFamily.Windows
		      Return "windows"
		    Case OsFamily.Linux
		      Return "linux"
		    Case OsFamily.Bsd
		      Return "bsd"
		    Case OsFamily.Other
		      Return "other"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OverallStatusOptionsToString(value As OverallStatusOptions) As String
		  Select Case value
		    Case OverallStatusOptions.NeedsImprovement
		      Return "NEEDS_IMPROVEMENT"
		    Case OverallStatusOptions.Fair
		      Return "FAIR"
		    Case OverallStatusOptions.Good
		      Return "GOOD"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PacingDeliveryTypeToString(value As PacingDeliveryType) As String
		  Select Case value
		    Case PacingDeliveryType.Standard
		      Return "STANDARD"
		    Case PacingDeliveryType.Accelerated
		      Return "ACCELERATED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PartnerTypeToString(value As PartnerType) As String
		  Select Case value
		    Case PartnerType.Internal
		      Return "INTERNAL"
		    Case PartnerType.External
		      Return "EXTERNAL"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PermissionsToString(value As Permissions) As String
		  Select Case value
		    Case Permissions.Admin
		      Return "ADMIN"
		    Case Permissions.Analyst
		      Return "ANALYST"
		    Case Permissions.FinanceManager
		      Return "FINANCE_MANAGER"
		    Case Permissions.FinanceEdit
		      Return "FINANCE_EDIT"
		    Case Permissions.FinanceView
		      Return "FINANCE_VIEW"
		    Case Permissions.AudienceManager
		      Return "AUDIENCE_MANAGER"
		    Case Permissions.CampaignManager
		      Return "CAMPAIGN_MANAGER"
		    Case Permissions.CatalogsManager
		      Return "CATALOGS_MANAGER"
		    Case Permissions.CatalogsViewer
		      Return "CATALOGS_VIEWER"
		    Case Permissions.ProfilePublisher
		      Return "PROFILE_PUBLISHER"
		    Case Permissions.ConsumerUser
		      Return "CONSUMER_USER"
		    Case Permissions.BizPinnerListSharer
		      Return "BIZ_PINNER_LIST_SHARER"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PermissionsWithOwnerToString(value As PermissionsWithOwner) As String
		  Select Case value
		    Case PermissionsWithOwner.Admin
		      Return "ADMIN"
		    Case PermissionsWithOwner.Analyst
		      Return "ANALYST"
		    Case PermissionsWithOwner.FinanceManager
		      Return "FINANCE_MANAGER"
		    Case PermissionsWithOwner.FinanceEdit
		      Return "FINANCE_EDIT"
		    Case PermissionsWithOwner.FinanceView
		      Return "FINANCE_VIEW"
		    Case PermissionsWithOwner.AudienceManager
		      Return "AUDIENCE_MANAGER"
		    Case PermissionsWithOwner.CampaignManager
		      Return "CAMPAIGN_MANAGER"
		    Case PermissionsWithOwner.CatalogsManager
		      Return "CATALOGS_MANAGER"
		    Case PermissionsWithOwner.CatalogsViewer
		      Return "CATALOGS_VIEWER"
		    Case PermissionsWithOwner.ProfilePublisher
		      Return "PROFILE_PUBLISHER"
		    Case PermissionsWithOwner.Owner
		      Return "OWNER"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PinFilterToString(value As PinFilter) As String
		  Select Case value
		    Case PinFilter.ExcludeNative
		      Return "exclude_native"
		    Case PinFilter.ExcludeRepins
		      Return "exclude_repins"
		    Case PinFilter.HasBeenPromoted
		      Return "has_been_promoted"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PinPromotionSummaryStatusToString(value As PinPromotionSummaryStatus) As String
		  Select Case value
		    Case PinPromotionSummaryStatus.Approved
		      Return "APPROVED"
		    Case PinPromotionSummaryStatus.Paused
		      Return "PAUSED"
		    Case PinPromotionSummaryStatus.Pending
		      Return "PENDING"
		    Case PinPromotionSummaryStatus.Rejected
		      Return "REJECTED"
		    Case PinPromotionSummaryStatus.AdvertiserDisabled
		      Return "ADVERTISER_DISABLED"
		    Case PinPromotionSummaryStatus.Archived
		      Return "ARCHIVED"
		    Case PinPromotionSummaryStatus.Draft
		      Return "DRAFT"
		    Case PinPromotionSummaryStatus.DeletedDraft
		      Return "DELETED_DRAFT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PinTypeToString(value As PinType) As String
		  Select Case value
		    Case PinType.Escapedprivate
		      Return "PRIVATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PinnerListTypeToString(value As PinnerListType) As String
		  Select Case value
		    Case PinnerListType.CustomerList
		      Return "CUSTOMER_LIST"
		    Case PinnerListType.Visitor
		      Return "VISITOR"
		    Case PinnerListType.Engagement
		      Return "ENGAGEMENT"
		    Case PinnerListType.Lookalike
		      Return "LOOKALIKE"
		    Case PinnerListType.Actalike
		      Return "ACTALIKE"
		    Case PinnerListType.Persona
		      Return "PERSONA"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PinterestLibPaginationOrderToString(value As PinterestLibPaginationOrder) As String
		  Select Case value
		    Case PinterestLibPaginationOrder.Ascending
		      Return "ASCENDING"
		    Case PinterestLibPaginationOrder.Descending
		      Return "DESCENDING"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PlacementGroupTypeToString(value As PlacementGroupType) As String
		  Select Case value
		    Case PlacementGroupType.All
		      Return "ALL"
		    Case PlacementGroupType.Search
		      Return "SEARCH"
		    Case PlacementGroupType.Browse
		      Return "BROWSE"
		    Case PlacementGroupType.Other
		      Return "OTHER"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PlacementTrafficTypeToString(value As PlacementTrafficType) As String
		  Select Case value
		    Case PlacementTrafficType.All
		      Return "ALL"
		    Case PlacementTrafficType.TwoColumnFeed
		      Return "TWO_COLUMN_FEED"
		    Case PlacementTrafficType.FullscreenFeed
		      Return "FULLSCREEN_FEED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PlacementTypeToString(value As PlacementType) As String
		  Select Case value
		    Case PlacementType.Search
		      Return "SEARCH"
		    Case PlacementType.Browse
		      Return "BROWSE"
		    Case PlacementType.RelatedPins
		      Return "RELATED_PINS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PreferredMediaTypeToString(value As PreferredMediaType) As String
		  Select Case value
		    Case PreferredMediaType.Video
		      Return "VIDEO"
		    Case PreferredMediaType.Image
		      Return "IMAGE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PrimarySortToString(value As PrimarySort) As String
		  Select Case value
		    Case PrimarySort.ById
		      Return "BY_ID"
		    Case PrimarySort.ByDate
		      Return "BY_DATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ProductAvailabilityToString(value As ProductAvailability) As String
		  Select Case value
		    Case ProductAvailability.InStock
		      Return "IN_STOCK"
		    Case ProductAvailability.OutOfStock
		      Return "OUT_OF_STOCK"
		    Case ProductAvailability.Preorder
		      Return "PREORDER"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ProductAvailabilityTypeToString(value As ProductAvailabilityType) As String
		  Select Case value
		    Case ProductAvailabilityType.InStock
		      Return "IN_STOCK"
		    Case ProductAvailabilityType.OutOfStock
		      Return "OUT_OF_STOCK"
		    Case ProductAvailabilityType.Preorder
		      Return "PREORDER"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ProductCategoriesEngagementTypeToString(value As ProductCategoriesEngagementType) As String
		  Select Case value
		    Case ProductCategoriesEngagementType.Engagement
		      Return "ENGAGEMENT"
		    Case ProductCategoriesEngagementType.OutboundClick
		      Return "OUTBOUND_CLICK"
		    Case ProductCategoriesEngagementType.Save
		      Return "SAVE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ProductCategoryDetailLookbackWindowToString(value As ProductCategoryDetailLookbackWindow) As String
		  Select Case value
		    Case ProductCategoryDetailLookbackWindow.Escaped90
		      Return "90"
		    Case ProductCategoryDetailLookbackWindow.Escaped180
		      Return "180"
		    Case ProductCategoryDetailLookbackWindow.Escaped365
		      Return "365"
		    Case ProductCategoryDetailLookbackWindow.Escaped730
		      Return "730"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ProductCategoryEnumToString(value As ProductCategoryEnum) As String
		  Select Case value
		    Case ProductCategoryEnum.AccentTables
		      Return "ACCENT_TABLES"
		    Case ProductCategoryEnum.Accessories
		      Return "ACCESSORIES"
		    Case ProductCategoryEnum.Anklets
		      Return "ANKLETS"
		    Case ProductCategoryEnum.Aprons
		      Return "APRONS"
		    Case ProductCategoryEnum.AreaRugs
		      Return "AREA_RUGS"
		    Case ProductCategoryEnum.ArmoiresAndWardrobes
		      Return "ARMOIRES_AND_WARDROBES"
		    Case ProductCategoryEnum.ArtAndCraftPaints
		      Return "ART_AND_CRAFT_PAINTS"
		    Case ProductCategoryEnum.ArtBrushes
		      Return "ART_BRUSHES"
		    Case ProductCategoryEnum.ArtificialFlora
		      Return "ARTIFICIAL_FLORA"
		    Case ProductCategoryEnum.Artwork
		      Return "ARTWORK"
		    Case ProductCategoryEnum.Audio
		      Return "AUDIO"
		    Case ProductCategoryEnum.AudioAccessories
		      Return "AUDIO_ACCESSORIES"
		    Case ProductCategoryEnum.Backpacks
		      Return "BACKPACKS"
		    Case ProductCategoryEnum.BagAndLuggageAccessories
		      Return "BAG_AND_LUGGAGE_ACCESSORIES"
		    Case ProductCategoryEnum.BagsAndLuggage
		      Return "BAGS_AND_LUGGAGE"
		    Case ProductCategoryEnum.Bakeware
		      Return "BAKEWARE"
		    Case ProductCategoryEnum.Bandanas
		      Return "BANDANAS"
		    Case ProductCategoryEnum.BarCarts
		      Return "BAR_CARTS"
		    Case ProductCategoryEnum.Barware
		      Return "BARWARE"
		    Case ProductCategoryEnum.Baskets
		      Return "BASKETS"
		    Case ProductCategoryEnum.BathAndBody
		      Return "BATH_AND_BODY"
		    Case ProductCategoryEnum.BathAndShower
		      Return "BATH_AND_SHOWER"
		    Case ProductCategoryEnum.BathMatsAndRugs
		      Return "BATH_MATS_AND_RUGS"
		    Case ProductCategoryEnum.BathTowelsAndWashcloths
		      Return "BATH_TOWELS_AND_WASHCLOTHS"
		    Case ProductCategoryEnum.BathroomAccessories
		      Return "BATHROOM_ACCESSORIES"
		    Case ProductCategoryEnum.BathroomAccessorySets
		      Return "BATHROOM_ACCESSORY_SETS"
		    Case ProductCategoryEnum.BathroomVanities
		      Return "BATHROOM_VANITIES"
		    Case ProductCategoryEnum.BeachTowels
		      Return "BEACH_TOWELS"
		    Case ProductCategoryEnum.BeadsAndJewelryMakingSupplies
		      Return "BEADS_AND_JEWELRY_MAKING_SUPPLIES"
		    Case ProductCategoryEnum.BeautySupplements
		      Return "BEAUTY_SUPPLEMENTS"
		    Case ProductCategoryEnum.BedSheets
		      Return "BED_SHEETS"
		    Case ProductCategoryEnum.Bedding
		      Return "BEDDING"
		    Case ProductCategoryEnum.BedroomVanities
		      Return "BEDROOM_VANITIES"
		    Case ProductCategoryEnum.BedsAndAccessories
		      Return "BEDS_AND_ACCESSORIES"
		    Case ProductCategoryEnum.BedsAndBedFrames
		      Return "BEDS_AND_BED_FRAMES"
		    Case ProductCategoryEnum.BeltBags
		      Return "BELT_BAGS"
		    Case ProductCategoryEnum.BeltsAndSuspenders
		      Return "BELTS_AND_SUSPENDERS"
		    Case ProductCategoryEnum.Benches
		      Return "BENCHES"
		    Case ProductCategoryEnum.Beverages
		      Return "BEVERAGES"
		    Case ProductCategoryEnum.BirdSupplies
		      Return "BIRD_SUPPLIES"
		    Case ProductCategoryEnum.Blankets
		      Return "BLANKETS"
		    Case ProductCategoryEnum.Blouses
		      Return "BLOUSES"
		    Case ProductCategoryEnum.BlushesAndBronzers
		      Return "BLUSHES_AND_BRONZERS"
		    Case ProductCategoryEnum.BodyCare
		      Return "BODY_CARE"
		    Case ProductCategoryEnum.BodyJewelry
		      Return "BODY_JEWELRY"
		    Case ProductCategoryEnum.BodyMakeup
		      Return "BODY_MAKEUP"
		    Case ProductCategoryEnum.BodyMoisturizers
		      Return "BODY_MOISTURIZERS"
		    Case ProductCategoryEnum.BodyWashes
		      Return "BODY_WASHES"
		    Case ProductCategoryEnum.BookcasesAndStandingShelves
		      Return "BOOKCASES_AND_STANDING_SHELVES"
		    Case ProductCategoryEnum.Bookends
		      Return "BOOKENDS"
		    Case ProductCategoryEnum.Books
		      Return "BOOKS"
		    Case ProductCategoryEnum.Boots
		      Return "BOOTS"
		    Case ProductCategoryEnum.Bracelets
		      Return "BRACELETS"
		    Case ProductCategoryEnum.BridesmaidDresses
		      Return "BRIDESMAID_DRESSES"
		    Case ProductCategoryEnum.BroochesAndLapelPins
		      Return "BROOCHES_AND_LAPEL_PINS"
		    Case ProductCategoryEnum.BrowMakeup
		      Return "BROW_MAKEUP"
		    Case ProductCategoryEnum.BuffetsAndSideboards
		      Return "BUFFETS_AND_SIDEBOARDS"
		    Case ProductCategoryEnum.ButtonDownShirts
		      Return "BUTTON_DOWN_SHIRTS"
		    Case ProductCategoryEnum.CabinetHardware
		      Return "CABINET_HARDWARE"
		    Case ProductCategoryEnum.CabinetsAndStorageFurniture
		      Return "CABINETS_AND_STORAGE_FURNITURE"
		    Case ProductCategoryEnum.CakeDecoratingSupplies
		      Return "CAKE_DECORATING_SUPPLIES"
		    Case ProductCategoryEnum.CampingAndHiking
		      Return "CAMPING_AND_HIKING"
		    Case ProductCategoryEnum.CandleHolders
		      Return "CANDLE_HOLDERS"
		    Case ProductCategoryEnum.Candles
		      Return "CANDLES"
		    Case ProductCategoryEnum.CardstockPapers
		      Return "CARDSTOCK_PAPERS"
		    Case ProductCategoryEnum.CasualPants
		      Return "CASUAL_PANTS"
		    Case ProductCategoryEnum.CatSupplies
		      Return "CAT_SUPPLIES"
		    Case ProductCategoryEnum.Chairs
		      Return "CHAIRS"
		    Case ProductCategoryEnum.Chandeliers
		      Return "CHANDELIERS"
		    Case ProductCategoryEnum.CharmsAndPendants
		      Return "CHARMS_AND_PENDANTS"
		    Case ProductCategoryEnum.ChinaCabinetsAndHutches
		      Return "CHINA_CABINETS_AND_HUTCHES"
		    Case ProductCategoryEnum.ClogsAndMules
		      Return "CLOGS_AND_MULES"
		    Case ProductCategoryEnum.ClothNapkins
		      Return "CLOTH_NAPKINS"
		    Case ProductCategoryEnum.Clothing
		      Return "CLOTHING"
		    Case ProductCategoryEnum.ClothingAndClosetStorage
		      Return "CLOTHING_AND_CLOSET_STORAGE"
		    Case ProductCategoryEnum.ClothingSets
		      Return "CLOTHING_SETS"
		    Case ProductCategoryEnum.Coasters
		      Return "COASTERS"
		    Case ProductCategoryEnum.CoatsAndJackets
		      Return "COATS_AND_JACKETS"
		    Case ProductCategoryEnum.CoffeeAndTeaCups
		      Return "COFFEE_AND_TEA_CUPS"
		    Case ProductCategoryEnum.CoffeeMakersAndEspressoMachines
		      Return "COFFEE_MAKERS_AND_ESPRESSO_MACHINES"
		    Case ProductCategoryEnum.ColoringBooks
		      Return "COLORING_BOOKS"
		    Case ProductCategoryEnum.Communications
		      Return "COMMUNICATIONS"
		    Case ProductCategoryEnum.ComputerAccessories
		      Return "COMPUTER_ACCESSORIES"
		    Case ProductCategoryEnum.CookieCutters
		      Return "COOKIE_CUTTERS"
		    Case ProductCategoryEnum.Cookware
		      Return "COOKWARE"
		    Case ProductCategoryEnum.CookwareAndBakeware
		      Return "COOKWARE_AND_BAKEWARE"
		    Case ProductCategoryEnum.CosmeticAndToiletryBags
		      Return "COSMETIC_AND_TOILETRY_BAGS"
		    Case ProductCategoryEnum.CostumesAndAccessories
		      Return "COSTUMES_AND_ACCESSORIES"
		    Case ProductCategoryEnum.CraftAdhesivesAndMagnets
		      Return "CRAFT_ADHESIVES_AND_MAGNETS"
		    Case ProductCategoryEnum.CraftCuttingTools
		      Return "CRAFT_CUTTING_TOOLS"
		    Case ProductCategoryEnum.CraftMolds
		      Return "CRAFT_MOLDS"
		    Case ProductCategoryEnum.CribsAndToddlerBeds
		      Return "CRIBS_AND_TODDLER_BEDS"
		    Case ProductCategoryEnum.CurtainAndDrapeRods
		      Return "CURTAIN_AND_DRAPE_RODS"
		    Case ProductCategoryEnum.CurtainsAndDrapes
		      Return "CURTAINS_AND_DRAPES"
		    Case ProductCategoryEnum.CuttingBoards
		      Return "CUTTING_BOARDS"
		    Case ProductCategoryEnum.Cycling
		      Return "CYCLING"
		    Case ProductCategoryEnum.DecorativeBowls
		      Return "DECORATIVE_BOWLS"
		    Case ProductCategoryEnum.DecorativeJars
		      Return "DECORATIVE_JARS"
		    Case ProductCategoryEnum.DecorativeTapestries
		      Return "DECORATIVE_TAPESTRIES"
		    Case ProductCategoryEnum.DecorativeTrays
		      Return "DECORATIVE_TRAYS"
		    Case ProductCategoryEnum.DeodorantsAndAntiperspirants
		      Return "DEODORANTS_AND_ANTIPERSPIRANTS"
		    Case ProductCategoryEnum.DeskAndShelfClocks
		      Return "DESK_AND_SHELF_CLOCKS"
		    Case ProductCategoryEnum.Desks
		      Return "DESKS"
		    Case ProductCategoryEnum.DiaperBags
		      Return "DIAPER_BAGS"
		    Case ProductCategoryEnum.Dinnerware
		      Return "DINNERWARE"
		    Case ProductCategoryEnum.Dishwashers
		      Return "DISHWASHERS"
		    Case ProductCategoryEnum.DogSupplies
		      Return "DOG_SUPPLIES"
		    Case ProductCategoryEnum.DoorMats
		      Return "DOOR_MATS"
		    Case ProductCategoryEnum.DrawingAndPainting
		      Return "DRAWING_AND_PAINTING"
		    Case ProductCategoryEnum.DressPants
		      Return "DRESS_PANTS"
		    Case ProductCategoryEnum.Dressers
		      Return "DRESSERS"
		    Case ProductCategoryEnum.Dresses
		      Return "DRESSES"
		    Case ProductCategoryEnum.DrillsAndScrewdrivers
		      Return "DRILLS_AND_SCREWDRIVERS"
		    Case ProductCategoryEnum.Drinkware
		      Return "DRINKWARE"
		    Case ProductCategoryEnum.DuffelBags
		      Return "DUFFEL_BAGS"
		    Case ProductCategoryEnum.DuvetCovers
		      Return "DUVET_COVERS"
		    Case ProductCategoryEnum.DvdsAndVideos
		      Return "DVDS_AND_VIDEOS"
		    Case ProductCategoryEnum.Earrings
		      Return "EARRINGS"
		    Case ProductCategoryEnum.ElectronicsAccessories
		      Return "ELECTRONICS_ACCESSORIES"
		    Case ProductCategoryEnum.EngagementAndWeddingRings
		      Return "ENGAGEMENT_AND_WEDDING_RINGS"
		    Case ProductCategoryEnum.EntertainmentCentersAndTvStands
		      Return "ENTERTAINMENT_CENTERS_AND_TV_STANDS"
		    Case ProductCategoryEnum.Erasers
		      Return "ERASERS"
		    Case ProductCategoryEnum.EyeMakeup
		      Return "EYE_MAKEUP"
		    Case ProductCategoryEnum.EyeShadow
		      Return "EYE_SHADOW"
		    Case ProductCategoryEnum.Eyeliners
		      Return "EYELINERS"
		    Case ProductCategoryEnum.Fabric
		      Return "FABRIC"
		    Case ProductCategoryEnum.FaceCoverings
		      Return "FACE_COVERINGS"
		    Case ProductCategoryEnum.FaceLotionsAndCreams
		      Return "FACE_LOTIONS_AND_CREAMS"
		    Case ProductCategoryEnum.FaceMakeup
		      Return "FACE_MAKEUP"
		    Case ProductCategoryEnum.FacialCleansers
		      Return "FACIAL_CLEANSERS"
		    Case ProductCategoryEnum.FacialMoisturizers
		      Return "FACIAL_MOISTURIZERS"
		    Case ProductCategoryEnum.FalseEyelashes
		      Return "FALSE_EYELASHES"
		    Case ProductCategoryEnum.Figurines
		      Return "FIGURINES"
		    Case ProductCategoryEnum.FireplaceAndWoodStoveAccessories
		      Return "FIREPLACE_AND_WOOD_STOVE_ACCESSORIES"
		    Case ProductCategoryEnum.Fireplaces
		      Return "FIREPLACES"
		    Case ProductCategoryEnum.Fishing
		      Return "FISHING"
		    Case ProductCategoryEnum.FlagsAndWindsocks
		      Return "FLAGS_AND_WINDSOCKS"
		    Case ProductCategoryEnum.Flats
		      Return "FLATS"
		    Case ProductCategoryEnum.Flatware
		      Return "FLATWARE"
		    Case ProductCategoryEnum.FloorLamps
		      Return "FLOOR_LAMPS"
		    Case ProductCategoryEnum.FlowerGirlDresses
		      Return "FLOWER_GIRL_DRESSES"
		    Case ProductCategoryEnum.FoodAndBeverageCarriers
		      Return "FOOD_AND_BEVERAGE_CARRIERS"
		    Case ProductCategoryEnum.FoodCookersAndSteamers
		      Return "FOOD_COOKERS_AND_STEAMERS"
		    Case ProductCategoryEnum.FoodItems
		      Return "FOOD_ITEMS"
		    Case ProductCategoryEnum.FoodMixersAndBlenders
		      Return "FOOD_MIXERS_AND_BLENDERS"
		    Case ProductCategoryEnum.FoodStorageContainers
		      Return "FOOD_STORAGE_CONTAINERS"
		    Case ProductCategoryEnum.FoodStorageSupplies
		      Return "FOOD_STORAGE_SUPPLIES"
		    Case ProductCategoryEnum.FoundationsAndConcealers
		      Return "FOUNDATIONS_AND_CONCEALERS"
		    Case ProductCategoryEnum.FountainsAndPonds
		      Return "FOUNTAINS_AND_PONDS"
		    Case ProductCategoryEnum.Fragrance
		      Return "FRAGRANCE"
		    Case ProductCategoryEnum.Furniture
		      Return "FURNITURE"
		    Case ProductCategoryEnum.FurnitureSets
		      Return "FURNITURE_SETS"
		    Case ProductCategoryEnum.Games
		      Return "GAMES"
		    Case ProductCategoryEnum.Gardening
		      Return "GARDENING"
		    Case ProductCategoryEnum.GardeningTools
		      Return "GARDENING_TOOLS"
		    Case ProductCategoryEnum.GlovesAndMittens
		      Return "GLOVES_AND_MITTENS"
		    Case ProductCategoryEnum.GluesAndTapes
		      Return "GLUES_AND_TAPES"
		    Case ProductCategoryEnum.GroomAndGroomsmenSuits
		      Return "GROOM_AND_GROOMSMEN_SUITS"
		    Case ProductCategoryEnum.Hair
		      Return "HAIR"
		    Case ProductCategoryEnum.HairAccessories
		      Return "HAIR_ACCESSORIES"
		    Case ProductCategoryEnum.HairCare
		      Return "HAIR_CARE"
		    Case ProductCategoryEnum.HairColor
		      Return "HAIR_COLOR"
		    Case ProductCategoryEnum.HairCombs
		      Return "HAIR_COMBS"
		    Case ProductCategoryEnum.HairPinsClawsAndClips
		      Return "HAIR_PINS_CLAWS_AND_CLIPS"
		    Case ProductCategoryEnum.HairRemoval
		      Return "HAIR_REMOVAL"
		    Case ProductCategoryEnum.HairTools
		      Return "HAIR_TOOLS"
		    Case ProductCategoryEnum.HairTreatment
		      Return "HAIR_TREATMENT"
		    Case ProductCategoryEnum.HairWreaths
		      Return "HAIR_WREATHS"
		    Case ProductCategoryEnum.HandAndFootCare
		      Return "HAND_AND_FOOT_CARE"
		    Case ProductCategoryEnum.HandSoapsAndSanitizers
		      Return "HAND_SOAPS_AND_SANITIZERS"
		    Case ProductCategoryEnum.Handbags
		      Return "HANDBAGS"
		    Case ProductCategoryEnum.Handkerchiefs
		      Return "HANDKERCHIEFS"
		    Case ProductCategoryEnum.HardwareSupplies
		      Return "HARDWARE_SUPPLIES"
		    Case ProductCategoryEnum.Hats
		      Return "HATS"
		    Case ProductCategoryEnum.HeadboardsAndFootboards
		      Return "HEADBOARDS_AND_FOOTBOARDS"
		    Case ProductCategoryEnum.Headwear
		      Return "HEADWEAR"
		    Case ProductCategoryEnum.Highlighters
		      Return "HIGHLIGHTERS"
		    Case ProductCategoryEnum.HobbiesAndCreativeArts
		      Return "HOBBIES_AND_CREATIVE_ARTS"
		    Case ProductCategoryEnum.HomeAccessories
		      Return "HOME_ACCESSORIES"
		    Case ProductCategoryEnum.HomeDecorDecals
		      Return "HOME_DECOR_DECALS"
		    Case ProductCategoryEnum.HomeFragranceAccessories
		      Return "HOME_FRAGRANCE_ACCESSORIES"
		    Case ProductCategoryEnum.HomeFragrances
		      Return "HOME_FRAGRANCES"
		    Case ProductCategoryEnum.HomeImprovementToolsAndSupplies
		      Return "HOME_IMPROVEMENT_TOOLS_AND_SUPPLIES"
		    Case ProductCategoryEnum.Hosiery
		      Return "HOSIERY"
		    Case ProductCategoryEnum.HouseholdAppliances
		      Return "HOUSEHOLD_APPLIANCES"
		    Case ProductCategoryEnum.HouseholdSupplies
		      Return "HOUSEHOLD_SUPPLIES"
		    Case ProductCategoryEnum.Incense
		      Return "INCENSE"
		    Case ProductCategoryEnum.IndoorGames
		      Return "INDOOR_GAMES"
		    Case ProductCategoryEnum.Jeans
		      Return "JEANS"
		    Case ProductCategoryEnum.JewelryAndWatchAccessories
		      Return "JEWELRY_AND_WATCH_ACCESSORIES"
		    Case ProductCategoryEnum.JewelryAndWatches
		      Return "JEWELRY_AND_WATCHES"
		    Case ProductCategoryEnum.JewelrySets
		      Return "JEWELRY_SETS"
		    Case ProductCategoryEnum.JumpsuitsAndRompers
		      Return "JUMPSUITS_AND_ROMPERS"
		    Case ProductCategoryEnum.Keychains
		      Return "KEYCHAINS"
		    Case ProductCategoryEnum.KitchenAndDining
		      Return "KITCHEN_AND_DINING"
		    Case ProductCategoryEnum.KitchenAndDiningRoomTables
		      Return "KITCHEN_AND_DINING_ROOM_TABLES"
		    Case ProductCategoryEnum.KitchenAppliances
		      Return "KITCHEN_APPLIANCES"
		    Case ProductCategoryEnum.KitchenKnives
		      Return "KITCHEN_KNIVES"
		    Case ProductCategoryEnum.KitchenLinens
		      Return "KITCHEN_LINENS"
		    Case ProductCategoryEnum.KitchenMats
		      Return "KITCHEN_MATS"
		    Case ProductCategoryEnum.KitchenOrganizers
		      Return "KITCHEN_ORGANIZERS"
		    Case ProductCategoryEnum.KitchenToolsAndUtensils
		      Return "KITCHEN_TOOLS_AND_UTENSILS"
		    Case ProductCategoryEnum.KitchenTowels
		      Return "KITCHEN_TOWELS"
		    Case ProductCategoryEnum.KnittingAndCrochet
		      Return "KNITTING_AND_CROCHET"
		    Case ProductCategoryEnum.KnittingAndCrochetTools
		      Return "KNITTING_AND_CROCHET_TOOLS"
		    Case ProductCategoryEnum.LampShades
		      Return "LAMP_SHADES"
		    Case ProductCategoryEnum.Lamps
		      Return "LAMPS"
		    Case ProductCategoryEnum.Lanyards
		      Return "LANYARDS"
		    Case ProductCategoryEnum.LaundryHampersAndSupplies
		      Return "LAUNDRY_HAMPERS_AND_SUPPLIES"
		    Case ProductCategoryEnum.LawnAndGarden
		      Return "LAWN_AND_GARDEN"
		    Case ProductCategoryEnum.LawnAndGardenDecor
		      Return "LAWN_AND_GARDEN_DECOR"
		    Case ProductCategoryEnum.LawnOrnamentsAndGardenSculptures
		      Return "LAWN_ORNAMENTS_AND_GARDEN_SCULPTURES"
		    Case ProductCategoryEnum.Leggings
		      Return "LEGGINGS"
		    Case ProductCategoryEnum.LeotardsAndUnitards
		      Return "LEOTARDS_AND_UNITARDS"
		    Case ProductCategoryEnum.Lighting
		      Return "LIGHTING"
		    Case ProductCategoryEnum.LightingAccessories
		      Return "LIGHTING_ACCESSORIES"
		    Case ProductCategoryEnum.LightingFixtures
		      Return "LIGHTING_FIXTURES"
		    Case ProductCategoryEnum.LipBalms
		      Return "LIP_BALMS"
		    Case ProductCategoryEnum.LipCare
		      Return "LIP_CARE"
		    Case ProductCategoryEnum.LipMakeup
		      Return "LIP_MAKEUP"
		    Case ProductCategoryEnum.LipsticksAndLipGlosses
		      Return "LIPSTICKS_AND_LIP_GLOSSES"
		    Case ProductCategoryEnum.MagazinesAndNewspapers
		      Return "MAGAZINES_AND_NEWSPAPERS"
		    Case ProductCategoryEnum.Magnets
		      Return "MAGNETS"
		    Case ProductCategoryEnum.Makeup
		      Return "MAKEUP"
		    Case ProductCategoryEnum.MakeupTools
		      Return "MAKEUP_TOOLS"
		    Case ProductCategoryEnum.Mascaras
		      Return "MASCARAS"
		    Case ProductCategoryEnum.Mattresses
		      Return "MATTRESSES"
		    Case ProductCategoryEnum.MeasuresAndRulers
		      Return "MEASURES_AND_RULERS"
		    Case ProductCategoryEnum.MeasuringToolsAndSensors
		      Return "MEASURING_TOOLS_AND_SENSORS"
		    Case ProductCategoryEnum.MessengerBags
		      Return "MESSENGER_BAGS"
		    Case ProductCategoryEnum.Mirrors
		      Return "MIRRORS"
		    Case ProductCategoryEnum.MusicAndSoundRecordings
		      Return "MUSIC_AND_SOUND_RECORDINGS"
		    Case ProductCategoryEnum.NailArt
		      Return "NAIL_ART"
		    Case ProductCategoryEnum.NailArtKitAndTools
		      Return "NAIL_ART_KIT_AND_TOOLS"
		    Case ProductCategoryEnum.NailCare
		      Return "NAIL_CARE"
		    Case ProductCategoryEnum.NailPolishes
		      Return "NAIL_POLISHES"
		    Case ProductCategoryEnum.Nails
		      Return "NAILS"
		    Case ProductCategoryEnum.Necklaces
		      Return "NECKLACES"
		    Case ProductCategoryEnum.Neckties
		      Return "NECKTIES"
		    Case ProductCategoryEnum.NightLightsAndAmbientLighting
		      Return "NIGHT_LIGHTS_AND_AMBIENT_LIGHTING"
		    Case ProductCategoryEnum.Nightstands
		      Return "NIGHTSTANDS"
		    Case ProductCategoryEnum.NoveltySigns
		      Return "NOVELTY_SIGNS"
		    Case ProductCategoryEnum.OnePieces
		      Return "ONE_PIECES"
		    Case ProductCategoryEnum.Onesies
		      Return "ONESIES"
		    Case ProductCategoryEnum.Ottomans
		      Return "OTTOMANS"
		    Case ProductCategoryEnum.OutdoorFurniture
		      Return "OUTDOOR_FURNITURE"
		    Case ProductCategoryEnum.OutdoorFurnitureSets
		      Return "OUTDOOR_FURNITURE_SETS"
		    Case ProductCategoryEnum.OutdoorGames
		      Return "OUTDOOR_GAMES"
		    Case ProductCategoryEnum.OutdoorGrills
		      Return "OUTDOOR_GRILLS"
		    Case ProductCategoryEnum.OutdoorLiving
		      Return "OUTDOOR_LIVING"
		    Case ProductCategoryEnum.OutdoorPlayEquipment
		      Return "OUTDOOR_PLAY_EQUIPMENT"
		    Case ProductCategoryEnum.OutdoorRecreation
		      Return "OUTDOOR_RECREATION"
		    Case ProductCategoryEnum.OutdoorRugs
		      Return "OUTDOOR_RUGS"
		    Case ProductCategoryEnum.OutdoorSeating
		      Return "OUTDOOR_SEATING"
		    Case ProductCategoryEnum.OutdoorStructures
		      Return "OUTDOOR_STRUCTURES"
		    Case ProductCategoryEnum.OutdoorTables
		      Return "OUTDOOR_TABLES"
		    Case ProductCategoryEnum.Outerwear
		      Return "OUTERWEAR"
		    Case ProductCategoryEnum.OvensAndCooktops
		      Return "OVENS_AND_COOKTOPS"
		    Case ProductCategoryEnum.Overalls
		      Return "OVERALLS"
		    Case ProductCategoryEnum.OxfordsAndLoafers
		      Return "OXFORDS_AND_LOAFERS"
		    Case ProductCategoryEnum.PaintAndPaintTools
		      Return "PAINT_AND_PAINT_TOOLS"
		    Case ProductCategoryEnum.Pants
		      Return "PANTS"
		    Case ProductCategoryEnum.PaperCrafts
		      Return "PAPER_CRAFTS"
		    Case ProductCategoryEnum.ParasolsAndRainUmbrellas
		      Return "PARASOLS_AND_RAIN_UMBRELLAS"
		    Case ProductCategoryEnum.PartyAndCelebration
		      Return "PARTY_AND_CELEBRATION"
		    Case ProductCategoryEnum.PendantLights
		      Return "PENDANT_LIGHTS"
		    Case ProductCategoryEnum.PensAndPencils
		      Return "PENS_AND_PENCILS"
		    Case ProductCategoryEnum.PerfumesAndColognes
		      Return "PERFUMES_AND_COLOGNES"
		    Case ProductCategoryEnum.PetCarriersAndCrates
		      Return "PET_CARRIERS_AND_CRATES"
		    Case ProductCategoryEnum.PetCollarsAndHarnesses
		      Return "PET_COLLARS_AND_HARNESSES"
		    Case ProductCategoryEnum.PetSupplies
		      Return "PET_SUPPLIES"
		    Case ProductCategoryEnum.PhotoAlbumsAndStorage
		      Return "PHOTO_ALBUMS_AND_STORAGE"
		    Case ProductCategoryEnum.PictureFrames
		      Return "PICTURE_FRAMES"
		    Case ProductCategoryEnum.PillowcasesAndShams
		      Return "PILLOWCASES_AND_SHAMS"
		    Case ProductCategoryEnum.PinbackButtons
		      Return "PINBACK_BUTTONS"
		    Case ProductCategoryEnum.Placemats
		      Return "PLACEMATS"
		    Case ProductCategoryEnum.Plants
		      Return "PLANTS"
		    Case ProductCategoryEnum.PonytailHolders
		      Return "PONYTAIL_HOLDERS"
		    Case ProductCategoryEnum.PoolAndSpaAccessories
		      Return "POOL_AND_SPA_ACCESSORIES"
		    Case ProductCategoryEnum.PostersPrintsAndVisualArtwork
		      Return "POSTERS_PRINTS_AND_VISUAL_ARTWORK"
		    Case ProductCategoryEnum.PotsAndPlanters
		      Return "POTS_AND_PLANTERS"
		    Case ProductCategoryEnum.PotteryAndSculpting
		      Return "POTTERY_AND_SCULPTING"
		    Case ProductCategoryEnum.PrimersAndMakeupSetters
		      Return "PRIMERS_AND_MAKEUP_SETTERS"
		    Case ProductCategoryEnum.Pumps
		      Return "PUMPS"
		    Case ProductCategoryEnum.Puzzles
		      Return "PUZZLES"
		    Case ProductCategoryEnum.QuiltsAndComforters
		      Return "QUILTS_AND_COMFORTERS"
		    Case ProductCategoryEnum.RazorsAndShavingTools
		      Return "RAZORS_AND_SHAVING_TOOLS"
		    Case ProductCategoryEnum.Rings
		      Return "RINGS"
		    Case ProductCategoryEnum.Rugs
		      Return "RUGS"
		    Case ProductCategoryEnum.RunnerRugs
		      Return "RUNNER_RUGS"
		    Case ProductCategoryEnum.Sandals
		      Return "SANDALS"
		    Case ProductCategoryEnum.Sashes
		      Return "SASHES"
		    Case ProductCategoryEnum.Saws
		      Return "SAWS"
		    Case ProductCategoryEnum.ScarvesAndShawls
		      Return "SCARVES_AND_SHAWLS"
		    Case ProductCategoryEnum.SculpturesAndStatues
		      Return "SCULPTURES_AND_STATUES"
		    Case ProductCategoryEnum.SeasonalAndHolidayDecorations
		      Return "SEASONAL_AND_HOLIDAY_DECORATIONS"
		    Case ProductCategoryEnum.Seating
		      Return "SEATING"
		    Case ProductCategoryEnum.SerumsAndEssences
		      Return "SERUMS_AND_ESSENCES"
		    Case ProductCategoryEnum.Serveware
		      Return "SERVEWARE"
		    Case ProductCategoryEnum.SewingMachines
		      Return "SEWING_MACHINES"
		    Case ProductCategoryEnum.SewingPatterns
		      Return "SEWING_PATTERNS"
		    Case ProductCategoryEnum.ShampooAndConditioner
		      Return "SHAMPOO_AND_CONDITIONER"
		    Case ProductCategoryEnum.ShoeAccessories
		      Return "SHOE_ACCESSORIES"
		    Case ProductCategoryEnum.Shoes
		      Return "SHOES"
		    Case ProductCategoryEnum.ShoppingTotes
		      Return "SHOPPING_TOTES"
		    Case ProductCategoryEnum.Shorts
		      Return "SHORTS"
		    Case ProductCategoryEnum.ShowerCurtains
		      Return "SHOWER_CURTAINS"
		    Case ProductCategoryEnum.Skincare
		      Return "SKINCARE"
		    Case ProductCategoryEnum.SkincareMasksAndPeels
		      Return "SKINCARE_MASKS_AND_PEELS"
		    Case ProductCategoryEnum.Skirts
		      Return "SKIRTS"
		    Case ProductCategoryEnum.SleepwearAndLoungewear
		      Return "SLEEPWEAR_AND_LOUNGEWEAR"
		    Case ProductCategoryEnum.SlipcoversAndCushions
		      Return "SLIPCOVERS_AND_CUSHIONS"
		    Case ProductCategoryEnum.Slippers
		      Return "SLIPPERS"
		    Case ProductCategoryEnum.SneakersAndAthleticShoes
		      Return "SNEAKERS_AND_ATHLETIC_SHOES"
		    Case ProductCategoryEnum.SocksAndTights
		      Return "SOCKS_AND_TIGHTS"
		    Case ProductCategoryEnum.Sofas
		      Return "SOFAS"
		    Case ProductCategoryEnum.SportsUniforms
		      Return "SPORTS_UNIFORMS"
		    Case ProductCategoryEnum.Stemware
		      Return "STEMWARE"
		    Case ProductCategoryEnum.Stockings
		      Return "STOCKINGS"
		    Case ProductCategoryEnum.StorageAndOrganization
		      Return "STORAGE_AND_ORGANIZATION"
		    Case ProductCategoryEnum.StorageCabinetsAndLockers
		      Return "STORAGE_CABINETS_AND_LOCKERS"
		    Case ProductCategoryEnum.StorageHooksAndRacks
		      Return "STORAGE_HOOKS_AND_RACKS"
		    Case ProductCategoryEnum.Suitcases
		      Return "SUITCASES"
		    Case ProductCategoryEnum.Suits
		      Return "SUITS"
		    Case ProductCategoryEnum.SuitsAndSuitSeparates
		      Return "SUITS_AND_SUIT_SEPARATES"
		    Case ProductCategoryEnum.GlassesAndSunglasses
		      Return "GLASSES_AND_SUNGLASSES"
		    Case ProductCategoryEnum.Sunscreen
		      Return "SUNSCREEN"
		    Case ProductCategoryEnum.SweatersAndCardigans
		      Return "SWEATERS_AND_CARDIGANS"
		    Case ProductCategoryEnum.SweatshirtsAndHoodies
		      Return "SWEATSHIRTS_AND_HOODIES"
		    Case ProductCategoryEnum.Swimwear
		      Return "SWIMWEAR"
		    Case ProductCategoryEnum.TShirts
		      Return "T_SHIRTS"
		    Case ProductCategoryEnum.TableLamps
		      Return "TABLE_LAMPS"
		    Case ProductCategoryEnum.TableRunners
		      Return "TABLE_RUNNERS"
		    Case ProductCategoryEnum.Tablecloths
		      Return "TABLECLOTHS"
		    Case ProductCategoryEnum.Tables
		      Return "TABLES"
		    Case ProductCategoryEnum.Tableware
		      Return "TABLEWARE"
		    Case ProductCategoryEnum.TankTops
		      Return "TANK_TOPS"
		    Case ProductCategoryEnum.TanningOilsAndLotions
		      Return "TANNING_OILS_AND_LOTIONS"
		    Case ProductCategoryEnum.TeethWhitening
		      Return "TEETH_WHITENING"
		    Case ProductCategoryEnum.TeethWhiteningTools
		      Return "TEETH_WHITENING_TOOLS"
		    Case ProductCategoryEnum.Telephony
		      Return "TELEPHONY"
		    Case ProductCategoryEnum.TextileAndSewing
		      Return "TEXTILE_AND_SEWING"
		    Case ProductCategoryEnum.ThreadAndYarn
		      Return "THREAD_AND_YARN"
		    Case ProductCategoryEnum.ThrowPillows
		      Return "THROW_PILLOWS"
		    Case ProductCategoryEnum.Tiaras
		      Return "TIARAS"
		    Case ProductCategoryEnum.ToiletPaperHolders
		      Return "TOILET_PAPER_HOLDERS"
		    Case ProductCategoryEnum.TonersAndAstringents
		      Return "TONERS_AND_ASTRINGENTS"
		    Case ProductCategoryEnum.ToolStorageAndOrganization
		      Return "TOOL_STORAGE_AND_ORGANIZATION"
		    Case ProductCategoryEnum.Tools
		      Return "TOOLS"
		    Case ProductCategoryEnum.Tops
		      Return "TOPS"
		    Case ProductCategoryEnum.TowelRacksAndHolders
		      Return "TOWEL_RACKS_AND_HOLDERS"
		    Case ProductCategoryEnum.Toys
		      Return "TOYS"
		    Case ProductCategoryEnum.TraditionalAndCeremonialClothing
		      Return "TRADITIONAL_AND_CEREMONIAL_CLOTHING"
		    Case ProductCategoryEnum.TumblersAndWaterBottles
		      Return "TUMBLERS_AND_WATER_BOTTLES"
		    Case ProductCategoryEnum.Uniforms
		      Return "UNIFORMS"
		    Case ProductCategoryEnum.Vases
		      Return "VASES"
		    Case ProductCategoryEnum.VehiclePartsAndAccessories
		      Return "VEHICLE_PARTS_AND_ACCESSORIES"
		    Case ProductCategoryEnum.Veils
		      Return "VEILS"
		    Case ProductCategoryEnum.WallClocks
		      Return "WALL_CLOCKS"
		    Case ProductCategoryEnum.WallLightFixtures
		      Return "WALL_LIGHT_FIXTURES"
		    Case ProductCategoryEnum.WallPaints
		      Return "WALL_PAINTS"
		    Case ProductCategoryEnum.WallShelvesAndLedges
		      Return "WALL_SHELVES_AND_LEDGES"
		    Case ProductCategoryEnum.WalletsAndCardCases
		      Return "WALLETS_AND_CARD_CASES"
		    Case ProductCategoryEnum.Wallpapers
		      Return "WALLPAPERS"
		    Case ProductCategoryEnum.Watches
		      Return "WATCHES"
		    Case ProductCategoryEnum.WateringAndIrrigation
		      Return "WATERING_AND_IRRIGATION"
		    Case ProductCategoryEnum.WeddingCeremonyDecor
		      Return "WEDDING_CEREMONY_DECOR"
		    Case ProductCategoryEnum.WeddingClothing
		      Return "WEDDING_CLOTHING"
		    Case ProductCategoryEnum.WeddingDecor
		      Return "WEDDING_DECOR"
		    Case ProductCategoryEnum.WeddingDress
		      Return "WEDDING_DRESS"
		    Case ProductCategoryEnum.WeddingGifts
		      Return "WEDDING_GIFTS"
		    Case ProductCategoryEnum.WeddingStationery
		      Return "WEDDING_STATIONERY"
		    Case ProductCategoryEnum.WeddingTableDecor
		      Return "WEDDING_TABLE_DECOR"
		    Case ProductCategoryEnum.WigsAndHairExtensions
		      Return "WIGS_AND_HAIR_EXTENSIONS"
		    Case ProductCategoryEnum.WindowBlindsAndShades
		      Return "WINDOW_BLINDS_AND_SHADES"
		    Case ProductCategoryEnum.WindowTreatmentAccessories
		      Return "WINDOW_TREATMENT_ACCESSORIES"
		    Case ProductCategoryEnum.WindowTreatments
		      Return "WINDOW_TREATMENTS"
		    Case ProductCategoryEnum.WineRacks
		      Return "WINE_RACKS"
		    Case ProductCategoryEnum.WoodBoardsAndPlanks
		      Return "WOOD_BOARDS_AND_PLANKS"
		    Case ProductCategoryEnum.WoodworkingMaterials
		      Return "WOODWORKING_MATERIALS"
		    Case ProductCategoryEnum.WoodworkingPlans
		      Return "WOODWORKING_PLANS"
		    Case ProductCategoryEnum.WorkBenches
		      Return "WORK_BENCHES"
		    Case ProductCategoryEnum.WreathsAndGarlands
		      Return "WREATHS_AND_GARLANDS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ProductCategoryRegionToString(value As ProductCategoryRegion) As String
		  Select Case value
		    Case ProductCategoryRegion.Us
		      Return "US"
		    Case ProductCategoryRegion.GbPlusIe
		      Return "GB+IE"
		    Case ProductCategoryRegion.Ca
		      Return "CA"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ProductConditionToString(value As ProductCondition) As String
		  Select Case value
		    Case ProductCondition.Escapednew
		      Return "NEW"
		    Case ProductCondition.Used
		      Return "USED"
		    Case ProductCondition.Refurbished
		      Return "REFURBISHED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ProductGroupPromotionCustomizableCTATypeToString(value As ProductGroupPromotionCustomizableCTAType) As String
		  Select Case value
		    Case ProductGroupPromotionCustomizableCTAType.GetOffer
		      Return "GET_OFFER"
		    Case ProductGroupPromotionCustomizableCTAType.LearnMore
		      Return "LEARN_MORE"
		    Case ProductGroupPromotionCustomizableCTAType.OrderNow
		      Return "ORDER_NOW"
		    Case ProductGroupPromotionCustomizableCTAType.ShopNow
		      Return "SHOP_NOW"
		    Case ProductGroupPromotionCustomizableCTAType.SignUp
		      Return "SIGN_UP"
		    Case ProductGroupPromotionCustomizableCTAType.Subscribe
		      Return "SUBSCRIBE"
		    Case ProductGroupPromotionCustomizableCTAType.BuyNow
		      Return "BUY_NOW"
		    Case ProductGroupPromotionCustomizableCTAType.ContactUs
		      Return "CONTACT_US"
		    Case ProductGroupPromotionCustomizableCTAType.GetQuote
		      Return "GET_QUOTE"
		    Case ProductGroupPromotionCustomizableCTAType.VisitSite
		      Return "VISIT_SITE"
		    Case ProductGroupPromotionCustomizableCTAType.ApplyNow
		      Return "APPLY_NOW"
		    Case ProductGroupPromotionCustomizableCTAType.BookNow
		      Return "BOOK_NOW"
		    Case ProductGroupPromotionCustomizableCTAType.RegisterNow
		      Return "REGISTER_NOW"
		    Case ProductGroupPromotionCustomizableCTAType.FindADealer
		      Return "FIND_A_DEALER"
		    Case ProductGroupPromotionCustomizableCTAType.WatchNow
		      Return "WATCH_NOW"
		    Case ProductGroupPromotionCustomizableCTAType.ReadMore
		      Return "READ_MORE"
		    Case ProductGroupPromotionCustomizableCTAType.BuyTickets
		      Return "BUY_TICKETS"
		    Case ProductGroupPromotionCustomizableCTAType.DonateNow
		      Return "DONATE_NOW"
		    Case ProductGroupPromotionCustomizableCTAType.Download
		      Return "DOWNLOAD"
		    Case ProductGroupPromotionCustomizableCTAType.ExploreMore
		      Return "EXPLORE_MORE"
		    Case ProductGroupPromotionCustomizableCTAType.FindALocation
		      Return "FIND_A_LOCATION"
		    Case ProductGroupPromotionCustomizableCTAType.GetDeal
		      Return "GET_DEAL"
		    Case ProductGroupPromotionCustomizableCTAType.GetRecipe
		      Return "GET_RECIPE"
		    Case ProductGroupPromotionCustomizableCTAType.GetShowtimes
		      Return "GET_SHOWTIMES"
		    Case ProductGroupPromotionCustomizableCTAType.OnSale
		      Return "ON_SALE"
		    Case ProductGroupPromotionCustomizableCTAType.PlayGame
		      Return "PLAY_GAME"
		    Case ProductGroupPromotionCustomizableCTAType.TryIt
		      Return "TRY_IT"
		    Case ProductGroupPromotionCustomizableCTAType.BuyOnlinePickupInStore
		      Return "BUY_ONLINE_PICKUP_IN_STORE"
		    Case ProductGroupPromotionCustomizableCTAType.ShopOnAdvertiser
		      Return "SHOP_ON_ADVERTISER"
		    Case ProductGroupPromotionCustomizableCTAType.ShopTheCollection
		      Return "SHOP_THE_COLLECTION"
		    Case ProductGroupPromotionCustomizableCTAType.GetItNow
		      Return "GET_IT_NOW"
		    Case ProductGroupPromotionCustomizableCTAType.TakeAPeek
		      Return "TAKE_A_PEEK"
		    Case ProductGroupPromotionCustomizableCTAType.TakeACloserLook
		      Return "TAKE_A_CLOSER_LOOK"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ProductGroupSummaryStatusToString(value As ProductGroupSummaryStatus) As String
		  Select Case value
		    Case ProductGroupSummaryStatus.Running
		      Return "RUNNING"
		    Case ProductGroupSummaryStatus.Paused
		      Return "PAUSED"
		    Case ProductGroupSummaryStatus.Excluded
		      Return "EXCLUDED"
		    Case ProductGroupSummaryStatus.Archived
		      Return "ARCHIVED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PromotionApplicationLevelToString(value As PromotionApplicationLevel) As String
		  Select Case value
		    Case PromotionApplicationLevel.None
		      Return "NONE"
		    Case PromotionApplicationLevel.Item
		      Return "ITEM"
		    Case PromotionApplicationLevel.AdGroup
		      Return "AD_GROUP"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PromotionTypeToString(value As PromotionType) As String
		  Select Case value
		    Case PromotionType.Variable
		      Return "VARIABLE"
		    Case PromotionType.Sitewide
		      Return "SITEWIDE"
		    Case PromotionType.Checkout
		      Return "CHECKOUT"
		    Case PromotionType.SaveXOnY
		      Return "SAVE_X_ON_Y"
		    Case PromotionType.BuyXGetY
		      Return "BUY_X_GET_Y"
		    Case PromotionType.SpendXSaveY
		      Return "SPEND_X_SAVE_Y"
		    Case PromotionType.FreeShipping
		      Return "FREE_SHIPPING"
		    Case PromotionType.FreeShippingMinimum
		      Return "FREE_SHIPPING_MINIMUM"
		    Case PromotionType.FreeShippingWithDiscount
		      Return "FREE_SHIPPING_WITH_DISCOUNT"
		    Case PromotionType.SitewideInStores
		      Return "SITEWIDE_IN_STORES"
		    Case PromotionType.ExtraPercentOff
		      Return "EXTRA_PERCENT_OFF"
		    Case PromotionType.GiftWithPurchase
		      Return "GIFT_WITH_PURCHASE"
		    Case PromotionType.GiftWithPurchaseMinimum
		      Return "GIFT_WITH_PURCHASE_MINIMUM"
		    Case PromotionType.Fixed
		      Return "FIXED"
		    Case PromotionType.PercentOffClearance
		      Return "PERCENT_OFF_CLEARANCE"
		    Case PromotionType.XOffY
		      Return "X_OFF_Y"
		    Case PromotionType.GiftWithFirstPurchase
		      Return "GIFT_WITH_FIRST_PURCHASE"
		    Case PromotionType.BuyXGetOneFree
		      Return "BUY_X_GET_ONE_FREE"
		    Case PromotionType.CashBack
		      Return "CASH_BACK"
		    Case PromotionType.PointsOnAllPurchases
		      Return "POINTS_ON_ALL_PURCHASES"
		    Case PromotionType.Bonus
		      Return "BONUS"
		    Case PromotionType.PointsWithPurchase
		      Return "POINTS_WITH_PURCHASE"
		    Case PromotionType.Custom
		      Return "CUSTOM"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PublicTargetingTypeToString(value As PublicTargetingType) As String
		  Select Case value
		    Case PublicTargetingType.Apptype
		      Return "APPTYPE"
		    Case PublicTargetingType.Gender
		      Return "GENDER"
		    Case PublicTargetingType.Locale
		      Return "LOCALE"
		    Case PublicTargetingType.AgeBucket
		      Return "AGE_BUCKET"
		    Case PublicTargetingType.Location
		      Return "LOCATION"
		    Case PublicTargetingType.Geo
		      Return "GEO"
		    Case PublicTargetingType.Interest
		      Return "INTEREST"
		    Case PublicTargetingType.Keyword
		      Return "KEYWORD"
		    Case PublicTargetingType.AudienceInclude
		      Return "AUDIENCE_INCLUDE"
		    Case PublicTargetingType.AudienceExclude
		      Return "AUDIENCE_EXCLUDE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function QueryLabelEntityStatusesItemsToString(value As QueryLabelEntityStatusesItems) As String
		  Select Case value
		    Case QueryLabelEntityStatusesItems.Active
		      Return "ACTIVE"
		    Case QueryLabelEntityStatusesItems.Archived
		      Return "ARCHIVED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function QueryLabelTypesItemsToString(value As QueryLabelTypesItems) As String
		  Select Case value
		    Case QueryLabelTypesItems.Brand
		      Return "BRAND"
		    Case QueryLabelTypesItems.Custom
		      Return "CUSTOM"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function QuerymetrictypesItemsToString(value As QuerymetrictypesItems) As String
		  Select Case value
		    Case QuerymetrictypesItems.Engagement
		      Return "ENGAGEMENT"
		    Case QuerymetrictypesItems.EngagementRate
		      Return "ENGAGEMENT_RATE"
		    Case QuerymetrictypesItems.Impression
		      Return "IMPRESSION"
		    Case QuerymetrictypesItems.OutboundClick
		      Return "OUTBOUND_CLICK"
		    Case QuerymetrictypesItems.OutboundClickRate
		      Return "OUTBOUND_CLICK_RATE"
		    Case QuerymetrictypesItems.PinClick
		      Return "PIN_CLICK"
		    Case QuerymetrictypesItems.PinClickRate
		      Return "PIN_CLICK_RATE"
		    Case QuerymetrictypesItems.Save
		      Return "SAVE"
		    Case QuerymetrictypesItems.SaveRate
		      Return "SAVE_RATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function QuerypinanalyticsmetrictypesItemsToString(value As QuerypinanalyticsmetrictypesItems) As String
		  Select Case value
		    Case QuerypinanalyticsmetrictypesItems.Impression
		      Return "IMPRESSION"
		    Case QuerypinanalyticsmetrictypesItems.OutboundClick
		      Return "OUTBOUND_CLICK"
		    Case QuerypinanalyticsmetrictypesItems.PinClick
		      Return "PIN_CLICK"
		    Case QuerypinanalyticsmetrictypesItems.Save
		      Return "SAVE"
		    Case QuerypinanalyticsmetrictypesItems.SaveRate
		      Return "SAVE_RATE"
		    Case QuerypinanalyticsmetrictypesItems.TotalComments
		      Return "TOTAL_COMMENTS"
		    Case QuerypinanalyticsmetrictypesItems.TotalReactions
		      Return "TOTAL_REACTIONS"
		    Case QuerypinanalyticsmetrictypesItems.UserFollow
		      Return "USER_FOLLOW"
		    Case QuerypinanalyticsmetrictypesItems.ProfileVisit
		      Return "PROFILE_VISIT"
		    Case QuerypinanalyticsmetrictypesItems.VideoMrcView
		      Return "VIDEO_MRC_VIEW"
		    Case QuerypinanalyticsmetrictypesItems.Video10sView
		      Return "VIDEO_10S_VIEW"
		    Case QuerypinanalyticsmetrictypesItems.Quartile95PercentView
		      Return "QUARTILE_95_PERCENT_VIEW"
		    Case QuerypinanalyticsmetrictypesItems.VideoV50WatchTime
		      Return "VIDEO_V50_WATCH_TIME"
		    Case QuerypinanalyticsmetrictypesItems.VideoStart
		      Return "VIDEO_START"
		    Case QuerypinanalyticsmetrictypesItems.VideoAvgWatchTime
		      Return "VIDEO_AVG_WATCH_TIME"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function QueryvideopinmetrictypesItemsToString(value As QueryvideopinmetrictypesItems) As String
		  Select Case value
		    Case QueryvideopinmetrictypesItems.Impression
		      Return "IMPRESSION"
		    Case QueryvideopinmetrictypesItems.Save
		      Return "SAVE"
		    Case QueryvideopinmetrictypesItems.VideoMrcView
		      Return "VIDEO_MRC_VIEW"
		    Case QueryvideopinmetrictypesItems.VideoAvgWatchTime
		      Return "VIDEO_AVG_WATCH_TIME"
		    Case QueryvideopinmetrictypesItems.VideoV50WatchTime
		      Return "VIDEO_V50_WATCH_TIME"
		    Case QueryvideopinmetrictypesItems.Quartile95PercentView
		      Return "QUARTILE_95_PERCENT_VIEW"
		    Case QueryvideopinmetrictypesItems.Video10sView
		      Return "VIDEO_10S_VIEW"
		    Case QueryvideopinmetrictypesItems.VideoStart
		      Return "VIDEO_START"
		    Case QueryvideopinmetrictypesItems.OutboundClick
		      Return "OUTBOUND_CLICK"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ReportTypeToString(value As ReportType) As String
		  Select Case value
		    Case ReportType.Sync
		      Return "SYNC"
		    Case ReportType.Escapedasync
		      Return "ASYNC"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ReportingColumnToString(value As ReportingColumn) As String
		  Select Case value
		    Case ReportingColumn.SpendInMicroDollar
		      Return "SPEND_IN_MICRO_DOLLAR"
		    Case ReportingColumn.SpendInMicroUsDollar
		      Return "SPEND_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.BonusSpendInMicroDollar
		      Return "BONUS_SPEND_IN_MICRO_DOLLAR"
		    Case ReportingColumn.BonusSpendInDollar
		      Return "BONUS_SPEND_IN_DOLLAR"
		    Case ReportingColumn.AdsCreditSpendInMicroDollar
		      Return "ADS_CREDIT_SPEND_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AdsCreditSpendInDollar
		      Return "ADS_CREDIT_SPEND_IN_DOLLAR"
		    Case ReportingColumn.PaidImpression
		      Return "PAID_IMPRESSION"
		    Case ReportingColumn.PaidClickthrough
		      Return "PAID_CLICKTHROUGH"
		    Case ReportingColumn.SpendInDollar
		      Return "SPEND_IN_DOLLAR"
		    Case ReportingColumn.SpendInUsDollar
		      Return "SPEND_IN_US_DOLLAR"
		    Case ReportingColumn.CpcInMicroDollar
		      Return "CPC_IN_MICRO_DOLLAR"
		    Case ReportingColumn.EcpcInMicroDollar
		      Return "ECPC_IN_MICRO_DOLLAR"
		    Case ReportingColumn.CpcInDollar
		      Return "CPC_IN_DOLLAR"
		    Case ReportingColumn.EcpcInDollar
		      Return "ECPC_IN_DOLLAR"
		    Case ReportingColumn.Ctr
		      Return "CTR"
		    Case ReportingColumn.Ectr
		      Return "ECTR"
		    Case ReportingColumn.OutboundCtr
		      Return "OUTBOUND_CTR"
		    Case ReportingColumn.OutboundCtr1
		      Return "OUTBOUND_CTR_1"
		    Case ReportingColumn.CpcInMicroCurrency
		      Return "CPC_IN_MICRO_CURRENCY"
		    Case ReportingColumn.CpwInMicroDollar
		      Return "CPW_IN_MICRO_DOLLAR"
		    Case ReportingColumn.CpwInDollar
		      Return "CPW_IN_DOLLAR"
		    Case ReportingColumn.CostPerOutboundClick
		      Return "COST_PER_OUTBOUND_CLICK"
		    Case ReportingColumn.AdOnlyPin
		      Return "AD_ONLY_PIN"
		    Case ReportingColumn.CampaignName
		      Return "CAMPAIGN_NAME"
		    Case ReportingColumn.CampaignStatus
		      Return "CAMPAIGN_STATUS"
		    Case ReportingColumn.IsCampaignLearningPhase
		      Return "IS_CAMPAIGN_LEARNING_PHASE"
		    Case ReportingColumn.Date
		      Return "DATE"
		    Case ReportingColumn.DateAsTimestamp
		      Return "DATE_AS_TIMESTAMP"
		    Case ReportingColumn.BudgetInDollar
		      Return "BUDGET_IN_DOLLAR"
		    Case ReportingColumn.AvailableBudgetInDollar
		      Return "AVAILABLE_BUDGET_IN_DOLLAR"
		    Case ReportingColumn.TargetingType
		      Return "TARGETING_TYPE"
		    Case ReportingColumn.TargetingValue
		      Return "TARGETING_VALUE"
		    Case ReportingColumn.TargetingValueName
		      Return "TARGETING_VALUE_NAME"
		    Case ReportingColumn.CampaignBrandLabel
		      Return "CAMPAIGN_BRAND_LABEL"
		    Case ReportingColumn.CampaignCustomLabels
		      Return "CAMPAIGN_CUSTOM_LABELS"
		    Case ReportingColumn.AppInstallAppName
		      Return "APP_INSTALL_APP_NAME"
		    Case ReportingColumn.PaidEvents
		      Return "PAID_EVENTS"
		    Case ReportingColumn.BonusEvents
		      Return "BONUS_EVENTS"
		    Case ReportingColumn.Insertion
		      Return "INSERTION"
		    Case ReportingColumn.LegacyCampaignId
		      Return "LEGACY_CAMPAIGN_ID"
		    Case ReportingColumn.HbaseId
		      Return "HBASE_ID"
		    Case ReportingColumn.PinDescription
		      Return "PIN_DESCRIPTION"
		    Case ReportingColumn.CampaignEndDate
		      Return "CAMPAIGN_END_DATE"
		    Case ReportingColumn.PinPromotionStatus
		      Return "PIN_PROMOTION_STATUS"
		    Case ReportingColumn.AdStatus
		      Return "AD_STATUS"
		    Case ReportingColumn.PinId
		      Return "PIN_ID"
		    Case ReportingColumn.CrossDeviceType
		      Return "CROSS_DEVICE_TYPE"
		    Case ReportingColumn.IngestionSource
		      Return "INGESTION_SOURCE"
		    Case ReportingColumn.SourcePlatform
		      Return "SOURCE_PLATFORM"
		    Case ReportingColumn.PinPromotionIsRunning
		      Return "PIN_PROMOTION_IS_RUNNING"
		    Case ReportingColumn.TotalEngagement
		      Return "TOTAL_ENGAGEMENT"
		    Case ReportingColumn.Engagement1
		      Return "ENGAGEMENT_1"
		    Case ReportingColumn.Engagement2
		      Return "ENGAGEMENT_2"
		    Case ReportingColumn.CpeInMicroDollar
		      Return "CPE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.EcpeInMicroDollar
		      Return "ECPE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.CpeInDollar
		      Return "CPE_IN_DOLLAR"
		    Case ReportingColumn.EcpeInDollar
		      Return "ECPE_IN_DOLLAR"
		    Case ReportingColumn.EngagementRate
		      Return "ENGAGEMENT_RATE"
		    Case ReportingColumn.EengagementRate
		      Return "EENGAGEMENT_RATE"
		    Case ReportingColumn.InternalEcpeInMicroDollar
		      Return "INTERNAL_ECPE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.InternalEcpeInDollar
		      Return "INTERNAL_ECPE_IN_DOLLAR"
		    Case ReportingColumn.EcpmInMicroDollar
		      Return "ECPM_IN_MICRO_DOLLAR"
		    Case ReportingColumn.EcpmInDollar
		      Return "ECPM_IN_DOLLAR"
		    Case ReportingColumn.RepinRate
		      Return "REPIN_RATE"
		    Case ReportingColumn.RepinRate2
		      Return "REPIN_RATE_2"
		    Case ReportingColumn.Ctr2
		      Return "CTR_2"
		    Case ReportingColumn.CampaignId
		      Return "CAMPAIGN_ID"
		    Case ReportingColumn.AdvertiserId
		      Return "ADVERTISER_ID"
		    Case ReportingColumn.AdAccountId
		      Return "AD_ACCOUNT_ID"
		    Case ReportingColumn.AdvertiserOwnerUserId
		      Return "ADVERTISER_OWNER_USER_ID"
		    Case ReportingColumn.AdvertiserOwnerUserName
		      Return "ADVERTISER_OWNER_USER_NAME"
		    Case ReportingColumn.PinPromotionId
		      Return "PIN_PROMOTION_ID"
		    Case ReportingColumn.AdId
		      Return "AD_ID"
		    Case ReportingColumn.AdGroupId
		      Return "AD_GROUP_ID"
		    Case ReportingColumn.KeywordId
		      Return "KEYWORD_ID"
		    Case ReportingColumn.KeywordIsDeleted
		      Return "KEYWORD_IS_DELETED"
		    Case ReportingColumn.BrandSfdcAccountId
		      Return "BRAND_SFDC_ACCOUNT_ID"
		    Case ReportingColumn.AppInstallAppId
		      Return "APP_INSTALL_APP_ID"
		    Case ReportingColumn.CampaignActionType
		      Return "CAMPAIGN_ACTION_TYPE"
		    Case ReportingColumn.CampaignBidType
		      Return "CAMPAIGN_BID_TYPE"
		    Case ReportingColumn.CampaignEntityStatus
		      Return "CAMPAIGN_ENTITY_STATUS"
		    Case ReportingColumn.CampaignManagedStatus
		      Return "CAMPAIGN_MANAGED_STATUS"
		    Case ReportingColumn.CampaignObjectiveType
		      Return "CAMPAIGN_OBJECTIVE_TYPE"
		    Case ReportingColumn.CpmInMicroDollar
		      Return "CPM_IN_MICRO_DOLLAR"
		    Case ReportingColumn.CpmInDollar
		      Return "CPM_IN_DOLLAR"
		    Case ReportingColumn.BudgetType
		      Return "BUDGET_TYPE"
		    Case ReportingColumn.BudgetInLocalCurrency
		      Return "BUDGET_IN_LOCAL_CURRENCY"
		    Case ReportingColumn.AdGroupName
		      Return "AD_GROUP_NAME"
		    Case ReportingColumn.AdGroupStatus
		      Return "AD_GROUP_STATUS"
		    Case ReportingColumn.AdGroupEndDate
		      Return "AD_GROUP_END_DATE"
		    Case ReportingColumn.AdGroupBudgetType
		      Return "AD_GROUP_BUDGET_TYPE"
		    Case ReportingColumn.AdGroupBudgetInLocalCurrency
		      Return "AD_GROUP_BUDGET_IN_LOCAL_CURRENCY"
		    Case ReportingColumn.AdGroupSuggestedBudgetInLocalCurrency
		      Return "AD_GROUP_SUGGESTED_BUDGET_IN_LOCAL_CURRENCY"
		    Case ReportingColumn.AdGroupSuggestedBonusBudgetInLocalCurrency
		      Return "AD_GROUP_SUGGESTED_BONUS_BUDGET_IN_LOCAL_CURRENCY"
		    Case ReportingColumn.AdGroupEntityStatus
		      Return "AD_GROUP_ENTITY_STATUS"
		    Case ReportingColumn.AdGroupActionType
		      Return "AD_GROUP_ACTION_TYPE"
		    Case ReportingColumn.AdGroupConversionLearningModeType
		      Return "AD_GROUP_CONVERSION_LEARNING_MODE_TYPE"
		    Case ReportingColumn.AdGroupTargetCpa
		      Return "AD_GROUP_TARGET_CPA"
		    Case ReportingColumn.AdGroupBidStrategyType
		      Return "AD_GROUP_BID_STRATEGY_TYPE"
		    Case ReportingColumn.AdGroupExperimentName
		      Return "AD_GROUP_EXPERIMENT_NAME"
		    Case ReportingColumn.AdGroupExperimentCell
		      Return "AD_GROUP_EXPERIMENT_CELL"
		    Case ReportingColumn.AdGroupBidMultiplier
		      Return "AD_GROUP_BID_MULTIPLIER"
		    Case ReportingColumn.CampaignWebCloseupWhitelisted
		      Return "CAMPAIGN_WEB_CLOSEUP_WHITELISTED"
		    Case ReportingColumn.ProductGroupId
		      Return "PRODUCT_GROUP_ID"
		    Case ReportingColumn.ProductGroupDefinition
		      Return "PRODUCT_GROUP_DEFINITION"
		    Case ReportingColumn.ParentProductGroupId
		      Return "PARENT_PRODUCT_GROUP_ID"
		    Case ReportingColumn.ProductGroupType
		      Return "PRODUCT_GROUP_TYPE"
		    Case ReportingColumn.ProductGroupBidInMicroCurrency
		      Return "PRODUCT_GROUP_BID_IN_MICRO_CURRENCY"
		    Case ReportingColumn.ProductGroupStatus
		      Return "PRODUCT_GROUP_STATUS"
		    Case ReportingColumn.ProductGroupEntityStatus
		      Return "PRODUCT_GROUP_ENTITY_STATUS"
		    Case ReportingColumn.ProductGroupInclusion
		      Return "PRODUCT_GROUP_INCLUSION"
		    Case ReportingColumn.ProductGroupCreativeType
		      Return "PRODUCT_GROUP_CREATIVE_TYPE"
		    Case ReportingColumn.PromoId
		      Return "PROMO_ID"
		    Case ReportingColumn.PromoName
		      Return "PROMO_NAME"
		    Case ReportingColumn.PromoIds
		      Return "PROMO_IDS"
		    Case ReportingColumn.PromoNames
		      Return "PROMO_NAMES"
		    Case ReportingColumn.ItemId
		      Return "ITEM_ID"
		    Case ReportingColumn.ProductItemId
		      Return "PRODUCT_ITEM_ID"
		    Case ReportingColumn.InternalProductItemId
		      Return "INTERNAL_PRODUCT_ITEM_ID"
		    Case ReportingColumn.InternalProductItemIdStr
		      Return "INTERNAL_PRODUCT_ITEM_ID_STR"
		    Case ReportingColumn.ProductItemName
		      Return "PRODUCT_ITEM_NAME"
		    Case ReportingColumn.ProductItemImageUrl
		      Return "PRODUCT_ITEM_IMAGE_URL"
		    Case ReportingColumn.ProductItemPrice
		      Return "PRODUCT_ITEM_PRICE"
		    Case ReportingColumn.ProductItemProductUrl
		      Return "PRODUCT_ITEM_PRODUCT_URL"
		    Case ReportingColumn.ProductItemPinUrl
		      Return "PRODUCT_ITEM_PIN_URL"
		    Case ReportingColumn.ProductItemBrand
		      Return "PRODUCT_ITEM_BRAND"
		    Case ReportingColumn.ProductItemDescription
		      Return "PRODUCT_ITEM_DESCRIPTION"
		    Case ReportingColumn.ProductItemSalePrice
		      Return "PRODUCT_ITEM_SALE_PRICE"
		    Case ReportingColumn.ProductItemProductType
		      Return "PRODUCT_ITEM_PRODUCT_TYPE"
		    Case ReportingColumn.ProductItemProductCategory
		      Return "PRODUCT_ITEM_PRODUCT_CATEGORY"
		    Case ReportingColumn.ProductItemCampaignName
		      Return "PRODUCT_ITEM_CAMPAIGN_NAME"
		    Case ReportingColumn.ProductItemAdGroupName
		      Return "PRODUCT_ITEM_AD_GROUP_NAME"
		    Case ReportingColumn.ProductItemCurrency
		      Return "PRODUCT_ITEM_CURRENCY"
		    Case ReportingColumn.OrderLineId
		      Return "ORDER_LINE_ID"
		    Case ReportingColumn.OrderLineName
		      Return "ORDER_LINE_NAME"
		    Case ReportingColumn.OrderLinePinRevShare
		      Return "ORDER_LINE_PIN_REV_SHARE"
		    Case ReportingColumn.OrderLinePaidType
		      Return "ORDER_LINE_PAID_TYPE"
		    Case ReportingColumn.SpendOrderLineId
		      Return "SPEND_ORDER_LINE_ID"
		    Case ReportingColumn.SpendOrderLinePaidType
		      Return "SPEND_ORDER_LINE_PAID_TYPE"
		    Case ReportingColumn.ConversionProductId
		      Return "CONVERSION_PRODUCT_ID"
		    Case ReportingColumn.ConversionProductName
		      Return "CONVERSION_PRODUCT_NAME"
		    Case ReportingColumn.ConversionProductBrand
		      Return "CONVERSION_PRODUCT_BRAND"
		    Case ReportingColumn.ConversionProductCategory
		      Return "CONVERSION_PRODUCT_CATEGORY"
		    Case ReportingColumn.ConversionProductIdGroup
		      Return "CONVERSION_PRODUCT_ID_GROUP"
		    Case ReportingColumn.CartingTotalPurchaseIntentClicks
		      Return "CARTING_TOTAL_PURCHASE_INTENT_CLICKS"
		    Case ReportingColumn.CartingTotalPurchaseIntentValue
		      Return "CARTING_TOTAL_PURCHASE_INTENT_VALUE"
		    Case ReportingColumn.CartingTotalPurchaseIntentValueInMicroCurrency
		      Return "CARTING_TOTAL_PURCHASE_INTENT_VALUE_IN_MICRO_CURRENCY"
		    Case ReportingColumn.CartingRetailerName
		      Return "CARTING_RETAILER_NAME"
		    Case ReportingColumn.CartingProductPrice
		      Return "CARTING_PRODUCT_PRICE"
		    Case ReportingColumn.CartingProductPriceInMicroCurrency
		      Return "CARTING_PRODUCT_PRICE_IN_MICRO_CURRENCY"
		    Case ReportingColumn.CartingProductName
		      Return "CARTING_PRODUCT_NAME"
		    Case ReportingColumn.CartingProductId
		      Return "CARTING_PRODUCT_ID"
		    Case ReportingColumn.Clickthrough1
		      Return "CLICKTHROUGH_1"
		    Case ReportingColumn.Repin1
		      Return "REPIN_1"
		    Case ReportingColumn.Impression1
		      Return "IMPRESSION_1"
		    Case ReportingColumn.Like1
		      Return "LIKE_1"
		    Case ReportingColumn.Send1
		      Return "SEND_1"
		    Case ReportingColumn.Flag1
		      Return "FLAG_1"
		    Case ReportingColumn.Hide1
		      Return "HIDE_1"
		    Case ReportingColumn.Insertion1
		      Return "INSERTION_1"
		    Case ReportingColumn.Impression1Gross
		      Return "IMPRESSION_1_GROSS"
		    Case ReportingColumn.Clickthrough1Gross
		      Return "CLICKTHROUGH_1_GROSS"
		    Case ReportingColumn.OutboundClick1
		      Return "OUTBOUND_CLICK_1"
		    Case ReportingColumn.ClickthroughUser1
		      Return "CLICKTHROUGH_USER_1"
		    Case ReportingColumn.RepinUser1
		      Return "REPIN_USER_1"
		    Case ReportingColumn.ImpressionUser1
		      Return "IMPRESSION_USER_1"
		    Case ReportingColumn.LikeUser1
		      Return "LIKE_USER_1"
		    Case ReportingColumn.SendUser1
		      Return "SEND_USER_1"
		    Case ReportingColumn.FlagUser1
		      Return "FLAG_USER_1"
		    Case ReportingColumn.HideUser1
		      Return "HIDE_USER_1"
		    Case ReportingColumn.InsertionUser1
		      Return "INSERTION_USER_1"
		    Case ReportingColumn.Clickthrough2
		      Return "CLICKTHROUGH_2"
		    Case ReportingColumn.Repin2
		      Return "REPIN_2"
		    Case ReportingColumn.Impression2
		      Return "IMPRESSION_2"
		    Case ReportingColumn.Like2
		      Return "LIKE_2"
		    Case ReportingColumn.Send2
		      Return "SEND_2"
		    Case ReportingColumn.Flag2
		      Return "FLAG_2"
		    Case ReportingColumn.OutboundClick2
		      Return "OUTBOUND_CLICK_2"
		    Case ReportingColumn.ClickthroughUser2
		      Return "CLICKTHROUGH_USER_2"
		    Case ReportingColumn.RepinUser2
		      Return "REPIN_USER_2"
		    Case ReportingColumn.ImpressionUser2
		      Return "IMPRESSION_USER_2"
		    Case ReportingColumn.LikeUser2
		      Return "LIKE_USER_2"
		    Case ReportingColumn.SendUser2
		      Return "SEND_USER_2"
		    Case ReportingColumn.FlagUser2
		      Return "FLAG_USER_2"
		    Case ReportingColumn.TotalClickthrough
		      Return "TOTAL_CLICKTHROUGH"
		    Case ReportingColumn.TotalRepin
		      Return "TOTAL_REPIN"
		    Case ReportingColumn.TotalImpression
		      Return "TOTAL_IMPRESSION"
		    Case ReportingColumn.TotalLike
		      Return "TOTAL_LIKE"
		    Case ReportingColumn.TotalSend
		      Return "TOTAL_SEND"
		    Case ReportingColumn.TotalFlag
		      Return "TOTAL_FLAG"
		    Case ReportingColumn.TotalImpressionUser
		      Return "TOTAL_IMPRESSION_USER"
		    Case ReportingColumn.TotalImpressionUserHll
		      Return "TOTAL_IMPRESSION_USER_HLL"
		    Case ReportingColumn.TotalImpressionFrequency
		      Return "TOTAL_IMPRESSION_FREQUENCY"
		    Case ReportingColumn.TotalImpressionFrequencyHll
		      Return "TOTAL_IMPRESSION_FREQUENCY_HLL"
		    Case ReportingColumn.TotalOutboundClick
		      Return "TOTAL_OUTBOUND_CLICK"
		    Case ReportingColumn.CostPerOutboundClickInDollar
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR"
		    Case ReportingColumn.CostPerOutboundClickInDollar1
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1"
		    Case ReportingColumn.EngagementPageVisit1
		      Return "ENGAGEMENT_PAGE_VISIT_1"
		    Case ReportingColumn.EngagementSignup1
		      Return "ENGAGEMENT_SIGNUP_1"
		    Case ReportingColumn.EngagementCheckout1
		      Return "ENGAGEMENT_CHECKOUT_1"
		    Case ReportingColumn.EngagementCustom1
		      Return "ENGAGEMENT_CUSTOM_1"
		    Case ReportingColumn.EngagementAddToCart1
		      Return "ENGAGEMENT_ADD_TO_CART_1"
		    Case ReportingColumn.EngagementLead1
		      Return "ENGAGEMENT_LEAD_1"
		    Case ReportingColumn.EngagementSearch1
		      Return "ENGAGEMENT_SEARCH_1"
		    Case ReportingColumn.EngagementWatchVideo1
		      Return "ENGAGEMENT_WATCH_VIDEO_1"
		    Case ReportingColumn.EngagementViewCategory1
		      Return "ENGAGEMENT_VIEW_CATEGORY_1"
		    Case ReportingColumn.EngagementAppInstall1
		      Return "ENGAGEMENT_APP_INSTALL_1"
		    Case ReportingColumn.EngagementUnknown1
		      Return "ENGAGEMENT_UNKNOWN_1"
		    Case ReportingColumn.EngagementAddPaymentInfo1
		      Return "ENGAGEMENT_ADD_PAYMENT_INFO_1"
		    Case ReportingColumn.EngagementAddToWishlist1
		      Return "ENGAGEMENT_ADD_TO_WISHLIST_1"
		    Case ReportingColumn.EngagementInitiateCheckout1
		      Return "ENGAGEMENT_INITIATE_CHECKOUT_1"
		    Case ReportingColumn.EngagementSubscribe1
		      Return "ENGAGEMENT_SUBSCRIBE_1"
		    Case ReportingColumn.EngagementViewContent1
		      Return "ENGAGEMENT_VIEW_CONTENT_1"
		    Case ReportingColumn.ClickPageVisit1
		      Return "CLICK_PAGE_VISIT_1"
		    Case ReportingColumn.ClickSignup1
		      Return "CLICK_SIGNUP_1"
		    Case ReportingColumn.ClickCheckout1
		      Return "CLICK_CHECKOUT_1"
		    Case ReportingColumn.ClickCustom1
		      Return "CLICK_CUSTOM_1"
		    Case ReportingColumn.ClickAddToCart1
		      Return "CLICK_ADD_TO_CART_1"
		    Case ReportingColumn.ClickLead1
		      Return "CLICK_LEAD_1"
		    Case ReportingColumn.ClickSearch1
		      Return "CLICK_SEARCH_1"
		    Case ReportingColumn.ClickWatchVideo1
		      Return "CLICK_WATCH_VIDEO_1"
		    Case ReportingColumn.ClickViewCategory1
		      Return "CLICK_VIEW_CATEGORY_1"
		    Case ReportingColumn.ClickAppInstall1
		      Return "CLICK_APP_INSTALL_1"
		    Case ReportingColumn.ClickUnknown1
		      Return "CLICK_UNKNOWN_1"
		    Case ReportingColumn.ClickAddPaymentInfo1
		      Return "CLICK_ADD_PAYMENT_INFO_1"
		    Case ReportingColumn.ClickAddToWishlist1
		      Return "CLICK_ADD_TO_WISHLIST_1"
		    Case ReportingColumn.ClickInitiateCheckout1
		      Return "CLICK_INITIATE_CHECKOUT_1"
		    Case ReportingColumn.ClickSubscribe1
		      Return "CLICK_SUBSCRIBE_1"
		    Case ReportingColumn.ClickViewContent1
		      Return "CLICK_VIEW_CONTENT_1"
		    Case ReportingColumn.ViewPageVisit1
		      Return "VIEW_PAGE_VISIT_1"
		    Case ReportingColumn.ViewSignup1
		      Return "VIEW_SIGNUP_1"
		    Case ReportingColumn.ViewCheckout1
		      Return "VIEW_CHECKOUT_1"
		    Case ReportingColumn.ViewCustom1
		      Return "VIEW_CUSTOM_1"
		    Case ReportingColumn.ViewAddToCart1
		      Return "VIEW_ADD_TO_CART_1"
		    Case ReportingColumn.ViewLead1
		      Return "VIEW_LEAD_1"
		    Case ReportingColumn.ViewSearch1
		      Return "VIEW_SEARCH_1"
		    Case ReportingColumn.ViewWatchVideo1
		      Return "VIEW_WATCH_VIDEO_1"
		    Case ReportingColumn.ViewViewCategory1
		      Return "VIEW_VIEW_CATEGORY_1"
		    Case ReportingColumn.ViewAppInstall1
		      Return "VIEW_APP_INSTALL_1"
		    Case ReportingColumn.ViewUnknown1
		      Return "VIEW_UNKNOWN_1"
		    Case ReportingColumn.ViewAddPaymentInfo1
		      Return "VIEW_ADD_PAYMENT_INFO_1"
		    Case ReportingColumn.ViewAddToWishlist1
		      Return "VIEW_ADD_TO_WISHLIST_1"
		    Case ReportingColumn.ViewInitiateCheckout1
		      Return "VIEW_INITIATE_CHECKOUT_1"
		    Case ReportingColumn.ViewSubscribe1
		      Return "VIEW_SUBSCRIBE_1"
		    Case ReportingColumn.ViewViewContent1
		      Return "VIEW_VIEW_CONTENT_1"
		    Case ReportingColumn.Conversions1
		      Return "CONVERSIONS_1"
		    Case ReportingColumn.EngagementPageVisitValueInMicroDollar1
		      Return "ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementSignupValueInMicroDollar1
		      Return "ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementCheckoutValueInMicroDollar1
		      Return "ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementCustomValueInMicroDollar1
		      Return "ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementAddToCartValueInMicroDollar1
		      Return "ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementLeadValueInMicroDollar1
		      Return "ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementSearchValueInMicroDollar1
		      Return "ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementWatchVideoValueInMicroDollar1
		      Return "ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementViewCategoryValueInMicroDollar1
		      Return "ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementAppInstallValueInMicroDollar1
		      Return "ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementUnknownValueInMicroDollar1
		      Return "ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementAddPaymentInfoValueInMicroDollar1
		      Return "ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementAddToWishlistValueInMicroDollar1
		      Return "ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementInitiateCheckoutValueInMicroDollar1
		      Return "ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementSubscribeValueInMicroDollar1
		      Return "ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementViewContentValueInMicroDollar1
		      Return "ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickPageVisitValueInMicroDollar1
		      Return "CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickSignupValueInMicroDollar1
		      Return "CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickCheckoutValueInMicroDollar1
		      Return "CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickCustomValueInMicroDollar1
		      Return "CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickAddToCartValueInMicroDollar1
		      Return "CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickLeadValueInMicroDollar1
		      Return "CLICK_LEAD_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickSearchValueInMicroDollar1
		      Return "CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickWatchVideoValueInMicroDollar1
		      Return "CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickViewCategoryValueInMicroDollar1
		      Return "CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickAppInstallValueInMicroDollar1
		      Return "CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickUnknownValueInMicroDollar1
		      Return "CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickAddPaymentInfoValueInMicroDollar1
		      Return "CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickAddToWishlistValueInMicroDollar1
		      Return "CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickInitiateCheckoutValueInMicroDollar1
		      Return "CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickSubscribeValueInMicroDollar1
		      Return "CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickViewContentValueInMicroDollar1
		      Return "CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewPageVisitValueInMicroDollar1
		      Return "VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewSignupValueInMicroDollar1
		      Return "VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewCheckoutValueInMicroDollar1
		      Return "VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewCustomValueInMicroDollar1
		      Return "VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewAddToCartValueInMicroDollar1
		      Return "VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewLeadValueInMicroDollar1
		      Return "VIEW_LEAD_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewSearchValueInMicroDollar1
		      Return "VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewWatchVideoValueInMicroDollar1
		      Return "VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewViewCategoryValueInMicroDollar1
		      Return "VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewAppInstallValueInMicroDollar1
		      Return "VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewUnknownValueInMicroDollar1
		      Return "VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewAddPaymentInfoValueInMicroDollar1
		      Return "VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewAddToWishlistValueInMicroDollar1
		      Return "VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewInitiateCheckoutValueInMicroDollar1
		      Return "VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewSubscribeValueInMicroDollar1
		      Return "VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewViewContentValueInMicroDollar1
		      Return "VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ConversionsValueInMicroDollar1
		      Return "CONVERSIONS_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementPageVisitQuantity1
		      Return "ENGAGEMENT_PAGE_VISIT_QUANTITY_1"
		    Case ReportingColumn.EngagementSignupQuantity1
		      Return "ENGAGEMENT_SIGNUP_QUANTITY_1"
		    Case ReportingColumn.EngagementCheckoutQuantity1
		      Return "ENGAGEMENT_CHECKOUT_QUANTITY_1"
		    Case ReportingColumn.EngagementCustomQuantity1
		      Return "ENGAGEMENT_CUSTOM_QUANTITY_1"
		    Case ReportingColumn.EngagementAddToCartQuantity1
		      Return "ENGAGEMENT_ADD_TO_CART_QUANTITY_1"
		    Case ReportingColumn.EngagementLeadQuantity1
		      Return "ENGAGEMENT_LEAD_QUANTITY_1"
		    Case ReportingColumn.EngagementSearchQuantity1
		      Return "ENGAGEMENT_SEARCH_QUANTITY_1"
		    Case ReportingColumn.EngagementWatchVideoQuantity1
		      Return "ENGAGEMENT_WATCH_VIDEO_QUANTITY_1"
		    Case ReportingColumn.EngagementViewCategoryQuantity1
		      Return "ENGAGEMENT_VIEW_CATEGORY_QUANTITY_1"
		    Case ReportingColumn.EngagementAppInstallQuantity1
		      Return "ENGAGEMENT_APP_INSTALL_QUANTITY_1"
		    Case ReportingColumn.EngagementUnknownQuantity1
		      Return "ENGAGEMENT_UNKNOWN_QUANTITY_1"
		    Case ReportingColumn.EngagementAddPaymentInfoQuantity1
		      Return "ENGAGEMENT_ADD_PAYMENT_INFO_QUANTITY_1"
		    Case ReportingColumn.EngagementAddToWishlistQuantity1
		      Return "ENGAGEMENT_ADD_TO_WISHLIST_QUANTITY_1"
		    Case ReportingColumn.EngagementInitiateCheckoutQuantity1
		      Return "ENGAGEMENT_INITIATE_CHECKOUT_QUANTITY_1"
		    Case ReportingColumn.EngagementSubscribeQuantity1
		      Return "ENGAGEMENT_SUBSCRIBE_QUANTITY_1"
		    Case ReportingColumn.EngagementViewContentQuantity1
		      Return "ENGAGEMENT_VIEW_CONTENT_QUANTITY_1"
		    Case ReportingColumn.ClickPageVisitQuantity1
		      Return "CLICK_PAGE_VISIT_QUANTITY_1"
		    Case ReportingColumn.ClickSignupQuantity1
		      Return "CLICK_SIGNUP_QUANTITY_1"
		    Case ReportingColumn.ClickCheckoutQuantity1
		      Return "CLICK_CHECKOUT_QUANTITY_1"
		    Case ReportingColumn.ClickCustomQuantity1
		      Return "CLICK_CUSTOM_QUANTITY_1"
		    Case ReportingColumn.ClickAddToCartQuantity1
		      Return "CLICK_ADD_TO_CART_QUANTITY_1"
		    Case ReportingColumn.ClickLeadQuantity1
		      Return "CLICK_LEAD_QUANTITY_1"
		    Case ReportingColumn.ClickSearchQuantity1
		      Return "CLICK_SEARCH_QUANTITY_1"
		    Case ReportingColumn.ClickWatchVideoQuantity1
		      Return "CLICK_WATCH_VIDEO_QUANTITY_1"
		    Case ReportingColumn.ClickViewCategoryQuantity1
		      Return "CLICK_VIEW_CATEGORY_QUANTITY_1"
		    Case ReportingColumn.ClickAppInstallQuantity1
		      Return "CLICK_APP_INSTALL_QUANTITY_1"
		    Case ReportingColumn.ClickUnknownQuantity1
		      Return "CLICK_UNKNOWN_QUANTITY_1"
		    Case ReportingColumn.ClickAddPaymentInfoQuantity1
		      Return "CLICK_ADD_PAYMENT_INFO_QUANTITY_1"
		    Case ReportingColumn.ClickAddToWishlistQuantity1
		      Return "CLICK_ADD_TO_WISHLIST_QUANTITY_1"
		    Case ReportingColumn.ClickInitiateCheckoutQuantity1
		      Return "CLICK_INITIATE_CHECKOUT_QUANTITY_1"
		    Case ReportingColumn.ClickSubscribeQuantity1
		      Return "CLICK_SUBSCRIBE_QUANTITY_1"
		    Case ReportingColumn.ClickViewContentQuantity1
		      Return "CLICK_VIEW_CONTENT_QUANTITY_1"
		    Case ReportingColumn.ViewPageVisitQuantity1
		      Return "VIEW_PAGE_VISIT_QUANTITY_1"
		    Case ReportingColumn.ViewSignupQuantity1
		      Return "VIEW_SIGNUP_QUANTITY_1"
		    Case ReportingColumn.ViewCheckoutQuantity1
		      Return "VIEW_CHECKOUT_QUANTITY_1"
		    Case ReportingColumn.ViewCustomQuantity1
		      Return "VIEW_CUSTOM_QUANTITY_1"
		    Case ReportingColumn.ViewAddToCartQuantity1
		      Return "VIEW_ADD_TO_CART_QUANTITY_1"
		    Case ReportingColumn.ViewLeadQuantity1
		      Return "VIEW_LEAD_QUANTITY_1"
		    Case ReportingColumn.ViewSearchQuantity1
		      Return "VIEW_SEARCH_QUANTITY_1"
		    Case ReportingColumn.ViewWatchVideoQuantity1
		      Return "VIEW_WATCH_VIDEO_QUANTITY_1"
		    Case ReportingColumn.ViewViewCategoryQuantity1
		      Return "VIEW_VIEW_CATEGORY_QUANTITY_1"
		    Case ReportingColumn.ViewAppInstallQuantity1
		      Return "VIEW_APP_INSTALL_QUANTITY_1"
		    Case ReportingColumn.ViewUnknownQuantity1
		      Return "VIEW_UNKNOWN_QUANTITY_1"
		    Case ReportingColumn.ViewAddPaymentInfoQuantity1
		      Return "VIEW_ADD_PAYMENT_INFO_QUANTITY_1"
		    Case ReportingColumn.ViewAddToWishlistQuantity1
		      Return "VIEW_ADD_TO_WISHLIST_QUANTITY_1"
		    Case ReportingColumn.ViewInitiateCheckoutQuantity1
		      Return "VIEW_INITIATE_CHECKOUT_QUANTITY_1"
		    Case ReportingColumn.ViewSubscribeQuantity1
		      Return "VIEW_SUBSCRIBE_QUANTITY_1"
		    Case ReportingColumn.ViewViewContentQuantity1
		      Return "VIEW_VIEW_CONTENT_QUANTITY_1"
		    Case ReportingColumn.ConversionsQuantity1
		      Return "CONVERSIONS_QUANTITY_1"
		    Case ReportingColumn.EngagementPageVisit2
		      Return "ENGAGEMENT_PAGE_VISIT_2"
		    Case ReportingColumn.EngagementSignup2
		      Return "ENGAGEMENT_SIGNUP_2"
		    Case ReportingColumn.EngagementCheckout2
		      Return "ENGAGEMENT_CHECKOUT_2"
		    Case ReportingColumn.EngagementCustom2
		      Return "ENGAGEMENT_CUSTOM_2"
		    Case ReportingColumn.EngagementAddToCart2
		      Return "ENGAGEMENT_ADD_TO_CART_2"
		    Case ReportingColumn.EngagementLead2
		      Return "ENGAGEMENT_LEAD_2"
		    Case ReportingColumn.EngagementSearch2
		      Return "ENGAGEMENT_SEARCH_2"
		    Case ReportingColumn.EngagementWatchVideo2
		      Return "ENGAGEMENT_WATCH_VIDEO_2"
		    Case ReportingColumn.EngagementViewCategory2
		      Return "ENGAGEMENT_VIEW_CATEGORY_2"
		    Case ReportingColumn.EngagementAppInstall2
		      Return "ENGAGEMENT_APP_INSTALL_2"
		    Case ReportingColumn.EngagementUnknown2
		      Return "ENGAGEMENT_UNKNOWN_2"
		    Case ReportingColumn.EngagementAddPaymentInfo2
		      Return "ENGAGEMENT_ADD_PAYMENT_INFO_2"
		    Case ReportingColumn.EngagementAddToWishlist2
		      Return "ENGAGEMENT_ADD_TO_WISHLIST_2"
		    Case ReportingColumn.EngagementInitiateCheckout2
		      Return "ENGAGEMENT_INITIATE_CHECKOUT_2"
		    Case ReportingColumn.EngagementSubscribe2
		      Return "ENGAGEMENT_SUBSCRIBE_2"
		    Case ReportingColumn.EngagementViewContent2
		      Return "ENGAGEMENT_VIEW_CONTENT_2"
		    Case ReportingColumn.ClickPageVisit2
		      Return "CLICK_PAGE_VISIT_2"
		    Case ReportingColumn.ClickSignup2
		      Return "CLICK_SIGNUP_2"
		    Case ReportingColumn.ClickCheckout2
		      Return "CLICK_CHECKOUT_2"
		    Case ReportingColumn.ClickCustom2
		      Return "CLICK_CUSTOM_2"
		    Case ReportingColumn.ClickAddToCart2
		      Return "CLICK_ADD_TO_CART_2"
		    Case ReportingColumn.ClickLead2
		      Return "CLICK_LEAD_2"
		    Case ReportingColumn.ClickSearch2
		      Return "CLICK_SEARCH_2"
		    Case ReportingColumn.ClickWatchVideo2
		      Return "CLICK_WATCH_VIDEO_2"
		    Case ReportingColumn.ClickViewCategory2
		      Return "CLICK_VIEW_CATEGORY_2"
		    Case ReportingColumn.ClickAppInstall2
		      Return "CLICK_APP_INSTALL_2"
		    Case ReportingColumn.ClickUnknown2
		      Return "CLICK_UNKNOWN_2"
		    Case ReportingColumn.ClickAddPaymentInfo2
		      Return "CLICK_ADD_PAYMENT_INFO_2"
		    Case ReportingColumn.ClickAddToWishlist2
		      Return "CLICK_ADD_TO_WISHLIST_2"
		    Case ReportingColumn.ClickInitiateCheckout2
		      Return "CLICK_INITIATE_CHECKOUT_2"
		    Case ReportingColumn.ClickSubscribe2
		      Return "CLICK_SUBSCRIBE_2"
		    Case ReportingColumn.ClickViewContent2
		      Return "CLICK_VIEW_CONTENT_2"
		    Case ReportingColumn.ViewPageVisit2
		      Return "VIEW_PAGE_VISIT_2"
		    Case ReportingColumn.ViewSignup2
		      Return "VIEW_SIGNUP_2"
		    Case ReportingColumn.ViewCheckout2
		      Return "VIEW_CHECKOUT_2"
		    Case ReportingColumn.ViewCustom2
		      Return "VIEW_CUSTOM_2"
		    Case ReportingColumn.ViewAddToCart2
		      Return "VIEW_ADD_TO_CART_2"
		    Case ReportingColumn.ViewLead2
		      Return "VIEW_LEAD_2"
		    Case ReportingColumn.ViewSearch2
		      Return "VIEW_SEARCH_2"
		    Case ReportingColumn.ViewWatchVideo2
		      Return "VIEW_WATCH_VIDEO_2"
		    Case ReportingColumn.ViewViewCategory2
		      Return "VIEW_VIEW_CATEGORY_2"
		    Case ReportingColumn.ViewAppInstall2
		      Return "VIEW_APP_INSTALL_2"
		    Case ReportingColumn.ViewUnknown2
		      Return "VIEW_UNKNOWN_2"
		    Case ReportingColumn.ViewAddPaymentInfo2
		      Return "VIEW_ADD_PAYMENT_INFO_2"
		    Case ReportingColumn.ViewAddToWishlist2
		      Return "VIEW_ADD_TO_WISHLIST_2"
		    Case ReportingColumn.ViewInitiateCheckout2
		      Return "VIEW_INITIATE_CHECKOUT_2"
		    Case ReportingColumn.ViewSubscribe2
		      Return "VIEW_SUBSCRIBE_2"
		    Case ReportingColumn.ViewViewContent2
		      Return "VIEW_VIEW_CONTENT_2"
		    Case ReportingColumn.Conversions2
		      Return "CONVERSIONS_2"
		    Case ReportingColumn.EngagementPageVisitValueInMicroDollar2
		      Return "ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementSignupValueInMicroDollar2
		      Return "ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementCheckoutValueInMicroDollar2
		      Return "ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementCustomValueInMicroDollar2
		      Return "ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementAddToCartValueInMicroDollar2
		      Return "ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementLeadValueInMicroDollar2
		      Return "ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementSearchValueInMicroDollar2
		      Return "ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementWatchVideoValueInMicroDollar2
		      Return "ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementViewCategoryValueInMicroDollar2
		      Return "ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementAppInstallValueInMicroDollar2
		      Return "ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementUnknownValueInMicroDollar2
		      Return "ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementAddPaymentInfoValueInMicroDollar2
		      Return "ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementAddToWishlistValueInMicroDollar2
		      Return "ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementInitiateCheckoutValueInMicroDollar2
		      Return "ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementSubscribeValueInMicroDollar2
		      Return "ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementViewContentValueInMicroDollar2
		      Return "ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickPageVisitValueInMicroDollar2
		      Return "CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickSignupValueInMicroDollar2
		      Return "CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickCheckoutValueInMicroDollar2
		      Return "CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickCustomValueInMicroDollar2
		      Return "CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickAddToCartValueInMicroDollar2
		      Return "CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickLeadValueInMicroDollar2
		      Return "CLICK_LEAD_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickSearchValueInMicroDollar2
		      Return "CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickWatchVideoValueInMicroDollar2
		      Return "CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickViewCategoryValueInMicroDollar2
		      Return "CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickAppInstallValueInMicroDollar2
		      Return "CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickUnknownValueInMicroDollar2
		      Return "CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickAddPaymentInfoValueInMicroDollar2
		      Return "CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickAddToWishlistValueInMicroDollar2
		      Return "CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickInitiateCheckoutValueInMicroDollar2
		      Return "CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickSubscribeValueInMicroDollar2
		      Return "CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickViewContentValueInMicroDollar2
		      Return "CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewPageVisitValueInMicroDollar2
		      Return "VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewSignupValueInMicroDollar2
		      Return "VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewCheckoutValueInMicroDollar2
		      Return "VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewCustomValueInMicroDollar2
		      Return "VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewAddToCartValueInMicroDollar2
		      Return "VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewLeadValueInMicroDollar2
		      Return "VIEW_LEAD_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewSearchValueInMicroDollar2
		      Return "VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewWatchVideoValueInMicroDollar2
		      Return "VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewViewCategoryValueInMicroDollar2
		      Return "VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewAppInstallValueInMicroDollar2
		      Return "VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewUnknownValueInMicroDollar2
		      Return "VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewAddPaymentInfoValueInMicroDollar2
		      Return "VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewAddToWishlistValueInMicroDollar2
		      Return "VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewInitiateCheckoutValueInMicroDollar2
		      Return "VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewSubscribeValueInMicroDollar2
		      Return "VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewViewContentValueInMicroDollar2
		      Return "VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ConversionsValueInMicroDollar2
		      Return "CONVERSIONS_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementPageVisitQuantity2
		      Return "ENGAGEMENT_PAGE_VISIT_QUANTITY_2"
		    Case ReportingColumn.EngagementSignupQuantity2
		      Return "ENGAGEMENT_SIGNUP_QUANTITY_2"
		    Case ReportingColumn.EngagementCheckoutQuantity2
		      Return "ENGAGEMENT_CHECKOUT_QUANTITY_2"
		    Case ReportingColumn.EngagementCustomQuantity2
		      Return "ENGAGEMENT_CUSTOM_QUANTITY_2"
		    Case ReportingColumn.EngagementAddToCartQuantity2
		      Return "ENGAGEMENT_ADD_TO_CART_QUANTITY_2"
		    Case ReportingColumn.EngagementLeadQuantity2
		      Return "ENGAGEMENT_LEAD_QUANTITY_2"
		    Case ReportingColumn.EngagementSearchQuantity2
		      Return "ENGAGEMENT_SEARCH_QUANTITY_2"
		    Case ReportingColumn.EngagementWatchVideoQuantity2
		      Return "ENGAGEMENT_WATCH_VIDEO_QUANTITY_2"
		    Case ReportingColumn.EngagementViewCategoryQuantity2
		      Return "ENGAGEMENT_VIEW_CATEGORY_QUANTITY_2"
		    Case ReportingColumn.EngagementAppInstallQuantity2
		      Return "ENGAGEMENT_APP_INSTALL_QUANTITY_2"
		    Case ReportingColumn.EngagementUnknownQuantity2
		      Return "ENGAGEMENT_UNKNOWN_QUANTITY_2"
		    Case ReportingColumn.EngagementAddPaymentInfoQuantity2
		      Return "ENGAGEMENT_ADD_PAYMENT_INFO_QUANTITY_2"
		    Case ReportingColumn.EngagementAddToWishlistQuantity2
		      Return "ENGAGEMENT_ADD_TO_WISHLIST_QUANTITY_2"
		    Case ReportingColumn.EngagementInitiateCheckoutQuantity2
		      Return "ENGAGEMENT_INITIATE_CHECKOUT_QUANTITY_2"
		    Case ReportingColumn.EngagementSubscribeQuantity2
		      Return "ENGAGEMENT_SUBSCRIBE_QUANTITY_2"
		    Case ReportingColumn.EngagementViewContentQuantity2
		      Return "ENGAGEMENT_VIEW_CONTENT_QUANTITY_2"
		    Case ReportingColumn.ClickPageVisitQuantity2
		      Return "CLICK_PAGE_VISIT_QUANTITY_2"
		    Case ReportingColumn.ClickSignupQuantity2
		      Return "CLICK_SIGNUP_QUANTITY_2"
		    Case ReportingColumn.ClickCheckoutQuantity2
		      Return "CLICK_CHECKOUT_QUANTITY_2"
		    Case ReportingColumn.ClickCustomQuantity2
		      Return "CLICK_CUSTOM_QUANTITY_2"
		    Case ReportingColumn.ClickAddToCartQuantity2
		      Return "CLICK_ADD_TO_CART_QUANTITY_2"
		    Case ReportingColumn.ClickLeadQuantity2
		      Return "CLICK_LEAD_QUANTITY_2"
		    Case ReportingColumn.ClickSearchQuantity2
		      Return "CLICK_SEARCH_QUANTITY_2"
		    Case ReportingColumn.ClickWatchVideoQuantity2
		      Return "CLICK_WATCH_VIDEO_QUANTITY_2"
		    Case ReportingColumn.ClickViewCategoryQuantity2
		      Return "CLICK_VIEW_CATEGORY_QUANTITY_2"
		    Case ReportingColumn.ClickAppInstallQuantity2
		      Return "CLICK_APP_INSTALL_QUANTITY_2"
		    Case ReportingColumn.ClickUnknownQuantity2
		      Return "CLICK_UNKNOWN_QUANTITY_2"
		    Case ReportingColumn.ClickAddPaymentInfoQuantity2
		      Return "CLICK_ADD_PAYMENT_INFO_QUANTITY_2"
		    Case ReportingColumn.ClickAddToWishlistQuantity2
		      Return "CLICK_ADD_TO_WISHLIST_QUANTITY_2"
		    Case ReportingColumn.ClickInitiateCheckoutQuantity2
		      Return "CLICK_INITIATE_CHECKOUT_QUANTITY_2"
		    Case ReportingColumn.ClickSubscribeQuantity2
		      Return "CLICK_SUBSCRIBE_QUANTITY_2"
		    Case ReportingColumn.ClickViewContentQuantity2
		      Return "CLICK_VIEW_CONTENT_QUANTITY_2"
		    Case ReportingColumn.ViewPageVisitQuantity2
		      Return "VIEW_PAGE_VISIT_QUANTITY_2"
		    Case ReportingColumn.ViewSignupQuantity2
		      Return "VIEW_SIGNUP_QUANTITY_2"
		    Case ReportingColumn.ViewCheckoutQuantity2
		      Return "VIEW_CHECKOUT_QUANTITY_2"
		    Case ReportingColumn.ViewCustomQuantity2
		      Return "VIEW_CUSTOM_QUANTITY_2"
		    Case ReportingColumn.ViewAddToCartQuantity2
		      Return "VIEW_ADD_TO_CART_QUANTITY_2"
		    Case ReportingColumn.ViewLeadQuantity2
		      Return "VIEW_LEAD_QUANTITY_2"
		    Case ReportingColumn.ViewSearchQuantity2
		      Return "VIEW_SEARCH_QUANTITY_2"
		    Case ReportingColumn.ViewWatchVideoQuantity2
		      Return "VIEW_WATCH_VIDEO_QUANTITY_2"
		    Case ReportingColumn.ViewViewCategoryQuantity2
		      Return "VIEW_VIEW_CATEGORY_QUANTITY_2"
		    Case ReportingColumn.ViewAppInstallQuantity2
		      Return "VIEW_APP_INSTALL_QUANTITY_2"
		    Case ReportingColumn.ViewUnknownQuantity2
		      Return "VIEW_UNKNOWN_QUANTITY_2"
		    Case ReportingColumn.ViewAddPaymentInfoQuantity2
		      Return "VIEW_ADD_PAYMENT_INFO_QUANTITY_2"
		    Case ReportingColumn.ViewAddToWishlistQuantity2
		      Return "VIEW_ADD_TO_WISHLIST_QUANTITY_2"
		    Case ReportingColumn.ViewInitiateCheckoutQuantity2
		      Return "VIEW_INITIATE_CHECKOUT_QUANTITY_2"
		    Case ReportingColumn.ViewSubscribeQuantity2
		      Return "VIEW_SUBSCRIBE_QUANTITY_2"
		    Case ReportingColumn.ViewViewContentQuantity2
		      Return "VIEW_VIEW_CONTENT_QUANTITY_2"
		    Case ReportingColumn.ConversionsQuantity2
		      Return "CONVERSIONS_QUANTITY_2"
		    Case ReportingColumn.TotalEngagementPageVisit
		      Return "TOTAL_ENGAGEMENT_PAGE_VISIT"
		    Case ReportingColumn.TotalEngagementSignup
		      Return "TOTAL_ENGAGEMENT_SIGNUP"
		    Case ReportingColumn.TotalEngagementCheckout
		      Return "TOTAL_ENGAGEMENT_CHECKOUT"
		    Case ReportingColumn.TotalEngagementCustom
		      Return "TOTAL_ENGAGEMENT_CUSTOM"
		    Case ReportingColumn.TotalEngagementAddToCart
		      Return "TOTAL_ENGAGEMENT_ADD_TO_CART"
		    Case ReportingColumn.TotalEngagementLead
		      Return "TOTAL_ENGAGEMENT_LEAD"
		    Case ReportingColumn.TotalEngagementSearch
		      Return "TOTAL_ENGAGEMENT_SEARCH"
		    Case ReportingColumn.TotalEngagementWatchVideo
		      Return "TOTAL_ENGAGEMENT_WATCH_VIDEO"
		    Case ReportingColumn.TotalEngagementViewCategory
		      Return "TOTAL_ENGAGEMENT_VIEW_CATEGORY"
		    Case ReportingColumn.TotalEngagementAppInstall
		      Return "TOTAL_ENGAGEMENT_APP_INSTALL"
		    Case ReportingColumn.TotalEngagementUnknown
		      Return "TOTAL_ENGAGEMENT_UNKNOWN"
		    Case ReportingColumn.TotalEngagementAddPaymentInfo
		      Return "TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO"
		    Case ReportingColumn.TotalEngagementAddToWishlist
		      Return "TOTAL_ENGAGEMENT_ADD_TO_WISHLIST"
		    Case ReportingColumn.TotalEngagementInitiateCheckout
		      Return "TOTAL_ENGAGEMENT_INITIATE_CHECKOUT"
		    Case ReportingColumn.TotalEngagementSubscribe
		      Return "TOTAL_ENGAGEMENT_SUBSCRIBE"
		    Case ReportingColumn.TotalEngagementViewContent
		      Return "TOTAL_ENGAGEMENT_VIEW_CONTENT"
		    Case ReportingColumn.TotalClickPageVisit
		      Return "TOTAL_CLICK_PAGE_VISIT"
		    Case ReportingColumn.TotalClickSignup
		      Return "TOTAL_CLICK_SIGNUP"
		    Case ReportingColumn.TotalClickCheckout
		      Return "TOTAL_CLICK_CHECKOUT"
		    Case ReportingColumn.TotalClickCustom
		      Return "TOTAL_CLICK_CUSTOM"
		    Case ReportingColumn.TotalClickAddToCart
		      Return "TOTAL_CLICK_ADD_TO_CART"
		    Case ReportingColumn.TotalClickLead
		      Return "TOTAL_CLICK_LEAD"
		    Case ReportingColumn.TotalClickSearch
		      Return "TOTAL_CLICK_SEARCH"
		    Case ReportingColumn.TotalClickWatchVideo
		      Return "TOTAL_CLICK_WATCH_VIDEO"
		    Case ReportingColumn.TotalClickViewCategory
		      Return "TOTAL_CLICK_VIEW_CATEGORY"
		    Case ReportingColumn.TotalClickAppInstall
		      Return "TOTAL_CLICK_APP_INSTALL"
		    Case ReportingColumn.TotalClickUnknown
		      Return "TOTAL_CLICK_UNKNOWN"
		    Case ReportingColumn.TotalClickAddPaymentInfo
		      Return "TOTAL_CLICK_ADD_PAYMENT_INFO"
		    Case ReportingColumn.TotalClickAddToWishlist
		      Return "TOTAL_CLICK_ADD_TO_WISHLIST"
		    Case ReportingColumn.TotalClickInitiateCheckout
		      Return "TOTAL_CLICK_INITIATE_CHECKOUT"
		    Case ReportingColumn.TotalClickSubscribe
		      Return "TOTAL_CLICK_SUBSCRIBE"
		    Case ReportingColumn.TotalClickViewContent
		      Return "TOTAL_CLICK_VIEW_CONTENT"
		    Case ReportingColumn.TotalViewPageVisit
		      Return "TOTAL_VIEW_PAGE_VISIT"
		    Case ReportingColumn.TotalViewSignup
		      Return "TOTAL_VIEW_SIGNUP"
		    Case ReportingColumn.TotalViewCheckout
		      Return "TOTAL_VIEW_CHECKOUT"
		    Case ReportingColumn.TotalViewCustom
		      Return "TOTAL_VIEW_CUSTOM"
		    Case ReportingColumn.TotalViewAddToCart
		      Return "TOTAL_VIEW_ADD_TO_CART"
		    Case ReportingColumn.TotalViewLead
		      Return "TOTAL_VIEW_LEAD"
		    Case ReportingColumn.TotalViewSearch
		      Return "TOTAL_VIEW_SEARCH"
		    Case ReportingColumn.TotalViewWatchVideo
		      Return "TOTAL_VIEW_WATCH_VIDEO"
		    Case ReportingColumn.TotalViewViewCategory
		      Return "TOTAL_VIEW_VIEW_CATEGORY"
		    Case ReportingColumn.TotalViewAppInstall
		      Return "TOTAL_VIEW_APP_INSTALL"
		    Case ReportingColumn.TotalViewUnknown
		      Return "TOTAL_VIEW_UNKNOWN"
		    Case ReportingColumn.TotalViewAddPaymentInfo
		      Return "TOTAL_VIEW_ADD_PAYMENT_INFO"
		    Case ReportingColumn.TotalViewAddToWishlist
		      Return "TOTAL_VIEW_ADD_TO_WISHLIST"
		    Case ReportingColumn.TotalViewInitiateCheckout
		      Return "TOTAL_VIEW_INITIATE_CHECKOUT"
		    Case ReportingColumn.TotalViewSubscribe
		      Return "TOTAL_VIEW_SUBSCRIBE"
		    Case ReportingColumn.TotalViewViewContent
		      Return "TOTAL_VIEW_VIEW_CONTENT"
		    Case ReportingColumn.TotalConversions
		      Return "TOTAL_CONVERSIONS"
		    Case ReportingColumn.TotalWebConversions
		      Return "TOTAL_WEB_CONVERSIONS"
		    Case ReportingColumn.TotalInappConversions
		      Return "TOTAL_INAPP_CONVERSIONS"
		    Case ReportingColumn.TotalOfflineConversions
		      Return "TOTAL_OFFLINE_CONVERSIONS"
		    Case ReportingColumn.TotalEngagementPageVisitValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementPageVisitValueInDollar
		      Return "TOTAL_ENGAGEMENT_PAGE_VISIT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementSignupValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementSignupValueInDollar
		      Return "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementCheckoutValueInDollar
		      Return "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementCustomValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementCustomValueInDollar
		      Return "TOTAL_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementAddToCartValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementAddToCartValueInDollar
		      Return "TOTAL_ENGAGEMENT_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementLeadValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementLeadValueInDollar
		      Return "TOTAL_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementSearchValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementSearchValueInDollar
		      Return "TOTAL_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementWatchVideoValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementWatchVideoValueInDollar
		      Return "TOTAL_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementViewCategoryValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementViewCategoryValueInDollar
		      Return "TOTAL_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementAppInstallValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementUnknownValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementAddPaymentInfoValueInDollar
		      Return "TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementAddToWishlistValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementAddToWishlistValueInDollar
		      Return "TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementInitiateCheckoutValueInDollar
		      Return "TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementSubscribeValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementSubscribeValueInDollar
		      Return "TOTAL_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementViewContentValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementViewContentValueInDollar
		      Return "TOTAL_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickPageVisitValueInMicroDollar
		      Return "TOTAL_CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickPageVisitValueInDollar
		      Return "TOTAL_CLICK_PAGE_VISIT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickSignupValueInMicroDollar
		      Return "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickSignupValueInDollar
		      Return "TOTAL_CLICK_SIGNUP_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickCheckoutValueInMicroDollar
		      Return "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickCheckoutValueInDollar
		      Return "TOTAL_CLICK_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickCustomValueInMicroDollar
		      Return "TOTAL_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickCustomValueInDollar
		      Return "TOTAL_CLICK_CUSTOM_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickAddToCartValueInMicroDollar
		      Return "TOTAL_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickAddToCartValueInDollar
		      Return "TOTAL_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickLeadValueInMicroDollar
		      Return "TOTAL_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickLeadValueInDollar
		      Return "TOTAL_CLICK_LEAD_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickSearchValueInMicroDollar
		      Return "TOTAL_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickSearchValueInDollar
		      Return "TOTAL_CLICK_SEARCH_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickWatchVideoValueInMicroDollar
		      Return "TOTAL_CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickWatchVideoValueInDollar
		      Return "TOTAL_CLICK_WATCH_VIDEO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickViewCategoryValueInMicroDollar
		      Return "TOTAL_CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickViewCategoryValueInDollar
		      Return "TOTAL_CLICK_VIEW_CATEGORY_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickAppInstallValueInMicroDollar
		      Return "TOTAL_CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickUnknownValueInMicroDollar
		      Return "TOTAL_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickAddPaymentInfoValueInDollar
		      Return "TOTAL_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickAddToWishlistValueInMicroDollar
		      Return "TOTAL_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickAddToWishlistValueInDollar
		      Return "TOTAL_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickInitiateCheckoutValueInDollar
		      Return "TOTAL_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickSubscribeValueInMicroDollar
		      Return "TOTAL_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickSubscribeValueInDollar
		      Return "TOTAL_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickViewContentValueInMicroDollar
		      Return "TOTAL_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickViewContentValueInDollar
		      Return "TOTAL_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewPageVisitValueInMicroDollar
		      Return "TOTAL_VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewPageVisitValueInDollar
		      Return "TOTAL_VIEW_PAGE_VISIT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewSignupValueInMicroDollar
		      Return "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewSignupValueInDollar
		      Return "TOTAL_VIEW_SIGNUP_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewCheckoutValueInMicroDollar
		      Return "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewCheckoutValueInDollar
		      Return "TOTAL_VIEW_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewCustomValueInMicroDollar
		      Return "TOTAL_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewCustomValueInDollar
		      Return "TOTAL_VIEW_CUSTOM_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewAddToCartValueInMicroDollar
		      Return "TOTAL_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewAddToCartValueInDollar
		      Return "TOTAL_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewLeadValueInMicroDollar
		      Return "TOTAL_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewLeadValueInDollar
		      Return "TOTAL_VIEW_LEAD_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewSearchValueInMicroDollar
		      Return "TOTAL_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewSearchValueInDollar
		      Return "TOTAL_VIEW_SEARCH_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewWatchVideoValueInMicroDollar
		      Return "TOTAL_VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewWatchVideoValueInDollar
		      Return "TOTAL_VIEW_WATCH_VIDEO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewViewCategoryValueInMicroDollar
		      Return "TOTAL_VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewViewCategoryValueInDollar
		      Return "TOTAL_VIEW_VIEW_CATEGORY_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewAppInstallValueInMicroDollar
		      Return "TOTAL_VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewUnknownValueInMicroDollar
		      Return "TOTAL_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewAddPaymentInfoValueInDollar
		      Return "TOTAL_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewAddToWishlistValueInMicroDollar
		      Return "TOTAL_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewAddToWishlistValueInDollar
		      Return "TOTAL_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewInitiateCheckoutValueInDollar
		      Return "TOTAL_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewSubscribeValueInMicroDollar
		      Return "TOTAL_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewSubscribeValueInDollar
		      Return "TOTAL_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewViewContentValueInMicroDollar
		      Return "TOTAL_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewViewContentValueInDollar
		      Return "TOTAL_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalConversionsValueInMicroDollar
		      Return "TOTAL_CONVERSIONS_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalConversionsValueInDollar
		      Return "TOTAL_CONVERSIONS_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementPageVisitQuantity
		      Return "TOTAL_ENGAGEMENT_PAGE_VISIT_QUANTITY"
		    Case ReportingColumn.TotalEngagementSignupQuantity
		      Return "TOTAL_ENGAGEMENT_SIGNUP_QUANTITY"
		    Case ReportingColumn.TotalEngagementCheckoutQuantity
		      Return "TOTAL_ENGAGEMENT_CHECKOUT_QUANTITY"
		    Case ReportingColumn.TotalEngagementCustomQuantity
		      Return "TOTAL_ENGAGEMENT_CUSTOM_QUANTITY"
		    Case ReportingColumn.TotalEngagementAddToCartQuantity
		      Return "TOTAL_ENGAGEMENT_ADD_TO_CART_QUANTITY"
		    Case ReportingColumn.TotalEngagementLeadQuantity
		      Return "TOTAL_ENGAGEMENT_LEAD_QUANTITY"
		    Case ReportingColumn.TotalEngagementSearchQuantity
		      Return "TOTAL_ENGAGEMENT_SEARCH_QUANTITY"
		    Case ReportingColumn.TotalEngagementWatchVideoQuantity
		      Return "TOTAL_ENGAGEMENT_WATCH_VIDEO_QUANTITY"
		    Case ReportingColumn.TotalEngagementViewCategoryQuantity
		      Return "TOTAL_ENGAGEMENT_VIEW_CATEGORY_QUANTITY"
		    Case ReportingColumn.TotalEngagementAppInstallQuantity
		      Return "TOTAL_ENGAGEMENT_APP_INSTALL_QUANTITY"
		    Case ReportingColumn.TotalEngagementUnknownQuantity
		      Return "TOTAL_ENGAGEMENT_UNKNOWN_QUANTITY"
		    Case ReportingColumn.TotalEngagementAddPaymentInfoQuantity
		      Return "TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_QUANTITY"
		    Case ReportingColumn.TotalEngagementAddToWishlistQuantity
		      Return "TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_QUANTITY"
		    Case ReportingColumn.TotalEngagementInitiateCheckoutQuantity
		      Return "TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_QUANTITY"
		    Case ReportingColumn.TotalEngagementSubscribeQuantity
		      Return "TOTAL_ENGAGEMENT_SUBSCRIBE_QUANTITY"
		    Case ReportingColumn.TotalEngagementViewContentQuantity
		      Return "TOTAL_ENGAGEMENT_VIEW_CONTENT_QUANTITY"
		    Case ReportingColumn.TotalClickPageVisitQuantity
		      Return "TOTAL_CLICK_PAGE_VISIT_QUANTITY"
		    Case ReportingColumn.TotalClickSignupQuantity
		      Return "TOTAL_CLICK_SIGNUP_QUANTITY"
		    Case ReportingColumn.TotalClickCheckoutQuantity
		      Return "TOTAL_CLICK_CHECKOUT_QUANTITY"
		    Case ReportingColumn.TotalClickCustomQuantity
		      Return "TOTAL_CLICK_CUSTOM_QUANTITY"
		    Case ReportingColumn.TotalClickAddToCartQuantity
		      Return "TOTAL_CLICK_ADD_TO_CART_QUANTITY"
		    Case ReportingColumn.TotalClickLeadQuantity
		      Return "TOTAL_CLICK_LEAD_QUANTITY"
		    Case ReportingColumn.TotalClickSearchQuantity
		      Return "TOTAL_CLICK_SEARCH_QUANTITY"
		    Case ReportingColumn.TotalClickWatchVideoQuantity
		      Return "TOTAL_CLICK_WATCH_VIDEO_QUANTITY"
		    Case ReportingColumn.TotalClickViewCategoryQuantity
		      Return "TOTAL_CLICK_VIEW_CATEGORY_QUANTITY"
		    Case ReportingColumn.TotalClickAppInstallQuantity
		      Return "TOTAL_CLICK_APP_INSTALL_QUANTITY"
		    Case ReportingColumn.TotalClickUnknownQuantity
		      Return "TOTAL_CLICK_UNKNOWN_QUANTITY"
		    Case ReportingColumn.TotalClickAddPaymentInfoQuantity
		      Return "TOTAL_CLICK_ADD_PAYMENT_INFO_QUANTITY"
		    Case ReportingColumn.TotalClickAddToWishlistQuantity
		      Return "TOTAL_CLICK_ADD_TO_WISHLIST_QUANTITY"
		    Case ReportingColumn.TotalClickInitiateCheckoutQuantity
		      Return "TOTAL_CLICK_INITIATE_CHECKOUT_QUANTITY"
		    Case ReportingColumn.TotalClickSubscribeQuantity
		      Return "TOTAL_CLICK_SUBSCRIBE_QUANTITY"
		    Case ReportingColumn.TotalClickViewContentQuantity
		      Return "TOTAL_CLICK_VIEW_CONTENT_QUANTITY"
		    Case ReportingColumn.TotalViewPageVisitQuantity
		      Return "TOTAL_VIEW_PAGE_VISIT_QUANTITY"
		    Case ReportingColumn.TotalViewSignupQuantity
		      Return "TOTAL_VIEW_SIGNUP_QUANTITY"
		    Case ReportingColumn.TotalViewCheckoutQuantity
		      Return "TOTAL_VIEW_CHECKOUT_QUANTITY"
		    Case ReportingColumn.TotalViewCustomQuantity
		      Return "TOTAL_VIEW_CUSTOM_QUANTITY"
		    Case ReportingColumn.TotalViewAddToCartQuantity
		      Return "TOTAL_VIEW_ADD_TO_CART_QUANTITY"
		    Case ReportingColumn.TotalViewLeadQuantity
		      Return "TOTAL_VIEW_LEAD_QUANTITY"
		    Case ReportingColumn.TotalViewSearchQuantity
		      Return "TOTAL_VIEW_SEARCH_QUANTITY"
		    Case ReportingColumn.TotalViewWatchVideoQuantity
		      Return "TOTAL_VIEW_WATCH_VIDEO_QUANTITY"
		    Case ReportingColumn.TotalViewViewCategoryQuantity
		      Return "TOTAL_VIEW_VIEW_CATEGORY_QUANTITY"
		    Case ReportingColumn.TotalViewAppInstallQuantity
		      Return "TOTAL_VIEW_APP_INSTALL_QUANTITY"
		    Case ReportingColumn.TotalViewUnknownQuantity
		      Return "TOTAL_VIEW_UNKNOWN_QUANTITY"
		    Case ReportingColumn.TotalViewAddPaymentInfoQuantity
		      Return "TOTAL_VIEW_ADD_PAYMENT_INFO_QUANTITY"
		    Case ReportingColumn.TotalViewAddToWishlistQuantity
		      Return "TOTAL_VIEW_ADD_TO_WISHLIST_QUANTITY"
		    Case ReportingColumn.TotalViewInitiateCheckoutQuantity
		      Return "TOTAL_VIEW_INITIATE_CHECKOUT_QUANTITY"
		    Case ReportingColumn.TotalViewSubscribeQuantity
		      Return "TOTAL_VIEW_SUBSCRIBE_QUANTITY"
		    Case ReportingColumn.TotalViewViewContentQuantity
		      Return "TOTAL_VIEW_VIEW_CONTENT_QUANTITY"
		    Case ReportingColumn.TotalConversionsQuantity
		      Return "TOTAL_CONVERSIONS_QUANTITY"
		    Case ReportingColumn.CostPerConversionInDollar
		      Return "COST_PER_CONVERSION_IN_DOLLAR"
		    Case ReportingColumn.TotalWebSessions
		      Return "TOTAL_WEB_SESSIONS"
		    Case ReportingColumn.WebSessions1
		      Return "WEB_SESSIONS_1"
		    Case ReportingColumn.WebSessions2
		      Return "WEB_SESSIONS_2"
		    Case ReportingColumn.AppInstallsCpaBillable
		      Return "APP_INSTALLS_CPA_BILLABLE"
		    Case ReportingColumn.AppInstallsClick
		      Return "APP_INSTALLS_CLICK"
		    Case ReportingColumn.AppInstallsCloseuprepin
		      Return "APP_INSTALLS_CLOSEUPREPIN"
		    Case ReportingColumn.AppInstallsView
		      Return "APP_INSTALLS_VIEW"
		    Case ReportingColumn.AppInstalls
		      Return "APP_INSTALLS"
		    Case ReportingColumn.AppInstallsEngagement
		      Return "APP_INSTALLS_ENGAGEMENT"
		    Case ReportingColumn.AppInstallsClick1
		      Return "APP_INSTALLS_CLICK_1"
		    Case ReportingColumn.AppInstallsClick2
		      Return "APP_INSTALLS_CLICK_2"
		    Case ReportingColumn.AppInstallsView1
		      Return "APP_INSTALLS_VIEW_1"
		    Case ReportingColumn.AppInstallsView2
		      Return "APP_INSTALLS_VIEW_2"
		    Case ReportingColumn.AppInstallsEngagement1
		      Return "APP_INSTALLS_ENGAGEMENT_1"
		    Case ReportingColumn.AppInstallsEngagement2
		      Return "APP_INSTALLS_ENGAGEMENT_2"
		    Case ReportingColumn.AppInstalls1
		      Return "APP_INSTALLS_1"
		    Case ReportingColumn.AppInstalls2
		      Return "APP_INSTALLS_2"
		    Case ReportingColumn.CpiInMicroDollar
		      Return "CPI_IN_MICRO_DOLLAR"
		    Case ReportingColumn.EcpiInMicroDollar
		      Return "ECPI_IN_MICRO_DOLLAR"
		    Case ReportingColumn.CpiInDollar
		      Return "CPI_IN_DOLLAR"
		    Case ReportingColumn.EcpiInDollar
		      Return "ECPI_IN_DOLLAR"
		    Case ReportingColumn.InappSkanAppInstall
		      Return "INAPP_SKAN_APP_INSTALL"
		    Case ReportingColumn.InappSkanAssistedAppInstall
		      Return "INAPP_SKAN_ASSISTED_APP_INSTALL"
		    Case ReportingColumn.InappSkanAppInstallCostPerAction
		      Return "INAPP_SKAN_APP_INSTALL_COST_PER_ACTION"
		    Case ReportingColumn.InappSkanAppInstallConversionRate
		      Return "INAPP_SKAN_APP_INSTALL_CONVERSION_RATE"
		    Case ReportingColumn.OnsiteCheckoutsCpaBillable1
		      Return "ONSITE_CHECKOUTS_CPA_BILLABLE_1"
		    Case ReportingColumn.OnsiteCheckoutsCpaBillable2
		      Return "ONSITE_CHECKOUTS_CPA_BILLABLE_2"
		    Case ReportingColumn.OnsiteCheckoutsCpaBillable
		      Return "ONSITE_CHECKOUTS_CPA_BILLABLE"
		    Case ReportingColumn.OnsiteCheckoutsValue1
		      Return "ONSITE_CHECKOUTS_VALUE_1"
		    Case ReportingColumn.OnsiteCheckoutsValue2
		      Return "ONSITE_CHECKOUTS_VALUE_2"
		    Case ReportingColumn.OnsiteCheckoutsValue
		      Return "ONSITE_CHECKOUTS_VALUE"
		    Case ReportingColumn.OnsiteCheckouts1
		      Return "ONSITE_CHECKOUTS_1"
		    Case ReportingColumn.OnsiteCheckouts2
		      Return "ONSITE_CHECKOUTS_2"
		    Case ReportingColumn.OnsiteCheckouts
		      Return "ONSITE_CHECKOUTS"
		    Case ReportingColumn.OnsiteCheckoutsValueInMicroDollar1
		      Return "ONSITE_CHECKOUTS_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.OnsiteCheckoutsValueInMicroDollar2
		      Return "ONSITE_CHECKOUTS_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ConversionRate
		      Return "CONVERSION_RATE"
		    Case ReportingColumn.AverageCheckoutValue
		      Return "AVERAGE_CHECKOUT_VALUE"
		    Case ReportingColumn.ReturnOnAdvertiserSpend
		      Return "RETURN_ON_ADVERTISER_SPEND"
		    Case ReportingColumn.BuyButtonClicks1
		      Return "BUY_BUTTON_CLICKS_1"
		    Case ReportingColumn.BuyButtonClicks2
		      Return "BUY_BUTTON_CLICKS_2"
		    Case ReportingColumn.TotalBuyButtonClicks
		      Return "TOTAL_BUY_BUTTON_CLICKS"
		    Case ReportingColumn.OrderDropoffRate
		      Return "ORDER_DROPOFF_RATE"
		    Case ReportingColumn.OnsiteCheckoutsValueInMicroDollar
		      Return "ONSITE_CHECKOUTS_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.OnsiteCheckoutsValueInDollar
		      Return "ONSITE_CHECKOUTS_VALUE_IN_DOLLAR"
		    Case ReportingColumn.PinPromotionName
		      Return "PIN_PROMOTION_NAME"
		    Case ReportingColumn.AdName
		      Return "AD_NAME"
		    Case ReportingColumn.LifetimeImpressionUser1
		      Return "LIFETIME_IMPRESSION_USER_1"
		    Case ReportingColumn.PinPromotionCampaignId
		      Return "PIN_PROMOTION_CAMPAIGN_ID"
		    Case ReportingColumn.PinPromotionCampaignName
		      Return "PIN_PROMOTION_CAMPAIGN_NAME"
		    Case ReportingColumn.PinPromotionCampaignActionType
		      Return "PIN_PROMOTION_CAMPAIGN_ACTION_TYPE"
		    Case ReportingColumn.TotalLifetimeImpressionUser
		      Return "TOTAL_LIFETIME_IMPRESSION_USER"
		    Case ReportingColumn.PinPromotionCampaignStatus
		      Return "PIN_PROMOTION_CAMPAIGN_STATUS"
		    Case ReportingColumn.PinPromotionCampaignManagedStatus
		      Return "PIN_PROMOTION_CAMPAIGN_MANAGED_STATUS"
		    Case ReportingColumn.PinPromotionCampaignEntityStatus
		      Return "PIN_PROMOTION_CAMPAIGN_ENTITY_STATUS"
		    Case ReportingColumn.PinPromotionAdGroupId
		      Return "PIN_PROMOTION_AD_GROUP_ID"
		    Case ReportingColumn.PinPromotionAdGroupName
		      Return "PIN_PROMOTION_AD_GROUP_NAME"
		    Case ReportingColumn.PinPromotionAdGroupStatus
		      Return "PIN_PROMOTION_AD_GROUP_STATUS"
		    Case ReportingColumn.PinPromotionAdGroupEntityStatus
		      Return "PIN_PROMOTION_AD_GROUP_ENTITY_STATUS"
		    Case ReportingColumn.PinPromotionCreativeType
		      Return "PIN_PROMOTION_CREATIVE_TYPE"
		    Case ReportingColumn.PinPromotionEntityStatus
		      Return "PIN_PROMOTION_ENTITY_STATUS"
		    Case ReportingColumn.PinPromotionCreativeTypeV2
		      Return "PIN_PROMOTION_CREATIVE_TYPE_V2"
		    Case ReportingColumn.PinPromotionReviewStatus
		      Return "PIN_PROMOTION_REVIEW_STATUS"
		    Case ReportingColumn.AdGroupCampaignActionType
		      Return "AD_GROUP_CAMPAIGN_ACTION_TYPE"
		    Case ReportingColumn.AdGroupCampaignId
		      Return "AD_GROUP_CAMPAIGN_ID"
		    Case ReportingColumn.AdGroupCampaignName
		      Return "AD_GROUP_CAMPAIGN_NAME"
		    Case ReportingColumn.AdGroupCampaignStatus
		      Return "AD_GROUP_CAMPAIGN_STATUS"
		    Case ReportingColumn.AdGroupCreativeType
		      Return "AD_GROUP_CREATIVE_TYPE"
		    Case ReportingColumn.AdGroupCampaignManagedStatus
		      Return "AD_GROUP_CAMPAIGN_MANAGED_STATUS"
		    Case ReportingColumn.AdGroupCampaignEntityStatus
		      Return "AD_GROUP_CAMPAIGN_ENTITY_STATUS"
		    Case ReportingColumn.AdGroupStartDate
		      Return "AD_GROUP_START_DATE"
		    Case ReportingColumn.CampaignLifetimeSpendCap
		      Return "CAMPAIGN_LIFETIME_SPEND_CAP"
		    Case ReportingColumn.AdGroupBidInMicroCurrency
		      Return "AD_GROUP_BID_IN_MICRO_CURRENCY"
		    Case ReportingColumn.CampaignAdGroupStartDate
		      Return "CAMPAIGN_AD_GROUP_START_DATE"
		    Case ReportingColumn.CampaignAdGroupEndDate
		      Return "CAMPAIGN_AD_GROUP_END_DATE"
		    Case ReportingColumn.CampaignNumberOfAdGroups
		      Return "CAMPAIGN_NUMBER_OF_AD_GROUPS"
		    Case ReportingColumn.AdGroupNumberOfPinPromotions
		      Return "AD_GROUP_NUMBER_OF_PIN_PROMOTIONS"
		    Case ReportingColumn.TodaySpendInLocalCurrency
		      Return "TODAY_SPEND_IN_LOCAL_CURRENCY"
		    Case ReportingColumn.TotalLifetimeSpendInLocalCurrency
		      Return "TOTAL_LIFETIME_SPEND_IN_LOCAL_CURRENCY"
		    Case ReportingColumn.BudgetUtilization
		      Return "BUDGET_UTILIZATION"
		    Case ReportingColumn.AdGroupOptimization
		      Return "AD_GROUP_OPTIMIZATION"
		    Case ReportingColumn.InsertionOrder
		      Return "INSERTION_ORDER"
		    Case ReportingColumn.AdGroupBonusBudget
		      Return "AD_GROUP_BONUS_BUDGET"
		    Case ReportingColumn.Frequency
		      Return "FREQUENCY"
		    Case ReportingColumn.CampaignDailySpendCap
		      Return "CAMPAIGN_DAILY_SPEND_CAP"
		    Case ReportingColumn.CampaignCreativeType
		      Return "CAMPAIGN_CREATIVE_TYPE"
		    Case ReportingColumn.AdGroupPlacementGroupType
		      Return "AD_GROUP_PLACEMENT_GROUP_TYPE"
		    Case ReportingColumn.AdGroupIsPrefetchEnabled
		      Return "AD_GROUP_IS_PREFETCH_ENABLED"
		    Case ReportingColumn.CampaignBudgetOptimization
		      Return "CAMPAIGN_BUDGET_OPTIMIZATION"
		    Case ReportingColumn.CampaignStartDate
		      Return "CAMPAIGN_START_DATE"
		    Case ReportingColumn.IsAutomatedCampaign
		      Return "IS_AUTOMATED_CAMPAIGN"
		    Case ReportingColumn.IsPremiereCampaign
		      Return "IS_PREMIERE_CAMPAIGN"
		    Case ReportingColumn.FlexibleDailyBudgets
		      Return "FLEXIBLE_DAILY_BUDGETS"
		    Case ReportingColumn.IsPerformancePlusCampaign
		      Return "IS_PERFORMANCE_PLUS_CAMPAIGN"
		    Case ReportingColumn.IsDcoFormatEnhancment
		      Return "IS_DCO_FORMAT_ENHANCMENT"
		    Case ReportingColumn.PercentCrossDeviceConversions
		      Return "PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ReportingColumn.PageVisitPercentCrossDeviceConversions
		      Return "PAGE_VISIT_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ReportingColumn.SignupPercentCrossDeviceConversions
		      Return "SIGNUP_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ReportingColumn.CheckoutPercentCrossDeviceConversions
		      Return "CHECKOUT_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ReportingColumn.CustomPercentCrossDeviceConversions
		      Return "CUSTOM_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ReportingColumn.AddToCartPercentCrossDeviceConversions
		      Return "ADD_TO_CART_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ReportingColumn.LeadPercentCrossDeviceConversions
		      Return "LEAD_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ReportingColumn.SearchPercentCrossDeviceConversions
		      Return "SEARCH_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ReportingColumn.WatchVideoPercentCrossDeviceConversions
		      Return "WATCH_VIDEO_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ReportingColumn.ViewCategoryPercentCrossDeviceConversions
		      Return "VIEW_CATEGORY_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ReportingColumn.AppInstallPercentCrossDeviceConversions
		      Return "APP_INSTALL_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ReportingColumn.UnknownPercentCrossDeviceConversions
		      Return "UNKNOWN_PERCENT_CROSS_DEVICE_CONVERSIONS"
		    Case ReportingColumn.TotalDesktopActionToDesktopConversion
		      Return "TOTAL_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalDesktopActionToMobileConversion
		      Return "TOTAL_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalDesktopActionToTabletConversion
		      Return "TOTAL_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalMobileActionToDesktopConversion
		      Return "TOTAL_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalMobileActionToMobileConversion
		      Return "TOTAL_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalMobileActionToTabletConversion
		      Return "TOTAL_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalTabletActionToDesktopConversion
		      Return "TOTAL_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalTabletActionToMobileConversion
		      Return "TOTAL_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalTabletActionToTabletConversion
		      Return "TOTAL_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalPageVisitDesktopActionToDesktopConversion
		      Return "TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalPageVisitDesktopActionToMobileConversion
		      Return "TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalPageVisitDesktopActionToTabletConversion
		      Return "TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalPageVisitMobileActionToDesktopConversion
		      Return "TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalPageVisitMobileActionToMobileConversion
		      Return "TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalPageVisitMobileActionToTabletConversion
		      Return "TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalPageVisitTabletActionToDesktopConversion
		      Return "TOTAL_PAGE_VISIT_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalPageVisitTabletActionToMobileConversion
		      Return "TOTAL_PAGE_VISIT_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalPageVisitTabletActionToTabletConversion
		      Return "TOTAL_PAGE_VISIT_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalSignupDesktopActionToDesktopConversion
		      Return "TOTAL_SIGNUP_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalSignupDesktopActionToMobileConversion
		      Return "TOTAL_SIGNUP_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalSignupDesktopActionToTabletConversion
		      Return "TOTAL_SIGNUP_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalSignupMobileActionToDesktopConversion
		      Return "TOTAL_SIGNUP_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalSignupMobileActionToMobileConversion
		      Return "TOTAL_SIGNUP_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalSignupMobileActionToTabletConversion
		      Return "TOTAL_SIGNUP_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalSignupTabletActionToDesktopConversion
		      Return "TOTAL_SIGNUP_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalSignupTabletActionToMobileConversion
		      Return "TOTAL_SIGNUP_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalSignupTabletActionToTabletConversion
		      Return "TOTAL_SIGNUP_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalCheckoutDesktopActionToDesktopConversion
		      Return "TOTAL_CHECKOUT_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalCheckoutDesktopActionToMobileConversion
		      Return "TOTAL_CHECKOUT_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalCheckoutDesktopActionToTabletConversion
		      Return "TOTAL_CHECKOUT_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalCheckoutMobileActionToDesktopConversion
		      Return "TOTAL_CHECKOUT_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalCheckoutMobileActionToMobileConversion
		      Return "TOTAL_CHECKOUT_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalCheckoutMobileActionToTabletConversion
		      Return "TOTAL_CHECKOUT_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalCheckoutTabletActionToDesktopConversion
		      Return "TOTAL_CHECKOUT_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalCheckoutTabletActionToMobileConversion
		      Return "TOTAL_CHECKOUT_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalCheckoutTabletActionToTabletConversion
		      Return "TOTAL_CHECKOUT_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalCustomDesktopActionToDesktopConversion
		      Return "TOTAL_CUSTOM_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalCustomDesktopActionToMobileConversion
		      Return "TOTAL_CUSTOM_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalCustomDesktopActionToTabletConversion
		      Return "TOTAL_CUSTOM_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalCustomMobileActionToDesktopConversion
		      Return "TOTAL_CUSTOM_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalCustomMobileActionToMobileConversion
		      Return "TOTAL_CUSTOM_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalCustomMobileActionToTabletConversion
		      Return "TOTAL_CUSTOM_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalCustomTabletActionToDesktopConversion
		      Return "TOTAL_CUSTOM_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalCustomTabletActionToMobileConversion
		      Return "TOTAL_CUSTOM_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalCustomTabletActionToTabletConversion
		      Return "TOTAL_CUSTOM_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalAddToCartDesktopActionToDesktopConversion
		      Return "TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalAddToCartDesktopActionToMobileConversion
		      Return "TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalAddToCartDesktopActionToTabletConversion
		      Return "TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalAddToCartMobileActionToDesktopConversion
		      Return "TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalAddToCartMobileActionToMobileConversion
		      Return "TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalAddToCartMobileActionToTabletConversion
		      Return "TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalAddToCartTabletActionToDesktopConversion
		      Return "TOTAL_ADD_TO_CART_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalAddToCartTabletActionToMobileConversion
		      Return "TOTAL_ADD_TO_CART_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalAddToCartTabletActionToTabletConversion
		      Return "TOTAL_ADD_TO_CART_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalLeadDesktopActionToDesktopConversion
		      Return "TOTAL_LEAD_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalLeadDesktopActionToMobileConversion
		      Return "TOTAL_LEAD_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalLeadDesktopActionToTabletConversion
		      Return "TOTAL_LEAD_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalLeadMobileActionToDesktopConversion
		      Return "TOTAL_LEAD_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalLeadMobileActionToMobileConversion
		      Return "TOTAL_LEAD_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalLeadMobileActionToTabletConversion
		      Return "TOTAL_LEAD_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalLeadTabletActionToDesktopConversion
		      Return "TOTAL_LEAD_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalLeadTabletActionToMobileConversion
		      Return "TOTAL_LEAD_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalLeadTabletActionToTabletConversion
		      Return "TOTAL_LEAD_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalSearchDesktopActionToDesktopConversion
		      Return "TOTAL_SEARCH_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalSearchDesktopActionToMobileConversion
		      Return "TOTAL_SEARCH_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalSearchDesktopActionToTabletConversion
		      Return "TOTAL_SEARCH_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalSearchMobileActionToDesktopConversion
		      Return "TOTAL_SEARCH_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalSearchMobileActionToMobileConversion
		      Return "TOTAL_SEARCH_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalSearchMobileActionToTabletConversion
		      Return "TOTAL_SEARCH_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalSearchTabletActionToDesktopConversion
		      Return "TOTAL_SEARCH_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalSearchTabletActionToMobileConversion
		      Return "TOTAL_SEARCH_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalSearchTabletActionToTabletConversion
		      Return "TOTAL_SEARCH_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalWatchVideoDesktopActionToDesktopConversion
		      Return "TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalWatchVideoDesktopActionToMobileConversion
		      Return "TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalWatchVideoDesktopActionToTabletConversion
		      Return "TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalWatchVideoMobileActionToDesktopConversion
		      Return "TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalWatchVideoMobileActionToMobileConversion
		      Return "TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalWatchVideoMobileActionToTabletConversion
		      Return "TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalWatchVideoTabletActionToDesktopConversion
		      Return "TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalWatchVideoTabletActionToMobileConversion
		      Return "TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalWatchVideoTabletActionToTabletConversion
		      Return "TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalViewCategoryDesktopActionToDesktopConversion
		      Return "TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalViewCategoryDesktopActionToMobileConversion
		      Return "TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalViewCategoryDesktopActionToTabletConversion
		      Return "TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalViewCategoryMobileActionToDesktopConversion
		      Return "TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalViewCategoryMobileActionToMobileConversion
		      Return "TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalViewCategoryMobileActionToTabletConversion
		      Return "TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalViewCategoryTabletActionToDesktopConversion
		      Return "TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalViewCategoryTabletActionToMobileConversion
		      Return "TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalViewCategoryTabletActionToTabletConversion
		      Return "TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalAppInstallDesktopActionToDesktopConversion
		      Return "TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalAppInstallDesktopActionToMobileConversion
		      Return "TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalAppInstallDesktopActionToTabletConversion
		      Return "TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalAppInstallMobileActionToDesktopConversion
		      Return "TOTAL_APP_INSTALL_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalAppInstallMobileActionToMobileConversion
		      Return "TOTAL_APP_INSTALL_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalAppInstallMobileActionToTabletConversion
		      Return "TOTAL_APP_INSTALL_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalAppInstallTabletActionToDesktopConversion
		      Return "TOTAL_APP_INSTALL_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalAppInstallTabletActionToMobileConversion
		      Return "TOTAL_APP_INSTALL_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalAppInstallTabletActionToTabletConversion
		      Return "TOTAL_APP_INSTALL_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalUnknownDesktopActionToDesktopConversion
		      Return "TOTAL_UNKNOWN_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalUnknownDesktopActionToMobileConversion
		      Return "TOTAL_UNKNOWN_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalUnknownDesktopActionToTabletConversion
		      Return "TOTAL_UNKNOWN_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalUnknownMobileActionToDesktopConversion
		      Return "TOTAL_UNKNOWN_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalUnknownMobileActionToMobileConversion
		      Return "TOTAL_UNKNOWN_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalUnknownMobileActionToTabletConversion
		      Return "TOTAL_UNKNOWN_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalUnknownTabletActionToDesktopConversion
		      Return "TOTAL_UNKNOWN_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumn.TotalUnknownTabletActionToMobileConversion
		      Return "TOTAL_UNKNOWN_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumn.TotalUnknownTabletActionToTabletConversion
		      Return "TOTAL_UNKNOWN_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumn.TotalPageVisit
		      Return "TOTAL_PAGE_VISIT"
		    Case ReportingColumn.TotalSignup
		      Return "TOTAL_SIGNUP"
		    Case ReportingColumn.TotalCheckout
		      Return "TOTAL_CHECKOUT"
		    Case ReportingColumn.TotalCustom
		      Return "TOTAL_CUSTOM"
		    Case ReportingColumn.TotalAddToCart
		      Return "TOTAL_ADD_TO_CART"
		    Case ReportingColumn.TotalLead
		      Return "TOTAL_LEAD"
		    Case ReportingColumn.TotalSearch
		      Return "TOTAL_SEARCH"
		    Case ReportingColumn.TotalWatchVideo
		      Return "TOTAL_WATCH_VIDEO"
		    Case ReportingColumn.TotalViewCategory
		      Return "TOTAL_VIEW_CATEGORY"
		    Case ReportingColumn.TotalAppInstall
		      Return "TOTAL_APP_INSTALL"
		    Case ReportingColumn.TotalUnknown
		      Return "TOTAL_UNKNOWN"
		    Case ReportingColumn.TotalAddPaymentInfo
		      Return "TOTAL_ADD_PAYMENT_INFO"
		    Case ReportingColumn.TotalAddToWishlist
		      Return "TOTAL_ADD_TO_WISHLIST"
		    Case ReportingColumn.TotalInitiateCheckout
		      Return "TOTAL_INITIATE_CHECKOUT"
		    Case ReportingColumn.TotalSubscribe
		      Return "TOTAL_SUBSCRIBE"
		    Case ReportingColumn.TotalViewContent
		      Return "TOTAL_VIEW_CONTENT"
		    Case ReportingColumn.TotalPageVisitValueInMicroDollar
		      Return "TOTAL_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalSignupValueInMicroDollar
		      Return "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalCheckoutValueInMicroDollar
		      Return "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalCustomValueInMicroDollar
		      Return "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalAddToCartValueInMicroDollar
		      Return "TOTAL_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalLeadValueInMicroDollar
		      Return "TOTAL_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalSearchValueInMicroDollar
		      Return "TOTAL_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWatchVideoValueInMicroDollar
		      Return "TOTAL_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewCategoryValueInMicroDollar
		      Return "TOTAL_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalAppInstallValueInMicroDollar
		      Return "TOTAL_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalUnknownValueInMicroDollar
		      Return "TOTAL_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalAddToWishlistValueInMicroDollar
		      Return "TOTAL_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalSubscribeValueInMicroDollar
		      Return "TOTAL_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewContentValueInMicroDollar
		      Return "TOTAL_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AveragePageVisitValueInMicroDollar
		      Return "AVERAGE_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageSignupValueInMicroDollar
		      Return "AVERAGE_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageCheckoutValueInMicroDollar
		      Return "AVERAGE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageCustomValueInMicroDollar
		      Return "AVERAGE_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageAddToCartValueInMicroDollar
		      Return "AVERAGE_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageLeadValueInMicroDollar
		      Return "AVERAGE_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageSearchValueInMicroDollar
		      Return "AVERAGE_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageWatchVideoValueInMicroDollar
		      Return "AVERAGE_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageViewCategoryValueInMicroDollar
		      Return "AVERAGE_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageUnknownValueInMicroDollar
		      Return "AVERAGE_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageAddPaymentInfoValueInMicroDollar
		      Return "AVERAGE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageAddToWishlistValueInMicroDollar
		      Return "AVERAGE_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageInitiateCheckoutValueInMicroDollar
		      Return "AVERAGE_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageSubscribeValueInMicroDollar
		      Return "AVERAGE_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageViewContentValueInMicroDollar
		      Return "AVERAGE_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AveragePageVisitValueInMicroUsDollar
		      Return "AVERAGE_PAGE_VISIT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.AverageSignupValueInMicroUsDollar
		      Return "AVERAGE_SIGNUP_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.AverageCheckoutValueInMicroUsDollar
		      Return "AVERAGE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.AverageCustomValueInMicroUsDollar
		      Return "AVERAGE_CUSTOM_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.AverageAddToCartValueInMicroUsDollar
		      Return "AVERAGE_ADD_TO_CART_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.AverageLeadValueInMicroUsDollar
		      Return "AVERAGE_LEAD_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.AverageSearchValueInMicroUsDollar
		      Return "AVERAGE_SEARCH_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.AverageWatchVideoValueInMicroUsDollar
		      Return "AVERAGE_WATCH_VIDEO_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.AverageViewCategoryValueInMicroUsDollar
		      Return "AVERAGE_VIEW_CATEGORY_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.AverageUnknownValueInMicroUsDollar
		      Return "AVERAGE_UNKNOWN_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.AverageAddPaymentInfoValueInMicroUsDollar
		      Return "AVERAGE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.AverageAddToWishlistValueInMicroUsDollar
		      Return "AVERAGE_ADD_TO_WISHLIST_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.AverageInitiateCheckoutValueInMicroUsDollar
		      Return "AVERAGE_INITIATE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.AverageSubscribeValueInMicroUsDollar
		      Return "AVERAGE_SUBSCRIBE_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.AverageViewContentValueInMicroUsDollar
		      Return "AVERAGE_VIEW_CONTENT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalPageVisitValueInMicroUsDollar
		      Return "TOTAL_PAGE_VISIT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalSignupValueInMicroUsDollar
		      Return "TOTAL_SIGNUP_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalCheckoutValueInMicroUsDollar
		      Return "TOTAL_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalCustomValueInMicroUsDollar
		      Return "TOTAL_CUSTOM_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalAddToCartValueInMicroUsDollar
		      Return "TOTAL_ADD_TO_CART_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalLeadValueInMicroUsDollar
		      Return "TOTAL_LEAD_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalSearchValueInMicroUsDollar
		      Return "TOTAL_SEARCH_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalWatchVideoValueInMicroUsDollar
		      Return "TOTAL_WATCH_VIDEO_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalViewCategoryValueInMicroUsDollar
		      Return "TOTAL_VIEW_CATEGORY_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalUnknownValueInMicroUsDollar
		      Return "TOTAL_UNKNOWN_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalAddPaymentInfoValueInMicroUsDollar
		      Return "TOTAL_ADD_PAYMENT_INFO_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalAddToWishlistValueInMicroUsDollar
		      Return "TOTAL_ADD_TO_WISHLIST_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalInitiateCheckoutValueInMicroUsDollar
		      Return "TOTAL_INITIATE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalSubscribeValueInMicroUsDollar
		      Return "TOTAL_SUBSCRIBE_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalViewContentValueInMicroUsDollar
		      Return "TOTAL_VIEW_CONTENT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalPageVisitQuantity
		      Return "TOTAL_PAGE_VISIT_QUANTITY"
		    Case ReportingColumn.TotalSignupQuantity
		      Return "TOTAL_SIGNUP_QUANTITY"
		    Case ReportingColumn.TotalCheckoutQuantity
		      Return "TOTAL_CHECKOUT_QUANTITY"
		    Case ReportingColumn.TotalCustomQuantity
		      Return "TOTAL_CUSTOM_QUANTITY"
		    Case ReportingColumn.TotalAddToCartQuantity
		      Return "TOTAL_ADD_TO_CART_QUANTITY"
		    Case ReportingColumn.TotalLeadQuantity
		      Return "TOTAL_LEAD_QUANTITY"
		    Case ReportingColumn.TotalSearchQuantity
		      Return "TOTAL_SEARCH_QUANTITY"
		    Case ReportingColumn.TotalWatchVideoQuantity
		      Return "TOTAL_WATCH_VIDEO_QUANTITY"
		    Case ReportingColumn.TotalViewCategoryQuantity
		      Return "TOTAL_VIEW_CATEGORY_QUANTITY"
		    Case ReportingColumn.TotalAppInstallQuantity
		      Return "TOTAL_APP_INSTALL_QUANTITY"
		    Case ReportingColumn.TotalUnknownQuantity
		      Return "TOTAL_UNKNOWN_QUANTITY"
		    Case ReportingColumn.TotalAddPaymentInfoQuantity
		      Return "TOTAL_ADD_PAYMENT_INFO_QUANTITY"
		    Case ReportingColumn.TotalAddToWishlistQuantity
		      Return "TOTAL_ADD_TO_WISHLIST_QUANTITY"
		    Case ReportingColumn.TotalInitiateCheckoutQuantity
		      Return "TOTAL_INITIATE_CHECKOUT_QUANTITY"
		    Case ReportingColumn.TotalSubscribeQuantity
		      Return "TOTAL_SUBSCRIBE_QUANTITY"
		    Case ReportingColumn.TotalViewContentQuantity
		      Return "TOTAL_VIEW_CONTENT_QUANTITY"
		    Case ReportingColumn.TotalPageVisitValueInDollar
		      Return "TOTAL_PAGE_VISIT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalSignupValueInDollar
		      Return "TOTAL_SIGNUP_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalCheckoutValueInDollar
		      Return "TOTAL_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalCustomValueInDollar
		      Return "TOTAL_CUSTOM_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalAddToCartValueInDollar
		      Return "TOTAL_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalLeadValueInDollar
		      Return "TOTAL_LEAD_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalSearchValueInDollar
		      Return "TOTAL_SEARCH_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWatchVideoValueInDollar
		      Return "TOTAL_WATCH_VIDEO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewCategoryValueInDollar
		      Return "TOTAL_VIEW_CATEGORY_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalAppInstallValueInDollar
		      Return "TOTAL_APP_INSTALL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalUnknownValueInDollar
		      Return "TOTAL_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalAddPaymentInfoValueInDollar
		      Return "TOTAL_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalAddToWishlistValueInDollar
		      Return "TOTAL_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInitiateCheckoutValueInDollar
		      Return "TOTAL_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalSubscribeValueInDollar
		      Return "TOTAL_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewContentValueInDollar
		      Return "TOTAL_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.PageVisitCostPerAction
		      Return "PAGE_VISIT_COST_PER_ACTION"
		    Case ReportingColumn.SignupCostPerAction
		      Return "SIGNUP_COST_PER_ACTION"
		    Case ReportingColumn.CheckoutCostPerAction
		      Return "CHECKOUT_COST_PER_ACTION"
		    Case ReportingColumn.CustomCostPerAction
		      Return "CUSTOM_COST_PER_ACTION"
		    Case ReportingColumn.AddToCartCostPerAction
		      Return "ADD_TO_CART_COST_PER_ACTION"
		    Case ReportingColumn.LeadCostPerAction
		      Return "LEAD_COST_PER_ACTION"
		    Case ReportingColumn.SearchCostPerAction
		      Return "SEARCH_COST_PER_ACTION"
		    Case ReportingColumn.WatchVideoCostPerAction
		      Return "WATCH_VIDEO_COST_PER_ACTION"
		    Case ReportingColumn.ViewCategoryCostPerAction
		      Return "VIEW_CATEGORY_COST_PER_ACTION"
		    Case ReportingColumn.AppInstallCostPerAction
		      Return "APP_INSTALL_COST_PER_ACTION"
		    Case ReportingColumn.UnknownCostPerAction
		      Return "UNKNOWN_COST_PER_ACTION"
		    Case ReportingColumn.AdGroupCpaInMicroCurrency
		      Return "AD_GROUP_CPA_IN_MICRO_CURRENCY"
		    Case ReportingColumn.AddPaymentInfoCostPerAction
		      Return "ADD_PAYMENT_INFO_COST_PER_ACTION"
		    Case ReportingColumn.AddToWishlistCostPerAction
		      Return "ADD_TO_WISHLIST_COST_PER_ACTION"
		    Case ReportingColumn.InitiateCheckoutCostPerAction
		      Return "INITIATE_CHECKOUT_COST_PER_ACTION"
		    Case ReportingColumn.SubscribeCostPerAction
		      Return "SUBSCRIBE_COST_PER_ACTION"
		    Case ReportingColumn.ViewContentCostPerAction
		      Return "VIEW_CONTENT_COST_PER_ACTION"
		    Case ReportingColumn.PageVisitCostPerActionInUsDollar
		      Return "PAGE_VISIT_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.SignupCostPerActionInUsDollar
		      Return "SIGNUP_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.CheckoutCostPerActionInUsDollar
		      Return "CHECKOUT_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.CustomCostPerActionInUsDollar
		      Return "CUSTOM_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.AddToCartCostPerActionInUsDollar
		      Return "ADD_TO_CART_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.LeadCostPerActionInUsDollar
		      Return "LEAD_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.SearchCostPerActionInUsDollar
		      Return "SEARCH_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.WatchVideoCostPerActionInUsDollar
		      Return "WATCH_VIDEO_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.ViewCategoryCostPerActionInUsDollar
		      Return "VIEW_CATEGORY_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.UnknownCostPerActionInUsDollar
		      Return "UNKNOWN_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.AddPaymentInfoCostPerActionInUsDollar
		      Return "ADD_PAYMENT_INFO_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.AddToWishlistCostPerActionInUsDollar
		      Return "ADD_TO_WISHLIST_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.InitiateCheckoutCostPerActionInUsDollar
		      Return "INITIATE_CHECKOUT_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.SubscribeCostPerActionInUsDollar
		      Return "SUBSCRIBE_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.ViewContentCostPerActionInUsDollar
		      Return "VIEW_CONTENT_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.PageVisitRoas
		      Return "PAGE_VISIT_ROAS"
		    Case ReportingColumn.SignupRoas
		      Return "SIGNUP_ROAS"
		    Case ReportingColumn.CheckoutRoas
		      Return "CHECKOUT_ROAS"
		    Case ReportingColumn.CustomRoas
		      Return "CUSTOM_ROAS"
		    Case ReportingColumn.AddToCartRoas
		      Return "ADD_TO_CART_ROAS"
		    Case ReportingColumn.LeadRoas
		      Return "LEAD_ROAS"
		    Case ReportingColumn.SearchRoas
		      Return "SEARCH_ROAS"
		    Case ReportingColumn.WatchVideoRoas
		      Return "WATCH_VIDEO_ROAS"
		    Case ReportingColumn.ViewCategoryRoas
		      Return "VIEW_CATEGORY_ROAS"
		    Case ReportingColumn.AppInstallRoas
		      Return "APP_INSTALL_ROAS"
		    Case ReportingColumn.UnknownRoas
		      Return "UNKNOWN_ROAS"
		    Case ReportingColumn.Roas
		      Return "ROAS"
		    Case ReportingColumn.ClickRoas
		      Return "CLICK_ROAS"
		    Case ReportingColumn.EngagementRoas
		      Return "ENGAGEMENT_ROAS"
		    Case ReportingColumn.ViewRoas
		      Return "VIEW_ROAS"
		    Case ReportingColumn.AddPaymentInfoRoas
		      Return "ADD_PAYMENT_INFO_ROAS"
		    Case ReportingColumn.AddToWishlistRoas
		      Return "ADD_TO_WISHLIST_ROAS"
		    Case ReportingColumn.InitiateCheckoutRoas
		      Return "INITIATE_CHECKOUT_ROAS"
		    Case ReportingColumn.SubscribeRoas
		      Return "SUBSCRIBE_ROAS"
		    Case ReportingColumn.ViewContentRoas
		      Return "VIEW_CONTENT_ROAS"
		    Case ReportingColumn.Hour
		      Return "HOUR"
		    Case ReportingColumn.BoardEngagement
		      Return "BOARD_ENGAGEMENT"
		    Case ReportingColumn.BoardInsertion
		      Return "BOARD_INSERTION"
		    Case ReportingColumn.BoardImpression
		      Return "BOARD_IMPRESSION"
		    Case ReportingColumn.BoardFollow
		      Return "BOARD_FOLLOW"
		    Case ReportingColumn.BoardSend
		      Return "BOARD_SEND"
		    Case ReportingColumn.BoardHide
		      Return "BOARD_HIDE"
		    Case ReportingColumn.ProductGroupCampaignId
		      Return "PRODUCT_GROUP_CAMPAIGN_ID"
		    Case ReportingColumn.ProductGroupCampaignName
		      Return "PRODUCT_GROUP_CAMPAIGN_NAME"
		    Case ReportingColumn.ProductGroupCampaignActionType
		      Return "PRODUCT_GROUP_CAMPAIGN_ACTION_TYPE"
		    Case ReportingColumn.ProductGroupCampaignStatus
		      Return "PRODUCT_GROUP_CAMPAIGN_STATUS"
		    Case ReportingColumn.ProductGroupCampaignManagedStatus
		      Return "PRODUCT_GROUP_CAMPAIGN_MANAGED_STATUS"
		    Case ReportingColumn.ProductGroupAdGroupId
		      Return "PRODUCT_GROUP_AD_GROUP_ID"
		    Case ReportingColumn.ProductGroupAdGroupName
		      Return "PRODUCT_GROUP_AD_GROUP_NAME"
		    Case ReportingColumn.ProductGroupAdGroupStatus
		      Return "PRODUCT_GROUP_AD_GROUP_STATUS"
		    Case ReportingColumn.ProductGroupAdImageTag
		      Return "PRODUCT_GROUP_AD_IMAGE_TAG"
		    Case ReportingColumn.ProductGroupAdVideoTag
		      Return "PRODUCT_GROUP_AD_VIDEO_TAG"
		    Case ReportingColumn.PromotedCatalogProductGroupReferenceId
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_REFERENCE_ID"
		    Case ReportingColumn.PromotedCatalogProductGroupReferenceName
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_REFERENCE_NAME"
		    Case ReportingColumn.PromotedCatalogProductGroupId
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_ID"
		    Case ReportingColumn.PromotedCatalogProductGroupBidInMicroCurrency
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_BID_IN_MICRO_CURRENCY"
		    Case ReportingColumn.PromotedCatalogProductGroupStatus
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_STATUS"
		    Case ReportingColumn.PromotedCatalogProductGroupEntityStatus
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_ENTITY_STATUS"
		    Case ReportingColumn.PromotedCatalogProductGroupCampaignId
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_ID"
		    Case ReportingColumn.PromotedCatalogProductGroupCampaignName
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_NAME"
		    Case ReportingColumn.PromotedCatalogProductGroupCampaignActionType
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_ACTION_TYPE"
		    Case ReportingColumn.PromotedCatalogProductGroupCampaignStatus
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_STATUS"
		    Case ReportingColumn.PromotedCatalogProductGroupCampaignManagedStatus
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_MANAGED_STATUS"
		    Case ReportingColumn.PromotedCatalogProductGroupAdGroupId
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_ID"
		    Case ReportingColumn.PromotedCatalogProductGroupAdGroupName
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_NAME"
		    Case ReportingColumn.PromotedCatalogProductGroupAdGroupStatus
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_STATUS"
		    Case ReportingColumn.PromotedCatalogProductGroupTrackingTemplateUrl
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_TRACKING_TEMPLATE_URL"
		    Case ReportingColumn.PromotedCatalogProductGroupSelectedImageTag
		      Return "PROMOTED_CATALOG_PRODUCT_GROUP_SELECTED_IMAGE_TAG"
		    Case ReportingColumn.Video3secViews1
		      Return "VIDEO_3SEC_VIEWS_1"
		    Case ReportingColumn.Video15secUniqueViews1
		      Return "VIDEO_15SEC_UNIQUE_VIEWS_1"
		    Case ReportingColumn.VideoP0Complete1
		      Return "VIDEO_P0_COMPLETE_1"
		    Case ReportingColumn.VideoP25Complete1
		      Return "VIDEO_P25_COMPLETE_1"
		    Case ReportingColumn.VideoP50Complete1
		      Return "VIDEO_P50_COMPLETE_1"
		    Case ReportingColumn.VideoP75Complete1
		      Return "VIDEO_P75_COMPLETE_1"
		    Case ReportingColumn.VideoP95Complete1
		      Return "VIDEO_P95_COMPLETE_1"
		    Case ReportingColumn.VideoP97Complete1
		      Return "VIDEO_P97_COMPLETE_1"
		    Case ReportingColumn.VideoP100Complete1
		      Return "VIDEO_P100_COMPLETE_1"
		    Case ReportingColumn.VideoP0Combined1
		      Return "VIDEO_P0_COMBINED_1"
		    Case ReportingColumn.VideoP25Combined1
		      Return "VIDEO_P25_COMBINED_1"
		    Case ReportingColumn.VideoP50Combined1
		      Return "VIDEO_P50_COMBINED_1"
		    Case ReportingColumn.VideoP75Combined1
		      Return "VIDEO_P75_COMBINED_1"
		    Case ReportingColumn.VideoP95Combined1
		      Return "VIDEO_P95_COMBINED_1"
		    Case ReportingColumn.VideoP97Combined1
		      Return "VIDEO_P97_COMBINED_1"
		    Case ReportingColumn.VideoP100Combined1
		      Return "VIDEO_P100_COMBINED_1"
		    Case ReportingColumn.VideoStartsPaid
		      Return "VIDEO_STARTS_PAID"
		    Case ReportingColumn.VideoStartsEarned
		      Return "VIDEO_STARTS_EARNED"
		    Case ReportingColumn.TotalVideoStarts
		      Return "TOTAL_VIDEO_STARTS"
		    Case ReportingColumn.VideoAvgWatchtime1
		      Return "VIDEO_AVG_WATCHTIME_1"
		    Case ReportingColumn.VideoMrcViews1
		      Return "VIDEO_MRC_VIEWS_1"
		    Case ReportingColumn.VideoViewRate1
		      Return "VIDEO_VIEW_RATE_1"
		    Case ReportingColumn.Video3secViews2
		      Return "VIDEO_3SEC_VIEWS_2"
		    Case ReportingColumn.Video15secUniqueViews2
		      Return "VIDEO_15SEC_UNIQUE_VIEWS_2"
		    Case ReportingColumn.VideoP0Complete2
		      Return "VIDEO_P0_COMPLETE_2"
		    Case ReportingColumn.VideoP25Complete2
		      Return "VIDEO_P25_COMPLETE_2"
		    Case ReportingColumn.VideoP50Complete2
		      Return "VIDEO_P50_COMPLETE_2"
		    Case ReportingColumn.VideoP75Complete2
		      Return "VIDEO_P75_COMPLETE_2"
		    Case ReportingColumn.VideoP95Complete2
		      Return "VIDEO_P95_COMPLETE_2"
		    Case ReportingColumn.VideoP97Complete2
		      Return "VIDEO_P97_COMPLETE_2"
		    Case ReportingColumn.VideoP100Complete2
		      Return "VIDEO_P100_COMPLETE_2"
		    Case ReportingColumn.VideoP0Combined2
		      Return "VIDEO_P0_COMBINED_2"
		    Case ReportingColumn.VideoP25Combined2
		      Return "VIDEO_P25_COMBINED_2"
		    Case ReportingColumn.VideoP50Combined2
		      Return "VIDEO_P50_COMBINED_2"
		    Case ReportingColumn.VideoP75Combined2
		      Return "VIDEO_P75_COMBINED_2"
		    Case ReportingColumn.VideoP95Combined2
		      Return "VIDEO_P95_COMBINED_2"
		    Case ReportingColumn.VideoP97Combined2
		      Return "VIDEO_P97_COMBINED_2"
		    Case ReportingColumn.VideoP100Combined2
		      Return "VIDEO_P100_COMBINED_2"
		    Case ReportingColumn.VideoAvgWatchtime2
		      Return "VIDEO_AVG_WATCHTIME_2"
		    Case ReportingColumn.VideoMrcViews2
		      Return "VIDEO_MRC_VIEWS_2"
		    Case ReportingColumn.VideoViewRate2
		      Return "VIDEO_VIEW_RATE_2"
		    Case ReportingColumn.PaidVideoView
		      Return "PAID_VIDEO_VIEW"
		    Case ReportingColumn.PaidVideoImpression
		      Return "PAID_VIDEO_IMPRESSION"
		    Case ReportingColumn.PaidVideoViewableRate
		      Return "PAID_VIDEO_VIEWABLE_RATE"
		    Case ReportingColumn.VideoLength
		      Return "VIDEO_LENGTH"
		    Case ReportingColumn.VideoSpendInMicroDollar
		      Return "VIDEO_SPEND_IN_MICRO_DOLLAR"
		    Case ReportingColumn.VideoSpendInDollar
		      Return "VIDEO_SPEND_IN_DOLLAR"
		    Case ReportingColumn.CpvInMicroDollar
		      Return "CPV_IN_MICRO_DOLLAR"
		    Case ReportingColumn.CpvInDollar
		      Return "CPV_IN_DOLLAR"
		    Case ReportingColumn.Cp3svInMicroDollar
		      Return "CP3SV_IN_MICRO_DOLLAR"
		    Case ReportingColumn.Cp3svInDollar
		      Return "CP3SV_IN_DOLLAR"
		    Case ReportingColumn.EcpvInMicroDollar
		      Return "ECPV_IN_MICRO_DOLLAR"
		    Case ReportingColumn.EcpvInDollar
		      Return "ECPV_IN_DOLLAR"
		    Case ReportingColumn.Ecp3svInMicroDollar
		      Return "ECP3SV_IN_MICRO_DOLLAR"
		    Case ReportingColumn.Ecp3svInDollar
		      Return "ECP3SV_IN_DOLLAR"
		    Case ReportingColumn.CpcvInDollar
		      Return "CPCV_IN_DOLLAR"
		    Case ReportingColumn.CpcvInMicroDollar
		      Return "CPCV_IN_MICRO_DOLLAR"
		    Case ReportingColumn.EcpcvInDollar
		      Return "ECPCV_IN_DOLLAR"
		    Case ReportingColumn.EcpcvInMicroDollar
		      Return "ECPCV_IN_MICRO_DOLLAR"
		    Case ReportingColumn.CpcvP95InDollar
		      Return "CPCV_P95_IN_DOLLAR"
		    Case ReportingColumn.CpcvP95InMicroDollar
		      Return "CPCV_P95_IN_MICRO_DOLLAR"
		    Case ReportingColumn.EcpcvP95InDollar
		      Return "ECPCV_P95_IN_DOLLAR"
		    Case ReportingColumn.EcpcvP95InMicroDollar
		      Return "ECPCV_P95_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalVideo3secViews
		      Return "TOTAL_VIDEO_3SEC_VIEWS"
		    Case ReportingColumn.TotalVideo15secUniqueViews
		      Return "TOTAL_VIDEO_15SEC_UNIQUE_VIEWS"
		    Case ReportingColumn.TotalVideoP0Complete
		      Return "TOTAL_VIDEO_P0_COMPLETE"
		    Case ReportingColumn.TotalVideoP25Complete
		      Return "TOTAL_VIDEO_P25_COMPLETE"
		    Case ReportingColumn.TotalVideoP50Complete
		      Return "TOTAL_VIDEO_P50_COMPLETE"
		    Case ReportingColumn.TotalVideoP75Complete
		      Return "TOTAL_VIDEO_P75_COMPLETE"
		    Case ReportingColumn.TotalVideoP95Complete
		      Return "TOTAL_VIDEO_P95_COMPLETE"
		    Case ReportingColumn.TotalVideoP97Complete
		      Return "TOTAL_VIDEO_P97_COMPLETE"
		    Case ReportingColumn.TotalVideoP100Complete
		      Return "TOTAL_VIDEO_P100_COMPLETE"
		    Case ReportingColumn.TotalVideoP0Combined
		      Return "TOTAL_VIDEO_P0_COMBINED"
		    Case ReportingColumn.TotalVideoP25Combined
		      Return "TOTAL_VIDEO_P25_COMBINED"
		    Case ReportingColumn.TotalVideoP50Combined
		      Return "TOTAL_VIDEO_P50_COMBINED"
		    Case ReportingColumn.TotalVideoP75Combined
		      Return "TOTAL_VIDEO_P75_COMBINED"
		    Case ReportingColumn.TotalVideoP95Combined
		      Return "TOTAL_VIDEO_P95_COMBINED"
		    Case ReportingColumn.TotalVideoP97Combined
		      Return "TOTAL_VIDEO_P97_COMBINED"
		    Case ReportingColumn.TotalVideoP100Combined
		      Return "TOTAL_VIDEO_P100_COMBINED"
		    Case ReportingColumn.TotalVideoAvgWatchtime
		      Return "TOTAL_VIDEO_AVG_WATCHTIME"
		    Case ReportingColumn.TotalVideoMrcViews
		      Return "TOTAL_VIDEO_MRC_VIEWS"
		    Case ReportingColumn.TotalVideoViewRate
		      Return "TOTAL_VIDEO_VIEW_RATE"
		    Case ReportingColumn.VideoV50Watchtime1
		      Return "VIDEO_V50_WATCHTIME_1"
		    Case ReportingColumn.VideoV50Watchtime2
		      Return "VIDEO_V50_WATCHTIME_2"
		    Case ReportingColumn.TotalVideoV50Watchtime
		      Return "TOTAL_VIDEO_V50_WATCHTIME"
		    Case ReportingColumn.VideoSumV50WatchtimeInMillisecond1
		      Return "VIDEO_SUM_V50_WATCHTIME_IN_MILLISECOND_1"
		    Case ReportingColumn.VideoSumV50WatchtimeInMillisecond2
		      Return "VIDEO_SUM_V50_WATCHTIME_IN_MILLISECOND_2"
		    Case ReportingColumn.TotalVideoSumV50WatchtimeInMillisecond
		      Return "TOTAL_VIDEO_SUM_V50_WATCHTIME_IN_MILLISECOND"
		    Case ReportingColumn.VideoSumV50WatchtimeInSecond1
		      Return "VIDEO_SUM_V50_WATCHTIME_IN_SECOND_1"
		    Case ReportingColumn.VideoSumV50WatchtimeInSecond2
		      Return "VIDEO_SUM_V50_WATCHTIME_IN_SECOND_2"
		    Case ReportingColumn.TotalVideoSumV50WatchtimeInSecond
		      Return "TOTAL_VIDEO_SUM_V50_WATCHTIME_IN_SECOND"
		    Case ReportingColumn.VideoAvgWatchtimeInMillisecond1
		      Return "VIDEO_AVG_WATCHTIME_IN_MILLISECOND_1"
		    Case ReportingColumn.VideoAvgWatchtimeInMillisecond2
		      Return "VIDEO_AVG_WATCHTIME_IN_MILLISECOND_2"
		    Case ReportingColumn.TotalVideoAvgWatchtimeInMillisecond
		      Return "TOTAL_VIDEO_AVG_WATCHTIME_IN_MILLISECOND"
		    Case ReportingColumn.VideoAvgWatchtimeInSecond1
		      Return "VIDEO_AVG_WATCHTIME_IN_SECOND_1"
		    Case ReportingColumn.VideoAvgWatchtimeInSecond2
		      Return "VIDEO_AVG_WATCHTIME_IN_SECOND_2"
		    Case ReportingColumn.TotalVideoAvgWatchtimeInSecond
		      Return "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND"
		    Case ReportingColumn.VideoAvgWatchtimeInSecondVideoStartsPaid
		      Return "VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS_PAID"
		    Case ReportingColumn.VideoAvgWatchtimeInSecondVideoStartsEarned
		      Return "VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS_EARNED"
		    Case ReportingColumn.TotalVideoAvgWatchtimeInSecondVideoStarts
		      Return "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS"
		    Case ReportingColumn.DeliveryStatusNoFanout
		      Return "DELIVERY_STATUS_NO_FANOUT"
		    Case ReportingColumn.DeliveryStatusWithFanout
		      Return "DELIVERY_STATUS_WITH_FANOUT"
		    Case ReportingColumn.KeywordCompetitionBand
		      Return "KEYWORD_COMPETITION_BAND"
		    Case ReportingColumn.KeywordQueryVolume
		      Return "KEYWORD_QUERY_VOLUME"
		    Case ReportingColumn.KeywordValue
		      Return "KEYWORD_VALUE"
		    Case ReportingColumn.KeywordMatchType
		      Return "KEYWORD_MATCH_TYPE"
		    Case ReportingColumn.KeywordBidInMicroCurrency
		      Return "KEYWORD_BID_IN_MICRO_CURRENCY"
		    Case ReportingColumn.KeywordUserQuery
		      Return "KEYWORD_USER_QUERY"
		    Case ReportingColumn.KeywordSqrKeywordValue
		      Return "KEYWORD_SQR_KEYWORD_VALUE"
		    Case ReportingColumn.KeywordAdGroupId
		      Return "KEYWORD_AD_GROUP_ID"
		    Case ReportingColumn.KeywordAdGroupName
		      Return "KEYWORD_AD_GROUP_NAME"
		    Case ReportingColumn.KeywordCampaignId
		      Return "KEYWORD_CAMPAIGN_ID"
		    Case ReportingColumn.KeywordCampaignName
		      Return "KEYWORD_CAMPAIGN_NAME"
		    Case ReportingColumn.KeywordSearchTermAdGroupId
		      Return "KEYWORD_SEARCH_TERM_AD_GROUP_ID"
		    Case ReportingColumn.KeywordSearchTermAdGroupName
		      Return "KEYWORD_SEARCH_TERM_AD_GROUP_NAME"
		    Case ReportingColumn.KeywordSearchTermCampaignId
		      Return "KEYWORD_SEARCH_TERM_CAMPAIGN_ID"
		    Case ReportingColumn.KeywordSearchTermCampaignName
		      Return "KEYWORD_SEARCH_TERM_CAMPAIGN_NAME"
		    Case ReportingColumn.NegativeKeywordAdGroupId
		      Return "NEGATIVE_KEYWORD_AD_GROUP_ID"
		    Case ReportingColumn.NegativeKeywordAdGroupName
		      Return "NEGATIVE_KEYWORD_AD_GROUP_NAME"
		    Case ReportingColumn.NegativeKeywordCampaignId
		      Return "NEGATIVE_KEYWORD_CAMPAIGN_ID"
		    Case ReportingColumn.NegativeKeywordCampaignName
		      Return "NEGATIVE_KEYWORD_CAMPAIGN_NAME"
		    Case ReportingColumn.OneTapV2WebsiteView1
		      Return "ONE_TAP_V2_WEBSITE_VIEW_1"
		    Case ReportingColumn.OneTapV2WebsiteView2
		      Return "ONE_TAP_V2_WEBSITE_VIEW_2"
		    Case ReportingColumn.TotalOneTapV2WebsiteView
		      Return "TOTAL_ONE_TAP_V2_WEBSITE_VIEW"
		    Case ReportingColumn.OneTapV2WebsiteViewUser1
		      Return "ONE_TAP_V2_WEBSITE_VIEW_USER_1"
		    Case ReportingColumn.OneTapV2WebsiteViewUser2
		      Return "ONE_TAP_V2_WEBSITE_VIEW_USER_2"
		    Case ReportingColumn.TotalLandingPageViews
		      Return "TOTAL_LANDING_PAGE_VIEWS"
		    Case ReportingColumn.LandingPageViews1
		      Return "LANDING_PAGE_VIEWS_1"
		    Case ReportingColumn.LandingPageViews2
		      Return "LANDING_PAGE_VIEWS_2"
		    Case ReportingColumn.CostPerLandingPageView
		      Return "COST_PER_LANDING_PAGE_VIEW"
		    Case ReportingColumn.LandingPageViewRate
		      Return "LANDING_PAGE_VIEW_RATE"
		    Case ReportingColumn.TotalDestinationViews
		      Return "TOTAL_DESTINATION_VIEWS"
		    Case ReportingColumn.DestinationViews1
		      Return "DESTINATION_VIEWS_1"
		    Case ReportingColumn.DestinationViews2
		      Return "DESTINATION_VIEWS_2"
		    Case ReportingColumn.CostPerDestinationViewInDollar
		      Return "COST_PER_DESTINATION_VIEW_IN_DOLLAR"
		    Case ReportingColumn.CostPerDestinationViewInMicroDollar
		      Return "COST_PER_DESTINATION_VIEW_IN_MICRO_DOLLAR"
		    Case ReportingColumn.DestinationViewRate
		      Return "DESTINATION_VIEW_RATE"
		    Case ReportingColumn.CarouselSlotIndex
		      Return "CAROUSEL_SLOT_INDEX"
		    Case ReportingColumn.CarouselId
		      Return "CAROUSEL_ID"
		    Case ReportingColumn.CarouselSlotPromotionId
		      Return "CAROUSEL_SLOT_PROMOTION_ID"
		    Case ReportingColumn.CarouselSlotImpression1
		      Return "CAROUSEL_SLOT_IMPRESSION_1"
		    Case ReportingColumn.CarouselSlotImpression2
		      Return "CAROUSEL_SLOT_IMPRESSION_2"
		    Case ReportingColumn.TotalCarouselSlotImpression
		      Return "TOTAL_CAROUSEL_SLOT_IMPRESSION"
		    Case ReportingColumn.CarouselSlotImpressionUser1
		      Return "CAROUSEL_SLOT_IMPRESSION_USER_1"
		    Case ReportingColumn.CarouselSlotImpressionUser2
		      Return "CAROUSEL_SLOT_IMPRESSION_USER_2"
		    Case ReportingColumn.CarouselSlotClickthrough1
		      Return "CAROUSEL_SLOT_CLICKTHROUGH_1"
		    Case ReportingColumn.CarouselSlotClickthrough2
		      Return "CAROUSEL_SLOT_CLICKTHROUGH_2"
		    Case ReportingColumn.TotalCarouselSlotClickthrough
		      Return "TOTAL_CAROUSEL_SLOT_CLICKTHROUGH"
		    Case ReportingColumn.CarouselSlotClickthroughUser1
		      Return "CAROUSEL_SLOT_CLICKTHROUGH_USER_1"
		    Case ReportingColumn.CarouselSlotClickthroughUser2
		      Return "CAROUSEL_SLOT_CLICKTHROUGH_USER_2"
		    Case ReportingColumn.CarouselSlotSideswipe1
		      Return "CAROUSEL_SLOT_SIDESWIPE_1"
		    Case ReportingColumn.CarouselSlotSideswipe2
		      Return "CAROUSEL_SLOT_SIDESWIPE_2"
		    Case ReportingColumn.TotalCarouselSlotSideswipe
		      Return "TOTAL_CAROUSEL_SLOT_SIDESWIPE"
		    Case ReportingColumn.CarouselSlotSideswipeUser1
		      Return "CAROUSEL_SLOT_SIDESWIPE_USER_1"
		    Case ReportingColumn.CarouselSlotSideswipeUser2
		      Return "CAROUSEL_SLOT_SIDESWIPE_USER_2"
		    Case ReportingColumn.CarouselSlotViewWebsite1
		      Return "CAROUSEL_SLOT_VIEW_WEBSITE_1"
		    Case ReportingColumn.CarouselSlotViewWebsite2
		      Return "CAROUSEL_SLOT_VIEW_WEBSITE_2"
		    Case ReportingColumn.TotalCarouselSlotViewWebsite
		      Return "TOTAL_CAROUSEL_SLOT_VIEW_WEBSITE"
		    Case ReportingColumn.CarouselSlotViewWebsiteUser1
		      Return "CAROUSEL_SLOT_VIEW_WEBSITE_USER_1"
		    Case ReportingColumn.CarouselSlotViewWebsiteUser2
		      Return "CAROUSEL_SLOT_VIEW_WEBSITE_USER_2"
		    Case ReportingColumn.CollectionPinItemImpression1
		      Return "COLLECTION_PIN_ITEM_IMPRESSION_1"
		    Case ReportingColumn.CollectionPinItemImpression2
		      Return "COLLECTION_PIN_ITEM_IMPRESSION_2"
		    Case ReportingColumn.TotalCollectionPinItemImpression
		      Return "TOTAL_COLLECTION_PIN_ITEM_IMPRESSION"
		    Case ReportingColumn.CollectionPinItemClickthrough1
		      Return "COLLECTION_PIN_ITEM_CLICKTHROUGH_1"
		    Case ReportingColumn.CollectionPinItemClickthrough2
		      Return "COLLECTION_PIN_ITEM_CLICKTHROUGH_2"
		    Case ReportingColumn.TotalCollectionPinItemClickthrough
		      Return "TOTAL_COLLECTION_PIN_ITEM_CLICKTHROUGH"
		    Case ReportingColumn.HoldoutExperiment
		      Return "HOLDOUT_EXPERIMENT"
		    Case ReportingColumn.AdGroupHoldoutExperiment
		      Return "AD_GROUP_HOLDOUT_EXPERIMENT"
		    Case ReportingColumn.PinPromotionHoldoutExperiment
		      Return "PIN_PROMOTION_HOLDOUT_EXPERIMENT"
		    Case ReportingColumn.ProductGroupHoldoutExperiment
		      Return "PRODUCT_GROUP_HOLDOUT_EXPERIMENT"
		    Case ReportingColumn.MultiObjectiveResult
		      Return "MULTI_OBJECTIVE_RESULT"
		    Case ReportingColumn.MultiObjectiveCost
		      Return "MULTI_OBJECTIVE_COST"
		    Case ReportingColumn.MultiObjectiveResultDescription
		      Return "MULTI_OBJECTIVE_RESULT_DESCRIPTION"
		    Case ReportingColumn.MultiObjectiveCostDescription
		      Return "MULTI_OBJECTIVE_COST_DESCRIPTION"
		    Case ReportingColumn.DateRange
		      Return "DATE_RANGE"
		    Case ReportingColumn.DateRangeStart
		      Return "DATE_RANGE_START"
		    Case ReportingColumn.DateRangeEnd
		      Return "DATE_RANGE_END"
		    Case ReportingColumn.ReportDateStart
		      Return "REPORT_DATE_START"
		    Case ReportingColumn.ReportDateEnd
		      Return "REPORT_DATE_END"
		    Case ReportingColumn.PinnerListName
		      Return "PINNER_LIST_NAME"
		    Case ReportingColumn.PinnerListType
		      Return "PINNER_LIST_TYPE"
		    Case ReportingColumn.OrderValue
		      Return "ORDER_VALUE"
		    Case ReportingColumn.OrderQuantity
		      Return "ORDER_QUANTITY"
		    Case ReportingColumn.AdvertiserName
		      Return "ADVERTISER_NAME"
		    Case ReportingColumn.AdvertiserCurrency
		      Return "ADVERTISER_CURRENCY"
		    Case ReportingColumn.TotalRepinRate
		      Return "TOTAL_REPIN_RATE"
		    Case ReportingColumn.SpendYesterdayInDollar
		      Return "SPEND_YESTERDAY_IN_DOLLAR"
		    Case ReportingColumn.PinPromotionRejectionLabels
		      Return "PIN_PROMOTION_REJECTION_LABELS"
		    Case ReportingColumn.PinPromotionDestinationUrl
		      Return "PIN_PROMOTION_DESTINATION_URL"
		    Case ReportingColumn.VideoCompletionRate
		      Return "VIDEO_COMPLETION_RATE"
		    Case ReportingColumn.CampaignBookingReference
		      Return "CAMPAIGN_BOOKING_REFERENCE"
		    Case ReportingColumn.WebCheckoutCostPerAction
		      Return "WEB_CHECKOUT_COST_PER_ACTION"
		    Case ReportingColumn.WebCheckoutRoas
		      Return "WEB_CHECKOUT_ROAS"
		    Case ReportingColumn.TotalWebCheckout
		      Return "TOTAL_WEB_CHECKOUT"
		    Case ReportingColumn.TotalWebCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebCheckoutValueInDollar
		      Return "TOTAL_WEB_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickCheckout
		      Return "TOTAL_WEB_CLICK_CHECKOUT"
		    Case ReportingColumn.TotalWebClickCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickCheckoutValueInDollar
		      Return "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementCheckout
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT"
		    Case ReportingColumn.TotalWebEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementCheckoutValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewCheckout
		      Return "TOTAL_WEB_VIEW_CHECKOUT"
		    Case ReportingColumn.TotalWebViewCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewCheckoutValueInDollar
		      Return "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.InappCheckoutCostPerAction
		      Return "INAPP_CHECKOUT_COST_PER_ACTION"
		    Case ReportingColumn.InappCheckoutRoas
		      Return "INAPP_CHECKOUT_ROAS"
		    Case ReportingColumn.TotalInappCheckout
		      Return "TOTAL_INAPP_CHECKOUT"
		    Case ReportingColumn.TotalInappCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappCheckoutValueInDollar
		      Return "TOTAL_INAPP_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappClickCheckout
		      Return "TOTAL_INAPP_CLICK_CHECKOUT"
		    Case ReportingColumn.TotalInappClickCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappClickCheckoutValueInDollar
		      Return "TOTAL_INAPP_CLICK_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementCheckout
		      Return "TOTAL_INAPP_ENGAGEMENT_CHECKOUT"
		    Case ReportingColumn.TotalInappEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementCheckoutValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappViewCheckout
		      Return "TOTAL_INAPP_VIEW_CHECKOUT"
		    Case ReportingColumn.TotalInappViewCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappViewCheckoutValueInDollar
		      Return "TOTAL_INAPP_VIEW_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.OfflineCheckoutCostPerAction
		      Return "OFFLINE_CHECKOUT_COST_PER_ACTION"
		    Case ReportingColumn.OfflineCheckoutRoas
		      Return "OFFLINE_CHECKOUT_ROAS"
		    Case ReportingColumn.TotalOfflineCheckout
		      Return "TOTAL_OFFLINE_CHECKOUT"
		    Case ReportingColumn.TotalOfflineCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineCheckoutValueInDollar
		      Return "TOTAL_OFFLINE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickCheckout
		      Return "TOTAL_OFFLINE_CLICK_CHECKOUT"
		    Case ReportingColumn.TotalOfflineClickCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickCheckoutValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementCheckout
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT"
		    Case ReportingColumn.TotalOfflineEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementCheckoutValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewCheckout
		      Return "TOTAL_OFFLINE_VIEW_CHECKOUT"
		    Case ReportingColumn.TotalOfflineViewCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewCheckoutValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.PinterestCheckoutCostPerAction
		      Return "PINTEREST_CHECKOUT_COST_PER_ACTION"
		    Case ReportingColumn.PinterestCheckoutRoas
		      Return "PINTEREST_CHECKOUT_ROAS"
		    Case ReportingColumn.TotalPinterestCheckout
		      Return "TOTAL_PINTEREST_CHECKOUT"
		    Case ReportingColumn.TotalPinterestCheckoutValueInMicroDollar
		      Return "TOTAL_PINTEREST_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalPinterestCheckoutValueInDollar
		      Return "TOTAL_PINTEREST_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.WebAddToCartCostPerAction
		      Return "WEB_ADD_TO_CART_COST_PER_ACTION"
		    Case ReportingColumn.WebAddToCartRoas
		      Return "WEB_ADD_TO_CART_ROAS"
		    Case ReportingColumn.TotalWebAddToCart
		      Return "TOTAL_WEB_ADD_TO_CART"
		    Case ReportingColumn.TotalWebAddToCartValueInMicroDollar
		      Return "TOTAL_WEB_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebAddToCartValueInDollar
		      Return "TOTAL_WEB_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickAddToCart
		      Return "TOTAL_WEB_CLICK_ADD_TO_CART"
		    Case ReportingColumn.TotalWebClickAddToCartValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickAddToCartValueInDollar
		      Return "TOTAL_WEB_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementAddToCart
		      Return "TOTAL_WEB_ENGAGEMENT_ADD_TO_CART"
		    Case ReportingColumn.TotalWebEngagementAddToCartValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewAddToCart
		      Return "TOTAL_WEB_VIEW_ADD_TO_CART"
		    Case ReportingColumn.TotalWebViewAddToCartValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewAddToCartValueInDollar
		      Return "TOTAL_WEB_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ReportingColumn.InappAddToCartCostPerAction
		      Return "INAPP_ADD_TO_CART_COST_PER_ACTION"
		    Case ReportingColumn.InappAddToCartRoas
		      Return "INAPP_ADD_TO_CART_ROAS"
		    Case ReportingColumn.TotalInappAddToCart
		      Return "TOTAL_INAPP_ADD_TO_CART"
		    Case ReportingColumn.TotalInappAddToCartValueInMicroDollar
		      Return "TOTAL_INAPP_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappAddToCartValueInDollar
		      Return "TOTAL_INAPP_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappClickAddToCart
		      Return "TOTAL_INAPP_CLICK_ADD_TO_CART"
		    Case ReportingColumn.TotalInappClickAddToCartValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappClickAddToCartValueInDollar
		      Return "TOTAL_INAPP_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementAddToCart
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART"
		    Case ReportingColumn.TotalInappEngagementAddToCartValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementAddToCartValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappViewAddToCart
		      Return "TOTAL_INAPP_VIEW_ADD_TO_CART"
		    Case ReportingColumn.TotalInappViewAddToCartValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappViewAddToCartValueInDollar
		      Return "TOTAL_INAPP_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR"
		    Case ReportingColumn.WebPageVisitCostPerAction
		      Return "WEB_PAGE_VISIT_COST_PER_ACTION"
		    Case ReportingColumn.WebPageVisitRoas
		      Return "WEB_PAGE_VISIT_ROAS"
		    Case ReportingColumn.TotalWebPageVisit
		      Return "TOTAL_WEB_PAGE_VISIT"
		    Case ReportingColumn.TotalWebPageVisitValueInMicroDollar
		      Return "TOTAL_WEB_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebPageVisitValueInDollar
		      Return "TOTAL_WEB_PAGE_VISIT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickPageVisit
		      Return "TOTAL_WEB_CLICK_PAGE_VISIT"
		    Case ReportingColumn.TotalWebClickPageVisitValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickPageVisitValueInDollar
		      Return "TOTAL_WEB_CLICK_PAGE_VISIT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementPageVisit
		      Return "TOTAL_WEB_ENGAGEMENT_PAGE_VISIT"
		    Case ReportingColumn.TotalWebEngagementPageVisitValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementPageVisitValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_PAGE_VISIT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewPageVisit
		      Return "TOTAL_WEB_VIEW_PAGE_VISIT"
		    Case ReportingColumn.TotalWebViewPageVisitValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewPageVisitValueInDollar
		      Return "TOTAL_WEB_VIEW_PAGE_VISIT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.WebSignupCostPerAction
		      Return "WEB_SIGNUP_COST_PER_ACTION"
		    Case ReportingColumn.WebSignupRoas
		      Return "WEB_SIGNUP_ROAS"
		    Case ReportingColumn.TotalWebSignup
		      Return "TOTAL_WEB_SIGNUP"
		    Case ReportingColumn.TotalWebSignupValueInMicroDollar
		      Return "TOTAL_WEB_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebSignupValueInDollar
		      Return "TOTAL_WEB_SIGNUP_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickSignup
		      Return "TOTAL_WEB_CLICK_SIGNUP"
		    Case ReportingColumn.TotalWebClickSignupValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickSignupValueInDollar
		      Return "TOTAL_WEB_CLICK_SIGNUP_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementSignup
		      Return "TOTAL_WEB_ENGAGEMENT_SIGNUP"
		    Case ReportingColumn.TotalWebEngagementSignupValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementSignupValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewSignup
		      Return "TOTAL_WEB_VIEW_SIGNUP"
		    Case ReportingColumn.TotalWebViewSignupValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewSignupValueInDollar
		      Return "TOTAL_WEB_VIEW_SIGNUP_VALUE_IN_DOLLAR"
		    Case ReportingColumn.InappSignupCostPerAction
		      Return "INAPP_SIGNUP_COST_PER_ACTION"
		    Case ReportingColumn.InappSignupRoas
		      Return "INAPP_SIGNUP_ROAS"
		    Case ReportingColumn.TotalInappSignup
		      Return "TOTAL_INAPP_SIGNUP"
		    Case ReportingColumn.TotalInappSignupValueInMicroDollar
		      Return "TOTAL_INAPP_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappSignupValueInDollar
		      Return "TOTAL_INAPP_SIGNUP_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappClickSignup
		      Return "TOTAL_INAPP_CLICK_SIGNUP"
		    Case ReportingColumn.TotalInappClickSignupValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappClickSignupValueInDollar
		      Return "TOTAL_INAPP_CLICK_SIGNUP_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementSignup
		      Return "TOTAL_INAPP_ENGAGEMENT_SIGNUP"
		    Case ReportingColumn.TotalInappEngagementSignupValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementSignupValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappViewSignup
		      Return "TOTAL_INAPP_VIEW_SIGNUP"
		    Case ReportingColumn.TotalInappViewSignupValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappViewSignupValueInDollar
		      Return "TOTAL_INAPP_VIEW_SIGNUP_VALUE_IN_DOLLAR"
		    Case ReportingColumn.OfflineSignupCostPerAction
		      Return "OFFLINE_SIGNUP_COST_PER_ACTION"
		    Case ReportingColumn.OfflineSignupRoas
		      Return "OFFLINE_SIGNUP_ROAS"
		    Case ReportingColumn.TotalOfflineSignup
		      Return "TOTAL_OFFLINE_SIGNUP"
		    Case ReportingColumn.TotalOfflineSignupValueInMicroDollar
		      Return "TOTAL_OFFLINE_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineSignupValueInDollar
		      Return "TOTAL_OFFLINE_SIGNUP_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickSignup
		      Return "TOTAL_OFFLINE_CLICK_SIGNUP"
		    Case ReportingColumn.TotalOfflineClickSignupValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickSignupValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_SIGNUP_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementSignup
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SIGNUP"
		    Case ReportingColumn.TotalOfflineEngagementSignupValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementSignupValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewSignup
		      Return "TOTAL_OFFLINE_VIEW_SIGNUP"
		    Case ReportingColumn.TotalOfflineViewSignupValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewSignupValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_SIGNUP_VALUE_IN_DOLLAR"
		    Case ReportingColumn.WebWatchVideoCostPerAction
		      Return "WEB_WATCH_VIDEO_COST_PER_ACTION"
		    Case ReportingColumn.WebWatchVideoRoas
		      Return "WEB_WATCH_VIDEO_ROAS"
		    Case ReportingColumn.TotalWebWatchVideo
		      Return "TOTAL_WEB_WATCH_VIDEO"
		    Case ReportingColumn.TotalWebWatchVideoValueInMicroDollar
		      Return "TOTAL_WEB_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebWatchVideoValueInDollar
		      Return "TOTAL_WEB_WATCH_VIDEO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickWatchVideo
		      Return "TOTAL_WEB_CLICK_WATCH_VIDEO"
		    Case ReportingColumn.TotalWebClickWatchVideoValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickWatchVideoValueInDollar
		      Return "TOTAL_WEB_CLICK_WATCH_VIDEO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementWatchVideo
		      Return "TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO"
		    Case ReportingColumn.TotalWebEngagementWatchVideoValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementWatchVideoValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewWatchVideo
		      Return "TOTAL_WEB_VIEW_WATCH_VIDEO"
		    Case ReportingColumn.TotalWebViewWatchVideoValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewWatchVideoValueInDollar
		      Return "TOTAL_WEB_VIEW_WATCH_VIDEO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.WebLeadCostPerAction
		      Return "WEB_LEAD_COST_PER_ACTION"
		    Case ReportingColumn.WebLeadRoas
		      Return "WEB_LEAD_ROAS"
		    Case ReportingColumn.TotalWebLead
		      Return "TOTAL_WEB_LEAD"
		    Case ReportingColumn.TotalWebLeadValueInMicroDollar
		      Return "TOTAL_WEB_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebLeadValueInDollar
		      Return "TOTAL_WEB_LEAD_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickLead
		      Return "TOTAL_WEB_CLICK_LEAD"
		    Case ReportingColumn.TotalWebClickLeadValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickLeadValueInDollar
		      Return "TOTAL_WEB_CLICK_LEAD_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementLead
		      Return "TOTAL_WEB_ENGAGEMENT_LEAD"
		    Case ReportingColumn.TotalWebEngagementLeadValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementLeadValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewLead
		      Return "TOTAL_WEB_VIEW_LEAD"
		    Case ReportingColumn.TotalWebViewLeadValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewLeadValueInDollar
		      Return "TOTAL_WEB_VIEW_LEAD_VALUE_IN_DOLLAR"
		    Case ReportingColumn.OfflineLeadCostPerAction
		      Return "OFFLINE_LEAD_COST_PER_ACTION"
		    Case ReportingColumn.OfflineLeadRoas
		      Return "OFFLINE_LEAD_ROAS"
		    Case ReportingColumn.TotalOfflineLead
		      Return "TOTAL_OFFLINE_LEAD"
		    Case ReportingColumn.TotalOfflineLeadValueInMicroDollar
		      Return "TOTAL_OFFLINE_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineLeadValueInDollar
		      Return "TOTAL_OFFLINE_LEAD_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickLead
		      Return "TOTAL_OFFLINE_CLICK_LEAD"
		    Case ReportingColumn.TotalOfflineClickLeadValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickLeadValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_LEAD_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementLead
		      Return "TOTAL_OFFLINE_ENGAGEMENT_LEAD"
		    Case ReportingColumn.TotalOfflineEngagementLeadValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementLeadValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewLead
		      Return "TOTAL_OFFLINE_VIEW_LEAD"
		    Case ReportingColumn.TotalOfflineViewLeadValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewLeadValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_LEAD_VALUE_IN_DOLLAR"
		    Case ReportingColumn.WebSearchCostPerAction
		      Return "WEB_SEARCH_COST_PER_ACTION"
		    Case ReportingColumn.WebSearchRoas
		      Return "WEB_SEARCH_ROAS"
		    Case ReportingColumn.TotalWebSearch
		      Return "TOTAL_WEB_SEARCH"
		    Case ReportingColumn.TotalWebSearchValueInMicroDollar
		      Return "TOTAL_WEB_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebSearchValueInDollar
		      Return "TOTAL_WEB_SEARCH_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickSearch
		      Return "TOTAL_WEB_CLICK_SEARCH"
		    Case ReportingColumn.TotalWebClickSearchValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickSearchValueInDollar
		      Return "TOTAL_WEB_CLICK_SEARCH_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementSearch
		      Return "TOTAL_WEB_ENGAGEMENT_SEARCH"
		    Case ReportingColumn.TotalWebEngagementSearchValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementSearchValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewSearch
		      Return "TOTAL_WEB_VIEW_SEARCH"
		    Case ReportingColumn.TotalWebViewSearchValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewSearchValueInDollar
		      Return "TOTAL_WEB_VIEW_SEARCH_VALUE_IN_DOLLAR"
		    Case ReportingColumn.InappSearchCostPerAction
		      Return "INAPP_SEARCH_COST_PER_ACTION"
		    Case ReportingColumn.InappSearchRoas
		      Return "INAPP_SEARCH_ROAS"
		    Case ReportingColumn.TotalInappSearch
		      Return "TOTAL_INAPP_SEARCH"
		    Case ReportingColumn.TotalInappSearchValueInMicroDollar
		      Return "TOTAL_INAPP_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappSearchValueInDollar
		      Return "TOTAL_INAPP_SEARCH_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappClickSearch
		      Return "TOTAL_INAPP_CLICK_SEARCH"
		    Case ReportingColumn.TotalInappClickSearchValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappClickSearchValueInDollar
		      Return "TOTAL_INAPP_CLICK_SEARCH_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementSearch
		      Return "TOTAL_INAPP_ENGAGEMENT_SEARCH"
		    Case ReportingColumn.TotalInappEngagementSearchValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementSearchValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappViewSearch
		      Return "TOTAL_INAPP_VIEW_SEARCH"
		    Case ReportingColumn.TotalInappViewSearchValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappViewSearchValueInDollar
		      Return "TOTAL_INAPP_VIEW_SEARCH_VALUE_IN_DOLLAR"
		    Case ReportingColumn.WebViewCategoryCostPerAction
		      Return "WEB_VIEW_CATEGORY_COST_PER_ACTION"
		    Case ReportingColumn.WebViewCategoryRoas
		      Return "WEB_VIEW_CATEGORY_ROAS"
		    Case ReportingColumn.TotalWebViewCategory
		      Return "TOTAL_WEB_VIEW_CATEGORY"
		    Case ReportingColumn.TotalWebViewCategoryValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewCategoryValueInDollar
		      Return "TOTAL_WEB_VIEW_CATEGORY_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickViewCategory
		      Return "TOTAL_WEB_CLICK_VIEW_CATEGORY"
		    Case ReportingColumn.TotalWebClickViewCategoryValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickViewCategoryValueInDollar
		      Return "TOTAL_WEB_CLICK_VIEW_CATEGORY_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementViewCategory
		      Return "TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY"
		    Case ReportingColumn.TotalWebEngagementViewCategoryValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementViewCategoryValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewViewCategory
		      Return "TOTAL_WEB_VIEW_VIEW_CATEGORY"
		    Case ReportingColumn.TotalWebViewViewCategoryValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewViewCategoryValueInDollar
		      Return "TOTAL_WEB_VIEW_VIEW_CATEGORY_VALUE_IN_DOLLAR"
		    Case ReportingColumn.WebCustomCostPerAction
		      Return "WEB_CUSTOM_COST_PER_ACTION"
		    Case ReportingColumn.WebCustomRoas
		      Return "WEB_CUSTOM_ROAS"
		    Case ReportingColumn.TotalWebCustom
		      Return "TOTAL_WEB_CUSTOM"
		    Case ReportingColumn.TotalWebCustomValueInMicroDollar
		      Return "TOTAL_WEB_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebCustomValueInDollar
		      Return "TOTAL_WEB_CUSTOM_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickCustom
		      Return "TOTAL_WEB_CLICK_CUSTOM"
		    Case ReportingColumn.TotalWebClickCustomValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickCustomValueInDollar
		      Return "TOTAL_WEB_CLICK_CUSTOM_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementCustom
		      Return "TOTAL_WEB_ENGAGEMENT_CUSTOM"
		    Case ReportingColumn.TotalWebEngagementCustomValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementCustomValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewCustom
		      Return "TOTAL_WEB_VIEW_CUSTOM"
		    Case ReportingColumn.TotalWebViewCustomValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewCustomValueInDollar
		      Return "TOTAL_WEB_VIEW_CUSTOM_VALUE_IN_DOLLAR"
		    Case ReportingColumn.OfflineCustomCostPerAction
		      Return "OFFLINE_CUSTOM_COST_PER_ACTION"
		    Case ReportingColumn.OfflineCustomRoas
		      Return "OFFLINE_CUSTOM_ROAS"
		    Case ReportingColumn.TotalOfflineCustom
		      Return "TOTAL_OFFLINE_CUSTOM"
		    Case ReportingColumn.TotalOfflineCustomValueInMicroDollar
		      Return "TOTAL_OFFLINE_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineCustomValueInDollar
		      Return "TOTAL_OFFLINE_CUSTOM_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickCustom
		      Return "TOTAL_OFFLINE_CLICK_CUSTOM"
		    Case ReportingColumn.TotalOfflineClickCustomValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickCustomValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_CUSTOM_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementCustom
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CUSTOM"
		    Case ReportingColumn.TotalOfflineEngagementCustomValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementCustomValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewCustom
		      Return "TOTAL_OFFLINE_VIEW_CUSTOM"
		    Case ReportingColumn.TotalOfflineViewCustomValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewCustomValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_CUSTOM_VALUE_IN_DOLLAR"
		    Case ReportingColumn.WebUnknownCostPerAction
		      Return "WEB_UNKNOWN_COST_PER_ACTION"
		    Case ReportingColumn.WebUnknownRoas
		      Return "WEB_UNKNOWN_ROAS"
		    Case ReportingColumn.TotalWebUnknown
		      Return "TOTAL_WEB_UNKNOWN"
		    Case ReportingColumn.TotalWebUnknownValueInMicroDollar
		      Return "TOTAL_WEB_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebUnknownValueInDollar
		      Return "TOTAL_WEB_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickUnknown
		      Return "TOTAL_WEB_CLICK_UNKNOWN"
		    Case ReportingColumn.TotalWebClickUnknownValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickUnknownValueInDollar
		      Return "TOTAL_WEB_CLICK_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementUnknown
		      Return "TOTAL_WEB_ENGAGEMENT_UNKNOWN"
		    Case ReportingColumn.TotalWebEngagementUnknownValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementUnknownValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewUnknown
		      Return "TOTAL_WEB_VIEW_UNKNOWN"
		    Case ReportingColumn.TotalWebViewUnknownValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewUnknownValueInDollar
		      Return "TOTAL_WEB_VIEW_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.InappUnknownCostPerAction
		      Return "INAPP_UNKNOWN_COST_PER_ACTION"
		    Case ReportingColumn.InappUnknownRoas
		      Return "INAPP_UNKNOWN_ROAS"
		    Case ReportingColumn.TotalInappUnknown
		      Return "TOTAL_INAPP_UNKNOWN"
		    Case ReportingColumn.TotalInappUnknownValueInMicroDollar
		      Return "TOTAL_INAPP_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappUnknownValueInDollar
		      Return "TOTAL_INAPP_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappClickUnknown
		      Return "TOTAL_INAPP_CLICK_UNKNOWN"
		    Case ReportingColumn.TotalInappClickUnknownValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappClickUnknownValueInDollar
		      Return "TOTAL_INAPP_CLICK_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementUnknown
		      Return "TOTAL_INAPP_ENGAGEMENT_UNKNOWN"
		    Case ReportingColumn.TotalInappEngagementUnknownValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementUnknownValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappViewUnknown
		      Return "TOTAL_INAPP_VIEW_UNKNOWN"
		    Case ReportingColumn.TotalInappViewUnknownValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappViewUnknownValueInDollar
		      Return "TOTAL_INAPP_VIEW_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.OfflineUnknownCostPerAction
		      Return "OFFLINE_UNKNOWN_COST_PER_ACTION"
		    Case ReportingColumn.OfflineUnknownRoas
		      Return "OFFLINE_UNKNOWN_ROAS"
		    Case ReportingColumn.TotalOfflineUnknown
		      Return "TOTAL_OFFLINE_UNKNOWN"
		    Case ReportingColumn.TotalOfflineUnknownValueInMicroDollar
		      Return "TOTAL_OFFLINE_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineUnknownValueInDollar
		      Return "TOTAL_OFFLINE_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickUnknown
		      Return "TOTAL_OFFLINE_CLICK_UNKNOWN"
		    Case ReportingColumn.TotalOfflineClickUnknownValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickUnknownValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementUnknown
		      Return "TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN"
		    Case ReportingColumn.TotalOfflineEngagementUnknownValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementUnknownValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewUnknown
		      Return "TOTAL_OFFLINE_VIEW_UNKNOWN"
		    Case ReportingColumn.TotalOfflineViewUnknownValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewUnknownValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_UNKNOWN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.InappAppInstallCostPerAction
		      Return "INAPP_APP_INSTALL_COST_PER_ACTION"
		    Case ReportingColumn.InappAppInstallRoas
		      Return "INAPP_APP_INSTALL_ROAS"
		    Case ReportingColumn.TotalInappAppInstall
		      Return "TOTAL_INAPP_APP_INSTALL"
		    Case ReportingColumn.TotalInappAppInstallValueInMicroDollar
		      Return "TOTAL_INAPP_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappAppInstallValueInDollar
		      Return "TOTAL_INAPP_APP_INSTALL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappClickAppInstall
		      Return "TOTAL_INAPP_CLICK_APP_INSTALL"
		    Case ReportingColumn.TotalInappClickAppInstallValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappClickAppInstallValueInDollar
		      Return "TOTAL_INAPP_CLICK_APP_INSTALL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementAppInstall
		      Return "TOTAL_INAPP_ENGAGEMENT_APP_INSTALL"
		    Case ReportingColumn.TotalInappEngagementAppInstallValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementAppInstallValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_APP_INSTALL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappViewAppInstall
		      Return "TOTAL_INAPP_VIEW_APP_INSTALL"
		    Case ReportingColumn.TotalInappViewAppInstallValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappViewAppInstallValueInDollar
		      Return "TOTAL_INAPP_VIEW_APP_INSTALL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalAppInstallConversionRate
		      Return "TOTAL_APP_INSTALL_CONVERSION_RATE"
		    Case ReportingColumn.TotalInappAppInstallConversionRate
		      Return "TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE"
		    Case ReportingColumn.WebAddPaymentInfoCostPerAction
		      Return "WEB_ADD_PAYMENT_INFO_COST_PER_ACTION"
		    Case ReportingColumn.WebAddPaymentInfoRoas
		      Return "WEB_ADD_PAYMENT_INFO_ROAS"
		    Case ReportingColumn.TotalWebAddPaymentInfo
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO"
		    Case ReportingColumn.TotalWebAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebAddPaymentInfoValueInDollar
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickAddPaymentInfo
		      Return "TOTAL_WEB_CLICK_ADD_PAYMENT_INFO"
		    Case ReportingColumn.TotalWebClickAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickAddPaymentInfoValueInDollar
		      Return "TOTAL_WEB_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementAddPaymentInfo
		      Return "TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO"
		    Case ReportingColumn.TotalWebEngagementAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementAddPaymentInfoValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewAddPaymentInfo
		      Return "TOTAL_WEB_VIEW_ADD_PAYMENT_INFO"
		    Case ReportingColumn.TotalWebViewAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewAddPaymentInfoValueInDollar
		      Return "TOTAL_WEB_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.InappAddPaymentInfoCostPerAction
		      Return "INAPP_ADD_PAYMENT_INFO_COST_PER_ACTION"
		    Case ReportingColumn.InappAddPaymentInfoRoas
		      Return "INAPP_ADD_PAYMENT_INFO_ROAS"
		    Case ReportingColumn.TotalInappAddPaymentInfo
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO"
		    Case ReportingColumn.TotalInappAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappAddPaymentInfoValueInDollar
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappClickAddPaymentInfo
		      Return "TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO"
		    Case ReportingColumn.TotalInappClickAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappClickAddPaymentInfoValueInDollar
		      Return "TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementAddPaymentInfo
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO"
		    Case ReportingColumn.TotalInappEngagementAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementAddPaymentInfoValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappViewAddPaymentInfo
		      Return "TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO"
		    Case ReportingColumn.TotalInappViewAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappViewAddPaymentInfoValueInDollar
		      Return "TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.OfflineAddPaymentInfoCostPerAction
		      Return "OFFLINE_ADD_PAYMENT_INFO_COST_PER_ACTION"
		    Case ReportingColumn.OfflineAddPaymentInfoRoas
		      Return "OFFLINE_ADD_PAYMENT_INFO_ROAS"
		    Case ReportingColumn.TotalOfflineAddPaymentInfo
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO"
		    Case ReportingColumn.TotalOfflineAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineAddPaymentInfoValueInDollar
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickAddPaymentInfo
		      Return "TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO"
		    Case ReportingColumn.TotalOfflineClickAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickAddPaymentInfoValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementAddPaymentInfo
		      Return "TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO"
		    Case ReportingColumn.TotalOfflineEngagementAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementAddPaymentInfoValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewAddPaymentInfo
		      Return "TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO"
		    Case ReportingColumn.TotalOfflineViewAddPaymentInfoValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewAddPaymentInfoValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR"
		    Case ReportingColumn.WebAddToWishlistCostPerAction
		      Return "WEB_ADD_TO_WISHLIST_COST_PER_ACTION"
		    Case ReportingColumn.WebAddToWishlistRoas
		      Return "WEB_ADD_TO_WISHLIST_ROAS"
		    Case ReportingColumn.TotalWebAddToWishlist
		      Return "TOTAL_WEB_ADD_TO_WISHLIST"
		    Case ReportingColumn.TotalWebAddToWishlistValueInMicroDollar
		      Return "TOTAL_WEB_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebAddToWishlistValueInDollar
		      Return "TOTAL_WEB_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickAddToWishlist
		      Return "TOTAL_WEB_CLICK_ADD_TO_WISHLIST"
		    Case ReportingColumn.TotalWebClickAddToWishlistValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickAddToWishlistValueInDollar
		      Return "TOTAL_WEB_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementAddToWishlist
		      Return "TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST"
		    Case ReportingColumn.TotalWebEngagementAddToWishlistValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementAddToWishlistValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewAddToWishlist
		      Return "TOTAL_WEB_VIEW_ADD_TO_WISHLIST"
		    Case ReportingColumn.TotalWebViewAddToWishlistValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewAddToWishlistValueInDollar
		      Return "TOTAL_WEB_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ReportingColumn.InappAddToWishlistCostPerAction
		      Return "INAPP_ADD_TO_WISHLIST_COST_PER_ACTION"
		    Case ReportingColumn.InappAddToWishlistRoas
		      Return "INAPP_ADD_TO_WISHLIST_ROAS"
		    Case ReportingColumn.TotalInappAddToWishlist
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST"
		    Case ReportingColumn.TotalInappAddToWishlistValueInMicroDollar
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappAddToWishlistValueInDollar
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappClickAddToWishlist
		      Return "TOTAL_INAPP_CLICK_ADD_TO_WISHLIST"
		    Case ReportingColumn.TotalInappClickAddToWishlistValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappClickAddToWishlistValueInDollar
		      Return "TOTAL_INAPP_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementAddToWishlist
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST"
		    Case ReportingColumn.TotalInappEngagementAddToWishlistValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementAddToWishlistValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappViewAddToWishlist
		      Return "TOTAL_INAPP_VIEW_ADD_TO_WISHLIST"
		    Case ReportingColumn.TotalInappViewAddToWishlistValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappViewAddToWishlistValueInDollar
		      Return "TOTAL_INAPP_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ReportingColumn.OfflineAddToWishlistCostPerAction
		      Return "OFFLINE_ADD_TO_WISHLIST_COST_PER_ACTION"
		    Case ReportingColumn.OfflineAddToWishlistRoas
		      Return "OFFLINE_ADD_TO_WISHLIST_ROAS"
		    Case ReportingColumn.TotalOfflineAddToWishlist
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST"
		    Case ReportingColumn.TotalOfflineAddToWishlistValueInMicroDollar
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineAddToWishlistValueInDollar
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickAddToWishlist
		      Return "TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST"
		    Case ReportingColumn.TotalOfflineClickAddToWishlistValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickAddToWishlistValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementAddToWishlist
		      Return "TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST"
		    Case ReportingColumn.TotalOfflineEngagementAddToWishlistValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementAddToWishlistValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewAddToWishlist
		      Return "TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST"
		    Case ReportingColumn.TotalOfflineViewAddToWishlistValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewAddToWishlistValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR"
		    Case ReportingColumn.WebInitiateCheckoutCostPerAction
		      Return "WEB_INITIATE_CHECKOUT_COST_PER_ACTION"
		    Case ReportingColumn.WebInitiateCheckoutRoas
		      Return "WEB_INITIATE_CHECKOUT_ROAS"
		    Case ReportingColumn.TotalWebInitiateCheckout
		      Return "TOTAL_WEB_INITIATE_CHECKOUT"
		    Case ReportingColumn.TotalWebInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebInitiateCheckoutValueInDollar
		      Return "TOTAL_WEB_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickInitiateCheckout
		      Return "TOTAL_WEB_CLICK_INITIATE_CHECKOUT"
		    Case ReportingColumn.TotalWebClickInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickInitiateCheckoutValueInDollar
		      Return "TOTAL_WEB_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementInitiateCheckout
		      Return "TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT"
		    Case ReportingColumn.TotalWebEngagementInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementInitiateCheckoutValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewInitiateCheckout
		      Return "TOTAL_WEB_VIEW_INITIATE_CHECKOUT"
		    Case ReportingColumn.TotalWebViewInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewInitiateCheckoutValueInDollar
		      Return "TOTAL_WEB_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.InappInitiateCheckoutCostPerAction
		      Return "INAPP_INITIATE_CHECKOUT_COST_PER_ACTION"
		    Case ReportingColumn.InappInitiateCheckoutRoas
		      Return "INAPP_INITIATE_CHECKOUT_ROAS"
		    Case ReportingColumn.TotalInappInitiateCheckout
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT"
		    Case ReportingColumn.TotalInappInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappInitiateCheckoutValueInDollar
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappClickInitiateCheckout
		      Return "TOTAL_INAPP_CLICK_INITIATE_CHECKOUT"
		    Case ReportingColumn.TotalInappClickInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappClickInitiateCheckoutValueInDollar
		      Return "TOTAL_INAPP_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementInitiateCheckout
		      Return "TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT"
		    Case ReportingColumn.TotalInappEngagementInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementInitiateCheckoutValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappViewInitiateCheckout
		      Return "TOTAL_INAPP_VIEW_INITIATE_CHECKOUT"
		    Case ReportingColumn.TotalInappViewInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappViewInitiateCheckoutValueInDollar
		      Return "TOTAL_INAPP_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.OfflineInitiateCheckoutCostPerAction
		      Return "OFFLINE_INITIATE_CHECKOUT_COST_PER_ACTION"
		    Case ReportingColumn.OfflineInitiateCheckoutRoas
		      Return "OFFLINE_INITIATE_CHECKOUT_ROAS"
		    Case ReportingColumn.TotalOfflineInitiateCheckout
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT"
		    Case ReportingColumn.TotalOfflineInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineInitiateCheckoutValueInDollar
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickInitiateCheckout
		      Return "TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT"
		    Case ReportingColumn.TotalOfflineClickInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickInitiateCheckoutValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementInitiateCheckout
		      Return "TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT"
		    Case ReportingColumn.TotalOfflineEngagementInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementInitiateCheckoutValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewInitiateCheckout
		      Return "TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT"
		    Case ReportingColumn.TotalOfflineViewInitiateCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewInitiateCheckoutValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.WebSubscribeCostPerAction
		      Return "WEB_SUBSCRIBE_COST_PER_ACTION"
		    Case ReportingColumn.WebSubscribeRoas
		      Return "WEB_SUBSCRIBE_ROAS"
		    Case ReportingColumn.TotalWebSubscribe
		      Return "TOTAL_WEB_SUBSCRIBE"
		    Case ReportingColumn.TotalWebSubscribeValueInMicroDollar
		      Return "TOTAL_WEB_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebSubscribeValueInDollar
		      Return "TOTAL_WEB_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickSubscribe
		      Return "TOTAL_WEB_CLICK_SUBSCRIBE"
		    Case ReportingColumn.TotalWebClickSubscribeValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickSubscribeValueInDollar
		      Return "TOTAL_WEB_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementSubscribe
		      Return "TOTAL_WEB_ENGAGEMENT_SUBSCRIBE"
		    Case ReportingColumn.TotalWebEngagementSubscribeValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementSubscribeValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewSubscribe
		      Return "TOTAL_WEB_VIEW_SUBSCRIBE"
		    Case ReportingColumn.TotalWebViewSubscribeValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewSubscribeValueInDollar
		      Return "TOTAL_WEB_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.InappSubscribeCostPerAction
		      Return "INAPP_SUBSCRIBE_COST_PER_ACTION"
		    Case ReportingColumn.InappSubscribeRoas
		      Return "INAPP_SUBSCRIBE_ROAS"
		    Case ReportingColumn.TotalInappSubscribe
		      Return "TOTAL_INAPP_SUBSCRIBE"
		    Case ReportingColumn.TotalInappSubscribeValueInMicroDollar
		      Return "TOTAL_INAPP_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappSubscribeValueInDollar
		      Return "TOTAL_INAPP_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappClickSubscribe
		      Return "TOTAL_INAPP_CLICK_SUBSCRIBE"
		    Case ReportingColumn.TotalInappClickSubscribeValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappClickSubscribeValueInDollar
		      Return "TOTAL_INAPP_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementSubscribe
		      Return "TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE"
		    Case ReportingColumn.TotalInappEngagementSubscribeValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementSubscribeValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappViewSubscribe
		      Return "TOTAL_INAPP_VIEW_SUBSCRIBE"
		    Case ReportingColumn.TotalInappViewSubscribeValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappViewSubscribeValueInDollar
		      Return "TOTAL_INAPP_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.OfflineSubscribeCostPerAction
		      Return "OFFLINE_SUBSCRIBE_COST_PER_ACTION"
		    Case ReportingColumn.OfflineSubscribeRoas
		      Return "OFFLINE_SUBSCRIBE_ROAS"
		    Case ReportingColumn.TotalOfflineSubscribe
		      Return "TOTAL_OFFLINE_SUBSCRIBE"
		    Case ReportingColumn.TotalOfflineSubscribeValueInMicroDollar
		      Return "TOTAL_OFFLINE_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineSubscribeValueInDollar
		      Return "TOTAL_OFFLINE_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickSubscribe
		      Return "TOTAL_OFFLINE_CLICK_SUBSCRIBE"
		    Case ReportingColumn.TotalOfflineClickSubscribeValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickSubscribeValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementSubscribe
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE"
		    Case ReportingColumn.TotalOfflineEngagementSubscribeValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementSubscribeValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewSubscribe
		      Return "TOTAL_OFFLINE_VIEW_SUBSCRIBE"
		    Case ReportingColumn.TotalOfflineViewSubscribeValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewSubscribeValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.WebViewContentCostPerAction
		      Return "WEB_VIEW_CONTENT_COST_PER_ACTION"
		    Case ReportingColumn.WebViewContentRoas
		      Return "WEB_VIEW_CONTENT_ROAS"
		    Case ReportingColumn.TotalWebViewContent
		      Return "TOTAL_WEB_VIEW_CONTENT"
		    Case ReportingColumn.TotalWebViewContentValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewContentValueInDollar
		      Return "TOTAL_WEB_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickViewContent
		      Return "TOTAL_WEB_CLICK_VIEW_CONTENT"
		    Case ReportingColumn.TotalWebClickViewContentValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickViewContentValueInDollar
		      Return "TOTAL_WEB_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementViewContent
		      Return "TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT"
		    Case ReportingColumn.TotalWebEngagementViewContentValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementViewContentValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewViewContent
		      Return "TOTAL_WEB_VIEW_VIEW_CONTENT"
		    Case ReportingColumn.TotalWebViewViewContentValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewViewContentValueInDollar
		      Return "TOTAL_WEB_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.InappViewContentCostPerAction
		      Return "INAPP_VIEW_CONTENT_COST_PER_ACTION"
		    Case ReportingColumn.InappViewContentRoas
		      Return "INAPP_VIEW_CONTENT_ROAS"
		    Case ReportingColumn.TotalInappViewContent
		      Return "TOTAL_INAPP_VIEW_CONTENT"
		    Case ReportingColumn.TotalInappViewContentValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappViewContentValueInDollar
		      Return "TOTAL_INAPP_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappClickViewContent
		      Return "TOTAL_INAPP_CLICK_VIEW_CONTENT"
		    Case ReportingColumn.TotalInappClickViewContentValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappClickViewContentValueInDollar
		      Return "TOTAL_INAPP_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementViewContent
		      Return "TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT"
		    Case ReportingColumn.TotalInappEngagementViewContentValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementViewContentValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappViewViewContent
		      Return "TOTAL_INAPP_VIEW_VIEW_CONTENT"
		    Case ReportingColumn.TotalInappViewViewContentValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappViewViewContentValueInDollar
		      Return "TOTAL_INAPP_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.OfflineViewContentCostPerAction
		      Return "OFFLINE_VIEW_CONTENT_COST_PER_ACTION"
		    Case ReportingColumn.OfflineViewContentRoas
		      Return "OFFLINE_VIEW_CONTENT_ROAS"
		    Case ReportingColumn.TotalOfflineViewContent
		      Return "TOTAL_OFFLINE_VIEW_CONTENT"
		    Case ReportingColumn.TotalOfflineViewContentValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewContentValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickViewContent
		      Return "TOTAL_OFFLINE_CLICK_VIEW_CONTENT"
		    Case ReportingColumn.TotalOfflineClickViewContentValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickViewContentValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementViewContent
		      Return "TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT"
		    Case ReportingColumn.TotalOfflineEngagementViewContentValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementViewContentValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewViewContent
		      Return "TOTAL_OFFLINE_VIEW_VIEW_CONTENT"
		    Case ReportingColumn.TotalOfflineViewViewContentValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewViewContentValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.IdeaPinPageForward1
		      Return "IDEA_PIN_PAGE_FORWARD_1"
		    Case ReportingColumn.IdeaPinPageForward2
		      Return "IDEA_PIN_PAGE_FORWARD_2"
		    Case ReportingColumn.IdeaPinPageBackward1
		      Return "IDEA_PIN_PAGE_BACKWARD_1"
		    Case ReportingColumn.IdeaPinPageBackward2
		      Return "IDEA_PIN_PAGE_BACKWARD_2"
		    Case ReportingColumn.TotalIdeaPinPageForward
		      Return "TOTAL_IDEA_PIN_PAGE_FORWARD"
		    Case ReportingColumn.TotalIdeaPinPageBackward
		      Return "TOTAL_IDEA_PIN_PAGE_BACKWARD"
		    Case ReportingColumn.IdeaPinProductTagVisit1
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_1"
		    Case ReportingColumn.IdeaPinProductTagVisit2
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_2"
		    Case ReportingColumn.TotalIdeaPinProductTagVisit
		      Return "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT"
		    Case ReportingColumn.CpmInUsDollar
		      Return "CPM_IN_US_DOLLAR"
		    Case ReportingColumn.EcpcInUsDollar
		      Return "ECPC_IN_US_DOLLAR"
		    Case ReportingColumn.Leads
		      Return "LEADS"
		    Case ReportingColumn.CostPerLead
		      Return "COST_PER_LEAD"
		    Case ReportingColumn.QuizStarted
		      Return "QUIZ_STARTED"
		    Case ReportingColumn.QuizCompleted
		      Return "QUIZ_COMPLETED"
		    Case ReportingColumn.QuizPinResultOpen
		      Return "QUIZ_PIN_RESULT_OPEN"
		    Case ReportingColumn.QuizCompletionRate
		      Return "QUIZ_COMPLETION_RATE"
		    Case ReportingColumn.ShowcasePinClickthrough
		      Return "SHOWCASE_PIN_CLICKTHROUGH"
		    Case ReportingColumn.ShowcaseSubpageClickthrough
		      Return "SHOWCASE_SUBPAGE_CLICKTHROUGH"
		    Case ReportingColumn.ShowcaseSubpinClickthrough
		      Return "SHOWCASE_SUBPIN_CLICKTHROUGH"
		    Case ReportingColumn.ShowcaseSubpageImpression
		      Return "SHOWCASE_SUBPAGE_IMPRESSION"
		    Case ReportingColumn.ShowcaseSubpinImpression
		      Return "SHOWCASE_SUBPIN_IMPRESSION"
		    Case ReportingColumn.ShowcaseSubpageSwipeLeft
		      Return "SHOWCASE_SUBPAGE_SWIPE_LEFT"
		    Case ReportingColumn.ShowcaseSubpageSwipeRight
		      Return "SHOWCASE_SUBPAGE_SWIPE_RIGHT"
		    Case ReportingColumn.ShowcaseSubpinSwipeLeft
		      Return "SHOWCASE_SUBPIN_SWIPE_LEFT"
		    Case ReportingColumn.ShowcaseSubpinSwipeRight
		      Return "SHOWCASE_SUBPIN_SWIPE_RIGHT"
		    Case ReportingColumn.ShowcaseSubpageRepin
		      Return "SHOWCASE_SUBPAGE_REPIN"
		    Case ReportingColumn.ShowcaseSubpinRepin
		      Return "SHOWCASE_SUBPIN_REPIN"
		    Case ReportingColumn.ShowcaseSubpageCloseup
		      Return "SHOWCASE_SUBPAGE_CLOSEUP"
		    Case ReportingColumn.ShowcaseCardThumbnailSwipeForward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD"
		    Case ReportingColumn.ShowcaseCardThumbnailSwipeBackward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD"
		    Case ReportingColumn.ShowcaseSubpageCloseupInternal
		      Return "_SHOWCASE_SUBPAGE_CLOSEUP_INTERNAL"
		    Case ReportingColumn.ShowcaseCardLanding
		      Return "SHOWCASE_CARD_LANDING"
		    Case ReportingColumn.ShowcaseAverageSubpageCloseupPerSession
		      Return "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION"
		    Case ReportingColumn.TotalCheckoutConversionRate
		      Return "TOTAL_CHECKOUT_CONVERSION_RATE"
		    Case ReportingColumn.TotalViewCategoryConversionRate
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_RATE"
		    Case ReportingColumn.TotalAddToCartConversionRate
		      Return "TOTAL_ADD_TO_CART_CONVERSION_RATE"
		    Case ReportingColumn.TotalSignupConversionRate
		      Return "TOTAL_SIGNUP_CONVERSION_RATE"
		    Case ReportingColumn.TotalPageVisitConversionRate
		      Return "TOTAL_PAGE_VISIT_CONVERSION_RATE"
		    Case ReportingColumn.TotalLeadConversionRate
		      Return "TOTAL_LEAD_CONVERSION_RATE"
		    Case ReportingColumn.TotalSearchConversionRate
		      Return "TOTAL_SEARCH_CONVERSION_RATE"
		    Case ReportingColumn.TotalWatchVideoConversionRate
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_RATE"
		    Case ReportingColumn.TotalUnknownConversionRate
		      Return "TOTAL_UNKNOWN_CONVERSION_RATE"
		    Case ReportingColumn.TotalCustomConversionRate
		      Return "TOTAL_CUSTOM_CONVERSION_RATE"
		    Case ReportingColumn.TotalAddPaymentInfoConversionRate
		      Return "TOTAL_ADD_PAYMENT_INFO_CONVERSION_RATE"
		    Case ReportingColumn.TotalAddToWishlistConversionRate
		      Return "TOTAL_ADD_TO_WISHLIST_CONVERSION_RATE"
		    Case ReportingColumn.TotalInitiateCheckoutConversionRate
		      Return "TOTAL_INITIATE_CHECKOUT_CONVERSION_RATE"
		    Case ReportingColumn.TotalSubscribeConversionRate
		      Return "TOTAL_SUBSCRIBE_CONVERSION_RATE"
		    Case ReportingColumn.TotalViewContentConversionRate
		      Return "TOTAL_VIEW_CONTENT_CONVERSION_RATE"
		    Case ReportingColumn.StandardAdFeedItemId
		      Return "STANDARD_AD_FEED_ITEM_ID"
		    Case ReportingColumn.IsStandardFeedAd
		      Return "IS_STANDARD_FEED_AD"
		    Case ReportingColumn.TargetingGender
		      Return "TARGETING_GENDER"
		    Case ReportingColumn.TargetingCreativeType
		      Return "TARGETING_CREATIVE_TYPE"
		    Case ReportingColumn.TargetingCountry
		      Return "TARGETING_COUNTRY"
		    Case ReportingColumn.TargetingLocation
		      Return "TARGETING_LOCATION"
		    Case ReportingColumn.TargetingApptype
		      Return "TARGETING_APPTYPE"
		    Case ReportingColumn.TargetingLocationCode
		      Return "TARGETING_LOCATION_CODE"
		    Case ReportingColumn.TargetingMediaType
		      Return "TARGETING_MEDIA_TYPE"
		    Case ReportingColumn.TargetingAgeBucket
		      Return "TARGETING_AGE_BUCKET"
		    Case ReportingColumn.TargetingAudienceMultiplier
		      Return "TARGETING_AUDIENCE_MULTIPLIER"
		    Case ReportingColumn.TargetingLocalAdsStoreCode
		      Return "TARGETING_LOCAL_ADS_STORE_CODE"
		    Case ReportingColumn.TargetingLanguagesInclude
		      Return "TARGETING_LANGUAGES_INCLUDE"
		    Case ReportingColumn.TargetingLanguagesExclude
		      Return "TARGETING_LANGUAGES_EXCLUDE"
		    Case ReportingColumn.TotalConversionProductQuantity
		      Return "TOTAL_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebConversionProductQuantity
		      Return "TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalInappConversionProductQuantity
		      Return "TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalOfflineConversionProductQuantity
		      Return "TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalConversionProductValue
		      Return "TOTAL_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebConversionProductValue
		      Return "TOTAL_WEB_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalInappConversionProductValue
		      Return "TOTAL_INAPP_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalOfflineConversionProductValue
		      Return "TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalConversionProductValueInMicroUnits
		      Return "TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalInappConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalOfflineConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalConversionProductValueInUsd
		      Return "TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebConversionProductValueInUsd
		      Return "TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalInappConversionProductValueInUsd
		      Return "TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalOfflineConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalConversionProductValueInMicroUsd
		      Return "TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalInappConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalOfflineConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.ConversionProductCountUnique
		      Return "CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalCheckoutConversionProductQuantity
		      Return "TOTAL_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalCheckoutConversionProductValue
		      Return "TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalCheckoutConversionProductValueInMicroUnits
		      Return "TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalCheckoutConversionProductValueInUsd
		      Return "TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalCheckoutConversionProductValueInMicroUsd
		      Return "TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebCheckoutConversionProductQuantity
		      Return "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebCheckoutConversionProductValue
		      Return "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebCheckoutConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebCheckoutConversionProductValueInUsd
		      Return "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebCheckoutConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalInappCheckoutConversionProductQuantity
		      Return "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalInappCheckoutConversionProductValue
		      Return "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalInappCheckoutConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalInappCheckoutConversionProductValueInUsd
		      Return "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalInappCheckoutConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalOfflineCheckoutConversionProductQuantity
		      Return "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalOfflineCheckoutConversionProductValue
		      Return "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalOfflineCheckoutConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalOfflineCheckoutConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalOfflineCheckoutConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalAddToCartConversionProductQuantity
		      Return "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalAddToCartConversionProductValue
		      Return "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalAddToCartConversionProductValueInMicroUnits
		      Return "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalAddToCartConversionProductValueInUsd
		      Return "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalAddToCartConversionProductValueInMicroUsd
		      Return "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebAddToCartConversionProductQuantity
		      Return "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebAddToCartConversionProductValue
		      Return "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebAddToCartConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebAddToCartConversionProductValueInUsd
		      Return "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebAddToCartConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalInappAddToCartConversionProductQuantity
		      Return "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalInappAddToCartConversionProductValue
		      Return "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalInappAddToCartConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalInappAddToCartConversionProductValueInUsd
		      Return "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalInappAddToCartConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalPageVisitConversionProductQuantity
		      Return "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalPageVisitConversionProductValue
		      Return "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalPageVisitConversionProductValueInMicroUnits
		      Return "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalPageVisitConversionProductValueInUsd
		      Return "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalPageVisitConversionProductValueInMicroUsd
		      Return "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebPageVisitConversionProductQuantity
		      Return "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebPageVisitConversionProductValue
		      Return "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebPageVisitConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebPageVisitConversionProductValueInUsd
		      Return "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebPageVisitConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalSignupConversionProductQuantity
		      Return "TOTAL_SIGNUP_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalSignupConversionProductValue
		      Return "TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalSignupConversionProductValueInMicroUnits
		      Return "TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalSignupConversionProductValueInUsd
		      Return "TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalSignupConversionProductValueInMicroUsd
		      Return "TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebSignupConversionProductQuantity
		      Return "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebSignupConversionProductValue
		      Return "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebSignupConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebSignupConversionProductValueInUsd
		      Return "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebSignupConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalInappSignupConversionProductQuantity
		      Return "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalInappSignupConversionProductValue
		      Return "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalInappSignupConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalInappSignupConversionProductValueInUsd
		      Return "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalInappSignupConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalOfflineSignupConversionProductQuantity
		      Return "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalOfflineSignupConversionProductValue
		      Return "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalOfflineSignupConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalOfflineSignupConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalOfflineSignupConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWatchVideoConversionProductQuantity
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWatchVideoConversionProductValue
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWatchVideoConversionProductValueInMicroUnits
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWatchVideoConversionProductValueInUsd
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWatchVideoConversionProductValueInMicroUsd
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebWatchVideoConversionProductQuantity
		      Return "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebWatchVideoConversionProductValue
		      Return "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebWatchVideoConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebWatchVideoConversionProductValueInUsd
		      Return "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebWatchVideoConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalLeadConversionProductQuantity
		      Return "TOTAL_LEAD_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalLeadConversionProductValue
		      Return "TOTAL_LEAD_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalLeadConversionProductValueInMicroUnits
		      Return "TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalLeadConversionProductValueInUsd
		      Return "TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalLeadConversionProductValueInMicroUsd
		      Return "TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebLeadConversionProductQuantity
		      Return "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebLeadConversionProductValue
		      Return "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebLeadConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebLeadConversionProductValueInUsd
		      Return "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebLeadConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalOfflineLeadConversionProductQuantity
		      Return "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalOfflineLeadConversionProductValue
		      Return "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalOfflineLeadConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalOfflineLeadConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalOfflineLeadConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalSearchConversionProductQuantity
		      Return "TOTAL_SEARCH_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalSearchConversionProductValue
		      Return "TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalSearchConversionProductValueInMicroUnits
		      Return "TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalSearchConversionProductValueInUsd
		      Return "TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalSearchConversionProductValueInMicroUsd
		      Return "TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebSearchConversionProductQuantity
		      Return "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebSearchConversionProductValue
		      Return "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebSearchConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebSearchConversionProductValueInUsd
		      Return "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebSearchConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalInappSearchConversionProductQuantity
		      Return "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalInappSearchConversionProductValue
		      Return "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalInappSearchConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalInappSearchConversionProductValueInUsd
		      Return "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalInappSearchConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalViewCategoryConversionProductQuantity
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalViewCategoryConversionProductValue
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalViewCategoryConversionProductValueInMicroUnits
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalViewCategoryConversionProductValueInUsd
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalViewCategoryConversionProductValueInMicroUsd
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebViewCategoryConversionProductQuantity
		      Return "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebViewCategoryConversionProductValue
		      Return "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebViewCategoryConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebViewCategoryConversionProductValueInUsd
		      Return "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebViewCategoryConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalCustomConversionProductQuantity
		      Return "TOTAL_CUSTOM_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalCustomConversionProductValue
		      Return "TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalCustomConversionProductValueInMicroUnits
		      Return "TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalCustomConversionProductValueInUsd
		      Return "TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalCustomConversionProductValueInMicroUsd
		      Return "TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebCustomConversionProductQuantity
		      Return "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebCustomConversionProductValue
		      Return "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebCustomConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebCustomConversionProductValueInUsd
		      Return "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebCustomConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalOfflineCustomConversionProductQuantity
		      Return "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalOfflineCustomConversionProductValue
		      Return "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalOfflineCustomConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalOfflineCustomConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalOfflineCustomConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalUnknownConversionProductQuantity
		      Return "TOTAL_UNKNOWN_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalUnknownConversionProductValue
		      Return "TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalUnknownConversionProductValueInMicroUnits
		      Return "TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalUnknownConversionProductValueInUsd
		      Return "TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalUnknownConversionProductValueInMicroUsd
		      Return "TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebUnknownConversionProductQuantity
		      Return "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebUnknownConversionProductValue
		      Return "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebUnknownConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebUnknownConversionProductValueInUsd
		      Return "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebUnknownConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalInappUnknownConversionProductQuantity
		      Return "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalInappUnknownConversionProductValue
		      Return "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalInappUnknownConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalInappUnknownConversionProductValueInUsd
		      Return "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalInappUnknownConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalOfflineUnknownConversionProductQuantity
		      Return "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalOfflineUnknownConversionProductValue
		      Return "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalOfflineUnknownConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalOfflineUnknownConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalOfflineUnknownConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalAddPaymentInfoConversionProductQuantity
		      Return "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalAddPaymentInfoConversionProductValue
		      Return "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalAddPaymentInfoConversionProductValueInMicroUnits
		      Return "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalAddPaymentInfoConversionProductValueInUsd
		      Return "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalAddPaymentInfoConversionProductValueInMicroUsd
		      Return "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebAddPaymentInfoConversionProductQuantity
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebAddPaymentInfoConversionProductValue
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebAddPaymentInfoConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebAddPaymentInfoConversionProductValueInUsd
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebAddPaymentInfoConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalInappAddPaymentInfoConversionProductQuantity
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalInappAddPaymentInfoConversionProductValue
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalInappAddPaymentInfoConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalInappAddPaymentInfoConversionProductValueInUsd
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalInappAddPaymentInfoConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalOfflineAddPaymentInfoConversionProductQuantity
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalOfflineAddPaymentInfoConversionProductValue
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalOfflineAddPaymentInfoConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalOfflineAddPaymentInfoConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalOfflineAddPaymentInfoConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalAddToWishlistConversionProductQuantity
		      Return "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalAddToWishlistConversionProductValue
		      Return "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalAddToWishlistConversionProductValueInMicroUnits
		      Return "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalAddToWishlistConversionProductValueInUsd
		      Return "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalAddToWishlistConversionProductValueInMicroUsd
		      Return "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebAddToWishlistConversionProductQuantity
		      Return "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebAddToWishlistConversionProductValue
		      Return "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebAddToWishlistConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebAddToWishlistConversionProductValueInUsd
		      Return "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebAddToWishlistConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalInappAddToWishlistConversionProductQuantity
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalInappAddToWishlistConversionProductValue
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalInappAddToWishlistConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalInappAddToWishlistConversionProductValueInUsd
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalInappAddToWishlistConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalOfflineAddToWishlistConversionProductQuantity
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalOfflineAddToWishlistConversionProductValue
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalOfflineAddToWishlistConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalOfflineAddToWishlistConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalOfflineAddToWishlistConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalInitiateCheckoutConversionProductQuantity
		      Return "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalInitiateCheckoutConversionProductValue
		      Return "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalInitiateCheckoutConversionProductValueInMicroUnits
		      Return "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalInitiateCheckoutConversionProductValueInUsd
		      Return "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalInitiateCheckoutConversionProductValueInMicroUsd
		      Return "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebInitiateCheckoutConversionProductQuantity
		      Return "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebInitiateCheckoutConversionProductValue
		      Return "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebInitiateCheckoutConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebInitiateCheckoutConversionProductValueInUsd
		      Return "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebInitiateCheckoutConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalInappInitiateCheckoutConversionProductQuantity
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalInappInitiateCheckoutConversionProductValue
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalInappInitiateCheckoutConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalInappInitiateCheckoutConversionProductValueInUsd
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalInappInitiateCheckoutConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalOfflineInitiateCheckoutConversionProductQuantity
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalOfflineInitiateCheckoutConversionProductValue
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalOfflineInitiateCheckoutConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalOfflineInitiateCheckoutConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalOfflineInitiateCheckoutConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalSubscribeConversionProductQuantity
		      Return "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalSubscribeConversionProductValue
		      Return "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalSubscribeConversionProductValueInMicroUnits
		      Return "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalSubscribeConversionProductValueInUsd
		      Return "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalSubscribeConversionProductValueInMicroUsd
		      Return "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebSubscribeConversionProductQuantity
		      Return "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebSubscribeConversionProductValue
		      Return "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebSubscribeConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebSubscribeConversionProductValueInUsd
		      Return "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebSubscribeConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalInappSubscribeConversionProductQuantity
		      Return "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalInappSubscribeConversionProductValue
		      Return "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalInappSubscribeConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalInappSubscribeConversionProductValueInUsd
		      Return "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalInappSubscribeConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalOfflineSubscribeConversionProductQuantity
		      Return "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalOfflineSubscribeConversionProductValue
		      Return "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalOfflineSubscribeConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalOfflineSubscribeConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalOfflineSubscribeConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalViewContentConversionProductQuantity
		      Return "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalViewContentConversionProductValue
		      Return "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalViewContentConversionProductValueInMicroUnits
		      Return "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalViewContentConversionProductValueInUsd
		      Return "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalViewContentConversionProductValueInMicroUsd
		      Return "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebViewContentConversionProductQuantity
		      Return "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebViewContentConversionProductValue
		      Return "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebViewContentConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebViewContentConversionProductValueInUsd
		      Return "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebViewContentConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalInappViewContentConversionProductQuantity
		      Return "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalInappViewContentConversionProductValue
		      Return "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalInappViewContentConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalInappViewContentConversionProductValueInUsd
		      Return "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalInappViewContentConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalOfflineViewContentConversionProductQuantity
		      Return "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalOfflineViewContentConversionProductValue
		      Return "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalOfflineViewContentConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalOfflineViewContentConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalOfflineViewContentConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalCheckoutConversionProductCountUnique
		      Return "TOTAL_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebCheckoutConversionProductCountUnique
		      Return "TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalInappCheckoutConversionProductCountUnique
		      Return "TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalOfflineCheckoutConversionProductCountUnique
		      Return "TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalAddToCartConversionProductCountUnique
		      Return "TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebAddToCartConversionProductCountUnique
		      Return "TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalInappAddToCartConversionProductCountUnique
		      Return "TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalPageVisitConversionProductCountUnique
		      Return "TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebPageVisitConversionProductCountUnique
		      Return "TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalSignupConversionProductCountUnique
		      Return "TOTAL_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebSignupConversionProductCountUnique
		      Return "TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalInappSignupConversionProductCountUnique
		      Return "TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalOfflineSignupConversionProductCountUnique
		      Return "TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWatchVideoConversionProductCountUnique
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebWatchVideoConversionProductCountUnique
		      Return "TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalLeadConversionProductCountUnique
		      Return "TOTAL_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebLeadConversionProductCountUnique
		      Return "TOTAL_WEB_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalOfflineLeadConversionProductCountUnique
		      Return "TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalSearchConversionProductCountUnique
		      Return "TOTAL_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebSearchConversionProductCountUnique
		      Return "TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalInappSearchConversionProductCountUnique
		      Return "TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalViewCategoryConversionProductCountUnique
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebViewCategoryConversionProductCountUnique
		      Return "TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalCustomConversionProductCountUnique
		      Return "TOTAL_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebCustomConversionProductCountUnique
		      Return "TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalOfflineCustomConversionProductCountUnique
		      Return "TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalUnknownConversionProductCountUnique
		      Return "TOTAL_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebUnknownConversionProductCountUnique
		      Return "TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalInappUnknownConversionProductCountUnique
		      Return "TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalOfflineUnknownConversionProductCountUnique
		      Return "TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalAddPaymentInfoConversionProductCountUnique
		      Return "TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebAddPaymentInfoConversionProductCountUnique
		      Return "TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalInappAddPaymentInfoConversionProductCountUnique
		      Return "TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalOfflineAddPaymentInfoConversionProductCountUnique
		      Return "TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalAddToWishlistConversionProductCountUnique
		      Return "TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebAddToWishlistConversionProductCountUnique
		      Return "TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalInappAddToWishlistConversionProductCountUnique
		      Return "TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalOfflineAddToWishlistConversionProductCountUnique
		      Return "TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalInitiateCheckoutConversionProductCountUnique
		      Return "TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebInitiateCheckoutConversionProductCountUnique
		      Return "TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalInappInitiateCheckoutConversionProductCountUnique
		      Return "TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalOfflineInitiateCheckoutConversionProductCountUnique
		      Return "TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalSubscribeConversionProductCountUnique
		      Return "TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebSubscribeConversionProductCountUnique
		      Return "TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalInappSubscribeConversionProductCountUnique
		      Return "TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalOfflineSubscribeConversionProductCountUnique
		      Return "TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalViewContentConversionProductCountUnique
		      Return "TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebViewContentConversionProductCountUnique
		      Return "TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalInappViewContentConversionProductCountUnique
		      Return "TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalOfflineViewContentConversionProductCountUnique
		      Return "TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.GenAiImageSignature
		      Return "GEN_AI_IMAGE_SIGNATURE"
		    Case ReportingColumn.GenAiImageUrl
		      Return "GEN_AI_IMAGE_URL"
		    Case ReportingColumn.OriginalImageSignature
		      Return "ORIGINAL_IMAGE_SIGNATURE"
		    Case ReportingColumn.OriginalImageUrl
		      Return "ORIGINAL_IMAGE_URL"
		    Case ReportingColumn.GenAiGenerationDate
		      Return "GEN_AI_GENERATION_DATE"
		    Case ReportingColumn.IsRegenerating
		      Return "IS_REGENERATING"
		    Case ReportingColumn.GenAiImageCount
		      Return "GEN_AI_IMAGE_COUNT"
		    Case ReportingColumn.AdvertiserTimeZone
		      Return "ADVERTISER_TIME_ZONE"
		    Case ReportingColumn.EngagementContact1
		      Return "ENGAGEMENT_CONTACT_1"
		    Case ReportingColumn.ClickContact1
		      Return "CLICK_CONTACT_1"
		    Case ReportingColumn.ViewContact1
		      Return "VIEW_CONTACT_1"
		    Case ReportingColumn.EngagementContactValueInMicroDollar1
		      Return "ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickContactValueInMicroDollar1
		      Return "CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewContactValueInMicroDollar1
		      Return "VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementContactQuantity1
		      Return "ENGAGEMENT_CONTACT_QUANTITY_1"
		    Case ReportingColumn.ClickContactQuantity1
		      Return "CLICK_CONTACT_QUANTITY_1"
		    Case ReportingColumn.ViewContactQuantity1
		      Return "VIEW_CONTACT_QUANTITY_1"
		    Case ReportingColumn.EngagementContact2
		      Return "ENGAGEMENT_CONTACT_2"
		    Case ReportingColumn.ClickContact2
		      Return "CLICK_CONTACT_2"
		    Case ReportingColumn.ViewContact2
		      Return "VIEW_CONTACT_2"
		    Case ReportingColumn.EngagementContactValueInMicroDollar2
		      Return "ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickContactValueInMicroDollar2
		      Return "CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewContactValueInMicroDollar2
		      Return "VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementContactQuantity2
		      Return "ENGAGEMENT_CONTACT_QUANTITY_2"
		    Case ReportingColumn.ClickContactQuantity2
		      Return "CLICK_CONTACT_QUANTITY_2"
		    Case ReportingColumn.ViewContactQuantity2
		      Return "VIEW_CONTACT_QUANTITY_2"
		    Case ReportingColumn.TotalEngagementContact
		      Return "TOTAL_ENGAGEMENT_CONTACT"
		    Case ReportingColumn.TotalClickContact
		      Return "TOTAL_CLICK_CONTACT"
		    Case ReportingColumn.TotalViewContact
		      Return "TOTAL_VIEW_CONTACT"
		    Case ReportingColumn.TotalEngagementContactValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementContactValueInDollar
		      Return "TOTAL_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickContactValueInMicroDollar
		      Return "TOTAL_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickContactValueInDollar
		      Return "TOTAL_CLICK_CONTACT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewContactValueInMicroDollar
		      Return "TOTAL_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewContactValueInDollar
		      Return "TOTAL_VIEW_CONTACT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementContactQuantity
		      Return "TOTAL_ENGAGEMENT_CONTACT_QUANTITY"
		    Case ReportingColumn.TotalClickContactQuantity
		      Return "TOTAL_CLICK_CONTACT_QUANTITY"
		    Case ReportingColumn.TotalViewContactQuantity
		      Return "TOTAL_VIEW_CONTACT_QUANTITY"
		    Case ReportingColumn.TotalContact
		      Return "TOTAL_CONTACT"
		    Case ReportingColumn.TotalContactValueInMicroDollar
		      Return "TOTAL_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageContactValueInMicroDollar
		      Return "AVERAGE_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageContactValueInMicroUsDollar
		      Return "AVERAGE_CONTACT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalContactValueInMicroUsDollar
		      Return "TOTAL_CONTACT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalContactQuantity
		      Return "TOTAL_CONTACT_QUANTITY"
		    Case ReportingColumn.TotalContactValueInDollar
		      Return "TOTAL_CONTACT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.ContactCostPerAction
		      Return "CONTACT_COST_PER_ACTION"
		    Case ReportingColumn.ContactCostPerActionInUsDollar
		      Return "CONTACT_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.ContactRoas
		      Return "CONTACT_ROAS"
		    Case ReportingColumn.TotalContactConversionRate
		      Return "TOTAL_CONTACT_CONVERSION_RATE"
		    Case ReportingColumn.WebContactCostPerAction
		      Return "WEB_CONTACT_COST_PER_ACTION"
		    Case ReportingColumn.WebContactRoas
		      Return "WEB_CONTACT_ROAS"
		    Case ReportingColumn.TotalWebContact
		      Return "TOTAL_WEB_CONTACT"
		    Case ReportingColumn.TotalWebContactValueInMicroDollar
		      Return "TOTAL_WEB_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebContactValueInDollar
		      Return "TOTAL_WEB_CONTACT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickContact
		      Return "TOTAL_WEB_CLICK_CONTACT"
		    Case ReportingColumn.TotalWebClickContactValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickContactValueInDollar
		      Return "TOTAL_WEB_CLICK_CONTACT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementContact
		      Return "TOTAL_WEB_ENGAGEMENT_CONTACT"
		    Case ReportingColumn.TotalWebEngagementContactValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementContactValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewContact
		      Return "TOTAL_WEB_VIEW_CONTACT"
		    Case ReportingColumn.TotalWebViewContactValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewContactValueInDollar
		      Return "TOTAL_WEB_VIEW_CONTACT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.InappContactCostPerAction
		      Return "INAPP_CONTACT_COST_PER_ACTION"
		    Case ReportingColumn.InappContactRoas
		      Return "INAPP_CONTACT_ROAS"
		    Case ReportingColumn.TotalInappContact
		      Return "TOTAL_INAPP_CONTACT"
		    Case ReportingColumn.TotalInappContactValueInMicroDollar
		      Return "TOTAL_INAPP_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappContactValueInDollar
		      Return "TOTAL_INAPP_CONTACT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappClickContact
		      Return "TOTAL_INAPP_CLICK_CONTACT"
		    Case ReportingColumn.TotalInappClickContactValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappClickContactValueInDollar
		      Return "TOTAL_INAPP_CLICK_CONTACT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementContact
		      Return "TOTAL_INAPP_ENGAGEMENT_CONTACT"
		    Case ReportingColumn.TotalInappEngagementContactValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementContactValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappViewContact
		      Return "TOTAL_INAPP_VIEW_CONTACT"
		    Case ReportingColumn.TotalInappViewContactValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappViewContactValueInDollar
		      Return "TOTAL_INAPP_VIEW_CONTACT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.OfflineContactCostPerAction
		      Return "OFFLINE_CONTACT_COST_PER_ACTION"
		    Case ReportingColumn.OfflineContactRoas
		      Return "OFFLINE_CONTACT_ROAS"
		    Case ReportingColumn.TotalOfflineContact
		      Return "TOTAL_OFFLINE_CONTACT"
		    Case ReportingColumn.TotalOfflineContactValueInMicroDollar
		      Return "TOTAL_OFFLINE_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineContactValueInDollar
		      Return "TOTAL_OFFLINE_CONTACT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickContact
		      Return "TOTAL_OFFLINE_CLICK_CONTACT"
		    Case ReportingColumn.TotalOfflineClickContactValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickContactValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_CONTACT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementContact
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CONTACT"
		    Case ReportingColumn.TotalOfflineEngagementContactValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementContactValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewContact
		      Return "TOTAL_OFFLINE_VIEW_CONTACT"
		    Case ReportingColumn.TotalOfflineViewContactValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewContactValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_CONTACT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalContactConversionProductCountUnique
		      Return "TOTAL_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebContactConversionProductCountUnique
		      Return "TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalInappContactConversionProductCountUnique
		      Return "TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalOfflineContactConversionProductCountUnique
		      Return "TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalContactConversionProductQuantity
		      Return "TOTAL_CONTACT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalContactConversionProductValue
		      Return "TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalContactConversionProductValueInMicroUnits
		      Return "TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalContactConversionProductValueInUsd
		      Return "TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalContactConversionProductValueInMicroUsd
		      Return "TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebContactConversionProductQuantity
		      Return "TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebContactConversionProductValue
		      Return "TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebContactConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebContactConversionProductValueInUsd
		      Return "TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebContactConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalInappContactConversionProductQuantity
		      Return "TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalInappContactConversionProductValue
		      Return "TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalInappContactConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalInappContactConversionProductValueInUsd
		      Return "TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalInappContactConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalOfflineContactConversionProductQuantity
		      Return "TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalOfflineContactConversionProductValue
		      Return "TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalOfflineContactConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalOfflineContactConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalOfflineContactConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.EngagementSchedule1
		      Return "ENGAGEMENT_SCHEDULE_1"
		    Case ReportingColumn.ClickSchedule1
		      Return "CLICK_SCHEDULE_1"
		    Case ReportingColumn.ViewSchedule1
		      Return "VIEW_SCHEDULE_1"
		    Case ReportingColumn.EngagementScheduleValueInMicroDollar1
		      Return "ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickScheduleValueInMicroDollar1
		      Return "CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewScheduleValueInMicroDollar1
		      Return "VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementScheduleQuantity1
		      Return "ENGAGEMENT_SCHEDULE_QUANTITY_1"
		    Case ReportingColumn.ClickScheduleQuantity1
		      Return "CLICK_SCHEDULE_QUANTITY_1"
		    Case ReportingColumn.ViewScheduleQuantity1
		      Return "VIEW_SCHEDULE_QUANTITY_1"
		    Case ReportingColumn.EngagementSchedule2
		      Return "ENGAGEMENT_SCHEDULE_2"
		    Case ReportingColumn.ClickSchedule2
		      Return "CLICK_SCHEDULE_2"
		    Case ReportingColumn.ViewSchedule2
		      Return "VIEW_SCHEDULE_2"
		    Case ReportingColumn.EngagementScheduleValueInMicroDollar2
		      Return "ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickScheduleValueInMicroDollar2
		      Return "CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewScheduleValueInMicroDollar2
		      Return "VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementScheduleQuantity2
		      Return "ENGAGEMENT_SCHEDULE_QUANTITY_2"
		    Case ReportingColumn.ClickScheduleQuantity2
		      Return "CLICK_SCHEDULE_QUANTITY_2"
		    Case ReportingColumn.ViewScheduleQuantity2
		      Return "VIEW_SCHEDULE_QUANTITY_2"
		    Case ReportingColumn.TotalEngagementSchedule
		      Return "TOTAL_ENGAGEMENT_SCHEDULE"
		    Case ReportingColumn.TotalClickSchedule
		      Return "TOTAL_CLICK_SCHEDULE"
		    Case ReportingColumn.TotalViewSchedule
		      Return "TOTAL_VIEW_SCHEDULE"
		    Case ReportingColumn.TotalEngagementScheduleValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementScheduleValueInDollar
		      Return "TOTAL_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickScheduleValueInMicroDollar
		      Return "TOTAL_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickScheduleValueInDollar
		      Return "TOTAL_CLICK_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewScheduleValueInMicroDollar
		      Return "TOTAL_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewScheduleValueInDollar
		      Return "TOTAL_VIEW_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementScheduleQuantity
		      Return "TOTAL_ENGAGEMENT_SCHEDULE_QUANTITY"
		    Case ReportingColumn.TotalClickScheduleQuantity
		      Return "TOTAL_CLICK_SCHEDULE_QUANTITY"
		    Case ReportingColumn.TotalViewScheduleQuantity
		      Return "TOTAL_VIEW_SCHEDULE_QUANTITY"
		    Case ReportingColumn.TotalSchedule
		      Return "TOTAL_SCHEDULE"
		    Case ReportingColumn.TotalScheduleValueInMicroDollar
		      Return "TOTAL_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageScheduleValueInMicroDollar
		      Return "AVERAGE_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageScheduleValueInMicroUsDollar
		      Return "AVERAGE_SCHEDULE_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalScheduleValueInMicroUsDollar
		      Return "TOTAL_SCHEDULE_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalScheduleQuantity
		      Return "TOTAL_SCHEDULE_QUANTITY"
		    Case ReportingColumn.TotalScheduleValueInDollar
		      Return "TOTAL_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.ScheduleCostPerAction
		      Return "SCHEDULE_COST_PER_ACTION"
		    Case ReportingColumn.ScheduleCostPerActionInUsDollar
		      Return "SCHEDULE_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.ScheduleRoas
		      Return "SCHEDULE_ROAS"
		    Case ReportingColumn.TotalScheduleConversionRate
		      Return "TOTAL_SCHEDULE_CONVERSION_RATE"
		    Case ReportingColumn.WebScheduleCostPerAction
		      Return "WEB_SCHEDULE_COST_PER_ACTION"
		    Case ReportingColumn.WebScheduleRoas
		      Return "WEB_SCHEDULE_ROAS"
		    Case ReportingColumn.TotalWebSchedule
		      Return "TOTAL_WEB_SCHEDULE"
		    Case ReportingColumn.TotalWebScheduleValueInMicroDollar
		      Return "TOTAL_WEB_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebScheduleValueInDollar
		      Return "TOTAL_WEB_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickSchedule
		      Return "TOTAL_WEB_CLICK_SCHEDULE"
		    Case ReportingColumn.TotalWebClickScheduleValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickScheduleValueInDollar
		      Return "TOTAL_WEB_CLICK_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementSchedule
		      Return "TOTAL_WEB_ENGAGEMENT_SCHEDULE"
		    Case ReportingColumn.TotalWebEngagementScheduleValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementScheduleValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewSchedule
		      Return "TOTAL_WEB_VIEW_SCHEDULE"
		    Case ReportingColumn.TotalWebViewScheduleValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewScheduleValueInDollar
		      Return "TOTAL_WEB_VIEW_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.InappScheduleCostPerAction
		      Return "INAPP_SCHEDULE_COST_PER_ACTION"
		    Case ReportingColumn.InappScheduleRoas
		      Return "INAPP_SCHEDULE_ROAS"
		    Case ReportingColumn.TotalInappSchedule
		      Return "TOTAL_INAPP_SCHEDULE"
		    Case ReportingColumn.TotalInappScheduleValueInMicroDollar
		      Return "TOTAL_INAPP_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappScheduleValueInDollar
		      Return "TOTAL_INAPP_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappClickSchedule
		      Return "TOTAL_INAPP_CLICK_SCHEDULE"
		    Case ReportingColumn.TotalInappClickScheduleValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappClickScheduleValueInDollar
		      Return "TOTAL_INAPP_CLICK_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementSchedule
		      Return "TOTAL_INAPP_ENGAGEMENT_SCHEDULE"
		    Case ReportingColumn.TotalInappEngagementScheduleValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementScheduleValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappViewSchedule
		      Return "TOTAL_INAPP_VIEW_SCHEDULE"
		    Case ReportingColumn.TotalInappViewScheduleValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappViewScheduleValueInDollar
		      Return "TOTAL_INAPP_VIEW_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.OfflineScheduleCostPerAction
		      Return "OFFLINE_SCHEDULE_COST_PER_ACTION"
		    Case ReportingColumn.OfflineScheduleRoas
		      Return "OFFLINE_SCHEDULE_ROAS"
		    Case ReportingColumn.TotalOfflineSchedule
		      Return "TOTAL_OFFLINE_SCHEDULE"
		    Case ReportingColumn.TotalOfflineScheduleValueInMicroDollar
		      Return "TOTAL_OFFLINE_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineScheduleValueInDollar
		      Return "TOTAL_OFFLINE_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickSchedule
		      Return "TOTAL_OFFLINE_CLICK_SCHEDULE"
		    Case ReportingColumn.TotalOfflineClickScheduleValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickScheduleValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementSchedule
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE"
		    Case ReportingColumn.TotalOfflineEngagementScheduleValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementScheduleValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewSchedule
		      Return "TOTAL_OFFLINE_VIEW_SCHEDULE"
		    Case ReportingColumn.TotalOfflineViewScheduleValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewScheduleValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_SCHEDULE_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalScheduleConversionProductCountUnique
		      Return "TOTAL_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebScheduleConversionProductCountUnique
		      Return "TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalInappScheduleConversionProductCountUnique
		      Return "TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalOfflineScheduleConversionProductCountUnique
		      Return "TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalScheduleConversionProductQuantity
		      Return "TOTAL_SCHEDULE_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalScheduleConversionProductValue
		      Return "TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalScheduleConversionProductValueInMicroUnits
		      Return "TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalScheduleConversionProductValueInUsd
		      Return "TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalScheduleConversionProductValueInMicroUsd
		      Return "TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebScheduleConversionProductQuantity
		      Return "TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebScheduleConversionProductValue
		      Return "TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebScheduleConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebScheduleConversionProductValueInUsd
		      Return "TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebScheduleConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalInappScheduleConversionProductQuantity
		      Return "TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalInappScheduleConversionProductValue
		      Return "TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalInappScheduleConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalInappScheduleConversionProductValueInUsd
		      Return "TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalInappScheduleConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalOfflineScheduleConversionProductQuantity
		      Return "TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalOfflineScheduleConversionProductValue
		      Return "TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalOfflineScheduleConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalOfflineScheduleConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalOfflineScheduleConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.EngagementFindLocation1
		      Return "ENGAGEMENT_FIND_LOCATION_1"
		    Case ReportingColumn.ClickFindLocation1
		      Return "CLICK_FIND_LOCATION_1"
		    Case ReportingColumn.ViewFindLocation1
		      Return "VIEW_FIND_LOCATION_1"
		    Case ReportingColumn.EngagementFindLocationValueInMicroDollar1
		      Return "ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickFindLocationValueInMicroDollar1
		      Return "CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewFindLocationValueInMicroDollar1
		      Return "VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementFindLocationQuantity1
		      Return "ENGAGEMENT_FIND_LOCATION_QUANTITY_1"
		    Case ReportingColumn.ClickFindLocationQuantity1
		      Return "CLICK_FIND_LOCATION_QUANTITY_1"
		    Case ReportingColumn.ViewFindLocationQuantity1
		      Return "VIEW_FIND_LOCATION_QUANTITY_1"
		    Case ReportingColumn.EngagementFindLocation2
		      Return "ENGAGEMENT_FIND_LOCATION_2"
		    Case ReportingColumn.ClickFindLocation2
		      Return "CLICK_FIND_LOCATION_2"
		    Case ReportingColumn.ViewFindLocation2
		      Return "VIEW_FIND_LOCATION_2"
		    Case ReportingColumn.EngagementFindLocationValueInMicroDollar2
		      Return "ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickFindLocationValueInMicroDollar2
		      Return "CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewFindLocationValueInMicroDollar2
		      Return "VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementFindLocationQuantity2
		      Return "ENGAGEMENT_FIND_LOCATION_QUANTITY_2"
		    Case ReportingColumn.ClickFindLocationQuantity2
		      Return "CLICK_FIND_LOCATION_QUANTITY_2"
		    Case ReportingColumn.ViewFindLocationQuantity2
		      Return "VIEW_FIND_LOCATION_QUANTITY_2"
		    Case ReportingColumn.TotalEngagementFindLocation
		      Return "TOTAL_ENGAGEMENT_FIND_LOCATION"
		    Case ReportingColumn.TotalClickFindLocation
		      Return "TOTAL_CLICK_FIND_LOCATION"
		    Case ReportingColumn.TotalViewFindLocation
		      Return "TOTAL_VIEW_FIND_LOCATION"
		    Case ReportingColumn.TotalEngagementFindLocationValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementFindLocationValueInDollar
		      Return "TOTAL_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickFindLocationValueInMicroDollar
		      Return "TOTAL_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickFindLocationValueInDollar
		      Return "TOTAL_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewFindLocationValueInMicroDollar
		      Return "TOTAL_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewFindLocationValueInDollar
		      Return "TOTAL_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementFindLocationQuantity
		      Return "TOTAL_ENGAGEMENT_FIND_LOCATION_QUANTITY"
		    Case ReportingColumn.TotalClickFindLocationQuantity
		      Return "TOTAL_CLICK_FIND_LOCATION_QUANTITY"
		    Case ReportingColumn.TotalViewFindLocationQuantity
		      Return "TOTAL_VIEW_FIND_LOCATION_QUANTITY"
		    Case ReportingColumn.TotalFindLocation
		      Return "TOTAL_FIND_LOCATION"
		    Case ReportingColumn.TotalFindLocationValueInMicroDollar
		      Return "TOTAL_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageFindLocationValueInMicroDollar
		      Return "AVERAGE_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageFindLocationValueInMicroUsDollar
		      Return "AVERAGE_FIND_LOCATION_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalFindLocationValueInMicroUsDollar
		      Return "TOTAL_FIND_LOCATION_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalFindLocationQuantity
		      Return "TOTAL_FIND_LOCATION_QUANTITY"
		    Case ReportingColumn.TotalFindLocationValueInDollar
		      Return "TOTAL_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.FindLocationCostPerAction
		      Return "FIND_LOCATION_COST_PER_ACTION"
		    Case ReportingColumn.FindLocationCostPerActionInUsDollar
		      Return "FIND_LOCATION_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.FindLocationRoas
		      Return "FIND_LOCATION_ROAS"
		    Case ReportingColumn.TotalFindLocationConversionRate
		      Return "TOTAL_FIND_LOCATION_CONVERSION_RATE"
		    Case ReportingColumn.WebFindLocationCostPerAction
		      Return "WEB_FIND_LOCATION_COST_PER_ACTION"
		    Case ReportingColumn.WebFindLocationRoas
		      Return "WEB_FIND_LOCATION_ROAS"
		    Case ReportingColumn.TotalWebFindLocation
		      Return "TOTAL_WEB_FIND_LOCATION"
		    Case ReportingColumn.TotalWebFindLocationValueInMicroDollar
		      Return "TOTAL_WEB_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebFindLocationValueInDollar
		      Return "TOTAL_WEB_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickFindLocation
		      Return "TOTAL_WEB_CLICK_FIND_LOCATION"
		    Case ReportingColumn.TotalWebClickFindLocationValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickFindLocationValueInDollar
		      Return "TOTAL_WEB_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementFindLocation
		      Return "TOTAL_WEB_ENGAGEMENT_FIND_LOCATION"
		    Case ReportingColumn.TotalWebEngagementFindLocationValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementFindLocationValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewFindLocation
		      Return "TOTAL_WEB_VIEW_FIND_LOCATION"
		    Case ReportingColumn.TotalWebViewFindLocationValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewFindLocationValueInDollar
		      Return "TOTAL_WEB_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.InappFindLocationCostPerAction
		      Return "INAPP_FIND_LOCATION_COST_PER_ACTION"
		    Case ReportingColumn.InappFindLocationRoas
		      Return "INAPP_FIND_LOCATION_ROAS"
		    Case ReportingColumn.TotalInappFindLocation
		      Return "TOTAL_INAPP_FIND_LOCATION"
		    Case ReportingColumn.TotalInappFindLocationValueInMicroDollar
		      Return "TOTAL_INAPP_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappFindLocationValueInDollar
		      Return "TOTAL_INAPP_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappClickFindLocation
		      Return "TOTAL_INAPP_CLICK_FIND_LOCATION"
		    Case ReportingColumn.TotalInappClickFindLocationValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappClickFindLocationValueInDollar
		      Return "TOTAL_INAPP_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementFindLocation
		      Return "TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION"
		    Case ReportingColumn.TotalInappEngagementFindLocationValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementFindLocationValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappViewFindLocation
		      Return "TOTAL_INAPP_VIEW_FIND_LOCATION"
		    Case ReportingColumn.TotalInappViewFindLocationValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappViewFindLocationValueInDollar
		      Return "TOTAL_INAPP_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.OfflineFindLocationCostPerAction
		      Return "OFFLINE_FIND_LOCATION_COST_PER_ACTION"
		    Case ReportingColumn.OfflineFindLocationRoas
		      Return "OFFLINE_FIND_LOCATION_ROAS"
		    Case ReportingColumn.TotalOfflineFindLocation
		      Return "TOTAL_OFFLINE_FIND_LOCATION"
		    Case ReportingColumn.TotalOfflineFindLocationValueInMicroDollar
		      Return "TOTAL_OFFLINE_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineFindLocationValueInDollar
		      Return "TOTAL_OFFLINE_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickFindLocation
		      Return "TOTAL_OFFLINE_CLICK_FIND_LOCATION"
		    Case ReportingColumn.TotalOfflineClickFindLocationValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickFindLocationValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementFindLocation
		      Return "TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION"
		    Case ReportingColumn.TotalOfflineEngagementFindLocationValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementFindLocationValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewFindLocation
		      Return "TOTAL_OFFLINE_VIEW_FIND_LOCATION"
		    Case ReportingColumn.TotalOfflineViewFindLocationValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewFindLocationValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalFindLocationConversionProductCountUnique
		      Return "TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebFindLocationConversionProductCountUnique
		      Return "TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalInappFindLocationConversionProductCountUnique
		      Return "TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalOfflineFindLocationConversionProductCountUnique
		      Return "TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalFindLocationConversionProductQuantity
		      Return "TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalFindLocationConversionProductValue
		      Return "TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalFindLocationConversionProductValueInMicroUnits
		      Return "TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalFindLocationConversionProductValueInUsd
		      Return "TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalFindLocationConversionProductValueInMicroUsd
		      Return "TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebFindLocationConversionProductQuantity
		      Return "TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebFindLocationConversionProductValue
		      Return "TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebFindLocationConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebFindLocationConversionProductValueInUsd
		      Return "TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebFindLocationConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalInappFindLocationConversionProductQuantity
		      Return "TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalInappFindLocationConversionProductValue
		      Return "TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalInappFindLocationConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalInappFindLocationConversionProductValueInUsd
		      Return "TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalInappFindLocationConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalOfflineFindLocationConversionProductQuantity
		      Return "TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalOfflineFindLocationConversionProductValue
		      Return "TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalOfflineFindLocationConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalOfflineFindLocationConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalOfflineFindLocationConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.EngagementCustomizeProduct1
		      Return "ENGAGEMENT_CUSTOMIZE_PRODUCT_1"
		    Case ReportingColumn.ClickCustomizeProduct1
		      Return "CLICK_CUSTOMIZE_PRODUCT_1"
		    Case ReportingColumn.ViewCustomizeProduct1
		      Return "VIEW_CUSTOMIZE_PRODUCT_1"
		    Case ReportingColumn.EngagementCustomizeProductValueInMicroDollar1
		      Return "ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickCustomizeProductValueInMicroDollar1
		      Return "CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewCustomizeProductValueInMicroDollar1
		      Return "VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementCustomizeProductQuantity1
		      Return "ENGAGEMENT_CUSTOMIZE_PRODUCT_QUANTITY_1"
		    Case ReportingColumn.ClickCustomizeProductQuantity1
		      Return "CLICK_CUSTOMIZE_PRODUCT_QUANTITY_1"
		    Case ReportingColumn.ViewCustomizeProductQuantity1
		      Return "VIEW_CUSTOMIZE_PRODUCT_QUANTITY_1"
		    Case ReportingColumn.EngagementCustomizeProduct2
		      Return "ENGAGEMENT_CUSTOMIZE_PRODUCT_2"
		    Case ReportingColumn.ClickCustomizeProduct2
		      Return "CLICK_CUSTOMIZE_PRODUCT_2"
		    Case ReportingColumn.ViewCustomizeProduct2
		      Return "VIEW_CUSTOMIZE_PRODUCT_2"
		    Case ReportingColumn.EngagementCustomizeProductValueInMicroDollar2
		      Return "ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickCustomizeProductValueInMicroDollar2
		      Return "CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewCustomizeProductValueInMicroDollar2
		      Return "VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementCustomizeProductQuantity2
		      Return "ENGAGEMENT_CUSTOMIZE_PRODUCT_QUANTITY_2"
		    Case ReportingColumn.ClickCustomizeProductQuantity2
		      Return "CLICK_CUSTOMIZE_PRODUCT_QUANTITY_2"
		    Case ReportingColumn.ViewCustomizeProductQuantity2
		      Return "VIEW_CUSTOMIZE_PRODUCT_QUANTITY_2"
		    Case ReportingColumn.TotalEngagementCustomizeProduct
		      Return "TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT"
		    Case ReportingColumn.TotalClickCustomizeProduct
		      Return "TOTAL_CLICK_CUSTOMIZE_PRODUCT"
		    Case ReportingColumn.TotalViewCustomizeProduct
		      Return "TOTAL_VIEW_CUSTOMIZE_PRODUCT"
		    Case ReportingColumn.TotalEngagementCustomizeProductValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementCustomizeProductValueInDollar
		      Return "TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickCustomizeProductValueInMicroDollar
		      Return "TOTAL_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickCustomizeProductValueInDollar
		      Return "TOTAL_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewCustomizeProductValueInMicroDollar
		      Return "TOTAL_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewCustomizeProductValueInDollar
		      Return "TOTAL_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementCustomizeProductQuantity
		      Return "TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalClickCustomizeProductQuantity
		      Return "TOTAL_CLICK_CUSTOMIZE_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalViewCustomizeProductQuantity
		      Return "TOTAL_VIEW_CUSTOMIZE_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalCustomizeProduct
		      Return "TOTAL_CUSTOMIZE_PRODUCT"
		    Case ReportingColumn.TotalCustomizeProductValueInMicroDollar
		      Return "TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageCustomizeProductValueInMicroDollar
		      Return "AVERAGE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageCustomizeProductValueInMicroUsDollar
		      Return "AVERAGE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalCustomizeProductValueInMicroUsDollar
		      Return "TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalCustomizeProductQuantity
		      Return "TOTAL_CUSTOMIZE_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalCustomizeProductValueInDollar
		      Return "TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.CustomizeProductCostPerAction
		      Return "CUSTOMIZE_PRODUCT_COST_PER_ACTION"
		    Case ReportingColumn.CustomizeProductCostPerActionInUsDollar
		      Return "CUSTOMIZE_PRODUCT_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.CustomizeProductRoas
		      Return "CUSTOMIZE_PRODUCT_ROAS"
		    Case ReportingColumn.TotalCustomizeProductConversionRate
		      Return "TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_RATE"
		    Case ReportingColumn.WebCustomizeProductCostPerAction
		      Return "WEB_CUSTOMIZE_PRODUCT_COST_PER_ACTION"
		    Case ReportingColumn.WebCustomizeProductRoas
		      Return "WEB_CUSTOMIZE_PRODUCT_ROAS"
		    Case ReportingColumn.TotalWebCustomizeProduct
		      Return "TOTAL_WEB_CUSTOMIZE_PRODUCT"
		    Case ReportingColumn.TotalWebCustomizeProductValueInMicroDollar
		      Return "TOTAL_WEB_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebCustomizeProductValueInDollar
		      Return "TOTAL_WEB_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickCustomizeProduct
		      Return "TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT"
		    Case ReportingColumn.TotalWebClickCustomizeProductValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickCustomizeProductValueInDollar
		      Return "TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementCustomizeProduct
		      Return "TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT"
		    Case ReportingColumn.TotalWebEngagementCustomizeProductValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementCustomizeProductValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewCustomizeProduct
		      Return "TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT"
		    Case ReportingColumn.TotalWebViewCustomizeProductValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewCustomizeProductValueInDollar
		      Return "TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.InappCustomizeProductCostPerAction
		      Return "INAPP_CUSTOMIZE_PRODUCT_COST_PER_ACTION"
		    Case ReportingColumn.InappCustomizeProductRoas
		      Return "INAPP_CUSTOMIZE_PRODUCT_ROAS"
		    Case ReportingColumn.TotalInappCustomizeProduct
		      Return "TOTAL_INAPP_CUSTOMIZE_PRODUCT"
		    Case ReportingColumn.TotalInappCustomizeProductValueInMicroDollar
		      Return "TOTAL_INAPP_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappCustomizeProductValueInDollar
		      Return "TOTAL_INAPP_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappClickCustomizeProduct
		      Return "TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT"
		    Case ReportingColumn.TotalInappClickCustomizeProductValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappClickCustomizeProductValueInDollar
		      Return "TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementCustomizeProduct
		      Return "TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT"
		    Case ReportingColumn.TotalInappEngagementCustomizeProductValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementCustomizeProductValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappViewCustomizeProduct
		      Return "TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT"
		    Case ReportingColumn.TotalInappViewCustomizeProductValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappViewCustomizeProductValueInDollar
		      Return "TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.OfflineCustomizeProductCostPerAction
		      Return "OFFLINE_CUSTOMIZE_PRODUCT_COST_PER_ACTION"
		    Case ReportingColumn.OfflineCustomizeProductRoas
		      Return "OFFLINE_CUSTOMIZE_PRODUCT_ROAS"
		    Case ReportingColumn.TotalOfflineCustomizeProduct
		      Return "TOTAL_OFFLINE_CUSTOMIZE_PRODUCT"
		    Case ReportingColumn.TotalOfflineCustomizeProductValueInMicroDollar
		      Return "TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineCustomizeProductValueInDollar
		      Return "TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickCustomizeProduct
		      Return "TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT"
		    Case ReportingColumn.TotalOfflineClickCustomizeProductValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickCustomizeProductValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementCustomizeProduct
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT"
		    Case ReportingColumn.TotalOfflineEngagementCustomizeProductValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementCustomizeProductValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewCustomizeProduct
		      Return "TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT"
		    Case ReportingColumn.TotalOfflineViewCustomizeProductValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewCustomizeProductValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalCustomizeProductConversionProductCountUnique
		      Return "TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebCustomizeProductConversionProductCountUnique
		      Return "TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalInappCustomizeProductConversionProductCountUnique
		      Return "TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalOfflineCustomizeProductConversionProductCountUnique
		      Return "TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalCustomizeProductConversionProductQuantity
		      Return "TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalCustomizeProductConversionProductValue
		      Return "TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalCustomizeProductConversionProductValueInMicroUnits
		      Return "TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalCustomizeProductConversionProductValueInUsd
		      Return "TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalCustomizeProductConversionProductValueInMicroUsd
		      Return "TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebCustomizeProductConversionProductQuantity
		      Return "TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebCustomizeProductConversionProductValue
		      Return "TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebCustomizeProductConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebCustomizeProductConversionProductValueInUsd
		      Return "TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebCustomizeProductConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalInappCustomizeProductConversionProductQuantity
		      Return "TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalInappCustomizeProductConversionProductValue
		      Return "TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalInappCustomizeProductConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalInappCustomizeProductConversionProductValueInUsd
		      Return "TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalInappCustomizeProductConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalOfflineCustomizeProductConversionProductQuantity
		      Return "TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalOfflineCustomizeProductConversionProductValue
		      Return "TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalOfflineCustomizeProductConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalOfflineCustomizeProductConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalOfflineCustomizeProductConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.EngagementSubmitApplication1
		      Return "ENGAGEMENT_SUBMIT_APPLICATION_1"
		    Case ReportingColumn.ClickSubmitApplication1
		      Return "CLICK_SUBMIT_APPLICATION_1"
		    Case ReportingColumn.ViewSubmitApplication1
		      Return "VIEW_SUBMIT_APPLICATION_1"
		    Case ReportingColumn.EngagementSubmitApplicationValueInMicroDollar1
		      Return "ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickSubmitApplicationValueInMicroDollar1
		      Return "CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewSubmitApplicationValueInMicroDollar1
		      Return "VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementSubmitApplicationQuantity1
		      Return "ENGAGEMENT_SUBMIT_APPLICATION_QUANTITY_1"
		    Case ReportingColumn.ClickSubmitApplicationQuantity1
		      Return "CLICK_SUBMIT_APPLICATION_QUANTITY_1"
		    Case ReportingColumn.ViewSubmitApplicationQuantity1
		      Return "VIEW_SUBMIT_APPLICATION_QUANTITY_1"
		    Case ReportingColumn.EngagementSubmitApplication2
		      Return "ENGAGEMENT_SUBMIT_APPLICATION_2"
		    Case ReportingColumn.ClickSubmitApplication2
		      Return "CLICK_SUBMIT_APPLICATION_2"
		    Case ReportingColumn.ViewSubmitApplication2
		      Return "VIEW_SUBMIT_APPLICATION_2"
		    Case ReportingColumn.EngagementSubmitApplicationValueInMicroDollar2
		      Return "ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickSubmitApplicationValueInMicroDollar2
		      Return "CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewSubmitApplicationValueInMicroDollar2
		      Return "VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementSubmitApplicationQuantity2
		      Return "ENGAGEMENT_SUBMIT_APPLICATION_QUANTITY_2"
		    Case ReportingColumn.ClickSubmitApplicationQuantity2
		      Return "CLICK_SUBMIT_APPLICATION_QUANTITY_2"
		    Case ReportingColumn.ViewSubmitApplicationQuantity2
		      Return "VIEW_SUBMIT_APPLICATION_QUANTITY_2"
		    Case ReportingColumn.TotalEngagementSubmitApplication
		      Return "TOTAL_ENGAGEMENT_SUBMIT_APPLICATION"
		    Case ReportingColumn.TotalClickSubmitApplication
		      Return "TOTAL_CLICK_SUBMIT_APPLICATION"
		    Case ReportingColumn.TotalViewSubmitApplication
		      Return "TOTAL_VIEW_SUBMIT_APPLICATION"
		    Case ReportingColumn.TotalEngagementSubmitApplicationValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementSubmitApplicationValueInDollar
		      Return "TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickSubmitApplicationValueInMicroDollar
		      Return "TOTAL_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickSubmitApplicationValueInDollar
		      Return "TOTAL_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewSubmitApplicationValueInMicroDollar
		      Return "TOTAL_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewSubmitApplicationValueInDollar
		      Return "TOTAL_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementSubmitApplicationQuantity
		      Return "TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_QUANTITY"
		    Case ReportingColumn.TotalClickSubmitApplicationQuantity
		      Return "TOTAL_CLICK_SUBMIT_APPLICATION_QUANTITY"
		    Case ReportingColumn.TotalViewSubmitApplicationQuantity
		      Return "TOTAL_VIEW_SUBMIT_APPLICATION_QUANTITY"
		    Case ReportingColumn.TotalSubmitApplication
		      Return "TOTAL_SUBMIT_APPLICATION"
		    Case ReportingColumn.TotalSubmitApplicationValueInMicroDollar
		      Return "TOTAL_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageSubmitApplicationValueInMicroDollar
		      Return "AVERAGE_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageSubmitApplicationValueInMicroUsDollar
		      Return "AVERAGE_SUBMIT_APPLICATION_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalSubmitApplicationValueInMicroUsDollar
		      Return "TOTAL_SUBMIT_APPLICATION_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalSubmitApplicationQuantity
		      Return "TOTAL_SUBMIT_APPLICATION_QUANTITY"
		    Case ReportingColumn.TotalSubmitApplicationValueInDollar
		      Return "TOTAL_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.SubmitApplicationCostPerAction
		      Return "SUBMIT_APPLICATION_COST_PER_ACTION"
		    Case ReportingColumn.SubmitApplicationCostPerActionInUsDollar
		      Return "SUBMIT_APPLICATION_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.SubmitApplicationRoas
		      Return "SUBMIT_APPLICATION_ROAS"
		    Case ReportingColumn.TotalSubmitApplicationConversionRate
		      Return "TOTAL_SUBMIT_APPLICATION_CONVERSION_RATE"
		    Case ReportingColumn.WebSubmitApplicationCostPerAction
		      Return "WEB_SUBMIT_APPLICATION_COST_PER_ACTION"
		    Case ReportingColumn.WebSubmitApplicationRoas
		      Return "WEB_SUBMIT_APPLICATION_ROAS"
		    Case ReportingColumn.TotalWebSubmitApplication
		      Return "TOTAL_WEB_SUBMIT_APPLICATION"
		    Case ReportingColumn.TotalWebSubmitApplicationValueInMicroDollar
		      Return "TOTAL_WEB_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebSubmitApplicationValueInDollar
		      Return "TOTAL_WEB_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickSubmitApplication
		      Return "TOTAL_WEB_CLICK_SUBMIT_APPLICATION"
		    Case ReportingColumn.TotalWebClickSubmitApplicationValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickSubmitApplicationValueInDollar
		      Return "TOTAL_WEB_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementSubmitApplication
		      Return "TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION"
		    Case ReportingColumn.TotalWebEngagementSubmitApplicationValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementSubmitApplicationValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewSubmitApplication
		      Return "TOTAL_WEB_VIEW_SUBMIT_APPLICATION"
		    Case ReportingColumn.TotalWebViewSubmitApplicationValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewSubmitApplicationValueInDollar
		      Return "TOTAL_WEB_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.InappSubmitApplicationCostPerAction
		      Return "INAPP_SUBMIT_APPLICATION_COST_PER_ACTION"
		    Case ReportingColumn.InappSubmitApplicationRoas
		      Return "INAPP_SUBMIT_APPLICATION_ROAS"
		    Case ReportingColumn.TotalInappSubmitApplication
		      Return "TOTAL_INAPP_SUBMIT_APPLICATION"
		    Case ReportingColumn.TotalInappSubmitApplicationValueInMicroDollar
		      Return "TOTAL_INAPP_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappSubmitApplicationValueInDollar
		      Return "TOTAL_INAPP_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappClickSubmitApplication
		      Return "TOTAL_INAPP_CLICK_SUBMIT_APPLICATION"
		    Case ReportingColumn.TotalInappClickSubmitApplicationValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappClickSubmitApplicationValueInDollar
		      Return "TOTAL_INAPP_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementSubmitApplication
		      Return "TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION"
		    Case ReportingColumn.TotalInappEngagementSubmitApplicationValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementSubmitApplicationValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappViewSubmitApplication
		      Return "TOTAL_INAPP_VIEW_SUBMIT_APPLICATION"
		    Case ReportingColumn.TotalInappViewSubmitApplicationValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappViewSubmitApplicationValueInDollar
		      Return "TOTAL_INAPP_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.OfflineSubmitApplicationCostPerAction
		      Return "OFFLINE_SUBMIT_APPLICATION_COST_PER_ACTION"
		    Case ReportingColumn.OfflineSubmitApplicationRoas
		      Return "OFFLINE_SUBMIT_APPLICATION_ROAS"
		    Case ReportingColumn.TotalOfflineSubmitApplication
		      Return "TOTAL_OFFLINE_SUBMIT_APPLICATION"
		    Case ReportingColumn.TotalOfflineSubmitApplicationValueInMicroDollar
		      Return "TOTAL_OFFLINE_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineSubmitApplicationValueInDollar
		      Return "TOTAL_OFFLINE_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickSubmitApplication
		      Return "TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION"
		    Case ReportingColumn.TotalOfflineClickSubmitApplicationValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickSubmitApplicationValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementSubmitApplication
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION"
		    Case ReportingColumn.TotalOfflineEngagementSubmitApplicationValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementSubmitApplicationValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewSubmitApplication
		      Return "TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION"
		    Case ReportingColumn.TotalOfflineViewSubmitApplicationValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewSubmitApplicationValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalSubmitApplicationConversionProductCountUnique
		      Return "TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebSubmitApplicationConversionProductCountUnique
		      Return "TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalInappSubmitApplicationConversionProductCountUnique
		      Return "TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalOfflineSubmitApplicationConversionProductCountUnique
		      Return "TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalSubmitApplicationConversionProductQuantity
		      Return "TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalSubmitApplicationConversionProductValue
		      Return "TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalSubmitApplicationConversionProductValueInMicroUnits
		      Return "TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalSubmitApplicationConversionProductValueInUsd
		      Return "TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalSubmitApplicationConversionProductValueInMicroUsd
		      Return "TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebSubmitApplicationConversionProductQuantity
		      Return "TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebSubmitApplicationConversionProductValue
		      Return "TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebSubmitApplicationConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebSubmitApplicationConversionProductValueInUsd
		      Return "TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebSubmitApplicationConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalInappSubmitApplicationConversionProductQuantity
		      Return "TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalInappSubmitApplicationConversionProductValue
		      Return "TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalInappSubmitApplicationConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalInappSubmitApplicationConversionProductValueInUsd
		      Return "TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalInappSubmitApplicationConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalOfflineSubmitApplicationConversionProductQuantity
		      Return "TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalOfflineSubmitApplicationConversionProductValue
		      Return "TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalOfflineSubmitApplicationConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalOfflineSubmitApplicationConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalOfflineSubmitApplicationConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.EngagementStartTrial1
		      Return "ENGAGEMENT_START_TRIAL_1"
		    Case ReportingColumn.ClickStartTrial1
		      Return "CLICK_START_TRIAL_1"
		    Case ReportingColumn.ViewStartTrial1
		      Return "VIEW_START_TRIAL_1"
		    Case ReportingColumn.EngagementStartTrialValueInMicroDollar1
		      Return "ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickStartTrialValueInMicroDollar1
		      Return "CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewStartTrialValueInMicroDollar1
		      Return "VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementStartTrialQuantity1
		      Return "ENGAGEMENT_START_TRIAL_QUANTITY_1"
		    Case ReportingColumn.ClickStartTrialQuantity1
		      Return "CLICK_START_TRIAL_QUANTITY_1"
		    Case ReportingColumn.ViewStartTrialQuantity1
		      Return "VIEW_START_TRIAL_QUANTITY_1"
		    Case ReportingColumn.EngagementStartTrial2
		      Return "ENGAGEMENT_START_TRIAL_2"
		    Case ReportingColumn.ClickStartTrial2
		      Return "CLICK_START_TRIAL_2"
		    Case ReportingColumn.ViewStartTrial2
		      Return "VIEW_START_TRIAL_2"
		    Case ReportingColumn.EngagementStartTrialValueInMicroDollar2
		      Return "ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickStartTrialValueInMicroDollar2
		      Return "CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewStartTrialValueInMicroDollar2
		      Return "VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementStartTrialQuantity2
		      Return "ENGAGEMENT_START_TRIAL_QUANTITY_2"
		    Case ReportingColumn.ClickStartTrialQuantity2
		      Return "CLICK_START_TRIAL_QUANTITY_2"
		    Case ReportingColumn.ViewStartTrialQuantity2
		      Return "VIEW_START_TRIAL_QUANTITY_2"
		    Case ReportingColumn.TotalEngagementStartTrial
		      Return "TOTAL_ENGAGEMENT_START_TRIAL"
		    Case ReportingColumn.TotalClickStartTrial
		      Return "TOTAL_CLICK_START_TRIAL"
		    Case ReportingColumn.TotalViewStartTrial
		      Return "TOTAL_VIEW_START_TRIAL"
		    Case ReportingColumn.TotalEngagementStartTrialValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementStartTrialValueInDollar
		      Return "TOTAL_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickStartTrialValueInMicroDollar
		      Return "TOTAL_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickStartTrialValueInDollar
		      Return "TOTAL_CLICK_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewStartTrialValueInMicroDollar
		      Return "TOTAL_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewStartTrialValueInDollar
		      Return "TOTAL_VIEW_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementStartTrialQuantity
		      Return "TOTAL_ENGAGEMENT_START_TRIAL_QUANTITY"
		    Case ReportingColumn.TotalClickStartTrialQuantity
		      Return "TOTAL_CLICK_START_TRIAL_QUANTITY"
		    Case ReportingColumn.TotalViewStartTrialQuantity
		      Return "TOTAL_VIEW_START_TRIAL_QUANTITY"
		    Case ReportingColumn.TotalStartTrial
		      Return "TOTAL_START_TRIAL"
		    Case ReportingColumn.TotalStartTrialValueInMicroDollar
		      Return "TOTAL_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageStartTrialValueInMicroDollar
		      Return "AVERAGE_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageStartTrialValueInMicroUsDollar
		      Return "AVERAGE_START_TRIAL_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalStartTrialValueInMicroUsDollar
		      Return "TOTAL_START_TRIAL_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalStartTrialQuantity
		      Return "TOTAL_START_TRIAL_QUANTITY"
		    Case ReportingColumn.TotalStartTrialValueInDollar
		      Return "TOTAL_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.StartTrialCostPerAction
		      Return "START_TRIAL_COST_PER_ACTION"
		    Case ReportingColumn.StartTrialCostPerActionInUsDollar
		      Return "START_TRIAL_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.StartTrialRoas
		      Return "START_TRIAL_ROAS"
		    Case ReportingColumn.TotalStartTrialConversionRate
		      Return "TOTAL_START_TRIAL_CONVERSION_RATE"
		    Case ReportingColumn.WebStartTrialCostPerAction
		      Return "WEB_START_TRIAL_COST_PER_ACTION"
		    Case ReportingColumn.WebStartTrialRoas
		      Return "WEB_START_TRIAL_ROAS"
		    Case ReportingColumn.TotalWebStartTrial
		      Return "TOTAL_WEB_START_TRIAL"
		    Case ReportingColumn.TotalWebStartTrialValueInMicroDollar
		      Return "TOTAL_WEB_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebStartTrialValueInDollar
		      Return "TOTAL_WEB_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickStartTrial
		      Return "TOTAL_WEB_CLICK_START_TRIAL"
		    Case ReportingColumn.TotalWebClickStartTrialValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickStartTrialValueInDollar
		      Return "TOTAL_WEB_CLICK_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementStartTrial
		      Return "TOTAL_WEB_ENGAGEMENT_START_TRIAL"
		    Case ReportingColumn.TotalWebEngagementStartTrialValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementStartTrialValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewStartTrial
		      Return "TOTAL_WEB_VIEW_START_TRIAL"
		    Case ReportingColumn.TotalWebViewStartTrialValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewStartTrialValueInDollar
		      Return "TOTAL_WEB_VIEW_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.InappStartTrialCostPerAction
		      Return "INAPP_START_TRIAL_COST_PER_ACTION"
		    Case ReportingColumn.InappStartTrialRoas
		      Return "INAPP_START_TRIAL_ROAS"
		    Case ReportingColumn.TotalInappStartTrial
		      Return "TOTAL_INAPP_START_TRIAL"
		    Case ReportingColumn.TotalInappStartTrialValueInMicroDollar
		      Return "TOTAL_INAPP_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappStartTrialValueInDollar
		      Return "TOTAL_INAPP_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappClickStartTrial
		      Return "TOTAL_INAPP_CLICK_START_TRIAL"
		    Case ReportingColumn.TotalInappClickStartTrialValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappClickStartTrialValueInDollar
		      Return "TOTAL_INAPP_CLICK_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementStartTrial
		      Return "TOTAL_INAPP_ENGAGEMENT_START_TRIAL"
		    Case ReportingColumn.TotalInappEngagementStartTrialValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementStartTrialValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappViewStartTrial
		      Return "TOTAL_INAPP_VIEW_START_TRIAL"
		    Case ReportingColumn.TotalInappViewStartTrialValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappViewStartTrialValueInDollar
		      Return "TOTAL_INAPP_VIEW_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.OfflineStartTrialCostPerAction
		      Return "OFFLINE_START_TRIAL_COST_PER_ACTION"
		    Case ReportingColumn.OfflineStartTrialRoas
		      Return "OFFLINE_START_TRIAL_ROAS"
		    Case ReportingColumn.TotalOfflineStartTrial
		      Return "TOTAL_OFFLINE_START_TRIAL"
		    Case ReportingColumn.TotalOfflineStartTrialValueInMicroDollar
		      Return "TOTAL_OFFLINE_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineStartTrialValueInDollar
		      Return "TOTAL_OFFLINE_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickStartTrial
		      Return "TOTAL_OFFLINE_CLICK_START_TRIAL"
		    Case ReportingColumn.TotalOfflineClickStartTrialValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickStartTrialValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementStartTrial
		      Return "TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL"
		    Case ReportingColumn.TotalOfflineEngagementStartTrialValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementStartTrialValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewStartTrial
		      Return "TOTAL_OFFLINE_VIEW_START_TRIAL"
		    Case ReportingColumn.TotalOfflineViewStartTrialValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewStartTrialValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_START_TRIAL_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalStartTrialConversionProductCountUnique
		      Return "TOTAL_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebStartTrialConversionProductCountUnique
		      Return "TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalInappStartTrialConversionProductCountUnique
		      Return "TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalOfflineStartTrialConversionProductCountUnique
		      Return "TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalStartTrialConversionProductQuantity
		      Return "TOTAL_START_TRIAL_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalStartTrialConversionProductValue
		      Return "TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalStartTrialConversionProductValueInMicroUnits
		      Return "TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalStartTrialConversionProductValueInUsd
		      Return "TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalStartTrialConversionProductValueInMicroUsd
		      Return "TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebStartTrialConversionProductQuantity
		      Return "TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebStartTrialConversionProductValue
		      Return "TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebStartTrialConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebStartTrialConversionProductValueInUsd
		      Return "TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebStartTrialConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalInappStartTrialConversionProductQuantity
		      Return "TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalInappStartTrialConversionProductValue
		      Return "TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalInappStartTrialConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalInappStartTrialConversionProductValueInUsd
		      Return "TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalInappStartTrialConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalOfflineStartTrialConversionProductQuantity
		      Return "TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalOfflineStartTrialConversionProductValue
		      Return "TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalOfflineStartTrialConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalOfflineStartTrialConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalOfflineStartTrialConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.EngagementAppOpen1
		      Return "ENGAGEMENT_APP_OPEN_1"
		    Case ReportingColumn.ClickAppOpen1
		      Return "CLICK_APP_OPEN_1"
		    Case ReportingColumn.ViewAppOpen1
		      Return "VIEW_APP_OPEN_1"
		    Case ReportingColumn.EngagementAppOpenValueInMicroDollar1
		      Return "ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ClickAppOpenValueInMicroDollar1
		      Return "CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.ViewAppOpenValueInMicroDollar1
		      Return "VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR_1"
		    Case ReportingColumn.EngagementAppOpenQuantity1
		      Return "ENGAGEMENT_APP_OPEN_QUANTITY_1"
		    Case ReportingColumn.ClickAppOpenQuantity1
		      Return "CLICK_APP_OPEN_QUANTITY_1"
		    Case ReportingColumn.ViewAppOpenQuantity1
		      Return "VIEW_APP_OPEN_QUANTITY_1"
		    Case ReportingColumn.EngagementAppOpen2
		      Return "ENGAGEMENT_APP_OPEN_2"
		    Case ReportingColumn.ClickAppOpen2
		      Return "CLICK_APP_OPEN_2"
		    Case ReportingColumn.ViewAppOpen2
		      Return "VIEW_APP_OPEN_2"
		    Case ReportingColumn.EngagementAppOpenValueInMicroDollar2
		      Return "ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ClickAppOpenValueInMicroDollar2
		      Return "CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.ViewAppOpenValueInMicroDollar2
		      Return "VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR_2"
		    Case ReportingColumn.EngagementAppOpenQuantity2
		      Return "ENGAGEMENT_APP_OPEN_QUANTITY_2"
		    Case ReportingColumn.ClickAppOpenQuantity2
		      Return "CLICK_APP_OPEN_QUANTITY_2"
		    Case ReportingColumn.ViewAppOpenQuantity2
		      Return "VIEW_APP_OPEN_QUANTITY_2"
		    Case ReportingColumn.TotalEngagementAppOpen
		      Return "TOTAL_ENGAGEMENT_APP_OPEN"
		    Case ReportingColumn.TotalClickAppOpen
		      Return "TOTAL_CLICK_APP_OPEN"
		    Case ReportingColumn.TotalViewAppOpen
		      Return "TOTAL_VIEW_APP_OPEN"
		    Case ReportingColumn.TotalEngagementAppOpenValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalEngagementAppOpenValueInDollar
		      Return "TOTAL_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalClickAppOpenValueInMicroDollar
		      Return "TOTAL_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalClickAppOpenValueInDollar
		      Return "TOTAL_CLICK_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalViewAppOpenValueInMicroDollar
		      Return "TOTAL_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalViewAppOpenValueInDollar
		      Return "TOTAL_VIEW_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalEngagementAppOpenQuantity
		      Return "TOTAL_ENGAGEMENT_APP_OPEN_QUANTITY"
		    Case ReportingColumn.TotalClickAppOpenQuantity
		      Return "TOTAL_CLICK_APP_OPEN_QUANTITY"
		    Case ReportingColumn.TotalViewAppOpenQuantity
		      Return "TOTAL_VIEW_APP_OPEN_QUANTITY"
		    Case ReportingColumn.TotalAppOpen
		      Return "TOTAL_APP_OPEN"
		    Case ReportingColumn.TotalAppOpenValueInMicroDollar
		      Return "TOTAL_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageAppOpenValueInMicroDollar
		      Return "AVERAGE_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.AverageAppOpenValueInMicroUsDollar
		      Return "AVERAGE_APP_OPEN_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalAppOpenValueInMicroUsDollar
		      Return "TOTAL_APP_OPEN_VALUE_IN_MICRO_US_DOLLAR"
		    Case ReportingColumn.TotalAppOpenQuantity
		      Return "TOTAL_APP_OPEN_QUANTITY"
		    Case ReportingColumn.TotalAppOpenValueInDollar
		      Return "TOTAL_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.AppOpenCostPerAction
		      Return "APP_OPEN_COST_PER_ACTION"
		    Case ReportingColumn.AppOpenCostPerActionInUsDollar
		      Return "APP_OPEN_COST_PER_ACTION_IN_US_DOLLAR"
		    Case ReportingColumn.AppOpenRoas
		      Return "APP_OPEN_ROAS"
		    Case ReportingColumn.TotalAppOpenConversionRate
		      Return "TOTAL_APP_OPEN_CONVERSION_RATE"
		    Case ReportingColumn.WebAppOpenCostPerAction
		      Return "WEB_APP_OPEN_COST_PER_ACTION"
		    Case ReportingColumn.WebAppOpenRoas
		      Return "WEB_APP_OPEN_ROAS"
		    Case ReportingColumn.TotalWebAppOpen
		      Return "TOTAL_WEB_APP_OPEN"
		    Case ReportingColumn.TotalWebAppOpenValueInMicroDollar
		      Return "TOTAL_WEB_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebAppOpenValueInDollar
		      Return "TOTAL_WEB_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebClickAppOpen
		      Return "TOTAL_WEB_CLICK_APP_OPEN"
		    Case ReportingColumn.TotalWebClickAppOpenValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebClickAppOpenValueInDollar
		      Return "TOTAL_WEB_CLICK_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementAppOpen
		      Return "TOTAL_WEB_ENGAGEMENT_APP_OPEN"
		    Case ReportingColumn.TotalWebEngagementAppOpenValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebEngagementAppOpenValueInDollar
		      Return "TOTAL_WEB_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalWebViewAppOpen
		      Return "TOTAL_WEB_VIEW_APP_OPEN"
		    Case ReportingColumn.TotalWebViewAppOpenValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalWebViewAppOpenValueInDollar
		      Return "TOTAL_WEB_VIEW_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.InappAppOpenCostPerAction
		      Return "INAPP_APP_OPEN_COST_PER_ACTION"
		    Case ReportingColumn.InappAppOpenRoas
		      Return "INAPP_APP_OPEN_ROAS"
		    Case ReportingColumn.TotalInappAppOpen
		      Return "TOTAL_INAPP_APP_OPEN"
		    Case ReportingColumn.TotalInappAppOpenValueInMicroDollar
		      Return "TOTAL_INAPP_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappAppOpenValueInDollar
		      Return "TOTAL_INAPP_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappClickAppOpen
		      Return "TOTAL_INAPP_CLICK_APP_OPEN"
		    Case ReportingColumn.TotalInappClickAppOpenValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappClickAppOpenValueInDollar
		      Return "TOTAL_INAPP_CLICK_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementAppOpen
		      Return "TOTAL_INAPP_ENGAGEMENT_APP_OPEN"
		    Case ReportingColumn.TotalInappEngagementAppOpenValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappEngagementAppOpenValueInDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalInappViewAppOpen
		      Return "TOTAL_INAPP_VIEW_APP_OPEN"
		    Case ReportingColumn.TotalInappViewAppOpenValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalInappViewAppOpenValueInDollar
		      Return "TOTAL_INAPP_VIEW_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.OfflineAppOpenCostPerAction
		      Return "OFFLINE_APP_OPEN_COST_PER_ACTION"
		    Case ReportingColumn.OfflineAppOpenRoas
		      Return "OFFLINE_APP_OPEN_ROAS"
		    Case ReportingColumn.TotalOfflineAppOpen
		      Return "TOTAL_OFFLINE_APP_OPEN"
		    Case ReportingColumn.TotalOfflineAppOpenValueInMicroDollar
		      Return "TOTAL_OFFLINE_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineAppOpenValueInDollar
		      Return "TOTAL_OFFLINE_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickAppOpen
		      Return "TOTAL_OFFLINE_CLICK_APP_OPEN"
		    Case ReportingColumn.TotalOfflineClickAppOpenValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineClickAppOpenValueInDollar
		      Return "TOTAL_OFFLINE_CLICK_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementAppOpen
		      Return "TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN"
		    Case ReportingColumn.TotalOfflineEngagementAppOpenValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineEngagementAppOpenValueInDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewAppOpen
		      Return "TOTAL_OFFLINE_VIEW_APP_OPEN"
		    Case ReportingColumn.TotalOfflineViewAppOpenValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumn.TotalOfflineViewAppOpenValueInDollar
		      Return "TOTAL_OFFLINE_VIEW_APP_OPEN_VALUE_IN_DOLLAR"
		    Case ReportingColumn.TotalAppOpenConversionProductCountUnique
		      Return "TOTAL_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalWebAppOpenConversionProductCountUnique
		      Return "TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalInappAppOpenConversionProductCountUnique
		      Return "TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalOfflineAppOpenConversionProductCountUnique
		      Return "TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE"
		    Case ReportingColumn.TotalAppOpenConversionProductQuantity
		      Return "TOTAL_APP_OPEN_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalAppOpenConversionProductValue
		      Return "TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalAppOpenConversionProductValueInMicroUnits
		      Return "TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalAppOpenConversionProductValueInUsd
		      Return "TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalAppOpenConversionProductValueInMicroUsd
		      Return "TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalWebAppOpenConversionProductQuantity
		      Return "TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalWebAppOpenConversionProductValue
		      Return "TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalWebAppOpenConversionProductValueInMicroUnits
		      Return "TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalWebAppOpenConversionProductValueInUsd
		      Return "TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalWebAppOpenConversionProductValueInMicroUsd
		      Return "TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalInappAppOpenConversionProductQuantity
		      Return "TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalInappAppOpenConversionProductValue
		      Return "TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalInappAppOpenConversionProductValueInMicroUnits
		      Return "TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalInappAppOpenConversionProductValueInUsd
		      Return "TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalInappAppOpenConversionProductValueInMicroUsd
		      Return "TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    Case ReportingColumn.TotalOfflineAppOpenConversionProductQuantity
		      Return "TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_QUANTITY"
		    Case ReportingColumn.TotalOfflineAppOpenConversionProductValue
		      Return "TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE"
		    Case ReportingColumn.TotalOfflineAppOpenConversionProductValueInMicroUnits
		      Return "TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"
		    Case ReportingColumn.TotalOfflineAppOpenConversionProductValueInUsd
		      Return "TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD"
		    Case ReportingColumn.TotalOfflineAppOpenConversionProductValueInMicroUsd
		      Return "TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ReportingColumnAsyncToString(value As ReportingColumnAsync) As String
		  Select Case value
		    Case ReportingColumnAsync.SpendInMicroDollar
		      Return "SPEND_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.AdsCreditSpendInMicroDollar
		      Return "ADS_CREDIT_SPEND_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.AdsCreditSpendInDollar
		      Return "ADS_CREDIT_SPEND_IN_DOLLAR"
		    Case ReportingColumnAsync.PaidImpression
		      Return "PAID_IMPRESSION"
		    Case ReportingColumnAsync.SpendInDollar
		      Return "SPEND_IN_DOLLAR"
		    Case ReportingColumnAsync.CpcInMicroDollar
		      Return "CPC_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.EcpcInMicroDollar
		      Return "ECPC_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.EcpcInDollar
		      Return "ECPC_IN_DOLLAR"
		    Case ReportingColumnAsync.Ctr
		      Return "CTR"
		    Case ReportingColumnAsync.Ectr
		      Return "ECTR"
		    Case ReportingColumnAsync.OutboundCtr
		      Return "OUTBOUND_CTR"
		    Case ReportingColumnAsync.OutboundCtr1
		      Return "OUTBOUND_CTR_1"
		    Case ReportingColumnAsync.CostPerOutboundClick
		      Return "COST_PER_OUTBOUND_CLICK"
		    Case ReportingColumnAsync.CampaignName
		      Return "CAMPAIGN_NAME"
		    Case ReportingColumnAsync.CampaignStatus
		      Return "CAMPAIGN_STATUS"
		    Case ReportingColumnAsync.CampaignBrandLabel
		      Return "CAMPAIGN_BRAND_LABEL"
		    Case ReportingColumnAsync.CampaignCustomLabels
		      Return "CAMPAIGN_CUSTOM_LABELS"
		    Case ReportingColumnAsync.PinPromotionStatus
		      Return "PIN_PROMOTION_STATUS"
		    Case ReportingColumnAsync.AdStatus
		      Return "AD_STATUS"
		    Case ReportingColumnAsync.PinId
		      Return "PIN_ID"
		    Case ReportingColumnAsync.TotalEngagement
		      Return "TOTAL_ENGAGEMENT"
		    Case ReportingColumnAsync.Engagement1
		      Return "ENGAGEMENT_1"
		    Case ReportingColumnAsync.Engagement2
		      Return "ENGAGEMENT_2"
		    Case ReportingColumnAsync.EcpeInDollar
		      Return "ECPE_IN_DOLLAR"
		    Case ReportingColumnAsync.EngagementRate
		      Return "ENGAGEMENT_RATE"
		    Case ReportingColumnAsync.EengagementRate
		      Return "EENGAGEMENT_RATE"
		    Case ReportingColumnAsync.EcpmInMicroDollar
		      Return "ECPM_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.RepinRate
		      Return "REPIN_RATE"
		    Case ReportingColumnAsync.Ctr2
		      Return "CTR_2"
		    Case ReportingColumnAsync.Campaign
		      Return "CAMPAIGN"
		    Case ReportingColumnAsync.CampaignId
		      Return "CAMPAIGN_ID"
		    Case ReportingColumnAsync.AdvertiserId
		      Return "ADVERTISER_ID"
		    Case ReportingColumnAsync.AdAccountId
		      Return "AD_ACCOUNT_ID"
		    Case ReportingColumnAsync.PinPromotionId
		      Return "PIN_PROMOTION_ID"
		    Case ReportingColumnAsync.AdId
		      Return "AD_ID"
		    Case ReportingColumnAsync.AdGroupId
		      Return "AD_GROUP_ID"
		    Case ReportingColumnAsync.CampaignEntityStatus
		      Return "CAMPAIGN_ENTITY_STATUS"
		    Case ReportingColumnAsync.CampaignManagedStatus
		      Return "CAMPAIGN_MANAGED_STATUS"
		    Case ReportingColumnAsync.CampaignObjectiveType
		      Return "CAMPAIGN_OBJECTIVE_TYPE"
		    Case ReportingColumnAsync.CpmInMicroDollar
		      Return "CPM_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.CpmInDollar
		      Return "CPM_IN_DOLLAR"
		    Case ReportingColumnAsync.AdGroupName
		      Return "AD_GROUP_NAME"
		    Case ReportingColumnAsync.AdGroupStatus
		      Return "AD_GROUP_STATUS"
		    Case ReportingColumnAsync.AdGroupBudgetType
		      Return "AD_GROUP_BUDGET_TYPE"
		    Case ReportingColumnAsync.AdGroupBudgetInLocalCurrency
		      Return "AD_GROUP_BUDGET_IN_LOCAL_CURRENCY"
		    Case ReportingColumnAsync.AdGroupEntityStatus
		      Return "AD_GROUP_ENTITY_STATUS"
		    Case ReportingColumnAsync.AdGroupBidMultiplier
		      Return "AD_GROUP_BID_MULTIPLIER"
		    Case ReportingColumnAsync.ProductGroupId
		      Return "PRODUCT_GROUP_ID"
		    Case ReportingColumnAsync.ProductGroupStatus
		      Return "PRODUCT_GROUP_STATUS"
		    Case ReportingColumnAsync.PromoId
		      Return "PROMO_ID"
		    Case ReportingColumnAsync.PromoName
		      Return "PROMO_NAME"
		    Case ReportingColumnAsync.ProductItemName
		      Return "PRODUCT_ITEM_NAME"
		    Case ReportingColumnAsync.ProductItemImageUrl
		      Return "PRODUCT_ITEM_IMAGE_URL"
		    Case ReportingColumnAsync.ProductItemPrice
		      Return "PRODUCT_ITEM_PRICE"
		    Case ReportingColumnAsync.ProductItemProductUrl
		      Return "PRODUCT_ITEM_PRODUCT_URL"
		    Case ReportingColumnAsync.ProductItemPinUrl
		      Return "PRODUCT_ITEM_PIN_URL"
		    Case ReportingColumnAsync.ProductItemBrand
		      Return "PRODUCT_ITEM_BRAND"
		    Case ReportingColumnAsync.ProductItemDescription
		      Return "PRODUCT_ITEM_DESCRIPTION"
		    Case ReportingColumnAsync.ProductItemSalePrice
		      Return "PRODUCT_ITEM_SALE_PRICE"
		    Case ReportingColumnAsync.ProductItemProductType
		      Return "PRODUCT_ITEM_PRODUCT_TYPE"
		    Case ReportingColumnAsync.ProductItemProductCategory
		      Return "PRODUCT_ITEM_PRODUCT_CATEGORY"
		    Case ReportingColumnAsync.ProductItemCurrency
		      Return "PRODUCT_ITEM_CURRENCY"
		    Case ReportingColumnAsync.OrderLineId
		      Return "ORDER_LINE_ID"
		    Case ReportingColumnAsync.OrderLineName
		      Return "ORDER_LINE_NAME"
		    Case ReportingColumnAsync.Clickthrough1
		      Return "CLICKTHROUGH_1"
		    Case ReportingColumnAsync.Repin1
		      Return "REPIN_1"
		    Case ReportingColumnAsync.Impression1
		      Return "IMPRESSION_1"
		    Case ReportingColumnAsync.Impression1Gross
		      Return "IMPRESSION_1_GROSS"
		    Case ReportingColumnAsync.Clickthrough1Gross
		      Return "CLICKTHROUGH_1_GROSS"
		    Case ReportingColumnAsync.OutboundClick1
		      Return "OUTBOUND_CLICK_1"
		    Case ReportingColumnAsync.Clickthrough2
		      Return "CLICKTHROUGH_2"
		    Case ReportingColumnAsync.Repin2
		      Return "REPIN_2"
		    Case ReportingColumnAsync.Impression2
		      Return "IMPRESSION_2"
		    Case ReportingColumnAsync.OutboundClick2
		      Return "OUTBOUND_CLICK_2"
		    Case ReportingColumnAsync.CollectionPinItemImpression1
		      Return "COLLECTION_PIN_ITEM_IMPRESSION_1"
		    Case ReportingColumnAsync.CollectionPinItemImpression2
		      Return "COLLECTION_PIN_ITEM_IMPRESSION_2"
		    Case ReportingColumnAsync.TotalCollectionPinItemImpression
		      Return "TOTAL_COLLECTION_PIN_ITEM_IMPRESSION"
		    Case ReportingColumnAsync.CollectionPinItemClickthrough1
		      Return "COLLECTION_PIN_ITEM_CLICKTHROUGH_1"
		    Case ReportingColumnAsync.CollectionPinItemClickthrough2
		      Return "COLLECTION_PIN_ITEM_CLICKTHROUGH_2"
		    Case ReportingColumnAsync.TotalCollectionPinItemClickthrough
		      Return "TOTAL_COLLECTION_PIN_ITEM_CLICKTHROUGH"
		    Case ReportingColumnAsync.TotalClickthrough
		      Return "TOTAL_CLICKTHROUGH"
		    Case ReportingColumnAsync.TotalImpression
		      Return "TOTAL_IMPRESSION"
		    Case ReportingColumnAsync.TotalImpressionUser
		      Return "TOTAL_IMPRESSION_USER"
		    Case ReportingColumnAsync.TotalImpressionFrequency
		      Return "TOTAL_IMPRESSION_FREQUENCY"
		    Case ReportingColumnAsync.CostPerOutboundClickInDollar
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR"
		    Case ReportingColumnAsync.CostPerOutboundClickInDollar1
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1"
		    Case ReportingColumnAsync.TotalEngagementPageVisit
		      Return "TOTAL_ENGAGEMENT_PAGE_VISIT"
		    Case ReportingColumnAsync.TotalEngagementSignup
		      Return "TOTAL_ENGAGEMENT_SIGNUP"
		    Case ReportingColumnAsync.TotalEngagementCheckout
		      Return "TOTAL_ENGAGEMENT_CHECKOUT"
		    Case ReportingColumnAsync.TotalEngagementCustom
		      Return "TOTAL_ENGAGEMENT_CUSTOM"
		    Case ReportingColumnAsync.TotalEngagementAddToCart
		      Return "TOTAL_ENGAGEMENT_ADD_TO_CART"
		    Case ReportingColumnAsync.TotalEngagementLead
		      Return "TOTAL_ENGAGEMENT_LEAD"
		    Case ReportingColumnAsync.TotalEngagementSearch
		      Return "TOTAL_ENGAGEMENT_SEARCH"
		    Case ReportingColumnAsync.TotalEngagementWatchVideo
		      Return "TOTAL_ENGAGEMENT_WATCH_VIDEO"
		    Case ReportingColumnAsync.TotalEngagementViewCategory
		      Return "TOTAL_ENGAGEMENT_VIEW_CATEGORY"
		    Case ReportingColumnAsync.TotalEngagementAppInstall
		      Return "TOTAL_ENGAGEMENT_APP_INSTALL"
		    Case ReportingColumnAsync.TotalEngagementUnknown
		      Return "TOTAL_ENGAGEMENT_UNKNOWN"
		    Case ReportingColumnAsync.TotalClickPageVisit
		      Return "TOTAL_CLICK_PAGE_VISIT"
		    Case ReportingColumnAsync.TotalClickSignup
		      Return "TOTAL_CLICK_SIGNUP"
		    Case ReportingColumnAsync.TotalClickCheckout
		      Return "TOTAL_CLICK_CHECKOUT"
		    Case ReportingColumnAsync.TotalClickCustom
		      Return "TOTAL_CLICK_CUSTOM"
		    Case ReportingColumnAsync.TotalClickAddToCart
		      Return "TOTAL_CLICK_ADD_TO_CART"
		    Case ReportingColumnAsync.TotalClickLead
		      Return "TOTAL_CLICK_LEAD"
		    Case ReportingColumnAsync.TotalClickSearch
		      Return "TOTAL_CLICK_SEARCH"
		    Case ReportingColumnAsync.TotalClickWatchVideo
		      Return "TOTAL_CLICK_WATCH_VIDEO"
		    Case ReportingColumnAsync.TotalClickViewCategory
		      Return "TOTAL_CLICK_VIEW_CATEGORY"
		    Case ReportingColumnAsync.TotalClickAppInstall
		      Return "TOTAL_CLICK_APP_INSTALL"
		    Case ReportingColumnAsync.TotalClickUnknown
		      Return "TOTAL_CLICK_UNKNOWN"
		    Case ReportingColumnAsync.TotalViewPageVisit
		      Return "TOTAL_VIEW_PAGE_VISIT"
		    Case ReportingColumnAsync.TotalViewSignup
		      Return "TOTAL_VIEW_SIGNUP"
		    Case ReportingColumnAsync.TotalViewCheckout
		      Return "TOTAL_VIEW_CHECKOUT"
		    Case ReportingColumnAsync.TotalViewCustom
		      Return "TOTAL_VIEW_CUSTOM"
		    Case ReportingColumnAsync.TotalViewAddToCart
		      Return "TOTAL_VIEW_ADD_TO_CART"
		    Case ReportingColumnAsync.TotalViewLead
		      Return "TOTAL_VIEW_LEAD"
		    Case ReportingColumnAsync.TotalViewSearch
		      Return "TOTAL_VIEW_SEARCH"
		    Case ReportingColumnAsync.TotalViewWatchVideo
		      Return "TOTAL_VIEW_WATCH_VIDEO"
		    Case ReportingColumnAsync.TotalViewViewCategory
		      Return "TOTAL_VIEW_VIEW_CATEGORY"
		    Case ReportingColumnAsync.TotalViewAppInstall
		      Return "TOTAL_VIEW_APP_INSTALL"
		    Case ReportingColumnAsync.TotalViewUnknown
		      Return "TOTAL_VIEW_UNKNOWN"
		    Case ReportingColumnAsync.TotalConversions
		      Return "TOTAL_CONVERSIONS"
		    Case ReportingColumnAsync.TotalEngagementPageVisitValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalEngagementSignupValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalEngagementCustomValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalEngagementAddToCartValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalEngagementLeadValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalEngagementSearchValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalEngagementWatchVideoValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalEngagementViewCategoryValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalEngagementAppInstallValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalEngagementUnknownValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalClickPageVisitValueInMicroDollar
		      Return "TOTAL_CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalClickSignupValueInMicroDollar
		      Return "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalClickCheckoutValueInMicroDollar
		      Return "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalClickCustomValueInMicroDollar
		      Return "TOTAL_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalClickAddToCartValueInMicroDollar
		      Return "TOTAL_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalClickLeadValueInMicroDollar
		      Return "TOTAL_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalClickSearchValueInMicroDollar
		      Return "TOTAL_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalClickWatchVideoValueInMicroDollar
		      Return "TOTAL_CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalClickViewCategoryValueInMicroDollar
		      Return "TOTAL_CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalClickAppInstallValueInMicroDollar
		      Return "TOTAL_CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalClickUnknownValueInMicroDollar
		      Return "TOTAL_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalViewPageVisitValueInMicroDollar
		      Return "TOTAL_VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalViewSignupValueInMicroDollar
		      Return "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalViewCheckoutValueInMicroDollar
		      Return "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalViewCustomValueInMicroDollar
		      Return "TOTAL_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalViewAddToCartValueInMicroDollar
		      Return "TOTAL_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalViewLeadValueInMicroDollar
		      Return "TOTAL_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalViewSearchValueInMicroDollar
		      Return "TOTAL_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalViewWatchVideoValueInMicroDollar
		      Return "TOTAL_VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalViewViewCategoryValueInMicroDollar
		      Return "TOTAL_VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalViewAppInstallValueInMicroDollar
		      Return "TOTAL_VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalViewUnknownValueInMicroDollar
		      Return "TOTAL_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalConversionsValueInMicroDollar
		      Return "TOTAL_CONVERSIONS_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalEngagementPageVisitQuantity
		      Return "TOTAL_ENGAGEMENT_PAGE_VISIT_QUANTITY"
		    Case ReportingColumnAsync.TotalEngagementSignupQuantity
		      Return "TOTAL_ENGAGEMENT_SIGNUP_QUANTITY"
		    Case ReportingColumnAsync.TotalEngagementCheckoutQuantity
		      Return "TOTAL_ENGAGEMENT_CHECKOUT_QUANTITY"
		    Case ReportingColumnAsync.TotalEngagementCustomQuantity
		      Return "TOTAL_ENGAGEMENT_CUSTOM_QUANTITY"
		    Case ReportingColumnAsync.TotalEngagementAddToCartQuantity
		      Return "TOTAL_ENGAGEMENT_ADD_TO_CART_QUANTITY"
		    Case ReportingColumnAsync.TotalEngagementLeadQuantity
		      Return "TOTAL_ENGAGEMENT_LEAD_QUANTITY"
		    Case ReportingColumnAsync.TotalEngagementSearchQuantity
		      Return "TOTAL_ENGAGEMENT_SEARCH_QUANTITY"
		    Case ReportingColumnAsync.TotalEngagementWatchVideoQuantity
		      Return "TOTAL_ENGAGEMENT_WATCH_VIDEO_QUANTITY"
		    Case ReportingColumnAsync.TotalEngagementViewCategoryQuantity
		      Return "TOTAL_ENGAGEMENT_VIEW_CATEGORY_QUANTITY"
		    Case ReportingColumnAsync.TotalEngagementUnknownQuantity
		      Return "TOTAL_ENGAGEMENT_UNKNOWN_QUANTITY"
		    Case ReportingColumnAsync.TotalClickPageVisitQuantity
		      Return "TOTAL_CLICK_PAGE_VISIT_QUANTITY"
		    Case ReportingColumnAsync.TotalClickSignupQuantity
		      Return "TOTAL_CLICK_SIGNUP_QUANTITY"
		    Case ReportingColumnAsync.TotalClickCheckoutQuantity
		      Return "TOTAL_CLICK_CHECKOUT_QUANTITY"
		    Case ReportingColumnAsync.TotalClickCustomQuantity
		      Return "TOTAL_CLICK_CUSTOM_QUANTITY"
		    Case ReportingColumnAsync.TotalClickAddToCartQuantity
		      Return "TOTAL_CLICK_ADD_TO_CART_QUANTITY"
		    Case ReportingColumnAsync.TotalClickLeadQuantity
		      Return "TOTAL_CLICK_LEAD_QUANTITY"
		    Case ReportingColumnAsync.TotalClickSearchQuantity
		      Return "TOTAL_CLICK_SEARCH_QUANTITY"
		    Case ReportingColumnAsync.TotalClickWatchVideoQuantity
		      Return "TOTAL_CLICK_WATCH_VIDEO_QUANTITY"
		    Case ReportingColumnAsync.TotalClickViewCategoryQuantity
		      Return "TOTAL_CLICK_VIEW_CATEGORY_QUANTITY"
		    Case ReportingColumnAsync.TotalClickUnknownQuantity
		      Return "TOTAL_CLICK_UNKNOWN_QUANTITY"
		    Case ReportingColumnAsync.TotalViewPageVisitQuantity
		      Return "TOTAL_VIEW_PAGE_VISIT_QUANTITY"
		    Case ReportingColumnAsync.TotalViewSignupQuantity
		      Return "TOTAL_VIEW_SIGNUP_QUANTITY"
		    Case ReportingColumnAsync.TotalViewCheckoutQuantity
		      Return "TOTAL_VIEW_CHECKOUT_QUANTITY"
		    Case ReportingColumnAsync.TotalViewCustomQuantity
		      Return "TOTAL_VIEW_CUSTOM_QUANTITY"
		    Case ReportingColumnAsync.TotalViewAddToCartQuantity
		      Return "TOTAL_VIEW_ADD_TO_CART_QUANTITY"
		    Case ReportingColumnAsync.TotalViewLeadQuantity
		      Return "TOTAL_VIEW_LEAD_QUANTITY"
		    Case ReportingColumnAsync.TotalViewSearchQuantity
		      Return "TOTAL_VIEW_SEARCH_QUANTITY"
		    Case ReportingColumnAsync.TotalViewWatchVideoQuantity
		      Return "TOTAL_VIEW_WATCH_VIDEO_QUANTITY"
		    Case ReportingColumnAsync.TotalViewViewCategoryQuantity
		      Return "TOTAL_VIEW_VIEW_CATEGORY_QUANTITY"
		    Case ReportingColumnAsync.TotalViewUnknownQuantity
		      Return "TOTAL_VIEW_UNKNOWN_QUANTITY"
		    Case ReportingColumnAsync.TotalConversionsQuantity
		      Return "TOTAL_CONVERSIONS_QUANTITY"
		    Case ReportingColumnAsync.TotalWebSessions
		      Return "TOTAL_WEB_SESSIONS"
		    Case ReportingColumnAsync.WebSessions1
		      Return "WEB_SESSIONS_1"
		    Case ReportingColumnAsync.WebSessions2
		      Return "WEB_SESSIONS_2"
		    Case ReportingColumnAsync.OnsiteCheckouts1
		      Return "ONSITE_CHECKOUTS_1"
		    Case ReportingColumnAsync.PinPromotionName
		      Return "PIN_PROMOTION_NAME"
		    Case ReportingColumnAsync.AdName
		      Return "AD_NAME"
		    Case ReportingColumnAsync.CampaignLifetimeSpendCap
		      Return "CAMPAIGN_LIFETIME_SPEND_CAP"
		    Case ReportingColumnAsync.AdGroupOptimization
		      Return "AD_GROUP_OPTIMIZATION"
		    Case ReportingColumnAsync.CampaignDailySpendCap
		      Return "CAMPAIGN_DAILY_SPEND_CAP"
		    Case ReportingColumnAsync.CampaignBudgetOptimization
		      Return "CAMPAIGN_BUDGET_OPTIMIZATION"
		    Case ReportingColumnAsync.IsCatalogCreativeCampaign
		      Return "IS_CATALOG_CREATIVE_CAMPAIGN"
		    Case ReportingColumnAsync.IsPremiereCampaign
		      Return "IS_PREMIERE_CAMPAIGN"
		    Case ReportingColumnAsync.TotalPageVisitDesktopActionToDesktopConversion
		      Return "TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalPageVisitDesktopActionToMobileConversion
		      Return "TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalPageVisitDesktopActionToTabletConversion
		      Return "TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalPageVisitMobileActionToDesktopConversion
		      Return "TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalPageVisitMobileActionToMobileConversion
		      Return "TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalPageVisitMobileActionToTabletConversion
		      Return "TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalPageVisitTabletActionToDesktopConversion
		      Return "TOTAL_PAGE_VISIT_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalPageVisitTabletActionToMobileConversion
		      Return "TOTAL_PAGE_VISIT_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalPageVisitTabletActionToTabletConversion
		      Return "TOTAL_PAGE_VISIT_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalSignupDesktopActionToDesktopConversion
		      Return "TOTAL_SIGNUP_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalSignupDesktopActionToMobileConversion
		      Return "TOTAL_SIGNUP_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalSignupDesktopActionToTabletConversion
		      Return "TOTAL_SIGNUP_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalSignupMobileActionToDesktopConversion
		      Return "TOTAL_SIGNUP_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalSignupMobileActionToMobileConversion
		      Return "TOTAL_SIGNUP_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalSignupMobileActionToTabletConversion
		      Return "TOTAL_SIGNUP_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalSignupTabletActionToDesktopConversion
		      Return "TOTAL_SIGNUP_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalSignupTabletActionToMobileConversion
		      Return "TOTAL_SIGNUP_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalSignupTabletActionToTabletConversion
		      Return "TOTAL_SIGNUP_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalCheckoutDesktopActionToDesktopConversion
		      Return "TOTAL_CHECKOUT_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalCheckoutDesktopActionToMobileConversion
		      Return "TOTAL_CHECKOUT_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalCheckoutDesktopActionToTabletConversion
		      Return "TOTAL_CHECKOUT_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalCheckoutMobileActionToDesktopConversion
		      Return "TOTAL_CHECKOUT_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalCheckoutMobileActionToMobileConversion
		      Return "TOTAL_CHECKOUT_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalCheckoutMobileActionToTabletConversion
		      Return "TOTAL_CHECKOUT_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalCheckoutTabletActionToDesktopConversion
		      Return "TOTAL_CHECKOUT_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalCheckoutTabletActionToMobileConversion
		      Return "TOTAL_CHECKOUT_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalCheckoutTabletActionToTabletConversion
		      Return "TOTAL_CHECKOUT_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalCustomDesktopActionToDesktopConversion
		      Return "TOTAL_CUSTOM_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalCustomDesktopActionToMobileConversion
		      Return "TOTAL_CUSTOM_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalCustomDesktopActionToTabletConversion
		      Return "TOTAL_CUSTOM_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalCustomMobileActionToDesktopConversion
		      Return "TOTAL_CUSTOM_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalCustomMobileActionToMobileConversion
		      Return "TOTAL_CUSTOM_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalCustomMobileActionToTabletConversion
		      Return "TOTAL_CUSTOM_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalCustomTabletActionToDesktopConversion
		      Return "TOTAL_CUSTOM_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalCustomTabletActionToMobileConversion
		      Return "TOTAL_CUSTOM_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalCustomTabletActionToTabletConversion
		      Return "TOTAL_CUSTOM_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalAddToCartDesktopActionToDesktopConversion
		      Return "TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalAddToCartDesktopActionToMobileConversion
		      Return "TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalAddToCartDesktopActionToTabletConversion
		      Return "TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalAddToCartMobileActionToDesktopConversion
		      Return "TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalAddToCartMobileActionToMobileConversion
		      Return "TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalAddToCartMobileActionToTabletConversion
		      Return "TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalAddToCartTabletActionToDesktopConversion
		      Return "TOTAL_ADD_TO_CART_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalAddToCartTabletActionToMobileConversion
		      Return "TOTAL_ADD_TO_CART_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalAddToCartTabletActionToTabletConversion
		      Return "TOTAL_ADD_TO_CART_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalLeadDesktopActionToDesktopConversion
		      Return "TOTAL_LEAD_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalLeadDesktopActionToMobileConversion
		      Return "TOTAL_LEAD_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalLeadDesktopActionToTabletConversion
		      Return "TOTAL_LEAD_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalLeadMobileActionToDesktopConversion
		      Return "TOTAL_LEAD_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalLeadMobileActionToMobileConversion
		      Return "TOTAL_LEAD_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalLeadMobileActionToTabletConversion
		      Return "TOTAL_LEAD_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalLeadTabletActionToDesktopConversion
		      Return "TOTAL_LEAD_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalLeadTabletActionToMobileConversion
		      Return "TOTAL_LEAD_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalLeadTabletActionToTabletConversion
		      Return "TOTAL_LEAD_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalSearchDesktopActionToDesktopConversion
		      Return "TOTAL_SEARCH_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalSearchDesktopActionToMobileConversion
		      Return "TOTAL_SEARCH_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalSearchDesktopActionToTabletConversion
		      Return "TOTAL_SEARCH_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalSearchMobileActionToDesktopConversion
		      Return "TOTAL_SEARCH_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalSearchMobileActionToMobileConversion
		      Return "TOTAL_SEARCH_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalSearchMobileActionToTabletConversion
		      Return "TOTAL_SEARCH_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalSearchTabletActionToDesktopConversion
		      Return "TOTAL_SEARCH_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalSearchTabletActionToMobileConversion
		      Return "TOTAL_SEARCH_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalSearchTabletActionToTabletConversion
		      Return "TOTAL_SEARCH_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalWatchVideoDesktopActionToDesktopConversion
		      Return "TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalWatchVideoDesktopActionToMobileConversion
		      Return "TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalWatchVideoDesktopActionToTabletConversion
		      Return "TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalWatchVideoMobileActionToDesktopConversion
		      Return "TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalWatchVideoMobileActionToMobileConversion
		      Return "TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalWatchVideoMobileActionToTabletConversion
		      Return "TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalWatchVideoTabletActionToDesktopConversion
		      Return "TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalWatchVideoTabletActionToMobileConversion
		      Return "TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalWatchVideoTabletActionToTabletConversion
		      Return "TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalViewCategoryDesktopActionToDesktopConversion
		      Return "TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalViewCategoryDesktopActionToMobileConversion
		      Return "TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalViewCategoryDesktopActionToTabletConversion
		      Return "TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalViewCategoryMobileActionToDesktopConversion
		      Return "TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalViewCategoryMobileActionToMobileConversion
		      Return "TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalViewCategoryMobileActionToTabletConversion
		      Return "TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalViewCategoryTabletActionToDesktopConversion
		      Return "TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalViewCategoryTabletActionToMobileConversion
		      Return "TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalViewCategoryTabletActionToTabletConversion
		      Return "TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalAppInstallDesktopActionToDesktopConversion
		      Return "TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalAppInstallDesktopActionToMobileConversion
		      Return "TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalAppInstallDesktopActionToTabletConversion
		      Return "TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalAppInstallMobileActionToDesktopConversion
		      Return "TOTAL_APP_INSTALL_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalAppInstallMobileActionToMobileConversion
		      Return "TOTAL_APP_INSTALL_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalAppInstallMobileActionToTabletConversion
		      Return "TOTAL_APP_INSTALL_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalAppInstallTabletActionToDesktopConversion
		      Return "TOTAL_APP_INSTALL_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalAppInstallTabletActionToMobileConversion
		      Return "TOTAL_APP_INSTALL_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalAppInstallTabletActionToTabletConversion
		      Return "TOTAL_APP_INSTALL_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalUnknownDesktopActionToDesktopConversion
		      Return "TOTAL_UNKNOWN_DESKTOP_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalUnknownDesktopActionToMobileConversion
		      Return "TOTAL_UNKNOWN_DESKTOP_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalUnknownDesktopActionToTabletConversion
		      Return "TOTAL_UNKNOWN_DESKTOP_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalUnknownMobileActionToDesktopConversion
		      Return "TOTAL_UNKNOWN_MOBILE_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalUnknownMobileActionToMobileConversion
		      Return "TOTAL_UNKNOWN_MOBILE_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalUnknownMobileActionToTabletConversion
		      Return "TOTAL_UNKNOWN_MOBILE_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalUnknownTabletActionToDesktopConversion
		      Return "TOTAL_UNKNOWN_TABLET_ACTION_TO_DESKTOP_CONVERSION"
		    Case ReportingColumnAsync.TotalUnknownTabletActionToMobileConversion
		      Return "TOTAL_UNKNOWN_TABLET_ACTION_TO_MOBILE_CONVERSION"
		    Case ReportingColumnAsync.TotalUnknownTabletActionToTabletConversion
		      Return "TOTAL_UNKNOWN_TABLET_ACTION_TO_TABLET_CONVERSION"
		    Case ReportingColumnAsync.TotalPageVisit
		      Return "TOTAL_PAGE_VISIT"
		    Case ReportingColumnAsync.TotalSignup
		      Return "TOTAL_SIGNUP"
		    Case ReportingColumnAsync.TotalCheckout
		      Return "TOTAL_CHECKOUT"
		    Case ReportingColumnAsync.TotalCustom
		      Return "TOTAL_CUSTOM"
		    Case ReportingColumnAsync.TotalAddToCart
		      Return "TOTAL_ADD_TO_CART"
		    Case ReportingColumnAsync.TotalLead
		      Return "TOTAL_LEAD"
		    Case ReportingColumnAsync.TotalSearch
		      Return "TOTAL_SEARCH"
		    Case ReportingColumnAsync.TotalWatchVideo
		      Return "TOTAL_WATCH_VIDEO"
		    Case ReportingColumnAsync.TotalViewCategory
		      Return "TOTAL_VIEW_CATEGORY"
		    Case ReportingColumnAsync.TotalAppInstall
		      Return "TOTAL_APP_INSTALL"
		    Case ReportingColumnAsync.TotalAddToWishlist
		      Return "TOTAL_ADD_TO_WISHLIST"
		    Case ReportingColumnAsync.TotalSubscribe
		      Return "TOTAL_SUBSCRIBE"
		    Case ReportingColumnAsync.TotalSignupValueInMicroDollar
		      Return "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalCheckoutValueInMicroDollar
		      Return "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalCustomValueInMicroDollar
		      Return "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalAddToCartValueInMicroDollar
		      Return "TOTAL_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalLeadValueInMicroDollar
		      Return "TOTAL_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalSearchValueInMicroDollar
		      Return "TOTAL_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWatchVideoValueInMicroDollar
		      Return "TOTAL_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalViewCategoryValueInMicroDollar
		      Return "TOTAL_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalAppInstallValueInMicroDollar
		      Return "TOTAL_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalCheckoutQuantity
		      Return "TOTAL_CHECKOUT_QUANTITY"
		    Case ReportingColumnAsync.PageVisitCostPerAction
		      Return "PAGE_VISIT_COST_PER_ACTION"
		    Case ReportingColumnAsync.AppInstallCostPerAction
		      Return "APP_INSTALL_COST_PER_ACTION"
		    Case ReportingColumnAsync.PageVisitRoas
		      Return "PAGE_VISIT_ROAS"
		    Case ReportingColumnAsync.CheckoutRoas
		      Return "CHECKOUT_ROAS"
		    Case ReportingColumnAsync.CustomRoas
		      Return "CUSTOM_ROAS"
		    Case ReportingColumnAsync.ProductGroupAdImageTag
		      Return "PRODUCT_GROUP_AD_IMAGE_TAG"
		    Case ReportingColumnAsync.ProductGroupAdVideoTag
		      Return "PRODUCT_GROUP_AD_VIDEO_TAG"
		    Case ReportingColumnAsync.Video3secViews1
		      Return "VIDEO_3SEC_VIEWS_1"
		    Case ReportingColumnAsync.Video15secUniqueViews1
		      Return "VIDEO_15SEC_UNIQUE_VIEWS_1"
		    Case ReportingColumnAsync.VideoP100Complete1
		      Return "VIDEO_P100_COMPLETE_1"
		    Case ReportingColumnAsync.VideoP0Combined1
		      Return "VIDEO_P0_COMBINED_1"
		    Case ReportingColumnAsync.VideoP25Combined1
		      Return "VIDEO_P25_COMBINED_1"
		    Case ReportingColumnAsync.VideoP50Combined1
		      Return "VIDEO_P50_COMBINED_1"
		    Case ReportingColumnAsync.VideoP75Combined1
		      Return "VIDEO_P75_COMBINED_1"
		    Case ReportingColumnAsync.VideoP95Combined1
		      Return "VIDEO_P95_COMBINED_1"
		    Case ReportingColumnAsync.VideoMrcViews1
		      Return "VIDEO_MRC_VIEWS_1"
		    Case ReportingColumnAsync.Video3secViews2
		      Return "VIDEO_3SEC_VIEWS_2"
		    Case ReportingColumnAsync.Video15secUniqueViews2
		      Return "VIDEO_15SEC_UNIQUE_VIEWS_2"
		    Case ReportingColumnAsync.VideoP100Complete2
		      Return "VIDEO_P100_COMPLETE_2"
		    Case ReportingColumnAsync.VideoP0Combined2
		      Return "VIDEO_P0_COMBINED_2"
		    Case ReportingColumnAsync.VideoP25Combined2
		      Return "VIDEO_P25_COMBINED_2"
		    Case ReportingColumnAsync.VideoP50Combined2
		      Return "VIDEO_P50_COMBINED_2"
		    Case ReportingColumnAsync.VideoP75Combined2
		      Return "VIDEO_P75_COMBINED_2"
		    Case ReportingColumnAsync.VideoP95Combined2
		      Return "VIDEO_P95_COMBINED_2"
		    Case ReportingColumnAsync.VideoMrcViews2
		      Return "VIDEO_MRC_VIEWS_2"
		    Case ReportingColumnAsync.PaidVideoViewableRate
		      Return "PAID_VIDEO_VIEWABLE_RATE"
		    Case ReportingColumnAsync.VideoLength
		      Return "VIDEO_LENGTH"
		    Case ReportingColumnAsync.VideoSpendInDollar
		      Return "VIDEO_SPEND_IN_DOLLAR"
		    Case ReportingColumnAsync.CpvInMicroDollar
		      Return "CPV_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.EcpvInDollar
		      Return "ECPV_IN_DOLLAR"
		    Case ReportingColumnAsync.CpcvInMicroDollar
		      Return "CPCV_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.EcpcvInDollar
		      Return "ECPCV_IN_DOLLAR"
		    Case ReportingColumnAsync.CpcvP95InMicroDollar
		      Return "CPCV_P95_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.EcpcvP95InDollar
		      Return "ECPCV_P95_IN_DOLLAR"
		    Case ReportingColumnAsync.TotalVideo3secViews
		      Return "TOTAL_VIDEO_3SEC_VIEWS"
		    Case ReportingColumnAsync.TotalVideo15secUniqueViews
		      Return "TOTAL_VIDEO_15SEC_UNIQUE_VIEWS"
		    Case ReportingColumnAsync.TotalVideoP100Complete
		      Return "TOTAL_VIDEO_P100_COMPLETE"
		    Case ReportingColumnAsync.TotalVideoP0Combined
		      Return "TOTAL_VIDEO_P0_COMBINED"
		    Case ReportingColumnAsync.TotalVideoP25Combined
		      Return "TOTAL_VIDEO_P25_COMBINED"
		    Case ReportingColumnAsync.TotalVideoP50Combined
		      Return "TOTAL_VIDEO_P50_COMBINED"
		    Case ReportingColumnAsync.TotalVideoP75Combined
		      Return "TOTAL_VIDEO_P75_COMBINED"
		    Case ReportingColumnAsync.TotalVideoP95Combined
		      Return "TOTAL_VIDEO_P95_COMBINED"
		    Case ReportingColumnAsync.TotalVideoMrcViews
		      Return "TOTAL_VIDEO_MRC_VIEWS"
		    Case ReportingColumnAsync.VideoAvgWatchtimeInSecond1
		      Return "VIDEO_AVG_WATCHTIME_IN_SECOND_1"
		    Case ReportingColumnAsync.VideoAvgWatchtimeInSecond2
		      Return "VIDEO_AVG_WATCHTIME_IN_SECOND_2"
		    Case ReportingColumnAsync.TotalVideoAvgWatchtimeInSecond
		      Return "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND"
		    Case ReportingColumnAsync.TotalDestinationViews
		      Return "TOTAL_DESTINATION_VIEWS"
		    Case ReportingColumnAsync.TotalRepinRate
		      Return "TOTAL_REPIN_RATE"
		    Case ReportingColumnAsync.WebCheckoutCostPerAction
		      Return "WEB_CHECKOUT_COST_PER_ACTION"
		    Case ReportingColumnAsync.WebCheckoutRoas
		      Return "WEB_CHECKOUT_ROAS"
		    Case ReportingColumnAsync.TotalWebCheckout
		      Return "TOTAL_WEB_CHECKOUT"
		    Case ReportingColumnAsync.TotalWebCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebClickCheckout
		      Return "TOTAL_WEB_CLICK_CHECKOUT"
		    Case ReportingColumnAsync.TotalWebClickCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebEngagementCheckout
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT"
		    Case ReportingColumnAsync.TotalWebEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebViewCheckout
		      Return "TOTAL_WEB_VIEW_CHECKOUT"
		    Case ReportingColumnAsync.TotalWebViewCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.InappCheckoutCostPerAction
		      Return "INAPP_CHECKOUT_COST_PER_ACTION"
		    Case ReportingColumnAsync.InappCheckoutRoas
		      Return "INAPP_CHECKOUT_ROAS"
		    Case ReportingColumnAsync.TotalInappCheckout
		      Return "TOTAL_INAPP_CHECKOUT"
		    Case ReportingColumnAsync.TotalInappCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalInappClickCheckout
		      Return "TOTAL_INAPP_CLICK_CHECKOUT"
		    Case ReportingColumnAsync.TotalInappClickCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalInappEngagementCheckout
		      Return "TOTAL_INAPP_ENGAGEMENT_CHECKOUT"
		    Case ReportingColumnAsync.TotalInappEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalInappViewCheckout
		      Return "TOTAL_INAPP_VIEW_CHECKOUT"
		    Case ReportingColumnAsync.TotalInappViewCheckoutValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.OfflineCheckoutCostPerAction
		      Return "OFFLINE_CHECKOUT_COST_PER_ACTION"
		    Case ReportingColumnAsync.OfflineCheckoutRoas
		      Return "OFFLINE_CHECKOUT_ROAS"
		    Case ReportingColumnAsync.TotalOfflineCheckout
		      Return "TOTAL_OFFLINE_CHECKOUT"
		    Case ReportingColumnAsync.TotalOfflineCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalOfflineClickCheckout
		      Return "TOTAL_OFFLINE_CLICK_CHECKOUT"
		    Case ReportingColumnAsync.TotalOfflineClickCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalOfflineEngagementCheckout
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT"
		    Case ReportingColumnAsync.TotalOfflineEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalOfflineViewCheckout
		      Return "TOTAL_OFFLINE_VIEW_CHECKOUT"
		    Case ReportingColumnAsync.TotalOfflineViewCheckoutValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.PinterestCheckoutCostPerAction
		      Return "PINTEREST_CHECKOUT_COST_PER_ACTION"
		    Case ReportingColumnAsync.PinterestCheckoutRoas
		      Return "PINTEREST_CHECKOUT_ROAS"
		    Case ReportingColumnAsync.TotalPinterestCheckout
		      Return "TOTAL_PINTEREST_CHECKOUT"
		    Case ReportingColumnAsync.TotalPinterestCheckoutValueInMicroDollar
		      Return "TOTAL_PINTEREST_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.WebAddToCartCostPerAction
		      Return "WEB_ADD_TO_CART_COST_PER_ACTION"
		    Case ReportingColumnAsync.WebAddToCartRoas
		      Return "WEB_ADD_TO_CART_ROAS"
		    Case ReportingColumnAsync.TotalWebAddToCart
		      Return "TOTAL_WEB_ADD_TO_CART"
		    Case ReportingColumnAsync.TotalWebAddToCartValueInMicroDollar
		      Return "TOTAL_WEB_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebClickAddToCart
		      Return "TOTAL_WEB_CLICK_ADD_TO_CART"
		    Case ReportingColumnAsync.TotalWebClickAddToCartValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebEngagementAddToCart
		      Return "TOTAL_WEB_ENGAGEMENT_ADD_TO_CART"
		    Case ReportingColumnAsync.TotalWebEngagementAddToCartValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebViewAddToCart
		      Return "TOTAL_WEB_VIEW_ADD_TO_CART"
		    Case ReportingColumnAsync.TotalWebViewAddToCartValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.InappAddToCartCostPerAction
		      Return "INAPP_ADD_TO_CART_COST_PER_ACTION"
		    Case ReportingColumnAsync.InappAddToCartRoas
		      Return "INAPP_ADD_TO_CART_ROAS"
		    Case ReportingColumnAsync.TotalInappAddToCart
		      Return "TOTAL_INAPP_ADD_TO_CART"
		    Case ReportingColumnAsync.TotalInappAddToCartValueInMicroDollar
		      Return "TOTAL_INAPP_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalInappClickAddToCart
		      Return "TOTAL_INAPP_CLICK_ADD_TO_CART"
		    Case ReportingColumnAsync.TotalInappClickAddToCartValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalInappEngagementAddToCart
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART"
		    Case ReportingColumnAsync.TotalInappEngagementAddToCartValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalInappViewAddToCart
		      Return "TOTAL_INAPP_VIEW_ADD_TO_CART"
		    Case ReportingColumnAsync.TotalInappViewAddToCartValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.WebPageVisitCostPerAction
		      Return "WEB_PAGE_VISIT_COST_PER_ACTION"
		    Case ReportingColumnAsync.WebPageVisitRoas
		      Return "WEB_PAGE_VISIT_ROAS"
		    Case ReportingColumnAsync.TotalWebPageVisit
		      Return "TOTAL_WEB_PAGE_VISIT"
		    Case ReportingColumnAsync.TotalWebPageVisitValueInMicroDollar
		      Return "TOTAL_WEB_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebClickPageVisit
		      Return "TOTAL_WEB_CLICK_PAGE_VISIT"
		    Case ReportingColumnAsync.TotalWebClickPageVisitValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebEngagementPageVisit
		      Return "TOTAL_WEB_ENGAGEMENT_PAGE_VISIT"
		    Case ReportingColumnAsync.TotalWebEngagementPageVisitValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebViewPageVisit
		      Return "TOTAL_WEB_VIEW_PAGE_VISIT"
		    Case ReportingColumnAsync.TotalWebViewPageVisitValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.WebSignupCostPerAction
		      Return "WEB_SIGNUP_COST_PER_ACTION"
		    Case ReportingColumnAsync.WebSignupRoas
		      Return "WEB_SIGNUP_ROAS"
		    Case ReportingColumnAsync.TotalWebSignup
		      Return "TOTAL_WEB_SIGNUP"
		    Case ReportingColumnAsync.TotalWebSignupValueInMicroDollar
		      Return "TOTAL_WEB_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebClickSignup
		      Return "TOTAL_WEB_CLICK_SIGNUP"
		    Case ReportingColumnAsync.TotalWebClickSignupValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebEngagementSignup
		      Return "TOTAL_WEB_ENGAGEMENT_SIGNUP"
		    Case ReportingColumnAsync.TotalWebEngagementSignupValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebViewSignup
		      Return "TOTAL_WEB_VIEW_SIGNUP"
		    Case ReportingColumnAsync.TotalWebViewSignupValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.InappSignupCostPerAction
		      Return "INAPP_SIGNUP_COST_PER_ACTION"
		    Case ReportingColumnAsync.InappSignupRoas
		      Return "INAPP_SIGNUP_ROAS"
		    Case ReportingColumnAsync.TotalInappSignup
		      Return "TOTAL_INAPP_SIGNUP"
		    Case ReportingColumnAsync.TotalInappSignupValueInMicroDollar
		      Return "TOTAL_INAPP_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalInappClickSignup
		      Return "TOTAL_INAPP_CLICK_SIGNUP"
		    Case ReportingColumnAsync.TotalInappClickSignupValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalInappEngagementSignup
		      Return "TOTAL_INAPP_ENGAGEMENT_SIGNUP"
		    Case ReportingColumnAsync.TotalInappEngagementSignupValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalInappViewSignup
		      Return "TOTAL_INAPP_VIEW_SIGNUP"
		    Case ReportingColumnAsync.TotalInappViewSignupValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.OfflineSignupCostPerAction
		      Return "OFFLINE_SIGNUP_COST_PER_ACTION"
		    Case ReportingColumnAsync.OfflineSignupRoas
		      Return "OFFLINE_SIGNUP_ROAS"
		    Case ReportingColumnAsync.TotalOfflineSignup
		      Return "TOTAL_OFFLINE_SIGNUP"
		    Case ReportingColumnAsync.TotalOfflineSignupValueInMicroDollar
		      Return "TOTAL_OFFLINE_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalOfflineClickSignup
		      Return "TOTAL_OFFLINE_CLICK_SIGNUP"
		    Case ReportingColumnAsync.TotalOfflineClickSignupValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalOfflineEngagementSignup
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SIGNUP"
		    Case ReportingColumnAsync.TotalOfflineEngagementSignupValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalOfflineViewSignup
		      Return "TOTAL_OFFLINE_VIEW_SIGNUP"
		    Case ReportingColumnAsync.TotalOfflineViewSignupValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.WebWatchVideoCostPerAction
		      Return "WEB_WATCH_VIDEO_COST_PER_ACTION"
		    Case ReportingColumnAsync.WebWatchVideoRoas
		      Return "WEB_WATCH_VIDEO_ROAS"
		    Case ReportingColumnAsync.TotalWebWatchVideo
		      Return "TOTAL_WEB_WATCH_VIDEO"
		    Case ReportingColumnAsync.TotalWebWatchVideoValueInMicroDollar
		      Return "TOTAL_WEB_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebClickWatchVideo
		      Return "TOTAL_WEB_CLICK_WATCH_VIDEO"
		    Case ReportingColumnAsync.TotalWebClickWatchVideoValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebEngagementWatchVideo
		      Return "TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO"
		    Case ReportingColumnAsync.TotalWebEngagementWatchVideoValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebViewWatchVideo
		      Return "TOTAL_WEB_VIEW_WATCH_VIDEO"
		    Case ReportingColumnAsync.TotalWebViewWatchVideoValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.WebLeadCostPerAction
		      Return "WEB_LEAD_COST_PER_ACTION"
		    Case ReportingColumnAsync.WebLeadRoas
		      Return "WEB_LEAD_ROAS"
		    Case ReportingColumnAsync.TotalWebLead
		      Return "TOTAL_WEB_LEAD"
		    Case ReportingColumnAsync.TotalWebLeadValueInMicroDollar
		      Return "TOTAL_WEB_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebClickLead
		      Return "TOTAL_WEB_CLICK_LEAD"
		    Case ReportingColumnAsync.TotalWebClickLeadValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebEngagementLead
		      Return "TOTAL_WEB_ENGAGEMENT_LEAD"
		    Case ReportingColumnAsync.TotalWebEngagementLeadValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebViewLead
		      Return "TOTAL_WEB_VIEW_LEAD"
		    Case ReportingColumnAsync.TotalWebViewLeadValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.OfflineLeadCostPerAction
		      Return "OFFLINE_LEAD_COST_PER_ACTION"
		    Case ReportingColumnAsync.OfflineLeadRoas
		      Return "OFFLINE_LEAD_ROAS"
		    Case ReportingColumnAsync.TotalOfflineLead
		      Return "TOTAL_OFFLINE_LEAD"
		    Case ReportingColumnAsync.TotalOfflineLeadValueInMicroDollar
		      Return "TOTAL_OFFLINE_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalOfflineClickLead
		      Return "TOTAL_OFFLINE_CLICK_LEAD"
		    Case ReportingColumnAsync.TotalOfflineClickLeadValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalOfflineEngagementLead
		      Return "TOTAL_OFFLINE_ENGAGEMENT_LEAD"
		    Case ReportingColumnAsync.TotalOfflineEngagementLeadValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalOfflineViewLead
		      Return "TOTAL_OFFLINE_VIEW_LEAD"
		    Case ReportingColumnAsync.TotalOfflineViewLeadValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.WebSearchCostPerAction
		      Return "WEB_SEARCH_COST_PER_ACTION"
		    Case ReportingColumnAsync.WebSearchRoas
		      Return "WEB_SEARCH_ROAS"
		    Case ReportingColumnAsync.TotalWebSearch
		      Return "TOTAL_WEB_SEARCH"
		    Case ReportingColumnAsync.TotalWebSearchValueInMicroDollar
		      Return "TOTAL_WEB_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebClickSearch
		      Return "TOTAL_WEB_CLICK_SEARCH"
		    Case ReportingColumnAsync.TotalWebClickSearchValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebEngagementSearch
		      Return "TOTAL_WEB_ENGAGEMENT_SEARCH"
		    Case ReportingColumnAsync.TotalWebEngagementSearchValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebViewSearch
		      Return "TOTAL_WEB_VIEW_SEARCH"
		    Case ReportingColumnAsync.TotalWebViewSearchValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.InappSearchCostPerAction
		      Return "INAPP_SEARCH_COST_PER_ACTION"
		    Case ReportingColumnAsync.InappSearchRoas
		      Return "INAPP_SEARCH_ROAS"
		    Case ReportingColumnAsync.TotalInappSearch
		      Return "TOTAL_INAPP_SEARCH"
		    Case ReportingColumnAsync.TotalInappSearchValueInMicroDollar
		      Return "TOTAL_INAPP_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalInappClickSearch
		      Return "TOTAL_INAPP_CLICK_SEARCH"
		    Case ReportingColumnAsync.TotalInappClickSearchValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalInappEngagementSearch
		      Return "TOTAL_INAPP_ENGAGEMENT_SEARCH"
		    Case ReportingColumnAsync.TotalInappEngagementSearchValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalInappViewSearch
		      Return "TOTAL_INAPP_VIEW_SEARCH"
		    Case ReportingColumnAsync.TotalInappViewSearchValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.WebViewCategoryCostPerAction
		      Return "WEB_VIEW_CATEGORY_COST_PER_ACTION"
		    Case ReportingColumnAsync.WebViewCategoryRoas
		      Return "WEB_VIEW_CATEGORY_ROAS"
		    Case ReportingColumnAsync.TotalWebViewCategory
		      Return "TOTAL_WEB_VIEW_CATEGORY"
		    Case ReportingColumnAsync.TotalWebViewCategoryValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebClickViewCategory
		      Return "TOTAL_WEB_CLICK_VIEW_CATEGORY"
		    Case ReportingColumnAsync.TotalWebClickViewCategoryValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebEngagementViewCategory
		      Return "TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY"
		    Case ReportingColumnAsync.TotalWebEngagementViewCategoryValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebViewViewCategory
		      Return "TOTAL_WEB_VIEW_VIEW_CATEGORY"
		    Case ReportingColumnAsync.TotalWebViewViewCategoryValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.WebCustomCostPerAction
		      Return "WEB_CUSTOM_COST_PER_ACTION"
		    Case ReportingColumnAsync.WebCustomRoas
		      Return "WEB_CUSTOM_ROAS"
		    Case ReportingColumnAsync.TotalWebCustom
		      Return "TOTAL_WEB_CUSTOM"
		    Case ReportingColumnAsync.TotalWebCustomValueInMicroDollar
		      Return "TOTAL_WEB_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebClickCustom
		      Return "TOTAL_WEB_CLICK_CUSTOM"
		    Case ReportingColumnAsync.TotalWebClickCustomValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebEngagementCustom
		      Return "TOTAL_WEB_ENGAGEMENT_CUSTOM"
		    Case ReportingColumnAsync.TotalWebEngagementCustomValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebViewCustom
		      Return "TOTAL_WEB_VIEW_CUSTOM"
		    Case ReportingColumnAsync.TotalWebViewCustomValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.OfflineCustomCostPerAction
		      Return "OFFLINE_CUSTOM_COST_PER_ACTION"
		    Case ReportingColumnAsync.OfflineCustomRoas
		      Return "OFFLINE_CUSTOM_ROAS"
		    Case ReportingColumnAsync.TotalOfflineCustom
		      Return "TOTAL_OFFLINE_CUSTOM"
		    Case ReportingColumnAsync.TotalOfflineCustomValueInMicroDollar
		      Return "TOTAL_OFFLINE_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalOfflineClickCustom
		      Return "TOTAL_OFFLINE_CLICK_CUSTOM"
		    Case ReportingColumnAsync.TotalOfflineClickCustomValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalOfflineEngagementCustom
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CUSTOM"
		    Case ReportingColumnAsync.TotalOfflineEngagementCustomValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalOfflineViewCustom
		      Return "TOTAL_OFFLINE_VIEW_CUSTOM"
		    Case ReportingColumnAsync.TotalOfflineViewCustomValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.WebUnknownCostPerAction
		      Return "WEB_UNKNOWN_COST_PER_ACTION"
		    Case ReportingColumnAsync.WebUnknownRoas
		      Return "WEB_UNKNOWN_ROAS"
		    Case ReportingColumnAsync.TotalWebUnknown
		      Return "TOTAL_WEB_UNKNOWN"
		    Case ReportingColumnAsync.TotalWebUnknownValueInMicroDollar
		      Return "TOTAL_WEB_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebClickUnknown
		      Return "TOTAL_WEB_CLICK_UNKNOWN"
		    Case ReportingColumnAsync.TotalWebClickUnknownValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebEngagementUnknown
		      Return "TOTAL_WEB_ENGAGEMENT_UNKNOWN"
		    Case ReportingColumnAsync.TotalWebEngagementUnknownValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalWebViewUnknown
		      Return "TOTAL_WEB_VIEW_UNKNOWN"
		    Case ReportingColumnAsync.TotalWebViewUnknownValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.InappUnknownCostPerAction
		      Return "INAPP_UNKNOWN_COST_PER_ACTION"
		    Case ReportingColumnAsync.InappUnknownRoas
		      Return "INAPP_UNKNOWN_ROAS"
		    Case ReportingColumnAsync.TotalInappUnknown
		      Return "TOTAL_INAPP_UNKNOWN"
		    Case ReportingColumnAsync.TotalInappUnknownValueInMicroDollar
		      Return "TOTAL_INAPP_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalInappClickUnknown
		      Return "TOTAL_INAPP_CLICK_UNKNOWN"
		    Case ReportingColumnAsync.TotalInappClickUnknownValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalInappEngagementUnknown
		      Return "TOTAL_INAPP_ENGAGEMENT_UNKNOWN"
		    Case ReportingColumnAsync.TotalInappEngagementUnknownValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalInappViewUnknown
		      Return "TOTAL_INAPP_VIEW_UNKNOWN"
		    Case ReportingColumnAsync.TotalInappViewUnknownValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.OfflineUnknownCostPerAction
		      Return "OFFLINE_UNKNOWN_COST_PER_ACTION"
		    Case ReportingColumnAsync.OfflineUnknownRoas
		      Return "OFFLINE_UNKNOWN_ROAS"
		    Case ReportingColumnAsync.TotalOfflineUnknown
		      Return "TOTAL_OFFLINE_UNKNOWN"
		    Case ReportingColumnAsync.TotalOfflineUnknownValueInMicroDollar
		      Return "TOTAL_OFFLINE_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalOfflineClickUnknown
		      Return "TOTAL_OFFLINE_CLICK_UNKNOWN"
		    Case ReportingColumnAsync.TotalOfflineClickUnknownValueInMicroDollar
		      Return "TOTAL_OFFLINE_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalOfflineEngagementUnknown
		      Return "TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN"
		    Case ReportingColumnAsync.TotalOfflineEngagementUnknownValueInMicroDollar
		      Return "TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalOfflineViewUnknown
		      Return "TOTAL_OFFLINE_VIEW_UNKNOWN"
		    Case ReportingColumnAsync.TotalOfflineViewUnknownValueInMicroDollar
		      Return "TOTAL_OFFLINE_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.InappAppInstallCostPerAction
		      Return "INAPP_APP_INSTALL_COST_PER_ACTION"
		    Case ReportingColumnAsync.InappAppInstallRoas
		      Return "INAPP_APP_INSTALL_ROAS"
		    Case ReportingColumnAsync.TotalInappAppInstall
		      Return "TOTAL_INAPP_APP_INSTALL"
		    Case ReportingColumnAsync.TotalInappAppInstallValueInMicroDollar
		      Return "TOTAL_INAPP_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalInappClickAppInstall
		      Return "TOTAL_INAPP_CLICK_APP_INSTALL"
		    Case ReportingColumnAsync.TotalInappClickAppInstallValueInMicroDollar
		      Return "TOTAL_INAPP_CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalInappEngagementAppInstall
		      Return "TOTAL_INAPP_ENGAGEMENT_APP_INSTALL"
		    Case ReportingColumnAsync.TotalInappEngagementAppInstallValueInMicroDollar
		      Return "TOTAL_INAPP_ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalInappViewAppInstall
		      Return "TOTAL_INAPP_VIEW_APP_INSTALL"
		    Case ReportingColumnAsync.TotalInappViewAppInstallValueInMicroDollar
		      Return "TOTAL_INAPP_VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalAppInstallConversionRate
		      Return "TOTAL_APP_INSTALL_CONVERSION_RATE"
		    Case ReportingColumnAsync.TotalInappAppInstallConversionRate
		      Return "TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE"
		    Case ReportingColumnAsync.IdeaPinPageForward1
		      Return "IDEA_PIN_PAGE_FORWARD_1"
		    Case ReportingColumnAsync.IdeaPinPageForward2
		      Return "IDEA_PIN_PAGE_FORWARD_2"
		    Case ReportingColumnAsync.IdeaPinPageBackward1
		      Return "IDEA_PIN_PAGE_BACKWARD_1"
		    Case ReportingColumnAsync.IdeaPinPageBackward2
		      Return "IDEA_PIN_PAGE_BACKWARD_2"
		    Case ReportingColumnAsync.TotalIdeaPinPageForward
		      Return "TOTAL_IDEA_PIN_PAGE_FORWARD"
		    Case ReportingColumnAsync.TotalIdeaPinPageBackward
		      Return "TOTAL_IDEA_PIN_PAGE_BACKWARD"
		    Case ReportingColumnAsync.IdeaPinProductTagVisit1
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_1"
		    Case ReportingColumnAsync.IdeaPinProductTagVisit2
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_2"
		    Case ReportingColumnAsync.TotalIdeaPinProductTagVisit
		      Return "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT"
		    Case ReportingColumnAsync.Leads
		      Return "LEADS"
		    Case ReportingColumnAsync.CostPerLead
		      Return "COST_PER_LEAD"
		    Case ReportingColumnAsync.QuizCompleted
		      Return "QUIZ_COMPLETED"
		    Case ReportingColumnAsync.QuizCompletionRate
		      Return "QUIZ_COMPLETION_RATE"
		    Case ReportingColumnAsync.ShowcasePinClickthrough
		      Return "SHOWCASE_PIN_CLICKTHROUGH"
		    Case ReportingColumnAsync.ShowcaseSubpageClickthrough
		      Return "SHOWCASE_SUBPAGE_CLICKTHROUGH"
		    Case ReportingColumnAsync.ShowcaseSubpinClickthrough
		      Return "SHOWCASE_SUBPIN_CLICKTHROUGH"
		    Case ReportingColumnAsync.ShowcaseSubpageImpression
		      Return "SHOWCASE_SUBPAGE_IMPRESSION"
		    Case ReportingColumnAsync.ShowcaseSubpinImpression
		      Return "SHOWCASE_SUBPIN_IMPRESSION"
		    Case ReportingColumnAsync.ShowcaseSubpageSwipeLeft
		      Return "SHOWCASE_SUBPAGE_SWIPE_LEFT"
		    Case ReportingColumnAsync.ShowcaseSubpageSwipeRight
		      Return "SHOWCASE_SUBPAGE_SWIPE_RIGHT"
		    Case ReportingColumnAsync.ShowcaseSubpinSwipeLeft
		      Return "SHOWCASE_SUBPIN_SWIPE_LEFT"
		    Case ReportingColumnAsync.ShowcaseSubpinSwipeRight
		      Return "SHOWCASE_SUBPIN_SWIPE_RIGHT"
		    Case ReportingColumnAsync.ShowcaseSubpageRepin
		      Return "SHOWCASE_SUBPAGE_REPIN"
		    Case ReportingColumnAsync.ShowcaseSubpinRepin
		      Return "SHOWCASE_SUBPIN_REPIN"
		    Case ReportingColumnAsync.ShowcaseSubpageCloseup
		      Return "SHOWCASE_SUBPAGE_CLOSEUP"
		    Case ReportingColumnAsync.ShowcaseCardThumbnailSwipeForward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD"
		    Case ReportingColumnAsync.ShowcaseCardThumbnailSwipeBackward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD"
		    Case ReportingColumnAsync.ShowcaseAverageSubpageCloseupPerSession
		      Return "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION"
		    Case ReportingColumnAsync.TotalCheckoutConversionRate
		      Return "TOTAL_CHECKOUT_CONVERSION_RATE"
		    Case ReportingColumnAsync.TotalViewCategoryConversionRate
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_RATE"
		    Case ReportingColumnAsync.TotalAddToCartConversionRate
		      Return "TOTAL_ADD_TO_CART_CONVERSION_RATE"
		    Case ReportingColumnAsync.TotalSignupConversionRate
		      Return "TOTAL_SIGNUP_CONVERSION_RATE"
		    Case ReportingColumnAsync.TotalPageVisitConversionRate
		      Return "TOTAL_PAGE_VISIT_CONVERSION_RATE"
		    Case ReportingColumnAsync.TotalLeadConversionRate
		      Return "TOTAL_LEAD_CONVERSION_RATE"
		    Case ReportingColumnAsync.TotalSearchConversionRate
		      Return "TOTAL_SEARCH_CONVERSION_RATE"
		    Case ReportingColumnAsync.TotalWatchVideoConversionRate
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_RATE"
		    Case ReportingColumnAsync.TotalUnknownConversionRate
		      Return "TOTAL_UNKNOWN_CONVERSION_RATE"
		    Case ReportingColumnAsync.TotalCustomConversionRate
		      Return "TOTAL_CUSTOM_CONVERSION_RATE"
		    Case ReportingColumnAsync.StandardAdFeedItemId
		      Return "STANDARD_AD_FEED_ITEM_ID"
		    Case ReportingColumnAsync.SpendOrderLineId
		      Return "SPEND_ORDER_LINE_ID"
		    Case ReportingColumnAsync.InappSkanAppInstall
		      Return "INAPP_SKAN_APP_INSTALL"
		    Case ReportingColumnAsync.InappSkanAssistedAppInstall
		      Return "INAPP_SKAN_ASSISTED_APP_INSTALL"
		    Case ReportingColumnAsync.InappSkanAppInstallCostPerAction
		      Return "INAPP_SKAN_APP_INSTALL_COST_PER_ACTION"
		    Case ReportingColumnAsync.InappSkanAppInstallConversionRate
		      Return "INAPP_SKAN_APP_INSTALL_CONVERSION_RATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ReportingColumnSyncToString(value As ReportingColumnSync) As String
		  Select Case value
		    Case ReportingColumnSync.SpendInMicroDollar
		      Return "SPEND_IN_MICRO_DOLLAR"
		    Case ReportingColumnSync.PaidImpression
		      Return "PAID_IMPRESSION"
		    Case ReportingColumnSync.SpendInDollar
		      Return "SPEND_IN_DOLLAR"
		    Case ReportingColumnSync.CpcInMicroDollar
		      Return "CPC_IN_MICRO_DOLLAR"
		    Case ReportingColumnSync.EcpcInMicroDollar
		      Return "ECPC_IN_MICRO_DOLLAR"
		    Case ReportingColumnSync.EcpcInDollar
		      Return "ECPC_IN_DOLLAR"
		    Case ReportingColumnSync.Ctr
		      Return "CTR"
		    Case ReportingColumnSync.Ectr
		      Return "ECTR"
		    Case ReportingColumnSync.OutboundCtr1
		      Return "OUTBOUND_CTR_1"
		    Case ReportingColumnSync.CampaignName
		      Return "CAMPAIGN_NAME"
		    Case ReportingColumnSync.CampaignBrandLabel
		      Return "CAMPAIGN_BRAND_LABEL"
		    Case ReportingColumnSync.PinId
		      Return "PIN_ID"
		    Case ReportingColumnSync.TotalEngagement
		      Return "TOTAL_ENGAGEMENT"
		    Case ReportingColumnSync.Engagement1
		      Return "ENGAGEMENT_1"
		    Case ReportingColumnSync.Engagement2
		      Return "ENGAGEMENT_2"
		    Case ReportingColumnSync.EcpeInDollar
		      Return "ECPE_IN_DOLLAR"
		    Case ReportingColumnSync.EngagementRate
		      Return "ENGAGEMENT_RATE"
		    Case ReportingColumnSync.EengagementRate
		      Return "EENGAGEMENT_RATE"
		    Case ReportingColumnSync.EcpmInMicroDollar
		      Return "ECPM_IN_MICRO_DOLLAR"
		    Case ReportingColumnSync.RepinRate
		      Return "REPIN_RATE"
		    Case ReportingColumnSync.Ctr2
		      Return "CTR_2"
		    Case ReportingColumnSync.CampaignId
		      Return "CAMPAIGN_ID"
		    Case ReportingColumnSync.AdvertiserId
		      Return "ADVERTISER_ID"
		    Case ReportingColumnSync.AdAccountId
		      Return "AD_ACCOUNT_ID"
		    Case ReportingColumnSync.PinPromotionId
		      Return "PIN_PROMOTION_ID"
		    Case ReportingColumnSync.AdId
		      Return "AD_ID"
		    Case ReportingColumnSync.AdGroupId
		      Return "AD_GROUP_ID"
		    Case ReportingColumnSync.CampaignEntityStatus
		      Return "CAMPAIGN_ENTITY_STATUS"
		    Case ReportingColumnSync.CampaignObjectiveType
		      Return "CAMPAIGN_OBJECTIVE_TYPE"
		    Case ReportingColumnSync.CpmInMicroDollar
		      Return "CPM_IN_MICRO_DOLLAR"
		    Case ReportingColumnSync.CpmInDollar
		      Return "CPM_IN_DOLLAR"
		    Case ReportingColumnSync.AdGroupName
		      Return "AD_GROUP_NAME"
		    Case ReportingColumnSync.AdGroupBudgetType
		      Return "AD_GROUP_BUDGET_TYPE"
		    Case ReportingColumnSync.AdGroupBudgetInLocalCurrency
		      Return "AD_GROUP_BUDGET_IN_LOCAL_CURRENCY"
		    Case ReportingColumnSync.AdGroupEntityStatus
		      Return "AD_GROUP_ENTITY_STATUS"
		    Case ReportingColumnSync.AdGroupBidMultiplier
		      Return "AD_GROUP_BID_MULTIPLIER"
		    Case ReportingColumnSync.PromoId
		      Return "PROMO_ID"
		    Case ReportingColumnSync.PromoName
		      Return "PROMO_NAME"
		    Case ReportingColumnSync.OrderLineId
		      Return "ORDER_LINE_ID"
		    Case ReportingColumnSync.OrderLineName
		      Return "ORDER_LINE_NAME"
		    Case ReportingColumnSync.Clickthrough1
		      Return "CLICKTHROUGH_1"
		    Case ReportingColumnSync.Repin1
		      Return "REPIN_1"
		    Case ReportingColumnSync.Impression1
		      Return "IMPRESSION_1"
		    Case ReportingColumnSync.Impression1Gross
		      Return "IMPRESSION_1_GROSS"
		    Case ReportingColumnSync.Clickthrough1Gross
		      Return "CLICKTHROUGH_1_GROSS"
		    Case ReportingColumnSync.OutboundClick1
		      Return "OUTBOUND_CLICK_1"
		    Case ReportingColumnSync.Clickthrough2
		      Return "CLICKTHROUGH_2"
		    Case ReportingColumnSync.Repin2
		      Return "REPIN_2"
		    Case ReportingColumnSync.Impression2
		      Return "IMPRESSION_2"
		    Case ReportingColumnSync.OutboundClick2
		      Return "OUTBOUND_CLICK_2"
		    Case ReportingColumnSync.CollectionPinItemImpression1
		      Return "COLLECTION_PIN_ITEM_IMPRESSION_1"
		    Case ReportingColumnSync.CollectionPinItemImpression2
		      Return "COLLECTION_PIN_ITEM_IMPRESSION_2"
		    Case ReportingColumnSync.TotalCollectionPinItemImpression
		      Return "TOTAL_COLLECTION_PIN_ITEM_IMPRESSION"
		    Case ReportingColumnSync.CollectionPinItemClickthrough1
		      Return "COLLECTION_PIN_ITEM_CLICKTHROUGH_1"
		    Case ReportingColumnSync.CollectionPinItemClickthrough2
		      Return "COLLECTION_PIN_ITEM_CLICKTHROUGH_2"
		    Case ReportingColumnSync.TotalCollectionPinItemClickthrough
		      Return "TOTAL_COLLECTION_PIN_ITEM_CLICKTHROUGH"
		    Case ReportingColumnSync.TotalClickthrough
		      Return "TOTAL_CLICKTHROUGH"
		    Case ReportingColumnSync.TotalImpression
		      Return "TOTAL_IMPRESSION"
		    Case ReportingColumnSync.TotalImpressionUser
		      Return "TOTAL_IMPRESSION_USER"
		    Case ReportingColumnSync.TotalImpressionFrequency
		      Return "TOTAL_IMPRESSION_FREQUENCY"
		    Case ReportingColumnSync.CostPerOutboundClickInDollar
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR"
		    Case ReportingColumnSync.CostPerOutboundClickInDollar1
		      Return "COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1"
		    Case ReportingColumnSync.TotalEngagementSignup
		      Return "TOTAL_ENGAGEMENT_SIGNUP"
		    Case ReportingColumnSync.TotalEngagementCheckout
		      Return "TOTAL_ENGAGEMENT_CHECKOUT"
		    Case ReportingColumnSync.TotalEngagementLead
		      Return "TOTAL_ENGAGEMENT_LEAD"
		    Case ReportingColumnSync.TotalClickSignup
		      Return "TOTAL_CLICK_SIGNUP"
		    Case ReportingColumnSync.TotalClickCheckout
		      Return "TOTAL_CLICK_CHECKOUT"
		    Case ReportingColumnSync.TotalClickAddToCart
		      Return "TOTAL_CLICK_ADD_TO_CART"
		    Case ReportingColumnSync.TotalClickLead
		      Return "TOTAL_CLICK_LEAD"
		    Case ReportingColumnSync.TotalViewSignup
		      Return "TOTAL_VIEW_SIGNUP"
		    Case ReportingColumnSync.TotalViewCheckout
		      Return "TOTAL_VIEW_CHECKOUT"
		    Case ReportingColumnSync.TotalViewAddToCart
		      Return "TOTAL_VIEW_ADD_TO_CART"
		    Case ReportingColumnSync.TotalViewLead
		      Return "TOTAL_VIEW_LEAD"
		    Case ReportingColumnSync.TotalConversions
		      Return "TOTAL_CONVERSIONS"
		    Case ReportingColumnSync.TotalEngagementSignupValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnSync.TotalEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnSync.TotalClickSignupValueInMicroDollar
		      Return "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnSync.TotalClickCheckoutValueInMicroDollar
		      Return "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnSync.TotalViewSignupValueInMicroDollar
		      Return "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnSync.TotalViewCheckoutValueInMicroDollar
		      Return "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnSync.TotalWebSessions
		      Return "TOTAL_WEB_SESSIONS"
		    Case ReportingColumnSync.WebSessions1
		      Return "WEB_SESSIONS_1"
		    Case ReportingColumnSync.WebSessions2
		      Return "WEB_SESSIONS_2"
		    Case ReportingColumnSync.AdName
		      Return "AD_NAME"
		    Case ReportingColumnSync.CampaignLifetimeSpendCap
		      Return "CAMPAIGN_LIFETIME_SPEND_CAP"
		    Case ReportingColumnSync.AdGroupOptimization
		      Return "AD_GROUP_OPTIMIZATION"
		    Case ReportingColumnSync.CampaignDailySpendCap
		      Return "CAMPAIGN_DAILY_SPEND_CAP"
		    Case ReportingColumnSync.CampaignBudgetOptimization
		      Return "CAMPAIGN_BUDGET_OPTIMIZATION"
		    Case ReportingColumnSync.IsPremiereCampaign
		      Return "IS_PREMIERE_CAMPAIGN"
		    Case ReportingColumnSync.TotalPageVisit
		      Return "TOTAL_PAGE_VISIT"
		    Case ReportingColumnSync.TotalSignup
		      Return "TOTAL_SIGNUP"
		    Case ReportingColumnSync.TotalCheckout
		      Return "TOTAL_CHECKOUT"
		    Case ReportingColumnSync.TotalCustom
		      Return "TOTAL_CUSTOM"
		    Case ReportingColumnSync.TotalLead
		      Return "TOTAL_LEAD"
		    Case ReportingColumnSync.TotalAddToWishlist
		      Return "TOTAL_ADD_TO_WISHLIST"
		    Case ReportingColumnSync.TotalSubscribe
		      Return "TOTAL_SUBSCRIBE"
		    Case ReportingColumnSync.TotalSignupValueInMicroDollar
		      Return "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnSync.TotalCheckoutValueInMicroDollar
		      Return "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnSync.TotalCustomValueInMicroDollar
		      Return "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnSync.PageVisitCostPerAction
		      Return "PAGE_VISIT_COST_PER_ACTION"
		    Case ReportingColumnSync.PageVisitRoas
		      Return "PAGE_VISIT_ROAS"
		    Case ReportingColumnSync.CheckoutRoas
		      Return "CHECKOUT_ROAS"
		    Case ReportingColumnSync.CustomRoas
		      Return "CUSTOM_ROAS"
		    Case ReportingColumnSync.ProductGroupAdImageTag
		      Return "PRODUCT_GROUP_AD_IMAGE_TAG"
		    Case ReportingColumnSync.ProductGroupAdVideoTag
		      Return "PRODUCT_GROUP_AD_VIDEO_TAG"
		    Case ReportingColumnSync.Video3secViews1
		      Return "VIDEO_3SEC_VIEWS_1"
		    Case ReportingColumnSync.Video15secUniqueViews1
		      Return "VIDEO_15SEC_UNIQUE_VIEWS_1"
		    Case ReportingColumnSync.VideoMrcViews1
		      Return "VIDEO_MRC_VIEWS_1"
		    Case ReportingColumnSync.Video3secViews2
		      Return "VIDEO_3SEC_VIEWS_2"
		    Case ReportingColumnSync.Video15secUniqueViews2
		      Return "VIDEO_15SEC_UNIQUE_VIEWS_2"
		    Case ReportingColumnSync.VideoP100Complete2
		      Return "VIDEO_P100_COMPLETE_2"
		    Case ReportingColumnSync.VideoP0Combined2
		      Return "VIDEO_P0_COMBINED_2"
		    Case ReportingColumnSync.VideoP25Combined2
		      Return "VIDEO_P25_COMBINED_2"
		    Case ReportingColumnSync.VideoP50Combined2
		      Return "VIDEO_P50_COMBINED_2"
		    Case ReportingColumnSync.VideoP75Combined2
		      Return "VIDEO_P75_COMBINED_2"
		    Case ReportingColumnSync.VideoP95Combined2
		      Return "VIDEO_P95_COMBINED_2"
		    Case ReportingColumnSync.VideoMrcViews2
		      Return "VIDEO_MRC_VIEWS_2"
		    Case ReportingColumnSync.PaidVideoViewableRate
		      Return "PAID_VIDEO_VIEWABLE_RATE"
		    Case ReportingColumnSync.VideoLength
		      Return "VIDEO_LENGTH"
		    Case ReportingColumnSync.VideoSpendInDollar
		      Return "VIDEO_SPEND_IN_DOLLAR"
		    Case ReportingColumnSync.EcpvInDollar
		      Return "ECPV_IN_DOLLAR"
		    Case ReportingColumnSync.EcpcvInDollar
		      Return "ECPCV_IN_DOLLAR"
		    Case ReportingColumnSync.EcpcvP95InDollar
		      Return "ECPCV_P95_IN_DOLLAR"
		    Case ReportingColumnSync.TotalVideo3secViews
		      Return "TOTAL_VIDEO_3SEC_VIEWS"
		    Case ReportingColumnSync.TotalVideo15secUniqueViews
		      Return "TOTAL_VIDEO_15SEC_UNIQUE_VIEWS"
		    Case ReportingColumnSync.TotalVideoP100Complete
		      Return "TOTAL_VIDEO_P100_COMPLETE"
		    Case ReportingColumnSync.TotalVideoP0Combined
		      Return "TOTAL_VIDEO_P0_COMBINED"
		    Case ReportingColumnSync.TotalVideoP25Combined
		      Return "TOTAL_VIDEO_P25_COMBINED"
		    Case ReportingColumnSync.TotalVideoP50Combined
		      Return "TOTAL_VIDEO_P50_COMBINED"
		    Case ReportingColumnSync.TotalVideoP75Combined
		      Return "TOTAL_VIDEO_P75_COMBINED"
		    Case ReportingColumnSync.TotalVideoP95Combined
		      Return "TOTAL_VIDEO_P95_COMBINED"
		    Case ReportingColumnSync.TotalVideoMrcViews
		      Return "TOTAL_VIDEO_MRC_VIEWS"
		    Case ReportingColumnSync.TotalVideoAvgWatchtimeInSecond
		      Return "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND"
		    Case ReportingColumnSync.TotalRepinRate
		      Return "TOTAL_REPIN_RATE"
		    Case ReportingColumnSync.WebCheckoutCostPerAction
		      Return "WEB_CHECKOUT_COST_PER_ACTION"
		    Case ReportingColumnSync.WebCheckoutRoas
		      Return "WEB_CHECKOUT_ROAS"
		    Case ReportingColumnSync.TotalWebCheckout
		      Return "TOTAL_WEB_CHECKOUT"
		    Case ReportingColumnSync.TotalWebCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnSync.TotalWebClickCheckout
		      Return "TOTAL_WEB_CLICK_CHECKOUT"
		    Case ReportingColumnSync.TotalWebClickCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnSync.TotalWebEngagementCheckout
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT"
		    Case ReportingColumnSync.TotalWebEngagementCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnSync.TotalWebViewCheckout
		      Return "TOTAL_WEB_VIEW_CHECKOUT"
		    Case ReportingColumnSync.TotalWebViewCheckoutValueInMicroDollar
		      Return "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnSync.InappCheckoutCostPerAction
		      Return "INAPP_CHECKOUT_COST_PER_ACTION"
		    Case ReportingColumnSync.TotalOfflineCheckout
		      Return "TOTAL_OFFLINE_CHECKOUT"
		    Case ReportingColumnSync.TotalAppInstallConversionRate
		      Return "TOTAL_APP_INSTALL_CONVERSION_RATE"
		    Case ReportingColumnSync.TotalInappAppInstallConversionRate
		      Return "TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE"
		    Case ReportingColumnSync.IdeaPinProductTagVisit1
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_1"
		    Case ReportingColumnSync.IdeaPinProductTagVisit2
		      Return "IDEA_PIN_PRODUCT_TAG_VISIT_2"
		    Case ReportingColumnSync.TotalIdeaPinProductTagVisit
		      Return "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT"
		    Case ReportingColumnSync.Leads
		      Return "LEADS"
		    Case ReportingColumnSync.CostPerLead
		      Return "COST_PER_LEAD"
		    Case ReportingColumnSync.QuizCompleted
		      Return "QUIZ_COMPLETED"
		    Case ReportingColumnSync.QuizPinResultOpen
		      Return "QUIZ_PIN_RESULT_OPEN"
		    Case ReportingColumnSync.QuizCompletionRate
		      Return "QUIZ_COMPLETION_RATE"
		    Case ReportingColumnSync.ShowcasePinClickthrough
		      Return "SHOWCASE_PIN_CLICKTHROUGH"
		    Case ReportingColumnSync.ShowcaseSubpageClickthrough
		      Return "SHOWCASE_SUBPAGE_CLICKTHROUGH"
		    Case ReportingColumnSync.ShowcaseSubpinClickthrough
		      Return "SHOWCASE_SUBPIN_CLICKTHROUGH"
		    Case ReportingColumnSync.ShowcaseSubpageImpression
		      Return "SHOWCASE_SUBPAGE_IMPRESSION"
		    Case ReportingColumnSync.ShowcaseSubpinImpression
		      Return "SHOWCASE_SUBPIN_IMPRESSION"
		    Case ReportingColumnSync.ShowcaseSubpageSwipeLeft
		      Return "SHOWCASE_SUBPAGE_SWIPE_LEFT"
		    Case ReportingColumnSync.ShowcaseSubpageSwipeRight
		      Return "SHOWCASE_SUBPAGE_SWIPE_RIGHT"
		    Case ReportingColumnSync.ShowcaseSubpinSwipeLeft
		      Return "SHOWCASE_SUBPIN_SWIPE_LEFT"
		    Case ReportingColumnSync.ShowcaseSubpinSwipeRight
		      Return "SHOWCASE_SUBPIN_SWIPE_RIGHT"
		    Case ReportingColumnSync.ShowcaseSubpageRepin
		      Return "SHOWCASE_SUBPAGE_REPIN"
		    Case ReportingColumnSync.ShowcaseSubpinRepin
		      Return "SHOWCASE_SUBPIN_REPIN"
		    Case ReportingColumnSync.ShowcaseSubpageCloseup
		      Return "SHOWCASE_SUBPAGE_CLOSEUP"
		    Case ReportingColumnSync.ShowcaseCardThumbnailSwipeForward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD"
		    Case ReportingColumnSync.ShowcaseCardThumbnailSwipeBackward
		      Return "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD"
		    Case ReportingColumnSync.ShowcaseAverageSubpageCloseupPerSession
		      Return "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION"
		    Case ReportingColumnSync.TotalCheckoutConversionRate
		      Return "TOTAL_CHECKOUT_CONVERSION_RATE"
		    Case ReportingColumnSync.TotalViewCategoryConversionRate
		      Return "TOTAL_VIEW_CATEGORY_CONVERSION_RATE"
		    Case ReportingColumnSync.TotalAddToCartConversionRate
		      Return "TOTAL_ADD_TO_CART_CONVERSION_RATE"
		    Case ReportingColumnSync.TotalSignupConversionRate
		      Return "TOTAL_SIGNUP_CONVERSION_RATE"
		    Case ReportingColumnSync.TotalPageVisitConversionRate
		      Return "TOTAL_PAGE_VISIT_CONVERSION_RATE"
		    Case ReportingColumnSync.TotalLeadConversionRate
		      Return "TOTAL_LEAD_CONVERSION_RATE"
		    Case ReportingColumnSync.TotalSearchConversionRate
		      Return "TOTAL_SEARCH_CONVERSION_RATE"
		    Case ReportingColumnSync.TotalWatchVideoConversionRate
		      Return "TOTAL_WATCH_VIDEO_CONVERSION_RATE"
		    Case ReportingColumnSync.TotalUnknownConversionRate
		      Return "TOTAL_UNKNOWN_CONVERSION_RATE"
		    Case ReportingColumnSync.TotalCustomConversionRate
		      Return "TOTAL_CUSTOM_CONVERSION_RATE"
		    Case ReportingColumnSync.InappSkanAppInstall
		      Return "INAPP_SKAN_APP_INSTALL"
		    Case ReportingColumnSync.InappSkanAssistedAppInstall
		      Return "INAPP_SKAN_ASSISTED_APP_INSTALL"
		    Case ReportingColumnSync.InappSkanAppInstallCostPerAction
		      Return "INAPP_SKAN_APP_INSTALL_COST_PER_ACTION"
		    Case ReportingColumnSync.InappSkanAppInstallConversionRate
		      Return "INAPP_SKAN_APP_INSTALL_CONVERSION_RATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ReportingTimeZoneToString(value As ReportingTimeZone) As String
		  Select Case value
		    Case ReportingTimeZone.PinterestTimeZone
		      Return "PINTEREST_TIME_ZONE"
		    Case ReportingTimeZone.AdAccountTimeZone
		      Return "AD_ACCOUNT_TIME_ZONE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function RoleToString(value As Role) As String
		  Select Case value
		    Case Role.Unknown
		      Return "UNKNOWN"
		    Case Role.Owner
		      Return "OWNER"
		    Case Role.Admin
		      Return "ADMIN"
		    Case Role.Analyst
		      Return "ANALYST"
		    Case Role.SosReader
		      Return "SOS_READER"
		    Case Role.FinanceManager
		      Return "FINANCE_MANAGER"
		    Case Role.FinanceEdit
		      Return "FINANCE_EDIT"
		    Case Role.FinanceView
		      Return "FINANCE_VIEW"
		    Case Role.AudienceManager
		      Return "AUDIENCE_MANAGER"
		    Case Role.CampaignManager
		      Return "CAMPAIGN_MANAGER"
		    Case Role.CatalogsManager
		      Return "CATALOGS_MANAGER"
		    Case Role.CatalogsViewer
		      Return "CATALOGS_VIEWER"
		    Case Role.RestrictedOwner
		      Return "RESTRICTED_OWNER"
		    Case Role.ProfileManager
		      Return "PROFILE_MANAGER"
		    Case Role.ProfilePublisher
		      Return "PROFILE_PUBLISHER"
		    Case Role.ResourcePinnerListOwner
		      Return "RESOURCE_PINNER_LIST_OWNER"
		    Case Role.ResourcePinnerListReader
		      Return "RESOURCE_PINNER_LIST_READER"
		    Case Role.BizPinnerListSharer
		      Return "BIZ_PINNER_LIST_SHARER"
		    Case Role.ResourceConversionTagsReader
		      Return "RESOURCE_CONVERSION_TAGS_READER"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function SSIOOrderLineTypeToString(value As SSIOOrderLineType) As String
		  Select Case value
		    Case SSIOOrderLineType.Budget
		      Return "BUDGET"
		    Case SSIOOrderLineType.Perpetuals
		      Return "PERPETUALS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ScheduleActionToString(value As ScheduleAction) As String
		  Select Case value
		    Case ScheduleAction.IncreaseByValue
		      Return "INCREASE_BY_VALUE"
		    Case ScheduleAction.IncreaseByPercent
		      Return "INCREASE_BY_PERCENT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ScheduleStatusToString(value As ScheduleStatus) As String
		  Select Case value
		    Case ScheduleStatus.Draft
		      Return "DRAFT"
		    Case ScheduleStatus.Created
		      Return "CREATED"
		    Case ScheduleStatus.Scheduled
		      Return "SCHEDULED"
		    Case ScheduleStatus.Active
		      Return "ACTIVE"
		    Case ScheduleStatus.Completed
		      Return "COMPLETED"
		    Case ScheduleStatus.Failed
		      Return "FAILED"
		    Case ScheduleStatus.Canceled
		      Return "CANCELED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ScheduleTypeToString(value As ScheduleType) As String
		  Select Case value
		    Case ScheduleType.CampaignBudgetChange
		      Return "CAMPAIGN_BUDGET_CHANGE"
		    Case ScheduleType.CampaignBidMultipliers
		      Return "CAMPAIGN_BID_MULTIPLIERS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function SourcePlatformOptionsToString(value As SourcePlatformOptions) As String
		  Select Case value
		    Case SourcePlatformOptions.Web
		      Return "WEB"
		    Case SourcePlatformOptions.Mobile
		      Return "MOBILE"
		    Case SourcePlatformOptions.MobileAndroid
		      Return "MOBILE_ANDROID"
		    Case SourcePlatformOptions.MobileIos
		      Return "MOBILE_IOS"
		    Case SourcePlatformOptions.Offline
		      Return "OFFLINE"
		    Case SourcePlatformOptions.PinterestWeb
		      Return "PINTEREST_WEB"
		    Case SourcePlatformOptions.PinterestAndroid
		      Return "PINTEREST_ANDROID"
		    Case SourcePlatformOptions.PinterestIos
		      Return "PINTEREST_IOS"
		    Case SourcePlatformOptions.PointOfSale
		      Return "POINT_OF_SALE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function StandardPinMetricTypesToString(value As StandardPinMetricTypes) As String
		  Select Case value
		    Case StandardPinMetricTypes.Impression
		      Return "IMPRESSION"
		    Case StandardPinMetricTypes.OutboundClick
		      Return "OUTBOUND_CLICK"
		    Case StandardPinMetricTypes.PinClick
		      Return "PIN_CLICK"
		    Case StandardPinMetricTypes.Save
		      Return "SAVE"
		    Case StandardPinMetricTypes.SaveRate
		      Return "SAVE_RATE"
		    Case StandardPinMetricTypes.TotalComments
		      Return "TOTAL_COMMENTS"
		    Case StandardPinMetricTypes.TotalReactions
		      Return "TOTAL_REACTIONS"
		    Case StandardPinMetricTypes.UserFollow
		      Return "USER_FOLLOW"
		    Case StandardPinMetricTypes.ProfileVisit
		      Return "PROFILE_VISIT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function SummaryStatusToString(value As SummaryStatus) As String
		  Select Case value
		    Case SummaryStatus.Running
		      Return "RUNNING"
		    Case SummaryStatus.Paused
		      Return "PAUSED"
		    Case SummaryStatus.NotStarted
		      Return "NOT_STARTED"
		    Case SummaryStatus.Completed
		      Return "COMPLETED"
		    Case SummaryStatus.AdvertiserDisabled
		      Return "ADVERTISER_DISABLED"
		    Case SummaryStatus.Archived
		      Return "ARCHIVED"
		    Case SummaryStatus.Draft
		      Return "DRAFT"
		    Case SummaryStatus.DeletedDraft
		      Return "DELETED_DRAFT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function SupplementalItemBatchOperationStatusToString(value As SupplementalItemBatchOperationStatus) As String
		  Select Case value
		    Case SupplementalItemBatchOperationStatus.Processing
		      Return "PROCESSING"
		    Case SupplementalItemBatchOperationStatus.Completed
		      Return "COMPLETED"
		    Case SupplementalItemBatchOperationStatus.Failed
		      Return "FAILED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function SupplementalItemProcessingStatusToString(value As SupplementalItemProcessingStatus) As String
		  Select Case value
		    Case SupplementalItemProcessingStatus.Success
		      Return "SUCCESS"
		    Case SupplementalItemProcessingStatus.Failure
		      Return "FAILURE"
		    Case SupplementalItemProcessingStatus.Processing
		      Return "PROCESSING"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TargetingAdvertiserCountryToString(value As TargetingAdvertiserCountry) As String
		  Select Case value
		    Case TargetingAdvertiserCountry.Us
		      Return "US"
		    Case TargetingAdvertiserCountry.Gb
		      Return "GB"
		    Case TargetingAdvertiserCountry.Ca
		      Return "CA"
		    Case TargetingAdvertiserCountry.Ie
		      Return "IE"
		    Case TargetingAdvertiserCountry.Au
		      Return "AU"
		    Case TargetingAdvertiserCountry.Nz
		      Return "NZ"
		    Case TargetingAdvertiserCountry.Fr
		      Return "FR"
		    Case TargetingAdvertiserCountry.Se
		      Return "SE"
		    Case TargetingAdvertiserCountry.Il
		      Return "IL"
		    Case TargetingAdvertiserCountry.De
		      Return "DE"
		    Case TargetingAdvertiserCountry.At
		      Return "AT"
		    Case TargetingAdvertiserCountry.It
		      Return "IT"
		    Case TargetingAdvertiserCountry.Es
		      Return "ES"
		    Case TargetingAdvertiserCountry.Nl
		      Return "NL"
		    Case TargetingAdvertiserCountry.Be
		      Return "BE"
		    Case TargetingAdvertiserCountry.Pt
		      Return "PT"
		    Case TargetingAdvertiserCountry.Ch
		      Return "CH"
		    Case TargetingAdvertiserCountry.Hk
		      Return "HK"
		    Case TargetingAdvertiserCountry.Jp
		      Return "JP"
		    Case TargetingAdvertiserCountry.Kr
		      Return "KR"
		    Case TargetingAdvertiserCountry.Sg
		      Return "SG"
		    Case TargetingAdvertiserCountry.Escapedfalse
		      Return "false"
		    Case TargetingAdvertiserCountry.Dk
		      Return "DK"
		    Case TargetingAdvertiserCountry.Fi
		      Return "FI"
		    Case TargetingAdvertiserCountry.Cy
		      Return "CY"
		    Case TargetingAdvertiserCountry.Lu
		      Return "LU"
		    Case TargetingAdvertiserCountry.Mt
		      Return "MT"
		    Case TargetingAdvertiserCountry.Pl
		      Return "PL"
		    Case TargetingAdvertiserCountry.Ro
		      Return "RO"
		    Case TargetingAdvertiserCountry.Hu
		      Return "HU"
		    Case TargetingAdvertiserCountry.Cz
		      Return "CZ"
		    Case TargetingAdvertiserCountry.Gr
		      Return "GR"
		    Case TargetingAdvertiserCountry.Sk
		      Return "SK"
		    Case TargetingAdvertiserCountry.Br
		      Return "BR"
		    Case TargetingAdvertiserCountry.Mx
		      Return "MX"
		    Case TargetingAdvertiserCountry.Ar
		      Return "AR"
		    Case TargetingAdvertiserCountry.Cl
		      Return "CL"
		    Case TargetingAdvertiserCountry.Co
		      Return "CO"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TargetingSpecAgeBucketToString(value As TargetingSpecAgeBucket) As String
		  Select Case value
		    Case TargetingSpecAgeBucket.Escaped1824
		      Return "18-24"
		    Case TargetingSpecAgeBucket.Escaped19Plus
		      Return "19+"
		    Case TargetingSpecAgeBucket.Escaped20Plus
		      Return "20+"
		    Case TargetingSpecAgeBucket.Escaped21Plus
		      Return "21+"
		    Case TargetingSpecAgeBucket.Escaped2534
		      Return "25-34"
		    Case TargetingSpecAgeBucket.Escaped3544
		      Return "35-44"
		    Case TargetingSpecAgeBucket.Escaped4549
		      Return "45-49"
		    Case TargetingSpecAgeBucket.Escaped5054
		      Return "50-54"
		    Case TargetingSpecAgeBucket.Escaped5564
		      Return "55-64"
		    Case TargetingSpecAgeBucket.Escaped65Plus
		      Return "65+"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TargetingSpecAppTypeToString(value As TargetingSpecAppType) As String
		  Select Case value
		    Case TargetingSpecAppType.AndroidMobile
		      Return "android_mobile"
		    Case TargetingSpecAppType.AndroidTablet
		      Return "android_tablet"
		    Case TargetingSpecAppType.Ipad
		      Return "ipad"
		    Case TargetingSpecAppType.Iphone
		      Return "iphone"
		    Case TargetingSpecAppType.Web
		      Return "web"
		    Case TargetingSpecAppType.WebMobile
		      Return "web_mobile"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TargetingSpecGenderToString(value As TargetingSpecGender) As String
		  Select Case value
		    Case TargetingSpecGender.Unknown
		      Return "unknown"
		    Case TargetingSpecGender.Male
		      Return "male"
		    Case TargetingSpecGender.Female
		      Return "female"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TargetingSpecListOperationToString(value As TargetingSpecListOperation) As String
		  Select Case value
		    Case TargetingSpecListOperation.Set
		      Return "SET"
		    Case TargetingSpecListOperation.Add
		      Return "ADD"
		    Case TargetingSpecListOperation.Remove
		      Return "REMOVE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TargetingSpecTargetingStrategyItemsToString(value As TargetingSpecTargetingStrategyItems) As String
		  Select Case value
		    Case TargetingSpecTargetingStrategyItems.ChooseYourOwn
		      Return "CHOOSE_YOUR_OWN"
		    Case TargetingSpecTargetingStrategyItems.FindNewCustomers
		      Return "FIND_NEW_CUSTOMERS"
		    Case TargetingSpecTargetingStrategyItems.ReconnectWithUsers
		      Return "RECONNECT_WITH_USERS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TargetingStrategyToString(value As TargetingStrategy) As String
		  Select Case value
		    Case TargetingStrategy.ChooseYourOwn
		      Return "CHOOSE_YOUR_OWN"
		    Case TargetingStrategy.FindNewCustomers
		      Return "FIND_NEW_CUSTOMERS"
		    Case TargetingStrategy.ReconnectWithUsers
		      Return "RECONNECT_WITH_USERS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TargetingTemplateStatusToString(value As TargetingTemplateStatus) As String
		  Select Case value
		    Case TargetingTemplateStatus.Active
		      Return "ACTIVE"
		    Case TargetingTemplateStatus.Deleted
		      Return "DELETED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TieBreakerTypeToString(value As TieBreakerType) As String
		  Select Case value
		    Case TieBreakerType.Random
		      Return "RANDOM"
		    Case TieBreakerType.Custom
		      Return "CUSTOM"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TokenGrantTypeToString(value As TokenGrantType) As String
		  Select Case value
		    Case TokenGrantType.AuthorizationCode
		      Return "authorization_code"
		    Case TokenGrantType.RefreshToken
		      Return "refresh_token"
		    Case TokenGrantType.ClientCredentials
		      Return "client_credentials"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TokenTypeHintToString(value As TokenTypeHint) As String
		  Select Case value
		    Case TokenTypeHint.AccessToken
		      Return "access_token"
		    Case TokenTypeHint.RefreshToken
		      Return "refresh_token"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TopPinsSortByToString(value As TopPinsSortBy) As String
		  Select Case value
		    Case TopPinsSortBy.Engagement
		      Return "ENGAGEMENT"
		    Case TopPinsSortBy.Save
		      Return "SAVE"
		    Case TopPinsSortBy.Impression
		      Return "IMPRESSION"
		    Case TopPinsSortBy.OutboundClick
		      Return "OUTBOUND_CLICK"
		    Case TopPinsSortBy.PinClick
		      Return "PIN_CLICK"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TopVideoPinsSortByToString(value As TopVideoPinsSortBy) As String
		  Select Case value
		    Case TopVideoPinsSortBy.Save
		      Return "SAVE"
		    Case TopVideoPinsSortBy.Impression
		      Return "IMPRESSION"
		    Case TopVideoPinsSortBy.OutboundClick
		      Return "OUTBOUND_CLICK"
		    Case TopVideoPinsSortBy.VideoMrcView
		      Return "VIDEO_MRC_VIEW"
		    Case TopVideoPinsSortBy.VideoAvgWatchTime
		      Return "VIDEO_AVG_WATCH_TIME"
		    Case TopVideoPinsSortBy.VideoV50WatchTime
		      Return "VIDEO_V50_WATCH_TIME"
		    Case TopVideoPinsSortBy.Quartile95PercentView
		      Return "QUARTILE_95_PERCENT_VIEW"
		    Case TopVideoPinsSortBy.Video10sView
		      Return "VIDEO_10S_VIEW"
		    Case TopVideoPinsSortBy.VideoStart
		      Return "VIDEO_START"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TrendTypeToString(value As TrendType) As String
		  Select Case value
		    Case TrendType.Growing
		      Return "growing"
		    Case TrendType.Monthly
		      Return "monthly"
		    Case TrendType.Yearly
		      Return "yearly"
		    Case TrendType.Seasonal
		      Return "seasonal"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TrendsAgeBucketToString(value As TrendsAgeBucket) As String
		  Select Case value
		    Case TrendsAgeBucket.Escaped1824
		      Return "18-24"
		    Case TrendsAgeBucket.Escaped2534
		      Return "25-34"
		    Case TrendsAgeBucket.Escaped3544
		      Return "35-44"
		    Case TrendsAgeBucket.Escaped4549
		      Return "45-49"
		    Case TrendsAgeBucket.Escaped5054
		      Return "50-54"
		    Case TrendsAgeBucket.Escaped5564
		      Return "55-64"
		    Case TrendsAgeBucket.Escaped65Plus
		      Return "65+"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TrendsGenderToString(value As TrendsGender) As String
		  Select Case value
		    Case TrendsGender.Male
		      Return "male"
		    Case TrendsGender.Female
		      Return "female"
		    Case TrendsGender.Unspecified
		      Return "unspecified"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TrendsGenderFilterToString(value As TrendsGenderFilter) As String
		  Select Case value
		    Case TrendsGenderFilter.Male
		      Return "male"
		    Case TrendsGenderFilter.Female
		      Return "female"
		    Case TrendsGenderFilter.Unknown
		      Return "unknown"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TrendsL1InterestToString(value As TrendsL1Interest) As String
		  Select Case value
		    Case TrendsL1Interest.Animals
		      Return "animals"
		    Case TrendsL1Interest.Architecture
		      Return "architecture"
		    Case TrendsL1Interest.Art
		      Return "art"
		    Case TrendsL1Interest.Beauty
		      Return "beauty"
		    Case TrendsL1Interest.ChildrensFashion
		      Return "childrens_fashion"
		    Case TrendsL1Interest.Design
		      Return "design"
		    Case TrendsL1Interest.DiyAndCrafts
		      Return "diy_and_crafts"
		    Case TrendsL1Interest.Education
		      Return "education"
		    Case TrendsL1Interest.Electronics
		      Return "electronics"
		    Case TrendsL1Interest.Entertainment
		      Return "entertainment"
		    Case TrendsL1Interest.EventPlanning
		      Return "event_planning"
		    Case TrendsL1Interest.Finance
		      Return "finance"
		    Case TrendsL1Interest.FoodAndDrinks
		      Return "food_and_drinks"
		    Case TrendsL1Interest.Gardening
		      Return "gardening"
		    Case TrendsL1Interest.Health
		      Return "health"
		    Case TrendsL1Interest.HomeDecor
		      Return "home_decor"
		    Case TrendsL1Interest.MensFashion
		      Return "mens_fashion"
		    Case TrendsL1Interest.Parenting
		      Return "parenting"
		    Case TrendsL1Interest.Quotes
		      Return "quotes"
		    Case TrendsL1Interest.Sport
		      Return "sport"
		    Case TrendsL1Interest.Travel
		      Return "travel"
		    Case TrendsL1Interest.Vehicles
		      Return "vehicles"
		    Case TrendsL1Interest.Wedding
		      Return "wedding"
		    Case TrendsL1Interest.WomensFashion
		      Return "womens_fashion"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TrendsSupportedRegionToString(value As TrendsSupportedRegion) As String
		  Select Case value
		    Case TrendsSupportedRegion.Us
		      Return "US"
		    Case TrendsSupportedRegion.Ca
		      Return "CA"
		    Case TrendsSupportedRegion.De
		      Return "DE"
		    Case TrendsSupportedRegion.Fr
		      Return "FR"
		    Case TrendsSupportedRegion.Es
		      Return "ES"
		    Case TrendsSupportedRegion.It
		      Return "IT"
		    Case TrendsSupportedRegion.DePlusAtPlusCh
		      Return "DE+AT+CH"
		    Case TrendsSupportedRegion.GbPlusIe
		      Return "GB+IE"
		    Case TrendsSupportedRegion.ItPlusEsPlusPtPlusGrPlusMt
		      Return "IT+ES+PT+GR+MT"
		    Case TrendsSupportedRegion.PlPlusRoPlusHuPlusSkPlusCz
		      Return "PL+RO+HU+SK+CZ"
		    Case TrendsSupportedRegion.SePlusDkPlusFiPlusNo
		      Return "SE+DK+FI+NO"
		    Case TrendsSupportedRegion.NlPlusBePlusLu
		      Return "NL+BE+LU"
		    Case TrendsSupportedRegion.Ar
		      Return "AR"
		    Case TrendsSupportedRegion.Br
		      Return "BR"
		    Case TrendsSupportedRegion.Co
		      Return "CO"
		    Case TrendsSupportedRegion.Mx
		      Return "MX"
		    Case TrendsSupportedRegion.MxPlusArPlusCoPlusCl
		      Return "MX+AR+CO+CL"
		    Case TrendsSupportedRegion.AuPlusNz
		      Return "AU+NZ"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function UpdateMaskBidOptionFieldToString(value As UpdateMaskBidOptionField) As String
		  Select Case value
		    Case UpdateMaskBidOptionField.Bid
		      Return "BID"
		    Case UpdateMaskBidOptionField.AppTypeBidMultiplierSet
		      Return "APP_TYPE_BID_MULTIPLIER_SET"
		    Case UpdateMaskBidOptionField.PlacementBidMultiplierSet
		      Return "PLACEMENT_BID_MULTIPLIER_SET"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function UpdateMaskFieldTypeToString(value As UpdateMaskFieldType) As String
		  Select Case value
		    Case UpdateMaskFieldType.AdLink
		      Return "ad_link"
		    Case UpdateMaskFieldType.Adult
		      Return "adult"
		    Case UpdateMaskFieldType.AgeGroup
		      Return "age_group"
		    Case UpdateMaskFieldType.Availability
		      Return "availability"
		    Case UpdateMaskFieldType.AverageReviewRating
		      Return "average_review_rating"
		    Case UpdateMaskFieldType.Brand
		      Return "brand"
		    Case UpdateMaskFieldType.CheckoutEnabled
		      Return "checkout_enabled"
		    Case UpdateMaskFieldType.Color
		      Return "color"
		    Case UpdateMaskFieldType.Condition
		      Return "condition"
		    Case UpdateMaskFieldType.CustomLabel0
		      Return "custom_label_0"
		    Case UpdateMaskFieldType.CustomLabel1
		      Return "custom_label_1"
		    Case UpdateMaskFieldType.CustomLabel2
		      Return "custom_label_2"
		    Case UpdateMaskFieldType.CustomLabel3
		      Return "custom_label_3"
		    Case UpdateMaskFieldType.CustomLabel4
		      Return "custom_label_4"
		    Case UpdateMaskFieldType.CustomNumber0
		      Return "custom_number_0"
		    Case UpdateMaskFieldType.CustomNumber1
		      Return "custom_number_1"
		    Case UpdateMaskFieldType.CustomNumber2
		      Return "custom_number_2"
		    Case UpdateMaskFieldType.CustomNumber3
		      Return "custom_number_3"
		    Case UpdateMaskFieldType.CustomNumber4
		      Return "custom_number_4"
		    Case UpdateMaskFieldType.Description
		      Return "description"
		    Case UpdateMaskFieldType.FreeShippingLabel
		      Return "free_shipping_label"
		    Case UpdateMaskFieldType.FreeShippingLimit
		      Return "free_shipping_limit"
		    Case UpdateMaskFieldType.Gender
		      Return "gender"
		    Case UpdateMaskFieldType.GoogleProductCategory
		      Return "google_product_category"
		    Case UpdateMaskFieldType.Gtin
		      Return "gtin"
		    Case UpdateMaskFieldType.ItemGroupId
		      Return "item_group_id"
		    Case UpdateMaskFieldType.LastUpdatedTime
		      Return "last_updated_time"
		    Case UpdateMaskFieldType.Link
		      Return "link"
		    Case UpdateMaskFieldType.Material
		      Return "material"
		    Case UpdateMaskFieldType.MinAdPrice
		      Return "min_ad_price"
		    Case UpdateMaskFieldType.Mpn
		      Return "mpn"
		    Case UpdateMaskFieldType.NumberOfRatings
		      Return "number_of_ratings"
		    Case UpdateMaskFieldType.NumberOfReviews
		      Return "number_of_reviews"
		    Case UpdateMaskFieldType.Pattern
		      Return "pattern"
		    Case UpdateMaskFieldType.Price
		      Return "price"
		    Case UpdateMaskFieldType.ProductType
		      Return "product_type"
		    Case UpdateMaskFieldType.SalePrice
		      Return "sale_price"
		    Case UpdateMaskFieldType.Shipping
		      Return "shipping"
		    Case UpdateMaskFieldType.ShippingHeight
		      Return "shipping_height"
		    Case UpdateMaskFieldType.ShippingWeight
		      Return "shipping_weight"
		    Case UpdateMaskFieldType.ShippingWidth
		      Return "shipping_width"
		    Case UpdateMaskFieldType.Size
		      Return "size"
		    Case UpdateMaskFieldType.SizeSystem
		      Return "size_system"
		    Case UpdateMaskFieldType.SizeType
		      Return "size_type"
		    Case UpdateMaskFieldType.Tax
		      Return "tax"
		    Case UpdateMaskFieldType.Title
		      Return "title"
		    Case UpdateMaskFieldType.VariantNames
		      Return "variant_names"
		    Case UpdateMaskFieldType.VariantValues
		      Return "variant_values"
		    Case UpdateMaskFieldType.PromotionId
		      Return "promotion_id"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function UserAccountTypeToString(value As UserAccountType) As String
		  Select Case value
		    Case UserAccountType.Pinner
		      Return "PINNER"
		    Case UserAccountType.Business
		      Return "BUSINESS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function UserFollowingFeedTypeToString(value As UserFollowingFeedType) As String
		  Select Case value
		    Case UserFollowingFeedType.All
		      Return "ALL"
		    Case UserFollowingFeedType.Ranked
		      Return "RANKED"
		    Case UserFollowingFeedType.CreatorOnly
		      Return "CREATOR_ONLY"
		    Case UserFollowingFeedType.RankedCreatorOnly
		      Return "RANKED_CREATOR_ONLY"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function UserListOperationTypeToString(value As UserListOperationType) As String
		  Select Case value
		    Case UserListOperationType.Add
		      Return "ADD"
		    Case UserListOperationType.Remove
		      Return "REMOVE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function UserListTypeToString(value As UserListType) As String
		  Select Case value
		    Case UserListType.Email
		      Return "EMAIL"
		    Case UserListType.Idfa
		      Return "IDFA"
		    Case UserListType.Maid
		      Return "MAID"
		    Case UserListType.LrId
		      Return "LR_ID"
		    Case UserListType.DlxId
		      Return "DLX_ID"
		    Case UserListType.HashedPinnerId
		      Return "HASHED_PINNER_ID"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function VerticalProductCategoryToString(value As VerticalProductCategory) As String
		  Select Case value
		    Case VerticalProductCategory.Fashion
		      Return "FASHION"
		    Case VerticalProductCategory.HomeDecor
		      Return "HOME_DECOR"
		    Case VerticalProductCategory.Beauty
		      Return "BEAUTY"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function VideoPinMetricTypesToString(value As VideoPinMetricTypes) As String
		  Select Case value
		    Case VideoPinMetricTypes.Impression
		      Return "IMPRESSION"
		    Case VideoPinMetricTypes.OutboundClick
		      Return "OUTBOUND_CLICK"
		    Case VideoPinMetricTypes.PinClick
		      Return "PIN_CLICK"
		    Case VideoPinMetricTypes.Save
		      Return "SAVE"
		    Case VideoPinMetricTypes.SaveRate
		      Return "SAVE_RATE"
		    Case VideoPinMetricTypes.VideoMrcView
		      Return "VIDEO_MRC_VIEW"
		    Case VideoPinMetricTypes.Video10sView
		      Return "VIDEO_10S_VIEW"
		    Case VideoPinMetricTypes.Quartile95PercentView
		      Return "QUARTILE_95_PERCENT_VIEW"
		    Case VideoPinMetricTypes.VideoV50WatchTime
		      Return "VIDEO_V50_WATCH_TIME"
		    Case VideoPinMetricTypes.VideoStart
		      Return "VIDEO_START"
		    Case VideoPinMetricTypes.VideoAvgWatchTime
		      Return "VIDEO_AVG_WATCH_TIME"
		    Case VideoPinMetricTypes.TotalComments
		      Return "TOTAL_COMMENTS"
		    Case VideoPinMetricTypes.TotalReactions
		      Return "TOTAL_REACTIONS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function WebsiteVerificationMethodToString(value As WebsiteVerificationMethod) As String
		  Select Case value
		    Case WebsiteVerificationMethod.Filename
		      Return "FILENAME"
		    Case WebsiteVerificationMethod.Metatag
		      Return "METATAG"
		    Case WebsiteVerificationMethod.Dnstxt
		      Return "DNSTXT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function WorkloadStateToString(value As WorkloadState) As String
		  Select Case value
		    Case WorkloadState.NotStarted
		      Return "NOT_STARTED"
		    Case WorkloadState.Running
		      Return "RUNNING"
		    Case WorkloadState.Paused
		      Return "PAUSED"
		    Case WorkloadState.Succeeded
		      Return "SUCCEEDED"
		    Case WorkloadState.Failed
		      Return "FAILED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod


	#tag Enum, Name = ActionType, Type = Integer, Flags = &h1
		
		Clickthrough
		Impression
		VideoV50Mrc
		
	#tag EndEnum
	#tag Enum, Name = AdAccountEntityType, Type = Integer, Flags = &h1
		
		Advertiser
		Campaign
		AdGroup
		Ad
		
	#tag EndEnum
	#tag Enum, Name = AdAdsAnalyticsAsyncTargetingTypes, Type = Integer, Flags = &h1
		
		Keyword
		Apptype
		Gender
		Location
		Placement
		Country
		TargetedInterest
		PinnerInterest
		AudienceInclude
		Geo
		AgeBucket
		Region
		MediaType
		AgeBucketAndGender
		AudienceMultiplier
		CreativeEnhancements
		LocalAdsStoreCode
		
	#tag EndEnum
	#tag Enum, Name = AdCollectionsHeaderType, Type = Integer, Flags = &h1
		
		ShopThisCollection
		ExploreThisCollection
		NoHeader
		
	#tag EndEnum
	#tag Enum, Name = AdDisapprovalReasons, Type = Integer, Flags = &h1
		
		Hashtags
		PromotionsAndPrices
		Targeting
		LandingPage
		CapsAndSymbols
		Shocking
		WeightLoss
		ProhibitedProduct
		Authenticity
		Nudity
		ConfusingDesign
		Urgency
		Ratings
		App
		Alcohol
		Contests
		Political
		Other
		Image
		Nar
		Inconsistent
		Clickbait
		NoDescription
		LowQuality
		ExaggeratedClaims
		PinterestBrand
		AlcoholNoSale
		LandingPageSpeed
		LandingPageHardwall
		LandingPageBroken
		LandingPageQuality
		OutOfStock
		ImageLowQuality
		ImageBusy
		ImagePoorlyEdited
		ImageBeforeAfter
		Ugc
		FakeButtons
		Weapons
		Sensitive
		UnacceptableBusiness
		SuspiciousClaims
		Pharma
		SuspiciousSupplements
		IllegalRecreationalDrug
		LowQualityLandingPage
		RestrictedHealthcare
		InconsistentLangFr
		
	#tag EndEnum
	#tag Enum, Name = AdGroupAudienceSizingCreativeTypes, Type = Integer, Flags = &h1
		
		Regular
		Video
		Shopping
		Carousel
		MaxVideo
		ShopThePin
		Collection
		Idea
		
	#tag EndEnum
	#tag Enum, Name = AdGroupSummaryStatus, Type = Integer, Flags = &h1
		
		Running
		Paused
		NotStarted
		Completed
		AdvertiserDisabled
		Archived
		Draft
		DeletedDraft
		
	#tag EndEnum
	#tag Enum, Name = AdPinPreviewCreativeType, Type = Integer, Flags = &h1
		
		Shopping
		Collection
		MaxVideo
		MaxWidthVideoCollection
		MaxWidthRegularCollection
		
	#tag EndEnum
	#tag Enum, Name = AdReviewStatus, Type = Integer, Flags = &h1
		
		Other
		Pending
		Rejected
		Approved
		
	#tag EndEnum
	#tag Enum, Name = AdShoppingPreviewCreativeType, Type = Integer, Flags = &h1
		
		Shopping
		Collection
		Carousel
		MaxWidthCollection
		
	#tag EndEnum
	#tag Enum, Name = AdeColumnType, Type = Integer, Flags = &h1
		
		AdeCostPerAction
		AdeRoas
		AdeTotalConversions
		AdeTotalValueInMicroDollar
		AdeAverageValueInMicroDollar
		AdeTotalClick
		AdeTotalClickValueInMicroDollar
		AdeTotalView
		AdeTotalViewValueInMicroDollar
		AdeTotalConversionRate
		AdeWebCostPerAction
		AdeWebRoas
		AdeTotalWebConversions
		AdeTotalWebValueInMicroDollar
		AdeTotalWebClick
		AdeTotalWebClickValueInMicroDollar
		AdeTotalWebView
		AdeTotalWebViewValueInMicroDollar
		AdeInappCostPerAction
		AdeInappRoas
		AdeTotalInappConversions
		AdeTotalInappValueInMicroDollar
		AdeTotalInappClick
		AdeTotalInappClickValueInMicroDollar
		AdeTotalInappView
		AdeTotalInappViewValueInMicroDollar
		AdeOfflineCostPerAction
		AdeOfflineRoas
		AdeTotalOfflineConversions
		AdeTotalOfflineValueInMicroDollar
		AdeTotalOfflineClick
		AdeTotalOfflineClickValueInMicroDollar
		AdeTotalOfflineView
		AdeTotalOfflineViewValueInMicroDollar
		AdeTotalConversionProductQuantity
		AdeTotalConversionProductValue
		AdeTotalConversionProductValueInMicroUnits
		AdeTotalConversionProductValueInUsd
		AdeTotalConversionProductValueInMicroUsd
		AdeTotalWebConversionProductQuantity
		AdeTotalWebConversionProductValue
		AdeTotalWebConversionProductValueInMicroUnits
		AdeTotalWebConversionProductValueInUsd
		AdeTotalWebConversionProductValueInMicroUsd
		AdeTotalInappConversionProductQuantity
		AdeTotalInappConversionProductValue
		AdeTotalInappConversionProductValueInMicroUnits
		AdeTotalInappConversionProductValueInUsd
		AdeTotalInappConversionProductValueInMicroUsd
		AdeTotalOfflineConversionProductQuantity
		AdeTotalOfflineConversionProductValue
		AdeTotalOfflineConversionProductValueInMicroUnits
		AdeTotalOfflineConversionProductValueInUsd
		AdeTotalOfflineConversionProductValueInMicroUsd
		
	#tag EndEnum
	#tag Enum, Name = AdgroupPlacementGroupType, Type = Integer, Flags = &h1
		
		All
		Search
		Browse
		Other
		
	#tag EndEnum
	#tag Enum, Name = AdgroupTrackingFeatureType, Type = Integer, Flags = &h1
		
		Trends
		CloneMeta
		BulkEditor
		AdRotation
		
	#tag EndEnum
	#tag Enum, Name = AdsAnalyticsAccountTargetingType, Type = Integer, Flags = &h1
		
		Keyword
		Apptype
		Gender
		Location
		Placement
		Country
		TargetedInterest
		PinnerInterest
		AudienceInclude
		Geo
		AgeBucket
		Region
		AgeBucketAndGender
		
	#tag EndEnum
	#tag Enum, Name = AdsAnalyticsAdGroupTargetingType, Type = Integer, Flags = &h1
		
		Keyword
		Apptype
		Gender
		Location
		Placement
		Country
		TargetedInterest
		PinnerInterest
		AudienceInclude
		Geo
		AgeBucket
		Region
		AgeBucketAndGender
		CreativeEnhancements
		
	#tag EndEnum
	#tag Enum, Name = AdsAnalyticsAdTargetingType, Type = Integer, Flags = &h1
		
		Keyword
		Apptype
		Gender
		Location
		Placement
		Country
		TargetedInterest
		PinnerInterest
		AudienceInclude
		Geo
		AgeBucket
		Region
		QuizResult
		AgeBucketAndGender
		
	#tag EndEnum
	#tag Enum, Name = AdsAnalyticsCampaignTargetingType, Type = Integer, Flags = &h1
		
		Keyword
		Apptype
		Gender
		Location
		Placement
		Country
		TargetedInterest
		PinnerInterest
		AudienceInclude
		Geo
		AgeBucket
		Region
		CreativeType
		AgeBucketAndGender
		AudienceMultiplier
		
	#tag EndEnum
	#tag Enum, Name = AdsAnalyticsFilterColumn, Type = Integer, Flags = &h1
		
		SpendInDollar
		TotalImpression
		
	#tag EndEnum
	#tag Enum, Name = AdsAnalyticsFilterOperator, Type = Integer, Flags = &h1
		
		LessThan
		GreaterThan
		
	#tag EndEnum
	#tag Enum, Name = AdsCreditDiscountType, Type = Integer, Flags = &h1
		
		Coupon
		Credit
		CouponApplied
		CreditApplied
		MarketingOfferCredit
		MarketingOfferCreditApplied
		GoodwillCredit
		GoodwillCreditApplied
		InternalCredit
		InternalCreditApplied
		PrepaidCredit
		PrepaidCreditApplied
		SalesIncentiveCredit
		SalesIncentiveCreditApplied
		CreditExpired
		FutureCredit
		ReferralCredit
		InvoiceSalesIncentiveCredit
		InvoiceSalesIncentiveCreditApplied
		PrepaidCreditRefund
		
	#tag EndEnum
	#tag Enum, Name = AdvertiserDefinedEventMappingType, Type = Integer, Flags = &h1
		
		Signup
		AddToCart
		Lead
		Checkout
		Subscribe
		AddToWishlist
		AddPaymentInfo
		InitiateCheckout
		Contact
		CustomizeProduct
		FindLocation
		Schedule
		SubmitApplication
		StartTrial
		PageVisit
		ViewCategory
		ViewContent
		Search
		WatchVideo
		
	#tag EndEnum
	#tag Enum, Name = AgeTrendsBucket, Type = Integer, Flags = &h1
		
		Escaped1824
		Escaped2534
		Escaped3544
		Escaped4549
		Escaped5054
		Escaped5564
		Escaped65Plus
		
	#tag EndEnum
	#tag Enum, Name = AiDisclosureItem, Type = Integer, Flags = &h1
		
		AiModified
		SyntheticPerformer
		
	#tag EndEnum
	#tag Enum, Name = AppsflyerPlatform, Type = Integer, Flags = &h1
		
		Android
		Ios
		
	#tag EndEnum
	#tag Enum, Name = AssetGroupType, Type = Integer, Flags = &h1
		
		Brand
		LocationOrLanguage
		ProductLine
		Other
		
	#tag EndEnum
	#tag Enum, Name = AssetPermissionType, Type = Integer, Flags = &h1
		
		AggregatedPermission
		DirectPermission
		
	#tag EndEnum
	#tag Enum, Name = AssetSearchBy, Type = Integer, Flags = &h1
		
		Name
		Id
		NameOrId
		OwnerName
		NameOrOwner
		
	#tag EndEnum
	#tag Enum, Name = AssetSortBy, Type = Integer, Flags = &h1
		
		Name
		Id
		Permissions
		
	#tag EndEnum
	#tag Enum, Name = AssetTypeResponse, Type = Integer, Flags = &h1
		
		AdAccount
		Merchant
		Profile
		AssetGroup
		PinnerList
		ConversionTag
		Catalog
		ConversionSegment
		
	#tag EndEnum
	#tag Enum, Name = AttributionActionType, Type = Integer, Flags = &h1
		
		View
		Click
		
	#tag EndEnum
	#tag Enum, Name = AttributionMatchType, Type = Integer, Flags = &h1
		
		P
		D
		Na
		
	#tag EndEnum
	#tag Enum, Name = AttributionModel, Type = Integer, Flags = &h1
		
		FirstTouch
		LastTouch
		MultiTouch
		Mmm
		
	#tag EndEnum
	#tag Enum, Name = AttributionScope, Type = Integer, Flags = &h1
		
		View
		Engagement
		Click
		
	#tag EndEnum
	#tag Enum, Name = AudienceAccountType, Type = Integer, Flags = &h1
		
		AdAccount
		BusinessAccount
		
	#tag EndEnum
	#tag Enum, Name = AudienceInsightType, Type = Integer, Flags = &h1
		
		YourTotalAudience
		YourEngagedAudience
		PinterestTotalAudience
		
	#tag EndEnum
	#tag Enum, Name = AudienceObjectiveType, Type = Integer, Flags = &h1
		
		Awareness
		Consideration
		WebConversion
		CatalogSales
		VideoCompletion
		Sales
		
	#tag EndEnum
	#tag Enum, Name = AudienceOwnershipType, Type = Integer, Flags = &h1
		
		Owned
		Received
		
	#tag EndEnum
	#tag Enum, Name = AudienceStatus, Type = Integer, Flags = &h1
		
		Initializing
		Ready
		TooSmall
		Eligible
		PersonasIneligibleSize
		PersonasInitializing
		
	#tag EndEnum
	#tag Enum, Name = AudienceType, Type = Integer, Flags = &h1
		
		CustomerList
		Visitor
		Engagement
		Actalike
		Persona
		
	#tag EndEnum
	#tag Enum, Name = AudienceUpdateOperationType, Type = Integer, Flags = &h1
		
		Update
		Remove
		
	#tag EndEnum
	#tag Enum, Name = BasePreferredMediaType, Type = Integer, Flags = &h1
		
		Video
		Image
		
	#tag EndEnum
	#tag Enum, Name = BatchOperationStatus, Type = Integer, Flags = &h1
		
		Processing
		Completed
		Failed
		
	#tag EndEnum
	#tag Enum, Name = BidFloorObjectiveType, Type = Integer, Flags = &h1
		
		Awareness
		Consideration
		WebConversion
		CatalogSales
		VideoCompletion
		Sales
		
	#tag EndEnum
	#tag Enum, Name = BidStrategyType, Type = Integer, Flags = &h1
		
		AutomaticBid
		MaxBid
		TargetAvg
		
	#tag EndEnum
	#tag Enum, Name = BillingInvoiceDocumentType, Type = Integer, Flags = &h1
		
		Invoice
		CreditMemo
		
	#tag EndEnum
	#tag Enum, Name = BillingInvoiceSortField, Type = Integer, Flags = &h1
		
		DueDate
		BillingPeriod
		DocumentType
		TotalAmount
		InvoiceNumber
		
	#tag EndEnum
	#tag Enum, Name = BillingInvoiceStatus, Type = Integer, Flags = &h1
		
		Open
		Closed
		
	#tag EndEnum
	#tag Enum, Name = BillingProfileCardType, Type = Integer, Flags = &h1
		
		Unknown
		Visa
		Mastercard
		AmericanExpress
		Discover
		Elo
		
	#tag EndEnum
	#tag Enum, Name = BillingProfilePaymentMethodBrand, Type = Integer, Flags = &h1
		
		Unknown
		Visa
		Mastercard
		AmericanExpress
		Discover
		Sofort
		DinersClub
		Elo
		CarteBancaire
		
	#tag EndEnum
	#tag Enum, Name = BillingProfileStatus, Type = Integer, Flags = &h1
		
		Unspecified
		Valid
		Invalid
		Pending
		Deleted
		Secondary
		PendingSecondary
		
	#tag EndEnum
	#tag Enum, Name = BillingType, Type = Integer, Flags = &h1
		
		CreditCard
		Invoice
		Internal
		Recurring
		Prepaid
		
	#tag EndEnum
	#tag Enum, Name = BoardPrivacy, Type = Integer, Flags = &h1
		
		Escapedpublic
		Escapedprotected
		Secret
		
	#tag EndEnum
	#tag Enum, Name = BoardPrivacyFilter, Type = Integer, Flags = &h1
		
		All
		Escapedpublic
		Escapedprotected
		Secret
		PublicAndSecret
		
	#tag EndEnum
	#tag Enum, Name = BoardUpdatePrivacy, Type = Integer, Flags = &h1
		
		Escapedpublic
		Secret
		
	#tag EndEnum
	#tag Enum, Name = BudgetDurationType, Type = Integer, Flags = &h1
		
		FixedDaily
		FlexibleDaily
		Lifetime
		
	#tag EndEnum
	#tag Enum, Name = BudgetType, Type = Integer, Flags = &h1
		
		Daily
		Lifetime
		CboAdgroup
		
	#tag EndEnum
	#tag Enum, Name = BulkEntityType, Type = Integer, Flags = &h1
		
		Campaign
		AdGroup
		ProductGroup
		Ad
		Keyword
		Label
		Schedule
		EntityHistory
		
	#tag EndEnum
	#tag Enum, Name = BulkOutputFormat, Type = Integer, Flags = &h1
		
		Csv
		Json
		
	#tag EndEnum
	#tag Enum, Name = BulkReportingJobStatus, Type = Integer, Flags = &h1
		
		DoesNotExist
		Finished
		InProgress
		Expired
		Failed
		Cancelled
		
	#tag EndEnum
	#tag Enum, Name = BulkRequestStatus, Type = Integer, Flags = &h1
		
		Running
		Succeeded
		Failed
		
	#tag EndEnum
	#tag Enum, Name = BusinessAccessRole, Type = Integer, Flags = &h1
		
		Owner
		Admin
		Analyst
		SosReader
		FinanceManager
		FinanceView
		FinanceEdit
		AudienceManager
		CampaignManager
		CatalogsManager
		RestrictedOwner
		ProfileManager
		ProfilePublisher
		ResourcePinnerListOwner
		ResourcePinnerListReader
		BizPinnerListSharer
		ResourceConversionTagsReader
		
	#tag EndEnum
	#tag Enum, Name = BusinessMemberSortBy, Type = Integer, Flags = &h1
		
		FullName
		BusinessRoles
		CreatedTime
		
	#tag EndEnum
	#tag Enum, Name = BusinessRoleForInvite, Type = Integer, Flags = &h1
		
		Employee
		BizAdmin
		Partner
		
	#tag EndEnum
	#tag Enum, Name = BusinessRoleForMembers, Type = Integer, Flags = &h1
		
		Employee
		BizAdmin
		
	#tag EndEnum
	#tag Enum, Name = BusinessSearchBy, Type = Integer, Flags = &h1
		
		FullName
		Username
		BusinessId
		Email
		
	#tag EndEnum
	#tag Enum, Name = CampaignBidOptionsUpdateMaskItems, Type = Integer, Flags = &h1
		
		Audience
		AppType
		Placement
		Gender
		AgeBucket
		Frequency
		
	#tag EndEnum
	#tag Enum, Name = CampaignObjectiveType, Type = Integer, Flags = &h1
		
		Awareness
		Consideration
		VideoView
		WebConversion
		CatalogSales
		WebSessions
		VideoCompletion
		AppInstall
		Sales
		Leads
		CtvConsideration
		
	#tag EndEnum
	#tag Enum, Name = CampaignPlanningConfidenceLevelAlertReason, Type = Integer, Flags = &h1
		
		Unknown
		Other
		AdvertiserHasNoRecentCampaigns
		AdvertiserHasNoRecentConversions
		
	#tag EndEnum
	#tag Enum, Name = CampaignPlanningConfidenceLevelAlertSeverity, Type = Integer, Flags = &h1
		
		Unknown
		LowMild
		LowModerate
		LowSevere
		
	#tag EndEnum
	#tag Enum, Name = CampaignPlanningConversionAttributionWindowDays, Type = Integer, Flags = &h1
		
		Days0
		Days1
		Days7
		Days30
		Days60
		
	#tag EndEnum
	#tag Enum, Name = CampaignPlanningConversionEvent, Type = Integer, Flags = &h1
		
		Signup
		Checkout
		AddToCart
		Lead
		
	#tag EndEnum
	#tag Enum, Name = CampaignPlanningEstimationType, Type = Integer, Flags = &h1
		
		Impression
		Click
		Conversion
		WeeklyFrequency
		WeeklyReach
		LifetimeFrequency
		LifetimeReach
		Cpm
		Cpc
		Cpa
		
	#tag EndEnum
	#tag Enum, Name = CampaignPlanningResponseErrorCode, Type = Integer, Flags = &h1
		
		ServerError
		AudienceListMissing
		InvalidRequest
		ProductGroupMissing
		
	#tag EndEnum
	#tag Enum, Name = CampaignSummaryStatus, Type = Integer, Flags = &h1
		
		Running
		Paused
		NotStarted
		Completed
		AdvertiserDisabled
		Archived
		Draft
		DeletedDraft
		
	#tag EndEnum
	#tag Enum, Name = CatalogsAiContentDisclosureLabel, Type = Integer, Flags = &h1
		
		AiModified
		SyntheticPerformer
		
	#tag EndEnum
	#tag Enum, Name = CatalogsFeedProcessingScheduleTimezone, Type = Integer, Flags = &h1
		
		AfricaSlashAbidjan
		AfricaSlashAccra
		AfricaSlashAlgiers
		AfricaSlashBissau
		AfricaSlashCairo
		AfricaSlashCasablanca
		AfricaSlashCeuta
		AfricaSlashElAaiun
		AfricaSlashJohannesburg
		AfricaSlashJuba
		AfricaSlashKhartoum
		AfricaSlashLagos
		AfricaSlashMaputo
		AfricaSlashMonrovia
		AfricaSlashNairobi
		AfricaSlashNdjamena
		AfricaSlashSaoTome
		AfricaSlashTripoli
		AfricaSlashTunis
		AfricaSlashWindhoek
		AmericaSlashAdak
		AmericaSlashAnchorage
		AmericaSlashAraguaina
		AmericaSlashArgentinaSlashBuenosAires
		AmericaSlashArgentinaSlashCatamarca
		AmericaSlashArgentinaSlashCordoba
		AmericaSlashArgentinaSlashJujuy
		AmericaSlashArgentinaSlashLaRioja
		AmericaSlashArgentinaSlashMendoza
		AmericaSlashArgentinaSlashRioGallegos
		AmericaSlashArgentinaSlashSalta
		AmericaSlashArgentinaSlashSanJuan
		AmericaSlashArgentinaSlashSanLuis
		AmericaSlashArgentinaSlashTucuman
		AmericaSlashArgentinaSlashUshuaia
		AmericaSlashAsuncion
		AmericaSlashAtikokan
		AmericaSlashBahia
		AmericaSlashBahiaBanderas
		AmericaSlashBarbados
		AmericaSlashBelem
		AmericaSlashBelize
		AmericaSlashBlancSablon
		AmericaSlashBoaVista
		AmericaSlashBogota
		AmericaSlashBoise
		AmericaSlashCambridgeBay
		AmericaSlashCampoGrande
		AmericaSlashCancun
		AmericaSlashCaracas
		AmericaSlashCayenne
		AmericaSlashChicago
		AmericaSlashChihuahua
		AmericaSlashCostaRica
		AmericaSlashCreston
		AmericaSlashCuiaba
		AmericaSlashCuracao
		AmericaSlashDanmarkshavn
		AmericaSlashDawson
		AmericaSlashDawsonCreek
		AmericaSlashDenver
		AmericaSlashDetroit
		AmericaSlashEdmonton
		AmericaSlashEirunepe
		AmericaSlashElSalvador
		AmericaSlashFortNelson
		AmericaSlashFortaleza
		AmericaSlashGlaceBay
		AmericaSlashGooseBay
		AmericaSlashGrandTurk
		AmericaSlashGuatemala
		AmericaSlashGuayaquil
		AmericaSlashGuyana
		AmericaSlashHalifax
		AmericaSlashHavana
		AmericaSlashHermosillo
		AmericaSlashIndianaSlashIndianapolis
		AmericaSlashIndianaSlashKnox
		AmericaSlashIndianaSlashMarengo
		AmericaSlashIndianaSlashPetersburg
		AmericaSlashIndianaSlashTellCity
		AmericaSlashIndianaSlashVevay
		AmericaSlashIndianaSlashVincennes
		AmericaSlashIndianaSlashWinamac
		AmericaSlashInuvik
		AmericaSlashIqaluit
		AmericaSlashJamaica
		AmericaSlashJuneau
		AmericaSlashKentuckySlashLouisville
		AmericaSlashKentuckySlashMonticello
		AmericaSlashLaPaz
		AmericaSlashLima
		AmericaSlashLosAngeles
		AmericaSlashMaceio
		AmericaSlashManagua
		AmericaSlashManaus
		AmericaSlashMartinique
		AmericaSlashMatamoros
		AmericaSlashMazatlan
		AmericaSlashMenominee
		AmericaSlashMerida
		AmericaSlashMetlakatla
		AmericaSlashMexicoCity
		AmericaSlashMiquelon
		AmericaSlashMoncton
		AmericaSlashMonterrey
		AmericaSlashMontevideo
		AmericaSlashNassau
		AmericaSlashNewYork
		AmericaSlashNipigon
		AmericaSlashNome
		AmericaSlashNoronha
		AmericaSlashNorthDakotaSlashBeulah
		AmericaSlashNorthDakotaSlashCenter
		AmericaSlashNorthDakotaSlashNewSalem
		AmericaSlashNuuk
		AmericaSlashOjinaga
		AmericaSlashPanama
		AmericaSlashPangnirtung
		AmericaSlashParamaribo
		AmericaSlashPhoenix
		AmericaSlashPortAuPrince
		AmericaSlashPortOfSpain
		AmericaSlashPortoVelho
		AmericaSlashPuertoRico
		AmericaSlashPuntaArenas
		AmericaSlashRainyRiver
		AmericaSlashRankinInlet
		AmericaSlashRecife
		AmericaSlashRegina
		AmericaSlashResolute
		AmericaSlashRioBranco
		AmericaSlashSantarem
		AmericaSlashSantiago
		AmericaSlashSantoDomingo
		AmericaSlashSaoPaulo
		AmericaSlashScoresbysund
		AmericaSlashSitka
		AmericaSlashStJohns
		AmericaSlashSwiftCurrent
		AmericaSlashTegucigalpa
		AmericaSlashThule
		AmericaSlashThunderBay
		AmericaSlashTijuana
		AmericaSlashToronto
		AmericaSlashVancouver
		AmericaSlashWhitehorse
		AmericaSlashWinnipeg
		AmericaSlashYakutat
		AmericaSlashYellowknife
		AntarcticaSlashCasey
		AntarcticaSlashDavis
		AntarcticaSlashDumontdurville
		AntarcticaSlashMacquarie
		AntarcticaSlashMawson
		AntarcticaSlashPalmer
		AntarcticaSlashRothera
		AntarcticaSlashSyowa
		AntarcticaSlashTroll
		AntarcticaSlashVostok
		AsiaSlashAlmaty
		AsiaSlashAmman
		AsiaSlashAnadyr
		AsiaSlashAqtau
		AsiaSlashAqtobe
		AsiaSlashAshgabat
		AsiaSlashAtyrau
		AsiaSlashBaghdad
		AsiaSlashBaku
		AsiaSlashBangkok
		AsiaSlashBarnaul
		AsiaSlashBeirut
		AsiaSlashBishkek
		AsiaSlashBrunei
		AsiaSlashChita
		AsiaSlashChoibalsan
		AsiaSlashColombo
		AsiaSlashDamascus
		AsiaSlashDhaka
		AsiaSlashDili
		AsiaSlashDubai
		AsiaSlashDushanbe
		AsiaSlashFamagusta
		AsiaSlashGaza
		AsiaSlashHebron
		AsiaSlashHoChiMinh
		AsiaSlashHongKong
		AsiaSlashHovd
		AsiaSlashIrkutsk
		AsiaSlashJakarta
		AsiaSlashJayapura
		AsiaSlashJerusalem
		AsiaSlashKabul
		AsiaSlashKamchatka
		AsiaSlashKarachi
		AsiaSlashKathmandu
		AsiaSlashKhandyga
		AsiaSlashKolkata
		AsiaSlashKrasnoyarsk
		AsiaSlashKualaLumpur
		AsiaSlashKuching
		AsiaSlashMacau
		AsiaSlashMagadan
		AsiaSlashMakassar
		AsiaSlashManila
		AsiaSlashNicosia
		AsiaSlashNovokuznetsk
		AsiaSlashNovosibirsk
		AsiaSlashOmsk
		AsiaSlashOral
		AsiaSlashPontianak
		AsiaSlashPyongyang
		AsiaSlashQatar
		AsiaSlashQostanay
		AsiaSlashQyzylorda
		AsiaSlashRiyadh
		AsiaSlashSakhalin
		AsiaSlashSamarkand
		AsiaSlashSeoul
		AsiaSlashShanghai
		AsiaSlashSingapore
		AsiaSlashSrednekolymsk
		AsiaSlashTaipei
		AsiaSlashTashkent
		AsiaSlashTbilisi
		AsiaSlashTehran
		AsiaSlashThimphu
		AsiaSlashTokyo
		AsiaSlashTomsk
		AsiaSlashUlaanbaatar
		AsiaSlashUrumqi
		AsiaSlashUstNera
		AsiaSlashVladivostok
		AsiaSlashYakutsk
		AsiaSlashYangon
		AsiaSlashYekaterinburg
		AsiaSlashYerevan
		AtlanticSlashAzores
		AtlanticSlashBermuda
		AtlanticSlashCanary
		AtlanticSlashCapeVerde
		AtlanticSlashFaroe
		AtlanticSlashMadeira
		AtlanticSlashReykjavik
		AtlanticSlashSouthGeorgia
		AtlanticSlashStanley
		AustraliaSlashAdelaide
		AustraliaSlashBrisbane
		AustraliaSlashBrokenHill
		AustraliaSlashCurrie
		AustraliaSlashDarwin
		AustraliaSlashEucla
		AustraliaSlashHobart
		AustraliaSlashLindeman
		AustraliaSlashLordHowe
		AustraliaSlashMelbourne
		AustraliaSlashPerth
		AustraliaSlashSydney
		Cet
		Cst6cdt
		Eet
		Est
		Est5edt
		EtcSlashGmt
		EtcSlashGmtPlus1
		EtcSlashGmtPlus10
		EtcSlashGmtPlus11
		EtcSlashGmtPlus12
		EtcSlashGmtPlus2
		EtcSlashGmtPlus3
		EtcSlashGmtPlus4
		EtcSlashGmtPlus5
		EtcSlashGmtPlus6
		EtcSlashGmtPlus7
		EtcSlashGmtPlus8
		EtcSlashGmtPlus9
		EtcSlashGmt1
		EtcSlashGmt10
		EtcSlashGmt11
		EtcSlashGmt12
		EtcSlashGmt13
		EtcSlashGmt14
		EtcSlashGmt2
		EtcSlashGmt3
		EtcSlashGmt4
		EtcSlashGmt5
		EtcSlashGmt6
		EtcSlashGmt7
		EtcSlashGmt8
		EtcSlashGmt9
		EtcSlashUtc
		EuropeSlashAmsterdam
		EuropeSlashAndorra
		EuropeSlashAstrakhan
		EuropeSlashAthens
		EuropeSlashBelgrade
		EuropeSlashBerlin
		EuropeSlashBrussels
		EuropeSlashBucharest
		EuropeSlashBudapest
		EuropeSlashChisinau
		EuropeSlashCopenhagen
		EuropeSlashDublin
		EuropeSlashGibraltar
		EuropeSlashHelsinki
		EuropeSlashIstanbul
		EuropeSlashKaliningrad
		EuropeSlashKiev
		EuropeSlashKirov
		EuropeSlashLisbon
		EuropeSlashLondon
		EuropeSlashLuxembourg
		EuropeSlashMadrid
		EuropeSlashMalta
		EuropeSlashMinsk
		EuropeSlashMonaco
		EuropeSlashMoscow
		EuropeSlashOslo
		EuropeSlashParis
		EuropeSlashPrague
		EuropeSlashRiga
		EuropeSlashRome
		EuropeSlashSamara
		EuropeSlashSaratov
		EuropeSlashSimferopol
		EuropeSlashSofia
		EuropeSlashStockholm
		EuropeSlashTallinn
		EuropeSlashTirane
		EuropeSlashUlyanovsk
		EuropeSlashUzhgorod
		EuropeSlashVienna
		EuropeSlashVilnius
		EuropeSlashVolgograd
		EuropeSlashWarsaw
		EuropeSlashZaporozhye
		EuropeSlashZurich
		Hst
		IndianSlashChagos
		IndianSlashChristmas
		IndianSlashCocos
		IndianSlashKerguelen
		IndianSlashMahe
		IndianSlashMaldives
		IndianSlashMauritius
		IndianSlashReunion
		Met
		Mst
		Mst7mdt
		Pst8pdt
		PacificSlashApia
		PacificSlashAuckland
		PacificSlashBougainville
		PacificSlashChatham
		PacificSlashChuuk
		PacificSlashEaster
		PacificSlashEfate
		PacificSlashEnderbury
		PacificSlashFakaofo
		PacificSlashFiji
		PacificSlashFunafuti
		PacificSlashGalapagos
		PacificSlashGambier
		PacificSlashGuadalcanal
		PacificSlashGuam
		PacificSlashHonolulu
		PacificSlashKiritimati
		PacificSlashKosrae
		PacificSlashKwajalein
		PacificSlashMajuro
		PacificSlashMarquesas
		PacificSlashNauru
		PacificSlashNiue
		PacificSlashNorfolk
		PacificSlashNoumea
		PacificSlashPagoPago
		PacificSlashPalau
		PacificSlashPitcairn
		PacificSlashPohnpei
		PacificSlashPortMoresby
		PacificSlashRarotonga
		PacificSlashTahiti
		PacificSlashTarawa
		PacificSlashTongatapu
		PacificSlashWake
		PacificSlashWallis
		Wet
		
	#tag EndEnum
	#tag Enum, Name = CatalogsFeedProcessingStatus, Type = Integer, Flags = &h1
		
		Completed
		Failed
		Processing
		
	#tag EndEnum
	#tag Enum, Name = CatalogsFormat, Type = Integer, Flags = &h1
		
		Tsv
		Csv
		Xml
		Integration
		
	#tag EndEnum
	#tag Enum, Name = CatalogsHotelProductGroupType, Type = Integer, Flags = &h1
		
		MerchantCreated
		AllListings
		
	#tag EndEnum
	#tag Enum, Name = CatalogsItemValidationIssue, Type = Integer, Flags = &h1
		
		AdImage0LinkLengthTooLong
		AdImage1LinkLengthTooLong
		AdImage2LinkLengthTooLong
		AdImage3LinkLengthTooLong
		AdImage4LinkLengthTooLong
		AdImage5LinkLengthTooLong
		AdImage6LinkLengthTooLong
		AdImage7LinkLengthTooLong
		AdImage8LinkLengthTooLong
		AdImage9LinkLengthTooLong
		AdImage10LinkLengthTooLong
		AdImage11LinkLengthTooLong
		AdImage12LinkLengthTooLong
		AdImage13LinkLengthTooLong
		AdImage14LinkLengthTooLong
		AdImage15LinkLengthTooLong
		AdImage16LinkLengthTooLong
		AdImage17LinkLengthTooLong
		AdImage18LinkLengthTooLong
		AdImage19LinkLengthTooLong
		AdImage0LinkWarning
		AdImage1LinkWarning
		AdImage2LinkWarning
		AdImage3LinkWarning
		AdImage4LinkWarning
		AdImage5LinkWarning
		AdImage6LinkWarning
		AdImage7LinkWarning
		AdImage8LinkWarning
		AdImage9LinkWarning
		AdImage10LinkWarning
		AdImage11LinkWarning
		AdImage12LinkWarning
		AdImage13LinkWarning
		AdImage14LinkWarning
		AdImage15LinkWarning
		AdImage16LinkWarning
		AdImage17LinkWarning
		AdImage18LinkWarning
		AdImage19LinkWarning
		AdImage0LinkRequired
		AdImage1LinkRequired
		AdImage2LinkRequired
		AdImage3LinkRequired
		AdImage4LinkRequired
		AdImage5LinkRequired
		AdImage6LinkRequired
		AdImage7LinkRequired
		AdImage8LinkRequired
		AdImage9LinkRequired
		AdImage10LinkRequired
		AdImage11LinkRequired
		AdImage12LinkRequired
		AdImage13LinkRequired
		AdImage14LinkRequired
		AdImage15LinkRequired
		AdImage16LinkRequired
		AdImage17LinkRequired
		AdImage18LinkRequired
		AdImage19LinkRequired
		AdImage0TagLengthTooLong
		AdImage1TagLengthTooLong
		AdImage2TagLengthTooLong
		AdImage3TagLengthTooLong
		AdImage4TagLengthTooLong
		AdImage5TagLengthTooLong
		AdImage6TagLengthTooLong
		AdImage7TagLengthTooLong
		AdImage8TagLengthTooLong
		AdImage9TagLengthTooLong
		AdImage10TagLengthTooLong
		AdImage11TagLengthTooLong
		AdImage12TagLengthTooLong
		AdImage13TagLengthTooLong
		AdImage14TagLengthTooLong
		AdImage15TagLengthTooLong
		AdImage16TagLengthTooLong
		AdImage17TagLengthTooLong
		AdImage18TagLengthTooLong
		AdImage19TagLengthTooLong
		AdImage0TagRequired
		AdImage1TagRequired
		AdImage2TagRequired
		AdImage3TagRequired
		AdImage4TagRequired
		AdImage5TagRequired
		AdImage6TagRequired
		AdImage7TagRequired
		AdImage8TagRequired
		AdImage9TagRequired
		AdImage10TagRequired
		AdImage11TagRequired
		AdImage12TagRequired
		AdImage13TagRequired
		AdImage14TagRequired
		AdImage15TagRequired
		AdImage16TagRequired
		AdImage17TagRequired
		AdImage18TagRequired
		AdImage19TagRequired
		AdImage0LinkDuplicated
		AdImage1LinkDuplicated
		AdImage2LinkDuplicated
		AdImage3LinkDuplicated
		AdImage4LinkDuplicated
		AdImage5LinkDuplicated
		AdImage6LinkDuplicated
		AdImage7LinkDuplicated
		AdImage8LinkDuplicated
		AdImage9LinkDuplicated
		AdImage10LinkDuplicated
		AdImage11LinkDuplicated
		AdImage12LinkDuplicated
		AdImage13LinkDuplicated
		AdImage14LinkDuplicated
		AdImage15LinkDuplicated
		AdImage16LinkDuplicated
		AdImage17LinkDuplicated
		AdImage18LinkDuplicated
		AdImage19LinkDuplicated
		AdImage0TagDuplicated
		AdImage1TagDuplicated
		AdImage2TagDuplicated
		AdImage3TagDuplicated
		AdImage4TagDuplicated
		AdImage5TagDuplicated
		AdImage6TagDuplicated
		AdImage7TagDuplicated
		AdImage8TagDuplicated
		AdImage9TagDuplicated
		AdImage10TagDuplicated
		AdImage11TagDuplicated
		AdImage12TagDuplicated
		AdImage13TagDuplicated
		AdImage14TagDuplicated
		AdImage15TagDuplicated
		AdImage16TagDuplicated
		AdImage17TagDuplicated
		AdImage18TagDuplicated
		AdImage19TagDuplicated
		AdVideo0LinkLengthTooLong
		AdVideo1LinkLengthTooLong
		AdVideo2LinkLengthTooLong
		AdVideo0LinkWarning
		AdVideo1LinkWarning
		AdVideo2LinkWarning
		AdVideo0LinkRequired
		AdVideo1LinkRequired
		AdVideo2LinkRequired
		AdVideo0LinkDuplicated
		AdVideo1LinkDuplicated
		AdVideo2LinkDuplicated
		AdVideo0TagLengthTooLong
		AdVideo1TagLengthTooLong
		AdVideo2TagLengthTooLong
		AdVideo0TagRequired
		AdVideo1TagRequired
		AdVideo2TagRequired
		AdVideo0TagDuplicated
		AdVideo1TagDuplicated
		AdVideo2TagDuplicated
		VideoRequiredWhenAdVideoProvided
		AdLinkFormatWarning
		AdLinkSameAsLink
		AdditionalImageLinkLengthTooLong
		AdditionalImageLinkWarning
		AdultInvalid
		AdwordsFormatInvalid
		AdwordsFormatWarning
		AdwordsSameAsLink
		AgeGroupInvalid
		AndroidDeepLinkInvalid
		AvailabilityDateInvalid
		AvailabilityInvalid
		BlocklistedImageSignature
		CountryDoesNotMapToCurrency
		CustomLabelLengthTooLong
		DescriptionLengthTooLong
		DescriptionMissing
		DuplicateProducts
		ExpirationDateInvalid
		GenderInvalid
		GtinInvalid
		ImageLinkInvalid
		ImageLinkLengthTooLong
		ImageLinkMissing
		ImageLinkWarning
		InvalidDomain
		IosDeepLinkInvalid
		IsBundleInvalid
		ItemAdditionalImageDownloadFailure
		ItemMainImageDownloadFailure
		ItemidMissing
		LinkFormatInvalid
		LinkFormatWarning
		LinkLengthTooLong
		ListPriceInvalid
		MaxItemsPerItemGroupExceeded
		MinAdPriceInvalid
		MpnInvalid
		MultipackInvalid
		OptionalConditionInvalid
		OptionalConditionMissing
		OptionalProductCategoryInvalid
		OptionalProductCategoryMissing
		ParseLineError
		PinjoinContentUnsafe
		PriceCannotBeDetermined
		PriceMissing
		ProductCategoryDepthWarning
		ProductLinkMissing
		ProductPriceInvalid
		ProductTypeLengthTooLong
		SaleDateInvalid
		SalesPriceInvalid
		SalesPriceTooHigh
		SalesPriceTooLow
		ShippingInvalid
		ShippingHeightInvalid
		ShippingWeightInvalid
		ShippingWidthInvalid
		SizeSystemInvalid
		SizeTypeInvalid
		TaxInvalid
		TitleLengthTooLong
		TitleMissing
		TooManyAdditionalImageLinks
		UtmSourceAutoCorrected
		WeightUnitInvalid
		
	#tag EndEnum
	#tag Enum, Name = CatalogsLocale, Type = Integer, Flags = &h1
		
		AfZa
		ArSa
		BgBg
		BnIn
		CsCz
		DaDk
		De
		ElGr
		EnAu
		EnCa
		EnGb
		EnIn
		EnUs
		Es419
		EsAr
		EsEs
		EsMx
		FiFi
		Fr
		FrCa
		HeIl
		HiIn
		HrHr
		HuHu
		IdId
		It
		Ja
		KoKr
		MsMy
		NbNo
		Nl
		PlPl
		PtBr
		PtPt
		RoRo
		RuRu
		SkSk
		SvSe
		TeIn
		ThTh
		TlPh
		Tr
		UkUa
		ViVn
		ZhCn
		ZhTw
		
	#tag EndEnum
	#tag Enum, Name = CatalogsProductGroupStatus, Type = Integer, Flags = &h1
		
		Active
		Inactive
		
	#tag EndEnum
	#tag Enum, Name = CatalogsProductGroupType, Type = Integer, Flags = &h1
		
		MerchantCreated
		AllProducts
		BestDeals
		PinnerFavorites
		TopSellers
		BackInStock
		NewArrivals
		ShopifyCollections
		I2PC
		CatalogExpansion
		
	#tag EndEnum
	#tag Enum, Name = CatalogsStatus, Type = Integer, Flags = &h1
		
		Active
		Inactive
		
	#tag EndEnum
	#tag Enum, Name = CatalogsType, Type = Integer, Flags = &h1
		
		Retail
		Hotel
		CreativeAssets
		
	#tag EndEnum
	#tag Enum, Name = ChangeHistoryDataType, Type = Integer, Flags = &h1
		
		String
		Numeric
		Microcurrency
		Date
		Bool
		GenderList
		AgeBucketList
		ApptypeList
		CountryList
		LocaleList
		
	#tag EndEnum
	#tag Enum, Name = ChangeHistoryOperationType, Type = Integer, Flags = &h1
		
		Create
		Update
		Delete
		
	#tag EndEnum
	#tag Enum, Name = CollectionsHeaderType, Type = Integer, Flags = &h1
		
		ShopThisCollection
		ExploreThisCollection
		NoHeader
		OnSale
		GetDeal
		
	#tag EndEnum
	#tag Enum, Name = ContentType, Type = Integer, Flags = &h1
		
		ImageSlashJpeg
		ImageSlashPng
		
	#tag EndEnum
	#tag Enum, Name = ConversionAttributionWindowDays, Type = Integer, Flags = &h1
		
		Escaped0
		Escaped1
		Escaped7
		Escaped14
		Escaped30
		Escaped60
		
	#tag EndEnum
	#tag Enum, Name = ConversionDeletionRequestStatus, Type = Integer, Flags = &h1
		
		Pending
		Submitted
		Cancelled
		
	#tag EndEnum
	#tag Enum, Name = ConversionEvent, Type = Integer, Flags = &h1
		
		PageVisit
		Signup
		Checkout
		Custom
		ViewCategory
		Search
		AddToCart
		WatchVideo
		Lead
		AppInstall
		
	#tag EndEnum
	#tag Enum, Name = ConversionEventIngestionSource, Type = Integer, Flags = &h1
		
		Tag
		Mmp
		FileUpload
		ConversionsApi
		Native
		
	#tag EndEnum
	#tag Enum, Name = ConversionLearningModeType, Type = Integer, Flags = &h1
		
		NotActive
		Active
		
	#tag EndEnum
	#tag Enum, Name = ConversionObjectiveType, Type = Integer, Flags = &h1
		
		Awareness
		Consideration
		WebConversion
		CatalogSales
		VideoCompletion
		AppInstall
		Sales
		Leads
		CtvConsideration
		
	#tag EndEnum
	#tag Enum, Name = ConversionProductAttributionType, Type = Integer, Flags = &h1
		
		Default
		BrandAttribution
		
	#tag EndEnum
	#tag Enum, Name = ConversionProductReportBreakdownType, Type = Integer, Flags = &h1
		
		ProductBrand
		ProductCategory
		ProductBrandAndCategory
		ProductSku
		ProductSkuGroup
		
	#tag EndEnum
	#tag Enum, Name = ConversionProductReportGranularity, Type = Integer, Flags = &h1
		
		Total
		Week
		Month
		
	#tag EndEnum
	#tag Enum, Name = ConversionProductReportLevel, Type = Integer, Flags = &h1
		
		Advertiser
		Campaign
		AdGroup
		
	#tag EndEnum
	#tag Enum, Name = ConversionProductReportingColumn, Type = Integer, Flags = &h1
		
		CampaignName
		CampaignId
		AdvertiserId
		AdGroupId
		CampaignObjectiveType
		AdGroupName
		ConversionProductId
		ConversionProductBrand
		ConversionProductCategory
		ConversionProductIdGroup
		TotalConversionProductQuantity
		TotalWebConversionProductQuantity
		TotalInappConversionProductQuantity
		TotalOfflineConversionProductQuantity
		TotalConversionProductValue
		TotalWebConversionProductValue
		TotalInappConversionProductValue
		TotalOfflineConversionProductValue
		TotalConversionProductValueInUsd
		TotalWebConversionProductValueInUsd
		TotalInappConversionProductValueInUsd
		TotalOfflineConversionProductValueInUsd
		TotalCheckoutConversionProductQuantity
		TotalCheckoutConversionProductValue
		TotalCheckoutConversionProductValueInUsd
		TotalWebCheckoutConversionProductQuantity
		TotalWebCheckoutConversionProductValue
		TotalWebCheckoutConversionProductValueInUsd
		TotalInappCheckoutConversionProductQuantity
		TotalInappCheckoutConversionProductValue
		TotalInappCheckoutConversionProductValueInUsd
		TotalOfflineCheckoutConversionProductQuantity
		TotalOfflineCheckoutConversionProductValue
		TotalOfflineCheckoutConversionProductValueInUsd
		TotalAddToCartConversionProductQuantity
		TotalAddToCartConversionProductValue
		TotalAddToCartConversionProductValueInUsd
		TotalWebAddToCartConversionProductQuantity
		TotalWebAddToCartConversionProductValue
		TotalWebAddToCartConversionProductValueInUsd
		TotalInappAddToCartConversionProductQuantity
		TotalInappAddToCartConversionProductValue
		TotalInappAddToCartConversionProductValueInUsd
		TotalPageVisitConversionProductQuantity
		TotalPageVisitConversionProductValue
		TotalPageVisitConversionProductValueInUsd
		TotalWebPageVisitConversionProductQuantity
		TotalWebPageVisitConversionProductValue
		TotalWebPageVisitConversionProductValueInUsd
		TotalSignupConversionProductQuantity
		TotalSignupConversionProductValue
		TotalSignupConversionProductValueInUsd
		TotalWebSignupConversionProductQuantity
		TotalWebSignupConversionProductValue
		TotalWebSignupConversionProductValueInUsd
		TotalInappSignupConversionProductQuantity
		TotalInappSignupConversionProductValue
		TotalInappSignupConversionProductValueInUsd
		TotalOfflineSignupConversionProductQuantity
		TotalOfflineSignupConversionProductValue
		TotalOfflineSignupConversionProductValueInUsd
		TotalWatchVideoConversionProductQuantity
		TotalWatchVideoConversionProductValue
		TotalWatchVideoConversionProductValueInUsd
		TotalWebWatchVideoConversionProductQuantity
		TotalWebWatchVideoConversionProductValue
		TotalWebWatchVideoConversionProductValueInUsd
		TotalLeadConversionProductQuantity
		TotalLeadConversionProductValue
		TotalLeadConversionProductValueInUsd
		TotalWebLeadConversionProductQuantity
		TotalWebLeadConversionProductValue
		TotalWebLeadConversionProductValueInUsd
		TotalOfflineLeadConversionProductQuantity
		TotalOfflineLeadConversionProductValue
		TotalOfflineLeadConversionProductValueInUsd
		TotalSearchConversionProductQuantity
		TotalSearchConversionProductValue
		TotalSearchConversionProductValueInUsd
		TotalWebSearchConversionProductQuantity
		TotalWebSearchConversionProductValue
		TotalWebSearchConversionProductValueInUsd
		TotalInappSearchConversionProductQuantity
		TotalInappSearchConversionProductValue
		TotalInappSearchConversionProductValueInUsd
		TotalViewCategoryConversionProductQuantity
		TotalViewCategoryConversionProductValue
		TotalViewCategoryConversionProductValueInUsd
		TotalWebViewCategoryConversionProductQuantity
		TotalWebViewCategoryConversionProductValue
		TotalWebViewCategoryConversionProductValueInUsd
		TotalCustomConversionProductQuantity
		TotalCustomConversionProductValue
		TotalCustomConversionProductValueInUsd
		TotalWebCustomConversionProductQuantity
		TotalWebCustomConversionProductValue
		TotalWebCustomConversionProductValueInUsd
		TotalOfflineCustomConversionProductQuantity
		TotalOfflineCustomConversionProductValue
		TotalOfflineCustomConversionProductValueInUsd
		TotalUnknownConversionProductQuantity
		TotalUnknownConversionProductValue
		TotalUnknownConversionProductValueInUsd
		TotalWebUnknownConversionProductQuantity
		TotalWebUnknownConversionProductValue
		TotalWebUnknownConversionProductValueInUsd
		TotalInappUnknownConversionProductQuantity
		TotalInappUnknownConversionProductValue
		TotalInappUnknownConversionProductValueInUsd
		TotalOfflineUnknownConversionProductQuantity
		TotalOfflineUnknownConversionProductValue
		TotalOfflineUnknownConversionProductValueInUsd
		TotalAddPaymentInfoConversionProductQuantity
		TotalAddPaymentInfoConversionProductValue
		TotalAddPaymentInfoConversionProductValueInUsd
		TotalWebAddPaymentInfoConversionProductQuantity
		TotalWebAddPaymentInfoConversionProductValue
		TotalWebAddPaymentInfoConversionProductValueInUsd
		TotalInappAddPaymentInfoConversionProductQuantity
		TotalInappAddPaymentInfoConversionProductValue
		TotalInappAddPaymentInfoConversionProductValueInUsd
		TotalOfflineAddPaymentInfoConversionProductQuantity
		TotalOfflineAddPaymentInfoConversionProductValue
		TotalOfflineAddPaymentInfoConversionProductValueInUsd
		TotalAddToWishlistConversionProductQuantity
		TotalAddToWishlistConversionProductValue
		TotalAddToWishlistConversionProductValueInUsd
		TotalWebAddToWishlistConversionProductQuantity
		TotalWebAddToWishlistConversionProductValue
		TotalWebAddToWishlistConversionProductValueInUsd
		TotalInappAddToWishlistConversionProductQuantity
		TotalInappAddToWishlistConversionProductValue
		TotalInappAddToWishlistConversionProductValueInUsd
		TotalOfflineAddToWishlistConversionProductQuantity
		TotalOfflineAddToWishlistConversionProductValue
		TotalOfflineAddToWishlistConversionProductValueInUsd
		TotalInitiateCheckoutConversionProductQuantity
		TotalInitiateCheckoutConversionProductValue
		TotalInitiateCheckoutConversionProductValueInUsd
		TotalWebInitiateCheckoutConversionProductQuantity
		TotalWebInitiateCheckoutConversionProductValue
		TotalWebInitiateCheckoutConversionProductValueInUsd
		TotalInappInitiateCheckoutConversionProductQuantity
		TotalInappInitiateCheckoutConversionProductValue
		TotalInappInitiateCheckoutConversionProductValueInUsd
		TotalOfflineInitiateCheckoutConversionProductQuantity
		TotalOfflineInitiateCheckoutConversionProductValue
		TotalOfflineInitiateCheckoutConversionProductValueInUsd
		TotalSubscribeConversionProductQuantity
		TotalSubscribeConversionProductValue
		TotalSubscribeConversionProductValueInUsd
		TotalWebSubscribeConversionProductQuantity
		TotalWebSubscribeConversionProductValue
		TotalWebSubscribeConversionProductValueInUsd
		TotalInappSubscribeConversionProductQuantity
		TotalInappSubscribeConversionProductValue
		TotalInappSubscribeConversionProductValueInUsd
		TotalOfflineSubscribeConversionProductQuantity
		TotalOfflineSubscribeConversionProductValue
		TotalOfflineSubscribeConversionProductValueInUsd
		TotalViewContentConversionProductQuantity
		TotalViewContentConversionProductValue
		TotalViewContentConversionProductValueInUsd
		TotalWebViewContentConversionProductQuantity
		TotalWebViewContentConversionProductValue
		TotalWebViewContentConversionProductValueInUsd
		TotalInappViewContentConversionProductQuantity
		TotalInappViewContentConversionProductValue
		TotalInappViewContentConversionProductValueInUsd
		TotalOfflineViewContentConversionProductQuantity
		TotalOfflineViewContentConversionProductValue
		TotalOfflineViewContentConversionProductValueInUsd
		
	#tag EndEnum
	#tag Enum, Name = ConversionReportAttributionType, Type = Integer, Flags = &h1
		
		Individual
		Household
		
	#tag EndEnum
	#tag Enum, Name = ConversionReportTimeType, Type = Integer, Flags = &h1
		
		TimeOfAdAction
		TimeOfConversion
		
	#tag EndEnum
	#tag Enum, Name = ConversionTagType, Type = Integer, Flags = &h1
		
		PageLoad
		Unknown
		Initialized
		PageVisit
		Signup
		Checkout
		Custom
		ViewCategory
		Search
		AddToCart
		WatchVideo
		Lead
		AppInstall
		WebSession
		ExternalMeasurement
		AddPaymentInfo
		AddToWishlist
		InitiateCheckout
		Subscribe
		ViewContent
		AdvertiserDefinedEvent
		AppOpen
		Contact
		Schedule
		FindLocation
		CustomizeProduct
		SubmitApplication
		StartTrial
		
	#tag EndEnum
	#tag Enum, Name = ConversionTagTypeOptimal, Type = Integer, Flags = &h1
		
		PageLoad
		Unknown
		Initialized
		PageVisit
		Signup
		Checkout
		Custom
		ViewCategory
		Search
		AddToCart
		WatchVideo
		Lead
		AppInstall
		WebSession
		ExternalMeasurement
		AddPaymentInfo
		AddToWishlist
		InitiateCheckout
		Subscribe
		ViewContent
		AdvertiserDefinedEvent
		AppOpen
		Contact
		Schedule
		FindLocation
		CustomizeProduct
		SubmitApplication
		StartTrial
		
	#tag EndEnum
	#tag Enum, Name = Country, Type = Integer, Flags = &h1
		
		Ad
		Ae
		Af
		Ag
		Ai
		Al
		Am
		Ao
		Aq
		Ar
		Escapedas
		At
		Au
		Aw
		Ax
		Az
		Ba
		Bb
		Bd
		Be
		Bf
		Bg
		Bh
		Bi
		Bj
		Bl
		Bm
		Bn
		Bo
		Bq
		Br
		Bs
		Bt
		Bv
		Bw
		By
		Bz
		Ca
		Cc
		Cd
		Cf
		Cg
		Ch
		Ci
		Ck
		Cl
		Cm
		Cn
		Co
		Cr
		Cu
		Cv
		Cw
		Cx
		Cy
		Cz
		De
		Dj
		Dk
		Dm
		Escapeddo
		Dz
		Ec
		Ee
		Eg
		Eh
		Er
		Es
		Et
		Fi
		Fj
		Fk
		Fm
		Fo
		Fr
		Ga
		Gb
		Gd
		Ge
		Gf
		Gg
		Gh
		Gi
		Gl
		Gm
		Gn
		Gp
		Gq
		Gr
		Gs
		Gt
		Gu
		Gw
		Gy
		Hk
		Hm
		Hn
		Hr
		Ht
		Hu
		Id
		Ie
		Il
		Im
		Escapedin
		Io
		Iq
		Ir
		Escapedis
		It
		Je
		Jm
		Jo
		Jp
		Ke
		Kg
		Kh
		Ki
		Km
		Kn
		Kr
		Kw
		Ky
		Kz
		La
		Lb
		Lc
		Li
		Lk
		Lr
		Ls
		Lt
		Lu
		Lv
		Ly
		Ma
		Mc
		Md
		Escapedme
		Mf
		Mg
		Mh
		Mk
		Ml
		Mm
		Mn
		Mo
		Mp
		Mq
		Mr
		Ms
		Mt
		Mu
		Mv
		Mw
		Mx
		My
		Mz
		Na
		Nc
		Ne
		Nf
		Ng
		Ni
		Nl
		Escapedfalse
		Np
		Nr
		Nu
		Nz
		Om
		Pa
		Pe
		Pf
		Pg
		Ph
		Pk
		Pl
		Pm
		Pn
		Pr
		Ps
		Pt
		Pw
		Py
		Qa
		Re
		Ro
		Rs
		Ru
		Rw
		Sa
		Sb
		Sc
		Sd
		Se
		Sg
		Sh
		Si
		Sj
		Sk
		Sl
		Sm
		Sn
		So
		Sr
		Ss
		St
		Sv
		Sx
		Sy
		Sz
		Tc
		Td
		Tf
		Tg
		Th
		Tj
		Tk
		Tl
		Tm
		Tn
		Escapedto
		Tr
		Tt
		Tv
		Tw
		Tz
		Ua
		Ug
		Um
		Us
		Uy
		Uz
		Va
		Vc
		Ve
		Vg
		Vi
		Vn
		Vu
		Wf
		Ws
		Ye
		Yt
		Za
		Zm
		Zw
		
	#tag EndEnum
	#tag Enum, Name = CreationSource, Type = Integer, Flags = &h1
		
		AdsApi
		AdsManagerReportingPage
		AdsManagerReportBuilder
		
	#tag EndEnum
	#tag Enum, Name = CreativeAssetsVisibilityType, Type = Integer, Flags = &h1
		
		Visible
		Hidden
		
	#tag EndEnum
	#tag Enum, Name = CreativeType, Type = Integer, Flags = &h1
		
		Regular
		Video
		Shopping
		Carousel
		MaxVideo
		ShopThePin
		Collection
		Idea
		Showcase
		Quiz
		Collage
		MaxWidthRegularCollection
		MaxWidthVideoCollection
		App
		
	#tag EndEnum
	#tag Enum, Name = Currency, Type = Integer, Flags = &h1
		
		Unk
		Usd
		Gbp
		Cad
		Eur
		Aud
		Nzd
		Sek
		Ils
		Chf
		Hkd
		Jpy
		Sgd
		Krw
		Nok
		Dkk
		Pln
		Ron
		Huf
		Czk
		Brl
		Mxn
		Ars
		Clp
		Cop
		Inr
		Escapedtry
		
	#tag EndEnum
	#tag Enum, Name = CustomerListStatus, Type = Integer, Flags = &h1
		
		Processing
		Ready
		TooSmall
		Uploading
		
	#tag EndEnum
	#tag Enum, Name = CustomizableCTAType, Type = Integer, Flags = &h1
		
		GetOffer
		LearnMore
		OrderNow
		ShopNow
		SignUp
		Subscribe
		BuyNow
		ContactUs
		GetQuote
		VisitSite
		ApplyNow
		BookNow
		RequestDemo
		RegisterNow
		FindADealer
		AddToCart
		WatchNow
		ReadMore
		BuyTickets
		DonateNow
		Download
		ExploreMore
		FindALocation
		FindRetailers
		GetDeal
		GetRecipe
		GetShowtimes
		OnSale
		PlayGame
		TryIt
		TakeAPeek
		
	#tag EndEnum
	#tag Enum, Name = DataOutputFormat, Type = Integer, Flags = &h1
		
		Json
		Csv
		
	#tag EndEnum
	#tag Enum, Name = DataStatus, Type = Integer, Flags = &h1
		
		Processing
		Ready
		Estimate
		BeforeBusinessCreated
		BeforeDataRetentionPeriod
		BeforePinDataRetentionPeriod
		BeforeMetricStartDate
		BeforeCoreMetricStartDate
		BeforePinFormatMetricStartDate
		BeforeAudienceMetricStartDate
		BeforeAudienceMonthlyMetricStartDate
		BeforeVideoMetricStartDate
		BeforeConversionMetricStartDate
		PurchasersMetricSmallerThanThreshold
		InBadTagDate
		BeforePublishedMetricStartDate
		BeforeAssistMetricStartDate
		BeforePinCreated
		BeforeAccountClaimed
		BeforeDemographicFiltersStartDate
		AudienceSegmentSmallerThanThreshold
		AudienceTotalSmallerThanThreshold
		BeforeProductGroupFilterStartDate
		
	#tag EndEnum
	#tag Enum, Name = DeliveryEstimateObjectiveType, Type = Integer, Flags = &h1
		
		Awareness
		Consideration
		CatalogSales
		WebConversion
		
	#tag EndEnum
	#tag Enum, Name = DisclosureType, Type = Integer, Flags = &h1
		
		NoDisclosure
		PrescribingInformation
		PrescribingInformationBoxWarning
		ImportantSafetyInfo
		MedGuide
		PatientInformation
		
	#tag EndEnum
	#tag Enum, Name = DiscountStatus, Type = Integer, Flags = &h1
		
		Other
		Active
		Paused
		Scheduled
		Expired
		
	#tag EndEnum
	#tag Enum, Name = EnhancedMatchStatusType, Type = Integer, Flags = &h1
		
		Unknown
		NotValidated
		ValidatingInProgress
		ValidationComplete
		
	#tag EndEnum
	#tag Enum, Name = EntityLabelStatus, Type = Integer, Flags = &h1
		
		Active
		Archived
		Null
		
	#tag EndEnum
	#tag Enum, Name = EntityStatus, Type = Integer, Flags = &h1
		
		Active
		Paused
		Archived
		Draft
		DeletedDraft
		
	#tag EndEnum
	#tag Enum, Name = EventProcessingStatus, Type = Integer, Flags = &h1
		
		Failed
		Processed
		
	#tag EndEnum
	#tag Enum, Name = FilterOperatorType, Type = Integer, Flags = &h1
		
		Escapedis
		Contains
		
	#tag EndEnum
	#tag Enum, Name = FormFactor, Type = Integer, Flags = &h1
		
		Desktop
		Laptop
		Cellphone
		Tablet
		Smartwatch
		Tv
		Vr
		Console
		Other
		
	#tag EndEnum
	#tag Enum, Name = FreqBidMultiplierTimeWindow, Type = Integer, Flags = &h1
		
		Week
		Month
		
	#tag EndEnum
	#tag Enum, Name = FrequencyGoalMetadataTimerange, Type = Integer, Flags = &h1
		
		ThirtyDay
		Day
		SevenDay
		TwentyMinute
		TenMinute
		TwentyFourHour
		
	#tag EndEnum
	#tag Enum, Name = Gender, Type = Integer, Flags = &h1
		
		Female
		Male
		Unisex
		
	#tag EndEnum
	#tag Enum, Name = GenderBucket, Type = Integer, Flags = &h1
		
		Male
		Female
		Unspecified
		
	#tag EndEnum
	#tag Enum, Name = Granularity, Type = Integer, Flags = &h1
		
		Total
		Day
		Hour
		Week
		Month
		
	#tag EndEnum
	#tag Enum, Name = GridClickType, Type = Integer, Flags = &h1
		
		Closeup
		DirectToDestination
		
	#tag EndEnum
	#tag Enum, Name = HttpMethod, Type = Integer, Flags = &h1
		
		Get
		Head
		Post
		Put
		Delete
		Connect
		Options
		Trace
		Patch
		
	#tag EndEnum
	#tag Enum, Name = IneligibleProductTagReason, Type = Integer, Flags = &h1
		
		PinMissing
		PinIsPrivate
		ProductMetadataMissing
		PinNotFromVerifiedDomain
		PinNotFromSameUserAsHeroPin
		
	#tag EndEnum
	#tag Enum, Name = IngestionSource, Type = Integer, Flags = &h1
		
		Tag
		Mmp
		FileUpload
		ConversionsApi
		Native
		
	#tag EndEnum
	#tag Enum, Name = IngestionSourceOptions, Type = Integer, Flags = &h1
		
		Tag
		Mmp
		FileUpload
		ConversionsApi
		Native
		
	#tag EndEnum
	#tag Enum, Name = IntegrationLogEventType, Type = Integer, Flags = &h1
		
		App
		Api
		
	#tag EndEnum
	#tag Enum, Name = IntegrationLogLevel, Type = Integer, Flags = &h1
		
		Info
		Warn
		Error
		
	#tag EndEnum
	#tag Enum, Name = IntendedPromotionType, Type = Integer, Flags = &h1
		
		Legacy
		StandardAd
		Catalog
		
	#tag EndEnum
	#tag Enum, Name = InterestsEnum, Type = Integer, Flags = &h1
		
		All
		Animals
		Architecture
		Art
		Beauty
		DiyAndCrafts
		Education
		EventPlanning
		Fashion
		FoodAndDrinks
		Gardening
		Health
		HomeDecor
		Parenting
		Travel
		Wedding
		
	#tag EndEnum
	#tag Enum, Name = InviteFilterStatus, Type = Integer, Flags = &h1
		
		Pending
		Expired
		
	#tag EndEnum
	#tag Enum, Name = InviteStatus, Type = Integer, Flags = &h1
		
		Pending
		Accepted
		Declined
		Cancelled
		Expired
		
	#tag EndEnum
	#tag Enum, Name = InviteType, Type = Integer, Flags = &h1
		
		MemberInvite
		PartnerInvite
		PartnerRequest
		
	#tag EndEnum
	#tag Enum, Name = ItemAvailability, Type = Integer, Flags = &h1
		
		InStock
		OutOfStock
		Preorder
		
	#tag EndEnum
	#tag Enum, Name = ItemProcessingStatus, Type = Integer, Flags = &h1
		
		Success
		Failure
		Processing
		
	#tag EndEnum
	#tag Enum, Name = LabelParentType, Type = Integer, Flags = &h1
		
		Campaign
		
	#tag EndEnum
	#tag Enum, Name = LabelStatus, Type = Integer, Flags = &h1
		
		Active
		Archived
		
	#tag EndEnum
	#tag Enum, Name = LabelStatusBulkUpdate, Type = Integer, Flags = &h1
		
		Archived
		
	#tag EndEnum
	#tag Enum, Name = LabelType, Type = Integer, Flags = &h1
		
		Brand
		Custom
		
	#tag EndEnum
	#tag Enum, Name = Language, Type = Integer, Flags = &h1
		
		Am
		Ar
		Az
		Bg
		Bn
		Bs
		Ca
		Cs
		Da
		Dv
		Dz
		De
		El
		En
		Es
		Et
		Fa
		Fi
		Fr
		He
		Hi
		Hr
		Hu
		Hy
		Id
		Escapedin
		Escapedis
		It
		Iw
		Ja
		Ka
		Km
		Ko
		Lo
		Lt
		Lv
		Mk
		Mn
		Ms
		My
		Nb
		Ne
		Nl
		Escapedfalse
		Pl
		Pt
		Ro
		Ru
		Sk
		Sl
		Sq
		Sr
		Sv
		Tl
		Uk
		Vi
		Te
		Th
		Tr
		Xx
		Zh
		
	#tag EndEnum
	#tag Enum, Name = LeadFormQuestionFieldType, Type = Integer, Flags = &h1
		
		TextField
		TextArea
		RadioList
		Checkbox
		
	#tag EndEnum
	#tag Enum, Name = LeadFormQuestionType, Type = Integer, Flags = &h1
		
		Custom
		FullName
		FirstName
		LastName
		Email
		PhoneNumber
		ZipCode
		Gender
		City
		Country
		StateProvince
		Address
		DateOfBirth
		Age
		
	#tag EndEnum
	#tag Enum, Name = LeadFormStatus, Type = Integer, Flags = &h1
		
		Draft
		Active
		
	#tag EndEnum
	#tag Enum, Name = LeadsExportStatus, Type = Integer, Flags = &h1
		
		InProgress
		Finished
		Failed
		
	#tag EndEnum
	#tag Enum, Name = LookbackPeriodOptions, Type = Integer, Flags = &h1
		
		Escaped1d
		Escaped14d
		
	#tag EndEnum
	#tag Enum, Name = MMMReportGranularity, Type = Integer, Flags = &h1
		
		Day
		Week
		
	#tag EndEnum
	#tag Enum, Name = MMMReportLevel, Type = Integer, Flags = &h1
		
		CampaignTargeting
		AdGroupTargeting
		
	#tag EndEnum
	#tag Enum, Name = MMMReportingColumn, Type = Integer, Flags = &h1
		
		SpendInDollar
		SpendInMicroDollar
		EcpcInDollar
		Ectr
		CampaignName
		TotalEngagement
		EengagementRate
		EcpmInDollar
		CampaignId
		AdvertiserId
		AdGroupId
		AdGroupName
		Clickthrough1
		Impression1
		Clickthrough2
		Impression2
		TotalClickthrough
		TotalImpression
		AdvertiserName
		SpendOrderLinePaidType
		CampaignObjectiveType
		PinnerListName
		AdsCreditSpendInDollar
		AdvertiserPaidSpendInDollar
		AdvertiserPaidEcpcInDollar
		AdvertiserPaidEcpmInDollar
		
	#tag EndEnum
	#tag Enum, Name = MMMReportingTargetingType, Type = Integer, Flags = &h1
		
		Apptype
		Country
		CreativeType
		Gender
		Location
		Placement
		AudienceInclude
		
	#tag EndEnum
	#tag Enum, Name = MatchType, Type = Integer, Flags = &h1
		
		Broad
		Phrase
		Exact
		ExactNegative
		PhraseNegative
		
	#tag EndEnum
	#tag Enum, Name = MatchTypeResponse, Type = Integer, Flags = &h1
		
		Broad
		Phrase
		Exact
		ExactNegative
		PhraseNegative
		
	#tag EndEnum
	#tag Enum, Name = MediaType, Type = Integer, Flags = &h1
		
		Image
		Video
		
	#tag EndEnum
	#tag Enum, Name = MediaUploadStatus, Type = Integer, Flags = &h1
		
		Registered
		Processing
		Succeeded
		Failed
		
	#tag EndEnum
	#tag Enum, Name = MediaUploadType, Type = Integer, Flags = &h1
		
		Video
		
	#tag EndEnum
	#tag Enum, Name = MemberBusinessRole, Type = Integer, Flags = &h1
		
		Employee
		BizAdmin
		
	#tag EndEnum
	#tag Enum, Name = MetricsReportingLevel, Type = Integer, Flags = &h1
		
		Advertiser
		AdvertiserTargeting
		Campaign
		CampaignTargeting
		AdGroup
		AdGroupTargeting
		PinPromotion
		PinPromotionTargeting
		Keyword
		ProductGroup
		ProductGroupTargeting
		ProductItem
		ProductItemTargeting
		
	#tag EndEnum
	#tag Enum, Name = MetricsReportingTemplateType, Type = Integer, Flags = &h1
		
		Unspecified
		Bulk
		Overview
		Table
		Mmm
		BrandCategory
		
	#tag EndEnum
	#tag Enum, Name = MobileAppPlatform, Type = Integer, Flags = &h1
		
		Ios
		Android
		
	#tag EndEnum
	#tag Enum, Name = MsotEventName, Type = Integer, Flags = &h1
		
		AddToCart
		Checkout
		Lead
		Signup
		
	#tag EndEnum
	#tag Enum, Name = MultiPinsAnalyticsMetricTypesItem, Type = Integer, Flags = &h1
		
		Impression
		OutboundClick
		PinClick
		Save
		SaveRate
		TotalComments
		TotalReactions
		UserFollow
		ProfileVisit
		VideoMrcView
		Video10sView
		Quartile95PercentView
		VideoV50WatchTime
		VideoStart
		VideoAvgWatchTime
		
	#tag EndEnum
	#tag Enum, Name = NetworkType, Type = Integer, Flags = &h1
		
		Wifi
		Cellular2g
		Cellular3g
		Cellular4g
		Cellular5g
		Cellular6g
		Ethernet
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = NonDraftEntityStatus, Type = Integer, Flags = &h1
		
		Active
		Paused
		Archived
		
	#tag EndEnum
	#tag Enum, Name = NonNullableCatalogsCurrency, Type = Integer, Flags = &h1
		
		Aed
		Afn
		All
		Amd
		Ang
		Aoa
		Ars
		Aud
		Awg
		Azn
		Bam
		Bbd
		Bdt
		Bgn
		Bhd
		Bif
		Bmd
		Bnd
		Bob
		Brl
		Bsd
		Btn
		Bwp
		Byn
		Byr
		Bzd
		Cad
		Cdf
		Chf
		Clp
		Cny
		Cop
		Crc
		Cuc
		Cup
		Cve
		Czk
		Djf
		Dkk
		Dop
		Dzd
		Egp
		Ern
		Etb
		Eur
		Fjd
		Fkp
		Gbp
		Gel
		Ggp
		Ghs
		Gip
		Gmd
		Gnf
		Gtq
		Gyd
		Hkd
		Hnl
		Hrk
		Htg
		Huf
		Idr
		Ils
		Imp
		Inr
		Iqd
		Irr
		Isk
		Jep
		Jmd
		Jod
		Jpy
		Kes
		Kgs
		Khr
		Kmf
		Kpw
		Krw
		Kwd
		Kyd
		Kzt
		Lak
		Lbp
		Lkr
		Lrd
		Lsl
		Lyd
		Mad
		Mdl
		Mga
		Mkd
		Mmk
		Mnt
		Mop
		Mro
		Mur
		Mvr
		Mwk
		Mxn
		Myr
		Mzn
		Nad
		Ngn
		Nio
		Nok
		Npr
		Nzd
		Omr
		Pab
		Pen
		Pgk
		Php
		Pkr
		Pln
		Pyg
		Qar
		Ron
		Rsd
		Rub
		Rwf
		Sar
		Sbd
		Scr
		Sdg
		Sek
		Sgd
		Shp
		Sll
		Sos
		Spl
		Srd
		Std
		Svc
		Syp
		Szl
		Thb
		Tjs
		Tmt
		Tnd
		Top
		Escapedtry
		Ttd
		Tvd
		Twd
		Tzs
		Uah
		Ugx
		Usd
		Uyu
		Uzs
		Vef
		Vnd
		Vuv
		Wst
		Xaf
		Xcd
		Xdr
		Xof
		Xpf
		Yer
		Zar
		Zmw
		Zwd
		
	#tag EndEnum
	#tag Enum, Name = NullableCatalogsItemFieldType, Type = Integer, Flags = &h1
		
		ItemId
		ItemGroupId
		Title
		Description
		ItemLink
		OrganicLink
		ImageLink
		AdwordsRedirectLink
		AdLink
		Size
		GoogleProductCategory
		ProductCategory
		Condition
		Availability
		Gender
		AgeGroup
		SizeType
		SizeSystem
		Adult
		Shipping
		ShippingWeight
		Tax
		Multipack
		AdditionalImageLink
		Price
		SalePrice
		IsBundle
		ExpirationDate
		AvailabilityDate
		WeightUnit
		ProductType
		CustomLabel0
		CustomLabel1
		CustomLabel2
		CustomLabel3
		CustomLabel4
		Material
		Pattern
		Color
		Brand
		Gtin
		Mpn
		IosDeepLink
		AndroidDeepLink
		FreeShippingLabel
		FreeShippingLimit
		AvgReviewRating
		NumRatings
		NumReviews
		AltText
		VariantNames
		VariantValues
		MinAdPrice
		ShippingWidth
		ShippingHeight
		AdImage0Link
		AdImage1Link
		AdImage2Link
		AdImage3Link
		AdImage4Link
		AdImage5Link
		AdImage6Link
		AdImage7Link
		AdImage8Link
		AdImage9Link
		AdImage10Link
		AdImage11Link
		AdImage12Link
		AdImage13Link
		AdImage14Link
		AdImage15Link
		AdImage16Link
		AdImage17Link
		AdImage18Link
		AdImage19Link
		AdImage0Tag
		AdImage1Tag
		AdImage2Tag
		AdImage3Tag
		AdImage4Tag
		AdImage5Tag
		AdImage6Tag
		AdImage7Tag
		AdImage8Tag
		AdImage9Tag
		AdImage10Tag
		AdImage11Tag
		AdImage12Tag
		AdImage13Tag
		AdImage14Tag
		AdImage15Tag
		AdImage16Tag
		AdImage17Tag
		AdImage18Tag
		AdImage19Tag
		AdVideo0Link
		AdVideo1Link
		AdVideo2Link
		AdVideo0Tag
		AdVideo1Tag
		AdVideo2Tag
		InstallmentPrice
		UnitPriceTotalMeasure
		UnitPriceBaseMeasure
		SalePriceEffectiveDate
		
	#tag EndEnum
	#tag Enum, Name = NullableCurrency, Type = Integer, Flags = &h1
		
		Aed
		Afn
		All
		Amd
		Ang
		Aoa
		Ars
		Aud
		Awg
		Azn
		Bam
		Bbd
		Bdt
		Bgn
		Bhd
		Bif
		Bmd
		Bnd
		Bob
		Brl
		Bsd
		Btn
		Bwp
		Byn
		Byr
		Bzd
		Cad
		Cdf
		Chf
		Clp
		Cny
		Cop
		Crc
		Cuc
		Cup
		Cve
		Czk
		Djf
		Dkk
		Dop
		Dzd
		Egp
		Ern
		Etb
		Eur
		Fjd
		Fkp
		Gbp
		Gel
		Ggp
		Ghs
		Gip
		Gmd
		Gnf
		Gtq
		Gyd
		Hkd
		Hnl
		Hrk
		Htg
		Huf
		Idr
		Ils
		Imp
		Inr
		Iqd
		Irr
		Isk
		Jep
		Jmd
		Jod
		Jpy
		Kes
		Kgs
		Khr
		Kmf
		Kpw
		Krw
		Kwd
		Kyd
		Kzt
		Lak
		Lbp
		Lkr
		Lrd
		Lsl
		Lyd
		Mad
		Mdl
		Mga
		Mkd
		Mmk
		Mnt
		Mop
		Mro
		Mur
		Mvr
		Mwk
		Mxn
		Myr
		Mzn
		Nad
		Ngn
		Nio
		Nok
		Npr
		Nzd
		Omr
		Pab
		Pen
		Pgk
		Php
		Pkr
		Pln
		Pyg
		Qar
		Ron
		Rsd
		Rub
		Rwf
		Sar
		Sbd
		Scr
		Sdg
		Sek
		Sgd
		Shp
		Sll
		Sos
		Spl
		Srd
		Std
		Svc
		Syp
		Szl
		Thb
		Tjs
		Tmt
		Tnd
		Top
		Escapedtry
		Ttd
		Tvd
		Twd
		Tzs
		Uah
		Ugx
		Usd
		Uyu
		Uzs
		Vef
		Vnd
		Vuv
		Wst
		Xaf
		Xcd
		Xdr
		Xof
		Xpf
		Yer
		Zar
		Zmw
		Zwd
		
	#tag EndEnum
	#tag Enum, Name = NullableEntityStatus, Type = Integer, Flags = &h1
		
		Active
		Paused
		Archived
		Draft
		DeletedDraft
		
	#tag EndEnum
	#tag Enum, Name = NullableLabelStatus, Type = Integer, Flags = &h1
		
		Active
		Archived
		
	#tag EndEnum
	#tag Enum, Name = NullableLabelType, Type = Integer, Flags = &h1
		
		Brand
		Custom
		
	#tag EndEnum
	#tag Enum, Name = NullablePartnerType, Type = Integer, Flags = &h1
		
		Internal
		External
		
	#tag EndEnum
	#tag Enum, Name = NullalbleMatchType, Type = Integer, Flags = &h1
		
		Broad
		Phrase
		Exact
		ExactNegative
		PhraseNegative
		
	#tag EndEnum
	#tag Enum, Name = NumericFilterOperatorType, Type = Integer, Flags = &h1
		
		GreaterThan
		GreaterThanOrEquals
		LessThan
		LessThanOrEquals
		
	#tag EndEnum
	#tag Enum, Name = ObjectiveType, Type = Integer, Flags = &h1
		
		Awareness
		Consideration
		WebConversion
		CatalogSales
		VideoCompletion
		Sales
		AppInstall
		CtvConsideration
		
	#tag EndEnum
	#tag Enum, Name = OperationType, Type = Integer, Flags = &h1
		
		Share
		Revoke
		
	#tag EndEnum
	#tag Enum, Name = OptimizationType, Type = Integer, Flags = &h1
		
		Clickthrough
		Impression
		WebConversion
		Roas
		OutboundClick
		
	#tag EndEnum
	#tag Enum, Name = Order, Type = Integer, Flags = &h1
		
		Ascending
		Descending
		
	#tag EndEnum
	#tag Enum, Name = OrderLinePaidType, Type = Integer, Flags = &h1
		
		Paid
		Bonus
		MakeGood
		Test
		
	#tag EndEnum
	#tag Enum, Name = OrderLineStatus, Type = Integer, Flags = &h1
		
		Active
		Paused
		Deleted
		
	#tag EndEnum
	#tag Enum, Name = OsFamily, Type = Integer, Flags = &h1
		
		Ios
		Android
		Macos
		Windows
		Linux
		Bsd
		Other
		
	#tag EndEnum
	#tag Enum, Name = OverallStatusOptions, Type = Integer, Flags = &h1
		
		NeedsImprovement
		Fair
		Good
		
	#tag EndEnum
	#tag Enum, Name = PacingDeliveryType, Type = Integer, Flags = &h1
		
		Standard
		Accelerated
		
	#tag EndEnum
	#tag Enum, Name = PartnerType, Type = Integer, Flags = &h1
		
		Internal
		External
		
	#tag EndEnum
	#tag Enum, Name = Permissions, Type = Integer, Flags = &h1
		
		Admin
		Analyst
		FinanceManager
		FinanceEdit
		FinanceView
		AudienceManager
		CampaignManager
		CatalogsManager
		CatalogsViewer
		ProfilePublisher
		ConsumerUser
		BizPinnerListSharer
		
	#tag EndEnum
	#tag Enum, Name = PermissionsWithOwner, Type = Integer, Flags = &h1
		
		Admin
		Analyst
		FinanceManager
		FinanceEdit
		FinanceView
		AudienceManager
		CampaignManager
		CatalogsManager
		CatalogsViewer
		ProfilePublisher
		Owner
		
	#tag EndEnum
	#tag Enum, Name = PinFilter, Type = Integer, Flags = &h1
		
		ExcludeNative
		ExcludeRepins
		HasBeenPromoted
		
	#tag EndEnum
	#tag Enum, Name = PinPromotionSummaryStatus, Type = Integer, Flags = &h1
		
		Approved
		Paused
		Pending
		Rejected
		AdvertiserDisabled
		Archived
		Draft
		DeletedDraft
		
	#tag EndEnum
	#tag Enum, Name = PinType, Type = Integer, Flags = &h1
		
		Escapedprivate
		
	#tag EndEnum
	#tag Enum, Name = PinnerListType, Type = Integer, Flags = &h1
		
		CustomerList
		Visitor
		Engagement
		Lookalike
		Actalike
		Persona
		
	#tag EndEnum
	#tag Enum, Name = PinterestLibPaginationOrder, Type = Integer, Flags = &h1
		
		Ascending
		Descending
		
	#tag EndEnum
	#tag Enum, Name = PlacementGroupType, Type = Integer, Flags = &h1
		
		All
		Search
		Browse
		Other
		
	#tag EndEnum
	#tag Enum, Name = PlacementTrafficType, Type = Integer, Flags = &h1
		
		All
		TwoColumnFeed
		FullscreenFeed
		
	#tag EndEnum
	#tag Enum, Name = PlacementType, Type = Integer, Flags = &h1
		
		Search
		Browse
		RelatedPins
		
	#tag EndEnum
	#tag Enum, Name = PreferredMediaType, Type = Integer, Flags = &h1
		
		Video
		Image
		
	#tag EndEnum
	#tag Enum, Name = PrimarySort, Type = Integer, Flags = &h1
		
		ById
		ByDate
		
	#tag EndEnum
	#tag Enum, Name = ProductAvailability, Type = Integer, Flags = &h1
		
		InStock
		OutOfStock
		Preorder
		
	#tag EndEnum
	#tag Enum, Name = ProductAvailabilityType, Type = Integer, Flags = &h1
		
		InStock
		OutOfStock
		Preorder
		
	#tag EndEnum
	#tag Enum, Name = ProductCategoriesEngagementType, Type = Integer, Flags = &h1
		
		Engagement
		OutboundClick
		Save
		
	#tag EndEnum
	#tag Enum, Name = ProductCategoryDetailLookbackWindow, Type = Integer, Flags = &h1
		
		Escaped90
		Escaped180
		Escaped365
		Escaped730
		
	#tag EndEnum
	#tag Enum, Name = ProductCategoryEnum, Type = Integer, Flags = &h1
		
		AccentTables
		Accessories
		Anklets
		Aprons
		AreaRugs
		ArmoiresAndWardrobes
		ArtAndCraftPaints
		ArtBrushes
		ArtificialFlora
		Artwork
		Audio
		AudioAccessories
		Backpacks
		BagAndLuggageAccessories
		BagsAndLuggage
		Bakeware
		Bandanas
		BarCarts
		Barware
		Baskets
		BathAndBody
		BathAndShower
		BathMatsAndRugs
		BathTowelsAndWashcloths
		BathroomAccessories
		BathroomAccessorySets
		BathroomVanities
		BeachTowels
		BeadsAndJewelryMakingSupplies
		BeautySupplements
		BedSheets
		Bedding
		BedroomVanities
		BedsAndAccessories
		BedsAndBedFrames
		BeltBags
		BeltsAndSuspenders
		Benches
		Beverages
		BirdSupplies
		Blankets
		Blouses
		BlushesAndBronzers
		BodyCare
		BodyJewelry
		BodyMakeup
		BodyMoisturizers
		BodyWashes
		BookcasesAndStandingShelves
		Bookends
		Books
		Boots
		Bracelets
		BridesmaidDresses
		BroochesAndLapelPins
		BrowMakeup
		BuffetsAndSideboards
		ButtonDownShirts
		CabinetHardware
		CabinetsAndStorageFurniture
		CakeDecoratingSupplies
		CampingAndHiking
		CandleHolders
		Candles
		CardstockPapers
		CasualPants
		CatSupplies
		Chairs
		Chandeliers
		CharmsAndPendants
		ChinaCabinetsAndHutches
		ClogsAndMules
		ClothNapkins
		Clothing
		ClothingAndClosetStorage
		ClothingSets
		Coasters
		CoatsAndJackets
		CoffeeAndTeaCups
		CoffeeMakersAndEspressoMachines
		ColoringBooks
		Communications
		ComputerAccessories
		CookieCutters
		Cookware
		CookwareAndBakeware
		CosmeticAndToiletryBags
		CostumesAndAccessories
		CraftAdhesivesAndMagnets
		CraftCuttingTools
		CraftMolds
		CribsAndToddlerBeds
		CurtainAndDrapeRods
		CurtainsAndDrapes
		CuttingBoards
		Cycling
		DecorativeBowls
		DecorativeJars
		DecorativeTapestries
		DecorativeTrays
		DeodorantsAndAntiperspirants
		DeskAndShelfClocks
		Desks
		DiaperBags
		Dinnerware
		Dishwashers
		DogSupplies
		DoorMats
		DrawingAndPainting
		DressPants
		Dressers
		Dresses
		DrillsAndScrewdrivers
		Drinkware
		DuffelBags
		DuvetCovers
		DvdsAndVideos
		Earrings
		ElectronicsAccessories
		EngagementAndWeddingRings
		EntertainmentCentersAndTvStands
		Erasers
		EyeMakeup
		EyeShadow
		Eyeliners
		Fabric
		FaceCoverings
		FaceLotionsAndCreams
		FaceMakeup
		FacialCleansers
		FacialMoisturizers
		FalseEyelashes
		Figurines
		FireplaceAndWoodStoveAccessories
		Fireplaces
		Fishing
		FlagsAndWindsocks
		Flats
		Flatware
		FloorLamps
		FlowerGirlDresses
		FoodAndBeverageCarriers
		FoodCookersAndSteamers
		FoodItems
		FoodMixersAndBlenders
		FoodStorageContainers
		FoodStorageSupplies
		FoundationsAndConcealers
		FountainsAndPonds
		Fragrance
		Furniture
		FurnitureSets
		Games
		Gardening
		GardeningTools
		GlovesAndMittens
		GluesAndTapes
		GroomAndGroomsmenSuits
		Hair
		HairAccessories
		HairCare
		HairColor
		HairCombs
		HairPinsClawsAndClips
		HairRemoval
		HairTools
		HairTreatment
		HairWreaths
		HandAndFootCare
		HandSoapsAndSanitizers
		Handbags
		Handkerchiefs
		HardwareSupplies
		Hats
		HeadboardsAndFootboards
		Headwear
		Highlighters
		HobbiesAndCreativeArts
		HomeAccessories
		HomeDecorDecals
		HomeFragranceAccessories
		HomeFragrances
		HomeImprovementToolsAndSupplies
		Hosiery
		HouseholdAppliances
		HouseholdSupplies
		Incense
		IndoorGames
		Jeans
		JewelryAndWatchAccessories
		JewelryAndWatches
		JewelrySets
		JumpsuitsAndRompers
		Keychains
		KitchenAndDining
		KitchenAndDiningRoomTables
		KitchenAppliances
		KitchenKnives
		KitchenLinens
		KitchenMats
		KitchenOrganizers
		KitchenToolsAndUtensils
		KitchenTowels
		KnittingAndCrochet
		KnittingAndCrochetTools
		LampShades
		Lamps
		Lanyards
		LaundryHampersAndSupplies
		LawnAndGarden
		LawnAndGardenDecor
		LawnOrnamentsAndGardenSculptures
		Leggings
		LeotardsAndUnitards
		Lighting
		LightingAccessories
		LightingFixtures
		LipBalms
		LipCare
		LipMakeup
		LipsticksAndLipGlosses
		MagazinesAndNewspapers
		Magnets
		Makeup
		MakeupTools
		Mascaras
		Mattresses
		MeasuresAndRulers
		MeasuringToolsAndSensors
		MessengerBags
		Mirrors
		MusicAndSoundRecordings
		NailArt
		NailArtKitAndTools
		NailCare
		NailPolishes
		Nails
		Necklaces
		Neckties
		NightLightsAndAmbientLighting
		Nightstands
		NoveltySigns
		OnePieces
		Onesies
		Ottomans
		OutdoorFurniture
		OutdoorFurnitureSets
		OutdoorGames
		OutdoorGrills
		OutdoorLiving
		OutdoorPlayEquipment
		OutdoorRecreation
		OutdoorRugs
		OutdoorSeating
		OutdoorStructures
		OutdoorTables
		Outerwear
		OvensAndCooktops
		Overalls
		OxfordsAndLoafers
		PaintAndPaintTools
		Pants
		PaperCrafts
		ParasolsAndRainUmbrellas
		PartyAndCelebration
		PendantLights
		PensAndPencils
		PerfumesAndColognes
		PetCarriersAndCrates
		PetCollarsAndHarnesses
		PetSupplies
		PhotoAlbumsAndStorage
		PictureFrames
		PillowcasesAndShams
		PinbackButtons
		Placemats
		Plants
		PonytailHolders
		PoolAndSpaAccessories
		PostersPrintsAndVisualArtwork
		PotsAndPlanters
		PotteryAndSculpting
		PrimersAndMakeupSetters
		Pumps
		Puzzles
		QuiltsAndComforters
		RazorsAndShavingTools
		Rings
		Rugs
		RunnerRugs
		Sandals
		Sashes
		Saws
		ScarvesAndShawls
		SculpturesAndStatues
		SeasonalAndHolidayDecorations
		Seating
		SerumsAndEssences
		Serveware
		SewingMachines
		SewingPatterns
		ShampooAndConditioner
		ShoeAccessories
		Shoes
		ShoppingTotes
		Shorts
		ShowerCurtains
		Skincare
		SkincareMasksAndPeels
		Skirts
		SleepwearAndLoungewear
		SlipcoversAndCushions
		Slippers
		SneakersAndAthleticShoes
		SocksAndTights
		Sofas
		SportsUniforms
		Stemware
		Stockings
		StorageAndOrganization
		StorageCabinetsAndLockers
		StorageHooksAndRacks
		Suitcases
		Suits
		SuitsAndSuitSeparates
		GlassesAndSunglasses
		Sunscreen
		SweatersAndCardigans
		SweatshirtsAndHoodies
		Swimwear
		TShirts
		TableLamps
		TableRunners
		Tablecloths
		Tables
		Tableware
		TankTops
		TanningOilsAndLotions
		TeethWhitening
		TeethWhiteningTools
		Telephony
		TextileAndSewing
		ThreadAndYarn
		ThrowPillows
		Tiaras
		ToiletPaperHolders
		TonersAndAstringents
		ToolStorageAndOrganization
		Tools
		Tops
		TowelRacksAndHolders
		Toys
		TraditionalAndCeremonialClothing
		TumblersAndWaterBottles
		Uniforms
		Vases
		VehiclePartsAndAccessories
		Veils
		WallClocks
		WallLightFixtures
		WallPaints
		WallShelvesAndLedges
		WalletsAndCardCases
		Wallpapers
		Watches
		WateringAndIrrigation
		WeddingCeremonyDecor
		WeddingClothing
		WeddingDecor
		WeddingDress
		WeddingGifts
		WeddingStationery
		WeddingTableDecor
		WigsAndHairExtensions
		WindowBlindsAndShades
		WindowTreatmentAccessories
		WindowTreatments
		WineRacks
		WoodBoardsAndPlanks
		WoodworkingMaterials
		WoodworkingPlans
		WorkBenches
		WreathsAndGarlands
		
	#tag EndEnum
	#tag Enum, Name = ProductCategoryRegion, Type = Integer, Flags = &h1
		
		Us
		GbPlusIe
		Ca
		
	#tag EndEnum
	#tag Enum, Name = ProductCondition, Type = Integer, Flags = &h1
		
		Escapednew
		Used
		Refurbished
		
	#tag EndEnum
	#tag Enum, Name = ProductGroupPromotionCustomizableCTAType, Type = Integer, Flags = &h1
		
		GetOffer
		LearnMore
		OrderNow
		ShopNow
		SignUp
		Subscribe
		BuyNow
		ContactUs
		GetQuote
		VisitSite
		ApplyNow
		BookNow
		RegisterNow
		FindADealer
		WatchNow
		ReadMore
		BuyTickets
		DonateNow
		Download
		ExploreMore
		FindALocation
		GetDeal
		GetRecipe
		GetShowtimes
		OnSale
		PlayGame
		TryIt
		BuyOnlinePickupInStore
		ShopOnAdvertiser
		ShopTheCollection
		GetItNow
		TakeAPeek
		TakeACloserLook
		
	#tag EndEnum
	#tag Enum, Name = ProductGroupSummaryStatus, Type = Integer, Flags = &h1
		
		Running
		Paused
		Excluded
		Archived
		
	#tag EndEnum
	#tag Enum, Name = PromotionApplicationLevel, Type = Integer, Flags = &h1
		
		None
		Item
		AdGroup
		
	#tag EndEnum
	#tag Enum, Name = PromotionType, Type = Integer, Flags = &h1
		
		Variable
		Sitewide
		Checkout
		SaveXOnY
		BuyXGetY
		SpendXSaveY
		FreeShipping
		FreeShippingMinimum
		FreeShippingWithDiscount
		SitewideInStores
		ExtraPercentOff
		GiftWithPurchase
		GiftWithPurchaseMinimum
		Fixed
		PercentOffClearance
		XOffY
		GiftWithFirstPurchase
		BuyXGetOneFree
		CashBack
		PointsOnAllPurchases
		Bonus
		PointsWithPurchase
		Custom
		
	#tag EndEnum
	#tag Enum, Name = PublicTargetingType, Type = Integer, Flags = &h1
		
		Apptype
		Gender
		Locale
		AgeBucket
		Location
		Geo
		Interest
		Keyword
		AudienceInclude
		AudienceExclude
		
	#tag EndEnum
	#tag Enum, Name = QueryLabelEntityStatusesItems, Type = Integer, Flags = &h1
		
		Active
		Archived
		
	#tag EndEnum
	#tag Enum, Name = QueryLabelTypesItems, Type = Integer, Flags = &h1
		
		Brand
		Custom
		
	#tag EndEnum
	#tag Enum, Name = QuerymetrictypesItems, Type = Integer, Flags = &h1
		
		Engagement
		EngagementRate
		Impression
		OutboundClick
		OutboundClickRate
		PinClick
		PinClickRate
		Save
		SaveRate
		
	#tag EndEnum
	#tag Enum, Name = QuerypinanalyticsmetrictypesItems, Type = Integer, Flags = &h1
		
		Impression
		OutboundClick
		PinClick
		Save
		SaveRate
		TotalComments
		TotalReactions
		UserFollow
		ProfileVisit
		VideoMrcView
		Video10sView
		Quartile95PercentView
		VideoV50WatchTime
		VideoStart
		VideoAvgWatchTime
		
	#tag EndEnum
	#tag Enum, Name = QueryvideopinmetrictypesItems, Type = Integer, Flags = &h1
		
		Impression
		Save
		VideoMrcView
		VideoAvgWatchTime
		VideoV50WatchTime
		Quartile95PercentView
		Video10sView
		VideoStart
		OutboundClick
		
	#tag EndEnum
	#tag Enum, Name = ReportType, Type = Integer, Flags = &h1
		
		Sync
		Escapedasync
		
	#tag EndEnum
	#tag Enum, Name = ReportingColumn, Type = Integer, Flags = &h1
		
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
	#tag Enum, Name = ReportingColumnAsync, Type = Integer, Flags = &h1
		
		SpendInMicroDollar
		AdsCreditSpendInMicroDollar
		AdsCreditSpendInDollar
		PaidImpression
		SpendInDollar
		CpcInMicroDollar
		EcpcInMicroDollar
		EcpcInDollar
		Ctr
		Ectr
		OutboundCtr
		OutboundCtr1
		CostPerOutboundClick
		CampaignName
		CampaignStatus
		CampaignBrandLabel
		CampaignCustomLabels
		PinPromotionStatus
		AdStatus
		PinId
		TotalEngagement
		Engagement1
		Engagement2
		EcpeInDollar
		EngagementRate
		EengagementRate
		EcpmInMicroDollar
		RepinRate
		Ctr2
		Campaign
		CampaignId
		AdvertiserId
		AdAccountId
		PinPromotionId
		AdId
		AdGroupId
		CampaignEntityStatus
		CampaignManagedStatus
		CampaignObjectiveType
		CpmInMicroDollar
		CpmInDollar
		AdGroupName
		AdGroupStatus
		AdGroupBudgetType
		AdGroupBudgetInLocalCurrency
		AdGroupEntityStatus
		AdGroupBidMultiplier
		ProductGroupId
		ProductGroupStatus
		PromoId
		PromoName
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
		ProductItemCurrency
		OrderLineId
		OrderLineName
		Clickthrough1
		Repin1
		Impression1
		Impression1Gross
		Clickthrough1Gross
		OutboundClick1
		Clickthrough2
		Repin2
		Impression2
		OutboundClick2
		CollectionPinItemImpression1
		CollectionPinItemImpression2
		TotalCollectionPinItemImpression
		CollectionPinItemClickthrough1
		CollectionPinItemClickthrough2
		TotalCollectionPinItemClickthrough
		TotalClickthrough
		TotalImpression
		TotalImpressionUser
		TotalImpressionFrequency
		CostPerOutboundClickInDollar
		CostPerOutboundClickInDollar1
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
		TotalEngagementPageVisitValueInMicroDollar
		TotalEngagementSignupValueInMicroDollar
		TotalEngagementCheckoutValueInMicroDollar
		TotalEngagementCustomValueInMicroDollar
		TotalEngagementAddToCartValueInMicroDollar
		TotalEngagementLeadValueInMicroDollar
		TotalEngagementSearchValueInMicroDollar
		TotalEngagementWatchVideoValueInMicroDollar
		TotalEngagementViewCategoryValueInMicroDollar
		TotalEngagementAppInstallValueInMicroDollar
		TotalEngagementUnknownValueInMicroDollar
		TotalClickPageVisitValueInMicroDollar
		TotalClickSignupValueInMicroDollar
		TotalClickCheckoutValueInMicroDollar
		TotalClickCustomValueInMicroDollar
		TotalClickAddToCartValueInMicroDollar
		TotalClickLeadValueInMicroDollar
		TotalClickSearchValueInMicroDollar
		TotalClickWatchVideoValueInMicroDollar
		TotalClickViewCategoryValueInMicroDollar
		TotalClickAppInstallValueInMicroDollar
		TotalClickUnknownValueInMicroDollar
		TotalViewPageVisitValueInMicroDollar
		TotalViewSignupValueInMicroDollar
		TotalViewCheckoutValueInMicroDollar
		TotalViewCustomValueInMicroDollar
		TotalViewAddToCartValueInMicroDollar
		TotalViewLeadValueInMicroDollar
		TotalViewSearchValueInMicroDollar
		TotalViewWatchVideoValueInMicroDollar
		TotalViewViewCategoryValueInMicroDollar
		TotalViewAppInstallValueInMicroDollar
		TotalViewUnknownValueInMicroDollar
		TotalConversionsValueInMicroDollar
		TotalEngagementPageVisitQuantity
		TotalEngagementSignupQuantity
		TotalEngagementCheckoutQuantity
		TotalEngagementCustomQuantity
		TotalEngagementAddToCartQuantity
		TotalEngagementLeadQuantity
		TotalEngagementSearchQuantity
		TotalEngagementWatchVideoQuantity
		TotalEngagementViewCategoryQuantity
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
		TotalViewUnknownQuantity
		TotalConversionsQuantity
		TotalWebSessions
		WebSessions1
		WebSessions2
		OnsiteCheckouts1
		PinPromotionName
		AdName
		CampaignLifetimeSpendCap
		AdGroupOptimization
		CampaignDailySpendCap
		CampaignBudgetOptimization
		IsCatalogCreativeCampaign
		IsPremiereCampaign
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
		TotalAddToWishlist
		TotalSubscribe
		TotalSignupValueInMicroDollar
		TotalCheckoutValueInMicroDollar
		TotalCustomValueInMicroDollar
		TotalAddToCartValueInMicroDollar
		TotalLeadValueInMicroDollar
		TotalSearchValueInMicroDollar
		TotalWatchVideoValueInMicroDollar
		TotalViewCategoryValueInMicroDollar
		TotalAppInstallValueInMicroDollar
		TotalCheckoutQuantity
		PageVisitCostPerAction
		AppInstallCostPerAction
		PageVisitRoas
		CheckoutRoas
		CustomRoas
		ProductGroupAdImageTag
		ProductGroupAdVideoTag
		Video3secViews1
		Video15secUniqueViews1
		VideoP100Complete1
		VideoP0Combined1
		VideoP25Combined1
		VideoP50Combined1
		VideoP75Combined1
		VideoP95Combined1
		VideoMrcViews1
		Video3secViews2
		Video15secUniqueViews2
		VideoP100Complete2
		VideoP0Combined2
		VideoP25Combined2
		VideoP50Combined2
		VideoP75Combined2
		VideoP95Combined2
		VideoMrcViews2
		PaidVideoViewableRate
		VideoLength
		VideoSpendInDollar
		CpvInMicroDollar
		EcpvInDollar
		CpcvInMicroDollar
		EcpcvInDollar
		CpcvP95InMicroDollar
		EcpcvP95InDollar
		TotalVideo3secViews
		TotalVideo15secUniqueViews
		TotalVideoP100Complete
		TotalVideoP0Combined
		TotalVideoP25Combined
		TotalVideoP50Combined
		TotalVideoP75Combined
		TotalVideoP95Combined
		TotalVideoMrcViews
		VideoAvgWatchtimeInSecond1
		VideoAvgWatchtimeInSecond2
		TotalVideoAvgWatchtimeInSecond
		TotalDestinationViews
		TotalRepinRate
		WebCheckoutCostPerAction
		WebCheckoutRoas
		TotalWebCheckout
		TotalWebCheckoutValueInMicroDollar
		TotalWebClickCheckout
		TotalWebClickCheckoutValueInMicroDollar
		TotalWebEngagementCheckout
		TotalWebEngagementCheckoutValueInMicroDollar
		TotalWebViewCheckout
		TotalWebViewCheckoutValueInMicroDollar
		InappCheckoutCostPerAction
		InappCheckoutRoas
		TotalInappCheckout
		TotalInappCheckoutValueInMicroDollar
		TotalInappClickCheckout
		TotalInappClickCheckoutValueInMicroDollar
		TotalInappEngagementCheckout
		TotalInappEngagementCheckoutValueInMicroDollar
		TotalInappViewCheckout
		TotalInappViewCheckoutValueInMicroDollar
		OfflineCheckoutCostPerAction
		OfflineCheckoutRoas
		TotalOfflineCheckout
		TotalOfflineCheckoutValueInMicroDollar
		TotalOfflineClickCheckout
		TotalOfflineClickCheckoutValueInMicroDollar
		TotalOfflineEngagementCheckout
		TotalOfflineEngagementCheckoutValueInMicroDollar
		TotalOfflineViewCheckout
		TotalOfflineViewCheckoutValueInMicroDollar
		PinterestCheckoutCostPerAction
		PinterestCheckoutRoas
		TotalPinterestCheckout
		TotalPinterestCheckoutValueInMicroDollar
		WebAddToCartCostPerAction
		WebAddToCartRoas
		TotalWebAddToCart
		TotalWebAddToCartValueInMicroDollar
		TotalWebClickAddToCart
		TotalWebClickAddToCartValueInMicroDollar
		TotalWebEngagementAddToCart
		TotalWebEngagementAddToCartValueInMicroDollar
		TotalWebViewAddToCart
		TotalWebViewAddToCartValueInMicroDollar
		InappAddToCartCostPerAction
		InappAddToCartRoas
		TotalInappAddToCart
		TotalInappAddToCartValueInMicroDollar
		TotalInappClickAddToCart
		TotalInappClickAddToCartValueInMicroDollar
		TotalInappEngagementAddToCart
		TotalInappEngagementAddToCartValueInMicroDollar
		TotalInappViewAddToCart
		TotalInappViewAddToCartValueInMicroDollar
		WebPageVisitCostPerAction
		WebPageVisitRoas
		TotalWebPageVisit
		TotalWebPageVisitValueInMicroDollar
		TotalWebClickPageVisit
		TotalWebClickPageVisitValueInMicroDollar
		TotalWebEngagementPageVisit
		TotalWebEngagementPageVisitValueInMicroDollar
		TotalWebViewPageVisit
		TotalWebViewPageVisitValueInMicroDollar
		WebSignupCostPerAction
		WebSignupRoas
		TotalWebSignup
		TotalWebSignupValueInMicroDollar
		TotalWebClickSignup
		TotalWebClickSignupValueInMicroDollar
		TotalWebEngagementSignup
		TotalWebEngagementSignupValueInMicroDollar
		TotalWebViewSignup
		TotalWebViewSignupValueInMicroDollar
		InappSignupCostPerAction
		InappSignupRoas
		TotalInappSignup
		TotalInappSignupValueInMicroDollar
		TotalInappClickSignup
		TotalInappClickSignupValueInMicroDollar
		TotalInappEngagementSignup
		TotalInappEngagementSignupValueInMicroDollar
		TotalInappViewSignup
		TotalInappViewSignupValueInMicroDollar
		OfflineSignupCostPerAction
		OfflineSignupRoas
		TotalOfflineSignup
		TotalOfflineSignupValueInMicroDollar
		TotalOfflineClickSignup
		TotalOfflineClickSignupValueInMicroDollar
		TotalOfflineEngagementSignup
		TotalOfflineEngagementSignupValueInMicroDollar
		TotalOfflineViewSignup
		TotalOfflineViewSignupValueInMicroDollar
		WebWatchVideoCostPerAction
		WebWatchVideoRoas
		TotalWebWatchVideo
		TotalWebWatchVideoValueInMicroDollar
		TotalWebClickWatchVideo
		TotalWebClickWatchVideoValueInMicroDollar
		TotalWebEngagementWatchVideo
		TotalWebEngagementWatchVideoValueInMicroDollar
		TotalWebViewWatchVideo
		TotalWebViewWatchVideoValueInMicroDollar
		WebLeadCostPerAction
		WebLeadRoas
		TotalWebLead
		TotalWebLeadValueInMicroDollar
		TotalWebClickLead
		TotalWebClickLeadValueInMicroDollar
		TotalWebEngagementLead
		TotalWebEngagementLeadValueInMicroDollar
		TotalWebViewLead
		TotalWebViewLeadValueInMicroDollar
		OfflineLeadCostPerAction
		OfflineLeadRoas
		TotalOfflineLead
		TotalOfflineLeadValueInMicroDollar
		TotalOfflineClickLead
		TotalOfflineClickLeadValueInMicroDollar
		TotalOfflineEngagementLead
		TotalOfflineEngagementLeadValueInMicroDollar
		TotalOfflineViewLead
		TotalOfflineViewLeadValueInMicroDollar
		WebSearchCostPerAction
		WebSearchRoas
		TotalWebSearch
		TotalWebSearchValueInMicroDollar
		TotalWebClickSearch
		TotalWebClickSearchValueInMicroDollar
		TotalWebEngagementSearch
		TotalWebEngagementSearchValueInMicroDollar
		TotalWebViewSearch
		TotalWebViewSearchValueInMicroDollar
		InappSearchCostPerAction
		InappSearchRoas
		TotalInappSearch
		TotalInappSearchValueInMicroDollar
		TotalInappClickSearch
		TotalInappClickSearchValueInMicroDollar
		TotalInappEngagementSearch
		TotalInappEngagementSearchValueInMicroDollar
		TotalInappViewSearch
		TotalInappViewSearchValueInMicroDollar
		WebViewCategoryCostPerAction
		WebViewCategoryRoas
		TotalWebViewCategory
		TotalWebViewCategoryValueInMicroDollar
		TotalWebClickViewCategory
		TotalWebClickViewCategoryValueInMicroDollar
		TotalWebEngagementViewCategory
		TotalWebEngagementViewCategoryValueInMicroDollar
		TotalWebViewViewCategory
		TotalWebViewViewCategoryValueInMicroDollar
		WebCustomCostPerAction
		WebCustomRoas
		TotalWebCustom
		TotalWebCustomValueInMicroDollar
		TotalWebClickCustom
		TotalWebClickCustomValueInMicroDollar
		TotalWebEngagementCustom
		TotalWebEngagementCustomValueInMicroDollar
		TotalWebViewCustom
		TotalWebViewCustomValueInMicroDollar
		OfflineCustomCostPerAction
		OfflineCustomRoas
		TotalOfflineCustom
		TotalOfflineCustomValueInMicroDollar
		TotalOfflineClickCustom
		TotalOfflineClickCustomValueInMicroDollar
		TotalOfflineEngagementCustom
		TotalOfflineEngagementCustomValueInMicroDollar
		TotalOfflineViewCustom
		TotalOfflineViewCustomValueInMicroDollar
		WebUnknownCostPerAction
		WebUnknownRoas
		TotalWebUnknown
		TotalWebUnknownValueInMicroDollar
		TotalWebClickUnknown
		TotalWebClickUnknownValueInMicroDollar
		TotalWebEngagementUnknown
		TotalWebEngagementUnknownValueInMicroDollar
		TotalWebViewUnknown
		TotalWebViewUnknownValueInMicroDollar
		InappUnknownCostPerAction
		InappUnknownRoas
		TotalInappUnknown
		TotalInappUnknownValueInMicroDollar
		TotalInappClickUnknown
		TotalInappClickUnknownValueInMicroDollar
		TotalInappEngagementUnknown
		TotalInappEngagementUnknownValueInMicroDollar
		TotalInappViewUnknown
		TotalInappViewUnknownValueInMicroDollar
		OfflineUnknownCostPerAction
		OfflineUnknownRoas
		TotalOfflineUnknown
		TotalOfflineUnknownValueInMicroDollar
		TotalOfflineClickUnknown
		TotalOfflineClickUnknownValueInMicroDollar
		TotalOfflineEngagementUnknown
		TotalOfflineEngagementUnknownValueInMicroDollar
		TotalOfflineViewUnknown
		TotalOfflineViewUnknownValueInMicroDollar
		InappAppInstallCostPerAction
		InappAppInstallRoas
		TotalInappAppInstall
		TotalInappAppInstallValueInMicroDollar
		TotalInappClickAppInstall
		TotalInappClickAppInstallValueInMicroDollar
		TotalInappEngagementAppInstall
		TotalInappEngagementAppInstallValueInMicroDollar
		TotalInappViewAppInstall
		TotalInappViewAppInstallValueInMicroDollar
		TotalAppInstallConversionRate
		TotalInappAppInstallConversionRate
		IdeaPinPageForward1
		IdeaPinPageForward2
		IdeaPinPageBackward1
		IdeaPinPageBackward2
		TotalIdeaPinPageForward
		TotalIdeaPinPageBackward
		IdeaPinProductTagVisit1
		IdeaPinProductTagVisit2
		TotalIdeaPinProductTagVisit
		Leads
		CostPerLead
		QuizCompleted
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
		SpendOrderLineId
		InappSkanAppInstall
		InappSkanAssistedAppInstall
		InappSkanAppInstallCostPerAction
		InappSkanAppInstallConversionRate
		
	#tag EndEnum
	#tag Enum, Name = ReportingColumnSync, Type = Integer, Flags = &h1
		
		SpendInMicroDollar
		PaidImpression
		SpendInDollar
		CpcInMicroDollar
		EcpcInMicroDollar
		EcpcInDollar
		Ctr
		Ectr
		OutboundCtr1
		CampaignName
		CampaignBrandLabel
		PinId
		TotalEngagement
		Engagement1
		Engagement2
		EcpeInDollar
		EngagementRate
		EengagementRate
		EcpmInMicroDollar
		RepinRate
		Ctr2
		CampaignId
		AdvertiserId
		AdAccountId
		PinPromotionId
		AdId
		AdGroupId
		CampaignEntityStatus
		CampaignObjectiveType
		CpmInMicroDollar
		CpmInDollar
		AdGroupName
		AdGroupBudgetType
		AdGroupBudgetInLocalCurrency
		AdGroupEntityStatus
		AdGroupBidMultiplier
		PromoId
		PromoName
		OrderLineId
		OrderLineName
		Clickthrough1
		Repin1
		Impression1
		Impression1Gross
		Clickthrough1Gross
		OutboundClick1
		Clickthrough2
		Repin2
		Impression2
		OutboundClick2
		CollectionPinItemImpression1
		CollectionPinItemImpression2
		TotalCollectionPinItemImpression
		CollectionPinItemClickthrough1
		CollectionPinItemClickthrough2
		TotalCollectionPinItemClickthrough
		TotalClickthrough
		TotalImpression
		TotalImpressionUser
		TotalImpressionFrequency
		CostPerOutboundClickInDollar
		CostPerOutboundClickInDollar1
		TotalEngagementSignup
		TotalEngagementCheckout
		TotalEngagementLead
		TotalClickSignup
		TotalClickCheckout
		TotalClickAddToCart
		TotalClickLead
		TotalViewSignup
		TotalViewCheckout
		TotalViewAddToCart
		TotalViewLead
		TotalConversions
		TotalEngagementSignupValueInMicroDollar
		TotalEngagementCheckoutValueInMicroDollar
		TotalClickSignupValueInMicroDollar
		TotalClickCheckoutValueInMicroDollar
		TotalViewSignupValueInMicroDollar
		TotalViewCheckoutValueInMicroDollar
		TotalWebSessions
		WebSessions1
		WebSessions2
		AdName
		CampaignLifetimeSpendCap
		AdGroupOptimization
		CampaignDailySpendCap
		CampaignBudgetOptimization
		IsPremiereCampaign
		TotalPageVisit
		TotalSignup
		TotalCheckout
		TotalCustom
		TotalLead
		TotalAddToWishlist
		TotalSubscribe
		TotalSignupValueInMicroDollar
		TotalCheckoutValueInMicroDollar
		TotalCustomValueInMicroDollar
		PageVisitCostPerAction
		PageVisitRoas
		CheckoutRoas
		CustomRoas
		ProductGroupAdImageTag
		ProductGroupAdVideoTag
		Video3secViews1
		Video15secUniqueViews1
		VideoMrcViews1
		Video3secViews2
		Video15secUniqueViews2
		VideoP100Complete2
		VideoP0Combined2
		VideoP25Combined2
		VideoP50Combined2
		VideoP75Combined2
		VideoP95Combined2
		VideoMrcViews2
		PaidVideoViewableRate
		VideoLength
		VideoSpendInDollar
		EcpvInDollar
		EcpcvInDollar
		EcpcvP95InDollar
		TotalVideo3secViews
		TotalVideo15secUniqueViews
		TotalVideoP100Complete
		TotalVideoP0Combined
		TotalVideoP25Combined
		TotalVideoP50Combined
		TotalVideoP75Combined
		TotalVideoP95Combined
		TotalVideoMrcViews
		TotalVideoAvgWatchtimeInSecond
		TotalRepinRate
		WebCheckoutCostPerAction
		WebCheckoutRoas
		TotalWebCheckout
		TotalWebCheckoutValueInMicroDollar
		TotalWebClickCheckout
		TotalWebClickCheckoutValueInMicroDollar
		TotalWebEngagementCheckout
		TotalWebEngagementCheckoutValueInMicroDollar
		TotalWebViewCheckout
		TotalWebViewCheckoutValueInMicroDollar
		InappCheckoutCostPerAction
		TotalOfflineCheckout
		TotalAppInstallConversionRate
		TotalInappAppInstallConversionRate
		IdeaPinProductTagVisit1
		IdeaPinProductTagVisit2
		TotalIdeaPinProductTagVisit
		Leads
		CostPerLead
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
		InappSkanAppInstall
		InappSkanAssistedAppInstall
		InappSkanAppInstallCostPerAction
		InappSkanAppInstallConversionRate
		
	#tag EndEnum
	#tag Enum, Name = ReportingTimeZone, Type = Integer, Flags = &h1
		
		PinterestTimeZone
		AdAccountTimeZone
		
	#tag EndEnum
	#tag Enum, Name = Role, Type = Integer, Flags = &h1
		
		Unknown
		Owner
		Admin
		Analyst
		SosReader
		FinanceManager
		FinanceEdit
		FinanceView
		AudienceManager
		CampaignManager
		CatalogsManager
		CatalogsViewer
		RestrictedOwner
		ProfileManager
		ProfilePublisher
		ResourcePinnerListOwner
		ResourcePinnerListReader
		BizPinnerListSharer
		ResourceConversionTagsReader
		
	#tag EndEnum
	#tag Enum, Name = SSIOOrderLineType, Type = Integer, Flags = &h1
		
		Budget
		Perpetuals
		
	#tag EndEnum
	#tag Enum, Name = ScheduleAction, Type = Integer, Flags = &h1
		
		IncreaseByValue
		IncreaseByPercent
		
	#tag EndEnum
	#tag Enum, Name = ScheduleStatus, Type = Integer, Flags = &h1
		
		Draft
		Created
		Scheduled
		Active
		Completed
		Failed
		Canceled
		
	#tag EndEnum
	#tag Enum, Name = ScheduleType, Type = Integer, Flags = &h1
		
		CampaignBudgetChange
		CampaignBidMultipliers
		
	#tag EndEnum
	#tag Enum, Name = SourcePlatformOptions, Type = Integer, Flags = &h1
		
		Web
		Mobile
		MobileAndroid
		MobileIos
		Offline
		PinterestWeb
		PinterestAndroid
		PinterestIos
		PointOfSale
		
	#tag EndEnum
	#tag Enum, Name = StandardPinMetricTypes, Type = Integer, Flags = &h1
		
		Impression
		OutboundClick
		PinClick
		Save
		SaveRate
		TotalComments
		TotalReactions
		UserFollow
		ProfileVisit
		
	#tag EndEnum
	#tag Enum, Name = SummaryStatus, Type = Integer, Flags = &h1
		
		Running
		Paused
		NotStarted
		Completed
		AdvertiserDisabled
		Archived
		Draft
		DeletedDraft
		
	#tag EndEnum
	#tag Enum, Name = SupplementalItemBatchOperationStatus, Type = Integer, Flags = &h1
		
		Processing
		Completed
		Failed
		
	#tag EndEnum
	#tag Enum, Name = SupplementalItemProcessingStatus, Type = Integer, Flags = &h1
		
		Success
		Failure
		Processing
		
	#tag EndEnum
	#tag Enum, Name = TargetingAdvertiserCountry, Type = Integer, Flags = &h1
		
		Us
		Gb
		Ca
		Ie
		Au
		Nz
		Fr
		Se
		Il
		De
		At
		It
		Es
		Nl
		Be
		Pt
		Ch
		Hk
		Jp
		Kr
		Sg
		Escapedfalse
		Dk
		Fi
		Cy
		Lu
		Mt
		Pl
		Ro
		Hu
		Cz
		Gr
		Sk
		Br
		Mx
		Ar
		Cl
		Co
		
	#tag EndEnum
	#tag Enum, Name = TargetingSpecAgeBucket, Type = Integer, Flags = &h1
		
		Escaped1824
		Escaped19Plus
		Escaped20Plus
		Escaped21Plus
		Escaped2534
		Escaped3544
		Escaped4549
		Escaped5054
		Escaped5564
		Escaped65Plus
		
	#tag EndEnum
	#tag Enum, Name = TargetingSpecAppType, Type = Integer, Flags = &h1
		
		AndroidMobile
		AndroidTablet
		Ipad
		Iphone
		Web
		WebMobile
		
	#tag EndEnum
	#tag Enum, Name = TargetingSpecGender, Type = Integer, Flags = &h1
		
		Unknown
		Male
		Female
		
	#tag EndEnum
	#tag Enum, Name = TargetingSpecListOperation, Type = Integer, Flags = &h1
		
		Set
		Add
		Remove
		
	#tag EndEnum
	#tag Enum, Name = TargetingSpecTargetingStrategyItems, Type = Integer, Flags = &h1
		
		ChooseYourOwn
		FindNewCustomers
		ReconnectWithUsers
		
	#tag EndEnum
	#tag Enum, Name = TargetingStrategy, Type = Integer, Flags = &h1
		
		ChooseYourOwn
		FindNewCustomers
		ReconnectWithUsers
		
	#tag EndEnum
	#tag Enum, Name = TargetingTemplateStatus, Type = Integer, Flags = &h1
		
		Active
		Deleted
		
	#tag EndEnum
	#tag Enum, Name = TieBreakerType, Type = Integer, Flags = &h1
		
		Random
		Custom
		
	#tag EndEnum
	#tag Enum, Name = TokenGrantType, Type = Integer, Flags = &h1
		
		AuthorizationCode
		RefreshToken
		ClientCredentials
		
	#tag EndEnum
	#tag Enum, Name = TokenTypeHint, Type = Integer, Flags = &h1
		
		AccessToken
		RefreshToken
		
	#tag EndEnum
	#tag Enum, Name = TopPinsSortBy, Type = Integer, Flags = &h1
		
		Engagement
		Save
		Impression
		OutboundClick
		PinClick
		
	#tag EndEnum
	#tag Enum, Name = TopVideoPinsSortBy, Type = Integer, Flags = &h1
		
		Save
		Impression
		OutboundClick
		VideoMrcView
		VideoAvgWatchTime
		VideoV50WatchTime
		Quartile95PercentView
		Video10sView
		VideoStart
		
	#tag EndEnum
	#tag Enum, Name = TrendType, Type = Integer, Flags = &h1
		
		Growing
		Monthly
		Yearly
		Seasonal
		
	#tag EndEnum
	#tag Enum, Name = TrendsAgeBucket, Type = Integer, Flags = &h1
		
		Escaped1824
		Escaped2534
		Escaped3544
		Escaped4549
		Escaped5054
		Escaped5564
		Escaped65Plus
		
	#tag EndEnum
	#tag Enum, Name = TrendsGender, Type = Integer, Flags = &h1
		
		Male
		Female
		Unspecified
		
	#tag EndEnum
	#tag Enum, Name = TrendsGenderFilter, Type = Integer, Flags = &h1
		
		Male
		Female
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = TrendsL1Interest, Type = Integer, Flags = &h1
		
		Animals
		Architecture
		Art
		Beauty
		ChildrensFashion
		Design
		DiyAndCrafts
		Education
		Electronics
		Entertainment
		EventPlanning
		Finance
		FoodAndDrinks
		Gardening
		Health
		HomeDecor
		MensFashion
		Parenting
		Quotes
		Sport
		Travel
		Vehicles
		Wedding
		WomensFashion
		
	#tag EndEnum
	#tag Enum, Name = TrendsSupportedRegion, Type = Integer, Flags = &h1
		
		Us
		Ca
		De
		Fr
		Es
		It
		DePlusAtPlusCh
		GbPlusIe
		ItPlusEsPlusPtPlusGrPlusMt
		PlPlusRoPlusHuPlusSkPlusCz
		SePlusDkPlusFiPlusNo
		NlPlusBePlusLu
		Ar
		Br
		Co
		Mx
		MxPlusArPlusCoPlusCl
		AuPlusNz
		
	#tag EndEnum
	#tag Enum, Name = UpdateMaskBidOptionField, Type = Integer, Flags = &h1
		
		Bid
		AppTypeBidMultiplierSet
		PlacementBidMultiplierSet
		
	#tag EndEnum
	#tag Enum, Name = UpdateMaskFieldType, Type = Integer, Flags = &h1
		
		AdLink
		Adult
		AgeGroup
		Availability
		AverageReviewRating
		Brand
		CheckoutEnabled
		Color
		Condition
		CustomLabel0
		CustomLabel1
		CustomLabel2
		CustomLabel3
		CustomLabel4
		CustomNumber0
		CustomNumber1
		CustomNumber2
		CustomNumber3
		CustomNumber4
		Description
		FreeShippingLabel
		FreeShippingLimit
		Gender
		GoogleProductCategory
		Gtin
		ItemGroupId
		LastUpdatedTime
		Link
		Material
		MinAdPrice
		Mpn
		NumberOfRatings
		NumberOfReviews
		Pattern
		Price
		ProductType
		SalePrice
		Shipping
		ShippingHeight
		ShippingWeight
		ShippingWidth
		Size
		SizeSystem
		SizeType
		Tax
		Title
		VariantNames
		VariantValues
		PromotionId
		
	#tag EndEnum
	#tag Enum, Name = UserAccountType, Type = Integer, Flags = &h1
		
		Pinner
		Business
		
	#tag EndEnum
	#tag Enum, Name = UserFollowingFeedType, Type = Integer, Flags = &h1
		
		All
		Ranked
		CreatorOnly
		RankedCreatorOnly
		
	#tag EndEnum
	#tag Enum, Name = UserListOperationType, Type = Integer, Flags = &h1
		
		Add
		Remove
		
	#tag EndEnum
	#tag Enum, Name = UserListType, Type = Integer, Flags = &h1
		
		Email
		Idfa
		Maid
		LrId
		DlxId
		HashedPinnerId
		
	#tag EndEnum
	#tag Enum, Name = VerticalProductCategory, Type = Integer, Flags = &h1
		
		Fashion
		HomeDecor
		Beauty
		
	#tag EndEnum
	#tag Enum, Name = VideoPinMetricTypes, Type = Integer, Flags = &h1
		
		Impression
		OutboundClick
		PinClick
		Save
		SaveRate
		VideoMrcView
		Video10sView
		Quartile95PercentView
		VideoV50WatchTime
		VideoStart
		VideoAvgWatchTime
		TotalComments
		TotalReactions
		
	#tag EndEnum
	#tag Enum, Name = WebsiteVerificationMethod, Type = Integer, Flags = &h1
		
		Filename
		Metatag
		Dnstxt
		
	#tag EndEnum
	#tag Enum, Name = WorkloadState, Type = Integer, Flags = &h1
		
		NotStarted
		Running
		Paused
		Succeeded
		Failed
		
	#tag EndEnum


	#tag ViewBehavior
		#tag ViewProperty
			Name="Name"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
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
	#tag EndViewBehavior
End Module
#tag EndModule
