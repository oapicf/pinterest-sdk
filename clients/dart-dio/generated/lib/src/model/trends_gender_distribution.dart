//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/trends_gender.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'trends_gender_distribution.g.dart';

/// This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
///
/// Properties:
/// * [genderDistribution] 
@BuiltValue()
abstract class TrendsGenderDistribution implements Built<TrendsGenderDistribution, TrendsGenderDistributionBuilder> {
  @BuiltValueField(wireName: r'gender_distribution')
  TrendsGender? get genderDistribution;
  // enum genderDistributionEnum {  male,  female,  unspecified,  };

  TrendsGenderDistribution._();

  factory TrendsGenderDistribution([void updates(TrendsGenderDistributionBuilder b)]) = _$TrendsGenderDistribution;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TrendsGenderDistributionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TrendsGenderDistribution> get serializer => _$TrendsGenderDistributionSerializer();
}

class _$TrendsGenderDistributionSerializer implements PrimitiveSerializer<TrendsGenderDistribution> {
  @override
  final Iterable<Type> types = const [TrendsGenderDistribution, _$TrendsGenderDistribution];

  @override
  final String wireName = r'TrendsGenderDistribution';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TrendsGenderDistribution object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.genderDistribution != null) {
      yield r'gender_distribution';
      yield serializers.serialize(
        object.genderDistribution,
        specifiedType: const FullType(TrendsGender),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TrendsGenderDistribution object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TrendsGenderDistributionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'gender_distribution':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TrendsGender),
          ) as TrendsGender?;
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
  TrendsGenderDistribution deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TrendsGenderDistributionBuilder();
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

