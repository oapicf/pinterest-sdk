//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'cancel_invites_body.g.dart';

/// Request body used to cancel invites
///
/// Properties:
/// * [inviteIds] - List of invite/request ids to be cancelled
@BuiltValue()
abstract class CancelInvitesBody implements Built<CancelInvitesBody, CancelInvitesBodyBuilder> {
  /// List of invite/request ids to be cancelled
  @BuiltValueField(wireName: r'invite_ids')
  BuiltList<String> get inviteIds;

  CancelInvitesBody._();

  factory CancelInvitesBody([void updates(CancelInvitesBodyBuilder b)]) = _$CancelInvitesBody;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CancelInvitesBodyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CancelInvitesBody> get serializer => _$CancelInvitesBodySerializer();
}

class _$CancelInvitesBodySerializer implements PrimitiveSerializer<CancelInvitesBody> {
  @override
  final Iterable<Type> types = const [CancelInvitesBody, _$CancelInvitesBody];

  @override
  final String wireName = r'CancelInvitesBody';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CancelInvitesBody object, {
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
    CancelInvitesBody object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CancelInvitesBodyBuilder result,
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
  CancelInvitesBody deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CancelInvitesBodyBuilder();
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

