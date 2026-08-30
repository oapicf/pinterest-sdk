//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/catalogs_locale.dart';
import 'package:openapi/src/model/catalogs_product_group_filters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_retail_list_products_by_catalog_based_filter_request.g.dart';

/// Request object to list products for a given retail catalog_id and product group filter.
///
/// Properties:
/// * [catalogId] - Catalog ID pertaining to the product group.
/// * [catalogType] - Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
/// * [country] 
/// * [filters] 
/// * [locale] 
@BuiltValue()
abstract class CatalogsRetailListProductsByCatalogBasedFilterRequest implements Built<CatalogsRetailListProductsByCatalogBasedFilterRequest, CatalogsRetailListProductsByCatalogBasedFilterRequestBuilder> {
  /// Catalog ID pertaining to the product group.
  @BuiltValueField(wireName: r'catalog_id')
  String get catalogId;

  /// Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsRetailListProductsByCatalogBasedFilterRequestCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  RETAIL,  };

  @BuiltValueField(wireName: r'country')
  Country get country;
  // enum countryEnum {  AD,  AE,  AF,  AG,  AI,  AL,  AM,  AO,  AQ,  AR,  AS,  AT,  AU,  AW,  AX,  AZ,  BA,  BB,  BD,  BE,  BF,  BG,  BH,  BI,  BJ,  BL,  BM,  BN,  BO,  BQ,  BR,  BS,  BT,  BV,  BW,  BY,  BZ,  CA,  CC,  CD,  CF,  CG,  CH,  CI,  CK,  CL,  CM,  CN,  CO,  CR,  CU,  CV,  CW,  CX,  CY,  CZ,  DE,  DJ,  DK,  DM,  DO,  DZ,  EC,  EE,  EG,  EH,  ER,  ES,  ET,  FI,  FJ,  FK,  FM,  FO,  FR,  GA,  GB,  GD,  GE,  GF,  GG,  GH,  GI,  GL,  GM,  GN,  GP,  GQ,  GR,  GS,  GT,  GU,  GW,  GY,  HK,  HM,  HN,  HR,  HT,  HU,  ID,  IE,  IL,  IM,  IN,  IO,  IQ,  IR,  IS,  IT,  JE,  JM,  JO,  JP,  KE,  KG,  KH,  KI,  KM,  KN,  KR,  KW,  KY,  KZ,  LA,  LB,  LC,  LI,  LK,  LR,  LS,  LT,  LU,  LV,  LY,  MA,  MC,  MD,  ME,  MF,  MG,  MH,  MK,  ML,  MM,  MN,  MO,  MP,  MQ,  MR,  MS,  MT,  MU,  MV,  MW,  MX,  MY,  MZ,  NA,  NC,  NE,  NF,  NG,  NI,  NL,  false,  NP,  NR,  NU,  NZ,  OM,  PA,  PE,  PF,  PG,  PH,  PK,  PL,  PM,  PN,  PR,  PS,  PT,  PW,  PY,  QA,  RE,  RO,  RS,  RU,  RW,  SA,  SB,  SC,  SD,  SE,  SG,  SH,  SI,  SJ,  SK,  SL,  SM,  SN,  SO,  SR,  SS,  ST,  SV,  SX,  SY,  SZ,  TC,  TD,  TF,  TG,  TH,  TJ,  TK,  TL,  TM,  TN,  TO,  TR,  TT,  TV,  TW,  TZ,  UA,  UG,  UM,  US,  UY,  UZ,  VA,  VC,  VE,  VG,  VI,  VN,  VU,  WF,  WS,  YE,  YT,  ZA,  ZM,  ZW,  };

  @BuiltValueField(wireName: r'filters')
  CatalogsProductGroupFilters get filters;

