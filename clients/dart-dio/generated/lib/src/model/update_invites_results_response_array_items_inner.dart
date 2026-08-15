//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/invite_business_role_binding.dart';
import 'package:openapi/src/model/invite_exception_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_invites_results_response_array_items_inner.g.dart';

/// UpdateInvitesResultsResponseArrayItemsInner
///
/// Properties:
/// * [exception] 
/// * [invite] 
@BuiltValue()
abstract class UpdateInvitesResultsResponseArrayItemsInner implements Built<UpdateInvitesResultsResponseArrayItemsInner, UpdateInvitesResultsResponseArrayItemsInnerBuilder> {
  @BuiltValueField(wireName: r'exception')
  InviteExceptionResponse? get exception;

  @BuiltValueField(wireName: r'invite')
  InviteBusinessRoleBinding? get invite;

  UpdateInvitesResultsResponseArrayItemsInner._();

  factory UpdateInvitesResultsResponseArrayItemsInner([void updates(UpdateInvitesResultsResponseArrayItemsInnerBuilder b)]) = _$UpdateInvitesResultsResponseArrayItemsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdateInvitesResultsResponseArrayItemsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdateInvitesResultsResponseArrayItemsInner> get serializer => _$UpdateInvitesResultsResponseArrayItemsInnerSerializer();
}

class _$UpdateInvitesResultsResponseArrayItemsInnerSerializer implements PrimitiveSerializer<UpdateInvitesResultsResponseArrayItemsInner> {
  @override
  final Iterable<Type> types = const [UpdateInvitesResultsResponseArrayItemsInner, _$UpdateInvitesResultsResponseArrayItemsInner];

  @override
  final String wireName = r'UpdateInvitesResultsResponseArrayItemsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdateInvitesResultsResponseArrayItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.exception != null) {
      yield r'exception';
      yield serializers.serialize(
        object.exception,
        specifiedType: const FullType.nullable(InviteExceptionResponse),
      );
    }
    if (object.invite != null) {
      yield r'invite';
      yield serializers.serialize(
        object.invite,
        specifiedType: const FullType(InviteBusinessRoleBinding),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    UpdateInvitesResultsResponseArrayItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdateInvitesResultsResponseArrayItemsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'exception':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(InviteExceptionResponse),
          ) as InviteExceptionResponse?;
          if (valueDes == null) continue;
          result.exception.replace(valueDes);
          break;
        case r'invite':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(InviteBusinessRoleBinding),
          ) as InviteBusinessRoleBinding;
          result.invite.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UpdateInvitesResultsResponseArrayItemsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdateInvitesResultsResponseArrayItemsInnerBuilder();
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

