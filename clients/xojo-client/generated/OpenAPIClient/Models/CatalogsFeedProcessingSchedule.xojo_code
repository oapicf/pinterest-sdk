#tag Class
Protected Class CatalogsFeedProcessingSchedule

	#tag Property, Flags = &h0
		#tag Note
			A time in format HH:MM with leading 0 (zero)
		#tag EndNote
		time As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The timezone considered for the processing schedule time.
		#tag EndNote
		timezone As String
	#tag EndProperty


    #tag Enum, Name = TimezoneEnum, Type = Integer, Flags = &h0
        
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
        Null
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TimezoneEnumToString(value As TimezoneEnum) As String
		  Select Case value
		    
		    Case TimezoneEnum.AfricaSlashAbidjan
		      Return "Africa/Abidjan"
		    Case TimezoneEnum.AfricaSlashAccra
		      Return "Africa/Accra"
		    Case TimezoneEnum.AfricaSlashAlgiers
		      Return "Africa/Algiers"
		    Case TimezoneEnum.AfricaSlashBissau
		      Return "Africa/Bissau"
		    Case TimezoneEnum.AfricaSlashCairo
		      Return "Africa/Cairo"
		    Case TimezoneEnum.AfricaSlashCasablanca
		      Return "Africa/Casablanca"
		    Case TimezoneEnum.AfricaSlashCeuta
		      Return "Africa/Ceuta"
		    Case TimezoneEnum.AfricaSlashElAaiun
		      Return "Africa/El_Aaiun"
		    Case TimezoneEnum.AfricaSlashJohannesburg
		      Return "Africa/Johannesburg"
		    Case TimezoneEnum.AfricaSlashJuba
		      Return "Africa/Juba"
		    Case TimezoneEnum.AfricaSlashKhartoum
		      Return "Africa/Khartoum"
		    Case TimezoneEnum.AfricaSlashLagos
		      Return "Africa/Lagos"
		    Case TimezoneEnum.AfricaSlashMaputo
		      Return "Africa/Maputo"
		    Case TimezoneEnum.AfricaSlashMonrovia
		      Return "Africa/Monrovia"
		    Case TimezoneEnum.AfricaSlashNairobi
		      Return "Africa/Nairobi"
		    Case TimezoneEnum.AfricaSlashNdjamena
		      Return "Africa/Ndjamena"
		    Case TimezoneEnum.AfricaSlashSaoTome
		      Return "Africa/Sao_Tome"
		    Case TimezoneEnum.AfricaSlashTripoli
		      Return "Africa/Tripoli"
		    Case TimezoneEnum.AfricaSlashTunis
		      Return "Africa/Tunis"
		    Case TimezoneEnum.AfricaSlashWindhoek
		      Return "Africa/Windhoek"
		    Case TimezoneEnum.AmericaSlashAdak
		      Return "America/Adak"
		    Case TimezoneEnum.AmericaSlashAnchorage
		      Return "America/Anchorage"
		    Case TimezoneEnum.AmericaSlashAraguaina
		      Return "America/Araguaina"
		    Case TimezoneEnum.AmericaSlashArgentinaSlashBuenosAires
		      Return "America/Argentina/Buenos_Aires"
		    Case TimezoneEnum.AmericaSlashArgentinaSlashCatamarca
		      Return "America/Argentina/Catamarca"
		    Case TimezoneEnum.AmericaSlashArgentinaSlashCordoba
		      Return "America/Argentina/Cordoba"
		    Case TimezoneEnum.AmericaSlashArgentinaSlashJujuy
		      Return "America/Argentina/Jujuy"
		    Case TimezoneEnum.AmericaSlashArgentinaSlashLaRioja
		      Return "America/Argentina/La_Rioja"
		    Case TimezoneEnum.AmericaSlashArgentinaSlashMendoza
		      Return "America/Argentina/Mendoza"
		    Case TimezoneEnum.AmericaSlashArgentinaSlashRioGallegos
		      Return "America/Argentina/Rio_Gallegos"
		    Case TimezoneEnum.AmericaSlashArgentinaSlashSalta
		      Return "America/Argentina/Salta"
		    Case TimezoneEnum.AmericaSlashArgentinaSlashSanJuan
		      Return "America/Argentina/San_Juan"
		    Case TimezoneEnum.AmericaSlashArgentinaSlashSanLuis
		      Return "America/Argentina/San_Luis"
		    Case TimezoneEnum.AmericaSlashArgentinaSlashTucuman
		      Return "America/Argentina/Tucuman"
		    Case TimezoneEnum.AmericaSlashArgentinaSlashUshuaia
		      Return "America/Argentina/Ushuaia"
		    Case TimezoneEnum.AmericaSlashAsuncion
		      Return "America/Asuncion"
		    Case TimezoneEnum.AmericaSlashAtikokan
		      Return "America/Atikokan"
		    Case TimezoneEnum.AmericaSlashBahia
		      Return "America/Bahia"
		    Case TimezoneEnum.AmericaSlashBahiaBanderas
		      Return "America/Bahia_Banderas"
		    Case TimezoneEnum.AmericaSlashBarbados
		      Return "America/Barbados"
		    Case TimezoneEnum.AmericaSlashBelem
		      Return "America/Belem"
		    Case TimezoneEnum.AmericaSlashBelize
		      Return "America/Belize"
		    Case TimezoneEnum.AmericaSlashBlancSablon
		      Return "America/Blanc-Sablon"
		    Case TimezoneEnum.AmericaSlashBoaVista
		      Return "America/Boa_Vista"
		    Case TimezoneEnum.AmericaSlashBogota
		      Return "America/Bogota"
		    Case TimezoneEnum.AmericaSlashBoise
		      Return "America/Boise"
		    Case TimezoneEnum.AmericaSlashCambridgeBay
		      Return "America/Cambridge_Bay"
		    Case TimezoneEnum.AmericaSlashCampoGrande
		      Return "America/Campo_Grande"
		    Case TimezoneEnum.AmericaSlashCancun
		      Return "America/Cancun"
		    Case TimezoneEnum.AmericaSlashCaracas
		      Return "America/Caracas"
		    Case TimezoneEnum.AmericaSlashCayenne
		      Return "America/Cayenne"
		    Case TimezoneEnum.AmericaSlashChicago
		      Return "America/Chicago"
		    Case TimezoneEnum.AmericaSlashChihuahua
		      Return "America/Chihuahua"
		    Case TimezoneEnum.AmericaSlashCostaRica
		      Return "America/Costa_Rica"
		    Case TimezoneEnum.AmericaSlashCreston
		      Return "America/Creston"
		    Case TimezoneEnum.AmericaSlashCuiaba
		      Return "America/Cuiaba"
		    Case TimezoneEnum.AmericaSlashCuracao
		      Return "America/Curacao"
		    Case TimezoneEnum.AmericaSlashDanmarkshavn
		      Return "America/Danmarkshavn"
		    Case TimezoneEnum.AmericaSlashDawson
		      Return "America/Dawson"
		    Case TimezoneEnum.AmericaSlashDawsonCreek
		      Return "America/Dawson_Creek"
		    Case TimezoneEnum.AmericaSlashDenver
		      Return "America/Denver"
		    Case TimezoneEnum.AmericaSlashDetroit
		      Return "America/Detroit"
		    Case TimezoneEnum.AmericaSlashEdmonton
		      Return "America/Edmonton"
		    Case TimezoneEnum.AmericaSlashEirunepe
		      Return "America/Eirunepe"
		    Case TimezoneEnum.AmericaSlashElSalvador
		      Return "America/El_Salvador"
		    Case TimezoneEnum.AmericaSlashFortNelson
		      Return "America/Fort_Nelson"
		    Case TimezoneEnum.AmericaSlashFortaleza
		      Return "America/Fortaleza"
		    Case TimezoneEnum.AmericaSlashGlaceBay
		      Return "America/Glace_Bay"
		    Case TimezoneEnum.AmericaSlashGooseBay
		      Return "America/Goose_Bay"
		    Case TimezoneEnum.AmericaSlashGrandTurk
		      Return "America/Grand_Turk"
		    Case TimezoneEnum.AmericaSlashGuatemala
		      Return "America/Guatemala"
		    Case TimezoneEnum.AmericaSlashGuayaquil
		      Return "America/Guayaquil"
		    Case TimezoneEnum.AmericaSlashGuyana
		      Return "America/Guyana"
		    Case TimezoneEnum.AmericaSlashHalifax
		      Return "America/Halifax"
		    Case TimezoneEnum.AmericaSlashHavana
		      Return "America/Havana"
		    Case TimezoneEnum.AmericaSlashHermosillo
		      Return "America/Hermosillo"
		    Case TimezoneEnum.AmericaSlashIndianaSlashIndianapolis
		      Return "America/Indiana/Indianapolis"
		    Case TimezoneEnum.AmericaSlashIndianaSlashKnox
		      Return "America/Indiana/Knox"
		    Case TimezoneEnum.AmericaSlashIndianaSlashMarengo
		      Return "America/Indiana/Marengo"
		    Case TimezoneEnum.AmericaSlashIndianaSlashPetersburg
		      Return "America/Indiana/Petersburg"
		    Case TimezoneEnum.AmericaSlashIndianaSlashTellCity
		      Return "America/Indiana/Tell_City"
		    Case TimezoneEnum.AmericaSlashIndianaSlashVevay
		      Return "America/Indiana/Vevay"
		    Case TimezoneEnum.AmericaSlashIndianaSlashVincennes
		      Return "America/Indiana/Vincennes"
		    Case TimezoneEnum.AmericaSlashIndianaSlashWinamac
		      Return "America/Indiana/Winamac"
		    Case TimezoneEnum.AmericaSlashInuvik
		      Return "America/Inuvik"
		    Case TimezoneEnum.AmericaSlashIqaluit
		      Return "America/Iqaluit"
		    Case TimezoneEnum.AmericaSlashJamaica
		      Return "America/Jamaica"
		    Case TimezoneEnum.AmericaSlashJuneau
		      Return "America/Juneau"
		    Case TimezoneEnum.AmericaSlashKentuckySlashLouisville
		      Return "America/Kentucky/Louisville"
		    Case TimezoneEnum.AmericaSlashKentuckySlashMonticello
		      Return "America/Kentucky/Monticello"
		    Case TimezoneEnum.AmericaSlashLaPaz
		      Return "America/La_Paz"
		    Case TimezoneEnum.AmericaSlashLima
		      Return "America/Lima"
		    Case TimezoneEnum.AmericaSlashLosAngeles
		      Return "America/Los_Angeles"
		    Case TimezoneEnum.AmericaSlashMaceio
		      Return "America/Maceio"
		    Case TimezoneEnum.AmericaSlashManagua
		      Return "America/Managua"
		    Case TimezoneEnum.AmericaSlashManaus
		      Return "America/Manaus"
		    Case TimezoneEnum.AmericaSlashMartinique
		      Return "America/Martinique"
		    Case TimezoneEnum.AmericaSlashMatamoros
		      Return "America/Matamoros"
		    Case TimezoneEnum.AmericaSlashMazatlan
		      Return "America/Mazatlan"
		    Case TimezoneEnum.AmericaSlashMenominee
		      Return "America/Menominee"
		    Case TimezoneEnum.AmericaSlashMerida
		      Return "America/Merida"
		    Case TimezoneEnum.AmericaSlashMetlakatla
		      Return "America/Metlakatla"
		    Case TimezoneEnum.AmericaSlashMexicoCity
		      Return "America/Mexico_City"
		    Case TimezoneEnum.AmericaSlashMiquelon
		      Return "America/Miquelon"
		    Case TimezoneEnum.AmericaSlashMoncton
		      Return "America/Moncton"
		    Case TimezoneEnum.AmericaSlashMonterrey
		      Return "America/Monterrey"
		    Case TimezoneEnum.AmericaSlashMontevideo
		      Return "America/Montevideo"
		    Case TimezoneEnum.AmericaSlashNassau
		      Return "America/Nassau"
		    Case TimezoneEnum.AmericaSlashNewYork
		      Return "America/New_York"
		    Case TimezoneEnum.AmericaSlashNipigon
		      Return "America/Nipigon"
		    Case TimezoneEnum.AmericaSlashNome
		      Return "America/Nome"
		    Case TimezoneEnum.AmericaSlashNoronha
		      Return "America/Noronha"
		    Case TimezoneEnum.AmericaSlashNorthDakotaSlashBeulah
		      Return "America/North_Dakota/Beulah"
		    Case TimezoneEnum.AmericaSlashNorthDakotaSlashCenter
		      Return "America/North_Dakota/Center"
		    Case TimezoneEnum.AmericaSlashNorthDakotaSlashNewSalem
		      Return "America/North_Dakota/New_Salem"
		    Case TimezoneEnum.AmericaSlashNuuk
		      Return "America/Nuuk"
		    Case TimezoneEnum.AmericaSlashOjinaga
		      Return "America/Ojinaga"
		    Case TimezoneEnum.AmericaSlashPanama
		      Return "America/Panama"
		    Case TimezoneEnum.AmericaSlashPangnirtung
		      Return "America/Pangnirtung"
		    Case TimezoneEnum.AmericaSlashParamaribo
		      Return "America/Paramaribo"
		    Case TimezoneEnum.AmericaSlashPhoenix
		      Return "America/Phoenix"
		    Case TimezoneEnum.AmericaSlashPortAuPrince
		      Return "America/Port-au-Prince"
		    Case TimezoneEnum.AmericaSlashPortOfSpain
		      Return "America/Port_of_Spain"
		    Case TimezoneEnum.AmericaSlashPortoVelho
		      Return "America/Porto_Velho"
		    Case TimezoneEnum.AmericaSlashPuertoRico
		      Return "America/Puerto_Rico"
		    Case TimezoneEnum.AmericaSlashPuntaArenas
		      Return "America/Punta_Arenas"
		    Case TimezoneEnum.AmericaSlashRainyRiver
		      Return "America/Rainy_River"
		    Case TimezoneEnum.AmericaSlashRankinInlet
		      Return "America/Rankin_Inlet"
		    Case TimezoneEnum.AmericaSlashRecife
		      Return "America/Recife"
		    Case TimezoneEnum.AmericaSlashRegina
		      Return "America/Regina"
		    Case TimezoneEnum.AmericaSlashResolute
		      Return "America/Resolute"
		    Case TimezoneEnum.AmericaSlashRioBranco
		      Return "America/Rio_Branco"
		    Case TimezoneEnum.AmericaSlashSantarem
		      Return "America/Santarem"
		    Case TimezoneEnum.AmericaSlashSantiago
		      Return "America/Santiago"
		    Case TimezoneEnum.AmericaSlashSantoDomingo
		      Return "America/Santo_Domingo"
		    Case TimezoneEnum.AmericaSlashSaoPaulo
		      Return "America/Sao_Paulo"
		    Case TimezoneEnum.AmericaSlashScoresbysund
		      Return "America/Scoresbysund"
		    Case TimezoneEnum.AmericaSlashSitka
		      Return "America/Sitka"
		    Case TimezoneEnum.AmericaSlashStJohns
		      Return "America/St_Johns"
		    Case TimezoneEnum.AmericaSlashSwiftCurrent
		      Return "America/Swift_Current"
		    Case TimezoneEnum.AmericaSlashTegucigalpa
		      Return "America/Tegucigalpa"
		    Case TimezoneEnum.AmericaSlashThule
		      Return "America/Thule"
		    Case TimezoneEnum.AmericaSlashThunderBay
		      Return "America/Thunder_Bay"
		    Case TimezoneEnum.AmericaSlashTijuana
		      Return "America/Tijuana"
		    Case TimezoneEnum.AmericaSlashToronto
		      Return "America/Toronto"
		    Case TimezoneEnum.AmericaSlashVancouver
		      Return "America/Vancouver"
		    Case TimezoneEnum.AmericaSlashWhitehorse
		      Return "America/Whitehorse"
		    Case TimezoneEnum.AmericaSlashWinnipeg
		      Return "America/Winnipeg"
		    Case TimezoneEnum.AmericaSlashYakutat
		      Return "America/Yakutat"
		    Case TimezoneEnum.AmericaSlashYellowknife
		      Return "America/Yellowknife"
		    Case TimezoneEnum.AntarcticaSlashCasey
		      Return "Antarctica/Casey"
		    Case TimezoneEnum.AntarcticaSlashDavis
		      Return "Antarctica/Davis"
		    Case TimezoneEnum.AntarcticaSlashDumontdurville
		      Return "Antarctica/DumontDUrville"
		    Case TimezoneEnum.AntarcticaSlashMacquarie
		      Return "Antarctica/Macquarie"
		    Case TimezoneEnum.AntarcticaSlashMawson
		      Return "Antarctica/Mawson"
		    Case TimezoneEnum.AntarcticaSlashPalmer
		      Return "Antarctica/Palmer"
		    Case TimezoneEnum.AntarcticaSlashRothera
		      Return "Antarctica/Rothera"
		    Case TimezoneEnum.AntarcticaSlashSyowa
		      Return "Antarctica/Syowa"
		    Case TimezoneEnum.AntarcticaSlashTroll
		      Return "Antarctica/Troll"
		    Case TimezoneEnum.AntarcticaSlashVostok
		      Return "Antarctica/Vostok"
		    Case TimezoneEnum.AsiaSlashAlmaty
		      Return "Asia/Almaty"
		    Case TimezoneEnum.AsiaSlashAmman
		      Return "Asia/Amman"
		    Case TimezoneEnum.AsiaSlashAnadyr
		      Return "Asia/Anadyr"
		    Case TimezoneEnum.AsiaSlashAqtau
		      Return "Asia/Aqtau"
		    Case TimezoneEnum.AsiaSlashAqtobe
		      Return "Asia/Aqtobe"
		    Case TimezoneEnum.AsiaSlashAshgabat
		      Return "Asia/Ashgabat"
		    Case TimezoneEnum.AsiaSlashAtyrau
		      Return "Asia/Atyrau"
		    Case TimezoneEnum.AsiaSlashBaghdad
		      Return "Asia/Baghdad"
		    Case TimezoneEnum.AsiaSlashBaku
		      Return "Asia/Baku"
		    Case TimezoneEnum.AsiaSlashBangkok
		      Return "Asia/Bangkok"
		    Case TimezoneEnum.AsiaSlashBarnaul
		      Return "Asia/Barnaul"
		    Case TimezoneEnum.AsiaSlashBeirut
		      Return "Asia/Beirut"
		    Case TimezoneEnum.AsiaSlashBishkek
		      Return "Asia/Bishkek"
		    Case TimezoneEnum.AsiaSlashBrunei
		      Return "Asia/Brunei"
		    Case TimezoneEnum.AsiaSlashChita
		      Return "Asia/Chita"
		    Case TimezoneEnum.AsiaSlashChoibalsan
		      Return "Asia/Choibalsan"
		    Case TimezoneEnum.AsiaSlashColombo
		      Return "Asia/Colombo"
		    Case TimezoneEnum.AsiaSlashDamascus
		      Return "Asia/Damascus"
		    Case TimezoneEnum.AsiaSlashDhaka
		      Return "Asia/Dhaka"
		    Case TimezoneEnum.AsiaSlashDili
		      Return "Asia/Dili"
		    Case TimezoneEnum.AsiaSlashDubai
		      Return "Asia/Dubai"
		    Case TimezoneEnum.AsiaSlashDushanbe
		      Return "Asia/Dushanbe"
		    Case TimezoneEnum.AsiaSlashFamagusta
		      Return "Asia/Famagusta"
		    Case TimezoneEnum.AsiaSlashGaza
		      Return "Asia/Gaza"
		    Case TimezoneEnum.AsiaSlashHebron
		      Return "Asia/Hebron"
		    Case TimezoneEnum.AsiaSlashHoChiMinh
		      Return "Asia/Ho_Chi_Minh"
		    Case TimezoneEnum.AsiaSlashHongKong
		      Return "Asia/Hong_Kong"
		    Case TimezoneEnum.AsiaSlashHovd
		      Return "Asia/Hovd"
		    Case TimezoneEnum.AsiaSlashIrkutsk
		      Return "Asia/Irkutsk"
		    Case TimezoneEnum.AsiaSlashJakarta
		      Return "Asia/Jakarta"
		    Case TimezoneEnum.AsiaSlashJayapura
		      Return "Asia/Jayapura"
		    Case TimezoneEnum.AsiaSlashJerusalem
		      Return "Asia/Jerusalem"
		    Case TimezoneEnum.AsiaSlashKabul
		      Return "Asia/Kabul"
		    Case TimezoneEnum.AsiaSlashKamchatka
		      Return "Asia/Kamchatka"
		    Case TimezoneEnum.AsiaSlashKarachi
		      Return "Asia/Karachi"
		    Case TimezoneEnum.AsiaSlashKathmandu
		      Return "Asia/Kathmandu"
		    Case TimezoneEnum.AsiaSlashKhandyga
		      Return "Asia/Khandyga"
		    Case TimezoneEnum.AsiaSlashKolkata
		      Return "Asia/Kolkata"
		    Case TimezoneEnum.AsiaSlashKrasnoyarsk
		      Return "Asia/Krasnoyarsk"
		    Case TimezoneEnum.AsiaSlashKualaLumpur
		      Return "Asia/Kuala_Lumpur"
		    Case TimezoneEnum.AsiaSlashKuching
		      Return "Asia/Kuching"
		    Case TimezoneEnum.AsiaSlashMacau
		      Return "Asia/Macau"
		    Case TimezoneEnum.AsiaSlashMagadan
		      Return "Asia/Magadan"
		    Case TimezoneEnum.AsiaSlashMakassar
		      Return "Asia/Makassar"
		    Case TimezoneEnum.AsiaSlashManila
		      Return "Asia/Manila"
		    Case TimezoneEnum.AsiaSlashNicosia
		      Return "Asia/Nicosia"
		    Case TimezoneEnum.AsiaSlashNovokuznetsk
		      Return "Asia/Novokuznetsk"
		    Case TimezoneEnum.AsiaSlashNovosibirsk
		      Return "Asia/Novosibirsk"
		    Case TimezoneEnum.AsiaSlashOmsk
		      Return "Asia/Omsk"
		    Case TimezoneEnum.AsiaSlashOral
		      Return "Asia/Oral"
		    Case TimezoneEnum.AsiaSlashPontianak
		      Return "Asia/Pontianak"
		    Case TimezoneEnum.AsiaSlashPyongyang
		      Return "Asia/Pyongyang"
		    Case TimezoneEnum.AsiaSlashQatar
		      Return "Asia/Qatar"
		    Case TimezoneEnum.AsiaSlashQostanay
		      Return "Asia/Qostanay"
		    Case TimezoneEnum.AsiaSlashQyzylorda
		      Return "Asia/Qyzylorda"
		    Case TimezoneEnum.AsiaSlashRiyadh
		      Return "Asia/Riyadh"
		    Case TimezoneEnum.AsiaSlashSakhalin
		      Return "Asia/Sakhalin"
		    Case TimezoneEnum.AsiaSlashSamarkand
		      Return "Asia/Samarkand"
		    Case TimezoneEnum.AsiaSlashSeoul
		      Return "Asia/Seoul"
		    Case TimezoneEnum.AsiaSlashShanghai
		      Return "Asia/Shanghai"
		    Case TimezoneEnum.AsiaSlashSingapore
		      Return "Asia/Singapore"
		    Case TimezoneEnum.AsiaSlashSrednekolymsk
		      Return "Asia/Srednekolymsk"
		    Case TimezoneEnum.AsiaSlashTaipei
		      Return "Asia/Taipei"
		    Case TimezoneEnum.AsiaSlashTashkent
		      Return "Asia/Tashkent"
		    Case TimezoneEnum.AsiaSlashTbilisi
		      Return "Asia/Tbilisi"
		    Case TimezoneEnum.AsiaSlashTehran
		      Return "Asia/Tehran"
		    Case TimezoneEnum.AsiaSlashThimphu
		      Return "Asia/Thimphu"
		    Case TimezoneEnum.AsiaSlashTokyo
		      Return "Asia/Tokyo"
		    Case TimezoneEnum.AsiaSlashTomsk
		      Return "Asia/Tomsk"
		    Case TimezoneEnum.AsiaSlashUlaanbaatar
		      Return "Asia/Ulaanbaatar"
		    Case TimezoneEnum.AsiaSlashUrumqi
		      Return "Asia/Urumqi"
		    Case TimezoneEnum.AsiaSlashUstNera
		      Return "Asia/Ust-Nera"
		    Case TimezoneEnum.AsiaSlashVladivostok
		      Return "Asia/Vladivostok"
		    Case TimezoneEnum.AsiaSlashYakutsk
		      Return "Asia/Yakutsk"
		    Case TimezoneEnum.AsiaSlashYangon
		      Return "Asia/Yangon"
		    Case TimezoneEnum.AsiaSlashYekaterinburg
		      Return "Asia/Yekaterinburg"
		    Case TimezoneEnum.AsiaSlashYerevan
		      Return "Asia/Yerevan"
		    Case TimezoneEnum.AtlanticSlashAzores
		      Return "Atlantic/Azores"
		    Case TimezoneEnum.AtlanticSlashBermuda
		      Return "Atlantic/Bermuda"
		    Case TimezoneEnum.AtlanticSlashCanary
		      Return "Atlantic/Canary"
		    Case TimezoneEnum.AtlanticSlashCapeVerde
		      Return "Atlantic/Cape_Verde"
		    Case TimezoneEnum.AtlanticSlashFaroe
		      Return "Atlantic/Faroe"
		    Case TimezoneEnum.AtlanticSlashMadeira
		      Return "Atlantic/Madeira"
		    Case TimezoneEnum.AtlanticSlashReykjavik
		      Return "Atlantic/Reykjavik"
		    Case TimezoneEnum.AtlanticSlashSouthGeorgia
		      Return "Atlantic/South_Georgia"
		    Case TimezoneEnum.AtlanticSlashStanley
		      Return "Atlantic/Stanley"
		    Case TimezoneEnum.AustraliaSlashAdelaide
		      Return "Australia/Adelaide"
		    Case TimezoneEnum.AustraliaSlashBrisbane
		      Return "Australia/Brisbane"
		    Case TimezoneEnum.AustraliaSlashBrokenHill
		      Return "Australia/Broken_Hill"
		    Case TimezoneEnum.AustraliaSlashCurrie
		      Return "Australia/Currie"
		    Case TimezoneEnum.AustraliaSlashDarwin
		      Return "Australia/Darwin"
		    Case TimezoneEnum.AustraliaSlashEucla
		      Return "Australia/Eucla"
		    Case TimezoneEnum.AustraliaSlashHobart
		      Return "Australia/Hobart"
		    Case TimezoneEnum.AustraliaSlashLindeman
		      Return "Australia/Lindeman"
		    Case TimezoneEnum.AustraliaSlashLordHowe
		      Return "Australia/Lord_Howe"
		    Case TimezoneEnum.AustraliaSlashMelbourne
		      Return "Australia/Melbourne"
		    Case TimezoneEnum.AustraliaSlashPerth
		      Return "Australia/Perth"
		    Case TimezoneEnum.AustraliaSlashSydney
		      Return "Australia/Sydney"
		    Case TimezoneEnum.Cet
		      Return "CET"
		    Case TimezoneEnum.Cst6cdt
		      Return "CST6CDT"
		    Case TimezoneEnum.Eet
		      Return "EET"
		    Case TimezoneEnum.Est
		      Return "EST"
		    Case TimezoneEnum.Est5edt
		      Return "EST5EDT"
		    Case TimezoneEnum.EtcSlashGmt
		      Return "Etc/GMT"
		    Case TimezoneEnum.EtcSlashGmtPlus1
		      Return "Etc/GMT+1"
		    Case TimezoneEnum.EtcSlashGmtPlus10
		      Return "Etc/GMT+10"
		    Case TimezoneEnum.EtcSlashGmtPlus11
		      Return "Etc/GMT+11"
		    Case TimezoneEnum.EtcSlashGmtPlus12
		      Return "Etc/GMT+12"
		    Case TimezoneEnum.EtcSlashGmtPlus2
		      Return "Etc/GMT+2"
		    Case TimezoneEnum.EtcSlashGmtPlus3
		      Return "Etc/GMT+3"
		    Case TimezoneEnum.EtcSlashGmtPlus4
		      Return "Etc/GMT+4"
		    Case TimezoneEnum.EtcSlashGmtPlus5
		      Return "Etc/GMT+5"
		    Case TimezoneEnum.EtcSlashGmtPlus6
		      Return "Etc/GMT+6"
		    Case TimezoneEnum.EtcSlashGmtPlus7
		      Return "Etc/GMT+7"
		    Case TimezoneEnum.EtcSlashGmtPlus8
		      Return "Etc/GMT+8"
		    Case TimezoneEnum.EtcSlashGmtPlus9
		      Return "Etc/GMT+9"
		    Case TimezoneEnum.EtcSlashGmt1
		      Return "Etc/GMT-1"
		    Case TimezoneEnum.EtcSlashGmt10
		      Return "Etc/GMT-10"
		    Case TimezoneEnum.EtcSlashGmt11
		      Return "Etc/GMT-11"
		    Case TimezoneEnum.EtcSlashGmt12
		      Return "Etc/GMT-12"
		    Case TimezoneEnum.EtcSlashGmt13
		      Return "Etc/GMT-13"
		    Case TimezoneEnum.EtcSlashGmt14
		      Return "Etc/GMT-14"
		    Case TimezoneEnum.EtcSlashGmt2
		      Return "Etc/GMT-2"
		    Case TimezoneEnum.EtcSlashGmt3
		      Return "Etc/GMT-3"
		    Case TimezoneEnum.EtcSlashGmt4
		      Return "Etc/GMT-4"
		    Case TimezoneEnum.EtcSlashGmt5
		      Return "Etc/GMT-5"
		    Case TimezoneEnum.EtcSlashGmt6
		      Return "Etc/GMT-6"
		    Case TimezoneEnum.EtcSlashGmt7
		      Return "Etc/GMT-7"
		    Case TimezoneEnum.EtcSlashGmt8
		      Return "Etc/GMT-8"
		    Case TimezoneEnum.EtcSlashGmt9
		      Return "Etc/GMT-9"
		    Case TimezoneEnum.EtcSlashUtc
		      Return "Etc/UTC"
		    Case TimezoneEnum.EuropeSlashAmsterdam
		      Return "Europe/Amsterdam"
		    Case TimezoneEnum.EuropeSlashAndorra
		      Return "Europe/Andorra"
		    Case TimezoneEnum.EuropeSlashAstrakhan
		      Return "Europe/Astrakhan"
		    Case TimezoneEnum.EuropeSlashAthens
		      Return "Europe/Athens"
		    Case TimezoneEnum.EuropeSlashBelgrade
		      Return "Europe/Belgrade"
		    Case TimezoneEnum.EuropeSlashBerlin
		      Return "Europe/Berlin"
		    Case TimezoneEnum.EuropeSlashBrussels
		      Return "Europe/Brussels"
		    Case TimezoneEnum.EuropeSlashBucharest
		      Return "Europe/Bucharest"
		    Case TimezoneEnum.EuropeSlashBudapest
		      Return "Europe/Budapest"
		    Case TimezoneEnum.EuropeSlashChisinau
		      Return "Europe/Chisinau"
		    Case TimezoneEnum.EuropeSlashCopenhagen
		      Return "Europe/Copenhagen"
		    Case TimezoneEnum.EuropeSlashDublin
		      Return "Europe/Dublin"
		    Case TimezoneEnum.EuropeSlashGibraltar
		      Return "Europe/Gibraltar"
		    Case TimezoneEnum.EuropeSlashHelsinki
		      Return "Europe/Helsinki"
		    Case TimezoneEnum.EuropeSlashIstanbul
		      Return "Europe/Istanbul"
		    Case TimezoneEnum.EuropeSlashKaliningrad
		      Return "Europe/Kaliningrad"
		    Case TimezoneEnum.EuropeSlashKiev
		      Return "Europe/Kiev"
		    Case TimezoneEnum.EuropeSlashKirov
		      Return "Europe/Kirov"
		    Case TimezoneEnum.EuropeSlashLisbon
		      Return "Europe/Lisbon"
		    Case TimezoneEnum.EuropeSlashLondon
		      Return "Europe/London"
		    Case TimezoneEnum.EuropeSlashLuxembourg
		      Return "Europe/Luxembourg"
		    Case TimezoneEnum.EuropeSlashMadrid
		      Return "Europe/Madrid"
		    Case TimezoneEnum.EuropeSlashMalta
		      Return "Europe/Malta"
		    Case TimezoneEnum.EuropeSlashMinsk
		      Return "Europe/Minsk"
		    Case TimezoneEnum.EuropeSlashMonaco
		      Return "Europe/Monaco"
		    Case TimezoneEnum.EuropeSlashMoscow
		      Return "Europe/Moscow"
		    Case TimezoneEnum.EuropeSlashOslo
		      Return "Europe/Oslo"
		    Case TimezoneEnum.EuropeSlashParis
		      Return "Europe/Paris"
		    Case TimezoneEnum.EuropeSlashPrague
		      Return "Europe/Prague"
		    Case TimezoneEnum.EuropeSlashRiga
		      Return "Europe/Riga"
		    Case TimezoneEnum.EuropeSlashRome
		      Return "Europe/Rome"
		    Case TimezoneEnum.EuropeSlashSamara
		      Return "Europe/Samara"
		    Case TimezoneEnum.EuropeSlashSaratov
		      Return "Europe/Saratov"
		    Case TimezoneEnum.EuropeSlashSimferopol
		      Return "Europe/Simferopol"
		    Case TimezoneEnum.EuropeSlashSofia
		      Return "Europe/Sofia"
		    Case TimezoneEnum.EuropeSlashStockholm
		      Return "Europe/Stockholm"
		    Case TimezoneEnum.EuropeSlashTallinn
		      Return "Europe/Tallinn"
		    Case TimezoneEnum.EuropeSlashTirane
		      Return "Europe/Tirane"
		    Case TimezoneEnum.EuropeSlashUlyanovsk
		      Return "Europe/Ulyanovsk"
		    Case TimezoneEnum.EuropeSlashUzhgorod
		      Return "Europe/Uzhgorod"
		    Case TimezoneEnum.EuropeSlashVienna
		      Return "Europe/Vienna"
		    Case TimezoneEnum.EuropeSlashVilnius
		      Return "Europe/Vilnius"
		    Case TimezoneEnum.EuropeSlashVolgograd
		      Return "Europe/Volgograd"
		    Case TimezoneEnum.EuropeSlashWarsaw
		      Return "Europe/Warsaw"
		    Case TimezoneEnum.EuropeSlashZaporozhye
		      Return "Europe/Zaporozhye"
		    Case TimezoneEnum.EuropeSlashZurich
		      Return "Europe/Zurich"
		    Case TimezoneEnum.Hst
		      Return "HST"
		    Case TimezoneEnum.IndianSlashChagos
		      Return "Indian/Chagos"
		    Case TimezoneEnum.IndianSlashChristmas
		      Return "Indian/Christmas"
		    Case TimezoneEnum.IndianSlashCocos
		      Return "Indian/Cocos"
		    Case TimezoneEnum.IndianSlashKerguelen
		      Return "Indian/Kerguelen"
		    Case TimezoneEnum.IndianSlashMahe
		      Return "Indian/Mahe"
		    Case TimezoneEnum.IndianSlashMaldives
		      Return "Indian/Maldives"
		    Case TimezoneEnum.IndianSlashMauritius
		      Return "Indian/Mauritius"
		    Case TimezoneEnum.IndianSlashReunion
		      Return "Indian/Reunion"
		    Case TimezoneEnum.Met
		      Return "MET"
		    Case TimezoneEnum.Mst
		      Return "MST"
		    Case TimezoneEnum.Mst7mdt
		      Return "MST7MDT"
		    Case TimezoneEnum.Pst8pdt
		      Return "PST8PDT"
		    Case TimezoneEnum.PacificSlashApia
		      Return "Pacific/Apia"
		    Case TimezoneEnum.PacificSlashAuckland
		      Return "Pacific/Auckland"
		    Case TimezoneEnum.PacificSlashBougainville
		      Return "Pacific/Bougainville"
		    Case TimezoneEnum.PacificSlashChatham
		      Return "Pacific/Chatham"
		    Case TimezoneEnum.PacificSlashChuuk
		      Return "Pacific/Chuuk"
		    Case TimezoneEnum.PacificSlashEaster
		      Return "Pacific/Easter"
		    Case TimezoneEnum.PacificSlashEfate
		      Return "Pacific/Efate"
		    Case TimezoneEnum.PacificSlashEnderbury
		      Return "Pacific/Enderbury"
		    Case TimezoneEnum.PacificSlashFakaofo
		      Return "Pacific/Fakaofo"
		    Case TimezoneEnum.PacificSlashFiji
		      Return "Pacific/Fiji"
		    Case TimezoneEnum.PacificSlashFunafuti
		      Return "Pacific/Funafuti"
		    Case TimezoneEnum.PacificSlashGalapagos
		      Return "Pacific/Galapagos"
		    Case TimezoneEnum.PacificSlashGambier
		      Return "Pacific/Gambier"
		    Case TimezoneEnum.PacificSlashGuadalcanal
		      Return "Pacific/Guadalcanal"
		    Case TimezoneEnum.PacificSlashGuam
		      Return "Pacific/Guam"
		    Case TimezoneEnum.PacificSlashHonolulu
		      Return "Pacific/Honolulu"
		    Case TimezoneEnum.PacificSlashKiritimati
		      Return "Pacific/Kiritimati"
		    Case TimezoneEnum.PacificSlashKosrae
		      Return "Pacific/Kosrae"
		    Case TimezoneEnum.PacificSlashKwajalein
		      Return "Pacific/Kwajalein"
		    Case TimezoneEnum.PacificSlashMajuro
		      Return "Pacific/Majuro"
		    Case TimezoneEnum.PacificSlashMarquesas
		      Return "Pacific/Marquesas"
		    Case TimezoneEnum.PacificSlashNauru
		      Return "Pacific/Nauru"
		    Case TimezoneEnum.PacificSlashNiue
		      Return "Pacific/Niue"
		    Case TimezoneEnum.PacificSlashNorfolk
		      Return "Pacific/Norfolk"
		    Case TimezoneEnum.PacificSlashNoumea
		      Return "Pacific/Noumea"
		    Case TimezoneEnum.PacificSlashPagoPago
		      Return "Pacific/Pago_Pago"
		    Case TimezoneEnum.PacificSlashPalau
		      Return "Pacific/Palau"
		    Case TimezoneEnum.PacificSlashPitcairn
		      Return "Pacific/Pitcairn"
		    Case TimezoneEnum.PacificSlashPohnpei
		      Return "Pacific/Pohnpei"
		    Case TimezoneEnum.PacificSlashPortMoresby
		      Return "Pacific/Port_Moresby"
		    Case TimezoneEnum.PacificSlashRarotonga
		      Return "Pacific/Rarotonga"
		    Case TimezoneEnum.PacificSlashTahiti
		      Return "Pacific/Tahiti"
		    Case TimezoneEnum.PacificSlashTarawa
		      Return "Pacific/Tarawa"
		    Case TimezoneEnum.PacificSlashTongatapu
		      Return "Pacific/Tongatapu"
		    Case TimezoneEnum.PacificSlashWake
		      Return "Pacific/Wake"
		    Case TimezoneEnum.PacificSlashWallis
		      Return "Pacific/Wallis"
		    Case TimezoneEnum.Wet
		      Return "WET"
		    Case TimezoneEnum.Null
		      Return "null"
		    
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
			Name="time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


