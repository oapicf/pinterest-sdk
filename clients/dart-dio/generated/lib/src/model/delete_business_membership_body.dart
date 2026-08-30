//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/delete_business_membership_member.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_business_membership_body.g.dart';

/// List of members with role to delete.
///
/// Properties:
/// * [members] 
@BuiltValue()
abstract class DeleteBusinessMembershipBody implements Built<DeleteBusinessMembershipBody, DeleteBusinessMembershipBodyBuilder> {
  @BuiltValueField(wireName: r'members')
  BuiltList<DeleteBusinessMembershipMember> get members;

  DeleteBusinessMembershipBody._();

  factory DeleteBusinessMembershipBody([void updates(DeleteBusinessMembershipBodyBuilder b)]) = _$DeleteBusinessMembershipBody;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeleteBusinessMembershipBodyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeleteBusinessMembershipBody> get serializer => _$DeleteBusinessMembershipBodySerializer();
}

class _$DeleteBusinessMembershipBodySerializer implements PrimitiveSerializer<DeleteBusinessMembershipBody> {
  @override
  final Iterable<Type> types = const [DeleteBusinessMembershipBody, _$DeleteBusinessMembershipBody];

  @override
  final String wireName = r'DeleteBusinessMembershipBody';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeleteBusinessMembershipBody object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'members';
    yield serializers.serialize(
      object.members,
      specifiedType: const FullType(BuiltList, [FullType(DeleteBusinessMembershipMember)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    DeleteBusinessMembershipBody object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeleteBusinessMembershipBodyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'members':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(DeleteBusinessMembershipMember)]),
          ) as BuiltList<DeleteBusinessMembershipMember>;
          result.members.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DeleteBusinessMembershipBody deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeleteBusinessMembershipBodyBuilder();
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

