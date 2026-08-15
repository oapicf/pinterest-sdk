//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/business_member_assets_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/business_access_user_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_business_role_binding.g.dart';

/// UserBusinessRoleBinding
///
/// Properties:
/// * [assetsSummary] 
/// * [businessRoles] - The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
/// * [createdByBusiness] - Metadata for the business that created the business relationship.
/// * [createdByUser] - Metadata for the user that created the business relationship.
/// * [createdTime] - The time the business relationship was created. Returned in milliseconds.
/// * [id] - Unique identifier of the business member/business partner/employer.
/// * [isSharedPartner] - This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.
/// * [user] - Metadata for the business member/business partner/employer.
@BuiltValue()
abstract class UserBusinessRoleBinding implements Built<UserBusinessRoleBinding, UserBusinessRoleBindingBuilder> {
  @BuiltValueField(wireName: r'assets_summary')
  BusinessMemberAssetsSummary? get assetsSummary;

  /// The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
  @BuiltValueField(wireName: r'business_roles')
  BuiltList<String>? get businessRoles;

  /// Metadata for the business that created the business relationship.
  @BuiltValueField(wireName: r'created_by_business')
  BusinessAccessUserSummary? get createdByBusiness;

  /// Metadata for the user that created the business relationship.
  @BuiltValueField(wireName: r'created_by_user')
  BusinessAccessUserSummary? get createdByUser;

  /// The time the business relationship was created. Returned in milliseconds.
  @BuiltValueField(wireName: r'created_time')
  int? get createdTime;

  /// Unique identifier of the business member/business partner/employer.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.
  @BuiltValueField(wireName: r'is_shared_partner')
  bool? get isSharedPartner;

  /// Metadata for the business member/business partner/employer.
  @BuiltValueField(wireName: r'user')
  BusinessAccessUserSummary? get user;

  UserBusinessRoleBinding._();

  factory UserBusinessRoleBinding([void updates(UserBusinessRoleBindingBuilder b)]) = _$UserBusinessRoleBinding;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UserBusinessRoleBindingBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UserBusinessRoleBinding> get serializer => _$UserBusinessRoleBindingSerializer();
}

class _$UserBusinessRoleBindingSerializer implements PrimitiveSerializer<UserBusinessRoleBinding> {
  @override
  final Iterable<Type> types = const [UserBusinessRoleBinding, _$UserBusinessRoleBinding];

  @override
  final String wireName = r'UserBusinessRoleBinding';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UserBusinessRoleBinding object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.assetsSummary != null) {
      yield r'assets_summary';
      yield serializers.serialize(
        object.assetsSummary,
        specifiedType: const FullType.nullable(BusinessMemberAssetsSummary),
      );
    }
    if (object.businessRoles != null) {
      yield r'business_roles';
      yield serializers.serialize(
        object.businessRoles,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.createdByBusiness != null) {
      yield r'created_by_business';
      yield serializers.serialize(
        object.createdByBusiness,
        specifiedType: const FullType.nullable(BusinessAccessUserSummary),
      );
    }
    if (object.createdByUser != null) {
      yield r'created_by_user';
      yield serializers.serialize(
        object.createdByUser,
        specifiedType: const FullType.nullable(BusinessAccessUserSummary),
      );
    }
    if (object.createdTime != null) {
      yield r'created_time';
      yield serializers.serialize(
        object.createdTime,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.isSharedPartner != null) {
      yield r'is_shared_partner';
      yield serializers.serialize(
        object.isSharedPartner,
        specifiedType: const FullType(bool),
      );
    }
    if (object.user != null) {
      yield r'user';
      yield serializers.serialize(
        object.user,
        specifiedType: const FullType.nullable(BusinessAccessUserSummary),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    UserBusinessRoleBinding object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UserBusinessRoleBindingBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'assets_summary':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BusinessMemberAssetsSummary),
          ) as BusinessMemberAssetsSummary?;
          if (valueDes == null) continue;
          result.assetsSummary.replace(valueDes);
          break;
        case r'business_roles':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.businessRoles.replace(valueDes);
          break;
        case r'created_by_business':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BusinessAccessUserSummary),
          ) as BusinessAccessUserSummary?;
          if (valueDes == null) continue;
          result.createdByBusiness.replace(valueDes);
          break;
        case r'created_by_user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BusinessAccessUserSummary),
          ) as BusinessAccessUserSummary?;
          if (valueDes == null) continue;
          result.createdByUser.replace(valueDes);
          break;
        case r'created_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.createdTime = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'is_shared_partner':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isSharedPartner = valueDes;
          break;
        case r'user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BusinessAccessUserSummary),
          ) as BusinessAccessUserSummary?;
          if (valueDes == null) continue;
          result.user.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UserBusinessRoleBinding deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UserBusinessRoleBindingBuilder();
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

