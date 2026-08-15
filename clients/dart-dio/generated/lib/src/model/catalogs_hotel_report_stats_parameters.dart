//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_hotel_report_stats_parameters_report.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_report_stats_parameters.g.dart';

/// Parameters for hotel report
///
/// Properties:
/// * [catalogType] 
/// * [report] 
@BuiltValue()
abstract class CatalogsHotelReportStatsParameters implements Built<CatalogsHotelReportStatsParameters, CatalogsHotelReportStatsParametersBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsHotelReportStatsParametersCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  HOTEL,  };

  @BuiltValueField(wireName: r'report')
  CatalogsHotelReportStatsParametersReport get report;

  CatalogsHotelReportStatsParameters._();

  factory CatalogsHotelReportStatsParameters([void updates(CatalogsHotelReportStatsParametersBuilder b)]) = _$CatalogsHotelReportStatsParameters;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelReportStatsParametersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelReportStatsParameters> get serializer => _$CatalogsHotelReportStatsParametersSerializer();
}

class _$CatalogsHotelReportStatsParametersSerializer implements PrimitiveSerializer<CatalogsHotelReportStatsParameters> {
  @override
  final Iterable<Type> types = const [CatalogsHotelReportStatsParameters, _$CatalogsHotelReportStatsParameters];

  @override
  final String wireName = r'CatalogsHotelReportStatsParameters';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelReportStatsParameters object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsHotelReportStatsParametersCatalogTypeEnum),
    );
    yield r'report';
    yield serializers.serialize(
      object.report,
      specifiedType: const FullType(CatalogsHotelReportStatsParametersReport),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelReportStatsParameters object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelReportStatsParametersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelReportStatsParametersCatalogTypeEnum),
          ) as CatalogsHotelReportStatsParametersCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'report':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelReportStatsParametersReport),
          ) as CatalogsHotelReportStatsParametersReport;
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
  CatalogsHotelReportStatsParameters deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelReportStatsParametersBuilder();
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

class CatalogsHotelReportStatsParametersCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'HOTEL')
  static const CatalogsHotelReportStatsParametersCatalogTypeEnum HOTEL = _$catalogsHotelReportStatsParametersCatalogTypeEnum_HOTEL;

  static Serializer<CatalogsHotelReportStatsParametersCatalogTypeEnum> get serializer => _$catalogsHotelReportStatsParametersCatalogTypeEnumSerializer;

  const CatalogsHotelReportStatsParametersCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsHotelReportStatsParametersCatalogTypeEnum> get values => _$catalogsHotelReportStatsParametersCatalogTypeEnumValues;
  static CatalogsHotelReportStatsParametersCatalogTypeEnum valueOf(String name) => _$catalogsHotelReportStatsParametersCatalogTypeEnumValueOf(name);
}

