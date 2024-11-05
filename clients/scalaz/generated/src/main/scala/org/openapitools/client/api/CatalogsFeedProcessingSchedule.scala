package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedProcessingSchedule._

case class CatalogsFeedProcessingSchedule (
  /* A time in format HH:MM with leading 0 (zero) */
  time: String,
/* The timezone considered for the processing schedule time. */
  timezone: Timezone)

object CatalogsFeedProcessingSchedule {
  import DateTimeCodecs._
  sealed trait Timezone
  case object AfricaAbidjan extends Timezone
  case object AfricaAccra extends Timezone
  case object AfricaAlgiers extends Timezone
  case object AfricaBissau extends Timezone
  case object AfricaCairo extends Timezone
  case object AfricaCasablanca extends Timezone
  case object AfricaCeuta extends Timezone
  case object AfricaElAaiun extends Timezone
  case object AfricaJohannesburg extends Timezone
  case object AfricaJuba extends Timezone
  case object AfricaKhartoum extends Timezone
  case object AfricaLagos extends Timezone
  case object AfricaMaputo extends Timezone
  case object AfricaMonrovia extends Timezone
  case object AfricaNairobi extends Timezone
  case object AfricaNdjamena extends Timezone
  case object AfricaSaoTome extends Timezone
  case object AfricaTripoli extends Timezone
  case object AfricaTunis extends Timezone
  case object AfricaWindhoek extends Timezone
  case object AmericaAdak extends Timezone
  case object AmericaAnchorage extends Timezone
  case object AmericaAraguaina extends Timezone
  case object AmericaArgentinaBuenosAires extends Timezone
  case object AmericaArgentinaCatamarca extends Timezone
  case object AmericaArgentinaCordoba extends Timezone
  case object AmericaArgentinaJujuy extends Timezone
  case object AmericaArgentinaLaRioja extends Timezone
  case object AmericaArgentinaMendoza extends Timezone
  case object AmericaArgentinaRioGallegos extends Timezone
  case object AmericaArgentinaSalta extends Timezone
  case object AmericaArgentinaSanJuan extends Timezone
  case object AmericaArgentinaSanLuis extends Timezone
  case object AmericaArgentinaTucuman extends Timezone
  case object AmericaArgentinaUshuaia extends Timezone
  case object AmericaAsuncion extends Timezone
  case object AmericaAtikokan extends Timezone
  case object AmericaBahia extends Timezone
  case object AmericaBahiaBanderas extends Timezone
  case object AmericaBarbados extends Timezone
  case object AmericaBelem extends Timezone
  case object AmericaBelize extends Timezone
  case object AmericaBlancSablon extends Timezone
  case object AmericaBoaVista extends Timezone
  case object AmericaBogota extends Timezone
  case object AmericaBoise extends Timezone
  case object AmericaCambridgeBay extends Timezone
  case object AmericaCampoGrande extends Timezone
  case object AmericaCancun extends Timezone
  case object AmericaCaracas extends Timezone
  case object AmericaCayenne extends Timezone
  case object AmericaChicago extends Timezone
  case object AmericaChihuahua extends Timezone
  case object AmericaCostaRica extends Timezone
  case object AmericaCreston extends Timezone
  case object AmericaCuiaba extends Timezone
  case object AmericaCuracao extends Timezone
  case object AmericaDanmarkshavn extends Timezone
  case object AmericaDawson extends Timezone
  case object AmericaDawsonCreek extends Timezone
  case object AmericaDenver extends Timezone
  case object AmericaDetroit extends Timezone
  case object AmericaEdmonton extends Timezone
  case object AmericaEirunepe extends Timezone
  case object AmericaElSalvador extends Timezone
  case object AmericaFortNelson extends Timezone
  case object AmericaFortaleza extends Timezone
  case object AmericaGlaceBay extends Timezone
  case object AmericaGooseBay extends Timezone
  case object AmericaGrandTurk extends Timezone
  case object AmericaGuatemala extends Timezone
  case object AmericaGuayaquil extends Timezone
  case object AmericaGuyana extends Timezone
  case object AmericaHalifax extends Timezone
  case object AmericaHavana extends Timezone
  case object AmericaHermosillo extends Timezone
  case object AmericaIndianaIndianapolis extends Timezone
  case object AmericaIndianaKnox extends Timezone
  case object AmericaIndianaMarengo extends Timezone
  case object AmericaIndianaPetersburg extends Timezone
  case object AmericaIndianaTellCity extends Timezone
  case object AmericaIndianaVevay extends Timezone
  case object AmericaIndianaVincennes extends Timezone
  case object AmericaIndianaWinamac extends Timezone
  case object AmericaInuvik extends Timezone
  case object AmericaIqaluit extends Timezone
  case object AmericaJamaica extends Timezone
  case object AmericaJuneau extends Timezone
  case object AmericaKentuckyLouisville extends Timezone
  case object AmericaKentuckyMonticello extends Timezone
  case object AmericaLaPaz extends Timezone
  case object AmericaLima extends Timezone
  case object AmericaLosAngeles extends Timezone
  case object AmericaMaceio extends Timezone
  case object AmericaManagua extends Timezone
  case object AmericaManaus extends Timezone
  case object AmericaMartinique extends Timezone
  case object AmericaMatamoros extends Timezone
  case object AmericaMazatlan extends Timezone
  case object AmericaMenominee extends Timezone
  case object AmericaMerida extends Timezone
  case object AmericaMetlakatla extends Timezone
  case object AmericaMexicoCity extends Timezone
  case object AmericaMiquelon extends Timezone
  case object AmericaMoncton extends Timezone
  case object AmericaMonterrey extends Timezone
  case object AmericaMontevideo extends Timezone
  case object AmericaNassau extends Timezone
  case object AmericaNewYork extends Timezone
  case object AmericaNipigon extends Timezone
  case object AmericaNome extends Timezone
  case object AmericaNoronha extends Timezone
  case object AmericaNorthDakotaBeulah extends Timezone
  case object AmericaNorthDakotaCenter extends Timezone
  case object AmericaNorthDakotaNewSalem extends Timezone
  case object AmericaNuuk extends Timezone
  case object AmericaOjinaga extends Timezone
  case object AmericaPanama extends Timezone
  case object AmericaPangnirtung extends Timezone
  case object AmericaParamaribo extends Timezone
  case object AmericaPhoenix extends Timezone
  case object AmericaPortAuPrince extends Timezone
  case object AmericaPortOfSpain extends Timezone
  case object AmericaPortoVelho extends Timezone
  case object AmericaPuertoRico extends Timezone
  case object AmericaPuntaArenas extends Timezone
  case object AmericaRainyRiver extends Timezone
  case object AmericaRankinInlet extends Timezone
  case object AmericaRecife extends Timezone
  case object AmericaRegina extends Timezone
  case object AmericaResolute extends Timezone
  case object AmericaRioBranco extends Timezone
  case object AmericaSantarem extends Timezone
  case object AmericaSantiago extends Timezone
  case object AmericaSantoDomingo extends Timezone
  case object AmericaSaoPaulo extends Timezone
  case object AmericaScoresbysund extends Timezone
  case object AmericaSitka extends Timezone
  case object AmericaStJohns extends Timezone
  case object AmericaSwiftCurrent extends Timezone
  case object AmericaTegucigalpa extends Timezone
  case object AmericaThule extends Timezone
  case object AmericaThunderBay extends Timezone
  case object AmericaTijuana extends Timezone
  case object AmericaToronto extends Timezone
  case object AmericaVancouver extends Timezone
  case object AmericaWhitehorse extends Timezone
  case object AmericaWinnipeg extends Timezone
  case object AmericaYakutat extends Timezone
  case object AmericaYellowknife extends Timezone
  case object AntarcticaCasey extends Timezone
  case object AntarcticaDavis extends Timezone
  case object AntarcticaDumontDUrville extends Timezone
  case object AntarcticaMacquarie extends Timezone
  case object AntarcticaMawson extends Timezone
  case object AntarcticaPalmer extends Timezone
  case object AntarcticaRothera extends Timezone
  case object AntarcticaSyowa extends Timezone
  case object AntarcticaTroll extends Timezone
  case object AntarcticaVostok extends Timezone
  case object AsiaAlmaty extends Timezone
  case object AsiaAmman extends Timezone
  case object AsiaAnadyr extends Timezone
  case object AsiaAqtau extends Timezone
  case object AsiaAqtobe extends Timezone
  case object AsiaAshgabat extends Timezone
  case object AsiaAtyrau extends Timezone
  case object AsiaBaghdad extends Timezone
  case object AsiaBaku extends Timezone
  case object AsiaBangkok extends Timezone
  case object AsiaBarnaul extends Timezone
  case object AsiaBeirut extends Timezone
  case object AsiaBishkek extends Timezone
  case object AsiaBrunei extends Timezone
  case object AsiaChita extends Timezone
  case object AsiaChoibalsan extends Timezone
  case object AsiaColombo extends Timezone
  case object AsiaDamascus extends Timezone
  case object AsiaDhaka extends Timezone
  case object AsiaDili extends Timezone
  case object AsiaDubai extends Timezone
  case object AsiaDushanbe extends Timezone
  case object AsiaFamagusta extends Timezone
  case object AsiaGaza extends Timezone
  case object AsiaHebron extends Timezone
  case object AsiaHoChiMinh extends Timezone
  case object AsiaHongKong extends Timezone
  case object AsiaHovd extends Timezone
  case object AsiaIrkutsk extends Timezone
  case object AsiaJakarta extends Timezone
  case object AsiaJayapura extends Timezone
  case object AsiaJerusalem extends Timezone
  case object AsiaKabul extends Timezone
  case object AsiaKamchatka extends Timezone
  case object AsiaKarachi extends Timezone
  case object AsiaKathmandu extends Timezone
  case object AsiaKhandyga extends Timezone
  case object AsiaKolkata extends Timezone
  case object AsiaKrasnoyarsk extends Timezone
  case object AsiaKualaLumpur extends Timezone
  case object AsiaKuching extends Timezone
  case object AsiaMacau extends Timezone
  case object AsiaMagadan extends Timezone
  case object AsiaMakassar extends Timezone
  case object AsiaManila extends Timezone
  case object AsiaNicosia extends Timezone
  case object AsiaNovokuznetsk extends Timezone
  case object AsiaNovosibirsk extends Timezone
  case object AsiaOmsk extends Timezone
  case object AsiaOral extends Timezone
  case object AsiaPontianak extends Timezone
  case object AsiaPyongyang extends Timezone
  case object AsiaQatar extends Timezone
  case object AsiaQostanay extends Timezone
  case object AsiaQyzylorda extends Timezone
  case object AsiaRiyadh extends Timezone
  case object AsiaSakhalin extends Timezone
  case object AsiaSamarkand extends Timezone
  case object AsiaSeoul extends Timezone
  case object AsiaShanghai extends Timezone
  case object AsiaSingapore extends Timezone
  case object AsiaSrednekolymsk extends Timezone
  case object AsiaTaipei extends Timezone
  case object AsiaTashkent extends Timezone
  case object AsiaTbilisi extends Timezone
  case object AsiaTehran extends Timezone
  case object AsiaThimphu extends Timezone
  case object AsiaTokyo extends Timezone
  case object AsiaTomsk extends Timezone
  case object AsiaUlaanbaatar extends Timezone
  case object AsiaUrumqi extends Timezone
  case object AsiaUstNera extends Timezone
  case object AsiaVladivostok extends Timezone
  case object AsiaYakutsk extends Timezone
  case object AsiaYangon extends Timezone
  case object AsiaYekaterinburg extends Timezone
  case object AsiaYerevan extends Timezone
  case object AtlanticAzores extends Timezone
  case object AtlanticBermuda extends Timezone
  case object AtlanticCanary extends Timezone
  case object AtlanticCapeVerde extends Timezone
  case object AtlanticFaroe extends Timezone
  case object AtlanticMadeira extends Timezone
  case object AtlanticReykjavik extends Timezone
  case object AtlanticSouthGeorgia extends Timezone
  case object AtlanticStanley extends Timezone
  case object AustraliaAdelaide extends Timezone
  case object AustraliaBrisbane extends Timezone
  case object AustraliaBrokenHill extends Timezone
  case object AustraliaCurrie extends Timezone
  case object AustraliaDarwin extends Timezone
  case object AustraliaEucla extends Timezone
  case object AustraliaHobart extends Timezone
  case object AustraliaLindeman extends Timezone
  case object AustraliaLordHowe extends Timezone
  case object AustraliaMelbourne extends Timezone
  case object AustraliaPerth extends Timezone
  case object AustraliaSydney extends Timezone
  case object CET extends Timezone
  case object CST6CDT extends Timezone
  case object EET extends Timezone
  case object EST extends Timezone
  case object EST5EDT extends Timezone
  case object EtcGMT extends Timezone
  case object EtcGMT1 extends Timezone
  case object EtcGMT10 extends Timezone
  case object EtcGMT11 extends Timezone
  case object EtcGMT12 extends Timezone
  case object EtcGMT2 extends Timezone
  case object EtcGMT3 extends Timezone
  case object EtcGMT4 extends Timezone
  case object EtcGMT5 extends Timezone
  case object EtcGMT6 extends Timezone
  case object EtcGMT7 extends Timezone
  case object EtcGMT8 extends Timezone
  case object EtcGMT9 extends Timezone
  case object EtcGMT1 extends Timezone
  case object EtcGMT10 extends Timezone
  case object EtcGMT11 extends Timezone
  case object EtcGMT12 extends Timezone
  case object EtcGMT13 extends Timezone
  case object EtcGMT14 extends Timezone
  case object EtcGMT2 extends Timezone
  case object EtcGMT3 extends Timezone
  case object EtcGMT4 extends Timezone
  case object EtcGMT5 extends Timezone
  case object EtcGMT6 extends Timezone
  case object EtcGMT7 extends Timezone
  case object EtcGMT8 extends Timezone
  case object EtcGMT9 extends Timezone
  case object EtcUTC extends Timezone
  case object EuropeAmsterdam extends Timezone
  case object EuropeAndorra extends Timezone
  case object EuropeAstrakhan extends Timezone
  case object EuropeAthens extends Timezone
  case object EuropeBelgrade extends Timezone
  case object EuropeBerlin extends Timezone
  case object EuropeBrussels extends Timezone
  case object EuropeBucharest extends Timezone
  case object EuropeBudapest extends Timezone
  case object EuropeChisinau extends Timezone
  case object EuropeCopenhagen extends Timezone
  case object EuropeDublin extends Timezone
  case object EuropeGibraltar extends Timezone
  case object EuropeHelsinki extends Timezone
  case object EuropeIstanbul extends Timezone
  case object EuropeKaliningrad extends Timezone
  case object EuropeKiev extends Timezone
  case object EuropeKirov extends Timezone
  case object EuropeLisbon extends Timezone
  case object EuropeLondon extends Timezone
  case object EuropeLuxembourg extends Timezone
  case object EuropeMadrid extends Timezone
  case object EuropeMalta extends Timezone
  case object EuropeMinsk extends Timezone
  case object EuropeMonaco extends Timezone
  case object EuropeMoscow extends Timezone
  case object EuropeOslo extends Timezone
  case object EuropeParis extends Timezone
  case object EuropePrague extends Timezone
  case object EuropeRiga extends Timezone
  case object EuropeRome extends Timezone
  case object EuropeSamara extends Timezone
  case object EuropeSaratov extends Timezone
  case object EuropeSimferopol extends Timezone
  case object EuropeSofia extends Timezone
  case object EuropeStockholm extends Timezone
  case object EuropeTallinn extends Timezone
  case object EuropeTirane extends Timezone
  case object EuropeUlyanovsk extends Timezone
  case object EuropeUzhgorod extends Timezone
  case object EuropeVienna extends Timezone
  case object EuropeVilnius extends Timezone
  case object EuropeVolgograd extends Timezone
  case object EuropeWarsaw extends Timezone
  case object EuropeZaporozhye extends Timezone
  case object EuropeZurich extends Timezone
  case object HST extends Timezone
  case object IndianChagos extends Timezone
  case object IndianChristmas extends Timezone
  case object IndianCocos extends Timezone
  case object IndianKerguelen extends Timezone
  case object IndianMahe extends Timezone
  case object IndianMaldives extends Timezone
  case object IndianMauritius extends Timezone
  case object IndianReunion extends Timezone
  case object MET extends Timezone
  case object MST extends Timezone
  case object MST7MDT extends Timezone
  case object PST8PDT extends Timezone
  case object PacificApia extends Timezone
  case object PacificAuckland extends Timezone
  case object PacificBougainville extends Timezone
  case object PacificChatham extends Timezone
  case object PacificChuuk extends Timezone
  case object PacificEaster extends Timezone
  case object PacificEfate extends Timezone
  case object PacificEnderbury extends Timezone
  case object PacificFakaofo extends Timezone
  case object PacificFiji extends Timezone
  case object PacificFunafuti extends Timezone
  case object PacificGalapagos extends Timezone
  case object PacificGambier extends Timezone
  case object PacificGuadalcanal extends Timezone
  case object PacificGuam extends Timezone
  case object PacificHonolulu extends Timezone
  case object PacificKiritimati extends Timezone
  case object PacificKosrae extends Timezone
  case object PacificKwajalein extends Timezone
  case object PacificMajuro extends Timezone
  case object PacificMarquesas extends Timezone
  case object PacificNauru extends Timezone
  case object PacificNiue extends Timezone
  case object PacificNorfolk extends Timezone
  case object PacificNoumea extends Timezone
  case object PacificPagoPago extends Timezone
  case object PacificPalau extends Timezone
  case object PacificPitcairn extends Timezone
  case object PacificPohnpei extends Timezone
  case object PacificPortMoresby extends Timezone
  case object PacificRarotonga extends Timezone
  case object PacificTahiti extends Timezone
  case object PacificTarawa extends Timezone
  case object PacificTongatapu extends Timezone
  case object PacificWake extends Timezone
  case object PacificWallis extends Timezone
  case object WET extends Timezone

