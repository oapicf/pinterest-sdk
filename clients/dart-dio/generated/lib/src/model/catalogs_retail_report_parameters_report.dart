//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_report_distribution_issue_filter.dart';
import 'package:openapi/src/model/catalogs_retail_report_all_items_filter.dart';
import 'package:openapi/src/model/catalogs_report_feed_ingestion_filter.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_retail_report_parameters_report.g.dart';

/// CatalogsRetailReportParametersReport
///
/// Properties:
/// * [feedId] - ID of the feed entity.
/// * [processingResultId] - Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
/// * [reportType] 
/// * [catalogId] - Unique identifier of a catalog. If not given, oldest catalog will be used
/// * [productGroupId] - Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
@BuiltValue()
abstract class CatalogsRetailReportParametersReport implements Built<CatalogsRetailReportParametersReport, CatalogsRetailReportParametersReportBuilder> {
  /// One Of [CatalogsReportDistributionIssueFilter], [CatalogsReportFeedIngestionFilter], [CatalogsRetailReportAllItemsFilter]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'report_type';

  static const Map<String, Type> discriminatorMapping = {
    r'ALL_ITEMS': CatalogsRetailReportAllItemsFilter,
    r'DISTRIBUTION_ISSUES': CatalogsReportDistributionIssueFilter,
    r'FEED_INGESTION_ISSUES': CatalogsReportFeedIngestionFilter,
  };

  CatalogsRetailReportParametersReport._();

  factory CatalogsRetailReportParametersReport([void updates(CatalogsRetailReportParametersReportBuilder b)]) = _$CatalogsRetailReportParametersReport;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsRetailReportParametersReportBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsRetailReportParametersReport> get serializer => _$CatalogsRetailReportParametersReportSerializer();
}

extension CatalogsRetailReportParametersReportDiscriminatorExt on CatalogsRetailReportParametersReport {
    String? get discriminatorValue {
        if (this is CatalogsRetailReportAllItemsFilter) {
            return r'ALL_ITEMS';
        }
        if (this is CatalogsReportDistributionIssueFilter) {
            return r'DISTRIBUTION_ISSUES';
        }
        if (this is CatalogsReportFeedIngestionFilter) {
            return r'FEED_INGESTION_ISSUES';
        }
        return null;
    }
}
extension CatalogsRetailReportParametersReportBuilderDiscriminatorExt on CatalogsRetailReportParametersReportBuilder {
    String? get discriminatorValue {
        if (this is CatalogsRetailReportAllItemsFilterBuilder) {
            return r'ALL_ITEMS';
        }
        if (this is CatalogsReportDistributionIssueFilterBuilder) {
            return r'DISTRIBUTION_ISSUES';
        }
        if (this is CatalogsReportFeedIngestionFilterBuilder) {
            return r'FEED_INGESTION_ISSUES';
        }
        return null;
    }
}

class _$CatalogsRetailReportParametersReportSerializer implements PrimitiveSerializer<CatalogsRetailReportParametersReport> {
  @override
  final Iterable<Type> types = const [CatalogsRetailReportParametersReport, _$CatalogsRetailReportParametersReport];

  @override
  final String wireName = r'CatalogsRetailReportParametersReport';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsRetailReportParametersReport object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsRetailReportParametersReport object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsRetailReportParametersReport deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsRetailReportParametersReportBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsRetailReportParametersReport.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsRetailReportAllItemsFilter, CatalogsReportDistributionIssueFilter, CatalogsReportFeedIngestionFilter, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'ALL_ITEMS':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailReportAllItemsFilter),
        ) as CatalogsRetailReportAllItemsFilter;
        oneOfType = CatalogsRetailReportAllItemsFilter;
        break;
      case r'DISTRIBUTION_ISSUES':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsReportDistributionIssueFilter),
        ) as CatalogsReportDistributionIssueFilter;
        oneOfType = CatalogsReportDistributionIssueFilter;
        break;
      case r'FEED_INGESTION_ISSUES':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsReportFeedIngestionFilter),
        ) as CatalogsReportFeedIngestionFilter;
        oneOfType = CatalogsReportFeedIngestionFilter;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class CatalogsRetailReportParametersReportReportTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'ALL_ITEMS')
  static const CatalogsRetailReportParametersReportReportTypeEnum ALL_ITEMS = _$catalogsRetailReportParametersReportReportTypeEnum_ALL_ITEMS;

  static Serializer<CatalogsRetailReportParametersReportReportTypeEnum> get serializer => _$catalogsRetailReportParametersReportReportTypeEnumSerializer;

  const CatalogsRetailReportParametersReportReportTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsRetailReportParametersReportReportTypeEnum> get values => _$catalogsRetailReportParametersReportReportTypeEnumValues;
  static CatalogsRetailReportParametersReportReportTypeEnum valueOf(String name) => _$catalogsRetailReportParametersReportReportTypeEnumValueOf(name);
}

