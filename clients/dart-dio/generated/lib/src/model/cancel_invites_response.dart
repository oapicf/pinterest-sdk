//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/cancel_invite_result_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'cancel_invites_response.g.dart';

/// CancelInvitesResponse
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class CancelInvitesResponse implements Built<CancelInvitesResponse, CancelInvitesResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<CancelInviteResultItem>? get items;

  CancelInvitesResponse._();

  factory CancelInvitesResponse([void updates(CancelInvitesResponseBuilder b)]) = _$CancelInvitesResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CancelInvitesResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CancelInvitesResponse> get serializer => _$CancelInvitesResponseSerializer();
}

class _$CancelInvitesResponseSerializer implements PrimitiveSerializer<CancelInvitesResponse> {
  @override
  final Iterable<Type> types = const [CancelInvitesResponse, _$CancelInvitesResponse];

  @override
  final String wireName = r'CancelInvitesResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CancelInvitesResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(CancelInviteResultItem)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CancelInvitesResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CancelInvitesResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(CancelInviteResultItem)]),
          ) as BuiltList<CancelInviteResultItem>?;
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
  CancelInvitesResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CancelInvitesResponseBuilder();
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

