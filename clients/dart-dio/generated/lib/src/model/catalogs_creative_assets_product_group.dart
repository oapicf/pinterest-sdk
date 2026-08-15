//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product_group_filters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_creative_assets_product_group.g.dart';

/// CatalogsCreativeAssetsProductGroup
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to the creative assets product group.
/// * [catalogType] 
/// * [createdAt] - Unix timestamp in seconds of when catalog product group was created.
/// * [description] 
/// * [filters] 
/// * [id] - ID of the creative assets product group.
/// * [name] - Name of creative assets product group
/// * [updatedAt] - Unix timestamp in seconds of last time catalog product group was updated.
@BuiltValue()
abstract class CatalogsCreativeAssetsProductGroup implements Built<CatalogsCreativeAssetsProductGroup, CatalogsCreativeAssetsProductGroupBuilder> {
  /// Catalog id pertaining to the creative assets product group.
  @BuiltValueField(wireName: r'catalog_id')
  String get catalogId;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsCreativeAssetsProductGroupCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  CREATIVE_ASSETS,  };

  /// Unix timestamp in seconds of when catalog product group was created.
  @BuiltValueField(wireName: r'created_at')
  int? get createdAt;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'filters')
  CatalogsCreativeAssetsProductGroupFilters get filters;

  /// ID of the creative assets product group.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// Name of creative assets product group
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// Unix timestamp in seconds of last time catalog product group was updated.
  @BuiltValueField(wireName: r'updated_at')
  int? get updatedAt;

  CatalogsCreativeAssetsProductGroup._();

  factory CatalogsCreativeAssetsProductGroup([void updates(CatalogsCreativeAssetsProductGroupBuilder b)]) = _$CatalogsCreativeAssetsProductGroup;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsProductGroupBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsProductGroup> get serializer => _$CatalogsCreativeAssetsProductGroupSerializer();
}

class _$CatalogsCreativeAssetsProductGroupSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsProductGroup> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsProductGroup, _$CatalogsCreativeAssetsProductGroup];

  @override
  final String wireName = r'CatalogsCreativeAssetsProductGroup';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsProductGroup object, {
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
      specifiedType: const FullType(CatalogsCreativeAssetsProductGroupCatalogTypeEnum),
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
      specifiedType: const FullType(CatalogsCreativeAssetsProductGroupFilters),
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
    CatalogsCreativeAssetsProductGroup object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreativeAssetsProductGroupBuilder result,
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
            specifiedType: const FullType(CatalogsCreativeAssetsProductGroupCatalogTypeEnum),
          ) as CatalogsCreativeAssetsProductGroupCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
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
            specifiedType: const FullType(CatalogsCreativeAssetsProductGroupFilters),
          ) as CatalogsCreativeAssetsProductGroupFilters;
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
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'updated_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
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
  CatalogsCreativeAssetsProductGroup deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsProductGroupBuilder();
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

class CatalogsCreativeAssetsProductGroupCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsCreativeAssetsProductGroupCatalogTypeEnum CREATIVE_ASSETS = _$catalogsCreativeAssetsProductGroupCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsCreativeAssetsProductGroupCatalogTypeEnum> get serializer => _$catalogsCreativeAssetsProductGroupCatalogTypeEnumSerializer;

  const CatalogsCreativeAssetsProductGroupCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsCreativeAssetsProductGroupCatalogTypeEnum> get values => _$catalogsCreativeAssetsProductGroupCatalogTypeEnumValues;
  static CatalogsCreativeAssetsProductGroupCatalogTypeEnum valueOf(String name) => _$catalogsCreativeAssetsProductGroupCatalogTypeEnumValueOf(name);
}

