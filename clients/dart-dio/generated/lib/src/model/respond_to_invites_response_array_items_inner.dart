//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/base_invite_data_response.dart';
import 'package:openapi/src/model/invite_exception_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'respond_to_invites_response_array_items_inner.g.dart';

/// RespondToInvitesResponseArrayItemsInner
///
/// Properties:
/// * [exception] 
/// * [invite] 
@BuiltValue()
abstract class RespondToInvitesResponseArrayItemsInner implements Built<RespondToInvitesResponseArrayItemsInner, RespondToInvitesResponseArrayItemsInnerBuilder> {
  @BuiltValueField(wireName: r'exception')
  InviteExceptionResponse? get exception;

  @BuiltValueField(wireName: r'invite')
  BaseInviteDataResponse? get invite;

  RespondToInvitesResponseArrayItemsInner._();

  factory RespondToInvitesResponseArrayItemsInner([void updates(RespondToInvitesResponseArrayItemsInnerBuilder b)]) = _$RespondToInvitesResponseArrayItemsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RespondToInvitesResponseArrayItemsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RespondToInvitesResponseArrayItemsInner> get serializer => _$RespondToInvitesResponseArrayItemsInnerSerializer();
}

class _$RespondToInvitesResponseArrayItemsInnerSerializer implements PrimitiveSerializer<RespondToInvitesResponseArrayItemsInner> {
  @override
  final Iterable<Type> types = const [RespondToInvitesResponseArrayItemsInner, _$RespondToInvitesResponseArrayItemsInner];

  @override
  final String wireName = r'RespondToInvitesResponseArrayItemsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RespondToInvitesResponseArrayItemsInner object, {
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
        specifiedType: const FullType.nullable(BaseInviteDataResponse),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RespondToInvitesResponseArrayItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RespondToInvitesResponseArrayItemsInnerBuilder result,
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
  RespondToInvitesResponseArrayItemsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RespondToInvitesResponseArrayItemsInnerBuilder();
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

