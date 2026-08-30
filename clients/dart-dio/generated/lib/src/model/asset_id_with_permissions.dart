//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'asset_id_with_permissions.g.dart';

/// Asset ID with permission levels.
///
/// Properties:
/// * [id] - Unique identifier of a business asset.
/// * [permissions] - Permission levels member or partner has on an asset.
@BuiltValue()
abstract class AssetIdWithPermissions implements Built<AssetIdWithPermissions, AssetIdWithPermissionsBuilder> {
  /// Unique identifier of a business asset.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Permission levels member or partner has on an asset.
  @BuiltValueField(wireName: r'permissions')
  BuiltList<String>? get permissions;

  AssetIdWithPermissions._();

  factory AssetIdWithPermissions([void updates(AssetIdWithPermissionsBuilder b)]) = _$AssetIdWithPermissions;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssetIdWithPermissionsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssetIdWithPermissions> get serializer => _$AssetIdWithPermissionsSerializer();
}

class _$AssetIdWithPermissionsSerializer implements PrimitiveSerializer<AssetIdWithPermissions> {
  @override
  final Iterable<Type> types = const [AssetIdWithPermissions, _$AssetIdWithPermissions];

  @override
  final String wireName = r'AssetIdWithPermissions';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssetIdWithPermissions object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
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
    AssetIdWithPermissions object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssetIdWithPermissionsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
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
  AssetIdWithPermissions deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssetIdWithPermissionsBuilder();
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

