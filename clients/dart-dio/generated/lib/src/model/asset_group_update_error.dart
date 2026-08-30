//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'asset_group_update_error.g.dart';

/// AssetGroupUpdateError
///
/// Properties:
/// * [assetGroupId] 
/// * [code] 
/// * [message] 
@BuiltValue()
abstract class AssetGroupUpdateError implements Built<AssetGroupUpdateError, AssetGroupUpdateErrorBuilder> {
  @BuiltValueField(wireName: r'asset_group_id')
  String? get assetGroupId;

  @BuiltValueField(wireName: r'code')
  int? get code;

  @BuiltValueField(wireName: r'message')
  String? get message;

  AssetGroupUpdateError._();

  factory AssetGroupUpdateError([void updates(AssetGroupUpdateErrorBuilder b)]) = _$AssetGroupUpdateError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssetGroupUpdateErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssetGroupUpdateError> get serializer => _$AssetGroupUpdateErrorSerializer();
}

class _$AssetGroupUpdateErrorSerializer implements PrimitiveSerializer<AssetGroupUpdateError> {
  @override
  final Iterable<Type> types = const [AssetGroupUpdateError, _$AssetGroupUpdateError];

  @override
  final String wireName = r'AssetGroupUpdateError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssetGroupUpdateError object, {
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
    AssetGroupUpdateError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssetGroupUpdateErrorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'asset_group_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.assetGroupId = valueDes;
          break;
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.code = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  AssetGroupUpdateError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssetGroupUpdateErrorBuilder();
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

