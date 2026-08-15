//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_list_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'google_product_category2_filter.g.dart';

/// GoogleProductCategory2Filter
///
/// Properties:
/// * [gOOGLEPRODUCTCATEGORY2] 
@BuiltValue()
abstract class GoogleProductCategory2Filter implements Built<GoogleProductCategory2Filter, GoogleProductCategory2FilterBuilder> {
  @BuiltValueField(wireName: r'GOOGLE_PRODUCT_CATEGORY_2')
  CatalogsProductGroupMultipleStringListCriteria get gOOGLEPRODUCTCATEGORY2;

  GoogleProductCategory2Filter._();

  factory GoogleProductCategory2Filter([void updates(GoogleProductCategory2FilterBuilder b)]) = _$GoogleProductCategory2Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GoogleProductCategory2FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GoogleProductCategory2Filter> get serializer => _$GoogleProductCategory2FilterSerializer();
}

class _$GoogleProductCategory2FilterSerializer implements PrimitiveSerializer<GoogleProductCategory2Filter> {
  @override
  final Iterable<Type> types = const [GoogleProductCategory2Filter, _$GoogleProductCategory2Filter];

  @override
  final String wireName = r'GoogleProductCategory2Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GoogleProductCategory2Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'GOOGLE_PRODUCT_CATEGORY_2';
    yield serializers.serialize(
      object.gOOGLEPRODUCTCATEGORY2,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    GoogleProductCategory2Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GoogleProductCategory2FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'GOOGLE_PRODUCT_CATEGORY_2':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
          ) as CatalogsProductGroupMultipleStringListCriteria;
          result.gOOGLEPRODUCTCATEGORY2 = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  GoogleProductCategory2Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GoogleProductCategory2FilterBuilder();
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

