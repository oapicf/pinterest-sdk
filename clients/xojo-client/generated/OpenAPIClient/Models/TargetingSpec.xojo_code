#tag Class
Protected Class TargetingSpec

	#tag Property, Flags = &h0
		#tag Note
			**Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.
		#tag EndNote
		AGE_BUCKET() As TargetingSpecAgeBucket
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
		#tag EndNote
		APPTYPE() As TargetingSpecAppType
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Excluded customer list IDs. Used to drive new customer acquisition goals. For example: ["2542620905475"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
		#tag EndNote
		AUDIENCE_EXCLUDE() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Targeted customer list IDs. For example: ["2542620905473"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
		#tag EndNote
		AUDIENCE_INCLUDE() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Targeted genders. Values: ["unknown","male","female"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
		#tag EndNote
		GENDER() As TargetingSpecGender
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Region codes or postal codes to include for targeting.<br /><br /> Region codes represent broader geographical areas. Example: <code>US-CA</code> is the region code for California in the United States.<br /><br /> Postal codes represent more granular, specific areas. Example: <code>94103</code> is a postal code for a specifc area in San Francisco, California, U.S.A.<br /><br /> For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like <code>US-CA</code> or a more granular postal code within that regon, such as <code>94103</code>.<br /><br /> You can specify multiple region codes or postal codes in an array, depending on which method you choose.<br /><br /> Precede a region code array with the <code>region_codes</code> key and a postal code value with the <code>postal_codes</code> key. Examples:<br /><br /> <code>"geo": {</code><br /> <code>"region_codes": ["US-CA"]</code><br /> <code>}</code><br /><br /> <code>"geo": {</code><br /> <code>"postal_codes": ["94103"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code>. <br /><br /> If you do not specifiy a <code>GEO</code> code, only <code>LOCATION</code> values will be targeted (See <code>LOCATION</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href="/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones" target="_blank">get a current, complete list of codes</a>.
		#tag EndNote
		GEO() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Region codes or postal codes to exclude from the targeting inclusion area.<br /><br /> See <code>GEO</code> parameter in this targeting spec for rules, syntax, and other information.<br />
		#tag EndNote
		GEO_EXCLUDE() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
		#tag EndNote
		INTEREST() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.
		#tag EndNote
		LOCALE() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.<br /><br /> Precede country code values with the <code>country_codes</code> key and metro code values with <code>metro_codes</code> key. Example:<br /><br /> <code>"location": {</code><br /> <code>"country_codes": ["US", "CA"],</code><br /> <code>"metro_codes": ["501", "602"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code> code. <br /><br /> If you do not specify a <code>LOCATION</code> code, only <code>GEO</code> values will be targeted (See <code>GEO</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href="/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones" target="_blank">get a current, complete list of codes</a>.
		#tag EndNote
		LOCATION() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.<br /><br /> See <code>LOCATION</code> parameter in this targeting spec for rules, syntax, and other information.
		#tag EndNote
		LOCATION_EXCLUDE() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Maximum age to target (inclusive). Values: "18", "19", ..., "65", "65+". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
		#tag EndNote
		MAXIMUM_AGE As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Minimum age to target (inclusive). Values: "18", "19", ..., "65". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
		#tag EndNote
		MINIMUM_AGE As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
		#tag EndNote
		SHOPPING_RETARGETING() As OpenAPIClient.Models.TargetingSpecShoppingRetargeting
	#tag EndProperty


	#tag Property, Flags = &h0
		TARGETING_STRATEGY() As String
	#tag EndProperty


    #tag Enum, Name = TARGETING_STRATEGYEnum, Type = Integer, Flags = &h0
        
        ChooseYourOwn
        FindNewCustomers
        ReconnectWithUsers
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TARGETING_STRATEGYEnumToString(value As TARGETING_STRATEGYEnum) As String
		  Select Case value
		    
		    Case TARGETING_STRATEGYEnum.ChooseYourOwn
		      Return "CHOOSE_YOUR_OWN"
		    Case TARGETING_STRATEGYEnum.FindNewCustomers
		      Return "FIND_NEW_CUSTOMERS"
		    Case TARGETING_STRATEGYEnum.ReconnectWithUsers
		      Return "RECONNECT_WITH_USERS"
		    
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
			Name="AGE_BUCKET"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingSpecAgeBucket"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="APPTYPE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingSpecAppType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="AUDIENCE_EXCLUDE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="AUDIENCE_INCLUDE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="GENDER"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingSpecGender"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="GEO"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="GEO_EXCLUDE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="INTEREST"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="LOCALE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="LOCATION"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="LOCATION_EXCLUDE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="MAXIMUM_AGE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="MINIMUM_AGE"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="SHOPPING_RETARGETING"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TargetingSpecShoppingRetargeting"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


