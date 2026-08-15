//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_retail_items_post_filter.g.dart';

/// CatalogsRetailItemsPostFilter
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
/// * [catalogType] 
/// * [itemIds] 
@BuiltValue()
abstract class CatalogsRetailItemsPostFilter implements Built<CatalogsRetailItemsPostFilter, CatalogsRetailItemsPostFilterBuilder> {
  /// Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
  @BuiltValueField(wireName: r'catalog_id')
  String? get catalogId;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsRetailItemsPostFilterCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  RETAIL,  };

  @BuiltValueField(wireName: r'item_ids')
  BuiltList<String> get itemIds;

  CatalogsRetailItemsPostFilter._();

  factory CatalogsRetailItemsPostFilter([void updates(CatalogsRetailItemsPostFilterBuilder b)]) = _$CatalogsRetailItemsPostFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsRetailItemsPostFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsRetailItemsPostFilter> get serializer => _$CatalogsRetailItemsPostFilterSerializer();
}

class _$CatalogsRetailItemsPostFilterSerializer implements PrimitiveSerializer<CatalogsRetailItemsPostFilter> {
  @override
  final Iterable<Type> types = const [CatalogsRetailItemsPostFilter, _$CatalogsRetailItemsPostFilter];

  @override
  final String wireName = r'CatalogsRetailItemsPostFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsRetailItemsPostFilter object, {
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
      specifiedType: const FullType(CatalogsRetailItemsPostFilterCatalogTypeEnum),
    );
    yield r'item_ids';
    yield serializers.serialize(
      object.itemIds,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsRetailItemsPostFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsRetailItemsPostFilterBuilder result,
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
            specifiedType: const FullType(CatalogsRetailItemsPostFilterCatalogTypeEnum),
          ) as CatalogsRetailItemsPostFilterCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'item_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.itemIds.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsRetailItemsPostFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsRetailItemsPostFilterBuilder();
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

class CatalogsRetailItemsPostFilterCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'RETAIL')
  static const CatalogsRetailItemsPostFilterCatalogTypeEnum RETAIL = _$catalogsRetailItemsPostFilterCatalogTypeEnum_RETAIL;

  static Serializer<CatalogsRetailItemsPostFilterCatalogTypeEnum> get serializer => _$catalogsRetailItemsPostFilterCatalogTypeEnumSerializer;

  const CatalogsRetailItemsPostFilterCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsRetailItemsPostFilterCatalogTypeEnum> get values => _$catalogsRetailItemsPostFilterCatalogTypeEnumValues;
  static CatalogsRetailItemsPostFilterCatalogTypeEnum valueOf(String name) => _$catalogsRetailItemsPostFilterCatalogTypeEnumValueOf(name);
}

