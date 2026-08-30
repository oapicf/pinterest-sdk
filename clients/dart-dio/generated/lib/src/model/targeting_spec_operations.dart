//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/targeting_spec_operation_app_type.dart';
import 'package:openapi/src/model/targeting_spec_operation_shopping_retargeting.dart';
import 'package:openapi/src/model/targeting_spec_operation_location_exclude.dart';
import 'package:openapi/src/model/targeting_spec_operation_interest.dart';
import 'package:openapi/src/model/targeting_spec_operation_locale.dart';
import 'package:openapi/src/model/targeting_spec_operation_audience_exclude.dart';
import 'package:openapi/src/model/targeting_spec_operation_maximum_age.dart';
import 'package:openapi/src/model/targeting_spec_operation_geo.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_operation_geo_exclude.dart';
import 'package:openapi/src/model/targeting_spec_operation_gender.dart';
import 'package:openapi/src/model/targeting_spec_operation_audience_include.dart';
import 'package:openapi/src/model/targeting_spec_operation_age_bucket.dart';
import 'package:openapi/src/model/targeting_spec_shopping_retargeting.dart';
import 'package:openapi/src/model/targeting_spec_operation_location.dart';
import 'package:openapi/src/model/targeting_spec_operation_minimum_age.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'targeting_spec_operations.g.dart';

/// TargetingSpecOperations
///
/// Properties:
/// * [field] 
/// * [operation] 
/// * [values] 
/// * [value] 
@BuiltValue()
abstract class TargetingSpecOperations implements Built<TargetingSpecOperations, TargetingSpecOperationsBuilder> {
  /// One Of [TargetingSpecOperationAgeBucket], [TargetingSpecOperationAppType], [TargetingSpecOperationAudienceExclude], [TargetingSpecOperationAudienceInclude], [TargetingSpecOperationGender], [TargetingSpecOperationGeo], [TargetingSpecOperationGeoExclude], [TargetingSpecOperationInterest], [TargetingSpecOperationLocale], [TargetingSpecOperationLocation], [TargetingSpecOperationLocationExclude], [TargetingSpecOperationMaximumAge], [TargetingSpecOperationMinimumAge], [TargetingSpecOperationShoppingRetargeting]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'field';

  static const Map<String, Type> discriminatorMapping = {
    r'AGE_BUCKET': TargetingSpecOperationAgeBucket,
    r'APPTYPE': TargetingSpecOperationAppType,
    r'AUDIENCE_EXCLUDE': TargetingSpecOperationAudienceExclude,
    r'AUDIENCE_INCLUDE': TargetingSpecOperationAudienceInclude,
    r'GENDER': TargetingSpecOperationGender,
    r'GEO': TargetingSpecOperationGeo,
    r'GEO_EXCLUDE': TargetingSpecOperationGeoExclude,
    r'INTEREST': TargetingSpecOperationInterest,
    r'LOCALE': TargetingSpecOperationLocale,
    r'LOCATION': TargetingSpecOperationLocation,
    r'LOCATION_EXCLUDE': TargetingSpecOperationLocationExclude,
    r'MAXIMUM_AGE': TargetingSpecOperationMaximumAge,
    r'MINIMUM_AGE': TargetingSpecOperationMinimumAge,
    r'SHOPPING_RETARGETING': TargetingSpecOperationShoppingRetargeting,
  };

  TargetingSpecOperations._();

  factory TargetingSpecOperations([void updates(TargetingSpecOperationsBuilder b)]) = _$TargetingSpecOperations;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingSpecOperationsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingSpecOperations> get serializer => _$TargetingSpecOperationsSerializer();
}

