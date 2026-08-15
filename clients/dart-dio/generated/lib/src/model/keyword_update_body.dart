//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/keyword_update.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'keyword_update_body.g.dart';

/// KeywordUpdateBody
///
/// Properties:
/// * [keywords] - Keywords to update. Object array. Each object has 2 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>For example: [{\"id\":\"2886610576653\", \"archived\": false}, {\"id\":\"2886610576654\",  \"archived\": true}, ...]
@BuiltValue()
abstract class KeywordUpdateBody implements Built<KeywordUpdateBody, KeywordUpdateBodyBuilder> {
  /// Keywords to update. Object array. Each object has 2 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>For example: [{\"id\":\"2886610576653\", \"archived\": false}, {\"id\":\"2886610576654\",  \"archived\": true}, ...]
  @BuiltValueField(wireName: r'keywords')
  BuiltList<KeywordUpdate> get keywords;

  KeywordUpdateBody._();

  factory KeywordUpdateBody([void updates(KeywordUpdateBodyBuilder b)]) = _$KeywordUpdateBody;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(KeywordUpdateBodyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<KeywordUpdateBody> get serializer => _$KeywordUpdateBodySerializer();
}

class _$KeywordUpdateBodySerializer implements PrimitiveSerializer<KeywordUpdateBody> {
  @override
  final Iterable<Type> types = const [KeywordUpdateBody, _$KeywordUpdateBody];

  @override
  final String wireName = r'KeywordUpdateBody';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    KeywordUpdateBody object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'keywords';
    yield serializers.serialize(
      object.keywords,
      specifiedType: const FullType(BuiltList, [FullType(KeywordUpdate)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    KeywordUpdateBody object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required KeywordUpdateBodyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'keywords':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(KeywordUpdate)]),
          ) as BuiltList<KeywordUpdate>;
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
  KeywordUpdateBody deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = KeywordUpdateBodyBuilder();
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

