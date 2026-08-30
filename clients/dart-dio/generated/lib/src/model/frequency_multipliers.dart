//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'frequency_multipliers.g.dart';

/// This represents a mapping from impression count to a bid price adjustment for frequency-based bidding.  Keys are impression counts (0-10) representing how many times a user has seen the ad. Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price. A value of 0 will stop distribution for this impression count. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
///
/// Properties:
/// * [IMPRESSION_COUNT] - Impression count identifier.
@BuiltValue()
abstract class FrequencyMultipliers implements Built<FrequencyMultipliers, FrequencyMultipliersBuilder> {
  /// Impression count identifier.
  @BuiltValueField(wireName: r'IMPRESSION_COUNT')
  String? get IMPRESSION_COUNT;

  FrequencyMultipliers._();

  factory FrequencyMultipliers([void updates(FrequencyMultipliersBuilder b)]) = _$FrequencyMultipliers;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FrequencyMultipliersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FrequencyMultipliers> get serializer => _$FrequencyMultipliersSerializer();
}

class _$FrequencyMultipliersSerializer implements PrimitiveSerializer<FrequencyMultipliers> {
  @override
  final Iterable<Type> types = const [FrequencyMultipliers, _$FrequencyMultipliers];

  @override
  final String wireName = r'FrequencyMultipliers';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FrequencyMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.IMPRESSION_COUNT != null) {
      yield r'IMPRESSION_COUNT';
      yield serializers.serialize(
        object.IMPRESSION_COUNT,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    FrequencyMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FrequencyMultipliersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'IMPRESSION_COUNT':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.IMPRESSION_COUNT = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  FrequencyMultipliers deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FrequencyMultipliersBuilder();
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

