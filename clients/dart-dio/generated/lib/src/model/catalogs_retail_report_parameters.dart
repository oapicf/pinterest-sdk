//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_retail_report_parameters_report.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_retail_report_parameters.g.dart';

/// Parameters for retail report
///
/// Properties:
/// * [catalogType] 
/// * [report] 
@BuiltValue()
abstract class CatalogsRetailReportParameters implements Built<CatalogsRetailReportParameters, CatalogsRetailReportParametersBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsRetailReportParametersCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  RETAIL,  };

  @BuiltValueField(wireName: r'report')
  CatalogsRetailReportParametersReport get report;

  CatalogsRetailReportParameters._();

  factory CatalogsRetailReportParameters([void updates(CatalogsRetailReportParametersBuilder b)]) = _$CatalogsRetailReportParameters;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsRetailReportParametersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsRetailReportParameters> get serializer => _$CatalogsRetailReportParametersSerializer();
}

class _$CatalogsRetailReportParametersSerializer implements PrimitiveSerializer<CatalogsRetailReportParameters> {
  @override
  final Iterable<Type> types = const [CatalogsRetailReportParameters, _$CatalogsRetailReportParameters];

  @override
  final String wireName = r'CatalogsRetailReportParameters';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsRetailReportParameters object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsRetailReportParametersCatalogTypeEnum),
    );
    yield r'report';
    yield serializers.serialize(
      object.report,
      specifiedType: const FullType(CatalogsRetailReportParametersReport),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsRetailReportParameters object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsRetailReportParametersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsRetailReportParametersCatalogTypeEnum),
          ) as CatalogsRetailReportParametersCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'report':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsRetailReportParametersReport),
          ) as CatalogsRetailReportParametersReport;
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
  CatalogsRetailReportParameters deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsRetailReportParametersBuilder();
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

class CatalogsRetailReportParametersCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'RETAIL')
  static const CatalogsRetailReportParametersCatalogTypeEnum RETAIL = _$catalogsRetailReportParametersCatalogTypeEnum_RETAIL;

  static Serializer<CatalogsRetailReportParametersCatalogTypeEnum> get serializer => _$catalogsRetailReportParametersCatalogTypeEnumSerializer;

  const CatalogsRetailReportParametersCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsRetailReportParametersCatalogTypeEnum> get values => _$catalogsRetailReportParametersCatalogTypeEnumValues;
  static CatalogsRetailReportParametersCatalogTypeEnum valueOf(String name) => _$catalogsRetailReportParametersCatalogTypeEnumValueOf(name);
}

