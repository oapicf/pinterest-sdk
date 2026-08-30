//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_hotel_product_group_filters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_list_products_by_catalog_based_filter_request.g.dart';

/// Request object to list products for a given hotel catalog_id and product group filter.
///
/// Properties:
/// * [catalogId] - Catalog ID pertaining to the product group.
/// * [catalogType] 
/// * [filters] 
@BuiltValue()
abstract class CatalogsHotelListProductsByCatalogBasedFilterRequest implements Built<CatalogsHotelListProductsByCatalogBasedFilterRequest, CatalogsHotelListProductsByCatalogBasedFilterRequestBuilder> {
  /// Catalog ID pertaining to the product group.
  @BuiltValueField(wireName: r'catalog_id')
  String get catalogId;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  HOTEL,  };

  @BuiltValueField(wireName: r'filters')
  CatalogsHotelProductGroupFilters get filters;

  CatalogsHotelListProductsByCatalogBasedFilterRequest._();

  factory CatalogsHotelListProductsByCatalogBasedFilterRequest([void updates(CatalogsHotelListProductsByCatalogBasedFilterRequestBuilder b)]) = _$CatalogsHotelListProductsByCatalogBasedFilterRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelListProductsByCatalogBasedFilterRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelListProductsByCatalogBasedFilterRequest> get serializer => _$CatalogsHotelListProductsByCatalogBasedFilterRequestSerializer();
}

class _$CatalogsHotelListProductsByCatalogBasedFilterRequestSerializer implements PrimitiveSerializer<CatalogsHotelListProductsByCatalogBasedFilterRequest> {
  @override
  final Iterable<Type> types = const [CatalogsHotelListProductsByCatalogBasedFilterRequest, _$CatalogsHotelListProductsByCatalogBasedFilterRequest];

  @override
  final String wireName = r'CatalogsHotelListProductsByCatalogBasedFilterRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelListProductsByCatalogBasedFilterRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_id';
    yield serializers.serialize(
      object.catalogId,
      specifiedType: const FullType(String),
    );
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum),
    );
    yield r'filters';
    yield serializers.serialize(
      object.filters,
      specifiedType: const FullType(CatalogsHotelProductGroupFilters),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelListProductsByCatalogBasedFilterRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelListProductsByCatalogBasedFilterRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.catalogId = valueDes;
          break;
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum),
          ) as CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'filters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelProductGroupFilters),
          ) as CatalogsHotelProductGroupFilters;
          result.filters.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsHotelListProductsByCatalogBasedFilterRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelListProductsByCatalogBasedFilterRequestBuilder();
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

class CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'HOTEL')
  static const CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum HOTEL = _$catalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum_HOTEL;

  static Serializer<CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum> get serializer => _$catalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnumSerializer;

  const CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum> get values => _$catalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnumValues;
  static CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum valueOf(String name) => _$catalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnumValueOf(name);
}

