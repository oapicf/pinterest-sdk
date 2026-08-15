//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_asset_access_request_error_message_inner.g.dart';

/// CreateAssetAccessRequestErrorMessageInner
///
/// Properties:
/// * [code] - Error code associated with the error in requesting asset access.
/// * [messages] 
@BuiltValue()
abstract class CreateAssetAccessRequestErrorMessageInner implements Built<CreateAssetAccessRequestErrorMessageInner, CreateAssetAccessRequestErrorMessageInnerBuilder> {
  /// Error code associated with the error in requesting asset access.
  @BuiltValueField(wireName: r'code')
  int? get code;

  @BuiltValueField(wireName: r'messages')
  BuiltList<String>? get messages;

  CreateAssetAccessRequestErrorMessageInner._();

  factory CreateAssetAccessRequestErrorMessageInner([void updates(CreateAssetAccessRequestErrorMessageInnerBuilder b)]) = _$CreateAssetAccessRequestErrorMessageInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateAssetAccessRequestErrorMessageInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateAssetAccessRequestErrorMessageInner> get serializer => _$CreateAssetAccessRequestErrorMessageInnerSerializer();
}

class _$CreateAssetAccessRequestErrorMessageInnerSerializer implements PrimitiveSerializer<CreateAssetAccessRequestErrorMessageInner> {
  @override
  final Iterable<Type> types = const [CreateAssetAccessRequestErrorMessageInner, _$CreateAssetAccessRequestErrorMessageInner];

  @override
  final String wireName = r'CreateAssetAccessRequestErrorMessageInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateAssetAccessRequestErrorMessageInner object, {
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
    CreateAssetAccessRequestErrorMessageInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateAssetAccessRequestErrorMessageInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.code = valueDes;
          break;
        case r'messages':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
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
  CreateAssetAccessRequestErrorMessageInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateAssetAccessRequestErrorMessageInnerBuilder();
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

