//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/keyword_create_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'keywords_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [keywords] - Keywords
/// * [parentId] - Keyword data
@BuiltValue()
abstract class KeywordsCreate implements Built<KeywordsCreate, KeywordsCreateBuilder> {
  /// Keywords
  @BuiltValueField(wireName: r'keywords')
  BuiltList<KeywordCreateItem> get keywords;

  /// Keyword data
  @BuiltValueField(wireName: r'parent_id')
  String get parentId;

  KeywordsCreate._();

  factory KeywordsCreate([void updates(KeywordsCreateBuilder b)]) = _$KeywordsCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(KeywordsCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<KeywordsCreate> get serializer => _$KeywordsCreateSerializer();
}

class _$KeywordsCreateSerializer implements PrimitiveSerializer<KeywordsCreate> {
  @override
  final Iterable<Type> types = const [KeywordsCreate, _$KeywordsCreate];

  @override
  final String wireName = r'KeywordsCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    KeywordsCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'keywords';
    yield serializers.serialize(
      object.keywords,
      specifiedType: const FullType(BuiltList, [FullType(KeywordCreateItem)]),
    );
    yield r'parent_id';
    yield serializers.serialize(
      object.parentId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    KeywordsCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required KeywordsCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'keywords':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(KeywordCreateItem)]),
          ) as BuiltList<KeywordCreateItem>;
          result.keywords.replace(valueDes);
          break;
        case r'parent_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.parentId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  KeywordsCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = KeywordsCreateBuilder();
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

