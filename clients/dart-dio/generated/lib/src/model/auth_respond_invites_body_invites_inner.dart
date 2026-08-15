//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/auth_respond_invites_body_invites_inner_action.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'auth_respond_invites_body_invites_inner.g.dart';

/// AuthRespondInvitesBodyInvitesInner
///
/// Properties:
/// * [action] 
/// * [inviteId] - Unique identifier of an invite.
@BuiltValue()
abstract class AuthRespondInvitesBodyInvitesInner implements Built<AuthRespondInvitesBodyInvitesInner, AuthRespondInvitesBodyInvitesInnerBuilder> {
  @BuiltValueField(wireName: r'action')
  AuthRespondInvitesBodyInvitesInnerAction get action;

  /// Unique identifier of an invite.
  @BuiltValueField(wireName: r'invite_id')
  String get inviteId;

  AuthRespondInvitesBodyInvitesInner._();

  factory AuthRespondInvitesBodyInvitesInner([void updates(AuthRespondInvitesBodyInvitesInnerBuilder b)]) = _$AuthRespondInvitesBodyInvitesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuthRespondInvitesBodyInvitesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuthRespondInvitesBodyInvitesInner> get serializer => _$AuthRespondInvitesBodyInvitesInnerSerializer();
}

class _$AuthRespondInvitesBodyInvitesInnerSerializer implements PrimitiveSerializer<AuthRespondInvitesBodyInvitesInner> {
  @override
  final Iterable<Type> types = const [AuthRespondInvitesBodyInvitesInner, _$AuthRespondInvitesBodyInvitesInner];

  @override
  final String wireName = r'AuthRespondInvitesBodyInvitesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuthRespondInvitesBodyInvitesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'action';
    yield serializers.serialize(
      object.action,
      specifiedType: const FullType(AuthRespondInvitesBodyInvitesInnerAction),
    );
    yield r'invite_id';
    yield serializers.serialize(
      object.inviteId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AuthRespondInvitesBodyInvitesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuthRespondInvitesBodyInvitesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'action':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuthRespondInvitesBodyInvitesInnerAction),
          ) as AuthRespondInvitesBodyInvitesInnerAction;
          result.action.replace(valueDes);
          break;
        case r'invite_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.inviteId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuthRespondInvitesBodyInvitesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuthRespondInvitesBodyInvitesInnerBuilder();
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

