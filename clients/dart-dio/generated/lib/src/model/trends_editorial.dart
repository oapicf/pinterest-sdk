//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/keyword_info.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'trends_editorial.g.dart';

/// Information of the published editorial article.
///
/// Properties:
/// * [boardUrl] - URL of the editorial board
/// * [description] - Description of the editorial article
/// * [interests] - List of interests related to the editorial article
/// * [pinsUrl] - URL of the pins related to the editorial article
/// * [relatedKeywords] - List of keywords related to the editorial article
/// * [title] - Title of the editorial article
@BuiltValue()
abstract class TrendsEditorial implements Built<TrendsEditorial, TrendsEditorialBuilder> {
  /// URL of the editorial board
  @BuiltValueField(wireName: r'board_url')
  String get boardUrl;

  /// Description of the editorial article
  @BuiltValueField(wireName: r'description')
  String get description;

  /// List of interests related to the editorial article
  @BuiltValueField(wireName: r'interests')
  BuiltList<String> get interests;

  /// URL of the pins related to the editorial article
  @BuiltValueField(wireName: r'pins_url')
  BuiltList<String> get pinsUrl;

  /// List of keywords related to the editorial article
  @BuiltValueField(wireName: r'related_keywords')
  BuiltList<KeywordInfo> get relatedKeywords;

  /// Title of the editorial article
  @BuiltValueField(wireName: r'title')
  String get title;

  TrendsEditorial._();

  factory TrendsEditorial([void updates(TrendsEditorialBuilder b)]) = _$TrendsEditorial;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TrendsEditorialBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TrendsEditorial> get serializer => _$TrendsEditorialSerializer();
}

class _$TrendsEditorialSerializer implements PrimitiveSerializer<TrendsEditorial> {
  @override
  final Iterable<Type> types = const [TrendsEditorial, _$TrendsEditorial];

  @override
  final String wireName = r'TrendsEditorial';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TrendsEditorial object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'board_url';
    yield serializers.serialize(
      object.boardUrl,
      specifiedType: const FullType(String),
    );
    yield r'description';
    yield serializers.serialize(
      object.description,
      specifiedType: const FullType(String),
    );
    yield r'interests';
    yield serializers.serialize(
      object.interests,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
    yield r'pins_url';
    yield serializers.serialize(
      object.pinsUrl,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
    yield r'related_keywords';
    yield serializers.serialize(
      object.relatedKeywords,
      specifiedType: const FullType(BuiltList, [FullType(KeywordInfo)]),
    );
    yield r'title';
    yield serializers.serialize(
      object.title,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    TrendsEditorial object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TrendsEditorialBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'board_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.boardUrl = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.description = valueDes;
          break;
        case r'interests':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.interests.replace(valueDes);
          break;
        case r'pins_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.pinsUrl.replace(valueDes);
          break;
        case r'related_keywords':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(KeywordInfo)]),
          ) as BuiltList<KeywordInfo>;
          result.relatedKeywords.replace(valueDes);
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.title = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TrendsEditorial deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TrendsEditorialBuilder();
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

