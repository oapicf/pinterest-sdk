//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/match_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'keyword.g.dart';

/// Keyword
///
/// Properties:
/// * [archived] 
/// * [bid] - **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
/// * [id] - Keyword ID .
/// * [matchType] - Keyword [match type](/docs/api-features/targeting-overview/)
/// * [parentId] - Keyword parent entity ID (advertiser, campaign, ad group).
/// * [parentType] - Parent entity type (advertiser, campaign, ad group).
/// * [type] - Always keyword
/// * [value] - Keyword value (120 chars max).
@BuiltValue()
abstract class Keyword implements Built<Keyword, KeywordBuilder> {
  @BuiltValueField(wireName: r'archived')
  bool? get archived;

  /// **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  @BuiltValueField(wireName: r'bid')
  int? get bid;

  /// Keyword ID .
  @BuiltValueField(wireName: r'id')
  String get id;

  /// Keyword [match type](/docs/api-features/targeting-overview/)
  @BuiltValueField(wireName: r'match_type')
  MatchType? get matchType;
  // enum matchTypeEnum {  BROAD,  PHRASE,  EXACT,  EXACT_NEGATIVE,  PHRASE_NEGATIVE,  };

  /// Keyword parent entity ID (advertiser, campaign, ad group).
  @BuiltValueField(wireName: r'parent_id')
  String get parentId;

  /// Parent entity type (advertiser, campaign, ad group).
  @BuiltValueField(wireName: r'parent_type')
  String? get parentType;

  /// Always keyword
  @BuiltValueField(wireName: r'type')
  String? get type;

  /// Keyword value (120 chars max).
  @BuiltValueField(wireName: r'value')
  String get value;

  Keyword._();

  factory Keyword([void updates(KeywordBuilder b)]) = _$Keyword;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(KeywordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Keyword> get serializer => _$KeywordSerializer();
}

class _$KeywordSerializer implements PrimitiveSerializer<Keyword> {
  @override
  final Iterable<Type> types = const [Keyword, _$Keyword];

  @override
  final String wireName = r'Keyword';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Keyword object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.archived != null) {
      yield r'archived';
      yield serializers.serialize(
        object.archived,
        specifiedType: const FullType(bool),
      );
    }
    if (object.bid != null) {
      yield r'bid';
      yield serializers.serialize(
        object.bid,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'match_type';
    yield object.matchType == null ? null : serializers.serialize(
      object.matchType,
      specifiedType: const FullType.nullable(MatchType),
    );
    yield r'parent_id';
    yield serializers.serialize(
      object.parentId,
      specifiedType: const FullType(String),
    );
    if (object.parentType != null) {
      yield r'parent_type';
      yield serializers.serialize(
        object.parentType,
        specifiedType: const FullType(String),
      );
    }
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(String),
      );
    }
    yield r'value';
    yield serializers.serialize(
      object.value,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    Keyword object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required KeywordBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'archived':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.archived = valueDes;
          break;
        case r'bid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.bid = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'match_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(MatchType),
          ) as MatchType?;
          if (valueDes == null) continue;
          result.matchType = valueDes;
          break;
        case r'parent_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.parentId = valueDes;
          break;
        case r'parent_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.parentType = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.type = valueDes;
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
  Keyword deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = KeywordBuilder();
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

