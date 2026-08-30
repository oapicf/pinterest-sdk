//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_product_group_filter_keys.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_filters_request_any_of_items1.g.dart';

/// CatalogsProductGroupFiltersRequestAnyOfItems1
///
/// Properties:
/// * [allOf] 
@BuiltValue()
abstract class CatalogsProductGroupFiltersRequestAnyOfItems1 implements Built<CatalogsProductGroupFiltersRequestAnyOfItems1, CatalogsProductGroupFiltersRequestAnyOfItems1Builder> {
  @BuiltValueField(wireName: r'all_of')
  BuiltList<CatalogsProductGroupFilterKeys> get allOf;

  CatalogsProductGroupFiltersRequestAnyOfItems1._();

  factory CatalogsProductGroupFiltersRequestAnyOfItems1([void updates(CatalogsProductGroupFiltersRequestAnyOfItems1Builder b)]) = _$CatalogsProductGroupFiltersRequestAnyOfItems1;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupFiltersRequestAnyOfItems1Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupFiltersRequestAnyOfItems1> get serializer => _$CatalogsProductGroupFiltersRequestAnyOfItems1Serializer();
}

class _$CatalogsProductGroupFiltersRequestAnyOfItems1Serializer implements PrimitiveSerializer<CatalogsProductGroupFiltersRequestAnyOfItems1> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupFiltersRequestAnyOfItems1, _$CatalogsProductGroupFiltersRequestAnyOfItems1];

  @override
  final String wireName = r'CatalogsProductGroupFiltersRequestAnyOfItems1';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupFiltersRequestAnyOfItems1 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'all_of';
    yield serializers.serialize(
      object.allOf,
      specifiedType: const FullType(BuiltList, [FullType(CatalogsProductGroupFilterKeys)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupFiltersRequestAnyOfItems1 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupFiltersRequestAnyOfItems1Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'all_of':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CatalogsProductGroupFilterKeys)]),
          ) as BuiltList<CatalogsProductGroupFilterKeys>;
          result.allOf.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsProductGroupFiltersRequestAnyOfItems1 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupFiltersRequestAnyOfItems1Builder();
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

