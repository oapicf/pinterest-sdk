//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_report_all_items_filter.g.dart';

/// CatalogsReportAllItemsFilter
///
/// Properties:
/// * [catalogId] - Unique identifier of a catalog. If not given, oldest catalog will be used
/// * [reportType] 
@BuiltValue()
abstract class CatalogsReportAllItemsFilter implements Built<CatalogsReportAllItemsFilter, CatalogsReportAllItemsFilterBuilder> {
  /// Unique identifier of a catalog. If not given, oldest catalog will be used
  @BuiltValueField(wireName: r'catalog_id')
  String? get catalogId;

  @BuiltValueField(wireName: r'report_type')
  CatalogsReportAllItemsFilterReportTypeEnum get reportType;
  // enum reportTypeEnum {  ALL_ITEMS,  };

  CatalogsReportAllItemsFilter._();

  factory CatalogsReportAllItemsFilter([void updates(CatalogsReportAllItemsFilterBuilder b)]) = _$CatalogsReportAllItemsFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsReportAllItemsFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsReportAllItemsFilter> get serializer => _$CatalogsReportAllItemsFilterSerializer();
}

class _$CatalogsReportAllItemsFilterSerializer implements PrimitiveSerializer<CatalogsReportAllItemsFilter> {
  @override
  final Iterable<Type> types = const [CatalogsReportAllItemsFilter, _$CatalogsReportAllItemsFilter];

  @override
  final String wireName = r'CatalogsReportAllItemsFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsReportAllItemsFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.catalogId != null) {
      yield r'catalog_id';
      yield serializers.serialize(
        object.catalogId,
        specifiedType: const FullType(String),
      );
    }
    yield r'report_type';
    yield serializers.serialize(
      object.reportType,
      specifiedType: const FullType(CatalogsReportAllItemsFilterReportTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsReportAllItemsFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsReportAllItemsFilterBuilder result,
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
        case r'report_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsReportAllItemsFilterReportTypeEnum),
          ) as CatalogsReportAllItemsFilterReportTypeEnum;
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
  CatalogsReportAllItemsFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsReportAllItemsFilterBuilder();
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

class CatalogsReportAllItemsFilterReportTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'ALL_ITEMS')
  static const CatalogsReportAllItemsFilterReportTypeEnum ALL_ITEMS = _$catalogsReportAllItemsFilterReportTypeEnum_ALL_ITEMS;

  static Serializer<CatalogsReportAllItemsFilterReportTypeEnum> get serializer => _$catalogsReportAllItemsFilterReportTypeEnumSerializer;

  const CatalogsReportAllItemsFilterReportTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsReportAllItemsFilterReportTypeEnum> get values => _$catalogsReportAllItemsFilterReportTypeEnumValues;
  static CatalogsReportAllItemsFilterReportTypeEnum valueOf(String name) => _$catalogsReportAllItemsFilterReportTypeEnumValueOf(name);
}

