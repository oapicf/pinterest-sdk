//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_feed_processing_schedule.g.dart';

/// Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
///
/// Properties:
/// * [time] - A time in format HH:MM with leading 0 (zero)
/// * [timezone] - The timezone considered for the processing schedule time.
@BuiltValue()
abstract class CatalogsFeedProcessingSchedule implements Built<CatalogsFeedProcessingSchedule, CatalogsFeedProcessingScheduleBuilder> {
  /// A time in format HH:MM with leading 0 (zero)
  @BuiltValueField(wireName: r'time')
  String get time;

  /// The timezone considered for the processing schedule time.
  @BuiltValueField(wireName: r'timezone')
  CatalogsFeedProcessingScheduleTimezoneEnum? get timezone;
  // enum timezoneEnum {  Africa/Abidjan,  Africa/Accra,  Africa/Algiers,  Africa/Bissau,  Africa/Cairo,  Africa/Casablanca,  Africa/Ceuta,  Africa/El_Aaiun,  Africa/Johannesburg,  Africa/Juba,  Africa/Khartoum,  Africa/Lagos,  Africa/Maputo,  Africa/Monrovia,  Africa/Nairobi,  Africa/Ndjamena,  Africa/Sao_Tome,  Africa/Tripoli,  Africa/Tunis,  Africa/Windhoek,  America/Adak,  America/Anchorage,  America/Araguaina,  America/Argentina/Buenos_Aires,  America/Argentina/Catamarca,  America/Argentina/Cordoba,  America/Argentina/Jujuy,  America/Argentina/La_Rioja,  America/Argentina/Mendoza,  America/Argentina/Rio_Gallegos,  America/Argentina/Salta,  America/Argentina/San_Juan,  America/Argentina/San_Luis,  America/Argentina/Tucuman,  America/Argentina/Ushuaia,  America/Asuncion,  America/Atikokan,  America/Bahia,  America/Bahia_Banderas,  America/Barbados,  America/Belem,  America/Belize,  America/Blanc-Sablon,  America/Boa_Vista,  America/Bogota,  America/Boise,  America/Cambridge_Bay,  America/Campo_Grande,  America/Cancun,  America/Caracas,  America/Cayenne,  America/Chicago,  America/Chihuahua,  America/Costa_Rica,  America/Creston,  America/Cuiaba,  America/Curacao,  America/Danmarkshavn,  America/Dawson,  America/Dawson_Creek,  America/Denver,  America/Detroit,  America/Edmonton,  America/Eirunepe,  America/El_Salvador,  America/Fort_Nelson,  America/Fortaleza,  America/Glace_Bay,  America/Goose_Bay,  America/Grand_Turk,  America/Guatemala,  America/Guayaquil,  America/Guyana,  America/Halifax,  America/Havana,  America/Hermosillo,  America/Indiana/Indianapolis,  America/Indiana/Knox,  America/Indiana/Marengo,  America/Indiana/Petersburg,  America/Indiana/Tell_City,  America/Indiana/Vevay,  America/Indiana/Vincennes,  America/Indiana/Winamac,  America/Inuvik,  America/Iqaluit,  America/Jamaica,  America/Juneau,  America/Kentucky/Louisville,  America/Kentucky/Monticello,  America/La_Paz,  America/Lima,  America/Los_Angeles,  America/Maceio,  America/Managua,  America/Manaus,  America/Martinique,  America/Matamoros,  America/Mazatlan,  America/Menominee,  America/Merida,  America/Metlakatla,  America/Mexico_City,  America/Miquelon,  America/Moncton,  America/Monterrey,  America/Montevideo,  America/Nassau,  America/New_York,  America/Nipigon,  America/Nome,  America/Noronha,  America/North_Dakota/Beulah,  America/North_Dakota/Center,  America/North_Dakota/New_Salem,  America/Nuuk,  America/Ojinaga,  America/Panama,  America/Pangnirtung,  America/Paramaribo,  America/Phoenix,  America/Port-au-Prince,  America/Port_of_Spain,  America/Porto_Velho,  America/Puerto_Rico,  America/Punta_Arenas,  America/Rainy_River,  America/Rankin_Inlet,  America/Recife,  America/Regina,  America/Resolute,  America/Rio_Branco,  America/Santarem,  America/Santiago,  America/Santo_Domingo,  America/Sao_Paulo,  America/Scoresbysund,  America/Sitka,  America/St_Johns,  America/Swift_Current,  America/Tegucigalpa,  America/Thule,  America/Thunder_Bay,  America/Tijuana,  America/Toronto,  America/Vancouver,  America/Whitehorse,  America/Winnipeg,  America/Yakutat,  America/Yellowknife,  Antarctica/Casey,  Antarctica/Davis,  Antarctica/DumontDUrville,  Antarctica/Macquarie,  Antarctica/Mawson,  Antarctica/Palmer,  Antarctica/Rothera,  Antarctica/Syowa,  Antarctica/Troll,  Antarctica/Vostok,  Asia/Almaty,  Asia/Amman,  Asia/Anadyr,  Asia/Aqtau,  Asia/Aqtobe,  Asia/Ashgabat,  Asia/Atyrau,  Asia/Baghdad,  Asia/Baku,  Asia/Bangkok,  Asia/Barnaul,  Asia/Beirut,  Asia/Bishkek,  Asia/Brunei,  Asia/Chita,  Asia/Choibalsan,  Asia/Colombo,  Asia/Damascus,  Asia/Dhaka,  Asia/Dili,  Asia/Dubai,  Asia/Dushanbe,  Asia/Famagusta,  Asia/Gaza,  Asia/Hebron,  Asia/Ho_Chi_Minh,  Asia/Hong_Kong,  Asia/Hovd,  Asia/Irkutsk,  Asia/Jakarta,  Asia/Jayapura,  Asia/Jerusalem,  Asia/Kabul,  Asia/Kamchatka,  Asia/Karachi,  Asia/Kathmandu,  Asia/Khandyga,  Asia/Kolkata,  Asia/Krasnoyarsk,  Asia/Kuala_Lumpur,  Asia/Kuching,  Asia/Macau,  Asia/Magadan,  Asia/Makassar,  Asia/Manila,  Asia/Nicosia,  Asia/Novokuznetsk,  Asia/Novosibirsk,  Asia/Omsk,  Asia/Oral,  Asia/Pontianak,  Asia/Pyongyang,  Asia/Qatar,  Asia/Qostanay,  Asia/Qyzylorda,  Asia/Riyadh,  Asia/Sakhalin,  Asia/Samarkand,  Asia/Seoul,  Asia/Shanghai,  Asia/Singapore,  Asia/Srednekolymsk,  Asia/Taipei,  Asia/Tashkent,  Asia/Tbilisi,  Asia/Tehran,  Asia/Thimphu,  Asia/Tokyo,  Asia/Tomsk,  Asia/Ulaanbaatar,  Asia/Urumqi,  Asia/Ust-Nera,  Asia/Vladivostok,  Asia/Yakutsk,  Asia/Yangon,  Asia/Yekaterinburg,  Asia/Yerevan,  Atlantic/Azores,  Atlantic/Bermuda,  Atlantic/Canary,  Atlantic/Cape_Verde,  Atlantic/Faroe,  Atlantic/Madeira,  Atlantic/Reykjavik,  Atlantic/South_Georgia,  Atlantic/Stanley,  Australia/Adelaide,  Australia/Brisbane,  Australia/Broken_Hill,  Australia/Currie,  Australia/Darwin,  Australia/Eucla,  Australia/Hobart,  Australia/Lindeman,  Australia/Lord_Howe,  Australia/Melbourne,  Australia/Perth,  Australia/Sydney,  CET,  CST6CDT,  EET,  EST,  EST5EDT,  Etc/GMT,  Etc/GMT+1,  Etc/GMT+10,  Etc/GMT+11,  Etc/GMT+12,  Etc/GMT+2,  Etc/GMT+3,  Etc/GMT+4,  Etc/GMT+5,  Etc/GMT+6,  Etc/GMT+7,  Etc/GMT+8,  Etc/GMT+9,  Etc/GMT-1,  Etc/GMT-10,  Etc/GMT-11,  Etc/GMT-12,  Etc/GMT-13,  Etc/GMT-14,  Etc/GMT-2,  Etc/GMT-3,  Etc/GMT-4,  Etc/GMT-5,  Etc/GMT-6,  Etc/GMT-7,  Etc/GMT-8,  Etc/GMT-9,  Etc/UTC,  Europe/Amsterdam,  Europe/Andorra,  Europe/Astrakhan,  Europe/Athens,  Europe/Belgrade,  Europe/Berlin,  Europe/Brussels,  Europe/Bucharest,  Europe/Budapest,  Europe/Chisinau,  Europe/Copenhagen,  Europe/Dublin,  Europe/Gibraltar,  Europe/Helsinki,  Europe/Istanbul,  Europe/Kaliningrad,  Europe/Kiev,  Europe/Kirov,  Europe/Lisbon,  Europe/London,  Europe/Luxembourg,  Europe/Madrid,  Europe/Malta,  Europe/Minsk,  Europe/Monaco,  Europe/Moscow,  Europe/Oslo,  Europe/Paris,  Europe/Prague,  Europe/Riga,  Europe/Rome,  Europe/Samara,  Europe/Saratov,  Europe/Simferopol,  Europe/Sofia,  Europe/Stockholm,  Europe/Tallinn,  Europe/Tirane,  Europe/Ulyanovsk,  Europe/Uzhgorod,  Europe/Vienna,  Europe/Vilnius,  Europe/Volgograd,  Europe/Warsaw,  Europe/Zaporozhye,  Europe/Zurich,  HST,  Indian/Chagos,  Indian/Christmas,  Indian/Cocos,  Indian/Kerguelen,  Indian/Mahe,  Indian/Maldives,  Indian/Mauritius,  Indian/Reunion,  MET,  MST,  MST7MDT,  PST8PDT,  Pacific/Apia,  Pacific/Auckland,  Pacific/Bougainville,  Pacific/Chatham,  Pacific/Chuuk,  Pacific/Easter,  Pacific/Efate,  Pacific/Enderbury,  Pacific/Fakaofo,  Pacific/Fiji,  Pacific/Funafuti,  Pacific/Galapagos,  Pacific/Gambier,  Pacific/Guadalcanal,  Pacific/Guam,  Pacific/Honolulu,  Pacific/Kiritimati,  Pacific/Kosrae,  Pacific/Kwajalein,  Pacific/Majuro,  Pacific/Marquesas,  Pacific/Nauru,  Pacific/Niue,  Pacific/Norfolk,  Pacific/Noumea,  Pacific/Pago_Pago,  Pacific/Palau,  Pacific/Pitcairn,  Pacific/Pohnpei,  Pacific/Port_Moresby,  Pacific/Rarotonga,  Pacific/Tahiti,  Pacific/Tarawa,  Pacific/Tongatapu,  Pacific/Wake,  Pacific/Wallis,  WET,  ,  };

