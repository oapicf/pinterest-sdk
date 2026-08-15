//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/keyword.dart';
import 'package:openapi/src/model/keyword_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'keywords_response.g.dart';

/// KeywordsResponse
///
/// Properties:
/// * [errors] 
/// * [keywords] 
@BuiltValue()
abstract class KeywordsResponse implements Built<KeywordsResponse, KeywordsResponseBuilder> {
  @BuiltValueField(wireName: r'errors')
  BuiltList<KeywordError>? get errors;

  @BuiltValueField(wireName: r'keywords')
  BuiltList<Keyword>? get keywords;

  KeywordsResponse._();

  factory KeywordsResponse([void updates(KeywordsResponseBuilder b)]) = _$KeywordsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(KeywordsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<KeywordsResponse> get serializer => _$KeywordsResponseSerializer();
}

class _$KeywordsResponseSerializer implements PrimitiveSerializer<KeywordsResponse> {
  @override
  final Iterable<Type> types = const [KeywordsResponse, _$KeywordsResponse];

  @override
  final String wireName = r'KeywordsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    KeywordsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.errors != null) {
      yield r'errors';
      yield serializers.serialize(
        object.errors,
        specifiedType: const FullType(BuiltList, [FullType(KeywordError)]),
      );
    }
    if (object.keywords != null) {
      yield r'keywords';
      yield serializers.serialize(
        object.keywords,
        specifiedType: const FullType(BuiltList, [FullType(Keyword)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    KeywordsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required KeywordsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(KeywordError)]),
          ) as BuiltList<KeywordError>;
          result.errors.replace(valueDes);
          break;
        case r'keywords':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(Keyword)]),
          ) as BuiltList<Keyword>;
          result.keywords.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  KeywordsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = KeywordsResponseBuilder();
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

