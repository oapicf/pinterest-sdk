//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_asset_group_response_exceptions_inner.g.dart';

/// UpdateAssetGroupResponseExceptionsInner
///
/// Properties:
/// * [assetGroupId] - Asset group id of the exception.
/// * [code] - Error code associated with the error editing asset group.
/// * [message] - Error message associated with the error editing asset group.
@BuiltValue()
abstract class UpdateAssetGroupResponseExceptionsInner implements Built<UpdateAssetGroupResponseExceptionsInner, UpdateAssetGroupResponseExceptionsInnerBuilder> {
  /// Asset group id of the exception.
  @BuiltValueField(wireName: r'asset_group_id')
  String? get assetGroupId;

  /// Error code associated with the error editing asset group.
  @BuiltValueField(wireName: r'code')
  int? get code;

  /// Error message associated with the error editing asset group.
  @BuiltValueField(wireName: r'message')
  String? get message;

  UpdateAssetGroupResponseExceptionsInner._();

  factory UpdateAssetGroupResponseExceptionsInner([void updates(UpdateAssetGroupResponseExceptionsInnerBuilder b)]) = _$UpdateAssetGroupResponseExceptionsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdateAssetGroupResponseExceptionsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdateAssetGroupResponseExceptionsInner> get serializer => _$UpdateAssetGroupResponseExceptionsInnerSerializer();
}

class _$UpdateAssetGroupResponseExceptionsInnerSerializer implements PrimitiveSerializer<UpdateAssetGroupResponseExceptionsInner> {
  @override
  final Iterable<Type> types = const [UpdateAssetGroupResponseExceptionsInner, _$UpdateAssetGroupResponseExceptionsInner];

  @override
  final String wireName = r'UpdateAssetGroupResponseExceptionsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdateAssetGroupResponseExceptionsInner object, {
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
    UpdateAssetGroupResponseExceptionsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdateAssetGroupResponseExceptionsInnerBuilder result,
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
  UpdateAssetGroupResponseExceptionsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdateAssetGroupResponseExceptionsInnerBuilder();
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

