//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_hotel_items_post_filter.dart';
import 'package:openapi/src/model/catalogs_creative_assets_items_post_filter.dart';
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:openapi/src/model/catalogs_retail_items_post_filter.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_items_post_filters.g.dart';

/// CatalogsItemsPostFilters
///
/// Properties:
/// * [catalogType] 
/// * [catalogId] - Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
/// * [itemIds] 
/// * [hotelIds] 
/// * [creativeAssetsIds] 
@BuiltValue()
abstract class CatalogsItemsPostFilters implements Built<CatalogsItemsPostFilters, CatalogsItemsPostFiltersBuilder> {
  /// One Of [CatalogsCreativeAssetsItemsPostFilter], [CatalogsHotelItemsPostFilter], [CatalogsRetailItemsPostFilter]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATIVE_ASSETS': CatalogsCreativeAssetsItemsPostFilter,
    r'HOTEL': CatalogsHotelItemsPostFilter,
    r'RETAIL': CatalogsRetailItemsPostFilter,
  };

  CatalogsItemsPostFilters._();

  factory CatalogsItemsPostFilters([void updates(CatalogsItemsPostFiltersBuilder b)]) = _$CatalogsItemsPostFilters;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsItemsPostFiltersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsItemsPostFilters> get serializer => _$CatalogsItemsPostFiltersSerializer();
}

extension CatalogsItemsPostFiltersDiscriminatorExt on CatalogsItemsPostFilters {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsItemsPostFilter) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelItemsPostFilter) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailItemsPostFilter) {
            return r'RETAIL';
        }
        return null;
    }
}
extension CatalogsItemsPostFiltersBuilderDiscriminatorExt on CatalogsItemsPostFiltersBuilder {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsItemsPostFilterBuilder) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelItemsPostFilterBuilder) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailItemsPostFilterBuilder) {
            return r'RETAIL';
        }
        return null;
    }
}

class _$CatalogsItemsPostFiltersSerializer implements PrimitiveSerializer<CatalogsItemsPostFilters> {
  @override
  final Iterable<Type> types = const [CatalogsItemsPostFilters, _$CatalogsItemsPostFilters];

  @override
  final String wireName = r'CatalogsItemsPostFilters';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsItemsPostFilters object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsItemsPostFilters object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsItemsPostFilters deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsItemsPostFiltersBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsItemsPostFilters.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreativeAssetsItemsPostFilter, CatalogsHotelItemsPostFilter, CatalogsRetailItemsPostFilter, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATIVE_ASSETS':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreativeAssetsItemsPostFilter),
        ) as CatalogsCreativeAssetsItemsPostFilter;
        oneOfType = CatalogsCreativeAssetsItemsPostFilter;
        break;
      case r'HOTEL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelItemsPostFilter),
        ) as CatalogsHotelItemsPostFilter;
        oneOfType = CatalogsHotelItemsPostFilter;
        break;
      case r'RETAIL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailItemsPostFilter),
        ) as CatalogsRetailItemsPostFilter;
        oneOfType = CatalogsRetailItemsPostFilter;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

