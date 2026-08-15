//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_invites_results_response_array_items_inner_exception.g.dart';

/// An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
///
/// Properties:
/// * [inviteId] - Unique identifier of an invite.
/// * [message] - Error message associated with the error in performing the action on the invite/request.
@BuiltValue()
abstract class DeleteInvitesResultsResponseArrayItemsInnerException implements Built<DeleteInvitesResultsResponseArrayItemsInnerException, DeleteInvitesResultsResponseArrayItemsInnerExceptionBuilder> {
  /// Unique identifier of an invite.
  @BuiltValueField(wireName: r'invite_id')
  String? get inviteId;

  /// Error message associated with the error in performing the action on the invite/request.
  @BuiltValueField(wireName: r'message')
  String? get message;

  DeleteInvitesResultsResponseArrayItemsInnerException._();

  factory DeleteInvitesResultsResponseArrayItemsInnerException([void updates(DeleteInvitesResultsResponseArrayItemsInnerExceptionBuilder b)]) = _$DeleteInvitesResultsResponseArrayItemsInnerException;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeleteInvitesResultsResponseArrayItemsInnerExceptionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeleteInvitesResultsResponseArrayItemsInnerException> get serializer => _$DeleteInvitesResultsResponseArrayItemsInnerExceptionSerializer();
}

class _$DeleteInvitesResultsResponseArrayItemsInnerExceptionSerializer implements PrimitiveSerializer<DeleteInvitesResultsResponseArrayItemsInnerException> {
  @override
  final Iterable<Type> types = const [DeleteInvitesResultsResponseArrayItemsInnerException, _$DeleteInvitesResultsResponseArrayItemsInnerException];

  @override
  final String wireName = r'DeleteInvitesResultsResponseArrayItemsInnerException';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeleteInvitesResultsResponseArrayItemsInnerException object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.inviteId != null) {
      yield r'invite_id';
      yield serializers.serialize(
        object.inviteId,
        specifiedType: const FullType(String),
      );
    }
    if (object.message != null) {
      yield r'message';
      yield serializers.serialize(
        object.message,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DeleteInvitesResultsResponseArrayItemsInnerException object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeleteInvitesResultsResponseArrayItemsInnerExceptionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'invite_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.inviteId = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.message = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DeleteInvitesResultsResponseArrayItemsInnerException deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeleteInvitesResultsResponseArrayItemsInnerExceptionBuilder();
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

