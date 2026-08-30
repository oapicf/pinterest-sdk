//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_list_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'google_product_category4_filter.g.dart';

/// GoogleProductCategory4Filter
///
/// Properties:
/// * [GOOGLE_PRODUCT_CATEGORY_4] 
@BuiltValue()
abstract class GoogleProductCategory4Filter implements Built<GoogleProductCategory4Filter, GoogleProductCategory4FilterBuilder> {
  @BuiltValueField(wireName: r'GOOGLE_PRODUCT_CATEGORY_4')
  CatalogsProductGroupMultipleStringListCriteria get GOOGLE_PRODUCT_CATEGORY_4;

  GoogleProductCategory4Filter._();

  factory GoogleProductCategory4Filter([void updates(GoogleProductCategory4FilterBuilder b)]) = _$GoogleProductCategory4Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GoogleProductCategory4FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GoogleProductCategory4Filter> get serializer => _$GoogleProductCategory4FilterSerializer();
}

class _$GoogleProductCategory4FilterSerializer implements PrimitiveSerializer<GoogleProductCategory4Filter> {
  @override
  final Iterable<Type> types = const [GoogleProductCategory4Filter, _$GoogleProductCategory4Filter];

  @override
  final String wireName = r'GoogleProductCategory4Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GoogleProductCategory4Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'GOOGLE_PRODUCT_CATEGORY_4';
    yield serializers.serialize(
      object.GOOGLE_PRODUCT_CATEGORY_4,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    GoogleProductCategory4Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GoogleProductCategory4FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'GOOGLE_PRODUCT_CATEGORY_4':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
          ) as CatalogsProductGroupMultipleStringListCriteria;
          result.GOOGLE_PRODUCT_CATEGORY_4.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  GoogleProductCategory4Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GoogleProductCategory4FilterBuilder();
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