  object Timezone {
    def toTimezone(s: String): Option[Timezone] = s match {
      case "AfricaAbidjan" => Some(AfricaAbidjan)
      case "AfricaAccra" => Some(AfricaAccra)
      case "AfricaAlgiers" => Some(AfricaAlgiers)
      case "AfricaBissau" => Some(AfricaBissau)
      case "AfricaCairo" => Some(AfricaCairo)
      case "AfricaCasablanca" => Some(AfricaCasablanca)
      case "AfricaCeuta" => Some(AfricaCeuta)
      case "AfricaElAaiun" => Some(AfricaElAaiun)
      case "AfricaJohannesburg" => Some(AfricaJohannesburg)
      case "AfricaJuba" => Some(AfricaJuba)
      case "AfricaKhartoum" => Some(AfricaKhartoum)
      case "AfricaLagos" => Some(AfricaLagos)
      case "AfricaMaputo" => Some(AfricaMaputo)
      case "AfricaMonrovia" => Some(AfricaMonrovia)
      case "AfricaNairobi" => Some(AfricaNairobi)
      case "AfricaNdjamena" => Some(AfricaNdjamena)
      case "AfricaSaoTome" => Some(AfricaSaoTome)
      case "AfricaTripoli" => Some(AfricaTripoli)
      case "AfricaTunis" => Some(AfricaTunis)
      case "AfricaWindhoek" => Some(AfricaWindhoek)
      case "AmericaAdak" => Some(AmericaAdak)
      case "AmericaAnchorage" => Some(AmericaAnchorage)
      case "AmericaAraguaina" => Some(AmericaAraguaina)
      case "AmericaArgentinaBuenosAires" => Some(AmericaArgentinaBuenosAires)
      case "AmericaArgentinaCatamarca" => Some(AmericaArgentinaCatamarca)
      case "AmericaArgentinaCordoba" => Some(AmericaArgentinaCordoba)
      case "AmericaArgentinaJujuy" => Some(AmericaArgentinaJujuy)
      case "AmericaArgentinaLaRioja" => Some(AmericaArgentinaLaRioja)
      case "AmericaArgentinaMendoza" => Some(AmericaArgentinaMendoza)
      case "AmericaArgentinaRioGallegos" => Some(AmericaArgentinaRioGallegos)
      case "AmericaArgentinaSalta" => Some(AmericaArgentinaSalta)
      case "AmericaArgentinaSanJuan" => Some(AmericaArgentinaSanJuan)
      case "AmericaArgentinaSanLuis" => Some(AmericaArgentinaSanLuis)
      case "AmericaArgentinaTucuman" => Some(AmericaArgentinaTucuman)
      case "AmericaArgentinaUshuaia" => Some(AmericaArgentinaUshuaia)
      case "AmericaAsuncion" => Some(AmericaAsuncion)
      case "AmericaAtikokan" => Some(AmericaAtikokan)
      case "AmericaBahia" => Some(AmericaBahia)
      case "AmericaBahiaBanderas" => Some(AmericaBahiaBanderas)
      case "AmericaBarbados" => Some(AmericaBarbados)
      case "AmericaBelem" => Some(AmericaBelem)
      case "AmericaBelize" => Some(AmericaBelize)
      case "AmericaBlancSablon" => Some(AmericaBlancSablon)
      case "AmericaBoaVista" => Some(AmericaBoaVista)
      case "AmericaBogota" => Some(AmericaBogota)
      case "AmericaBoise" => Some(AmericaBoise)
      case "AmericaCambridgeBay" => Some(AmericaCambridgeBay)
      case "AmericaCampoGrande" => Some(AmericaCampoGrande)
      case "AmericaCancun" => Some(AmericaCancun)
      case "AmericaCaracas" => Some(AmericaCaracas)
      case "AmericaCayenne" => Some(AmericaCayenne)
      case "AmericaChicago" => Some(AmericaChicago)
      case "AmericaChihuahua" => Some(AmericaChihuahua)
      case "AmericaCostaRica" => Some(AmericaCostaRica)
      case "AmericaCreston" => Some(AmericaCreston)
      case "AmericaCuiaba" => Some(AmericaCuiaba)
      case "AmericaCuracao" => Some(AmericaCuracao)
      case "AmericaDanmarkshavn" => Some(AmericaDanmarkshavn)
      case "AmericaDawson" => Some(AmericaDawson)
      case "AmericaDawsonCreek" => Some(AmericaDawsonCreek)
      case "AmericaDenver" => Some(AmericaDenver)
      case "AmericaDetroit" => Some(AmericaDetroit)
      case "AmericaEdmonton" => Some(AmericaEdmonton)
      case "AmericaEirunepe" => Some(AmericaEirunepe)
      case "AmericaElSalvador" => Some(AmericaElSalvador)
      case "AmericaFortNelson" => Some(AmericaFortNelson)
      case "AmericaFortaleza" => Some(AmericaFortaleza)
      case "AmericaGlaceBay" => Some(AmericaGlaceBay)
      case "AmericaGooseBay" => Some(AmericaGooseBay)
      case "AmericaGrandTurk" => Some(AmericaGrandTurk)
      case "AmericaGuatemala" => Some(AmericaGuatemala)
      case "AmericaGuayaquil" => Some(AmericaGuayaquil)
      case "AmericaGuyana" => Some(AmericaGuyana)
      case "AmericaHalifax" => Some(AmericaHalifax)
      case "AmericaHavana" => Some(AmericaHavana)
      case "AmericaHermosillo" => Some(AmericaHermosillo)
      case "AmericaIndianaIndianapolis" => Some(AmericaIndianaIndianapolis)
      case "AmericaIndianaKnox" => Some(AmericaIndianaKnox)
      case "AmericaIndianaMarengo" => Some(AmericaIndianaMarengo)
      case "AmericaIndianaPetersburg" => Some(AmericaIndianaPetersburg)
      case "AmericaIndianaTellCity" => Some(AmericaIndianaTellCity)
      case "AmericaIndianaVevay" => Some(AmericaIndianaVevay)
      case "AmericaIndianaVincennes" => Some(AmericaIndianaVincennes)
      case "AmericaIndianaWinamac" => Some(AmericaIndianaWinamac)
      case "AmericaInuvik" => Some(AmericaInuvik)
      case "AmericaIqaluit" => Some(AmericaIqaluit)
      case "AmericaJamaica" => Some(AmericaJamaica)
      case "AmericaJuneau" => Some(AmericaJuneau)
      case "AmericaKentuckyLouisville" => Some(AmericaKentuckyLouisville)
      case "AmericaKentuckyMonticello" => Some(AmericaKentuckyMonticello)
      case "AmericaLaPaz" => Some(AmericaLaPaz)
      case "AmericaLima" => Some(AmericaLima)
      case "AmericaLosAngeles" => Some(AmericaLosAngeles)
      case "AmericaMaceio" => Some(AmericaMaceio)
      case "AmericaManagua" => Some(AmericaManagua)
      case "AmericaManaus" => Some(AmericaManaus)
      case "AmericaMartinique" => Some(AmericaMartinique)
      case "AmericaMatamoros" => Some(AmericaMatamoros)
      case "AmericaMazatlan" => Some(AmericaMazatlan)
      case "AmericaMenominee" => Some(AmericaMenominee)
      case "AmericaMerida" => Some(AmericaMerida)
      case "AmericaMetlakatla" => Some(AmericaMetlakatla)
      case "AmericaMexicoCity" => Some(AmericaMexicoCity)
      case "AmericaMiquelon" => Some(AmericaMiquelon)
      case "AmericaMoncton" => Some(AmericaMoncton)
      case "AmericaMonterrey" => Some(AmericaMonterrey)
      case "AmericaMontevideo" => Some(AmericaMontevideo)
      case "AmericaNassau" => Some(AmericaNassau)
      case "AmericaNewYork" => Some(AmericaNewYork)
      case "AmericaNipigon" => Some(AmericaNipigon)
      case "AmericaNome" => Some(AmericaNome)
      case "AmericaNoronha" => Some(AmericaNoronha)
      case "AmericaNorthDakotaBeulah" => Some(AmericaNorthDakotaBeulah)
      case "AmericaNorthDakotaCenter" => Some(AmericaNorthDakotaCenter)
      case "AmericaNorthDakotaNewSalem" => Some(AmericaNorthDakotaNewSalem)
      case "AmericaNuuk" => Some(AmericaNuuk)
      case "AmericaOjinaga" => Some(AmericaOjinaga)
      case "AmericaPanama" => Some(AmericaPanama)
      case "AmericaPangnirtung" => Some(AmericaPangnirtung)
      case "AmericaParamaribo" => Some(AmericaParamaribo)
      case "AmericaPhoenix" => Some(AmericaPhoenix)
      case "AmericaPortAuPrince" => Some(AmericaPortAuPrince)
      case "AmericaPortOfSpain" => Some(AmericaPortOfSpain)
      case "AmericaPortoVelho" => Some(AmericaPortoVelho)
      case "AmericaPuertoRico" => Some(AmericaPuertoRico)
      case "AmericaPuntaArenas" => Some(AmericaPuntaArenas)
      case "AmericaRainyRiver" => Some(AmericaRainyRiver)
      case "AmericaRankinInlet" => Some(AmericaRankinInlet)
      case "AmericaRecife" => Some(AmericaRecife)
      case "AmericaRegina" => Some(AmericaRegina)
      case "AmericaResolute" => Some(AmericaResolute)
      case "AmericaRioBranco" => Some(AmericaRioBranco)
      case "AmericaSantarem" => Some(AmericaSantarem)
      case "AmericaSantiago" => Some(AmericaSantiago)
      case "AmericaSantoDomingo" => Some(AmericaSantoDomingo)
      case "AmericaSaoPaulo" => Some(AmericaSaoPaulo)
      case "AmericaScoresbysund" => Some(AmericaScoresbysund)
      case "AmericaSitka" => Some(AmericaSitka)
      case "AmericaStJohns" => Some(AmericaStJohns)
      case "AmericaSwiftCurrent" => Some(AmericaSwiftCurrent)
      case "AmericaTegucigalpa" => Some(AmericaTegucigalpa)
      case "AmericaThule" => Some(AmericaThule)
      case "AmericaThunderBay" => Some(AmericaThunderBay)
      case "AmericaTijuana" => Some(AmericaTijuana)
      case "AmericaToronto" => Some(AmericaToronto)
      case "AmericaVancouver" => Some(AmericaVancouver)
      case "AmericaWhitehorse" => Some(AmericaWhitehorse)
      case "AmericaWinnipeg" => Some(AmericaWinnipeg)
      case "AmericaYakutat" => Some(AmericaYakutat)
      case "AmericaYellowknife" => Some(AmericaYellowknife)
      case "AntarcticaCasey" => Some(AntarcticaCasey)
      case "AntarcticaDavis" => Some(AntarcticaDavis)
      case "AntarcticaDumontDUrville" => Some(AntarcticaDumontDUrville)
      case "AntarcticaMacquarie" => Some(AntarcticaMacquarie)
      case "AntarcticaMawson" => Some(AntarcticaMawson)
      case "AntarcticaPalmer" => Some(AntarcticaPalmer)
      case "AntarcticaRothera" => Some(AntarcticaRothera)
      case "AntarcticaSyowa" => Some(AntarcticaSyowa)
      case "AntarcticaTroll" => Some(AntarcticaTroll)
      case "AntarcticaVostok" => Some(AntarcticaVostok)
      case "AsiaAlmaty" => Some(AsiaAlmaty)
      case "AsiaAmman" => Some(AsiaAmman)
      case "AsiaAnadyr" => Some(AsiaAnadyr)
      case "AsiaAqtau" => Some(AsiaAqtau)
      case "AsiaAqtobe" => Some(AsiaAqtobe)
      case "AsiaAshgabat" => Some(AsiaAshgabat)
      case "AsiaAtyrau" => Some(AsiaAtyrau)
      case "AsiaBaghdad" => Some(AsiaBaghdad)
      case "AsiaBaku" => Some(AsiaBaku)
      case "AsiaBangkok" => Some(AsiaBangkok)
      case "AsiaBarnaul" => Some(AsiaBarnaul)
      case "AsiaBeirut" => Some(AsiaBeirut)
      case "AsiaBishkek" => Some(AsiaBishkek)
      case "AsiaBrunei" => Some(AsiaBrunei)
      case "AsiaChita" => Some(AsiaChita)
      case "AsiaChoibalsan" => Some(AsiaChoibalsan)
      case "AsiaColombo" => Some(AsiaColombo)
      case "AsiaDamascus" => Some(AsiaDamascus)
      case "AsiaDhaka" => Some(AsiaDhaka)
      case "AsiaDili" => Some(AsiaDili)
      case "AsiaDubai" => Some(AsiaDubai)
      case "AsiaDushanbe" => Some(AsiaDushanbe)
      case "AsiaFamagusta" => Some(AsiaFamagusta)
      case "AsiaGaza" => Some(AsiaGaza)
      case "AsiaHebron" => Some(AsiaHebron)
      case "AsiaHoChiMinh" => Some(AsiaHoChiMinh)
      case "AsiaHongKong" => Some(AsiaHongKong)
      case "AsiaHovd" => Some(AsiaHovd)
      case "AsiaIrkutsk" => Some(AsiaIrkutsk)
      case "AsiaJakarta" => Some(AsiaJakarta)
      case "AsiaJayapura" => Some(AsiaJayapura)
      case "AsiaJerusalem" => Some(AsiaJerusalem)
      case "AsiaKabul" => Some(AsiaKabul)
      case "AsiaKamchatka" => Some(AsiaKamchatka)
      case "AsiaKarachi" => Some(AsiaKarachi)
      case "AsiaKathmandu" => Some(AsiaKathmandu)
      case "AsiaKhandyga" => Some(AsiaKhandyga)
      case "AsiaKolkata" => Some(AsiaKolkata)
      case "AsiaKrasnoyarsk" => Some(AsiaKrasnoyarsk)
      case "AsiaKualaLumpur" => Some(AsiaKualaLumpur)
      case "AsiaKuching" => Some(AsiaKuching)
      case "AsiaMacau" => Some(AsiaMacau)
      case "AsiaMagadan" => Some(AsiaMagadan)
      case "AsiaMakassar" => Some(AsiaMakassar)
      case "AsiaManila" => Some(AsiaManila)
      case "AsiaNicosia" => Some(AsiaNicosia)
      case "AsiaNovokuznetsk" => Some(AsiaNovokuznetsk)
      case "AsiaNovosibirsk" => Some(AsiaNovosibirsk)
      case "AsiaOmsk" => Some(AsiaOmsk)
      case "AsiaOral" => Some(AsiaOral)
      case "AsiaPontianak" => Some(AsiaPontianak)
      case "AsiaPyongyang" => Some(AsiaPyongyang)
      case "AsiaQatar" => Some(AsiaQatar)
      case "AsiaQostanay" => Some(AsiaQostanay)
      case "AsiaQyzylorda" => Some(AsiaQyzylorda)
      case "AsiaRiyadh" => Some(AsiaRiyadh)
      case "AsiaSakhalin" => Some(AsiaSakhalin)
      case "AsiaSamarkand" => Some(AsiaSamarkand)
      case "AsiaSeoul" => Some(AsiaSeoul)
      case "AsiaShanghai" => Some(AsiaShanghai)
      case "AsiaSingapore" => Some(AsiaSingapore)
      case "AsiaSrednekolymsk" => Some(AsiaSrednekolymsk)
      case "AsiaTaipei" => Some(AsiaTaipei)
      case "AsiaTashkent" => Some(AsiaTashkent)
      case "AsiaTbilisi" => Some(AsiaTbilisi)
      case "AsiaTehran" => Some(AsiaTehran)
      case "AsiaThimphu" => Some(AsiaThimphu)
      case "AsiaTokyo" => Some(AsiaTokyo)
      case "AsiaTomsk" => Some(AsiaTomsk)
      case "AsiaUlaanbaatar" => Some(AsiaUlaanbaatar)
      case "AsiaUrumqi" => Some(AsiaUrumqi)
      case "AsiaUstNera" => Some(AsiaUstNera)
      case "AsiaVladivostok" => Some(AsiaVladivostok)
      case "AsiaYakutsk" => Some(AsiaYakutsk)
      case "AsiaYangon" => Some(AsiaYangon)
      case "AsiaYekaterinburg" => Some(AsiaYekaterinburg)
      case "AsiaYerevan" => Some(AsiaYerevan)
      case "AtlanticAzores" => Some(AtlanticAzores)
      case "AtlanticBermuda" => Some(AtlanticBermuda)
      case "AtlanticCanary" => Some(AtlanticCanary)
      case "AtlanticCapeVerde" => Some(AtlanticCapeVerde)
      case "AtlanticFaroe" => Some(AtlanticFaroe)
      case "AtlanticMadeira" => Some(AtlanticMadeira)
      case "AtlanticReykjavik" => Some(AtlanticReykjavik)
      case "AtlanticSouthGeorgia" => Some(AtlanticSouthGeorgia)
      case "AtlanticStanley" => Some(AtlanticStanley)
      case "AustraliaAdelaide" => Some(AustraliaAdelaide)
      case "AustraliaBrisbane" => Some(AustraliaBrisbane)
      case "AustraliaBrokenHill" => Some(AustraliaBrokenHill)
      case "AustraliaCurrie" => Some(AustraliaCurrie)
      case "AustraliaDarwin" => Some(AustraliaDarwin)
      case "AustraliaEucla" => Some(AustraliaEucla)
      case "AustraliaHobart" => Some(AustraliaHobart)
      case "AustraliaLindeman" => Some(AustraliaLindeman)
      case "AustraliaLordHowe" => Some(AustraliaLordHowe)
      case "AustraliaMelbourne" => Some(AustraliaMelbourne)
      case "AustraliaPerth" => Some(AustraliaPerth)
      case "AustraliaSydney" => Some(AustraliaSydney)
      case "CET" => Some(CET)
      case "CST6CDT" => Some(CST6CDT)
      case "EET" => Some(EET)
      case "EST" => Some(EST)
      case "EST5EDT" => Some(EST5EDT)
      case "EtcGMT" => Some(EtcGMT)
      case "EtcGMT1" => Some(EtcGMT1)
      case "EtcGMT10" => Some(EtcGMT10)
      case "EtcGMT11" => Some(EtcGMT11)
      case "EtcGMT12" => Some(EtcGMT12)
      case "EtcGMT2" => Some(EtcGMT2)
      case "EtcGMT3" => Some(EtcGMT3)
      case "EtcGMT4" => Some(EtcGMT4)
      case "EtcGMT5" => Some(EtcGMT5)
      case "EtcGMT6" => Some(EtcGMT6)
      case "EtcGMT7" => Some(EtcGMT7)
      case "EtcGMT8" => Some(EtcGMT8)
      case "EtcGMT9" => Some(EtcGMT9)
      case "EtcGMT1" => Some(EtcGMT1)
      case "EtcGMT10" => Some(EtcGMT10)
      case "EtcGMT11" => Some(EtcGMT11)
      case "EtcGMT12" => Some(EtcGMT12)
      case "EtcGMT13" => Some(EtcGMT13)
      case "EtcGMT14" => Some(EtcGMT14)
      case "EtcGMT2" => Some(EtcGMT2)
      case "EtcGMT3" => Some(EtcGMT3)
      case "EtcGMT4" => Some(EtcGMT4)
      case "EtcGMT5" => Some(EtcGMT5)
      case "EtcGMT6" => Some(EtcGMT6)
      case "EtcGMT7" => Some(EtcGMT7)
      case "EtcGMT8" => Some(EtcGMT8)
      case "EtcGMT9" => Some(EtcGMT9)
      case "EtcUTC" => Some(EtcUTC)
      case "EuropeAmsterdam" => Some(EuropeAmsterdam)
      case "EuropeAndorra" => Some(EuropeAndorra)
      case "EuropeAstrakhan" => Some(EuropeAstrakhan)
      case "EuropeAthens" => Some(EuropeAthens)
      case "EuropeBelgrade" => Some(EuropeBelgrade)
      case "EuropeBerlin" => Some(EuropeBerlin)
      case "EuropeBrussels" => Some(EuropeBrussels)
      case "EuropeBucharest" => Some(EuropeBucharest)
      case "EuropeBudapest" => Some(EuropeBudapest)
      case "EuropeChisinau" => Some(EuropeChisinau)
      case "EuropeCopenhagen" => Some(EuropeCopenhagen)
      case "EuropeDublin" => Some(EuropeDublin)
      case "EuropeGibraltar" => Some(EuropeGibraltar)
      case "EuropeHelsinki" => Some(EuropeHelsinki)
      case "EuropeIstanbul" => Some(EuropeIstanbul)
      case "EuropeKaliningrad" => Some(EuropeKaliningrad)
      case "EuropeKiev" => Some(EuropeKiev)
      case "EuropeKirov" => Some(EuropeKirov)
      case "EuropeLisbon" => Some(EuropeLisbon)
      case "EuropeLondon" => Some(EuropeLondon)
      case "EuropeLuxembourg" => Some(EuropeLuxembourg)
      case "EuropeMadrid" => Some(EuropeMadrid)
      case "EuropeMalta" => Some(EuropeMalta)
      case "EuropeMinsk" => Some(EuropeMinsk)
      case "EuropeMonaco" => Some(EuropeMonaco)
      case "EuropeMoscow" => Some(EuropeMoscow)
      case "EuropeOslo" => Some(EuropeOslo)
      case "EuropeParis" => Some(EuropeParis)
      case "EuropePrague" => Some(EuropePrague)
      case "EuropeRiga" => Some(EuropeRiga)
      case "EuropeRome" => Some(EuropeRome)
      case "EuropeSamara" => Some(EuropeSamara)
      case "EuropeSaratov" => Some(EuropeSaratov)
      case "EuropeSimferopol" => Some(EuropeSimferopol)
      case "EuropeSofia" => Some(EuropeSofia)
      case "EuropeStockholm" => Some(EuropeStockholm)
      case "EuropeTallinn" => Some(EuropeTallinn)
      case "EuropeTirane" => Some(EuropeTirane)
      case "EuropeUlyanovsk" => Some(EuropeUlyanovsk)
      case "EuropeUzhgorod" => Some(EuropeUzhgorod)
      case "EuropeVienna" => Some(EuropeVienna)
      case "EuropeVilnius" => Some(EuropeVilnius)
      case "EuropeVolgograd" => Some(EuropeVolgograd)
      case "EuropeWarsaw" => Some(EuropeWarsaw)
      case "EuropeZaporozhye" => Some(EuropeZaporozhye)
      case "EuropeZurich" => Some(EuropeZurich)
      case "HST" => Some(HST)
      case "IndianChagos" => Some(IndianChagos)
      case "IndianChristmas" => Some(IndianChristmas)
      case "IndianCocos" => Some(IndianCocos)
      case "IndianKerguelen" => Some(IndianKerguelen)
      case "IndianMahe" => Some(IndianMahe)
      case "IndianMaldives" => Some(IndianMaldives)
      case "IndianMauritius" => Some(IndianMauritius)
      case "IndianReunion" => Some(IndianReunion)
      case "MET" => Some(MET)
      case "MST" => Some(MST)
      case "MST7MDT" => Some(MST7MDT)
      case "PST8PDT" => Some(PST8PDT)
      case "PacificApia" => Some(PacificApia)
      case "PacificAuckland" => Some(PacificAuckland)
      case "PacificBougainville" => Some(PacificBougainville)
      case "PacificChatham" => Some(PacificChatham)
      case "PacificChuuk" => Some(PacificChuuk)
      case "PacificEaster" => Some(PacificEaster)
      case "PacificEfate" => Some(PacificEfate)
      case "PacificEnderbury" => Some(PacificEnderbury)
      case "PacificFakaofo" => Some(PacificFakaofo)
      case "PacificFiji" => Some(PacificFiji)
      case "PacificFunafuti" => Some(PacificFunafuti)
      case "PacificGalapagos" => Some(PacificGalapagos)
      case "PacificGambier" => Some(PacificGambier)
      case "PacificGuadalcanal" => Some(PacificGuadalcanal)
      case "PacificGuam" => Some(PacificGuam)
      case "PacificHonolulu" => Some(PacificHonolulu)
      case "PacificKiritimati" => Some(PacificKiritimati)
      case "PacificKosrae" => Some(PacificKosrae)
      case "PacificKwajalein" => Some(PacificKwajalein)
      case "PacificMajuro" => Some(PacificMajuro)
      case "PacificMarquesas" => Some(PacificMarquesas)
      case "PacificNauru" => Some(PacificNauru)
      case "PacificNiue" => Some(PacificNiue)
      case "PacificNorfolk" => Some(PacificNorfolk)
      case "PacificNoumea" => Some(PacificNoumea)
      case "PacificPagoPago" => Some(PacificPagoPago)
      case "PacificPalau" => Some(PacificPalau)
      case "PacificPitcairn" => Some(PacificPitcairn)
      case "PacificPohnpei" => Some(PacificPohnpei)
      case "PacificPortMoresby" => Some(PacificPortMoresby)
      case "PacificRarotonga" => Some(PacificRarotonga)
      case "PacificTahiti" => Some(PacificTahiti)
      case "PacificTarawa" => Some(PacificTarawa)
      case "PacificTongatapu" => Some(PacificTongatapu)
      case "PacificWake" => Some(PacificWake)
      case "PacificWallis" => Some(PacificWallis)
      case "WET" => Some(WET)
      case _ => None
    }

