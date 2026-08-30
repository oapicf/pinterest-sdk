//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_hotel_product_group_filters.dart';
import 'package:openapi/src/model/catalogs_hotel_product_group_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_product_group.g.dart';

/// CatalogsHotelProductGroup
///
/// Properties:
/// * [catalogId] - Catalog ID pertaining to the product group.
/// * [catalogType] 
/// * [createdAt] - Unix timestamp in seconds of when catalog product group was created.
/// * [description] 
/// * [filters] 
/// * [id] - ID of the catalog product group.
/// * [name] - Name of catalog product group
/// * [type] 
/// * [updatedAt] - Unix timestamp in seconds of last time catalog product group was updated.
@BuiltValue()
abstract class CatalogsHotelProductGroup implements Built<CatalogsHotelProductGroup, CatalogsHotelProductGroupBuilder> {
  /// Catalog ID pertaining to the product group.
  @BuiltValueField(wireName: r'catalog_id')
  String get catalogId;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsHotelProductGroupCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  HOTEL,  };

  /// Unix timestamp in seconds of when catalog product group was created.
  @BuiltValueField(wireName: r'created_at')
  int? get createdAt;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'filters')
  CatalogsHotelProductGroupFilters get filters;

  /// ID of the catalog product group.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// Name of catalog product group
  @BuiltValueField(wireName: r'name')
  String? get name;

  @BuiltValueField(wireName: r'type')
  CatalogsHotelProductGroupType get type;
  // enum typeEnum {  MERCHANT_CREATED,  ALL_LISTINGS,  };

  /// Unix timestamp in seconds of last time catalog product group was updated.
  @BuiltValueField(wireName: r'updated_at')
  int? get updatedAt;

  CatalogsHotelProductGroup._();

  factory CatalogsHotelProductGroup([void updates(CatalogsHotelProductGroupBuilder b)]) = _$CatalogsHotelProductGroup;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelProductGroupBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelProductGroup> get serializer => _$CatalogsHotelProductGroupSerializer();
}

class _$CatalogsHotelProductGroupSerializer implements PrimitiveSerializer<CatalogsHotelProductGroup> {
  @override
  final Iterable<Type> types = const [CatalogsHotelProductGroup, _$CatalogsHotelProductGroup];

  @override
  final String wireName = r'CatalogsHotelProductGroup';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelProductGroup object, {
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
      specifiedType: const FullType(CatalogsHotelProductGroupCatalogTypeEnum),
    );
    if (object.createdAt != null) {
      yield r'created_at';
      yield serializers.serialize(
        object.createdAt,
        specifiedType: const FullType(int),
      );
    }
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
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(CatalogsHotelProductGroupType),
    );
    if (object.updatedAt != null) {
      yield r'updated_at';
      yield serializers.serialize(
        object.updatedAt,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelProductGroup object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelProductGroupBuilder result,
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
            specifiedType: const FullType(CatalogsHotelProductGroupCatalogTypeEnum),
          ) as CatalogsHotelProductGroupCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.createdAt = valueDes;
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
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelProductGroupType),
          ) as CatalogsHotelProductGroupType;
          result.type = valueDes;
          break;
        case r'updated_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.updatedAt = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsHotelProductGroup deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelProductGroupBuilder();
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

class CatalogsHotelProductGroupCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'HOTEL')
  static const CatalogsHotelProductGroupCatalogTypeEnum HOTEL = _$catalogsHotelProductGroupCatalogTypeEnum_HOTEL;

  static Serializer<CatalogsHotelProductGroupCatalogTypeEnum> get serializer => _$catalogsHotelProductGroupCatalogTypeEnumSerializer;

  const CatalogsHotelProductGroupCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsHotelProductGroupCatalogTypeEnum> get values => _$catalogsHotelProductGroupCatalogTypeEnumValues;
  static CatalogsHotelProductGroupCatalogTypeEnum valueOf(String name) => _$catalogsHotelProductGroupCatalogTypeEnumValueOf(name);
}

