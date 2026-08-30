//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/base_invite_data_response.dart';
import 'package:openapi/src/model/invite_exception_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'respond_to_invite_result_item.g.dart';

/// RespondToInviteResultItem
///
/// Properties:
/// * [exception] 
/// * [invite] - An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
@BuiltValue()
abstract class RespondToInviteResultItem implements Built<RespondToInviteResultItem, RespondToInviteResultItemBuilder> {
  @BuiltValueField(wireName: r'exception')
  InviteExceptionResponse? get exception;

  /// An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
  @BuiltValueField(wireName: r'invite')
  BaseInviteDataResponse? get invite;

  RespondToInviteResultItem._();

  factory RespondToInviteResultItem([void updates(RespondToInviteResultItemBuilder b)]) = _$RespondToInviteResultItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RespondToInviteResultItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RespondToInviteResultItem> get serializer => _$RespondToInviteResultItemSerializer();
}

class _$RespondToInviteResultItemSerializer implements PrimitiveSerializer<RespondToInviteResultItem> {
  @override
  final Iterable<Type> types = const [RespondToInviteResultItem, _$RespondToInviteResultItem];

  @override
  final String wireName = r'RespondToInviteResultItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RespondToInviteResultItem object, {
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
    RespondToInviteResultItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RespondToInviteResultItemBuilder result,
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
  RespondToInviteResultItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RespondToInviteResultItemBuilder();
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

