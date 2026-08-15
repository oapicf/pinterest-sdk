//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/auth_respond_invites_body_invites_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'auth_respond_invites_body.g.dart';

/// An object with a list of all the invites the user would like to respond to and the action to take.
///
/// Properties:
/// * [invites] 
@BuiltValue()
abstract class AuthRespondInvitesBody implements Built<AuthRespondInvitesBody, AuthRespondInvitesBodyBuilder> {
  @BuiltValueField(wireName: r'invites')
  BuiltList<AuthRespondInvitesBodyInvitesInner> get invites;

  AuthRespondInvitesBody._();

  factory AuthRespondInvitesBody([void updates(AuthRespondInvitesBodyBuilder b)]) = _$AuthRespondInvitesBody;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuthRespondInvitesBodyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuthRespondInvitesBody> get serializer => _$AuthRespondInvitesBodySerializer();
}

class _$AuthRespondInvitesBodySerializer implements PrimitiveSerializer<AuthRespondInvitesBody> {
  @override
  final Iterable<Type> types = const [AuthRespondInvitesBody, _$AuthRespondInvitesBody];

  @override
  final String wireName = r'AuthRespondInvitesBody';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuthRespondInvitesBody object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'invites';
    yield serializers.serialize(
      object.invites,
      specifiedType: const FullType(BuiltList, [FullType(AuthRespondInvitesBodyInvitesInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AuthRespondInvitesBody object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuthRespondInvitesBodyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'invites':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AuthRespondInvitesBodyInvitesInner)]),
          ) as BuiltList<AuthRespondInvitesBodyInvitesInner>;
          result.invites.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuthRespondInvitesBody deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuthRespondInvitesBodyBuilder();
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

