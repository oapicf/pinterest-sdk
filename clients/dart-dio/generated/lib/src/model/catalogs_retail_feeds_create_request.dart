//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_feed_credentials.dart';
import 'package:openapi/src/model/catalogs_feed_processing_schedule.dart';
import 'package:openapi/src/model/nullable_currency.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/product_availability_type.dart';
import 'package:openapi/src/model/catalogs_status.dart';
import 'package:openapi/src/model/catalogs_format.dart';
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:openapi/src/model/catalogs_feeds_create_request_default_locale.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_retail_feeds_create_request.g.dart';

/// Request object for creating a retail feed.
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. Currently, this field has no effect.
/// * [catalogType] 
/// * [credentials] 
/// * [defaultAvailability] 
/// * [defaultCountry] 
/// * [defaultCurrency] 
/// * [defaultLocale] 
/// * [format] 
/// * [location] - The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
/// * [name] - A human-friendly name associated to a given feed.
/// * [preferredProcessingSchedule] 
/// * [status] 
@BuiltValue()
abstract class CatalogsRetailFeedsCreateRequest implements Built<CatalogsRetailFeedsCreateRequest, CatalogsRetailFeedsCreateRequestBuilder> {
  /// Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. Currently, this field has no effect.
  @BuiltValueField(wireName: r'catalog_id')
  String? get catalogId;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsType get catalogType;
  // enum catalogTypeEnum {  RETAIL,  HOTEL,  CREATIVE_ASSETS,  };

  @BuiltValueField(wireName: r'credentials')
  CatalogsFeedCredentials? get credentials;

  @BuiltValueField(wireName: r'default_availability')
  ProductAvailabilityType? get defaultAvailability;
  // enum defaultAvailabilityEnum {  IN_STOCK,  OUT_OF_STOCK,  PREORDER,  ,  };

  @BuiltValueField(wireName: r'default_country')
  Country get defaultCountry;
  // enum defaultCountryEnum {  AD,  AE,  AF,  AG,  AI,  AL,  AM,  AO,  AQ,  AR,  AS,  AT,  AU,  AW,  AX,  AZ,  BA,  BB,  BD,  BE,  BF,  BG,  BH,  BI,  BJ,  BL,  BM,  BN,  BO,  BQ,  BR,  BS,  BT,  BV,  BW,  BY,  BZ,  CA,  CC,  CD,  CF,  CG,  CH,  CI,  CK,  CL,  CM,  CN,  CO,  CR,  CU,  CV,  CW,  CX,  CY,  CZ,  DE,  DJ,  DK,  DM,  DO,  DZ,  EC,  EE,  EG,  EH,  ER,  ES,  ET,  FI,  FJ,  FK,  FM,  FO,  FR,  GA,  GB,  GD,  GE,  GF,  GG,  GH,  GI,  GL,  GM,  GN,  GP,  GQ,  GR,  GS,  GT,  GU,  GW,  GY,  HK,  HM,  HN,  HR,  HT,  HU,  ID,  IE,  IL,  IM,  IN,  IO,  IQ,  IR,  IS,  IT,  JE,  JM,  JO,  JP,  KE,  KG,  KH,  KI,  KM,  KN,  KR,  KW,  KY,  KZ,  LA,  LB,  LC,  LI,  LK,  LR,  LS,  LT,  LU,  LV,  LY,  MA,  MC,  MD,  ME,  MF,  MG,  MH,  MK,  ML,  MM,  MN,  MO,  MP,  MQ,  MR,  MS,  MT,  MU,  MV,  MW,  MX,  MY,  MZ,  NA,  NC,  NE,  NF,  NG,  NI,  NL,  NO,  NP,  NR,  NU,  NZ,  OM,  PA,  PE,  PF,  PG,  PH,  PK,  PL,  PM,  PN,  PR,  PS,  PT,  PW,  PY,  QA,  RE,  RO,  RS,  RU,  RW,  SA,  SB,  SC,  SD,  SE,  SG,  SH,  SI,  SJ,  SK,  SL,  SM,  SN,  SO,  SR,  SS,  ST,  SV,  SX,  SY,  SZ,  TC,  TD,  TF,  TG,  TH,  TJ,  TK,  TL,  TM,  TN,  TO,  TR,  TT,  TV,  TW,  TZ,  UA,  UG,  UM,  US,  UY,  UZ,  VA,  VC,  VE,  VG,  VI,  VN,  VU,  WF,  WS,  YE,  YT,  ZA,  ZM,  ZW,  };

  @BuiltValueField(wireName: r'default_currency')
  NullableCurrency? get defaultCurrency;
  // enum defaultCurrencyEnum {  AED,  AFN,  ALL,  AMD,  ANG,  AOA,  ARS,  AUD,  AWG,  AZN,  BAM,  BBD,  BDT,  BGN,  BHD,  BIF,  BMD,  BND,  BOB,  BRL,  BSD,  BTN,  BWP,  BYN,  BYR,  BZD,  CAD,  CDF,  CHF,  CLP,  CNY,  COP,  CRC,  CUC,  CUP,  CVE,  CZK,  DJF,  DKK,  DOP,  DZD,  EGP,  ERN,  ETB,  EUR,  FJD,  FKP,  GBP,  GEL,  GGP,  GHS,  GIP,  GMD,  GNF,  GTQ,  GYD,  HKD,  HNL,  HRK,  HTG,  HUF,  IDR,  ILS,  IMP,  INR,  IQD,  IRR,  ISK,  JEP,  JMD,  JOD,  JPY,  KES,  KGS,  KHR,  KMF,  KPW,  KRW,  KWD,  KYD,  KZT,  LAK,  LBP,  LKR,  LRD,  LSL,  LYD,  MAD,  MDL,  MGA,  MKD,  MMK,  MNT,  MOP,  MRO,  MUR,  MVR,  MWK,  MXN,  MYR,  MZN,  NAD,  NGN,  NIO,  NOK,  NPR,  NZD,  OMR,  PAB,  PEN,  PGK,  PHP,  PKR,  PLN,  PYG,  QAR,  RON,  RSD,  RUB,  RWF,  SAR,  SBD,  SCR,  SDG,  SEK,  SGD,  SHP,  SLL,  SOS,  SPL,  SRD,  STD,  SVC,  SYP,  SZL,  THB,  TJS,  TMT,  TND,  TOP,  TRY,  TTD,  TVD,  TWD,  TZS,  UAH,  UGX,  USD,  UYU,  UZS,  VEF,  VND,  VUV,  WST,  XAF,  XCD,  XDR,  XOF,  XPF,  YER,  ZAR,  ZMW,  ZWD,  ,  };

