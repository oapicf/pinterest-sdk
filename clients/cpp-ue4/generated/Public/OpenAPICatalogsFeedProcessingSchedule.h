/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * OpenAPI spec version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"

namespace OpenAPI
{

/*
 * OpenAPICatalogsFeedProcessingSchedule
 *
 * Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
 */
class OPENAPI_API OpenAPICatalogsFeedProcessingSchedule : public Model
{
public:
    virtual ~OpenAPICatalogsFeedProcessingSchedule() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* A time in format HH:MM with leading 0 (zero) */
	FString Time;
	enum class TimezoneEnum
	{
		AfricaAbidjan,
		AfricaAccra,
		AfricaAlgiers,
		AfricaBissau,
		AfricaCairo,
		AfricaCasablanca,
		AfricaCeuta,
		AfricaElAaiun,
		AfricaJohannesburg,
		AfricaJuba,
		AfricaKhartoum,
		AfricaLagos,
		AfricaMaputo,
		AfricaMonrovia,
		AfricaNairobi,
		AfricaNdjamena,
		AfricaSaoTome,
		AfricaTripoli,
		AfricaTunis,
		AfricaWindhoek,
		AmericaAdak,
		AmericaAnchorage,
		AmericaAraguaina,
		AmericaArgentinaBuenosAires,
		AmericaArgentinaCatamarca,
		AmericaArgentinaCordoba,
		AmericaArgentinaJujuy,
		AmericaArgentinaLaRioja,
		AmericaArgentinaMendoza,
		AmericaArgentinaRioGallegos,
		AmericaArgentinaSalta,
		AmericaArgentinaSanJuan,
		AmericaArgentinaSanLuis,
		AmericaArgentinaTucuman,
		AmericaArgentinaUshuaia,
		AmericaAsuncion,
		AmericaAtikokan,
		AmericaBahia,
		AmericaBahiaBanderas,
		AmericaBarbados,
		AmericaBelem,
		AmericaBelize,
		AmericaBlancSablon,
		AmericaBoaVista,
		AmericaBogota,
		AmericaBoise,
		AmericaCambridgeBay,
		AmericaCampoGrande,
		AmericaCancun,
		AmericaCaracas,
		AmericaCayenne,
		AmericaChicago,
		AmericaChihuahua,
		AmericaCostaRica,
		AmericaCreston,
		AmericaCuiaba,
		AmericaCuracao,
		AmericaDanmarkshavn,
		AmericaDawson,
		AmericaDawsonCreek,
		AmericaDenver,
		AmericaDetroit,
		AmericaEdmonton,
		AmericaEirunepe,
		AmericaElSalvador,
		AmericaFortNelson,
		AmericaFortaleza,
		AmericaGlaceBay,
		AmericaGooseBay,
		AmericaGrandTurk,
		AmericaGuatemala,
		AmericaGuayaquil,
		AmericaGuyana,
		AmericaHalifax,
		AmericaHavana,
		AmericaHermosillo,
		AmericaIndianaIndianapolis,
		AmericaIndianaKnox,
		AmericaIndianaMarengo,
		AmericaIndianaPetersburg,
		AmericaIndianaTellCity,
		AmericaIndianaVevay,
		AmericaIndianaVincennes,
		AmericaIndianaWinamac,
		AmericaInuvik,
		AmericaIqaluit,
		AmericaJamaica,
		AmericaJuneau,
		AmericaKentuckyLouisville,
		AmericaKentuckyMonticello,
		AmericaLaPaz,
		AmericaLima,
		AmericaLosAngeles,
		AmericaMaceio,
		AmericaManagua,
		AmericaManaus,
		AmericaMartinique,
		AmericaMatamoros,
		AmericaMazatlan,
		AmericaMenominee,
		AmericaMerida,
		AmericaMetlakatla,
		AmericaMexicoCity,
		AmericaMiquelon,
		AmericaMoncton,
		AmericaMonterrey,
		AmericaMontevideo,
		AmericaNassau,
		AmericaNewYork,
		AmericaNipigon,
		AmericaNome,
		AmericaNoronha,
		AmericaNorthDakotaBeulah,
		AmericaNorthDakotaCenter,
		AmericaNorthDakotaNewSalem,
		AmericaNuuk,
		AmericaOjinaga,
		AmericaPanama,
		AmericaPangnirtung,
		AmericaParamaribo,
		AmericaPhoenix,
		AmericaPortAuPrince,
		AmericaPortOfSpain,
		AmericaPortoVelho,
		AmericaPuertoRico,
		AmericaPuntaArenas,
		AmericaRainyRiver,
		AmericaRankinInlet,
		AmericaRecife,
		AmericaRegina,
		AmericaResolute,
		AmericaRioBranco,
		AmericaSantarem,
		AmericaSantiago,
		AmericaSantoDomingo,
		AmericaSaoPaulo,
		AmericaScoresbysund,
		AmericaSitka,
		AmericaStJohns,
		AmericaSwiftCurrent,
		AmericaTegucigalpa,
		AmericaThule,
		AmericaThunderBay,
		AmericaTijuana,
		AmericaToronto,
		AmericaVancouver,
		AmericaWhitehorse,
		AmericaWinnipeg,
		AmericaYakutat,
		AmericaYellowknife,
		AntarcticaCasey,
		AntarcticaDavis,
		AntarcticaDumontDUrville,
		AntarcticaMacquarie,
		AntarcticaMawson,
		AntarcticaPalmer,
		AntarcticaRothera,
		AntarcticaSyowa,
		AntarcticaTroll,
		AntarcticaVostok,
		AsiaAlmaty,
		AsiaAmman,
		AsiaAnadyr,
		AsiaAqtau,
		AsiaAqtobe,
		AsiaAshgabat,
		AsiaAtyrau,
		AsiaBaghdad,
		AsiaBaku,
		AsiaBangkok,
		AsiaBarnaul,
		AsiaBeirut,
		AsiaBishkek,
		AsiaBrunei,
		AsiaChita,
		AsiaChoibalsan,
		AsiaColombo,
		AsiaDamascus,
		AsiaDhaka,
		AsiaDili,
		AsiaDubai,
		AsiaDushanbe,
		AsiaFamagusta,
		AsiaGaza,
		AsiaHebron,
		AsiaHoChiMinh,
		AsiaHongKong,
		AsiaHovd,
		AsiaIrkutsk,
		AsiaJakarta,
		AsiaJayapura,
		AsiaJerusalem,
		AsiaKabul,
		AsiaKamchatka,
		AsiaKarachi,
		AsiaKathmandu,
		AsiaKhandyga,
		AsiaKolkata,
		AsiaKrasnoyarsk,
		AsiaKualaLumpur,
		AsiaKuching,
		AsiaMacau,
		AsiaMagadan,
		AsiaMakassar,
		AsiaManila,
		AsiaNicosia,
		AsiaNovokuznetsk,
		AsiaNovosibirsk,
		AsiaOmsk,
		AsiaOral,
		AsiaPontianak,
		AsiaPyongyang,
		AsiaQatar,
		AsiaQostanay,
		AsiaQyzylorda,
		AsiaRiyadh,
		AsiaSakhalin,
		AsiaSamarkand,
		AsiaSeoul,
		AsiaShanghai,
		AsiaSingapore,
		AsiaSrednekolymsk,
		AsiaTaipei,
		AsiaTashkent,
		AsiaTbilisi,
		AsiaTehran,
		AsiaThimphu,
		AsiaTokyo,
		AsiaTomsk,
		AsiaUlaanbaatar,
		AsiaUrumqi,
		AsiaUstNera,
		AsiaVladivostok,
		AsiaYakutsk,
		AsiaYangon,
		AsiaYekaterinburg,
		AsiaYerevan,
		AtlanticAzores,
		AtlanticBermuda,
		AtlanticCanary,
		AtlanticCapeVerde,
		AtlanticFaroe,
		AtlanticMadeira,
		AtlanticReykjavik,
		AtlanticSouthGeorgia,
		AtlanticStanley,
		AustraliaAdelaide,
		AustraliaBrisbane,
		AustraliaBrokenHill,
		AustraliaCurrie,
		AustraliaDarwin,
		AustraliaEucla,
		AustraliaHobart,
		AustraliaLindeman,
		AustraliaLordHowe,
		AustraliaMelbourne,
		AustraliaPerth,
		AustraliaSydney,
		Cet,
		CST6CDT,
		Eet,
		Est,
		EST5EDT,
		EtcGMT,
		EtcGMT1,
		EtcGMT10,
		EtcGMT11,
		EtcGMT122,
		EtcGMT2,
		EtcGMT3,
		EtcGMT4,
		EtcGMT5,
		EtcGMT6,
		EtcGMT7,
		EtcGMT8,
		EtcGMT9,
		EtcGMT12,
		EtcGMT102,
		EtcGMT112,
		EtcGMT122,
		EtcGMT13,
		EtcGMT14,
		EtcGMT22,
		EtcGMT32,
		EtcGMT42,
		EtcGMT52,
		EtcGMT62,
		EtcGMT72,
		EtcGMT82,
		EtcGMT92,
		EtcUTC,
		EuropeAmsterdam,
		EuropeAndorra,
		EuropeAstrakhan,
		EuropeAthens,
		EuropeBelgrade,
		EuropeBerlin,
		EuropeBrussels,
		EuropeBucharest,
		EuropeBudapest,
		EuropeChisinau,
		EuropeCopenhagen,
		EuropeDublin,
		EuropeGibraltar,
		EuropeHelsinki,
		EuropeIstanbul,
		EuropeKaliningrad,
		EuropeKiev,
		EuropeKirov,
		EuropeLisbon,
		EuropeLondon,
		EuropeLuxembourg,
		EuropeMadrid,
		EuropeMalta,
		EuropeMinsk,
		EuropeMonaco,
		EuropeMoscow,
		EuropeOslo,
		EuropeParis,
		EuropePrague,
		EuropeRiga,
		EuropeRome,
		EuropeSamara,
		EuropeSaratov,
		EuropeSimferopol,
		EuropeSofia,
		EuropeStockholm,
		EuropeTallinn,
		EuropeTirane,
		EuropeUlyanovsk,
		EuropeUzhgorod,
		EuropeVienna,
		EuropeVilnius,
		EuropeVolgograd,
		EuropeWarsaw,
		EuropeZaporozhye,
		EuropeZurich,
		Hst,
		IndianChagos,
		IndianChristmas,
		IndianCocos,
		IndianKerguelen,
		IndianMahe,
		IndianMaldives,
		IndianMauritius,
		IndianReunion,
		Met,
		Mst,
		MST7MDT,
		PST8PDT,
		PacificApia,
		PacificAuckland,
		PacificBougainville,
		PacificChatham,
		PacificChuuk,
		PacificEaster,
		PacificEfate,
		PacificEnderbury,
		PacificFakaofo,
		PacificFiji,
		PacificFunafuti,
		PacificGalapagos,
		PacificGambier,
		PacificGuadalcanal,
		PacificGuam,
		PacificHonolulu,
		PacificKiritimati,
		PacificKosrae,
		PacificKwajalein,
		PacificMajuro,
		PacificMarquesas,
		PacificNauru,
		PacificNiue,
		PacificNorfolk,
		PacificNoumea,
		PacificPagoPago,
		PacificPalau,
		PacificPitcairn,
		PacificPohnpei,
		PacificPortMoresby,
		PacificRarotonga,
		PacificTahiti,
		PacificTarawa,
		PacificTongatapu,
		PacificWake,
		PacificWallis,
		Wet,
  	};

	static FString EnumToString(const TimezoneEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, TimezoneEnum& EnumValue);
	/* The timezone considered for the processing schedule time. */
	TOptional<TimezoneEnum> Timezone;
};

}
