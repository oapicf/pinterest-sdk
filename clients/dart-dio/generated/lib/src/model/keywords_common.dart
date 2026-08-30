//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/match_type_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'keywords_common.g.dart';

/// KeywordsCommon
///
/// Properties:
/// * [bid] - </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
/// * [matchType] 
/// * [value] - Keyword value (120 chars max).
@BuiltValue()
abstract class KeywordsCommon implements Built<KeywordsCommon, KeywordsCommonBuilder> {
  /// </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  @BuiltValueField(wireName: r'bid')
  int? get bid;

  @BuiltValueField(wireName: r'match_type')
  MatchTypeResponse? get matchType;
  // enum matchTypeEnum {  BROAD,  PHRASE,  EXACT,  EXACT_NEGATIVE,  PHRASE_NEGATIVE,  ,  };

  /// Keyword value (120 chars max).
  @BuiltValueField(wireName: r'value')
  String get value;

  KeywordsCommon._();

  factory KeywordsCommon([void updates(KeywordsCommonBuilder b)]) = _$KeywordsCommon;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(KeywordsCommonBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<KeywordsCommon> get serializer => _$KeywordsCommonSerializer();
}

class _$KeywordsCommonSerializer implements PrimitiveSerializer<KeywordsCommon> {
  @override
  final Iterable<Type> types = const [KeywordsCommon, _$KeywordsCommon];

  @override
  final String wireName = r'KeywordsCommon';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    KeywordsCommon object, {
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
      specifiedType: const FullType.nullable(MatchTypeResponse),
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
    KeywordsCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required KeywordsCommonBuilder result,
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
            specifiedType: const FullType.nullable(MatchTypeResponse),
          ) as MatchTypeResponse?;
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
  KeywordsCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = KeywordsCommonBuilder();
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

