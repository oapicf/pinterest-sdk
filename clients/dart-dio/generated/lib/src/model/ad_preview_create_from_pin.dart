//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_preview_create_from_pin.g.dart';

/// AdPreviewCreateFromPin
///
/// Properties:
/// * [pinId] - Pin ID.
@BuiltValue()
abstract class AdPreviewCreateFromPin implements Built<AdPreviewCreateFromPin, AdPreviewCreateFromPinBuilder> {
  /// Pin ID.
  @BuiltValueField(wireName: r'pin_id')
  String get pinId;

  AdPreviewCreateFromPin._();

  factory AdPreviewCreateFromPin([void updates(AdPreviewCreateFromPinBuilder b)]) = _$AdPreviewCreateFromPin;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdPreviewCreateFromPinBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdPreviewCreateFromPin> get serializer => _$AdPreviewCreateFromPinSerializer();
}

class _$AdPreviewCreateFromPinSerializer implements PrimitiveSerializer<AdPreviewCreateFromPin> {
  @override
  final Iterable<Type> types = const [AdPreviewCreateFromPin, _$AdPreviewCreateFromPin];

  @override
  final String wireName = r'AdPreviewCreateFromPin';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdPreviewCreateFromPin object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'pin_id';
    yield serializers.serialize(
      object.pinId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdPreviewCreateFromPin object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdPreviewCreateFromPinBuilder result,
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
  AdPreviewCreateFromPin deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdPreviewCreateFromPinBuilder();
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

