package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Optional daily processing schedule. Use this to configure the preferred time for processing a feed (otherwise random).
 * @param time A time in format HH:MM with leading 0 (zero)
 * @param timezone The timezone considered for the processing schedule time.
 */
data class CatalogsFeedProcessingSchedule(
    @get:Pattern(regexp="^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$")
    @field:JsonProperty("time", required = true) val time: kotlin.String,

    @field:JsonProperty("timezone", required = true) val timezone: CatalogsFeedProcessingSchedule.Timezone
) {

    /**
    * The timezone considered for the processing schedule time.
    * Values: africaSlashAbidjan,africaSlashAccra,africaSlashAlgiers,africaSlashBissau,africaSlashCairo,africaSlashCasablanca,africaSlashCeuta,africaSlashElAaiun,africaSlashJohannesburg,africaSlashJuba,africaSlashKhartoum,africaSlashLagos,africaSlashMaputo,africaSlashMonrovia,africaSlashNairobi,africaSlashNdjamena,africaSlashSaoTome,africaSlashTripoli,africaSlashTunis,africaSlashWindhoek,americaSlashAdak,americaSlashAnchorage,americaSlashAraguaina,americaSlashArgentinaSlashBuenosAires,americaSlashArgentinaSlashCatamarca,americaSlashArgentinaSlashCordoba,americaSlashArgentinaSlashJujuy,americaSlashArgentinaSlashLaRioja,americaSlashArgentinaSlashMendoza,americaSlashArgentinaSlashRioGallegos,americaSlashArgentinaSlashSalta,americaSlashArgentinaSlashSanJuan,americaSlashArgentinaSlashSanLuis,americaSlashArgentinaSlashTucuman,americaSlashArgentinaSlashUshuaia,americaSlashAsuncion,americaSlashAtikokan,americaSlashBahia,americaSlashBahiaBanderas,americaSlashBarbados,americaSlashBelem,americaSlashBelize,americaSlashBlancMinusSablon,americaSlashBoaVista,americaSlashBogota,americaSlashBoise,americaSlashCambridgeBay,americaSlashCampoGrande,americaSlashCancun,americaSlashCaracas,americaSlashCayenne,americaSlashChicago,americaSlashChihuahua,americaSlashCostaRica,americaSlashCreston,americaSlashCuiaba,americaSlashCuracao,americaSlashDanmarkshavn,americaSlashDawson,americaSlashDawsonCreek,americaSlashDenver,americaSlashDetroit,americaSlashEdmonton,americaSlashEirunepe,americaSlashElSalvador,americaSlashFortNelson,americaSlashFortaleza,americaSlashGlaceBay,americaSlashGooseBay,americaSlashGrandTurk,americaSlashGuatemala,americaSlashGuayaquil,americaSlashGuyana,americaSlashHalifax,americaSlashHavana,americaSlashHermosillo,americaSlashIndianaSlashIndianapolis,americaSlashIndianaSlashKnox,americaSlashIndianaSlashMarengo,americaSlashIndianaSlashPetersburg,americaSlashIndianaSlashTellCity,americaSlashIndianaSlashVevay,americaSlashIndianaSlashVincennes,americaSlashIndianaSlashWinamac,americaSlashInuvik,americaSlashIqaluit,americaSlashJamaica,americaSlashJuneau,americaSlashKentuckySlashLouisville,americaSlashKentuckySlashMonticello,americaSlashLaPaz,americaSlashLima,americaSlashLosAngeles,americaSlashMaceio,americaSlashManagua,americaSlashManaus,americaSlashMartinique,americaSlashMatamoros,americaSlashMazatlan,americaSlashMenominee,americaSlashMerida,americaSlashMetlakatla,americaSlashMexicoCity,americaSlashMiquelon,americaSlashMoncton,americaSlashMonterrey,americaSlashMontevideo,americaSlashNassau,americaSlashNewYork,americaSlashNipigon,americaSlashNome,americaSlashNoronha,americaSlashNorthDakotaSlashBeulah,americaSlashNorthDakotaSlashCenter,americaSlashNorthDakotaSlashNewSalem,americaSlashNuuk,americaSlashOjinaga,americaSlashPanama,americaSlashPangnirtung,americaSlashParamaribo,americaSlashPhoenix,americaSlashPortMinusAuMinusPrince,americaSlashPortOfSpain,americaSlashPortoVelho,americaSlashPuertoRico,americaSlashPuntaArenas,americaSlashRainyRiver,americaSlashRankinInlet,americaSlashRecife,americaSlashRegina,americaSlashResolute,americaSlashRioBranco,americaSlashSantarem,americaSlashSantiago,americaSlashSantoDomingo,americaSlashSaoPaulo,americaSlashScoresbysund,americaSlashSitka,americaSlashStJohns,americaSlashSwiftCurrent,americaSlashTegucigalpa,americaSlashThule,americaSlashThunderBay,americaSlashTijuana,americaSlashToronto,americaSlashVancouver,americaSlashWhitehorse,americaSlashWinnipeg,americaSlashYakutat,americaSlashYellowknife,antarcticaSlashCasey,antarcticaSlashDavis,antarcticaSlashDumontDUrville,antarcticaSlashMacquarie,antarcticaSlashMawson,antarcticaSlashPalmer,antarcticaSlashRothera,antarcticaSlashSyowa,antarcticaSlashTroll,antarcticaSlashVostok,asiaSlashAlmaty,asiaSlashAmman,asiaSlashAnadyr,asiaSlashAqtau,asiaSlashAqtobe,asiaSlashAshgabat,asiaSlashAtyrau,asiaSlashBaghdad,asiaSlashBaku,asiaSlashBangkok,asiaSlashBarnaul,asiaSlashBeirut,asiaSlashBishkek,asiaSlashBrunei,asiaSlashChita,asiaSlashChoibalsan,asiaSlashColombo,asiaSlashDamascus,asiaSlashDhaka,asiaSlashDili,asiaSlashDubai,asiaSlashDushanbe,asiaSlashFamagusta,asiaSlashGaza,asiaSlashHebron,asiaSlashHoChiMinh,asiaSlashHongKong,asiaSlashHovd,asiaSlashIrkutsk,asiaSlashJakarta,asiaSlashJayapura,asiaSlashJerusalem,asiaSlashKabul,asiaSlashKamchatka,asiaSlashKarachi,asiaSlashKathmandu,asiaSlashKhandyga,asiaSlashKolkata,asiaSlashKrasnoyarsk,asiaSlashKualaLumpur,asiaSlashKuching,asiaSlashMacau,asiaSlashMagadan,asiaSlashMakassar,asiaSlashManila,asiaSlashNicosia,asiaSlashNovokuznetsk,asiaSlashNovosibirsk,asiaSlashOmsk,asiaSlashOral,asiaSlashPontianak,asiaSlashPyongyang,asiaSlashQatar,asiaSlashQostanay,asiaSlashQyzylorda,asiaSlashRiyadh,asiaSlashSakhalin,asiaSlashSamarkand,asiaSlashSeoul,asiaSlashShanghai,asiaSlashSingapore,asiaSlashSrednekolymsk,asiaSlashTaipei,asiaSlashTashkent,asiaSlashTbilisi,asiaSlashTehran,asiaSlashThimphu,asiaSlashTokyo,asiaSlashTomsk,asiaSlashUlaanbaatar,asiaSlashUrumqi,asiaSlashUstMinusNera,asiaSlashVladivostok,asiaSlashYakutsk,asiaSlashYangon,asiaSlashYekaterinburg,asiaSlashYerevan,atlanticSlashAzores,atlanticSlashBermuda,atlanticSlashCanary,atlanticSlashCapeVerde,atlanticSlashFaroe,atlanticSlashMadeira,atlanticSlashReykjavik,atlanticSlashSouthGeorgia,atlanticSlashStanley,australiaSlashAdelaide,australiaSlashBrisbane,australiaSlashBrokenHill,australiaSlashCurrie,australiaSlashDarwin,australiaSlashEucla,australiaSlashHobart,australiaSlashLindeman,australiaSlashLordHowe,australiaSlashMelbourne,australiaSlashPerth,australiaSlashSydney,cET,cST6CDT,eET,eST,eST5EDT,etcSlashGMT,etcSlashGMTPlus1,etcSlashGMTPlus10,etcSlashGMTPlus11,etcSlashGMTPlus12,etcSlashGMTPlus2,etcSlashGMTPlus3,etcSlashGMTPlus4,etcSlashGMTPlus5,etcSlashGMTPlus6,etcSlashGMTPlus7,etcSlashGMTPlus8,etcSlashGMTPlus9,etcSlashGMTMinus1,etcSlashGMTMinus10,etcSlashGMTMinus11,etcSlashGMTMinus12,etcSlashGMTMinus13,etcSlashGMTMinus14,etcSlashGMTMinus2,etcSlashGMTMinus3,etcSlashGMTMinus4,etcSlashGMTMinus5,etcSlashGMTMinus6,etcSlashGMTMinus7,etcSlashGMTMinus8,etcSlashGMTMinus9,etcSlashUTC,europeSlashAmsterdam,europeSlashAndorra,europeSlashAstrakhan,europeSlashAthens,europeSlashBelgrade,europeSlashBerlin,europeSlashBrussels,europeSlashBucharest,europeSlashBudapest,europeSlashChisinau,europeSlashCopenhagen,europeSlashDublin,europeSlashGibraltar,europeSlashHelsinki,europeSlashIstanbul,europeSlashKaliningrad,europeSlashKiev,europeSlashKirov,europeSlashLisbon,europeSlashLondon,europeSlashLuxembourg,europeSlashMadrid,europeSlashMalta,europeSlashMinsk,europeSlashMonaco,europeSlashMoscow,europeSlashOslo,europeSlashParis,europeSlashPrague,europeSlashRiga,europeSlashRome,europeSlashSamara,europeSlashSaratov,europeSlashSimferopol,europeSlashSofia,europeSlashStockholm,europeSlashTallinn,europeSlashTirane,europeSlashUlyanovsk,europeSlashUzhgorod,europeSlashVienna,europeSlashVilnius,europeSlashVolgograd,europeSlashWarsaw,europeSlashZaporozhye,europeSlashZurich,hST,indianSlashChagos,indianSlashChristmas,indianSlashCocos,indianSlashKerguelen,indianSlashMahe,indianSlashMaldives,indianSlashMauritius,indianSlashReunion,mET,mST,mST7MDT,pST8PDT,pacificSlashApia,pacificSlashAuckland,pacificSlashBougainville,pacificSlashChatham,pacificSlashChuuk,pacificSlashEaster,pacificSlashEfate,pacificSlashEnderbury,pacificSlashFakaofo,pacificSlashFiji,pacificSlashFunafuti,pacificSlashGalapagos,pacificSlashGambier,pacificSlashGuadalcanal,pacificSlashGuam,pacificSlashHonolulu,pacificSlashKiritimati,pacificSlashKosrae,pacificSlashKwajalein,pacificSlashMajuro,pacificSlashMarquesas,pacificSlashNauru,pacificSlashNiue,pacificSlashNorfolk,pacificSlashNoumea,pacificSlashPagoPago,pacificSlashPalau,pacificSlashPitcairn,pacificSlashPohnpei,pacificSlashPortMoresby,pacificSlashRarotonga,pacificSlashTahiti,pacificSlashTarawa,pacificSlashTongatapu,pacificSlashWake,pacificSlashWallis,wET,`null`
    */
    enum class Timezone(val value: kotlin.String) {
    
        @JsonProperty("Africa/Abidjan") africaSlashAbidjan("Africa/Abidjan"),
    
        @JsonProperty("Africa/Accra") africaSlashAccra("Africa/Accra"),
    
        @JsonProperty("Africa/Algiers") africaSlashAlgiers("Africa/Algiers"),
    
        @JsonProperty("Africa/Bissau") africaSlashBissau("Africa/Bissau"),
    
        @JsonProperty("Africa/Cairo") africaSlashCairo("Africa/Cairo"),
    
        @JsonProperty("Africa/Casablanca") africaSlashCasablanca("Africa/Casablanca"),
    
        @JsonProperty("Africa/Ceuta") africaSlashCeuta("Africa/Ceuta"),
    
        @JsonProperty("Africa/El_Aaiun") africaSlashElAaiun("Africa/El_Aaiun"),
    
        @JsonProperty("Africa/Johannesburg") africaSlashJohannesburg("Africa/Johannesburg"),
    
        @JsonProperty("Africa/Juba") africaSlashJuba("Africa/Juba"),
    
        @JsonProperty("Africa/Khartoum") africaSlashKhartoum("Africa/Khartoum"),
    
        @JsonProperty("Africa/Lagos") africaSlashLagos("Africa/Lagos"),
    
        @JsonProperty("Africa/Maputo") africaSlashMaputo("Africa/Maputo"),
    
        @JsonProperty("Africa/Monrovia") africaSlashMonrovia("Africa/Monrovia"),
    
        @JsonProperty("Africa/Nairobi") africaSlashNairobi("Africa/Nairobi"),
    
        @JsonProperty("Africa/Ndjamena") africaSlashNdjamena("Africa/Ndjamena"),
    
        @JsonProperty("Africa/Sao_Tome") africaSlashSaoTome("Africa/Sao_Tome"),
    
        @JsonProperty("Africa/Tripoli") africaSlashTripoli("Africa/Tripoli"),
    
        @JsonProperty("Africa/Tunis") africaSlashTunis("Africa/Tunis"),
    
        @JsonProperty("Africa/Windhoek") africaSlashWindhoek("Africa/Windhoek"),
    
        @JsonProperty("America/Adak") americaSlashAdak("America/Adak"),
    
        @JsonProperty("America/Anchorage") americaSlashAnchorage("America/Anchorage"),
    
        @JsonProperty("America/Araguaina") americaSlashAraguaina("America/Araguaina"),
    
        @JsonProperty("America/Argentina/Buenos_Aires") americaSlashArgentinaSlashBuenosAires("America/Argentina/Buenos_Aires"),
    
        @JsonProperty("America/Argentina/Catamarca") americaSlashArgentinaSlashCatamarca("America/Argentina/Catamarca"),
    
        @JsonProperty("America/Argentina/Cordoba") americaSlashArgentinaSlashCordoba("America/Argentina/Cordoba"),
    
        @JsonProperty("America/Argentina/Jujuy") americaSlashArgentinaSlashJujuy("America/Argentina/Jujuy"),
    
        @JsonProperty("America/Argentina/La_Rioja") americaSlashArgentinaSlashLaRioja("America/Argentina/La_Rioja"),
    
        @JsonProperty("America/Argentina/Mendoza") americaSlashArgentinaSlashMendoza("America/Argentina/Mendoza"),
    
        @JsonProperty("America/Argentina/Rio_Gallegos") americaSlashArgentinaSlashRioGallegos("America/Argentina/Rio_Gallegos"),
    
        @JsonProperty("America/Argentina/Salta") americaSlashArgentinaSlashSalta("America/Argentina/Salta"),
    
        @JsonProperty("America/Argentina/San_Juan") americaSlashArgentinaSlashSanJuan("America/Argentina/San_Juan"),
    
        @JsonProperty("America/Argentina/San_Luis") americaSlashArgentinaSlashSanLuis("America/Argentina/San_Luis"),
    
        @JsonProperty("America/Argentina/Tucuman") americaSlashArgentinaSlashTucuman("America/Argentina/Tucuman"),
    
        @JsonProperty("America/Argentina/Ushuaia") americaSlashArgentinaSlashUshuaia("America/Argentina/Ushuaia"),
    
        @JsonProperty("America/Asuncion") americaSlashAsuncion("America/Asuncion"),
    
        @JsonProperty("America/Atikokan") americaSlashAtikokan("America/Atikokan"),
    
        @JsonProperty("America/Bahia") americaSlashBahia("America/Bahia"),
    
        @JsonProperty("America/Bahia_Banderas") americaSlashBahiaBanderas("America/Bahia_Banderas"),
    
        @JsonProperty("America/Barbados") americaSlashBarbados("America/Barbados"),
    
        @JsonProperty("America/Belem") americaSlashBelem("America/Belem"),
    
        @JsonProperty("America/Belize") americaSlashBelize("America/Belize"),
    
        @JsonProperty("America/Blanc-Sablon") americaSlashBlancMinusSablon("America/Blanc-Sablon"),
    
        @JsonProperty("America/Boa_Vista") americaSlashBoaVista("America/Boa_Vista"),
    
        @JsonProperty("America/Bogota") americaSlashBogota("America/Bogota"),
    
        @JsonProperty("America/Boise") americaSlashBoise("America/Boise"),
    
        @JsonProperty("America/Cambridge_Bay") americaSlashCambridgeBay("America/Cambridge_Bay"),
    
        @JsonProperty("America/Campo_Grande") americaSlashCampoGrande("America/Campo_Grande"),
    
        @JsonProperty("America/Cancun") americaSlashCancun("America/Cancun"),
    
        @JsonProperty("America/Caracas") americaSlashCaracas("America/Caracas"),
    
        @JsonProperty("America/Cayenne") americaSlashCayenne("America/Cayenne"),
    
        @JsonProperty("America/Chicago") americaSlashChicago("America/Chicago"),
    
        @JsonProperty("America/Chihuahua") americaSlashChihuahua("America/Chihuahua"),
    
        @JsonProperty("America/Costa_Rica") americaSlashCostaRica("America/Costa_Rica"),
    
        @JsonProperty("America/Creston") americaSlashCreston("America/Creston"),
    
        @JsonProperty("America/Cuiaba") americaSlashCuiaba("America/Cuiaba"),
    
        @JsonProperty("America/Curacao") americaSlashCuracao("America/Curacao"),
    
        @JsonProperty("America/Danmarkshavn") americaSlashDanmarkshavn("America/Danmarkshavn"),
    
        @JsonProperty("America/Dawson") americaSlashDawson("America/Dawson"),
    
        @JsonProperty("America/Dawson_Creek") americaSlashDawsonCreek("America/Dawson_Creek"),
    
        @JsonProperty("America/Denver") americaSlashDenver("America/Denver"),
    
        @JsonProperty("America/Detroit") americaSlashDetroit("America/Detroit"),
    
        @JsonProperty("America/Edmonton") americaSlashEdmonton("America/Edmonton"),
    
        @JsonProperty("America/Eirunepe") americaSlashEirunepe("America/Eirunepe"),
    
        @JsonProperty("America/El_Salvador") americaSlashElSalvador("America/El_Salvador"),
    
        @JsonProperty("America/Fort_Nelson") americaSlashFortNelson("America/Fort_Nelson"),
    
        @JsonProperty("America/Fortaleza") americaSlashFortaleza("America/Fortaleza"),
    
        @JsonProperty("America/Glace_Bay") americaSlashGlaceBay("America/Glace_Bay"),
    
        @JsonProperty("America/Goose_Bay") americaSlashGooseBay("America/Goose_Bay"),
    
        @JsonProperty("America/Grand_Turk") americaSlashGrandTurk("America/Grand_Turk"),
    
        @JsonProperty("America/Guatemala") americaSlashGuatemala("America/Guatemala"),
    
        @JsonProperty("America/Guayaquil") americaSlashGuayaquil("America/Guayaquil"),
    
        @JsonProperty("America/Guyana") americaSlashGuyana("America/Guyana"),
    
        @JsonProperty("America/Halifax") americaSlashHalifax("America/Halifax"),
    
        @JsonProperty("America/Havana") americaSlashHavana("America/Havana"),
    
        @JsonProperty("America/Hermosillo") americaSlashHermosillo("America/Hermosillo"),
    
        @JsonProperty("America/Indiana/Indianapolis") americaSlashIndianaSlashIndianapolis("America/Indiana/Indianapolis"),
    
        @JsonProperty("America/Indiana/Knox") americaSlashIndianaSlashKnox("America/Indiana/Knox"),
    
        @JsonProperty("America/Indiana/Marengo") americaSlashIndianaSlashMarengo("America/Indiana/Marengo"),
    
        @JsonProperty("America/Indiana/Petersburg") americaSlashIndianaSlashPetersburg("America/Indiana/Petersburg"),
    
        @JsonProperty("America/Indiana/Tell_City") americaSlashIndianaSlashTellCity("America/Indiana/Tell_City"),
    
        @JsonProperty("America/Indiana/Vevay") americaSlashIndianaSlashVevay("America/Indiana/Vevay"),
    
        @JsonProperty("America/Indiana/Vincennes") americaSlashIndianaSlashVincennes("America/Indiana/Vincennes"),
    
        @JsonProperty("America/Indiana/Winamac") americaSlashIndianaSlashWinamac("America/Indiana/Winamac"),
    
        @JsonProperty("America/Inuvik") americaSlashInuvik("America/Inuvik"),
    
        @JsonProperty("America/Iqaluit") americaSlashIqaluit("America/Iqaluit"),
    
        @JsonProperty("America/Jamaica") americaSlashJamaica("America/Jamaica"),
    
        @JsonProperty("America/Juneau") americaSlashJuneau("America/Juneau"),
    
        @JsonProperty("America/Kentucky/Louisville") americaSlashKentuckySlashLouisville("America/Kentucky/Louisville"),
    
        @JsonProperty("America/Kentucky/Monticello") americaSlashKentuckySlashMonticello("America/Kentucky/Monticello"),
    
        @JsonProperty("America/La_Paz") americaSlashLaPaz("America/La_Paz"),
    
        @JsonProperty("America/Lima") americaSlashLima("America/Lima"),
    
        @JsonProperty("America/Los_Angeles") americaSlashLosAngeles("America/Los_Angeles"),
    
        @JsonProperty("America/Maceio") americaSlashMaceio("America/Maceio"),
    
        @JsonProperty("America/Managua") americaSlashManagua("America/Managua"),
    
        @JsonProperty("America/Manaus") americaSlashManaus("America/Manaus"),
    
        @JsonProperty("America/Martinique") americaSlashMartinique("America/Martinique"),
    
        @JsonProperty("America/Matamoros") americaSlashMatamoros("America/Matamoros"),
    
        @JsonProperty("America/Mazatlan") americaSlashMazatlan("America/Mazatlan"),
    
        @JsonProperty("America/Menominee") americaSlashMenominee("America/Menominee"),
    
        @JsonProperty("America/Merida") americaSlashMerida("America/Merida"),
    
        @JsonProperty("America/Metlakatla") americaSlashMetlakatla("America/Metlakatla"),
    
        @JsonProperty("America/Mexico_City") americaSlashMexicoCity("America/Mexico_City"),
    
        @JsonProperty("America/Miquelon") americaSlashMiquelon("America/Miquelon"),
    
        @JsonProperty("America/Moncton") americaSlashMoncton("America/Moncton"),
    
        @JsonProperty("America/Monterrey") americaSlashMonterrey("America/Monterrey"),
    
        @JsonProperty("America/Montevideo") americaSlashMontevideo("America/Montevideo"),
    
        @JsonProperty("America/Nassau") americaSlashNassau("America/Nassau"),
    
        @JsonProperty("America/New_York") americaSlashNewYork("America/New_York"),
    
        @JsonProperty("America/Nipigon") americaSlashNipigon("America/Nipigon"),
    
        @JsonProperty("America/Nome") americaSlashNome("America/Nome"),
    
        @JsonProperty("America/Noronha") americaSlashNoronha("America/Noronha"),
    
        @JsonProperty("America/North_Dakota/Beulah") americaSlashNorthDakotaSlashBeulah("America/North_Dakota/Beulah"),
    
        @JsonProperty("America/North_Dakota/Center") americaSlashNorthDakotaSlashCenter("America/North_Dakota/Center"),
    
        @JsonProperty("America/North_Dakota/New_Salem") americaSlashNorthDakotaSlashNewSalem("America/North_Dakota/New_Salem"),
    
        @JsonProperty("America/Nuuk") americaSlashNuuk("America/Nuuk"),
    
        @JsonProperty("America/Ojinaga") americaSlashOjinaga("America/Ojinaga"),
    
        @JsonProperty("America/Panama") americaSlashPanama("America/Panama"),
    
        @JsonProperty("America/Pangnirtung") americaSlashPangnirtung("America/Pangnirtung"),
    
        @JsonProperty("America/Paramaribo") americaSlashParamaribo("America/Paramaribo"),
    
        @JsonProperty("America/Phoenix") americaSlashPhoenix("America/Phoenix"),
    
        @JsonProperty("America/Port-au-Prince") americaSlashPortMinusAuMinusPrince("America/Port-au-Prince"),
    
        @JsonProperty("America/Port_of_Spain") americaSlashPortOfSpain("America/Port_of_Spain"),
    
        @JsonProperty("America/Porto_Velho") americaSlashPortoVelho("America/Porto_Velho"),
    
        @JsonProperty("America/Puerto_Rico") americaSlashPuertoRico("America/Puerto_Rico"),
    
        @JsonProperty("America/Punta_Arenas") americaSlashPuntaArenas("America/Punta_Arenas"),
    
        @JsonProperty("America/Rainy_River") americaSlashRainyRiver("America/Rainy_River"),
    
        @JsonProperty("America/Rankin_Inlet") americaSlashRankinInlet("America/Rankin_Inlet"),
    
        @JsonProperty("America/Recife") americaSlashRecife("America/Recife"),
    
        @JsonProperty("America/Regina") americaSlashRegina("America/Regina"),
    
        @JsonProperty("America/Resolute") americaSlashResolute("America/Resolute"),
    
        @JsonProperty("America/Rio_Branco") americaSlashRioBranco("America/Rio_Branco"),
    
        @JsonProperty("America/Santarem") americaSlashSantarem("America/Santarem"),
    
        @JsonProperty("America/Santiago") americaSlashSantiago("America/Santiago"),
    
        @JsonProperty("America/Santo_Domingo") americaSlashSantoDomingo("America/Santo_Domingo"),
    
        @JsonProperty("America/Sao_Paulo") americaSlashSaoPaulo("America/Sao_Paulo"),
    
        @JsonProperty("America/Scoresbysund") americaSlashScoresbysund("America/Scoresbysund"),
    
        @JsonProperty("America/Sitka") americaSlashSitka("America/Sitka"),
    
        @JsonProperty("America/St_Johns") americaSlashStJohns("America/St_Johns"),
    
        @JsonProperty("America/Swift_Current") americaSlashSwiftCurrent("America/Swift_Current"),
    
        @JsonProperty("America/Tegucigalpa") americaSlashTegucigalpa("America/Tegucigalpa"),
    
        @JsonProperty("America/Thule") americaSlashThule("America/Thule"),
    
        @JsonProperty("America/Thunder_Bay") americaSlashThunderBay("America/Thunder_Bay"),
    
        @JsonProperty("America/Tijuana") americaSlashTijuana("America/Tijuana"),
    
        @JsonProperty("America/Toronto") americaSlashToronto("America/Toronto"),
    
        @JsonProperty("America/Vancouver") americaSlashVancouver("America/Vancouver"),
    
        @JsonProperty("America/Whitehorse") americaSlashWhitehorse("America/Whitehorse"),
    
        @JsonProperty("America/Winnipeg") americaSlashWinnipeg("America/Winnipeg"),
    
        @JsonProperty("America/Yakutat") americaSlashYakutat("America/Yakutat"),
    
        @JsonProperty("America/Yellowknife") americaSlashYellowknife("America/Yellowknife"),
    
        @JsonProperty("Antarctica/Casey") antarcticaSlashCasey("Antarctica/Casey"),
    
        @JsonProperty("Antarctica/Davis") antarcticaSlashDavis("Antarctica/Davis"),
    
        @JsonProperty("Antarctica/DumontDUrville") antarcticaSlashDumontDUrville("Antarctica/DumontDUrville"),
    
        @JsonProperty("Antarctica/Macquarie") antarcticaSlashMacquarie("Antarctica/Macquarie"),
    
        @JsonProperty("Antarctica/Mawson") antarcticaSlashMawson("Antarctica/Mawson"),
    
        @JsonProperty("Antarctica/Palmer") antarcticaSlashPalmer("Antarctica/Palmer"),
    
        @JsonProperty("Antarctica/Rothera") antarcticaSlashRothera("Antarctica/Rothera"),
    
        @JsonProperty("Antarctica/Syowa") antarcticaSlashSyowa("Antarctica/Syowa"),
    
        @JsonProperty("Antarctica/Troll") antarcticaSlashTroll("Antarctica/Troll"),
    
        @JsonProperty("Antarctica/Vostok") antarcticaSlashVostok("Antarctica/Vostok"),
    
        @JsonProperty("Asia/Almaty") asiaSlashAlmaty("Asia/Almaty"),
    
        @JsonProperty("Asia/Amman") asiaSlashAmman("Asia/Amman"),
    
        @JsonProperty("Asia/Anadyr") asiaSlashAnadyr("Asia/Anadyr"),
    
        @JsonProperty("Asia/Aqtau") asiaSlashAqtau("Asia/Aqtau"),
    
        @JsonProperty("Asia/Aqtobe") asiaSlashAqtobe("Asia/Aqtobe"),
    
        @JsonProperty("Asia/Ashgabat") asiaSlashAshgabat("Asia/Ashgabat"),
    
        @JsonProperty("Asia/Atyrau") asiaSlashAtyrau("Asia/Atyrau"),
    
        @JsonProperty("Asia/Baghdad") asiaSlashBaghdad("Asia/Baghdad"),
    
        @JsonProperty("Asia/Baku") asiaSlashBaku("Asia/Baku"),
    
        @JsonProperty("Asia/Bangkok") asiaSlashBangkok("Asia/Bangkok"),
    
        @JsonProperty("Asia/Barnaul") asiaSlashBarnaul("Asia/Barnaul"),
    
        @JsonProperty("Asia/Beirut") asiaSlashBeirut("Asia/Beirut"),
    
        @JsonProperty("Asia/Bishkek") asiaSlashBishkek("Asia/Bishkek"),
    
        @JsonProperty("Asia/Brunei") asiaSlashBrunei("Asia/Brunei"),
    
        @JsonProperty("Asia/Chita") asiaSlashChita("Asia/Chita"),
    
        @JsonProperty("Asia/Choibalsan") asiaSlashChoibalsan("Asia/Choibalsan"),
    
        @JsonProperty("Asia/Colombo") asiaSlashColombo("Asia/Colombo"),
    
        @JsonProperty("Asia/Damascus") asiaSlashDamascus("Asia/Damascus"),
    
        @JsonProperty("Asia/Dhaka") asiaSlashDhaka("Asia/Dhaka"),
    
        @JsonProperty("Asia/Dili") asiaSlashDili("Asia/Dili"),
    
        @JsonProperty("Asia/Dubai") asiaSlashDubai("Asia/Dubai"),
    
        @JsonProperty("Asia/Dushanbe") asiaSlashDushanbe("Asia/Dushanbe"),
    
        @JsonProperty("Asia/Famagusta") asiaSlashFamagusta("Asia/Famagusta"),
    
        @JsonProperty("Asia/Gaza") asiaSlashGaza("Asia/Gaza"),
    
        @JsonProperty("Asia/Hebron") asiaSlashHebron("Asia/Hebron"),
    
        @JsonProperty("Asia/Ho_Chi_Minh") asiaSlashHoChiMinh("Asia/Ho_Chi_Minh"),
    
        @JsonProperty("Asia/Hong_Kong") asiaSlashHongKong("Asia/Hong_Kong"),
    
        @JsonProperty("Asia/Hovd") asiaSlashHovd("Asia/Hovd"),
    
        @JsonProperty("Asia/Irkutsk") asiaSlashIrkutsk("Asia/Irkutsk"),
    
        @JsonProperty("Asia/Jakarta") asiaSlashJakarta("Asia/Jakarta"),
    
        @JsonProperty("Asia/Jayapura") asiaSlashJayapura("Asia/Jayapura"),
    
        @JsonProperty("Asia/Jerusalem") asiaSlashJerusalem("Asia/Jerusalem"),
    
        @JsonProperty("Asia/Kabul") asiaSlashKabul("Asia/Kabul"),
    
        @JsonProperty("Asia/Kamchatka") asiaSlashKamchatka("Asia/Kamchatka"),
    
        @JsonProperty("Asia/Karachi") asiaSlashKarachi("Asia/Karachi"),
    
        @JsonProperty("Asia/Kathmandu") asiaSlashKathmandu("Asia/Kathmandu"),
    
        @JsonProperty("Asia/Khandyga") asiaSlashKhandyga("Asia/Khandyga"),
    
        @JsonProperty("Asia/Kolkata") asiaSlashKolkata("Asia/Kolkata"),
    
        @JsonProperty("Asia/Krasnoyarsk") asiaSlashKrasnoyarsk("Asia/Krasnoyarsk"),
    
        @JsonProperty("Asia/Kuala_Lumpur") asiaSlashKualaLumpur("Asia/Kuala_Lumpur"),
    
        @JsonProperty("Asia/Kuching") asiaSlashKuching("Asia/Kuching"),
    
        @JsonProperty("Asia/Macau") asiaSlashMacau("Asia/Macau"),
    
        @JsonProperty("Asia/Magadan") asiaSlashMagadan("Asia/Magadan"),
    
        @JsonProperty("Asia/Makassar") asiaSlashMakassar("Asia/Makassar"),
    
        @JsonProperty("Asia/Manila") asiaSlashManila("Asia/Manila"),
    
        @JsonProperty("Asia/Nicosia") asiaSlashNicosia("Asia/Nicosia"),
    
        @JsonProperty("Asia/Novokuznetsk") asiaSlashNovokuznetsk("Asia/Novokuznetsk"),
    
        @JsonProperty("Asia/Novosibirsk") asiaSlashNovosibirsk("Asia/Novosibirsk"),
    
        @JsonProperty("Asia/Omsk") asiaSlashOmsk("Asia/Omsk"),
    
        @JsonProperty("Asia/Oral") asiaSlashOral("Asia/Oral"),
    
        @JsonProperty("Asia/Pontianak") asiaSlashPontianak("Asia/Pontianak"),
    
        @JsonProperty("Asia/Pyongyang") asiaSlashPyongyang("Asia/Pyongyang"),
    
        @JsonProperty("Asia/Qatar") asiaSlashQatar("Asia/Qatar"),
    
        @JsonProperty("Asia/Qostanay") asiaSlashQostanay("Asia/Qostanay"),
    
        @JsonProperty("Asia/Qyzylorda") asiaSlashQyzylorda("Asia/Qyzylorda"),
    
        @JsonProperty("Asia/Riyadh") asiaSlashRiyadh("Asia/Riyadh"),
    
        @JsonProperty("Asia/Sakhalin") asiaSlashSakhalin("Asia/Sakhalin"),
    
        @JsonProperty("Asia/Samarkand") asiaSlashSamarkand("Asia/Samarkand"),
    
        @JsonProperty("Asia/Seoul") asiaSlashSeoul("Asia/Seoul"),
    
        @JsonProperty("Asia/Shanghai") asiaSlashShanghai("Asia/Shanghai"),
    
        @JsonProperty("Asia/Singapore") asiaSlashSingapore("Asia/Singapore"),
    
        @JsonProperty("Asia/Srednekolymsk") asiaSlashSrednekolymsk("Asia/Srednekolymsk"),
    
        @JsonProperty("Asia/Taipei") asiaSlashTaipei("Asia/Taipei"),
    
        @JsonProperty("Asia/Tashkent") asiaSlashTashkent("Asia/Tashkent"),
    
        @JsonProperty("Asia/Tbilisi") asiaSlashTbilisi("Asia/Tbilisi"),
    
        @JsonProperty("Asia/Tehran") asiaSlashTehran("Asia/Tehran"),
    
        @JsonProperty("Asia/Thimphu") asiaSlashThimphu("Asia/Thimphu"),
    
        @JsonProperty("Asia/Tokyo") asiaSlashTokyo("Asia/Tokyo"),
    
        @JsonProperty("Asia/Tomsk") asiaSlashTomsk("Asia/Tomsk"),
    
        @JsonProperty("Asia/Ulaanbaatar") asiaSlashUlaanbaatar("Asia/Ulaanbaatar"),
    
        @JsonProperty("Asia/Urumqi") asiaSlashUrumqi("Asia/Urumqi"),
    
        @JsonProperty("Asia/Ust-Nera") asiaSlashUstMinusNera("Asia/Ust-Nera"),
    
        @JsonProperty("Asia/Vladivostok") asiaSlashVladivostok("Asia/Vladivostok"),
    
        @JsonProperty("Asia/Yakutsk") asiaSlashYakutsk("Asia/Yakutsk"),
    
        @JsonProperty("Asia/Yangon") asiaSlashYangon("Asia/Yangon"),
    
        @JsonProperty("Asia/Yekaterinburg") asiaSlashYekaterinburg("Asia/Yekaterinburg"),
    
        @JsonProperty("Asia/Yerevan") asiaSlashYerevan("Asia/Yerevan"),
    
        @JsonProperty("Atlantic/Azores") atlanticSlashAzores("Atlantic/Azores"),
    
        @JsonProperty("Atlantic/Bermuda") atlanticSlashBermuda("Atlantic/Bermuda"),
    
        @JsonProperty("Atlantic/Canary") atlanticSlashCanary("Atlantic/Canary"),
    
        @JsonProperty("Atlantic/Cape_Verde") atlanticSlashCapeVerde("Atlantic/Cape_Verde"),
    
        @JsonProperty("Atlantic/Faroe") atlanticSlashFaroe("Atlantic/Faroe"),
    
        @JsonProperty("Atlantic/Madeira") atlanticSlashMadeira("Atlantic/Madeira"),
    
        @JsonProperty("Atlantic/Reykjavik") atlanticSlashReykjavik("Atlantic/Reykjavik"),
    
        @JsonProperty("Atlantic/South_Georgia") atlanticSlashSouthGeorgia("Atlantic/South_Georgia"),
    
        @JsonProperty("Atlantic/Stanley") atlanticSlashStanley("Atlantic/Stanley"),
    
        @JsonProperty("Australia/Adelaide") australiaSlashAdelaide("Australia/Adelaide"),
    
        @JsonProperty("Australia/Brisbane") australiaSlashBrisbane("Australia/Brisbane"),
    
        @JsonProperty("Australia/Broken_Hill") australiaSlashBrokenHill("Australia/Broken_Hill"),
    
        @JsonProperty("Australia/Currie") australiaSlashCurrie("Australia/Currie"),
    
        @JsonProperty("Australia/Darwin") australiaSlashDarwin("Australia/Darwin"),
    
        @JsonProperty("Australia/Eucla") australiaSlashEucla("Australia/Eucla"),
    
        @JsonProperty("Australia/Hobart") australiaSlashHobart("Australia/Hobart"),
    
        @JsonProperty("Australia/Lindeman") australiaSlashLindeman("Australia/Lindeman"),
    
        @JsonProperty("Australia/Lord_Howe") australiaSlashLordHowe("Australia/Lord_Howe"),
    
        @JsonProperty("Australia/Melbourne") australiaSlashMelbourne("Australia/Melbourne"),
    
        @JsonProperty("Australia/Perth") australiaSlashPerth("Australia/Perth"),
    
        @JsonProperty("Australia/Sydney") australiaSlashSydney("Australia/Sydney"),
    
        @JsonProperty("CET") cET("CET"),
    
        @JsonProperty("CST6CDT") cST6CDT("CST6CDT"),
    
        @JsonProperty("EET") eET("EET"),
    
        @JsonProperty("EST") eST("EST"),
    
        @JsonProperty("EST5EDT") eST5EDT("EST5EDT"),
    
        @JsonProperty("Etc/GMT") etcSlashGMT("Etc/GMT"),
    
        @JsonProperty("Etc/GMT+1") etcSlashGMTPlus1("Etc/GMT+1"),
    
        @JsonProperty("Etc/GMT+10") etcSlashGMTPlus10("Etc/GMT+10"),
    
        @JsonProperty("Etc/GMT+11") etcSlashGMTPlus11("Etc/GMT+11"),
    
        @JsonProperty("Etc/GMT+12") etcSlashGMTPlus12("Etc/GMT+12"),
    
        @JsonProperty("Etc/GMT+2") etcSlashGMTPlus2("Etc/GMT+2"),
    
        @JsonProperty("Etc/GMT+3") etcSlashGMTPlus3("Etc/GMT+3"),
    
        @JsonProperty("Etc/GMT+4") etcSlashGMTPlus4("Etc/GMT+4"),
    
        @JsonProperty("Etc/GMT+5") etcSlashGMTPlus5("Etc/GMT+5"),
    
        @JsonProperty("Etc/GMT+6") etcSlashGMTPlus6("Etc/GMT+6"),
    
        @JsonProperty("Etc/GMT+7") etcSlashGMTPlus7("Etc/GMT+7"),
    
        @JsonProperty("Etc/GMT+8") etcSlashGMTPlus8("Etc/GMT+8"),
    
        @JsonProperty("Etc/GMT+9") etcSlashGMTPlus9("Etc/GMT+9"),
    
        @JsonProperty("Etc/GMT-1") etcSlashGMTMinus1("Etc/GMT-1"),
    
        @JsonProperty("Etc/GMT-10") etcSlashGMTMinus10("Etc/GMT-10"),
    
        @JsonProperty("Etc/GMT-11") etcSlashGMTMinus11("Etc/GMT-11"),
    
        @JsonProperty("Etc/GMT-12") etcSlashGMTMinus12("Etc/GMT-12"),
    
        @JsonProperty("Etc/GMT-13") etcSlashGMTMinus13("Etc/GMT-13"),
    
        @JsonProperty("Etc/GMT-14") etcSlashGMTMinus14("Etc/GMT-14"),
    
        @JsonProperty("Etc/GMT-2") etcSlashGMTMinus2("Etc/GMT-2"),
    
        @JsonProperty("Etc/GMT-3") etcSlashGMTMinus3("Etc/GMT-3"),
    
        @JsonProperty("Etc/GMT-4") etcSlashGMTMinus4("Etc/GMT-4"),
    
        @JsonProperty("Etc/GMT-5") etcSlashGMTMinus5("Etc/GMT-5"),
    
        @JsonProperty("Etc/GMT-6") etcSlashGMTMinus6("Etc/GMT-6"),
    
        @JsonProperty("Etc/GMT-7") etcSlashGMTMinus7("Etc/GMT-7"),
    
        @JsonProperty("Etc/GMT-8") etcSlashGMTMinus8("Etc/GMT-8"),
    
        @JsonProperty("Etc/GMT-9") etcSlashGMTMinus9("Etc/GMT-9"),
    
        @JsonProperty("Etc/UTC") etcSlashUTC("Etc/UTC"),
    
        @JsonProperty("Europe/Amsterdam") europeSlashAmsterdam("Europe/Amsterdam"),
    
        @JsonProperty("Europe/Andorra") europeSlashAndorra("Europe/Andorra"),
    
        @JsonProperty("Europe/Astrakhan") europeSlashAstrakhan("Europe/Astrakhan"),
    
        @JsonProperty("Europe/Athens") europeSlashAthens("Europe/Athens"),
    
        @JsonProperty("Europe/Belgrade") europeSlashBelgrade("Europe/Belgrade"),
    
        @JsonProperty("Europe/Berlin") europeSlashBerlin("Europe/Berlin"),
    
        @JsonProperty("Europe/Brussels") europeSlashBrussels("Europe/Brussels"),
    
        @JsonProperty("Europe/Bucharest") europeSlashBucharest("Europe/Bucharest"),
    
        @JsonProperty("Europe/Budapest") europeSlashBudapest("Europe/Budapest"),
    
        @JsonProperty("Europe/Chisinau") europeSlashChisinau("Europe/Chisinau"),
    
        @JsonProperty("Europe/Copenhagen") europeSlashCopenhagen("Europe/Copenhagen"),
    
        @JsonProperty("Europe/Dublin") europeSlashDublin("Europe/Dublin"),
    
        @JsonProperty("Europe/Gibraltar") europeSlashGibraltar("Europe/Gibraltar"),
    
        @JsonProperty("Europe/Helsinki") europeSlashHelsinki("Europe/Helsinki"),
    
        @JsonProperty("Europe/Istanbul") europeSlashIstanbul("Europe/Istanbul"),
    
        @JsonProperty("Europe/Kaliningrad") europeSlashKaliningrad("Europe/Kaliningrad"),
    
        @JsonProperty("Europe/Kiev") europeSlashKiev("Europe/Kiev"),
    
        @JsonProperty("Europe/Kirov") europeSlashKirov("Europe/Kirov"),
    
        @JsonProperty("Europe/Lisbon") europeSlashLisbon("Europe/Lisbon"),
    
        @JsonProperty("Europe/London") europeSlashLondon("Europe/London"),
    
        @JsonProperty("Europe/Luxembourg") europeSlashLuxembourg("Europe/Luxembourg"),
    
        @JsonProperty("Europe/Madrid") europeSlashMadrid("Europe/Madrid"),
    
        @JsonProperty("Europe/Malta") europeSlashMalta("Europe/Malta"),
    
        @JsonProperty("Europe/Minsk") europeSlashMinsk("Europe/Minsk"),
    
        @JsonProperty("Europe/Monaco") europeSlashMonaco("Europe/Monaco"),
    
        @JsonProperty("Europe/Moscow") europeSlashMoscow("Europe/Moscow"),
    
        @JsonProperty("Europe/Oslo") europeSlashOslo("Europe/Oslo"),
    
        @JsonProperty("Europe/Paris") europeSlashParis("Europe/Paris"),
    
        @JsonProperty("Europe/Prague") europeSlashPrague("Europe/Prague"),
    
        @JsonProperty("Europe/Riga") europeSlashRiga("Europe/Riga"),
    
        @JsonProperty("Europe/Rome") europeSlashRome("Europe/Rome"),
    
        @JsonProperty("Europe/Samara") europeSlashSamara("Europe/Samara"),
    
        @JsonProperty("Europe/Saratov") europeSlashSaratov("Europe/Saratov"),
    
        @JsonProperty("Europe/Simferopol") europeSlashSimferopol("Europe/Simferopol"),
    
        @JsonProperty("Europe/Sofia") europeSlashSofia("Europe/Sofia"),
    
        @JsonProperty("Europe/Stockholm") europeSlashStockholm("Europe/Stockholm"),
    
        @JsonProperty("Europe/Tallinn") europeSlashTallinn("Europe/Tallinn"),
    
        @JsonProperty("Europe/Tirane") europeSlashTirane("Europe/Tirane"),
    
        @JsonProperty("Europe/Ulyanovsk") europeSlashUlyanovsk("Europe/Ulyanovsk"),
    
        @JsonProperty("Europe/Uzhgorod") europeSlashUzhgorod("Europe/Uzhgorod"),
    
        @JsonProperty("Europe/Vienna") europeSlashVienna("Europe/Vienna"),
    
        @JsonProperty("Europe/Vilnius") europeSlashVilnius("Europe/Vilnius"),
    
        @JsonProperty("Europe/Volgograd") europeSlashVolgograd("Europe/Volgograd"),
    
        @JsonProperty("Europe/Warsaw") europeSlashWarsaw("Europe/Warsaw"),
    
        @JsonProperty("Europe/Zaporozhye") europeSlashZaporozhye("Europe/Zaporozhye"),
    
        @JsonProperty("Europe/Zurich") europeSlashZurich("Europe/Zurich"),
    
        @JsonProperty("HST") hST("HST"),
    
        @JsonProperty("Indian/Chagos") indianSlashChagos("Indian/Chagos"),
    
        @JsonProperty("Indian/Christmas") indianSlashChristmas("Indian/Christmas"),
    
        @JsonProperty("Indian/Cocos") indianSlashCocos("Indian/Cocos"),
    
        @JsonProperty("Indian/Kerguelen") indianSlashKerguelen("Indian/Kerguelen"),
    
        @JsonProperty("Indian/Mahe") indianSlashMahe("Indian/Mahe"),
    
        @JsonProperty("Indian/Maldives") indianSlashMaldives("Indian/Maldives"),
    
        @JsonProperty("Indian/Mauritius") indianSlashMauritius("Indian/Mauritius"),
    
        @JsonProperty("Indian/Reunion") indianSlashReunion("Indian/Reunion"),
    
        @JsonProperty("MET") mET("MET"),
    
        @JsonProperty("MST") mST("MST"),
    
        @JsonProperty("MST7MDT") mST7MDT("MST7MDT"),
    
        @JsonProperty("PST8PDT") pST8PDT("PST8PDT"),
    
        @JsonProperty("Pacific/Apia") pacificSlashApia("Pacific/Apia"),
    
        @JsonProperty("Pacific/Auckland") pacificSlashAuckland("Pacific/Auckland"),
    
        @JsonProperty("Pacific/Bougainville") pacificSlashBougainville("Pacific/Bougainville"),
    
        @JsonProperty("Pacific/Chatham") pacificSlashChatham("Pacific/Chatham"),
    
        @JsonProperty("Pacific/Chuuk") pacificSlashChuuk("Pacific/Chuuk"),
    
        @JsonProperty("Pacific/Easter") pacificSlashEaster("Pacific/Easter"),
    
        @JsonProperty("Pacific/Efate") pacificSlashEfate("Pacific/Efate"),
    
        @JsonProperty("Pacific/Enderbury") pacificSlashEnderbury("Pacific/Enderbury"),
    
        @JsonProperty("Pacific/Fakaofo") pacificSlashFakaofo("Pacific/Fakaofo"),
    
        @JsonProperty("Pacific/Fiji") pacificSlashFiji("Pacific/Fiji"),
    
        @JsonProperty("Pacific/Funafuti") pacificSlashFunafuti("Pacific/Funafuti"),
    
        @JsonProperty("Pacific/Galapagos") pacificSlashGalapagos("Pacific/Galapagos"),
    
        @JsonProperty("Pacific/Gambier") pacificSlashGambier("Pacific/Gambier"),
    
        @JsonProperty("Pacific/Guadalcanal") pacificSlashGuadalcanal("Pacific/Guadalcanal"),
    
        @JsonProperty("Pacific/Guam") pacificSlashGuam("Pacific/Guam"),
    
        @JsonProperty("Pacific/Honolulu") pacificSlashHonolulu("Pacific/Honolulu"),
    
        @JsonProperty("Pacific/Kiritimati") pacificSlashKiritimati("Pacific/Kiritimati"),
    
        @JsonProperty("Pacific/Kosrae") pacificSlashKosrae("Pacific/Kosrae"),
    
        @JsonProperty("Pacific/Kwajalein") pacificSlashKwajalein("Pacific/Kwajalein"),
    
        @JsonProperty("Pacific/Majuro") pacificSlashMajuro("Pacific/Majuro"),
    
        @JsonProperty("Pacific/Marquesas") pacificSlashMarquesas("Pacific/Marquesas"),
    
        @JsonProperty("Pacific/Nauru") pacificSlashNauru("Pacific/Nauru"),
    
        @JsonProperty("Pacific/Niue") pacificSlashNiue("Pacific/Niue"),
    
        @JsonProperty("Pacific/Norfolk") pacificSlashNorfolk("Pacific/Norfolk"),
    
        @JsonProperty("Pacific/Noumea") pacificSlashNoumea("Pacific/Noumea"),
    
        @JsonProperty("Pacific/Pago_Pago") pacificSlashPagoPago("Pacific/Pago_Pago"),
    
        @JsonProperty("Pacific/Palau") pacificSlashPalau("Pacific/Palau"),
    
        @JsonProperty("Pacific/Pitcairn") pacificSlashPitcairn("Pacific/Pitcairn"),
    
        @JsonProperty("Pacific/Pohnpei") pacificSlashPohnpei("Pacific/Pohnpei"),
    
        @JsonProperty("Pacific/Port_Moresby") pacificSlashPortMoresby("Pacific/Port_Moresby"),
    
        @JsonProperty("Pacific/Rarotonga") pacificSlashRarotonga("Pacific/Rarotonga"),
    
        @JsonProperty("Pacific/Tahiti") pacificSlashTahiti("Pacific/Tahiti"),
    
        @JsonProperty("Pacific/Tarawa") pacificSlashTarawa("Pacific/Tarawa"),
    
        @JsonProperty("Pacific/Tongatapu") pacificSlashTongatapu("Pacific/Tongatapu"),
    
        @JsonProperty("Pacific/Wake") pacificSlashWake("Pacific/Wake"),
    
        @JsonProperty("Pacific/Wallis") pacificSlashWallis("Pacific/Wallis"),
    
        @JsonProperty("WET") wET("WET"),
    
        @JsonProperty("null") `null`("null");
    
    }

}

