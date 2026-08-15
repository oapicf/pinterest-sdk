//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_hotel_report_stats_parameters_report.dart';
import 'package:openapi/src/model/catalogs_hotel_report_stats_parameters.dart';
import 'package:openapi/src/model/catalogs_retail_report_stats_parameters.dart';
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'reports_stats_parameters_parameter.g.dart';

/// Report stats parameters
///
/// Properties:
/// * [catalogType] 
/// * [report] 
@BuiltValue()
abstract class ReportsStatsParametersParameter implements Built<ReportsStatsParametersParameter, ReportsStatsParametersParameterBuilder> {
  /// One Of [CatalogsHotelReportStatsParameters], [CatalogsRetailReportStatsParameters]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'HOTEL': CatalogsHotelReportStatsParameters,
    r'RETAIL': CatalogsRetailReportStatsParameters,
  };

  ReportsStatsParametersParameter._();

  factory ReportsStatsParametersParameter([void updates(ReportsStatsParametersParameterBuilder b)]) = _$ReportsStatsParametersParameter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ReportsStatsParametersParameterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ReportsStatsParametersParameter> get serializer => _$ReportsStatsParametersParameterSerializer();
}

extension ReportsStatsParametersParameterDiscriminatorExt on ReportsStatsParametersParameter {
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
extension ReportsStatsParametersParameterBuilderDiscriminatorExt on ReportsStatsParametersParameterBuilder {
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

class _$ReportsStatsParametersParameterSerializer implements PrimitiveSerializer<ReportsStatsParametersParameter> {
  @override
  final Iterable<Type> types = const [ReportsStatsParametersParameter, _$ReportsStatsParametersParameter];

  @override
  final String wireName = r'ReportsStatsParametersParameter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ReportsStatsParametersParameter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ReportsStatsParametersParameter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  ReportsStatsParametersParameter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ReportsStatsParametersParameterBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(ReportsStatsParametersParameter.discriminatorFieldName) + 1;
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

