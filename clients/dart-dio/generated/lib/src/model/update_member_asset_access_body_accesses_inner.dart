//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/permissions.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_member_asset_access_body_accesses_inner.g.dart';

/// UpdateMemberAssetAccessBodyAccessesInner
///
/// Properties:
/// * [assetId] - Id of the asset to update.
/// * [memberId] - Unique identifier of the member on which to perform the update
/// * [permissions] - A non-empty array of permissions to assign to the member.
@BuiltValue()
abstract class UpdateMemberAssetAccessBodyAccessesInner implements Built<UpdateMemberAssetAccessBodyAccessesInner, UpdateMemberAssetAccessBodyAccessesInnerBuilder> {
  /// Id of the asset to update.
  @BuiltValueField(wireName: r'asset_id')
  String get assetId;

  /// Unique identifier of the member on which to perform the update
  @BuiltValueField(wireName: r'member_id')
  String get memberId;

  /// A non-empty array of permissions to assign to the member.
  @BuiltValueField(wireName: r'permissions')
  BuiltList<Permissions> get permissions;

  UpdateMemberAssetAccessBodyAccessesInner._();

  factory UpdateMemberAssetAccessBodyAccessesInner([void updates(UpdateMemberAssetAccessBodyAccessesInnerBuilder b)]) = _$UpdateMemberAssetAccessBodyAccessesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdateMemberAssetAccessBodyAccessesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdateMemberAssetAccessBodyAccessesInner> get serializer => _$UpdateMemberAssetAccessBodyAccessesInnerSerializer();
}

class _$UpdateMemberAssetAccessBodyAccessesInnerSerializer implements PrimitiveSerializer<UpdateMemberAssetAccessBodyAccessesInner> {
  @override
  final Iterable<Type> types = const [UpdateMemberAssetAccessBodyAccessesInner, _$UpdateMemberAssetAccessBodyAccessesInner];

  @override
  final String wireName = r'UpdateMemberAssetAccessBodyAccessesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdateMemberAssetAccessBodyAccessesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'asset_id';
    yield serializers.serialize(
      object.assetId,
      specifiedType: const FullType(String),
    );
    yield r'member_id';
    yield serializers.serialize(
      object.memberId,
      specifiedType: const FullType(String),
    );
    yield r'permissions';
    yield serializers.serialize(
      object.permissions,
      specifiedType: const FullType(BuiltList, [FullType(Permissions)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    UpdateMemberAssetAccessBodyAccessesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdateMemberAssetAccessBodyAccessesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'asset_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.assetId = valueDes;
          break;
        case r'member_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.memberId = valueDes;
          break;
        case r'permissions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(Permissions)]),
          ) as BuiltList<Permissions>;
          result.permissions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UpdateMemberAssetAccessBodyAccessesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdateMemberAssetAccessBodyAccessesInnerBuilder();
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

