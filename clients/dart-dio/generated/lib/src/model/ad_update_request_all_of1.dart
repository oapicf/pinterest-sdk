//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_update_request_all_of1.g.dart';

/// AdUpdateRequestAllOf1
///
/// Properties:
/// * [id] - The ID of this ad.
/// * [pinId] - Pin ID. This field may only be updated for draft ads.
@BuiltValue()
abstract class AdUpdateRequestAllOf1 implements Built<AdUpdateRequestAllOf1, AdUpdateRequestAllOf1Builder> {
  /// The ID of this ad.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// Pin ID. This field may only be updated for draft ads.
  @BuiltValueField(wireName: r'pin_id')
  String? get pinId;

  AdUpdateRequestAllOf1._();

  factory AdUpdateRequestAllOf1([void updates(AdUpdateRequestAllOf1Builder b)]) = _$AdUpdateRequestAllOf1;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdUpdateRequestAllOf1Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdUpdateRequestAllOf1> get serializer => _$AdUpdateRequestAllOf1Serializer();
}

class _$AdUpdateRequestAllOf1Serializer implements PrimitiveSerializer<AdUpdateRequestAllOf1> {
  @override
  final Iterable<Type> types = const [AdUpdateRequestAllOf1, _$AdUpdateRequestAllOf1];

  @override
  final String wireName = r'AdUpdateRequestAllOf1';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdUpdateRequestAllOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.pinId != null) {
      yield r'pin_id';
      yield serializers.serialize(
        object.pinId,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdUpdateRequestAllOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdUpdateRequestAllOf1Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'pin_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  AdUpdateRequestAllOf1 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdUpdateRequestAllOf1Builder();
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

