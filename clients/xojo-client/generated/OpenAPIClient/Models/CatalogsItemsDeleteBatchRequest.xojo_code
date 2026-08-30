#tag Class
Protected Class CatalogsItemsDeleteBatchRequest

	#tag Property, Flags = &h0
		country As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Array with catalogs items
		#tag EndNote
		items() As OpenAPIClient.Models.ItemDeleteBatchRecord
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			We recommend using the CatalogsLocale values.
		#tag EndNote
		language As OpenAPIClient.Models.String
	#tag EndProperty


	#tag Property, Flags = &h0
		operation As String
	#tag EndProperty


    #tag Enum, Name = LanguageEnum, Type = Integer, Flags = &h0
        
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
        De2
        El
        En
        Es
        Et
        Fa
        Fi
        Fr2
        He
        Hi
        Hr
        Hu
        Hy
        Id
        Escapedin
        Escapedis
        It2
        Iw
        Ja2
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
        Nl2
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
        Tr2
        Xx
        Zh
        
    #tag EndEnum

    #tag Enum, Name = OperationEnum, Type = Integer, Flags = &h0
        
        Delete
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function LanguageEnumToString(value As LanguageEnum) As String
		  Select Case value
		    
		    Case LanguageEnum.AfZa
		      Return "af-ZA"
		    Case LanguageEnum.ArSa
		      Return "ar-SA"
		    Case LanguageEnum.BgBg
		      Return "bg-BG"
		    Case LanguageEnum.BnIn
		      Return "bn-IN"
		    Case LanguageEnum.CsCz
		      Return "cs-CZ"
		    Case LanguageEnum.DaDk
		      Return "da-DK"
		    Case LanguageEnum.De
		      Return "de"
		    Case LanguageEnum.ElGr
		      Return "el-GR"
		    Case LanguageEnum.EnAu
		      Return "en-AU"
		    Case LanguageEnum.EnCa
		      Return "en-CA"
		    Case LanguageEnum.EnGb
		      Return "en-GB"
		    Case LanguageEnum.EnIn
		      Return "en-IN"
		    Case LanguageEnum.EnUs
		      Return "en-US"
		    Case LanguageEnum.Es419
		      Return "es-419"
		    Case LanguageEnum.EsAr
		      Return "es-AR"
		    Case LanguageEnum.EsEs
		      Return "es-ES"
		    Case LanguageEnum.EsMx
		      Return "es-MX"
		    Case LanguageEnum.FiFi
		      Return "fi-FI"
		    Case LanguageEnum.Fr
		      Return "fr"
		    Case LanguageEnum.FrCa
		      Return "fr-CA"
		    Case LanguageEnum.HeIl
		      Return "he-IL"
		    Case LanguageEnum.HiIn
		      Return "hi-IN"
		    Case LanguageEnum.HrHr
		      Return "hr-HR"
		    Case LanguageEnum.HuHu
		      Return "hu-HU"
		    Case LanguageEnum.IdId
		      Return "id-ID"
		    Case LanguageEnum.It
		      Return "it"
		    Case LanguageEnum.Ja
		      Return "ja"
		    Case LanguageEnum.KoKr
		      Return "ko-KR"
		    Case LanguageEnum.MsMy
		      Return "ms-MY"
		    Case LanguageEnum.NbNo
		      Return "nb-NO"
		    Case LanguageEnum.Nl
		      Return "nl"
		    Case LanguageEnum.PlPl
		      Return "pl-PL"
		    Case LanguageEnum.PtBr
		      Return "pt-BR"
		    Case LanguageEnum.PtPt
		      Return "pt-PT"
		    Case LanguageEnum.RoRo
		      Return "ro-RO"
		    Case LanguageEnum.RuRu
		      Return "ru-RU"
		    Case LanguageEnum.SkSk
		      Return "sk-SK"
		    Case LanguageEnum.SvSe
		      Return "sv-SE"
		    Case LanguageEnum.TeIn
		      Return "te-IN"
		    Case LanguageEnum.ThTh
		      Return "th-TH"
		    Case LanguageEnum.TlPh
		      Return "tl-PH"
		    Case LanguageEnum.Tr
		      Return "tr"
		    Case LanguageEnum.UkUa
		      Return "uk-UA"
		    Case LanguageEnum.ViVn
		      Return "vi-VN"
		    Case LanguageEnum.ZhCn
		      Return "zh-CN"
		    Case LanguageEnum.ZhTw
		      Return "zh-TW"
		    Case LanguageEnum.Am
		      Return "AM"
		    Case LanguageEnum.Ar
		      Return "AR"
		    Case LanguageEnum.Az
		      Return "AZ"
		    Case LanguageEnum.Bg
		      Return "BG"
		    Case LanguageEnum.Bn
		      Return "BN"
		    Case LanguageEnum.Bs
		      Return "BS"
		    Case LanguageEnum.Ca
		      Return "CA"
		    Case LanguageEnum.Cs
		      Return "CS"
		    Case LanguageEnum.Da
		      Return "DA"
		    Case LanguageEnum.Dv
		      Return "DV"
		    Case LanguageEnum.Dz
		      Return "DZ"
		    Case LanguageEnum.De2
		      Return "DE"
		    Case LanguageEnum.El
		      Return "EL"
		    Case LanguageEnum.En
		      Return "EN"
		    Case LanguageEnum.Es
		      Return "ES"
		    Case LanguageEnum.Et
		      Return "ET"
		    Case LanguageEnum.Fa
		      Return "FA"
		    Case LanguageEnum.Fi
		      Return "FI"
		    Case LanguageEnum.Fr2
		      Return "FR"
		    Case LanguageEnum.He
		      Return "HE"
		    Case LanguageEnum.Hi
		      Return "HI"
		    Case LanguageEnum.Hr
		      Return "HR"
		    Case LanguageEnum.Hu
		      Return "HU"
		    Case LanguageEnum.Hy
		      Return "HY"
		    Case LanguageEnum.Id
		      Return "ID"
		    Case LanguageEnum.Escapedin
		      Return "IN"
		    Case LanguageEnum.Escapedis
		      Return "IS"
		    Case LanguageEnum.It2
		      Return "IT"
		    Case LanguageEnum.Iw
		      Return "IW"
		    Case LanguageEnum.Ja2
		      Return "JA"
		    Case LanguageEnum.Ka
		      Return "KA"
		    Case LanguageEnum.Km
		      Return "KM"
		    Case LanguageEnum.Ko
		      Return "KO"
		    Case LanguageEnum.Lo
		      Return "LO"
		    Case LanguageEnum.Lt
		      Return "LT"
		    Case LanguageEnum.Lv
		      Return "LV"
		    Case LanguageEnum.Mk
		      Return "MK"
		    Case LanguageEnum.Mn
		      Return "MN"
		    Case LanguageEnum.Ms
		      Return "MS"
		    Case LanguageEnum.My
		      Return "MY"
		    Case LanguageEnum.Nb
		      Return "NB"
		    Case LanguageEnum.Ne
		      Return "NE"
		    Case LanguageEnum.Nl2
		      Return "NL"
		    Case LanguageEnum.Escapedfalse
		      Return "false"
		    Case LanguageEnum.Pl
		      Return "PL"
		    Case LanguageEnum.Pt
		      Return "PT"
		    Case LanguageEnum.Ro
		      Return "RO"
		    Case LanguageEnum.Ru
		      Return "RU"
		    Case LanguageEnum.Sk
		      Return "SK"
		    Case LanguageEnum.Sl
		      Return "SL"
		    Case LanguageEnum.Sq
		      Return "SQ"
		    Case LanguageEnum.Sr
		      Return "SR"
		    Case LanguageEnum.Sv
		      Return "SV"
		    Case LanguageEnum.Tl
		      Return "TL"
		    Case LanguageEnum.Uk
		      Return "UK"
		    Case LanguageEnum.Vi
		      Return "VI"
		    Case LanguageEnum.Te
		      Return "TE"
		    Case LanguageEnum.Th
		      Return "TH"
		    Case LanguageEnum.Tr2
		      Return "TR"
		    Case LanguageEnum.Xx
		      Return "XX"
		    Case LanguageEnum.Zh
		      Return "ZH"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function OperationEnumToString(value As OperationEnum) As String
		  Select Case value
		    
		    Case OperationEnum.Delete
		      Return "DELETE"
		    
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
			Name="country"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Country"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="items"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemDeleteBatchRecord"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


