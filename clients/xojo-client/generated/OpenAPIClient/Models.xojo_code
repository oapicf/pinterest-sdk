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
		Protected Function AdCountryToString(value As AdCountry) As String
		  Select Case value
		    Case AdCountry.Ad
		      Return "AD"
		    Case AdCountry.Ae
		      Return "AE"
		    Case AdCountry.Af
		      Return "AF"
		    Case AdCountry.Ag
		      Return "AG"
		    Case AdCountry.Ai
		      Return "AI"
		    Case AdCountry.Al
		      Return "AL"
		    Case AdCountry.Am
		      Return "AM"
		    Case AdCountry.Ao
		      Return "AO"
		    Case AdCountry.Aq
		      Return "AQ"
		    Case AdCountry.Ar
		      Return "AR"
		    Case AdCountry.Escapedas
		      Return "AS"
		    Case AdCountry.At
		      Return "AT"
		    Case AdCountry.Au
		      Return "AU"
		    Case AdCountry.Aw
		      Return "AW"
		    Case AdCountry.Ax
		      Return "AX"
		    Case AdCountry.Az
		      Return "AZ"
		    Case AdCountry.Ba
		      Return "BA"
		    Case AdCountry.Bb
		      Return "BB"
		    Case AdCountry.Bd
		      Return "BD"
		    Case AdCountry.Be
		      Return "BE"
		    Case AdCountry.Bf
		      Return "BF"
		    Case AdCountry.Bg
		      Return "BG"
		    Case AdCountry.Bh
		      Return "BH"
		    Case AdCountry.Bi
		      Return "BI"
		    Case AdCountry.Bj
		      Return "BJ"
		    Case AdCountry.Bl
		      Return "BL"
		    Case AdCountry.Bm
		      Return "BM"
		    Case AdCountry.Bn
		      Return "BN"
		    Case AdCountry.Bo
		      Return "BO"
		    Case AdCountry.Bq
		      Return "BQ"
		    Case AdCountry.Br
		      Return "BR"
		    Case AdCountry.Bs
		      Return "BS"
		    Case AdCountry.Bt
		      Return "BT"
		    Case AdCountry.Bv
		      Return "BV"
		    Case AdCountry.Bw
		      Return "BW"
		    Case AdCountry.By
		      Return "BY"
		    Case AdCountry.Bz
		      Return "BZ"
		    Case AdCountry.Ca
		      Return "CA"
		    Case AdCountry.Cc
		      Return "CC"
		    Case AdCountry.Cd
		      Return "CD"
		    Case AdCountry.Cf
		      Return "CF"
		    Case AdCountry.Cg
		      Return "CG"
		    Case AdCountry.Ch
		      Return "CH"
		    Case AdCountry.Ci
		      Return "CI"
		    Case AdCountry.Ck
		      Return "CK"
		    Case AdCountry.Cl
		      Return "CL"
		    Case AdCountry.Cm
		      Return "CM"
		    Case AdCountry.Cn
		      Return "CN"
		    Case AdCountry.Co
		      Return "CO"
		    Case AdCountry.Cr
		      Return "CR"
		    Case AdCountry.Cu
		      Return "CU"
		    Case AdCountry.Cv
		      Return "CV"
		    Case AdCountry.Cw
		      Return "CW"
		    Case AdCountry.Cx
		      Return "CX"
		    Case AdCountry.Cy
		      Return "CY"
		    Case AdCountry.Cz
		      Return "CZ"
		    Case AdCountry.De
		      Return "DE"
		    Case AdCountry.Dj
		      Return "DJ"
		    Case AdCountry.Dk
		      Return "DK"
		    Case AdCountry.Dm
		      Return "DM"
		    Case AdCountry.Escapeddo
		      Return "DO"
		    Case AdCountry.Dz
		      Return "DZ"
		    Case AdCountry.Ec
		      Return "EC"
		    Case AdCountry.Ee
		      Return "EE"
		    Case AdCountry.Eg
		      Return "EG"
		    Case AdCountry.Eh
		      Return "EH"
		    Case AdCountry.Er
		      Return "ER"
		    Case AdCountry.Es
		      Return "ES"
		    Case AdCountry.Et
		      Return "ET"
		    Case AdCountry.Fi
		      Return "FI"
		    Case AdCountry.Fj
		      Return "FJ"
		    Case AdCountry.Fk
		      Return "FK"
		    Case AdCountry.Fm
		      Return "FM"
		    Case AdCountry.Fo
		      Return "FO"
		    Case AdCountry.Fr
		      Return "FR"
		    Case AdCountry.Ga
		      Return "GA"
		    Case AdCountry.Gb
		      Return "GB"
		    Case AdCountry.Gd
		      Return "GD"
		    Case AdCountry.Ge
		      Return "GE"
		    Case AdCountry.Gf
		      Return "GF"
		    Case AdCountry.Gg
		      Return "GG"
		    Case AdCountry.Gh
		      Return "GH"
		    Case AdCountry.Gi
		      Return "GI"
		    Case AdCountry.Gl
		      Return "GL"
		    Case AdCountry.Gm
		      Return "GM"
		    Case AdCountry.Gn
		      Return "GN"
		    Case AdCountry.Gp
		      Return "GP"
		    Case AdCountry.Gq
		      Return "GQ"
		    Case AdCountry.Gr
		      Return "GR"
		    Case AdCountry.Gs
		      Return "GS"
		    Case AdCountry.Gt
		      Return "GT"
		    Case AdCountry.Gu
		      Return "GU"
		    Case AdCountry.Gw
		      Return "GW"
		    Case AdCountry.Gy
		      Return "GY"
		    Case AdCountry.Hk
		      Return "HK"
		    Case AdCountry.Hm
		      Return "HM"
		    Case AdCountry.Hn
		      Return "HN"
		    Case AdCountry.Hr
		      Return "HR"
		    Case AdCountry.Ht
		      Return "HT"
		    Case AdCountry.Hu
		      Return "HU"
		    Case AdCountry.Id
		      Return "ID"
		    Case AdCountry.Ie
		      Return "IE"
		    Case AdCountry.Il
		      Return "IL"
		    Case AdCountry.Im
		      Return "IM"
		    Case AdCountry.Escapedin
		      Return "IN"
		    Case AdCountry.Io
		      Return "IO"
		    Case AdCountry.Iq
		      Return "IQ"
		    Case AdCountry.Ir
		      Return "IR"
		    Case AdCountry.Escapedis
		      Return "IS"
		    Case AdCountry.It
		      Return "IT"
		    Case AdCountry.Je
		      Return "JE"
		    Case AdCountry.Jm
		      Return "JM"
		    Case AdCountry.Jo
		      Return "JO"
		    Case AdCountry.Jp
		      Return "JP"
		    Case AdCountry.Ke
		      Return "KE"
		    Case AdCountry.Kg
		      Return "KG"
		    Case AdCountry.Kh
		      Return "KH"
		    Case AdCountry.Ki
		      Return "KI"
		    Case AdCountry.Km
		      Return "KM"
		    Case AdCountry.Kn
		      Return "KN"
		    Case AdCountry.Kr
		      Return "KR"
		    Case AdCountry.Kw
		      Return "KW"
		    Case AdCountry.Ky
		      Return "KY"
		    Case AdCountry.Kz
		      Return "KZ"
		    Case AdCountry.La
		      Return "LA"
		    Case AdCountry.Lb
		      Return "LB"
		    Case AdCountry.Lc
		      Return "LC"
		    Case AdCountry.Li
		      Return "LI"
		    Case AdCountry.Lk
		      Return "LK"
		    Case AdCountry.Lr
		      Return "LR"
		    Case AdCountry.Ls
		      Return "LS"
		    Case AdCountry.Lt
		      Return "LT"
		    Case AdCountry.Lu
		      Return "LU"
		    Case AdCountry.Lv
		      Return "LV"
		    Case AdCountry.Ly
		      Return "LY"
		    Case AdCountry.Ma
		      Return "MA"
		    Case AdCountry.Mc
		      Return "MC"
		    Case AdCountry.Md
		      Return "MD"
		    Case AdCountry.Escapedme
		      Return "ME"
		    Case AdCountry.Mf
		      Return "MF"
		    Case AdCountry.Mg
		      Return "MG"
		    Case AdCountry.Mh
		      Return "MH"
		    Case AdCountry.Mk
		      Return "MK"
		    Case AdCountry.Ml
		      Return "ML"
		    Case AdCountry.Mm
		      Return "MM"
		    Case AdCountry.Mn
		      Return "MN"
		    Case AdCountry.Mo
		      Return "MO"
		    Case AdCountry.Mp
		      Return "MP"
		    Case AdCountry.Mq
		      Return "MQ"
		    Case AdCountry.Mr
		      Return "MR"
		    Case AdCountry.Ms
		      Return "MS"
		    Case AdCountry.Mt
		      Return "MT"
		    Case AdCountry.Mu
		      Return "MU"
		    Case AdCountry.Mv
		      Return "MV"
		    Case AdCountry.Mw
		      Return "MW"
		    Case AdCountry.Mx
		      Return "MX"
		    Case AdCountry.My
		      Return "MY"
		    Case AdCountry.Mz
		      Return "MZ"
		    Case AdCountry.Na
		      Return "NA"
		    Case AdCountry.Nc
		      Return "NC"
		    Case AdCountry.Ne
		      Return "NE"
		    Case AdCountry.Nf
		      Return "NF"
		    Case AdCountry.Ng
		      Return "NG"
		    Case AdCountry.Ni
		      Return "NI"
		    Case AdCountry.Nl
		      Return "NL"
		    Case AdCountry.No
		      Return "NO"
		    Case AdCountry.Np
		      Return "NP"
		    Case AdCountry.Nr
		      Return "NR"
		    Case AdCountry.Nu
		      Return "NU"
		    Case AdCountry.Nz
		      Return "NZ"
		    Case AdCountry.Om
		      Return "OM"
		    Case AdCountry.Pa
		      Return "PA"
		    Case AdCountry.Pe
		      Return "PE"
		    Case AdCountry.Pf
		      Return "PF"
		    Case AdCountry.Pg
		      Return "PG"
		    Case AdCountry.Ph
		      Return "PH"
		    Case AdCountry.Pk
		      Return "PK"
		    Case AdCountry.Pl
		      Return "PL"
		    Case AdCountry.Pm
		      Return "PM"
		    Case AdCountry.Pn
		      Return "PN"
		    Case AdCountry.Pr
		      Return "PR"
		    Case AdCountry.Ps
		      Return "PS"
		    Case AdCountry.Pt
		      Return "PT"
		    Case AdCountry.Pw
		      Return "PW"
		    Case AdCountry.Py
		      Return "PY"
		    Case AdCountry.Qa
		      Return "QA"
		    Case AdCountry.Re
		      Return "RE"
		    Case AdCountry.Ro
		      Return "RO"
		    Case AdCountry.Rs
		      Return "RS"
		    Case AdCountry.Ru
		      Return "RU"
		    Case AdCountry.Rw
		      Return "RW"
		    Case AdCountry.Sa
		      Return "SA"
		    Case AdCountry.Sb
		      Return "SB"
		    Case AdCountry.Sc
		      Return "SC"
		    Case AdCountry.Sd
		      Return "SD"
		    Case AdCountry.Se
		      Return "SE"
		    Case AdCountry.Sg
		      Return "SG"
		    Case AdCountry.Sh
		      Return "SH"
		    Case AdCountry.Si
		      Return "SI"
		    Case AdCountry.Sj
		      Return "SJ"
		    Case AdCountry.Sk
		      Return "SK"
		    Case AdCountry.Sl
		      Return "SL"
		    Case AdCountry.Sm
		      Return "SM"
		    Case AdCountry.Sn
		      Return "SN"
		    Case AdCountry.So
		      Return "SO"
		    Case AdCountry.Sr
		      Return "SR"
		    Case AdCountry.Ss
		      Return "SS"
		    Case AdCountry.St
		      Return "ST"
		    Case AdCountry.Sv
		      Return "SV"
		    Case AdCountry.Sx
		      Return "SX"
		    Case AdCountry.Sy
		      Return "SY"
		    Case AdCountry.Sz
		      Return "SZ"
		    Case AdCountry.Tc
		      Return "TC"
		    Case AdCountry.Td
		      Return "TD"
		    Case AdCountry.Tf
		      Return "TF"
		    Case AdCountry.Tg
		      Return "TG"
		    Case AdCountry.Th
		      Return "TH"
		    Case AdCountry.Tj
		      Return "TJ"
		    Case AdCountry.Tk
		      Return "TK"
		    Case AdCountry.Tl
		      Return "TL"
		    Case AdCountry.Tm
		      Return "TM"
		    Case AdCountry.Tn
		      Return "TN"
		    Case AdCountry.Escapedto
		      Return "TO"
		    Case AdCountry.Tr
		      Return "TR"
		    Case AdCountry.Tt
		      Return "TT"
		    Case AdCountry.Tv
		      Return "TV"
		    Case AdCountry.Tw
		      Return "TW"
		    Case AdCountry.Tz
		      Return "TZ"
		    Case AdCountry.Ua
		      Return "UA"
		    Case AdCountry.Ug
		      Return "UG"
		    Case AdCountry.Um
		      Return "UM"
		    Case AdCountry.Us
		      Return "US"
		    Case AdCountry.Uy
		      Return "UY"
		    Case AdCountry.Uz
		      Return "UZ"
		    Case AdCountry.Va
		      Return "VA"
		    Case AdCountry.Vc
		      Return "VC"
		    Case AdCountry.Ve
		      Return "VE"
		    Case AdCountry.Vg
		      Return "VG"
		    Case AdCountry.Vi
		      Return "VI"
		    Case AdCountry.Vn
		      Return "VN"
		    Case AdCountry.Vu
		      Return "VU"
		    Case AdCountry.Wf
		      Return "WF"
		    Case AdCountry.Ws
		      Return "WS"
		    Case AdCountry.Ye
		      Return "YE"
		    Case AdCountry.Yt
		      Return "YT"
		    Case AdCountry.Za
		      Return "ZA"
		    Case AdCountry.Zm
		      Return "ZM"
		    Case AdCountry.Zw
		      Return "ZW"
		    
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
		Protected Function AdsAnalyticsTargetingTypeToString(value As AdsAnalyticsTargetingType) As String
		  Select Case value
		    Case AdsAnalyticsTargetingType.Keyword
		      Return "KEYWORD"
		    Case AdsAnalyticsTargetingType.Apptype
		      Return "APPTYPE"
		    Case AdsAnalyticsTargetingType.Gender
		      Return "GENDER"
		    Case AdsAnalyticsTargetingType.Location
		      Return "LOCATION"
		    Case AdsAnalyticsTargetingType.Placement
		      Return "PLACEMENT"
		    Case AdsAnalyticsTargetingType.Country
		      Return "COUNTRY"
		    Case AdsAnalyticsTargetingType.TargetedInterest
		      Return "TARGETED_INTEREST"
		    Case AdsAnalyticsTargetingType.PinnerInterest
		      Return "PINNER_INTEREST"
		    Case AdsAnalyticsTargetingType.AudienceInclude
		      Return "AUDIENCE_INCLUDE"
		    Case AdsAnalyticsTargetingType.Geo
		      Return "GEO"
		    Case AdsAnalyticsTargetingType.AgeBucket
		      Return "AGE_BUCKET"
		    Case AdsAnalyticsTargetingType.Region
		      Return "REGION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AudienceDataPartyToString(value As AudienceDataParty) As String
		  Select Case value
		    Case AudienceDataParty.Escaped1p
		      Return "1p"
		    Case AudienceDataParty.Escaped3p
		      Return "3p"
		    
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
		Protected Function AudienceSharingTypeToString(value As AudienceSharingType) As String
		  Select Case value
		    Case AudienceSharingType.Custom
		      Return "CUSTOM"
		    Case AudienceSharingType.Syndicated
		      Return "SYNDICATED"
		    
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
		Protected Function BatchOperationToString(value As BatchOperation) As String
		  Select Case value
		    Case BatchOperation.Update
		      Return "UPDATE"
		    Case BatchOperation.Upsert
		      Return "UPSERT"
		    Case BatchOperation.Create
		      Return "CREATE"
		    Case BatchOperation.DeleteDiscontinued
		      Return "DELETE_DISCONTINUED"
		    Case BatchOperation.Delete
		      Return "DELETE"
		    
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
		Protected Function BulkUpsertStatusToString(value As BulkUpsertStatus) As String
		  Select Case value
		    Case BulkUpsertStatus.Running
		      Return "RUNNING"
		    Case BulkUpsertStatus.Succeeded
		      Return "SUCCEEDED"
		    Case BulkUpsertStatus.Failed
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
		Protected Function CatalogsFeedProcessingStatusToString(value As CatalogsFeedProcessingStatus) As String
		  Select Case value
		    Case CatalogsFeedProcessingStatus.Completed
		      Return "COMPLETED"
		    Case CatalogsFeedProcessingStatus.CompletedEarly
		      Return "COMPLETED_EARLY"
		    Case CatalogsFeedProcessingStatus.Disapproved
		      Return "DISAPPROVED"
		    Case CatalogsFeedProcessingStatus.Failed
		      Return "FAILED"
		    Case CatalogsFeedProcessingStatus.Processing
		      Return "PROCESSING"
		    Case CatalogsFeedProcessingStatus.QueuedForProcessing
		      Return "QUEUED_FOR_PROCESSING"
		    Case CatalogsFeedProcessingStatus.UnderAppeal
		      Return "UNDER_APPEAL"
		    Case CatalogsFeedProcessingStatus.UnderReview
		      Return "UNDER_REVIEW"
		    
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
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CatalogsItemValidationIssueToString(value As CatalogsItemValidationIssue) As String
		  Select Case value
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
		    Case ConversionReportTimeType.AdAction
		      Return "TIME_OF_AD_ACTION"
		    Case ConversionReportTimeType.Conversion
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
		    Case Country.No
		      Return "NO"
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
		    Case EnhancedMatchStatusType.Null
		      Return "null"
		    
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
		Protected Function GetAudiencesOrderByToString(value As GetAudiencesOrderBy) As String
		  Select Case value
		    Case GetAudiencesOrderBy.None
		      Return "NONE"
		    Case GetAudiencesOrderBy.Id
		      Return "ID"
		    Case GetAudiencesOrderBy.Size
		      Return "SIZE"
		    Case GetAudiencesOrderBy.CreationDate
		      Return "CREATION_DATE"
		    Case GetAudiencesOrderBy.UpdatedTime
		      Return "UPDATED_TIME"
		    Case GetAudiencesOrderBy.Name
		      Return "NAME"
		    Case GetAudiencesOrderBy.Status
		      Return "STATUS"
		    Case GetAudiencesOrderBy.Type
		      Return "TYPE"
		    
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
		    Case Language.No
		      Return "NO"
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
		    Case LeadFormQuestionFieldType.Null
		      Return "null"
		    
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
		    Case LeadFormQuestionType.Age
		      Return "AGE"
		    Case LeadFormQuestionType.Gender
		      Return "GENDER"
		    Case LeadFormQuestionType.City
		      Return "CITY"
		    Case LeadFormQuestionType.Country
		      Return "COUNTRY"
		    Case LeadFormQuestionType.PreferredContactMethod
		      Return "PREFERRED_CONTACT_METHOD"
		    Case LeadFormQuestionType.StateProvince
		      Return "STATE_PROVINCE"
		    Case LeadFormQuestionType.Address
		      Return "ADDRESS"
		    Case LeadFormQuestionType.DateOfBirth
		      Return "DATE_OF_BIRTH"
		    
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
		    Case MatchTypeResponse.Null
		      Return "null"
		    
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
		Protected Function NonNullableProductAvailabilityTypeToString(value As NonNullableProductAvailabilityType) As String
		  Select Case value
		    Case NonNullableProductAvailabilityType.InStock
		      Return "IN_STOCK"
		    Case NonNullableProductAvailabilityType.OutOfStock
		      Return "OUT_OF_STOCK"
		    Case NonNullableProductAvailabilityType.Preorder
		      Return "PREORDER"
		    
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
		    Case NullableCatalogsItemFieldType.SalePriceEffectiveDate
		      Return "SALE_PRICE_EFFECTIVE_DATE"
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
		    Case NullableCatalogsItemFieldType.Null
		      Return "null"
		    
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
		    Case NullableCurrency.Null
		      Return "null"
		    
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
		    Case ObjectiveType.VideoView
		      Return "VIDEO_VIEW"
		    Case ObjectiveType.WebConversion
		      Return "WEB_CONVERSION"
		    Case ObjectiveType.CatalogSales
		      Return "CATALOG_SALES"
		    Case ObjectiveType.WebSessions
		      Return "WEB_SESSIONS"
		    
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
		    Case OrderLinePaidType.Null
		      Return "null"
		    
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
		Protected Function ProductAvailabilityTypeToString(value As ProductAvailabilityType) As String
		  Select Case value
		    Case ProductAvailabilityType.InStock
		      Return "IN_STOCK"
		    Case ProductAvailabilityType.OutOfStock
		      Return "OUT_OF_STOCK"
		    Case ProductAvailabilityType.Preorder
		      Return "PREORDER"
		    Case ProductAvailabilityType.Null
		      Return "null"
		    
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
		Protected Function ReportingColumnAsyncToString(value As ReportingColumnAsync) As String
		  Select Case value
		    Case ReportingColumnAsync.SpendInMicroDollar
		      Return "SPEND_IN_MICRO_DOLLAR"
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
		    Case ReportingColumnAsync.CostPerOutboundClick
		      Return "COST_PER_OUTBOUND_CLICK"
		    Case ReportingColumnAsync.CampaignName
		      Return "CAMPAIGN_NAME"
		    Case ReportingColumnAsync.CampaignStatus
		      Return "CAMPAIGN_STATUS"
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
		    Case ReportingColumnAsync.AdGroupEntityStatus
		      Return "AD_GROUP_ENTITY_STATUS"
		    Case ReportingColumnAsync.ProductGroupId
		      Return "PRODUCT_GROUP_ID"
		    Case ReportingColumnAsync.ProductGroupStatus
		      Return "PRODUCT_GROUP_STATUS"
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
		    Case ReportingColumnAsync.CampaignDailySpendCap
		      Return "CAMPAIGN_DAILY_SPEND_CAP"
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
		    Case ReportingColumnAsync.TotalLead
		      Return "TOTAL_LEAD"
		    Case ReportingColumnAsync.TotalAppInstall
		      Return "TOTAL_APP_INSTALL"
		    Case ReportingColumnAsync.TotalSignupValueInMicroDollar
		      Return "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalCheckoutValueInMicroDollar
		      Return "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR"
		    Case ReportingColumnAsync.TotalCustomValueInMicroDollar
		      Return "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR"
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
		    Case ReportingColumnAsync.Video3secViews1
		      Return "VIDEO_3SEC_VIEWS_1"
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
		    Case ReportingColumnAsync.VideoLength
		      Return "VIDEO_LENGTH"
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
		    Case Role.AudienceManager
		      Return "AUDIENCE_MANAGER"
		    Case Role.CampaignManager
		      Return "CAMPAIGN_MANAGER"
		    Case Role.CatalogsManager
		      Return "CATALOGS_MANAGER"
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
		    Case TargetingAdvertiserCountry.No
		      Return "NO"
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


	#tag Enum, Name = ActionType, Type = Integer, Flags = &h1
		
		Clickthrough
		Impression
		VideoV50Mrc
		
	#tag EndEnum
	#tag Enum, Name = AdCountry, Type = Integer, Flags = &h1
		
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
		No
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
	#tag Enum, Name = AdsAnalyticsFilterColumn, Type = Integer, Flags = &h1
		
		SpendInDollar
		TotalImpression
		
	#tag EndEnum
	#tag Enum, Name = AdsAnalyticsFilterOperator, Type = Integer, Flags = &h1
		
		LessThan
		GreaterThan
		
	#tag EndEnum
	#tag Enum, Name = AdsAnalyticsTargetingType, Type = Integer, Flags = &h1
		
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
		
	#tag EndEnum
	#tag Enum, Name = AudienceDataParty, Type = Integer, Flags = &h1
		
		Escaped1p
		Escaped3p
		
	#tag EndEnum
	#tag Enum, Name = AudienceInsightType, Type = Integer, Flags = &h1
		
		YourTotalAudience
		YourEngagedAudience
		PinterestTotalAudience
		
	#tag EndEnum
	#tag Enum, Name = AudienceSharingType, Type = Integer, Flags = &h1
		
		Custom
		Syndicated
		
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
	#tag Enum, Name = BatchOperation, Type = Integer, Flags = &h1
		
		Update
		Upsert
		Create
		DeleteDiscontinued
		Delete
		
	#tag EndEnum
	#tag Enum, Name = BatchOperationStatus, Type = Integer, Flags = &h1
		
		Processing
		Completed
		
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
	#tag Enum, Name = BulkUpsertStatus, Type = Integer, Flags = &h1
		
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
	#tag Enum, Name = CatalogsFeedProcessingStatus, Type = Integer, Flags = &h1
		
		Completed
		CompletedEarly
		Disapproved
		Failed
		Processing
		QueuedForProcessing
		UnderAppeal
		UnderReview
		
	#tag EndEnum
	#tag Enum, Name = CatalogsFormat, Type = Integer, Flags = &h1
		
		Tsv
		Csv
		Xml
		
	#tag EndEnum
	#tag Enum, Name = CatalogsItemValidationIssue, Type = Integer, Flags = &h1
		
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
		
	#tag EndEnum
	#tag Enum, Name = CatalogsStatus, Type = Integer, Flags = &h1
		
		Active
		Inactive
		
	#tag EndEnum
	#tag Enum, Name = CatalogsType, Type = Integer, Flags = &h1
		
		Retail
		Hotel
		
	#tag EndEnum
	#tag Enum, Name = ConversionAttributionWindowDays, Type = Integer, Flags = &h1
		
		Escaped0 = "0"
		Escaped1 = "1"
		Escaped7 = "7"
		Escaped14 = "14"
		Escaped30 = "30"
		Escaped60 = "60"
		
	#tag EndEnum
	#tag Enum, Name = ConversionReportAttributionType, Type = Integer, Flags = &h1
		
		Individual
		Household
		
	#tag EndEnum
	#tag Enum, Name = ConversionReportTimeType, Type = Integer, Flags = &h1
		
		AdAction
		Conversion
		
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
		No
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
	#tag Enum, Name = EnhancedMatchStatusType, Type = Integer, Flags = &h1
		
		Unknown
		NotValidated
		ValidatingInProgress
		ValidationComplete
		Null
		
	#tag EndEnum
	#tag Enum, Name = EntityStatus, Type = Integer, Flags = &h1
		
		Active
		Paused
		Archived
		Draft
		DeletedDraft
		
	#tag EndEnum
	#tag Enum, Name = Gender, Type = Integer, Flags = &h1
		
		Female
		Male
		Unisex
		
	#tag EndEnum
	#tag Enum, Name = GetAudiencesOrderBy, Type = Integer, Flags = &h1
		
		None
		Id
		Size
		CreationDate
		UpdatedTime
		Name
		Status
		Type
		
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
	#tag Enum, Name = ItemProcessingStatus, Type = Integer, Flags = &h1
		
		Success
		Failure
		Processing
		
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
		No
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
		Null
		
	#tag EndEnum
	#tag Enum, Name = LeadFormQuestionType, Type = Integer, Flags = &h1
		
		Custom
		FullName
		FirstName
		LastName
		Email
		PhoneNumber
		ZipCode
		Age
		Gender
		City
		Country
		PreferredContactMethod
		StateProvince
		Address
		DateOfBirth
		
	#tag EndEnum
	#tag Enum, Name = LeadFormStatus, Type = Integer, Flags = &h1
		
		Draft
		Active
		
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
		
	#tag EndEnum
	#tag Enum, Name = MMMReportingTargetingType, Type = Integer, Flags = &h1
		
		Apptype
		Country
		CreativeType
		Gender
		Location
		
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
		Null
		
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
	#tag Enum, Name = NonNullableProductAvailabilityType, Type = Integer, Flags = &h1
		
		InStock
		OutOfStock
		Preorder
		
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
		SalePriceEffectiveDate
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
		Null
		
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
		Null
		
	#tag EndEnum
	#tag Enum, Name = ObjectiveType, Type = Integer, Flags = &h1
		
		Awareness
		Consideration
		VideoView
		WebConversion
		CatalogSales
		WebSessions
		
	#tag EndEnum
	#tag Enum, Name = OrderLinePaidType, Type = Integer, Flags = &h1
		
		Paid
		Bonus
		MakeGood
		Test
		Null
		
	#tag EndEnum
	#tag Enum, Name = OrderLineStatus, Type = Integer, Flags = &h1
		
		Active
		Paused
		Deleted
		
	#tag EndEnum
	#tag Enum, Name = PacingDeliveryType, Type = Integer, Flags = &h1
		
		Standard
		Accelerated
		
	#tag EndEnum
	#tag Enum, Name = PartnerType, Type = Integer, Flags = &h1
		
		Internal
		External
		
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
	#tag Enum, Name = PlacementGroupType, Type = Integer, Flags = &h1
		
		All
		Search
		Browse
		Other
		
	#tag EndEnum
	#tag Enum, Name = ProductAvailabilityType, Type = Integer, Flags = &h1
		
		InStock
		OutOfStock
		Preorder
		Null
		
	#tag EndEnum
	#tag Enum, Name = ProductGroupSummaryStatus, Type = Integer, Flags = &h1
		
		Running
		Paused
		Excluded
		Archived
		
	#tag EndEnum
	#tag Enum, Name = ReportingColumnAsync, Type = Integer, Flags = &h1
		
		SpendInMicroDollar
		PaidImpression
		SpendInDollar
		CpcInMicroDollar
		EcpcInMicroDollar
		EcpcInDollar
		Ctr
		Ectr
		OutboundCtr
		CostPerOutboundClick
		CampaignName
		CampaignStatus
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
		AdGroupEntityStatus
		ProductGroupId
		ProductGroupStatus
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
		TotalClickthrough
		TotalImpression
		TotalImpressionUser
		TotalImpressionFrequency
		CostPerOutboundClickInDollar
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
		CampaignDailySpendCap
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
		TotalLead
		TotalAppInstall
		TotalSignupValueInMicroDollar
		TotalCheckoutValueInMicroDollar
		TotalCustomValueInMicroDollar
		TotalAppInstallValueInMicroDollar
		TotalCheckoutQuantity
		PageVisitCostPerAction
		AppInstallCostPerAction
		PageVisitRoas
		CheckoutRoas
		CustomRoas
		Video3secViews1
		VideoP100Complete1
		VideoP0Combined1
		VideoP25Combined1
		VideoP50Combined1
		VideoP75Combined1
		VideoP95Combined1
		VideoMrcViews1
		Video3secViews2
		VideoP100Complete2
		VideoP0Combined2
		VideoP25Combined2
		VideoP50Combined2
		VideoP75Combined2
		VideoP95Combined2
		VideoMrcViews2
		VideoLength
		CpvInMicroDollar
		EcpvInDollar
		CpcvInMicroDollar
		EcpcvInDollar
		CpcvP95InMicroDollar
		EcpcvP95InDollar
		TotalVideo3secViews
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
		
	#tag EndEnum
	#tag Enum, Name = Role, Type = Integer, Flags = &h1
		
		Unknown
		Owner
		Admin
		Analyst
		SosReader
		FinanceManager
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
		No
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
	#tag Enum, Name = TrendType, Type = Integer, Flags = &h1
		
		Growing
		Monthly
		Yearly
		Seasonal
		
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
