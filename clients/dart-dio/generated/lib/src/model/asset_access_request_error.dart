//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'asset_access_request_error.g.dart';

/// AssetAccessRequestError
///
/// Properties:
/// * [code] - Error code associated with the error in requesting asset access.
/// * [messages] 
@BuiltValue()
abstract class AssetAccessRequestError implements Built<AssetAccessRequestError, AssetAccessRequestErrorBuilder> {
  /// Error code associated with the error in requesting asset access.
  @BuiltValueField(wireName: r'code')
  int? get code;

  @BuiltValueField(wireName: r'messages')
  BuiltList<String>? get messages;

  AssetAccessRequestError._();

  factory AssetAccessRequestError([void updates(AssetAccessRequestErrorBuilder b)]) = _$AssetAccessRequestError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssetAccessRequestErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssetAccessRequestError> get serializer => _$AssetAccessRequestErrorSerializer();
}

class _$AssetAccessRequestErrorSerializer implements PrimitiveSerializer<AssetAccessRequestError> {
  @override
  final Iterable<Type> types = const [AssetAccessRequestError, _$AssetAccessRequestError];

  @override
  final String wireName = r'AssetAccessRequestError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssetAccessRequestError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.code != null) {
      yield r'code';
      yield serializers.serialize(
        object.code,
        specifiedType: const FullType(int),
      );
    }
    if (object.messages != null) {
      yield r'messages';
      yield serializers.serialize(
        object.messages,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AssetAccessRequestError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssetAccessRequestErrorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.code = valueDes;
          break;
        case r'messages':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.messages.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AssetAccessRequestError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssetAccessRequestErrorBuilder();
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

