//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/asset_group_binding.dart';
import 'package:openapi/src/model/update_asset_group_response_exceptions_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_asset_group_response.g.dart';

/// UpdateAssetGroupResponse
///
/// Properties:
/// * [exceptions] - A list of errors associated with the asset groups. Will be returned if there is an error.
/// * [updatedAssetGroups] - A list of successfully edited asset groups.
@BuiltValue()
abstract class UpdateAssetGroupResponse implements Built<UpdateAssetGroupResponse, UpdateAssetGroupResponseBuilder> {
  /// A list of errors associated with the asset groups. Will be returned if there is an error.
  @BuiltValueField(wireName: r'exceptions')
  BuiltList<UpdateAssetGroupResponseExceptionsInner>? get exceptions;

  /// A list of successfully edited asset groups.
  @BuiltValueField(wireName: r'updated_asset_groups')
  BuiltList<AssetGroupBinding>? get updatedAssetGroups;

  UpdateAssetGroupResponse._();

  factory UpdateAssetGroupResponse([void updates(UpdateAssetGroupResponseBuilder b)]) = _$UpdateAssetGroupResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdateAssetGroupResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdateAssetGroupResponse> get serializer => _$UpdateAssetGroupResponseSerializer();
}

class _$UpdateAssetGroupResponseSerializer implements PrimitiveSerializer<UpdateAssetGroupResponse> {
  @override
  final Iterable<Type> types = const [UpdateAssetGroupResponse, _$UpdateAssetGroupResponse];

  @override
  final String wireName = r'UpdateAssetGroupResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdateAssetGroupResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.exceptions != null) {
      yield r'exceptions';
      yield serializers.serialize(
        object.exceptions,
        specifiedType: const FullType.nullable(BuiltList, [FullType(UpdateAssetGroupResponseExceptionsInner)]),
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
    UpdateAssetGroupResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdateAssetGroupResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(UpdateAssetGroupResponseExceptionsInner)]),
          ) as BuiltList<UpdateAssetGroupResponseExceptionsInner>?;
          if (valueDes == null) continue;
          result.exceptions.replace(valueDes);
          break;
        case r'updated_asset_groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AssetGroupBinding)]),
          ) as BuiltList<AssetGroupBinding>;
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
  UpdateAssetGroupResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdateAssetGroupResponseBuilder();
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

