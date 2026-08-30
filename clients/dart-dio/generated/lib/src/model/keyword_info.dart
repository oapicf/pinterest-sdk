//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'keyword_info.g.dart';

/// Related Keyword information of the editorial article
///
/// Properties:
/// * [name] - Keyword Name
/// * [pctGrowthMom] - MoM growth as a percentage, if there is no growth rate, this field is not present
@BuiltValue()
abstract class KeywordInfo implements Built<KeywordInfo, KeywordInfoBuilder> {
  /// Keyword Name
  @BuiltValueField(wireName: r'name')
  String get name;

  /// MoM growth as a percentage, if there is no growth rate, this field is not present
  @BuiltValueField(wireName: r'pct_growth_mom')
  num? get pctGrowthMom;

  KeywordInfo._();

  factory KeywordInfo([void updates(KeywordInfoBuilder b)]) = _$KeywordInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(KeywordInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<KeywordInfo> get serializer => _$KeywordInfoSerializer();
}

class _$KeywordInfoSerializer implements PrimitiveSerializer<KeywordInfo> {
  @override
  final Iterable<Type> types = const [KeywordInfo, _$KeywordInfo];

  @override
  final String wireName = r'KeywordInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    KeywordInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    if (object.pctGrowthMom != null) {
      yield r'pct_growth_mom';
      yield serializers.serialize(
        object.pctGrowthMom,
        specifiedType: const FullType(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    KeywordInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required KeywordInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'pct_growth_mom':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.pctGrowthMom = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  KeywordInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = KeywordInfoBuilder();
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

