//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/business_role_for_members.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_membership_member.g.dart';

/// A business member identified by `member_id` with their `business_role` in the business.
///
/// Properties:
/// * [businessRole] 
/// * [memberId] - Unique identifier of the member.
@BuiltValue()
abstract class BusinessMembershipMember implements Built<BusinessMembershipMember, BusinessMembershipMemberBuilder> {
  @BuiltValueField(wireName: r'business_role')
  BusinessRoleForMembers get businessRole;
  // enum businessRoleEnum {  EMPLOYEE,  BIZ_ADMIN,  };

  /// Unique identifier of the member.
  @BuiltValueField(wireName: r'member_id')
  String get memberId;

  BusinessMembershipMember._();

  factory BusinessMembershipMember([void updates(BusinessMembershipMemberBuilder b)]) = _$BusinessMembershipMember;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BusinessMembershipMemberBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BusinessMembershipMember> get serializer => _$BusinessMembershipMemberSerializer();
}

class _$BusinessMembershipMemberSerializer implements PrimitiveSerializer<BusinessMembershipMember> {
  @override
  final Iterable<Type> types = const [BusinessMembershipMember, _$BusinessMembershipMember];

  @override
  final String wireName = r'BusinessMembershipMember';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BusinessMembershipMember object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'business_role';
    yield serializers.serialize(
      object.businessRole,
      specifiedType: const FullType(BusinessRoleForMembers),
    );
    yield r'member_id';
    yield serializers.serialize(
      object.memberId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BusinessMembershipMember object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BusinessMembershipMemberBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'business_role':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BusinessRoleForMembers),
          ) as BusinessRoleForMembers;
          result.businessRole = valueDes;
          break;
        case r'member_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.memberId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BusinessMembershipMember deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BusinessMembershipMemberBuilder();
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

