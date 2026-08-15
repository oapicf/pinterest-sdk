//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'brand_filter.g.dart';

/// BrandFilter
///
/// Properties:
/// * [BRAND] 
@BuiltValue()
abstract class BrandFilter implements Built<BrandFilter, BrandFilterBuilder> {
  @BuiltValueField(wireName: r'BRAND')
  CatalogsProductGroupMultipleStringCriteria get BRAND;

  BrandFilter._();

  factory BrandFilter([void updates(BrandFilterBuilder b)]) = _$BrandFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BrandFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BrandFilter> get serializer => _$BrandFilterSerializer();
}

class _$BrandFilterSerializer implements PrimitiveSerializer<BrandFilter> {
  @override
  final Iterable<Type> types = const [BrandFilter, _$BrandFilter];

  @override
  final String wireName = r'BrandFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BrandFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'BRAND';
    yield serializers.serialize(
      object.BRAND,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BrandFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BrandFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'BRAND':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringCriteria),
          ) as CatalogsProductGroupMultipleStringCriteria;
          result.BRAND = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BrandFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BrandFilterBuilder();
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

