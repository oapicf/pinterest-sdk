//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsFeedProcessingSchedule {
  /// Returns a new [CatalogsFeedProcessingSchedule] instance.
  CatalogsFeedProcessingSchedule({
    required this.time,
    required this.timezone,
  });

  /// A time in format HH:MM with leading 0 (zero)
  String time;

  /// The timezone considered for the processing schedule time.
  CatalogsFeedProcessingScheduleTimezoneEnum? timezone;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsFeedProcessingSchedule &&
    other.time == time &&
    other.timezone == timezone;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (time.hashCode) +
    (timezone == null ? 0 : timezone!.hashCode);

  @override
  String toString() => 'CatalogsFeedProcessingSchedule[time=$time, timezone=$timezone]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'time'] = this.time;
    if (this.timezone != null) {
      json[r'timezone'] = this.timezone;
    } else {
      json[r'timezone'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsFeedProcessingSchedule] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsFeedProcessingSchedule? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsFeedProcessingSchedule[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsFeedProcessingSchedule[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsFeedProcessingSchedule(
        time: mapValueOfType<String>(json, r'time')!,
        timezone: CatalogsFeedProcessingScheduleTimezoneEnum.fromJson(json[r'timezone']),
      );
    }
    return null;
  }

  static List<CatalogsFeedProcessingSchedule> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsFeedProcessingSchedule>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsFeedProcessingSchedule.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsFeedProcessingSchedule> mapFromJson(dynamic json) {
    final map = <String, CatalogsFeedProcessingSchedule>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsFeedProcessingSchedule.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsFeedProcessingSchedule-objects as value to a dart map
  static Map<String, List<CatalogsFeedProcessingSchedule>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsFeedProcessingSchedule>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsFeedProcessingSchedule.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'time',
    'timezone',
  };
}

