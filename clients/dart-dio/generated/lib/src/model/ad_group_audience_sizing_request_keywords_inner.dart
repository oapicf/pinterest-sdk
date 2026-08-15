//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/match_type_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_group_audience_sizing_request_keywords_inner.g.dart';

/// AdGroupAudienceSizingRequestKeywordsInner
///
/// Properties:
/// * [matchType] 
/// * [value] - Keyword value (120 chars max).
@BuiltValue()
abstract class AdGroupAudienceSizingRequestKeywordsInner implements Built<AdGroupAudienceSizingRequestKeywordsInner, AdGroupAudienceSizingRequestKeywordsInnerBuilder> {
  @BuiltValueField(wireName: r'match_type')
  MatchTypeResponse? get matchType;
  // enum matchTypeEnum {  BROAD,  PHRASE,  EXACT,  EXACT_NEGATIVE,  PHRASE_NEGATIVE,  ,  };

  /// Keyword value (120 chars max).
  @BuiltValueField(wireName: r'value')
  String get value;

  AdGroupAudienceSizingRequestKeywordsInner._();

  factory AdGroupAudienceSizingRequestKeywordsInner([void updates(AdGroupAudienceSizingRequestKeywordsInnerBuilder b)]) = _$AdGroupAudienceSizingRequestKeywordsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdGroupAudienceSizingRequestKeywordsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupAudienceSizingRequestKeywordsInner> get serializer => _$AdGroupAudienceSizingRequestKeywordsInnerSerializer();
}

class _$AdGroupAudienceSizingRequestKeywordsInnerSerializer implements PrimitiveSerializer<AdGroupAudienceSizingRequestKeywordsInner> {
  @override
  final Iterable<Type> types = const [AdGroupAudienceSizingRequestKeywordsInner, _$AdGroupAudienceSizingRequestKeywordsInner];

  @override
  final String wireName = r'AdGroupAudienceSizingRequestKeywordsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupAudienceSizingRequestKeywordsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    AdGroupAudienceSizingRequestKeywordsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupAudienceSizingRequestKeywordsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  AdGroupAudienceSizingRequestKeywordsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdGroupAudienceSizingRequestKeywordsInnerBuilder();
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

