//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_feed_credentials.dart';
import 'package:openapi/src/model/catalogs_feed_processing_schedule.dart';
import 'package:openapi/src/model/catalogs_creative_assets_feeds_update_request.dart';
import 'package:openapi/src/model/catalogs_hotel_feeds_update_request.dart';
import 'package:openapi/src/model/nullable_currency.dart';
import 'package:openapi/src/model/product_availability_type.dart';
import 'package:openapi/src/model/catalogs_status.dart';
import 'package:openapi/src/model/catalogs_format.dart';
import 'package:openapi/src/model/catalogs_retail_feeds_update_request.dart';
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_vertical_feeds_update_request.g.dart';

/// Request object for updating a feed.
///
/// Properties:
/// * [catalogType] 
/// * [credentials] 
/// * [defaultAvailability] 
/// * [defaultCurrency] 
/// * [format] 
/// * [location] - The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
/// * [name] - A human-friendly name associated to a given feed.
/// * [preferredProcessingSchedule] 
/// * [status] 
@BuiltValue()
abstract class CatalogsVerticalFeedsUpdateRequest implements Built<CatalogsVerticalFeedsUpdateRequest, CatalogsVerticalFeedsUpdateRequestBuilder> {
  /// One Of [CatalogsCreativeAssetsFeedsUpdateRequest], [CatalogsHotelFeedsUpdateRequest], [CatalogsRetailFeedsUpdateRequest]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATIVE_ASSETS': CatalogsCreativeAssetsFeedsUpdateRequest,
    r'HOTEL': CatalogsHotelFeedsUpdateRequest,
    r'RETAIL': CatalogsRetailFeedsUpdateRequest,
  };

  CatalogsVerticalFeedsUpdateRequest._();

  factory CatalogsVerticalFeedsUpdateRequest([void updates(CatalogsVerticalFeedsUpdateRequestBuilder b)]) = _$CatalogsVerticalFeedsUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsVerticalFeedsUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsVerticalFeedsUpdateRequest> get serializer => _$CatalogsVerticalFeedsUpdateRequestSerializer();
}

extension CatalogsVerticalFeedsUpdateRequestDiscriminatorExt on CatalogsVerticalFeedsUpdateRequest {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsFeedsUpdateRequest) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelFeedsUpdateRequest) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailFeedsUpdateRequest) {
            return r'RETAIL';
        }
        return null;
    }
}
extension CatalogsVerticalFeedsUpdateRequestBuilderDiscriminatorExt on CatalogsVerticalFeedsUpdateRequestBuilder {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsFeedsUpdateRequestBuilder) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelFeedsUpdateRequestBuilder) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailFeedsUpdateRequestBuilder) {
            return r'RETAIL';
        }
        return null;
    }
}

class _$CatalogsVerticalFeedsUpdateRequestSerializer implements PrimitiveSerializer<CatalogsVerticalFeedsUpdateRequest> {
  @override
  final Iterable<Type> types = const [CatalogsVerticalFeedsUpdateRequest, _$CatalogsVerticalFeedsUpdateRequest];

  @override
  final String wireName = r'CatalogsVerticalFeedsUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsVerticalFeedsUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsVerticalFeedsUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsVerticalFeedsUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsVerticalFeedsUpdateRequestBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsVerticalFeedsUpdateRequest.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreativeAssetsFeedsUpdateRequest, CatalogsHotelFeedsUpdateRequest, CatalogsRetailFeedsUpdateRequest, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATIVE_ASSETS':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreativeAssetsFeedsUpdateRequest),
        ) as CatalogsCreativeAssetsFeedsUpdateRequest;
        oneOfType = CatalogsCreativeAssetsFeedsUpdateRequest;
        break;
      case r'HOTEL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelFeedsUpdateRequest),
        ) as CatalogsHotelFeedsUpdateRequest;
        oneOfType = CatalogsHotelFeedsUpdateRequest;
        break;
      case r'RETAIL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailFeedsUpdateRequest),
        ) as CatalogsRetailFeedsUpdateRequest;
        oneOfType = CatalogsRetailFeedsUpdateRequest;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

