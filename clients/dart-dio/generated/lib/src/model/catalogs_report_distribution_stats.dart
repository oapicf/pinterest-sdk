//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_report_distribution_stats.g.dart';

/// CatalogsReportDistributionStats
///
/// Properties:
/// * [catalogId] - ID of the catalog entity.
/// * [code] - The event code that a diagnostics aggregated number references
/// * [codeLabel] - A human-friendly label for the event code (e.g, 'SPAM')
/// * [ineligibleForAds] - Indicates if issue makes items ineligible for ads distribution
/// * [ineligibleForOrganic] - Indicates if issue makes items ineligible for organic distribution
/// * [message] - Title message describing the diagnostic issue
/// * [occurrences] - Number of occurrences of the issue
/// * [reportType] 
@BuiltValue()
abstract class CatalogsReportDistributionStats implements Built<CatalogsReportDistributionStats, CatalogsReportDistributionStatsBuilder> {
  /// ID of the catalog entity.
  @BuiltValueField(wireName: r'catalog_id')
  String? get catalogId;

  /// The event code that a diagnostics aggregated number references
  @BuiltValueField(wireName: r'code')
  int? get code;

  /// A human-friendly label for the event code (e.g, 'SPAM')
  @BuiltValueField(wireName: r'code_label')
  String? get codeLabel;

  /// Indicates if issue makes items ineligible for ads distribution
  @BuiltValueField(wireName: r'ineligible_for_ads')
  bool? get ineligibleForAds;

  /// Indicates if issue makes items ineligible for organic distribution
  @BuiltValueField(wireName: r'ineligible_for_organic')
  bool? get ineligibleForOrganic;

  /// Title message describing the diagnostic issue
  @BuiltValueField(wireName: r'message')
  String? get message;

  /// Number of occurrences of the issue
  @BuiltValueField(wireName: r'occurrences')
  int? get occurrences;

  @BuiltValueField(wireName: r'report_type')
  CatalogsReportDistributionStatsReportTypeEnum? get reportType;
  // enum reportTypeEnum {  DISTRIBUTION_ISSUES,  };

  CatalogsReportDistributionStats._();

  factory CatalogsReportDistributionStats([void updates(CatalogsReportDistributionStatsBuilder b)]) = _$CatalogsReportDistributionStats;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsReportDistributionStatsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsReportDistributionStats> get serializer => _$CatalogsReportDistributionStatsSerializer();
}

class _$CatalogsReportDistributionStatsSerializer implements PrimitiveSerializer<CatalogsReportDistributionStats> {
  @override
  final Iterable<Type> types = const [CatalogsReportDistributionStats, _$CatalogsReportDistributionStats];

  @override
  final String wireName = r'CatalogsReportDistributionStats';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsReportDistributionStats object, {
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
    if (object.ineligibleForAds != null) {
      yield r'ineligible_for_ads';
      yield serializers.serialize(
        object.ineligibleForAds,
        specifiedType: const FullType(bool),
      );
    }
    if (object.ineligibleForOrganic != null) {
      yield r'ineligible_for_organic';
      yield serializers.serialize(
        object.ineligibleForOrganic,
        specifiedType: const FullType(bool),
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
        specifiedType: const FullType(CatalogsReportDistributionStatsReportTypeEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsReportDistributionStats object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsReportDistributionStatsBuilder result,
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
        case r'ineligible_for_ads':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.ineligibleForAds = valueDes;
          break;
        case r'ineligible_for_organic':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.ineligibleForOrganic = valueDes;
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
            specifiedType: const FullType(CatalogsReportDistributionStatsReportTypeEnum),
          ) as CatalogsReportDistributionStatsReportTypeEnum;
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
  CatalogsReportDistributionStats deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsReportDistributionStatsBuilder();
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

class CatalogsReportDistributionStatsReportTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DISTRIBUTION_ISSUES')
  static const CatalogsReportDistributionStatsReportTypeEnum DISTRIBUTION_ISSUES = _$catalogsReportDistributionStatsReportTypeEnum_DISTRIBUTION_ISSUES;

  static Serializer<CatalogsReportDistributionStatsReportTypeEnum> get serializer => _$catalogsReportDistributionStatsReportTypeEnumSerializer;

  const CatalogsReportDistributionStatsReportTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsReportDistributionStatsReportTypeEnum> get values => _$catalogsReportDistributionStatsReportTypeEnumValues;
  static CatalogsReportDistributionStatsReportTypeEnum valueOf(String name) => _$catalogsReportDistributionStatsReportTypeEnumValueOf(name);
}

