//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/auth_respond_invite_action.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'auth_respond_invites_body_item.g.dart';

/// AuthRespondInvitesBodyItem
///
/// Properties:
/// * [action] 
/// * [inviteId] - Unique identifier of an invite.
@BuiltValue()
abstract class AuthRespondInvitesBodyItem implements Built<AuthRespondInvitesBodyItem, AuthRespondInvitesBodyItemBuilder> {
  @BuiltValueField(wireName: r'action')
  AuthRespondInviteAction get action;

  /// Unique identifier of an invite.
  @BuiltValueField(wireName: r'invite_id')
  String get inviteId;

  AuthRespondInvitesBodyItem._();

  factory AuthRespondInvitesBodyItem([void updates(AuthRespondInvitesBodyItemBuilder b)]) = _$AuthRespondInvitesBodyItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuthRespondInvitesBodyItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuthRespondInvitesBodyItem> get serializer => _$AuthRespondInvitesBodyItemSerializer();
}

class _$AuthRespondInvitesBodyItemSerializer implements PrimitiveSerializer<AuthRespondInvitesBodyItem> {
  @override
  final Iterable<Type> types = const [AuthRespondInvitesBodyItem, _$AuthRespondInvitesBodyItem];

  @override
  final String wireName = r'AuthRespondInvitesBodyItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuthRespondInvitesBodyItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'action';
    yield serializers.serialize(
      object.action,
      specifiedType: const FullType(AuthRespondInviteAction),
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
    AuthRespondInvitesBodyItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuthRespondInvitesBodyItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'action':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuthRespondInviteAction),
          ) as AuthRespondInviteAction;
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
  AuthRespondInvitesBodyItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuthRespondInvitesBodyItemBuilder();
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

