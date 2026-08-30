//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/asset_group_binding.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'asset_group_input.g.dart';

/// AssetGroupInput
///
/// Properties:
/// * [assetGroup] 
@BuiltValue()
abstract class AssetGroupInput implements Built<AssetGroupInput, AssetGroupInputBuilder> {
  @BuiltValueField(wireName: r'asset_group')
  AssetGroupBinding? get assetGroup;

  AssetGroupInput._();

  factory AssetGroupInput([void updates(AssetGroupInputBuilder b)]) = _$AssetGroupInput;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssetGroupInputBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssetGroupInput> get serializer => _$AssetGroupInputSerializer();
}

class _$AssetGroupInputSerializer implements PrimitiveSerializer<AssetGroupInput> {
  @override
  final Iterable<Type> types = const [AssetGroupInput, _$AssetGroupInput];

  @override
  final String wireName = r'AssetGroupInput';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssetGroupInput object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.assetGroup != null) {
      yield r'asset_group';
      yield serializers.serialize(
        object.assetGroup,
        specifiedType: const FullType(AssetGroupBinding),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AssetGroupInput object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssetGroupInputBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AssetGroupInput deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssetGroupInputBuilder();
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

