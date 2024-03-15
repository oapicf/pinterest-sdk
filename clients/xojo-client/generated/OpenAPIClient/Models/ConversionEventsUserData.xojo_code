#tag Class
Protected Class ConversionEventsUserData

	#tag Property, Flags = &h0
		#tag Note
			Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
		#tag EndNote
		ph() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Sha256 hashes of user's gender, in lowercase. Either "f" or "m" or "n" for non-binary gender.
		#tag EndNote
		ge() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Sha256 hashes of user's date of birthday, given as year, month, and day.
		#tag EndNote
		db() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
		#tag EndNote
		ln() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
		#tag EndNote
		fn() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing).
		#tag EndNote
		ct() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing).
		#tag EndNote
		st() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing).
		#tag EndNote
		zp() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase.
		#tag EndNote
		country() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA.
		#tag EndNote
		external_id() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
		#tag EndNote
		click_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A unique identifier of visitors' information defined by third party partners. e.g RampID
		#tag EndNote
		partner_id As Xoson.O.OptionalString
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
			Name="ph"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ge"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="db"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ln"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="fn"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ct"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="st"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="zp"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="country"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="external_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="click_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="partner_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


