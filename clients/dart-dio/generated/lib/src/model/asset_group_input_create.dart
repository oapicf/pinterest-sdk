//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/asset_group_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/asset_group_binding.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'asset_group_input_create.g.dart';

/// AssetGroupInputCreate
///
/// Properties:
/// * [assetGroup] 
/// * [assetGroupDescription] - Asset group description.
/// * [assetGroupName] - Asset Group name.
/// * [assetGroupTypes] - Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
@BuiltValue()
abstract class AssetGroupInputCreate implements Built<AssetGroupInputCreate, AssetGroupInputCreateBuilder> {
  @BuiltValueField(wireName: r'asset_group')
  AssetGroupBinding? get assetGroup;

  /// Asset group description.
  @BuiltValueField(wireName: r'asset_group_description')
  String get assetGroupDescription;

  /// Asset Group name.
  @BuiltValueField(wireName: r'asset_group_name')
  String get assetGroupName;

  /// Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
  @BuiltValueField(wireName: r'asset_group_types')
  BuiltList<AssetGroupType> get assetGroupTypes;

  AssetGroupInputCreate._();

  factory AssetGroupInputCreate([void updates(AssetGroupInputCreateBuilder b)]) = _$AssetGroupInputCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssetGroupInputCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssetGroupInputCreate> get serializer => _$AssetGroupInputCreateSerializer();
}

class _$AssetGroupInputCreateSerializer implements PrimitiveSerializer<AssetGroupInputCreate> {
  @override
  final Iterable<Type> types = const [AssetGroupInputCreate, _$AssetGroupInputCreate];

  @override
  final String wireName = r'AssetGroupInputCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssetGroupInputCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.assetGroup != null) {
      yield r'asset_group';
      yield serializers.serialize(
        object.assetGroup,
        specifiedType: const FullType(AssetGroupBinding),
      );
    }
    yield r'asset_group_description';
    yield serializers.serialize(
      object.assetGroupDescription,
      specifiedType: const FullType(String),
    );
    yield r'asset_group_name';
    yield serializers.serialize(
      object.assetGroupName,
      specifiedType: const FullType(String),
    );
    yield r'asset_group_types';
    yield serializers.serialize(
      object.assetGroupTypes,
      specifiedType: const FullType(BuiltList, [FullType(AssetGroupType)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AssetGroupInputCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssetGroupInputCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'asset_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AssetGroupBinding),
          ) as AssetGroupBinding?;
          if (valueDes == null) continue;
          result.assetGroup.replace(valueDes);
          break;
        case r'asset_group_description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.assetGroupDescription = valueDes;
          break;
        case r'asset_group_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.assetGroupName = valueDes;
          break;
        case r'asset_group_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AssetGroupType)]),
          ) as BuiltList<AssetGroupType>;
          result.assetGroupTypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AssetGroupInputCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssetGroupInputCreateBuilder();
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

