//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/match_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_template_keyword.g.dart';

/// TargetingTemplateKeyword
///
/// Properties:
/// * [matchType] 
/// * [value] - The keyword targeting (120 chars max).
@BuiltValue()
abstract class TargetingTemplateKeyword implements Built<TargetingTemplateKeyword, TargetingTemplateKeywordBuilder> {
  @BuiltValueField(wireName: r'match_type')
  MatchType? get matchType;
  // enum matchTypeEnum {  BROAD,  PHRASE,  EXACT,  EXACT_NEGATIVE,  PHRASE_NEGATIVE,  };

  /// The keyword targeting (120 chars max).
  @BuiltValueField(wireName: r'value')
  String? get value;

  TargetingTemplateKeyword._();

  factory TargetingTemplateKeyword([void updates(TargetingTemplateKeywordBuilder b)]) = _$TargetingTemplateKeyword;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingTemplateKeywordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingTemplateKeyword> get serializer => _$TargetingTemplateKeywordSerializer();
}

class _$TargetingTemplateKeywordSerializer implements PrimitiveSerializer<TargetingTemplateKeyword> {
  @override
  final Iterable<Type> types = const [TargetingTemplateKeyword, _$TargetingTemplateKeyword];

  @override
  final String wireName = r'TargetingTemplateKeyword';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingTemplateKeyword object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.matchType != null) {
      yield r'match_type';
      yield serializers.serialize(
        object.matchType,
        specifiedType: const FullType(MatchType),
      );
    }
    if (object.value != null) {
      yield r'value';
      yield serializers.serialize(
        object.value,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TargetingTemplateKeyword object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingTemplateKeywordBuilder result,
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
  TargetingTemplateKeyword deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingTemplateKeywordBuilder();
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

