//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product_group_filters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_creative_assets_product_group_create_request.g.dart';

/// Request object for creating a creative assets product group.
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to the creative assets product group.
/// * [catalogType] 
/// * [description] 
/// * [filters] 
/// * [name] 
@BuiltValue()
abstract class CatalogsCreativeAssetsProductGroupCreateRequest implements Built<CatalogsCreativeAssetsProductGroupCreateRequest, CatalogsCreativeAssetsProductGroupCreateRequestBuilder> {
  /// Catalog id pertaining to the creative assets product group.
  @BuiltValueField(wireName: r'catalog_id')
  String get catalogId;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  CREATIVE_ASSETS,  };

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'filters')
  CatalogsCreativeAssetsProductGroupFilters get filters;

  @BuiltValueField(wireName: r'name')
  String get name;

  CatalogsCreativeAssetsProductGroupCreateRequest._();

  factory CatalogsCreativeAssetsProductGroupCreateRequest([void updates(CatalogsCreativeAssetsProductGroupCreateRequestBuilder b)]) = _$CatalogsCreativeAssetsProductGroupCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsProductGroupCreateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsProductGroupCreateRequest> get serializer => _$CatalogsCreativeAssetsProductGroupCreateRequestSerializer();
}

class _$CatalogsCreativeAssetsProductGroupCreateRequestSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsProductGroupCreateRequest> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsProductGroupCreateRequest, _$CatalogsCreativeAssetsProductGroupCreateRequest];

  @override
  final String wireName = r'CatalogsCreativeAssetsProductGroupCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsProductGroupCreateRequest object, {
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
      specifiedType: const FullType(CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum),
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
      specifiedType: const FullType(CatalogsCreativeAssetsProductGroupFilters),
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
    CatalogsCreativeAssetsProductGroupCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreativeAssetsProductGroupCreateRequestBuilder result,
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
            specifiedType: const FullType(CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum),
          ) as CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum;
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
            specifiedType: const FullType(CatalogsCreativeAssetsProductGroupFilters),
          ) as CatalogsCreativeAssetsProductGroupFilters;
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
  CatalogsCreativeAssetsProductGroupCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsProductGroupCreateRequestBuilder();
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

class CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum CREATIVE_ASSETS = _$catalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum> get serializer => _$catalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnumSerializer;

  const CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum> get values => _$catalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnumValues;
  static CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum valueOf(String name) => _$catalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnumValueOf(name);
}

