//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/permissions.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'auth_respond_invite_action.g.dart';

/// AuthRespondInviteAction
///
/// Properties:
/// * [acceptInvite] - Whether the invite/request is accepted.
/// * [assetIdToPermissions] - An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
@BuiltValue()
abstract class AuthRespondInviteAction implements Built<AuthRespondInviteAction, AuthRespondInviteActionBuilder> {
  /// Whether the invite/request is accepted.
  @BuiltValueField(wireName: r'accept_invite')
  bool get acceptInvite;

  /// An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
  @BuiltValueField(wireName: r'asset_id_to_permissions')
  BuiltMap<String, BuiltList<Permissions>>? get assetIdToPermissions;

  AuthRespondInviteAction._();

  factory AuthRespondInviteAction([void updates(AuthRespondInviteActionBuilder b)]) = _$AuthRespondInviteAction;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuthRespondInviteActionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuthRespondInviteAction> get serializer => _$AuthRespondInviteActionSerializer();
}

class _$AuthRespondInviteActionSerializer implements PrimitiveSerializer<AuthRespondInviteAction> {
  @override
  final Iterable<Type> types = const [AuthRespondInviteAction, _$AuthRespondInviteAction];

  @override
  final String wireName = r'AuthRespondInviteAction';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuthRespondInviteAction object, {
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
    AuthRespondInviteAction object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuthRespondInviteActionBuilder result,
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
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(BuiltList, [FullType(Permissions)])]),
          ) as BuiltMap<String, BuiltList<Permissions>>?;
          if (valueDes == null) continue;
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
  AuthRespondInviteAction deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuthRespondInviteActionBuilder();
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

