//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_feed_credentials.dart';
import 'package:openapi/src/model/catalogs_feed_processing_schedule.dart';
import 'package:openapi/src/model/nullable_currency.dart';
import 'package:openapi/src/model/product_availability_type.dart';
import 'package:openapi/src/model/catalogs_status.dart';
import 'package:openapi/src/model/catalogs_format.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_feeds_update_request.g.dart';

/// Request object for updating a feed.
///
/// Properties:
/// * [credentials] 
/// * [defaultAvailability] 
/// * [defaultCurrency] 
/// * [format] 
/// * [location] - The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
/// * [name] - A human-friendly name associated to a given feed.
/// * [preferredProcessingSchedule] 
/// * [status] 
@BuiltValue()
abstract class CatalogsFeedsUpdateRequest implements Built<CatalogsFeedsUpdateRequest, CatalogsFeedsUpdateRequestBuilder> {
  @BuiltValueField(wireName: r'credentials')
  CatalogsFeedCredentials? get credentials;

  @BuiltValueField(wireName: r'default_availability')
  ProductAvailabilityType? get defaultAvailability;
  // enum defaultAvailabilityEnum {  IN_STOCK,  OUT_OF_STOCK,  PREORDER,  ,  };

  @BuiltValueField(wireName: r'default_currency')
  NullableCurrency? get defaultCurrency;
  // enum defaultCurrencyEnum {  AED,  AFN,  ALL,  AMD,  ANG,  AOA,  ARS,  AUD,  AWG,  AZN,  BAM,  BBD,  BDT,  BGN,  BHD,  BIF,  BMD,  BND,  BOB,  BRL,  BSD,  BTN,  BWP,  BYN,  BYR,  BZD,  CAD,  CDF,  CHF,  CLP,  CNY,  COP,  CRC,  CUC,  CUP,  CVE,  CZK,  DJF,  DKK,  DOP,  DZD,  EGP,  ERN,  ETB,  EUR,  FJD,  FKP,  GBP,  GEL,  GGP,  GHS,  GIP,  GMD,  GNF,  GTQ,  GYD,  HKD,  HNL,  HRK,  HTG,  HUF,  IDR,  ILS,  IMP,  INR,  IQD,  IRR,  ISK,  JEP,  JMD,  JOD,  JPY,  KES,  KGS,  KHR,  KMF,  KPW,  KRW,  KWD,  KYD,  KZT,  LAK,  LBP,  LKR,  LRD,  LSL,  LYD,  MAD,  MDL,  MGA,  MKD,  MMK,  MNT,  MOP,  MRO,  MUR,  MVR,  MWK,  MXN,  MYR,  MZN,  NAD,  NGN,  NIO,  NOK,  NPR,  NZD,  OMR,  PAB,  PEN,  PGK,  PHP,  PKR,  PLN,  PYG,  QAR,  RON,  RSD,  RUB,  RWF,  SAR,  SBD,  SCR,  SDG,  SEK,  SGD,  SHP,  SLL,  SOS,  SPL,  SRD,  STD,  SVC,  SYP,  SZL,  THB,  TJS,  TMT,  TND,  TOP,  TRY,  TTD,  TVD,  TWD,  TZS,  UAH,  UGX,  USD,  UYU,  UZS,  VEF,  VND,  VUV,  WST,  XAF,  XCD,  XDR,  XOF,  XPF,  YER,  ZAR,  ZMW,  ZWD,  ,  };

  @BuiltValueField(wireName: r'format')
  CatalogsFormat? get format;
  // enum formatEnum {  TSV,  CSV,  XML,  INTEGRATION,  };

  /// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  @BuiltValueField(wireName: r'location')
  String? get location;

  /// A human-friendly name associated to a given feed.
  @BuiltValueField(wireName: r'name')
  String? get name;

  @BuiltValueField(wireName: r'preferred_processing_schedule')
  CatalogsFeedProcessingSchedule? get preferredProcessingSchedule;

  @BuiltValueField(wireName: r'status')
  CatalogsStatus? get status;
  // enum statusEnum {  ACTIVE,  INACTIVE,  };

  CatalogsFeedsUpdateRequest._();

  factory CatalogsFeedsUpdateRequest([void updates(CatalogsFeedsUpdateRequestBuilder b)]) = _$CatalogsFeedsUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsFeedsUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsFeedsUpdateRequest> get serializer => _$CatalogsFeedsUpdateRequestSerializer();
}

class _$CatalogsFeedsUpdateRequestSerializer implements PrimitiveSerializer<CatalogsFeedsUpdateRequest> {
  @override
  final Iterable<Type> types = const [CatalogsFeedsUpdateRequest, _$CatalogsFeedsUpdateRequest];

  @override
  final String wireName = r'CatalogsFeedsUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsFeedsUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    if (object.defaultCurrency != null) {
      yield r'default_currency';
      yield serializers.serialize(
        object.defaultCurrency,
        specifiedType: const FullType.nullable(NullableCurrency),
      );
    }
    if (object.format != null) {
      yield r'format';
      yield serializers.serialize(
        object.format,
        specifiedType: const FullType(CatalogsFormat),
      );
    }
    if (object.location != null) {
      yield r'location';
      yield serializers.serialize(
        object.location,
        specifiedType: const FullType(String),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
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
    CatalogsFeedsUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsFeedsUpdateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
        case r'default_currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(NullableCurrency),
          ) as NullableCurrency?;
          if (valueDes == null) continue;
          result.defaultCurrency = valueDes;
          break;
        case r'format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CatalogsFormat),
          ) as CatalogsFormat?;
          if (valueDes == null) continue;
          result.format = valueDes;
          break;
        case r'location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.location = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  CatalogsFeedsUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsFeedsUpdateRequestBuilder();
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

