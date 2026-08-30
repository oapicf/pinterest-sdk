//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'cancel_invite_exception.g.dart';

/// An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
///
/// Properties:
/// * [inviteId] 
/// * [message] 
@BuiltValue()
abstract class CancelInviteException implements Built<CancelInviteException, CancelInviteExceptionBuilder> {
  @BuiltValueField(wireName: r'invite_id')
  String? get inviteId;

  @BuiltValueField(wireName: r'message')
  String? get message;

  CancelInviteException._();

  factory CancelInviteException([void updates(CancelInviteExceptionBuilder b)]) = _$CancelInviteException;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CancelInviteExceptionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CancelInviteException> get serializer => _$CancelInviteExceptionSerializer();
}

class _$CancelInviteExceptionSerializer implements PrimitiveSerializer<CancelInviteException> {
  @override
  final Iterable<Type> types = const [CancelInviteException, _$CancelInviteException];

  @override
  final String wireName = r'CancelInviteException';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CancelInviteException object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.inviteId != null) {
      yield r'invite_id';
      yield serializers.serialize(
        object.inviteId,
        specifiedType: const FullType(String),
      );
    }
    if (object.message != null) {
      yield r'message';
      yield serializers.serialize(
        object.message,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CancelInviteException object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CancelInviteExceptionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'invite_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.inviteId = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.message = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CancelInviteException deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CancelInviteExceptionBuilder();
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

