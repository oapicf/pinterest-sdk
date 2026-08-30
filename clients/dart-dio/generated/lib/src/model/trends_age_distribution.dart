//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/trends_age_bucket.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'trends_age_distribution.g.dart';

/// This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
///
/// Properties:
/// * [ageDistribution] 
@BuiltValue()
abstract class TrendsAgeDistribution implements Built<TrendsAgeDistribution, TrendsAgeDistributionBuilder> {
  @BuiltValueField(wireName: r'age_distribution')
  TrendsAgeBucket? get ageDistribution;
  // enum ageDistributionEnum {  18-24,  25-34,  35-44,  45-49,  50-54,  55-64,  65+,  };

  TrendsAgeDistribution._();

  factory TrendsAgeDistribution([void updates(TrendsAgeDistributionBuilder b)]) = _$TrendsAgeDistribution;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TrendsAgeDistributionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TrendsAgeDistribution> get serializer => _$TrendsAgeDistributionSerializer();
}

class _$TrendsAgeDistributionSerializer implements PrimitiveSerializer<TrendsAgeDistribution> {
  @override
  final Iterable<Type> types = const [TrendsAgeDistribution, _$TrendsAgeDistribution];

  @override
  final String wireName = r'TrendsAgeDistribution';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TrendsAgeDistribution object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ageDistribution != null) {
      yield r'age_distribution';
      yield serializers.serialize(
        object.ageDistribution,
        specifiedType: const FullType(TrendsAgeBucket),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TrendsAgeDistribution object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TrendsAgeDistributionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'age_distribution':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TrendsAgeBucket),
          ) as TrendsAgeBucket?;
          if (valueDes == null) continue;
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
  TrendsAgeDistribution deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TrendsAgeDistributionBuilder();
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

