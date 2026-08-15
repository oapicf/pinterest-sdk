//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/gender_demographics.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_categories_demographic.g.dart';

/// Age and gender distribution who engaged with this product category in the past 3 months
///
/// Properties:
/// * [age] - Age demographic distribution
/// * [gender] 
@BuiltValue()
abstract class ProductCategoriesDemographic implements Built<ProductCategoriesDemographic, ProductCategoriesDemographicBuilder> {
  /// Age demographic distribution
  @BuiltValueField(wireName: r'age')
  BuiltMap<String, num> get age;

  @BuiltValueField(wireName: r'gender')
  GenderDemographics get gender;

  ProductCategoriesDemographic._();

  factory ProductCategoriesDemographic([void updates(ProductCategoriesDemographicBuilder b)]) = _$ProductCategoriesDemographic;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductCategoriesDemographicBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductCategoriesDemographic> get serializer => _$ProductCategoriesDemographicSerializer();
}

class _$ProductCategoriesDemographicSerializer implements PrimitiveSerializer<ProductCategoriesDemographic> {
  @override
  final Iterable<Type> types = const [ProductCategoriesDemographic, _$ProductCategoriesDemographic];

  @override
  final String wireName = r'ProductCategoriesDemographic';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductCategoriesDemographic object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'age';
    yield serializers.serialize(
      object.age,
      specifiedType: const FullType(BuiltMap, [FullType(String), FullType(num)]),
    );
    yield r'gender';
    yield serializers.serialize(
      object.gender,
      specifiedType: const FullType(GenderDemographics),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProductCategoriesDemographic object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductCategoriesDemographicBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'age':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltMap, [FullType(String), FullType(num)]),
          ) as BuiltMap<String, num>;
          result.age.replace(valueDes);
          break;
        case r'gender':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(GenderDemographics),
          ) as GenderDemographics;
          result.gender.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProductCategoriesDemographic deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductCategoriesDemographicBuilder();
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

