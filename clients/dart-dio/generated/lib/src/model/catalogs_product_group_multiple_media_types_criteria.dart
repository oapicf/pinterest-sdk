//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/media_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_multiple_media_types_criteria.g.dart';

/// CatalogsProductGroupMultipleMediaTypesCriteria
///
/// Properties:
/// * [negated] 
/// * [values] 
@BuiltValue()
abstract class CatalogsProductGroupMultipleMediaTypesCriteria implements Built<CatalogsProductGroupMultipleMediaTypesCriteria, CatalogsProductGroupMultipleMediaTypesCriteriaBuilder> {
  @BuiltValueField(wireName: r'negated')
  bool? get negated;

  @BuiltValueField(wireName: r'values')
  BuiltList<MediaType> get values;

  CatalogsProductGroupMultipleMediaTypesCriteria._();

  factory CatalogsProductGroupMultipleMediaTypesCriteria([void updates(CatalogsProductGroupMultipleMediaTypesCriteriaBuilder b)]) = _$CatalogsProductGroupMultipleMediaTypesCriteria;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupMultipleMediaTypesCriteriaBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupMultipleMediaTypesCriteria> get serializer => _$CatalogsProductGroupMultipleMediaTypesCriteriaSerializer();
}

class _$CatalogsProductGroupMultipleMediaTypesCriteriaSerializer implements PrimitiveSerializer<CatalogsProductGroupMultipleMediaTypesCriteria> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupMultipleMediaTypesCriteria, _$CatalogsProductGroupMultipleMediaTypesCriteria];

  @override
  final String wireName = r'CatalogsProductGroupMultipleMediaTypesCriteria';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupMultipleMediaTypesCriteria object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.negated != null) {
      yield r'negated';
      yield serializers.serialize(
        object.negated,
        specifiedType: const FullType(bool),
      );
    }
    yield r'values';
    yield serializers.serialize(
      object.values,
      specifiedType: const FullType(BuiltList, [FullType(MediaType)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupMultipleMediaTypesCriteria object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupMultipleMediaTypesCriteriaBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'negated':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.negated = valueDes;
          break;
        case r'values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MediaType)]),
          ) as BuiltList<MediaType>;
          result.values.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsProductGroupMultipleMediaTypesCriteria deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupMultipleMediaTypesCriteriaBuilder();
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

