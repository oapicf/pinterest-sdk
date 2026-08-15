//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/members_to_delete_body_members_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'members_to_delete_body.g.dart';

/// MembersToDeleteBody
///
/// Properties:
/// * [members] 
@BuiltValue()
abstract class MembersToDeleteBody implements Built<MembersToDeleteBody, MembersToDeleteBodyBuilder> {
  @BuiltValueField(wireName: r'members')
  BuiltList<MembersToDeleteBodyMembersInner> get members;

  MembersToDeleteBody._();

  factory MembersToDeleteBody([void updates(MembersToDeleteBodyBuilder b)]) = _$MembersToDeleteBody;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MembersToDeleteBodyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MembersToDeleteBody> get serializer => _$MembersToDeleteBodySerializer();
}

class _$MembersToDeleteBodySerializer implements PrimitiveSerializer<MembersToDeleteBody> {
  @override
  final Iterable<Type> types = const [MembersToDeleteBody, _$MembersToDeleteBody];

  @override
  final String wireName = r'MembersToDeleteBody';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MembersToDeleteBody object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'members';
    yield serializers.serialize(
      object.members,
      specifiedType: const FullType(BuiltList, [FullType(MembersToDeleteBodyMembersInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MembersToDeleteBody object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MembersToDeleteBodyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'members':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MembersToDeleteBodyMembersInner)]),
          ) as BuiltList<MembersToDeleteBodyMembersInner>;
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
  MembersToDeleteBody deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MembersToDeleteBodyBuilder();
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

