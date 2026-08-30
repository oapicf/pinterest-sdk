//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bid_options_gender_multipliers.g.dart';

/// This represents a mapping from gender targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment.  All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
///
/// Properties:
/// * [female] 
/// * [male] 
@BuiltValue()
abstract class BidOptionsGenderMultipliers implements Built<BidOptionsGenderMultipliers, BidOptionsGenderMultipliersBuilder> {
  @BuiltValueField(wireName: r'female')
  num? get female;

  @BuiltValueField(wireName: r'male')
  num? get male;

  BidOptionsGenderMultipliers._();

  factory BidOptionsGenderMultipliers([void updates(BidOptionsGenderMultipliersBuilder b)]) = _$BidOptionsGenderMultipliers;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BidOptionsGenderMultipliersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BidOptionsGenderMultipliers> get serializer => _$BidOptionsGenderMultipliersSerializer();
}

class _$BidOptionsGenderMultipliersSerializer implements PrimitiveSerializer<BidOptionsGenderMultipliers> {
  @override
  final Iterable<Type> types = const [BidOptionsGenderMultipliers, _$BidOptionsGenderMultipliers];

  @override
  final String wireName = r'BidOptionsGenderMultipliers';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BidOptionsGenderMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.female != null) {
      yield r'female';
      yield serializers.serialize(
        object.female,
        specifiedType: const FullType(num),
      );
    }
    if (object.male != null) {
      yield r'male';
      yield serializers.serialize(
        object.male,
        specifiedType: const FullType(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BidOptionsGenderMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BidOptionsGenderMultipliersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'female':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.female = valueDes;
          break;
        case r'male':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.male = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BidOptionsGenderMultipliers deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BidOptionsGenderMultipliersBuilder();
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

