//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_creative_assets_filter_values_map.dart';
import 'package:openapi/src/model/catalogs_creative_assets_available_filter_values.dart';
import 'package:openapi/src/model/catalogs_retail_available_filter_values.dart';
import 'package:openapi/src/model/catalogs_hotel_available_filter_values.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_available_filter_values.g.dart';

/// Object holding available filter values for each filter key
///
/// Properties:
/// * [catalogType] 
/// * [filterValues] 
@BuiltValue()
abstract class CatalogsAvailableFilterValues implements Built<CatalogsAvailableFilterValues, CatalogsAvailableFilterValuesBuilder> {
  /// One Of [CatalogsCreativeAssetsAvailableFilterValues], [CatalogsHotelAvailableFilterValues], [CatalogsRetailAvailableFilterValues]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATIVE_ASSETS': CatalogsCreativeAssetsAvailableFilterValues,
    r'HOTEL': CatalogsHotelAvailableFilterValues,
    r'RETAIL': CatalogsRetailAvailableFilterValues,
  };

  CatalogsAvailableFilterValues._();

  factory CatalogsAvailableFilterValues([void updates(CatalogsAvailableFilterValuesBuilder b)]) = _$CatalogsAvailableFilterValues;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsAvailableFilterValuesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsAvailableFilterValues> get serializer => _$CatalogsAvailableFilterValuesSerializer();
}

extension CatalogsAvailableFilterValuesDiscriminatorExt on CatalogsAvailableFilterValues {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsAvailableFilterValues) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelAvailableFilterValues) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailAvailableFilterValues) {
            return r'RETAIL';
        }
        return null;
    }
}
extension CatalogsAvailableFilterValuesBuilderDiscriminatorExt on CatalogsAvailableFilterValuesBuilder {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsAvailableFilterValuesBuilder) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelAvailableFilterValuesBuilder) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailAvailableFilterValuesBuilder) {
            return r'RETAIL';
        }
        return null;
    }
}

class _$CatalogsAvailableFilterValuesSerializer implements PrimitiveSerializer<CatalogsAvailableFilterValues> {
  @override
  final Iterable<Type> types = const [CatalogsAvailableFilterValues, _$CatalogsAvailableFilterValues];

  @override
  final String wireName = r'CatalogsAvailableFilterValues';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsAvailableFilterValues object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsAvailableFilterValues object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsAvailableFilterValues deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsAvailableFilterValuesBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsAvailableFilterValues.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreativeAssetsAvailableFilterValues, CatalogsHotelAvailableFilterValues, CatalogsRetailAvailableFilterValues, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATIVE_ASSETS':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreativeAssetsAvailableFilterValues),
        ) as CatalogsCreativeAssetsAvailableFilterValues;
        oneOfType = CatalogsCreativeAssetsAvailableFilterValues;
        break;
      case r'HOTEL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelAvailableFilterValues),
        ) as CatalogsHotelAvailableFilterValues;
        oneOfType = CatalogsHotelAvailableFilterValues;
        break;
      case r'RETAIL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailAvailableFilterValues),
        ) as CatalogsRetailAvailableFilterValues;
        oneOfType = CatalogsRetailAvailableFilterValues;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class CatalogsAvailableFilterValuesCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsAvailableFilterValuesCatalogTypeEnum CREATIVE_ASSETS = _$catalogsAvailableFilterValuesCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsAvailableFilterValuesCatalogTypeEnum> get serializer => _$catalogsAvailableFilterValuesCatalogTypeEnumSerializer;

  const CatalogsAvailableFilterValuesCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsAvailableFilterValuesCatalogTypeEnum> get values => _$catalogsAvailableFilterValuesCatalogTypeEnumValues;
  static CatalogsAvailableFilterValuesCatalogTypeEnum valueOf(String name) => _$catalogsAvailableFilterValuesCatalogTypeEnumValueOf(name);
}

