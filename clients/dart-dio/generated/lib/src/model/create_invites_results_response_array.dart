//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/invite_action_result_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_invites_results_response_array.g.dart';

/// CreateInvitesResultsResponseArray
///
/// Properties:
/// * [items] - List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
@BuiltValue()
abstract class CreateInvitesResultsResponseArray implements Built<CreateInvitesResultsResponseArray, CreateInvitesResultsResponseArrayBuilder> {
  /// List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
  @BuiltValueField(wireName: r'items')
  BuiltList<InviteActionResultItem>? get items;

  CreateInvitesResultsResponseArray._();

  factory CreateInvitesResultsResponseArray([void updates(CreateInvitesResultsResponseArrayBuilder b)]) = _$CreateInvitesResultsResponseArray;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateInvitesResultsResponseArrayBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateInvitesResultsResponseArray> get serializer => _$CreateInvitesResultsResponseArraySerializer();
}

class _$CreateInvitesResultsResponseArraySerializer implements PrimitiveSerializer<CreateInvitesResultsResponseArray> {
  @override
  final Iterable<Type> types = const [CreateInvitesResultsResponseArray, _$CreateInvitesResultsResponseArray];

  @override
  final String wireName = r'CreateInvitesResultsResponseArray';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateInvitesResultsResponseArray object, {
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
    CreateInvitesResultsResponseArray object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateInvitesResultsResponseArrayBuilder result,
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
  CreateInvitesResultsResponseArray deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateInvitesResultsResponseArrayBuilder();
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

