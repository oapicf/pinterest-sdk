//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_list_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'google_product_category6_filter.g.dart';

/// GoogleProductCategory6Filter
///
/// Properties:
/// * [GOOGLE_PRODUCT_CATEGORY_6] 
@BuiltValue()
abstract class GoogleProductCategory6Filter implements Built<GoogleProductCategory6Filter, GoogleProductCategory6FilterBuilder> {
  @BuiltValueField(wireName: r'GOOGLE_PRODUCT_CATEGORY_6')
  CatalogsProductGroupMultipleStringListCriteria get GOOGLE_PRODUCT_CATEGORY_6;

  GoogleProductCategory6Filter._();

  factory GoogleProductCategory6Filter([void updates(GoogleProductCategory6FilterBuilder b)]) = _$GoogleProductCategory6Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GoogleProductCategory6FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GoogleProductCategory6Filter> get serializer => _$GoogleProductCategory6FilterSerializer();
}

class _$GoogleProductCategory6FilterSerializer implements PrimitiveSerializer<GoogleProductCategory6Filter> {
  @override
  final Iterable<Type> types = const [GoogleProductCategory6Filter, _$GoogleProductCategory6Filter];

  @override
  final String wireName = r'GoogleProductCategory6Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GoogleProductCategory6Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'GOOGLE_PRODUCT_CATEGORY_6';
    yield serializers.serialize(
      object.GOOGLE_PRODUCT_CATEGORY_6,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    GoogleProductCategory6Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GoogleProductCategory6FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'GOOGLE_PRODUCT_CATEGORY_6':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
          ) as CatalogsProductGroupMultipleStringListCriteria;
          result.GOOGLE_PRODUCT_CATEGORY_6.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  GoogleProductCategory6Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GoogleProductCategory6FilterBuilder();
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

