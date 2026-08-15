//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_retail_filter_values_map.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_retail_available_filter_values.g.dart';

/// CatalogsRetailAvailableFilterValues
///
/// Properties:
/// * [catalogType] 
/// * [filterValues] 
@BuiltValue()
abstract class CatalogsRetailAvailableFilterValues implements Built<CatalogsRetailAvailableFilterValues, CatalogsRetailAvailableFilterValuesBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsRetailAvailableFilterValuesCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  RETAIL,  };

  @BuiltValueField(wireName: r'filter_values')
  CatalogsRetailFilterValuesMap get filterValues;

  CatalogsRetailAvailableFilterValues._();

  factory CatalogsRetailAvailableFilterValues([void updates(CatalogsRetailAvailableFilterValuesBuilder b)]) = _$CatalogsRetailAvailableFilterValues;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsRetailAvailableFilterValuesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsRetailAvailableFilterValues> get serializer => _$CatalogsRetailAvailableFilterValuesSerializer();
}

class _$CatalogsRetailAvailableFilterValuesSerializer implements PrimitiveSerializer<CatalogsRetailAvailableFilterValues> {
  @override
  final Iterable<Type> types = const [CatalogsRetailAvailableFilterValues, _$CatalogsRetailAvailableFilterValues];

  @override
  final String wireName = r'CatalogsRetailAvailableFilterValues';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsRetailAvailableFilterValues object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsRetailAvailableFilterValuesCatalogTypeEnum),
    );
    yield r'filter_values';
    yield serializers.serialize(
      object.filterValues,
      specifiedType: const FullType(CatalogsRetailFilterValuesMap),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsRetailAvailableFilterValues object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsRetailAvailableFilterValuesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsRetailAvailableFilterValuesCatalogTypeEnum),
          ) as CatalogsRetailAvailableFilterValuesCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'filter_values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsRetailFilterValuesMap),
          ) as CatalogsRetailFilterValuesMap;
          result.filterValues.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsRetailAvailableFilterValues deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsRetailAvailableFilterValuesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

class CatalogsRetailAvailableFilterValuesCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'RETAIL')
  static const CatalogsRetailAvailableFilterValuesCatalogTypeEnum RETAIL = _$catalogsRetailAvailableFilterValuesCatalogTypeEnum_RETAIL;

  static Serializer<CatalogsRetailAvailableFilterValuesCatalogTypeEnum> get serializer => _$catalogsRetailAvailableFilterValuesCatalogTypeEnumSerializer;

  const CatalogsRetailAvailableFilterValuesCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsRetailAvailableFilterValuesCatalogTypeEnum> get values => _$catalogsRetailAvailableFilterValuesCatalogTypeEnumValues;
  static CatalogsRetailAvailableFilterValuesCatalogTypeEnum valueOf(String name) => _$catalogsRetailAvailableFilterValuesCatalogTypeEnumValueOf(name);
}

