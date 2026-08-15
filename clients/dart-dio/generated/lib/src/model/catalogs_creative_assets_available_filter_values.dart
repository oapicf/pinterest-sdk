//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_creative_assets_filter_values_map.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_creative_assets_available_filter_values.g.dart';

/// CatalogsCreativeAssetsAvailableFilterValues
///
/// Properties:
/// * [catalogType] 
/// * [filterValues] 
@BuiltValue()
abstract class CatalogsCreativeAssetsAvailableFilterValues implements Built<CatalogsCreativeAssetsAvailableFilterValues, CatalogsCreativeAssetsAvailableFilterValuesBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  CREATIVE_ASSETS,  };

  @BuiltValueField(wireName: r'filter_values')
  CatalogsCreativeAssetsFilterValuesMap get filterValues;

  CatalogsCreativeAssetsAvailableFilterValues._();

  factory CatalogsCreativeAssetsAvailableFilterValues([void updates(CatalogsCreativeAssetsAvailableFilterValuesBuilder b)]) = _$CatalogsCreativeAssetsAvailableFilterValues;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsAvailableFilterValuesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsAvailableFilterValues> get serializer => _$CatalogsCreativeAssetsAvailableFilterValuesSerializer();
}

class _$CatalogsCreativeAssetsAvailableFilterValuesSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsAvailableFilterValues> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsAvailableFilterValues, _$CatalogsCreativeAssetsAvailableFilterValues];

  @override
  final String wireName = r'CatalogsCreativeAssetsAvailableFilterValues';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsAvailableFilterValues object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum),
    );
    yield r'filter_values';
    yield serializers.serialize(
      object.filterValues,
      specifiedType: const FullType(CatalogsCreativeAssetsFilterValuesMap),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreativeAssetsAvailableFilterValues object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreativeAssetsAvailableFilterValuesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum),
          ) as CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'filter_values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsCreativeAssetsFilterValuesMap),
          ) as CatalogsCreativeAssetsFilterValuesMap;
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
  CatalogsCreativeAssetsAvailableFilterValues deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsAvailableFilterValuesBuilder();
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

class CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum CREATIVE_ASSETS = _$catalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum> get serializer => _$catalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnumSerializer;

  const CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum> get values => _$catalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnumValues;
  static CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum valueOf(String name) => _$catalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnumValueOf(name);
}

