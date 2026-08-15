//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_list_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'google_product_category0_filter.g.dart';

/// GoogleProductCategory0Filter
///
/// Properties:
/// * [gOOGLEPRODUCTCATEGORY0] 
@BuiltValue()
abstract class GoogleProductCategory0Filter implements Built<GoogleProductCategory0Filter, GoogleProductCategory0FilterBuilder> {
  @BuiltValueField(wireName: r'GOOGLE_PRODUCT_CATEGORY_0')
  CatalogsProductGroupMultipleStringListCriteria get gOOGLEPRODUCTCATEGORY0;

  GoogleProductCategory0Filter._();

  factory GoogleProductCategory0Filter([void updates(GoogleProductCategory0FilterBuilder b)]) = _$GoogleProductCategory0Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GoogleProductCategory0FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GoogleProductCategory0Filter> get serializer => _$GoogleProductCategory0FilterSerializer();
}

class _$GoogleProductCategory0FilterSerializer implements PrimitiveSerializer<GoogleProductCategory0Filter> {
  @override
  final Iterable<Type> types = const [GoogleProductCategory0Filter, _$GoogleProductCategory0Filter];

  @override
  final String wireName = r'GoogleProductCategory0Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GoogleProductCategory0Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'GOOGLE_PRODUCT_CATEGORY_0';
    yield serializers.serialize(
      object.gOOGLEPRODUCTCATEGORY0,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    GoogleProductCategory0Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GoogleProductCategory0FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'GOOGLE_PRODUCT_CATEGORY_0':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
          ) as CatalogsProductGroupMultipleStringListCriteria;
          result.gOOGLEPRODUCTCATEGORY0 = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  GoogleProductCategory0Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GoogleProductCategory0FilterBuilder();
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

