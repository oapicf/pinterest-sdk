//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'users_for_individual_asset_response.g.dart';

/// An object containing the permissions a business member has on the asset.
///
/// Properties:
/// * [assetId] - Unique identifier of a business asset.
/// * [memberId] - Unique identifier of the business member with asset access.
/// * [permissions] - Permission levels member or partner has on an asset.
@BuiltValue()
abstract class UsersForIndividualAssetResponse implements Built<UsersForIndividualAssetResponse, UsersForIndividualAssetResponseBuilder> {
  /// Unique identifier of a business asset.
  @BuiltValueField(wireName: r'asset_id')
  String? get assetId;

  /// Unique identifier of the business member with asset access.
  @BuiltValueField(wireName: r'member_id')
  String? get memberId;

  /// Permission levels member or partner has on an asset.
  @BuiltValueField(wireName: r'permissions')
  BuiltList<String>? get permissions;

  UsersForIndividualAssetResponse._();

  factory UsersForIndividualAssetResponse([void updates(UsersForIndividualAssetResponseBuilder b)]) = _$UsersForIndividualAssetResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UsersForIndividualAssetResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UsersForIndividualAssetResponse> get serializer => _$UsersForIndividualAssetResponseSerializer();
}

class _$UsersForIndividualAssetResponseSerializer implements PrimitiveSerializer<UsersForIndividualAssetResponse> {
  @override
  final Iterable<Type> types = const [UsersForIndividualAssetResponse, _$UsersForIndividualAssetResponse];

  @override
  final String wireName = r'UsersForIndividualAssetResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UsersForIndividualAssetResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.assetId != null) {
      yield r'asset_id';
      yield serializers.serialize(
        object.assetId,
        specifiedType: const FullType(String),
      );
    }
    if (object.memberId != null) {
      yield r'member_id';
      yield serializers.serialize(
        object.memberId,
        specifiedType: const FullType(String),
      );
    }
    if (object.permissions != null) {
      yield r'permissions';
      yield serializers.serialize(
        object.permissions,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    UsersForIndividualAssetResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UsersForIndividualAssetResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'asset_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.assetId = valueDes;
          break;
        case r'member_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.memberId = valueDes;
          break;
        case r'permissions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
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
  UsersForIndividualAssetResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UsersForIndividualAssetResponseBuilder();
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