extension TargetingSpecOperationsDiscriminatorExt on TargetingSpecOperations {
    String? get discriminatorValue {
        if (this is TargetingSpecOperationAgeBucket) {
            return r'AGE_BUCKET';
        }
        if (this is TargetingSpecOperationAppType) {
            return r'APPTYPE';
        }
        if (this is TargetingSpecOperationAudienceExclude) {
            return r'AUDIENCE_EXCLUDE';
        }
        if (this is TargetingSpecOperationAudienceInclude) {
            return r'AUDIENCE_INCLUDE';
        }
        if (this is TargetingSpecOperationGender) {
            return r'GENDER';
        }
        if (this is TargetingSpecOperationGeo) {
            return r'GEO';
        }
        if (this is TargetingSpecOperationGeoExclude) {
            return r'GEO_EXCLUDE';
        }
        if (this is TargetingSpecOperationInterest) {
            return r'INTEREST';
        }
        if (this is TargetingSpecOperationLocale) {
            return r'LOCALE';
        }
        if (this is TargetingSpecOperationLocation) {
            return r'LOCATION';
        }
        if (this is TargetingSpecOperationLocationExclude) {
            return r'LOCATION_EXCLUDE';
        }
        if (this is TargetingSpecOperationMaximumAge) {
            return r'MAXIMUM_AGE';
        }
        if (this is TargetingSpecOperationMinimumAge) {
            return r'MINIMUM_AGE';
        }
        if (this is TargetingSpecOperationShoppingRetargeting) {
            return r'SHOPPING_RETARGETING';
        }
        return null;
    }
}
extension TargetingSpecOperationsBuilderDiscriminatorExt on TargetingSpecOperationsBuilder {
    String? get discriminatorValue {
        if (this is TargetingSpecOperationAgeBucketBuilder) {
            return r'AGE_BUCKET';
        }
        if (this is TargetingSpecOperationAppTypeBuilder) {
            return r'APPTYPE';
        }
        if (this is TargetingSpecOperationAudienceExcludeBuilder) {
            return r'AUDIENCE_EXCLUDE';
        }
        if (this is TargetingSpecOperationAudienceIncludeBuilder) {
            return r'AUDIENCE_INCLUDE';
        }
        if (this is TargetingSpecOperationGenderBuilder) {
            return r'GENDER';
        }
        if (this is TargetingSpecOperationGeoBuilder) {
            return r'GEO';
        }
        if (this is TargetingSpecOperationGeoExcludeBuilder) {
            return r'GEO_EXCLUDE';
        }
        if (this is TargetingSpecOperationInterestBuilder) {
            return r'INTEREST';
        }
        if (this is TargetingSpecOperationLocaleBuilder) {
            return r'LOCALE';
        }
        if (this is TargetingSpecOperationLocationBuilder) {
            return r'LOCATION';
        }
        if (this is TargetingSpecOperationLocationExcludeBuilder) {
            return r'LOCATION_EXCLUDE';
        }
        if (this is TargetingSpecOperationMaximumAgeBuilder) {
            return r'MAXIMUM_AGE';
        }
        if (this is TargetingSpecOperationMinimumAgeBuilder) {
            return r'MINIMUM_AGE';
        }
        if (this is TargetingSpecOperationShoppingRetargetingBuilder) {
            return r'SHOPPING_RETARGETING';
        }
        return null;
    }
}

class _$TargetingSpecOperationsSerializer implements PrimitiveSerializer<TargetingSpecOperations> {
  @override
  final Iterable<Type> types = const [TargetingSpecOperations, _$TargetingSpecOperations];

