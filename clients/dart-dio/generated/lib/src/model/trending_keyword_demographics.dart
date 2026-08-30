//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/trends_gender_distribution.dart';
import 'package:openapi/src/model/trends_age_distribution.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'trending_keyword_demographics.g.dart';

/// A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. For each dimension: Key: The category (e.g., \"female\", \"18-24\"). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when `include_demographics` query parameter is set to `true`.
///
/// Properties:
/// * [ageDistribution] 
/// * [genderDistribution] 
@BuiltValue()
abstract class TrendingKeywordDemographics implements Built<TrendingKeywordDemographics, TrendingKeywordDemographicsBuilder> {
  @BuiltValueField(wireName: r'age_distribution')
  TrendsAgeDistribution? get ageDistribution;

  @BuiltValueField(wireName: r'gender_distribution')
  TrendsGenderDistribution? get genderDistribution;

  TrendingKeywordDemographics._();

  factory TrendingKeywordDemographics([void updates(TrendingKeywordDemographicsBuilder b)]) = _$TrendingKeywordDemographics;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TrendingKeywordDemographicsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TrendingKeywordDemographics> get serializer => _$TrendingKeywordDemographicsSerializer();
}

class _$TrendingKeywordDemographicsSerializer implements PrimitiveSerializer<TrendingKeywordDemographics> {
  @override
  final Iterable<Type> types = const [TrendingKeywordDemographics, _$TrendingKeywordDemographics];

  @override
  final String wireName = r'TrendingKeywordDemographics';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TrendingKeywordDemographics object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ageDistribution != null) {
      yield r'age_distribution';
      yield serializers.serialize(
        object.ageDistribution,
        specifiedType: const FullType.nullable(TrendsAgeDistribution),
      );
    }
    if (object.genderDistribution != null) {
      yield r'gender_distribution';
      yield serializers.serialize(
        object.genderDistribution,
        specifiedType: const FullType.nullable(TrendsGenderDistribution),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TrendingKeywordDemographics object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TrendingKeywordDemographicsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'age_distribution':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TrendsAgeDistribution),
          ) as TrendsAgeDistribution?;
          if (valueDes == null) continue;
          result.ageDistribution = valueDes;
          break;
        case r'gender_distribution':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TrendsGenderDistribution),
          ) as TrendsGenderDistribution?;
          if (valueDes == null) continue;
          result.genderDistribution = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TrendingKeywordDemographics deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TrendingKeywordDemographicsBuilder();
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

