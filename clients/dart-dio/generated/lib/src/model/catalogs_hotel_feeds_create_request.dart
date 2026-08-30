//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_feed_credentials.dart';
import 'package:openapi/src/model/catalogs_feed_processing_schedule.dart';
import 'package:openapi/src/model/nullable_currency.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_status.dart';
import 'package:openapi/src/model/catalogs_format.dart';
import 'package:openapi/src/model/catalogs_creative_assets_feeds_create_request_default_locale.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_feeds_create_request.g.dart';

/// Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
/// * [catalogType] 
/// * [credentials] 
/// * [defaultCurrency] 
/// * [defaultLocale] 
/// * [format] 
/// * [location] - The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
/// * [name] - A human-friendly name associated to a given feed.
/// * [preferredProcessingSchedule] 
/// * [status] 
@BuiltValue()
abstract class CatalogsHotelFeedsCreateRequest implements Built<CatalogsHotelFeedsCreateRequest, CatalogsHotelFeedsCreateRequestBuilder> {
  /// Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
  @BuiltValueField(wireName: r'catalog_id')
  String? get catalogId;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsHotelFeedsCreateRequestCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  HOTEL,  };

  @BuiltValueField(wireName: r'credentials')
  CatalogsFeedCredentials? get credentials;

  @BuiltValueField(wireName: r'default_currency')
  NullableCurrency? get defaultCurrency;
  // enum defaultCurrencyEnum {  AED,  AFN,  ALL,  AMD,  ANG,  AOA,  ARS,  AUD,  AWG,  AZN,  BAM,  BBD,  BDT,  BGN,  BHD,  BIF,  BMD,  BND,  BOB,  BRL,  BSD,  BTN,  BWP,  BYN,  BYR,  BZD,  CAD,  CDF,  CHF,  CLP,  CNY,  COP,  CRC,  CUC,  CUP,  CVE,  CZK,  DJF,  DKK,  DOP,  DZD,  EGP,  ERN,  ETB,  EUR,  FJD,  FKP,  GBP,  GEL,  GGP,  GHS,  GIP,  GMD,  GNF,  GTQ,  GYD,  HKD,  HNL,  HRK,  HTG,  HUF,  IDR,  ILS,  IMP,  INR,  IQD,  IRR,  ISK,  JEP,  JMD,  JOD,  JPY,  KES,  KGS,  KHR,  KMF,  KPW,  KRW,  KWD,  KYD,  KZT,  LAK,  LBP,  LKR,  LRD,  LSL,  LYD,  MAD,  MDL,  MGA,  MKD,  MMK,  MNT,  MOP,  MRO,  MUR,  MVR,  MWK,  MXN,  MYR,  MZN,  NAD,  NGN,  NIO,  NOK,  NPR,  NZD,  OMR,  PAB,  PEN,  PGK,  PHP,  PKR,  PLN,  PYG,  QAR,  RON,  RSD,  RUB,  RWF,  SAR,  SBD,  SCR,  SDG,  SEK,  SGD,  SHP,  SLL,  SOS,  SPL,  SRD,  STD,  SVC,  SYP,  SZL,  THB,  TJS,  TMT,  TND,  TOP,  TRY,  TTD,  TVD,  TWD,  TZS,  UAH,  UGX,  USD,  UYU,  UZS,  VEF,  VND,  VUV,  WST,  XAF,  XCD,  XDR,  XOF,  XPF,  YER,  ZAR,  ZMW,  ZWD,  ,  };

  @BuiltValueField(wireName: r'default_locale')
  CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale get defaultLocale;

  @BuiltValueField(wireName: r'format')
  CatalogsFormat get format;
  // enum formatEnum {  TSV,  CSV,  XML,  INTEGRATION,  };

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

  CatalogsHotelFeedsCreateRequest._();

  factory CatalogsHotelFeedsCreateRequest([void updates(CatalogsHotelFeedsCreateRequestBuilder b)]) = _$CatalogsHotelFeedsCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelFeedsCreateRequestBuilder b) => b
      ..status = CatalogsStatus.ACTIVE;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelFeedsCreateRequest> get serializer => _$CatalogsHotelFeedsCreateRequestSerializer();
}

class _$CatalogsHotelFeedsCreateRequestSerializer implements PrimitiveSerializer<CatalogsHotelFeedsCreateRequest> {
  @override
  final Iterable<Type> types = const [CatalogsHotelFeedsCreateRequest, _$CatalogsHotelFeedsCreateRequest];

  @override
  final String wireName = r'CatalogsHotelFeedsCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelFeedsCreateRequest object, {
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
      specifiedType: const FullType(CatalogsHotelFeedsCreateRequestCatalogTypeEnum),
    );
    if (object.credentials != null) {
      yield r'credentials';
      yield serializers.serialize(
        object.credentials,
        specifiedType: const FullType.nullable(CatalogsFeedCredentials),
      );
    }
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
      specifiedType: const FullType(CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale),
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
    CatalogsHotelFeedsCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelFeedsCreateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.catalogId = valueDes;
          break;
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelFeedsCreateRequestCatalogTypeEnum),
          ) as CatalogsHotelFeedsCreateRequestCatalogTypeEnum;
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
            specifiedType: const FullType(CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale),
          ) as CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale;
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
            specifiedType: const FullType.nullable(CatalogsStatus),
          ) as CatalogsStatus?;
          if (valueDes == null) continue;
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
  CatalogsHotelFeedsCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelFeedsCreateRequestBuilder();
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

class CatalogsHotelFeedsCreateRequestCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'HOTEL')
  static const CatalogsHotelFeedsCreateRequestCatalogTypeEnum HOTEL = _$catalogsHotelFeedsCreateRequestCatalogTypeEnum_HOTEL;

  static Serializer<CatalogsHotelFeedsCreateRequestCatalogTypeEnum> get serializer => _$catalogsHotelFeedsCreateRequestCatalogTypeEnumSerializer;

  const CatalogsHotelFeedsCreateRequestCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsHotelFeedsCreateRequestCatalogTypeEnum> get values => _$catalogsHotelFeedsCreateRequestCatalogTypeEnumValues;
  static CatalogsHotelFeedsCreateRequestCatalogTypeEnum valueOf(String name) => _$catalogsHotelFeedsCreateRequestCatalogTypeEnumValueOf(name);
}

