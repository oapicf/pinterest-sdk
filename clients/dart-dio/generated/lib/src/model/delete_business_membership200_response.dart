//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_business_membership200_response.g.dart';

/// DeleteBusinessMembership200Response
///
/// Properties:
/// * [deletedMembers] 
@BuiltValue()
abstract class DeleteBusinessMembership200Response implements Built<DeleteBusinessMembership200Response, DeleteBusinessMembership200ResponseBuilder> {
  @BuiltValueField(wireName: r'deleted_members')
  BuiltList<String>? get deletedMembers;

  DeleteBusinessMembership200Response._();

  factory DeleteBusinessMembership200Response([void updates(DeleteBusinessMembership200ResponseBuilder b)]) = _$DeleteBusinessMembership200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeleteBusinessMembership200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeleteBusinessMembership200Response> get serializer => _$DeleteBusinessMembership200ResponseSerializer();
}

class _$DeleteBusinessMembership200ResponseSerializer implements PrimitiveSerializer<DeleteBusinessMembership200Response> {
  @override
  final Iterable<Type> types = const [DeleteBusinessMembership200Response, _$DeleteBusinessMembership200Response];

  @override
  final String wireName = r'DeleteBusinessMembership200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeleteBusinessMembership200Response object, {
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
    DeleteBusinessMembership200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeleteBusinessMembership200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'deleted_members':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
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
  DeleteBusinessMembership200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeleteBusinessMembership200ResponseBuilder();
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

