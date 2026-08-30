//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_list_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'google_product_category3_filter.g.dart';

/// GoogleProductCategory3Filter
///
/// Properties:
/// * [GOOGLE_PRODUCT_CATEGORY_3] 
@BuiltValue()
abstract class GoogleProductCategory3Filter implements Built<GoogleProductCategory3Filter, GoogleProductCategory3FilterBuilder> {
  @BuiltValueField(wireName: r'GOOGLE_PRODUCT_CATEGORY_3')
  CatalogsProductGroupMultipleStringListCriteria get GOOGLE_PRODUCT_CATEGORY_3;

  GoogleProductCategory3Filter._();

  factory GoogleProductCategory3Filter([void updates(GoogleProductCategory3FilterBuilder b)]) = _$GoogleProductCategory3Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GoogleProductCategory3FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GoogleProductCategory3Filter> get serializer => _$GoogleProductCategory3FilterSerializer();
}

class _$GoogleProductCategory3FilterSerializer implements PrimitiveSerializer<GoogleProductCategory3Filter> {
  @override
  final Iterable<Type> types = const [GoogleProductCategory3Filter, _$GoogleProductCategory3Filter];

  @override
  final String wireName = r'GoogleProductCategory3Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GoogleProductCategory3Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'GOOGLE_PRODUCT_CATEGORY_3';
    yield serializers.serialize(
      object.GOOGLE_PRODUCT_CATEGORY_3,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    GoogleProductCategory3Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GoogleProductCategory3FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'GOOGLE_PRODUCT_CATEGORY_3':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
          ) as CatalogsProductGroupMultipleStringListCriteria;
          result.GOOGLE_PRODUCT_CATEGORY_3.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  GoogleProductCategory3Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GoogleProductCategory3FilterBuilder();
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

