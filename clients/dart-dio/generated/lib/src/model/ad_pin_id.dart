//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_pin_id.g.dart';

/// AdPinId
///
/// Properties:
/// * [pinId] - Pin ID.
@BuiltValue(instantiable: false)
abstract class AdPinId  {
  /// Pin ID.
  @BuiltValueField(wireName: r'pin_id')
  String? get pinId;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdPinId> get serializer => _$AdPinIdSerializer();
}

class _$AdPinIdSerializer implements PrimitiveSerializer<AdPinId> {
  @override
  final Iterable<Type> types = const [AdPinId];

  @override
  final String wireName = r'AdPinId';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdPinId object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pinId != null) {
      yield r'pin_id';
      yield serializers.serialize(
        object.pinId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdPinId object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  AdPinId deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($AdPinId)) as $AdPinId;
  }
}

/// a concrete implementation of [AdPinId], since [AdPinId] is not instantiable
@BuiltValue(instantiable: true)
abstract class $AdPinId implements AdPinId, Built<$AdPinId, $AdPinIdBuilder> {
  $AdPinId._();

  factory $AdPinId([void Function($AdPinIdBuilder)? updates]) = _$$AdPinId;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($AdPinIdBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$AdPinId> get serializer => _$$AdPinIdSerializer();
}

class _$$AdPinIdSerializer implements PrimitiveSerializer<$AdPinId> {
  @override
  final Iterable<Type> types = const [$AdPinId, _$$AdPinId];

  @override
  final String wireName = r'$AdPinId';

  @override
  Object serialize(
    Serializers serializers,
    $AdPinId object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(AdPinId))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdPinIdBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pin_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.pinId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  $AdPinId deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $AdPinIdBuilder();
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