  CatalogsFeedProcessingSchedule._();

  factory CatalogsFeedProcessingSchedule([void updates(CatalogsFeedProcessingScheduleBuilder b)]) = _$CatalogsFeedProcessingSchedule;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsFeedProcessingScheduleBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsFeedProcessingSchedule> get serializer => _$CatalogsFeedProcessingScheduleSerializer();
}

class _$CatalogsFeedProcessingScheduleSerializer implements PrimitiveSerializer<CatalogsFeedProcessingSchedule> {
  @override
  final Iterable<Type> types = const [CatalogsFeedProcessingSchedule, _$CatalogsFeedProcessingSchedule];

  @override
  final String wireName = r'CatalogsFeedProcessingSchedule';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsFeedProcessingSchedule object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'time';
    yield serializers.serialize(
      object.time,
      specifiedType: const FullType(String),
    );
    yield r'timezone';
    yield object.timezone == null ? null : serializers.serialize(
      object.timezone,
      specifiedType: const FullType.nullable(CatalogsFeedProcessingScheduleTimezoneEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsFeedProcessingSchedule object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsFeedProcessingScheduleBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.time = valueDes;
          break;
        case r'timezone':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CatalogsFeedProcessingScheduleTimezoneEnum),
          ) as CatalogsFeedProcessingScheduleTimezoneEnum?;
          if (valueDes == null) continue;
          result.timezone = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsFeedProcessingSchedule deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsFeedProcessingScheduleBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

class CatalogsFeedProcessingScheduleTimezoneEnum extends EnumClass {

  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/Abidjan')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashAbidjan = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashAbidjan;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/Accra')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashAccra = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashAccra;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/Algiers')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashAlgiers = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashAlgiers;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/Bissau')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashBissau = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashBissau;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/Cairo')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashCairo = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashCairo;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/Casablanca')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashCasablanca = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashCasablanca;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/Ceuta')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashCeuta = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashCeuta;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/El_Aaiun')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashElAaiun = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashElAaiun;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/Johannesburg')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashJohannesburg = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashJohannesburg;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/Juba')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashJuba = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashJuba;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/Khartoum')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashKhartoum = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashKhartoum;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/Lagos')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashLagos = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashLagos;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/Maputo')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashMaputo = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashMaputo;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/Monrovia')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashMonrovia = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashMonrovia;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/Nairobi')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashNairobi = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashNairobi;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/Ndjamena')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashNdjamena = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashNdjamena;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/Sao_Tome')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashSaoTome = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashSaoTome;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/Tripoli')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashTripoli = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashTripoli;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/Tunis')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashTunis = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashTunis;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Africa/Windhoek')
  static const CatalogsFeedProcessingScheduleTimezoneEnum africaSlashWindhoek = _$catalogsFeedProcessingScheduleTimezoneEnum_africaSlashWindhoek;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Adak')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashAdak = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashAdak;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Anchorage')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashAnchorage = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashAnchorage;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Araguaina')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashAraguaina = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashAraguaina;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Argentina/Buenos_Aires')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashArgentinaSlashBuenosAires = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashArgentinaSlashBuenosAires;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Argentina/Catamarca')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashArgentinaSlashCatamarca = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashArgentinaSlashCatamarca;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Argentina/Cordoba')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashArgentinaSlashCordoba = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashArgentinaSlashCordoba;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Argentina/Jujuy')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashArgentinaSlashJujuy = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashArgentinaSlashJujuy;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Argentina/La_Rioja')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashArgentinaSlashLaRioja = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashArgentinaSlashLaRioja;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Argentina/Mendoza')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashArgentinaSlashMendoza = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashArgentinaSlashMendoza;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Argentina/Rio_Gallegos')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashArgentinaSlashRioGallegos = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashArgentinaSlashRioGallegos;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Argentina/Salta')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashArgentinaSlashSalta = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashArgentinaSlashSalta;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Argentina/San_Juan')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashArgentinaSlashSanJuan = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashArgentinaSlashSanJuan;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Argentina/San_Luis')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashArgentinaSlashSanLuis = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashArgentinaSlashSanLuis;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Argentina/Tucuman')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashArgentinaSlashTucuman = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashArgentinaSlashTucuman;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Argentina/Ushuaia')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashArgentinaSlashUshuaia = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashArgentinaSlashUshuaia;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Asuncion')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashAsuncion = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashAsuncion;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Atikokan')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashAtikokan = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashAtikokan;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Bahia')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashBahia = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashBahia;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Bahia_Banderas')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashBahiaBanderas = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashBahiaBanderas;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Barbados')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashBarbados = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashBarbados;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Belem')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashBelem = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashBelem;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Belize')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashBelize = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashBelize;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Blanc-Sablon')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashBlancSablon = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashBlancSablon;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Boa_Vista')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashBoaVista = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashBoaVista;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Bogota')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashBogota = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashBogota;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Boise')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashBoise = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashBoise;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Cambridge_Bay')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashCambridgeBay = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashCambridgeBay;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Campo_Grande')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashCampoGrande = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashCampoGrande;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Cancun')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashCancun = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashCancun;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Caracas')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashCaracas = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashCaracas;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Cayenne')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashCayenne = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashCayenne;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Chicago')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashChicago = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashChicago;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Chihuahua')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashChihuahua = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashChihuahua;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Costa_Rica')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashCostaRica = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashCostaRica;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Creston')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashCreston = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashCreston;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Cuiaba')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashCuiaba = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashCuiaba;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Curacao')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashCuracao = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashCuracao;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Danmarkshavn')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashDanmarkshavn = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashDanmarkshavn;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Dawson')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashDawson = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashDawson;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Dawson_Creek')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashDawsonCreek = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashDawsonCreek;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Denver')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashDenver = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashDenver;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Detroit')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashDetroit = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashDetroit;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Edmonton')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashEdmonton = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashEdmonton;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Eirunepe')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashEirunepe = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashEirunepe;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/El_Salvador')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashElSalvador = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashElSalvador;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Fort_Nelson')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashFortNelson = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashFortNelson;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Fortaleza')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashFortaleza = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashFortaleza;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Glace_Bay')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashGlaceBay = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashGlaceBay;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Goose_Bay')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashGooseBay = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashGooseBay;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Grand_Turk')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashGrandTurk = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashGrandTurk;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Guatemala')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashGuatemala = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashGuatemala;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Guayaquil')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashGuayaquil = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashGuayaquil;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Guyana')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashGuyana = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashGuyana;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Halifax')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashHalifax = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashHalifax;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Havana')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashHavana = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashHavana;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Hermosillo')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashHermosillo = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashHermosillo;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Indiana/Indianapolis')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashIndianaSlashIndianapolis = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashIndianaSlashIndianapolis;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Indiana/Knox')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashIndianaSlashKnox = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashIndianaSlashKnox;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Indiana/Marengo')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashIndianaSlashMarengo = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashIndianaSlashMarengo;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Indiana/Petersburg')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashIndianaSlashPetersburg = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashIndianaSlashPetersburg;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Indiana/Tell_City')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashIndianaSlashTellCity = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashIndianaSlashTellCity;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Indiana/Vevay')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashIndianaSlashVevay = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashIndianaSlashVevay;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Indiana/Vincennes')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashIndianaSlashVincennes = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashIndianaSlashVincennes;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Indiana/Winamac')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashIndianaSlashWinamac = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashIndianaSlashWinamac;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Inuvik')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashInuvik = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashInuvik;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Iqaluit')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashIqaluit = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashIqaluit;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Jamaica')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashJamaica = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashJamaica;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Juneau')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashJuneau = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashJuneau;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Kentucky/Louisville')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashKentuckySlashLouisville = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashKentuckySlashLouisville;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Kentucky/Monticello')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashKentuckySlashMonticello = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashKentuckySlashMonticello;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/La_Paz')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashLaPaz = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashLaPaz;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Lima')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashLima = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashLima;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Los_Angeles')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashLosAngeles = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashLosAngeles;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Maceio')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashMaceio = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashMaceio;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Managua')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashManagua = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashManagua;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Manaus')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashManaus = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashManaus;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Martinique')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashMartinique = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashMartinique;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Matamoros')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashMatamoros = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashMatamoros;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Mazatlan')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashMazatlan = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashMazatlan;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Menominee')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashMenominee = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashMenominee;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Merida')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashMerida = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashMerida;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Metlakatla')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashMetlakatla = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashMetlakatla;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Mexico_City')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashMexicoCity = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashMexicoCity;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Miquelon')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashMiquelon = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashMiquelon;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Moncton')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashMoncton = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashMoncton;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Monterrey')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashMonterrey = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashMonterrey;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Montevideo')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashMontevideo = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashMontevideo;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Nassau')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashNassau = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashNassau;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/New_York')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashNewYork = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashNewYork;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Nipigon')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashNipigon = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashNipigon;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Nome')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashNome = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashNome;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Noronha')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashNoronha = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashNoronha;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/North_Dakota/Beulah')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashNorthDakotaSlashBeulah = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashNorthDakotaSlashBeulah;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/North_Dakota/Center')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashNorthDakotaSlashCenter = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashNorthDakotaSlashCenter;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/North_Dakota/New_Salem')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashNorthDakotaSlashNewSalem = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashNorthDakotaSlashNewSalem;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Nuuk')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashNuuk = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashNuuk;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Ojinaga')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashOjinaga = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashOjinaga;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Panama')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashPanama = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashPanama;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Pangnirtung')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashPangnirtung = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashPangnirtung;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Paramaribo')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashParamaribo = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashParamaribo;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Phoenix')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashPhoenix = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashPhoenix;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Port-au-Prince')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashPortAuPrince = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashPortAuPrince;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Port_of_Spain')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashPortOfSpain = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashPortOfSpain;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Porto_Velho')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashPortoVelho = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashPortoVelho;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Puerto_Rico')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashPuertoRico = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashPuertoRico;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Punta_Arenas')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashPuntaArenas = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashPuntaArenas;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Rainy_River')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashRainyRiver = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashRainyRiver;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Rankin_Inlet')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashRankinInlet = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashRankinInlet;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Recife')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashRecife = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashRecife;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Regina')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashRegina = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashRegina;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Resolute')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashResolute = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashResolute;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Rio_Branco')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashRioBranco = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashRioBranco;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Santarem')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashSantarem = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashSantarem;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Santiago')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashSantiago = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashSantiago;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Santo_Domingo')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashSantoDomingo = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashSantoDomingo;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Sao_Paulo')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashSaoPaulo = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashSaoPaulo;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Scoresbysund')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashScoresbysund = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashScoresbysund;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Sitka')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashSitka = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashSitka;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/St_Johns')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashStJohns = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashStJohns;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Swift_Current')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashSwiftCurrent = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashSwiftCurrent;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Tegucigalpa')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashTegucigalpa = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashTegucigalpa;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Thule')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashThule = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashThule;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Thunder_Bay')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashThunderBay = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashThunderBay;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Tijuana')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashTijuana = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashTijuana;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Toronto')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashToronto = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashToronto;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Vancouver')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashVancouver = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashVancouver;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Whitehorse')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashWhitehorse = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashWhitehorse;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Winnipeg')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashWinnipeg = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashWinnipeg;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Yakutat')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashYakutat = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashYakutat;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'America/Yellowknife')
  static const CatalogsFeedProcessingScheduleTimezoneEnum americaSlashYellowknife = _$catalogsFeedProcessingScheduleTimezoneEnum_americaSlashYellowknife;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Antarctica/Casey')
  static const CatalogsFeedProcessingScheduleTimezoneEnum antarcticaSlashCasey = _$catalogsFeedProcessingScheduleTimezoneEnum_antarcticaSlashCasey;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Antarctica/Davis')
  static const CatalogsFeedProcessingScheduleTimezoneEnum antarcticaSlashDavis = _$catalogsFeedProcessingScheduleTimezoneEnum_antarcticaSlashDavis;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Antarctica/DumontDUrville')
  static const CatalogsFeedProcessingScheduleTimezoneEnum antarcticaSlashDumontDUrville = _$catalogsFeedProcessingScheduleTimezoneEnum_antarcticaSlashDumontDUrville;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Antarctica/Macquarie')
  static const CatalogsFeedProcessingScheduleTimezoneEnum antarcticaSlashMacquarie = _$catalogsFeedProcessingScheduleTimezoneEnum_antarcticaSlashMacquarie;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Antarctica/Mawson')
  static const CatalogsFeedProcessingScheduleTimezoneEnum antarcticaSlashMawson = _$catalogsFeedProcessingScheduleTimezoneEnum_antarcticaSlashMawson;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Antarctica/Palmer')
  static const CatalogsFeedProcessingScheduleTimezoneEnum antarcticaSlashPalmer = _$catalogsFeedProcessingScheduleTimezoneEnum_antarcticaSlashPalmer;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Antarctica/Rothera')
  static const CatalogsFeedProcessingScheduleTimezoneEnum antarcticaSlashRothera = _$catalogsFeedProcessingScheduleTimezoneEnum_antarcticaSlashRothera;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Antarctica/Syowa')
  static const CatalogsFeedProcessingScheduleTimezoneEnum antarcticaSlashSyowa = _$catalogsFeedProcessingScheduleTimezoneEnum_antarcticaSlashSyowa;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Antarctica/Troll')
  static const CatalogsFeedProcessingScheduleTimezoneEnum antarcticaSlashTroll = _$catalogsFeedProcessingScheduleTimezoneEnum_antarcticaSlashTroll;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Antarctica/Vostok')
  static const CatalogsFeedProcessingScheduleTimezoneEnum antarcticaSlashVostok = _$catalogsFeedProcessingScheduleTimezoneEnum_antarcticaSlashVostok;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Almaty')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashAlmaty = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashAlmaty;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Amman')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashAmman = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashAmman;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Anadyr')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashAnadyr = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashAnadyr;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Aqtau')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashAqtau = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashAqtau;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Aqtobe')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashAqtobe = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashAqtobe;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Ashgabat')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashAshgabat = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashAshgabat;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Atyrau')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashAtyrau = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashAtyrau;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Baghdad')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashBaghdad = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashBaghdad;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Baku')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashBaku = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashBaku;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Bangkok')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashBangkok = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashBangkok;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Barnaul')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashBarnaul = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashBarnaul;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Beirut')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashBeirut = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashBeirut;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Bishkek')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashBishkek = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashBishkek;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Brunei')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashBrunei = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashBrunei;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Chita')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashChita = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashChita;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Choibalsan')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashChoibalsan = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashChoibalsan;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Colombo')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashColombo = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashColombo;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Damascus')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashDamascus = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashDamascus;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Dhaka')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashDhaka = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashDhaka;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Dili')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashDili = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashDili;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Dubai')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashDubai = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashDubai;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Dushanbe')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashDushanbe = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashDushanbe;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Famagusta')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashFamagusta = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashFamagusta;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Gaza')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashGaza = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashGaza;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Hebron')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashHebron = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashHebron;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Ho_Chi_Minh')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashHoChiMinh = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashHoChiMinh;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Hong_Kong')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashHongKong = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashHongKong;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Hovd')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashHovd = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashHovd;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Irkutsk')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashIrkutsk = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashIrkutsk;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Jakarta')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashJakarta = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashJakarta;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Jayapura')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashJayapura = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashJayapura;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Jerusalem')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashJerusalem = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashJerusalem;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Kabul')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashKabul = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashKabul;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Kamchatka')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashKamchatka = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashKamchatka;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Karachi')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashKarachi = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashKarachi;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Kathmandu')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashKathmandu = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashKathmandu;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Khandyga')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashKhandyga = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashKhandyga;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Kolkata')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashKolkata = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashKolkata;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Krasnoyarsk')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashKrasnoyarsk = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashKrasnoyarsk;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Kuala_Lumpur')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashKualaLumpur = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashKualaLumpur;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Kuching')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashKuching = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashKuching;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Macau')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashMacau = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashMacau;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Magadan')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashMagadan = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashMagadan;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Makassar')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashMakassar = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashMakassar;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Manila')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashManila = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashManila;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Nicosia')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashNicosia = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashNicosia;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Novokuznetsk')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashNovokuznetsk = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashNovokuznetsk;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Novosibirsk')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashNovosibirsk = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashNovosibirsk;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Omsk')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashOmsk = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashOmsk;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Oral')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashOral = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashOral;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Pontianak')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashPontianak = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashPontianak;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Pyongyang')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashPyongyang = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashPyongyang;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Qatar')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashQatar = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashQatar;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Qostanay')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashQostanay = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashQostanay;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Qyzylorda')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashQyzylorda = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashQyzylorda;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Riyadh')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashRiyadh = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashRiyadh;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Sakhalin')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashSakhalin = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashSakhalin;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Samarkand')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashSamarkand = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashSamarkand;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Seoul')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashSeoul = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashSeoul;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Shanghai')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashShanghai = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashShanghai;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Singapore')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashSingapore = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashSingapore;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Srednekolymsk')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashSrednekolymsk = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashSrednekolymsk;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Taipei')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashTaipei = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashTaipei;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Tashkent')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashTashkent = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashTashkent;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Tbilisi')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashTbilisi = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashTbilisi;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Tehran')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashTehran = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashTehran;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Thimphu')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashThimphu = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashThimphu;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Tokyo')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashTokyo = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashTokyo;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Tomsk')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashTomsk = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashTomsk;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Ulaanbaatar')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashUlaanbaatar = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashUlaanbaatar;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Urumqi')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashUrumqi = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashUrumqi;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Ust-Nera')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashUstNera = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashUstNera;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Vladivostok')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashVladivostok = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashVladivostok;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Yakutsk')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashYakutsk = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashYakutsk;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Yangon')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashYangon = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashYangon;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Yekaterinburg')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashYekaterinburg = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashYekaterinburg;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Asia/Yerevan')
  static const CatalogsFeedProcessingScheduleTimezoneEnum asiaSlashYerevan = _$catalogsFeedProcessingScheduleTimezoneEnum_asiaSlashYerevan;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Atlantic/Azores')
  static const CatalogsFeedProcessingScheduleTimezoneEnum atlanticSlashAzores = _$catalogsFeedProcessingScheduleTimezoneEnum_atlanticSlashAzores;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Atlantic/Bermuda')
  static const CatalogsFeedProcessingScheduleTimezoneEnum atlanticSlashBermuda = _$catalogsFeedProcessingScheduleTimezoneEnum_atlanticSlashBermuda;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Atlantic/Canary')
  static const CatalogsFeedProcessingScheduleTimezoneEnum atlanticSlashCanary = _$catalogsFeedProcessingScheduleTimezoneEnum_atlanticSlashCanary;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Atlantic/Cape_Verde')
  static const CatalogsFeedProcessingScheduleTimezoneEnum atlanticSlashCapeVerde = _$catalogsFeedProcessingScheduleTimezoneEnum_atlanticSlashCapeVerde;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Atlantic/Faroe')
  static const CatalogsFeedProcessingScheduleTimezoneEnum atlanticSlashFaroe = _$catalogsFeedProcessingScheduleTimezoneEnum_atlanticSlashFaroe;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Atlantic/Madeira')
  static const CatalogsFeedProcessingScheduleTimezoneEnum atlanticSlashMadeira = _$catalogsFeedProcessingScheduleTimezoneEnum_atlanticSlashMadeira;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Atlantic/Reykjavik')
  static const CatalogsFeedProcessingScheduleTimezoneEnum atlanticSlashReykjavik = _$catalogsFeedProcessingScheduleTimezoneEnum_atlanticSlashReykjavik;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Atlantic/South_Georgia')
  static const CatalogsFeedProcessingScheduleTimezoneEnum atlanticSlashSouthGeorgia = _$catalogsFeedProcessingScheduleTimezoneEnum_atlanticSlashSouthGeorgia;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Atlantic/Stanley')
  static const CatalogsFeedProcessingScheduleTimezoneEnum atlanticSlashStanley = _$catalogsFeedProcessingScheduleTimezoneEnum_atlanticSlashStanley;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Australia/Adelaide')
  static const CatalogsFeedProcessingScheduleTimezoneEnum australiaSlashAdelaide = _$catalogsFeedProcessingScheduleTimezoneEnum_australiaSlashAdelaide;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Australia/Brisbane')
  static const CatalogsFeedProcessingScheduleTimezoneEnum australiaSlashBrisbane = _$catalogsFeedProcessingScheduleTimezoneEnum_australiaSlashBrisbane;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Australia/Broken_Hill')
  static const CatalogsFeedProcessingScheduleTimezoneEnum australiaSlashBrokenHill = _$catalogsFeedProcessingScheduleTimezoneEnum_australiaSlashBrokenHill;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Australia/Currie')
  static const CatalogsFeedProcessingScheduleTimezoneEnum australiaSlashCurrie = _$catalogsFeedProcessingScheduleTimezoneEnum_australiaSlashCurrie;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Australia/Darwin')
  static const CatalogsFeedProcessingScheduleTimezoneEnum australiaSlashDarwin = _$catalogsFeedProcessingScheduleTimezoneEnum_australiaSlashDarwin;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Australia/Eucla')
  static const CatalogsFeedProcessingScheduleTimezoneEnum australiaSlashEucla = _$catalogsFeedProcessingScheduleTimezoneEnum_australiaSlashEucla;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Australia/Hobart')
  static const CatalogsFeedProcessingScheduleTimezoneEnum australiaSlashHobart = _$catalogsFeedProcessingScheduleTimezoneEnum_australiaSlashHobart;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Australia/Lindeman')
  static const CatalogsFeedProcessingScheduleTimezoneEnum australiaSlashLindeman = _$catalogsFeedProcessingScheduleTimezoneEnum_australiaSlashLindeman;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Australia/Lord_Howe')
  static const CatalogsFeedProcessingScheduleTimezoneEnum australiaSlashLordHowe = _$catalogsFeedProcessingScheduleTimezoneEnum_australiaSlashLordHowe;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Australia/Melbourne')
  static const CatalogsFeedProcessingScheduleTimezoneEnum australiaSlashMelbourne = _$catalogsFeedProcessingScheduleTimezoneEnum_australiaSlashMelbourne;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Australia/Perth')
  static const CatalogsFeedProcessingScheduleTimezoneEnum australiaSlashPerth = _$catalogsFeedProcessingScheduleTimezoneEnum_australiaSlashPerth;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Australia/Sydney')
  static const CatalogsFeedProcessingScheduleTimezoneEnum australiaSlashSydney = _$catalogsFeedProcessingScheduleTimezoneEnum_australiaSlashSydney;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'CET')
  static const CatalogsFeedProcessingScheduleTimezoneEnum CET = _$catalogsFeedProcessingScheduleTimezoneEnum_CET;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'CST6CDT')
  static const CatalogsFeedProcessingScheduleTimezoneEnum cST6CDT = _$catalogsFeedProcessingScheduleTimezoneEnum_cST6CDT;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'EET')
  static const CatalogsFeedProcessingScheduleTimezoneEnum EET = _$catalogsFeedProcessingScheduleTimezoneEnum_EET;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'EST')
  static const CatalogsFeedProcessingScheduleTimezoneEnum EST = _$catalogsFeedProcessingScheduleTimezoneEnum_EST;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'EST5EDT')
  static const CatalogsFeedProcessingScheduleTimezoneEnum eST5EDT = _$catalogsFeedProcessingScheduleTimezoneEnum_eST5EDT;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMT = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMT;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT+1')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMTPlus1 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMTPlus1;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT+10')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMTPlus10 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMTPlus10;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT+11')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMTPlus11 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMTPlus11;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT+12')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMTPlus12 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMTPlus12;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT+2')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMTPlus2 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMTPlus2;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT+3')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMTPlus3 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMTPlus3;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT+4')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMTPlus4 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMTPlus4;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT+5')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMTPlus5 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMTPlus5;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT+6')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMTPlus6 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMTPlus6;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT+7')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMTPlus7 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMTPlus7;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT+8')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMTPlus8 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMTPlus8;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT+9')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMTPlus9 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMTPlus9;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT-1')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMT1 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMT1;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT-10')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMT10 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMT10;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT-11')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMT11 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMT11;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT-12')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMT12 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMT12;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT-13')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMT13 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMT13;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT-14')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMT14 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMT14;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT-2')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMT2 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMT2;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT-3')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMT3 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMT3;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT-4')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMT4 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMT4;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT-5')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMT5 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMT5;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT-6')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMT6 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMT6;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT-7')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMT7 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMT7;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT-8')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMT8 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMT8;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/GMT-9')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashGMT9 = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashGMT9;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Etc/UTC')
  static const CatalogsFeedProcessingScheduleTimezoneEnum etcSlashUTC = _$catalogsFeedProcessingScheduleTimezoneEnum_etcSlashUTC;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Amsterdam')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashAmsterdam = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashAmsterdam;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Andorra')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashAndorra = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashAndorra;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Astrakhan')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashAstrakhan = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashAstrakhan;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Athens')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashAthens = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashAthens;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Belgrade')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashBelgrade = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashBelgrade;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Berlin')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashBerlin = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashBerlin;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Brussels')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashBrussels = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashBrussels;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Bucharest')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashBucharest = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashBucharest;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Budapest')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashBudapest = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashBudapest;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Chisinau')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashChisinau = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashChisinau;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Copenhagen')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashCopenhagen = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashCopenhagen;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Dublin')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashDublin = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashDublin;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Gibraltar')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashGibraltar = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashGibraltar;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Helsinki')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashHelsinki = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashHelsinki;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Istanbul')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashIstanbul = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashIstanbul;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Kaliningrad')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashKaliningrad = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashKaliningrad;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Kiev')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashKiev = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashKiev;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Kirov')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashKirov = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashKirov;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Lisbon')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashLisbon = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashLisbon;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/London')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashLondon = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashLondon;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Luxembourg')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashLuxembourg = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashLuxembourg;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Madrid')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashMadrid = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashMadrid;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Malta')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashMalta = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashMalta;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Minsk')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashMinsk = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashMinsk;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Monaco')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashMonaco = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashMonaco;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Moscow')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashMoscow = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashMoscow;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Oslo')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashOslo = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashOslo;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Paris')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashParis = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashParis;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Prague')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashPrague = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashPrague;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Riga')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashRiga = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashRiga;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Rome')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashRome = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashRome;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Samara')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashSamara = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashSamara;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Saratov')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashSaratov = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashSaratov;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Simferopol')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashSimferopol = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashSimferopol;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Sofia')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashSofia = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashSofia;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Stockholm')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashStockholm = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashStockholm;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Tallinn')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashTallinn = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashTallinn;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Tirane')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashTirane = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashTirane;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Ulyanovsk')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashUlyanovsk = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashUlyanovsk;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Uzhgorod')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashUzhgorod = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashUzhgorod;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Vienna')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashVienna = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashVienna;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Vilnius')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashVilnius = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashVilnius;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Volgograd')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashVolgograd = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashVolgograd;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Warsaw')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashWarsaw = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashWarsaw;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Zaporozhye')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashZaporozhye = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashZaporozhye;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Europe/Zurich')
  static const CatalogsFeedProcessingScheduleTimezoneEnum europeSlashZurich = _$catalogsFeedProcessingScheduleTimezoneEnum_europeSlashZurich;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'HST')
  static const CatalogsFeedProcessingScheduleTimezoneEnum HST = _$catalogsFeedProcessingScheduleTimezoneEnum_HST;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Indian/Chagos')
  static const CatalogsFeedProcessingScheduleTimezoneEnum indianSlashChagos = _$catalogsFeedProcessingScheduleTimezoneEnum_indianSlashChagos;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Indian/Christmas')
  static const CatalogsFeedProcessingScheduleTimezoneEnum indianSlashChristmas = _$catalogsFeedProcessingScheduleTimezoneEnum_indianSlashChristmas;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Indian/Cocos')
  static const CatalogsFeedProcessingScheduleTimezoneEnum indianSlashCocos = _$catalogsFeedProcessingScheduleTimezoneEnum_indianSlashCocos;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Indian/Kerguelen')
  static const CatalogsFeedProcessingScheduleTimezoneEnum indianSlashKerguelen = _$catalogsFeedProcessingScheduleTimezoneEnum_indianSlashKerguelen;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Indian/Mahe')
  static const CatalogsFeedProcessingScheduleTimezoneEnum indianSlashMahe = _$catalogsFeedProcessingScheduleTimezoneEnum_indianSlashMahe;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Indian/Maldives')
  static const CatalogsFeedProcessingScheduleTimezoneEnum indianSlashMaldives = _$catalogsFeedProcessingScheduleTimezoneEnum_indianSlashMaldives;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Indian/Mauritius')
  static const CatalogsFeedProcessingScheduleTimezoneEnum indianSlashMauritius = _$catalogsFeedProcessingScheduleTimezoneEnum_indianSlashMauritius;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Indian/Reunion')
  static const CatalogsFeedProcessingScheduleTimezoneEnum indianSlashReunion = _$catalogsFeedProcessingScheduleTimezoneEnum_indianSlashReunion;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'MET')
  static const CatalogsFeedProcessingScheduleTimezoneEnum MET = _$catalogsFeedProcessingScheduleTimezoneEnum_MET;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'MST')
  static const CatalogsFeedProcessingScheduleTimezoneEnum MST = _$catalogsFeedProcessingScheduleTimezoneEnum_MST;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'MST7MDT')
  static const CatalogsFeedProcessingScheduleTimezoneEnum mST7MDT = _$catalogsFeedProcessingScheduleTimezoneEnum_mST7MDT;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'PST8PDT')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pST8PDT = _$catalogsFeedProcessingScheduleTimezoneEnum_pST8PDT;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Apia')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashApia = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashApia;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Auckland')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashAuckland = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashAuckland;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Bougainville')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashBougainville = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashBougainville;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Chatham')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashChatham = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashChatham;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Chuuk')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashChuuk = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashChuuk;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Easter')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashEaster = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashEaster;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Efate')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashEfate = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashEfate;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Enderbury')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashEnderbury = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashEnderbury;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Fakaofo')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashFakaofo = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashFakaofo;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Fiji')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashFiji = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashFiji;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Funafuti')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashFunafuti = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashFunafuti;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Galapagos')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashGalapagos = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashGalapagos;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Gambier')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashGambier = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashGambier;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Guadalcanal')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashGuadalcanal = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashGuadalcanal;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Guam')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashGuam = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashGuam;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Honolulu')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashHonolulu = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashHonolulu;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Kiritimati')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashKiritimati = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashKiritimati;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Kosrae')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashKosrae = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashKosrae;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Kwajalein')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashKwajalein = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashKwajalein;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Majuro')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashMajuro = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashMajuro;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Marquesas')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashMarquesas = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashMarquesas;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Nauru')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashNauru = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashNauru;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Niue')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashNiue = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashNiue;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Norfolk')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashNorfolk = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashNorfolk;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Noumea')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashNoumea = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashNoumea;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Pago_Pago')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashPagoPago = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashPagoPago;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Palau')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashPalau = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashPalau;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Pitcairn')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashPitcairn = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashPitcairn;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Pohnpei')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashPohnpei = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashPohnpei;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Port_Moresby')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashPortMoresby = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashPortMoresby;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Rarotonga')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashRarotonga = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashRarotonga;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Tahiti')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashTahiti = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashTahiti;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Tarawa')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashTarawa = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashTarawa;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Tongatapu')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashTongatapu = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashTongatapu;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Wake')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashWake = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashWake;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'Pacific/Wallis')
  static const CatalogsFeedProcessingScheduleTimezoneEnum pacificSlashWallis = _$catalogsFeedProcessingScheduleTimezoneEnum_pacificSlashWallis;
  /// The timezone considered for the processing schedule time.
  @BuiltValueEnumConst(wireName: r'WET')
  static const CatalogsFeedProcessingScheduleTimezoneEnum WET = _$catalogsFeedProcessingScheduleTimezoneEnum_WET;

  static Serializer<CatalogsFeedProcessingScheduleTimezoneEnum> get serializer => _$catalogsFeedProcessingScheduleTimezoneEnumSerializer;

  const CatalogsFeedProcessingScheduleTimezoneEnum._(String name): super(name);

  static BuiltSet<CatalogsFeedProcessingScheduleTimezoneEnum> get values => _$catalogsFeedProcessingScheduleTimezoneEnumValues;
  static CatalogsFeedProcessingScheduleTimezoneEnum valueOf(String name) => _$catalogsFeedProcessingScheduleTimezoneEnumValueOf(name);
}

