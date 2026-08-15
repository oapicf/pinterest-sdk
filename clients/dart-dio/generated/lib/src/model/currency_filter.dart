//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_currency_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'currency_filter.g.dart';

/// CurrencyFilter
///
/// Properties:
/// * [CURRENCY] 
@BuiltValue()
abstract class CurrencyFilter implements Built<CurrencyFilter, CurrencyFilterBuilder> {
  @BuiltValueField(wireName: r'CURRENCY')
  CatalogsProductGroupCurrencyCriteria get CURRENCY;

  CurrencyFilter._();

  factory CurrencyFilter([void updates(CurrencyFilterBuilder b)]) = _$CurrencyFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CurrencyFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CurrencyFilter> get serializer => _$CurrencyFilterSerializer();
}

class _$CurrencyFilterSerializer implements PrimitiveSerializer<CurrencyFilter> {
  @override
  final Iterable<Type> types = const [CurrencyFilter, _$CurrencyFilter];

  @override
  final String wireName = r'CurrencyFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CurrencyFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'CURRENCY';
    yield serializers.serialize(
      object.CURRENCY,
      specifiedType: const FullType(CatalogsProductGroupCurrencyCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CurrencyFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CurrencyFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'CURRENCY':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupCurrencyCriteria),
          ) as CatalogsProductGroupCurrencyCriteria;
          result.CURRENCY = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CurrencyFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CurrencyFilterBuilder();
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

