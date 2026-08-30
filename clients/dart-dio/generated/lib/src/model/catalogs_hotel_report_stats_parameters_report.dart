//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_report_distribution_issue_filter.dart';
import 'package:openapi/src/model/catalogs_report_feed_ingestion_filter.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_hotel_report_stats_parameters_report.g.dart';

/// CatalogsHotelReportStatsParametersReport
///
/// Properties:
/// * [feedId] - ID of the feed entity.
/// * [processingResultId] - Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
/// * [reportType] 
/// * [catalogId] - Unique identifier of a catalog. If not given, oldest catalog will be used
@BuiltValue()
abstract class CatalogsHotelReportStatsParametersReport implements Built<CatalogsHotelReportStatsParametersReport, CatalogsHotelReportStatsParametersReportBuilder> {
  /// One Of [CatalogsReportDistributionIssueFilter], [CatalogsReportFeedIngestionFilter]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'report_type';

  static const Map<String, Type> discriminatorMapping = {
    r'DISTRIBUTION_ISSUES': CatalogsReportDistributionIssueFilter,
    r'FEED_INGESTION_ISSUES': CatalogsReportFeedIngestionFilter,
  };

  CatalogsHotelReportStatsParametersReport._();

  factory CatalogsHotelReportStatsParametersReport([void updates(CatalogsHotelReportStatsParametersReportBuilder b)]) = _$CatalogsHotelReportStatsParametersReport;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelReportStatsParametersReportBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelReportStatsParametersReport> get serializer => _$CatalogsHotelReportStatsParametersReportSerializer();
}

extension CatalogsHotelReportStatsParametersReportDiscriminatorExt on CatalogsHotelReportStatsParametersReport {
    String? get discriminatorValue {
        if (this is CatalogsReportDistributionIssueFilter) {
            return r'DISTRIBUTION_ISSUES';
        }
        if (this is CatalogsReportFeedIngestionFilter) {
            return r'FEED_INGESTION_ISSUES';
        }
        return null;
    }
}
extension CatalogsHotelReportStatsParametersReportBuilderDiscriminatorExt on CatalogsHotelReportStatsParametersReportBuilder {
    String? get discriminatorValue {
        if (this is CatalogsReportDistributionIssueFilterBuilder) {
            return r'DISTRIBUTION_ISSUES';
        }
        if (this is CatalogsReportFeedIngestionFilterBuilder) {
            return r'FEED_INGESTION_ISSUES';
        }
        return null;
    }
}

class _$CatalogsHotelReportStatsParametersReportSerializer implements PrimitiveSerializer<CatalogsHotelReportStatsParametersReport> {
  @override
  final Iterable<Type> types = const [CatalogsHotelReportStatsParametersReport, _$CatalogsHotelReportStatsParametersReport];

  @override
  final String wireName = r'CatalogsHotelReportStatsParametersReport';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelReportStatsParametersReport object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelReportStatsParametersReport object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsHotelReportStatsParametersReport deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelReportStatsParametersReportBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsHotelReportStatsParametersReport.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsReportDistributionIssueFilter, CatalogsReportFeedIngestionFilter, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
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

class CatalogsHotelReportStatsParametersReportReportTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DISTRIBUTION_ISSUES')
  static const CatalogsHotelReportStatsParametersReportReportTypeEnum DISTRIBUTION_ISSUES = _$catalogsHotelReportStatsParametersReportReportTypeEnum_DISTRIBUTION_ISSUES;

  static Serializer<CatalogsHotelReportStatsParametersReportReportTypeEnum> get serializer => _$catalogsHotelReportStatsParametersReportReportTypeEnumSerializer;

  const CatalogsHotelReportStatsParametersReportReportTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsHotelReportStatsParametersReportReportTypeEnum> get values => _$catalogsHotelReportStatsParametersReportReportTypeEnumValues;
  static CatalogsHotelReportStatsParametersReportReportTypeEnum valueOf(String name) => _$catalogsHotelReportStatsParametersReportReportTypeEnumValueOf(name);
}

