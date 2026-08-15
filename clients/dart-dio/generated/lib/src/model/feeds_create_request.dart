//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_feed_credentials.dart';
import 'package:openapi/src/model/catalogs_feed_processing_schedule.dart';
import 'package:openapi/src/model/nullable_currency.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/product_availability_type.dart';
import 'package:openapi/src/model/catalogs_feeds_create_request.dart';
import 'package:openapi/src/model/catalogs_status.dart';
import 'package:openapi/src/model/catalogs_format.dart';
import 'package:openapi/src/model/catalogs_vertical_feeds_create_request.dart';
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:openapi/src/model/catalogs_feeds_create_request_default_locale.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'feeds_create_request.g.dart';

/// FeedsCreateRequest
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.
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
abstract class FeedsCreateRequest implements Built<FeedsCreateRequest, FeedsCreateRequestBuilder> {
  /// One Of [CatalogsFeedsCreateRequest], [CatalogsVerticalFeedsCreateRequest]
  OneOf get oneOf;

  FeedsCreateRequest._();

  factory FeedsCreateRequest([void updates(FeedsCreateRequestBuilder b)]) = _$FeedsCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FeedsCreateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FeedsCreateRequest> get serializer => _$FeedsCreateRequestSerializer();
}

class _$FeedsCreateRequestSerializer implements PrimitiveSerializer<FeedsCreateRequest> {
  @override
  final Iterable<Type> types = const [FeedsCreateRequest, _$FeedsCreateRequest];

  @override
  final String wireName = r'FeedsCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FeedsCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    FeedsCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  FeedsCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FeedsCreateRequestBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(CatalogsVerticalFeedsCreateRequest), FullType(CatalogsFeedsCreateRequest), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

