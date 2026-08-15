//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/language.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advanced_auction_key.g.dart';

/// Object uniquely identifying a retail catalog item
///
/// Properties:
/// * [country] 
/// * [itemId] - The catalog retail item id in the merchant namespace
/// * [language] 
@BuiltValue(instantiable: false)
abstract class AdvancedAuctionKey  {
  @BuiltValueField(wireName: r'country')
  Country get country;
  // enum countryEnum {  AD,  AE,  AF,  AG,  AI,  AL,  AM,  AO,  AQ,  AR,  AS,  AT,  AU,  AW,  AX,  AZ,  BA,  BB,  BD,  BE,  BF,  BG,  BH,  BI,  BJ,  BL,  BM,  BN,  BO,  BQ,  BR,  BS,  BT,  BV,  BW,  BY,  BZ,  CA,  CC,  CD,  CF,  CG,  CH,  CI,  CK,  CL,  CM,  CN,  CO,  CR,  CU,  CV,  CW,  CX,  CY,  CZ,  DE,  DJ,  DK,  DM,  DO,  DZ,  EC,  EE,  EG,  EH,  ER,  ES,  ET,  FI,  FJ,  FK,  FM,  FO,  FR,  GA,  GB,  GD,  GE,  GF,  GG,  GH,  GI,  GL,  GM,  GN,  GP,  GQ,  GR,  GS,  GT,  GU,  GW,  GY,  HK,  HM,  HN,  HR,  HT,  HU,  ID,  IE,  IL,  IM,  IN,  IO,  IQ,  IR,  IS,  IT,  JE,  JM,  JO,  JP,  KE,  KG,  KH,  KI,  KM,  KN,  KR,  KW,  KY,  KZ,  LA,  LB,  LC,  LI,  LK,  LR,  LS,  LT,  LU,  LV,  LY,  MA,  MC,  MD,  ME,  MF,  MG,  MH,  MK,  ML,  MM,  MN,  MO,  MP,  MQ,  MR,  MS,  MT,  MU,  MV,  MW,  MX,  MY,  MZ,  NA,  NC,  NE,  NF,  NG,  NI,  NL,  NO,  NP,  NR,  NU,  NZ,  OM,  PA,  PE,  PF,  PG,  PH,  PK,  PL,  PM,  PN,  PR,  PS,  PT,  PW,  PY,  QA,  RE,  RO,  RS,  RU,  RW,  SA,  SB,  SC,  SD,  SE,  SG,  SH,  SI,  SJ,  SK,  SL,  SM,  SN,  SO,  SR,  SS,  ST,  SV,  SX,  SY,  SZ,  TC,  TD,  TF,  TG,  TH,  TJ,  TK,  TL,  TM,  TN,  TO,  TR,  TT,  TV,  TW,  TZ,  UA,  UG,  UM,  US,  UY,  UZ,  VA,  VC,  VE,  VG,  VI,  VN,  VU,  WF,  WS,  YE,  YT,  ZA,  ZM,  ZW,  };

  /// The catalog retail item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  @BuiltValueField(wireName: r'language')
  Language get language;
  // enum languageEnum {  AM,  AR,  AZ,  BG,  BN,  BS,  CA,  CS,  DA,  DV,  DZ,  DE,  EL,  EN,  ES,  ET,  FA,  FI,  FR,  HE,  HI,  HR,  HU,  HY,  ID,  IN,  IS,  IT,  IW,  JA,  KA,  KM,  KO,  LO,  LT,  LV,  MK,  MN,  MS,  MY,  NB,  NE,  NL,  NO,  PL,  PT,  RO,  RU,  SK,  SL,  SQ,  SR,  SV,  TL,  UK,  VI,  TE,  TH,  TR,  XX,  ZH,  };

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvancedAuctionKey> get serializer => _$AdvancedAuctionKeySerializer();
}

class _$AdvancedAuctionKeySerializer implements PrimitiveSerializer<AdvancedAuctionKey> {
  @override
  final Iterable<Type> types = const [AdvancedAuctionKey];

  @override
  final String wireName = r'AdvancedAuctionKey';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvancedAuctionKey object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'country';
    yield serializers.serialize(
      object.country,
      specifiedType: const FullType(Country),
    );
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
    yield r'language';
    yield serializers.serialize(
      object.language,
      specifiedType: const FullType(Language),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdvancedAuctionKey object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  AdvancedAuctionKey deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($AdvancedAuctionKey)) as $AdvancedAuctionKey;
  }
}

/// a concrete implementation of [AdvancedAuctionKey], since [AdvancedAuctionKey] is not instantiable
@BuiltValue(instantiable: true)
abstract class $AdvancedAuctionKey implements AdvancedAuctionKey, Built<$AdvancedAuctionKey, $AdvancedAuctionKeyBuilder> {
  $AdvancedAuctionKey._();

  factory $AdvancedAuctionKey([void Function($AdvancedAuctionKeyBuilder)? updates]) = _$$AdvancedAuctionKey;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($AdvancedAuctionKeyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$AdvancedAuctionKey> get serializer => _$$AdvancedAuctionKeySerializer();
}

class _$$AdvancedAuctionKeySerializer implements PrimitiveSerializer<$AdvancedAuctionKey> {
  @override
  final Iterable<Type> types = const [$AdvancedAuctionKey, _$$AdvancedAuctionKey];

  @override
  final String wireName = r'$AdvancedAuctionKey';

  @override
  Object serialize(
    Serializers serializers,
    $AdvancedAuctionKey object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(AdvancedAuctionKey))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvancedAuctionKeyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'country':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Country),
          ) as Country;
          result.country = valueDes;
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemId = valueDes;
          break;
        case r'language':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Language),
          ) as Language;
          result.language = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  $AdvancedAuctionKey deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $AdvancedAuctionKeyBuilder();
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

