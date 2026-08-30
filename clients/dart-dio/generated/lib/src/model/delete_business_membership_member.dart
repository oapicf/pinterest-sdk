//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/business_role_for_members.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_business_membership_member.g.dart';

/// Single instance of a business member to be removed from the business.
///
/// Properties:
/// * [businessRole] 
/// * [memberId] - Unique identifier of the member
@BuiltValue()
abstract class DeleteBusinessMembershipMember implements Built<DeleteBusinessMembershipMember, DeleteBusinessMembershipMemberBuilder> {
  @BuiltValueField(wireName: r'business_role')
  BusinessRoleForMembers get businessRole;
  // enum businessRoleEnum {  EMPLOYEE,  BIZ_ADMIN,  };

  /// Unique identifier of the member
  @BuiltValueField(wireName: r'member_id')
  String get memberId;

  DeleteBusinessMembershipMember._();

  factory DeleteBusinessMembershipMember([void updates(DeleteBusinessMembershipMemberBuilder b)]) = _$DeleteBusinessMembershipMember;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeleteBusinessMembershipMemberBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeleteBusinessMembershipMember> get serializer => _$DeleteBusinessMembershipMemberSerializer();
}

class _$DeleteBusinessMembershipMemberSerializer implements PrimitiveSerializer<DeleteBusinessMembershipMember> {
  @override
  final Iterable<Type> types = const [DeleteBusinessMembershipMember, _$DeleteBusinessMembershipMember];

  @override
  final String wireName = r'DeleteBusinessMembershipMember';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeleteBusinessMembershipMember object, {
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
    DeleteBusinessMembershipMember object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeleteBusinessMembershipMemberBuilder result,
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
  DeleteBusinessMembershipMember deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeleteBusinessMembershipMemberBuilder();
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

