//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_retail_items_filter.g.dart';

/// CatalogsRetailItemsFilter
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
/// * [catalogType] 
/// * [itemIds] 
@BuiltValue()
abstract class CatalogsRetailItemsFilter implements Built<CatalogsRetailItemsFilter, CatalogsRetailItemsFilterBuilder> {
  /// Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
  @BuiltValueField(wireName: r'catalog_id')
  String? get catalogId;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsRetailItemsFilterCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  RETAIL,  };

  @BuiltValueField(wireName: r'item_ids')
  BuiltList<String> get itemIds;

  CatalogsRetailItemsFilter._();

  factory CatalogsRetailItemsFilter([void updates(CatalogsRetailItemsFilterBuilder b)]) = _$CatalogsRetailItemsFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsRetailItemsFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsRetailItemsFilter> get serializer => _$CatalogsRetailItemsFilterSerializer();
}

class _$CatalogsRetailItemsFilterSerializer implements PrimitiveSerializer<CatalogsRetailItemsFilter> {
  @override
  final Iterable<Type> types = const [CatalogsRetailItemsFilter, _$CatalogsRetailItemsFilter];

  @override
  final String wireName = r'CatalogsRetailItemsFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsRetailItemsFilter object, {
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
      specifiedType: const FullType(CatalogsRetailItemsFilterCatalogTypeEnum),
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
    CatalogsRetailItemsFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsRetailItemsFilterBuilder result,
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
            specifiedType: const FullType(CatalogsRetailItemsFilterCatalogTypeEnum),
          ) as CatalogsRetailItemsFilterCatalogTypeEnum;
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
  CatalogsRetailItemsFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsRetailItemsFilterBuilder();
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

class CatalogsRetailItemsFilterCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'RETAIL')
  static const CatalogsRetailItemsFilterCatalogTypeEnum RETAIL = _$catalogsRetailItemsFilterCatalogTypeEnum_RETAIL;

  static Serializer<CatalogsRetailItemsFilterCatalogTypeEnum> get serializer => _$catalogsRetailItemsFilterCatalogTypeEnumSerializer;

  const CatalogsRetailItemsFilterCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsRetailItemsFilterCatalogTypeEnum> get values => _$catalogsRetailItemsFilterCatalogTypeEnumValues;
  static CatalogsRetailItemsFilterCatalogTypeEnum valueOf(String name) => _$catalogsRetailItemsFilterCatalogTypeEnumValueOf(name);
}

