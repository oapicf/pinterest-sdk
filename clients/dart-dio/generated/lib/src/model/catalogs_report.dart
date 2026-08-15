//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_report.g.dart';

/// CatalogsReport
///
/// Properties:
/// * [reportStatus] 
/// * [size] - Size of the report in bytes
/// * [url] - URL to download the report
@BuiltValue()
abstract class CatalogsReport implements Built<CatalogsReport, CatalogsReportBuilder> {
  @BuiltValueField(wireName: r'report_status')
  CatalogsReportReportStatusEnum? get reportStatus;
  // enum reportStatusEnum {  FINISHED,  IN_PROGRESS,  };

  /// Size of the report in bytes
  @BuiltValueField(wireName: r'size')
  num? get size;

  /// URL to download the report
  @BuiltValueField(wireName: r'url')
  String? get url;

  CatalogsReport._();

  factory CatalogsReport([void updates(CatalogsReportBuilder b)]) = _$CatalogsReport;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsReportBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsReport> get serializer => _$CatalogsReportSerializer();
}

class _$CatalogsReportSerializer implements PrimitiveSerializer<CatalogsReport> {
  @override
  final Iterable<Type> types = const [CatalogsReport, _$CatalogsReport];

  @override
  final String wireName = r'CatalogsReport';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsReport object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.reportStatus != null) {
      yield r'report_status';
      yield serializers.serialize(
        object.reportStatus,
        specifiedType: const FullType(CatalogsReportReportStatusEnum),
      );
    }
    if (object.size != null) {
      yield r'size';
      yield serializers.serialize(
        object.size,
        specifiedType: const FullType.nullable(num),
      );
    }
    if (object.url != null) {
      yield r'url';
      yield serializers.serialize(
        object.url,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsReport object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsReportBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'report_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsReportReportStatusEnum),
          ) as CatalogsReportReportStatusEnum;
          result.reportStatus = valueDes;
          break;
        case r'size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.size = valueDes;
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsReport deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsReportBuilder();
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

class CatalogsReportReportStatusEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'FINISHED')
  static const CatalogsReportReportStatusEnum FINISHED = _$catalogsReportReportStatusEnum_FINISHED;
  @BuiltValueEnumConst(wireName: r'IN_PROGRESS')
  static const CatalogsReportReportStatusEnum IN_PROGRESS = _$catalogsReportReportStatusEnum_IN_PROGRESS;

  static Serializer<CatalogsReportReportStatusEnum> get serializer => _$catalogsReportReportStatusEnumSerializer;

  const CatalogsReportReportStatusEnum._(String name): super(name);

  static BuiltSet<CatalogsReportReportStatusEnum> get values => _$catalogsReportReportStatusEnumValues;
  static CatalogsReportReportStatusEnum valueOf(String name) => _$catalogsReportReportStatusEnumValueOf(name);
}

