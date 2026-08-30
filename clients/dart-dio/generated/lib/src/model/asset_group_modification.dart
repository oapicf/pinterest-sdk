//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/asset_group_binding.dart';
import 'package:openapi/src/model/asset_group_update_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'asset_group_modification.g.dart';

/// AssetGroupModification
///
/// Properties:
/// * [exceptions] - A list of errors associated with the asset groups. Will be returned if there is an error.
/// * [updatedAssetGroups] - A list of successfully edited asset groups.
@BuiltValue()
abstract class AssetGroupModification implements Built<AssetGroupModification, AssetGroupModificationBuilder> {
  /// A list of errors associated with the asset groups. Will be returned if there is an error.
  @BuiltValueField(wireName: r'exceptions')
  BuiltList<AssetGroupUpdateError>? get exceptions;

  /// A list of successfully edited asset groups.
  @BuiltValueField(wireName: r'updated_asset_groups')
  BuiltList<AssetGroupBinding>? get updatedAssetGroups;

  AssetGroupModification._();

  factory AssetGroupModification([void updates(AssetGroupModificationBuilder b)]) = _$AssetGroupModification;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssetGroupModificationBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssetGroupModification> get serializer => _$AssetGroupModificationSerializer();
}

class _$AssetGroupModificationSerializer implements PrimitiveSerializer<AssetGroupModification> {
  @override
  final Iterable<Type> types = const [AssetGroupModification, _$AssetGroupModification];

  @override
  final String wireName = r'AssetGroupModification';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssetGroupModification object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.exceptions != null) {
      yield r'exceptions';
      yield serializers.serialize(
        object.exceptions,
        specifiedType: const FullType(BuiltList, [FullType(AssetGroupUpdateError)]),
      );
    }
    if (object.updatedAssetGroups != null) {
      yield r'updated_asset_groups';
      yield serializers.serialize(
        object.updatedAssetGroups,
        specifiedType: const FullType(BuiltList, [FullType(AssetGroupBinding)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AssetGroupModification object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssetGroupModificationBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AssetGroupUpdateError)]),
          ) as BuiltList<AssetGroupUpdateError>?;
          if (valueDes == null) continue;
          result.exceptions.replace(valueDes);
          break;
        case r'updated_asset_groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AssetGroupBinding)]),
          ) as BuiltList<AssetGroupBinding>?;
          if (valueDes == null) continue;
          result.updatedAssetGroups.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AssetGroupModification deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssetGroupModificationBuilder();
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

