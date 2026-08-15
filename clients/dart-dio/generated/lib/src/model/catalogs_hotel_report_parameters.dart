//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_hotel_report_parameters_report.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_report_parameters.g.dart';

/// Parameters for hotel report
///
/// Properties:
/// * [catalogType] 
/// * [report] 
@BuiltValue()
abstract class CatalogsHotelReportParameters implements Built<CatalogsHotelReportParameters, CatalogsHotelReportParametersBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsHotelReportParametersCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  HOTEL,  };

  @BuiltValueField(wireName: r'report')
  CatalogsHotelReportParametersReport get report;

  CatalogsHotelReportParameters._();

  factory CatalogsHotelReportParameters([void updates(CatalogsHotelReportParametersBuilder b)]) = _$CatalogsHotelReportParameters;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelReportParametersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelReportParameters> get serializer => _$CatalogsHotelReportParametersSerializer();
}

class _$CatalogsHotelReportParametersSerializer implements PrimitiveSerializer<CatalogsHotelReportParameters> {
  @override
  final Iterable<Type> types = const [CatalogsHotelReportParameters, _$CatalogsHotelReportParameters];

  @override
  final String wireName = r'CatalogsHotelReportParameters';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelReportParameters object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsHotelReportParametersCatalogTypeEnum),
    );
    yield r'report';
    yield serializers.serialize(
      object.report,
      specifiedType: const FullType(CatalogsHotelReportParametersReport),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelReportParameters object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelReportParametersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelReportParametersCatalogTypeEnum),
          ) as CatalogsHotelReportParametersCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'report':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelReportParametersReport),
          ) as CatalogsHotelReportParametersReport;
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
  CatalogsHotelReportParameters deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelReportParametersBuilder();
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

class CatalogsHotelReportParametersCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'HOTEL')
  static const CatalogsHotelReportParametersCatalogTypeEnum HOTEL = _$catalogsHotelReportParametersCatalogTypeEnum_HOTEL;

  static Serializer<CatalogsHotelReportParametersCatalogTypeEnum> get serializer => _$catalogsHotelReportParametersCatalogTypeEnumSerializer;

  const CatalogsHotelReportParametersCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsHotelReportParametersCatalogTypeEnum> get values => _$catalogsHotelReportParametersCatalogTypeEnumValues;
  static CatalogsHotelReportParametersCatalogTypeEnum valueOf(String name) => _$catalogsHotelReportParametersCatalogTypeEnumValueOf(name);
}

