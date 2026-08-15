//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_creative_assets_items_filter.g.dart';

/// CatalogsCreativeAssetsItemsFilter
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
/// * [catalogType] 
/// * [creativeAssetsIds] 
@BuiltValue()
abstract class CatalogsCreativeAssetsItemsFilter implements Built<CatalogsCreativeAssetsItemsFilter, CatalogsCreativeAssetsItemsFilterBuilder> {
  /// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  @BuiltValueField(wireName: r'catalog_id')
  String? get catalogId;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsCreativeAssetsItemsFilterCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  CREATIVE_ASSETS,  };

  @BuiltValueField(wireName: r'creative_assets_ids')
  BuiltList<String> get creativeAssetsIds;

  CatalogsCreativeAssetsItemsFilter._();

  factory CatalogsCreativeAssetsItemsFilter([void updates(CatalogsCreativeAssetsItemsFilterBuilder b)]) = _$CatalogsCreativeAssetsItemsFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsItemsFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsItemsFilter> get serializer => _$CatalogsCreativeAssetsItemsFilterSerializer();
}

class _$CatalogsCreativeAssetsItemsFilterSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsItemsFilter> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsItemsFilter, _$CatalogsCreativeAssetsItemsFilter];

  @override
  final String wireName = r'CatalogsCreativeAssetsItemsFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsItemsFilter object, {
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
      specifiedType: const FullType(CatalogsCreativeAssetsItemsFilterCatalogTypeEnum),
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
    CatalogsCreativeAssetsItemsFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreativeAssetsItemsFilterBuilder result,
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
            specifiedType: const FullType(CatalogsCreativeAssetsItemsFilterCatalogTypeEnum),
          ) as CatalogsCreativeAssetsItemsFilterCatalogTypeEnum;
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
  CatalogsCreativeAssetsItemsFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsItemsFilterBuilder();
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

class CatalogsCreativeAssetsItemsFilterCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsCreativeAssetsItemsFilterCatalogTypeEnum CREATIVE_ASSETS = _$catalogsCreativeAssetsItemsFilterCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsCreativeAssetsItemsFilterCatalogTypeEnum> get serializer => _$catalogsCreativeAssetsItemsFilterCatalogTypeEnumSerializer;

  const CatalogsCreativeAssetsItemsFilterCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsCreativeAssetsItemsFilterCatalogTypeEnum> get values => _$catalogsCreativeAssetsItemsFilterCatalogTypeEnumValues;
  static CatalogsCreativeAssetsItemsFilterCatalogTypeEnum valueOf(String name) => _$catalogsCreativeAssetsItemsFilterCatalogTypeEnumValueOf(name);
}

