//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/keywords_common.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'keywords_request.g.dart';

/// KeywordsRequest
///
/// Properties:
/// * [keywords] - Keyword JSON array. Each array element has 3 fields
/// * [parentId] - Keyword parent entity ID (advertiser, campaign, ad group).
@BuiltValue()
abstract class KeywordsRequest implements Built<KeywordsRequest, KeywordsRequestBuilder> {
  /// Keyword JSON array. Each array element has 3 fields
  @BuiltValueField(wireName: r'keywords')
  BuiltList<KeywordsCommon> get keywords;

  /// Keyword parent entity ID (advertiser, campaign, ad group).
  @BuiltValueField(wireName: r'parent_id')
  String get parentId;

  KeywordsRequest._();

  factory KeywordsRequest([void updates(KeywordsRequestBuilder b)]) = _$KeywordsRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(KeywordsRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<KeywordsRequest> get serializer => _$KeywordsRequestSerializer();
}

class _$KeywordsRequestSerializer implements PrimitiveSerializer<KeywordsRequest> {
  @override
  final Iterable<Type> types = const [KeywordsRequest, _$KeywordsRequest];

  @override
  final String wireName = r'KeywordsRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    KeywordsRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'keywords';
    yield serializers.serialize(
      object.keywords,
      specifiedType: const FullType(BuiltList, [FullType(KeywordsCommon)]),
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
    KeywordsRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required KeywordsRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'keywords':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(KeywordsCommon)]),
          ) as BuiltList<KeywordsCommon>;
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
  KeywordsRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = KeywordsRequestBuilder();
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

