//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_feed_credentials.dart';
import 'package:openapi/src/model/catalogs_feed_processing_schedule.dart';
import 'package:openapi/src/model/catalogs_retail_feed.dart';
import 'package:openapi/src/model/nullable_currency.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/product_availability_type.dart';
import 'package:openapi/src/model/catalogs_status.dart';
import 'package:openapi/src/model/catalogs_format.dart';
import 'package:openapi/src/model/catalogs_hotel_feed.dart';
import 'package:openapi/src/model/catalogs_creative_assets_feed.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_feed.g.dart';

/// Catalogs Feed object
///
/// Properties:
/// * [catalogType] 
/// * [createdAt] 
/// * [credentials] 
/// * [defaultAvailability] 
/// * [defaultCountry] 
/// * [defaultCurrency] 
/// * [defaultLocale] - The locale used within a feed for product descriptions.
/// * [format] 
/// * [id] - ID of the feed entity.
/// * [location] - The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
/// * [name] - A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
/// * [preferredProcessingSchedule] 
/// * [status] 
/// * [updatedAt] 
/// * [catalogId] - Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
@BuiltValue()
abstract class CatalogsFeed implements Built<CatalogsFeed, CatalogsFeedBuilder> {
  /// One Of [CatalogsCreativeAssetsFeed], [CatalogsHotelFeed], [CatalogsRetailFeed]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATIVE_ASSETS': CatalogsCreativeAssetsFeed,
    r'HOTEL': CatalogsHotelFeed,
    r'RETAIL': CatalogsRetailFeed,
  };

  CatalogsFeed._();

  factory CatalogsFeed([void updates(CatalogsFeedBuilder b)]) = _$CatalogsFeed;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsFeedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsFeed> get serializer => _$CatalogsFeedSerializer();
}

extension CatalogsFeedDiscriminatorExt on CatalogsFeed {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsFeed) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelFeed) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailFeed) {
            return r'RETAIL';
        }
        return null;
    }
}
extension CatalogsFeedBuilderDiscriminatorExt on CatalogsFeedBuilder {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsFeedBuilder) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelFeedBuilder) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailFeedBuilder) {
            return r'RETAIL';
        }
        return null;
    }
}

class _$CatalogsFeedSerializer implements PrimitiveSerializer<CatalogsFeed> {
  @override
  final Iterable<Type> types = const [CatalogsFeed, _$CatalogsFeed];

  @override
  final String wireName = r'CatalogsFeed';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsFeed object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsFeed object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsFeed deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsFeedBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsFeed.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreativeAssetsFeed, CatalogsHotelFeed, CatalogsRetailFeed, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATIVE_ASSETS':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreativeAssetsFeed),
        ) as CatalogsCreativeAssetsFeed;
        oneOfType = CatalogsCreativeAssetsFeed;
        break;
      case r'HOTEL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelFeed),
        ) as CatalogsHotelFeed;
        oneOfType = CatalogsHotelFeed;
        break;
      case r'RETAIL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailFeed),
        ) as CatalogsRetailFeed;
        oneOfType = CatalogsRetailFeed;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class CatalogsFeedCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsFeedCatalogTypeEnum CREATIVE_ASSETS = _$catalogsFeedCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsFeedCatalogTypeEnum> get serializer => _$catalogsFeedCatalogTypeEnumSerializer;

  const CatalogsFeedCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsFeedCatalogTypeEnum> get values => _$catalogsFeedCatalogTypeEnumValues;
  static CatalogsFeedCatalogTypeEnum valueOf(String name) => _$catalogsFeedCatalogTypeEnumValueOf(name);
}

