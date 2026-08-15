//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/asset_group_binding.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_asset_group_response.g.dart';

/// CreateAssetGroupResponse
///
/// Properties:
/// * [assetGroup] 
@BuiltValue()
abstract class CreateAssetGroupResponse implements Built<CreateAssetGroupResponse, CreateAssetGroupResponseBuilder> {
  @BuiltValueField(wireName: r'asset_group')
  AssetGroupBinding? get assetGroup;

  CreateAssetGroupResponse._();

  factory CreateAssetGroupResponse([void updates(CreateAssetGroupResponseBuilder b)]) = _$CreateAssetGroupResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateAssetGroupResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateAssetGroupResponse> get serializer => _$CreateAssetGroupResponseSerializer();
}

class _$CreateAssetGroupResponseSerializer implements PrimitiveSerializer<CreateAssetGroupResponse> {
  @override
  final Iterable<Type> types = const [CreateAssetGroupResponse, _$CreateAssetGroupResponse];

  @override
  final String wireName = r'CreateAssetGroupResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateAssetGroupResponse object, {
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
    CreateAssetGroupResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateAssetGroupResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'asset_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AssetGroupBinding),
          ) as AssetGroupBinding;
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
  CreateAssetGroupResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateAssetGroupResponseBuilder();
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

