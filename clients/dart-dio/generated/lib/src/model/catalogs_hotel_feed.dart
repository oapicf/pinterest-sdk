//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_feed_credentials.dart';
import 'package:openapi/src/model/catalogs_feed_processing_schedule.dart';
import 'package:openapi/src/model/nullable_currency.dart';
import 'package:openapi/src/model/catalogs_status.dart';
import 'package:openapi/src/model/catalogs_format.dart';
import 'package:openapi/src/model/catalogs_db_item.dart';
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_feed.g.dart';

/// Catalogs Hotel Feed object
///
/// Properties:
/// * [createdAt] 
/// * [id] 
/// * [updatedAt] 
/// * [catalogId] - Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
/// * [catalogType] 
/// * [credentials] 
/// * [defaultCurrency] 
/// * [defaultLocale] - The locale used within a feed for product descriptions.
/// * [format] 
/// * [location] - The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
/// * [name] - A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
/// * [preferredProcessingSchedule] 
/// * [status] 
@BuiltValue()
abstract class CatalogsHotelFeed implements CatalogsDbItem, Built<CatalogsHotelFeed, CatalogsHotelFeedBuilder> {
  /// The locale used within a feed for product descriptions.
  @BuiltValueField(wireName: r'default_locale')
  String get defaultLocale;

  /// Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
  @BuiltValueField(wireName: r'catalog_id')
  String? get catalogId;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsType get catalogType;
  // enum catalogTypeEnum {  RETAIL,  HOTEL,  CREATIVE_ASSETS,  };

  @BuiltValueField(wireName: r'credentials')
  CatalogsFeedCredentials? get credentials;

  @BuiltValueField(wireName: r'default_currency')
  NullableCurrency? get defaultCurrency;
  // enum defaultCurrencyEnum {  AED,  AFN,  ALL,  AMD,  ANG,  AOA,  ARS,  AUD,  AWG,  AZN,  BAM,  BBD,  BDT,  BGN,  BHD,  BIF,  BMD,  BND,  BOB,  BRL,  BSD,  BTN,  BWP,  BYN,  BYR,  BZD,  CAD,  CDF,  CHF,  CLP,  CNY,  COP,  CRC,  CUC,  CUP,  CVE,  CZK,  DJF,  DKK,  DOP,  DZD,  EGP,  ERN,  ETB,  EUR,  FJD,  FKP,  GBP,  GEL,  GGP,  GHS,  GIP,  GMD,  GNF,  GTQ,  GYD,  HKD,  HNL,  HRK,  HTG,  HUF,  IDR,  ILS,  IMP,  INR,  IQD,  IRR,  ISK,  JEP,  JMD,  JOD,  JPY,  KES,  KGS,  KHR,  KMF,  KPW,  KRW,  KWD,  KYD,  KZT,  LAK,  LBP,  LKR,  LRD,  LSL,  LYD,  MAD,  MDL,  MGA,  MKD,  MMK,  MNT,  MOP,  MRO,  MUR,  MVR,  MWK,  MXN,  MYR,  MZN,  NAD,  NGN,  NIO,  NOK,  NPR,  NZD,  OMR,  PAB,  PEN,  PGK,  PHP,  PKR,  PLN,  PYG,  QAR,  RON,  RSD,  RUB,  RWF,  SAR,  SBD,  SCR,  SDG,  SEK,  SGD,  SHP,  SLL,  SOS,  SPL,  SRD,  STD,  SVC,  SYP,  SZL,  THB,  TJS,  TMT,  TND,  TOP,  TRY,  TTD,  TVD,  TWD,  TZS,  UAH,  UGX,  USD,  UYU,  UZS,  VEF,  VND,  VUV,  WST,  XAF,  XCD,  XDR,  XOF,  XPF,  YER,  ZAR,  ZMW,  ZWD,  ,  };

  @BuiltValueField(wireName: r'format')
  CatalogsFormat get format;
  // enum formatEnum {  TSV,  CSV,  XML,  };

  /// A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
  @BuiltValueField(wireName: r'name')
  String? get name;

  @BuiltValueField(wireName: r'preferred_processing_schedule')
  CatalogsFeedProcessingSchedule? get preferredProcessingSchedule;

  /// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  @BuiltValueField(wireName: r'location')
  String get location;

  @BuiltValueField(wireName: r'status')
  CatalogsStatus get status;
  // enum statusEnum {  ACTIVE,  INACTIVE,  };

  CatalogsHotelFeed._();

  factory CatalogsHotelFeed([void updates(CatalogsHotelFeedBuilder b)]) = _$CatalogsHotelFeed;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelFeedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelFeed> get serializer => _$CatalogsHotelFeedSerializer();
}

class _$CatalogsHotelFeedSerializer implements PrimitiveSerializer<CatalogsHotelFeed> {
  @override
  final Iterable<Type> types = const [CatalogsHotelFeed, _$CatalogsHotelFeed];

  @override
  final String wireName = r'CatalogsHotelFeed';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelFeed object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsType),
    );
    yield r'credentials';
    yield object.credentials == null ? null : serializers.serialize(
      object.credentials,
      specifiedType: const FullType.nullable(CatalogsFeedCredentials),
    );
    yield r'format';
    yield serializers.serialize(
      object.format,
      specifiedType: const FullType(CatalogsFormat),
    );
    yield r'default_locale';
    yield serializers.serialize(
      object.defaultLocale,
      specifiedType: const FullType(String),
    );
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(DateTime),
    );
    yield r'catalog_id';
    yield object.catalogId == null ? null : serializers.serialize(
      object.catalogId,
      specifiedType: const FullType.nullable(String),
    );
    yield r'default_currency';
    yield object.defaultCurrency == null ? null : serializers.serialize(
      object.defaultCurrency,
      specifiedType: const FullType.nullable(NullableCurrency),
    );
    yield r'name';
    yield object.name == null ? null : serializers.serialize(
      object.name,
      specifiedType: const FullType.nullable(String),
    );
    yield r'preferred_processing_schedule';
    yield object.preferredProcessingSchedule == null ? null : serializers.serialize(
      object.preferredProcessingSchedule,
      specifiedType: const FullType.nullable(CatalogsFeedProcessingSchedule),
    );
    yield r'location';
    yield serializers.serialize(
      object.location,
      specifiedType: const FullType(String),
    );
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(CatalogsStatus),
    );
    yield r'updated_at';
    yield serializers.serialize(
      object.updatedAt,
      specifiedType: const FullType(DateTime),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelFeed object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelFeedBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
        case r'format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsFormat),
          ) as CatalogsFormat;
          result.format = valueDes;
          break;
        case r'default_locale':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.defaultLocale = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DateTime),
          ) as DateTime;
          result.createdAt = valueDes;
          break;
        case r'catalog_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.catalogId = valueDes;
          break;
        case r'default_currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(NullableCurrency),
          ) as NullableCurrency?;
          if (valueDes == null) continue;
          result.defaultCurrency = valueDes;
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
        case r'location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.location = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsStatus),
          ) as CatalogsStatus;
          result.status = valueDes;
          break;
        case r'updated_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DateTime),
          ) as DateTime;
          result.updatedAt = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsHotelFeed deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelFeedBuilder();
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

