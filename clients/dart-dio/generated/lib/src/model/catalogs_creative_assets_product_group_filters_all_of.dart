//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_creative_assets_product_group_filter_keys.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_creative_assets_product_group_filters_all_of.g.dart';

/// CatalogsCreativeAssetsProductGroupFiltersAllOf
///
/// Properties:
/// * [allOf] 
@BuiltValue()
abstract class CatalogsCreativeAssetsProductGroupFiltersAllOf implements Built<CatalogsCreativeAssetsProductGroupFiltersAllOf, CatalogsCreativeAssetsProductGroupFiltersAllOfBuilder> {
  @BuiltValueField(wireName: r'all_of')
  BuiltList<CatalogsCreativeAssetsProductGroupFilterKeys> get allOf;

  CatalogsCreativeAssetsProductGroupFiltersAllOf._();

  factory CatalogsCreativeAssetsProductGroupFiltersAllOf([void updates(CatalogsCreativeAssetsProductGroupFiltersAllOfBuilder b)]) = _$CatalogsCreativeAssetsProductGroupFiltersAllOf;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsProductGroupFiltersAllOfBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsProductGroupFiltersAllOf> get serializer => _$CatalogsCreativeAssetsProductGroupFiltersAllOfSerializer();
}

class _$CatalogsCreativeAssetsProductGroupFiltersAllOfSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsProductGroupFiltersAllOf> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsProductGroupFiltersAllOf, _$CatalogsCreativeAssetsProductGroupFiltersAllOf];

  @override
  final String wireName = r'CatalogsCreativeAssetsProductGroupFiltersAllOf';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsProductGroupFiltersAllOf object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'all_of';
    yield serializers.serialize(
      object.allOf,
      specifiedType: const FullType(BuiltList, [FullType(CatalogsCreativeAssetsProductGroupFilterKeys)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreativeAssetsProductGroupFiltersAllOf object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreativeAssetsProductGroupFiltersAllOfBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'all_of':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CatalogsCreativeAssetsProductGroupFilterKeys)]),
          ) as BuiltList<CatalogsCreativeAssetsProductGroupFilterKeys>;
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
  CatalogsCreativeAssetsProductGroupFiltersAllOf deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsProductGroupFiltersAllOfBuilder();
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

