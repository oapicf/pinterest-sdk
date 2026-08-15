//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_feed_credentials.dart';
import 'package:openapi/src/model/catalogs_feed_processing_schedule.dart';
import 'package:openapi/src/model/catalogs_vertical_feeds_update_request.dart';
import 'package:openapi/src/model/nullable_currency.dart';
import 'package:openapi/src/model/catalogs_feeds_update_request.dart';
import 'package:openapi/src/model/product_availability_type.dart';
import 'package:openapi/src/model/catalogs_status.dart';
import 'package:openapi/src/model/catalogs_format.dart';
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'feeds_update_request.g.dart';

/// FeedsUpdateRequest
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
abstract class FeedsUpdateRequest implements Built<FeedsUpdateRequest, FeedsUpdateRequestBuilder> {
  /// One Of [CatalogsFeedsUpdateRequest], [CatalogsVerticalFeedsUpdateRequest]
  OneOf get oneOf;

  FeedsUpdateRequest._();

  factory FeedsUpdateRequest([void updates(FeedsUpdateRequestBuilder b)]) = _$FeedsUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FeedsUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FeedsUpdateRequest> get serializer => _$FeedsUpdateRequestSerializer();
}

class _$FeedsUpdateRequestSerializer implements PrimitiveSerializer<FeedsUpdateRequest> {
  @override
  final Iterable<Type> types = const [FeedsUpdateRequest, _$FeedsUpdateRequest];

  @override
  final String wireName = r'FeedsUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FeedsUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    FeedsUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  FeedsUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FeedsUpdateRequestBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(CatalogsVerticalFeedsUpdateRequest), FullType(CatalogsFeedsUpdateRequest), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

