//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/create_invites_results_response_array_items_inner_invite.dart';
import 'package:openapi/src/model/invite_exception_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_invites_results_response_array_items_inner.g.dart';

/// CreateInvitesResultsResponseArrayItemsInner
///
/// Properties:
/// * [exception] 
/// * [invite] 
@BuiltValue()
abstract class CreateInvitesResultsResponseArrayItemsInner implements Built<CreateInvitesResultsResponseArrayItemsInner, CreateInvitesResultsResponseArrayItemsInnerBuilder> {
  @BuiltValueField(wireName: r'exception')
  InviteExceptionResponse? get exception;

  @BuiltValueField(wireName: r'invite')
  CreateInvitesResultsResponseArrayItemsInnerInvite? get invite;

  CreateInvitesResultsResponseArrayItemsInner._();

  factory CreateInvitesResultsResponseArrayItemsInner([void updates(CreateInvitesResultsResponseArrayItemsInnerBuilder b)]) = _$CreateInvitesResultsResponseArrayItemsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateInvitesResultsResponseArrayItemsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateInvitesResultsResponseArrayItemsInner> get serializer => _$CreateInvitesResultsResponseArrayItemsInnerSerializer();
}

class _$CreateInvitesResultsResponseArrayItemsInnerSerializer implements PrimitiveSerializer<CreateInvitesResultsResponseArrayItemsInner> {
  @override
  final Iterable<Type> types = const [CreateInvitesResultsResponseArrayItemsInner, _$CreateInvitesResultsResponseArrayItemsInner];

  @override
  final String wireName = r'CreateInvitesResultsResponseArrayItemsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateInvitesResultsResponseArrayItemsInner object, {
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
        specifiedType: const FullType.nullable(CreateInvitesResultsResponseArrayItemsInnerInvite),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateInvitesResultsResponseArrayItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateInvitesResultsResponseArrayItemsInnerBuilder result,
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
            specifiedType: const FullType.nullable(CreateInvitesResultsResponseArrayItemsInnerInvite),
          ) as CreateInvitesResultsResponseArrayItemsInnerInvite?;
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
  CreateInvitesResultsResponseArrayItemsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateInvitesResultsResponseArrayItemsInnerBuilder();
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

