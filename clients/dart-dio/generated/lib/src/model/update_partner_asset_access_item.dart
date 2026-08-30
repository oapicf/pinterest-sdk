//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/permissions.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_partner_asset_access_item.g.dart';

/// UpdatePartnerAssetAccessItem
///
/// Properties:
/// * [assetId] - Unique identifier of the business asset.
/// * [partnerId] - Unique identifier of a business partner to update asset access to.
/// * [permissions] - A non-empty array of permissions to assign to the partner.
@BuiltValue()
abstract class UpdatePartnerAssetAccessItem implements Built<UpdatePartnerAssetAccessItem, UpdatePartnerAssetAccessItemBuilder> {
  /// Unique identifier of the business asset.
  @BuiltValueField(wireName: r'asset_id')
  String get assetId;

  /// Unique identifier of a business partner to update asset access to.
  @BuiltValueField(wireName: r'partner_id')
  String get partnerId;

  /// A non-empty array of permissions to assign to the partner.
  @BuiltValueField(wireName: r'permissions')
  BuiltList<Permissions> get permissions;

  UpdatePartnerAssetAccessItem._();

  factory UpdatePartnerAssetAccessItem([void updates(UpdatePartnerAssetAccessItemBuilder b)]) = _$UpdatePartnerAssetAccessItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdatePartnerAssetAccessItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdatePartnerAssetAccessItem> get serializer => _$UpdatePartnerAssetAccessItemSerializer();
}

class _$UpdatePartnerAssetAccessItemSerializer implements PrimitiveSerializer<UpdatePartnerAssetAccessItem> {
  @override
  final Iterable<Type> types = const [UpdatePartnerAssetAccessItem, _$UpdatePartnerAssetAccessItem];

  @override
  final String wireName = r'UpdatePartnerAssetAccessItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdatePartnerAssetAccessItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'asset_id';
    yield serializers.serialize(
      object.assetId,
      specifiedType: const FullType(String),
    );
    yield r'partner_id';
    yield serializers.serialize(
      object.partnerId,
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
    UpdatePartnerAssetAccessItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdatePartnerAssetAccessItemBuilder result,
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
        case r'partner_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.partnerId = valueDes;
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
  UpdatePartnerAssetAccessItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdatePartnerAssetAccessItemBuilder();
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

