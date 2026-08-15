//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/respond_to_invites_response_array_items_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'respond_to_invites_response_array.g.dart';

/// RespondToInvitesResponseArray
///
/// Properties:
/// * [items] - List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.
@BuiltValue()
abstract class RespondToInvitesResponseArray implements Built<RespondToInvitesResponseArray, RespondToInvitesResponseArrayBuilder> {
  /// List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.
  @BuiltValueField(wireName: r'items')
  BuiltList<RespondToInvitesResponseArrayItemsInner>? get items;

  RespondToInvitesResponseArray._();

  factory RespondToInvitesResponseArray([void updates(RespondToInvitesResponseArrayBuilder b)]) = _$RespondToInvitesResponseArray;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RespondToInvitesResponseArrayBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RespondToInvitesResponseArray> get serializer => _$RespondToInvitesResponseArraySerializer();
}

class _$RespondToInvitesResponseArraySerializer implements PrimitiveSerializer<RespondToInvitesResponseArray> {
  @override
  final Iterable<Type> types = const [RespondToInvitesResponseArray, _$RespondToInvitesResponseArray];

  @override
  final String wireName = r'RespondToInvitesResponseArray';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RespondToInvitesResponseArray object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(RespondToInvitesResponseArrayItemsInner)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RespondToInvitesResponseArray object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RespondToInvitesResponseArrayBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(RespondToInvitesResponseArrayItemsInner)]),
          ) as BuiltList<RespondToInvitesResponseArrayItemsInner>;
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
  RespondToInvitesResponseArray deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RespondToInvitesResponseArrayBuilder();
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

