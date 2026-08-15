//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'deleted_members_response.g.dart';

/// An object with a list of members that were deleted.
///
/// Properties:
/// * [deletedMembers] - List of members whose business membership have been terminated.
@BuiltValue()
abstract class DeletedMembersResponse implements Built<DeletedMembersResponse, DeletedMembersResponseBuilder> {
  /// List of members whose business membership have been terminated.
  @BuiltValueField(wireName: r'deleted_members')
  BuiltList<String>? get deletedMembers;

  DeletedMembersResponse._();

  factory DeletedMembersResponse([void updates(DeletedMembersResponseBuilder b)]) = _$DeletedMembersResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeletedMembersResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeletedMembersResponse> get serializer => _$DeletedMembersResponseSerializer();
}

class _$DeletedMembersResponseSerializer implements PrimitiveSerializer<DeletedMembersResponse> {
  @override
  final Iterable<Type> types = const [DeletedMembersResponse, _$DeletedMembersResponse];

  @override
  final String wireName = r'DeletedMembersResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeletedMembersResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.deletedMembers != null) {
      yield r'deleted_members';
      yield serializers.serialize(
        object.deletedMembers,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DeletedMembersResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeletedMembersResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'deleted_members':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.deletedMembers.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DeletedMembersResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeletedMembersResponseBuilder();
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

