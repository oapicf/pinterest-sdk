//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_hotel_report_stats_parameters_report.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_hotel_report_stats_parameters.dart';
import 'package:openapi/src/model/catalogs_retail_report_stats_parameters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_report_stats_parameters.g.dart';

/// Report stats parameters
///
/// Properties:
/// * [catalogType] 
/// * [report] 
@BuiltValue()
abstract class CatalogsReportStatsParameters implements Built<CatalogsReportStatsParameters, CatalogsReportStatsParametersBuilder> {
  /// One Of [CatalogsHotelReportStatsParameters], [CatalogsRetailReportStatsParameters]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'HOTEL': CatalogsHotelReportStatsParameters,
    r'RETAIL': CatalogsRetailReportStatsParameters,
  };

  CatalogsReportStatsParameters._();

  factory CatalogsReportStatsParameters([void updates(CatalogsReportStatsParametersBuilder b)]) = _$CatalogsReportStatsParameters;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsReportStatsParametersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsReportStatsParameters> get serializer => _$CatalogsReportStatsParametersSerializer();
}

extension CatalogsReportStatsParametersDiscriminatorExt on CatalogsReportStatsParameters {
    String? get discriminatorValue {
        if (this is CatalogsHotelReportStatsParameters) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailReportStatsParameters) {
            return r'RETAIL';
        }
        return null;
    }
}
extension CatalogsReportStatsParametersBuilderDiscriminatorExt on CatalogsReportStatsParametersBuilder {
    String? get discriminatorValue {
        if (this is CatalogsHotelReportStatsParametersBuilder) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailReportStatsParametersBuilder) {
            return r'RETAIL';
        }
        return null;
    }
}

class _$CatalogsReportStatsParametersSerializer implements PrimitiveSerializer<CatalogsReportStatsParameters> {
  @override
  final Iterable<Type> types = const [CatalogsReportStatsParameters, _$CatalogsReportStatsParameters];

  @override
  final String wireName = r'CatalogsReportStatsParameters';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsReportStatsParameters object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsReportStatsParameters object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsReportStatsParameters deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsReportStatsParametersBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsReportStatsParameters.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsHotelReportStatsParameters, CatalogsRetailReportStatsParameters, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'HOTEL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelReportStatsParameters),
        ) as CatalogsHotelReportStatsParameters;
        oneOfType = CatalogsHotelReportStatsParameters;
        break;
      case r'RETAIL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailReportStatsParameters),
        ) as CatalogsRetailReportStatsParameters;
        oneOfType = CatalogsRetailReportStatsParameters;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class CatalogsReportStatsParametersCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'HOTEL')
  static const CatalogsReportStatsParametersCatalogTypeEnum HOTEL = _$catalogsReportStatsParametersCatalogTypeEnum_HOTEL;

  static Serializer<CatalogsReportStatsParametersCatalogTypeEnum> get serializer => _$catalogsReportStatsParametersCatalogTypeEnumSerializer;

  const CatalogsReportStatsParametersCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsReportStatsParametersCatalogTypeEnum> get values => _$catalogsReportStatsParametersCatalogTypeEnumValues;
  static CatalogsReportStatsParametersCatalogTypeEnum valueOf(String name) => _$catalogsReportStatsParametersCatalogTypeEnumValueOf(name);
}

