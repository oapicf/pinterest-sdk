//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_report_distribution_issue_filter.g.dart';

/// CatalogsReportDistributionIssueFilter
///
/// Properties:
/// * [catalogId] - Unique identifier of a catalog. If not given, oldest catalog will be used
/// * [reportType] 
@BuiltValue()
abstract class CatalogsReportDistributionIssueFilter implements Built<CatalogsReportDistributionIssueFilter, CatalogsReportDistributionIssueFilterBuilder> {
  /// Unique identifier of a catalog. If not given, oldest catalog will be used
  @BuiltValueField(wireName: r'catalog_id')
  String? get catalogId;

  @BuiltValueField(wireName: r'report_type')
  CatalogsReportDistributionIssueFilterReportTypeEnum get reportType;
  // enum reportTypeEnum {  DISTRIBUTION_ISSUES,  };

  CatalogsReportDistributionIssueFilter._();

  factory CatalogsReportDistributionIssueFilter([void updates(CatalogsReportDistributionIssueFilterBuilder b)]) = _$CatalogsReportDistributionIssueFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsReportDistributionIssueFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsReportDistributionIssueFilter> get serializer => _$CatalogsReportDistributionIssueFilterSerializer();
}

class _$CatalogsReportDistributionIssueFilterSerializer implements PrimitiveSerializer<CatalogsReportDistributionIssueFilter> {
  @override
  final Iterable<Type> types = const [CatalogsReportDistributionIssueFilter, _$CatalogsReportDistributionIssueFilter];

  @override
  final String wireName = r'CatalogsReportDistributionIssueFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsReportDistributionIssueFilter object, {
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
      specifiedType: const FullType(CatalogsReportDistributionIssueFilterReportTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsReportDistributionIssueFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsReportDistributionIssueFilterBuilder result,
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
        case r'report_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsReportDistributionIssueFilterReportTypeEnum),
          ) as CatalogsReportDistributionIssueFilterReportTypeEnum;
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
  CatalogsReportDistributionIssueFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsReportDistributionIssueFilterBuilder();
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

class CatalogsReportDistributionIssueFilterReportTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DISTRIBUTION_ISSUES')
  static const CatalogsReportDistributionIssueFilterReportTypeEnum DISTRIBUTION_ISSUES = _$catalogsReportDistributionIssueFilterReportTypeEnum_DISTRIBUTION_ISSUES;

  static Serializer<CatalogsReportDistributionIssueFilterReportTypeEnum> get serializer => _$catalogsReportDistributionIssueFilterReportTypeEnumSerializer;

  const CatalogsReportDistributionIssueFilterReportTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsReportDistributionIssueFilterReportTypeEnum> get values => _$catalogsReportDistributionIssueFilterReportTypeEnumValues;
  static CatalogsReportDistributionIssueFilterReportTypeEnum valueOf(String name) => _$catalogsReportDistributionIssueFilterReportTypeEnumValueOf(name);
}

