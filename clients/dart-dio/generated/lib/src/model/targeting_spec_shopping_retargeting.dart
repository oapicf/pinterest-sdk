//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_shopping_retargeting.g.dart';

/// TargetingSpecShoppingRetargeting
///
/// Properties:
/// * [exclusionWindow] - Number of days ago to stop lookback timeframe for dynamic retargeting
/// * [lookbackWindow] - Number of days ago to start lookback timeframe for dynamic retargeting
/// * [tagTypes] - Event types to target for dynamic retargeting
@BuiltValue()
abstract class TargetingSpecShoppingRetargeting implements Built<TargetingSpecShoppingRetargeting, TargetingSpecShoppingRetargetingBuilder> {
  /// Number of days ago to stop lookback timeframe for dynamic retargeting
  @BuiltValueField(wireName: r'exclusion_window')
  int? get exclusionWindow;

  /// Number of days ago to start lookback timeframe for dynamic retargeting
  @BuiltValueField(wireName: r'lookback_window')
  int? get lookbackWindow;

  /// Event types to target for dynamic retargeting
  @BuiltValueField(wireName: r'tag_types')
  BuiltList<int>? get tagTypes;

  TargetingSpecShoppingRetargeting._();

  factory TargetingSpecShoppingRetargeting([void updates(TargetingSpecShoppingRetargetingBuilder b)]) = _$TargetingSpecShoppingRetargeting;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingSpecShoppingRetargetingBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingSpecShoppingRetargeting> get serializer => _$TargetingSpecShoppingRetargetingSerializer();
}

class _$TargetingSpecShoppingRetargetingSerializer implements PrimitiveSerializer<TargetingSpecShoppingRetargeting> {
  @override
  final Iterable<Type> types = const [TargetingSpecShoppingRetargeting, _$TargetingSpecShoppingRetargeting];

  @override
  final String wireName = r'TargetingSpecShoppingRetargeting';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingSpecShoppingRetargeting object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.exclusionWindow != null) {
      yield r'exclusion_window';
      yield serializers.serialize(
        object.exclusionWindow,
        specifiedType: const FullType(int),
      );
    }
    if (object.lookbackWindow != null) {
      yield r'lookback_window';
      yield serializers.serialize(
        object.lookbackWindow,
        specifiedType: const FullType(int),
      );
    }
    if (object.tagTypes != null) {
      yield r'tag_types';
      yield serializers.serialize(
        object.tagTypes,
        specifiedType: const FullType(BuiltList, [FullType(int)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TargetingSpecShoppingRetargeting object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingSpecShoppingRetargetingBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'exclusion_window':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.exclusionWindow = valueDes;
          break;
        case r'lookback_window':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.lookbackWindow = valueDes;
          break;
        case r'tag_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(int)]),
          ) as BuiltList<int>?;
          if (valueDes == null) continue;
          result.tagTypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TargetingSpecShoppingRetargeting deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingSpecShoppingRetargetingBuilder();
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

