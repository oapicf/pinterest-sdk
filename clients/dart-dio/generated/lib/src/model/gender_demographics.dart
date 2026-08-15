//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'gender_demographics.g.dart';

/// Gender demographic distribution
///
/// Properties:
/// * [female] - Percentage of female users
/// * [male] - Percentage of male users
/// * [unspecified] - Percentage of users with unspecified gender
@BuiltValue()
abstract class GenderDemographics implements Built<GenderDemographics, GenderDemographicsBuilder> {
  /// Percentage of female users
  @BuiltValueField(wireName: r'female')
  num get female;

  /// Percentage of male users
  @BuiltValueField(wireName: r'male')
  num get male;

  /// Percentage of users with unspecified gender
  @BuiltValueField(wireName: r'unspecified')
  num get unspecified;

  GenderDemographics._();

  factory GenderDemographics([void updates(GenderDemographicsBuilder b)]) = _$GenderDemographics;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GenderDemographicsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GenderDemographics> get serializer => _$GenderDemographicsSerializer();
}

class _$GenderDemographicsSerializer implements PrimitiveSerializer<GenderDemographics> {
  @override
  final Iterable<Type> types = const [GenderDemographics, _$GenderDemographics];

  @override
  final String wireName = r'GenderDemographics';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GenderDemographics object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'female';
    yield serializers.serialize(
      object.female,
      specifiedType: const FullType(num),
    );
    yield r'male';
    yield serializers.serialize(
      object.male,
      specifiedType: const FullType(num),
    );
    yield r'unspecified';
    yield serializers.serialize(
      object.unspecified,
      specifiedType: const FullType(num),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    GenderDemographics object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GenderDemographicsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'female':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.female = valueDes;
          break;
        case r'male':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.male = valueDes;
          break;
        case r'unspecified':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.unspecified = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  GenderDemographics deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GenderDemographicsBuilder();
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

