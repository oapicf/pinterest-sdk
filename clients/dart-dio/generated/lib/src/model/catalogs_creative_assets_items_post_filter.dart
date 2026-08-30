//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_creative_assets_items_post_filter.g.dart';

/// CatalogsCreativeAssetsItemsPostFilter
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
/// * [catalogType] 
/// * [creativeAssetsIds] 
@BuiltValue()
abstract class CatalogsCreativeAssetsItemsPostFilter implements Built<CatalogsCreativeAssetsItemsPostFilter, CatalogsCreativeAssetsItemsPostFilterBuilder> {
  /// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  @BuiltValueField(wireName: r'catalog_id')
  String? get catalogId;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  CREATIVE_ASSETS,  };

  @BuiltValueField(wireName: r'creative_assets_ids')
  BuiltList<String> get creativeAssetsIds;

  CatalogsCreativeAssetsItemsPostFilter._();

  factory CatalogsCreativeAssetsItemsPostFilter([void updates(CatalogsCreativeAssetsItemsPostFilterBuilder b)]) = _$CatalogsCreativeAssetsItemsPostFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsItemsPostFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsItemsPostFilter> get serializer => _$CatalogsCreativeAssetsItemsPostFilterSerializer();
}

class _$CatalogsCreativeAssetsItemsPostFilterSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsItemsPostFilter> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsItemsPostFilter, _$CatalogsCreativeAssetsItemsPostFilter];

  @override
  final String wireName = r'CatalogsCreativeAssetsItemsPostFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsItemsPostFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.catalogId != null) {
      yield r'catalog_id';
      yield serializers.serialize(
        object.catalogId,
        specifiedType: const FullType(String),
      );
    }
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum),
    );
    yield r'creative_assets_ids';
    yield serializers.serialize(
      object.creativeAssetsIds,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreativeAssetsItemsPostFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreativeAssetsItemsPostFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.catalogId = valueDes;
          break;
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum),
          ) as CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'creative_assets_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.creativeAssetsIds.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsCreativeAssetsItemsPostFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsItemsPostFilterBuilder();
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

class CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum CREATIVE_ASSETS = _$catalogsCreativeAssetsItemsPostFilterCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum> get serializer => _$catalogsCreativeAssetsItemsPostFilterCatalogTypeEnumSerializer;

  const CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum> get values => _$catalogsCreativeAssetsItemsPostFilterCatalogTypeEnumValues;
  static CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum valueOf(String name) => _$catalogsCreativeAssetsItemsPostFilterCatalogTypeEnumValueOf(name);
}

