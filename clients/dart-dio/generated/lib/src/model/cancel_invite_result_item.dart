//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/cancel_invite_exception.dart';
import 'package:openapi/src/model/cancel_invite_result.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'cancel_invite_result_item.g.dart';

/// CancelInviteResultItem
///
/// Properties:
/// * [exception] 
/// * [invite] 
@BuiltValue()
abstract class CancelInviteResultItem implements Built<CancelInviteResultItem, CancelInviteResultItemBuilder> {
  @BuiltValueField(wireName: r'exception')
  CancelInviteException? get exception;

  @BuiltValueField(wireName: r'invite')
  CancelInviteResult? get invite;

  CancelInviteResultItem._();

  factory CancelInviteResultItem([void updates(CancelInviteResultItemBuilder b)]) = _$CancelInviteResultItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CancelInviteResultItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CancelInviteResultItem> get serializer => _$CancelInviteResultItemSerializer();
}

class _$CancelInviteResultItemSerializer implements PrimitiveSerializer<CancelInviteResultItem> {
  @override
  final Iterable<Type> types = const [CancelInviteResultItem, _$CancelInviteResultItem];

  @override
  final String wireName = r'CancelInviteResultItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CancelInviteResultItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.exception != null) {
      yield r'exception';
      yield serializers.serialize(
        object.exception,
        specifiedType: const FullType.nullable(CancelInviteException),
      );
    }
    if (object.invite != null) {
      yield r'invite';
      yield serializers.serialize(
        object.invite,
        specifiedType: const FullType.nullable(CancelInviteResult),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CancelInviteResultItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CancelInviteResultItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'exception':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CancelInviteException),
          ) as CancelInviteException?;
          if (valueDes == null) continue;
          result.exception.replace(valueDes);
          break;
        case r'invite':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CancelInviteResult),
          ) as CancelInviteResult?;
          if (valueDes == null) continue;
          result.invite.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CancelInviteResultItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CancelInviteResultItemBuilder();
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

