//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/delete_invites_results_response_array_items_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_invites_results_response_array.g.dart';

/// Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id
///
/// Properties:
/// * [items] - List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.
@BuiltValue()
abstract class DeleteInvitesResultsResponseArray implements Built<DeleteInvitesResultsResponseArray, DeleteInvitesResultsResponseArrayBuilder> {
  /// List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.
  @BuiltValueField(wireName: r'items')
  BuiltList<DeleteInvitesResultsResponseArrayItemsInner>? get items;

  DeleteInvitesResultsResponseArray._();

  factory DeleteInvitesResultsResponseArray([void updates(DeleteInvitesResultsResponseArrayBuilder b)]) = _$DeleteInvitesResultsResponseArray;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeleteInvitesResultsResponseArrayBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeleteInvitesResultsResponseArray> get serializer => _$DeleteInvitesResultsResponseArraySerializer();
}

class _$DeleteInvitesResultsResponseArraySerializer implements PrimitiveSerializer<DeleteInvitesResultsResponseArray> {
  @override
  final Iterable<Type> types = const [DeleteInvitesResultsResponseArray, _$DeleteInvitesResultsResponseArray];

  @override
  final String wireName = r'DeleteInvitesResultsResponseArray';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeleteInvitesResultsResponseArray object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(DeleteInvitesResultsResponseArrayItemsInner)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DeleteInvitesResultsResponseArray object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeleteInvitesResultsResponseArrayBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(DeleteInvitesResultsResponseArrayItemsInner)]),
          ) as BuiltList<DeleteInvitesResultsResponseArrayItemsInner>;
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
  DeleteInvitesResultsResponseArray deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeleteInvitesResultsResponseArrayBuilder();
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

