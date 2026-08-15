//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'trending_keyword_demographics_age_distribution.g.dart';

/// This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
///
/// Properties:
/// * [ageDistribution] 
@BuiltValue()
abstract class TrendingKeywordDemographicsAgeDistribution implements Built<TrendingKeywordDemographicsAgeDistribution, TrendingKeywordDemographicsAgeDistributionBuilder> {
  @BuiltValueField(wireName: r'age_distribution')
  TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum? get ageDistribution;
  // enum ageDistributionEnum {  18-24,  25-34,  35-44,  45-49,  50-54,  55-64,  65+,  };

  TrendingKeywordDemographicsAgeDistribution._();

  factory TrendingKeywordDemographicsAgeDistribution([void updates(TrendingKeywordDemographicsAgeDistributionBuilder b)]) = _$TrendingKeywordDemographicsAgeDistribution;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TrendingKeywordDemographicsAgeDistributionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TrendingKeywordDemographicsAgeDistribution> get serializer => _$TrendingKeywordDemographicsAgeDistributionSerializer();
}

class _$TrendingKeywordDemographicsAgeDistributionSerializer implements PrimitiveSerializer<TrendingKeywordDemographicsAgeDistribution> {
  @override
  final Iterable<Type> types = const [TrendingKeywordDemographicsAgeDistribution, _$TrendingKeywordDemographicsAgeDistribution];

  @override
  final String wireName = r'TrendingKeywordDemographicsAgeDistribution';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TrendingKeywordDemographicsAgeDistribution object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ageDistribution != null) {
      yield r'age_distribution';
      yield serializers.serialize(
        object.ageDistribution,
        specifiedType: const FullType(TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TrendingKeywordDemographicsAgeDistribution object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TrendingKeywordDemographicsAgeDistributionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'age_distribution':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum),
          ) as TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum;
          result.ageDistribution = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TrendingKeywordDemographicsAgeDistribution deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TrendingKeywordDemographicsAgeDistributionBuilder();
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

class TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'18-24')
  static const TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum n1824 = _$trendingKeywordDemographicsAgeDistributionAgeDistributionEnum_n1824;
  @BuiltValueEnumConst(wireName: r'25-34')
  static const TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum n2534 = _$trendingKeywordDemographicsAgeDistributionAgeDistributionEnum_n2534;
  @BuiltValueEnumConst(wireName: r'35-44')
  static const TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum n3544 = _$trendingKeywordDemographicsAgeDistributionAgeDistributionEnum_n3544;
  @BuiltValueEnumConst(wireName: r'45-49')
  static const TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum n4549 = _$trendingKeywordDemographicsAgeDistributionAgeDistributionEnum_n4549;
  @BuiltValueEnumConst(wireName: r'50-54')
  static const TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum n5054 = _$trendingKeywordDemographicsAgeDistributionAgeDistributionEnum_n5054;
  @BuiltValueEnumConst(wireName: r'55-64')
  static const TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum n5564 = _$trendingKeywordDemographicsAgeDistributionAgeDistributionEnum_n5564;
  @BuiltValueEnumConst(wireName: r'65+')
  static const TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum n65plus = _$trendingKeywordDemographicsAgeDistributionAgeDistributionEnum_n65plus;

  static Serializer<TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum> get serializer => _$trendingKeywordDemographicsAgeDistributionAgeDistributionEnumSerializer;

  const TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum._(String name): super(name);

  static BuiltSet<TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum> get values => _$trendingKeywordDemographicsAgeDistributionAgeDistributionEnumValues;
  static TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum valueOf(String name) => _$trendingKeywordDemographicsAgeDistributionAgeDistributionEnumValueOf(name);
}

