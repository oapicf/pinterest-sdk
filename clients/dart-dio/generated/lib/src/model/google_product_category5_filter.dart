//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_list_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'google_product_category5_filter.g.dart';

/// GoogleProductCategory5Filter
///
/// Properties:
/// * [GOOGLE_PRODUCT_CATEGORY_5] 
@BuiltValue()
abstract class GoogleProductCategory5Filter implements Built<GoogleProductCategory5Filter, GoogleProductCategory5FilterBuilder> {
  @BuiltValueField(wireName: r'GOOGLE_PRODUCT_CATEGORY_5')
  CatalogsProductGroupMultipleStringListCriteria get GOOGLE_PRODUCT_CATEGORY_5;

  GoogleProductCategory5Filter._();

  factory GoogleProductCategory5Filter([void updates(GoogleProductCategory5FilterBuilder b)]) = _$GoogleProductCategory5Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GoogleProductCategory5FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GoogleProductCategory5Filter> get serializer => _$GoogleProductCategory5FilterSerializer();
}

class _$GoogleProductCategory5FilterSerializer implements PrimitiveSerializer<GoogleProductCategory5Filter> {
  @override
  final Iterable<Type> types = const [GoogleProductCategory5Filter, _$GoogleProductCategory5Filter];

  @override
  final String wireName = r'GoogleProductCategory5Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GoogleProductCategory5Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'GOOGLE_PRODUCT_CATEGORY_5';
    yield serializers.serialize(
      object.GOOGLE_PRODUCT_CATEGORY_5,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    GoogleProductCategory5Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GoogleProductCategory5FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'GOOGLE_PRODUCT_CATEGORY_5':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
          ) as CatalogsProductGroupMultipleStringListCriteria;
          result.GOOGLE_PRODUCT_CATEGORY_5.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  GoogleProductCategory5Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GoogleProductCategory5FilterBuilder();
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

