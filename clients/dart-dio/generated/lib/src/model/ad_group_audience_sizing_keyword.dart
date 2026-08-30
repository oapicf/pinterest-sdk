//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/match_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_group_audience_sizing_keyword.g.dart';

/// AdGroupAudienceSizingKeyword
///
/// Properties:
/// * [matchType] 
/// * [value] - Keyword value (120 chars max).
@BuiltValue()
abstract class AdGroupAudienceSizingKeyword implements Built<AdGroupAudienceSizingKeyword, AdGroupAudienceSizingKeywordBuilder> {
  @BuiltValueField(wireName: r'match_type')
  MatchType get matchType;
  // enum matchTypeEnum {  BROAD,  PHRASE,  EXACT,  EXACT_NEGATIVE,  PHRASE_NEGATIVE,  };

  /// Keyword value (120 chars max).
  @BuiltValueField(wireName: r'value')
  String get value;

  AdGroupAudienceSizingKeyword._();

  factory AdGroupAudienceSizingKeyword([void updates(AdGroupAudienceSizingKeywordBuilder b)]) = _$AdGroupAudienceSizingKeyword;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdGroupAudienceSizingKeywordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupAudienceSizingKeyword> get serializer => _$AdGroupAudienceSizingKeywordSerializer();
}

class _$AdGroupAudienceSizingKeywordSerializer implements PrimitiveSerializer<AdGroupAudienceSizingKeyword> {
  @override
  final Iterable<Type> types = const [AdGroupAudienceSizingKeyword, _$AdGroupAudienceSizingKeyword];

  @override
  final String wireName = r'AdGroupAudienceSizingKeyword';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupAudienceSizingKeyword object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'match_type';
    yield serializers.serialize(
      object.matchType,
      specifiedType: const FullType(MatchType),
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
    AdGroupAudienceSizingKeyword object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupAudienceSizingKeywordBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'match_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MatchType),
          ) as MatchType;
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
  AdGroupAudienceSizingKeyword deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdGroupAudienceSizingKeywordBuilder();
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

