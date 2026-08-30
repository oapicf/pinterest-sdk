//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/country.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'local_store_batch_update.g.dart';

/// LocalStoreBatchUpdate
///
/// Properties:
/// * [addressPrimary] - Primary address line of the store.
/// * [addressSecondary] - Secondary address line of the store.
/// * [city] - City where the store is located.
/// * [country] - Country code where the store is located.
/// * [id] - The ID of the local store.
/// * [latitude] - Geographic latitude coordinate of the store.
/// * [longitude] - Geographic longitude coordinate of the store.
/// * [name] - The name of the local store.
/// * [postalCode] - Postal or ZIP code of the store.
/// * [region] - State or region code where the store is located.
/// * [storeCode] - Merchant provided code for the local store. Unique within the merchant's catalog.
@BuiltValue()
abstract class LocalStoreBatchUpdate implements Built<LocalStoreBatchUpdate, LocalStoreBatchUpdateBuilder> {
  /// Primary address line of the store.
  @BuiltValueField(wireName: r'address_primary')
  String? get addressPrimary;

  /// Secondary address line of the store.
  @BuiltValueField(wireName: r'address_secondary')
  String? get addressSecondary;

  /// City where the store is located.
  @BuiltValueField(wireName: r'city')
  String? get city;

  /// Country code where the store is located.
  @BuiltValueField(wireName: r'country')
  Country? get country;
  // enum countryEnum {  AD,  AE,  AF,  AG,  AI,  AL,  AM,  AO,  AQ,  AR,  AS,  AT,  AU,  AW,  AX,  AZ,  BA,  BB,  BD,  BE,  BF,  BG,  BH,  BI,  BJ,  BL,  BM,  BN,  BO,  BQ,  BR,  BS,  BT,  BV,  BW,  BY,  BZ,  CA,  CC,  CD,  CF,  CG,  CH,  CI,  CK,  CL,  CM,  CN,  CO,  CR,  CU,  CV,  CW,  CX,  CY,  CZ,  DE,  DJ,  DK,  DM,  DO,  DZ,  EC,  EE,  EG,  EH,  ER,  ES,  ET,  FI,  FJ,  FK,  FM,  FO,  FR,  GA,  GB,  GD,  GE,  GF,  GG,  GH,  GI,  GL,  GM,  GN,  GP,  GQ,  GR,  GS,  GT,  GU,  GW,  GY,  HK,  HM,  HN,  HR,  HT,  HU,  ID,  IE,  IL,  IM,  IN,  IO,  IQ,  IR,  IS,  IT,  JE,  JM,  JO,  JP,  KE,  KG,  KH,  KI,  KM,  KN,  KR,  KW,  KY,  KZ,  LA,  LB,  LC,  LI,  LK,  LR,  LS,  LT,  LU,  LV,  LY,  MA,  MC,  MD,  ME,  MF,  MG,  MH,  MK,  ML,  MM,  MN,  MO,  MP,  MQ,  MR,  MS,  MT,  MU,  MV,  MW,  MX,  MY,  MZ,  NA,  NC,  NE,  NF,  NG,  NI,  NL,  false,  NP,  NR,  NU,  NZ,  OM,  PA,  PE,  PF,  PG,  PH,  PK,  PL,  PM,  PN,  PR,  PS,  PT,  PW,  PY,  QA,  RE,  RO,  RS,  RU,  RW,  SA,  SB,  SC,  SD,  SE,  SG,  SH,  SI,  SJ,  SK,  SL,  SM,  SN,  SO,  SR,  SS,  ST,  SV,  SX,  SY,  SZ,  TC,  TD,  TF,  TG,  TH,  TJ,  TK,  TL,  TM,  TN,  TO,  TR,  TT,  TV,  TW,  TZ,  UA,  UG,  UM,  US,  UY,  UZ,  VA,  VC,  VE,  VG,  VI,  VN,  VU,  WF,  WS,  YE,  YT,  ZA,  ZM,  ZW,  };

  /// The ID of the local store.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// Geographic latitude coordinate of the store.
  @BuiltValueField(wireName: r'latitude')
  double? get latitude;

  /// Geographic longitude coordinate of the store.
  @BuiltValueField(wireName: r'longitude')
  double? get longitude;

  /// The name of the local store.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// Postal or ZIP code of the store.
  @BuiltValueField(wireName: r'postal_code')
  String? get postalCode;

  /// State or region code where the store is located.
  @BuiltValueField(wireName: r'region')
  String? get region;

  /// Merchant provided code for the local store. Unique within the merchant's catalog.
  @BuiltValueField(wireName: r'store_code')
  String? get storeCode;

  LocalStoreBatchUpdate._();

  factory LocalStoreBatchUpdate([void updates(LocalStoreBatchUpdateBuilder b)]) = _$LocalStoreBatchUpdate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocalStoreBatchUpdateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocalStoreBatchUpdate> get serializer => _$LocalStoreBatchUpdateSerializer();
}

class _$LocalStoreBatchUpdateSerializer implements PrimitiveSerializer<LocalStoreBatchUpdate> {
  @override
  final Iterable<Type> types = const [LocalStoreBatchUpdate, _$LocalStoreBatchUpdate];

  @override
  final String wireName = r'LocalStoreBatchUpdate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocalStoreBatchUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.addressPrimary != null) {
      yield r'address_primary';
      yield serializers.serialize(
        object.addressPrimary,
        specifiedType: const FullType(String),
      );
    }
    if (object.addressSecondary != null) {
      yield r'address_secondary';
      yield serializers.serialize(
        object.addressSecondary,
        specifiedType: const FullType(String),
      );
    }
    if (object.city != null) {
      yield r'city';
      yield serializers.serialize(
        object.city,
        specifiedType: const FullType(String),
      );
    }
    if (object.country != null) {
      yield r'country';
      yield serializers.serialize(
        object.country,
        specifiedType: const FullType(Country),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.latitude != null) {
      yield r'latitude';
      yield serializers.serialize(
        object.latitude,
        specifiedType: const FullType(double),
      );
    }
    if (object.longitude != null) {
      yield r'longitude';
      yield serializers.serialize(
        object.longitude,
        specifiedType: const FullType(double),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.postalCode != null) {
      yield r'postal_code';
      yield serializers.serialize(
        object.postalCode,
        specifiedType: const FullType(String),
      );
    }
    if (object.region != null) {
      yield r'region';
      yield serializers.serialize(
        object.region,
        specifiedType: const FullType(String),
      );
    }
    if (object.storeCode != null) {
      yield r'store_code';
      yield serializers.serialize(
        object.storeCode,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LocalStoreBatchUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocalStoreBatchUpdateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'address_primary':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.addressPrimary = valueDes;
          break;
        case r'address_secondary':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.addressSecondary = valueDes;
          break;
        case r'city':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.city = valueDes;
          break;
        case r'country':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Country),
          ) as Country?;
          if (valueDes == null) continue;
          result.country = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'latitude':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.latitude = valueDes;
          break;
        case r'longitude':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.longitude = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'postal_code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.postalCode = valueDes;
          break;
        case r'region':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.region = valueDes;
          break;
        case r'store_code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.storeCode = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LocalStoreBatchUpdate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocalStoreBatchUpdateBuilder();
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

