//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_product_group_filter_keys.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_filters_any_of.g.dart';

/// CatalogsProductGroupFiltersAnyOf
///
/// Properties:
/// * [anyOf] 
@BuiltValue()
abstract class CatalogsProductGroupFiltersAnyOf implements Built<CatalogsProductGroupFiltersAnyOf, CatalogsProductGroupFiltersAnyOfBuilder> {
  @BuiltValueField(wireName: r'any_of')
  BuiltList<CatalogsProductGroupFilterKeys> get anyOf;

  CatalogsProductGroupFiltersAnyOf._();

  factory CatalogsProductGroupFiltersAnyOf([void updates(CatalogsProductGroupFiltersAnyOfBuilder b)]) = _$CatalogsProductGroupFiltersAnyOf;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupFiltersAnyOfBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupFiltersAnyOf> get serializer => _$CatalogsProductGroupFiltersAnyOfSerializer();
}

class _$CatalogsProductGroupFiltersAnyOfSerializer implements PrimitiveSerializer<CatalogsProductGroupFiltersAnyOf> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupFiltersAnyOf, _$CatalogsProductGroupFiltersAnyOf];

  @override
  final String wireName = r'CatalogsProductGroupFiltersAnyOf';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupFiltersAnyOf object, {
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
    CatalogsProductGroupFiltersAnyOf object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupFiltersAnyOfBuilder result,
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
  CatalogsProductGroupFiltersAnyOf deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupFiltersAnyOfBuilder();
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

