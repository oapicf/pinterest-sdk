//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'cancel_invites_request.g.dart';

/// An object with the list of invite/request ids to cancel.
///
/// Properties:
/// * [inviteIds] - A list of invite/request ids to cancel.
@BuiltValue()
abstract class CancelInvitesRequest implements Built<CancelInvitesRequest, CancelInvitesRequestBuilder> {
  /// A list of invite/request ids to cancel.
  @BuiltValueField(wireName: r'invite_ids')
  BuiltList<String> get inviteIds;

  CancelInvitesRequest._();

  factory CancelInvitesRequest([void updates(CancelInvitesRequestBuilder b)]) = _$CancelInvitesRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CancelInvitesRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CancelInvitesRequest> get serializer => _$CancelInvitesRequestSerializer();
}

class _$CancelInvitesRequestSerializer implements PrimitiveSerializer<CancelInvitesRequest> {
  @override
  final Iterable<Type> types = const [CancelInvitesRequest, _$CancelInvitesRequest];

  @override
  final String wireName = r'CancelInvitesRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CancelInvitesRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'invite_ids';
    yield serializers.serialize(
      object.inviteIds,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CancelInvitesRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CancelInvitesRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'invite_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.inviteIds.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CancelInvitesRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CancelInvitesRequestBuilder();
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

