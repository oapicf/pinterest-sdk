//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_insight_category_common.g.dart';

/// AudienceInsightCategoryCommon
///
/// Properties:
/// * [id] 
/// * [index] 
/// * [key] 
/// * [name] 
/// * [ratio] 
@Deprecated('AudienceInsightCategoryCommon has been deprecated')
@BuiltValue()
abstract class AudienceInsightCategoryCommon implements Built<AudienceInsightCategoryCommon, AudienceInsightCategoryCommonBuilder> {
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'index')
  num? get index;

  @BuiltValueField(wireName: r'key')
  String? get key;

  @BuiltValueField(wireName: r'name')
  String? get name;

  @BuiltValueField(wireName: r'ratio')
  num? get ratio;

  AudienceInsightCategoryCommon._();

  factory AudienceInsightCategoryCommon([void updates(AudienceInsightCategoryCommonBuilder b)]) = _$AudienceInsightCategoryCommon;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AudienceInsightCategoryCommonBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AudienceInsightCategoryCommon> get serializer => _$AudienceInsightCategoryCommonSerializer();
}

class _$AudienceInsightCategoryCommonSerializer implements PrimitiveSerializer<AudienceInsightCategoryCommon> {
  @override
  final Iterable<Type> types = const [AudienceInsightCategoryCommon, _$AudienceInsightCategoryCommon];

  @override
  final String wireName = r'AudienceInsightCategoryCommon';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AudienceInsightCategoryCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.index != null) {
      yield r'index';
      yield serializers.serialize(
        object.index,
        specifiedType: const FullType(num),
      );
    }
    if (object.key != null) {
      yield r'key';
      yield serializers.serialize(
        object.key,
        specifiedType: const FullType(String),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.ratio != null) {
      yield r'ratio';
      yield serializers.serialize(
        object.ratio,
        specifiedType: const FullType(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AudienceInsightCategoryCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AudienceInsightCategoryCommonBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.index = valueDes;
          break;
        case r'key':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.key = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'ratio':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.ratio = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AudienceInsightCategoryCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AudienceInsightCategoryCommonBuilder();
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

