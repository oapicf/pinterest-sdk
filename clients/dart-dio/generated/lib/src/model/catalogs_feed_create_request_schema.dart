//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_feed_credentials.dart';
import 'package:openapi/src/model/catalogs_feed_processing_schedule.dart';
import 'package:openapi/src/model/nullable_currency.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/product_availability_type.dart';
import 'package:openapi/src/model/catalogs_feeds_create_request.dart';
import 'package:openapi/src/model/catalogs_status.dart';
import 'package:openapi/src/model/catalogs_format.dart';
import 'package:openapi/src/model/catalogs_creative_assets_feeds_create_request_default_locale.dart';
import 'package:openapi/src/model/catalogs_vertical_feeds_create_request.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_feed_create_request_schema.g.dart';

/// CatalogsFeedCreateRequestSchema
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
abstract class CatalogsFeedCreateRequestSchema implements Built<CatalogsFeedCreateRequestSchema, CatalogsFeedCreateRequestSchemaBuilder> {
  /// One Of [CatalogsFeedsCreateRequest], [CatalogsVerticalFeedsCreateRequest]
  OneOf get oneOf;

  CatalogsFeedCreateRequestSchema._();

  factory CatalogsFeedCreateRequestSchema([void updates(CatalogsFeedCreateRequestSchemaBuilder b)]) = _$CatalogsFeedCreateRequestSchema;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsFeedCreateRequestSchemaBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsFeedCreateRequestSchema> get serializer => _$CatalogsFeedCreateRequestSchemaSerializer();
}

class _$CatalogsFeedCreateRequestSchemaSerializer implements PrimitiveSerializer<CatalogsFeedCreateRequestSchema> {
  @override
  final Iterable<Type> types = const [CatalogsFeedCreateRequestSchema, _$CatalogsFeedCreateRequestSchema];

  @override
  final String wireName = r'CatalogsFeedCreateRequestSchema';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsFeedCreateRequestSchema object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsFeedCreateRequestSchema object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsFeedCreateRequestSchema deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsFeedCreateRequestSchemaBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(CatalogsVerticalFeedsCreateRequest), FullType(CatalogsFeedsCreateRequest), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class CatalogsFeedCreateRequestSchemaCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsFeedCreateRequestSchemaCatalogTypeEnum CREATIVE_ASSETS = _$catalogsFeedCreateRequestSchemaCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsFeedCreateRequestSchemaCatalogTypeEnum> get serializer => _$catalogsFeedCreateRequestSchemaCatalogTypeEnumSerializer;

  const CatalogsFeedCreateRequestSchemaCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsFeedCreateRequestSchemaCatalogTypeEnum> get values => _$catalogsFeedCreateRequestSchemaCatalogTypeEnumValues;
  static CatalogsFeedCreateRequestSchemaCatalogTypeEnum valueOf(String name) => _$catalogsFeedCreateRequestSchemaCatalogTypeEnumValueOf(name);
}

