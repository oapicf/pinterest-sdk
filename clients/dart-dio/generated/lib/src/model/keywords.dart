//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/keyword.dart';
import 'package:openapi/src/model/keyword_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'keywords.g.dart';

/// Keywords
///
/// Properties:
/// * [errors] - Keyword error
/// * [keywords] - Keywords
@BuiltValue()
abstract class Keywords implements Built<Keywords, KeywordsBuilder> {
  /// Keyword error
  @BuiltValueField(wireName: r'errors')
  BuiltList<KeywordError> get errors;

  /// Keywords
  @BuiltValueField(wireName: r'keywords')
  BuiltList<Keyword> get keywords;

  Keywords._();

  factory Keywords([void updates(KeywordsBuilder b)]) = _$Keywords;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(KeywordsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Keywords> get serializer => _$KeywordsSerializer();
}

class _$KeywordsSerializer implements PrimitiveSerializer<Keywords> {
  @override
  final Iterable<Type> types = const [Keywords, _$Keywords];

  @override
  final String wireName = r'Keywords';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Keywords object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'errors';
    yield serializers.serialize(
      object.errors,
      specifiedType: const FullType(BuiltList, [FullType(KeywordError)]),
    );
    yield r'keywords';
    yield serializers.serialize(
      object.keywords,
      specifiedType: const FullType(BuiltList, [FullType(Keyword)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    Keywords object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required KeywordsBuilder result,
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
  Keywords deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = KeywordsBuilder();
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

