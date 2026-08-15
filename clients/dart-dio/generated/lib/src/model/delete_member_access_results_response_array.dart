//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/delete_member_access_result.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_member_access_results_response_array.g.dart';

/// DeleteMemberAccessResultsResponseArray
///
/// Properties:
/// * [items] - List of member asset permissions that were deleted.
@BuiltValue()
abstract class DeleteMemberAccessResultsResponseArray implements Built<DeleteMemberAccessResultsResponseArray, DeleteMemberAccessResultsResponseArrayBuilder> {
  /// List of member asset permissions that were deleted.
  @BuiltValueField(wireName: r'items')
  BuiltList<DeleteMemberAccessResult>? get items;

  DeleteMemberAccessResultsResponseArray._();

  factory DeleteMemberAccessResultsResponseArray([void updates(DeleteMemberAccessResultsResponseArrayBuilder b)]) = _$DeleteMemberAccessResultsResponseArray;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeleteMemberAccessResultsResponseArrayBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeleteMemberAccessResultsResponseArray> get serializer => _$DeleteMemberAccessResultsResponseArraySerializer();
}

class _$DeleteMemberAccessResultsResponseArraySerializer implements PrimitiveSerializer<DeleteMemberAccessResultsResponseArray> {
  @override
  final Iterable<Type> types = const [DeleteMemberAccessResultsResponseArray, _$DeleteMemberAccessResultsResponseArray];

  @override
  final String wireName = r'DeleteMemberAccessResultsResponseArray';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeleteMemberAccessResultsResponseArray object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(DeleteMemberAccessResult)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DeleteMemberAccessResultsResponseArray object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeleteMemberAccessResultsResponseArrayBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(DeleteMemberAccessResult)]),
          ) as BuiltList<DeleteMemberAccessResult>;
          result.items.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DeleteMemberAccessResultsResponseArray deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeleteMemberAccessResultsResponseArrayBuilder();
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

