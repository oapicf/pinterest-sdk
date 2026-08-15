//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_report_feed_ingestion_stats.g.dart';

/// CatalogsReportFeedIngestionStats
///
/// Properties:
/// * [catalogId] - ID of the catalog entity.
/// * [code] - The event code that a diagnostics aggregated number references
/// * [codeLabel] - A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID')
/// * [message] - Title message describing the diagnostic issue
/// * [occurrences] - Number of occurrences of the issue
/// * [reportType] 
/// * [severity] - An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
@BuiltValue()
abstract class CatalogsReportFeedIngestionStats implements Built<CatalogsReportFeedIngestionStats, CatalogsReportFeedIngestionStatsBuilder> {
  /// ID of the catalog entity.
  @BuiltValueField(wireName: r'catalog_id')
  String? get catalogId;

  /// The event code that a diagnostics aggregated number references
  @BuiltValueField(wireName: r'code')
  int? get code;

  /// A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID')
  @BuiltValueField(wireName: r'code_label')
  String? get codeLabel;

  /// Title message describing the diagnostic issue
  @BuiltValueField(wireName: r'message')
  String? get message;

  /// Number of occurrences of the issue
  @BuiltValueField(wireName: r'occurrences')
  int? get occurrences;

  @BuiltValueField(wireName: r'report_type')
  CatalogsReportFeedIngestionStatsReportTypeEnum? get reportType;
  // enum reportTypeEnum {  FEED_INGESTION_ISSUES,  };

  /// An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
  @BuiltValueField(wireName: r'severity')
  CatalogsReportFeedIngestionStatsSeverityEnum? get severity;
  // enum severityEnum {  WARN,  ERROR,  };

  CatalogsReportFeedIngestionStats._();

  factory CatalogsReportFeedIngestionStats([void updates(CatalogsReportFeedIngestionStatsBuilder b)]) = _$CatalogsReportFeedIngestionStats;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsReportFeedIngestionStatsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsReportFeedIngestionStats> get serializer => _$CatalogsReportFeedIngestionStatsSerializer();
}

class _$CatalogsReportFeedIngestionStatsSerializer implements PrimitiveSerializer<CatalogsReportFeedIngestionStats> {
  @override
  final Iterable<Type> types = const [CatalogsReportFeedIngestionStats, _$CatalogsReportFeedIngestionStats];

  @override
  final String wireName = r'CatalogsReportFeedIngestionStats';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsReportFeedIngestionStats object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.catalogId != null) {
      yield r'catalog_id';
      yield serializers.serialize(
        object.catalogId,
        specifiedType: const FullType(String),
      );
    }
    if (object.code != null) {
      yield r'code';
      yield serializers.serialize(
        object.code,
        specifiedType: const FullType(int),
      );
    }
    if (object.codeLabel != null) {
      yield r'code_label';
      yield serializers.serialize(
        object.codeLabel,
        specifiedType: const FullType(String),
      );
    }
    if (object.message != null) {
      yield r'message';
      yield serializers.serialize(
        object.message,
        specifiedType: const FullType(String),
      );
    }
    if (object.occurrences != null) {
      yield r'occurrences';
      yield serializers.serialize(
        object.occurrences,
        specifiedType: const FullType(int),
      );
    }
    if (object.reportType != null) {
      yield r'report_type';
      yield serializers.serialize(
        object.reportType,
        specifiedType: const FullType(CatalogsReportFeedIngestionStatsReportTypeEnum),
      );
    }
    if (object.severity != null) {
      yield r'severity';
      yield serializers.serialize(
        object.severity,
        specifiedType: const FullType(CatalogsReportFeedIngestionStatsSeverityEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsReportFeedIngestionStats object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsReportFeedIngestionStatsBuilder result,
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
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.code = valueDes;
          break;
        case r'code_label':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.codeLabel = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.message = valueDes;
          break;
        case r'occurrences':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.occurrences = valueDes;
          break;
        case r'report_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsReportFeedIngestionStatsReportTypeEnum),
          ) as CatalogsReportFeedIngestionStatsReportTypeEnum;
          result.reportType = valueDes;
          break;
        case r'severity':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsReportFeedIngestionStatsSeverityEnum),
          ) as CatalogsReportFeedIngestionStatsSeverityEnum;
          result.severity = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsReportFeedIngestionStats deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsReportFeedIngestionStatsBuilder();
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

class CatalogsReportFeedIngestionStatsReportTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'FEED_INGESTION_ISSUES')
  static const CatalogsReportFeedIngestionStatsReportTypeEnum FEED_INGESTION_ISSUES = _$catalogsReportFeedIngestionStatsReportTypeEnum_FEED_INGESTION_ISSUES;

  static Serializer<CatalogsReportFeedIngestionStatsReportTypeEnum> get serializer => _$catalogsReportFeedIngestionStatsReportTypeEnumSerializer;

  const CatalogsReportFeedIngestionStatsReportTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsReportFeedIngestionStatsReportTypeEnum> get values => _$catalogsReportFeedIngestionStatsReportTypeEnumValues;
  static CatalogsReportFeedIngestionStatsReportTypeEnum valueOf(String name) => _$catalogsReportFeedIngestionStatsReportTypeEnumValueOf(name);
}

class CatalogsReportFeedIngestionStatsSeverityEnum extends EnumClass {

  /// An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
  @BuiltValueEnumConst(wireName: r'WARN')
  static const CatalogsReportFeedIngestionStatsSeverityEnum WARN = _$catalogsReportFeedIngestionStatsSeverityEnum_WARN;
  /// An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
  @BuiltValueEnumConst(wireName: r'ERROR')
  static const CatalogsReportFeedIngestionStatsSeverityEnum ERROR = _$catalogsReportFeedIngestionStatsSeverityEnum_ERROR;

  static Serializer<CatalogsReportFeedIngestionStatsSeverityEnum> get serializer => _$catalogsReportFeedIngestionStatsSeverityEnumSerializer;

  const CatalogsReportFeedIngestionStatsSeverityEnum._(String name): super(name);

  static BuiltSet<CatalogsReportFeedIngestionStatsSeverityEnum> get values => _$catalogsReportFeedIngestionStatsSeverityEnumValues;
  static CatalogsReportFeedIngestionStatsSeverityEnum valueOf(String name) => _$catalogsReportFeedIngestionStatsSeverityEnumValueOf(name);
}

