//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/invite_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_membership_or_partnership_invites_body.g.dart';

/// Body to be used on path to send Members or Partners Invite or Request
///
/// Properties:
/// * [businessRole] - The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
/// * [inviteType] 
/// * [members] - A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
/// * [partners] - A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
@BuiltValue()
abstract class CreateMembershipOrPartnershipInvitesBody implements Built<CreateMembershipOrPartnershipInvitesBody, CreateMembershipOrPartnershipInvitesBodyBuilder> {
  /// The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
  @BuiltValueField(wireName: r'business_role')
  CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum get businessRole;
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
      specifiedType: const FullType(CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum),
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
            specifiedType: const FullType(CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum),
          ) as CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum;
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
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.members.replace(valueDes);
          break;
        case r'partners':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
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

class CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum extends EnumClass {

  /// The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
  @BuiltValueEnumConst(wireName: r'EMPLOYEE')
  static const CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum EMPLOYEE = _$createMembershipOrPartnershipInvitesBodyBusinessRoleEnum_EMPLOYEE;
  /// The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
  @BuiltValueEnumConst(wireName: r'BIZ_ADMIN')
  static const CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum BIZ_ADMIN = _$createMembershipOrPartnershipInvitesBodyBusinessRoleEnum_BIZ_ADMIN;
  /// The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
  @BuiltValueEnumConst(wireName: r'PARTNER')
  static const CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum PARTNER = _$createMembershipOrPartnershipInvitesBodyBusinessRoleEnum_PARTNER;

  static Serializer<CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum> get serializer => _$createMembershipOrPartnershipInvitesBodyBusinessRoleEnumSerializer;

  const CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum._(String name): super(name);

  static BuiltSet<CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum> get values => _$createMembershipOrPartnershipInvitesBodyBusinessRoleEnumValues;
  static CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum valueOf(String name) => _$createMembershipOrPartnershipInvitesBodyBusinessRoleEnumValueOf(name);
}

