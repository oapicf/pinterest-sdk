//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/delete_asset_group_response_exceptions_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_asset_group_response.g.dart';

/// DeleteAssetGroupResponse
///
/// Properties:
/// * [deletedAssetGroups] - A list of ids of successfully deleted asset groups.
/// * [exceptions] - A list of errors associated with the asset groups. Will be returned if there is an error.
@BuiltValue()
abstract class DeleteAssetGroupResponse implements Built<DeleteAssetGroupResponse, DeleteAssetGroupResponseBuilder> {
  /// A list of ids of successfully deleted asset groups.
  @BuiltValueField(wireName: r'deleted_asset_groups')
  BuiltList<String>? get deletedAssetGroups;

  /// A list of errors associated with the asset groups. Will be returned if there is an error.
  @BuiltValueField(wireName: r'exceptions')
  BuiltList<DeleteAssetGroupResponseExceptionsInner>? get exceptions;

  DeleteAssetGroupResponse._();

  factory DeleteAssetGroupResponse([void updates(DeleteAssetGroupResponseBuilder b)]) = _$DeleteAssetGroupResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeleteAssetGroupResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeleteAssetGroupResponse> get serializer => _$DeleteAssetGroupResponseSerializer();
}

class _$DeleteAssetGroupResponseSerializer implements PrimitiveSerializer<DeleteAssetGroupResponse> {
  @override
  final Iterable<Type> types = const [DeleteAssetGroupResponse, _$DeleteAssetGroupResponse];

  @override
  final String wireName = r'DeleteAssetGroupResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeleteAssetGroupResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.deletedAssetGroups != null) {
      yield r'deleted_asset_groups';
      yield serializers.serialize(
        object.deletedAssetGroups,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.exceptions != null) {
      yield r'exceptions';
      yield serializers.serialize(
        object.exceptions,
        specifiedType: const FullType.nullable(BuiltList, [FullType(DeleteAssetGroupResponseExceptionsInner)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DeleteAssetGroupResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeleteAssetGroupResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'deleted_asset_groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.deletedAssetGroups.replace(valueDes);
          break;
        case r'exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(DeleteAssetGroupResponseExceptionsInner)]),
          ) as BuiltList<DeleteAssetGroupResponseExceptionsInner>?;
          if (valueDes == null) continue;
          result.exceptions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DeleteAssetGroupResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeleteAssetGroupResponseBuilder();
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

