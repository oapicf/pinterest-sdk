//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_member_result.g.dart';

/// UpdateMemberResult
///
/// Properties:
/// * [businessRole] - The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
/// * [memberId] - Unique identifier of the business member.
@BuiltValue()
abstract class UpdateMemberResult implements Built<UpdateMemberResult, UpdateMemberResultBuilder> {
  /// The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
  @BuiltValueField(wireName: r'business_role')
  String? get businessRole;

  /// Unique identifier of the business member.
  @BuiltValueField(wireName: r'member_id')
  String? get memberId;

  UpdateMemberResult._();

  factory UpdateMemberResult([void updates(UpdateMemberResultBuilder b)]) = _$UpdateMemberResult;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdateMemberResultBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdateMemberResult> get serializer => _$UpdateMemberResultSerializer();
}

class _$UpdateMemberResultSerializer implements PrimitiveSerializer<UpdateMemberResult> {
  @override
  final Iterable<Type> types = const [UpdateMemberResult, _$UpdateMemberResult];

  @override
  final String wireName = r'UpdateMemberResult';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdateMemberResult object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.businessRole != null) {
      yield r'business_role';
      yield serializers.serialize(
        object.businessRole,
        specifiedType: const FullType(String),
      );
    }
    if (object.memberId != null) {
      yield r'member_id';
      yield serializers.serialize(
        object.memberId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    UpdateMemberResult object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdateMemberResultBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'business_role':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
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
  UpdateMemberResult deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdateMemberResultBuilder();
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

