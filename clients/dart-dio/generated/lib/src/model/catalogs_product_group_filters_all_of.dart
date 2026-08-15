//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_product_group_filter_keys.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_filters_all_of.g.dart';

/// CatalogsProductGroupFiltersAllOf
///
/// Properties:
/// * [allOf] 
@BuiltValue()
abstract class CatalogsProductGroupFiltersAllOf implements Built<CatalogsProductGroupFiltersAllOf, CatalogsProductGroupFiltersAllOfBuilder> {
  @BuiltValueField(wireName: r'all_of')
  BuiltList<CatalogsProductGroupFilterKeys> get allOf;

  CatalogsProductGroupFiltersAllOf._();

  factory CatalogsProductGroupFiltersAllOf([void updates(CatalogsProductGroupFiltersAllOfBuilder b)]) = _$CatalogsProductGroupFiltersAllOf;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupFiltersAllOfBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupFiltersAllOf> get serializer => _$CatalogsProductGroupFiltersAllOfSerializer();
}

class _$CatalogsProductGroupFiltersAllOfSerializer implements PrimitiveSerializer<CatalogsProductGroupFiltersAllOf> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupFiltersAllOf, _$CatalogsProductGroupFiltersAllOf];

  @override
  final String wireName = r'CatalogsProductGroupFiltersAllOf';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupFiltersAllOf object, {
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
    CatalogsProductGroupFiltersAllOf object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupFiltersAllOfBuilder result,
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
  CatalogsProductGroupFiltersAllOf deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupFiltersAllOfBuilder();
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

