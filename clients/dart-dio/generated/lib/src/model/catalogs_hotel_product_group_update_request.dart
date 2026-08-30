//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_hotel_product_group_filters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_product_group_update_request.g.dart';

/// Request object for updating a hotel product group.
///
/// Properties:
/// * [catalogType] 
/// * [description] 
/// * [filters] 
/// * [name] - Name of catalog product group
@BuiltValue()
abstract class CatalogsHotelProductGroupUpdateRequest implements Built<CatalogsHotelProductGroupUpdateRequest, CatalogsHotelProductGroupUpdateRequestBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum? get catalogType;
  // enum catalogTypeEnum {  HOTEL,  };

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'filters')
  CatalogsHotelProductGroupFilters? get filters;

  /// Name of catalog product group
  @BuiltValueField(wireName: r'name')
  String? get name;

  CatalogsHotelProductGroupUpdateRequest._();

  factory CatalogsHotelProductGroupUpdateRequest([void updates(CatalogsHotelProductGroupUpdateRequestBuilder b)]) = _$CatalogsHotelProductGroupUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelProductGroupUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelProductGroupUpdateRequest> get serializer => _$CatalogsHotelProductGroupUpdateRequestSerializer();
}

class _$CatalogsHotelProductGroupUpdateRequestSerializer implements PrimitiveSerializer<CatalogsHotelProductGroupUpdateRequest> {
  @override
  final Iterable<Type> types = const [CatalogsHotelProductGroupUpdateRequest, _$CatalogsHotelProductGroupUpdateRequest];

  @override
  final String wireName = r'CatalogsHotelProductGroupUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelProductGroupUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.catalogType != null) {
      yield r'catalog_type';
      yield serializers.serialize(
        object.catalogType,
        specifiedType: const FullType(CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.filters != null) {
      yield r'filters';
      yield serializers.serialize(
        object.filters,
        specifiedType: const FullType(CatalogsHotelProductGroupFilters),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelProductGroupUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelProductGroupUpdateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum),
          ) as CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum?;
          if (valueDes == null) continue;
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
            specifiedType: const FullType.nullable(CatalogsHotelProductGroupFilters),
          ) as CatalogsHotelProductGroupFilters?;
          if (valueDes == null) continue;
          result.filters.replace(valueDes);
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  CatalogsHotelProductGroupUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelProductGroupUpdateRequestBuilder();
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

class CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'HOTEL')
  static const CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum HOTEL = _$catalogsHotelProductGroupUpdateRequestCatalogTypeEnum_HOTEL;

  static Serializer<CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum> get serializer => _$catalogsHotelProductGroupUpdateRequestCatalogTypeEnumSerializer;

  const CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum> get values => _$catalogsHotelProductGroupUpdateRequestCatalogTypeEnumValues;
  static CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum valueOf(String name) => _$catalogsHotelProductGroupUpdateRequestCatalogTypeEnumValueOf(name);
}

