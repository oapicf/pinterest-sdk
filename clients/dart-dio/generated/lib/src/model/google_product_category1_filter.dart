//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_list_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'google_product_category1_filter.g.dart';

/// GoogleProductCategory1Filter
///
/// Properties:
/// * [GOOGLE_PRODUCT_CATEGORY_1] 
@BuiltValue()
abstract class GoogleProductCategory1Filter implements Built<GoogleProductCategory1Filter, GoogleProductCategory1FilterBuilder> {
  @BuiltValueField(wireName: r'GOOGLE_PRODUCT_CATEGORY_1')
  CatalogsProductGroupMultipleStringListCriteria get GOOGLE_PRODUCT_CATEGORY_1;

  GoogleProductCategory1Filter._();

  factory GoogleProductCategory1Filter([void updates(GoogleProductCategory1FilterBuilder b)]) = _$GoogleProductCategory1Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GoogleProductCategory1FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GoogleProductCategory1Filter> get serializer => _$GoogleProductCategory1FilterSerializer();
}

class _$GoogleProductCategory1FilterSerializer implements PrimitiveSerializer<GoogleProductCategory1Filter> {
  @override
  final Iterable<Type> types = const [GoogleProductCategory1Filter, _$GoogleProductCategory1Filter];

  @override
  final String wireName = r'GoogleProductCategory1Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GoogleProductCategory1Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'GOOGLE_PRODUCT_CATEGORY_1';
    yield serializers.serialize(
      object.GOOGLE_PRODUCT_CATEGORY_1,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    GoogleProductCategory1Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GoogleProductCategory1FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'GOOGLE_PRODUCT_CATEGORY_1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
          ) as CatalogsProductGroupMultipleStringListCriteria;
          result.GOOGLE_PRODUCT_CATEGORY_1.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  GoogleProductCategory1Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GoogleProductCategory1FilterBuilder();
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

