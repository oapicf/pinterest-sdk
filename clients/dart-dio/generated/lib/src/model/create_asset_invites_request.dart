//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/create_asset_invites_request_item.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_asset_invites_request.g.dart';

/// Request body for updating asset roles for existing invites.
///
/// Properties:
/// * [invites] 
@BuiltValue()
abstract class CreateAssetInvitesRequest implements Built<CreateAssetInvitesRequest, CreateAssetInvitesRequestBuilder> {
  @BuiltValueField(wireName: r'invites')
  BuiltList<CreateAssetInvitesRequestItem> get invites;

  CreateAssetInvitesRequest._();

  factory CreateAssetInvitesRequest([void updates(CreateAssetInvitesRequestBuilder b)]) = _$CreateAssetInvitesRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateAssetInvitesRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateAssetInvitesRequest> get serializer => _$CreateAssetInvitesRequestSerializer();
}

class _$CreateAssetInvitesRequestSerializer implements PrimitiveSerializer<CreateAssetInvitesRequest> {
  @override
  final Iterable<Type> types = const [CreateAssetInvitesRequest, _$CreateAssetInvitesRequest];

  @override
  final String wireName = r'CreateAssetInvitesRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateAssetInvitesRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'invites';
    yield serializers.serialize(
      object.invites,
      specifiedType: const FullType(BuiltList, [FullType(CreateAssetInvitesRequestItem)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateAssetInvitesRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateAssetInvitesRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'invites':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CreateAssetInvitesRequestItem)]),
          ) as BuiltList<CreateAssetInvitesRequestItem>;
          result.invites.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateAssetInvitesRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateAssetInvitesRequestBuilder();
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

