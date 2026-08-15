//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/business_role_for_members.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_member_business_role_body.g.dart';

/// Single instance of a business member to have its role updated
///
/// Properties:
/// * [businessRole] 
/// * [memberId] - Unique identifier of the member
@BuiltValue()
abstract class UpdateMemberBusinessRoleBody implements Built<UpdateMemberBusinessRoleBody, UpdateMemberBusinessRoleBodyBuilder> {
  @BuiltValueField(wireName: r'business_role')
  BusinessRoleForMembers get businessRole;
  // enum businessRoleEnum {  EMPLOYEE,  BIZ_ADMIN,  };

  /// Unique identifier of the member
  @BuiltValueField(wireName: r'member_id')
  String get memberId;

  UpdateMemberBusinessRoleBody._();

  factory UpdateMemberBusinessRoleBody([void updates(UpdateMemberBusinessRoleBodyBuilder b)]) = _$UpdateMemberBusinessRoleBody;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdateMemberBusinessRoleBodyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdateMemberBusinessRoleBody> get serializer => _$UpdateMemberBusinessRoleBodySerializer();
}

class _$UpdateMemberBusinessRoleBodySerializer implements PrimitiveSerializer<UpdateMemberBusinessRoleBody> {
  @override
  final Iterable<Type> types = const [UpdateMemberBusinessRoleBody, _$UpdateMemberBusinessRoleBody];

  @override
  final String wireName = r'UpdateMemberBusinessRoleBody';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdateMemberBusinessRoleBody object, {
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
    UpdateMemberBusinessRoleBody object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdateMemberBusinessRoleBodyBuilder result,
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
  UpdateMemberBusinessRoleBody deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdateMemberBusinessRoleBodyBuilder();
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

