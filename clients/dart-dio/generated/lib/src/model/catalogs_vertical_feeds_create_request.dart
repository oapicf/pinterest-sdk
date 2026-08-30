//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_feed_credentials.dart';
import 'package:openapi/src/model/catalogs_feed_processing_schedule.dart';
import 'package:openapi/src/model/nullable_currency.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_retail_feeds_create_request.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/product_availability_type.dart';
import 'package:openapi/src/model/catalogs_status.dart';
import 'package:openapi/src/model/catalogs_format.dart';
import 'package:openapi/src/model/catalogs_creative_assets_feeds_create_request.dart';
import 'package:openapi/src/model/catalogs_creative_assets_feeds_create_request_default_locale.dart';
import 'package:openapi/src/model/catalogs_hotel_feeds_create_request.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_vertical_feeds_create_request.g.dart';

/// Request object for creating a feed.
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
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
abstract class CatalogsVerticalFeedsCreateRequest implements Built<CatalogsVerticalFeedsCreateRequest, CatalogsVerticalFeedsCreateRequestBuilder> {
  /// One Of [CatalogsCreativeAssetsFeedsCreateRequest], [CatalogsHotelFeedsCreateRequest], [CatalogsRetailFeedsCreateRequest]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATIVE_ASSETS': CatalogsCreativeAssetsFeedsCreateRequest,
    r'HOTEL': CatalogsHotelFeedsCreateRequest,
    r'RETAIL': CatalogsRetailFeedsCreateRequest,
  };

  CatalogsVerticalFeedsCreateRequest._();

  factory CatalogsVerticalFeedsCreateRequest([void updates(CatalogsVerticalFeedsCreateRequestBuilder b)]) = _$CatalogsVerticalFeedsCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsVerticalFeedsCreateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsVerticalFeedsCreateRequest> get serializer => _$CatalogsVerticalFeedsCreateRequestSerializer();
}

extension CatalogsVerticalFeedsCreateRequestDiscriminatorExt on CatalogsVerticalFeedsCreateRequest {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsFeedsCreateRequest) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelFeedsCreateRequest) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailFeedsCreateRequest) {
            return r'RETAIL';
        }
        return null;
    }
}
extension CatalogsVerticalFeedsCreateRequestBuilderDiscriminatorExt on CatalogsVerticalFeedsCreateRequestBuilder {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsFeedsCreateRequestBuilder) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelFeedsCreateRequestBuilder) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailFeedsCreateRequestBuilder) {
            return r'RETAIL';
        }
        return null;
    }
}

class _$CatalogsVerticalFeedsCreateRequestSerializer implements PrimitiveSerializer<CatalogsVerticalFeedsCreateRequest> {
  @override
  final Iterable<Type> types = const [CatalogsVerticalFeedsCreateRequest, _$CatalogsVerticalFeedsCreateRequest];

  @override
  final String wireName = r'CatalogsVerticalFeedsCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsVerticalFeedsCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsVerticalFeedsCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsVerticalFeedsCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsVerticalFeedsCreateRequestBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsVerticalFeedsCreateRequest.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreativeAssetsFeedsCreateRequest, CatalogsHotelFeedsCreateRequest, CatalogsRetailFeedsCreateRequest, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATIVE_ASSETS':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreativeAssetsFeedsCreateRequest),
        ) as CatalogsCreativeAssetsFeedsCreateRequest;
        oneOfType = CatalogsCreativeAssetsFeedsCreateRequest;
        break;
      case r'HOTEL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelFeedsCreateRequest),
        ) as CatalogsHotelFeedsCreateRequest;
        oneOfType = CatalogsHotelFeedsCreateRequest;
        break;
      case r'RETAIL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailFeedsCreateRequest),
        ) as CatalogsRetailFeedsCreateRequest;
        oneOfType = CatalogsRetailFeedsCreateRequest;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class CatalogsVerticalFeedsCreateRequestCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsVerticalFeedsCreateRequestCatalogTypeEnum CREATIVE_ASSETS = _$catalogsVerticalFeedsCreateRequestCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsVerticalFeedsCreateRequestCatalogTypeEnum> get serializer => _$catalogsVerticalFeedsCreateRequestCatalogTypeEnumSerializer;

  const CatalogsVerticalFeedsCreateRequestCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsVerticalFeedsCreateRequestCatalogTypeEnum> get values => _$catalogsVerticalFeedsCreateRequestCatalogTypeEnumValues;
  static CatalogsVerticalFeedsCreateRequestCatalogTypeEnum valueOf(String name) => _$catalogsVerticalFeedsCreateRequestCatalogTypeEnumValueOf(name);
}

