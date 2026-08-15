//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_hotel_product_group_filters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_product_group_create_request.g.dart';

/// Request object for creating a hotel product group.
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to the hotel product group.
/// * [catalogType] 
/// * [description] 
/// * [filters] 
/// * [name] 
@BuiltValue()
abstract class CatalogsHotelProductGroupCreateRequest implements Built<CatalogsHotelProductGroupCreateRequest, CatalogsHotelProductGroupCreateRequestBuilder> {
  /// Catalog id pertaining to the hotel product group.
  @BuiltValueField(wireName: r'catalog_id')
  String get catalogId;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsHotelProductGroupCreateRequestCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  HOTEL,  };

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'filters')
  CatalogsHotelProductGroupFilters get filters;

  @BuiltValueField(wireName: r'name')
  String get name;

  CatalogsHotelProductGroupCreateRequest._();

  factory CatalogsHotelProductGroupCreateRequest([void updates(CatalogsHotelProductGroupCreateRequestBuilder b)]) = _$CatalogsHotelProductGroupCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelProductGroupCreateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelProductGroupCreateRequest> get serializer => _$CatalogsHotelProductGroupCreateRequestSerializer();
}

class _$CatalogsHotelProductGroupCreateRequestSerializer implements PrimitiveSerializer<CatalogsHotelProductGroupCreateRequest> {
  @override
  final Iterable<Type> types = const [CatalogsHotelProductGroupCreateRequest, _$CatalogsHotelProductGroupCreateRequest];

  @override
  final String wireName = r'CatalogsHotelProductGroupCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelProductGroupCreateRequest object, {
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
      specifiedType: const FullType(CatalogsHotelProductGroupCreateRequestCatalogTypeEnum),
    );
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'filters';
    yield serializers.serialize(
      object.filters,
      specifiedType: const FullType(CatalogsHotelProductGroupFilters),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelProductGroupCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelProductGroupCreateRequestBuilder result,
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
            specifiedType: const FullType(CatalogsHotelProductGroupCreateRequestCatalogTypeEnum),
          ) as CatalogsHotelProductGroupCreateRequestCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'filters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelProductGroupFilters),
          ) as CatalogsHotelProductGroupFilters;
          result.filters.replace(valueDes);
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsHotelProductGroupCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelProductGroupCreateRequestBuilder();
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

class CatalogsHotelProductGroupCreateRequestCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'HOTEL')
  static const CatalogsHotelProductGroupCreateRequestCatalogTypeEnum HOTEL = _$catalogsHotelProductGroupCreateRequestCatalogTypeEnum_HOTEL;

  static Serializer<CatalogsHotelProductGroupCreateRequestCatalogTypeEnum> get serializer => _$catalogsHotelProductGroupCreateRequestCatalogTypeEnumSerializer;

  const CatalogsHotelProductGroupCreateRequestCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsHotelProductGroupCreateRequestCatalogTypeEnum> get values => _$catalogsHotelProductGroupCreateRequestCatalogTypeEnumValues;
  static CatalogsHotelProductGroupCreateRequestCatalogTypeEnum valueOf(String name) => _$catalogsHotelProductGroupCreateRequestCatalogTypeEnumValueOf(name);
}

