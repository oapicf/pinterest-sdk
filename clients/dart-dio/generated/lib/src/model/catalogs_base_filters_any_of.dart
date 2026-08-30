//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_base_filter_keys.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_base_filters_any_of.g.dart';

/// CatalogsBaseFiltersAnyOf
///
/// Properties:
/// * [anyOf] 
@BuiltValue()
abstract class CatalogsBaseFiltersAnyOf implements Built<CatalogsBaseFiltersAnyOf, CatalogsBaseFiltersAnyOfBuilder> {
  @BuiltValueField(wireName: r'any_of')
  BuiltList<CatalogsBaseFilterKeys> get anyOf;

  CatalogsBaseFiltersAnyOf._();

  factory CatalogsBaseFiltersAnyOf([void updates(CatalogsBaseFiltersAnyOfBuilder b)]) = _$CatalogsBaseFiltersAnyOf;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsBaseFiltersAnyOfBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsBaseFiltersAnyOf> get serializer => _$CatalogsBaseFiltersAnyOfSerializer();
}

class _$CatalogsBaseFiltersAnyOfSerializer implements PrimitiveSerializer<CatalogsBaseFiltersAnyOf> {
  @override
  final Iterable<Type> types = const [CatalogsBaseFiltersAnyOf, _$CatalogsBaseFiltersAnyOf];

  @override
  final String wireName = r'CatalogsBaseFiltersAnyOf';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsBaseFiltersAnyOf object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'any_of';
    yield serializers.serialize(
      object.anyOf,
      specifiedType: const FullType(BuiltList, [FullType(CatalogsBaseFilterKeys)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsBaseFiltersAnyOf object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsBaseFiltersAnyOfBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'any_of':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CatalogsBaseFilterKeys)]),
          ) as BuiltList<CatalogsBaseFilterKeys>;
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
  CatalogsBaseFiltersAnyOf deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsBaseFiltersAnyOfBuilder();
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