  @BuiltValueField(wireName: r'default_locale')
  CatalogsFeedsCreateRequestDefaultLocale get defaultLocale;

  @BuiltValueField(wireName: r'format')
  CatalogsFormat get format;
  // enum formatEnum {  TSV,  CSV,  XML,  };

  /// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  @BuiltValueField(wireName: r'location')
  String get location;

  /// A human-friendly name associated to a given feed.
  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'preferred_processing_schedule')
  CatalogsFeedProcessingSchedule? get preferredProcessingSchedule;

  @BuiltValueField(wireName: r'status')
  CatalogsStatus? get status;
  // enum statusEnum {  ACTIVE,  INACTIVE,  };

  CatalogsRetailFeedsCreateRequest._();

  factory CatalogsRetailFeedsCreateRequest([void updates(CatalogsRetailFeedsCreateRequestBuilder b)]) = _$CatalogsRetailFeedsCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsRetailFeedsCreateRequestBuilder b) => b
      ..status = 'ACTIVE';

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsRetailFeedsCreateRequest> get serializer => _$CatalogsRetailFeedsCreateRequestSerializer();
}

class _$CatalogsRetailFeedsCreateRequestSerializer implements PrimitiveSerializer<CatalogsRetailFeedsCreateRequest> {
  @override
  final Iterable<Type> types = const [CatalogsRetailFeedsCreateRequest, _$CatalogsRetailFeedsCreateRequest];

  @override
  final String wireName = r'CatalogsRetailFeedsCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsRetailFeedsCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.catalogId != null) {
      yield r'catalog_id';
      yield serializers.serialize(
        object.catalogId,
        specifiedType: const FullType(String),
      );
    }
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsType),
    );
    if (object.credentials != null) {
      yield r'credentials';
      yield serializers.serialize(
        object.credentials,
        specifiedType: const FullType.nullable(CatalogsFeedCredentials),
      );
    }
    if (object.defaultAvailability != null) {
      yield r'default_availability';
      yield serializers.serialize(
        object.defaultAvailability,
        specifiedType: const FullType.nullable(ProductAvailabilityType),
      );
    }
    yield r'default_country';
    yield serializers.serialize(
      object.defaultCountry,
      specifiedType: const FullType(Country),
    );
    if (object.defaultCurrency != null) {
      yield r'default_currency';
      yield serializers.serialize(
        object.defaultCurrency,
        specifiedType: const FullType.nullable(NullableCurrency),
      );
    }
    yield r'default_locale';
    yield serializers.serialize(
      object.defaultLocale,
      specifiedType: const FullType(CatalogsFeedsCreateRequestDefaultLocale),
    );
    yield r'format';
    yield serializers.serialize(
      object.format,
      specifiedType: const FullType(CatalogsFormat),
    );
    yield r'location';
    yield serializers.serialize(
      object.location,
      specifiedType: const FullType(String),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    if (object.preferredProcessingSchedule != null) {
      yield r'preferred_processing_schedule';
      yield serializers.serialize(
        object.preferredProcessingSchedule,
        specifiedType: const FullType.nullable(CatalogsFeedProcessingSchedule),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(CatalogsStatus),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsRetailFeedsCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsRetailFeedsCreateRequestBuilder result,
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
            specifiedType: const FullType(CatalogsType),
          ) as CatalogsType;
          result.catalogType = valueDes;
          break;
        case r'credentials':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CatalogsFeedCredentials),
          ) as CatalogsFeedCredentials?;
          if (valueDes == null) continue;
          result.credentials.replace(valueDes);
          break;
        case r'default_availability':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ProductAvailabilityType),
          ) as ProductAvailabilityType?;
          if (valueDes == null) continue;
          result.defaultAvailability = valueDes;
          break;
        case r'default_country':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Country),
          ) as Country;
          result.defaultCountry = valueDes;
          break;
        case r'default_currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(NullableCurrency),
          ) as NullableCurrency?;
          if (valueDes == null) continue;
          result.defaultCurrency = valueDes;
          break;
        case r'default_locale':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsFeedsCreateRequestDefaultLocale),
          ) as CatalogsFeedsCreateRequestDefaultLocale;
          result.defaultLocale.replace(valueDes);
          break;
        case r'format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsFormat),
          ) as CatalogsFormat;
          result.format = valueDes;
          break;
        case r'location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.location = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'preferred_processing_schedule':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CatalogsFeedProcessingSchedule),
          ) as CatalogsFeedProcessingSchedule?;
          if (valueDes == null) continue;
          result.preferredProcessingSchedule.replace(valueDes);
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsStatus),
          ) as CatalogsStatus;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsRetailFeedsCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsRetailFeedsCreateRequestBuilder();
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

