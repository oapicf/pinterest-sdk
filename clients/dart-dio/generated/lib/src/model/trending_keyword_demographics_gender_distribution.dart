//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'trending_keyword_demographics_gender_distribution.g.dart';

/// This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
///
/// Properties:
/// * [genderDistribution] 
@BuiltValue()
abstract class TrendingKeywordDemographicsGenderDistribution implements Built<TrendingKeywordDemographicsGenderDistribution, TrendingKeywordDemographicsGenderDistributionBuilder> {
  @BuiltValueField(wireName: r'gender_distribution')
  TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum? get genderDistribution;
  // enum genderDistributionEnum {  male,  female,  unspecified,  };

  TrendingKeywordDemographicsGenderDistribution._();

  factory TrendingKeywordDemographicsGenderDistribution([void updates(TrendingKeywordDemographicsGenderDistributionBuilder b)]) = _$TrendingKeywordDemographicsGenderDistribution;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TrendingKeywordDemographicsGenderDistributionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TrendingKeywordDemographicsGenderDistribution> get serializer => _$TrendingKeywordDemographicsGenderDistributionSerializer();
}

class _$TrendingKeywordDemographicsGenderDistributionSerializer implements PrimitiveSerializer<TrendingKeywordDemographicsGenderDistribution> {
  @override
  final Iterable<Type> types = const [TrendingKeywordDemographicsGenderDistribution, _$TrendingKeywordDemographicsGenderDistribution];

  @override
  final String wireName = r'TrendingKeywordDemographicsGenderDistribution';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TrendingKeywordDemographicsGenderDistribution object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.genderDistribution != null) {
      yield r'gender_distribution';
      yield serializers.serialize(
        object.genderDistribution,
        specifiedType: const FullType(TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TrendingKeywordDemographicsGenderDistribution object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TrendingKeywordDemographicsGenderDistributionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'gender_distribution':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum),
          ) as TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum;
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
  TrendingKeywordDemographicsGenderDistribution deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TrendingKeywordDemographicsGenderDistributionBuilder();
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

class TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'male')
  static const TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum male = _$trendingKeywordDemographicsGenderDistributionGenderDistributionEnum_male;
  @BuiltValueEnumConst(wireName: r'female')
  static const TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum female = _$trendingKeywordDemographicsGenderDistributionGenderDistributionEnum_female;
  @BuiltValueEnumConst(wireName: r'unspecified')
  static const TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum unspecified = _$trendingKeywordDemographicsGenderDistributionGenderDistributionEnum_unspecified;

  static Serializer<TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum> get serializer => _$trendingKeywordDemographicsGenderDistributionGenderDistributionEnumSerializer;

  const TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum._(String name): super(name);

  static BuiltSet<TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum> get values => _$trendingKeywordDemographicsGenderDistributionGenderDistributionEnumValues;
  static TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum valueOf(String name) => _$trendingKeywordDemographicsGenderDistributionGenderDistributionEnumValueOf(name);
}

