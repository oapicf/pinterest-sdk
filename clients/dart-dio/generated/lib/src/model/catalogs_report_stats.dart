//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_report_feed_ingestion_stats.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_report_distribution_stats.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_report_stats.g.dart';

/// Diagnostics aggregated numbers
///
/// Properties:
/// * [catalogId] - ID of the catalog entity.
/// * [code] - The event code that a diagnostics aggregated number references
/// * [codeLabel] - A human-friendly label for the event code (e.g, 'SPAM')
/// * [message] - Title message describing the diagnostic issue
/// * [occurrences] - Number of occurrences of the issue
/// * [reportType] 
/// * [severity] - An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
/// * [ineligibleForAds] - Indicates if issue makes items ineligible for ads distribution
/// * [ineligibleForOrganic] - Indicates if issue makes items ineligible for organic distribution
@BuiltValue()
abstract class CatalogsReportStats implements Built<CatalogsReportStats, CatalogsReportStatsBuilder> {
  /// One Of [CatalogsReportDistributionStats], [CatalogsReportFeedIngestionStats]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'report_type';

  static const Map<String, Type> discriminatorMapping = {
    r'DISTRIBUTION_ISSUES': CatalogsReportDistributionStats,
    r'FEED_INGESTION_ISSUES': CatalogsReportFeedIngestionStats,
  };

  CatalogsReportStats._();

  factory CatalogsReportStats([void updates(CatalogsReportStatsBuilder b)]) = _$CatalogsReportStats;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsReportStatsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsReportStats> get serializer => _$CatalogsReportStatsSerializer();
}

extension CatalogsReportStatsDiscriminatorExt on CatalogsReportStats {
    String? get discriminatorValue {
        if (this is CatalogsReportDistributionStats) {
            return r'DISTRIBUTION_ISSUES';
        }
        if (this is CatalogsReportFeedIngestionStats) {
            return r'FEED_INGESTION_ISSUES';
        }
        return null;
    }
}
extension CatalogsReportStatsBuilderDiscriminatorExt on CatalogsReportStatsBuilder {
    String? get discriminatorValue {
        if (this is CatalogsReportDistributionStatsBuilder) {
            return r'DISTRIBUTION_ISSUES';
        }
        if (this is CatalogsReportFeedIngestionStatsBuilder) {
            return r'FEED_INGESTION_ISSUES';
        }
        return null;
    }
}

class _$CatalogsReportStatsSerializer implements PrimitiveSerializer<CatalogsReportStats> {
  @override
  final Iterable<Type> types = const [CatalogsReportStats, _$CatalogsReportStats];

  @override
  final String wireName = r'CatalogsReportStats';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsReportStats object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsReportStats object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsReportStats deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsReportStatsBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsReportStats.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsReportDistributionStats, CatalogsReportFeedIngestionStats, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'DISTRIBUTION_ISSUES':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsReportDistributionStats),
        ) as CatalogsReportDistributionStats;
        oneOfType = CatalogsReportDistributionStats;
        break;
      case r'FEED_INGESTION_ISSUES':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsReportFeedIngestionStats),
        ) as CatalogsReportFeedIngestionStats;
        oneOfType = CatalogsReportFeedIngestionStats;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class CatalogsReportStatsReportTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DISTRIBUTION_ISSUES')
  static const CatalogsReportStatsReportTypeEnum DISTRIBUTION_ISSUES = _$catalogsReportStatsReportTypeEnum_DISTRIBUTION_ISSUES;

  static Serializer<CatalogsReportStatsReportTypeEnum> get serializer => _$catalogsReportStatsReportTypeEnumSerializer;

  const CatalogsReportStatsReportTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsReportStatsReportTypeEnum> get values => _$catalogsReportStatsReportTypeEnumValues;
  static CatalogsReportStatsReportTypeEnum valueOf(String name) => _$catalogsReportStatsReportTypeEnumValueOf(name);
}

class CatalogsReportStatsSeverityEnum extends EnumClass {

  /// An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
  @BuiltValueEnumConst(wireName: r'WARN')
  static const CatalogsReportStatsSeverityEnum WARN = _$catalogsReportStatsSeverityEnum_WARN;
  /// An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
  @BuiltValueEnumConst(wireName: r'ERROR')
  static const CatalogsReportStatsSeverityEnum ERROR = _$catalogsReportStatsSeverityEnum_ERROR;

  static Serializer<CatalogsReportStatsSeverityEnum> get serializer => _$catalogsReportStatsSeverityEnumSerializer;

  const CatalogsReportStatsSeverityEnum._(String name): super(name);

  static BuiltSet<CatalogsReportStatsSeverityEnum> get values => _$catalogsReportStatsSeverityEnumValues;
  static CatalogsReportStatsSeverityEnum valueOf(String name) => _$catalogsReportStatsSeverityEnumValueOf(name);
}

