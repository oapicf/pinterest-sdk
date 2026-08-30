//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/invite_action_result_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_invites_results_response_array.g.dart';

/// UpdateInvitesResultsResponseArray
///
/// Properties:
/// * [items] - List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
@BuiltValue()
abstract class UpdateInvitesResultsResponseArray implements Built<UpdateInvitesResultsResponseArray, UpdateInvitesResultsResponseArrayBuilder> {
  /// List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
  @BuiltValueField(wireName: r'items')
  BuiltList<InviteActionResultItem>? get items;

  UpdateInvitesResultsResponseArray._();

  factory UpdateInvitesResultsResponseArray([void updates(UpdateInvitesResultsResponseArrayBuilder b)]) = _$UpdateInvitesResultsResponseArray;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdateInvitesResultsResponseArrayBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdateInvitesResultsResponseArray> get serializer => _$UpdateInvitesResultsResponseArraySerializer();
}

class _$UpdateInvitesResultsResponseArraySerializer implements PrimitiveSerializer<UpdateInvitesResultsResponseArray> {
  @override
  final Iterable<Type> types = const [UpdateInvitesResultsResponseArray, _$UpdateInvitesResultsResponseArray];

  @override
  final String wireName = r'UpdateInvitesResultsResponseArray';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdateInvitesResultsResponseArray object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(InviteActionResultItem)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    UpdateInvitesResultsResponseArray object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdateInvitesResultsResponseArrayBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(InviteActionResultItem)]),
          ) as BuiltList<InviteActionResultItem>?;
          if (valueDes == null) continue;
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
  UpdateInvitesResultsResponseArray deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdateInvitesResultsResponseArrayBuilder();
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