/// The timezone considered for the processing schedule time.
class CatalogsFeedProcessingScheduleTimezoneEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsFeedProcessingScheduleTimezoneEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const africaSlashAbidjan = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/Abidjan');
  static const africaSlashAccra = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/Accra');
  static const africaSlashAlgiers = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/Algiers');
  static const africaSlashBissau = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/Bissau');
  static const africaSlashCairo = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/Cairo');
  static const africaSlashCasablanca = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/Casablanca');
  static const africaSlashCeuta = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/Ceuta');
  static const africaSlashElAaiun = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/El_Aaiun');
  static const africaSlashJohannesburg = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/Johannesburg');
  static const africaSlashJuba = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/Juba');
  static const africaSlashKhartoum = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/Khartoum');
  static const africaSlashLagos = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/Lagos');
  static const africaSlashMaputo = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/Maputo');
  static const africaSlashMonrovia = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/Monrovia');
  static const africaSlashNairobi = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/Nairobi');
  static const africaSlashNdjamena = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/Ndjamena');
  static const africaSlashSaoTome = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/Sao_Tome');
  static const africaSlashTripoli = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/Tripoli');
  static const africaSlashTunis = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/Tunis');
  static const africaSlashWindhoek = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Africa/Windhoek');
  static const americaSlashAdak = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Adak');
  static const americaSlashAnchorage = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Anchorage');
  static const americaSlashAraguaina = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Araguaina');
  static const americaSlashArgentinaSlashBuenosAires = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Argentina/Buenos_Aires');
  static const americaSlashArgentinaSlashCatamarca = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Argentina/Catamarca');
  static const americaSlashArgentinaSlashCordoba = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Argentina/Cordoba');
  static const americaSlashArgentinaSlashJujuy = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Argentina/Jujuy');
  static const americaSlashArgentinaSlashLaRioja = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Argentina/La_Rioja');
  static const americaSlashArgentinaSlashMendoza = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Argentina/Mendoza');
  static const americaSlashArgentinaSlashRioGallegos = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Argentina/Rio_Gallegos');
  static const americaSlashArgentinaSlashSalta = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Argentina/Salta');
  static const americaSlashArgentinaSlashSanJuan = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Argentina/San_Juan');
  static const americaSlashArgentinaSlashSanLuis = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Argentina/San_Luis');
  static const americaSlashArgentinaSlashTucuman = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Argentina/Tucuman');
  static const americaSlashArgentinaSlashUshuaia = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Argentina/Ushuaia');
  static const americaSlashAsuncion = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Asuncion');
  static const americaSlashAtikokan = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Atikokan');
  static const americaSlashBahia = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Bahia');
  static const americaSlashBahiaBanderas = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Bahia_Banderas');
  static const americaSlashBarbados = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Barbados');
  static const americaSlashBelem = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Belem');
  static const americaSlashBelize = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Belize');
  static const americaSlashBlancSablon = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Blanc-Sablon');
  static const americaSlashBoaVista = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Boa_Vista');
  static const americaSlashBogota = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Bogota');
  static const americaSlashBoise = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Boise');
  static const americaSlashCambridgeBay = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Cambridge_Bay');
  static const americaSlashCampoGrande = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Campo_Grande');
  static const americaSlashCancun = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Cancun');
  static const americaSlashCaracas = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Caracas');
  static const americaSlashCayenne = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Cayenne');
  static const americaSlashChicago = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Chicago');
  static const americaSlashChihuahua = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Chihuahua');
  static const americaSlashCostaRica = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Costa_Rica');
  static const americaSlashCreston = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Creston');
  static const americaSlashCuiaba = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Cuiaba');
  static const americaSlashCuracao = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Curacao');
  static const americaSlashDanmarkshavn = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Danmarkshavn');
  static const americaSlashDawson = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Dawson');
  static const americaSlashDawsonCreek = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Dawson_Creek');
  static const americaSlashDenver = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Denver');
  static const americaSlashDetroit = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Detroit');
  static const americaSlashEdmonton = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Edmonton');
  static const americaSlashEirunepe = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Eirunepe');
  static const americaSlashElSalvador = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/El_Salvador');
  static const americaSlashFortNelson = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Fort_Nelson');
  static const americaSlashFortaleza = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Fortaleza');
  static const americaSlashGlaceBay = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Glace_Bay');
  static const americaSlashGooseBay = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Goose_Bay');
  static const americaSlashGrandTurk = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Grand_Turk');
  static const americaSlashGuatemala = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Guatemala');
  static const americaSlashGuayaquil = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Guayaquil');
  static const americaSlashGuyana = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Guyana');
  static const americaSlashHalifax = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Halifax');
  static const americaSlashHavana = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Havana');
  static const americaSlashHermosillo = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Hermosillo');
  static const americaSlashIndianaSlashIndianapolis = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Indiana/Indianapolis');
  static const americaSlashIndianaSlashKnox = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Indiana/Knox');
  static const americaSlashIndianaSlashMarengo = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Indiana/Marengo');
  static const americaSlashIndianaSlashPetersburg = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Indiana/Petersburg');
  static const americaSlashIndianaSlashTellCity = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Indiana/Tell_City');
  static const americaSlashIndianaSlashVevay = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Indiana/Vevay');
  static const americaSlashIndianaSlashVincennes = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Indiana/Vincennes');
  static const americaSlashIndianaSlashWinamac = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Indiana/Winamac');
  static const americaSlashInuvik = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Inuvik');
  static const americaSlashIqaluit = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Iqaluit');
  static const americaSlashJamaica = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Jamaica');
  static const americaSlashJuneau = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Juneau');
  static const americaSlashKentuckySlashLouisville = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Kentucky/Louisville');
  static const americaSlashKentuckySlashMonticello = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Kentucky/Monticello');
  static const americaSlashLaPaz = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/La_Paz');
  static const americaSlashLima = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Lima');
  static const americaSlashLosAngeles = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Los_Angeles');
  static const americaSlashMaceio = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Maceio');
  static const americaSlashManagua = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Managua');
  static const americaSlashManaus = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Manaus');
  static const americaSlashMartinique = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Martinique');
  static const americaSlashMatamoros = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Matamoros');
  static const americaSlashMazatlan = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Mazatlan');
  static const americaSlashMenominee = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Menominee');
  static const americaSlashMerida = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Merida');
  static const americaSlashMetlakatla = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Metlakatla');
  static const americaSlashMexicoCity = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Mexico_City');
  static const americaSlashMiquelon = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Miquelon');
  static const americaSlashMoncton = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Moncton');
  static const americaSlashMonterrey = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Monterrey');
  static const americaSlashMontevideo = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Montevideo');
  static const americaSlashNassau = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Nassau');
  static const americaSlashNewYork = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/New_York');
  static const americaSlashNipigon = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Nipigon');
  static const americaSlashNome = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Nome');
  static const americaSlashNoronha = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Noronha');
  static const americaSlashNorthDakotaSlashBeulah = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/North_Dakota/Beulah');
  static const americaSlashNorthDakotaSlashCenter = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/North_Dakota/Center');
  static const americaSlashNorthDakotaSlashNewSalem = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/North_Dakota/New_Salem');
  static const americaSlashNuuk = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Nuuk');
  static const americaSlashOjinaga = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Ojinaga');
  static const americaSlashPanama = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Panama');
  static const americaSlashPangnirtung = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Pangnirtung');
  static const americaSlashParamaribo = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Paramaribo');
  static const americaSlashPhoenix = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Phoenix');
  static const americaSlashPortAuPrince = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Port-au-Prince');
  static const americaSlashPortOfSpain = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Port_of_Spain');
  static const americaSlashPortoVelho = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Porto_Velho');
  static const americaSlashPuertoRico = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Puerto_Rico');
  static const americaSlashPuntaArenas = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Punta_Arenas');
  static const americaSlashRainyRiver = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Rainy_River');
  static const americaSlashRankinInlet = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Rankin_Inlet');
  static const americaSlashRecife = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Recife');
  static const americaSlashRegina = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Regina');
  static const americaSlashResolute = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Resolute');
  static const americaSlashRioBranco = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Rio_Branco');
  static const americaSlashSantarem = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Santarem');
  static const americaSlashSantiago = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Santiago');
  static const americaSlashSantoDomingo = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Santo_Domingo');
  static const americaSlashSaoPaulo = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Sao_Paulo');
  static const americaSlashScoresbysund = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Scoresbysund');
  static const americaSlashSitka = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Sitka');
  static const americaSlashStJohns = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/St_Johns');
  static const americaSlashSwiftCurrent = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Swift_Current');
  static const americaSlashTegucigalpa = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Tegucigalpa');
  static const americaSlashThule = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Thule');
  static const americaSlashThunderBay = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Thunder_Bay');
  static const americaSlashTijuana = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Tijuana');
  static const americaSlashToronto = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Toronto');
  static const americaSlashVancouver = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Vancouver');
  static const americaSlashWhitehorse = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Whitehorse');
  static const americaSlashWinnipeg = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Winnipeg');
  static const americaSlashYakutat = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Yakutat');
  static const americaSlashYellowknife = CatalogsFeedProcessingScheduleTimezoneEnum._(r'America/Yellowknife');
  static const antarcticaSlashCasey = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Antarctica/Casey');
  static const antarcticaSlashDavis = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Antarctica/Davis');
  static const antarcticaSlashDumontDUrville = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Antarctica/DumontDUrville');
  static const antarcticaSlashMacquarie = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Antarctica/Macquarie');
  static const antarcticaSlashMawson = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Antarctica/Mawson');
  static const antarcticaSlashPalmer = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Antarctica/Palmer');
  static const antarcticaSlashRothera = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Antarctica/Rothera');
  static const antarcticaSlashSyowa = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Antarctica/Syowa');
  static const antarcticaSlashTroll = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Antarctica/Troll');
  static const antarcticaSlashVostok = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Antarctica/Vostok');
  static const asiaSlashAlmaty = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Almaty');
  static const asiaSlashAmman = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Amman');
  static const asiaSlashAnadyr = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Anadyr');
  static const asiaSlashAqtau = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Aqtau');
  static const asiaSlashAqtobe = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Aqtobe');
  static const asiaSlashAshgabat = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Ashgabat');
  static const asiaSlashAtyrau = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Atyrau');
  static const asiaSlashBaghdad = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Baghdad');
  static const asiaSlashBaku = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Baku');
  static const asiaSlashBangkok = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Bangkok');
  static const asiaSlashBarnaul = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Barnaul');
  static const asiaSlashBeirut = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Beirut');
  static const asiaSlashBishkek = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Bishkek');
  static const asiaSlashBrunei = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Brunei');
  static const asiaSlashChita = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Chita');
  static const asiaSlashChoibalsan = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Choibalsan');
  static const asiaSlashColombo = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Colombo');
  static const asiaSlashDamascus = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Damascus');
  static const asiaSlashDhaka = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Dhaka');
  static const asiaSlashDili = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Dili');
  static const asiaSlashDubai = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Dubai');
  static const asiaSlashDushanbe = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Dushanbe');
  static const asiaSlashFamagusta = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Famagusta');
  static const asiaSlashGaza = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Gaza');
  static const asiaSlashHebron = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Hebron');
  static const asiaSlashHoChiMinh = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Ho_Chi_Minh');
  static const asiaSlashHongKong = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Hong_Kong');
  static const asiaSlashHovd = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Hovd');
  static const asiaSlashIrkutsk = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Irkutsk');
  static const asiaSlashJakarta = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Jakarta');
  static const asiaSlashJayapura = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Jayapura');
  static const asiaSlashJerusalem = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Jerusalem');
  static const asiaSlashKabul = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Kabul');
  static const asiaSlashKamchatka = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Kamchatka');
  static const asiaSlashKarachi = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Karachi');
  static const asiaSlashKathmandu = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Kathmandu');
  static const asiaSlashKhandyga = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Khandyga');
  static const asiaSlashKolkata = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Kolkata');
  static const asiaSlashKrasnoyarsk = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Krasnoyarsk');
  static const asiaSlashKualaLumpur = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Kuala_Lumpur');
  static const asiaSlashKuching = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Kuching');
  static const asiaSlashMacau = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Macau');
  static const asiaSlashMagadan = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Magadan');
  static const asiaSlashMakassar = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Makassar');
  static const asiaSlashManila = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Manila');
  static const asiaSlashNicosia = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Nicosia');
  static const asiaSlashNovokuznetsk = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Novokuznetsk');
  static const asiaSlashNovosibirsk = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Novosibirsk');
  static const asiaSlashOmsk = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Omsk');
  static const asiaSlashOral = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Oral');
  static const asiaSlashPontianak = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Pontianak');
  static const asiaSlashPyongyang = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Pyongyang');
  static const asiaSlashQatar = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Qatar');
  static const asiaSlashQostanay = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Qostanay');
  static const asiaSlashQyzylorda = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Qyzylorda');
  static const asiaSlashRiyadh = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Riyadh');
  static const asiaSlashSakhalin = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Sakhalin');
  static const asiaSlashSamarkand = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Samarkand');
  static const asiaSlashSeoul = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Seoul');
  static const asiaSlashShanghai = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Shanghai');
  static const asiaSlashSingapore = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Singapore');
  static const asiaSlashSrednekolymsk = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Srednekolymsk');
  static const asiaSlashTaipei = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Taipei');
  static const asiaSlashTashkent = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Tashkent');
  static const asiaSlashTbilisi = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Tbilisi');
  static const asiaSlashTehran = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Tehran');
  static const asiaSlashThimphu = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Thimphu');
  static const asiaSlashTokyo = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Tokyo');
  static const asiaSlashTomsk = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Tomsk');
  static const asiaSlashUlaanbaatar = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Ulaanbaatar');
  static const asiaSlashUrumqi = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Urumqi');
  static const asiaSlashUstNera = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Ust-Nera');
  static const asiaSlashVladivostok = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Vladivostok');
  static const asiaSlashYakutsk = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Yakutsk');
  static const asiaSlashYangon = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Yangon');
  static const asiaSlashYekaterinburg = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Yekaterinburg');
  static const asiaSlashYerevan = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Asia/Yerevan');
  static const atlanticSlashAzores = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Atlantic/Azores');
  static const atlanticSlashBermuda = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Atlantic/Bermuda');
  static const atlanticSlashCanary = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Atlantic/Canary');
  static const atlanticSlashCapeVerde = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Atlantic/Cape_Verde');
  static const atlanticSlashFaroe = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Atlantic/Faroe');
  static const atlanticSlashMadeira = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Atlantic/Madeira');
  static const atlanticSlashReykjavik = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Atlantic/Reykjavik');
  static const atlanticSlashSouthGeorgia = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Atlantic/South_Georgia');
  static const atlanticSlashStanley = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Atlantic/Stanley');
  static const australiaSlashAdelaide = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Australia/Adelaide');
  static const australiaSlashBrisbane = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Australia/Brisbane');
  static const australiaSlashBrokenHill = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Australia/Broken_Hill');
  static const australiaSlashCurrie = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Australia/Currie');
  static const australiaSlashDarwin = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Australia/Darwin');
  static const australiaSlashEucla = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Australia/Eucla');
  static const australiaSlashHobart = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Australia/Hobart');
  static const australiaSlashLindeman = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Australia/Lindeman');
  static const australiaSlashLordHowe = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Australia/Lord_Howe');
  static const australiaSlashMelbourne = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Australia/Melbourne');
  static const australiaSlashPerth = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Australia/Perth');
  static const australiaSlashSydney = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Australia/Sydney');
  static const CET = CatalogsFeedProcessingScheduleTimezoneEnum._(r'CET');
  static const cST6CDT = CatalogsFeedProcessingScheduleTimezoneEnum._(r'CST6CDT');
  static const EET = CatalogsFeedProcessingScheduleTimezoneEnum._(r'EET');
  static const EST = CatalogsFeedProcessingScheduleTimezoneEnum._(r'EST');
  static const eST5EDT = CatalogsFeedProcessingScheduleTimezoneEnum._(r'EST5EDT');
  static const etcSlashGMT = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT');
  static const etcSlashGMTPlus1 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT+1');
  static const etcSlashGMTPlus10 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT+10');
  static const etcSlashGMTPlus11 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT+11');
  static const etcSlashGMTPlus12 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT+12');
  static const etcSlashGMTPlus2 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT+2');
  static const etcSlashGMTPlus3 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT+3');
  static const etcSlashGMTPlus4 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT+4');
  static const etcSlashGMTPlus5 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT+5');
  static const etcSlashGMTPlus6 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT+6');
  static const etcSlashGMTPlus7 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT+7');
  static const etcSlashGMTPlus8 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT+8');
  static const etcSlashGMTPlus9 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT+9');
  static const etcSlashGMT1 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT-1');
  static const etcSlashGMT10 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT-10');
  static const etcSlashGMT11 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT-11');
  static const etcSlashGMT12 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT-12');
  static const etcSlashGMT13 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT-13');
  static const etcSlashGMT14 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT-14');
  static const etcSlashGMT2 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT-2');
  static const etcSlashGMT3 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT-3');
  static const etcSlashGMT4 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT-4');
  static const etcSlashGMT5 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT-5');
  static const etcSlashGMT6 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT-6');
  static const etcSlashGMT7 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT-7');
  static const etcSlashGMT8 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT-8');
  static const etcSlashGMT9 = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/GMT-9');
  static const etcSlashUTC = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Etc/UTC');
  static const europeSlashAmsterdam = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Amsterdam');
  static const europeSlashAndorra = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Andorra');
  static const europeSlashAstrakhan = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Astrakhan');
  static const europeSlashAthens = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Athens');
  static const europeSlashBelgrade = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Belgrade');
  static const europeSlashBerlin = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Berlin');
  static const europeSlashBrussels = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Brussels');
  static const europeSlashBucharest = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Bucharest');
  static const europeSlashBudapest = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Budapest');
  static const europeSlashChisinau = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Chisinau');
  static const europeSlashCopenhagen = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Copenhagen');
  static const europeSlashDublin = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Dublin');
  static const europeSlashGibraltar = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Gibraltar');
  static const europeSlashHelsinki = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Helsinki');
  static const europeSlashIstanbul = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Istanbul');
  static const europeSlashKaliningrad = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Kaliningrad');
  static const europeSlashKiev = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Kiev');
  static const europeSlashKirov = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Kirov');
  static const europeSlashLisbon = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Lisbon');
  static const europeSlashLondon = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/London');
  static const europeSlashLuxembourg = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Luxembourg');
  static const europeSlashMadrid = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Madrid');
  static const europeSlashMalta = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Malta');
  static const europeSlashMinsk = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Minsk');
  static const europeSlashMonaco = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Monaco');
  static const europeSlashMoscow = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Moscow');
  static const europeSlashOslo = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Oslo');
  static const europeSlashParis = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Paris');
  static const europeSlashPrague = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Prague');
  static const europeSlashRiga = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Riga');
  static const europeSlashRome = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Rome');
  static const europeSlashSamara = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Samara');
  static const europeSlashSaratov = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Saratov');
  static const europeSlashSimferopol = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Simferopol');
  static const europeSlashSofia = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Sofia');
  static const europeSlashStockholm = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Stockholm');
  static const europeSlashTallinn = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Tallinn');
  static const europeSlashTirane = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Tirane');
  static const europeSlashUlyanovsk = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Ulyanovsk');
  static const europeSlashUzhgorod = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Uzhgorod');
  static const europeSlashVienna = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Vienna');
  static const europeSlashVilnius = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Vilnius');
  static const europeSlashVolgograd = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Volgograd');
  static const europeSlashWarsaw = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Warsaw');
  static const europeSlashZaporozhye = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Zaporozhye');
  static const europeSlashZurich = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Europe/Zurich');
  static const HST = CatalogsFeedProcessingScheduleTimezoneEnum._(r'HST');
  static const indianSlashChagos = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Indian/Chagos');
  static const indianSlashChristmas = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Indian/Christmas');
  static const indianSlashCocos = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Indian/Cocos');
  static const indianSlashKerguelen = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Indian/Kerguelen');
  static const indianSlashMahe = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Indian/Mahe');
  static const indianSlashMaldives = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Indian/Maldives');
  static const indianSlashMauritius = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Indian/Mauritius');
  static const indianSlashReunion = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Indian/Reunion');
  static const MET = CatalogsFeedProcessingScheduleTimezoneEnum._(r'MET');
  static const MST = CatalogsFeedProcessingScheduleTimezoneEnum._(r'MST');
  static const mST7MDT = CatalogsFeedProcessingScheduleTimezoneEnum._(r'MST7MDT');
  static const pST8PDT = CatalogsFeedProcessingScheduleTimezoneEnum._(r'PST8PDT');
  static const pacificSlashApia = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Apia');
  static const pacificSlashAuckland = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Auckland');
  static const pacificSlashBougainville = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Bougainville');
  static const pacificSlashChatham = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Chatham');
  static const pacificSlashChuuk = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Chuuk');
  static const pacificSlashEaster = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Easter');
  static const pacificSlashEfate = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Efate');
  static const pacificSlashEnderbury = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Enderbury');
  static const pacificSlashFakaofo = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Fakaofo');
  static const pacificSlashFiji = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Fiji');
  static const pacificSlashFunafuti = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Funafuti');
  static const pacificSlashGalapagos = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Galapagos');
  static const pacificSlashGambier = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Gambier');
  static const pacificSlashGuadalcanal = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Guadalcanal');
  static const pacificSlashGuam = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Guam');
  static const pacificSlashHonolulu = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Honolulu');
  static const pacificSlashKiritimati = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Kiritimati');
  static const pacificSlashKosrae = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Kosrae');
  static const pacificSlashKwajalein = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Kwajalein');
  static const pacificSlashMajuro = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Majuro');
  static const pacificSlashMarquesas = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Marquesas');
  static const pacificSlashNauru = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Nauru');
  static const pacificSlashNiue = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Niue');
  static const pacificSlashNorfolk = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Norfolk');
  static const pacificSlashNoumea = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Noumea');
  static const pacificSlashPagoPago = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Pago_Pago');
  static const pacificSlashPalau = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Palau');
  static const pacificSlashPitcairn = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Pitcairn');
  static const pacificSlashPohnpei = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Pohnpei');
  static const pacificSlashPortMoresby = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Port_Moresby');
  static const pacificSlashRarotonga = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Rarotonga');
  static const pacificSlashTahiti = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Tahiti');
  static const pacificSlashTarawa = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Tarawa');
  static const pacificSlashTongatapu = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Tongatapu');
  static const pacificSlashWake = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Wake');
  static const pacificSlashWallis = CatalogsFeedProcessingScheduleTimezoneEnum._(r'Pacific/Wallis');
  static const WET = CatalogsFeedProcessingScheduleTimezoneEnum._(r'WET');

  /// List of all possible values in this [enum][CatalogsFeedProcessingScheduleTimezoneEnum].
  static const values = <CatalogsFeedProcessingScheduleTimezoneEnum>[
    africaSlashAbidjan,
    africaSlashAccra,
    africaSlashAlgiers,
    africaSlashBissau,
    africaSlashCairo,
    africaSlashCasablanca,
    africaSlashCeuta,
    africaSlashElAaiun,
    africaSlashJohannesburg,
    africaSlashJuba,
    africaSlashKhartoum,
    africaSlashLagos,
    africaSlashMaputo,
    africaSlashMonrovia,
    africaSlashNairobi,
    africaSlashNdjamena,
    africaSlashSaoTome,
    africaSlashTripoli,
    africaSlashTunis,
    africaSlashWindhoek,
    americaSlashAdak,
    americaSlashAnchorage,
    americaSlashAraguaina,
    americaSlashArgentinaSlashBuenosAires,
    americaSlashArgentinaSlashCatamarca,
    americaSlashArgentinaSlashCordoba,
    americaSlashArgentinaSlashJujuy,
    americaSlashArgentinaSlashLaRioja,
    americaSlashArgentinaSlashMendoza,
    americaSlashArgentinaSlashRioGallegos,
    americaSlashArgentinaSlashSalta,
    americaSlashArgentinaSlashSanJuan,
    americaSlashArgentinaSlashSanLuis,
    americaSlashArgentinaSlashTucuman,
    americaSlashArgentinaSlashUshuaia,
    americaSlashAsuncion,
    americaSlashAtikokan,
    americaSlashBahia,
    americaSlashBahiaBanderas,
    americaSlashBarbados,
    americaSlashBelem,
    americaSlashBelize,
    americaSlashBlancSablon,
    americaSlashBoaVista,
    americaSlashBogota,
    americaSlashBoise,
    americaSlashCambridgeBay,
    americaSlashCampoGrande,
    americaSlashCancun,
    americaSlashCaracas,
    americaSlashCayenne,
    americaSlashChicago,
    americaSlashChihuahua,
    americaSlashCostaRica,
    americaSlashCreston,
    americaSlashCuiaba,
    americaSlashCuracao,
    americaSlashDanmarkshavn,
    americaSlashDawson,
    americaSlashDawsonCreek,
    americaSlashDenver,
    americaSlashDetroit,
    americaSlashEdmonton,
    americaSlashEirunepe,
    americaSlashElSalvador,
    americaSlashFortNelson,
    americaSlashFortaleza,
    americaSlashGlaceBay,
    americaSlashGooseBay,
    americaSlashGrandTurk,
    americaSlashGuatemala,
    americaSlashGuayaquil,
    americaSlashGuyana,
    americaSlashHalifax,
    americaSlashHavana,
    americaSlashHermosillo,
    americaSlashIndianaSlashIndianapolis,
    americaSlashIndianaSlashKnox,
    americaSlashIndianaSlashMarengo,
    americaSlashIndianaSlashPetersburg,
    americaSlashIndianaSlashTellCity,
    americaSlashIndianaSlashVevay,
    americaSlashIndianaSlashVincennes,
    americaSlashIndianaSlashWinamac,
    americaSlashInuvik,
    americaSlashIqaluit,
    americaSlashJamaica,
    americaSlashJuneau,
    americaSlashKentuckySlashLouisville,
    americaSlashKentuckySlashMonticello,
    americaSlashLaPaz,
    americaSlashLima,
    americaSlashLosAngeles,
    americaSlashMaceio,
    americaSlashManagua,
    americaSlashManaus,
    americaSlashMartinique,
    americaSlashMatamoros,
    americaSlashMazatlan,
    americaSlashMenominee,
    americaSlashMerida,
    americaSlashMetlakatla,
    americaSlashMexicoCity,
    americaSlashMiquelon,
    americaSlashMoncton,
    americaSlashMonterrey,
    americaSlashMontevideo,
    americaSlashNassau,
    americaSlashNewYork,
    americaSlashNipigon,
    americaSlashNome,
    americaSlashNoronha,
    americaSlashNorthDakotaSlashBeulah,
    americaSlashNorthDakotaSlashCenter,
    americaSlashNorthDakotaSlashNewSalem,
    americaSlashNuuk,
    americaSlashOjinaga,
    americaSlashPanama,
    americaSlashPangnirtung,
    americaSlashParamaribo,
    americaSlashPhoenix,
    americaSlashPortAuPrince,
    americaSlashPortOfSpain,
    americaSlashPortoVelho,
    americaSlashPuertoRico,
    americaSlashPuntaArenas,
    americaSlashRainyRiver,
    americaSlashRankinInlet,
    americaSlashRecife,
    americaSlashRegina,
    americaSlashResolute,
    americaSlashRioBranco,
    americaSlashSantarem,
    americaSlashSantiago,
    americaSlashSantoDomingo,
    americaSlashSaoPaulo,
    americaSlashScoresbysund,
    americaSlashSitka,
    americaSlashStJohns,
    americaSlashSwiftCurrent,
    americaSlashTegucigalpa,
    americaSlashThule,
    americaSlashThunderBay,
    americaSlashTijuana,
    americaSlashToronto,
    americaSlashVancouver,
    americaSlashWhitehorse,
    americaSlashWinnipeg,
    americaSlashYakutat,
    americaSlashYellowknife,
    antarcticaSlashCasey,
    antarcticaSlashDavis,
    antarcticaSlashDumontDUrville,
    antarcticaSlashMacquarie,
    antarcticaSlashMawson,
    antarcticaSlashPalmer,
    antarcticaSlashRothera,
    antarcticaSlashSyowa,
    antarcticaSlashTroll,
    antarcticaSlashVostok,
    asiaSlashAlmaty,
    asiaSlashAmman,
    asiaSlashAnadyr,
    asiaSlashAqtau,
    asiaSlashAqtobe,
    asiaSlashAshgabat,
    asiaSlashAtyrau,
    asiaSlashBaghdad,
    asiaSlashBaku,
    asiaSlashBangkok,
    asiaSlashBarnaul,
    asiaSlashBeirut,
    asiaSlashBishkek,
    asiaSlashBrunei,
    asiaSlashChita,
    asiaSlashChoibalsan,
    asiaSlashColombo,
    asiaSlashDamascus,
    asiaSlashDhaka,
    asiaSlashDili,
    asiaSlashDubai,
    asiaSlashDushanbe,
    asiaSlashFamagusta,
    asiaSlashGaza,
    asiaSlashHebron,
    asiaSlashHoChiMinh,
    asiaSlashHongKong,
    asiaSlashHovd,
    asiaSlashIrkutsk,
    asiaSlashJakarta,
    asiaSlashJayapura,
    asiaSlashJerusalem,
    asiaSlashKabul,
    asiaSlashKamchatka,
    asiaSlashKarachi,
    asiaSlashKathmandu,
    asiaSlashKhandyga,
    asiaSlashKolkata,
    asiaSlashKrasnoyarsk,
    asiaSlashKualaLumpur,
    asiaSlashKuching,
    asiaSlashMacau,
    asiaSlashMagadan,
    asiaSlashMakassar,
    asiaSlashManila,
    asiaSlashNicosia,
    asiaSlashNovokuznetsk,
    asiaSlashNovosibirsk,
    asiaSlashOmsk,
    asiaSlashOral,
    asiaSlashPontianak,
    asiaSlashPyongyang,
    asiaSlashQatar,
    asiaSlashQostanay,
    asiaSlashQyzylorda,
    asiaSlashRiyadh,
    asiaSlashSakhalin,
    asiaSlashSamarkand,
    asiaSlashSeoul,
    asiaSlashShanghai,
    asiaSlashSingapore,
    asiaSlashSrednekolymsk,
    asiaSlashTaipei,
    asiaSlashTashkent,
    asiaSlashTbilisi,
    asiaSlashTehran,
    asiaSlashThimphu,
    asiaSlashTokyo,
    asiaSlashTomsk,
    asiaSlashUlaanbaatar,
    asiaSlashUrumqi,
    asiaSlashUstNera,
    asiaSlashVladivostok,
    asiaSlashYakutsk,
    asiaSlashYangon,
    asiaSlashYekaterinburg,
    asiaSlashYerevan,
    atlanticSlashAzores,
    atlanticSlashBermuda,
    atlanticSlashCanary,
    atlanticSlashCapeVerde,
    atlanticSlashFaroe,
    atlanticSlashMadeira,
    atlanticSlashReykjavik,
    atlanticSlashSouthGeorgia,
    atlanticSlashStanley,
    australiaSlashAdelaide,
    australiaSlashBrisbane,
    australiaSlashBrokenHill,
    australiaSlashCurrie,
    australiaSlashDarwin,
    australiaSlashEucla,
    australiaSlashHobart,
    australiaSlashLindeman,
    australiaSlashLordHowe,
    australiaSlashMelbourne,
    australiaSlashPerth,
    australiaSlashSydney,
    CET,
    cST6CDT,
    EET,
    EST,
    eST5EDT,
    etcSlashGMT,
    etcSlashGMTPlus1,
    etcSlashGMTPlus10,
    etcSlashGMTPlus11,
    etcSlashGMTPlus12,
    etcSlashGMTPlus2,
    etcSlashGMTPlus3,
    etcSlashGMTPlus4,
    etcSlashGMTPlus5,
    etcSlashGMTPlus6,
    etcSlashGMTPlus7,
    etcSlashGMTPlus8,
    etcSlashGMTPlus9,
    etcSlashGMT1,
    etcSlashGMT10,
    etcSlashGMT11,
    etcSlashGMT12,
    etcSlashGMT13,
    etcSlashGMT14,
    etcSlashGMT2,
    etcSlashGMT3,
    etcSlashGMT4,
    etcSlashGMT5,
    etcSlashGMT6,
    etcSlashGMT7,
    etcSlashGMT8,
    etcSlashGMT9,
    etcSlashUTC,
    europeSlashAmsterdam,
    europeSlashAndorra,
    europeSlashAstrakhan,
    europeSlashAthens,
    europeSlashBelgrade,
    europeSlashBerlin,
    europeSlashBrussels,
    europeSlashBucharest,
    europeSlashBudapest,
    europeSlashChisinau,
    europeSlashCopenhagen,
    europeSlashDublin,
    europeSlashGibraltar,
    europeSlashHelsinki,
    europeSlashIstanbul,
    europeSlashKaliningrad,
    europeSlashKiev,
    europeSlashKirov,
    europeSlashLisbon,
    europeSlashLondon,
    europeSlashLuxembourg,
    europeSlashMadrid,
    europeSlashMalta,
    europeSlashMinsk,
    europeSlashMonaco,
    europeSlashMoscow,
    europeSlashOslo,
    europeSlashParis,
    europeSlashPrague,
    europeSlashRiga,
    europeSlashRome,
    europeSlashSamara,
    europeSlashSaratov,
    europeSlashSimferopol,
    europeSlashSofia,
    europeSlashStockholm,
    europeSlashTallinn,
    europeSlashTirane,
    europeSlashUlyanovsk,
    europeSlashUzhgorod,
    europeSlashVienna,
    europeSlashVilnius,
    europeSlashVolgograd,
    europeSlashWarsaw,
    europeSlashZaporozhye,
    europeSlashZurich,
    HST,
    indianSlashChagos,
    indianSlashChristmas,
    indianSlashCocos,
    indianSlashKerguelen,
    indianSlashMahe,
    indianSlashMaldives,
    indianSlashMauritius,
    indianSlashReunion,
    MET,
    MST,
    mST7MDT,
    pST8PDT,
    pacificSlashApia,
    pacificSlashAuckland,
    pacificSlashBougainville,
    pacificSlashChatham,
    pacificSlashChuuk,
    pacificSlashEaster,
    pacificSlashEfate,
    pacificSlashEnderbury,
    pacificSlashFakaofo,
    pacificSlashFiji,
    pacificSlashFunafuti,
    pacificSlashGalapagos,
    pacificSlashGambier,
    pacificSlashGuadalcanal,
    pacificSlashGuam,
    pacificSlashHonolulu,
    pacificSlashKiritimati,
    pacificSlashKosrae,
    pacificSlashKwajalein,
    pacificSlashMajuro,
    pacificSlashMarquesas,
    pacificSlashNauru,
    pacificSlashNiue,
    pacificSlashNorfolk,
    pacificSlashNoumea,
    pacificSlashPagoPago,
    pacificSlashPalau,
    pacificSlashPitcairn,
    pacificSlashPohnpei,
    pacificSlashPortMoresby,
    pacificSlashRarotonga,
    pacificSlashTahiti,
    pacificSlashTarawa,
    pacificSlashTongatapu,
    pacificSlashWake,
    pacificSlashWallis,
    WET,
  ];

  static CatalogsFeedProcessingScheduleTimezoneEnum? fromJson(dynamic value) => CatalogsFeedProcessingScheduleTimezoneEnumTypeTransformer().decode(value);

  static List<CatalogsFeedProcessingScheduleTimezoneEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsFeedProcessingScheduleTimezoneEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsFeedProcessingScheduleTimezoneEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsFeedProcessingScheduleTimezoneEnum] to String,
