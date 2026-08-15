//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/permissions.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/invite_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_asset_invites_request_item.g.dart';

/// Object declaring an asset role update to an invite.
///
/// Properties:
/// * [assetIdToPermissions] - An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
/// * [inviteId] - Unique identifier of an invite.
/// * [inviteType] 
@BuiltValue()
abstract class CreateAssetInvitesRequestItem implements Built<CreateAssetInvitesRequestItem, CreateAssetInvitesRequestItemBuilder> {
  /// An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
  @BuiltValueField(wireName: r'asset_id_to_permissions')
  BuiltMap<String, BuiltList<Permissions>> get assetIdToPermissions;

  /// Unique identifier of an invite.
  @BuiltValueField(wireName: r'invite_id')
  String get inviteId;

  @BuiltValueField(wireName: r'invite_type')
  InviteType get inviteType;
  // enum inviteTypeEnum {  MEMBER_INVITE,  PARTNER_INVITE,  PARTNER_REQUEST,  };

  CreateAssetInvitesRequestItem._();

  factory CreateAssetInvitesRequestItem([void updates(CreateAssetInvitesRequestItemBuilder b)]) = _$CreateAssetInvitesRequestItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateAssetInvitesRequestItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateAssetInvitesRequestItem> get serializer => _$CreateAssetInvitesRequestItemSerializer();
}

class _$CreateAssetInvitesRequestItemSerializer implements PrimitiveSerializer<CreateAssetInvitesRequestItem> {
  @override
  final Iterable<Type> types = const [CreateAssetInvitesRequestItem, _$CreateAssetInvitesRequestItem];

  @override
  final String wireName = r'CreateAssetInvitesRequestItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateAssetInvitesRequestItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'asset_id_to_permissions';
    yield serializers.serialize(
      object.assetIdToPermissions,
      specifiedType: const FullType(BuiltMap, [FullType(String), FullType(BuiltList, [FullType(Permissions)])]),
    );
    yield r'invite_id';
    yield serializers.serialize(
      object.inviteId,
      specifiedType: const FullType(String),
    );
    yield r'invite_type';
    yield serializers.serialize(
      object.inviteType,
      specifiedType: const FullType(InviteType),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateAssetInvitesRequestItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateAssetInvitesRequestItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'asset_id_to_permissions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltMap, [FullType(String), FullType(BuiltList, [FullType(Permissions)])]),
          ) as BuiltMap<String, BuiltList<Permissions>>;
          result.assetIdToPermissions.replace(valueDes);
          break;
        case r'invite_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.inviteId = valueDes;
          break;
        case r'invite_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(InviteType),
          ) as InviteType;
          result.inviteType = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateAssetInvitesRequestItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateAssetInvitesRequestItemBuilder();
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

