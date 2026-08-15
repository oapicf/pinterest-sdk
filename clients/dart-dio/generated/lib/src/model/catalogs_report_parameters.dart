//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_retail_report_parameters.dart';
import 'package:openapi/src/model/catalogs_hotel_report_parameters.dart';
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:openapi/src/model/catalogs_hotel_report_parameters_report.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_report_parameters.g.dart';

/// Report parameters
///
/// Properties:
/// * [catalogType] 
/// * [report] 
@BuiltValue()
abstract class CatalogsReportParameters implements Built<CatalogsReportParameters, CatalogsReportParametersBuilder> {
  /// One Of [CatalogsHotelReportParameters], [CatalogsRetailReportParameters]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'HOTEL': CatalogsHotelReportParameters,
    r'RETAIL': CatalogsRetailReportParameters,
  };

  CatalogsReportParameters._();

  factory CatalogsReportParameters([void updates(CatalogsReportParametersBuilder b)]) = _$CatalogsReportParameters;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsReportParametersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsReportParameters> get serializer => _$CatalogsReportParametersSerializer();
}

extension CatalogsReportParametersDiscriminatorExt on CatalogsReportParameters {
    String? get discriminatorValue {
        if (this is CatalogsHotelReportParameters) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailReportParameters) {
            return r'RETAIL';
        }
        return null;
    }
}
extension CatalogsReportParametersBuilderDiscriminatorExt on CatalogsReportParametersBuilder {
    String? get discriminatorValue {
        if (this is CatalogsHotelReportParametersBuilder) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailReportParametersBuilder) {
            return r'RETAIL';
        }
        return null;
    }
}

class _$CatalogsReportParametersSerializer implements PrimitiveSerializer<CatalogsReportParameters> {
  @override
  final Iterable<Type> types = const [CatalogsReportParameters, _$CatalogsReportParameters];

  @override
  final String wireName = r'CatalogsReportParameters';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsReportParameters object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsReportParameters object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsReportParameters deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsReportParametersBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsReportParameters.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsHotelReportParameters, CatalogsRetailReportParameters, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'HOTEL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelReportParameters),
        ) as CatalogsHotelReportParameters;
        oneOfType = CatalogsHotelReportParameters;
        break;
      case r'RETAIL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailReportParameters),
        ) as CatalogsRetailReportParameters;
        oneOfType = CatalogsRetailReportParameters;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

