//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'title_keywords_filter.g.dart';

/// TitleKeywordsFilter
///
/// Properties:
/// * [TITLE_KEYWORDS] 
@BuiltValue()
abstract class TitleKeywordsFilter implements Built<TitleKeywordsFilter, TitleKeywordsFilterBuilder> {
  @BuiltValueField(wireName: r'TITLE_KEYWORDS')
  CatalogsProductGroupMultipleStringCriteria get TITLE_KEYWORDS;

  TitleKeywordsFilter._();

  factory TitleKeywordsFilter([void updates(TitleKeywordsFilterBuilder b)]) = _$TitleKeywordsFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TitleKeywordsFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TitleKeywordsFilter> get serializer => _$TitleKeywordsFilterSerializer();
}

class _$TitleKeywordsFilterSerializer implements PrimitiveSerializer<TitleKeywordsFilter> {
  @override
  final Iterable<Type> types = const [TitleKeywordsFilter, _$TitleKeywordsFilter];

  @override
  final String wireName = r'TitleKeywordsFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TitleKeywordsFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'TITLE_KEYWORDS';
    yield serializers.serialize(
      object.TITLE_KEYWORDS,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    TitleKeywordsFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TitleKeywordsFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'TITLE_KEYWORDS':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringCriteria),
          ) as CatalogsProductGroupMultipleStringCriteria;
          result.TITLE_KEYWORDS.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TitleKeywordsFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TitleKeywordsFilterBuilder();
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

