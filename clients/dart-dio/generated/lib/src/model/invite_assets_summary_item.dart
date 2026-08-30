//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invite_assets_summary_item.g.dart';

/// InviteAssetsSummaryItem
///
/// Properties:
/// * [id] - Unique identifier of the asset.
/// * [permissions] - Permission levels member or partner has on an asset.
@BuiltValue()
abstract class InviteAssetsSummaryItem implements Built<InviteAssetsSummaryItem, InviteAssetsSummaryItemBuilder> {
  /// Unique identifier of the asset.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Permission levels member or partner has on an asset.
  @BuiltValueField(wireName: r'permissions')
  BuiltList<String>? get permissions;

  InviteAssetsSummaryItem._();

  factory InviteAssetsSummaryItem([void updates(InviteAssetsSummaryItemBuilder b)]) = _$InviteAssetsSummaryItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(InviteAssetsSummaryItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<InviteAssetsSummaryItem> get serializer => _$InviteAssetsSummaryItemSerializer();
}

class _$InviteAssetsSummaryItemSerializer implements PrimitiveSerializer<InviteAssetsSummaryItem> {
  @override
  final Iterable<Type> types = const [InviteAssetsSummaryItem, _$InviteAssetsSummaryItem];

  @override
  final String wireName = r'InviteAssetsSummaryItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    InviteAssetsSummaryItem object, {
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
    InviteAssetsSummaryItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required InviteAssetsSummaryItemBuilder result,
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
  InviteAssetsSummaryItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = InviteAssetsSummaryItemBuilder();
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

