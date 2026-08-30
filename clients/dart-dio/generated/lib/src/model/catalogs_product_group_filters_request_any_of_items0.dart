//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_product_group_filter_keys.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_filters_request_any_of_items0.g.dart';

/// CatalogsProductGroupFiltersRequestAnyOfItems0
///
/// Properties:
/// * [anyOf] 
@BuiltValue()
abstract class CatalogsProductGroupFiltersRequestAnyOfItems0 implements Built<CatalogsProductGroupFiltersRequestAnyOfItems0, CatalogsProductGroupFiltersRequestAnyOfItems0Builder> {
  @BuiltValueField(wireName: r'any_of')
  BuiltList<CatalogsProductGroupFilterKeys> get anyOf;

  CatalogsProductGroupFiltersRequestAnyOfItems0._();

  factory CatalogsProductGroupFiltersRequestAnyOfItems0([void updates(CatalogsProductGroupFiltersRequestAnyOfItems0Builder b)]) = _$CatalogsProductGroupFiltersRequestAnyOfItems0;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupFiltersRequestAnyOfItems0Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupFiltersRequestAnyOfItems0> get serializer => _$CatalogsProductGroupFiltersRequestAnyOfItems0Serializer();
}

class _$CatalogsProductGroupFiltersRequestAnyOfItems0Serializer implements PrimitiveSerializer<CatalogsProductGroupFiltersRequestAnyOfItems0> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupFiltersRequestAnyOfItems0, _$CatalogsProductGroupFiltersRequestAnyOfItems0];

  @override
  final String wireName = r'CatalogsProductGroupFiltersRequestAnyOfItems0';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupFiltersRequestAnyOfItems0 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'any_of';
    yield serializers.serialize(
      object.anyOf,
      specifiedType: const FullType(BuiltList, [FullType(CatalogsProductGroupFilterKeys)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupFiltersRequestAnyOfItems0 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupFiltersRequestAnyOfItems0Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'any_of':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CatalogsProductGroupFilterKeys)]),
          ) as BuiltList<CatalogsProductGroupFilterKeys>;
          result.anyOf.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsProductGroupFiltersRequestAnyOfItems0 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupFiltersRequestAnyOfItems0Builder();
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

