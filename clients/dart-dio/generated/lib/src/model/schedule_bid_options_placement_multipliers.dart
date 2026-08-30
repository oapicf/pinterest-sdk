//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'schedule_bid_options_placement_multipliers.g.dart';

/// This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
///
/// Properties:
/// * [browse] - Browse (home-feed and related surfaces)
/// * [relatedPins] - Related-Pins placement
/// * [search] - Search placement
@BuiltValue()
abstract class ScheduleBidOptionsPlacementMultipliers implements Built<ScheduleBidOptionsPlacementMultipliers, ScheduleBidOptionsPlacementMultipliersBuilder> {
  /// Browse (home-feed and related surfaces)
  @BuiltValueField(wireName: r'browse')
  double? get browse;

  /// Related-Pins placement
  @BuiltValueField(wireName: r'related_pins')
  double? get relatedPins;

  /// Search placement
  @BuiltValueField(wireName: r'search')
  double? get search;

  ScheduleBidOptionsPlacementMultipliers._();

  factory ScheduleBidOptionsPlacementMultipliers([void updates(ScheduleBidOptionsPlacementMultipliersBuilder b)]) = _$ScheduleBidOptionsPlacementMultipliers;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ScheduleBidOptionsPlacementMultipliersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ScheduleBidOptionsPlacementMultipliers> get serializer => _$ScheduleBidOptionsPlacementMultipliersSerializer();
}

class _$ScheduleBidOptionsPlacementMultipliersSerializer implements PrimitiveSerializer<ScheduleBidOptionsPlacementMultipliers> {
  @override
  final Iterable<Type> types = const [ScheduleBidOptionsPlacementMultipliers, _$ScheduleBidOptionsPlacementMultipliers];

  @override
  final String wireName = r'ScheduleBidOptionsPlacementMultipliers';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ScheduleBidOptionsPlacementMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.browse != null) {
      yield r'browse';
      yield serializers.serialize(
        object.browse,
        specifiedType: const FullType(double),
      );
    }
    if (object.relatedPins != null) {
      yield r'related_pins';
      yield serializers.serialize(
        object.relatedPins,
        specifiedType: const FullType(double),
      );
    }
    if (object.search != null) {
      yield r'search';
      yield serializers.serialize(
        object.search,
        specifiedType: const FullType(double),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ScheduleBidOptionsPlacementMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ScheduleBidOptionsPlacementMultipliersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'browse':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.browse = valueDes;
          break;
        case r'related_pins':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.relatedPins = valueDes;
          break;
        case r'search':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.search = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ScheduleBidOptionsPlacementMultipliers deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ScheduleBidOptionsPlacementMultipliersBuilder();
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

