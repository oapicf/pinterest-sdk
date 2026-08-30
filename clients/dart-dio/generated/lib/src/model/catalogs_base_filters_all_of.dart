//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_base_filter_keys.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_base_filters_all_of.g.dart';

/// CatalogsBaseFiltersAllOf
///
/// Properties:
/// * [allOf] 
@BuiltValue()
abstract class CatalogsBaseFiltersAllOf implements Built<CatalogsBaseFiltersAllOf, CatalogsBaseFiltersAllOfBuilder> {
  @BuiltValueField(wireName: r'all_of')
  BuiltList<CatalogsBaseFilterKeys> get allOf;

  CatalogsBaseFiltersAllOf._();

  factory CatalogsBaseFiltersAllOf([void updates(CatalogsBaseFiltersAllOfBuilder b)]) = _$CatalogsBaseFiltersAllOf;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsBaseFiltersAllOfBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsBaseFiltersAllOf> get serializer => _$CatalogsBaseFiltersAllOfSerializer();
}

class _$CatalogsBaseFiltersAllOfSerializer implements PrimitiveSerializer<CatalogsBaseFiltersAllOf> {
  @override
  final Iterable<Type> types = const [CatalogsBaseFiltersAllOf, _$CatalogsBaseFiltersAllOf];

  @override
  final String wireName = r'CatalogsBaseFiltersAllOf';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsBaseFiltersAllOf object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'all_of';
    yield serializers.serialize(
      object.allOf,
      specifiedType: const FullType(BuiltList, [FullType(CatalogsBaseFilterKeys)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsBaseFiltersAllOf object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsBaseFiltersAllOfBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'all_of':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CatalogsBaseFilterKeys)]),
          ) as BuiltList<CatalogsBaseFilterKeys>;
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
  CatalogsBaseFiltersAllOf deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsBaseFiltersAllOfBuilder();
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

