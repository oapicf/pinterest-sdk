//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_hotel_filter_values_map.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_available_filter_values.g.dart';

/// CatalogsHotelAvailableFilterValues
///
/// Properties:
/// * [catalogType] 
/// * [filterValues] 
@BuiltValue()
abstract class CatalogsHotelAvailableFilterValues implements Built<CatalogsHotelAvailableFilterValues, CatalogsHotelAvailableFilterValuesBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsHotelAvailableFilterValuesCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  HOTEL,  };

  @BuiltValueField(wireName: r'filter_values')
  CatalogsHotelFilterValuesMap get filterValues;

  CatalogsHotelAvailableFilterValues._();

  factory CatalogsHotelAvailableFilterValues([void updates(CatalogsHotelAvailableFilterValuesBuilder b)]) = _$CatalogsHotelAvailableFilterValues;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelAvailableFilterValuesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelAvailableFilterValues> get serializer => _$CatalogsHotelAvailableFilterValuesSerializer();
}

class _$CatalogsHotelAvailableFilterValuesSerializer implements PrimitiveSerializer<CatalogsHotelAvailableFilterValues> {
  @override
  final Iterable<Type> types = const [CatalogsHotelAvailableFilterValues, _$CatalogsHotelAvailableFilterValues];

  @override
  final String wireName = r'CatalogsHotelAvailableFilterValues';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelAvailableFilterValues object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsHotelAvailableFilterValuesCatalogTypeEnum),
    );
    yield r'filter_values';
    yield serializers.serialize(
      object.filterValues,
      specifiedType: const FullType(CatalogsHotelFilterValuesMap),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelAvailableFilterValues object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelAvailableFilterValuesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelAvailableFilterValuesCatalogTypeEnum),
          ) as CatalogsHotelAvailableFilterValuesCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'filter_values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelFilterValuesMap),
          ) as CatalogsHotelFilterValuesMap;
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
  CatalogsHotelAvailableFilterValues deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelAvailableFilterValuesBuilder();
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

class CatalogsHotelAvailableFilterValuesCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'HOTEL')
  static const CatalogsHotelAvailableFilterValuesCatalogTypeEnum HOTEL = _$catalogsHotelAvailableFilterValuesCatalogTypeEnum_HOTEL;

  static Serializer<CatalogsHotelAvailableFilterValuesCatalogTypeEnum> get serializer => _$catalogsHotelAvailableFilterValuesCatalogTypeEnumSerializer;

  const CatalogsHotelAvailableFilterValuesCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsHotelAvailableFilterValuesCatalogTypeEnum> get values => _$catalogsHotelAvailableFilterValuesCatalogTypeEnumValues;
  static CatalogsHotelAvailableFilterValuesCatalogTypeEnum valueOf(String name) => _$catalogsHotelAvailableFilterValuesCatalogTypeEnumValueOf(name);
}

