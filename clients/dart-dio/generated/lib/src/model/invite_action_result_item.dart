//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/invite_business_role_binding.dart';
import 'package:openapi/src/model/invite_exception_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invite_action_result_item.g.dart';

/// An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
///
/// Properties:
/// * [exception] 
/// * [invite] 
@BuiltValue()
abstract class InviteActionResultItem implements Built<InviteActionResultItem, InviteActionResultItemBuilder> {
  @BuiltValueField(wireName: r'exception')
  InviteExceptionResponse? get exception;

  @BuiltValueField(wireName: r'invite')
  InviteBusinessRoleBinding? get invite;

  InviteActionResultItem._();

  factory InviteActionResultItem([void updates(InviteActionResultItemBuilder b)]) = _$InviteActionResultItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(InviteActionResultItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<InviteActionResultItem> get serializer => _$InviteActionResultItemSerializer();
}

class _$InviteActionResultItemSerializer implements PrimitiveSerializer<InviteActionResultItem> {
  @override
  final Iterable<Type> types = const [InviteActionResultItem, _$InviteActionResultItem];

  @override
  final String wireName = r'InviteActionResultItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    InviteActionResultItem object, {
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
        specifiedType: const FullType.nullable(InviteBusinessRoleBinding),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    InviteActionResultItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required InviteActionResultItemBuilder result,
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
            specifiedType: const FullType.nullable(InviteBusinessRoleBinding),
          ) as InviteBusinessRoleBinding?;
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
  InviteActionResultItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = InviteActionResultItemBuilder();
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

