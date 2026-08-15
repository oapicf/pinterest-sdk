//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_creative_assets_product_group_filter_keys.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_creative_assets_product_group_filters_any_of.g.dart';

/// CatalogsCreativeAssetsProductGroupFiltersAnyOf
///
/// Properties:
/// * [anyOf] 
@BuiltValue()
abstract class CatalogsCreativeAssetsProductGroupFiltersAnyOf implements Built<CatalogsCreativeAssetsProductGroupFiltersAnyOf, CatalogsCreativeAssetsProductGroupFiltersAnyOfBuilder> {
  @BuiltValueField(wireName: r'any_of')
  BuiltList<CatalogsCreativeAssetsProductGroupFilterKeys> get anyOf;

  CatalogsCreativeAssetsProductGroupFiltersAnyOf._();

  factory CatalogsCreativeAssetsProductGroupFiltersAnyOf([void updates(CatalogsCreativeAssetsProductGroupFiltersAnyOfBuilder b)]) = _$CatalogsCreativeAssetsProductGroupFiltersAnyOf;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsProductGroupFiltersAnyOfBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsProductGroupFiltersAnyOf> get serializer => _$CatalogsCreativeAssetsProductGroupFiltersAnyOfSerializer();
}

class _$CatalogsCreativeAssetsProductGroupFiltersAnyOfSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsProductGroupFiltersAnyOf> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsProductGroupFiltersAnyOf, _$CatalogsCreativeAssetsProductGroupFiltersAnyOf];

  @override
  final String wireName = r'CatalogsCreativeAssetsProductGroupFiltersAnyOf';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsProductGroupFiltersAnyOf object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'any_of';
    yield serializers.serialize(
      object.anyOf,
      specifiedType: const FullType(BuiltList, [FullType(CatalogsCreativeAssetsProductGroupFilterKeys)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreativeAssetsProductGroupFiltersAnyOf object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreativeAssetsProductGroupFiltersAnyOfBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'any_of':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CatalogsCreativeAssetsProductGroupFilterKeys)]),
          ) as BuiltList<CatalogsCreativeAssetsProductGroupFilterKeys>;
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
  CatalogsCreativeAssetsProductGroupFiltersAnyOf deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsProductGroupFiltersAnyOfBuilder();
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

