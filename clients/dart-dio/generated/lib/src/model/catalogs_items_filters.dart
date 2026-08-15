//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_hotel_items_filter.dart';
import 'package:openapi/src/model/catalogs_retail_items_filter.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_creative_assets_items_filter.dart';
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_items_filters.g.dart';

/// CatalogsItemsFilters
///
/// Properties:
/// * [catalogType] 
/// * [catalogId] - Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
/// * [itemIds] 
/// * [hotelIds] 
/// * [creativeAssetsIds] 
@BuiltValue()
abstract class CatalogsItemsFilters implements Built<CatalogsItemsFilters, CatalogsItemsFiltersBuilder> {
  /// One Of [CatalogsCreativeAssetsItemsFilter], [CatalogsHotelItemsFilter], [CatalogsRetailItemsFilter]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATIVE_ASSETS': CatalogsCreativeAssetsItemsFilter,
    r'HOTEL': CatalogsHotelItemsFilter,
    r'RETAIL': CatalogsRetailItemsFilter,
  };

  CatalogsItemsFilters._();

  factory CatalogsItemsFilters([void updates(CatalogsItemsFiltersBuilder b)]) = _$CatalogsItemsFilters;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsItemsFiltersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsItemsFilters> get serializer => _$CatalogsItemsFiltersSerializer();
}

extension CatalogsItemsFiltersDiscriminatorExt on CatalogsItemsFilters {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsItemsFilter) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelItemsFilter) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailItemsFilter) {
            return r'RETAIL';
        }
        return null;
    }
}
extension CatalogsItemsFiltersBuilderDiscriminatorExt on CatalogsItemsFiltersBuilder {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsItemsFilterBuilder) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelItemsFilterBuilder) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailItemsFilterBuilder) {
            return r'RETAIL';
        }
        return null;
    }
}

class _$CatalogsItemsFiltersSerializer implements PrimitiveSerializer<CatalogsItemsFilters> {
  @override
  final Iterable<Type> types = const [CatalogsItemsFilters, _$CatalogsItemsFilters];

  @override
  final String wireName = r'CatalogsItemsFilters';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsItemsFilters object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsItemsFilters object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsItemsFilters deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsItemsFiltersBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsItemsFilters.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreativeAssetsItemsFilter, CatalogsHotelItemsFilter, CatalogsRetailItemsFilter, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATIVE_ASSETS':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreativeAssetsItemsFilter),
        ) as CatalogsCreativeAssetsItemsFilter;
        oneOfType = CatalogsCreativeAssetsItemsFilter;
        break;
      case r'HOTEL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelItemsFilter),
        ) as CatalogsHotelItemsFilter;
        oneOfType = CatalogsHotelItemsFilter;
        break;
      case r'RETAIL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailItemsFilter),
        ) as CatalogsRetailItemsFilter;
        oneOfType = CatalogsRetailItemsFilter;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

