//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_partner_assets_result.g.dart';

/// An object containing the permissions a business partner has on the asset.
///
/// Properties:
/// * [assetId] - Unique identifier of a business asset.
/// * [assetType] - Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
/// * [partnerId] - Unique identifier of a business partner.
/// * [permissions] - Permission levels member or partner has on an asset.
@BuiltValue()
abstract class UpdatePartnerAssetsResult implements Built<UpdatePartnerAssetsResult, UpdatePartnerAssetsResultBuilder> {
  /// Unique identifier of a business asset.
  @BuiltValueField(wireName: r'asset_id')
  String? get assetId;

  /// Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  @BuiltValueField(wireName: r'asset_type')
  String? get assetType;

  /// Unique identifier of a business partner.
  @BuiltValueField(wireName: r'partner_id')
  String? get partnerId;

  /// Permission levels member or partner has on an asset.
  @BuiltValueField(wireName: r'permissions')
  BuiltList<String>? get permissions;

  UpdatePartnerAssetsResult._();

  factory UpdatePartnerAssetsResult([void updates(UpdatePartnerAssetsResultBuilder b)]) = _$UpdatePartnerAssetsResult;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdatePartnerAssetsResultBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdatePartnerAssetsResult> get serializer => _$UpdatePartnerAssetsResultSerializer();
}

class _$UpdatePartnerAssetsResultSerializer implements PrimitiveSerializer<UpdatePartnerAssetsResult> {
  @override
  final Iterable<Type> types = const [UpdatePartnerAssetsResult, _$UpdatePartnerAssetsResult];

  @override
  final String wireName = r'UpdatePartnerAssetsResult';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdatePartnerAssetsResult object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.assetId != null) {
      yield r'asset_id';
      yield serializers.serialize(
        object.assetId,
        specifiedType: const FullType(String),
      );
    }
    if (object.assetType != null) {
      yield r'asset_type';
      yield serializers.serialize(
        object.assetType,
        specifiedType: const FullType(String),
      );
    }
    if (object.partnerId != null) {
      yield r'partner_id';
      yield serializers.serialize(
        object.partnerId,
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
    UpdatePartnerAssetsResult object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdatePartnerAssetsResultBuilder result,
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
        case r'asset_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.assetType = valueDes;
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
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
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
  UpdatePartnerAssetsResult deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdatePartnerAssetsResultBuilder();
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

