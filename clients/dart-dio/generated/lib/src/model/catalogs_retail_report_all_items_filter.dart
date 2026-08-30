//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_retail_report_all_items_filter.g.dart';

/// ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
///
/// Properties:
/// * [catalogId] - Unique identifier of a catalog. If not given, oldest catalog will be used
/// * [productGroupId] - Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
/// * [reportType] 
@BuiltValue()
abstract class CatalogsRetailReportAllItemsFilter implements Built<CatalogsRetailReportAllItemsFilter, CatalogsRetailReportAllItemsFilterBuilder> {
  /// Unique identifier of a catalog. If not given, oldest catalog will be used
  @BuiltValueField(wireName: r'catalog_id')
  String? get catalogId;

  /// Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
  @BuiltValueField(wireName: r'product_group_id')
  String? get productGroupId;

  @BuiltValueField(wireName: r'report_type')
  CatalogsRetailReportAllItemsFilterReportTypeEnum get reportType;
  // enum reportTypeEnum {  ALL_ITEMS,  };

  CatalogsRetailReportAllItemsFilter._();

  factory CatalogsRetailReportAllItemsFilter([void updates(CatalogsRetailReportAllItemsFilterBuilder b)]) = _$CatalogsRetailReportAllItemsFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsRetailReportAllItemsFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsRetailReportAllItemsFilter> get serializer => _$CatalogsRetailReportAllItemsFilterSerializer();
}

class _$CatalogsRetailReportAllItemsFilterSerializer implements PrimitiveSerializer<CatalogsRetailReportAllItemsFilter> {
  @override
  final Iterable<Type> types = const [CatalogsRetailReportAllItemsFilter, _$CatalogsRetailReportAllItemsFilter];

  @override
  final String wireName = r'CatalogsRetailReportAllItemsFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsRetailReportAllItemsFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.catalogId != null) {
      yield r'catalog_id';
      yield serializers.serialize(
        object.catalogId,
        specifiedType: const FullType(String),
      );
    }
    if (object.productGroupId != null) {
      yield r'product_group_id';
      yield serializers.serialize(
        object.productGroupId,
        specifiedType: const FullType(String),
      );
    }
    yield r'report_type';
    yield serializers.serialize(
      object.reportType,
      specifiedType: const FullType(CatalogsRetailReportAllItemsFilterReportTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsRetailReportAllItemsFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsRetailReportAllItemsFilterBuilder result,
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
        case r'product_group_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.productGroupId = valueDes;
          break;
        case r'report_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsRetailReportAllItemsFilterReportTypeEnum),
          ) as CatalogsRetailReportAllItemsFilterReportTypeEnum;
          result.reportType = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsRetailReportAllItemsFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsRetailReportAllItemsFilterBuilder();
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

class CatalogsRetailReportAllItemsFilterReportTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'ALL_ITEMS')
  static const CatalogsRetailReportAllItemsFilterReportTypeEnum ALL_ITEMS = _$catalogsRetailReportAllItemsFilterReportTypeEnum_ALL_ITEMS;

  static Serializer<CatalogsRetailReportAllItemsFilterReportTypeEnum> get serializer => _$catalogsRetailReportAllItemsFilterReportTypeEnumSerializer;

  const CatalogsRetailReportAllItemsFilterReportTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsRetailReportAllItemsFilterReportTypeEnum> get values => _$catalogsRetailReportAllItemsFilterReportTypeEnumValues;
  static CatalogsRetailReportAllItemsFilterReportTypeEnum valueOf(String name) => _$catalogsRetailReportAllItemsFilterReportTypeEnumValueOf(name);
}

