//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/keyword_update_item.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'keywords_update.g.dart';

/// Resource create or update operation model.
///
/// Properties:
/// * [keywords] - Keywords
@BuiltValue()
abstract class KeywordsUpdate implements Built<KeywordsUpdate, KeywordsUpdateBuilder> {
  /// Keywords
  @BuiltValueField(wireName: r'keywords')
  BuiltList<KeywordUpdateItem>? get keywords;

  KeywordsUpdate._();

  factory KeywordsUpdate([void updates(KeywordsUpdateBuilder b)]) = _$KeywordsUpdate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(KeywordsUpdateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<KeywordsUpdate> get serializer => _$KeywordsUpdateSerializer();
}

class _$KeywordsUpdateSerializer implements PrimitiveSerializer<KeywordsUpdate> {
  @override
  final Iterable<Type> types = const [KeywordsUpdate, _$KeywordsUpdate];

  @override
  final String wireName = r'KeywordsUpdate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    KeywordsUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.keywords != null) {
      yield r'keywords';
      yield serializers.serialize(
        object.keywords,
        specifiedType: const FullType(BuiltList, [FullType(KeywordUpdateItem)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    KeywordsUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required KeywordsUpdateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'keywords':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(KeywordUpdateItem)]),
          ) as BuiltList<KeywordUpdateItem>?;
          if (valueDes == null) continue;
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
  KeywordsUpdate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = KeywordsUpdateBuilder();
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