  @override
  final String wireName = r'TargetingSpecOperations';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingSpecOperations object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    TargetingSpecOperations object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  TargetingSpecOperations deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingSpecOperationsBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(TargetingSpecOperations.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [TargetingSpecOperationAgeBucket, TargetingSpecOperationAppType, TargetingSpecOperationAudienceExclude, TargetingSpecOperationAudienceInclude, TargetingSpecOperationGender, TargetingSpecOperationGeo, TargetingSpecOperationGeoExclude, TargetingSpecOperationInterest, TargetingSpecOperationLocale, TargetingSpecOperationLocation, TargetingSpecOperationLocationExclude, TargetingSpecOperationMaximumAge, TargetingSpecOperationMinimumAge, TargetingSpecOperationShoppingRetargeting, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'AGE_BUCKET':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(TargetingSpecOperationAgeBucket),
        ) as TargetingSpecOperationAgeBucket;
        oneOfType = TargetingSpecOperationAgeBucket;
        break;
      case r'APPTYPE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(TargetingSpecOperationAppType),
        ) as TargetingSpecOperationAppType;
        oneOfType = TargetingSpecOperationAppType;
        break;
      case r'AUDIENCE_EXCLUDE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(TargetingSpecOperationAudienceExclude),
        ) as TargetingSpecOperationAudienceExclude;
        oneOfType = TargetingSpecOperationAudienceExclude;
        break;
      case r'AUDIENCE_INCLUDE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(TargetingSpecOperationAudienceInclude),
        ) as TargetingSpecOperationAudienceInclude;
        oneOfType = TargetingSpecOperationAudienceInclude;
        break;
      case r'GENDER':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(TargetingSpecOperationGender),
        ) as TargetingSpecOperationGender;
        oneOfType = TargetingSpecOperationGender;
        break;
      case r'GEO':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(TargetingSpecOperationGeo),
        ) as TargetingSpecOperationGeo;
        oneOfType = TargetingSpecOperationGeo;
        break;
      case r'GEO_EXCLUDE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(TargetingSpecOperationGeoExclude),
        ) as TargetingSpecOperationGeoExclude;
        oneOfType = TargetingSpecOperationGeoExclude;
        break;
      case r'INTEREST':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(TargetingSpecOperationInterest),
        ) as TargetingSpecOperationInterest;
        oneOfType = TargetingSpecOperationInterest;
        break;
      case r'LOCALE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(TargetingSpecOperationLocale),
        ) as TargetingSpecOperationLocale;
        oneOfType = TargetingSpecOperationLocale;
        break;
      case r'LOCATION':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(TargetingSpecOperationLocation),
        ) as TargetingSpecOperationLocation;
        oneOfType = TargetingSpecOperationLocation;
        break;
      case r'LOCATION_EXCLUDE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(TargetingSpecOperationLocationExclude),
        ) as TargetingSpecOperationLocationExclude;
        oneOfType = TargetingSpecOperationLocationExclude;
        break;
      case r'MAXIMUM_AGE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(TargetingSpecOperationMaximumAge),
        ) as TargetingSpecOperationMaximumAge;
        oneOfType = TargetingSpecOperationMaximumAge;
        break;
      case r'MINIMUM_AGE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(TargetingSpecOperationMinimumAge),
        ) as TargetingSpecOperationMinimumAge;
        oneOfType = TargetingSpecOperationMinimumAge;
        break;
      case r'SHOPPING_RETARGETING':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(TargetingSpecOperationShoppingRetargeting),
        ) as TargetingSpecOperationShoppingRetargeting;
        oneOfType = TargetingSpecOperationShoppingRetargeting;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class TargetingSpecOperationsFieldEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'MINIMUM_AGE')
  static const TargetingSpecOperationsFieldEnum MINIMUM_AGE = _$targetingSpecOperationsFieldEnum_MINIMUM_AGE;

  static Serializer<TargetingSpecOperationsFieldEnum> get serializer => _$targetingSpecOperationsFieldEnumSerializer;

  const TargetingSpecOperationsFieldEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationsFieldEnum> get values => _$targetingSpecOperationsFieldEnumValues;
  static TargetingSpecOperationsFieldEnum valueOf(String name) => _$targetingSpecOperationsFieldEnumValueOf(name);
}

class TargetingSpecOperationsOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'SET')
  static const TargetingSpecOperationsOperationEnum SET = _$targetingSpecOperationsOperationEnum_SET;

  static Serializer<TargetingSpecOperationsOperationEnum> get serializer => _$targetingSpecOperationsOperationEnumSerializer;

  const TargetingSpecOperationsOperationEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationsOperationEnum> get values => _$targetingSpecOperationsOperationEnumValues;
  static TargetingSpecOperationsOperationEnum valueOf(String name) => _$targetingSpecOperationsOperationEnumValueOf(name);
}

