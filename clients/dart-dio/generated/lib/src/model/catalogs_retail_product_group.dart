//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_status.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_product_group_type.dart';
import 'package:openapi/src/model/catalogs_product_group_filters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_retail_product_group.g.dart';

/// CatalogsRetailProductGroup
///
/// Properties:
/// * [catalogId] - Catalog ID pertaining to the product group.
/// * [catalogType] 
/// * [country] 
/// * [createdAt] - Unix timestamp in seconds of when catalog product group was created.
/// * [description] 
/// * [feedId] - id of the catalogs feed belonging to this catalog product group
/// * [filters] 
/// * [id] - ID of the catalog product group.
/// * [isFeatured] - boolean indicator of whether the product group is being featured or not
/// * [locale] 
/// * [name] - Name of catalog product group
/// * [status] 
/// * [type] 
/// * [updatedAt] - Unix timestamp in seconds of last time catalog product group was updated.
@BuiltValue()
abstract class CatalogsRetailProductGroup implements Built<CatalogsRetailProductGroup, CatalogsRetailProductGroupBuilder> {
  /// Catalog ID pertaining to the product group.
  @BuiltValueField(wireName: r'catalog_id')
  String get catalogId;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsRetailProductGroupCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  RETAIL,  };

  @BuiltValueField(wireName: r'country')
  String? get country;

  /// Unix timestamp in seconds of when catalog product group was created.
  @BuiltValueField(wireName: r'created_at')
  int? get createdAt;

  @BuiltValueField(wireName: r'description')
  String? get description;

  /// id of the catalogs feed belonging to this catalog product group
  @BuiltValueField(wireName: r'feed_id')
  String? get feedId;

  @BuiltValueField(wireName: r'filters')
  CatalogsProductGroupFilters get filters;

  /// ID of the catalog product group.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// boolean indicator of whether the product group is being featured or not
  @Deprecated('isFeatured has been deprecated')
  @BuiltValueField(wireName: r'is_featured')
  bool? get isFeatured;

  @BuiltValueField(wireName: r'locale')
  String? get locale;

  /// Name of catalog product group
  @BuiltValueField(wireName: r'name')
  String? get name;

  @BuiltValueField(wireName: r'status')
  CatalogsProductGroupStatus? get status;
  // enum statusEnum {  ACTIVE,  INACTIVE,  };

  @BuiltValueField(wireName: r'type')
  CatalogsProductGroupType get type;
  // enum typeEnum {  MERCHANT_CREATED,  ALL_PRODUCTS,  BEST_DEALS,  PINNER_FAVORITES,  TOP_SELLERS,  BACK_IN_STOCK,  NEW_ARRIVALS,  SHOPIFY_COLLECTIONS,  I2PC,  CATALOG_EXPANSION,  };

  /// Unix timestamp in seconds of last time catalog product group was updated.
  @BuiltValueField(wireName: r'updated_at')
  int? get updatedAt;

  CatalogsRetailProductGroup._();

  factory CatalogsRetailProductGroup([void updates(CatalogsRetailProductGroupBuilder b)]) = _$CatalogsRetailProductGroup;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsRetailProductGroupBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsRetailProductGroup> get serializer => _$CatalogsRetailProductGroupSerializer();
}

class _$CatalogsRetailProductGroupSerializer implements PrimitiveSerializer<CatalogsRetailProductGroup> {
  @override
  final Iterable<Type> types = const [CatalogsRetailProductGroup, _$CatalogsRetailProductGroup];

  @override
  final String wireName = r'CatalogsRetailProductGroup';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsRetailProductGroup object, {
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
      specifiedType: const FullType(CatalogsRetailProductGroupCatalogTypeEnum),
    );
    if (object.country != null) {
      yield r'country';
      yield serializers.serialize(
        object.country,
        specifiedType: const FullType.nullable(String),
      );
    }
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
    yield r'feed_id';
    yield object.feedId == null ? null : serializers.serialize(
      object.feedId,
      specifiedType: const FullType.nullable(String),
    );
    yield r'filters';
    yield serializers.serialize(
      object.filters,
      specifiedType: const FullType(CatalogsProductGroupFilters),
    );
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.isFeatured != null) {
      yield r'is_featured';
      yield serializers.serialize(
        object.isFeatured,
        specifiedType: const FullType(bool),
      );
    }
    if (object.locale != null) {
      yield r'locale';
      yield serializers.serialize(
        object.locale,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(CatalogsProductGroupStatus),
      );
    }
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(CatalogsProductGroupType),
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
    CatalogsRetailProductGroup object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsRetailProductGroupBuilder result,
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
            specifiedType: const FullType(CatalogsRetailProductGroupCatalogTypeEnum),
          ) as CatalogsRetailProductGroupCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'country':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.country = valueDes;
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
        case r'feed_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.feedId = valueDes;
          break;
        case r'filters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupFilters),
          ) as CatalogsProductGroupFilters;
          result.filters.replace(valueDes);
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'is_featured':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isFeatured = valueDes;
          break;
        case r'locale':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.locale = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CatalogsProductGroupStatus),
          ) as CatalogsProductGroupStatus?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupType),
          ) as CatalogsProductGroupType;
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
  CatalogsRetailProductGroup deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsRetailProductGroupBuilder();
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

class CatalogsRetailProductGroupCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'RETAIL')
  static const CatalogsRetailProductGroupCatalogTypeEnum RETAIL = _$catalogsRetailProductGroupCatalogTypeEnum_RETAIL;

  static Serializer<CatalogsRetailProductGroupCatalogTypeEnum> get serializer => _$catalogsRetailProductGroupCatalogTypeEnumSerializer;

  const CatalogsRetailProductGroupCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsRetailProductGroupCatalogTypeEnum> get values => _$catalogsRetailProductGroupCatalogTypeEnumValues;
  static CatalogsRetailProductGroupCatalogTypeEnum valueOf(String name) => _$catalogsRetailProductGroupCatalogTypeEnumValueOf(name);
}

