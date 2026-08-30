//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/invite_type.dart';
import 'package:openapi/src/model/business_role_for_invite.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_membership_or_partnership_invites_body.g.dart';

/// Body to be used on path to send Members or Partners Invite or Request
///
/// Properties:
/// * [businessRole] 
/// * [inviteType] 
/// * [members] - A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
/// * [partners] - A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
@BuiltValue()
abstract class CreateMembershipOrPartnershipInvitesBody implements Built<CreateMembershipOrPartnershipInvitesBody, CreateMembershipOrPartnershipInvitesBodyBuilder> {
  @BuiltValueField(wireName: r'business_role')
  BusinessRoleForInvite get businessRole;
  // enum businessRoleEnum {  EMPLOYEE,  BIZ_ADMIN,  PARTNER,  };

  @BuiltValueField(wireName: r'invite_type')
  InviteType get inviteType;
  // enum inviteTypeEnum {  MEMBER_INVITE,  PARTNER_INVITE,  PARTNER_REQUEST,  };

  /// A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
  @BuiltValueField(wireName: r'members')
  BuiltList<String>? get members;

  /// A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
  @BuiltValueField(wireName: r'partners')
  BuiltList<String>? get partners;

  CreateMembershipOrPartnershipInvitesBody._();

  factory CreateMembershipOrPartnershipInvitesBody([void updates(CreateMembershipOrPartnershipInvitesBodyBuilder b)]) = _$CreateMembershipOrPartnershipInvitesBody;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateMembershipOrPartnershipInvitesBodyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateMembershipOrPartnershipInvitesBody> get serializer => _$CreateMembershipOrPartnershipInvitesBodySerializer();
}

class _$CreateMembershipOrPartnershipInvitesBodySerializer implements PrimitiveSerializer<CreateMembershipOrPartnershipInvitesBody> {
  @override
  final Iterable<Type> types = const [CreateMembershipOrPartnershipInvitesBody, _$CreateMembershipOrPartnershipInvitesBody];

  @override
  final String wireName = r'CreateMembershipOrPartnershipInvitesBody';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateMembershipOrPartnershipInvitesBody object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'business_role';
    yield serializers.serialize(
      object.businessRole,
      specifiedType: const FullType(BusinessRoleForInvite),
    );
    yield r'invite_type';
    yield serializers.serialize(
      object.inviteType,
      specifiedType: const FullType(InviteType),
    );
    if (object.members != null) {
      yield r'members';
      yield serializers.serialize(
        object.members,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.partners != null) {
      yield r'partners';
      yield serializers.serialize(
        object.partners,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateMembershipOrPartnershipInvitesBody object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateMembershipOrPartnershipInvitesBodyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'business_role':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BusinessRoleForInvite),
          ) as BusinessRoleForInvite;
          result.businessRole = valueDes;
          break;
        case r'invite_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(InviteType),
          ) as InviteType;
          result.inviteType = valueDes;
          break;
        case r'members':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.members.replace(valueDes);
          break;
        case r'partners':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.partners.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateMembershipOrPartnershipInvitesBody deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateMembershipOrPartnershipInvitesBodyBuilder();
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

