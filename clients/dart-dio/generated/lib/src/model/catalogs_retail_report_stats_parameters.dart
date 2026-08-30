//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_retail_report_stats_parameters_report.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_retail_report_stats_parameters.g.dart';

/// Parameters for retail report
///
/// Properties:
/// * [catalogType] 
/// * [report] 
@BuiltValue()
abstract class CatalogsRetailReportStatsParameters implements Built<CatalogsRetailReportStatsParameters, CatalogsRetailReportStatsParametersBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsRetailReportStatsParametersCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  RETAIL,  };

  @BuiltValueField(wireName: r'report')
  CatalogsRetailReportStatsParametersReport get report;

  CatalogsRetailReportStatsParameters._();

  factory CatalogsRetailReportStatsParameters([void updates(CatalogsRetailReportStatsParametersBuilder b)]) = _$CatalogsRetailReportStatsParameters;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsRetailReportStatsParametersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsRetailReportStatsParameters> get serializer => _$CatalogsRetailReportStatsParametersSerializer();
}

class _$CatalogsRetailReportStatsParametersSerializer implements PrimitiveSerializer<CatalogsRetailReportStatsParameters> {
  @override
  final Iterable<Type> types = const [CatalogsRetailReportStatsParameters, _$CatalogsRetailReportStatsParameters];

  @override
  final String wireName = r'CatalogsRetailReportStatsParameters';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsRetailReportStatsParameters object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsRetailReportStatsParametersCatalogTypeEnum),
    );
    yield r'report';
    yield serializers.serialize(
      object.report,
      specifiedType: const FullType(CatalogsRetailReportStatsParametersReport),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsRetailReportStatsParameters object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsRetailReportStatsParametersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsRetailReportStatsParametersCatalogTypeEnum),
          ) as CatalogsRetailReportStatsParametersCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'report':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsRetailReportStatsParametersReport),
          ) as CatalogsRetailReportStatsParametersReport;
          result.report.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsRetailReportStatsParameters deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsRetailReportStatsParametersBuilder();
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

class CatalogsRetailReportStatsParametersCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'RETAIL')
  static const CatalogsRetailReportStatsParametersCatalogTypeEnum RETAIL = _$catalogsRetailReportStatsParametersCatalogTypeEnum_RETAIL;

  static Serializer<CatalogsRetailReportStatsParametersCatalogTypeEnum> get serializer => _$catalogsRetailReportStatsParametersCatalogTypeEnumSerializer;

  const CatalogsRetailReportStatsParametersCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsRetailReportStatsParametersCatalogTypeEnum> get values => _$catalogsRetailReportStatsParametersCatalogTypeEnumValues;
  static CatalogsRetailReportStatsParametersCatalogTypeEnum valueOf(String name) => _$catalogsRetailReportStatsParametersCatalogTypeEnumValueOf(name);
}

