//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/base_invite_data_response.dart';
import 'package:openapi/src/model/delete_invites_results_response_array_items_inner_exception.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_invites_results_response_array_items_inner.g.dart';

/// DeleteInvitesResultsResponseArrayItemsInner
///
/// Properties:
/// * [exception] 
/// * [invite] 
@BuiltValue()
abstract class DeleteInvitesResultsResponseArrayItemsInner implements Built<DeleteInvitesResultsResponseArrayItemsInner, DeleteInvitesResultsResponseArrayItemsInnerBuilder> {
  @BuiltValueField(wireName: r'exception')
  DeleteInvitesResultsResponseArrayItemsInnerException? get exception;

  @BuiltValueField(wireName: r'invite')
  BaseInviteDataResponse? get invite;

  DeleteInvitesResultsResponseArrayItemsInner._();

  factory DeleteInvitesResultsResponseArrayItemsInner([void updates(DeleteInvitesResultsResponseArrayItemsInnerBuilder b)]) = _$DeleteInvitesResultsResponseArrayItemsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeleteInvitesResultsResponseArrayItemsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeleteInvitesResultsResponseArrayItemsInner> get serializer => _$DeleteInvitesResultsResponseArrayItemsInnerSerializer();
}

class _$DeleteInvitesResultsResponseArrayItemsInnerSerializer implements PrimitiveSerializer<DeleteInvitesResultsResponseArrayItemsInner> {
  @override
  final Iterable<Type> types = const [DeleteInvitesResultsResponseArrayItemsInner, _$DeleteInvitesResultsResponseArrayItemsInner];

  @override
  final String wireName = r'DeleteInvitesResultsResponseArrayItemsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeleteInvitesResultsResponseArrayItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.exception != null) {
      yield r'exception';
      yield serializers.serialize(
        object.exception,
        specifiedType: const FullType.nullable(DeleteInvitesResultsResponseArrayItemsInnerException),
      );
    }
    if (object.invite != null) {
      yield r'invite';
      yield serializers.serialize(
        object.invite,
        specifiedType: const FullType.nullable(BaseInviteDataResponse),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DeleteInvitesResultsResponseArrayItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeleteInvitesResultsResponseArrayItemsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'exception':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(DeleteInvitesResultsResponseArrayItemsInnerException),
          ) as DeleteInvitesResultsResponseArrayItemsInnerException?;
          if (valueDes == null) continue;
          result.exception.replace(valueDes);
          break;
        case r'invite':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BaseInviteDataResponse),
          ) as BaseInviteDataResponse?;
          if (valueDes == null) continue;
          result.invite = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DeleteInvitesResultsResponseArrayItemsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeleteInvitesResultsResponseArrayItemsInnerBuilder();
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

