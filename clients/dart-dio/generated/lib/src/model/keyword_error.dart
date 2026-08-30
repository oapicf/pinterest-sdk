//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/keyword.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'keyword_error.g.dart';

/// KeywordError
///
/// Properties:
/// * [data] 
/// * [errorMessages] 
@BuiltValue()
abstract class KeywordError implements Built<KeywordError, KeywordErrorBuilder> {
  @BuiltValueField(wireName: r'data')
  Keyword? get data;

  @BuiltValueField(wireName: r'error_messages')
  BuiltList<String>? get errorMessages;

  KeywordError._();

  factory KeywordError([void updates(KeywordErrorBuilder b)]) = _$KeywordError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(KeywordErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<KeywordError> get serializer => _$KeywordErrorSerializer();
}

class _$KeywordErrorSerializer implements PrimitiveSerializer<KeywordError> {
  @override
  final Iterable<Type> types = const [KeywordError, _$KeywordError];

  @override
  final String wireName = r'KeywordError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    KeywordError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(Keyword),
      );
    }
    if (object.errorMessages != null) {
      yield r'error_messages';
      yield serializers.serialize(
        object.errorMessages,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    KeywordError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required KeywordErrorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Keyword),
          ) as Keyword?;
          if (valueDes == null) continue;
          result.data.replace(valueDes);
          break;
        case r'error_messages':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.errorMessages.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  KeywordError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = KeywordErrorBuilder();
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

