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

part 'catalogs_hotel_report_parameters_report.g.dart';

/// CatalogsHotelReportParametersReport
///
/// Properties:
/// * [feedId] - ID of the feed entity.
/// * [processingResultId] - Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
/// * [reportType] 
/// * [catalogId] - Unique identifier of a catalog. If not given, oldest catalog will be used
@BuiltValue()
abstract class CatalogsHotelReportParametersReport implements Built<CatalogsHotelReportParametersReport, CatalogsHotelReportParametersReportBuilder> {
  /// One Of [CatalogsReportDistributionIssueFilter], [CatalogsReportFeedIngestionFilter]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'report_type';

  static const Map<String, Type> discriminatorMapping = {
    r'DISTRIBUTION_ISSUES': CatalogsReportDistributionIssueFilter,
    r'FEED_INGESTION_ISSUES': CatalogsReportFeedIngestionFilter,
  };

  CatalogsHotelReportParametersReport._();

  factory CatalogsHotelReportParametersReport([void updates(CatalogsHotelReportParametersReportBuilder b)]) = _$CatalogsHotelReportParametersReport;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelReportParametersReportBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelReportParametersReport> get serializer => _$CatalogsHotelReportParametersReportSerializer();
}

extension CatalogsHotelReportParametersReportDiscriminatorExt on CatalogsHotelReportParametersReport {
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
extension CatalogsHotelReportParametersReportBuilderDiscriminatorExt on CatalogsHotelReportParametersReportBuilder {
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

class _$CatalogsHotelReportParametersReportSerializer implements PrimitiveSerializer<CatalogsHotelReportParametersReport> {
  @override
  final Iterable<Type> types = const [CatalogsHotelReportParametersReport, _$CatalogsHotelReportParametersReport];

  @override
  final String wireName = r'CatalogsHotelReportParametersReport';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelReportParametersReport object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelReportParametersReport object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsHotelReportParametersReport deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelReportParametersReportBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsHotelReportParametersReport.discriminatorFieldName) + 1;
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

class CatalogsHotelReportParametersReportReportTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DISTRIBUTION_ISSUES')
  static const CatalogsHotelReportParametersReportReportTypeEnum DISTRIBUTION_ISSUES = _$catalogsHotelReportParametersReportReportTypeEnum_DISTRIBUTION_ISSUES;

  static Serializer<CatalogsHotelReportParametersReportReportTypeEnum> get serializer => _$catalogsHotelReportParametersReportReportTypeEnumSerializer;

  const CatalogsHotelReportParametersReportReportTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsHotelReportParametersReportReportTypeEnum> get values => _$catalogsHotelReportParametersReportReportTypeEnumValues;
  static CatalogsHotelReportParametersReportReportTypeEnum valueOf(String name) => _$catalogsHotelReportParametersReportReportTypeEnumValueOf(name);
}

