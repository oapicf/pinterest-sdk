//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/advanced_auction_bid_options.dart';
import 'package:openapi/src/model/language.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advanced_auction_item.g.dart';

/// AdvancedAuctionItem
///
/// Properties:
/// * [bidOptions] 
/// * [country] 
/// * [itemId] - The catalog retail item id in the merchant namespace
/// * [language] 
@BuiltValue()
abstract class AdvancedAuctionItem implements Built<AdvancedAuctionItem, AdvancedAuctionItemBuilder> {
  @BuiltValueField(wireName: r'bid_options')
  AdvancedAuctionBidOptions get bidOptions;

  @BuiltValueField(wireName: r'country')
  Country get country;
  // enum countryEnum {  AD,  AE,  AF,  AG,  AI,  AL,  AM,  AO,  AQ,  AR,  AS,  AT,  AU,  AW,  AX,  AZ,  BA,  BB,  BD,  BE,  BF,  BG,  BH,  BI,  BJ,  BL,  BM,  BN,  BO,  BQ,  BR,  BS,  BT,  BV,  BW,  BY,  BZ,  CA,  CC,  CD,  CF,  CG,  CH,  CI,  CK,  CL,  CM,  CN,  CO,  CR,  CU,  CV,  CW,  CX,  CY,  CZ,  DE,  DJ,  DK,  DM,  DO,  DZ,  EC,  EE,  EG,  EH,  ER,  ES,  ET,  FI,  FJ,  FK,  FM,  FO,  FR,  GA,  GB,  GD,  GE,  GF,  GG,  GH,  GI,  GL,  GM,  GN,  GP,  GQ,  GR,  GS,  GT,  GU,  GW,  GY,  HK,  HM,  HN,  HR,  HT,  HU,  ID,  IE,  IL,  IM,  IN,  IO,  IQ,  IR,  IS,  IT,  JE,  JM,  JO,  JP,  KE,  KG,  KH,  KI,  KM,  KN,  KR,  KW,  KY,  KZ,  LA,  LB,  LC,  LI,  LK,  LR,  LS,  LT,  LU,  LV,  LY,  MA,  MC,  MD,  ME,  MF,  MG,  MH,  MK,  ML,  MM,  MN,  MO,  MP,  MQ,  MR,  MS,  MT,  MU,  MV,  MW,  MX,  MY,  MZ,  NA,  NC,  NE,  NF,  NG,  NI,  NL,  false,  NP,  NR,  NU,  NZ,  OM,  PA,  PE,  PF,  PG,  PH,  PK,  PL,  PM,  PN,  PR,  PS,  PT,  PW,  PY,  QA,  RE,  RO,  RS,  RU,  RW,  SA,  SB,  SC,  SD,  SE,  SG,  SH,  SI,  SJ,  SK,  SL,  SM,  SN,  SO,  SR,  SS,  ST,  SV,  SX,  SY,  SZ,  TC,  TD,  TF,  TG,  TH,  TJ,  TK,  TL,  TM,  TN,  TO,  TR,  TT,  TV,  TW,  TZ,  UA,  UG,  UM,  US,  UY,  UZ,  VA,  VC,  VE,  VG,  VI,  VN,  VU,  WF,  WS,  YE,  YT,  ZA,  ZM,  ZW,  };

  /// The catalog retail item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  @BuiltValueField(wireName: r'language')
  Language get language;
  // enum languageEnum {  AM,  AR,  AZ,  BG,  BN,  BS,  CA,  CS,  DA,  DV,  DZ,  DE,  EL,  EN,  ES,  ET,  FA,  FI,  FR,  HE,  HI,  HR,  HU,  HY,  ID,  IN,  IS,  IT,  IW,  JA,  KA,  KM,  KO,  LO,  LT,  LV,  MK,  MN,  MS,  MY,  NB,  NE,  NL,  false,  PL,  PT,  RO,  RU,  SK,  SL,  SQ,  SR,  SV,  TL,  UK,  VI,  TE,  TH,  TR,  XX,  ZH,  };

  AdvancedAuctionItem._();

  factory AdvancedAuctionItem([void updates(AdvancedAuctionItemBuilder b)]) = _$AdvancedAuctionItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvancedAuctionItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvancedAuctionItem> get serializer => _$AdvancedAuctionItemSerializer();
}

class _$AdvancedAuctionItemSerializer implements PrimitiveSerializer<AdvancedAuctionItem> {
  @override
  final Iterable<Type> types = const [AdvancedAuctionItem, _$AdvancedAuctionItem];

  @override
  final String wireName = r'AdvancedAuctionItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvancedAuctionItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'bid_options';
    yield serializers.serialize(
      object.bidOptions,
      specifiedType: const FullType(AdvancedAuctionBidOptions),
    );
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
    AdvancedAuctionItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvancedAuctionItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bid_options':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AdvancedAuctionBidOptions),
          ) as AdvancedAuctionBidOptions;
          result.bidOptions.replace(valueDes);
          break;
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
  AdvancedAuctionItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvancedAuctionItemBuilder();
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

