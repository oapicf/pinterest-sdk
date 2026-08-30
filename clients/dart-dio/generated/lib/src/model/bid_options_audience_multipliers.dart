//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bid_options_audience_multipliers.g.dart';

/// This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
///
/// Properties:
/// * [audienceId] 
/// * [multiplier] 
@BuiltValue()
abstract class BidOptionsAudienceMultipliers implements Built<BidOptionsAudienceMultipliers, BidOptionsAudienceMultipliersBuilder> {
  @BuiltValueField(wireName: r'audience_id')
  String get audienceId;

  @BuiltValueField(wireName: r'multiplier')
  num get multiplier;

  BidOptionsAudienceMultipliers._();

  factory BidOptionsAudienceMultipliers([void updates(BidOptionsAudienceMultipliersBuilder b)]) = _$BidOptionsAudienceMultipliers;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BidOptionsAudienceMultipliersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BidOptionsAudienceMultipliers> get serializer => _$BidOptionsAudienceMultipliersSerializer();
}

class _$BidOptionsAudienceMultipliersSerializer implements PrimitiveSerializer<BidOptionsAudienceMultipliers> {
  @override
  final Iterable<Type> types = const [BidOptionsAudienceMultipliers, _$BidOptionsAudienceMultipliers];

  @override
  final String wireName = r'BidOptionsAudienceMultipliers';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BidOptionsAudienceMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'audience_id';
    yield serializers.serialize(
      object.audienceId,
      specifiedType: const FullType(String),
    );
    yield r'multiplier';
    yield serializers.serialize(
      object.multiplier,
      specifiedType: const FullType(num),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BidOptionsAudienceMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BidOptionsAudienceMultipliersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'audience_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.audienceId = valueDes;
          break;
        case r'multiplier':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.multiplier = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BidOptionsAudienceMultipliers deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BidOptionsAudienceMultipliersBuilder();
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

