//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_delete_batch_record.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/country.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_items_delete_batch_request.g.dart';

/// Request object to delete catalogs items
///
/// Properties:
/// * [country] 
/// * [items] - Array with catalogs items
/// * [language] - We recommend using the CatalogsLocale values.
/// * [operation] 
@BuiltValue()
abstract class CatalogsItemsDeleteBatchRequest implements Built<CatalogsItemsDeleteBatchRequest, CatalogsItemsDeleteBatchRequestBuilder> {
  @BuiltValueField(wireName: r'country')
  Country get country;
  // enum countryEnum {  AD,  AE,  AF,  AG,  AI,  AL,  AM,  AO,  AQ,  AR,  AS,  AT,  AU,  AW,  AX,  AZ,  BA,  BB,  BD,  BE,  BF,  BG,  BH,  BI,  BJ,  BL,  BM,  BN,  BO,  BQ,  BR,  BS,  BT,  BV,  BW,  BY,  BZ,  CA,  CC,  CD,  CF,  CG,  CH,  CI,  CK,  CL,  CM,  CN,  CO,  CR,  CU,  CV,  CW,  CX,  CY,  CZ,  DE,  DJ,  DK,  DM,  DO,  DZ,  EC,  EE,  EG,  EH,  ER,  ES,  ET,  FI,  FJ,  FK,  FM,  FO,  FR,  GA,  GB,  GD,  GE,  GF,  GG,  GH,  GI,  GL,  GM,  GN,  GP,  GQ,  GR,  GS,  GT,  GU,  GW,  GY,  HK,  HM,  HN,  HR,  HT,  HU,  ID,  IE,  IL,  IM,  IN,  IO,  IQ,  IR,  IS,  IT,  JE,  JM,  JO,  JP,  KE,  KG,  KH,  KI,  KM,  KN,  KR,  KW,  KY,  KZ,  LA,  LB,  LC,  LI,  LK,  LR,  LS,  LT,  LU,  LV,  LY,  MA,  MC,  MD,  ME,  MF,  MG,  MH,  MK,  ML,  MM,  MN,  MO,  MP,  MQ,  MR,  MS,  MT,  MU,  MV,  MW,  MX,  MY,  MZ,  NA,  NC,  NE,  NF,  NG,  NI,  NL,  false,  NP,  NR,  NU,  NZ,  OM,  PA,  PE,  PF,  PG,  PH,  PK,  PL,  PM,  PN,  PR,  PS,  PT,  PW,  PY,  QA,  RE,  RO,  RS,  RU,  RW,  SA,  SB,  SC,  SD,  SE,  SG,  SH,  SI,  SJ,  SK,  SL,  SM,  SN,  SO,  SR,  SS,  ST,  SV,  SX,  SY,  SZ,  TC,  TD,  TF,  TG,  TH,  TJ,  TK,  TL,  TM,  TN,  TO,  TR,  TT,  TV,  TW,  TZ,  UA,  UG,  UM,  US,  UY,  UZ,  VA,  VC,  VE,  VG,  VI,  VN,  VU,  WF,  WS,  YE,  YT,  ZA,  ZM,  ZW,  };

  /// Array with catalogs items
  @BuiltValueField(wireName: r'items')
  BuiltList<ItemDeleteBatchRecord> get items;

  /// We recommend using the CatalogsLocale values.
  @BuiltValueField(wireName: r'language')
  LanguageEnum get language;
  // enum languageEnum {  af-ZA,  ar-SA,  bg-BG,  bn-IN,  cs-CZ,  da-DK,  de,  el-GR,  en-AU,  en-CA,  en-GB,  en-IN,  en-US,  es-419,  es-AR,  es-ES,  es-MX,  fi-FI,  fr,  fr-CA,  he-IL,  hi-IN,  hr-HR,  hu-HU,  id-ID,  it,  ja,  ko-KR,  ms-MY,  nb-NO,  nl,  pl-PL,  pt-BR,  pt-PT,  ro-RO,  ru-RU,  sk-SK,  sv-SE,  te-IN,  th-TH,  tl-PH,  tr,  uk-UA,  vi-VN,  zh-CN,  zh-TW,  AM,  AR,  AZ,  BG,  BN,  BS,  CA,  CS,  DA,  DV,  DZ,  DE,  EL,  EN,  ES,  ET,  FA,  FI,  FR,  HE,  HI,  HR,  HU,  HY,  ID,  IN,  IS,  IT,  IW,  JA,  KA,  KM,  KO,  LO,  LT,  LV,  MK,  MN,  MS,  MY,  NB,  NE,  NL,  false,  PL,  PT,  RO,  RU,  SK,  SL,  SQ,  SR,  SV,  TL,  UK,  VI,  TE,  TH,  TR,  XX,  ZH,  };

  @BuiltValueField(wireName: r'operation')
  CatalogsItemsDeleteBatchRequestOperationEnum get operation;
  // enum operationEnum {  DELETE,  };

  CatalogsItemsDeleteBatchRequest._();

  factory CatalogsItemsDeleteBatchRequest([void updates(CatalogsItemsDeleteBatchRequestBuilder b)]) = _$CatalogsItemsDeleteBatchRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsItemsDeleteBatchRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsItemsDeleteBatchRequest> get serializer => _$CatalogsItemsDeleteBatchRequestSerializer();
}

class _$CatalogsItemsDeleteBatchRequestSerializer implements PrimitiveSerializer<CatalogsItemsDeleteBatchRequest> {
  @override
  final Iterable<Type> types = const [CatalogsItemsDeleteBatchRequest, _$CatalogsItemsDeleteBatchRequest];

  @override
  final String wireName = r'CatalogsItemsDeleteBatchRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsItemsDeleteBatchRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'country';
    yield serializers.serialize(
      object.country,
      specifiedType: const FullType(Country),
    );
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(ItemDeleteBatchRecord)]),
    );
    yield r'language';
    yield serializers.serialize(
      object.language,
      specifiedType: const FullType(LanguageEnum),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(CatalogsItemsDeleteBatchRequestOperationEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsItemsDeleteBatchRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsItemsDeleteBatchRequestBuilder result,
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
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemDeleteBatchRecord)]),
          ) as BuiltList<ItemDeleteBatchRecord>;
          result.items.replace(valueDes);
          break;
        case r'language':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(LanguageEnum),
          ) as LanguageEnum;
          result.language = valueDes;
          break;
        case r'operation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemsDeleteBatchRequestOperationEnum),
          ) as CatalogsItemsDeleteBatchRequestOperationEnum;
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
  CatalogsItemsDeleteBatchRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsItemsDeleteBatchRequestBuilder();
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

class CatalogsItemsDeleteBatchRequestOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DELETE')
  static const CatalogsItemsDeleteBatchRequestOperationEnum DELETE = _$catalogsItemsDeleteBatchRequestOperationEnum_DELETE;

  static Serializer<CatalogsItemsDeleteBatchRequestOperationEnum> get serializer => _$catalogsItemsDeleteBatchRequestOperationEnumSerializer;

  const CatalogsItemsDeleteBatchRequestOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsItemsDeleteBatchRequestOperationEnum> get values => _$catalogsItemsDeleteBatchRequestOperationEnumValues;
  static CatalogsItemsDeleteBatchRequestOperationEnum valueOf(String name) => _$catalogsItemsDeleteBatchRequestOperationEnumValueOf(name);
}

