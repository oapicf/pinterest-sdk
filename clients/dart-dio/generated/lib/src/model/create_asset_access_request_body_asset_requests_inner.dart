//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/permissions.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_asset_access_request_body_asset_requests_inner.g.dart';

/// CreateAssetAccessRequestBodyAssetRequestsInner
///
/// Properties:
/// * [assetIdToPermissions] - An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
/// * [partnerId] - Unique identifier of a business partner to request asset access to.
@BuiltValue()
abstract class CreateAssetAccessRequestBodyAssetRequestsInner implements Built<CreateAssetAccessRequestBodyAssetRequestsInner, CreateAssetAccessRequestBodyAssetRequestsInnerBuilder> {
  /// An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
  @BuiltValueField(wireName: r'asset_id_to_permissions')
  BuiltMap<String, BuiltList<Permissions>> get assetIdToPermissions;

  /// Unique identifier of a business partner to request asset access to.
  @BuiltValueField(wireName: r'partner_id')
  String get partnerId;

  CreateAssetAccessRequestBodyAssetRequestsInner._();

  factory CreateAssetAccessRequestBodyAssetRequestsInner([void updates(CreateAssetAccessRequestBodyAssetRequestsInnerBuilder b)]) = _$CreateAssetAccessRequestBodyAssetRequestsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateAssetAccessRequestBodyAssetRequestsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateAssetAccessRequestBodyAssetRequestsInner> get serializer => _$CreateAssetAccessRequestBodyAssetRequestsInnerSerializer();
}

class _$CreateAssetAccessRequestBodyAssetRequestsInnerSerializer implements PrimitiveSerializer<CreateAssetAccessRequestBodyAssetRequestsInner> {
  @override
  final Iterable<Type> types = const [CreateAssetAccessRequestBodyAssetRequestsInner, _$CreateAssetAccessRequestBodyAssetRequestsInner];

  @override
  final String wireName = r'CreateAssetAccessRequestBodyAssetRequestsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateAssetAccessRequestBodyAssetRequestsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'asset_id_to_permissions';
    yield serializers.serialize(
      object.assetIdToPermissions,
      specifiedType: const FullType(BuiltMap, [FullType(String), FullType(BuiltList, [FullType(Permissions)])]),
    );
    yield r'partner_id';
    yield serializers.serialize(
      object.partnerId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateAssetAccessRequestBodyAssetRequestsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateAssetAccessRequestBodyAssetRequestsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'asset_id_to_permissions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltMap, [FullType(String), FullType(BuiltList, [FullType(Permissions)])]),
          ) as BuiltMap<String, BuiltList<Permissions>>;
          result.assetIdToPermissions.replace(valueDes);
          break;
        case r'partner_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.partnerId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateAssetAccessRequestBodyAssetRequestsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateAssetAccessRequestBodyAssetRequestsInnerBuilder();
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

