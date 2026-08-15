//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/permissions.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'auth_respond_invites_body_invites_inner_action.g.dart';

/// AuthRespondInvitesBodyInvitesInnerAction
///
/// Properties:
/// * [acceptInvite] - Whether the invite/request is accepted.
/// * [assetIdToPermissions] - An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
@BuiltValue()
abstract class AuthRespondInvitesBodyInvitesInnerAction implements Built<AuthRespondInvitesBodyInvitesInnerAction, AuthRespondInvitesBodyInvitesInnerActionBuilder> {
  /// Whether the invite/request is accepted.
  @BuiltValueField(wireName: r'accept_invite')
  bool get acceptInvite;

  /// An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
  @BuiltValueField(wireName: r'asset_id_to_permissions')
  BuiltMap<String, BuiltList<Permissions>>? get assetIdToPermissions;

  AuthRespondInvitesBodyInvitesInnerAction._();

  factory AuthRespondInvitesBodyInvitesInnerAction([void updates(AuthRespondInvitesBodyInvitesInnerActionBuilder b)]) = _$AuthRespondInvitesBodyInvitesInnerAction;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuthRespondInvitesBodyInvitesInnerActionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuthRespondInvitesBodyInvitesInnerAction> get serializer => _$AuthRespondInvitesBodyInvitesInnerActionSerializer();
}

class _$AuthRespondInvitesBodyInvitesInnerActionSerializer implements PrimitiveSerializer<AuthRespondInvitesBodyInvitesInnerAction> {
  @override
  final Iterable<Type> types = const [AuthRespondInvitesBodyInvitesInnerAction, _$AuthRespondInvitesBodyInvitesInnerAction];

  @override
  final String wireName = r'AuthRespondInvitesBodyInvitesInnerAction';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuthRespondInvitesBodyInvitesInnerAction object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'accept_invite';
    yield serializers.serialize(
      object.acceptInvite,
      specifiedType: const FullType(bool),
    );
    if (object.assetIdToPermissions != null) {
      yield r'asset_id_to_permissions';
      yield serializers.serialize(
        object.assetIdToPermissions,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(BuiltList, [FullType(Permissions)])]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuthRespondInvitesBodyInvitesInnerAction object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuthRespondInvitesBodyInvitesInnerActionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'accept_invite':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.acceptInvite = valueDes;
          break;
        case r'asset_id_to_permissions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltMap, [FullType(String), FullType(BuiltList, [FullType(Permissions)])]),
          ) as BuiltMap<String, BuiltList<Permissions>>;
          result.assetIdToPermissions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuthRespondInvitesBodyInvitesInnerAction deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuthRespondInvitesBodyInvitesInnerActionBuilder();
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

