//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_asset_group_response_exceptions_inner.g.dart';

/// DeleteAssetGroupResponseExceptionsInner
///
/// Properties:
/// * [assetGroupId] - Asset group id of the exception.
/// * [code] - Error code associated with the error deleting asset group.
/// * [message] - Error message associated with the error deleting asset group.
@BuiltValue()
abstract class DeleteAssetGroupResponseExceptionsInner implements Built<DeleteAssetGroupResponseExceptionsInner, DeleteAssetGroupResponseExceptionsInnerBuilder> {
  /// Asset group id of the exception.
  @BuiltValueField(wireName: r'asset_group_id')
  String? get assetGroupId;

  /// Error code associated with the error deleting asset group.
  @BuiltValueField(wireName: r'code')
  int? get code;

  /// Error message associated with the error deleting asset group.
  @BuiltValueField(wireName: r'message')
  String? get message;

  DeleteAssetGroupResponseExceptionsInner._();

  factory DeleteAssetGroupResponseExceptionsInner([void updates(DeleteAssetGroupResponseExceptionsInnerBuilder b)]) = _$DeleteAssetGroupResponseExceptionsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeleteAssetGroupResponseExceptionsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeleteAssetGroupResponseExceptionsInner> get serializer => _$DeleteAssetGroupResponseExceptionsInnerSerializer();
}

class _$DeleteAssetGroupResponseExceptionsInnerSerializer implements PrimitiveSerializer<DeleteAssetGroupResponseExceptionsInner> {
  @override
  final Iterable<Type> types = const [DeleteAssetGroupResponseExceptionsInner, _$DeleteAssetGroupResponseExceptionsInner];

  @override
  final String wireName = r'DeleteAssetGroupResponseExceptionsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeleteAssetGroupResponseExceptionsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.assetGroupId != null) {
      yield r'asset_group_id';
      yield serializers.serialize(
        object.assetGroupId,
        specifiedType: const FullType(String),
      );
    }
    if (object.code != null) {
      yield r'code';
      yield serializers.serialize(
        object.code,
        specifiedType: const FullType(int),
      );
    }
    if (object.message != null) {
      yield r'message';
      yield serializers.serialize(
        object.message,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DeleteAssetGroupResponseExceptionsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeleteAssetGroupResponseExceptionsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'asset_group_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.assetGroupId = valueDes;
          break;
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.code = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.message = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DeleteAssetGroupResponseExceptionsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeleteAssetGroupResponseExceptionsInnerBuilder();
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

