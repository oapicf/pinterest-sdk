/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 * Generated by: https://openapi-generator.tech
 */

/// CatalogsFeedProcessingSchedule : Optional daily processing schedule. Use this to configure the preferred time for processing a feed (otherwise random).



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct CatalogsFeedProcessingSchedule {
    /// A time in format HH:MM with leading 0 (zero)
    #[serde(rename = "time")]
    pub time: String,
    /// The timezone considered for the processing schedule time.
    #[serde(rename = "timezone")]
    pub timezone: Option<Timezone>,
}

impl CatalogsFeedProcessingSchedule {
    /// Optional daily processing schedule. Use this to configure the preferred time for processing a feed (otherwise random).
    pub fn new(time: String, timezone: Option<Timezone>) -> CatalogsFeedProcessingSchedule {
        CatalogsFeedProcessingSchedule {
            time,
            timezone,
        }
    }
}

/// The timezone considered for the processing schedule time.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Timezone {
    #[serde(rename = "Africa/Abidjan")]
    AfricaAbidjan,
    #[serde(rename = "Africa/Accra")]
    AfricaAccra,
    #[serde(rename = "Africa/Algiers")]
    AfricaAlgiers,
    #[serde(rename = "Africa/Bissau")]
    AfricaBissau,
    #[serde(rename = "Africa/Cairo")]
    AfricaCairo,
    #[serde(rename = "Africa/Casablanca")]
    AfricaCasablanca,
    #[serde(rename = "Africa/Ceuta")]
    AfricaCeuta,
    #[serde(rename = "Africa/El_Aaiun")]
    AfricaElAaiun,
    #[serde(rename = "Africa/Johannesburg")]
    AfricaJohannesburg,
    #[serde(rename = "Africa/Juba")]
    AfricaJuba,
    #[serde(rename = "Africa/Khartoum")]
    AfricaKhartoum,
    #[serde(rename = "Africa/Lagos")]
    AfricaLagos,
    #[serde(rename = "Africa/Maputo")]
    AfricaMaputo,
    #[serde(rename = "Africa/Monrovia")]
    AfricaMonrovia,
    #[serde(rename = "Africa/Nairobi")]
    AfricaNairobi,
    #[serde(rename = "Africa/Ndjamena")]
    AfricaNdjamena,
    #[serde(rename = "Africa/Sao_Tome")]
    AfricaSaoTome,
    #[serde(rename = "Africa/Tripoli")]
    AfricaTripoli,
    #[serde(rename = "Africa/Tunis")]
    AfricaTunis,
    #[serde(rename = "Africa/Windhoek")]
    AfricaWindhoek,
    #[serde(rename = "America/Adak")]
    AmericaAdak,
    #[serde(rename = "America/Anchorage")]
    AmericaAnchorage,
    #[serde(rename = "America/Araguaina")]
    AmericaAraguaina,
    #[serde(rename = "America/Argentina/Buenos_Aires")]
    AmericaArgentinaBuenosAires,
    #[serde(rename = "America/Argentina/Catamarca")]
    AmericaArgentinaCatamarca,
    #[serde(rename = "America/Argentina/Cordoba")]
    AmericaArgentinaCordoba,
    #[serde(rename = "America/Argentina/Jujuy")]
    AmericaArgentinaJujuy,
    #[serde(rename = "America/Argentina/La_Rioja")]
    AmericaArgentinaLaRioja,
    #[serde(rename = "America/Argentina/Mendoza")]
    AmericaArgentinaMendoza,
    #[serde(rename = "America/Argentina/Rio_Gallegos")]
    AmericaArgentinaRioGallegos,
    #[serde(rename = "America/Argentina/Salta")]
    AmericaArgentinaSalta,
    #[serde(rename = "America/Argentina/San_Juan")]
    AmericaArgentinaSanJuan,
    #[serde(rename = "America/Argentina/San_Luis")]
    AmericaArgentinaSanLuis,
    #[serde(rename = "America/Argentina/Tucuman")]
    AmericaArgentinaTucuman,
    #[serde(rename = "America/Argentina/Ushuaia")]
    AmericaArgentinaUshuaia,
    #[serde(rename = "America/Asuncion")]
    AmericaAsuncion,
    #[serde(rename = "America/Atikokan")]
    AmericaAtikokan,
    #[serde(rename = "America/Bahia")]
    AmericaBahia,
    #[serde(rename = "America/Bahia_Banderas")]
    AmericaBahiaBanderas,
    #[serde(rename = "America/Barbados")]
    AmericaBarbados,
    #[serde(rename = "America/Belem")]
    AmericaBelem,
    #[serde(rename = "America/Belize")]
    AmericaBelize,
    #[serde(rename = "America/Blanc-Sablon")]
    AmericaBlancSablon,
    #[serde(rename = "America/Boa_Vista")]
    AmericaBoaVista,
    #[serde(rename = "America/Bogota")]
    AmericaBogota,
    #[serde(rename = "America/Boise")]
    AmericaBoise,
    #[serde(rename = "America/Cambridge_Bay")]
    AmericaCambridgeBay,
    #[serde(rename = "America/Campo_Grande")]
    AmericaCampoGrande,
    #[serde(rename = "America/Cancun")]
    AmericaCancun,
    #[serde(rename = "America/Caracas")]
    AmericaCaracas,
    #[serde(rename = "America/Cayenne")]
    AmericaCayenne,
    #[serde(rename = "America/Chicago")]
    AmericaChicago,
    #[serde(rename = "America/Chihuahua")]
    AmericaChihuahua,
    #[serde(rename = "America/Costa_Rica")]
    AmericaCostaRica,
    #[serde(rename = "America/Creston")]
    AmericaCreston,
    #[serde(rename = "America/Cuiaba")]
    AmericaCuiaba,
    #[serde(rename = "America/Curacao")]
    AmericaCuracao,
    #[serde(rename = "America/Danmarkshavn")]
    AmericaDanmarkshavn,
    #[serde(rename = "America/Dawson")]
    AmericaDawson,
    #[serde(rename = "America/Dawson_Creek")]
    AmericaDawsonCreek,
    #[serde(rename = "America/Denver")]
    AmericaDenver,
    #[serde(rename = "America/Detroit")]
    AmericaDetroit,
    #[serde(rename = "America/Edmonton")]
    AmericaEdmonton,
    #[serde(rename = "America/Eirunepe")]
    AmericaEirunepe,
    #[serde(rename = "America/El_Salvador")]
    AmericaElSalvador,
    #[serde(rename = "America/Fort_Nelson")]
    AmericaFortNelson,
    #[serde(rename = "America/Fortaleza")]
    AmericaFortaleza,
    #[serde(rename = "America/Glace_Bay")]
    AmericaGlaceBay,
    #[serde(rename = "America/Goose_Bay")]
    AmericaGooseBay,
    #[serde(rename = "America/Grand_Turk")]
    AmericaGrandTurk,
    #[serde(rename = "America/Guatemala")]
    AmericaGuatemala,
    #[serde(rename = "America/Guayaquil")]
    AmericaGuayaquil,
    #[serde(rename = "America/Guyana")]
    AmericaGuyana,
    #[serde(rename = "America/Halifax")]
    AmericaHalifax,
    #[serde(rename = "America/Havana")]
    AmericaHavana,
    #[serde(rename = "America/Hermosillo")]
    AmericaHermosillo,
    #[serde(rename = "America/Indiana/Indianapolis")]
    AmericaIndianaIndianapolis,
    #[serde(rename = "America/Indiana/Knox")]
    AmericaIndianaKnox,
    #[serde(rename = "America/Indiana/Marengo")]
    AmericaIndianaMarengo,
    #[serde(rename = "America/Indiana/Petersburg")]
    AmericaIndianaPetersburg,
    #[serde(rename = "America/Indiana/Tell_City")]
    AmericaIndianaTellCity,
    #[serde(rename = "America/Indiana/Vevay")]
    AmericaIndianaVevay,
    #[serde(rename = "America/Indiana/Vincennes")]
    AmericaIndianaVincennes,
    #[serde(rename = "America/Indiana/Winamac")]
    AmericaIndianaWinamac,
    #[serde(rename = "America/Inuvik")]
    AmericaInuvik,
    #[serde(rename = "America/Iqaluit")]
    AmericaIqaluit,
    #[serde(rename = "America/Jamaica")]
    AmericaJamaica,
    #[serde(rename = "America/Juneau")]
    AmericaJuneau,
    #[serde(rename = "America/Kentucky/Louisville")]
    AmericaKentuckyLouisville,
    #[serde(rename = "America/Kentucky/Monticello")]
    AmericaKentuckyMonticello,
    #[serde(rename = "America/La_Paz")]
    AmericaLaPaz,
    #[serde(rename = "America/Lima")]
    AmericaLima,
    #[serde(rename = "America/Los_Angeles")]
    AmericaLosAngeles,
    #[serde(rename = "America/Maceio")]
    AmericaMaceio,
    #[serde(rename = "America/Managua")]
    AmericaManagua,
    #[serde(rename = "America/Manaus")]
    AmericaManaus,
    #[serde(rename = "America/Martinique")]
    AmericaMartinique,
    #[serde(rename = "America/Matamoros")]
    AmericaMatamoros,
    #[serde(rename = "America/Mazatlan")]
    AmericaMazatlan,
    #[serde(rename = "America/Menominee")]
    AmericaMenominee,
    #[serde(rename = "America/Merida")]
    AmericaMerida,
    #[serde(rename = "America/Metlakatla")]
    AmericaMetlakatla,
    #[serde(rename = "America/Mexico_City")]
    AmericaMexicoCity,
    #[serde(rename = "America/Miquelon")]
    AmericaMiquelon,
    #[serde(rename = "America/Moncton")]
    AmericaMoncton,
    #[serde(rename = "America/Monterrey")]
    AmericaMonterrey,
    #[serde(rename = "America/Montevideo")]
    AmericaMontevideo,
    #[serde(rename = "America/Nassau")]
    AmericaNassau,
    #[serde(rename = "America/New_York")]
    AmericaNewYork,
    #[serde(rename = "America/Nipigon")]
    AmericaNipigon,
    #[serde(rename = "America/Nome")]
    AmericaNome,
    #[serde(rename = "America/Noronha")]
    AmericaNoronha,
    #[serde(rename = "America/North_Dakota/Beulah")]
    AmericaNorthDakotaBeulah,
    #[serde(rename = "America/North_Dakota/Center")]
    AmericaNorthDakotaCenter,
    #[serde(rename = "America/North_Dakota/New_Salem")]
    AmericaNorthDakotaNewSalem,
    #[serde(rename = "America/Nuuk")]
    AmericaNuuk,
    #[serde(rename = "America/Ojinaga")]
    AmericaOjinaga,
    #[serde(rename = "America/Panama")]
    AmericaPanama,
    #[serde(rename = "America/Pangnirtung")]
    AmericaPangnirtung,
    #[serde(rename = "America/Paramaribo")]
    AmericaParamaribo,
    #[serde(rename = "America/Phoenix")]
    AmericaPhoenix,
    #[serde(rename = "America/Port-au-Prince")]
    AmericaPortAuPrince,
    #[serde(rename = "America/Port_of_Spain")]
    AmericaPortOfSpain,
    #[serde(rename = "America/Porto_Velho")]
    AmericaPortoVelho,
    #[serde(rename = "America/Puerto_Rico")]
    AmericaPuertoRico,
    #[serde(rename = "America/Punta_Arenas")]
    AmericaPuntaArenas,
    #[serde(rename = "America/Rainy_River")]
    AmericaRainyRiver,
    #[serde(rename = "America/Rankin_Inlet")]
    AmericaRankinInlet,
    #[serde(rename = "America/Recife")]
    AmericaRecife,
    #[serde(rename = "America/Regina")]
    AmericaRegina,
    #[serde(rename = "America/Resolute")]
    AmericaResolute,
    #[serde(rename = "America/Rio_Branco")]
    AmericaRioBranco,
    #[serde(rename = "America/Santarem")]
    AmericaSantarem,
    #[serde(rename = "America/Santiago")]
    AmericaSantiago,
    #[serde(rename = "America/Santo_Domingo")]
    AmericaSantoDomingo,
    #[serde(rename = "America/Sao_Paulo")]
    AmericaSaoPaulo,
    #[serde(rename = "America/Scoresbysund")]
    AmericaScoresbysund,
    #[serde(rename = "America/Sitka")]
    AmericaSitka,
    #[serde(rename = "America/St_Johns")]
    AmericaStJohns,
    #[serde(rename = "America/Swift_Current")]
    AmericaSwiftCurrent,
    #[serde(rename = "America/Tegucigalpa")]
    AmericaTegucigalpa,
    #[serde(rename = "America/Thule")]
    AmericaThule,
    #[serde(rename = "America/Thunder_Bay")]
    AmericaThunderBay,
    #[serde(rename = "America/Tijuana")]
    AmericaTijuana,
    #[serde(rename = "America/Toronto")]
    AmericaToronto,
    #[serde(rename = "America/Vancouver")]
    AmericaVancouver,
    #[serde(rename = "America/Whitehorse")]
    AmericaWhitehorse,
    #[serde(rename = "America/Winnipeg")]
    AmericaWinnipeg,
    #[serde(rename = "America/Yakutat")]
    AmericaYakutat,
    #[serde(rename = "America/Yellowknife")]
    AmericaYellowknife,
    #[serde(rename = "Antarctica/Casey")]
    AntarcticaCasey,
    #[serde(rename = "Antarctica/Davis")]
    AntarcticaDavis,
    #[serde(rename = "Antarctica/DumontDUrville")]
    AntarcticaDumontDUrville,
    #[serde(rename = "Antarctica/Macquarie")]
    AntarcticaMacquarie,
    #[serde(rename = "Antarctica/Mawson")]
    AntarcticaMawson,
    #[serde(rename = "Antarctica/Palmer")]
    AntarcticaPalmer,
    #[serde(rename = "Antarctica/Rothera")]
    AntarcticaRothera,
    #[serde(rename = "Antarctica/Syowa")]
    AntarcticaSyowa,
    #[serde(rename = "Antarctica/Troll")]
    AntarcticaTroll,
    #[serde(rename = "Antarctica/Vostok")]
    AntarcticaVostok,
    #[serde(rename = "Asia/Almaty")]
    AsiaAlmaty,
    #[serde(rename = "Asia/Amman")]
    AsiaAmman,
    #[serde(rename = "Asia/Anadyr")]
    AsiaAnadyr,
    #[serde(rename = "Asia/Aqtau")]
    AsiaAqtau,
    #[serde(rename = "Asia/Aqtobe")]
    AsiaAqtobe,
    #[serde(rename = "Asia/Ashgabat")]
    AsiaAshgabat,
    #[serde(rename = "Asia/Atyrau")]
    AsiaAtyrau,
    #[serde(rename = "Asia/Baghdad")]
    AsiaBaghdad,
    #[serde(rename = "Asia/Baku")]
    AsiaBaku,
    #[serde(rename = "Asia/Bangkok")]
    AsiaBangkok,
    #[serde(rename = "Asia/Barnaul")]
    AsiaBarnaul,
    #[serde(rename = "Asia/Beirut")]
    AsiaBeirut,
    #[serde(rename = "Asia/Bishkek")]
    AsiaBishkek,
    #[serde(rename = "Asia/Brunei")]
    AsiaBrunei,
    #[serde(rename = "Asia/Chita")]
    AsiaChita,
    #[serde(rename = "Asia/Choibalsan")]
    AsiaChoibalsan,
    #[serde(rename = "Asia/Colombo")]
    AsiaColombo,
    #[serde(rename = "Asia/Damascus")]
    AsiaDamascus,
    #[serde(rename = "Asia/Dhaka")]
    AsiaDhaka,
    #[serde(rename = "Asia/Dili")]
    AsiaDili,
    #[serde(rename = "Asia/Dubai")]
    AsiaDubai,
    #[serde(rename = "Asia/Dushanbe")]
    AsiaDushanbe,
    #[serde(rename = "Asia/Famagusta")]
    AsiaFamagusta,
    #[serde(rename = "Asia/Gaza")]
    AsiaGaza,
    #[serde(rename = "Asia/Hebron")]
    AsiaHebron,
    #[serde(rename = "Asia/Ho_Chi_Minh")]
    AsiaHoChiMinh,
    #[serde(rename = "Asia/Hong_Kong")]
    AsiaHongKong,
    #[serde(rename = "Asia/Hovd")]
    AsiaHovd,
    #[serde(rename = "Asia/Irkutsk")]
    AsiaIrkutsk,
    #[serde(rename = "Asia/Jakarta")]
    AsiaJakarta,
    #[serde(rename = "Asia/Jayapura")]
    AsiaJayapura,
    #[serde(rename = "Asia/Jerusalem")]
    AsiaJerusalem,
    #[serde(rename = "Asia/Kabul")]
    AsiaKabul,
    #[serde(rename = "Asia/Kamchatka")]
    AsiaKamchatka,
    #[serde(rename = "Asia/Karachi")]
    AsiaKarachi,
    #[serde(rename = "Asia/Kathmandu")]
    AsiaKathmandu,
    #[serde(rename = "Asia/Khandyga")]
    AsiaKhandyga,
    #[serde(rename = "Asia/Kolkata")]
    AsiaKolkata,
    #[serde(rename = "Asia/Krasnoyarsk")]
    AsiaKrasnoyarsk,
    #[serde(rename = "Asia/Kuala_Lumpur")]
    AsiaKualaLumpur,
    #[serde(rename = "Asia/Kuching")]
    AsiaKuching,
    #[serde(rename = "Asia/Macau")]
    AsiaMacau,
    #[serde(rename = "Asia/Magadan")]
    AsiaMagadan,
    #[serde(rename = "Asia/Makassar")]
    AsiaMakassar,
    #[serde(rename = "Asia/Manila")]
    AsiaManila,
    #[serde(rename = "Asia/Nicosia")]
    AsiaNicosia,
    #[serde(rename = "Asia/Novokuznetsk")]
    AsiaNovokuznetsk,
    #[serde(rename = "Asia/Novosibirsk")]
    AsiaNovosibirsk,
    #[serde(rename = "Asia/Omsk")]
    AsiaOmsk,
    #[serde(rename = "Asia/Oral")]
    AsiaOral,
    #[serde(rename = "Asia/Pontianak")]
    AsiaPontianak,
    #[serde(rename = "Asia/Pyongyang")]
    AsiaPyongyang,
    #[serde(rename = "Asia/Qatar")]
    AsiaQatar,
    #[serde(rename = "Asia/Qostanay")]
    AsiaQostanay,
    #[serde(rename = "Asia/Qyzylorda")]
    AsiaQyzylorda,
    #[serde(rename = "Asia/Riyadh")]
    AsiaRiyadh,
    #[serde(rename = "Asia/Sakhalin")]
    AsiaSakhalin,
    #[serde(rename = "Asia/Samarkand")]
    AsiaSamarkand,
    #[serde(rename = "Asia/Seoul")]
    AsiaSeoul,
    #[serde(rename = "Asia/Shanghai")]
    AsiaShanghai,
    #[serde(rename = "Asia/Singapore")]
    AsiaSingapore,
    #[serde(rename = "Asia/Srednekolymsk")]
    AsiaSrednekolymsk,
    #[serde(rename = "Asia/Taipei")]
    AsiaTaipei,
    #[serde(rename = "Asia/Tashkent")]
    AsiaTashkent,
    #[serde(rename = "Asia/Tbilisi")]
    AsiaTbilisi,
    #[serde(rename = "Asia/Tehran")]
    AsiaTehran,
    #[serde(rename = "Asia/Thimphu")]
    AsiaThimphu,
    #[serde(rename = "Asia/Tokyo")]
    AsiaTokyo,
    #[serde(rename = "Asia/Tomsk")]
    AsiaTomsk,
    #[serde(rename = "Asia/Ulaanbaatar")]
    AsiaUlaanbaatar,
    #[serde(rename = "Asia/Urumqi")]
    AsiaUrumqi,
    #[serde(rename = "Asia/Ust-Nera")]
    AsiaUstNera,
    #[serde(rename = "Asia/Vladivostok")]
    AsiaVladivostok,
    #[serde(rename = "Asia/Yakutsk")]
    AsiaYakutsk,
    #[serde(rename = "Asia/Yangon")]
    AsiaYangon,
    #[serde(rename = "Asia/Yekaterinburg")]
    AsiaYekaterinburg,
    #[serde(rename = "Asia/Yerevan")]
    AsiaYerevan,
    #[serde(rename = "Atlantic/Azores")]
    AtlanticAzores,
    #[serde(rename = "Atlantic/Bermuda")]
    AtlanticBermuda,
    #[serde(rename = "Atlantic/Canary")]
    AtlanticCanary,
    #[serde(rename = "Atlantic/Cape_Verde")]
    AtlanticCapeVerde,
    #[serde(rename = "Atlantic/Faroe")]
    AtlanticFaroe,
    #[serde(rename = "Atlantic/Madeira")]
    AtlanticMadeira,
    #[serde(rename = "Atlantic/Reykjavik")]
    AtlanticReykjavik,
    #[serde(rename = "Atlantic/South_Georgia")]
    AtlanticSouthGeorgia,
    #[serde(rename = "Atlantic/Stanley")]
    AtlanticStanley,
    #[serde(rename = "Australia/Adelaide")]
    AustraliaAdelaide,
    #[serde(rename = "Australia/Brisbane")]
    AustraliaBrisbane,
    #[serde(rename = "Australia/Broken_Hill")]
    AustraliaBrokenHill,
    #[serde(rename = "Australia/Currie")]
    AustraliaCurrie,
    #[serde(rename = "Australia/Darwin")]
    AustraliaDarwin,
    #[serde(rename = "Australia/Eucla")]
    AustraliaEucla,
    #[serde(rename = "Australia/Hobart")]
    AustraliaHobart,
    #[serde(rename = "Australia/Lindeman")]
    AustraliaLindeman,
    #[serde(rename = "Australia/Lord_Howe")]
    AustraliaLordHowe,
    #[serde(rename = "Australia/Melbourne")]
    AustraliaMelbourne,
    #[serde(rename = "Australia/Perth")]
    AustraliaPerth,
    #[serde(rename = "Australia/Sydney")]
    AustraliaSydney,
    #[serde(rename = "CET")]
    CET,
    #[serde(rename = "CST6CDT")]
    CST6CDT,
    #[serde(rename = "EET")]
    EET,
    #[serde(rename = "EST")]
    EST,
    #[serde(rename = "EST5EDT")]
    EST5EDT,
    #[serde(rename = "Etc/GMT")]
    EtcGMT,
    #[serde(rename = "Etc/GMT+1")]
    EtcGMT1,
    #[serde(rename = "Etc/GMT+10")]
    EtcGMT10,
    #[serde(rename = "Etc/GMT+11")]
    EtcGMT11,
    #[serde(rename = "Etc/GMT+12")]
    EtcGMT12,
    #[serde(rename = "Etc/GMT+2")]
    EtcGMT2,
    #[serde(rename = "Etc/GMT+3")]
    EtcGMT3,
    #[serde(rename = "Etc/GMT+4")]
    EtcGMT4,
    #[serde(rename = "Etc/GMT+5")]
    EtcGMT5,
    #[serde(rename = "Etc/GMT+6")]
    EtcGMT6,
    #[serde(rename = "Etc/GMT+7")]
    EtcGMT7,
    #[serde(rename = "Etc/GMT+8")]
    EtcGMT8,
    #[serde(rename = "Etc/GMT+9")]
    EtcGMT9,
    #[serde(rename = "Etc/GMT-1")]
    EtcGMT1,
    #[serde(rename = "Etc/GMT-10")]
    EtcGMT10,
    #[serde(rename = "Etc/GMT-11")]
    EtcGMT11,
    #[serde(rename = "Etc/GMT-12")]
    EtcGMT12,
    #[serde(rename = "Etc/GMT-13")]
    EtcGMT13,
    #[serde(rename = "Etc/GMT-14")]
    EtcGMT14,
    #[serde(rename = "Etc/GMT-2")]
    EtcGMT2,
    #[serde(rename = "Etc/GMT-3")]
    EtcGMT3,
    #[serde(rename = "Etc/GMT-4")]
    EtcGMT4,
    #[serde(rename = "Etc/GMT-5")]
    EtcGMT5,
    #[serde(rename = "Etc/GMT-6")]
    EtcGMT6,
    #[serde(rename = "Etc/GMT-7")]
    EtcGMT7,
    #[serde(rename = "Etc/GMT-8")]
    EtcGMT8,
    #[serde(rename = "Etc/GMT-9")]
    EtcGMT9,
    #[serde(rename = "Etc/UTC")]
    EtcUTC,
    #[serde(rename = "Europe/Amsterdam")]
    EuropeAmsterdam,
    #[serde(rename = "Europe/Andorra")]
    EuropeAndorra,
    #[serde(rename = "Europe/Astrakhan")]
    EuropeAstrakhan,
    #[serde(rename = "Europe/Athens")]
    EuropeAthens,
    #[serde(rename = "Europe/Belgrade")]
    EuropeBelgrade,
    #[serde(rename = "Europe/Berlin")]
    EuropeBerlin,
    #[serde(rename = "Europe/Brussels")]
    EuropeBrussels,
    #[serde(rename = "Europe/Bucharest")]
    EuropeBucharest,
    #[serde(rename = "Europe/Budapest")]
    EuropeBudapest,
    #[serde(rename = "Europe/Chisinau")]
    EuropeChisinau,
    #[serde(rename = "Europe/Copenhagen")]
    EuropeCopenhagen,
    #[serde(rename = "Europe/Dublin")]
    EuropeDublin,
    #[serde(rename = "Europe/Gibraltar")]
    EuropeGibraltar,
    #[serde(rename = "Europe/Helsinki")]
    EuropeHelsinki,
    #[serde(rename = "Europe/Istanbul")]
    EuropeIstanbul,
    #[serde(rename = "Europe/Kaliningrad")]
    EuropeKaliningrad,
    #[serde(rename = "Europe/Kiev")]
    EuropeKiev,
    #[serde(rename = "Europe/Kirov")]
    EuropeKirov,
    #[serde(rename = "Europe/Lisbon")]
    EuropeLisbon,
    #[serde(rename = "Europe/London")]
    EuropeLondon,
    #[serde(rename = "Europe/Luxembourg")]
    EuropeLuxembourg,
    #[serde(rename = "Europe/Madrid")]
    EuropeMadrid,
    #[serde(rename = "Europe/Malta")]
    EuropeMalta,
    #[serde(rename = "Europe/Minsk")]
    EuropeMinsk,
    #[serde(rename = "Europe/Monaco")]
    EuropeMonaco,
    #[serde(rename = "Europe/Moscow")]
    EuropeMoscow,
    #[serde(rename = "Europe/Oslo")]
    EuropeOslo,
    #[serde(rename = "Europe/Paris")]
    EuropeParis,
    #[serde(rename = "Europe/Prague")]
    EuropePrague,
    #[serde(rename = "Europe/Riga")]
    EuropeRiga,
    #[serde(rename = "Europe/Rome")]
    EuropeRome,
    #[serde(rename = "Europe/Samara")]
    EuropeSamara,
    #[serde(rename = "Europe/Saratov")]
    EuropeSaratov,
    #[serde(rename = "Europe/Simferopol")]
    EuropeSimferopol,
    #[serde(rename = "Europe/Sofia")]
    EuropeSofia,
    #[serde(rename = "Europe/Stockholm")]
    EuropeStockholm,
    #[serde(rename = "Europe/Tallinn")]
    EuropeTallinn,
    #[serde(rename = "Europe/Tirane")]
    EuropeTirane,
    #[serde(rename = "Europe/Ulyanovsk")]
    EuropeUlyanovsk,
    #[serde(rename = "Europe/Uzhgorod")]
    EuropeUzhgorod,
    #[serde(rename = "Europe/Vienna")]
    EuropeVienna,
    #[serde(rename = "Europe/Vilnius")]
    EuropeVilnius,
    #[serde(rename = "Europe/Volgograd")]
    EuropeVolgograd,
    #[serde(rename = "Europe/Warsaw")]
    EuropeWarsaw,
    #[serde(rename = "Europe/Zaporozhye")]
    EuropeZaporozhye,
    #[serde(rename = "Europe/Zurich")]
    EuropeZurich,
    #[serde(rename = "HST")]
    HST,
    #[serde(rename = "Indian/Chagos")]
    IndianChagos,
    #[serde(rename = "Indian/Christmas")]
    IndianChristmas,
    #[serde(rename = "Indian/Cocos")]
    IndianCocos,
    #[serde(rename = "Indian/Kerguelen")]
    IndianKerguelen,
    #[serde(rename = "Indian/Mahe")]
    IndianMahe,
    #[serde(rename = "Indian/Maldives")]
    IndianMaldives,
    #[serde(rename = "Indian/Mauritius")]
    IndianMauritius,
    #[serde(rename = "Indian/Reunion")]
    IndianReunion,
    #[serde(rename = "MET")]
    MET,
    #[serde(rename = "MST")]
    MST,
    #[serde(rename = "MST7MDT")]
    MST7MDT,
    #[serde(rename = "PST8PDT")]
    PST8PDT,
    #[serde(rename = "Pacific/Apia")]
    PacificApia,
    #[serde(rename = "Pacific/Auckland")]
    PacificAuckland,
    #[serde(rename = "Pacific/Bougainville")]
    PacificBougainville,
    #[serde(rename = "Pacific/Chatham")]
    PacificChatham,
    #[serde(rename = "Pacific/Chuuk")]
    PacificChuuk,
    #[serde(rename = "Pacific/Easter")]
    PacificEaster,
    #[serde(rename = "Pacific/Efate")]
    PacificEfate,
    #[serde(rename = "Pacific/Enderbury")]
    PacificEnderbury,
    #[serde(rename = "Pacific/Fakaofo")]
    PacificFakaofo,
    #[serde(rename = "Pacific/Fiji")]
    PacificFiji,
    #[serde(rename = "Pacific/Funafuti")]
    PacificFunafuti,
    #[serde(rename = "Pacific/Galapagos")]
    PacificGalapagos,
    #[serde(rename = "Pacific/Gambier")]
    PacificGambier,
    #[serde(rename = "Pacific/Guadalcanal")]
    PacificGuadalcanal,
    #[serde(rename = "Pacific/Guam")]
    PacificGuam,
    #[serde(rename = "Pacific/Honolulu")]
    PacificHonolulu,
    #[serde(rename = "Pacific/Kiritimati")]
    PacificKiritimati,
    #[serde(rename = "Pacific/Kosrae")]
    PacificKosrae,
    #[serde(rename = "Pacific/Kwajalein")]
    PacificKwajalein,
    #[serde(rename = "Pacific/Majuro")]
    PacificMajuro,
    #[serde(rename = "Pacific/Marquesas")]
    PacificMarquesas,
    #[serde(rename = "Pacific/Nauru")]
    PacificNauru,
    #[serde(rename = "Pacific/Niue")]
    PacificNiue,
    #[serde(rename = "Pacific/Norfolk")]
    PacificNorfolk,
    #[serde(rename = "Pacific/Noumea")]
    PacificNoumea,
    #[serde(rename = "Pacific/Pago_Pago")]
    PacificPagoPago,
    #[serde(rename = "Pacific/Palau")]
    PacificPalau,
    #[serde(rename = "Pacific/Pitcairn")]
    PacificPitcairn,
    #[serde(rename = "Pacific/Pohnpei")]
    PacificPohnpei,
    #[serde(rename = "Pacific/Port_Moresby")]
    PacificPortMoresby,
    #[serde(rename = "Pacific/Rarotonga")]
    PacificRarotonga,
    #[serde(rename = "Pacific/Tahiti")]
    PacificTahiti,
    #[serde(rename = "Pacific/Tarawa")]
    PacificTarawa,
    #[serde(rename = "Pacific/Tongatapu")]
    PacificTongatapu,
    #[serde(rename = "Pacific/Wake")]
    PacificWake,
    #[serde(rename = "Pacific/Wallis")]
    PacificWallis,
    #[serde(rename = "WET")]
    WET,
    #[serde(rename = "null")]
    Null,
}

impl Default for Timezone {
    fn default() -> Timezone {
        Self::AfricaAbidjan
    }
}