  @BuiltValueField(wireName: r'locale')
  CatalogsLocale get locale;
  // enum localeEnum {  af-ZA,  ar-SA,  bg-BG,  bn-IN,  cs-CZ,  da-DK,  de,  el-GR,  en-AU,  en-CA,  en-GB,  en-IN,  en-US,  es-419,  es-AR,  es-ES,  es-MX,  fi-FI,  fr,  fr-CA,  he-IL,  hi-IN,  hr-HR,  hu-HU,  id-ID,  it,  ja,  ko-KR,  ms-MY,  nb-NO,  nl,  pl-PL,  pt-BR,  pt-PT,  ro-RO,  ru-RU,  sk-SK,  sv-SE,  te-IN,  th-TH,  tl-PH,  tr,  uk-UA,  vi-VN,  zh-CN,  zh-TW,  };

  CatalogsRetailListProductsByCatalogBasedFilterRequest._();

  factory CatalogsRetailListProductsByCatalogBasedFilterRequest([void updates(CatalogsRetailListProductsByCatalogBasedFilterRequestBuilder b)]) = _$CatalogsRetailListProductsByCatalogBasedFilterRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsRetailListProductsByCatalogBasedFilterRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsRetailListProductsByCatalogBasedFilterRequest> get serializer => _$CatalogsRetailListProductsByCatalogBasedFilterRequestSerializer();
}

class _$CatalogsRetailListProductsByCatalogBasedFilterRequestSerializer implements PrimitiveSerializer<CatalogsRetailListProductsByCatalogBasedFilterRequest> {
  @override
  final Iterable<Type> types = const [CatalogsRetailListProductsByCatalogBasedFilterRequest, _$CatalogsRetailListProductsByCatalogBasedFilterRequest];

  @override
  final String wireName = r'CatalogsRetailListProductsByCatalogBasedFilterRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsRetailListProductsByCatalogBasedFilterRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_id';
    yield serializers.serialize(
      object.catalogId,
      specifiedType: const FullType(String),
    );
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsRetailListProductsByCatalogBasedFilterRequestCatalogTypeEnum),
    );
    yield r'country';
    yield serializers.serialize(
      object.country,
      specifiedType: const FullType(Country),
    );
    yield r'filters';
    yield serializers.serialize(
      object.filters,
      specifiedType: const FullType(CatalogsProductGroupFilters),
    );
    yield r'locale';
    yield serializers.serialize(
      object.locale,
      specifiedType: const FullType(CatalogsLocale),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsRetailListProductsByCatalogBasedFilterRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsRetailListProductsByCatalogBasedFilterRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.catalogId = valueDes;
          break;
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsRetailListProductsByCatalogBasedFilterRequestCatalogTypeEnum),
          ) as CatalogsRetailListProductsByCatalogBasedFilterRequestCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'country':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Country),
          ) as Country;
          result.country = valueDes;
          break;
        case r'filters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupFilters),
          ) as CatalogsProductGroupFilters;
          result.filters.replace(valueDes);
          break;
        case r'locale':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsLocale),
          ) as CatalogsLocale;
          result.locale = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsRetailListProductsByCatalogBasedFilterRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsRetailListProductsByCatalogBasedFilterRequestBuilder();
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

class CatalogsRetailListProductsByCatalogBasedFilterRequestCatalogTypeEnum extends EnumClass {

  /// Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
  @BuiltValueEnumConst(wireName: r'RETAIL')
  static const CatalogsRetailListProductsByCatalogBasedFilterRequestCatalogTypeEnum RETAIL = _$catalogsRetailListProductsByCatalogBasedFilterRequestCatalogTypeEnum_RETAIL;

  static Serializer<CatalogsRetailListProductsByCatalogBasedFilterRequestCatalogTypeEnum> get serializer => _$catalogsRetailListProductsByCatalogBasedFilterRequestCatalogTypeEnumSerializer;

  const CatalogsRetailListProductsByCatalogBasedFilterRequestCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsRetailListProductsByCatalogBasedFilterRequestCatalogTypeEnum> get values => _$catalogsRetailListProductsByCatalogBasedFilterRequestCatalogTypeEnumValues;
  static CatalogsRetailListProductsByCatalogBasedFilterRequestCatalogTypeEnum valueOf(String name) => _$catalogsRetailListProductsByCatalogBasedFilterRequestCatalogTypeEnumValueOf(name);
}

