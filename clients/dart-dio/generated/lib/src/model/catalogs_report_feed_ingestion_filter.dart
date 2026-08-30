//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_report_feed_ingestion_filter.g.dart';

/// CatalogsReportFeedIngestionFilter
///
/// Properties:
/// * [feedId] - ID of the feed entity.
/// * [processingResultId] - Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
/// * [reportType] 
@BuiltValue()
abstract class CatalogsReportFeedIngestionFilter implements Built<CatalogsReportFeedIngestionFilter, CatalogsReportFeedIngestionFilterBuilder> {
  /// ID of the feed entity.
  @BuiltValueField(wireName: r'feed_id')
  String get feedId;

  /// Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
  @BuiltValueField(wireName: r'processing_result_id')
  String? get processingResultId;

  @BuiltValueField(wireName: r'report_type')
  CatalogsReportFeedIngestionFilterReportTypeEnum get reportType;
  // enum reportTypeEnum {  FEED_INGESTION_ISSUES,  };

  CatalogsReportFeedIngestionFilter._();

  factory CatalogsReportFeedIngestionFilter([void updates(CatalogsReportFeedIngestionFilterBuilder b)]) = _$CatalogsReportFeedIngestionFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsReportFeedIngestionFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsReportFeedIngestionFilter> get serializer => _$CatalogsReportFeedIngestionFilterSerializer();
}

class _$CatalogsReportFeedIngestionFilterSerializer implements PrimitiveSerializer<CatalogsReportFeedIngestionFilter> {
  @override
  final Iterable<Type> types = const [CatalogsReportFeedIngestionFilter, _$CatalogsReportFeedIngestionFilter];

  @override
  final String wireName = r'CatalogsReportFeedIngestionFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsReportFeedIngestionFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'feed_id';
    yield serializers.serialize(
      object.feedId,
      specifiedType: const FullType(String),
    );
    if (object.processingResultId != null) {
      yield r'processing_result_id';
      yield serializers.serialize(
        object.processingResultId,
        specifiedType: const FullType(String),
      );
    }
    yield r'report_type';
    yield serializers.serialize(
      object.reportType,
      specifiedType: const FullType(CatalogsReportFeedIngestionFilterReportTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsReportFeedIngestionFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsReportFeedIngestionFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'feed_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.feedId = valueDes;
          break;
        case r'processing_result_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.processingResultId = valueDes;
          break;
        case r'report_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsReportFeedIngestionFilterReportTypeEnum),
          ) as CatalogsReportFeedIngestionFilterReportTypeEnum;
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
  CatalogsReportFeedIngestionFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsReportFeedIngestionFilterBuilder();
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

class CatalogsReportFeedIngestionFilterReportTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'FEED_INGESTION_ISSUES')
  static const CatalogsReportFeedIngestionFilterReportTypeEnum FEED_INGESTION_ISSUES = _$catalogsReportFeedIngestionFilterReportTypeEnum_FEED_INGESTION_ISSUES;

  static Serializer<CatalogsReportFeedIngestionFilterReportTypeEnum> get serializer => _$catalogsReportFeedIngestionFilterReportTypeEnumSerializer;

  const CatalogsReportFeedIngestionFilterReportTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsReportFeedIngestionFilterReportTypeEnum> get values => _$catalogsReportFeedIngestionFilterReportTypeEnumValues;
  static CatalogsReportFeedIngestionFilterReportTypeEnum valueOf(String name) => _$catalogsReportFeedIngestionFilterReportTypeEnumValueOf(name);
}

