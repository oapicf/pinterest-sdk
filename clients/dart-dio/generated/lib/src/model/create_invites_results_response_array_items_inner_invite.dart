//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/business_access_user_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_invites_results_response_array_items_inner_invite.g.dart';

/// An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
///
/// Properties:
/// * [id] - Unique identifier of the invite/request.
/// * [user] - Metadata for the member/partner that was sent the invite/request.
@BuiltValue()
abstract class CreateInvitesResultsResponseArrayItemsInnerInvite implements Built<CreateInvitesResultsResponseArrayItemsInnerInvite, CreateInvitesResultsResponseArrayItemsInnerInviteBuilder> {
  /// Unique identifier of the invite/request.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Metadata for the member/partner that was sent the invite/request.
  @BuiltValueField(wireName: r'user')
  BusinessAccessUserSummary? get user;

  CreateInvitesResultsResponseArrayItemsInnerInvite._();

  factory CreateInvitesResultsResponseArrayItemsInnerInvite([void updates(CreateInvitesResultsResponseArrayItemsInnerInviteBuilder b)]) = _$CreateInvitesResultsResponseArrayItemsInnerInvite;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateInvitesResultsResponseArrayItemsInnerInviteBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateInvitesResultsResponseArrayItemsInnerInvite> get serializer => _$CreateInvitesResultsResponseArrayItemsInnerInviteSerializer();
}

class _$CreateInvitesResultsResponseArrayItemsInnerInviteSerializer implements PrimitiveSerializer<CreateInvitesResultsResponseArrayItemsInnerInvite> {
  @override
  final Iterable<Type> types = const [CreateInvitesResultsResponseArrayItemsInnerInvite, _$CreateInvitesResultsResponseArrayItemsInnerInvite];

  @override
  final String wireName = r'CreateInvitesResultsResponseArrayItemsInnerInvite';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateInvitesResultsResponseArrayItemsInnerInvite object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.user != null) {
      yield r'user';
      yield serializers.serialize(
        object.user,
        specifiedType: const FullType(BusinessAccessUserSummary),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateInvitesResultsResponseArrayItemsInnerInvite object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateInvitesResultsResponseArrayItemsInnerInviteBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BusinessAccessUserSummary),
          ) as BusinessAccessUserSummary;
          result.user.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateInvitesResultsResponseArrayItemsInnerInvite deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateInvitesResultsResponseArrayItemsInnerInviteBuilder();
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

