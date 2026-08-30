//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/language.dart';
import 'package:openapi/src/model/advanced_auction_operation_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advanced_auction_items_submit_delete_record.g.dart';

/// Object describing an item bid option deletion operation
///
/// Properties:
/// * [country] 
/// * [errors] - Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
/// * [itemId] - The catalog retail item id in the merchant namespace
/// * [language] 
/// * [operation] 
@BuiltValue()
abstract class AdvancedAuctionItemsSubmitDeleteRecord implements Built<AdvancedAuctionItemsSubmitDeleteRecord, AdvancedAuctionItemsSubmitDeleteRecordBuilder> {
  @BuiltValueField(wireName: r'country')
  Country get country;
  // enum countryEnum {  AD,  AE,  AF,  AG,  AI,  AL,  AM,  AO,  AQ,  AR,  AS,  AT,  AU,  AW,  AX,  AZ,  BA,  BB,  BD,  BE,  BF,  BG,  BH,  BI,  BJ,  BL,  BM,  BN,  BO,  BQ,  BR,  BS,  BT,  BV,  BW,  BY,  BZ,  CA,  CC,  CD,  CF,  CG,  CH,  CI,  CK,  CL,  CM,  CN,  CO,  CR,  CU,  CV,  CW,  CX,  CY,  CZ,  DE,  DJ,  DK,  DM,  DO,  DZ,  EC,  EE,  EG,  EH,  ER,  ES,  ET,  FI,  FJ,  FK,  FM,  FO,  FR,  GA,  GB,  GD,  GE,  GF,  GG,  GH,  GI,  GL,  GM,  GN,  GP,  GQ,  GR,  GS,  GT,  GU,  GW,  GY,  HK,  HM,  HN,  HR,  HT,  HU,  ID,  IE,  IL,  IM,  IN,  IO,  IQ,  IR,  IS,  IT,  JE,  JM,  JO,  JP,  KE,  KG,  KH,  KI,  KM,  KN,  KR,  KW,  KY,  KZ,  LA,  LB,  LC,  LI,  LK,  LR,  LS,  LT,  LU,  LV,  LY,  MA,  MC,  MD,  ME,  MF,  MG,  MH,  MK,  ML,  MM,  MN,  MO,  MP,  MQ,  MR,  MS,  MT,  MU,  MV,  MW,  MX,  MY,  MZ,  NA,  NC,  NE,  NF,  NG,  NI,  NL,  false,  NP,  NR,  NU,  NZ,  OM,  PA,  PE,  PF,  PG,  PH,  PK,  PL,  PM,  PN,  PR,  PS,  PT,  PW,  PY,  QA,  RE,  RO,  RS,  RU,  RW,  SA,  SB,  SC,  SD,  SE,  SG,  SH,  SI,  SJ,  SK,  SL,  SM,  SN,  SO,  SR,  SS,  ST,  SV,  SX,  SY,  SZ,  TC,  TD,  TF,  TG,  TH,  TJ,  TK,  TL,  TM,  TN,  TO,  TR,  TT,  TV,  TW,  TZ,  UA,  UG,  UM,  US,  UY,  UZ,  VA,  VC,  VE,  VG,  VI,  VN,  VU,  WF,  WS,  YE,  YT,  ZA,  ZM,  ZW,  };

  /// Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
  @BuiltValueField(wireName: r'errors')
  BuiltList<AdvancedAuctionOperationError>? get errors;

  /// The catalog retail item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  @BuiltValueField(wireName: r'language')
  Language get language;
  // enum languageEnum {  AM,  AR,  AZ,  BG,  BN,  BS,  CA,  CS,  DA,  DV,  DZ,  DE,  EL,  EN,  ES,  ET,  FA,  FI,  FR,  HE,  HI,  HR,  HU,  HY,  ID,  IN,  IS,  IT,  IW,  JA,  KA,  KM,  KO,  LO,  LT,  LV,  MK,  MN,  MS,  MY,  NB,  NE,  NL,  false,  PL,  PT,  RO,  RU,  SK,  SL,  SQ,  SR,  SV,  TL,  UK,  VI,  TE,  TH,  TR,  XX,  ZH,  };

  @BuiltValueField(wireName: r'operation')
  AdvancedAuctionItemsSubmitDeleteRecordOperationEnum get operation;
  // enum operationEnum {  DELETE,  };

  AdvancedAuctionItemsSubmitDeleteRecord._();

  factory AdvancedAuctionItemsSubmitDeleteRecord([void updates(AdvancedAuctionItemsSubmitDeleteRecordBuilder b)]) = _$AdvancedAuctionItemsSubmitDeleteRecord;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvancedAuctionItemsSubmitDeleteRecordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvancedAuctionItemsSubmitDeleteRecord> get serializer => _$AdvancedAuctionItemsSubmitDeleteRecordSerializer();
}

class _$AdvancedAuctionItemsSubmitDeleteRecordSerializer implements PrimitiveSerializer<AdvancedAuctionItemsSubmitDeleteRecord> {
  @override
  final Iterable<Type> types = const [AdvancedAuctionItemsSubmitDeleteRecord, _$AdvancedAuctionItemsSubmitDeleteRecord];

  @override
  final String wireName = r'AdvancedAuctionItemsSubmitDeleteRecord';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvancedAuctionItemsSubmitDeleteRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'country';
    yield serializers.serialize(
      object.country,
      specifiedType: const FullType(Country),
    );
    if (object.errors != null) {
      yield r'errors';
      yield serializers.serialize(
        object.errors,
        specifiedType: const FullType(BuiltList, [FullType(AdvancedAuctionOperationError)]),
      );
    }
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
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(AdvancedAuctionItemsSubmitDeleteRecordOperationEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdvancedAuctionItemsSubmitDeleteRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvancedAuctionItemsSubmitDeleteRecordBuilder result,
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
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AdvancedAuctionOperationError)]),
          ) as BuiltList<AdvancedAuctionOperationError>?;
          if (valueDes == null) continue;
          result.errors.replace(valueDes);
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
        case r'operation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AdvancedAuctionItemsSubmitDeleteRecordOperationEnum),
          ) as AdvancedAuctionItemsSubmitDeleteRecordOperationEnum;
          result.operation = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdvancedAuctionItemsSubmitDeleteRecord deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvancedAuctionItemsSubmitDeleteRecordBuilder();
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

class AdvancedAuctionItemsSubmitDeleteRecordOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DELETE')
  static const AdvancedAuctionItemsSubmitDeleteRecordOperationEnum DELETE = _$advancedAuctionItemsSubmitDeleteRecordOperationEnum_DELETE;

  static Serializer<AdvancedAuctionItemsSubmitDeleteRecordOperationEnum> get serializer => _$advancedAuctionItemsSubmitDeleteRecordOperationEnumSerializer;

  const AdvancedAuctionItemsSubmitDeleteRecordOperationEnum._(String name): super(name);

  static BuiltSet<AdvancedAuctionItemsSubmitDeleteRecordOperationEnum> get values => _$advancedAuctionItemsSubmitDeleteRecordOperationEnumValues;
  static AdvancedAuctionItemsSubmitDeleteRecordOperationEnum valueOf(String name) => _$advancedAuctionItemsSubmitDeleteRecordOperationEnumValueOf(name);
}

