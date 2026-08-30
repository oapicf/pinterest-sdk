//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/match_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'keyword_create_item.g.dart';

/// KeywordCreateItem
///
/// Properties:
/// * [bid] - **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
/// * [matchType] - Keyword [match type](/docs/api-features/targeting-overview/)
/// * [value] - Keyword value (120 chars max).
@BuiltValue()
abstract class KeywordCreateItem implements Built<KeywordCreateItem, KeywordCreateItemBuilder> {
  /// **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  @BuiltValueField(wireName: r'bid')
  int? get bid;

  /// Keyword [match type](/docs/api-features/targeting-overview/)
  @BuiltValueField(wireName: r'match_type')
  MatchType? get matchType;
  // enum matchTypeEnum {  BROAD,  PHRASE,  EXACT,  EXACT_NEGATIVE,  PHRASE_NEGATIVE,  };

  /// Keyword value (120 chars max).
  @BuiltValueField(wireName: r'value')
  String get value;

  KeywordCreateItem._();

  factory KeywordCreateItem([void updates(KeywordCreateItemBuilder b)]) = _$KeywordCreateItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(KeywordCreateItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<KeywordCreateItem> get serializer => _$KeywordCreateItemSerializer();
}

class _$KeywordCreateItemSerializer implements PrimitiveSerializer<KeywordCreateItem> {
  @override
  final Iterable<Type> types = const [KeywordCreateItem, _$KeywordCreateItem];

  @override
  final String wireName = r'KeywordCreateItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    KeywordCreateItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.bid != null) {
      yield r'bid';
      yield serializers.serialize(
        object.bid,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'match_type';
    yield object.matchType == null ? null : serializers.serialize(
      object.matchType,
      specifiedType: const FullType.nullable(MatchType),
    );
    yield r'value';
    yield serializers.serialize(
      object.value,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    KeywordCreateItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required KeywordCreateItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.bid = valueDes;
          break;
        case r'match_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(MatchType),
          ) as MatchType?;
          if (valueDes == null) continue;
          result.matchType = valueDes;
          break;
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.value = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  KeywordCreateItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = KeywordCreateItemBuilder();
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

