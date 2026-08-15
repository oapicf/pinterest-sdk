//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_countries_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'country_filter.g.dart';

/// CountryFilter
///
/// Properties:
/// * [COUNTRY] 
@BuiltValue()
abstract class CountryFilter implements Built<CountryFilter, CountryFilterBuilder> {
  @BuiltValueField(wireName: r'COUNTRY')
  CatalogsProductGroupMultipleCountriesCriteria get COUNTRY;

  CountryFilter._();

  factory CountryFilter([void updates(CountryFilterBuilder b)]) = _$CountryFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CountryFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CountryFilter> get serializer => _$CountryFilterSerializer();
}

class _$CountryFilterSerializer implements PrimitiveSerializer<CountryFilter> {
  @override
  final Iterable<Type> types = const [CountryFilter, _$CountryFilter];

  @override
  final String wireName = r'CountryFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CountryFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'COUNTRY';
    yield serializers.serialize(
      object.COUNTRY,
      specifiedType: const FullType(CatalogsProductGroupMultipleCountriesCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CountryFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CountryFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'COUNTRY':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleCountriesCriteria),
          ) as CatalogsProductGroupMultipleCountriesCriteria;
          result.COUNTRY = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CountryFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CountryFilterBuilder();
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