/// and [decode] dynamic data back to [CatalogsFeedProcessingScheduleTimezoneEnum].
class CatalogsFeedProcessingScheduleTimezoneEnumTypeTransformer {
  factory CatalogsFeedProcessingScheduleTimezoneEnumTypeTransformer() => _instance ??= const CatalogsFeedProcessingScheduleTimezoneEnumTypeTransformer._();

  const CatalogsFeedProcessingScheduleTimezoneEnumTypeTransformer._();

  String encode(CatalogsFeedProcessingScheduleTimezoneEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsFeedProcessingScheduleTimezoneEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsFeedProcessingScheduleTimezoneEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'Africa/Abidjan': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashAbidjan;
        case r'Africa/Accra': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashAccra;
        case r'Africa/Algiers': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashAlgiers;
        case r'Africa/Bissau': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashBissau;
        case r'Africa/Cairo': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashCairo;
        case r'Africa/Casablanca': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashCasablanca;
        case r'Africa/Ceuta': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashCeuta;
        case r'Africa/El_Aaiun': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashElAaiun;
        case r'Africa/Johannesburg': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashJohannesburg;
        case r'Africa/Juba': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashJuba;
        case r'Africa/Khartoum': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashKhartoum;
        case r'Africa/Lagos': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashLagos;
        case r'Africa/Maputo': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashMaputo;
        case r'Africa/Monrovia': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashMonrovia;
        case r'Africa/Nairobi': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashNairobi;
        case r'Africa/Ndjamena': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashNdjamena;
        case r'Africa/Sao_Tome': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashSaoTome;
        case r'Africa/Tripoli': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashTripoli;
        case r'Africa/Tunis': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashTunis;
        case r'Africa/Windhoek': return CatalogsFeedProcessingScheduleTimezoneEnum.africaSlashWindhoek;
        case r'America/Adak': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashAdak;
        case r'America/Anchorage': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashAnchorage;
        case r'America/Araguaina': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashAraguaina;
        case r'America/Argentina/Buenos_Aires': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashArgentinaSlashBuenosAires;
        case r'America/Argentina/Catamarca': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashArgentinaSlashCatamarca;
        case r'America/Argentina/Cordoba': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashArgentinaSlashCordoba;
        case r'America/Argentina/Jujuy': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashArgentinaSlashJujuy;
        case r'America/Argentina/La_Rioja': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashArgentinaSlashLaRioja;
        case r'America/Argentina/Mendoza': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashArgentinaSlashMendoza;
        case r'America/Argentina/Rio_Gallegos': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashArgentinaSlashRioGallegos;
        case r'America/Argentina/Salta': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashArgentinaSlashSalta;
        case r'America/Argentina/San_Juan': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashArgentinaSlashSanJuan;
        case r'America/Argentina/San_Luis': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashArgentinaSlashSanLuis;
        case r'America/Argentina/Tucuman': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashArgentinaSlashTucuman;
        case r'America/Argentina/Ushuaia': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashArgentinaSlashUshuaia;
        case r'America/Asuncion': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashAsuncion;
        case r'America/Atikokan': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashAtikokan;
        case r'America/Bahia': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashBahia;
        case r'America/Bahia_Banderas': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashBahiaBanderas;
        case r'America/Barbados': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashBarbados;
        case r'America/Belem': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashBelem;
        case r'America/Belize': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashBelize;
        case r'America/Blanc-Sablon': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashBlancSablon;
        case r'America/Boa_Vista': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashBoaVista;
        case r'America/Bogota': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashBogota;
        case r'America/Boise': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashBoise;
        case r'America/Cambridge_Bay': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashCambridgeBay;
        case r'America/Campo_Grande': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashCampoGrande;
        case r'America/Cancun': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashCancun;
        case r'America/Caracas': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashCaracas;
        case r'America/Cayenne': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashCayenne;
        case r'America/Chicago': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashChicago;
        case r'America/Chihuahua': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashChihuahua;
        case r'America/Costa_Rica': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashCostaRica;
        case r'America/Creston': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashCreston;
        case r'America/Cuiaba': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashCuiaba;
        case r'America/Curacao': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashCuracao;
        case r'America/Danmarkshavn': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashDanmarkshavn;
        case r'America/Dawson': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashDawson;
        case r'America/Dawson_Creek': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashDawsonCreek;
        case r'America/Denver': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashDenver;
        case r'America/Detroit': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashDetroit;
        case r'America/Edmonton': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashEdmonton;
        case r'America/Eirunepe': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashEirunepe;
        case r'America/El_Salvador': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashElSalvador;
        case r'America/Fort_Nelson': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashFortNelson;
        case r'America/Fortaleza': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashFortaleza;
        case r'America/Glace_Bay': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashGlaceBay;
        case r'America/Goose_Bay': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashGooseBay;
        case r'America/Grand_Turk': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashGrandTurk;
        case r'America/Guatemala': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashGuatemala;
        case r'America/Guayaquil': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashGuayaquil;
        case r'America/Guyana': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashGuyana;
        case r'America/Halifax': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashHalifax;
        case r'America/Havana': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashHavana;
        case r'America/Hermosillo': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashHermosillo;
        case r'America/Indiana/Indianapolis': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashIndianaSlashIndianapolis;
        case r'America/Indiana/Knox': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashIndianaSlashKnox;
        case r'America/Indiana/Marengo': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashIndianaSlashMarengo;
        case r'America/Indiana/Petersburg': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashIndianaSlashPetersburg;
        case r'America/Indiana/Tell_City': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashIndianaSlashTellCity;
        case r'America/Indiana/Vevay': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashIndianaSlashVevay;
        case r'America/Indiana/Vincennes': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashIndianaSlashVincennes;
        case r'America/Indiana/Winamac': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashIndianaSlashWinamac;
        case r'America/Inuvik': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashInuvik;
        case r'America/Iqaluit': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashIqaluit;
        case r'America/Jamaica': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashJamaica;
        case r'America/Juneau': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashJuneau;
        case r'America/Kentucky/Louisville': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashKentuckySlashLouisville;
        case r'America/Kentucky/Monticello': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashKentuckySlashMonticello;
        case r'America/La_Paz': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashLaPaz;
        case r'America/Lima': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashLima;
        case r'America/Los_Angeles': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashLosAngeles;
        case r'America/Maceio': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashMaceio;
        case r'America/Managua': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashManagua;
        case r'America/Manaus': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashManaus;
        case r'America/Martinique': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashMartinique;
        case r'America/Matamoros': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashMatamoros;
        case r'America/Mazatlan': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashMazatlan;
        case r'America/Menominee': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashMenominee;
        case r'America/Merida': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashMerida;
        case r'America/Metlakatla': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashMetlakatla;
        case r'America/Mexico_City': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashMexicoCity;
        case r'America/Miquelon': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashMiquelon;
        case r'America/Moncton': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashMoncton;
        case r'America/Monterrey': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashMonterrey;
        case r'America/Montevideo': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashMontevideo;
        case r'America/Nassau': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashNassau;
        case r'America/New_York': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashNewYork;
        case r'America/Nipigon': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashNipigon;
        case r'America/Nome': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashNome;
        case r'America/Noronha': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashNoronha;
        case r'America/North_Dakota/Beulah': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashNorthDakotaSlashBeulah;
        case r'America/North_Dakota/Center': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashNorthDakotaSlashCenter;
        case r'America/North_Dakota/New_Salem': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashNorthDakotaSlashNewSalem;
        case r'America/Nuuk': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashNuuk;
        case r'America/Ojinaga': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashOjinaga;
        case r'America/Panama': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashPanama;
        case r'America/Pangnirtung': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashPangnirtung;
        case r'America/Paramaribo': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashParamaribo;
        case r'America/Phoenix': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashPhoenix;
        case r'America/Port-au-Prince': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashPortAuPrince;
        case r'America/Port_of_Spain': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashPortOfSpain;
        case r'America/Porto_Velho': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashPortoVelho;
        case r'America/Puerto_Rico': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashPuertoRico;
        case r'America/Punta_Arenas': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashPuntaArenas;
        case r'America/Rainy_River': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashRainyRiver;
        case r'America/Rankin_Inlet': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashRankinInlet;
        case r'America/Recife': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashRecife;
        case r'America/Regina': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashRegina;
        case r'America/Resolute': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashResolute;
        case r'America/Rio_Branco': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashRioBranco;
        case r'America/Santarem': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashSantarem;
        case r'America/Santiago': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashSantiago;
        case r'America/Santo_Domingo': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashSantoDomingo;
        case r'America/Sao_Paulo': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashSaoPaulo;
        case r'America/Scoresbysund': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashScoresbysund;
        case r'America/Sitka': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashSitka;
        case r'America/St_Johns': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashStJohns;
        case r'America/Swift_Current': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashSwiftCurrent;
        case r'America/Tegucigalpa': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashTegucigalpa;
        case r'America/Thule': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashThule;
        case r'America/Thunder_Bay': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashThunderBay;
        case r'America/Tijuana': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashTijuana;
        case r'America/Toronto': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashToronto;
        case r'America/Vancouver': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashVancouver;
        case r'America/Whitehorse': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashWhitehorse;
        case r'America/Winnipeg': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashWinnipeg;
        case r'America/Yakutat': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashYakutat;
        case r'America/Yellowknife': return CatalogsFeedProcessingScheduleTimezoneEnum.americaSlashYellowknife;
        case r'Antarctica/Casey': return CatalogsFeedProcessingScheduleTimezoneEnum.antarcticaSlashCasey;
        case r'Antarctica/Davis': return CatalogsFeedProcessingScheduleTimezoneEnum.antarcticaSlashDavis;
        case r'Antarctica/DumontDUrville': return CatalogsFeedProcessingScheduleTimezoneEnum.antarcticaSlashDumontDUrville;
        case r'Antarctica/Macquarie': return CatalogsFeedProcessingScheduleTimezoneEnum.antarcticaSlashMacquarie;
        case r'Antarctica/Mawson': return CatalogsFeedProcessingScheduleTimezoneEnum.antarcticaSlashMawson;
        case r'Antarctica/Palmer': return CatalogsFeedProcessingScheduleTimezoneEnum.antarcticaSlashPalmer;
        case r'Antarctica/Rothera': return CatalogsFeedProcessingScheduleTimezoneEnum.antarcticaSlashRothera;
        case r'Antarctica/Syowa': return CatalogsFeedProcessingScheduleTimezoneEnum.antarcticaSlashSyowa;
        case r'Antarctica/Troll': return CatalogsFeedProcessingScheduleTimezoneEnum.antarcticaSlashTroll;
        case r'Antarctica/Vostok': return CatalogsFeedProcessingScheduleTimezoneEnum.antarcticaSlashVostok;
        case r'Asia/Almaty': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashAlmaty;
        case r'Asia/Amman': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashAmman;
        case r'Asia/Anadyr': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashAnadyr;
        case r'Asia/Aqtau': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashAqtau;
        case r'Asia/Aqtobe': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashAqtobe;
        case r'Asia/Ashgabat': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashAshgabat;
        case r'Asia/Atyrau': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashAtyrau;
        case r'Asia/Baghdad': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashBaghdad;
        case r'Asia/Baku': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashBaku;
        case r'Asia/Bangkok': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashBangkok;
        case r'Asia/Barnaul': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashBarnaul;
        case r'Asia/Beirut': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashBeirut;
        case r'Asia/Bishkek': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashBishkek;
        case r'Asia/Brunei': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashBrunei;
        case r'Asia/Chita': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashChita;
        case r'Asia/Choibalsan': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashChoibalsan;
        case r'Asia/Colombo': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashColombo;
        case r'Asia/Damascus': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashDamascus;
        case r'Asia/Dhaka': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashDhaka;
        case r'Asia/Dili': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashDili;
        case r'Asia/Dubai': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashDubai;
        case r'Asia/Dushanbe': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashDushanbe;
        case r'Asia/Famagusta': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashFamagusta;
        case r'Asia/Gaza': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashGaza;
        case r'Asia/Hebron': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashHebron;
        case r'Asia/Ho_Chi_Minh': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashHoChiMinh;
        case r'Asia/Hong_Kong': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashHongKong;
        case r'Asia/Hovd': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashHovd;
        case r'Asia/Irkutsk': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashIrkutsk;
        case r'Asia/Jakarta': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashJakarta;
        case r'Asia/Jayapura': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashJayapura;
        case r'Asia/Jerusalem': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashJerusalem;
        case r'Asia/Kabul': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashKabul;
        case r'Asia/Kamchatka': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashKamchatka;
        case r'Asia/Karachi': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashKarachi;
        case r'Asia/Kathmandu': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashKathmandu;
        case r'Asia/Khandyga': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashKhandyga;
        case r'Asia/Kolkata': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashKolkata;
        case r'Asia/Krasnoyarsk': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashKrasnoyarsk;
        case r'Asia/Kuala_Lumpur': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashKualaLumpur;
        case r'Asia/Kuching': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashKuching;
        case r'Asia/Macau': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashMacau;
        case r'Asia/Magadan': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashMagadan;
        case r'Asia/Makassar': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashMakassar;
        case r'Asia/Manila': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashManila;
        case r'Asia/Nicosia': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashNicosia;
        case r'Asia/Novokuznetsk': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashNovokuznetsk;
        case r'Asia/Novosibirsk': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashNovosibirsk;
        case r'Asia/Omsk': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashOmsk;
        case r'Asia/Oral': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashOral;
        case r'Asia/Pontianak': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashPontianak;
        case r'Asia/Pyongyang': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashPyongyang;
        case r'Asia/Qatar': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashQatar;
        case r'Asia/Qostanay': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashQostanay;
        case r'Asia/Qyzylorda': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashQyzylorda;
        case r'Asia/Riyadh': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashRiyadh;
        case r'Asia/Sakhalin': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashSakhalin;
        case r'Asia/Samarkand': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashSamarkand;
        case r'Asia/Seoul': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashSeoul;
        case r'Asia/Shanghai': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashShanghai;
        case r'Asia/Singapore': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashSingapore;
        case r'Asia/Srednekolymsk': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashSrednekolymsk;
        case r'Asia/Taipei': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashTaipei;
        case r'Asia/Tashkent': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashTashkent;
        case r'Asia/Tbilisi': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashTbilisi;
        case r'Asia/Tehran': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashTehran;
        case r'Asia/Thimphu': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashThimphu;
        case r'Asia/Tokyo': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashTokyo;
        case r'Asia/Tomsk': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashTomsk;
        case r'Asia/Ulaanbaatar': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashUlaanbaatar;
        case r'Asia/Urumqi': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashUrumqi;
        case r'Asia/Ust-Nera': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashUstNera;
        case r'Asia/Vladivostok': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashVladivostok;
        case r'Asia/Yakutsk': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashYakutsk;
        case r'Asia/Yangon': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashYangon;
        case r'Asia/Yekaterinburg': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashYekaterinburg;
        case r'Asia/Yerevan': return CatalogsFeedProcessingScheduleTimezoneEnum.asiaSlashYerevan;
        case r'Atlantic/Azores': return CatalogsFeedProcessingScheduleTimezoneEnum.atlanticSlashAzores;
        case r'Atlantic/Bermuda': return CatalogsFeedProcessingScheduleTimezoneEnum.atlanticSlashBermuda;
        case r'Atlantic/Canary': return CatalogsFeedProcessingScheduleTimezoneEnum.atlanticSlashCanary;
        case r'Atlantic/Cape_Verde': return CatalogsFeedProcessingScheduleTimezoneEnum.atlanticSlashCapeVerde;
        case r'Atlantic/Faroe': return CatalogsFeedProcessingScheduleTimezoneEnum.atlanticSlashFaroe;
        case r'Atlantic/Madeira': return CatalogsFeedProcessingScheduleTimezoneEnum.atlanticSlashMadeira;
        case r'Atlantic/Reykjavik': return CatalogsFeedProcessingScheduleTimezoneEnum.atlanticSlashReykjavik;
        case r'Atlantic/South_Georgia': return CatalogsFeedProcessingScheduleTimezoneEnum.atlanticSlashSouthGeorgia;
        case r'Atlantic/Stanley': return CatalogsFeedProcessingScheduleTimezoneEnum.atlanticSlashStanley;
        case r'Australia/Adelaide': return CatalogsFeedProcessingScheduleTimezoneEnum.australiaSlashAdelaide;
        case r'Australia/Brisbane': return CatalogsFeedProcessingScheduleTimezoneEnum.australiaSlashBrisbane;
        case r'Australia/Broken_Hill': return CatalogsFeedProcessingScheduleTimezoneEnum.australiaSlashBrokenHill;
        case r'Australia/Currie': return CatalogsFeedProcessingScheduleTimezoneEnum.australiaSlashCurrie;
        case r'Australia/Darwin': return CatalogsFeedProcessingScheduleTimezoneEnum.australiaSlashDarwin;
        case r'Australia/Eucla': return CatalogsFeedProcessingScheduleTimezoneEnum.australiaSlashEucla;
        case r'Australia/Hobart': return CatalogsFeedProcessingScheduleTimezoneEnum.australiaSlashHobart;
        case r'Australia/Lindeman': return CatalogsFeedProcessingScheduleTimezoneEnum.australiaSlashLindeman;
        case r'Australia/Lord_Howe': return CatalogsFeedProcessingScheduleTimezoneEnum.australiaSlashLordHowe;
        case r'Australia/Melbourne': return CatalogsFeedProcessingScheduleTimezoneEnum.australiaSlashMelbourne;
        case r'Australia/Perth': return CatalogsFeedProcessingScheduleTimezoneEnum.australiaSlashPerth;
        case r'Australia/Sydney': return CatalogsFeedProcessingScheduleTimezoneEnum.australiaSlashSydney;
        case r'CET': return CatalogsFeedProcessingScheduleTimezoneEnum.CET;
        case r'CST6CDT': return CatalogsFeedProcessingScheduleTimezoneEnum.cST6CDT;
        case r'EET': return CatalogsFeedProcessingScheduleTimezoneEnum.EET;
        case r'EST': return CatalogsFeedProcessingScheduleTimezoneEnum.EST;
        case r'EST5EDT': return CatalogsFeedProcessingScheduleTimezoneEnum.eST5EDT;
        case r'Etc/GMT': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMT;
        case r'Etc/GMT+1': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMTPlus1;
        case r'Etc/GMT+10': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMTPlus10;
        case r'Etc/GMT+11': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMTPlus11;
        case r'Etc/GMT+12': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMTPlus12;
        case r'Etc/GMT+2': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMTPlus2;
        case r'Etc/GMT+3': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMTPlus3;
        case r'Etc/GMT+4': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMTPlus4;
        case r'Etc/GMT+5': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMTPlus5;
        case r'Etc/GMT+6': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMTPlus6;
        case r'Etc/GMT+7': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMTPlus7;
        case r'Etc/GMT+8': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMTPlus8;
        case r'Etc/GMT+9': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMTPlus9;
        case r'Etc/GMT-1': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMT1;
        case r'Etc/GMT-10': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMT10;
        case r'Etc/GMT-11': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMT11;
        case r'Etc/GMT-12': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMT12;
        case r'Etc/GMT-13': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMT13;
        case r'Etc/GMT-14': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMT14;
        case r'Etc/GMT-2': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMT2;
        case r'Etc/GMT-3': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMT3;
        case r'Etc/GMT-4': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMT4;
        case r'Etc/GMT-5': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMT5;
        case r'Etc/GMT-6': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMT6;
        case r'Etc/GMT-7': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMT7;
        case r'Etc/GMT-8': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMT8;
        case r'Etc/GMT-9': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashGMT9;
        case r'Etc/UTC': return CatalogsFeedProcessingScheduleTimezoneEnum.etcSlashUTC;
        case r'Europe/Amsterdam': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashAmsterdam;
        case r'Europe/Andorra': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashAndorra;
        case r'Europe/Astrakhan': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashAstrakhan;
        case r'Europe/Athens': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashAthens;
        case r'Europe/Belgrade': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashBelgrade;
        case r'Europe/Berlin': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashBerlin;
        case r'Europe/Brussels': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashBrussels;
        case r'Europe/Bucharest': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashBucharest;
        case r'Europe/Budapest': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashBudapest;
        case r'Europe/Chisinau': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashChisinau;
        case r'Europe/Copenhagen': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashCopenhagen;
        case r'Europe/Dublin': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashDublin;
        case r'Europe/Gibraltar': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashGibraltar;
        case r'Europe/Helsinki': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashHelsinki;
        case r'Europe/Istanbul': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashIstanbul;
        case r'Europe/Kaliningrad': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashKaliningrad;
        case r'Europe/Kiev': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashKiev;
        case r'Europe/Kirov': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashKirov;
        case r'Europe/Lisbon': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashLisbon;
        case r'Europe/London': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashLondon;
        case r'Europe/Luxembourg': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashLuxembourg;
        case r'Europe/Madrid': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashMadrid;
        case r'Europe/Malta': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashMalta;
        case r'Europe/Minsk': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashMinsk;
        case r'Europe/Monaco': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashMonaco;
        case r'Europe/Moscow': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashMoscow;
        case r'Europe/Oslo': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashOslo;
        case r'Europe/Paris': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashParis;
        case r'Europe/Prague': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashPrague;
        case r'Europe/Riga': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashRiga;
        case r'Europe/Rome': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashRome;
        case r'Europe/Samara': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashSamara;
        case r'Europe/Saratov': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashSaratov;
        case r'Europe/Simferopol': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashSimferopol;
        case r'Europe/Sofia': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashSofia;
        case r'Europe/Stockholm': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashStockholm;
        case r'Europe/Tallinn': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashTallinn;
        case r'Europe/Tirane': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashTirane;
        case r'Europe/Ulyanovsk': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashUlyanovsk;
        case r'Europe/Uzhgorod': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashUzhgorod;
        case r'Europe/Vienna': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashVienna;
        case r'Europe/Vilnius': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashVilnius;
        case r'Europe/Volgograd': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashVolgograd;
        case r'Europe/Warsaw': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashWarsaw;
        case r'Europe/Zaporozhye': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashZaporozhye;
        case r'Europe/Zurich': return CatalogsFeedProcessingScheduleTimezoneEnum.europeSlashZurich;
        case r'HST': return CatalogsFeedProcessingScheduleTimezoneEnum.HST;
        case r'Indian/Chagos': return CatalogsFeedProcessingScheduleTimezoneEnum.indianSlashChagos;
        case r'Indian/Christmas': return CatalogsFeedProcessingScheduleTimezoneEnum.indianSlashChristmas;
        case r'Indian/Cocos': return CatalogsFeedProcessingScheduleTimezoneEnum.indianSlashCocos;
        case r'Indian/Kerguelen': return CatalogsFeedProcessingScheduleTimezoneEnum.indianSlashKerguelen;
        case r'Indian/Mahe': return CatalogsFeedProcessingScheduleTimezoneEnum.indianSlashMahe;
        case r'Indian/Maldives': return CatalogsFeedProcessingScheduleTimezoneEnum.indianSlashMaldives;
        case r'Indian/Mauritius': return CatalogsFeedProcessingScheduleTimezoneEnum.indianSlashMauritius;
        case r'Indian/Reunion': return CatalogsFeedProcessingScheduleTimezoneEnum.indianSlashReunion;
        case r'MET': return CatalogsFeedProcessingScheduleTimezoneEnum.MET;
        case r'MST': return CatalogsFeedProcessingScheduleTimezoneEnum.MST;
        case r'MST7MDT': return CatalogsFeedProcessingScheduleTimezoneEnum.mST7MDT;
        case r'PST8PDT': return CatalogsFeedProcessingScheduleTimezoneEnum.pST8PDT;
        case r'Pacific/Apia': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashApia;
        case r'Pacific/Auckland': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashAuckland;
        case r'Pacific/Bougainville': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashBougainville;
        case r'Pacific/Chatham': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashChatham;
        case r'Pacific/Chuuk': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashChuuk;
        case r'Pacific/Easter': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashEaster;
        case r'Pacific/Efate': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashEfate;
        case r'Pacific/Enderbury': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashEnderbury;
        case r'Pacific/Fakaofo': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashFakaofo;
        case r'Pacific/Fiji': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashFiji;
        case r'Pacific/Funafuti': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashFunafuti;
        case r'Pacific/Galapagos': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashGalapagos;
        case r'Pacific/Gambier': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashGambier;
        case r'Pacific/Guadalcanal': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashGuadalcanal;
        case r'Pacific/Guam': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashGuam;
        case r'Pacific/Honolulu': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashHonolulu;
        case r'Pacific/Kiritimati': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashKiritimati;
        case r'Pacific/Kosrae': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashKosrae;
        case r'Pacific/Kwajalein': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashKwajalein;
        case r'Pacific/Majuro': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashMajuro;
        case r'Pacific/Marquesas': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashMarquesas;
        case r'Pacific/Nauru': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashNauru;
        case r'Pacific/Niue': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashNiue;
        case r'Pacific/Norfolk': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashNorfolk;
        case r'Pacific/Noumea': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashNoumea;
        case r'Pacific/Pago_Pago': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashPagoPago;
        case r'Pacific/Palau': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashPalau;
        case r'Pacific/Pitcairn': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashPitcairn;
        case r'Pacific/Pohnpei': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashPohnpei;
        case r'Pacific/Port_Moresby': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashPortMoresby;
        case r'Pacific/Rarotonga': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashRarotonga;
        case r'Pacific/Tahiti': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashTahiti;
        case r'Pacific/Tarawa': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashTarawa;
        case r'Pacific/Tongatapu': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashTongatapu;
        case r'Pacific/Wake': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashWake;
        case r'Pacific/Wallis': return CatalogsFeedProcessingScheduleTimezoneEnum.pacificSlashWallis;
        case r'WET': return CatalogsFeedProcessingScheduleTimezoneEnum.WET;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsFeedProcessingScheduleTimezoneEnumTypeTransformer] instance.
  static CatalogsFeedProcessingScheduleTimezoneEnumTypeTransformer? _instance;
}


