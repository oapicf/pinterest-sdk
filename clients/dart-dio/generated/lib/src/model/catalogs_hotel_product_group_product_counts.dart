//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_product_group_product_counts.g.dart';

/// Product counts for a Hotel CatalogsProductGroup
///
/// Properties:
/// * [catalogType] 
/// * [total] 
@BuiltValue()
abstract class CatalogsHotelProductGroupProductCounts implements Built<CatalogsHotelProductGroupProductCounts, CatalogsHotelProductGroupProductCountsBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsHotelProductGroupProductCountsCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  HOTEL,  };

  @BuiltValueField(wireName: r'total')
  num get total;

  CatalogsHotelProductGroupProductCounts._();

  factory CatalogsHotelProductGroupProductCounts([void updates(CatalogsHotelProductGroupProductCountsBuilder b)]) = _$CatalogsHotelProductGroupProductCounts;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelProductGroupProductCountsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelProductGroupProductCounts> get serializer => _$CatalogsHotelProductGroupProductCountsSerializer();
}

class _$CatalogsHotelProductGroupProductCountsSerializer implements PrimitiveSerializer<CatalogsHotelProductGroupProductCounts> {
  @override
  final Iterable<Type> types = const [CatalogsHotelProductGroupProductCounts, _$CatalogsHotelProductGroupProductCounts];

  @override
  final String wireName = r'CatalogsHotelProductGroupProductCounts';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelProductGroupProductCounts object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsHotelProductGroupProductCountsCatalogTypeEnum),
    );
    yield r'total';
    yield serializers.serialize(
      object.total,
      specifiedType: const FullType(num),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelProductGroupProductCounts object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelProductGroupProductCountsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelProductGroupProductCountsCatalogTypeEnum),
          ) as CatalogsHotelProductGroupProductCountsCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'total':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.total = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsHotelProductGroupProductCounts deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelProductGroupProductCountsBuilder();
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

class CatalogsHotelProductGroupProductCountsCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'HOTEL')
  static const CatalogsHotelProductGroupProductCountsCatalogTypeEnum HOTEL = _$catalogsHotelProductGroupProductCountsCatalogTypeEnum_HOTEL;

  static Serializer<CatalogsHotelProductGroupProductCountsCatalogTypeEnum> get serializer => _$catalogsHotelProductGroupProductCountsCatalogTypeEnumSerializer;

  const CatalogsHotelProductGroupProductCountsCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsHotelProductGroupProductCountsCatalogTypeEnum> get values => _$catalogsHotelProductGroupProductCountsCatalogTypeEnumValues;
  static CatalogsHotelProductGroupProductCountsCatalogTypeEnum valueOf(String name) => _$catalogsHotelProductGroupProductCountsCatalogTypeEnumValueOf(name);
}

