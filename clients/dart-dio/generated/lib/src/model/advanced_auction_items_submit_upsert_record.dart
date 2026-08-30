//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/update_mask_bid_option_field.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/advanced_auction_bid_options.dart';
import 'package:openapi/src/model/language.dart';
import 'package:openapi/src/model/advanced_auction_operation_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advanced_auction_items_submit_upsert_record.g.dart';

/// Object describing an item bid option upsert operation
///
/// Properties:
/// * [bidOptions] 
/// * [country] 
/// * [errors] - Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
/// * [itemId] - The catalog retail item id in the merchant namespace
/// * [language] 
/// * [operation] 
/// * [updateMask] - The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
@BuiltValue()
abstract class AdvancedAuctionItemsSubmitUpsertRecord implements Built<AdvancedAuctionItemsSubmitUpsertRecord, AdvancedAuctionItemsSubmitUpsertRecordBuilder> {
  @BuiltValueField(wireName: r'bid_options')
  AdvancedAuctionBidOptions get bidOptions;

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
  AdvancedAuctionItemsSubmitUpsertRecordOperationEnum get operation;
  // enum operationEnum {  UPSERT,  };

  /// The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
  @BuiltValueField(wireName: r'update_mask')
  BuiltList<UpdateMaskBidOptionField>? get updateMask;

  AdvancedAuctionItemsSubmitUpsertRecord._();

  factory AdvancedAuctionItemsSubmitUpsertRecord([void updates(AdvancedAuctionItemsSubmitUpsertRecordBuilder b)]) = _$AdvancedAuctionItemsSubmitUpsertRecord;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvancedAuctionItemsSubmitUpsertRecordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvancedAuctionItemsSubmitUpsertRecord> get serializer => _$AdvancedAuctionItemsSubmitUpsertRecordSerializer();
}

class _$AdvancedAuctionItemsSubmitUpsertRecordSerializer implements PrimitiveSerializer<AdvancedAuctionItemsSubmitUpsertRecord> {
  @override
  final Iterable<Type> types = const [AdvancedAuctionItemsSubmitUpsertRecord, _$AdvancedAuctionItemsSubmitUpsertRecord];

  @override
  final String wireName = r'AdvancedAuctionItemsSubmitUpsertRecord';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvancedAuctionItemsSubmitUpsertRecord object, {
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
      specifiedType: const FullType(AdvancedAuctionItemsSubmitUpsertRecordOperationEnum),
    );
    yield r'update_mask';
    yield object.updateMask == null ? null : serializers.serialize(
      object.updateMask,
      specifiedType: const FullType.nullable(BuiltList, [FullType(UpdateMaskBidOptionField)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdvancedAuctionItemsSubmitUpsertRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvancedAuctionItemsSubmitUpsertRecordBuilder result,
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
            specifiedType: const FullType(AdvancedAuctionItemsSubmitUpsertRecordOperationEnum),
          ) as AdvancedAuctionItemsSubmitUpsertRecordOperationEnum;
          result.operation = valueDes;
          break;
        case r'update_mask':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(UpdateMaskBidOptionField)]),
          ) as BuiltList<UpdateMaskBidOptionField>?;
          if (valueDes == null) continue;
          result.updateMask.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdvancedAuctionItemsSubmitUpsertRecord deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvancedAuctionItemsSubmitUpsertRecordBuilder();
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

class AdvancedAuctionItemsSubmitUpsertRecordOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'UPSERT')
  static const AdvancedAuctionItemsSubmitUpsertRecordOperationEnum UPSERT = _$advancedAuctionItemsSubmitUpsertRecordOperationEnum_UPSERT;

  static Serializer<AdvancedAuctionItemsSubmitUpsertRecordOperationEnum> get serializer => _$advancedAuctionItemsSubmitUpsertRecordOperationEnumSerializer;

  const AdvancedAuctionItemsSubmitUpsertRecordOperationEnum._(String name): super(name);

  static BuiltSet<AdvancedAuctionItemsSubmitUpsertRecordOperationEnum> get values => _$advancedAuctionItemsSubmitUpsertRecordOperationEnumValues;
  static AdvancedAuctionItemsSubmitUpsertRecordOperationEnum valueOf(String name) => _$advancedAuctionItemsSubmitUpsertRecordOperationEnumValueOf(name);
}