    def fromTimezone(x: Timezone): String = x match {
      case AfricaAbidjan => "AfricaAbidjan"
      case AfricaAccra => "AfricaAccra"
      case AfricaAlgiers => "AfricaAlgiers"
      case AfricaBissau => "AfricaBissau"
      case AfricaCairo => "AfricaCairo"
      case AfricaCasablanca => "AfricaCasablanca"
      case AfricaCeuta => "AfricaCeuta"
      case AfricaElAaiun => "AfricaElAaiun"
      case AfricaJohannesburg => "AfricaJohannesburg"
      case AfricaJuba => "AfricaJuba"
      case AfricaKhartoum => "AfricaKhartoum"
      case AfricaLagos => "AfricaLagos"
      case AfricaMaputo => "AfricaMaputo"
      case AfricaMonrovia => "AfricaMonrovia"
      case AfricaNairobi => "AfricaNairobi"
      case AfricaNdjamena => "AfricaNdjamena"
      case AfricaSaoTome => "AfricaSaoTome"
      case AfricaTripoli => "AfricaTripoli"
      case AfricaTunis => "AfricaTunis"
      case AfricaWindhoek => "AfricaWindhoek"
      case AmericaAdak => "AmericaAdak"
      case AmericaAnchorage => "AmericaAnchorage"
      case AmericaAraguaina => "AmericaAraguaina"
      case AmericaArgentinaBuenosAires => "AmericaArgentinaBuenosAires"
      case AmericaArgentinaCatamarca => "AmericaArgentinaCatamarca"
      case AmericaArgentinaCordoba => "AmericaArgentinaCordoba"
      case AmericaArgentinaJujuy => "AmericaArgentinaJujuy"
      case AmericaArgentinaLaRioja => "AmericaArgentinaLaRioja"
      case AmericaArgentinaMendoza => "AmericaArgentinaMendoza"
      case AmericaArgentinaRioGallegos => "AmericaArgentinaRioGallegos"
      case AmericaArgentinaSalta => "AmericaArgentinaSalta"
      case AmericaArgentinaSanJuan => "AmericaArgentinaSanJuan"
      case AmericaArgentinaSanLuis => "AmericaArgentinaSanLuis"
      case AmericaArgentinaTucuman => "AmericaArgentinaTucuman"
      case AmericaArgentinaUshuaia => "AmericaArgentinaUshuaia"
      case AmericaAsuncion => "AmericaAsuncion"
      case AmericaAtikokan => "AmericaAtikokan"
      case AmericaBahia => "AmericaBahia"
      case AmericaBahiaBanderas => "AmericaBahiaBanderas"
      case AmericaBarbados => "AmericaBarbados"
      case AmericaBelem => "AmericaBelem"
      case AmericaBelize => "AmericaBelize"
      case AmericaBlancSablon => "AmericaBlancSablon"
      case AmericaBoaVista => "AmericaBoaVista"
      case AmericaBogota => "AmericaBogota"
      case AmericaBoise => "AmericaBoise"
      case AmericaCambridgeBay => "AmericaCambridgeBay"
      case AmericaCampoGrande => "AmericaCampoGrande"
      case AmericaCancun => "AmericaCancun"
      case AmericaCaracas => "AmericaCaracas"
      case AmericaCayenne => "AmericaCayenne"
      case AmericaChicago => "AmericaChicago"
      case AmericaChihuahua => "AmericaChihuahua"
      case AmericaCostaRica => "AmericaCostaRica"
      case AmericaCreston => "AmericaCreston"
      case AmericaCuiaba => "AmericaCuiaba"
      case AmericaCuracao => "AmericaCuracao"
      case AmericaDanmarkshavn => "AmericaDanmarkshavn"
      case AmericaDawson => "AmericaDawson"
      case AmericaDawsonCreek => "AmericaDawsonCreek"
      case AmericaDenver => "AmericaDenver"
      case AmericaDetroit => "AmericaDetroit"
      case AmericaEdmonton => "AmericaEdmonton"
      case AmericaEirunepe => "AmericaEirunepe"
      case AmericaElSalvador => "AmericaElSalvador"
      case AmericaFortNelson => "AmericaFortNelson"
      case AmericaFortaleza => "AmericaFortaleza"
      case AmericaGlaceBay => "AmericaGlaceBay"
      case AmericaGooseBay => "AmericaGooseBay"
      case AmericaGrandTurk => "AmericaGrandTurk"
      case AmericaGuatemala => "AmericaGuatemala"
      case AmericaGuayaquil => "AmericaGuayaquil"
      case AmericaGuyana => "AmericaGuyana"
      case AmericaHalifax => "AmericaHalifax"
      case AmericaHavana => "AmericaHavana"
      case AmericaHermosillo => "AmericaHermosillo"
      case AmericaIndianaIndianapolis => "AmericaIndianaIndianapolis"
      case AmericaIndianaKnox => "AmericaIndianaKnox"
      case AmericaIndianaMarengo => "AmericaIndianaMarengo"
      case AmericaIndianaPetersburg => "AmericaIndianaPetersburg"
      case AmericaIndianaTellCity => "AmericaIndianaTellCity"
      case AmericaIndianaVevay => "AmericaIndianaVevay"
      case AmericaIndianaVincennes => "AmericaIndianaVincennes"
      case AmericaIndianaWinamac => "AmericaIndianaWinamac"
      case AmericaInuvik => "AmericaInuvik"
      case AmericaIqaluit => "AmericaIqaluit"
      case AmericaJamaica => "AmericaJamaica"
      case AmericaJuneau => "AmericaJuneau"
      case AmericaKentuckyLouisville => "AmericaKentuckyLouisville"
      case AmericaKentuckyMonticello => "AmericaKentuckyMonticello"
      case AmericaLaPaz => "AmericaLaPaz"
      case AmericaLima => "AmericaLima"
      case AmericaLosAngeles => "AmericaLosAngeles"
      case AmericaMaceio => "AmericaMaceio"
      case AmericaManagua => "AmericaManagua"
      case AmericaManaus => "AmericaManaus"
      case AmericaMartinique => "AmericaMartinique"
      case AmericaMatamoros => "AmericaMatamoros"
      case AmericaMazatlan => "AmericaMazatlan"
      case AmericaMenominee => "AmericaMenominee"
      case AmericaMerida => "AmericaMerida"
      case AmericaMetlakatla => "AmericaMetlakatla"
      case AmericaMexicoCity => "AmericaMexicoCity"
      case AmericaMiquelon => "AmericaMiquelon"
      case AmericaMoncton => "AmericaMoncton"
      case AmericaMonterrey => "AmericaMonterrey"
      case AmericaMontevideo => "AmericaMontevideo"
      case AmericaNassau => "AmericaNassau"
      case AmericaNewYork => "AmericaNewYork"
      case AmericaNipigon => "AmericaNipigon"
      case AmericaNome => "AmericaNome"
      case AmericaNoronha => "AmericaNoronha"
      case AmericaNorthDakotaBeulah => "AmericaNorthDakotaBeulah"
      case AmericaNorthDakotaCenter => "AmericaNorthDakotaCenter"
      case AmericaNorthDakotaNewSalem => "AmericaNorthDakotaNewSalem"
      case AmericaNuuk => "AmericaNuuk"
      case AmericaOjinaga => "AmericaOjinaga"
      case AmericaPanama => "AmericaPanama"
      case AmericaPangnirtung => "AmericaPangnirtung"
      case AmericaParamaribo => "AmericaParamaribo"
      case AmericaPhoenix => "AmericaPhoenix"
      case AmericaPortAuPrince => "AmericaPortAuPrince"
      case AmericaPortOfSpain => "AmericaPortOfSpain"
      case AmericaPortoVelho => "AmericaPortoVelho"
      case AmericaPuertoRico => "AmericaPuertoRico"
      case AmericaPuntaArenas => "AmericaPuntaArenas"
      case AmericaRainyRiver => "AmericaRainyRiver"
      case AmericaRankinInlet => "AmericaRankinInlet"
      case AmericaRecife => "AmericaRecife"
      case AmericaRegina => "AmericaRegina"
      case AmericaResolute => "AmericaResolute"
      case AmericaRioBranco => "AmericaRioBranco"
      case AmericaSantarem => "AmericaSantarem"
      case AmericaSantiago => "AmericaSantiago"
      case AmericaSantoDomingo => "AmericaSantoDomingo"
      case AmericaSaoPaulo => "AmericaSaoPaulo"
      case AmericaScoresbysund => "AmericaScoresbysund"
      case AmericaSitka => "AmericaSitka"
      case AmericaStJohns => "AmericaStJohns"
      case AmericaSwiftCurrent => "AmericaSwiftCurrent"
      case AmericaTegucigalpa => "AmericaTegucigalpa"
      case AmericaThule => "AmericaThule"
      case AmericaThunderBay => "AmericaThunderBay"
      case AmericaTijuana => "AmericaTijuana"
      case AmericaToronto => "AmericaToronto"
      case AmericaVancouver => "AmericaVancouver"
      case AmericaWhitehorse => "AmericaWhitehorse"
      case AmericaWinnipeg => "AmericaWinnipeg"
      case AmericaYakutat => "AmericaYakutat"
      case AmericaYellowknife => "AmericaYellowknife"
      case AntarcticaCasey => "AntarcticaCasey"
      case AntarcticaDavis => "AntarcticaDavis"
      case AntarcticaDumontDUrville => "AntarcticaDumontDUrville"
      case AntarcticaMacquarie => "AntarcticaMacquarie"
      case AntarcticaMawson => "AntarcticaMawson"
      case AntarcticaPalmer => "AntarcticaPalmer"
      case AntarcticaRothera => "AntarcticaRothera"
      case AntarcticaSyowa => "AntarcticaSyowa"
      case AntarcticaTroll => "AntarcticaTroll"
      case AntarcticaVostok => "AntarcticaVostok"
      case AsiaAlmaty => "AsiaAlmaty"
      case AsiaAmman => "AsiaAmman"
      case AsiaAnadyr => "AsiaAnadyr"
      case AsiaAqtau => "AsiaAqtau"
      case AsiaAqtobe => "AsiaAqtobe"
      case AsiaAshgabat => "AsiaAshgabat"
      case AsiaAtyrau => "AsiaAtyrau"
      case AsiaBaghdad => "AsiaBaghdad"
      case AsiaBaku => "AsiaBaku"
      case AsiaBangkok => "AsiaBangkok"
      case AsiaBarnaul => "AsiaBarnaul"
      case AsiaBeirut => "AsiaBeirut"
      case AsiaBishkek => "AsiaBishkek"
      case AsiaBrunei => "AsiaBrunei"
      case AsiaChita => "AsiaChita"
      case AsiaChoibalsan => "AsiaChoibalsan"
      case AsiaColombo => "AsiaColombo"
      case AsiaDamascus => "AsiaDamascus"
      case AsiaDhaka => "AsiaDhaka"
      case AsiaDili => "AsiaDili"
      case AsiaDubai => "AsiaDubai"
      case AsiaDushanbe => "AsiaDushanbe"
      case AsiaFamagusta => "AsiaFamagusta"
      case AsiaGaza => "AsiaGaza"
      case AsiaHebron => "AsiaHebron"
      case AsiaHoChiMinh => "AsiaHoChiMinh"
      case AsiaHongKong => "AsiaHongKong"
      case AsiaHovd => "AsiaHovd"
      case AsiaIrkutsk => "AsiaIrkutsk"
      case AsiaJakarta => "AsiaJakarta"
      case AsiaJayapura => "AsiaJayapura"
      case AsiaJerusalem => "AsiaJerusalem"
      case AsiaKabul => "AsiaKabul"
      case AsiaKamchatka => "AsiaKamchatka"
      case AsiaKarachi => "AsiaKarachi"
      case AsiaKathmandu => "AsiaKathmandu"
      case AsiaKhandyga => "AsiaKhandyga"
      case AsiaKolkata => "AsiaKolkata"
      case AsiaKrasnoyarsk => "AsiaKrasnoyarsk"
      case AsiaKualaLumpur => "AsiaKualaLumpur"
      case AsiaKuching => "AsiaKuching"
      case AsiaMacau => "AsiaMacau"
      case AsiaMagadan => "AsiaMagadan"
      case AsiaMakassar => "AsiaMakassar"
      case AsiaManila => "AsiaManila"
      case AsiaNicosia => "AsiaNicosia"
      case AsiaNovokuznetsk => "AsiaNovokuznetsk"
      case AsiaNovosibirsk => "AsiaNovosibirsk"
      case AsiaOmsk => "AsiaOmsk"
      case AsiaOral => "AsiaOral"
      case AsiaPontianak => "AsiaPontianak"
      case AsiaPyongyang => "AsiaPyongyang"
      case AsiaQatar => "AsiaQatar"
      case AsiaQostanay => "AsiaQostanay"
      case AsiaQyzylorda => "AsiaQyzylorda"
      case AsiaRiyadh => "AsiaRiyadh"
      case AsiaSakhalin => "AsiaSakhalin"
      case AsiaSamarkand => "AsiaSamarkand"
      case AsiaSeoul => "AsiaSeoul"
      case AsiaShanghai => "AsiaShanghai"
      case AsiaSingapore => "AsiaSingapore"
      case AsiaSrednekolymsk => "AsiaSrednekolymsk"
      case AsiaTaipei => "AsiaTaipei"
      case AsiaTashkent => "AsiaTashkent"
      case AsiaTbilisi => "AsiaTbilisi"
      case AsiaTehran => "AsiaTehran"
      case AsiaThimphu => "AsiaThimphu"
      case AsiaTokyo => "AsiaTokyo"
      case AsiaTomsk => "AsiaTomsk"
      case AsiaUlaanbaatar => "AsiaUlaanbaatar"
      case AsiaUrumqi => "AsiaUrumqi"
      case AsiaUstNera => "AsiaUstNera"
      case AsiaVladivostok => "AsiaVladivostok"
      case AsiaYakutsk => "AsiaYakutsk"
      case AsiaYangon => "AsiaYangon"
      case AsiaYekaterinburg => "AsiaYekaterinburg"
      case AsiaYerevan => "AsiaYerevan"
      case AtlanticAzores => "AtlanticAzores"
      case AtlanticBermuda => "AtlanticBermuda"
      case AtlanticCanary => "AtlanticCanary"
      case AtlanticCapeVerde => "AtlanticCapeVerde"
      case AtlanticFaroe => "AtlanticFaroe"
      case AtlanticMadeira => "AtlanticMadeira"
      case AtlanticReykjavik => "AtlanticReykjavik"
      case AtlanticSouthGeorgia => "AtlanticSouthGeorgia"
      case AtlanticStanley => "AtlanticStanley"
      case AustraliaAdelaide => "AustraliaAdelaide"
      case AustraliaBrisbane => "AustraliaBrisbane"
      case AustraliaBrokenHill => "AustraliaBrokenHill"
      case AustraliaCurrie => "AustraliaCurrie"
      case AustraliaDarwin => "AustraliaDarwin"
      case AustraliaEucla => "AustraliaEucla"
      case AustraliaHobart => "AustraliaHobart"
      case AustraliaLindeman => "AustraliaLindeman"
      case AustraliaLordHowe => "AustraliaLordHowe"
      case AustraliaMelbourne => "AustraliaMelbourne"
      case AustraliaPerth => "AustraliaPerth"
      case AustraliaSydney => "AustraliaSydney"
      case CET => "CET"
      case CST6CDT => "CST6CDT"
      case EET => "EET"
      case EST => "EST"
      case EST5EDT => "EST5EDT"
      case EtcGMT => "EtcGMT"
      case EtcGMT1 => "EtcGMT1"
      case EtcGMT10 => "EtcGMT10"
      case EtcGMT11 => "EtcGMT11"
      case EtcGMT12 => "EtcGMT12"
      case EtcGMT2 => "EtcGMT2"
      case EtcGMT3 => "EtcGMT3"
      case EtcGMT4 => "EtcGMT4"
      case EtcGMT5 => "EtcGMT5"
      case EtcGMT6 => "EtcGMT6"
      case EtcGMT7 => "EtcGMT7"
      case EtcGMT8 => "EtcGMT8"
      case EtcGMT9 => "EtcGMT9"
      case EtcGMT1 => "EtcGMT1"
      case EtcGMT10 => "EtcGMT10"
      case EtcGMT11 => "EtcGMT11"
      case EtcGMT12 => "EtcGMT12"
      case EtcGMT13 => "EtcGMT13"
      case EtcGMT14 => "EtcGMT14"
      case EtcGMT2 => "EtcGMT2"
      case EtcGMT3 => "EtcGMT3"
      case EtcGMT4 => "EtcGMT4"
      case EtcGMT5 => "EtcGMT5"
      case EtcGMT6 => "EtcGMT6"
      case EtcGMT7 => "EtcGMT7"
      case EtcGMT8 => "EtcGMT8"
      case EtcGMT9 => "EtcGMT9"
      case EtcUTC => "EtcUTC"
      case EuropeAmsterdam => "EuropeAmsterdam"
      case EuropeAndorra => "EuropeAndorra"
      case EuropeAstrakhan => "EuropeAstrakhan"
      case EuropeAthens => "EuropeAthens"
      case EuropeBelgrade => "EuropeBelgrade"
      case EuropeBerlin => "EuropeBerlin"
      case EuropeBrussels => "EuropeBrussels"
      case EuropeBucharest => "EuropeBucharest"
      case EuropeBudapest => "EuropeBudapest"
      case EuropeChisinau => "EuropeChisinau"
      case EuropeCopenhagen => "EuropeCopenhagen"
      case EuropeDublin => "EuropeDublin"
      case EuropeGibraltar => "EuropeGibraltar"
      case EuropeHelsinki => "EuropeHelsinki"
      case EuropeIstanbul => "EuropeIstanbul"
      case EuropeKaliningrad => "EuropeKaliningrad"
      case EuropeKiev => "EuropeKiev"
      case EuropeKirov => "EuropeKirov"
      case EuropeLisbon => "EuropeLisbon"
      case EuropeLondon => "EuropeLondon"
      case EuropeLuxembourg => "EuropeLuxembourg"
      case EuropeMadrid => "EuropeMadrid"
      case EuropeMalta => "EuropeMalta"
      case EuropeMinsk => "EuropeMinsk"
      case EuropeMonaco => "EuropeMonaco"
      case EuropeMoscow => "EuropeMoscow"
      case EuropeOslo => "EuropeOslo"
      case EuropeParis => "EuropeParis"
      case EuropePrague => "EuropePrague"
      case EuropeRiga => "EuropeRiga"
      case EuropeRome => "EuropeRome"
      case EuropeSamara => "EuropeSamara"
      case EuropeSaratov => "EuropeSaratov"
      case EuropeSimferopol => "EuropeSimferopol"
      case EuropeSofia => "EuropeSofia"
      case EuropeStockholm => "EuropeStockholm"
      case EuropeTallinn => "EuropeTallinn"
      case EuropeTirane => "EuropeTirane"
      case EuropeUlyanovsk => "EuropeUlyanovsk"
      case EuropeUzhgorod => "EuropeUzhgorod"
      case EuropeVienna => "EuropeVienna"
      case EuropeVilnius => "EuropeVilnius"
      case EuropeVolgograd => "EuropeVolgograd"
      case EuropeWarsaw => "EuropeWarsaw"
      case EuropeZaporozhye => "EuropeZaporozhye"
      case EuropeZurich => "EuropeZurich"
      case HST => "HST"
      case IndianChagos => "IndianChagos"
      case IndianChristmas => "IndianChristmas"
      case IndianCocos => "IndianCocos"
      case IndianKerguelen => "IndianKerguelen"
      case IndianMahe => "IndianMahe"
      case IndianMaldives => "IndianMaldives"
      case IndianMauritius => "IndianMauritius"
      case IndianReunion => "IndianReunion"
      case MET => "MET"
      case MST => "MST"
      case MST7MDT => "MST7MDT"
      case PST8PDT => "PST8PDT"
      case PacificApia => "PacificApia"
      case PacificAuckland => "PacificAuckland"
      case PacificBougainville => "PacificBougainville"
      case PacificChatham => "PacificChatham"
      case PacificChuuk => "PacificChuuk"
      case PacificEaster => "PacificEaster"
      case PacificEfate => "PacificEfate"
      case PacificEnderbury => "PacificEnderbury"
      case PacificFakaofo => "PacificFakaofo"
      case PacificFiji => "PacificFiji"
      case PacificFunafuti => "PacificFunafuti"
      case PacificGalapagos => "PacificGalapagos"
      case PacificGambier => "PacificGambier"
      case PacificGuadalcanal => "PacificGuadalcanal"
      case PacificGuam => "PacificGuam"
      case PacificHonolulu => "PacificHonolulu"
      case PacificKiritimati => "PacificKiritimati"
      case PacificKosrae => "PacificKosrae"
      case PacificKwajalein => "PacificKwajalein"
      case PacificMajuro => "PacificMajuro"
      case PacificMarquesas => "PacificMarquesas"
      case PacificNauru => "PacificNauru"
      case PacificNiue => "PacificNiue"
      case PacificNorfolk => "PacificNorfolk"
      case PacificNoumea => "PacificNoumea"
      case PacificPagoPago => "PacificPagoPago"
      case PacificPalau => "PacificPalau"
      case PacificPitcairn => "PacificPitcairn"
      case PacificPohnpei => "PacificPohnpei"
      case PacificPortMoresby => "PacificPortMoresby"
      case PacificRarotonga => "PacificRarotonga"
      case PacificTahiti => "PacificTahiti"
      case PacificTarawa => "PacificTarawa"
      case PacificTongatapu => "PacificTongatapu"
      case PacificWake => "PacificWake"
      case PacificWallis => "PacificWallis"
      case WET => "WET"
    }
  }

  implicit val TimezoneEnumEncoder: EncodeJson[Timezone] =
    EncodeJson[Timezone](is => StringEncodeJson(Timezone.fromTimezone(is)))

  implicit val TimezoneEnumDecoder: DecodeJson[Timezone] =
    DecodeJson.optionDecoder[Timezone](n => n.string.flatMap(jStr => Timezone.toTimezone(jStr)), "Timezone failed to de-serialize")

  implicit val CatalogsFeedProcessingScheduleCodecJson: CodecJson[CatalogsFeedProcessingSchedule] = CodecJson.derive[CatalogsFeedProcessingSchedule]
  implicit val CatalogsFeedProcessingScheduleDecoder: EntityDecoder[CatalogsFeedProcessingSchedule] = jsonOf[CatalogsFeedProcessingSchedule]
  implicit val CatalogsFeedProcessingScheduleEncoder: EntityEncoder[CatalogsFeedProcessingSchedule] = jsonEncoderOf[CatalogsFeedProcessingSchedule]
}
