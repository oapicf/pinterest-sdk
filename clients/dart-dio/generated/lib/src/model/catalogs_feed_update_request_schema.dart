//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_feed_credentials.dart';
import 'package:openapi/src/model/catalogs_feed_processing_schedule.dart';
import 'package:openapi/src/model/catalogs_vertical_feeds_update_request.dart';
import 'package:openapi/src/model/nullable_currency.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_feeds_update_request.dart';
import 'package:openapi/src/model/product_availability_type.dart';
import 'package:openapi/src/model/catalogs_status.dart';
import 'package:openapi/src/model/catalogs_format.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_feed_update_request_schema.g.dart';

/// CatalogsFeedUpdateRequestSchema
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
abstract class CatalogsFeedUpdateRequestSchema implements Built<CatalogsFeedUpdateRequestSchema, CatalogsFeedUpdateRequestSchemaBuilder> {
  /// One Of [CatalogsFeedsUpdateRequest], [CatalogsVerticalFeedsUpdateRequest]
  OneOf get oneOf;

  CatalogsFeedUpdateRequestSchema._();

  factory CatalogsFeedUpdateRequestSchema([void updates(CatalogsFeedUpdateRequestSchemaBuilder b)]) = _$CatalogsFeedUpdateRequestSchema;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsFeedUpdateRequestSchemaBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsFeedUpdateRequestSchema> get serializer => _$CatalogsFeedUpdateRequestSchemaSerializer();
}

class _$CatalogsFeedUpdateRequestSchemaSerializer implements PrimitiveSerializer<CatalogsFeedUpdateRequestSchema> {
  @override
  final Iterable<Type> types = const [CatalogsFeedUpdateRequestSchema, _$CatalogsFeedUpdateRequestSchema];

  @override
  final String wireName = r'CatalogsFeedUpdateRequestSchema';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsFeedUpdateRequestSchema object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsFeedUpdateRequestSchema object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsFeedUpdateRequestSchema deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsFeedUpdateRequestSchemaBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(CatalogsVerticalFeedsUpdateRequest), FullType(CatalogsFeedsUpdateRequest), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class CatalogsFeedUpdateRequestSchemaCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsFeedUpdateRequestSchemaCatalogTypeEnum CREATIVE_ASSETS = _$catalogsFeedUpdateRequestSchemaCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsFeedUpdateRequestSchemaCatalogTypeEnum> get serializer => _$catalogsFeedUpdateRequestSchemaCatalogTypeEnumSerializer;

  const CatalogsFeedUpdateRequestSchemaCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsFeedUpdateRequestSchemaCatalogTypeEnum> get values => _$catalogsFeedUpdateRequestSchemaCatalogTypeEnumValues;
  static CatalogsFeedUpdateRequestSchemaCatalogTypeEnum valueOf(String name) => _$catalogsFeedUpdateRequestSchemaCatalogTypeEnumValueOf(name);
}

